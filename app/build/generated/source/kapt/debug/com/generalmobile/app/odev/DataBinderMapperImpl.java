package com.generalmobile.app.odev;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.generalmobile.app.odev.databinding.ActivityDashboardActivityBindingImpl;
import com.generalmobile.app.odev.databinding.ActivityMainBindingImpl;
import com.generalmobile.app.odev.databinding.FragmentDetayBindingImpl;
import com.generalmobile.app.odev.databinding.FragmentGecisBindingImpl;
import com.generalmobile.app.odev.databinding.FragmentItemsListAdapterBindingImpl;
import com.generalmobile.app.odev.databinding.FragmentListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDASHBOARDACTIVITY = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_FRAGMENTDETAY = 3;

  private static final int LAYOUT_FRAGMENTGECIS = 4;

  private static final int LAYOUT_FRAGMENTITEMSLISTADAPTER = 5;

  private static final int LAYOUT_FRAGMENTLIST = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.odev.R.layout.activity_dashboard_activity, LAYOUT_ACTIVITYDASHBOARDACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.odev.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.odev.R.layout.fragment_detay, LAYOUT_FRAGMENTDETAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.odev.R.layout.fragment_gecis, LAYOUT_FRAGMENTGECIS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.odev.R.layout.fragment_items_list_adapter, LAYOUT_FRAGMENTITEMSLISTADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.generalmobile.app.odev.R.layout.fragment_list, LAYOUT_FRAGMENTLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDASHBOARDACTIVITY: {
          if ("layout/activity_dashboard_activity_0".equals(tag)) {
            return new ActivityDashboardActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dashboard_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAY: {
          if ("layout/fragment_detay_0".equals(tag)) {
            return new FragmentDetayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detay is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGECIS: {
          if ("layout/fragment_gecis_0".equals(tag)) {
            return new FragmentGecisBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_gecis is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTITEMSLISTADAPTER: {
          if ("layout/fragment_items_list_adapter_0".equals(tag)) {
            return new FragmentItemsListAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_items_list_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLIST: {
          if ("layout/fragment_list_0".equals(tag)) {
            return new FragmentListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_dashboard_activity_0", com.generalmobile.app.odev.R.layout.activity_dashboard_activity);
      sKeys.put("layout/activity_main_0", com.generalmobile.app.odev.R.layout.activity_main);
      sKeys.put("layout/fragment_detay_0", com.generalmobile.app.odev.R.layout.fragment_detay);
      sKeys.put("layout/fragment_gecis_0", com.generalmobile.app.odev.R.layout.fragment_gecis);
      sKeys.put("layout/fragment_items_list_adapter_0", com.generalmobile.app.odev.R.layout.fragment_items_list_adapter);
      sKeys.put("layout/fragment_list_0", com.generalmobile.app.odev.R.layout.fragment_list);
    }
  }
}
