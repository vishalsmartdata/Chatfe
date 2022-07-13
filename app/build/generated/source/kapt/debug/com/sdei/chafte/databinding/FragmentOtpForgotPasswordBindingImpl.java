package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOtpForgotPasswordBindingImpl extends FragmentOtpForgotPasswordBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 7);
        sViewsWithIds.put(R.id.glright, 8);
        sViewsWithIds.put(R.id.imageBack, 9);
        sViewsWithIds.put(R.id.txWhenYourBirth, 10);
        sViewsWithIds.put(R.id.txBirth, 11);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback60;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edFirstDigitandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.otpFirstObserver.get()
            //         is vm.otpFirstObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edFirstDigit);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.otpFirstObserver
            androidx.databinding.ObservableField<java.lang.String> vmOtpFirstObserver = null;
            // vm.otpFirstObserver != null
            boolean vmOtpFirstObserverJavaLangObjectNull = false;
            // vm.otpFirstObserver.get()
            java.lang.String vmOtpFirstObserverGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOtpFirstObserver = vm.getOtpFirstObserver();

                vmOtpFirstObserverJavaLangObjectNull = (vmOtpFirstObserver) != (null);
                if (vmOtpFirstObserverJavaLangObjectNull) {




                    vmOtpFirstObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edSecondDigitandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.otpSecondObserver.get()
            //         is vm.otpSecondObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edSecondDigit);
            // localize variables for thread safety
            // vm.otpSecondObserver.get()
            java.lang.String vmOtpSecondObserverGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.otpSecondObserver
            androidx.databinding.ObservableField<java.lang.String> vmOtpSecondObserver = null;
            // vm.otpSecondObserver != null
            boolean vmOtpSecondObserverJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOtpSecondObserver = vm.getOtpSecondObserver();

                vmOtpSecondObserverJavaLangObjectNull = (vmOtpSecondObserver) != (null);
                if (vmOtpSecondObserverJavaLangObjectNull) {




                    vmOtpSecondObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edfourthDigitandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.otpFouthObserver.get()
            //         is vm.otpFouthObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edfourthDigit);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.otpFouthObserver != null
            boolean vmOtpFouthObserverJavaLangObjectNull = false;
            // vm.otpFouthObserver.get()
            java.lang.String vmOtpFouthObserverGet = null;
            // vm.otpFouthObserver
            androidx.databinding.ObservableField<java.lang.String> vmOtpFouthObserver = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOtpFouthObserver = vm.getOtpFouthObserver();

                vmOtpFouthObserverJavaLangObjectNull = (vmOtpFouthObserver) != (null);
                if (vmOtpFouthObserverJavaLangObjectNull) {




                    vmOtpFouthObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edthirdDigitandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.otpThirdObserver.get()
            //         is vm.otpThirdObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edthirdDigit);
            // localize variables for thread safety
            // vm.otpThirdObserver
            androidx.databinding.ObservableField<java.lang.String> vmOtpThirdObserver = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.otpThirdObserver != null
            boolean vmOtpThirdObserverJavaLangObjectNull = false;
            // vm.otpThirdObserver.get()
            java.lang.String vmOtpThirdObserverGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOtpThirdObserver = vm.getOtpThirdObserver();

                vmOtpThirdObserverJavaLangObjectNull = (vmOtpThirdObserver) != (null);
                if (vmOtpThirdObserverJavaLangObjectNull) {




                    vmOtpThirdObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentOtpForgotPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentOtpForgotPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.GridLayout) bindings[7]
            , (android.widget.GridLayout) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            );
        this.edFirstDigit.setTag(null);
        this.edSecondDigit.setTag(null);
        this.edfourthDigit.setTag(null);
        this.edthirdDigit.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        this.txResentOtp.setTag(null);
        setRootTag(root);
        // listeners
        mCallback60 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        mCallback61 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
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
            mDirtyFlags |= 0x20L;
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
                return onChangeVmOtpFouthObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmOtpFirstObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmOtpSecondObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmOtpThirdObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmOtpFouthObserver(androidx.databinding.ObservableField<java.lang.String> VmOtpFouthObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOtpFirstObserver(androidx.databinding.ObservableField<java.lang.String> VmOtpFirstObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOtpSecondObserver(androidx.databinding.ObservableField<java.lang.String> VmOtpSecondObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOtpThirdObserver(androidx.databinding.ObservableField<java.lang.String> VmOtpThirdObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String vmOtpFouthObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmOtpFouthObserver = null;
        com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmOtpFirstObserver = null;
        androidx.databinding.ObservableField<java.lang.String> vmOtpSecondObserver = null;
        java.lang.String vmOtpThirdObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmOtpThirdObserver = null;
        java.lang.String vmOtpSecondObserverGet = null;
        java.lang.String vmOtpFirstObserverGet = null;

        if ((dirtyFlags & 0x12fL) != 0) {


            if ((dirtyFlags & 0x121L) != 0) {

                    if (vm != null) {
                        // read vm.otpFouthObserver
                        vmOtpFouthObserver = vm.getOtpFouthObserver();
                    }
                    updateRegistration(0, vmOtpFouthObserver);


                    if (vmOtpFouthObserver != null) {
                        // read vm.otpFouthObserver.get()
                        vmOtpFouthObserverGet = vmOtpFouthObserver.get();
                    }
            }
            if ((dirtyFlags & 0x122L) != 0) {

                    if (vm != null) {
                        // read vm.otpFirstObserver
                        vmOtpFirstObserver = vm.getOtpFirstObserver();
                    }
                    updateRegistration(1, vmOtpFirstObserver);


                    if (vmOtpFirstObserver != null) {
                        // read vm.otpFirstObserver.get()
                        vmOtpFirstObserverGet = vmOtpFirstObserver.get();
                    }
            }
            if ((dirtyFlags & 0x124L) != 0) {

                    if (vm != null) {
                        // read vm.otpSecondObserver
                        vmOtpSecondObserver = vm.getOtpSecondObserver();
                    }
                    updateRegistration(2, vmOtpSecondObserver);


                    if (vmOtpSecondObserver != null) {
                        // read vm.otpSecondObserver.get()
                        vmOtpSecondObserverGet = vmOtpSecondObserver.get();
                    }
            }
            if ((dirtyFlags & 0x128L) != 0) {

                    if (vm != null) {
                        // read vm.otpThirdObserver
                        vmOtpThirdObserver = vm.getOtpThirdObserver();
                    }
                    updateRegistration(3, vmOtpThirdObserver);


                    if (vmOtpThirdObserver != null) {
                        // read vm.otpThirdObserver.get()
                        vmOtpThirdObserverGet = vmOtpThirdObserver.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x122L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edFirstDigit, vmOtpFirstObserverGet);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edFirstDigit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edFirstDigitandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edSecondDigit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edSecondDigitandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edfourthDigit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edfourthDigitandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edthirdDigit, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edthirdDigitandroidTextAttrChanged);
            this.txContinue.setOnClickListener(mCallback60);
            this.txResentOtp.setOnClickListener(mCallback61);
        }
        if ((dirtyFlags & 0x124L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edSecondDigit, vmOtpSecondObserverGet);
        }
        if ((dirtyFlags & 0x121L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edfourthDigit, vmOtpFouthObserverGet);
        }
        if ((dirtyFlags & 0x128L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edthirdDigit, vmOtpThirdObserverGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.OtpVerification();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.sendOtpVerification();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.otpFouthObserver
        flag 1 (0x2L): vm.otpFirstObserver
        flag 2 (0x3L): vm.otpSecondObserver
        flag 3 (0x4L): vm.otpThirdObserver
        flag 4 (0x5L): b
        flag 5 (0x6L): vm
        flag 6 (0x7L): c
        flag 7 (0x8L): a
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}