package com.sdei.chafte.utils.base;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import java.lang.Override;

public class BaseApplication_LifecycleAdapter implements GeneratedAdapter {
  final BaseApplication mReceiver;

  BaseApplication_LifecycleAdapter(BaseApplication receiver) {
    this.mReceiver = receiver;
  }

  @Override
  public void callMethods(LifecycleOwner owner, Lifecycle.Event event, boolean onAny,
      MethodCallsLogger logger) {
    boolean hasLogger = logger != null;
    if (onAny) {
      return;
    }
    if (event == Lifecycle.Event.ON_START) {
      if (!hasLogger || logger.approveCall("onEnterForeground", 1)) {
        mReceiver.onEnterForeground();
      }
      return;
    }
    if (event == Lifecycle.Event.ON_STOP) {
      if (!hasLogger || logger.approveCall("onEnterBackground", 1)) {
        mReceiver.onEnterBackground();
      }
      return;
    }
  }
}
