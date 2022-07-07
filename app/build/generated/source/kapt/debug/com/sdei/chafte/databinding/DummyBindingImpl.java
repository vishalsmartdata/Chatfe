package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DummyBindingImpl extends DummyBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.email_til, 8);
        sViewsWithIds.put(R.id.password_til, 9);
        sViewsWithIds.put(R.id.btn, 10);
        sViewsWithIds.put(R.id.blinkingLoader, 11);
    }
    // views
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.usernameObservable.get()
            //         is vm.usernameObservable.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etEmail);
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
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.passwordObservable.get()
            //         is vm.passwordObservable.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
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

    public DummyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DummyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.wang.avi.AVLoadingIndicatorView) bindings[4]
            , (com.sdei.chafte.utils.custom.blinkingloader.BlinkingLoader) bindings[11]
            , (com.gigamole.library.ShadowLayout) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            );
        this.avi.setTag(null);
        this.etEmail.setTag(null);
        this.loginTv.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.parent.setTag(null);
        this.textView.setTag(null);
        this.textView2.setTag(null);
        this.textView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback12 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
            setVm((com.sdei.chafte.ui.authentication.login.LoginVM) variable);
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
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.b);
        super.requestRebind();
    }
    public void setVm(@Nullable com.sdei.chafte.ui.authentication.login.LoginVM Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setC(@Nullable java.lang.String C) {
        this.mC = C;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.c);
        super.requestRebind();
    }
    public void setA(@Nullable java.lang.String A) {
        this.mA = A;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.a);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmPasswordObservable((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmProgressObservable((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
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
    private boolean onChangeVmProgressObservable(androidx.databinding.ObservableField<java.lang.Boolean> VmProgressObservable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmUsernameObservable(androidx.databinding.ObservableField<java.lang.String> VmUsernameObservable, int fieldId) {
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
        java.lang.String b = mB;
        java.lang.String vmUsernameObservableGet = null;
        int vmProgressObservableBooleanValueViewVISIBLEViewINVISIBLE = 0;
        com.sdei.chafte.ui.authentication.login.LoginVM vm = mVm;
        java.lang.String c = mC;
        java.lang.String vmPasswordObservableGet = null;
        java.lang.String a = mA;
        boolean vmProgressObservableBooleanValue = false;
        java.lang.Boolean vmProgressObservableGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmPasswordObservable = null;
        androidx.databinding.ObservableField<java.lang.Boolean> vmProgressObservable = null;
        androidx.databinding.ObservableField<java.lang.String> vmUsernameObservable = null;

        if ((dirtyFlags & 0x88L) != 0) {
        }
        if ((dirtyFlags & 0x97L) != 0) {


            if ((dirtyFlags & 0x91L) != 0) {

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
            if ((dirtyFlags & 0x92L) != 0) {

                    if (vm != null) {
                        // read vm.progressObservable
                        vmProgressObservable = vm.getProgressObservable();
                    }
                    updateRegistration(1, vmProgressObservable);


                    if (vmProgressObservable != null) {
                        // read vm.progressObservable.get()
                        vmProgressObservableGet = vmProgressObservable.get();
                    }


                    if (vmProgressObservableGet != null) {
                        // read vm.progressObservable.get().booleanValue()
                        vmProgressObservableBooleanValue = vmProgressObservableGet.booleanValue();
                    }
                if((dirtyFlags & 0x92L) != 0) {
                    if(vmProgressObservableBooleanValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read vm.progressObservable.get().booleanValue() ? View.VISIBLE : View.INVISIBLE
                    vmProgressObservableBooleanValueViewVISIBLEViewINVISIBLE = ((vmProgressObservableBooleanValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x94L) != 0) {

                    if (vm != null) {
                        // read vm.usernameObservable
                        vmUsernameObservable = vm.getUsernameObservable();
                    }
                    updateRegistration(2, vmUsernameObservable);


                    if (vmUsernameObservable != null) {
                        // read vm.usernameObservable.get()
                        vmUsernameObservableGet = vmUsernameObservable.get();
                    }
            }
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xc0L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x92L) != 0) {
            // api target 1

            this.avi.setVisibility(vmProgressObservableBooleanValueViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x94L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmail, vmUsernameObservableGet);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etEmailandroidTextAttrChanged);
            this.loginTv.setOnClickListener(mCallback12);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x91L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, vmPasswordObservableGet);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, a);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView2, b);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView3, c);
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
        flag 1 (0x2L): vm.progressObservable
        flag 2 (0x3L): vm.usernameObservable
        flag 3 (0x4L): b
        flag 4 (0x5L): vm
        flag 5 (0x6L): c
        flag 6 (0x7L): a
        flag 7 (0x8L): null
        flag 8 (0x9L): vm.progressObservable.get().booleanValue() ? View.VISIBLE : View.INVISIBLE
        flag 9 (0xaL): vm.progressObservable.get().booleanValue() ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}