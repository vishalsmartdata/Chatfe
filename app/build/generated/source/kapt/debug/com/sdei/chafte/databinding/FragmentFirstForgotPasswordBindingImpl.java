package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFirstForgotPasswordBindingImpl extends FragmentFirstForgotPasswordBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 5);
        sViewsWithIds.put(R.id.glright, 6);
        sViewsWithIds.put(R.id.imageBack, 7);
        sViewsWithIds.put(R.id.txWhenYourBirth, 8);
        sViewsWithIds.put(R.id.txBirth, 9);
        sViewsWithIds.put(R.id.rgSelection, 10);
    }
    // views
    @NonNull
    private final android.widget.RadioButton mboundView1;
    @NonNull
    private final android.widget.RadioButton mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edEmailPhoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.emailOrPhoneNumber.get()
            //         is vm.emailOrPhoneNumber.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edEmailPhone);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.emailOrPhoneNumber
            androidx.databinding.ObservableField<java.lang.String> vmEmailOrPhoneNumber = null;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.emailOrPhoneNumber != null
            boolean vmEmailOrPhoneNumberJavaLangObjectNull = false;
            // vm.emailOrPhoneNumber.get()
            java.lang.String vmEmailOrPhoneNumberGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmEmailOrPhoneNumber = vm.getEmailOrPhoneNumber();

                vmEmailOrPhoneNumberJavaLangObjectNull = (vmEmailOrPhoneNumber) != (null);
                if (vmEmailOrPhoneNumberJavaLangObjectNull) {




                    vmEmailOrPhoneNumber.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView1androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.optionPhonenumber.getValue()
            //         is vm.optionPhonenumber.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView1.isChecked();
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.optionPhonenumber.getValue()
            java.lang.Boolean vmOptionPhonenumberGetValue = null;
            // vm.optionPhonenumber != null
            boolean vmOptionPhonenumberJavaLangObjectNull = false;
            // vm.optionPhonenumber
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmOptionPhonenumber = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOptionPhonenumber = vm.getOptionPhonenumber();

                vmOptionPhonenumberJavaLangObjectNull = (vmOptionPhonenumber) != (null);
                if (vmOptionPhonenumberJavaLangObjectNull) {




                    vmOptionPhonenumber.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.optionEmail.getValue()
            //         is vm.optionEmail.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView2.isChecked();
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
            // vm.optionEmail.getValue()
            java.lang.Boolean vmOptionEmailGetValue = null;
            // vm.optionEmail != null
            boolean vmOptionEmailJavaLangObjectNull = false;
            // vm.optionEmail
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmOptionEmail = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOptionEmail = vm.getOptionEmail();

                vmOptionEmailJavaLangObjectNull = (vmOptionEmail) != (null);
                if (vmOptionEmailJavaLangObjectNull) {




                    vmOptionEmail.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentFirstForgotPasswordBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentFirstForgotPasswordBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.EditText) bindings[3]
            , (android.widget.GridLayout) bindings[5]
            , (android.widget.GridLayout) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RadioGroup) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            );
        this.edEmailPhone.setTag(null);
        this.mboundView1 = (android.widget.RadioButton) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.RadioButton) bindings[2];
        this.mboundView2.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback25 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            mDirtyFlags |= 0x10L;
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
                return onChangeVmEmailOrPhoneNumber((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmOptionPhonenumber((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeVmOptionEmail((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmEmailOrPhoneNumber(androidx.databinding.ObservableField<java.lang.String> VmEmailOrPhoneNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOptionPhonenumber(androidx.lifecycle.MutableLiveData<java.lang.Boolean> VmOptionPhonenumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOptionEmail(androidx.lifecycle.MutableLiveData<java.lang.Boolean> VmOptionEmail, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.String> vmEmailOrPhoneNumber = null;
        java.lang.Boolean vmOptionEmailGetValue = null;
        java.lang.Boolean vmOptionPhonenumberGetValue = null;
        com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM vm = mVm;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmOptionPhonenumberGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmOptionEmailGetValue = false;
        java.lang.String vmEmailOrPhoneNumberGet = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmOptionPhonenumber = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> vmOptionEmail = null;

        if ((dirtyFlags & 0x97L) != 0) {


            if ((dirtyFlags & 0x91L) != 0) {

                    if (vm != null) {
                        // read vm.emailOrPhoneNumber
                        vmEmailOrPhoneNumber = vm.getEmailOrPhoneNumber();
                    }
                    updateRegistration(0, vmEmailOrPhoneNumber);


                    if (vmEmailOrPhoneNumber != null) {
                        // read vm.emailOrPhoneNumber.get()
                        vmEmailOrPhoneNumberGet = vmEmailOrPhoneNumber.get();
                    }
            }
            if ((dirtyFlags & 0x92L) != 0) {

                    if (vm != null) {
                        // read vm.optionPhonenumber
                        vmOptionPhonenumber = vm.getOptionPhonenumber();
                    }
                    updateLiveDataRegistration(1, vmOptionPhonenumber);


                    if (vmOptionPhonenumber != null) {
                        // read vm.optionPhonenumber.getValue()
                        vmOptionPhonenumberGetValue = vmOptionPhonenumber.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.optionPhonenumber.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmOptionPhonenumberGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmOptionPhonenumberGetValue);
            }
            if ((dirtyFlags & 0x94L) != 0) {

                    if (vm != null) {
                        // read vm.optionEmail
                        vmOptionEmail = vm.getOptionEmail();
                    }
                    updateLiveDataRegistration(2, vmOptionEmail);


                    if (vmOptionEmail != null) {
                        // read vm.optionEmail.getValue()
                        vmOptionEmailGetValue = vmOptionEmail.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.optionEmail.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmOptionEmailGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmOptionEmailGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x91L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edEmailPhone, vmEmailOrPhoneNumberGet);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edEmailPhone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edEmailPhoneandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView1, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView1androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView2, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView2androidCheckedAttrChanged);
            this.txContinue.setOnClickListener(mCallback25);
        }
        if ((dirtyFlags & 0x92L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView1, androidxDatabindingViewDataBindingSafeUnboxVmOptionPhonenumberGetValue);
        }
        if ((dirtyFlags & 0x94L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxVmOptionEmailGetValue);
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


            vm.sendOtpVerification();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.emailOrPhoneNumber
        flag 1 (0x2L): vm.optionPhonenumber
        flag 2 (0x3L): vm.optionEmail
        flag 3 (0x4L): b
        flag 4 (0x5L): vm
        flag 5 (0x6L): c
        flag 6 (0x7L): a
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}