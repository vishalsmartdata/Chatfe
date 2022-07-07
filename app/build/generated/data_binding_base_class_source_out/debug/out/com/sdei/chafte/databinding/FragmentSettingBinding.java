// Generated by data binding compiler. Do not edit!
package com.sdei.chafte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sdei.chafte.R;
import com.sdei.chafte.ui.home.setting.SettingVm;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentSettingBinding extends ViewDataBinding {
  @NonNull
  public final View SecondView;

  @NonNull
  public final View firstView;

  @NonNull
  public final View fourthView;

  @NonNull
  public final GridLayout glLeft;

  @NonNull
  public final GridLayout glright;

  @NonNull
  public final ImageView imgCancel;

  @NonNull
  public final View thirdView;

  @NonNull
  public final TextView txAccountVisibility;

  @NonNull
  public final TextView txActivity;

  @NonNull
  public final TextView txCommunityRules;

  @NonNull
  public final TextView txHelpSupport;

  @NonNull
  public final TextView txMyEvents;

  @NonNull
  public final TextView txPrivacy;

  @NonNull
  public final TextView txSetting;

  @NonNull
  public final TextView txSignOut;

  @Bindable
  protected SettingVm mSVM;

  protected FragmentSettingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View SecondView, View firstView, View fourthView, GridLayout glLeft, GridLayout glright,
      ImageView imgCancel, View thirdView, TextView txAccountVisibility, TextView txActivity,
      TextView txCommunityRules, TextView txHelpSupport, TextView txMyEvents, TextView txPrivacy,
      TextView txSetting, TextView txSignOut) {
    super(_bindingComponent, _root, _localFieldCount);
    this.SecondView = SecondView;
    this.firstView = firstView;
    this.fourthView = fourthView;
    this.glLeft = glLeft;
    this.glright = glright;
    this.imgCancel = imgCancel;
    this.thirdView = thirdView;
    this.txAccountVisibility = txAccountVisibility;
    this.txActivity = txActivity;
    this.txCommunityRules = txCommunityRules;
    this.txHelpSupport = txHelpSupport;
    this.txMyEvents = txMyEvents;
    this.txPrivacy = txPrivacy;
    this.txSetting = txSetting;
    this.txSignOut = txSignOut;
  }

  public abstract void setSVM(@Nullable SettingVm sVM);

  @Nullable
  public SettingVm getSVM() {
    return mSVM;
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingBinding>inflateInternal(inflater, R.layout.fragment_setting, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentSettingBinding>inflateInternal(inflater, R.layout.fragment_setting, null, false, component);
  }

  public static FragmentSettingBinding bind(@NonNull View view) {
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
  public static FragmentSettingBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentSettingBinding)bind(component, view, R.layout.fragment_setting);
  }
}
