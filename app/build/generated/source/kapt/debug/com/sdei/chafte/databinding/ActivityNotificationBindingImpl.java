package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityNotificationBindingImpl extends ActivityNotificationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgCancel, 3);
        sViewsWithIds.put(R.id.txSetting, 4);
        sViewsWithIds.put(R.id.txFriendRequest, 5);
        sViewsWithIds.put(R.id.txInvites, 6);
        sViewsWithIds.put(R.id.txNodataFound, 7);
        sViewsWithIds.put(R.id.glLeft, 8);
        sViewsWithIds.put(R.id.glright, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityNotificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityNotificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.GridLayout) bindings[8]
            , (android.widget.GridLayout) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerInvite.setTag(null);
        this.recyclerViewSelectedItem.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.nVM == variableId) {
            setNVM((com.sdei.chafte.ui.home.notification.NotificationVM) variable);
        }
        else if (BR.privateRoomlist == variableId) {
            setPrivateRoomlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
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

    public void setNVM(@Nullable com.sdei.chafte.ui.home.notification.NotificationVM NVM) {
        this.mNVM = NVM;
    }
    public void setPrivateRoomlist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList PrivateRoomlist) {
        updateRegistration(0, PrivateRoomlist);
        this.mPrivateRoomlist = PrivateRoomlist;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.privateRoomlist);
        super.requestRebind();
    }
    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }
    public void setList(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List) {
        updateRegistration(1, List);
        this.mList = List;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.list);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePrivateRoomlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 1 :
                return onChangeList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
        }
        return false;
    }
    private boolean onChangePrivateRoomlist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList PrivateRoomlist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeList(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> privateRoomlist = mPrivateRoomlist;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback click = mClick;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> list = mList;

        if ((dirtyFlags & 0x19L) != 0) {
        }
        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {
            }
        }
        if ((dirtyFlags & 0x1aL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerInvite, privateRoomlist, com.sdei.chafte.R.layout.invite_friends_adapter, click, (java.lang.Object)null, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewSelectedItem, list, com.sdei.chafte.R.layout.user_friend_request_adapter, click, (java.lang.Object)null, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): privateRoomlist
        flag 1 (0x2L): list
        flag 2 (0x3L): nVM
        flag 3 (0x4L): click
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}