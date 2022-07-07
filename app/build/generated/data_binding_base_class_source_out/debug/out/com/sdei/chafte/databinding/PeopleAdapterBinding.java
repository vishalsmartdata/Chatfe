// Generated by data binding compiler. Do not edit!
package com.sdei.chafte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sdei.chafte.R;
import com.sdei.chafte.model.PeopleData;
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class PeopleAdapterBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvCard;

  @NonNull
  public final ImageView imgSliderPic;

  @NonNull
  public final ConstraintLayout peopleLt;

  @NonNull
  public final TextView txHeader;

  @NonNull
  public final View view1;

  @Bindable
  protected Integer mPosition;

  @Bindable
  protected PeopleData mModel;

  @Bindable
  protected RecyclerCallback mCallback;

  protected PeopleAdapterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cvCard, ImageView imgSliderPic, ConstraintLayout peopleLt, TextView txHeader,
      View view1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvCard = cvCard;
    this.imgSliderPic = imgSliderPic;
    this.peopleLt = peopleLt;
    this.txHeader = txHeader;
    this.view1 = view1;
  }

  public abstract void setPosition(@Nullable Integer position);

  @Nullable
  public Integer getPosition() {
    return mPosition;
  }

  public abstract void setModel(@Nullable PeopleData model);

  @Nullable
  public PeopleData getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable RecyclerCallback callback);

  @Nullable
  public RecyclerCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static PeopleAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.people_adapter, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static PeopleAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<PeopleAdapterBinding>inflateInternal(inflater, R.layout.people_adapter, root, attachToRoot, component);
  }

  @NonNull
  public static PeopleAdapterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.people_adapter, null, false, component)
   */
  @NonNull
  @Deprecated
  public static PeopleAdapterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<PeopleAdapterBinding>inflateInternal(inflater, R.layout.people_adapter, null, false, component);
  }

  public static PeopleAdapterBinding bind(@NonNull View view) {
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
  public static PeopleAdapterBinding bind(@NonNull View view, @Nullable Object component) {
    return (PeopleAdapterBinding)bind(component, view, R.layout.people_adapter);
  }
}
