package com.netease.nim.demo.databinding;
import com.netease.nim.demo.R;
import com.netease.nim.demo.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPublicConfigBindingImpl extends ActivityPublicConfigBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.tl_setting, 3);
        sViewsWithIds.put(R.id.rg_hand_shake, 4);
        sViewsWithIds.put(R.id.rb_hand_shake_type_1, 5);
        sViewsWithIds.put(R.id.rb_hand_shake_type_5, 6);
        sViewsWithIds.put(R.id.rg_asymmetric, 7);
        sViewsWithIds.put(R.id.rb_asymmetric_rsa, 8);
        sViewsWithIds.put(R.id.rb_asymmetric_sm2, 9);
        sViewsWithIds.put(R.id.rb_asymmetric_rsa_oaep_1, 10);
        sViewsWithIds.put(R.id.rb_asymmetric_rsa_oaep_256, 11);
        sViewsWithIds.put(R.id.rg_symmetry, 12);
        sViewsWithIds.put(R.id.rb_symmetry_rc4, 13);
        sViewsWithIds.put(R.id.rb_symmetry_aes, 14);
        sViewsWithIds.put(R.id.rb_symmetry_sm4, 15);
        sViewsWithIds.put(R.id.rg_ipv, 16);
        sViewsWithIds.put(R.id.rb_ipv4, 17);
        sViewsWithIds.put(R.id.rb_ipv6, 18);
        sViewsWithIds.put(R.id.rb_ipv_auto, 19);
        sViewsWithIds.put(R.id.btn_ok, 20);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPublicConfigBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityPublicConfigBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.Button) bindings[20]
            , (android.widget.RadioButton) bindings[8]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.RadioButton) bindings[17]
            , (android.widget.RadioButton) bindings[18]
            , (android.widget.RadioButton) bindings[19]
            , (android.widget.RadioButton) bindings[14]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.RadioButton) bindings[15]
            , (android.widget.RadioGroup) bindings[7]
            , (android.widget.RadioGroup) bindings[4]
            , (android.widget.RadioGroup) bindings[16]
            , (android.widget.RadioGroup) bindings[12]
            , (android.widget.TableLayout) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}