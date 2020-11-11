package com.netease.nim.demo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;

public abstract class ActivityPublicConfigBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final Button btnOk;

  @NonNull
  public final RadioButton rbAsymmetricRsa;

  @NonNull
  public final RadioButton rbAsymmetricRsaOaep1;

  @NonNull
  public final RadioButton rbAsymmetricRsaOaep256;

  @NonNull
  public final RadioButton rbAsymmetricSm2;

  @NonNull
  public final RadioButton rbHandShakeType1;

  @NonNull
  public final RadioButton rbHandShakeType5;

  @NonNull
  public final RadioButton rbIpv4;

  @NonNull
  public final RadioButton rbIpv6;

  @NonNull
  public final RadioButton rbIpvAuto;

  @NonNull
  public final RadioButton rbSymmetryAes;

  @NonNull
  public final RadioButton rbSymmetryRc4;

  @NonNull
  public final RadioButton rbSymmetrySm4;

  @NonNull
  public final RadioGroup rgAsymmetric;

  @NonNull
  public final RadioGroup rgHandShake;

  @NonNull
  public final RadioGroup rgIpv;

  @NonNull
  public final RadioGroup rgSymmetry;

  @NonNull
  public final TableLayout tlSetting;

  @NonNull
  public final Toolbar toolbar;

  protected ActivityPublicConfigBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appBarLayout, Button btnOk, RadioButton rbAsymmetricRsa,
      RadioButton rbAsymmetricRsaOaep1, RadioButton rbAsymmetricRsaOaep256,
      RadioButton rbAsymmetricSm2, RadioButton rbHandShakeType1, RadioButton rbHandShakeType5,
      RadioButton rbIpv4, RadioButton rbIpv6, RadioButton rbIpvAuto, RadioButton rbSymmetryAes,
      RadioButton rbSymmetryRc4, RadioButton rbSymmetrySm4, RadioGroup rgAsymmetric,
      RadioGroup rgHandShake, RadioGroup rgIpv, RadioGroup rgSymmetry, TableLayout tlSetting,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarLayout = appBarLayout;
    this.btnOk = btnOk;
    this.rbAsymmetricRsa = rbAsymmetricRsa;
    this.rbAsymmetricRsaOaep1 = rbAsymmetricRsaOaep1;
    this.rbAsymmetricRsaOaep256 = rbAsymmetricRsaOaep256;
    this.rbAsymmetricSm2 = rbAsymmetricSm2;
    this.rbHandShakeType1 = rbHandShakeType1;
    this.rbHandShakeType5 = rbHandShakeType5;
    this.rbIpv4 = rbIpv4;
    this.rbIpv6 = rbIpv6;
    this.rbIpvAuto = rbIpvAuto;
    this.rbSymmetryAes = rbSymmetryAes;
    this.rbSymmetryRc4 = rbSymmetryRc4;
    this.rbSymmetrySm4 = rbSymmetrySm4;
    this.rgAsymmetric = rgAsymmetric;
    this.rgHandShake = rgHandShake;
    this.rgIpv = rgIpv;
    this.rgSymmetry = rgSymmetry;
    this.tlSetting = tlSetting;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivityPublicConfigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityPublicConfigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityPublicConfigBinding>inflate(inflater, com.netease.nim.demo.R.layout.activity_public_config, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPublicConfigBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityPublicConfigBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityPublicConfigBinding>inflate(inflater, com.netease.nim.demo.R.layout.activity_public_config, null, false, component);
  }

  public static ActivityPublicConfigBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityPublicConfigBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityPublicConfigBinding)bind(component, view, com.netease.nim.demo.R.layout.activity_public_config);
  }
}
