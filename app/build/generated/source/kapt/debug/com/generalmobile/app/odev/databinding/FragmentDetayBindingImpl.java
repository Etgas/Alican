package com.generalmobile.app.odev.databinding;
import com.generalmobile.app.odev.R;
import com.generalmobile.app.odev.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetayBindingImpl extends FragmentDetayBinding  {

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

    public FragmentDetayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentDetayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.detayFragment.setTag(null);
        this.imgDetay.setTag(null);
        this.tvDetayAge.setTag(null);
        this.tvDetayTeam.setTag(null);
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
            setViewModel((com.generalmobile.app.odev.ui.main.detay.DetayFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.generalmobile.app.odev.ui.main.detay.DetayFragmentViewModel ViewModel) {
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
                return onChangeViewModelListe((androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItemDetay>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelListe(androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItemDetay> ViewModelListe, int fieldId) {
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
        java.lang.String viewModelListeImage = null;
        java.lang.String viewModelListeAgeString = null;
        com.generalmobile.app.odev.service.ItemsItemDetay viewModelListeGet = null;
        androidx.databinding.ObservableField<com.generalmobile.app.odev.service.ItemsItemDetay> viewModelListe = null;
        com.generalmobile.app.odev.ui.main.detay.DetayFragmentViewModel viewModel = mViewModel;
        java.lang.String viewModelListeTeam = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.liste
                    viewModelListe = viewModel.getListe();
                }
                updateRegistration(0, viewModelListe);


                if (viewModelListe != null) {
                    // read viewModel.liste.get()
                    viewModelListeGet = viewModelListe.get();
                }


                if (viewModelListeGet != null) {
                    // read viewModel.liste.get().image
                    viewModelListeImage = viewModelListeGet.getImage();
                    // read viewModel.liste.get().ageString()
                    viewModelListeAgeString = viewModelListeGet.ageString();
                    // read viewModel.liste.get().team
                    viewModelListeTeam = viewModelListeGet.getTeam();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.generalmobile.app.odev.core.BindingAdapter.loadImage(this.imgDetay, viewModelListeImage);
            com.generalmobile.app.odev.core.BindingAdapter.loadAge(this.tvDetayAge, viewModelListeAgeString);
            com.generalmobile.app.odev.core.BindingAdapter.loadText(this.tvDetayTeam, viewModelListeTeam);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.liste
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}