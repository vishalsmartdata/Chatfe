// Generated by data binding compiler. Do not edit!
package com.sdei.chafte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.sdei.chafte.R;
import com.sdei.chafte.ui.authentication.forgot_password.ForgotPasswordVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentChangePasswordBinding extends ViewDataBinding {
  @NonNull
  public final EditText edConfirmPassword;

  @NonNull
  public final EditText edNewPassword;

  @NonNull
  public final GridLayout glLeft;

  @NonNull
  public final GridLayout glright;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final ConstraintLayout parent;

  @NonNull
  public final TextView txBirth;

  @NonNull
  public final TextView txConfirmPassword;

  @NonNull
  public final TextView txContinue;

  @NonNull
  public final TextView txWhenYourBirth;

  @Bindable
  protected ForgotPasswordVM mVm;

  @Bindable
  protected String mA;

  @Bindable
  protected String mB;

  @Bindable
  protected String mC;

  protected FragmentChangePasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, EditText edConfirmPassword, EditText edNewPassword, GridLayout glLeft,
      GridLayout glright, ImageView imageBack, ConstraintLayout parent, TextView txBirth,
      TextView txConfirmPassword, TextView txContinue, TextView txWhenYourBirth) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edConfirmPassword = edConfirmPassword;
    this.edNewPassword = edNewPassword;
    this.glLeft = glLeft;
    this.glright = glright;
    this.imageBack = imageBack;
    this.parent = parent;
    this.txBirth = txBirth;
    this.txConfirmPassword = txConfirmPassword;
    this.txContinue = txContinue;
    this.txWhenYourBirth = txWhenYourBirth;
  }

  public abstract void setVm(@Nullable ForgotPasswordVM vm);

  @Nullable
  public ForgotPasswordVM getVm() {
    return mVm;
  }

  public abstract void setA(@Nullable String a);

  @Nullable
  public String getA() {
    return mA;
  }

  public abstract void setB(@Nullable String b);

  @Nullable
  public String getB() {
    return mB;
  }

  public abstract void setC(@Nullable String c);

  @Nullable
  public String getC() {
    return mC;
  }

  @NonNull
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentChangePasswordBinding>inflateInternal(inflater, R.layout.fragment_change_password, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_change_password, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentChangePasswordBinding>inflateInternal(inflater, R.layout.fragment_change_password, null, false, component);
  }

  public static FragmentChangePasswordBinding bind(@NonNull View view) {
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
  public static FragmentChangePasswordBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentChangePasswordBinding)bind(component, view, R.layout.fragment_change_password);
  }
}
