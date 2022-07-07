package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationFrontPageBindingImpl extends FragmentRegistrationFrontPageBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 5);
        sViewsWithIds.put(R.id.glright, 6);
        sViewsWithIds.put(R.id.txCreateAccount, 7);
        sViewsWithIds.put(R.id.txUsername, 8);
        sViewsWithIds.put(R.id.txPassword, 9);
        sViewsWithIds.put(R.id.rlPassword, 10);
        sViewsWithIds.put(R.id.imgShowHidePassword, 11);
        sViewsWithIds.put(R.id.txConfirmPassword, 12);
        sViewsWithIds.put(R.id.rlConfirmPassword, 13);
        sViewsWithIds.put(R.id.imgShowHideConfirm, 14);
        sViewsWithIds.put(R.id.txRegister, 15);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
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
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
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
    private androidx.databinding.InverseBindingListener edPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.passwordObserver.get()
            //         is vm.passwordObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edPassword);
            // localize variables for thread safety
            // vm.passwordObserver
            androidx.databinding.ObservableField<java.lang.String> vmPasswordObserver = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
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
    private androidx.databinding.InverseBindingListener edUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.usernameObserver.get()
            //         is vm.usernameObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edUsername);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.usernameObserver != null
            boolean vmUsernameObserverJavaLangObjectNull = false;
            // vm.usernameObserver
            androidx.databinding.ObservableField<java.lang.String> vmUsernameObserver = null;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.usernameObserver.get()
            java.lang.String vmUsernameObserverGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmUsernameObserver = vm.getUsernameObserver();

                vmUsernameObserverJavaLangObjectNull = (vmUsernameObserver) != (null);
                if (vmUsernameObserverJavaLangObjectNull) {




                    vmUsernameObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegistrationFrontPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationFrontPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.GridLayout) bindings[5]
            , (android.widget.GridLayout) bindings[6]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            );
        this.edConfirmPassword.setTag(null);
        this.edPassword.setTag(null);
        this.edUsername.setTag(null);
        this.parent.setTag(null);
        this.txLogin.setTag(null);
        setRootTag(root);
        // listeners
        mCallback69 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmUsernameObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmPasswordObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmConfirmPasswordObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUsernameObserver(androidx.databinding.ObservableField<java.lang.String> VmUsernameObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPasswordObserver(androidx.databinding.ObservableField<java.lang.String> VmPasswordObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmConfirmPasswordObserver(androidx.databinding.ObservableField<java.lang.String> VmConfirmPasswordObserver, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.String> vmUsernameObserver = null;
        java.lang.String vmConfirmPasswordObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPasswordObserver = null;
        com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
        java.lang.String vmPasswordObserverGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmConfirmPasswordObserver = null;
        java.lang.String vmUsernameObserverGet = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (vm != null) {
                        // read vm.usernameObserver
                        vmUsernameObserver = vm.getUsernameObserver();
                    }
                    updateRegistration(0, vmUsernameObserver);


                    if (vmUsernameObserver != null) {
                        // read vm.usernameObserver.get()
                        vmUsernameObserverGet = vmUsernameObserver.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (vm != null) {
                        // read vm.passwordObserver
                        vmPasswordObserver = vm.getPasswordObserver();
                    }
                    updateRegistration(1, vmPasswordObserver);


                    if (vmPasswordObserver != null) {
                        // read vm.passwordObserver.get()
                        vmPasswordObserverGet = vmPasswordObserver.get();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (vm != null) {
                        // read vm.confirmPasswordObserver
                        vmConfirmPasswordObserver = vm.getConfirmPasswordObserver();
                    }
                    updateRegistration(2, vmConfirmPasswordObserver);


                    if (vmConfirmPasswordObserver != null) {
                        // read vm.confirmPasswordObserver.get()
                        vmConfirmPasswordObserverGet = vmConfirmPasswordObserver.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edConfirmPassword, vmConfirmPasswordObserverGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edConfirmPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edConfirmPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edUsernameandroidTextAttrChanged);
            this.txLogin.setOnClickListener(mCallback69);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edPassword, vmPasswordObserverGet);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edUsername, vmUsernameObserverGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {



            vm.buttonClickForNext(0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.usernameObserver
        flag 1 (0x2L): vm.passwordObserver
        flag 2 (0x3L): vm.confirmPasswordObserver
        flag 3 (0x4L): vm
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}