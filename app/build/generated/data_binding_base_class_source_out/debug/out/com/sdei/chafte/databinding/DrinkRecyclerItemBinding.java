// Generated by data binding compiler. Do not edit!
package com.sdei.chafte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sdei.chafte.R;
import com.sdei.chafte.model.DrinkModel;
import com.sdei.chafte.ui.authentication.registration.RegistrationVM;
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DrinkRecyclerItemBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clParent;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView txdrinkName;

  @Bindable
  protected RegistrationVM mVm;

  @Bindable
  protected Integer mPosition;

  @Bindable
  protected DrinkModel mModel;

  @Bindable
  protected RecyclerCallback mCallback;

  protected DrinkRecyclerItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clParent, ImageView image, TextView txdrinkName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clParent = clParent;
    this.image = image;
    this.txdrinkName = txdrinkName;
  }

  public abstract void setVm(@Nullable RegistrationVM vm);

  @Nullable
  public RegistrationVM getVm() {
    return mVm;
  }

  public abstract void setPosition(@Nullable Integer position);

  @Nullable
  public Integer getPosition() {
    return mPosition;
  }

  public abstract void setModel(@Nullable DrinkModel model);

  @Nullable
  public DrinkModel getModel() {
    return mModel;
  }

  public abstract void setCallback(@Nullable RecyclerCallback callback);

  @Nullable
  public RecyclerCallback getCallback() {
    return mCallback;
  }

  @NonNull
  public static DrinkRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.drink_recycler_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DrinkRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DrinkRecyclerItemBinding>inflateInternal(inflater, R.layout.drink_recycler_item, root, attachToRoot, component);
  }

  @NonNull
  public static DrinkRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.drink_recycler_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DrinkRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DrinkRecyclerItemBinding>inflateInternal(inflater, R.layout.drink_recycler_item, null, false, component);
  }

  public static DrinkRecyclerItemBinding bind(@NonNull View view) {
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
  public static DrinkRecyclerItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (DrinkRecyclerItemBinding)bind(component, view, R.layout.drink_recycler_item);
  }
}
