package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MessageLayoutBindingImpl extends MessageLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imProfile, 7);
        sViewsWithIds.put(R.id.cvCard, 8);
        sViewsWithIds.put(R.id.imgReceiverProfile, 9);
        sViewsWithIds.put(R.id.cvReceiverCard, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView4;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MessageLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private MessageLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[8]
            , (androidx.cardview.widget.CardView) bindings[10]
            , (com.sdei.chafte.utils.custom.CircleImageView) bindings[7]
            , (com.sdei.chafte.utils.custom.CircleImageView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.txReceiverMessage.setTag(null);
        this.txSenderMessage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.model == variableId) {
            setModel((com.sdei.chafte.model.ReceiveMessageModelItem) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.sdei.chafte.model.ReceiveMessageModelItem Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
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
        com.sdei.chafte.model.ReceiveMessageModelItem model = mModel;
        java.lang.String modelMe = null;
        java.lang.String modelReceiverId = null;
        java.lang.String modelMessage = null;
        int modelMeEqualsModelReceiverIdViewVISIBLEViewINVISIBLE = 0;
        boolean modelMeEqualsModelSenderId = false;
        java.lang.String modelSenderId = null;
        java.lang.String appBindingKtGetDateWithServerTimeStampModelCreatedAt = null;
        int modelMeEqualsModelSenderIdViewVISIBLEViewINVISIBLE = 0;
        java.lang.String modelCreatedAt = null;
        boolean modelMeEqualsModelReceiverId = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model._me
                    modelMe = model.get_me();
                    // read model.receiverId
                    modelReceiverId = model.getReceiverId();
                    // read model.message
                    modelMessage = model.getMessage();
                    // read model.senderId
                    modelSenderId = model.getSenderId();
                    // read model.createdAt
                    modelCreatedAt = model.getCreatedAt();
                }


                if (modelMe != null) {
                    // read model._me.equals(model.receiverId)
                    modelMeEqualsModelReceiverId = modelMe.equals(modelReceiverId);
                    // read model._me.equals(model.senderId)
                    modelMeEqualsModelSenderId = modelMe.equals(modelSenderId);
                }
            if((dirtyFlags & 0x5L) != 0) {
                if(modelMeEqualsModelReceiverId) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x5L) != 0) {
                if(modelMeEqualsModelSenderId) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
                // read AppBindingKt.getDateWithServerTimeStamp(model.createdAt)
                appBindingKtGetDateWithServerTimeStampModelCreatedAt = com.sdei.chafte.utils.AppBindingKt.getDateWithServerTimeStamp(modelCreatedAt);


                // read model._me.equals(model.receiverId) ? View.VISIBLE : View.INVISIBLE
                modelMeEqualsModelReceiverIdViewVISIBLEViewINVISIBLE = ((modelMeEqualsModelReceiverId) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                // read model._me.equals(model.senderId) ? View.VISIBLE : View.INVISIBLE
                modelMeEqualsModelSenderIdViewVISIBLEViewINVISIBLE = ((modelMeEqualsModelSenderId) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(modelMeEqualsModelSenderIdViewVISIBLEViewINVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, appBindingKtGetDateWithServerTimeStampModelCreatedAt);
            this.mboundView4.setVisibility(modelMeEqualsModelReceiverIdViewVISIBLEViewINVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, appBindingKtGetDateWithServerTimeStampModelCreatedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txReceiverMessage, modelMessage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txSenderMessage, modelMessage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): position
        flag 2 (0x3L): null
        flag 3 (0x4L): model._me.equals(model.receiverId) ? View.VISIBLE : View.INVISIBLE
        flag 4 (0x5L): model._me.equals(model.receiverId) ? View.VISIBLE : View.INVISIBLE
        flag 5 (0x6L): model._me.equals(model.senderId) ? View.VISIBLE : View.INVISIBLE
        flag 6 (0x7L): model._me.equals(model.senderId) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}