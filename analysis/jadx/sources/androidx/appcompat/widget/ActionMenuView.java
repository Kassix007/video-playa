package androidx.appcompat.widget;

import O3.D;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import i1.C1134a;
import i3.C1136a;
import l.C1211n;
import l.InterfaceC1208k;
import l.MenuC1209l;
import l.z;
import m.AbstractC1335u0;
import m.C1302e;
import m.C1308h;
import m.C1312j;
import m.C1316l;
import m.C1333t0;
import m.InterfaceC1314k;
import m.InterfaceC1318m;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC1335u0 implements InterfaceC1208k, z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public MenuC1209l f9146F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Context f9147G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f9148H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9149I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1312j f9150J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1134a f9151K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f9152L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f9153M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f9154N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f9155O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public InterfaceC1318m f9156P;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f9154N = (int) (56.0f * f);
        this.f9155O = (int) (f * 4.0f);
        this.f9147G = context;
        this.f9148H = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1316l j() {
        C1316l c1316l = new C1316l(-2, -2);
        c1316l.f14822a = false;
        ((LinearLayout.LayoutParams) c1316l).gravity = 16;
        return c1316l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1316l k(ViewGroup.LayoutParams layoutParams) {
        C1316l c1316l;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C1316l) {
            C1316l c1316l2 = (C1316l) layoutParams;
            c1316l = new C1316l(c1316l2);
            c1316l.f14822a = c1316l2.f14822a;
        } else {
            c1316l = new C1316l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1316l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1316l).gravity = 16;
        }
        return c1316l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.z
    public final void a(MenuC1209l menuC1209l) {
        this.f9146F = menuC1209l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1208k
    public final boolean c(C1211n c1211n) {
        return this.f9146F.q(c1211n, null, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1335u0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1316l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1335u0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C1333t0 generateDefaultLayoutParams() {
        return j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1335u0
    /* JADX INFO: renamed from: g */
    public final C1333t0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1316l(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1335u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1335u0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Menu getMenu() {
        if (this.f9146F == null) {
            Context context = getContext();
            MenuC1209l menuC1209l = new MenuC1209l(context);
            this.f9146F = menuC1209l;
            menuC1209l.f14355e = new C1136a(3, this);
            C1312j c1312j = new C1312j(context);
            this.f9150J = c1312j;
            c1312j.f14797C = true;
            c1312j.f14798D = true;
            c1312j.f14814u = new D(24);
            this.f9146F.b(c1312j, this.f9147G);
            C1312j c1312j2 = this.f9150J;
            c1312j2.f14817x = this;
            this.f9146F = c1312j2.f14812s;
        }
        return this.f9146F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getOverflowIcon() {
        getMenu();
        C1312j c1312j = this.f9150J;
        C1308h c1308h = c1312j.f14819z;
        if (c1308h != null) {
            return c1308h.getDrawable();
        }
        if (c1312j.f14796B) {
            return c1312j.f14795A;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getPopupTheme() {
        return this.f9148H;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1335u0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ C1333t0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean l(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1314k)) {
            zA = ((InterfaceC1314k) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1314k)) ? zA : ((InterfaceC1314k) childAt2).c() | zA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1312j c1312j = this.f9150J;
        if (c1312j != null) {
            c1312j.h(false);
            if (this.f9150J.e()) {
                this.f9150J.c();
                this.f9150J.n();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1312j c1312j = this.f9150J;
        if (c1312j != null) {
            c1312j.c();
            C1302e c1302e = c1312j.f14805K;
            if (c1302e == null || !c1302e.b()) {
                return;
            }
            c1302e.i.dismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1335u0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        int width;
        int paddingLeft;
        if (!this.f9152L) {
            super.onLayout(z5, i, i7, i8, i9);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i9 - i7) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i8 - i;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean z6 = g1.f14790a;
        boolean z7 = getLayoutDirection() == 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C1316l c1316l = (C1316l) childAt.getLayoutParams();
                if (c1316l.f14822a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z7) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c1316l).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1316l).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1316l).leftMargin) + ((LinearLayout.LayoutParams) c1316l).rightMargin;
                    l(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int iMax = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (z7) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                C1316l c1316l2 = (C1316l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1316l2.f14822a) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) c1316l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1316l2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            C1316l c1316l3 = (C1316l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1316l3.f14822a) {
                int i23 = paddingLeft2 + ((LinearLayout.LayoutParams) c1316l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c1316l3).rightMargin + iMax + i23;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // m.AbstractC1335u0, android.view.View
    public final void onMeasure(int i, int i7) {
        int i8;
        int i9;
        ?? r11;
        int i10;
        int i11;
        MenuC1209l menuC1209l;
        boolean z5 = this.f9152L;
        boolean z6 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f9152L = z6;
        if (z5 != z6) {
            this.f9153M = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f9152L && (menuC1209l = this.f9146F) != null && size != this.f9153M) {
            this.f9153M = size;
            menuC1209l.p(true);
        }
        int childCount = getChildCount();
        if (!this.f9152L || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                C1316l c1316l = (C1316l) getChildAt(i12).getLayoutParams();
                ((LinearLayout.LayoutParams) c1316l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1316l).leftMargin = 0;
            }
            super.onMeasure(i, i7);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, paddingBottom, -2);
        int i13 = size2 - paddingRight;
        int i14 = this.f9154N;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i18 = 0;
        int iMax2 = 0;
        int i19 = 0;
        boolean z7 = false;
        int i20 = 0;
        long j = 0;
        while (true) {
            i8 = this.f9155O;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i10 = i17;
            } else {
                boolean z8 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z8) {
                    childAt.setPadding(i8, 0, i8, 0);
                }
                C1316l c1316l2 = (C1316l) childAt.getLayoutParams();
                c1316l2.f = false;
                c1316l2.f14824c = 0;
                c1316l2.f14823b = 0;
                c1316l2.f14825d = false;
                ((LinearLayout.LayoutParams) c1316l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1316l2).rightMargin = 0;
                c1316l2.f14826e = z8 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i23 = c1316l2.f14822a ? 1 : i15;
                C1316l c1316l3 = (C1316l) childAt.getLayoutParams();
                int i24 = i15;
                i10 = i17;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i22, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z8 ? (ActionMenuItemView) childAt : null;
                boolean z9 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z10 = z9;
                if (i23 <= 0 || (z9 && i23 < 2)) {
                    i11 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i23, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i11 = measuredWidth / i10;
                    if (measuredWidth % i10 != 0) {
                        i11++;
                    }
                    if (z10 && i11 < 2) {
                        i11 = 2;
                    }
                }
                c1316l3.f14825d = !c1316l3.f14822a && z10;
                c1316l3.f14823b = i11;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i11);
                if (c1316l2.f14825d) {
                    i20++;
                }
                if (c1316l2.f14822a) {
                    z7 = true;
                }
                i15 = i24 - i11;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i11 == 1) {
                    j |= (long) (1 << i19);
                }
            }
            i19++;
            size3 = i21;
            paddingBottom = i22;
            i17 = i10;
        }
        int i25 = size3;
        int i26 = i15;
        int i27 = i17;
        boolean z11 = z7 && i18 == 2;
        int i28 = i26;
        boolean z12 = false;
        while (i20 > 0 && i28 > 0) {
            int i29 = Integer.MAX_VALUE;
            long j7 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i31 < childCount2) {
                int i32 = iMax;
                C1316l c1316l4 = (C1316l) getChildAt(i31).getLayoutParams();
                boolean z13 = z11;
                if (c1316l4.f14825d) {
                    int i33 = c1316l4.f14823b;
                    if (i33 < i29) {
                        j7 = 1 << i31;
                        i29 = i33;
                        i30 = 1;
                    } else if (i33 == i29) {
                        j7 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z11 = z13;
                iMax = i32;
            }
            i9 = iMax;
            boolean z14 = z11;
            j |= j7;
            if (i30 > i28) {
                break;
            }
            int i34 = i29 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C1316l c1316l5 = (C1316l) childAt2.getLayoutParams();
                boolean z15 = z7;
                long j8 = 1 << i35;
                if ((j7 & j8) != 0) {
                    if (z14 && c1316l5.f14826e) {
                        r11 = 1;
                        r11 = 1;
                        if (i28 == 1) {
                            childAt2.setPadding(i8 + i27, 0, i8, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c1316l5.f14823b += r11;
                    c1316l5.f = r11;
                    i28--;
                } else if (c1316l5.f14823b == i34) {
                    j |= j8;
                }
                i35++;
                z7 = z15;
            }
            z11 = z14;
            iMax = i9;
            z12 = true;
        }
        i9 = iMax;
        boolean z16 = !z7 && i18 == 1;
        if (i28 > 0 && j != 0 && (i28 < i18 - 1 || z16 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z16) {
                if ((j & 1) != 0 && !((C1316l) getChildAt(0).getLayoutParams()).f14826e) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount2 - 1;
                if ((j & ((long) (1 << i36))) != 0 && !((C1316l) getChildAt(i36).getLayoutParams()).f14826e) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i28 * i27) / fBitCount) : 0;
            boolean z17 = z12;
            for (int i38 = 0; i38 < childCount2; i38++) {
                if ((j & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    C1316l c1316l6 = (C1316l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1316l6.f14824c = i37;
                        c1316l6.f = true;
                        if (i38 == 0 && !c1316l6.f14826e) {
                            ((LinearLayout.LayoutParams) c1316l6).leftMargin = (-i37) / 2;
                        }
                        z17 = true;
                    } else if (c1316l6.f14822a) {
                        c1316l6.f14824c = i37;
                        c1316l6.f = true;
                        ((LinearLayout.LayoutParams) c1316l6).rightMargin = (-i37) / 2;
                        z17 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) c1316l6).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c1316l6).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z12 = z17;
        }
        if (z12) {
            for (int i39 = 0; i39 < childCount2; i39++) {
                View childAt4 = getChildAt(i39);
                C1316l c1316l7 = (C1316l) childAt4.getLayoutParams();
                if (c1316l7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1316l7.f14823b * i27) + c1316l7.f14824c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, mode != 1073741824 ? i9 : i25);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setExpandedActionViewsExclusive(boolean z5) {
        this.f9150J.f14802H = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnMenuItemClickListener(InterfaceC1318m interfaceC1318m) {
        this.f9156P = interfaceC1318m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1312j c1312j = this.f9150J;
        C1308h c1308h = c1312j.f14819z;
        if (c1308h != null) {
            c1308h.setImageDrawable(drawable);
        } else {
            c1312j.f14796B = true;
            c1312j.f14795A = drawable;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOverflowReserved(boolean z5) {
        this.f9149I = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPopupTheme(int i) {
        if (this.f9148H != i) {
            this.f9148H = i;
            if (i == 0) {
                this.f9147G = getContext();
            } else {
                this.f9147G = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPresenter(C1312j c1312j) {
        this.f9150J = c1312j;
        c1312j.f14817x = this;
        this.f9146F = c1312j.f14812s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // m.AbstractC1335u0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1316l(getContext(), attributeSet);
    }
}
