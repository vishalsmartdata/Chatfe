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
import com.sdei.chafte.ui.home.edit_profile.AboutEditVM;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAboutEditBinding extends ViewDataBinding {
  @NonNull
  public final EditText edHomeTown;

  @NonNull
  public final EditText edNotListed;

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
  public final TextView txFemale;

  @NonNull
  public final TextView txIntesting;

  @NonNull
  public final TextView txMale;

  @NonNull
  public final TextView txNO;

  @NonNull
  public final TextView txNotListed;

  @NonNull
  public final TextView txOther;

  @NonNull
  public final TextView txPreferNotAnswer;

  @NonNull
  public final TextView txTransgenderFemale;

  @NonNull
  public final TextView txTransgenderMale;

  @NonNull
  public final TextView txVariant;

  @NonNull
  public final TextView txWhereYourHometown;

  @NonNull
  public final TextView txYes;

  @NonNull
  public final TextView txidentifyyourself;

  @Bindable
  protected AboutEditVM mVm;

  protected ActivityAboutEditBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText edHomeTown, EditText edNotListed, GridLayout glLeft, GridLayout glright,
      ImageView imageBack, ConstraintLayout parent, TextView txContinue, TextView txFemale,
      TextView txIntesting, TextView txMale, TextView txNO, TextView txNotListed, TextView txOther,
      TextView txPreferNotAnswer, TextView txTransgenderFemale, TextView txTransgenderMale,
      TextView txVariant, TextView txWhereYourHometown, TextView txYes,
      TextView txidentifyyourself) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edHomeTown = edHomeTown;
    this.edNotListed = edNotListed;
    this.glLeft = glLeft;
    this.glright = glright;
    this.imageBack = imageBack;
    this.parent = parent;
    this.txContinue = txContinue;
    this.txFemale = txFemale;
    this.txIntesting = txIntesting;
    this.txMale = txMale;
    this.txNO = txNO;
    this.txNotListed = txNotListed;
    this.txOther = txOther;
    this.txPreferNotAnswer = txPreferNotAnswer;
    this.txTransgenderFemale = txTransgenderFemale;
    this.txTransgenderMale = txTransgenderMale;
    this.txVariant = txVariant;
    this.txWhereYourHometown = txWhereYourHometown;
    this.txYes = txYes;
    this.txidentifyyourself = txidentifyyourself;
  }

  public abstract void setVm(@Nullable AboutEditVM vm);

  @Nullable
  public AboutEditVM getVm() {
    return mVm;
  }

  @NonNull
  public static ActivityAboutEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_about_edit, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAboutEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAboutEditBinding>inflateInternal(inflater, R.layout.activity_about_edit, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAboutEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_about_edit, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAboutEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAboutEditBinding>inflateInternal(inflater, R.layout.activity_about_edit, null, false, component);
  }

  public static ActivityAboutEditBinding bind(@NonNull View view) {
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
  public static ActivityAboutEditBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAboutEditBinding)bind(component, view, R.layout.activity_about_edit);
  }
}
