package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAboutEditBindingImpl extends ActivityAboutEditBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glLeft, 4);
        sViewsWithIds.put(R.id.glright, 5);
        sViewsWithIds.put(R.id.imageBack, 6);
        sViewsWithIds.put(R.id.txidentifyyourself, 7);
        sViewsWithIds.put(R.id.txMale, 8);
        sViewsWithIds.put(R.id.txFemale, 9);
        sViewsWithIds.put(R.id.txTransgenderFemale, 10);
        sViewsWithIds.put(R.id.txTransgenderMale, 11);
        sViewsWithIds.put(R.id.txVariant, 12);
        sViewsWithIds.put(R.id.txNotListed, 13);
        sViewsWithIds.put(R.id.txPreferNotAnswer, 14);
        sViewsWithIds.put(R.id.txIntesting, 15);
        sViewsWithIds.put(R.id.txYes, 16);
        sViewsWithIds.put(R.id.txNO, 17);
        sViewsWithIds.put(R.id.txOther, 18);
        sViewsWithIds.put(R.id.txWhereYourHometown, 19);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
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
            com.sdei.chafte.ui.home.edit_profile.AboutEditVM vm = mVm;
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
            com.sdei.chafte.ui.home.edit_profile.AboutEditVM vm = mVm;
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

    public ActivityAboutEditBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ActivityAboutEditBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[1]
            , (android.widget.GridLayout) bindings[4]
            , (android.widget.GridLayout) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[7]
            );
        this.edHomeTown.setTag(null);
        this.edNotListed.setTag(null);
        this.parent.setTag(null);
        this.txContinue.setTag(null);
        setRootTag(root);
        // listeners
        mCallback50 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
            setVm((com.sdei.chafte.ui.home.edit_profile.AboutEditVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.sdei.chafte.ui.home.edit_profile.AboutEditVM Vm) {
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
                return onChangeVmHoweTownObserver((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmNotListedObservers((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
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
    private boolean onChangeVmNotListedObservers(androidx.databinding.ObservableField<java.lang.String> VmNotListedObservers, int fieldId) {
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
        com.sdei.chafte.ui.home.edit_profile.AboutEditVM vm = mVm;
        androidx.databinding.ObservableField<java.lang.String> vmHoweTownObserver = null;
        androidx.databinding.ObservableField<java.lang.String> vmNotListedObservers = null;
        java.lang.String vmHoweTownObserverGet = null;
        java.lang.String vmNotListedObserversGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.howeTownObserver
                        vmHoweTownObserver = vm.getHoweTownObserver();
                    }
                    updateRegistration(0, vmHoweTownObserver);


                    if (vmHoweTownObserver != null) {
                        // read vm.howeTownObserver.get()
                        vmHoweTownObserverGet = vmHoweTownObserver.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.notListedObservers
                        vmNotListedObservers = vm.getNotListedObservers();
                    }
                    updateRegistration(1, vmNotListedObservers);


                    if (vmNotListedObservers != null) {
                        // read vm.notListedObservers.get()
                        vmNotListedObserversGet = vmNotListedObservers.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edHomeTown, vmHoweTownObserverGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edHomeTown, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edHomeTownandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edNotListed, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edNotListedandroidTextAttrChanged);
            this.txContinue.setOnClickListener(mCallback50);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edNotListed, vmNotListedObserversGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vm != null
        boolean vmJavaLangObjectNull = false;
        // vm
        com.sdei.chafte.ui.home.edit_profile.AboutEditVM vm = mVm;



        vmJavaLangObjectNull = (vm) != (null);
        if (vmJavaLangObjectNull) {


            vm.getUpdateProfile();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.howeTownObserver
        flag 1 (0x2L): vm.notListedObservers
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}