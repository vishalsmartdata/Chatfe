package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationAfterFouthPageBindingImpl extends FragmentRegistrationAfterFouthPageBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 5);
        sViewsWithIds.put(R.id.glright, 6);
        sViewsWithIds.put(R.id.txidentifyyourself, 7);
        sViewsWithIds.put(R.id.txYes, 8);
        sViewsWithIds.put(R.id.txNO, 9);
        sViewsWithIds.put(R.id.txOther, 10);
    }
    // views
    @NonNull
    private final android.widget.RadioButton mboundView2;
    @NonNull
    private final android.widget.RadioButton mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegistrationAfterFouthPageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationAfterFouthPageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.GridLayout) bindings[5]
            , (android.widget.GridLayout) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            );
        this.imageBack.setTag(null);
        this.mboundView2 = (android.widget.RadioButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RadioButton) bindings[3];
        this.mboundView3.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback55 = new com.sdei.chafte.generated.callback.OnClickListener(this, 4);
        mCallback52 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        mCallback54 = new com.sdei.chafte.generated.callback.OnClickListener(this, 3);
        mCallback53 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
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
            mDirtyFlags |= 0x2L;
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
        boolean vmDatingVisibilityEqualsMboundView2AndroidStringAll = false;
        com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;
        java.lang.String vmDatingVisibility = null;
        boolean vmDatingVisibilityEqualsMboundView3AndroidStringFriend = false;

        if ((dirtyFlags & 0x12L) != 0) {



                if (vm != null) {
                    // read vm.datingVisibility
                    vmDatingVisibility = vm.getDatingVisibility();
                }


                if (vmDatingVisibility != null) {
                    // read vm.datingVisibility.equals(@android:string/all)
                    vmDatingVisibilityEqualsMboundView2AndroidStringAll = vmDatingVisibility.equals(mboundView2.getResources().getString(R.string.all));
                    // read vm.datingVisibility.equals(@android:string/friend)
                    vmDatingVisibilityEqualsMboundView3AndroidStringFriend = vmDatingVisibility.equals(mboundView3.getResources().getString(R.string.friend));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.imageBack.setOnClickListener(mCallback52);
            this.mboundView2.setOnClickListener(mCallback53);
            this.mboundView3.setOnClickListener(mCallback54);
            this.txContinue.setOnClickListener(mCallback55);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, vmDatingVisibilityEqualsMboundView2AndroidStringAll);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, vmDatingVisibilityEqualsMboundView3AndroidStringFriend);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {



                    vm.buttonClickForNext(6);
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



                    vm.backButtonClick(6);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vm != null
                boolean vmJavaLangObjectNull = false;
                // vm
                com.sdei.chafte.ui.authentication.registration.RegistrationVM vm = mVm;



                vmJavaLangObjectNull = (vm) != (null);
                if (vmJavaLangObjectNull) {



                    vm.checkDating(mboundView3.getResources().getString(R.string.friend));
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



                    vm.checkDating(mboundView2.getResources().getString(R.string.all));
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): b
        flag 1 (0x2L): vm
        flag 2 (0x3L): c
        flag 3 (0x4L): a
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}