package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityVoteToRemoveBindingImpl extends ActivityVoteToRemoveBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.topLayer, 1);
        sViewsWithIds.put(R.id.imageBack, 2);
        sViewsWithIds.put(R.id.title, 3);
        sViewsWithIds.put(R.id.txUserExhibit, 4);
        sViewsWithIds.put(R.id.rgUserRacist, 5);
        sViewsWithIds.put(R.id.rbRacistYes, 6);
        sViewsWithIds.put(R.id.rbRacistNo, 7);
        sViewsWithIds.put(R.id.firstView, 8);
        sViewsWithIds.put(R.id.txUserHarassing, 9);
        sViewsWithIds.put(R.id.rgUserHarassing, 10);
        sViewsWithIds.put(R.id.rbHarassingYes, 11);
        sViewsWithIds.put(R.id.rbHarassingNo, 12);
        sViewsWithIds.put(R.id.SecondView, 13);
        sViewsWithIds.put(R.id.txContinue, 14);
        sViewsWithIds.put(R.id.txCancel, 15);
        sViewsWithIds.put(R.id.glLeft, 16);
        sViewsWithIds.put(R.id.glright, 17);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityVoteToRemoveBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityVoteToRemoveBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[8]
            , (android.widget.GridLayout) bindings[16]
            , (android.widget.GridLayout) bindings[17]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RadioButton) bindings[12]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.RadioGroup) bindings[10]
            , (android.widget.RadioGroup) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.VRVM == variableId) {
            setVRVM((com.sdei.chafte.ui.home.message.MessageVM) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVRVM(@Nullable com.sdei.chafte.ui.home.message.MessageVM VRVM) {
        this.mVRVM = VRVM;
    }
    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): VRVM
        flag 1 (0x2L): click
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}