package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MyEventItemAdapterBindingImpl extends MyEventItemAdapterBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cvCard, 6);
        sViewsWithIds.put(R.id.txChat, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MyEventItemAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private MyEventItemAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.cardview.widget.CardView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.clParent.setTag(null);
        this.imgJoin.setTag(null);
        this.imgSliderPic.setTag(null);
        this.txHeader.setTag(null);
        this.txTime.setTag(null);
        this.txdate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback19 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
        mCallback18 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
            setModel((com.sdei.chafte.model.MyEventData) variable);
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

    public void setModel(@Nullable com.sdei.chafte.model.MyEventData Model) {
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
        com.sdei.chafte.model.MyEventData model = mModel;
        java.lang.String txdateAndroidStringOpenAppBindingKtGetDateShowModelDateChar = null;
        java.lang.Integer position = mPosition;
        java.lang.String modelImage = null;
        java.lang.String txdateAndroidStringOpenAppBindingKtGetDateShowModelDate = null;
        float modelDuration = 0f;
        java.lang.String appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate = null;
        java.lang.String modelStartTime = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
        java.lang.String modelDate = null;
        java.lang.String txdateAndroidStringOpenAppBindingKtGetDateShowModelDateCharTxdateAndroidStringClose = null;
        java.lang.String appBindingKtGetDateShowModelDate = null;
        java.lang.String modelRoomName = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.image
                    modelImage = model.getImage();
                    // read model.duration
                    modelDuration = model.getDuration();
                    // read model.startTime
                    modelStartTime = model.getStartTime();
                    // read model.date
                    modelDate = model.getDate();
                    // read model.roomName
                    modelRoomName = model.getRoomName();
                }


                // read AppBindingKt.setDateInterval(model.startTime, model.duration, model.date)
                appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate = com.sdei.chafte.utils.AppBindingKt.setDateInterval(modelStartTime, modelDuration, modelDate);
                // read AppBindingKt.getDateShow(model.date)
                appBindingKtGetDateShowModelDate = com.sdei.chafte.utils.AppBindingKt.getDateShow(modelDate);


                // read (@android:string/open) + (AppBindingKt.getDateShow(model.date))
                txdateAndroidStringOpenAppBindingKtGetDateShowModelDate = (txdate.getResources().getString(R.string.open)) + (appBindingKtGetDateShowModelDate);


                // read ((@android:string/open) + (AppBindingKt.getDateShow(model.date))) + (' ')
                txdateAndroidStringOpenAppBindingKtGetDateShowModelDateChar = (txdateAndroidStringOpenAppBindingKtGetDateShowModelDate) + (' ');


                // read (((@android:string/open) + (AppBindingKt.getDateShow(model.date))) + (' ')) + (@android:string/close)
                txdateAndroidStringOpenAppBindingKtGetDateShowModelDateCharTxdateAndroidStringClose = (txdateAndroidStringOpenAppBindingKtGetDateShowModelDateChar) + (txdate.getResources().getString(R.string.close));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.clParent.setOnClickListener(mCallback18);
            this.imgJoin.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.sdei.chafte.utils.AppBindingKt.setUserProfImage(this.imgSliderPic, modelImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txHeader, modelRoomName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txTime, appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txdate, txdateAndroidStringOpenAppBindingKtGetDateShowModelDateCharTxdateAndroidStringClose);
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




                    callback.onItemClick(imgJoin, position);
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




                    callback.onItemClick(clParent, position);
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