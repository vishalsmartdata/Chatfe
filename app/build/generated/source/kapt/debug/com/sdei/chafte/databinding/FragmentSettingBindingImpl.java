package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSettingBindingImpl extends FragmentSettingBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgCancel, 2);
        sViewsWithIds.put(R.id.txSetting, 3);
        sViewsWithIds.put(R.id.txAccountVisibility, 4);
        sViewsWithIds.put(R.id.firstView, 5);
        sViewsWithIds.put(R.id.txActivity, 6);
        sViewsWithIds.put(R.id.SecondView, 7);
        sViewsWithIds.put(R.id.txCommunityRules, 8);
        sViewsWithIds.put(R.id.thirdView, 9);
        sViewsWithIds.put(R.id.txPrivacy, 10);
        sViewsWithIds.put(R.id.fourthView, 11);
        sViewsWithIds.put(R.id.txHelpSupport, 12);
        sViewsWithIds.put(R.id.txMyEvents, 13);
        sViewsWithIds.put(R.id.glLeft, 14);
        sViewsWithIds.put(R.id.glright, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSettingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentSettingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[11]
            , (android.widget.GridLayout) bindings[14]
            , (android.widget.GridLayout) bindings[15]
            , (android.widget.ImageView) bindings[2]
            , (android.view.View) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txSignOut.setTag(null);
        setRootTag(root);
        // listeners
        mCallback61 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
        if (BR.sVM == variableId) {
            setSVM((com.sdei.chafte.ui.home.setting.SettingVm) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSVM(@Nullable com.sdei.chafte.ui.home.setting.SettingVm SVM) {
        this.mSVM = SVM;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.sVM);
        super.requestRebind();
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
        com.sdei.chafte.ui.home.setting.SettingVm sVM = mSVM;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.txSignOut.setOnClickListener(mCallback61);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // sVM
        com.sdei.chafte.ui.home.setting.SettingVm sVM = mSVM;
        // sVM != null
        boolean sVMJavaLangObjectNull = false;



        sVMJavaLangObjectNull = (sVM) != (null);
        if (sVMJavaLangObjectNull) {


            sVM.doLogoutProcess();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}