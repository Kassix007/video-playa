package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.i;
import java.util.WeakHashMap;
import l.C1211n;
import l.y;
import l4.AbstractC1234d;
import m.C1333t0;
import m1.l;
import n5.AbstractC1397A;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC1234d implements y {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[] f11562W = {R.attr.state_checked};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f11563L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f11564M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f11565N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f11566O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final CheckedTextView f11567P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public FrameLayout f11568Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C1211n f11569R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ColorStateList f11570S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f11571T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Drawable f11572U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final i f11573V;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11566O = true;
        i iVar = new i(3, this);
        this.f11573V = iVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.wnapp.smspariaz.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.wnapp.smspariaz.R.id.design_menu_item_text);
        this.f11567P = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC1835K.m(checkedTextView, iVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setActionView(View view) {
        if (view != null) {
            if (this.f11568Q == null) {
                this.f11568Q = (FrameLayout) ((ViewStub) findViewById(com.wnapp.smspariaz.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f11568Q.removeAllViews();
            this.f11568Q.addView(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.y
    public final void b(C1211n c1211n) {
        StateListDrawable stateListDrawable;
        this.f11569R = c1211n;
        int i = c1211n.f14378a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c1211n.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.wnapp.smspariaz.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f11562W, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            setBackground(stateListDrawable);
        }
        setCheckable(c1211n.isCheckable());
        setChecked(c1211n.isChecked());
        setEnabled(c1211n.isEnabled());
        setTitle(c1211n.f14382e);
        setIcon(c1211n.getIcon());
        setActionView(c1211n.getActionView());
        setContentDescription(c1211n.f14391q);
        AbstractC1397A.C(this, c1211n.f14392r);
        C1211n c1211n2 = this.f11569R;
        CharSequence charSequence = c1211n2.f14382e;
        CheckedTextView checkedTextView = this.f11567P;
        if (charSequence == null && c1211n2.getIcon() == null && this.f11569R.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f11568Q;
            if (frameLayout != null) {
                C1333t0 c1333t0 = (C1333t0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1333t0).width = -1;
                this.f11568Q.setLayoutParams(c1333t0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f11568Q;
        if (frameLayout2 != null) {
            C1333t0 c1333t02 = (C1333t0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1333t02).width = -2;
            this.f11568Q.setLayoutParams(c1333t02);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.y
    public C1211n getItemData() {
        return this.f11569R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1211n c1211n = this.f11569R;
        if (c1211n != null && c1211n.isCheckable() && this.f11569R.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f11562W);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckable(boolean z5) {
        refreshDrawableState();
        if (this.f11565N != z5) {
            this.f11565N = z5;
            this.f11573V.h(this.f11567P, 2048);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChecked(boolean z5) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f11567P;
        checkedTextView.setChecked(z5);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z5 && this.f11566O) ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f11571T) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f11570S);
            }
            int i = this.f11563L;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f11564M) {
            if (this.f11572U == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f15039a;
                Drawable drawable2 = resources.getDrawable(com.wnapp.smspariaz.R.drawable.navigation_empty_icon, theme);
                this.f11572U = drawable2;
                if (drawable2 != null) {
                    int i7 = this.f11563L;
                    drawable2.setBounds(0, 0, i7, i7);
                }
            }
            drawable = this.f11572U;
        }
        this.f11567P.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconPadding(int i) {
        this.f11567P.setCompoundDrawablePadding(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconSize(int i) {
        this.f11563L = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f11570S = colorStateList;
        this.f11571T = colorStateList != null;
        C1211n c1211n = this.f11569R;
        if (c1211n != null) {
            setIcon(c1211n.getIcon());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxLines(int i) {
        this.f11567P.setMaxLines(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNeedsEmptyIcon(boolean z5) {
        this.f11564M = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextAppearance(int i) {
        this.f11567P.setTextAppearance(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTextColor(ColorStateList colorStateList) {
        this.f11567P.setTextColor(colorStateList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(CharSequence charSequence) {
        this.f11567P.setText(charSequence);
    }
}
