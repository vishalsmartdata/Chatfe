package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeSelectedItemAdapterBindingImpl extends HomeSelectedItemAdapterBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cvCard, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback67;
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeSelectedItemAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private HomeSelectedItemAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.clParent.setTag(null);
        this.imgJoin.setTag(null);
        this.imgSliderPic.setTag(null);
        this.txChat.setTag(null);
        this.txHeader.setTag(null);
        this.txTime.setTag(null);
        this.txdate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
        mCallback68 = new com.sdei.chafte.generated.callback.OnClickListener(this, 2);
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
            setModel((com.sdei.chafte.model.RoomData) variable);
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

    public void setModel(@Nullable com.sdei.chafte.model.RoomData Model) {
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
        com.sdei.chafte.model.RoomData model = mModel;
        java.lang.Integer position = mPosition;
        java.lang.String modelImage = null;
        float modelDuration = 0f;
        java.lang.String txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDate = null;
        java.lang.String txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDateChar = null;
        java.lang.String modelRoomClass = null;
        java.lang.String appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate = null;
        java.lang.String modelStartTime = null;
        android.graphics.drawable.Drawable modelHasRoomJoinedImgJoinAndroidDrawableIcAddedInRoomImgJoinAndroidDrawableIcAddInRoom = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
        boolean modelHasRoomJoined = false;
        java.lang.String txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDateCharTxdateAndroidStringClose = null;
        java.lang.String modelDate = null;
        java.lang.String appBindingKtGetDateShowPerClientModelDate = null;
        java.lang.String modelRoomName = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.image
                    modelImage = model.getImage();
                    // read model.duration
                    modelDuration = model.getDuration();
                    // read model.roomClass
                    modelRoomClass = model.getRoomClass();
                    // read model.startTime
                    modelStartTime = model.getStartTime();
                    // read model.hasRoomJoined
                    modelHasRoomJoined = model.getHasRoomJoined();
                    // read model.date
                    modelDate = model.getDate();
                    // read model.roomName
                    modelRoomName = model.getRoomName();
                }
            if((dirtyFlags & 0x9L) != 0) {
                if(modelHasRoomJoined) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read model.hasRoomJoined ? @android:drawable/ic_added_in_room : @android:drawable/ic_add_in_room
                modelHasRoomJoinedImgJoinAndroidDrawableIcAddedInRoomImgJoinAndroidDrawableIcAddInRoom = ((modelHasRoomJoined) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgJoin.getContext(), R.drawable.ic_added_in_room)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(imgJoin.getContext(), R.drawable.ic_add_in_room)));
                // read AppBindingKt.setDateInterval(model.startTime, model.duration, model.date)
                appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate = com.sdei.chafte.utils.AppBindingKt.setDateInterval(modelStartTime, modelDuration, modelDate);
                // read AppBindingKt.getDateShowPerClient(model.date)
                appBindingKtGetDateShowPerClientModelDate = com.sdei.chafte.utils.AppBindingKt.getDateShowPerClient(modelDate);


                // read (@android:string/open) + (AppBindingKt.getDateShowPerClient(model.date))
                txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDate = (txdate.getResources().getString(R.string.open)) + (appBindingKtGetDateShowPerClientModelDate);


                // read ((@android:string/open) + (AppBindingKt.getDateShowPerClient(model.date))) + (' ')
                txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDateChar = (txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDate) + (' ');


                // read (((@android:string/open) + (AppBindingKt.getDateShowPerClient(model.date))) + (' ')) + (@android:string/close)
                txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDateCharTxdateAndroidStringClose = (txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDateChar) + (txdate.getResources().getString(R.string.close));
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.clParent.setOnClickListener(mCallback67);
            this.imgJoin.setOnClickListener(mCallback68);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgJoin, modelHasRoomJoinedImgJoinAndroidDrawableIcAddedInRoomImgJoinAndroidDrawableIcAddInRoom);
            com.sdei.chafte.utils.AppBindingKt.setUserProfImage(this.imgSliderPic, modelImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txChat, modelRoomClass);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txHeader, modelRoomName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txTime, appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txdate, txdateAndroidStringOpenAppBindingKtGetDateShowPerClientModelDateCharTxdateAndroidStringClose);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): position
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
        flag 4 (0x5L): model.hasRoomJoined ? @android:drawable/ic_added_in_room : @android:drawable/ic_add_in_room
        flag 5 (0x6L): model.hasRoomJoined ? @android:drawable/ic_added_in_room : @android:drawable/ic_add_in_room
    flag mapping end*/
    //end
}