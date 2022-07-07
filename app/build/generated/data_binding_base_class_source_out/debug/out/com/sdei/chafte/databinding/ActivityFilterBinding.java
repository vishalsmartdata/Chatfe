// Generated by data binding compiler. Do not edit!
package com.sdei.chafte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.sdei.chafte.R;
import com.sdei.chafte.ui.home.filter.FilterVm;
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerBindingList;
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityFilterBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox chCalendar;

  @NonNull
  public final ConstraintLayout clLayer;

  @NonNull
  public final EditText edRoomName;

  @NonNull
  public final GridLayout glLeft;

  @NonNull
  public final GridLayout glright;

  @NonNull
  public final ImageView imgCancel;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RecyclerView recyclerViewSort;

  @NonNull
  public final RecyclerView recyclerViewTime;

  @NonNull
  public final TextView txCategory;

  @NonNull
  public final TextView txDate;

  @NonNull
  public final TextView txDateSelected;

  @NonNull
  public final TextView txFilter;

  @NonNull
  public final TextView txRoomName;

  @NonNull
  public final TextView txSortBy;

  @NonNull
  public final TextView txSubmit;

  @NonNull
  public final TextView txTime;

  @Bindable
  protected FilterVm mFaVM;

  @Bindable
  protected RecyclerBindingList mList;

  @Bindable
  protected RecyclerBindingList mTimelist;

  @Bindable
  protected RecyclerBindingList mSortlist;

  @Bindable
  protected RecyclerCallback mClick;

  protected ActivityFilterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckBox chCalendar, ConstraintLayout clLayer, EditText edRoomName, GridLayout glLeft,
      GridLayout glright, ImageView imgCancel, RecyclerView recyclerView,
      RecyclerView recyclerViewSort, RecyclerView recyclerViewTime, TextView txCategory,
      TextView txDate, TextView txDateSelected, TextView txFilter, TextView txRoomName,
      TextView txSortBy, TextView txSubmit, TextView txTime) {
    super(_bindingComponent, _root, _localFieldCount);
    this.chCalendar = chCalendar;
    this.clLayer = clLayer;
    this.edRoomName = edRoomName;
    this.glLeft = glLeft;
    this.glright = glright;
    this.imgCancel = imgCancel;
    this.recyclerView = recyclerView;
    this.recyclerViewSort = recyclerViewSort;
    this.recyclerViewTime = recyclerViewTime;
    this.txCategory = txCategory;
    this.txDate = txDate;
    this.txDateSelected = txDateSelected;
    this.txFilter = txFilter;
    this.txRoomName = txRoomName;
    this.txSortBy = txSortBy;
    this.txSubmit = txSubmit;
    this.txTime = txTime;
  }

  public abstract void setFaVM(@Nullable FilterVm faVM);

  @Nullable
  public FilterVm getFaVM() {
    return mFaVM;
  }

  public abstract void setList(@Nullable RecyclerBindingList list);

  @Nullable
  public RecyclerBindingList getList() {
    return mList;
  }

  public abstract void setTimelist(@Nullable RecyclerBindingList timelist);

  @Nullable
  public RecyclerBindingList getTimelist() {
    return mTimelist;
  }

  public abstract void setSortlist(@Nullable RecyclerBindingList sortlist);

  @Nullable
  public RecyclerBindingList getSortlist() {
    return mSortlist;
  }

  public abstract void setClick(@Nullable RecyclerCallback click);

  @Nullable
  public RecyclerCallback getClick() {
    return mClick;
  }

  @NonNull
  public static ActivityFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_filter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityFilterBinding>inflateInternal(inflater, R.layout.activity_filter, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_filter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityFilterBinding>inflateInternal(inflater, R.layout.activity_filter, null, false, component);
  }

  public static ActivityFilterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityFilterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityFilterBinding)bind(component, view, R.layout.activity_filter);
  }
}