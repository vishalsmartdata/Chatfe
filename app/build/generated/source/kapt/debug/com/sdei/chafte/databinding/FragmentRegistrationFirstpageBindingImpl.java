package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationFirstpageBindingImpl extends FragmentRegistrationFirstpageBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 7);
        sViewsWithIds.put(R.id.glright, 8);
        sViewsWithIds.put(R.id.txCreateAccount, 9);
        sViewsWithIds.put(R.id.txtext, 10);
        sViewsWithIds.put(R.id.txFirstName, 11);
        sViewsWithIds.put(R.id.txLastName, 12);
        sViewsWithIds.put(R.id.txEmail, 13);
        sViewsWithIds.put(R.id.txPhoneNumber, 14);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edFirstNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.firstnameObserver.get()
            //         is vm.firstnameObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edFirstName);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.firstnameObserver != null
            boolean vmFirstnameObserverJavaLangObjectNull = false;
            // vm.firstnameObserver.get()
            java.lang.String vmFirstnameObserverGet = null;
            // vm.firstnameObserver
            androidx.databinding.ObservableField<java.lang.String> vmFirstnameObserver = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmFirstnameObserver = vm.getFirstnameObserver();

                vmFirstnameObserverJavaLangObjectNull = (vmFirstnameObserver) != (null);
                if (vmFirstnameObserverJavaLangObjectNull) {




                    vmFirstnameObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edLastNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.lastnameObserver.get()
            //         is vm.lastnameObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edLastName);
            // localize variables for thread safety
            // vm.lastnameObserver.get()
            java.lang.String vmLastnameObserverGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.lastnameObserver
            androidx.databinding.ObservableField<java.lang.String> vmLastnameObserver = null;
            // vm.lastnameObserver != null
            boolean vmLastnameObserverJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmLastnameObserver = vm.getLastnameObserver();

                vmLastnameObserverJavaLangObjectNull = (vmLastnameObserver) != (null);
                if (vmLastnameObserverJavaLangObjectNull) {




                    vmLastnameObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edPhoneNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.phoneNumberObserver.get()
            //         is vm.phoneNumberObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edPhoneNumber);
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
    private androidx.databinding.InverseBindingListener edemailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.emailObserver.get()
            //         is vm.emailObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edemail);
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

    public FragmentRegistrationFirstpageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationFirstpageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.GridLayout) bindings[7]
            , (android.widget.GridLayout) bindings[8]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            );
        this.edFirstName.setTag(null);
        this.edLastName.setTag(null);
        this.edPhoneNumber.setTag(null);
        this.edemail.setTag(null);
        this.imageBack.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
        mCallback16 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
        if (BR.vm == variableId) {
            setVm((com.sdei.chafte.ui.authentication.registration.RegistrationVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.sdei.chafte.ui.authentication.registration.RegistrationVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmLastnameObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmEmailObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmFirstnameObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmPhoneNumberObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmLastnameObserver(androidx.databinding.ObservableField<java.lang.String> VmLastnameObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmEmailObserver(androidx.databinding.ObservableField<java.lang.String> VmEmailObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFirstnameObserver(androidx.databinding.ObservableField<java.lang.String> VmFirstnameObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPhoneNumberObserver(androidx.databinding.ObservableField<java.lang.String> VmPhoneNumberObserver, int fieldId) {
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
        java.lang.String vmEmailObserverGet = null;
        java.lang.String vmLastnameObserverGet = null;
        com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmLastnameObserver = null;
        java.lang.String vmFirstnameObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmEmailObserver = null;
        java.lang.String vmPhoneNumberObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmFirstnameObserver = null;
        androidx.databinding.ObservableField<java.lang.String> vmPhoneNumberObserver = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (vm != null) {
                        // read vm.lastnameObserver
                        vmLastnameObserver = vm.getLastnameObserver();
                    }
                    updateRegistration(0, vmLastnameObserver);


                    if (vmLastnameObserver != null) {
                        // read vm.lastnameObserver.get()
                        vmLastnameObserverGet = vmLastnameObserver.get();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (vm != null) {
                        // read vm.emailObserver
                        vmEmailObserver = vm.getEmailObserver();
                    }
                    updateRegistration(1, vmEmailObserver);


                    if (vmEmailObserver != null) {
                        // read vm.emailObserver.get()
                        vmEmailObserverGet = vmEmailObserver.get();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (vm != null) {
                        // read vm.firstnameObserver
                        vmFirstnameObserver = vm.getFirstnameObserver();
                    }
                    updateRegistration(2, vmFirstnameObserver);


                    if (vmFirstnameObserver != null) {
                        // read vm.firstnameObserver.get()
                        vmFirstnameObserverGet = vmFirstnameObserver.get();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (vm != null) {
                        // read vm.phoneNumberObserver
                        vmPhoneNumberObserver = vm.getPhoneNumberObserver();
                    }
                    updateRegistration(3, vmPhoneNumberObserver);


                    if (vmPhoneNumberObserver != null) {
                        // read vm.phoneNumberObserver.get()
                        vmPhoneNumberObserverGet = vmPhoneNumberObserver.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edFirstName, vmFirstnameObserverGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edFirstName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edFirstNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edLastName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edLastNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edPhoneNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edPhoneNumberandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edemail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edemailandroidTextAttrChanged);
            this.imageBack.setOnClickListener(mCallback16);
            this.txContinue.setOnClickListener(mCallback17);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edLastName, vmLastnameObserverGet);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edPhoneNumber, vmPhoneNumberObserverGet);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edemail, vmEmailObserverGet);
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



                    vm.buttonClickForNext(1);
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



                    vm.backButtonClick(1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.lastnameObserver
        flag 1 (0x2L): vm.emailObserver
        flag 2 (0x3L): vm.firstnameObserver
        flag 3 (0x4L): vm.phoneNumberObserver
        flag 4 (0x5L): vm
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}