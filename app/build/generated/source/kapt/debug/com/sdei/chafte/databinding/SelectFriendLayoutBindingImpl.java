package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SelectFriendLayoutBindingImpl extends SelectFriendLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clLayer, 2);
        sViewsWithIds.put(R.id.imgCancel, 3);
        sViewsWithIds.put(R.id.txSelectFriend, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SelectFriendLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private SelectFriendLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerViewSelectedItem.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.fVM == variableId) {
            setFVM((com.sdei.chafte.ui.home.create_event.CreateEventVm) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else if (BR.list == variableId) {
            setList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFVM(@Nullable com.sdei.chafte.ui.home.create_event.CreateEventVm FVM) {
        this.mFVM = FVM;
    }
    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
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

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback click = mClick;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> list = mList;

        if ((dirtyFlags & 0xdL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewSelectedItem, list, com.sdei.chafte.R.layout.select_user_adapter, click, (java.lang.Object)null, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): list
        flag 1 (0x2L): fVM
        flag 2 (0x3L): click
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}