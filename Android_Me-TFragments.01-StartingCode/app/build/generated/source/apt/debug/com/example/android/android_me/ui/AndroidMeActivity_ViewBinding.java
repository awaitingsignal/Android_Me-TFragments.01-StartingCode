// Generated code from Butter Knife. Do not modify!
package com.example.android.android_me.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.android.android_me.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AndroidMeActivity_ViewBinding implements Unbinder {
  private AndroidMeActivity target;

  private View view7f070043;

  private View view7f070022;

  private View view7f07004e;

  @UiThread
  public AndroidMeActivity_ViewBinding(AndroidMeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AndroidMeActivity_ViewBinding(final AndroidMeActivity target, View source) {
    this.target = target;

    View view;
    view = source.findViewById(R.id.head_container);
    if (view != null) {
      view7f070043 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.toastClick(Utils.castParam(p0, "doClick", 0, "toastClick", 0, FrameLayout.class));
        }
      });
    }
    view = source.findViewById(R.id.body_container);
    if (view != null) {
      view7f070022 = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.toastClick(Utils.castParam(p0, "doClick", 0, "toastClick", 0, FrameLayout.class));
        }
      });
    }
    view = source.findViewById(R.id.leg_container);
    if (view != null) {
      view7f07004e = view;
      view.setOnClickListener(new DebouncingOnClickListener() {
        @Override
        public void doClick(View p0) {
          target.toastClick(Utils.castParam(p0, "doClick", 0, "toastClick", 0, FrameLayout.class));
        }
      });
    }
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    if (view7f070043 != null) {
      view7f070043.setOnClickListener(null);
      view7f070043 = null;
    }
    if (view7f070022 != null) {
      view7f070022.setOnClickListener(null);
      view7f070022 = null;
    }
    if (view7f07004e != null) {
      view7f07004e.setOnClickListener(null);
      view7f07004e = null;
    }
  }
}
