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
import com.sdei.chafte.ui.authentication.registration.RegistrationVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentRegistrationFirstpageBinding extends ViewDataBinding {
  @NonNull
  public final EditText edFirstName;

  @NonNull
  public final EditText edLastName;

  @NonNull
  public final EditText edPhoneNumber;

  @NonNull
  public final EditText edemail;

  @NonNull
  public final GridLayout glLeft;

  @NonNull
  public final GridLayout glright;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final ConstraintLayout parent;

  @NonNull
  public final TextView txContinue;

  @NonNull
  public final TextView txCreateAccount;

  @NonNull
  public final TextView txEmail;

  @NonNull
  public final TextView txFirstName;

  @NonNull
  public final TextView txLastName;

  @NonNull
  public final TextView txPhoneNumber;

  @NonNull
  public final TextView txtext;

  @Bindable
  protected RegistrationVM mVm;

  protected FragmentRegistrationFirstpageBinding(Object _bindingComponent, View _root,
      int _localFieldCount, EditText edFirstName, EditText edLastName, EditText edPhoneNumber,
      EditText edemail, GridLayout glLeft, GridLayout glright, ImageView imageBack,
      ConstraintLayout parent, TextView txContinue, TextView txCreateAccount, TextView txEmail,
      TextView txFirstName, TextView txLastName, TextView txPhoneNumber, TextView txtext) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edFirstName = edFirstName;
    this.edLastName = edLastName;
    this.edPhoneNumber = edPhoneNumber;
    this.edemail = edemail;
    this.glLeft = glLeft;
    this.glright = glright;
    this.imageBack = imageBack;
    this.parent = parent;
    this.txContinue = txContinue;
    this.txCreateAccount = txCreateAccount;
    this.txEmail = txEmail;
    this.txFirstName = txFirstName;
    this.txLastName = txLastName;
    this.txPhoneNumber = txPhoneNumber;
    this.txtext = txtext;
  }

  public abstract void setVm(@Nullable RegistrationVM vm);

  @Nullable
  public RegistrationVM getVm() {
    return mVm;
  }

  @NonNull
  public static FragmentRegistrationFirstpageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_registration_firstpage, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegistrationFirstpageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentRegistrationFirstpageBinding>inflateInternal(inflater, R.layout.fragment_registration_firstpage, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegistrationFirstpageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_registration_firstpage, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentRegistrationFirstpageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentRegistrationFirstpageBinding>inflateInternal(inflater, R.layout.fragment_registration_firstpage, null, false, component);
  }

  public static FragmentRegistrationFirstpageBinding bind(@NonNull View view) {
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
  public static FragmentRegistrationFirstpageBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentRegistrationFirstpageBinding)bind(component, view, R.layout.fragment_registration_firstpage);
  }
}
