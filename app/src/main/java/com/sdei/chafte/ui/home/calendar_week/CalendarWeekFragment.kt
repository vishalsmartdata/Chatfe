package com.sdei.chafte.ui.home.calendar_week

import android.graphics.RectF
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.Observer
import com.guojunustb.library.DateTimeInterpreter
import com.guojunustb.library.WeekDayView
import com.guojunustb.library.WeekHeaderView
import com.guojunustb.library.WeekHeaderView.DateSelectedChangeListener
import com.guojunustb.library.WeekViewEvent
import com.sdei.chafte.R
import com.sdei.chafte.databinding.FragmentCalendarWeekBinding

import com.sdei.chafte.model.JoinRoomData
import com.sdei.chafte.ui.home.HomeActivity
import com.sdei.chafte.ui.home.event_detail.EventDetailsActivity
import com.sdei.chafte.utils.base.BaseFragment
import com.sdei.chafte.utils.getCalFromUTCTimezoneString
import com.sdei.chafte.utils.getCalendarData
import com.sdei.chafte.utils.setDateInterval
import com.sdei.chafte.utils.setNewDateInterval
import com.sdei.totalcabmobility.utils.common.localsavedata.SessionManager
import java.text.DateFormat
import java.text.Format
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class CalendarWeekFragment : BaseFragment<FragmentCalendarWeekBinding, CalendarWeekVM>() , WeekDayView.MonthChangeListener,
        WeekDayView.EventClickListener, WeekDayView.EventLongPressListener,WeekDayView.EmptyViewClickListener,WeekDayView.EmptyViewLongPressListener,WeekDayView.ScrollListener {
    override val layoutId: Int
        get() = R.layout.fragment_calendar_week
    override var viewModel: CalendarWeekVM
        get() = setUpVM(activity as HomeActivity, CalendarWeekVM(baseActivity.application))
        set(value) {}
    override var binding: FragmentCalendarWeekBinding
        get() = setUpBinding()
        set(value) {}
    var select_month= false
    var joinRoomList = ArrayList<JoinRoomData>()
    var selected_month=0
    var previous_date=0


    override fun bindData() {
        binding.cvm = viewModel

        val duration = resources.getStringArray(R.array.months)
        val adapter = ArrayAdapter(baseActivity.mContext, R.layout.spinner_item, duration)
        binding.spMonth.adapter = adapter

        viewModel.tokenObserve()?.observe(this, Observer {
            baseActivity.logout(activity)
        })
        viewModel.observerError()?.observe(this, Observer {
            showSnackBar(binding.root, it.toString(), true)
        })

        viewModel.progressObserve()?.observe(this, Observer {
            when(it){
                true ->    baseActivity.showProgress()
                false ->   baseActivity.hideProgress()
            }
        })

        viewModel.observerJoinRoomResponse()?.observe (this, Observer {
            joinRoomList.addAll(it)
            binding.weekdayview.setMonthChangeListener(this)
        })

        viewModel.getJoinRoom(baseActivity.getData(SessionManager.AUTHENTICATION))
        //init WeekView
        select_month=true

        binding.weekdayview.setMonthChangeListener(this)
        binding.weekdayview.setEventLongPressListener(this)
        binding.weekdayview.setOnEventClickListener(this)
        binding.weekdayview.setScrollListener(this)

        binding.weekheaderview.setDateSelectedChangeListener(DateSelectedChangeListener { oldSelectedDay, newSelectedDay ->
            select_month=true
            val format = SimpleDateFormat("MM", Locale.getDefault())

            var date= format.format(newSelectedDay.getTime()).toString()
            if(date.toInt()>9) {
                binding.spMonth.setSelection(date.toInt() - 1)
            }else{
                date= date.replace("0","")
                if(!date.equals("")) {
                    binding.spMonth.setSelection(date.toInt()-1)
                }else{
                    binding.spMonth.setSelection(0)
                }
            }
           /* if(selected_month == date.toInt()-1) {
                binding.spMonth.setSelection(date.toInt() - 1)
            }else{
                binding.spMonth.setSelection(selected_month)
            }*/
            binding.weekdayview.goToDate(
                newSelectedDay
            )
        })
        binding.weekheaderview.setScrollListener(WeekHeaderView.ScrollListener { newFirstVisibleDay, oldFirstVisibleDay ->
            select_month=true
            val format = SimpleDateFormat("MM", Locale.getDefault())
            var date= format.format(newFirstVisibleDay.getTime()).toString()
         //   binding.spMonth.setSelection(date.toInt() - 1)
            if(date.toInt()>9) {
                binding.spMonth.setSelection(date.toInt() - 1)
            }else{
                date= date.replace("0","")
                if(!date.equals("")) {
                    binding.spMonth.setSelection(date.toInt()-1)
                }else{
                    binding.spMonth.setSelection(0)
                }
            }


          /*  if(previous_date==date.toInt()-1) {
                if (selected_month == date.toInt() - 1) {
                    binding.spMonth.setSelection(date.toInt() - 1)
                } else {
                    binding.spMonth.setSelection(selected_month)
                }
            }*//*else{
                if(previous_date > date.toInt()-1){
                    var no= previous_date-date.toInt()-1
                    binding.spMonth.setSelection(selected_month+no)
                }else{
                    var no= (date.toInt()-1)-previous_date
                    binding.spMonth.setSelection(selected_month-no)
                }
            }*/
            binding.weekdayview.goToDate(
                binding.weekheaderview.getSelectedDay()
            )
        })
    }

    override fun initListeners() {
        setupDateTimeInterpreter(false)

        val dateFormat: DateFormat = SimpleDateFormat("MM")
        val date = Date()
        var month= dateFormat.format(date.getTime()).toString().replace("0","")
        binding.spMonth.setSelection(month.toInt()-1)
        selected_month=month.toInt()-1
        previous_date=month.toInt()-1
        binding.spMonth.setEnabled(false);
        binding.spMonth.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, pos: Int, id: Long) {
                /*select_month=true
                var item = parent.getItemAtPosition(pos).toString()
                val cal = Calendar.getInstance()
                cal.set(Calendar.MONTH,pos)
                cal.set(Calendar.DAY_OF_MONTH,1)
                binding.weekheaderview.setSelectedDay(cal)
                selected_month=pos*/
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        })

    }

    private fun setupDateTimeInterpreter(shortDate: Boolean) {
        val weekLabels = arrayOf("SUN", "MON", "TUS", "WED", "THU", "FRI", "SAT")
        // final String[] weekLabels={"日","一","二","三","四","五","六"};
        binding.weekdayview.setDateTimeInterpreter(object : DateTimeInterpreter {
            override fun interpretDate(date: Calendar): String {
                val weekdayNameFormat: Format = SimpleDateFormat("EEE", Locale.getDefault())
                val weekday = weekdayNameFormat.format(date.time)
                val format = SimpleDateFormat("d", Locale.getDefault())
                return format.format(date.time)
            }

            override fun interpretTime(hour: Int): String {
                return String.format("%02d:00", hour)
            }

            override fun interpretWeek(date: Int): String? {
                return if (date > 7 || date < 1) {
                    null
                } else weekLabels[date - 1]
            }
        })
    }


    override fun onMonthChange(newYear: Int, newMonth: Int): MutableList<WeekViewEvent> {

        if(select_month) {
            select_month = false
            val events: MutableList<WeekViewEvent> = ArrayList()

            joinRoomList.forEachIndexed { index, item ->
                var startTime = getCalFromUTCTimezoneString(item.roomId.startDate)
                var endTime = getCalFromUTCTimezoneString(item.roomId.endDate)
                /*if(!item.roomId.duration.toString().contains(".")){
                    endTime.add(Calendar.HOUR_OF_DAY, item.roomId.duration.toInt())
                }else {
                    var hours = item.roomId.duration - 0.5
                    endTime.add(Calendar.HOUR_OF_DAY, hours.toInt())
                    endTime.add(Calendar.MINUTE, 30)
                }*/
                var event = WeekViewEvent(index.toLong(), item.roomId.roomName+"\n"+setNewDateInterval(item.roomId.startDate,item.roomId.endDate), startTime, endTime)
                event.color = resources.getColor(R.color.colorPrimary)
                events.add(event)
            }
            return events
        }else{
            val newevents: MutableList<WeekViewEvent> = ArrayList()
            return newevents
        }
    }

    private fun getEventTitle(time: Calendar): String? {
        return String.format(
            "Event of %02d:%02d %s/%d",
            time[Calendar.HOUR_OF_DAY],
            time[Calendar.MINUTE], time[Calendar.MONTH] + 1, time[Calendar.DAY_OF_MONTH]
        )
    }

    override fun onEventClick(event: WeekViewEvent?, eventRect: RectF?) {
       // Toast.makeText(baseActivity.mContext, "Clicked " + event!!.name, Toast.LENGTH_SHORT).show()
       var index= joinRoomList.get(event!!.id.toInt()).roomId._id
        val bundle = Bundle()
        bundle.putString("key", "home")
        bundle.putString("room_id", index.toString())
        baseActivity.navigateActivity(EventDetailsActivity(),bundle)
    }

    override fun onEventLongPress(event: WeekViewEvent?, eventRect: RectF?) {
       // Toast.makeText(baseActivity.mContext, "Long pressed event: " + event!!.name, Toast.LENGTH_SHORT).show()

    }

    override fun onEmptyViewClicked(time: Calendar?) {
      //  Toast.makeText(baseActivity.mContext, "Empty View clicked " + time!![Calendar.YEAR] + "/" + time!![Calendar.MONTH] + "/" + time!![Calendar.DAY_OF_MONTH], Toast.LENGTH_LONG).show()
    }

    override fun onEmptyViewLongPress(time: Calendar?) {
      //  Toast.makeText(baseActivity.mContext, "Empty View long  clicked " + time!![Calendar.YEAR] + "/" + time!![Calendar.MONTH] + "/" + time!![Calendar.DAY_OF_MONTH], Toast.LENGTH_LONG).show()
    }

    override fun onFirstVisibleDayChanged(
        newFirstVisibleDay: Calendar?,
        oldFirstVisibleDay: Calendar?
    ) {

    }

    override fun onSelectedDaeChange(selectedDate: Calendar?) {
        binding.weekheaderview.setSelectedDay(selectedDate)
        var month= selectedDate?.get(Calendar.MONTH)!!.toString()
      //  binding.spMonth.setSelection(month.toInt())

        if(month.toInt()>9) {
            binding.spMonth.setSelection(month.toInt())
        }else{
            month= month.replace("0","")
            if(!month.equals("")) {
                binding.spMonth.setSelection(month.toInt())
            }else{
                binding.spMonth.setSelection(0)
            }
        }

        /*if(selected_month == month.toInt()) {
            binding.spMonth.setSelection(month.toInt())
        }else{
            binding.spMonth.setSelection(selected_month)
        }*/
        binding.tvDate.setText(selectedDate!![Calendar.YEAR].toString() + "/" + (selectedDate[Calendar.MONTH] + 1) + "月")
    }
}