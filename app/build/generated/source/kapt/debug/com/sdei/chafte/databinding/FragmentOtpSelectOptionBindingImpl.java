package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentOtpSelectOptionBindingImpl extends FragmentOtpSelectOptionBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 5);
        sViewsWithIds.put(R.id.glright, 6);
        sViewsWithIds.put(R.id.txWhenYourBirth, 7);
        sViewsWithIds.put(R.id.txBirth, 8);
        sViewsWithIds.put(R.id.rgSelection, 9);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener rbEmailandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.optionEmail.get()
            //         is vm.optionEmail.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = rbEmail.isChecked();
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.optionEmail != null
            boolean vmOptionEmailJavaLangObjectNull = false;
            // vm.optionEmail.get()
            java.lang.Boolean vmOptionEmailGet = null;
            // vm.optionEmail
            androidx.databinding.ObservableField<java.lang.Boolean> vmOptionEmail = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOptionEmail = vm.getOptionEmail();

                vmOptionEmailJavaLangObjectNull = (vmOptionEmail) != (null);
                if (vmOptionEmailJavaLangObjectNull) {




                    vmOptionEmail.set(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener rbEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.emailObserver.get()
            //         is vm.emailObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(rbEmail);
            // localize variables for thread safety
            // vm.emailObserver
            androidx.databinding.ObservableField<java.lang.String> vmEmailObserver = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.emailObserver.get()
            java.lang.String vmEmailObserverGet = null;
            // vm.emailObserver != null
            boolean vmEmailObserverJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmEmailObserver = vm.getEmailObserver();

                vmEmailObserverJavaLangObjectNull = (vmEmailObserver) != (null);
                if (vmEmailObserverJavaLangObjectNull) {




                    vmEmailObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener rbPhoneNumberandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.optionPhonenumber.get()
            //         is vm.optionPhonenumber.set((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = rbPhoneNumber.isChecked();
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.optionPhonenumber != null
            boolean vmOptionPhonenumberJavaLangObjectNull = false;
            // vm.optionPhonenumber.get()
            java.lang.Boolean vmOptionPhonenumberGet = null;
            // vm.optionPhonenumber
            androidx.databinding.ObservableField<java.lang.Boolean> vmOptionPhonenumber = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmOptionPhonenumber = vm.getOptionPhonenumber();

                vmOptionPhonenumberJavaLangObjectNull = (vmOptionPhonenumber) != (null);
                if (vmOptionPhonenumberJavaLangObjectNull) {




                    vmOptionPhonenumber.set(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener rbPhoneNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.phoneNumberObserver.get()
            //         is vm.phoneNumberObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(rbPhoneNumber);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.phoneNumberObserver
            androidx.databinding.ObservableField<java.lang.String> vmPhoneNumberObserver = null;
            // vm.phoneNumberObserver.get()
            java.lang.String vmPhoneNumberObserverGet = null;
            // vm.phoneNumberObserver != null
            boolean vmPhoneNumberObserverJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPhoneNumberObserver = vm.getPhoneNumberObserver();

                vmPhoneNumberObserverJavaLangObjectNull = (vmPhoneNumberObserver) != (null);
                if (vmPhoneNumberObserverJavaLangObjectNull) {




                    vmPhoneNumberObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentOtpSelectOptionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentOtpSelectOptionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.GridLayout) bindings[5]
            , (android.widget.GridLayout) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RadioButton) bindings[3]
            , (android.widget.RadioButton) bindings[2]
            , (android.widget.RadioGroup) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.imageBack.setTag(null);
        this.parent.setTag(null);
        this.rbEmail.setTag(null);
        this.rbPhoneNumber.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback33 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
        mCallback32 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
            setVm((com.sdei.chafte.ui.authentication.registration.RegistrationVM) variable);
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
    public void setVm(@Nullable com.sdei.chafte.ui.authentication.registration.RegistrationVM Vm) {
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
                return onChangeVmEmailObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmPhoneNumberObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmOptionPhonenumber((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeVmOptionEmail((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmEmailObserver(androidx.databinding.ObservableField<java.lang.String> VmEmailObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPhoneNumberObserver(androidx.databinding.ObservableField<java.lang.String> VmPhoneNumberObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOptionPhonenumber(androidx.databinding.ObservableField<java.lang.Boolean> VmOptionPhonenumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOptionEmail(androidx.databinding.ObservableField<java.lang.Boolean> VmOptionEmail, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxVmOptionEmailGet = false;
        java.lang.String vmEmailObserverGet = null;
        java.lang.Boolean vmOptionPhonenumberGet = null;
        java.lang.Boolean vmOptionEmailGet = null;
        com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
        boolean androidxDatabindingViewDataBindingSafeUnboxVmOptionPhonenumberGet = false;
        androidx.databinding.ObservableField<java.lang.String> vmEmailObserver = null;
        java.lang.String vmPhoneNumberObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPhoneNumberObserver = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmOptionPhonenumber = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmOptionEmail = null;

        if ((dirtyFlags & 0x12fL) != 0) {


            if ((dirtyFlags & 0x121L) != 0) {

                    if (vm != null) {
                        // read vm.emailObserver
                        vmEmailObserver = vm.getEmailObserver();
                    }
                    updateRegistration(0, vmEmailObserver);


                    if (vmEmailObserver != null) {
                        // read vm.emailObserver.get()
                        vmEmailObserverGet = vmEmailObserver.get();
                    }
            }
            if ((dirtyFlags & 0x122L) != 0) {

                    if (vm != null) {
                        // read vm.phoneNumberObserver
                        vmPhoneNumberObserver = vm.getPhoneNumberObserver();
                    }
                    updateRegistration(1, vmPhoneNumberObserver);


                    if (vmPhoneNumberObserver != null) {
                        // read vm.phoneNumberObserver.get()
                        vmPhoneNumberObserverGet = vmPhoneNumberObserver.get();
                    }
            }
            if ((dirtyFlags & 0x124L) != 0) {

                    if (vm != null) {
                        // read vm.optionPhonenumber
                        vmOptionPhonenumber = vm.getOptionPhonenumber();
                    }
                    updateRegistration(2, vmOptionPhonenumber);


                    if (vmOptionPhonenumber != null) {
                        // read vm.optionPhonenumber.get()
                        vmOptionPhonenumberGet = vmOptionPhonenumber.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.optionPhonenumber.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmOptionPhonenumberGet = androidx.databinding.ViewDataBinding.safeUnbox(vmOptionPhonenumberGet);
            }
            if ((dirtyFlags & 0x128L) != 0) {

                    if (vm != null) {
                        // read vm.optionEmail
                        vmOptionEmail = vm.getOptionEmail();
                    }
                    updateRegistration(3, vmOptionEmail);


                    if (vmOptionEmail != null) {
                        // read vm.optionEmail.get()
                        vmOptionEmailGet = vmOptionEmail.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vm.optionEmail.get())
                    androidxDatabindingViewDataBindingSafeUnboxVmOptionEmailGet = androidx.databinding.ViewDataBinding.safeUnbox(vmOptionEmailGet);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.imageBack.setOnClickListener(mCallback32);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.rbEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, rbEmailandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.rbEmail, (android.widget.CompoundButton.OnCheckedChangeListener)null, rbEmailandroidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.rbPhoneNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, rbPhoneNumberandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.rbPhoneNumber, (android.widget.CompoundButton.OnCheckedChangeListener)null, rbPhoneNumberandroidCheckedAttrChanged);
            this.txContinue.setOnClickListener(mCallback33);
        }
        if ((dirtyFlags & 0x128L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.rbEmail, androidxDatabindingViewDataBindingSafeUnboxVmOptionEmailGet);
        }
        if ((dirtyFlags & 0x121L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rbEmail, vmEmailObserverGet);
        }
        if ((dirtyFlags & 0x124L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.rbPhoneNumber, androidxDatabindingViewDataBindingSafeUnboxVmOptionPhonenumberGet);
        }
        if ((dirtyFlags & 0x122L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rbPhoneNumber, vmPhoneNumberObserverGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {


                    vm.sendOtpVerification();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {



                    vm.backButtonClick(2);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.emailObserver
        flag 1 (0x2L): vm.phoneNumberObserver
        flag 2 (0x3L): vm.optionPhonenumber
        flag 3 (0x4L): vm.optionEmail
        flag 4 (0x5L): b
        flag 5 (0x6L): vm
        flag 6 (0x7L): c
        flag 7 (0x8L): a
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}