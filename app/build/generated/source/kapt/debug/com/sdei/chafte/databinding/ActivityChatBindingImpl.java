package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityChatBindingImpl extends ActivityChatBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topLayer, 4);
        sViewsWithIds.put(R.id.imageBack, 5);
        sViewsWithIds.put(R.id.title, 6);
        sViewsWithIds.put(R.id.imgMoreOption, 7);
        sViewsWithIds.put(R.id.rlBottom, 8);
        sViewsWithIds.put(R.id.txAddAttachment, 9);
        sViewsWithIds.put(R.id.txAddPhoto, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txMessageandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of cVM.messageObservable.get()
            //         is cVM.messageObservable.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txMessage);
            // localize variables for thread safety
            // cVM.messageObservable != null
            boolean cVMMessageObservableJavaLangObjectNull = false;
            // cVM.messageObservable
            androidx.databinding.ObservableField<java.lang.String> cVMMessageObservable = null;
            // cVM.messageObservable.get()
            java.lang.String cVMMessageObservableGet = null;
            // cVM
            com.sdei.chafte.ui.home.message.chat.ChatVm cVM = mCVM;
            // cVM != null
            boolean cVMJavaLangObjectNull = false;



            cVMJavaLangObjectNull = (cVM) != (null);
            if (cVMJavaLangObjectNull) {


                cVMMessageObservable = cVM.getMessageObservable();

                cVMMessageObservableJavaLangObjectNull = (cVMMessageObservable) != (null);
                if (cVMMessageObservableJavaLangObjectNull) {




                    cVMMessageObservable.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityChatBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityChatBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ImageView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rlMessage.setTag(null);
        this.txMessage.setTag(null);
        this.txSend.setTag(null);
        setRootTag(root);
        // listeners
        mCallback42 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
        if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else if (BR.list == variableId) {
            setList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.cVM == variableId) {
            setCVM((com.sdei.chafte.ui.home.message.chat.ChatVm) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.click);
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
    public void setCVM(@Nullable com.sdei.chafte.ui.home.message.chat.ChatVm CVM) {
        this.mCVM = CVM;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.cVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCVMMessageObservable((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCVMMessageObservable(androidx.databinding.ObservableField<java.lang.String> CVMMessageObservable, int fieldId) {
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String cVMMessageObservableGet = null;
        androidx.databinding.ObservableField<java.lang.String> cVMMessageObservable = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback click = mClick;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> list = mList;
        com.sdei.chafte.ui.home.message.chat.ChatVm cVM = mCVM;

        if ((dirtyFlags & 0x16L) != 0) {
        }
        if ((dirtyFlags & 0x19L) != 0) {



                if (cVM != null) {
                    // read cVM.messageObservable
                    cVMMessageObservable = cVM.getMessageObservable();
                }
                updateRegistration(0, cVMMessageObservable);


                if (cVMMessageObservable != null) {
                    // read cVM.messageObservable.get()
                    cVMMessageObservableGet = cVMMessageObservable.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.rlMessage, list, com.sdei.chafte.R.layout.message_layout, click, (java.lang.Object)null, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txMessage, cVMMessageObservableGet);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txMessage, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txMessageandroidTextAttrChanged);
            this.txSend.setOnClickListener(mCallback42);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // cVM
        com.sdei.chafte.ui.home.message.chat.ChatVm cVM = mCVM;
        // cVM != null
        boolean cVMJavaLangObjectNull = false;



        cVMJavaLangObjectNull = (cVM) != (null);
        if (cVMJavaLangObjectNull) {


            cVM.sendMessage();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): cVM.messageObservable
        flag 1 (0x2L): list
        flag 2 (0x3L): click
        flag 3 (0x4L): cVM
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}