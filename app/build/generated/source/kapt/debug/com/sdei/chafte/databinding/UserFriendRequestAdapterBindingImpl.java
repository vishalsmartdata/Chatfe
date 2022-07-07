package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserFriendRequestAdapterBindingImpl extends UserFriendRequestAdapterBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view1, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserFriendRequestAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private UserFriendRequestAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.sdei.chafte.utils.custom.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[5]
            );
        this.clUserList.setTag(null);
        this.imProfile.setTag(null);
        this.txAccept.setTag(null);
        this.txReject.setTag(null);
        this.txUserName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback35 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
        mCallback36 = new com.sdei.chafte.generated.callback.OnClickListener(this, 3);
        mCallback34 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
        if (BR.model == variableId) {
            setModel((com.sdei.chafte.model.FriendResult) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.sdei.chafte.model.FriendResult Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
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
        com.sdei.chafte.model.FriendResult model = mModel;
        java.lang.String modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequestChar = null;
        com.sdei.chafte.model.SenderData modelSenderData = null;
        java.lang.Integer position = mPosition;
        java.lang.String modelSenderDataFnameCharModelSenderDataLnameChar = null;
        java.lang.String modelSenderDataFnameCharModelSenderDataLname = null;
        java.lang.String modelSenderDataImage = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
        java.lang.String modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequestCharModelRequestTime = null;
        java.lang.String modelSenderDataFnameChar = null;
        java.lang.String modelSenderDataLname = null;
        java.lang.String modelRequestTime = null;
        java.lang.String modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequest = null;
        java.lang.String modelSenderDataFname = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.senderData
                    modelSenderData = model.getSenderData();
                    // read model.requestTime
                    modelRequestTime = model.getRequestTime();
                }


                if (modelSenderData != null) {
                    // read model.senderData.image
                    modelSenderDataImage = modelSenderData.getImage();
                    // read model.senderData.lname
                    modelSenderDataLname = modelSenderData.getLname();
                    // read model.senderData.fname
                    modelSenderDataFname = modelSenderData.getFname();
                }


                // read (model.senderData.fname) + (' ')
                modelSenderDataFnameChar = (modelSenderDataFname) + (' ');


                // read ((model.senderData.fname) + (' ')) + (model.senderData.lname)
                modelSenderDataFnameCharModelSenderDataLname = (modelSenderDataFnameChar) + (modelSenderDataLname);


                // read (((model.senderData.fname) + (' ')) + (model.senderData.lname)) + (' ')
                modelSenderDataFnameCharModelSenderDataLnameChar = (modelSenderDataFnameCharModelSenderDataLname) + (' ');


                // read ((((model.senderData.fname) + (' ')) + (model.senderData.lname)) + (' ')) + (@android:string/has_send_you_a_friend_request)
                modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequest = (modelSenderDataFnameCharModelSenderDataLnameChar) + (txUserName.getResources().getString(R.string.has_send_you_a_friend_request));


                // read (((((model.senderData.fname) + (' ')) + (model.senderData.lname)) + (' ')) + (@android:string/has_send_you_a_friend_request)) + (' ')
                modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequestChar = (modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequest) + (' ');


                // read ((((((model.senderData.fname) + (' ')) + (model.senderData.lname)) + (' ')) + (@android:string/has_send_you_a_friend_request)) + (' ')) + (model.requestTime)
                modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequestCharModelRequestTime = (modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequestChar) + (modelRequestTime);
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.clUserList.setOnClickListener(mCallback34);
            this.txAccept.setOnClickListener(mCallback35);
            this.txReject.setOnClickListener(mCallback36);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.sdei.chafte.utils.AppBindingKt.setUserProfImage(this.imProfile, modelSenderDataImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txUserName, modelSenderDataFnameCharModelSenderDataLnameCharTxUserNameAndroidStringHasSendYouAFriendRequestCharModelRequestTime);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // position
                java.lang.Integer position = mPosition;
                // callback
                com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onItemClick(txAccept, position);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // position
                java.lang.Integer position = mPosition;
                // callback
                com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onItemClick(txReject, position);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // position
                java.lang.Integer position = mPosition;
                // callback
                com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onItemClick(clUserList, position);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): position
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}