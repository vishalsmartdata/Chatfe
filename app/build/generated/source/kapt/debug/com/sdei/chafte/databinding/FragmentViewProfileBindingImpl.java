package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentViewProfileBindingImpl extends FragmentViewProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topLayer, 3);
        sViewsWithIds.put(R.id.imageBack, 4);
        sViewsWithIds.put(R.id.title, 5);
        sViewsWithIds.put(R.id.imgMoreOption, 6);
        sViewsWithIds.put(R.id.imgAddFriend, 7);
        sViewsWithIds.put(R.id.txEditSave, 8);
        sViewsWithIds.put(R.id.imProfile, 9);
        sViewsWithIds.put(R.id.txHeader, 10);
        sViewsWithIds.put(R.id.txHeaderLast, 11);
        sViewsWithIds.put(R.id.txAboutText, 12);
        sViewsWithIds.put(R.id.view1, 13);
        sViewsWithIds.put(R.id.txDrink, 14);
        sViewsWithIds.put(R.id.txDrinkSave, 15);
        sViewsWithIds.put(R.id.clLayer, 16);
        sViewsWithIds.put(R.id.imageDrink, 17);
        sViewsWithIds.put(R.id.txDrinkName, 18);
        sViewsWithIds.put(R.id.view2, 19);
        sViewsWithIds.put(R.id.txFriends, 20);
        sViewsWithIds.put(R.id.txViewFriends, 21);
        sViewsWithIds.put(R.id.view3, 22);
        sViewsWithIds.put(R.id.txAbout, 23);
        sViewsWithIds.put(R.id.txInterestheading, 24);
        sViewsWithIds.put(R.id.txInterest, 25);
        sViewsWithIds.put(R.id.txIndentifyHeading, 26);
        sViewsWithIds.put(R.id.txIndentify, 27);
        sViewsWithIds.put(R.id.txHometownHeading, 28);
        sViewsWithIds.put(R.id.txHometown, 29);
        sViewsWithIds.put(R.id.txAgeHeading, 30);
        sViewsWithIds.put(R.id.txAge, 31);
        sViewsWithIds.put(R.id.glLeft, 32);
        sViewsWithIds.put(R.id.glright, 33);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentViewProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private FragmentViewProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[16]
            , (android.widget.GridLayout) bindings[32]
            , (android.widget.GridLayout) bindings[33]
            , (com.sdei.chafte.utils.custom.CircleImageView) bindings[9]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (android.widget.TextView) bindings[23]
            , (android.widget.EditText) bindings[12]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[20]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[21]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[22]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerDrink.setTag(null);
        this.recyclerFriendList.setTag(null);
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
        if (BR.list == variableId) {
            setList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else if (BR.vpVM == variableId) {
            setVpVM((com.sdei.chafte.ui.home.setting.SettingVm) variable);
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
        updateRegistration(0, List);
        this.mList = List;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.list);
        super.requestRebind();
    }
    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }
    public void setVpVM(@Nullable com.sdei.chafte.ui.home.setting.SettingVm VpVM) {
        this.mVpVM = VpVM;
    }
    public void setFriendlist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Friendlist) {
        updateRegistration(1, Friendlist);
        this.mFriendlist = Friendlist;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.friendlist);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 1 :
                return onChangeFriendlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
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
    private boolean onChangeFriendlist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Friendlist, int fieldId) {
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
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> list = mList;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback click = mClick;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> friendlist = mFriendlist;

        if ((dirtyFlags & 0x15L) != 0) {
        }
        if ((dirtyFlags & 0x17L) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {
            }
        }
        if ((dirtyFlags & 0x16L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerDrink, list, com.sdei.chafte.R.layout.profile_drink_layout, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerFriendList, friendlist, com.sdei.chafte.R.layout.friend_list_layout, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): list
        flag 1 (0x2L): friendlist
        flag 2 (0x3L): click
        flag 3 (0x4L): vpVM
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}