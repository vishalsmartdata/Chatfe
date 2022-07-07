package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityFilterBindingImpl extends ActivityFilterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clLayer, 4);
        sViewsWithIds.put(R.id.imgCancel, 5);
        sViewsWithIds.put(R.id.txFilter, 6);
        sViewsWithIds.put(R.id.txSubmit, 7);
        sViewsWithIds.put(R.id.txCategory, 8);
        sViewsWithIds.put(R.id.txRoomName, 9);
        sViewsWithIds.put(R.id.edRoomName, 10);
        sViewsWithIds.put(R.id.txDate, 11);
        sViewsWithIds.put(R.id.txDateSelected, 12);
        sViewsWithIds.put(R.id.chCalendar, 13);
        sViewsWithIds.put(R.id.txTime, 14);
        sViewsWithIds.put(R.id.txSortBy, 15);
        sViewsWithIds.put(R.id.glLeft, 16);
        sViewsWithIds.put(R.id.glright, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.CheckBox) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.EditText) bindings[10]
            , (android.widget.GridLayout) bindings[16]
            , (android.widget.GridLayout) bindings[17]
            , (android.widget.ImageView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[14]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView.setTag(null);
        this.recyclerViewSort.setTag(null);
        this.recyclerViewTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        else if (BR.faVM == variableId) {
            setFaVM((com.sdei.chafte.ui.home.filter.FilterVm) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else if (BR.sortlist == variableId) {
            setSortlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setList(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List) {
        updateRegistration(0, List);
        this.mList = List;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.list);
        super.requestRebind();
    }
    public void setTimelist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Timelist) {
        updateRegistration(1, Timelist);
        this.mTimelist = Timelist;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.timelist);
        super.requestRebind();
    }
    public void setFaVM(@Nullable com.sdei.chafte.ui.home.filter.FilterVm FaVM) {
        this.mFaVM = FaVM;
    }
    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }
    public void setSortlist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Sortlist) {
        updateRegistration(2, Sortlist);
        this.mSortlist = Sortlist;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.sortlist);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 1 :
                return onChangeTimelist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 2 :
                return onChangeSortlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
        }
        return false;
    }
    private boolean onChangeList(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTimelist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Timelist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSortlist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Sortlist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> list = mList;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> timelist = mTimelist;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback click = mClick;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> sortlist = mSortlist;

        if ((dirtyFlags & 0x31L) != 0) {
        }
        if ((dirtyFlags & 0x32L) != 0) {
        }
        if ((dirtyFlags & 0x37L) != 0) {


            if ((dirtyFlags & 0x32L) != 0) {
            }
            if ((dirtyFlags & 0x31L) != 0) {
            }
        }
        if ((dirtyFlags & 0x34L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerView, list, com.sdei.chafte.R.layout.home_item_adapter, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewSort, sortlist, com.sdei.chafte.R.layout.sort_by_adapter, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewTime, timelist, com.sdei.chafte.R.layout.time_item_adapter, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): list
        flag 1 (0x2L): timelist
        flag 2 (0x3L): sortlist
        flag 3 (0x4L): faVM
        flag 4 (0x5L): click
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}