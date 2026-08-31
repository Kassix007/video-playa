package g1;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import d1.C0952c;
import d1.C0953d;
import e1.C1022b;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1076f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12910e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f12912h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1076f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f12912h = constraintLayout;
        this.f12906a = constraintLayout2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(int i, int i7, int i8) {
        if (i == i7) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i8 == size;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(C0953d c0953d, C1022b c1022b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z5;
        int measuredWidth;
        int baseline;
        int i;
        if (c0953d == null) {
            return;
        }
        C0952c c0952c = c0953d.f11834K;
        C0952c c0952c2 = c0953d.f11832I;
        if (c0953d.f11862g0 == 8) {
            c1022b.f12506e = 0;
            c1022b.f = 0;
            c1022b.f12507g = 0;
            return;
        }
        if (c0953d.f11843T == null) {
            return;
        }
        s sVar = ConstraintLayout.f9381F;
        int i7 = c1022b.f12502a;
        int i8 = c1022b.f12503b;
        int i9 = c1022b.f12504c;
        int i10 = c1022b.f12505d;
        int i11 = this.f12907b + this.f12908c;
        int i12 = this.f12909d;
        View view = c0953d.f11860f0;
        int iA = O.c.a(i7);
        if (iA == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else if (iA == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i12, -2);
        } else if (iA == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i12, -2);
            boolean z6 = c0953d.f11880r == 1;
            int i13 = c1022b.j;
            if (i13 == 1 || i13 == 2) {
                boolean z7 = view.getMeasuredHeight() == c0953d.k();
                if (c1022b.j == 2 || !z6 || ((z6 && z7) || c0953d.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0953d.q(), 1073741824);
                }
            }
        } else if (iA != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i14 = this.f;
            int i15 = c0952c2 != null ? c0952c2.f11822g : 0;
            if (c0952c != null) {
                i15 += c0952c.f11822g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i14, i12 + i15, -1);
        }
        int iA2 = O.c.a(i8);
        if (iA2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        } else if (iA2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f12911g, i11, -2);
        } else if (iA2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f12911g, i11, -2);
            boolean z8 = c0953d.f11881s == 1;
            int i16 = c1022b.j;
            if (i16 == 1 || i16 == 2) {
                boolean z9 = view.getMeasuredWidth() == c0953d.q();
                if (c1022b.j == 2 || !z8 || ((z8 && z9) || c0953d.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0953d.k(), 1073741824);
                }
            }
        } else if (iA2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i17 = this.f12911g;
            int i18 = c0952c2 != null ? c0953d.f11833J.f11822g : 0;
            if (c0952c != null) {
                i18 += c0953d.f11835L.f11822g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i11 + i18, -1);
        }
        d1.e eVar = (d1.e) c0953d.f11843T;
        ConstraintLayout constraintLayout = this.f12912h;
        if (eVar != null && d1.j.c(constraintLayout.f9395y, 256) && view.getMeasuredWidth() == c0953d.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == c0953d.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == c0953d.f11851a0 && !c0953d.z() && a(c0953d.f11830G, iMakeMeasureSpec, c0953d.q()) && a(c0953d.f11831H, iMakeMeasureSpec2, c0953d.k())) {
            c1022b.f12506e = c0953d.q();
            c1022b.f = c0953d.k();
            c1022b.f12507g = c0953d.f11851a0;
            return;
        }
        boolean z10 = i7 == 3;
        boolean z11 = i8 == 3;
        boolean z12 = i8 == 4 || i8 == 1;
        boolean z13 = i7 == 4 || i7 == 1;
        boolean z14 = z10 && c0953d.f11846W > 0.0f;
        boolean z15 = z11 && c0953d.f11846W > 0.0f;
        if (view == null) {
            return;
        }
        C1075e c1075e = (C1075e) view.getLayoutParams();
        int i19 = c1022b.j;
        if (i19 != 1 && i19 != 2 && z10 && c0953d.f11880r == 0 && z11 && c0953d.f11881s == 0) {
            z5 = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof t) && (c0953d instanceof d1.g)) {
                ((t) view).j((d1.g) c0953d, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c0953d.f11830G = iMakeMeasureSpec;
            c0953d.f11831H = iMakeMeasureSpec2;
            c0953d.f11861g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i20 = c0953d.f11883u;
            int iMax2 = i20 > 0 ? Math.max(i20, measuredWidth2) : measuredWidth2;
            int i21 = c0953d.f11884v;
            if (i21 > 0) {
                iMax2 = Math.min(i21, iMax2);
            }
            int i22 = c0953d.f11886x;
            iMax = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
            int i23 = iMakeMeasureSpec2;
            int i24 = c0953d.f11887y;
            if (i24 > 0) {
                iMax = Math.min(i24, iMax);
            }
            if (!d1.j.c(constraintLayout.f9395y, 1)) {
                if (z14 && z12) {
                    iMax2 = (int) ((iMax * c0953d.f11846W) + 0.5f);
                } else if (z15 && z13) {
                    iMax = (int) ((iMax2 / c0953d.f11846W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z5 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i23;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                c0953d.f11830G = iMakeMeasureSpec;
                c0953d.f11831H = iMakeMeasureSpec3;
                z5 = false;
                c0953d.f11861g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z16 = baseline != i ? true : z5;
        c1022b.i = (measuredWidth == c1022b.f12504c && iMax == c1022b.f12505d) ? z5 : true;
        boolean z17 = c1075e.f12872c0 ? true : z16;
        if (z17 && baseline != -1 && c0953d.f11851a0 != baseline) {
            c1022b.i = true;
        }
        c1022b.f12506e = measuredWidth;
        c1022b.f = iMax;
        c1022b.f12508h = z17;
        c1022b.f12507g = baseline;
    }
}
