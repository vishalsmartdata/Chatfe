package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccountVisibilityBindingImpl extends FragmentAccountVisibilityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgCancel, 1);
        sViewsWithIds.put(R.id.txSetting, 2);
        sViewsWithIds.put(R.id.txProfilePicture, 3);
        sViewsWithIds.put(R.id.rgAccountVisibility, 4);
        sViewsWithIds.put(R.id.rbAll, 5);
        sViewsWithIds.put(R.id.rbFriend, 6);
        sViewsWithIds.put(R.id.firstView, 7);
        sViewsWithIds.put(R.id.txInterestDate, 8);
        sViewsWithIds.put(R.id.rgInterestindDate, 9);
        sViewsWithIds.put(R.id.rbInterestAll, 10);
        sViewsWithIds.put(R.id.rbInterestFriend, 11);
        sViewsWithIds.put(R.id.SecondView, 12);
        sViewsWithIds.put(R.id.txIdentify, 13);
        sViewsWithIds.put(R.id.rgIndentify, 14);
        sViewsWithIds.put(R.id.rbIndentifyAll, 15);
        sViewsWithIds.put(R.id.rbIndentifyFriend, 16);
        sViewsWithIds.put(R.id.ThirdView, 17);
        sViewsWithIds.put(R.id.txReligiousBelief, 18);
        sViewsWithIds.put(R.id.rgReligiousBelief, 19);
        sViewsWithIds.put(R.id.rbReligiousBeliefAll, 20);
        sViewsWithIds.put(R.id.rbReligiousBeliefFriend, 21);
        sViewsWithIds.put(R.id.FouthView, 22);
        sViewsWithIds.put(R.id.txHomeTown, 23);
        sViewsWithIds.put(R.id.rgHomeTown, 24);
        sViewsWithIds.put(R.id.rbHomeTownAll, 25);
        sViewsWithIds.put(R.id.rbHomeTownFriend, 26);
        sViewsWithIds.put(R.id.FifthView, 27);
        sViewsWithIds.put(R.id.txAge, 28);
        sViewsWithIds.put(R.id.rgAge, 29);
        sViewsWithIds.put(R.id.rbAgeAll, 30);
        sViewsWithIds.put(R.id.rbAgeFriend, 31);
        sViewsWithIds.put(R.id.SixthView, 32);
        sViewsWithIds.put(R.id.txSubmit, 33);
        sViewsWithIds.put(R.id.glLeft, 34);
        sViewsWithIds.put(R.id.glright, 35);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccountVisibilityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentAccountVisibilityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[27]
            , (android.view.View) bindings[22]
            , (android.view.View) bindings[12]
            , (android.view.View) bindings[32]
            , (android.view.View) bindings[17]
            , (android.view.View) bindings[7]
            , (android.widget.GridLayout) bindings[34]
            , (android.widget.GridLayout) bindings[35]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RadioButton) bindings[30]
            , (android.widget.RadioButton) bindings[31]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.RadioButton) bindings[25]
            , (android.widget.RadioButton) bindings[26]
            , (android.widget.RadioButton) bindings[15]
            , (android.widget.RadioButton) bindings[16]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioButton) bindings[20]
            , (android.widget.RadioButton) bindings[21]
            , (android.widget.RadioGroup) bindings[4]
            , (android.widget.RadioGroup) bindings[29]
            , (android.widget.RadioGroup) bindings[24]
            , (android.widget.RadioGroup) bindings[14]
            , (android.widget.RadioGroup) bindings[9]
            , (android.widget.RadioGroup) bindings[19]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[33]
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
                mDirtyFlags = 0x2L;
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
        if (BR.avVM == variableId) {
            setAvVM((com.sdei.chafte.ui.home.setting.SettingVm) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAvVM(@Nullable com.sdei.chafte.ui.home.setting.SettingVm AvVM) {
        this.mAvVM = AvVM;
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
        flag 0 (0x1L): avVM
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}