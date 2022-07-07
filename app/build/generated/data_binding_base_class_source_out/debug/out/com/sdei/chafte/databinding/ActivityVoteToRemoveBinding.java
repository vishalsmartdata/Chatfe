// Generated by data binding compiler. Do not edit!
package com.sdei.chafte.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.sdei.chafte.R;
import com.sdei.chafte.ui.home.message.MessageVM;
import com.sdei.chafte.utils.common.recyclerviewbase.RecyclerCallback;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityVoteToRemoveBinding extends ViewDataBinding {
  @NonNull
  public final View SecondView;

  @NonNull
  public final View firstView;

  @NonNull
  public final GridLayout glLeft;

  @NonNull
  public final GridLayout glright;

  @NonNull
  public final ImageView imageBack;

  @NonNull
  public final RadioButton rbHarassingNo;

  @NonNull
  public final RadioButton rbHarassingYes;

  @NonNull
  public final RadioButton rbRacistNo;

  @NonNull
  public final RadioButton rbRacistYes;

  @NonNull
  public final RadioGroup rgUserHarassing;

  @NonNull
  public final RadioGroup rgUserRacist;

  @NonNull
  public final TextView title;

  @NonNull
  public final ConstraintLayout topLayer;

  @NonNull
  public final TextView txCancel;

  @NonNull
  public final TextView txContinue;

  @NonNull
  public final TextView txUserExhibit;

  @NonNull
  public final TextView txUserHarassing;

  @Bindable
  protected MessageVM mVRVM;

  @Bindable
  protected RecyclerCallback mClick;

  protected ActivityVoteToRemoveBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View SecondView, View firstView, GridLayout glLeft, GridLayout glright, ImageView imageBack,
      RadioButton rbHarassingNo, RadioButton rbHarassingYes, RadioButton rbRacistNo,
      RadioButton rbRacistYes, RadioGroup rgUserHarassing, RadioGroup rgUserRacist, TextView title,
      ConstraintLayout topLayer, TextView txCancel, TextView txContinue, TextView txUserExhibit,
      TextView txUserHarassing) {
    super(_bindingComponent, _root, _localFieldCount);
    this.SecondView = SecondView;
    this.firstView = firstView;
    this.glLeft = glLeft;
    this.glright = glright;
    this.imageBack = imageBack;
    this.rbHarassingNo = rbHarassingNo;
    this.rbHarassingYes = rbHarassingYes;
    this.rbRacistNo = rbRacistNo;
    this.rbRacistYes = rbRacistYes;
    this.rgUserHarassing = rgUserHarassing;
    this.rgUserRacist = rgUserRacist;
    this.title = title;
    this.topLayer = topLayer;
    this.txCancel = txCancel;
    this.txContinue = txContinue;
    this.txUserExhibit = txUserExhibit;
    this.txUserHarassing = txUserHarassing;
  }

  public abstract void setVRVM(@Nullable MessageVM VRVM);

  @Nullable
  public MessageVM getVRVM() {
    return mVRVM;
  }

  public abstract void setClick(@Nullable RecyclerCallback click);

  @Nullable
  public RecyclerCallback getClick() {
    return mClick;
  }

  @NonNull
  public static ActivityVoteToRemoveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_vote_to_remove, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityVoteToRemoveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityVoteToRemoveBinding>inflateInternal(inflater, R.layout.activity_vote_to_remove, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityVoteToRemoveBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_vote_to_remove, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityVoteToRemoveBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityVoteToRemoveBinding>inflateInternal(inflater, R.layout.activity_vote_to_remove, null, false, component);
  }

  public static ActivityVoteToRemoveBinding bind(@NonNull View view) {
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
  public static ActivityVoteToRemoveBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityVoteToRemoveBinding)bind(component, view, R.layout.activity_vote_to_remove);
  }
}
