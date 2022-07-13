package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationAfterInsideFouthPageBindingImpl extends FragmentRegistrationAfterInsideFouthPageBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 6);
        sViewsWithIds.put(R.id.glright, 7);
        sViewsWithIds.put(R.id.rgGroup, 8);
        sViewsWithIds.put(R.id.txWhereYourHometown, 9);
    }
    // views
    @NonNull
    private final android.widget.RadioButton mboundView2;
    @NonNull
    private final android.widget.RadioButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edHomeTownandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.howeTownObserver.get()
            //         is vm.howeTownObserver.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edHomeTown);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm.howeTownObserver.get()
            java.lang.String vmHoweTownObserverGet = null;
            // vm
            com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
            // vm.howeTownObserver != null
            boolean vmHoweTownObserverJavaLangObjectNull = false;
            // vm.howeTownObserver
            androidx.databinding.ObservableField<java.lang.String> vmHoweTownObserver = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmHoweTownObserver = vm.getHoweTownObserver();

                vmHoweTownObserverJavaLangObjectNull = (vmHoweTownObserver) != (null);
                if (vmHoweTownObserverJavaLangObjectNull) {




                    vmHoweTownObserver.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegistrationAfterInsideFouthPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationAfterInsideFouthPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[4]
            , (android.widget.GridLayout) bindings[6]
            , (android.widget.GridLayout) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.RadioGroup) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            );
        this.edHomeTown.setTag(null);
        this.imageBack.setTag(null);
        this.mboundView2 = (android.widget.RadioButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RadioButton) bindings[3];
        this.mboundView3.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback65 = new com.sdei.chafte.generated.callback.OnClickListener(this, 3);
        mCallback64 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
        mCallback66 = new com.sdei.chafte.generated.callback.OnClickListener(this, 4);
        mCallback63 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
                return onChangeVmHoweTownObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmHoweTownObserver(androidx.databinding.ObservableField<java.lang.String> VmHoweTownObserver, int fieldId) {
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
        boolean vmHomeTownVisibiltyEqualsMboundView2AndroidStringAll = false;
        com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmHoweTownObserver = null;
        boolean vmHomeTownVisibiltyEqualsMboundView3AndroidStringFriend = false;
        java.lang.String vmHoweTownObserverGet = null;
        java.lang.String vmHomeTownVisibilty = null;

        if ((dirtyFlags & 0x25L) != 0) {



                if (vm != null) {
                    // read vm.howeTownObserver
                    vmHoweTownObserver = vm.getHoweTownObserver();
                }
                updateRegistration(0, vmHoweTownObserver);


                if (vmHoweTownObserver != null) {
                    // read vm.howeTownObserver.get()
                    vmHoweTownObserverGet = vmHoweTownObserver.get();
                }
            if ((dirtyFlags & 0x24L) != 0) {

                    if (vm != null) {
                        // read vm.homeTownVisibilty
                        vmHomeTownVisibilty = vm.getHomeTownVisibilty();
                    }


                    if (vmHomeTownVisibilty != null) {
                        // read vm.homeTownVisibilty.equals(@android:string/all)
                        vmHomeTownVisibiltyEqualsMboundView2AndroidStringAll = vmHomeTownVisibilty.equals(mboundView2.getResources().getString(R.string.all));
                        // read vm.homeTownVisibilty.equals(@android:string/friend)
                        vmHomeTownVisibiltyEqualsMboundView3AndroidStringFriend = vmHomeTownVisibilty.equals(mboundView3.getResources().getString(R.string.friend));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edHomeTown, vmHoweTownObserverGet);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edHomeTown, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edHomeTownandroidTextAttrChanged);
            this.imageBack.setOnClickListener(mCallback63);
            this.mboundView2.setOnClickListener(mCallback64);
            this.mboundView3.setOnClickListener(mCallback65);
            this.txContinue.setOnClickListener(mCallback66);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, vmHomeTownVisibiltyEqualsMboundView2AndroidStringAll);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, vmHomeTownVisibiltyEqualsMboundView3AndroidStringFriend);
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



                    vm.checkHomeTown(mboundView3.getResources().getString(R.string.friend));
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



                    vm.checkHomeTown(mboundView2.getResources().getString(R.string.all));
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



                    vm.buttonClickForNext(7);
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



                    vm.backButtonClick(7);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.howeTownObserver
        flag 1 (0x2L): b
        flag 2 (0x3L): vm
        flag 3 (0x4L): c
        flag 4 (0x5L): a
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}