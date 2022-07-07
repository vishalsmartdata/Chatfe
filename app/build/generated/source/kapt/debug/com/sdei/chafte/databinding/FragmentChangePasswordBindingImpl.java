package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentChangePasswordBindingImpl extends FragmentChangePasswordBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 4);
        sViewsWithIds.put(R.id.glright, 5);
        sViewsWithIds.put(R.id.imageBack, 6);
        sViewsWithIds.put(R.id.txWhenYourBirth, 7);
        sViewsWithIds.put(R.id.txBirth, 8);
        sViewsWithIds.put(R.id.txConfirmPassword, 9);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edConfirmPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.confirmPasswordObserver.get()
            //         is vm.confirmPasswordObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edConfirmPassword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.confirmPasswordObserver.get()
            java.lang.String vmConfirmPasswordObserverGet = null;
            // vm.confirmPasswordObserver != null
            boolean vmConfirmPasswordObserverJavaLangObjectNull = false;
            // vm.confirmPasswordObserver
            androidx.databinding.ObservableField<java.lang.String> vmConfirmPasswordObserver = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmConfirmPasswordObserver = vm.getConfirmPasswordObserver();

                vmConfirmPasswordObserverJavaLangObjectNull = (vmConfirmPasswordObserver) != (null);
                if (vmConfirmPasswordObserverJavaLangObjectNull) {




                    vmConfirmPasswordObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edNewPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.passwordObserver.get()
            //         is vm.passwordObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edNewPassword);
            // localize variables for thread safety
            // vm.passwordObserver
            androidx.databinding.ObservableField<java.lang.String> vmPasswordObserver = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.passwordObserver.get()
            java.lang.String vmPasswordObserverGet = null;
            // vm.passwordObserver != null
            boolean vmPasswordObserverJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPasswordObserver = vm.getPasswordObserver();

                vmPasswordObserverJavaLangObjectNull = (vmPasswordObserver) != (null);
                if (vmPasswordObserverJavaLangObjectNull) {




                    vmPasswordObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentChangePasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentChangePasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.GridLayout) bindings[4]
            , (android.widget.GridLayout) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            );
        this.edConfirmPassword.setTag(null);
        this.edNewPassword.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.b == variableId) {
            setB((java.lang.String) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM) variable);
        }
        else if (BR.c == variableId) {
            setC((java.lang.String) variable);
        }
        else if (BR.a == variableId) {
            setA((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setB(@Nullable java.lang.String B) {
        this.mB = B;
    }
    public void setVm(@Nullable com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setC(@Nullable java.lang.String C) {
        this.mC = C;
    }
    public void setA(@Nullable java.lang.String A) {
        this.mA = A;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmPasswordObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmConfirmPasswordObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmPasswordObserver(androidx.databinding.ObservableField<java.lang.String> VmPasswordObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmConfirmPasswordObserver(androidx.databinding.ObservableField<java.lang.String> VmConfirmPasswordObserver, int fieldId) {
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
        java.lang.String vmConfirmPasswordObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPasswordObserver = null;
        com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
        java.lang.String vmPasswordObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmConfirmPasswordObserver = null;

        if ((dirtyFlags & 0x4bL) != 0) {


            if ((dirtyFlags & 0x49L) != 0) {

                    if (vm != null) {
                        // read vm.passwordObserver
                        vmPasswordObserver = vm.getPasswordObserver();
                    }
                    updateRegistration(0, vmPasswordObserver);


                    if (vmPasswordObserver != null) {
                        // read vm.passwordObserver.get()
                        vmPasswordObserverGet = vmPasswordObserver.get();
                    }
            }
            if ((dirtyFlags & 0x4aL) != 0) {

                    if (vm != null) {
                        // read vm.confirmPasswordObserver
                        vmConfirmPasswordObserver = vm.getConfirmPasswordObserver();
                    }
                    updateRegistration(1, vmConfirmPasswordObserver);


                    if (vmConfirmPasswordObserver != null) {
                        // read vm.confirmPasswordObserver.get()
                        vmConfirmPasswordObserverGet = vmConfirmPasswordObserver.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edConfirmPassword, vmConfirmPasswordObserverGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edConfirmPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edConfirmPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edNewPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edNewPasswordandroidTextAttrChanged);
            this.txContinue.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edNewPassword, vmPasswordObserverGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.changePassword();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.passwordObserver
        flag 1 (0x2L): vm.confirmPasswordObserver
        flag 2 (0x3L): b
        flag 3 (0x4L): vm
        flag 4 (0x5L): c
        flag 5 (0x6L): a
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}