// Generated by data binding compiler. Do not edit!
package com.sdei.chafte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.sdei.chafte.R;
import com.sdei.chafte.ui.authentication.registration.RegistrationVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRegistrationBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout completeFragment;

  @NonNull
  public final GridLayout glLeft;

  @NonNull
  public final GridLayout glright;

  @NonNull
  public final TabLayout indicatorRegistration;

  @NonNull
  public final ConstraintLayout parent;

  @NonNull
  public final ViewPager viewpagerRegistration;

  @Bindable
  protected RegistrationVM mVm;

  protected FragmentRegistrationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FrameLayout completeFragment, GridLayout glLeft, GridLayout glright,
      TabLayout indicatorRegistration, ConstraintLayout parent, ViewPager viewpagerRegistration) {
    super(_bindingComponent, _root, _localFieldCount);
    this.completeFragment = completeFragment;
    this.glLeft = glLeft;
    this.glright = glright;
    this.indicatorRegistration = indicatorRegistration;
    this.parent = parent;
    this.viewpagerRegistration = viewpagerRegistration;
  }

  public abstract void setVm(@Nullable RegistrationVM vm);

  @Nullable
  public RegistrationVM getVm() {
    return mVm;
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_registration, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegistrationBinding>inflateInternal(inflater, R.layout.fragment_registration, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_registration, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegistrationBinding>inflateInternal(inflater, R.layout.fragment_registration, null, false, component);
  }

  public static FragmentRegistrationBinding bind(@NonNull View view) {
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
  public static FragmentRegistrationBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentRegistrationBinding)bind(component, view, R.layout.fragment_registration);
  }
}
