// Generated by data binding compiler. Do not edit!
package com.sdei.chafte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sdei.chafte.R;
import com.sdei.chafte.ui.authentication.intro.IntroVm;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentThirdSlideBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  @Bindable
  protected IntroVm mListener;

  protected FragmentThirdSlideBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView image) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
  }

  public abstract void setListener(@Nullable IntroVm listener);

  @Nullable
  public IntroVm getListener() {
    return mListener;
  }

  @NonNull
  public static FragmentThirdSlideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_third_slide, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentThirdSlideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentThirdSlideBinding>inflateInternal(inflater, R.layout.fragment_third_slide, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentThirdSlideBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_third_slide, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentThirdSlideBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentThirdSlideBinding>inflateInternal(inflater, R.layout.fragment_third_slide, null, false, component);
  }

  public static FragmentThirdSlideBinding bind(@NonNull View view) {
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
  public static FragmentThirdSlideBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentThirdSlideBinding)bind(component, view, R.layout.fragment_third_slide);
  }
}
