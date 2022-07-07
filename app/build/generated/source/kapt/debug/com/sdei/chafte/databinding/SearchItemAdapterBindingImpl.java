package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SearchItemAdapterBindingImpl extends SearchItemAdapterBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cvCard, 4);
        sViewsWithIds.put(R.id.view1, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SearchItemAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private SearchItemAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.view.View) bindings[5]
            );
        this.imgSliderPic.setTag(null);
        this.searchLt.setTag(null);
        this.txHeader.setTag(null);
        this.txdate.setTag(null);
        setRootTag(root);
        // listeners
        mCallback41 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
            setModel((com.sdei.chafte.model.SearchData) variable);
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

    public void setModel(@Nullable com.sdei.chafte.model.SearchData Model) {
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
        com.sdei.chafte.model.SearchData model = mModel;
        java.lang.Integer position = mPosition;
        java.lang.String modelImage = null;
        java.lang.String modelDate = null;
        float modelDuration = 0f;
        java.lang.String appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate = null;
        java.lang.String modelRoomName = null;
        java.lang.String modelStartTime = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;

        if ((dirtyFlags & 0x9L) != 0) {



                if (model != null) {
                    // read model.image
                    modelImage = model.getImage();
                    // read model.date
                    modelDate = model.getDate();
                    // read model.duration
                    modelDuration = model.getDuration();
                    // read model.roomName
                    modelRoomName = model.getRoomName();
                    // read model.startTime
                    modelStartTime = model.getStartTime();
                }


                // read AppBindingKt.setDateInterval(model.startTime, model.duration, model.date)
                appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate = com.sdei.chafte.utils.AppBindingKt.setDateInterval(modelStartTime, modelDuration, modelDate);
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.sdei.chafte.utils.AppBindingKt.setUserProfImage(this.imgSliderPic, modelImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txHeader, modelRoomName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txdate, appBindingKtSetDateIntervalModelStartTimeModelDurationModelDate);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.searchLt.setOnClickListener(mCallback41);
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




            callback.onItemClick(searchLt, position);
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