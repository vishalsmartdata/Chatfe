package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecentSearchLayoutBindingImpl extends RecentSearchLayoutBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cvCard, 5);
        sViewsWithIds.put(R.id.view1, 6);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecentSearchLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private RecentSearchLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[6]
            );
        this.imgCancelItem.setTag(null);
        this.imgSliderPic.setTag(null);
        this.recentSearchLt.setTag(null);
        this.txHeader.setTag(null);
        this.txdate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback57 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
        mCallback56 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
            setModel((com.sdei.chafte.model.RecentSearchData) variable);
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

    public void setModel(@Nullable com.sdei.chafte.model.RecentSearchData Model) {
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
        com.sdei.chafte.model.RecentSearchData model = mModel;
        java.lang.Integer position = mPosition;
        java.lang.String modelImage = null;
        java.lang.String modelFnameChar = null;
        java.lang.String modelFname = null;
        java.lang.String modelStartTimeChar = null;
        java.lang.String modelType = null;
        java.lang.String modelFnameCharModelLname = null;
        java.lang.String modelStartTime = null;
        boolean modelTypeEqualsTxdateAndroidStringUser = false;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
        java.lang.String modelEndTime = null;
        boolean modelTypeEqualsTxHeaderAndroidStringUser = false;
        java.lang.String modelTypeEqualsTxHeaderAndroidStringUserModelFnameCharModelLnameModelRoomName = null;
        java.lang.String modelRoomName = null;
        java.lang.String modelStartTimeCharModelEndTime = null;
        int modelTypeEqualsTxdateAndroidStringUserViewGONEViewVISIBLE = 0;
        java.lang.String modelLname = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.image
                    modelImage = model.getImage();
                    // read model.type
                    modelType = model.getType();
                    // read model.startTime
                    modelStartTime = model.getStartTime();
                    // read model.endTime
                    modelEndTime = model.getEndTime();
                }


                if (modelType != null) {
                    // read model.type.equals(@android:string/user)
                    modelTypeEqualsTxdateAndroidStringUser = modelType.equals(txdate.getResources().getString(R.string.user));
                    // read model.type.equals(@android:string/user)
                    modelTypeEqualsTxHeaderAndroidStringUser = modelType.equals(txHeader.getResources().getString(R.string.user));
                }
            if((dirtyFlags & 0x9L) != 0) {
                if(modelTypeEqualsTxdateAndroidStringUser) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x9L) != 0) {
                if(modelTypeEqualsTxHeaderAndroidStringUser) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
                // read (model.startTime) + (' ')
                modelStartTimeChar = (modelStartTime) + (' ');


                // read model.type.equals(@android:string/user) ? View.GONE : View.VISIBLE
                modelTypeEqualsTxdateAndroidStringUserViewGONEViewVISIBLE = ((modelTypeEqualsTxdateAndroidStringUser) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read ((model.startTime) + (' ')) + (model.endTime)
                modelStartTimeCharModelEndTime = (modelStartTimeChar) + (modelEndTime);
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (model != null) {
                    // read model.fname
                    modelFname = model.getFname();
                    // read model.lname
                    modelLname = model.getLname();
                }


                // read (model.fname) + (' ')
                modelFnameChar = (modelFname) + (' ');


                // read ((model.fname) + (' ')) + (model.lname)
                modelFnameCharModelLname = (modelFnameChar) + (modelLname);
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (model != null) {
                    // read model.roomName
                    modelRoomName = model.getRoomName();
                }
        }

        if ((dirtyFlags & 0x9L) != 0) {

                // read model.type.equals(@android:string/user) ? ((model.fname) + (' ')) + (model.lname) : model.roomName
                modelTypeEqualsTxHeaderAndroidStringUserModelFnameCharModelLnameModelRoomName = ((modelTypeEqualsTxHeaderAndroidStringUser) ? (modelFnameCharModelLname) : (modelRoomName));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.imgCancelItem.setOnClickListener(mCallback57);
            this.recentSearchLt.setOnClickListener(mCallback56);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.sdei.chafte.utils.AppBindingKt.setUserProfImage(this.imgSliderPic, modelImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txHeader, modelTypeEqualsTxHeaderAndroidStringUserModelFnameCharModelLnameModelRoomName);
            this.txdate.setVisibility(modelTypeEqualsTxdateAndroidStringUserViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txdate, modelStartTimeCharModelEndTime);
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




                    callback.onItemClick(imgCancelItem, position);
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




                    callback.onItemClick(recentSearchLt, position);
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
        flag 4 (0x5L): model.type.equals(@android:string/user) ? ((model.fname) + (' ')) + (model.lname) : model.roomName
        flag 5 (0x6L): model.type.equals(@android:string/user) ? ((model.fname) + (' ')) + (model.lname) : model.roomName
        flag 6 (0x7L): model.type.equals(@android:string/user) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): model.type.equals(@android:string/user) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}