package com.generalmobile.app.odev.databinding;
import com.generalmobile.app.odev.R;
import com.generalmobile.app.odev.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentItemsListAdapterBindingImpl extends FragmentItemsListAdapterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentItemsListAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentItemsListAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.itemsAdapter.setTag(null);
        this.tvId.setTag(null);
        this.tvName.setTag(null);
        this.tvPoint.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.generalmobile.app.odev.ui.main.adapter.ItemsListAdapterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.generalmobile.app.odev.ui.main.adapter.ItemsListAdapterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelItem((androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelItem(androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItem> ViewModelItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItem> viewModelItem = null;
        java.lang.String viewModelItemPointToString = null;
        com.generalmobile.app.odev.service.ItemsItem viewModelItemGet = null;
        java.lang.Integer viewModelItemPoint = null;
        java.lang.String viewModelItemNameToString = null;
        java.lang.String viewModelItemIdToString = null;
        com.generalmobile.app.odev.ui.main.adapter.ItemsListAdapterViewModel viewModel = mViewModel;
        java.lang.String viewModelItemName = null;
        java.lang.Integer viewModelItemId = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.item
                    viewModelItem = viewModel.getItem();
                }
                updateRegistration(0, viewModelItem);


                if (viewModelItem != null) {
                    // read viewModel.item.get()
                    viewModelItemGet = viewModelItem.get();
                }


                if (viewModelItemGet != null) {
                    // read viewModel.item.get().point
                    viewModelItemPoint = viewModelItemGet.getPoint();
                    // read viewModel.item.get().name
                    viewModelItemName = viewModelItemGet.getName();
                    // read viewModel.item.get().id
                    viewModelItemId = viewModelItemGet.getId();
                }


                if (viewModelItemPoint != null) {
                    // read viewModel.item.get().point.toString()
                    viewModelItemPointToString = viewModelItemPoint.toString();
                }
                if (viewModelItemName != null) {
                    // read viewModel.item.get().name.toString()
                    viewModelItemNameToString = viewModelItemName.toString();
                }
                if (viewModelItemId != null) {
                    // read viewModel.item.get().id.toString()
                    viewModelItemIdToString = viewModelItemId.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvId, viewModelItemIdToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, viewModelItemNameToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPoint, viewModelItemPointToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.item
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}