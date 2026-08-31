package androidx.appcompat.widget;

import A1.b;
import B0.G0;
import J1.A;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.datepicker.k;
import com.wnapp.smspariaz.R;
import g.AbstractC1066a;
import i1.C1134a;
import i3.C1136a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.h;
import l.C1211n;
import l.MenuC1209l;
import m.AbstractC1279S0;
import m.C1266L0;
import m.C1281T0;
import m.C1283U0;
import m.C1287W0;
import m.C1291Y0;
import m.C1292Z;
import m.C1312j;
import m.C1336v;
import m.C1338w;
import m.InterfaceC1285V0;
import m.InterfaceC1311i0;
import m.RunnableC1277R0;
import m.ViewOnClickListenerC1289X0;
import m.g1;
import n5.AbstractC1397A;
import t2.e;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9172A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9173B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9174C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f9175D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f9176E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9177F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f9178G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f9179H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9180I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1266L0 f9181J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f9182K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f9183L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f9184M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public CharSequence f9185N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public CharSequence f9186O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ColorStateList f9187P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ColorStateList f9188Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f9189R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f9190S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final ArrayList f9191T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final ArrayList f9192U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int[] f9193V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final e f9194W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ArrayList f9195a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final C1136a f9196b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C1291Y0 f9197c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C1312j f9198d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C1281T0 f9199e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f9200f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f9201g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public OnBackInvokedDispatcher f9202h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f9203i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final b f9204j0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ActionMenuView f9205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1292Z f9206r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1292Z f9207s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1336v f9208t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1338w f9209u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Drawable f9210v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f9211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1336v f9212x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f9213y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Context f9214z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1283U0 h() {
        C1283U0 c1283u0 = new C1283U0(-2, -2);
        c1283u0.f14713b = 0;
        c1283u0.f14712a = 8388627;
        return c1283u0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1283U0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z5 = layoutParams instanceof C1283U0;
        if (z5) {
            C1283U0 c1283u0 = (C1283U0) layoutParams;
            C1283U0 c1283u02 = new C1283U0(c1283u0);
            c1283u02.f14713b = 0;
            c1283u02.f14713b = c1283u0.f14713b;
            return c1283u02;
        }
        if (z5) {
            C1283U0 c1283u03 = new C1283U0((C1283U0) layoutParams);
            c1283u03.f14713b = 0;
            return c1283u03;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1283U0 c1283u04 = new C1283U0(layoutParams);
            c1283u04.f14713b = 0;
            return c1283u04;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1283U0 c1283u05 = new C1283U0(marginLayoutParams);
        c1283u05.f14713b = 0;
        ((ViewGroup.MarginLayoutParams) c1283u05).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1283u05).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1283u05).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1283u05).bottomMargin = marginLayoutParams.bottomMargin;
        return c1283u05;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, ArrayList arrayList) {
        boolean z5 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z5) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                C1283U0 c1283u0 = (C1283U0) childAt.getLayoutParams();
                if (c1283u0.f14713b == 0 && t(childAt)) {
                    int i8 = c1283u0.f14712a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            C1283U0 c1283u02 = (C1283U0) childAt2.getLayoutParams();
            if (c1283u02.f14713b == 0 && t(childAt2)) {
                int i10 = c1283u02.f14712a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i10, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(View view, boolean z5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1283U0 c1283u0H = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (C1283U0) layoutParams;
        c1283u0H.f14713b = 1;
        if (!z5 || this.f9213y == null) {
            addView(view, c1283u0H);
        } else {
            view.setLayoutParams(c1283u0H);
            this.f9192U.add(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (this.f9212x == null) {
            C1336v c1336v = new C1336v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f9212x = c1336v;
            c1336v.setImageDrawable(this.f9210v);
            this.f9212x.setContentDescription(this.f9211w);
            C1283U0 c1283u0H = h();
            c1283u0H.f14712a = (this.f9175D & 112) | 8388611;
            c1283u0H.f14713b = 2;
            this.f9212x.setLayoutParams(c1283u0H);
            this.f9212x.setOnClickListener(new k(3, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1283U0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (this.f9181J == null) {
            C1266L0 c1266l0 = new C1266L0();
            c1266l0.f14681a = 0;
            c1266l0.f14682b = 0;
            c1266l0.f14683c = Integer.MIN_VALUE;
            c1266l0.f14684d = Integer.MIN_VALUE;
            c1266l0.f14685e = 0;
            c1266l0.f = 0;
            c1266l0.f14686g = false;
            c1266l0.f14687h = false;
            this.f9181J = c1266l0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f9205q;
        if (actionMenuView.f9146F == null) {
            MenuC1209l menuC1209l = (MenuC1209l) actionMenuView.getMenu();
            if (this.f9199e0 == null) {
                this.f9199e0 = new C1281T0(this);
            }
            this.f9205q.setExpandedActionViewsExclusive(true);
            menuC1209l.b(this.f9199e0, this.f9214z);
            u();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        if (this.f9205q == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f9205q = actionMenuView;
            actionMenuView.setPopupTheme(this.f9172A);
            this.f9205q.setOnMenuItemClickListener(this.f9196b0);
            ActionMenuView actionMenuView2 = this.f9205q;
            C1134a c1134a = new C1134a(5, this);
            actionMenuView2.getClass();
            actionMenuView2.f9151K = c1134a;
            C1283U0 c1283u0H = h();
            c1283u0H.f14712a = (this.f9175D & 112) | 8388613;
            this.f9205q.setLayoutParams(c1283u0H);
            b(this.f9205q, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        if (this.f9208t == null) {
            this.f9208t = new C1336v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1283U0 c1283u0H = h();
            c1283u0H.f14712a = (this.f9175D & 112) | 8388611;
            this.f9208t.setLayoutParams(c1283u0H);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getCollapseContentDescription() {
        C1336v c1336v = this.f9212x;
        if (c1336v != null) {
            return c1336v.getContentDescription();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getCollapseIcon() {
        C1336v c1336v = this.f9212x;
        if (c1336v != null) {
            return c1336v.getDrawable();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetEnd() {
        C1266L0 c1266l0 = this.f9181J;
        if (c1266l0 != null) {
            return c1266l0.f14686g ? c1266l0.f14681a : c1266l0.f14682b;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetEndWithActions() {
        int i = this.f9183L;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetLeft() {
        C1266L0 c1266l0 = this.f9181J;
        if (c1266l0 != null) {
            return c1266l0.f14681a;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetRight() {
        C1266L0 c1266l0 = this.f9181J;
        if (c1266l0 != null) {
            return c1266l0.f14682b;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetStart() {
        C1266L0 c1266l0 = this.f9181J;
        if (c1266l0 != null) {
            return c1266l0.f14686g ? c1266l0.f14682b : c1266l0.f14681a;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getContentInsetStartWithNavigation() {
        int i = this.f9182K;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCurrentContentInsetEnd() {
        MenuC1209l menuC1209l;
        ActionMenuView actionMenuView = this.f9205q;
        return (actionMenuView == null || (menuC1209l = actionMenuView.f9146F) == null || !menuC1209l.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f9183L, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f9182K, 0)) : getContentInsetStart();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getLogo() {
        C1338w c1338w = this.f9209u;
        if (c1338w != null) {
            return c1338w.getDrawable();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getLogoDescription() {
        C1338w c1338w = this.f9209u;
        if (c1338w != null) {
            return c1338w.getContentDescription();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Menu getMenu() {
        e();
        return this.f9205q.getMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View getNavButtonView() {
        return this.f9208t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getNavigationContentDescription() {
        C1336v c1336v = this.f9208t;
        if (c1336v != null) {
            return c1336v.getContentDescription();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getNavigationIcon() {
        C1336v c1336v = this.f9208t;
        if (c1336v != null) {
            return c1336v.getDrawable();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1312j getOuterActionMenuPresenter() {
        return this.f9198d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getOverflowIcon() {
        e();
        return this.f9205q.getOverflowIcon();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Context getPopupContext() {
        return this.f9214z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getPopupTheme() {
        return this.f9172A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getSubtitle() {
        return this.f9186O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TextView getSubtitleTextView() {
        return this.f9207s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getTitle() {
        return this.f9185N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTitleMarginBottom() {
        return this.f9180I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTitleMarginEnd() {
        return this.f9178G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTitleMarginStart() {
        return this.f9177F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getTitleMarginTop() {
        return this.f9179H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final TextView getTitleTextView() {
        return this.f9206r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1311i0 getWrapper() {
        Drawable drawable;
        if (this.f9197c0 == null) {
            C1291Y0 c1291y0 = new C1291Y0();
            c1291y0.f14740n = 0;
            c1291y0.f14730a = this;
            c1291y0.f14736h = getTitle();
            c1291y0.i = getSubtitle();
            c1291y0.f14735g = c1291y0.f14736h != null;
            c1291y0.f = getNavigationIcon();
            G0 g0N = G0.N(getContext(), null, AbstractC1066a.f12786a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) g0N.f235s;
            c1291y0.f14741o = g0N.y(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1291y0.f14735g = true;
                Toolbar toolbar = c1291y0.f14730a;
                c1291y0.f14736h = text;
                if ((c1291y0.f14731b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (c1291y0.f14735g) {
                        AbstractC1835K.n(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1291y0.i = text2;
                if ((c1291y0.f14731b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableY = g0N.y(20);
            if (drawableY != null) {
                c1291y0.f14734e = drawableY;
                c1291y0.c();
            }
            Drawable drawableY2 = g0N.y(17);
            if (drawableY2 != null) {
                c1291y0.f14733d = drawableY2;
                c1291y0.c();
            }
            if (c1291y0.f == null && (drawable = c1291y0.f14741o) != null) {
                c1291y0.f = drawable;
                Toolbar toolbar2 = c1291y0.f14730a;
                if ((c1291y0.f14731b & 4) != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            c1291y0.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1291y0.f14732c;
                if (view != null && (c1291y0.f14731b & 16) != 0) {
                    removeView(view);
                }
                c1291y0.f14732c = viewInflate;
                if (viewInflate != null && (c1291y0.f14731b & 16) != 0) {
                    addView(viewInflate);
                }
                c1291y0.a(c1291y0.f14731b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f9181J.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f9173B = resourceId2;
                C1292Z c1292z = this.f9206r;
                if (c1292z != null) {
                    c1292z.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f9174C = resourceId3;
                C1292Z c1292z2 = this.f9207s;
                if (c1292z2 != null) {
                    c1292z2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            g0N.R();
            if (R.string.abc_action_bar_up_description != c1291y0.f14740n) {
                c1291y0.f14740n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = c1291y0.f14740n;
                    c1291y0.j = i != 0 ? getContext().getString(i) : null;
                    c1291y0.b();
                }
            }
            c1291y0.j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1289X0(c1291y0));
            this.f9197c0 = c1291y0;
        }
        return this.f9197c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j(View view, int i) {
        C1283U0 c1283u0 = (C1283U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i8 = c1283u0.f14712a & 112;
        if (i8 != 16 && i8 != 48 && i8 != 80) {
            i8 = this.f9184M & 112;
        }
        if (i8 == 48) {
            return getPaddingTop() - i7;
        }
        if (i8 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1283u0).bottomMargin) - i7;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) c1283u0).topMargin;
        if (iMax < i9) {
            iMax = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) c1283u0).bottomMargin;
            if (i10 < i11) {
                iMax = Math.max(0, iMax - (i11 - i10));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        ArrayList arrayList = this.f9195a0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f9194W.f16685r).iterator();
        while (it.hasNext()) {
            ((A) it.next()).f2503a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f9195a0 = currentMenuItems2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o(View view) {
        return view.getParent() == this || this.f9192U.contains(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f9204j0);
        u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f9190S = false;
        }
        if (!this.f9190S) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f9190S = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f9190S = false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r8 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f9193V
            r11[r3] = r2
            r11[r2] = r2
            java.util.WeakHashMap r12 = w1.AbstractC1835K.f18149a
            int r12 = r0.getMinimumHeight()
            if (r12 < 0) goto L3c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L3d
        L3c:
            r12 = r2
        L3d:
            m.v r13 = r0.f9208t
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto L58
            if (r1 == 0) goto L50
            m.v r13 = r0.f9208t
            int r13 = r0.q(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L5a
        L50:
            m.v r13 = r0.f9208t
            int r13 = r0.p(r13, r6, r12, r11)
        L56:
            r14 = r10
            goto L5a
        L58:
            r13 = r6
            goto L56
        L5a:
            m.v r15 = r0.f9212x
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L71
            if (r1 == 0) goto L6b
            m.v r15 = r0.f9212x
            int r14 = r0.q(r15, r14, r12, r11)
            goto L71
        L6b:
            m.v r15 = r0.f9212x
            int r13 = r0.p(r15, r13, r12, r11)
        L71:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f9205q
            boolean r15 = r0.t(r15)
            if (r15 == 0) goto L88
            if (r1 == 0) goto L82
            androidx.appcompat.widget.ActionMenuView r15 = r0.f9205q
            int r13 = r0.p(r15, r13, r12, r11)
            goto L88
        L82:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f9205q
            int r14 = r0.q(r15, r14, r12, r11)
        L88:
            int r15 = r0.getCurrentContentInsetLeft()
            int r16 = r0.getCurrentContentInsetRight()
            r20 = r3
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r20] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f9213y
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto Lc5
            if (r1 == 0) goto Lbf
            android.view.View r13 = r0.f9213y
            int r10 = r0.q(r13, r10, r12, r11)
            goto Lc5
        Lbf:
            android.view.View r13 = r0.f9213y
            int r3 = r0.p(r13, r3, r12, r11)
        Lc5:
            m.w r13 = r0.f9209u
            boolean r13 = r0.t(r13)
            if (r13 == 0) goto Ldc
            if (r1 == 0) goto Ld6
            m.w r13 = r0.f9209u
            int r10 = r0.q(r13, r10, r12, r11)
            goto Ldc
        Ld6:
            m.w r13 = r0.f9209u
            int r3 = r0.p(r13, r3, r12, r11)
        Ldc:
            m.Z r13 = r0.f9206r
            boolean r13 = r0.t(r13)
            m.Z r14 = r0.f9207s
            boolean r14 = r0.t(r14)
            if (r13 == 0) goto L101
            m.Z r15 = r0.f9206r
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            m.U0 r15 = (m.C1283U0) r15
            int r2 = r15.topMargin
            r23 = r1
            m.Z r1 = r0.f9206r
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r2
            int r2 = r15.bottomMargin
            int r1 = r1 + r2
            goto L104
        L101:
            r23 = r1
            r1 = 0
        L104:
            if (r14 == 0) goto L11f
            m.Z r2 = r0.f9207s
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            m.U0 r2 = (m.C1283U0) r2
            int r15 = r2.topMargin
            r22 = r1
            m.Z r1 = r0.f9207s
            int r1 = r1.getMeasuredHeight()
            int r1 = r1 + r15
            int r2 = r2.bottomMargin
            int r1 = r1 + r2
            int r1 = r1 + r22
            goto L121
        L11f:
            r22 = r1
        L121:
            if (r13 != 0) goto L125
            if (r14 == 0) goto L281
        L125:
            if (r13 == 0) goto L12a
            m.Z r2 = r0.f9206r
            goto L12c
        L12a:
            m.Z r2 = r0.f9207s
        L12c:
            if (r14 == 0) goto L131
            m.Z r15 = r0.f9207s
            goto L133
        L131:
            m.Z r15 = r0.f9206r
        L133:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            m.U0 r2 = (m.C1283U0) r2
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            m.U0 r15 = (m.C1283U0) r15
            r22 = r1
            if (r13 == 0) goto L14b
            m.Z r1 = r0.f9206r
            int r1 = r1.getMeasuredWidth()
            if (r1 > 0) goto L155
        L14b:
            if (r14 == 0) goto L158
            m.Z r1 = r0.f9207s
            int r1 = r1.getMeasuredWidth()
            if (r1 <= 0) goto L158
        L155:
            r24 = r20
            goto L15a
        L158:
            r24 = 0
        L15a:
            int r1 = r0.f9184M
            r1 = r1 & 112(0x70, float:1.57E-43)
            r16 = r3
            r3 = 48
            if (r1 == r3) goto L19d
            r3 = 80
            if (r1 == r3) goto L193
            int r1 = r5 - r8
            int r1 = r1 - r9
            int r1 = r1 - r22
            int r1 = r1 / 2
            int r3 = r2.topMargin
            r17 = r3
            int r3 = r0.f9179H
            int r3 = r17 + r3
            if (r1 >= r3) goto L17b
            r1 = r3
            goto L191
        L17b:
            int r5 = r5 - r9
            int r5 = r5 - r22
            int r5 = r5 - r1
            int r5 = r5 - r8
            int r2 = r2.bottomMargin
            int r3 = r0.f9180I
            int r2 = r2 + r3
            if (r5 >= r2) goto L191
            int r2 = r15.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L191:
            int r8 = r8 + r1
            goto L1a8
        L193:
            int r5 = r5 - r9
            int r1 = r15.bottomMargin
            int r5 = r5 - r1
            int r1 = r0.f9180I
            int r5 = r5 - r1
            int r8 = r5 - r22
            goto L1a8
        L19d:
            int r1 = r0.getPaddingTop()
            int r2 = r2.topMargin
            int r1 = r1 + r2
            int r2 = r0.f9179H
            int r8 = r1 + r2
        L1a8:
            if (r23 == 0) goto L218
            if (r24 == 0) goto L1af
            int r1 = r0.f9177F
            goto L1b0
        L1af:
            r1 = 0
        L1b0:
            r2 = r11[r20]
            int r1 = r1 - r2
            r2 = 0
            int r3 = java.lang.Math.max(r2, r1)
            int r10 = r10 - r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r20] = r1
            if (r13 == 0) goto L1e6
            m.Z r1 = r0.f9206r
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            m.U0 r1 = (m.C1283U0) r1
            m.Z r2 = r0.f9206r
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            m.Z r3 = r0.f9206r
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            m.Z r5 = r0.f9206r
            r5.layout(r2, r8, r10, r3)
            int r5 = r0.f9178G
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L1e7
        L1e6:
            r2 = r10
        L1e7:
            if (r14 == 0) goto L20d
            m.Z r1 = r0.f9207s
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            m.U0 r1 = (m.C1283U0) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            m.Z r1 = r0.f9207s
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            m.Z r3 = r0.f9207s
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            m.Z r5 = r0.f9207s
            r5.layout(r1, r8, r10, r3)
            int r1 = r0.f9178G
            int r1 = r10 - r1
            goto L20e
        L20d:
            r1 = r10
        L20e:
            if (r24 == 0) goto L215
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L215:
            r3 = r16
            goto L281
        L218:
            if (r24 == 0) goto L21e
            int r1 = r0.f9177F
        L21c:
            r2 = 0
            goto L220
        L21e:
            r1 = 0
            goto L21c
        L220:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r16
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L255
            m.Z r1 = r0.f9206r
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            m.U0 r1 = (m.C1283U0) r1
            m.Z r2 = r0.f9206r
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            m.Z r5 = r0.f9206r
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            m.Z r9 = r0.f9206r
            r9.layout(r3, r8, r2, r5)
            int r8 = r0.f9178G
            int r2 = r2 + r8
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L256
        L255:
            r2 = r3
        L256:
            if (r14 == 0) goto L27a
            m.Z r1 = r0.f9207s
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            m.U0 r1 = (m.C1283U0) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            m.Z r1 = r0.f9207s
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            m.Z r5 = r0.f9207s
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            m.Z r9 = r0.f9207s
            r9.layout(r3, r8, r1, r5)
            int r5 = r0.f9178G
            int r1 = r1 + r5
            goto L27b
        L27a:
            r1 = r3
        L27b:
            if (r24 == 0) goto L281
            int r3 = java.lang.Math.max(r2, r1)
        L281:
            r1 = 3
            java.util.ArrayList r2 = r0.f9191T
            r0.a(r1, r2)
            int r1 = r2.size()
            r5 = r3
            r3 = 0
        L28d:
            if (r3 >= r1) goto L29c
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r5 = r0.p(r8, r5, r12, r11)
            int r3 = r3 + 1
            goto L28d
        L29c:
            r1 = 5
            r0.a(r1, r2)
            int r1 = r2.size()
            r3 = 0
        L2a5:
            if (r3 >= r1) goto L2b4
            java.lang.Object r8 = r2.get(r3)
            android.view.View r8 = (android.view.View) r8
            int r10 = r0.q(r8, r10, r12, r11)
            int r3 = r3 + 1
            goto L2a5
        L2b4:
            r3 = r20
            r0.a(r3, r2)
            r1 = 0
            r8 = r11[r1]
            r1 = r11[r3]
            int r3 = r2.size()
            r13 = r8
            r8 = 0
            r9 = 0
        L2c5:
            if (r8 >= r3) goto L300
            java.lang.Object r14 = r2.get(r8)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            m.U0 r15 = (m.C1283U0) r15
            r20 = r1
            int r1 = r15.leftMargin
            int r1 = r1 - r13
            int r13 = r15.rightMargin
            int r13 = r13 - r20
            r15 = 0
            int r16 = java.lang.Math.max(r15, r1)
            int r17 = java.lang.Math.max(r15, r13)
            int r1 = -r1
            int r1 = java.lang.Math.max(r15, r1)
            int r13 = -r13
            int r13 = java.lang.Math.max(r15, r13)
            int r14 = r14.getMeasuredWidth()
            int r14 = r14 + r16
            int r14 = r14 + r17
            int r9 = r9 + r14
            int r8 = r8 + 1
            r18 = r13
            r13 = r1
            r1 = r18
            goto L2c5
        L300:
            r15 = 0
            int r4 = r4 - r6
            int r4 = r4 - r7
            int r4 = r4 / 2
            int r4 = r4 + r6
            int r1 = r9 / 2
            int r4 = r4 - r1
            int r9 = r9 + r4
            if (r4 >= r5) goto L30d
            goto L314
        L30d:
            if (r9 <= r10) goto L313
            int r9 = r9 - r10
            int r5 = r4 - r9
            goto L314
        L313:
            r5 = r4
        L314:
            int r1 = r2.size()
        L318:
            if (r15 >= r1) goto L327
            java.lang.Object r3 = r2.get(r15)
            android.view.View r3 = (android.view.View) r3
            int r5 = r0.p(r3, r5, r12, r11)
            int r15 = r15 + 1
            goto L318
        L327:
            r2.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        char c7;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z5 = g1.f14790a;
        int i8 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c7 = 0;
        } else {
            c7 = 1;
            objArr = false;
        }
        if (t(this.f9208t)) {
            s(this.f9208t, i, 0, i7, this.f9176E);
            iK = k(this.f9208t) + this.f9208t.getMeasuredWidth();
            iMax = Math.max(0, l(this.f9208t) + this.f9208t.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f9208t.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.f9212x)) {
            s(this.f9212x, i, 0, i7, this.f9176E);
            iK = k(this.f9212x) + this.f9212x.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f9212x) + this.f9212x.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f9212x.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.f9193V;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (t(this.f9205q)) {
            s(this.f9205q, i, iMax3, i7, this.f9176E);
            iK2 = k(this.f9205q) + this.f9205q.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f9205q) + this.f9205q.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f9205q.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c7] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.f9213y)) {
            iMax5 += r(this.f9213y, i, iMax5, i7, 0, iArr);
            iMax = Math.max(iMax, l(this.f9213y) + this.f9213y.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f9213y.getMeasuredState());
        }
        if (t(this.f9209u)) {
            iMax5 += r(this.f9209u, i, iMax5, i7, 0, iArr);
            iMax = Math.max(iMax, l(this.f9209u) + this.f9209u.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f9209u.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (((C1283U0) childAt.getLayoutParams()).f14713b == 0 && t(childAt)) {
                iMax5 += r(childAt, i, iMax5, i7, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i10 = iMax5;
        int i11 = this.f9179H + this.f9180I;
        int i12 = this.f9177F + this.f9178G;
        if (t(this.f9206r)) {
            r(this.f9206r, i, i10 + i12, i7, i11, iArr);
            int iK3 = k(this.f9206r) + this.f9206r.getMeasuredWidth();
            iL = l(this.f9206r) + this.f9206r.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f9206r.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f9207s)) {
            iMax2 = Math.max(iMax2, r(this.f9207s, i, i10 + i12, i7, i11 + iL, iArr));
            iL += l(this.f9207s) + this.f9207s.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f9207s.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i10 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i7, iCombineMeasuredStates2 << 16);
        if (!this.f9200f0) {
            i8 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i8 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1287W0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1287W0 c1287w0 = (C1287W0) parcelable;
        super.onRestoreInstanceState(c1287w0.f1163q);
        ActionMenuView actionMenuView = this.f9205q;
        MenuC1209l menuC1209l = actionMenuView != null ? actionMenuView.f9146F : null;
        int i = c1287w0.f14724s;
        if (i != 0 && this.f9199e0 != null && menuC1209l != null && (menuItemFindItem = menuC1209l.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1287w0.f14725t) {
            b bVar = this.f9204j0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        C1266L0 c1266l0 = this.f9181J;
        boolean z5 = i == 1;
        if (z5 == c1266l0.f14686g) {
            return;
        }
        c1266l0.f14686g = z5;
        if (!c1266l0.f14687h) {
            c1266l0.f14681a = c1266l0.f14685e;
            c1266l0.f14682b = c1266l0.f;
            return;
        }
        if (z5) {
            int i7 = c1266l0.f14684d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = c1266l0.f14685e;
            }
            c1266l0.f14681a = i7;
            int i8 = c1266l0.f14683c;
            if (i8 == Integer.MIN_VALUE) {
                i8 = c1266l0.f;
            }
            c1266l0.f14682b = i8;
            return;
        }
        int i9 = c1266l0.f14683c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = c1266l0.f14685e;
        }
        c1266l0.f14681a = i9;
        int i10 = c1266l0.f14684d;
        if (i10 == Integer.MIN_VALUE) {
            i10 = c1266l0.f;
        }
        c1266l0.f14682b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1312j c1312j;
        C1211n c1211n;
        C1287W0 c1287w0 = new C1287W0(super.onSaveInstanceState());
        C1281T0 c1281t0 = this.f9199e0;
        if (c1281t0 != null && (c1211n = c1281t0.f14710r) != null) {
            c1287w0.f14724s = c1211n.f14378a;
        }
        ActionMenuView actionMenuView = this.f9205q;
        c1287w0.f14725t = (actionMenuView == null || (c1312j = actionMenuView.f9150J) == null || !c1312j.e()) ? false : true;
        return c1287w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f9189R = false;
        }
        if (!this.f9189R) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f9189R = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f9189R = false;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int p(View view, int i, int i7, int[] iArr) {
        C1283U0 c1283u0 = (C1283U0) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) c1283u0).leftMargin - iArr[0];
        int iMax = Math.max(0, i8) + i;
        iArr[0] = Math.max(0, -i8);
        int iJ = j(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1283u0).rightMargin + iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q(View view, int i, int i7, int[] iArr) {
        C1283U0 c1283u0 = (C1283U0) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) c1283u0).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i8);
        iArr[1] = Math.max(0, -i8);
        int iJ = j(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1283u0).leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int r(View view, int i, int i7, int i8, int i9, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i11) + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(View view, int i, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i9 >= 0) {
            if (mode != 0) {
                i9 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i9);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.f9203i0 != z5) {
            this.f9203i0 = z5;
            u();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0597a.C(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCollapsible(boolean z5) {
        this.f9200f0 = z5;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f9183L) {
            this.f9183L = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f9182K) {
            this.f9182K = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogo(int i) {
        setLogo(AbstractC0597a.C(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0597a.C(getContext(), i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f9208t.setOnClickListener(onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f9205q.setOverflowIcon(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPopupTheme(int i) {
        if (this.f9172A != i) {
            this.f9172A = i;
            if (i == 0) {
                this.f9214z = getContext();
            } else {
                this.f9214z = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleMarginBottom(int i) {
        this.f9180I = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleMarginEnd(int i) {
        this.f9178G = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleMarginStart(int i) {
        this.f9177F = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleMarginTop(int i) {
        this.f9179H = i;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = AbstractC1279S0.a(this);
            C1281T0 c1281t0 = this.f9199e0;
            boolean z5 = (c1281t0 == null || c1281t0.f14710r == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f9203i0) ? false : true;
            if (z5 && this.f9202h0 == null) {
                if (this.f9201g0 == null) {
                    this.f9201g0 = AbstractC1279S0.b(new RunnableC1277R0(this, 0));
                }
                AbstractC1279S0.c(onBackInvokedDispatcherA, this.f9201g0);
                this.f9202h0 = onBackInvokedDispatcherA;
                return;
            }
            if (z5 || (onBackInvokedDispatcher = this.f9202h0) == null) {
                return;
            }
            AbstractC1279S0.d(onBackInvokedDispatcher, this.f9201g0);
            this.f9202h0 = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f9184M = 8388627;
        this.f9191T = new ArrayList();
        this.f9192U = new ArrayList();
        this.f9193V = new int[2];
        this.f9194W = new e(new RunnableC1277R0(this, 1));
        this.f9195a0 = new ArrayList();
        this.f9196b0 = new C1136a(4, this);
        this.f9204j0 = new b(21, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1066a.f12805w;
        G0 g0N = G0.N(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AbstractC1835K.l(this, context, iArr, attributeSet, (TypedArray) g0N.f235s, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        this.f9173B = typedArray.getResourceId(28, 0);
        this.f9174C = typedArray.getResourceId(19, 0);
        this.f9184M = typedArray.getInteger(0, 8388627);
        this.f9175D = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f9180I = dimensionPixelOffset;
        this.f9179H = dimensionPixelOffset;
        this.f9178G = dimensionPixelOffset;
        this.f9177F = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f9177F = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f9178G = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f9179H = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f9180I = dimensionPixelOffset5;
        }
        this.f9176E = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C1266L0 c1266l0 = this.f9181J;
        c1266l0.f14687h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1266l0.f14685e = dimensionPixelSize;
            c1266l0.f14681a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1266l0.f = dimensionPixelSize2;
            c1266l0.f14682b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1266l0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f9182K = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f9183L = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f9210v = g0N.y(4);
        this.f9211w = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f9214z = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableY = g0N.y(16);
        if (drawableY != null) {
            setNavigationIcon(drawableY);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableY2 = g0N.y(11);
        if (drawableY2 != null) {
            setLogo(drawableY2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(g0N.w(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(g0N.w(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        g0N.R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1283U0 c1283u0 = new C1283U0(context, attributeSet);
        c1283u0.f14712a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1066a.f12787b);
        c1283u0.f14712a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1283u0.f14713b = 0;
        return c1283u0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1336v c1336v = this.f9212x;
        if (c1336v != null) {
            c1336v.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f9212x.setImageDrawable(drawable);
        } else {
            C1336v c1336v = this.f9212x;
            if (c1336v != null) {
                c1336v.setImageDrawable(this.f9210v);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f9209u == null) {
                this.f9209u = new C1338w(getContext(), null, 0);
            }
            if (!o(this.f9209u)) {
                b(this.f9209u, true);
            }
        } else {
            C1338w c1338w = this.f9209u;
            if (c1338w != null && o(c1338w)) {
                removeView(this.f9209u);
                this.f9192U.remove(this.f9209u);
            }
        }
        C1338w c1338w2 = this.f9209u;
        if (c1338w2 != null) {
            c1338w2.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f9209u == null) {
            this.f9209u = new C1338w(getContext(), null, 0);
        }
        C1338w c1338w = this.f9209u;
        if (c1338w != null) {
            c1338w.setContentDescription(charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C1336v c1336v = this.f9208t;
        if (c1336v != null) {
            c1336v.setContentDescription(charSequence);
            AbstractC1397A.C(this.f9208t, charSequence);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f9208t)) {
                b(this.f9208t, true);
            }
        } else {
            C1336v c1336v = this.f9208t;
            if (c1336v != null && o(c1336v)) {
                removeView(this.f9208t);
                this.f9192U.remove(this.f9208t);
            }
        }
        C1336v c1336v2 = this.f9208t;
        if (c1336v2 != null) {
            c1336v2.setImageDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1292Z c1292z = this.f9207s;
            if (c1292z != null && o(c1292z)) {
                removeView(this.f9207s);
                this.f9192U.remove(this.f9207s);
            }
        } else {
            if (this.f9207s == null) {
                Context context = getContext();
                C1292Z c1292z2 = new C1292Z(context, null);
                this.f9207s = c1292z2;
                c1292z2.setSingleLine();
                this.f9207s.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f9174C;
                if (i != 0) {
                    this.f9207s.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f9188Q;
                if (colorStateList != null) {
                    this.f9207s.setTextColor(colorStateList);
                }
            }
            if (!o(this.f9207s)) {
                b(this.f9207s, true);
            }
        }
        C1292Z c1292z3 = this.f9207s;
        if (c1292z3 != null) {
            c1292z3.setText(charSequence);
        }
        this.f9186O = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f9188Q = colorStateList;
        C1292Z c1292z = this.f9207s;
        if (c1292z != null) {
            c1292z.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1292Z c1292z = this.f9206r;
            if (c1292z != null && o(c1292z)) {
                removeView(this.f9206r);
                this.f9192U.remove(this.f9206r);
            }
        } else {
            if (this.f9206r == null) {
                Context context = getContext();
                C1292Z c1292z2 = new C1292Z(context, null);
                this.f9206r = c1292z2;
                c1292z2.setSingleLine();
                this.f9206r.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f9173B;
                if (i != 0) {
                    this.f9206r.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f9187P;
                if (colorStateList != null) {
                    this.f9206r.setTextColor(colorStateList);
                }
            }
            if (!o(this.f9206r)) {
                b(this.f9206r, true);
            }
        }
        C1292Z c1292z3 = this.f9206r;
        if (c1292z3 != null) {
            c1292z3.setText(charSequence);
        }
        this.f9185N = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f9187P = colorStateList;
        C1292Z c1292z = this.f9206r;
        if (c1292z != null) {
            c1292z.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(InterfaceC1285V0 interfaceC1285V0) {
    }
}
