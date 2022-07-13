package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCreateEventBindingImpl extends ActivityCreateEventBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clLayer, 8);
        sViewsWithIds.put(R.id.imgCancel, 9);
        sViewsWithIds.put(R.id.txRoom, 10);
        sViewsWithIds.put(R.id.txCategory, 11);
        sViewsWithIds.put(R.id.txRoomName, 12);
        sViewsWithIds.put(R.id.txInvite, 13);
        sViewsWithIds.put(R.id.txInviteFriend, 14);
        sViewsWithIds.put(R.id.txDate, 15);
        sViewsWithIds.put(R.id.txDateSelected, 16);
        sViewsWithIds.put(R.id.txByEmail, 17);
        sViewsWithIds.put(R.id.rgType, 18);
        sViewsWithIds.put(R.id.rbChat, 19);
        sViewsWithIds.put(R.id.rbWatchPart, 20);
        sViewsWithIds.put(R.id.txTime, 21);
        sViewsWithIds.put(R.id.txDuration, 22);
        sViewsWithIds.put(R.id.spDuration, 23);
        sViewsWithIds.put(R.id.txAbout, 24);
        sViewsWithIds.put(R.id.imgEvent, 25);
        sViewsWithIds.put(R.id.txUploadImage, 26);
        sViewsWithIds.put(R.id.glLeft, 27);
        sViewsWithIds.put(R.id.glright, 28);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edAboutandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of cVM.aboutObserver.get()
            //         is cVM.aboutObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edAbout);
            // localize variables for thread safety
            // cVM.aboutObserver.get()
            java.lang.String cVMAboutObserverGet = null;
            // cVM.aboutObserver
            androidx.databinding.ObservableField<java.lang.String> cVMAboutObserver = null;
            // cVM.aboutObserver != null
            boolean cVMAboutObserverJavaLangObjectNull = false;
            // cVM
            com.sdei.chafte.ui.home.create_event.CreateEventVm cVM = mCVM;
            // cVM != null
            boolean cVMJavaLangObjectNull = false;



            cVMJavaLangObjectNull = (cVM) != (null);
            if (cVMJavaLangObjectNull) {


                cVMAboutObserver = cVM.getAboutObserver();

                cVMAboutObserverJavaLangObjectNull = (cVMAboutObserver) != (null);
                if (cVMAboutObserverJavaLangObjectNull) {




                    cVMAboutObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edEmailsandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of cVM.emailObserver.get()
            //         is cVM.emailObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edEmails);
            // localize variables for thread safety
            // cVM.emailObserver.get()
            java.lang.String cVMEmailObserverGet = null;
            // cVM.emailObserver
            androidx.databinding.ObservableField<java.lang.String> cVMEmailObserver = null;
            // cVM
            com.sdei.chafte.ui.home.create_event.CreateEventVm cVM = mCVM;
            // cVM.emailObserver != null
            boolean cVMEmailObserverJavaLangObjectNull = false;
            // cVM != null
            boolean cVMJavaLangObjectNull = false;



            cVMJavaLangObjectNull = (cVM) != (null);
            if (cVMJavaLangObjectNull) {


                cVMEmailObserver = cVM.getEmailObserver();

                cVMEmailObserverJavaLangObjectNull = (cVMEmailObserver) != (null);
                if (cVMEmailObserverJavaLangObjectNull) {




                    cVMEmailObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edRoomNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of cVM.roomNameObserver.get()
            //         is cVM.roomNameObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edRoomName);
            // localize variables for thread safety
            // cVM.roomNameObserver
            androidx.databinding.ObservableField<java.lang.String> cVMRoomNameObserver = null;
            // cVM.roomNameObserver.get()
            java.lang.String cVMRoomNameObserverGet = null;
            // cVM
            com.sdei.chafte.ui.home.create_event.CreateEventVm cVM = mCVM;
            // cVM != null
            boolean cVMJavaLangObjectNull = false;
            // cVM.roomNameObserver != null
            boolean cVMRoomNameObserverJavaLangObjectNull = false;



            cVMJavaLangObjectNull = (cVM) != (null);
            if (cVMJavaLangObjectNull) {


                cVMRoomNameObserver = cVM.getRoomNameObserver();

                cVMRoomNameObserverJavaLangObjectNull = (cVMRoomNameObserver) != (null);
                if (cVMRoomNameObserverJavaLangObjectNull) {




                    cVMRoomNameObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityCreateEventBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ActivityCreateEventBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[4]
            , (android.widget.AutoCompleteTextView) bindings[2]
            , (android.widget.GridLayout) bindings[27]
            , (android.widget.GridLayout) bindings[28]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.RadioButton) bindings[19]
            , (android.widget.RadioButton) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.RadioGroup) bindings[18]
            , (android.widget.Spinner) bindings[23]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[26]
            );
        this.edAbout.setTag(null);
        this.edEmails.setTag(null);
        this.edRoomName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        this.recyclerViewFriends.setTag(null);
        this.recyclerViewTime.setTag(null);
        this.txSubmit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.list == variableId) {
            setList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.timelist == variableId) {
            setTimelist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else if (BR.cVM == variableId) {
            setCVM((com.sdei.chafte.ui.home.create_event.CreateEventVm) variable);
        }
        else if (BR.friendlist == variableId) {
            setFriendlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setList(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List) {
        updateRegistration(3, List);
        this.mList = List;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.list);
        super.requestRebind();
    }
    public void setTimelist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Timelist) {
        updateRegistration(4, Timelist);
        this.mTimelist = Timelist;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.timelist);
        super.requestRebind();
    }
    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }
    public void setCVM(@Nullable com.sdei.chafte.ui.home.create_event.CreateEventVm CVM) {
        this.mCVM = CVM;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.cVM);
        super.requestRebind();
    }
    public void setFriendlist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Friendlist) {
        updateRegistration(5, Friendlist);
        this.mFriendlist = Friendlist;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.friendlist);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCVMEmailObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeCVMAboutObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeCVMRoomNameObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 4 :
                return onChangeTimelist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 5 :
                return onChangeFriendlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCVMEmailObserver(androidx.databinding.ObservableField<java.lang.String> CVMEmailObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCVMAboutObserver(androidx.databinding.ObservableField<java.lang.String> CVMAboutObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCVMRoomNameObserver(androidx.databinding.ObservableField<java.lang.String> CVMRoomNameObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeList(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTimelist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Timelist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFriendlist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Friendlist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String cVMEmailObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> cVMEmailObserver = null;
        androidx.databinding.ObservableField<java.lang.String> cVMAboutObserver = null;
        androidx.databinding.ObservableField<java.lang.String> cVMRoomNameObserver = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> list = mList;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> timelist = mTimelist;
        java.lang.String cVMAboutObserverGet = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback click = mClick;
        java.lang.String cVMRoomNameObserverGet = null;
        com.sdei.chafte.ui.home.create_event.CreateEventVm cVM = mCVM;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> friendlist = mFriendlist;

        if ((dirtyFlags & 0x148L) != 0) {
        }
        if ((dirtyFlags & 0x150L) != 0) {
        }
        if ((dirtyFlags & 0x178L) != 0) {


            if ((dirtyFlags & 0x150L) != 0) {
            }
            if ((dirtyFlags & 0x148L) != 0) {
            }
        }
        if ((dirtyFlags & 0x187L) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (cVM != null) {
                        // read cVM.emailObserver
                        cVMEmailObserver = cVM.getEmailObserver();
                    }
                    updateRegistration(0, cVMEmailObserver);


                    if (cVMEmailObserver != null) {
                        // read cVM.emailObserver.get()
                        cVMEmailObserverGet = cVMEmailObserver.get();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (cVM != null) {
                        // read cVM.aboutObserver
                        cVMAboutObserver = cVM.getAboutObserver();
                    }
                    updateRegistration(1, cVMAboutObserver);


                    if (cVMAboutObserver != null) {
                        // read cVM.aboutObserver.get()
                        cVMAboutObserverGet = cVMAboutObserver.get();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (cVM != null) {
                        // read cVM.roomNameObserver
                        cVMRoomNameObserver = cVM.getRoomNameObserver();
                    }
                    updateRegistration(2, cVMRoomNameObserver);


                    if (cVMRoomNameObserver != null) {
                        // read cVM.roomNameObserver.get()
                        cVMRoomNameObserverGet = cVMRoomNameObserver.get();
                    }
            }
        }
        if ((dirtyFlags & 0x160L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edAbout, cVMAboutObserverGet);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edAbout, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edAboutandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edEmails, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edEmailsandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edRoomName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edRoomNameandroidTextAttrChanged);
            this.txSubmit.setOnClickListener(mCallback67);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edEmails, cVMEmailObserverGet);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edRoomName, cVMRoomNameObserverGet);
        }
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerView, list, com.sdei.chafte.R.layout.home_item_adapter, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewFriends, friendlist, com.sdei.chafte.R.layout.friends_item_adapter, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewTime, timelist, com.sdei.chafte.R.layout.time_item_adapter, click, (java.lang.Object)null, (boolean)false, (boolean)false, (boolean)false, true, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // cVM
        com.sdei.chafte.ui.home.create_event.CreateEventVm cVM = mCVM;
        // cVM != null
        boolean cVMJavaLangObjectNull = false;



        cVMJavaLangObjectNull = (cVM) != (null);
        if (cVMJavaLangObjectNull) {


            cVM.doCreateEventProcess();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cVM.emailObserver
        flag 1 (0x2L): cVM.aboutObserver
        flag 2 (0x3L): cVM.roomNameObserver
        flag 3 (0x4L): list
        flag 4 (0x5L): timelist
        flag 5 (0x6L): friendlist
        flag 6 (0x7L): click
        flag 7 (0x8L): cVM
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}