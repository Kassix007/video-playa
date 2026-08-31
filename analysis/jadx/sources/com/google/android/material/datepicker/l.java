package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import d2.C0997w;
import d2.Y;
import java.util.ArrayList;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class l<S> extends v {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f11496l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public b f11497m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public q f11498n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f11499o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public c f11500p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f11501q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RecyclerView f11502r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View f11503s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public View f11504t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public View f11505u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public View f11506v0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(q qVar) {
        u uVar = (u) this.f11502r0.getAdapter();
        int iD = uVar.f11550c.f11470q.d(qVar);
        int iD2 = iD - uVar.f11550c.f11470q.d(this.f11498n0);
        boolean z5 = Math.abs(iD2) > 3;
        boolean z6 = iD2 > 0;
        this.f11498n0 = qVar;
        if (z5 && z6) {
            this.f11502r0.Y(iD - 3);
            this.f11502r0.post(new E1.j(iD, 1, this));
        } else if (!z5) {
            this.f11502r0.post(new E1.j(iD, 1, this));
        } else {
            this.f11502r0.Y(iD + 3);
            this.f11502r0.post(new E1.j(iD, 1, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(int i) {
        this.f11499o0 = i;
        if (i == 2) {
            this.f11501q0.getLayoutManager().n0(this.f11498n0.f11536s - ((A) this.f11501q0.getAdapter()).f11466c.f11497m0.f11470q.f11536s);
            this.f11505u0.setVisibility(0);
            this.f11506v0.setVisibility(8);
            this.f11503s0.setVisibility(8);
            this.f11504t0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f11505u0.setVisibility(8);
            this.f11506v0.setVisibility(0);
            this.f11503s0.setVisibility(0);
            this.f11504t0.setVisibility(0);
            G(this.f11498n0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void s(Bundle bundle) {
        super.s(bundle);
        if (bundle == null) {
            bundle = this.f2723v;
        }
        this.f11496l0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f11497m0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f11498n0 = (q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i7;
        C0997w c0997w;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(i(), this.f11496l0);
        this.f11500p0 = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        q qVar = this.f11497m0.f11470q;
        if (n.J(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.wnapp.smspariaz.R.layout.mtrl_calendar_vertical;
            i7 = 1;
        } else {
            i = com.wnapp.smspariaz.R.layout.mtrl_calendar_horizontal;
            i7 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = C().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.mtrl_calendar_days_of_week_height);
        int i8 = r.f11541d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.mtrl_calendar_month_vertical_padding) * (i8 - 1)) + (resources.getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.mtrl_calendar_day_height) * i8) + resources.getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.wnapp.smspariaz.R.id.mtrl_calendar_days_of_week);
        AbstractC1835K.m(gridView, new A1.f(1));
        int i9 = this.f11497m0.f11474u;
        gridView.setAdapter((ListAdapter) (i9 > 0 ? new e(i9) : new e()));
        gridView.setNumColumns(qVar.f11537t);
        gridView.setEnabled(false);
        this.f11502r0 = (RecyclerView) viewInflate.findViewById(com.wnapp.smspariaz.R.id.mtrl_calendar_months);
        this.f11502r0.setLayoutManager(new g(this, i7, i7));
        this.f11502r0.setTag("MONTHS_VIEW_GROUP_TAG");
        u uVar = new u(contextThemeWrapper, this.f11497m0, new k3.c(this));
        this.f11502r0.setAdapter(uVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.wnapp.smspariaz.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(com.wnapp.smspariaz.R.id.mtrl_calendar_year_selector_frame);
        this.f11501q0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f11501q0.setLayoutManager(new GridLayoutManager(integer));
            this.f11501q0.setAdapter(new A(this));
            RecyclerView recyclerView4 = this.f11501q0;
            h hVar = new h();
            y.c(null);
            y.c(null);
            recyclerView4.g(hVar);
        }
        if (viewInflate.findViewById(com.wnapp.smspariaz.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.wnapp.smspariaz.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC1835K.m(materialButton, new i(0, this));
            View viewFindViewById = viewInflate.findViewById(com.wnapp.smspariaz.R.id.month_navigation_previous);
            this.f11503s0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.wnapp.smspariaz.R.id.month_navigation_next);
            this.f11504t0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f11505u0 = viewInflate.findViewById(com.wnapp.smspariaz.R.id.mtrl_calendar_year_selector_frame);
            this.f11506v0 = viewInflate.findViewById(com.wnapp.smspariaz.R.id.mtrl_calendar_day_selector_frame);
            H(1);
            materialButton.setText(this.f11498n0.c());
            this.f11502r0.h(new j(this, uVar, materialButton));
            materialButton.setOnClickListener(new k(0, this));
            this.f11504t0.setOnClickListener(new f(this, uVar, 1));
            this.f11503s0.setOnClickListener(new f(this, uVar, 0));
        }
        if (!n.J(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0997w = new C0997w()).f12216a) != (recyclerView = this.f11502r0)) {
            Y y6 = c0997w.f12217b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f9657u0;
                if (arrayList != null) {
                    arrayList.remove(y6);
                }
                c0997w.f12216a.setOnFlingListener(null);
            }
            c0997w.f12216a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0997w.f12216a.h(y6);
                c0997w.f12216a.setOnFlingListener(c0997w);
                new Scroller(c0997w.f12216a.getContext(), new DecelerateInterpolator());
                c0997w.f();
            }
        }
        this.f11502r0.Y(uVar.f11550c.f11470q.d(this.f11498n0));
        AbstractC1835K.m(this.f11502r0, new A1.f(2));
        return viewInflate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.AbstractComponentCallbacksC0185q
    public final void x(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f11496l0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11497m0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f11498n0);
    }
}
