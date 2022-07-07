package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProfileDrinkLayoutBindingImpl extends ProfileDrinkLayoutBinding implements com.sdei.chafte.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback58;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProfileDrinkLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ProfileDrinkLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.clParent.setTag(null);
        this.image.setTag(null);
        this.txdrinkName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback58 = new com.sdei.chafte.generated.callback.OnClickListener(this, 1);
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
        if (BR.model == variableId) {
            setModel((com.sdei.chafte.model.DrinkModel) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.sdei.chafte.ui.authentication.registration.RegistrationVM) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.sdei.chafte.model.DrinkModel Model) {
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
    public void setVm(@Nullable com.sdei.chafte.ui.authentication.registration.RegistrationVM Vm) {
        this.mVm = Vm;
    }
    public void setCallback(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
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
        com.sdei.chafte.model.DrinkModel model = mModel;
        java.lang.Integer position = mPosition;
        java.lang.String modelImage = null;
        android.graphics.drawable.Drawable modelSelectedClParentAndroidDrawableTransparentBgClParentAndroidDrawableWhiteBorderBg = null;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback callback = mCallback;
        java.lang.String modelDrinkName = null;
        boolean modelSelected = false;

        if ((dirtyFlags & 0x11L) != 0) {



                if (model != null) {
                    // read model.image
                    modelImage = model.getImage();
                    // read model.drinkName
                    modelDrinkName = model.getDrinkName();
                    // read model.selected
                    modelSelected = model.isSelected();
                }
            if((dirtyFlags & 0x11L) != 0) {
                if(modelSelected) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read model.selected ? @android:drawable/transparent_bg : @android:drawable/white_border_bg
                modelSelectedClParentAndroidDrawableTransparentBgClParentAndroidDrawableWhiteBorderBg = ((modelSelected) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(clParent.getContext(), R.drawable.transparent_bg)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(clParent.getContext(), R.drawable.white_border_bg)));
        }
        // batch finished
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.clParent, modelSelectedClParentAndroidDrawableTransparentBgClParentAndroidDrawableWhiteBorderBg);
            com.sdei.chafte.utils.AppBindingKt.setUserProfImage(this.image, modelImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txdrinkName, modelDrinkName);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.clParent.setOnClickListener(mCallback58);
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




            callback.onItemClick(clParent, position);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): position
        flag 2 (0x3L): vm
        flag 3 (0x4L): callback
        flag 4 (0x5L): null
        flag 5 (0x6L): model.selected ? @android:drawable/transparent_bg : @android:drawable/white_border_bg
        flag 6 (0x7L): model.selected ? @android:drawable/transparent_bg : @android:drawable/white_border_bg
    flag mapping end*/
    //end
}