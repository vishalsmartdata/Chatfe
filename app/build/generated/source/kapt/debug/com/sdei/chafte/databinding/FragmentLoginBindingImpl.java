package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 4);
        sViewsWithIds.put(R.id.glright, 5);
        sViewsWithIds.put(R.id.txCreateAccount, 6);
        sViewsWithIds.put(R.id.txUsername, 7);
        sViewsWithIds.put(R.id.txPassword, 8);
        sViewsWithIds.put(R.id.rlPassword, 9);
        sViewsWithIds.put(R.id.imgShowHidePassword, 10);
        sViewsWithIds.put(R.id.txForgotPassword, 11);
        sViewsWithIds.put(R.id.txRegister, 12);
        sViewsWithIds.put(R.id.view, 13);
        sViewsWithIds.put(R.id.txSignIn, 14);
        sViewsWithIds.put(R.id.sign_in_button, 15);
        sViewsWithIds.put(R.id.login_button, 16);
        sViewsWithIds.put(R.id.goodleImage, 17);
        sViewsWithIds.put(R.id.facebookImage, 18);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.passwordObservable.get()
            //         is vm.passwordObservable.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edPassword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.passwordObservable.get()
            java.lang.String vmPasswordObservableGet = null;
            // vm.passwordObservable != null
            boolean vmPasswordObservableJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.login.LoginVM vm = mVm;
            // vm.passwordObservable
            androidx.databinding.ObservableField<java.lang.String> vmPasswordObservable = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPasswordObservable = vm.getPasswordObservable();

                vmPasswordObservableJavaLangObjectNull = (vmPasswordObservable) != (null);
                if (vmPasswordObservableJavaLangObjectNull) {




                    vmPasswordObservable.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.usernameObservable.get()
            //         is vm.usernameObservable.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edUsername);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.usernameObservable != null
            boolean vmUsernameObservableJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.login.LoginVM vm = mVm;
            // vm.usernameObservable
            androidx.databinding.ObservableField<java.lang.String> vmUsernameObservable = null;
            // vm.usernameObservable.get()
            java.lang.String vmUsernameObservableGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmUsernameObservable = vm.getUsernameObservable();

                vmUsernameObservableJavaLangObjectNull = (vmUsernameObservable) != (null);
                if (vmUsernameObservableJavaLangObjectNull) {




                    vmUsernameObservable.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.GridLayout) bindings[4]
            , (android.widget.GridLayout) bindings[5]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[10]
            , (com.facebook.login.widget.LoginButton) bindings[16]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[9]
            , (com.google.android.gms.common.SignInButton) bindings[15]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[7]
            , (android.view.View) bindings[13]
            );
        this.edPassword.setTag(null);
        this.edUsername.setTag(null);
        this.parent.setTag(null);
        this.txLogin.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setVm((com.sdei.chafte.ui.authentication.login.LoginVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.sdei.chafte.ui.authentication.login.LoginVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmPasswordObservable((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmUsernameObservable((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmPasswordObservable(androidx.databinding.ObservableField<java.lang.String> VmPasswordObservable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUsernameObservable(androidx.databinding.ObservableField<java.lang.String> VmUsernameObservable, int fieldId) {
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
        java.lang.String vmUsernameObservableGet = null;
        com.sdei.chafte.ui.authentication.login.LoginVM vm = mVm;
        java.lang.String vmPasswordObservableGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPasswordObservable = null;
        androidx.databinding.ObservableField<java.lang.String> vmUsernameObservable = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.passwordObservable
                        vmPasswordObservable = vm.getPasswordObservable();
                    }
                    updateRegistration(0, vmPasswordObservable);


                    if (vmPasswordObservable != null) {
                        // read vm.passwordObservable.get()
                        vmPasswordObservableGet = vmPasswordObservable.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.usernameObservable
                        vmUsernameObservable = vm.getUsernameObservable();
                    }
                    updateRegistration(1, vmUsernameObservable);


                    if (vmUsernameObservable != null) {
                        // read vm.usernameObservable.get()
                        vmUsernameObservableGet = vmUsernameObservable.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edPassword, vmPasswordObservableGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edUsernameandroidTextAttrChanged);
            this.txLogin.setOnClickListener(mCallback11);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edUsername, vmUsernameObservableGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.sdei.chafte.ui.authentication.login.LoginVM vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.doLoginProcess();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.passwordObservable
        flag 1 (0x2L): vm.usernameObservable
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}