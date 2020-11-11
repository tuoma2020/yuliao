package com.netease.nim.uikit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class NimMessageActivityReplyLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgCancelReply;

  @NonNull
  public final TextView tvReplyInfo;

  protected NimMessageActivityReplyLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView imgCancelReply, TextView tvReplyInfo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgCancelReply = imgCancelReply;
    this.tvReplyInfo = tvReplyInfo;
  }

  @NonNull
  public static NimMessageActivityReplyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static NimMessageActivityReplyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<NimMessageActivityReplyLayoutBinding>inflate(inflater, com.netease.nim.uikit.R.layout.nim_message_activity_reply_layout, root, attachToRoot, component);
  }

  @NonNull
  public static NimMessageActivityReplyLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static NimMessageActivityReplyLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<NimMessageActivityReplyLayoutBinding>inflate(inflater, com.netease.nim.uikit.R.layout.nim_message_activity_reply_layout, null, false, component);
  }

  public static NimMessageActivityReplyLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static NimMessageActivityReplyLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (NimMessageActivityReplyLayoutBinding)bind(component, view, com.netease.nim.uikit.R.layout.nim_message_activity_reply_layout);
  }
}
