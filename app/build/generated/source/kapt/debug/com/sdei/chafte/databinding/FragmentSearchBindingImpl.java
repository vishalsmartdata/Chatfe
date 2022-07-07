package com.sdei.chafte.databinding;
import com.sdei.chafte.R;
import com.sdei.chafte.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txSearch, 5);
        sViewsWithIds.put(R.id.txRecent, 6);
        sViewsWithIds.put(R.id.view1, 7);
        sViewsWithIds.put(R.id.txSearchtext, 8);
        sViewsWithIds.put(R.id.view2, 9);
        sViewsWithIds.put(R.id.glLeft, 10);
        sViewsWithIds.put(R.id.glright, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.GridLayout) bindings[10]
            , (android.widget.GridLayout) bindings[11]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[7]
            , (android.view.View) bindings[9]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerViewItems.setTag(null);
        this.recyclerViewPeople.setTag(null);
        this.recyclerViewSearch.setTag(null);
        this.recyclerViewTop.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.sVM == variableId) {
            setSVM((com.sdei.chafte.ui.home.search.SearchVm) variable);
        }
        else if (BR.list == variableId) {
            setList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.recentList == variableId) {
            setRecentList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.peoplelist == variableId) {
            setPeoplelist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.searchlist == variableId) {
            setSearchlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSVM(@Nullable com.sdei.chafte.ui.home.search.SearchVm SVM) {
        this.mSVM = SVM;
    }
    public void setList(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List) {
        updateRegistration(0, List);
        this.mList = List;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.list);
        super.requestRebind();
    }
    public void setRecentList(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList RecentList) {
        updateRegistration(1, RecentList);
        this.mRecentList = RecentList;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.recentList);
        super.requestRebind();
    }
    public void setPeoplelist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Peoplelist) {
        updateRegistration(2, Peoplelist);
        this.mPeoplelist = Peoplelist;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.peoplelist);
        super.requestRebind();
    }
    public void setSearchlist(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Searchlist) {
        updateRegistration(3, Searchlist);
        this.mSearchlist = Searchlist;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.searchlist);
        super.requestRebind();
    }
    public void setClick(@Nullable com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 1 :
                return onChangeRecentList((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 2 :
                return onChangePeoplelist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
            case 3 :
                return onChangeSearchlist((com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList) object, fieldId);
        }
        return false;
    }
    private boolean onChangeList(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList List, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRecentList(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList RecentList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePeoplelist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Peoplelist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchlist(com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList Searchlist, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
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
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> list = mList;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> recentList = mRecentList;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> peoplelist = mPeoplelist;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList<?> searchlist = mSearchlist;
        com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback click = mClick;

        if ((dirtyFlags & 0x61L) != 0) {
        }
        if ((dirtyFlags & 0x62L) != 0) {
        }
        if ((dirtyFlags & 0x64L) != 0) {
        }
        if ((dirtyFlags & 0x68L) != 0) {
        }
        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x68L) != 0) {
            }
            if ((dirtyFlags & 0x61L) != 0) {
            }
            if ((dirtyFlags & 0x62L) != 0) {
            }
            if ((dirtyFlags & 0x64L) != 0) {
            }
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewItems, recentList, com.sdei.chafte.R.layout.recent_search_layout, click, (java.lang.Object)null, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewPeople, peoplelist, com.sdei.chafte.R.layout.people_adapter, click, (java.lang.Object)null, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewSearch, searchlist, com.sdei.chafte.R.layout.search_item_adapter, click, (java.lang.Object)null, (boolean)false, (boolean)false, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            com.sdei.chafte.utils.common.recyclerviewbase.CustomBindingAdapterKt.setRecyclerLinearAdapter(this.recyclerViewTop, list, com.sdei.chafte.R.layout.time_item_adapter, click, (java.lang.Object)null, (boolean)false, true, (boolean)false, (boolean)false, (int)0, (java.lang.Object)null, (android.content.Context)null, (androidx.recyclerview.widget.LinearLayoutManager)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): list
        flag 1 (0x2L): recentList
        flag 2 (0x3L): peoplelist
        flag 3 (0x4L): searchlist
        flag 4 (0x5L): sVM
        flag 5 (0x6L): click
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}