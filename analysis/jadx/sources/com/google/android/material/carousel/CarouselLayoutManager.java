package com.google.android.material.carousel;

import C0.RunnableC0089m;
import V3.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.w;
import com.wnapp.smspariaz.R;
import d2.AbstractC0960G;
import d2.C0961H;
import d2.C0966M;
import d2.C0971S;
import d2.InterfaceC0970Q;
import e4.C1052b;
import e4.C1053c;
import e4.C1055e;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0960G implements InterfaceC0970Q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1055e f11442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1053c f11443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f11444r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CarouselLayoutManager() {
        C1055e c1055e = new C1055e();
        new C1052b();
        this.f11444r = new View.OnLayoutChangeListener() { // from class: e4.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                if (i == i10 && i7 == i11 && i8 == i12 && i9 == i13) {
                    return;
                }
                view.post(new RunnableC0089m(17, this.f12634a));
            }
        };
        this.f11442p = c1055e;
        l0();
        C0(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean A0() {
        return this.f11443q.f12637a == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean B0() {
        return A0() && C() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C0(int i) {
        C1053c c1053c;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(i.i(i, "invalid orientation:"));
        }
        c(null);
        C1053c c1053c2 = this.f11443q;
        if (c1053c2 == null || i != c1053c2.f12637a) {
            if (i == 0) {
                c1053c = new C1053c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c1053c = new C1053c(this, 0);
            }
            this.f11443q = c1053c;
            l0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean L() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void Q(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C1055e c1055e = this.f11442p;
        float dimension = c1055e.f12640a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c1055e.f12640a = dimension;
        float dimension2 = c1055e.f12641b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c1055e.f12641b = dimension2;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f11444r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f11444r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // d2.AbstractC0960G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r4, int r5, d2.C0966M r6, d2.C0971S r7) {
        /*
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            e4.c r6 = r3.f11443q
            int r6 = r6.f12637a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.B0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.B0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = d2.AbstractC0960G.H(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.u(r6)
            int r4 = d2.AbstractC0960G.H(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.B()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            e4.c r4 = r3.f11443q
            r4.a()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.B0()
            if (r4 == 0) goto L86
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.u(r6)
            return r4
        L8b:
            int r4 = d2.AbstractC0960G.H(r4)
            int r5 = r3.B()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = d2.AbstractC0960G.H(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.B()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            e4.c r4 = r3.f11443q
            r4.a()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.B0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.u(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.S(android.view.View, int, d2.M, d2.S):android.view.View");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0960G.H(u(0)));
            accessibilityEvent.setToIndex(AbstractC0960G.H(u(v() - 1)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void W(int i, int i7) {
        B();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void Z(int i, int i7) {
        B();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.InterfaceC0970Q
    public final PointF a(int i) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void b0(C0966M c0966m, C0971S c0971s) {
        if (c0971s.b() > 0) {
            if ((A0() ? this.f11987n : this.f11988o) > 0.0f) {
                B0();
                View view = c0966m.i(0, Long.MAX_VALUE).f12032a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(c0966m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void c0(C0971S c0971s) {
        if (v() == 0) {
            return;
        }
        AbstractC0960G.H(u(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean d() {
        return A0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean e() {
        return !A0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int j(C0971S c0971s) {
        v();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int k(C0971S c0971s) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z6) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int l(C0971S c0971s) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int m(C0971S c0971s) {
        v();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int m0(int i, C0966M c0966m, C0971S c0971s) {
        if (!A0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c0966m.i(0, Long.MAX_VALUE).f12032a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int n(C0971S c0971s) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void n0(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int o(C0971S c0971s) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int o0(int i, C0966M c0966m, C0971S c0971s) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c0966m.i(0, Long.MAX_VALUE).f12032a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final C0961H r() {
        return new C0961H(-2, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void x0(RecyclerView recyclerView, int i) {
        w wVar = new w(this, recyclerView.getContext());
        wVar.f12201a = i;
        y0(wVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i7) {
        new C1052b();
        this.f11444r = new View.OnLayoutChangeListener() { // from class: e4.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i8, int i72, int i82, int i9, int i10, int i11, int i12, int i13) {
                if (i8 == i10 && i72 == i11 && i82 == i12 && i9 == i13) {
                    return;
                }
                view.post(new RunnableC0089m(17, this.f12634a));
            }
        };
        this.f11442p = new C1055e();
        l0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7978d);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            l0();
            C0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
