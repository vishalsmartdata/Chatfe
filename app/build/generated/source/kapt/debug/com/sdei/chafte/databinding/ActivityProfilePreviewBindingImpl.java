package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProfilePreviewBindingImpl extends ActivityProfilePreviewBinding  {

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
        sViewsWithIds.put(R.id.txEditSave, 4);
        sViewsWithIds.put(R.id.imProfile, 5);
        sViewsWithIds.put(R.id.txHeader, 6);
        sViewsWithIds.put(R.id.txGender, 7);
        sViewsWithIds.put(R.id.txHometown, 8);
        sViewsWithIds.put(R.id.txAge, 9);
        sViewsWithIds.put(R.id.txADDFriend, 10);
        sViewsWithIds.put(R.id.viewFirst, 11);
        sViewsWithIds.put(R.id.txMatchMore, 12);
        sViewsWithIds.put(R.id.viewSecond, 13);
        sViewsWithIds.put(R.id.txMatchLess, 14);
        sViewsWithIds.put(R.id.viewThird, 15);
        sViewsWithIds.put(R.id.txMatchNever, 16);
        sViewsWithIds.put(R.id.viewFouth, 17);
        sViewsWithIds.put(R.id.txVoteToKick, 18);
        sViewsWithIds.put(R.id.viewFifth, 19);
        sViewsWithIds.put(R.id.glLeft, 20);
        sViewsWithIds.put(R.id.glright, 21);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProfilePreviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ActivityProfilePreviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.GridLayout) bindings[20]
            , (android.widget.GridLayout) bindings[21]
            , (com.sdei.chafte.utils.custom.CircleImageView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.EditText) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (android.view.View) bindings[19]
            , (android.view.View) bindings[11]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[13]
            , (android.view.View) bindings[15]
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
        if (BR.ppVM == variableId) {
            setPpVM((com.sdei.chafte.ui.home.message.profile_preview.ProfilePreviewVM) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPpVM(@Nullable com.sdei.chafte.ui.home.message.profile_preview.ProfilePreviewVM PpVM) {
        this.mPpVM = PpVM;
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
        flag 0 (0x1L): ppVM
        flag 1 (0x2L): click
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}