// Generated by view binder compiler. Do not edit!
package com.giuliana.evaluacioncontinuatres.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.giuliana.evaluacioncontinuatres.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentRickiMortiDetailBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  private FragmentRickiMortiDetailBinding(@NonNull FrameLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRickiMortiDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRickiMortiDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ricki_morti_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRickiMortiDetailBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new FragmentRickiMortiDetailBinding((FrameLayout) rootView);
  }
}
