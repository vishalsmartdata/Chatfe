package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccountActivityBindingImpl extends FragmentAccountActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgCancel, 1);
        sViewsWithIds.put(R.id.txSetting, 2);
        sViewsWithIds.put(R.id.txBirthday, 3);
        sViewsWithIds.put(R.id.rbbday, 4);
        sViewsWithIds.put(R.id.firstView, 5);
        sViewsWithIds.put(R.id.txInvite, 6);
        sViewsWithIds.put(R.id.rbInvite, 7);
        sViewsWithIds.put(R.id.secondView, 8);
        sViewsWithIds.put(R.id.txUpcomingRoom, 9);
        sViewsWithIds.put(R.id.rbUpcoming, 10);
        sViewsWithIds.put(R.id.thirdView, 11);
        sViewsWithIds.put(R.id.txFriendPublicRoom, 12);
        sViewsWithIds.put(R.id.rbFriendRoom, 13);
        sViewsWithIds.put(R.id.fouthView, 14);
        sViewsWithIds.put(R.id.txSubmit, 15);
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

    public FragmentAccountActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentAccountActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[14]
            , (android.widget.GridLayout) bindings[16]
            , (android.widget.GridLayout) bindings[17]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Switch) bindings[13]
            , (android.widget.Switch) bindings[7]
            , (android.widget.Switch) bindings[10]
            , (android.widget.Switch) bindings[4]
            , (android.view.View) bindings[8]
            , (android.view.View) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[9]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.avVM == variableId) {
            setAvVM((com.sdei.chafte.ui.home.setting.SettingVm) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAvVM(@Nullable com.sdei.chafte.ui.home.setting.SettingVm AvVM) {
        this.mAvVM = AvVM;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): avVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}