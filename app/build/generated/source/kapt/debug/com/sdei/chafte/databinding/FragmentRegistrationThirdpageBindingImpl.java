package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationThirdpageBindingImpl extends FragmentRegistrationThirdpageBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 6);
        sViewsWithIds.put(R.id.glright, 7);
        sViewsWithIds.put(R.id.txidentifyyourself, 8);
        sViewsWithIds.put(R.id.txMale, 9);
        sViewsWithIds.put(R.id.txFemale, 10);
        sViewsWithIds.put(R.id.txTransgenderFemale, 11);
        sViewsWithIds.put(R.id.txTransgenderMale, 12);
        sViewsWithIds.put(R.id.txVariant, 13);
        sViewsWithIds.put(R.id.txNotListed, 14);
        sViewsWithIds.put(R.id.txPreferNotAnswer, 15);
        sViewsWithIds.put(R.id.rgGroup, 16);
    }
    // views
    @NonNull
    private final android.widget.RadioButton mboundView3;
    @NonNull
    private final android.widget.RadioButton mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edNotListedandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.notListedObservers.get()
            //         is vm.notListedObservers.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edNotListed);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.notListedObservers.get()
            java.lang.String vmNotListedObserversGet = null;
            // vm.notListedObservers != null
            boolean vmNotListedObserversJavaLangObjectNull = false;
            // vm.notListedObservers
            androidx.databinding.ObservableField<java.lang.String> vmNotListedObservers = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmNotListedObservers = vm.getNotListedObservers();

                vmNotListedObserversJavaLangObjectNull = (vmNotListedObservers) != (null);
                if (vmNotListedObserversJavaLangObjectNull) {




                    vmNotListedObservers.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegistrationThirdpageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationThirdpageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[2]
            , (android.widget.GridLayout) bindings[6]
            , (android.widget.GridLayout) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[8]
            );
        this.edNotListed.setTag(null);
        this.imageBack.setTag(null);
        this.mboundView3 = (android.widget.RadioButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RadioButton) bindings[4];
        this.mboundView4.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.sdei.chafte.generated.callback.OnClickListener(this, 3);
        mCallback6 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        mCallback9 = new com.sdei.chafte.generated.callback.OnClickListener(this, 4);
        mCallback7 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
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
                return onChangeVmNotListedObservers((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmNotListedObservers(androidx.databinding.ObservableField<java.lang.String> VmNotListedObservers, int fieldId) {
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
        boolean vmGenderVisiblityEqualsMboundView3AndroidStringAll = false;
        com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
        java.lang.String vmGenderVisiblity = null;
        androidx.databinding.ObservableField<java.lang.String> vmNotListedObservers = null;
        java.lang.String vmNotListedObserversGet = null;
        boolean vmGenderVisiblityEqualsMboundView4AndroidStringFriend = false;

        if ((dirtyFlags & 0x25L) != 0) {


            if ((dirtyFlags & 0x24L) != 0) {

                    if (vm != null) {
                        // read vm.genderVisiblity
                        vmGenderVisiblity = vm.getGenderVisiblity();
                    }


                    if (vmGenderVisiblity != null) {
                        // read vm.genderVisiblity.equals(@android:string/all)
                        vmGenderVisiblityEqualsMboundView3AndroidStringAll = vmGenderVisiblity.equals(mboundView3.getResources().getString(R.string.all));
                        // read vm.genderVisiblity.equals(@android:string/friend)
                        vmGenderVisiblityEqualsMboundView4AndroidStringFriend = vmGenderVisiblity.equals(mboundView4.getResources().getString(R.string.friend));
                    }
            }

                if (vm != null) {
                    // read vm.notListedObservers
                    vmNotListedObservers = vm.getNotListedObservers();
                }
                updateRegistration(0, vmNotListedObservers);


                if (vmNotListedObservers != null) {
                    // read vm.notListedObservers.get()
                    vmNotListedObserversGet = vmNotListedObservers.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edNotListed, vmNotListedObserversGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edNotListed, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edNotListedandroidTextAttrChanged);
            this.imageBack.setOnClickListener(mCallback6);
            this.mboundView3.setOnClickListener(mCallback7);
            this.mboundView4.setOnClickListener(mCallback8);
            this.txContinue.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, vmGenderVisiblityEqualsMboundView3AndroidStringAll);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView4, vmGenderVisiblityEqualsMboundView4AndroidStringFriend);
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



                    vm.checkGender(mboundView4.getResources().getString(R.string.friend));
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



                    vm.backButtonClick(5);
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



                    vm.buttonClickForNext(5);
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



                    vm.checkGender(mboundView3.getResources().getString(R.string.all));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.notListedObservers
        flag 1 (0x2L): b
        flag 2 (0x3L): vm
        flag 3 (0x4L): c
        flag 4 (0x5L): a
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}