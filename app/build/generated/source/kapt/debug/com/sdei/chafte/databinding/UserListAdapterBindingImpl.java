package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UserListAdapterBindingImpl extends UserListAdapterBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserListAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private UserListAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.sdei.chafte.utils.custom.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.clUserList.setTag(null);
        this.imProfile.setTag(null);
        this.txPhoneNumber.setTag(null);
        this.txUserName.setTag(null);
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
        if (BR.model == variableId) {
            setModel((com.sdei.chafte.model.UserData) variable);
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

    public void setModel(@Nullable com.sdei.chafte.model.UserData Model) {
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
        com.sdei.chafte.model.UserData model = mModel;
        java.lang.Integer position = mPosition;
        java.lang.String modelPhone = null;
        java.lang.String modelFnameChar = null;
        java.lang.String modelFname = null;
        java.lang.String modelProfileImgImage = null;
        java.lang.String modelFnameCharModelLname = null;
        com.sdei.chafte.model.ProfileImg modelProfileImg = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
        java.lang.String modelLname = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.phone
                    modelPhone = model.getPhone();
                    // read model.fname
                    modelFname = model.getFname();
                    // read model.profileImg
                    modelProfileImg = model.getProfileImg();
                    // read model.lname
                    modelLname = model.getLname();
                }


                // read (model.fname) + (' ')
                modelFnameChar = (modelFname) + (' ');
                if (modelProfileImg != null) {
                    // read model.profileImg.image
                    modelProfileImgImage = modelProfileImg.getImage();
                }


                // read ((model.fname) + (' ')) + (model.lname)
                modelFnameCharModelLname = (modelFnameChar) + (modelLname);
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.clUserList.setOnClickListener(mCallback50);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.sdei.chafte.utils.AppBindingKt.setUserProfImage(this.imProfile, modelProfileImgImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txPhoneNumber, modelPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txUserName, modelFnameCharModelLname);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
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