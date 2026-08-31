package d2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: d2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0994t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12201a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f12202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC0960G f12203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12205e;
    public View f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0969P f12206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12207h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PointF f12208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f12209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f12211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12213p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0994t(Context context) {
        C0969P c0969p = new C0969P();
        c0969p.f12010d = -1;
        c0969p.f = false;
        c0969p.f12012g = 0;
        c0969p.f12007a = 0;
        c0969p.f12008b = 0;
        c0969p.f12009c = Integer.MIN_VALUE;
        c0969p.f12011e = null;
        this.f12206g = c0969p;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f12210m = false;
        this.f12212o = 0;
        this.f12213p = 0;
        this.f12209l = context.getResources().getDisplayMetrics();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(int i, int i7, int i8, int i9, int i10) {
        if (i10 == -1) {
            return i8 - i;
        }
        if (i10 != 0) {
            if (i10 == 1) {
                return i9 - i7;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i11 = i8 - i;
        if (i11 > 0) {
            return i11;
        }
        int i12 = i9 - i7;
        if (i12 < 0) {
            return i12;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int b(View view, int i) {
        AbstractC0960G abstractC0960G = this.f12203c;
        if (abstractC0960G == null || !abstractC0960G.d()) {
            return 0;
        }
        C0961H c0961h = (C0961H) view.getLayoutParams();
        return a((view.getLeft() - ((C0961H) view.getLayoutParams()).f11990b.left) - ((ViewGroup.MarginLayoutParams) c0961h).leftMargin, view.getRight() + ((C0961H) view.getLayoutParams()).f11990b.right + ((ViewGroup.MarginLayoutParams) c0961h).rightMargin, abstractC0960G.E(), abstractC0960G.f11987n - abstractC0960G.F(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int c(View view, int i) {
        AbstractC0960G abstractC0960G = this.f12203c;
        if (abstractC0960G == null || !abstractC0960G.e()) {
            return 0;
        }
        C0961H c0961h = (C0961H) view.getLayoutParams();
        return a((view.getTop() - ((C0961H) view.getLayoutParams()).f11990b.top) - ((ViewGroup.MarginLayoutParams) c0961h).topMargin, view.getBottom() + ((C0961H) view.getLayoutParams()).f11990b.bottom + ((ViewGroup.MarginLayoutParams) c0961h).bottomMargin, abstractC0960G.G(), abstractC0960G.f11988o - abstractC0960G.D(), i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f12210m) {
            this.f12211n = d(this.f12209l);
            this.f12210m = true;
        }
        return (int) Math.ceil(fAbs * this.f12211n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PointF f(int i) {
        Object obj = this.f12203c;
        if (obj instanceof InterfaceC0970Q) {
            return ((InterfaceC0970Q) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0970Q.class.getCanonicalName());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r9, int r10) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f12202b
            int r1 = r8.f12201a
            r2 = -1
            if (r1 == r2) goto L9
            if (r0 != 0) goto Lc
        L9:
            r8.i()
        Lc:
            boolean r1 = r8.f12204d
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L3d
            android.view.View r1 = r8.f
            if (r1 != 0) goto L3d
            d2.G r1 = r8.f12203c
            if (r1 == 0) goto L3d
            int r1 = r8.f12201a
            android.graphics.PointF r1 = r8.f(r1)
            if (r1 == 0) goto L3d
            float r5 = r1.x
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 != 0) goto L2e
            float r6 = r1.y
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L3d
        L2e:
            float r5 = java.lang.Math.signum(r5)
            int r5 = (int) r5
            float r1 = r1.y
            float r1 = java.lang.Math.signum(r1)
            int r1 = (int) r1
            r0.X(r5, r1, r3)
        L3d:
            r1 = 0
            r8.f12204d = r1
            android.view.View r5 = r8.f
            d2.P r6 = r8.f12206g
            if (r5 == 0) goto L70
            androidx.recyclerview.widget.RecyclerView r7 = r8.f12202b
            r7.getClass()
            d2.V r5 = androidx.recyclerview.widget.RecyclerView.I(r5)
            if (r5 == 0) goto L55
            int r2 = r5.b()
        L55:
            int r5 = r8.f12201a
            if (r2 != r5) goto L67
            android.view.View r2 = r8.f
            d2.S r3 = r0.f9653s0
            r8.h(r2, r6)
            r6.a(r0)
            r8.i()
            goto L70
        L67:
            java.lang.String r2 = "RecyclerView"
            java.lang.String r5 = "Passed over target position while smooth scrolling."
            android.util.Log.e(r2, r5)
            r8.f = r3
        L70:
            boolean r2 = r8.f12205e
            if (r2 == 0) goto L114
            d2.S r2 = r0.f9653s0
            androidx.recyclerview.widget.RecyclerView r2 = r8.f12202b
            d2.G r2 = r2.f9604B
            int r2 = r2.v()
            r3 = 1
            if (r2 != 0) goto L86
            r8.i()
            goto Lff
        L86:
            int r2 = r8.f12212o
            int r9 = r2 - r9
            int r2 = r2 * r9
            if (r2 > 0) goto L8e
            r9 = r1
        L8e:
            r8.f12212o = r9
            int r2 = r8.f12213p
            int r10 = r2 - r10
            int r2 = r2 * r10
            if (r2 > 0) goto L98
            r10 = r1
        L98:
            r8.f12213p = r10
            if (r9 != 0) goto Lff
            if (r10 != 0) goto Lff
            int r9 = r8.f12201a
            android.graphics.PointF r9 = r8.f(r9)
            if (r9 == 0) goto Lf8
            float r10 = r9.x
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb3
            float r2 = r9.y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb3
            goto Lf8
        Lb3:
            float r10 = r10 * r10
            float r2 = r9.y
            float r2 = r2 * r2
            float r2 = r2 + r10
            double r4 = (double) r2
            double r4 = java.lang.Math.sqrt(r4)
            float r10 = (float) r4
            float r2 = r9.x
            float r2 = r2 / r10
            r9.x = r2
            float r4 = r9.y
            float r4 = r4 / r10
            r9.y = r4
            r8.f12208k = r9
            r9 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 * r9
            int r10 = (int) r2
            r8.f12212o = r10
            float r4 = r4 * r9
            int r9 = (int) r4
            r8.f12213p = r9
            r9 = 10000(0x2710, float:1.4013E-41)
            int r9 = r8.e(r9)
            int r10 = r8.f12212o
            float r10 = (float) r10
            r2 = 1067030938(0x3f99999a, float:1.2)
            float r10 = r10 * r2
            int r10 = (int) r10
            int r4 = r8.f12213p
            float r4 = (float) r4
            float r4 = r4 * r2
            int r4 = (int) r4
            float r9 = (float) r9
            float r9 = r9 * r2
            int r9 = (int) r9
            r6.f12007a = r10
            r6.f12008b = r4
            r6.f12009c = r9
            android.view.animation.LinearInterpolator r9 = r8.i
            r6.f12011e = r9
            r6.f = r3
            goto Lff
        Lf8:
            int r9 = r8.f12201a
            r6.f12010d = r9
            r8.i()
        Lff:
            int r9 = r6.f12010d
            if (r9 < 0) goto L104
            r1 = r3
        L104:
            r6.a(r0)
            if (r1 == 0) goto L114
            boolean r9 = r8.f12205e
            if (r9 == 0) goto L114
            r8.f12204d = r3
            d2.U r9 = r0.f9647p0
            r9.a()
        L114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0994t.g(int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.view.View r7, d2.C0969P r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f12208k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.f12208k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.f12007a = r0
            r8.f12008b = r7
            r8.f12009c = r1
            android.view.animation.DecelerateInterpolator r7 = r6.j
            r8.f12011e = r7
            r8.f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0994t.h(android.view.View, d2.P):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        if (this.f12205e) {
            this.f12205e = false;
            this.f12213p = 0;
            this.f12212o = 0;
            this.f12208k = null;
            this.f12202b.f9653s0.f12013a = -1;
            this.f = null;
            this.f12201a = -1;
            this.f12204d = false;
            AbstractC0960G abstractC0960G = this.f12203c;
            if (abstractC0960G.f11981e == this) {
                abstractC0960G.f11981e = null;
            }
            this.f12203c = null;
            this.f12202b = null;
        }
    }
}
