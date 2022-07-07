package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationSecondpageBindingImpl extends FragmentRegistrationSecondpageBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 6);
        sViewsWithIds.put(R.id.glright, 7);
        sViewsWithIds.put(R.id.txWhenYourBirth, 8);
        sViewsWithIds.put(R.id.txBirth, 9);
    }
    // views
    @NonNull
    private final android.widget.RadioButton mboundView3;
    @NonNull
    private final android.widget.RadioButton mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edBirthandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.dateOfBirthObserver.get()
            //         is vm.dateOfBirthObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edBirth);
            // localize variables for thread safety
            // vm.dateOfBirthObserver
            androidx.databinding.ObservableField<java.lang.String> vmDateOfBirthObserver = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.dateOfBirthObserver.get()
            java.lang.String vmDateOfBirthObserverGet = null;
            // vm.dateOfBirthObserver != null
            boolean vmDateOfBirthObserverJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmDateOfBirthObserver = vm.getDateOfBirthObserver();

                vmDateOfBirthObserverJavaLangObjectNull = (vmDateOfBirthObserver) != (null);
                if (vmDateOfBirthObserverJavaLangObjectNull) {




                    vmDateOfBirthObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegistrationSecondpageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationSecondpageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[2]
            , (android.widget.GridLayout) bindings[6]
            , (android.widget.GridLayout) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            );
        this.edBirth.setTag(null);
        this.imageBack.setTag(null);
        this.mboundView3 = (android.widget.RadioButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RadioButton) bindings[4];
        this.mboundView4.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new com.sdei.chafte.generated.callback.OnClickListener(this, 3);
        mCallback37 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        mCallback40 = new com.sdei.chafte.generated.callback.OnClickListener(this, 4);
        mCallback38 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
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
            mDirtyFlags |= 0x4L;
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
                return onChangeVmDateOfBirthObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmDateOfBirthObserver(androidx.databinding.ObservableField<java.lang.String> VmDateOfBirthObserver, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
        java.lang.String vmDateOfBirthObserverGet = null;
        boolean vmBirthDateVisiblityEqualsMboundView3AndroidStringAll = false;
        androidx.databinding.ObservableField<java.lang.String> vmDateOfBirthObserver = null;
        boolean vmBirthDateVisiblityEqualsMboundView4AndroidStringFriend = false;
        java.lang.String vmBirthDateVisiblity = null;

        if ((dirtyFlags & 0x25L) != 0) {



                if (vm != null) {
                    // read vm.dateOfBirthObserver
                    vmDateOfBirthObserver = vm.getDateOfBirthObserver();
                }
                updateRegistration(0, vmDateOfBirthObserver);


                if (vmDateOfBirthObserver != null) {
                    // read vm.dateOfBirthObserver.get()
                    vmDateOfBirthObserverGet = vmDateOfBirthObserver.get();
                }
            if ((dirtyFlags & 0x24L) != 0) {

                    if (vm != null) {
                        // read vm.birthDateVisiblity
                        vmBirthDateVisiblity = vm.getBirthDateVisiblity();
                    }


                    if (vmBirthDateVisiblity != null) {
                        // read vm.birthDateVisiblity.equals(@android:string/all)
                        vmBirthDateVisiblityEqualsMboundView3AndroidStringAll = vmBirthDateVisiblity.equals(mboundView3.getResources().getString(R.string.all));
                        // read vm.birthDateVisiblity.equals(@android:string/friend)
                        vmBirthDateVisiblityEqualsMboundView4AndroidStringFriend = vmBirthDateVisiblity.equals(mboundView4.getResources().getString(R.string.friend));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edBirth, vmDateOfBirthObserverGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edBirth, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edBirthandroidTextAttrChanged);
            this.imageBack.setOnClickListener(mCallback37);
            this.mboundView3.setOnClickListener(mCallback38);
            this.mboundView4.setOnClickListener(mCallback39);
            this.txContinue.setOnClickListener(mCallback40);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, vmBirthDateVisiblityEqualsMboundView3AndroidStringAll);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView4, vmBirthDateVisiblityEqualsMboundView4AndroidStringFriend);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {



                    vm.checkBirthDate(mboundView4.getResources().getString(R.string.friend));
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



                    vm.backButtonClick(4);
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {



                    vm.buttonClickForNext(4);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {



                    vm.checkBirthDate(mboundView3.getResources().getString(R.string.all));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.dateOfBirthObserver
        flag 1 (0x2L): b
        flag 2 (0x3L): vm
        flag 3 (0x4L): c
        flag 4 (0x5L): a
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}