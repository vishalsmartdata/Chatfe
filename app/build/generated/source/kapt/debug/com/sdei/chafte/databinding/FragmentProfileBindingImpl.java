package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgEdit, 9);
        sViewsWithIds.put(R.id.imProfile, 10);
        sViewsWithIds.put(R.id.txUserName, 11);
        sViewsWithIds.put(R.id.view1, 12);
        sViewsWithIds.put(R.id.txDrink, 13);
        sViewsWithIds.put(R.id.clLayer, 14);
        sViewsWithIds.put(R.id.imageDrink, 15);
        sViewsWithIds.put(R.id.txDrinkName, 16);
        sViewsWithIds.put(R.id.view2, 17);
        sViewsWithIds.put(R.id.txFriends, 18);
        sViewsWithIds.put(R.id.txViewFriends, 19);
        sViewsWithIds.put(R.id.view3, 20);
        sViewsWithIds.put(R.id.txAbout, 21);
        sViewsWithIds.put(R.id.imgAboutEdit, 22);
        sViewsWithIds.put(R.id.txInterestheading, 23);
        sViewsWithIds.put(R.id.txInterest, 24);
        sViewsWithIds.put(R.id.txIndentifyHeading, 25);
        sViewsWithIds.put(R.id.txIndentify, 26);
        sViewsWithIds.put(R.id.txHometownHeading, 27);
        sViewsWithIds.put(R.id.txHometown, 28);
        sViewsWithIds.put(R.id.txAgeHeading, 29);
        sViewsWithIds.put(R.id.txAge, 30);
        sViewsWithIds.put(R.id.glLeft, 31);
        sViewsWithIds.put(R.id.glright, 32);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txAboutTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of pVM.aboutYourselfObservable.get()
            //         is pVM.aboutYourselfObservable.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txAboutText);
            // localize variables for thread safety
            // pVM
            com.sdei.chafte.ui.home.profile.ProfileVM pVM = mPVM;
            // pVM.aboutYourselfObservable.get()
            java.lang.String pVMAboutYourselfObservableGet = null;
            // pVM.aboutYourselfObservable != null
            boolean pVMAboutYourselfObservableJavaLangObjectNull = false;
            // pVM != null
            boolean pVMJavaLangObjectNull = false;
            // pVM.aboutYourselfObservable
            androidx.databinding.ObservableField<java.lang.String> pVMAboutYourselfObservable = null;



            pVMJavaLangObjectNull = (pVM) != (null);
            if (pVMJavaLangObjectNull) {


                pVMAboutYourselfObservable = pVM.getAboutYourselfObservable();

                pVMAboutYourselfObservableJavaLangObjectNull = (pVMAboutYourselfObservable) != (null);
                if (pVMAboutYourselfObservableJavaLangObjectNull) {




                    pVMAboutYourselfObservable.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txHeaderandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of pVM.firstNameObservable.get()
            //         is pVM.firstNameObservable.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txHeader);
            // localize variables for thread safety
            // pVM.firstNameObservable.get()
            java.lang.String pVMFirstNameObservableGet = null;
            // pVM
            com.sdei.chafte.ui.home.profile.ProfileVM pVM = mPVM;
            // pVM != null
            boolean pVMJavaLangObjectNull = false;
            // pVM.firstNameObservable
            androidx.databinding.ObservableField<java.lang.String> pVMFirstNameObservable = null;
            // pVM.firstNameObservable != null
            boolean pVMFirstNameObservableJavaLangObjectNull = false;



            pVMJavaLangObjectNull = (pVM) != (null);
            if (pVMJavaLangObjectNull) {


                pVMFirstNameObservable = pVM.getFirstNameObservable();

                pVMFirstNameObservableJavaLangObjectNull = (pVMFirstNameObservable) != (null);
                if (pVMFirstNameObservableJavaLangObjectNull) {




                    pVMFirstNameObservable.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txHeaderLastandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of pVM.lastNameObservable.get()
            //         is pVM.lastNameObservable.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txHeaderLast);
            // localize variables for thread safety
            // pVM
            com.sdei.chafte.ui.home.profile.ProfileVM pVM = mPVM;
            // pVM.lastNameObservable.get()
            java.lang.String pVMLastNameObservableGet = null;
            // pVM != null
            boolean pVMJavaLangObjectNull = false;
            // pVM.lastNameObservable
            androidx.databinding.ObservableField<java.lang.String> pVMLastNameObservable = null;
            // pVM.lastNameObservable != null
            boolean pVMLastNameObservableJavaLangObjectNull = false;



            pVMJavaLangObjectNull = (pVM) != (null);
            if (pVMJavaLangObjectNull) {


                pVMLastNameObservable = pVM.getLastNameObservable();

                pVMLastNameObservableJavaLangObjectNull = (pVMLastNameObservable) != (null);
                if (pVMLastNameObservableJavaLangObjectNull) {




                    pVMLastNameObservable.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 33, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.GridLayout) bindings[31]
            , (android.widget.GridLayout) bindings[32]
            , (com.sdei.chafte.utils.custom.CircleImageView) bindings[10]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (android.widget.TextView) bindings[21]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[18]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[23]
            , (android.widget.EditText) bindings[11]
            , (android.widget.TextView) bindings[19]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[20]
            );
        this.imgDrinkEdit.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerDrink.setTag(null);
        this.recyclerFriendList.setTag(null);
        this.txAboutText.setTag(null);
        this.txDrinkSave.setTag(null);
        this.txEditSave.setTag(null);
        this.txHeader.setTag(null);
        this.txHeaderLast.setTag(null);
        setRootTag(root);
        // listeners
        mCallback47 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
        mCallback48 = new com.sdei.chafte.generated.callback.OnClickListener(this, 3);
        mCallback46 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
        if (BR.pVM == variableId) {
            setPVM((com.sdei.chafte.ui.home.profile.ProfileVM) variable);
        }
        else if (BR.list == variableId) {
            setList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else if (BR.friendlist == variableId) {
            setFriendlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPVM(@Nullable com.sdei.chafte.ui.home.profile.ProfileVM PVM) {
        this.mPVM = PVM;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.pVM);
        super.requestRebind();
    }
    public void setList(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List) {
        updateRegistration(1, List);
        this.mList = List;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.list);
        super.requestRebind();
    }
    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }
    public void setFriendlist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Friendlist) {
        updateRegistration(3, Friendlist);
        this.mFriendlist = Friendlist;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.friendlist);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangePVMLastNameObservable((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 2 :
                return onChangePVMFirstNameObservable((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeFriendlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 4 :
                return onChangePVMAboutYourselfObservable((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangePVMLastNameObservable(androidx.databinding.ObservableField<java.lang.String> PVMLastNameObservable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeList(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePVMFirstNameObservable(androidx.databinding.ObservableField<java.lang.String> PVMFirstNameObservable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFriendlist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Friendlist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePVMAboutYourselfObservable(androidx.databinding.ObservableField<java.lang.String> PVMAboutYourselfObservable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.String pVMFirstNameObservableGet = null;
        java.lang.String pVMAboutYourselfObservableGet = null;
        androidx.databinding.ObservableField<java.lang.String> pVMLastNameObservable = null;
        com.sdei.chafte.ui.home.profile.ProfileVM pVM = mPVM;
        java.lang.String pVMLastNameObservableGet = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> list = mList;
        androidx.databinding.ObservableField<java.lang.String> pVMFirstNameObservable = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback click = mClick;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> friendlist = mFriendlist;
        androidx.databinding.ObservableField<java.lang.String> pVMAboutYourselfObservable = null;

        if ((dirtyFlags & 0xb5L) != 0) {


            if ((dirtyFlags & 0xa1L) != 0) {

                    if (pVM != null) {
                        // read pVM.lastNameObservable
                        pVMLastNameObservable = pVM.getLastNameObservable();
                    }
                    updateRegistration(0, pVMLastNameObservable);


                    if (pVMLastNameObservable != null) {
                        // read pVM.lastNameObservable.get()
                        pVMLastNameObservableGet = pVMLastNameObservable.get();
                    }
            }
            if ((dirtyFlags & 0xa4L) != 0) {

                    if (pVM != null) {
                        // read pVM.firstNameObservable
                        pVMFirstNameObservable = pVM.getFirstNameObservable();
                    }
                    updateRegistration(2, pVMFirstNameObservable);


                    if (pVMFirstNameObservable != null) {
                        // read pVM.firstNameObservable.get()
                        pVMFirstNameObservableGet = pVMFirstNameObservable.get();
                    }
            }
            if ((dirtyFlags & 0xb0L) != 0) {

                    if (pVM != null) {
                        // read pVM.aboutYourselfObservable
                        pVMAboutYourselfObservable = pVM.getAboutYourselfObservable();
                    }
                    updateRegistration(4, pVMAboutYourselfObservable);


                    if (pVMAboutYourselfObservable != null) {
                        // read pVM.aboutYourselfObservable.get()
                        pVMAboutYourselfObservableGet = pVMAboutYourselfObservable.get();
                    }
            }
        }
        if ((dirtyFlags & 0xc2L) != 0) {
        }
        if ((dirtyFlags & 0xcaL) != 0) {


            if ((dirtyFlags & 0xc2L) != 0) {
            }
        }
        if ((dirtyFlags & 0xc8L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.imgDrinkEdit.setOnClickListener(mCallback47);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txAboutText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txAboutTextandroidTextAttrChanged);
            this.txDrinkSave.setOnClickListener(mCallback48);
            this.txEditSave.setOnClickListener(mCallback46);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txHeader, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txHeaderandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txHeaderLast, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txHeaderLastandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerDrink, list, com.sdei.chafte.R.layout.profile_drink_layout, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerFriendList, friendlist, com.sdei.chafte.R.layout.friend_list_layout, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0xb0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txAboutText, pVMAboutYourselfObservableGet);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txHeader, pVMFirstNameObservableGet);
        }
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txHeaderLast, pVMLastNameObservableGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // pVM
                com.sdei.chafte.ui.home.profile.ProfileVM pVM = mPVM;
                // pVM != null
                boolean pVMJavaLangObjectNull = false;



                pVMJavaLangObjectNull = (pVM) != (null);
                if (pVMJavaLangObjectNull) {


                    pVM.getAllDrink();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // pVM
                com.sdei.chafte.ui.home.profile.ProfileVM pVM = mPVM;
                // pVM != null
                boolean pVMJavaLangObjectNull = false;



                pVMJavaLangObjectNull = (pVM) != (null);
                if (pVMJavaLangObjectNull) {


                    pVM.getUpdateDrink();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // pVM
                com.sdei.chafte.ui.home.profile.ProfileVM pVM = mPVM;
                // pVM != null
                boolean pVMJavaLangObjectNull = false;



                pVMJavaLangObjectNull = (pVM) != (null);
                if (pVMJavaLangObjectNull) {


                    pVM.getUpdateProfile();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pVM.lastNameObservable
        flag 1 (0x2L): list
        flag 2 (0x3L): pVM.firstNameObservable
        flag 3 (0x4L): friendlist
        flag 4 (0x5L): pVM.aboutYourselfObservable
        flag 5 (0x6L): pVM
        flag 6 (0x7L): click
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}