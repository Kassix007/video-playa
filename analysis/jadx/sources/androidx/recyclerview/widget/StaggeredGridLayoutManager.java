package androidx.recyclerview.widget;

import A1.b;
import E0.a;
import E1.g;
import E3.h;
import Q.J;
import Z.m;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import d2.AbstractC0960G;
import d2.C0959F;
import d2.C0961H;
import d2.C0966M;
import d2.C0971S;
import d2.C0989o;
import d2.C0994t;
import d2.InterfaceC0970Q;
import d2.Z;
import d2.a0;
import d2.c0;
import d2.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import w1.AbstractC1835K;
import x1.e;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0960G implements InterfaceC0970Q {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final m f9669B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f9670C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f9671D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9672E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public c0 f9673F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f9674G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Z f9675H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f9676I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int[] f9677J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final b f9678K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f9679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0[] f9680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f9681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f9682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0989o f9685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9686w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f9688y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9687x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9689z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9668A = Integer.MIN_VALUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i7) {
        this.f9679p = -1;
        this.f9686w = false;
        m mVar = new m(6, false);
        this.f9669B = mVar;
        this.f9670C = 2;
        this.f9674G = new Rect();
        this.f9675H = new Z(this);
        this.f9676I = true;
        this.f9678K = new b(17, this);
        C0959F c0959fI = AbstractC0960G.I(context, attributeSet, i, i7);
        int i8 = c0959fI.f11973a;
        if (i8 != 0 && i8 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i8 != this.f9683t) {
            this.f9683t = i8;
            g gVar = this.f9681r;
            this.f9681r = this.f9682s;
            this.f9682s = gVar;
            l0();
        }
        int i9 = c0959fI.f11974b;
        c(null);
        if (i9 != this.f9679p) {
            int[] iArr = (int[]) mVar.f8312r;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            mVar.f8313s = null;
            l0();
            this.f9679p = i9;
            this.f9688y = new BitSet(this.f9679p);
            this.f9680q = new d0[this.f9679p];
            for (int i10 = 0; i10 < this.f9679p; i10++) {
                this.f9680q[i10] = new d0(this, i10);
            }
            l0();
        }
        boolean z5 = c0959fI.f11975c;
        c(null);
        c0 c0Var = this.f9673F;
        if (c0Var != null && c0Var.f12082x != z5) {
            c0Var.f12082x = z5;
        }
        this.f9686w = z5;
        l0();
        C0989o c0989o = new C0989o();
        c0989o.f12173a = true;
        c0989o.f = 0;
        c0989o.f12178g = 0;
        this.f9685v = c0989o;
        this.f9681r = g.a(this, this.f9683t);
        this.f9682s = g.a(this, 1 - this.f9683t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a1(int i, int i7, int i8) {
        int mode;
        return (!(i7 == 0 && i8 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i7) - i8), mode) : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean A0() {
        int iH0;
        if (v() != 0 && this.f9670C != 0 && this.f11982g) {
            if (this.f9687x) {
                iH0 = I0();
                H0();
            } else {
                iH0 = H0();
                I0();
            }
            if (iH0 == 0 && M0() != null) {
                m mVar = this.f9669B;
                int[] iArr = (int[]) mVar.f8312r;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                mVar.f8313s = null;
                this.f = true;
                l0();
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int B0(C0971S c0971s) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f9676I;
        return h.t(c0971s, this.f9681r, E0(z5), D0(z5), this, this.f9676I, this.f9687x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int C0(C0966M c0966m, C0989o c0989o, C0971S c0971s) {
        d0 d0Var;
        ?? r8;
        int iK;
        int iC;
        int iK2;
        int iC2;
        int i;
        int i7;
        int i8;
        int i9 = 0;
        int i10 = 1;
        this.f9688y.set(0, this.f9679p, true);
        C0989o c0989o2 = this.f9685v;
        int i11 = c0989o2.i ? c0989o.f12177e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0989o.f12177e == 1 ? c0989o.f12178g + c0989o.f12174b : c0989o.f - c0989o.f12174b;
        int i12 = c0989o.f12177e;
        for (int i13 = 0; i13 < this.f9679p; i13++) {
            if (!((ArrayList) this.f9680q[i13].f).isEmpty()) {
                Z0(this.f9680q[i13], i12, i11);
            }
        }
        int iG = this.f9687x ? this.f9681r.g() : this.f9681r.k();
        boolean z5 = false;
        while (true) {
            int i14 = c0989o.f12175c;
            if (i14 < 0 || i14 >= c0971s.b() || (!c0989o2.i && this.f9688y.isEmpty())) {
                break;
            }
            View view = c0966m.i(c0989o.f12175c, Long.MAX_VALUE).f12032a;
            c0989o.f12175c += c0989o.f12176d;
            a0 a0Var = (a0) view.getLayoutParams();
            int iB = a0Var.f11989a.b();
            m mVar = this.f9669B;
            int[] iArr = (int[]) mVar.f8312r;
            int i15 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i15 == -1) {
                if (Q0(c0989o.f12177e)) {
                    i8 = this.f9679p - i10;
                    i7 = -1;
                    i = -1;
                } else {
                    i = i10;
                    i7 = this.f9679p;
                    i8 = i9;
                }
                d0 d0Var2 = null;
                if (c0989o.f12177e == i10) {
                    int iK3 = this.f9681r.k();
                    int i16 = Integer.MAX_VALUE;
                    while (i8 != i7) {
                        d0 d0Var3 = this.f9680q[i8];
                        int i17 = d0Var3.i(iK3);
                        if (i17 < i16) {
                            i16 = i17;
                            d0Var2 = d0Var3;
                        }
                        i8 += i;
                    }
                } else {
                    int iG2 = this.f9681r.g();
                    int i18 = Integer.MIN_VALUE;
                    while (i8 != i7) {
                        d0 d0Var4 = this.f9680q[i8];
                        int iK4 = d0Var4.k(iG2);
                        if (iK4 > i18) {
                            d0Var2 = d0Var4;
                            i18 = iK4;
                        }
                        i8 += i;
                    }
                }
                d0Var = d0Var2;
                mVar.i(iB);
                ((int[]) mVar.f8312r)[iB] = d0Var.f12094e;
            } else {
                d0Var = this.f9680q[i15];
            }
            a0Var.f12062e = d0Var;
            if (c0989o.f12177e == 1) {
                r8 = 0;
                b(view, -1, false);
            } else {
                r8 = 0;
                b(view, 0, false);
            }
            if (this.f9683t == 1) {
                O0(view, AbstractC0960G.w(r8, this.f9684u, this.f11985l, r8, ((ViewGroup.MarginLayoutParams) a0Var).width), AbstractC0960G.w(true, this.f11988o, this.f11986m, D() + G(), ((ViewGroup.MarginLayoutParams) a0Var).height));
            } else {
                O0(view, AbstractC0960G.w(true, this.f11987n, this.f11985l, F() + E(), ((ViewGroup.MarginLayoutParams) a0Var).width), AbstractC0960G.w(false, this.f9684u, this.f11986m, 0, ((ViewGroup.MarginLayoutParams) a0Var).height));
            }
            if (c0989o.f12177e == 1) {
                iC = d0Var.i(iG);
                iK = this.f9681r.c(view) + iC;
            } else {
                iK = d0Var.k(iG);
                iC = iK - this.f9681r.c(view);
            }
            if (c0989o.f12177e == 1) {
                d0 d0Var5 = a0Var.f12062e;
                d0Var5.getClass();
                a0 a0Var2 = (a0) view.getLayoutParams();
                a0Var2.f12062e = d0Var5;
                ArrayList arrayList = (ArrayList) d0Var5.f;
                arrayList.add(view);
                d0Var5.f12092c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    d0Var5.f12091b = Integer.MIN_VALUE;
                }
                if (a0Var2.f11989a.h() || a0Var2.f11989a.k()) {
                    d0Var5.f12093d = ((StaggeredGridLayoutManager) d0Var5.f12095g).f9681r.c(view) + d0Var5.f12093d;
                }
            } else {
                d0 d0Var6 = a0Var.f12062e;
                d0Var6.getClass();
                a0 a0Var3 = (a0) view.getLayoutParams();
                a0Var3.f12062e = d0Var6;
                ArrayList arrayList2 = (ArrayList) d0Var6.f;
                arrayList2.add(0, view);
                d0Var6.f12091b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    d0Var6.f12092c = Integer.MIN_VALUE;
                }
                if (a0Var3.f11989a.h() || a0Var3.f11989a.k()) {
                    d0Var6.f12093d = ((StaggeredGridLayoutManager) d0Var6.f12095g).f9681r.c(view) + d0Var6.f12093d;
                }
            }
            if (N0() && this.f9683t == 1) {
                iC2 = this.f9682s.g() - (((this.f9679p - 1) - d0Var.f12094e) * this.f9684u);
                iK2 = iC2 - this.f9682s.c(view);
            } else {
                iK2 = this.f9682s.k() + (d0Var.f12094e * this.f9684u);
                iC2 = this.f9682s.c(view) + iK2;
            }
            if (this.f9683t == 1) {
                AbstractC0960G.N(view, iK2, iC, iC2, iK);
            } else {
                AbstractC0960G.N(view, iC, iK2, iK, iC2);
            }
            Z0(d0Var, c0989o2.f12177e, i11);
            S0(c0966m, c0989o2);
            if (c0989o2.f12179h && view.hasFocusable()) {
                this.f9688y.set(d0Var.f12094e, false);
            }
            i10 = 1;
            z5 = true;
            i9 = 0;
        }
        if (!z5) {
            S0(c0966m, c0989o2);
        }
        int iK5 = c0989o2.f12177e == -1 ? this.f9681r.k() - K0(this.f9681r.k()) : J0(this.f9681r.g()) - this.f9681r.g();
        if (iK5 > 0) {
            return Math.min(c0989o.f12174b, iK5);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View D0(boolean z5) {
        int iK = this.f9681r.k();
        int iG = this.f9681r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.f9681r.e(viewU);
            int iB = this.f9681r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z5) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View E0(boolean z5) {
        int iK = this.f9681r.k();
        int iG = this.f9681r.g();
        int iV = v();
        View view = null;
        for (int i = 0; i < iV; i++) {
            View viewU = u(i);
            int iE = this.f9681r.e(viewU);
            if (this.f9681r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z5) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F0(C0966M c0966m, C0971S c0971s, boolean z5) {
        int iG;
        int iJ0 = J0(Integer.MIN_VALUE);
        if (iJ0 != Integer.MIN_VALUE && (iG = this.f9681r.g() - iJ0) > 0) {
            int i = iG - (-W0(-iG, c0966m, c0971s));
            if (!z5 || i <= 0) {
                return;
            }
            this.f9681r.o(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G0(C0966M c0966m, C0971S c0971s, boolean z5) {
        int iK;
        int iK0 = K0(Integer.MAX_VALUE);
        if (iK0 != Integer.MAX_VALUE && (iK = iK0 - this.f9681r.k()) > 0) {
            int iW0 = iK - W0(iK, c0966m, c0971s);
            if (!z5 || iW0 <= 0) {
                return;
            }
            this.f9681r.o(-iW0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int H0() {
        if (v() == 0) {
            return 0;
        }
        return AbstractC0960G.H(u(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int I0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return AbstractC0960G.H(u(iV - 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int J(C0966M c0966m, C0971S c0971s) {
        return this.f9683t == 0 ? this.f9679p : super.J(c0966m, c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int J0(int i) {
        int i7 = this.f9680q[0].i(i);
        for (int i8 = 1; i8 < this.f9679p; i8++) {
            int i9 = this.f9680q[i8].i(i);
            if (i9 > i7) {
                i7 = i9;
            }
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int K0(int i) {
        int iK = this.f9680q[0].k(i);
        for (int i7 = 1; i7 < this.f9679p; i7++) {
            int iK2 = this.f9680q[i7].k(i);
            if (iK2 < iK) {
                iK = iK2;
            }
        }
        return iK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean L() {
        return this.f9670C != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(int r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.f9687x
            if (r0 == 0) goto L9
            int r0 = r9.I0()
            goto Ld
        L9:
            int r0 = r9.H0()
        Ld:
            r1 = 8
            if (r12 != r1) goto L1b
            if (r10 >= r11) goto L17
            int r2 = r11 + 1
        L15:
            r3 = r10
            goto L1e
        L17:
            int r2 = r10 + 1
            r3 = r11
            goto L1e
        L1b:
            int r2 = r10 + r11
            goto L15
        L1e:
            Z.m r4 = r9.f9669B
            java.lang.Object r5 = r4.f8312r
            int[] r5 = (int[]) r5
            if (r5 != 0) goto L28
            goto La9
        L28:
            int r5 = r5.length
            if (r3 < r5) goto L2d
            goto La9
        L2d:
            java.lang.Object r5 = r4.f8313s
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r6 = -1
            if (r5 != 0) goto L36
        L34:
            r5 = r6
            goto L90
        L36:
            if (r5 != 0) goto L39
            goto L53
        L39:
            int r5 = r5.size()
            int r5 = r5 + (-1)
        L3f:
            if (r5 < 0) goto L53
            java.lang.Object r7 = r4.f8313s
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r5)
            d2.b0 r7 = (d2.b0) r7
            int r8 = r7.f12066q
            if (r8 != r3) goto L50
            goto L54
        L50:
            int r5 = r5 + (-1)
            goto L3f
        L53:
            r7 = 0
        L54:
            if (r7 == 0) goto L5d
            java.lang.Object r5 = r4.f8313s
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.remove(r7)
        L5d:
            java.lang.Object r5 = r4.f8313s
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            r7 = 0
        L66:
            if (r7 >= r5) goto L7a
            java.lang.Object r8 = r4.f8313s
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r7)
            d2.b0 r8 = (d2.b0) r8
            int r8 = r8.f12066q
            if (r8 < r3) goto L77
            goto L7b
        L77:
            int r7 = r7 + 1
            goto L66
        L7a:
            r7 = r6
        L7b:
            if (r7 == r6) goto L34
            java.lang.Object r5 = r4.f8313s
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r7)
            d2.b0 r5 = (d2.b0) r5
            java.lang.Object r8 = r4.f8313s
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.remove(r7)
            int r5 = r5.f12066q
        L90:
            if (r5 != r6) goto La0
            java.lang.Object r5 = r4.f8312r
            int[] r5 = (int[]) r5
            int r7 = r5.length
            java.util.Arrays.fill(r5, r3, r7, r6)
            java.lang.Object r5 = r4.f8312r
            int[] r5 = (int[]) r5
            int r5 = r5.length
            goto La9
        La0:
            java.lang.Object r7 = r4.f8312r
            int[] r7 = (int[]) r7
            int r5 = r5 + 1
            java.util.Arrays.fill(r7, r3, r5, r6)
        La9:
            r5 = 1
            if (r12 == r5) goto Lbd
            r6 = 2
            if (r12 == r6) goto Lb9
            if (r12 == r1) goto Lb2
            goto Lc0
        Lb2:
            r4.u(r10, r5)
            r4.t(r11, r5)
            goto Lc0
        Lb9:
            r4.u(r10, r11)
            goto Lc0
        Lbd:
            r4.t(r10, r11)
        Lc0:
            if (r2 > r0) goto Lc3
            goto Ld5
        Lc3:
            boolean r10 = r9.f9687x
            if (r10 == 0) goto Lcc
            int r10 = r9.H0()
            goto Ld0
        Lcc:
            int r10 = r9.I0()
        Ld0:
            if (r3 > r10) goto Ld5
            r9.l0()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.L0(int, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View M0() {
        /*
            r13 = this;
            int r0 = r13.v()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f9679p
            r2.<init>(r3)
            int r3 = r13.f9679p
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r13.f9683t
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r13.N0()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r13.f9687x
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto L108
            android.view.View r7 = r13.u(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            d2.a0 r8 = (d2.a0) r8
            d2.d0 r9 = r8.f12062e
            int r9 = r9.f12094e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto Lbe
            d2.d0 r9 = r8.f12062e
            boolean r10 = r13.f9687x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L75
            int r10 = r9.f12092c
            if (r10 == r11) goto L4f
            goto L54
        L4f:
            r9.a()
            int r10 = r9.f12092c
        L54:
            E1.g r11 = r13.f9681r
            int r11 = r11.g()
            if (r10 >= r11) goto Lb7
            java.lang.Object r0 = r9.f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 - r5
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            d2.a0 r0 = (d2.a0) r0
            r0.getClass()
            return r7
        L75:
            int r10 = r9.f12091b
            if (r10 == r11) goto L7a
            goto L9b
        L7a:
            java.lang.Object r10 = r9.f
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            d2.a0 r11 = (d2.a0) r11
            java.lang.Object r12 = r9.f12095g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r12
            E1.g r12 = r12.f9681r
            int r10 = r12.e(r10)
            r9.f12091b = r10
            r11.getClass()
            int r10 = r9.f12091b
        L9b:
            E1.g r11 = r13.f9681r
            int r11 = r11.k()
            if (r10 <= r11) goto Lb7
            java.lang.Object r0 = r9.f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r4)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            d2.a0 r0 = (d2.a0) r0
            r0.getClass()
            return r7
        Lb7:
            d2.d0 r9 = r8.f12062e
            int r9 = r9.f12094e
            r2.clear(r9)
        Lbe:
            int r1 = r1 + r6
            if (r1 == r0) goto L2c
            android.view.View r9 = r13.u(r1)
            boolean r10 = r13.f9687x
            if (r10 == 0) goto Ldb
            E1.g r10 = r13.f9681r
            int r10 = r10.b(r7)
            E1.g r11 = r13.f9681r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto Ld8
            goto L107
        Ld8:
            if (r10 != r11) goto L2c
            goto Lec
        Ldb:
            E1.g r10 = r13.f9681r
            int r10 = r10.e(r7)
            E1.g r11 = r13.f9681r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto Lea
            goto L107
        Lea:
            if (r10 != r11) goto L2c
        Lec:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            d2.a0 r9 = (d2.a0) r9
            d2.d0 r8 = r8.f12062e
            int r8 = r8.f12094e
            d2.d0 r9 = r9.f12062e
            int r9 = r9.f12094e
            int r8 = r8 - r9
            if (r8 >= 0) goto Lff
            r8 = r5
            goto L100
        Lff:
            r8 = r4
        L100:
            if (r3 >= 0) goto L104
            r9 = r5
            goto L105
        L104:
            r9 = r4
        L105:
            if (r8 == r9) goto L2c
        L107:
            return r7
        L108:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.M0():android.view.View");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean N0() {
        return C() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void O(int i) {
        super.O(i);
        for (int i7 = 0; i7 < this.f9679p; i7++) {
            d0 d0Var = this.f9680q[i7];
            int i8 = d0Var.f12091b;
            if (i8 != Integer.MIN_VALUE) {
                d0Var.f12091b = i8 + i;
            }
            int i9 = d0Var.f12092c;
            if (i9 != Integer.MIN_VALUE) {
                d0Var.f12092c = i9 + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O0(View view, int i, int i7) {
        RecyclerView recyclerView = this.f11978b;
        Rect rect = this.f9674G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        a0 a0Var = (a0) view.getLayoutParams();
        int iA1 = a1(i, ((ViewGroup.MarginLayoutParams) a0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) a0Var).rightMargin + rect.right);
        int iA12 = a1(i7, ((ViewGroup.MarginLayoutParams) a0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) a0Var).bottomMargin + rect.bottom);
        if (u0(view, iA1, iA12, a0Var)) {
            view.measure(iA1, iA12);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void P(int i) {
        super.P(i);
        for (int i7 = 0; i7 < this.f9679p; i7++) {
            d0 d0Var = this.f9680q[i7];
            int i8 = d0Var.f12091b;
            if (i8 != Integer.MIN_VALUE) {
                d0Var.f12091b = i8 + i;
            }
            int i9 = d0Var.f12092c;
            if (i9 != Integer.MIN_VALUE) {
                d0Var.f12092c = i9 + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0421  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P0(d2.C0966M r17, d2.C0971S r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            d2.c0 r3 = r0.f9673F
            r4 = -1
            d2.Z r5 = r0.f9675H
            if (r3 != 0) goto L11
            int r3 = r0.f9689z
            if (r3 == r4) goto L1e
        L11:
            int r3 = r2.b()
            if (r3 != 0) goto L1e
            r16.g0(r17)
            r5.a()
            return
        L1e:
            boolean r3 = r5.f12057e
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = r5.f12058g
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L31
            int r3 = r0.f9689z
            if (r3 != r4) goto L31
            d2.c0 r3 = r0.f9673F
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = r7
            goto L32
        L31:
            r3 = r8
        L32:
            r9 = 0
            Z.m r10 = r0.f9669B
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L220
            r5.a()
            d2.c0 r12 = r0.f9673F
            if (r12 == 0) goto Lc3
            int r13 = r12.f12077s
            if (r13 <= 0) goto L88
            int r14 = r0.f9679p
            if (r13 != r14) goto L7a
            r12 = r7
        L49:
            int r13 = r0.f9679p
            if (r12 >= r13) goto L88
            d2.d0[] r13 = r0.f9680q
            r13 = r13[r12]
            r13.b()
            d2.c0 r13 = r0.f9673F
            int[] r14 = r13.f12078t
            r14 = r14[r12]
            if (r14 == r11) goto L6f
            boolean r13 = r13.f12083y
            if (r13 == 0) goto L68
            E1.g r13 = r0.f9681r
            int r13 = r13.g()
        L66:
            int r14 = r14 + r13
            goto L6f
        L68:
            E1.g r13 = r0.f9681r
            int r13 = r13.k()
            goto L66
        L6f:
            d2.d0[] r13 = r0.f9680q
            r13 = r13[r12]
            r13.f12091b = r14
            r13.f12092c = r14
            int r12 = r12 + 1
            goto L49
        L7a:
            r12.f12078t = r9
            r12.f12077s = r7
            r12.f12079u = r7
            r12.f12080v = r9
            r12.f12081w = r9
            int r13 = r12.f12076r
            r12.f12075q = r13
        L88:
            d2.c0 r12 = r0.f9673F
            boolean r13 = r12.f12084z
            r0.f9672E = r13
            boolean r12 = r12.f12082x
            r0.c(r9)
            d2.c0 r13 = r0.f9673F
            if (r13 == 0) goto L9d
            boolean r14 = r13.f12082x
            if (r14 == r12) goto L9d
            r13.f12082x = r12
        L9d:
            r0.f9686w = r12
            r0.l0()
            r0.V0()
            d2.c0 r12 = r0.f9673F
            int r13 = r12.f12075q
            if (r13 == r4) goto Lb2
            r0.f9689z = r13
            boolean r13 = r12.f12083y
            r5.f12055c = r13
            goto Lb6
        Lb2:
            boolean r13 = r0.f9687x
            r5.f12055c = r13
        Lb6:
            int r13 = r12.f12079u
            if (r13 <= r8) goto Lca
            int[] r13 = r12.f12080v
            r10.f8312r = r13
            java.util.ArrayList r12 = r12.f12081w
            r10.f8313s = r12
            goto Lca
        Lc3:
            r0.V0()
            boolean r12 = r0.f9687x
            r5.f12055c = r12
        Lca:
            boolean r12 = r2.f12018g
            if (r12 != 0) goto L1dd
            int r12 = r0.f9689z
            if (r12 != r4) goto Ld4
            goto L1dd
        Ld4:
            if (r12 < 0) goto L1d9
            int r13 = r2.b()
            if (r12 < r13) goto Lde
            goto L1d9
        Lde:
            d2.c0 r12 = r0.f9673F
            if (r12 == 0) goto Lf3
            int r13 = r12.f12075q
            if (r13 == r4) goto Lf3
            int r12 = r12.f12077s
            if (r12 >= r8) goto Leb
            goto Lf3
        Leb:
            r5.f12054b = r11
            int r12 = r0.f9689z
            r5.f12053a = r12
            goto L21e
        Lf3:
            int r12 = r0.f9689z
            android.view.View r12 = r0.q(r12)
            if (r12 == 0) goto L188
            boolean r13 = r0.f9687x
            if (r13 == 0) goto L104
            int r13 = r0.I0()
            goto L108
        L104:
            int r13 = r0.H0()
        L108:
            r5.f12053a = r13
            int r13 = r0.f9668A
            if (r13 == r11) goto L13a
            boolean r13 = r5.f12055c
            if (r13 == 0) goto L126
            E1.g r13 = r0.f9681r
            int r13 = r13.g()
            int r14 = r0.f9668A
            int r13 = r13 - r14
            E1.g r14 = r0.f9681r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            r5.f12054b = r13
            goto L21e
        L126:
            E1.g r13 = r0.f9681r
            int r13 = r13.k()
            int r14 = r0.f9668A
            int r13 = r13 + r14
            E1.g r14 = r0.f9681r
            int r12 = r14.e(r12)
            int r13 = r13 - r12
            r5.f12054b = r13
            goto L21e
        L13a:
            E1.g r13 = r0.f9681r
            int r13 = r13.c(r12)
            E1.g r14 = r0.f9681r
            int r14 = r14.l()
            if (r13 <= r14) goto L15d
            boolean r12 = r5.f12055c
            if (r12 == 0) goto L153
            E1.g r12 = r0.f9681r
            int r12 = r12.g()
            goto L159
        L153:
            E1.g r12 = r0.f9681r
            int r12 = r12.k()
        L159:
            r5.f12054b = r12
            goto L21e
        L15d:
            E1.g r13 = r0.f9681r
            int r13 = r13.e(r12)
            E1.g r14 = r0.f9681r
            int r14 = r14.k()
            int r13 = r13 - r14
            if (r13 >= 0) goto L171
            int r12 = -r13
            r5.f12054b = r12
            goto L21e
        L171:
            E1.g r13 = r0.f9681r
            int r13 = r13.g()
            E1.g r14 = r0.f9681r
            int r12 = r14.b(r12)
            int r13 = r13 - r12
            if (r13 >= 0) goto L184
            r5.f12054b = r13
            goto L21e
        L184:
            r5.f12054b = r11
            goto L21e
        L188:
            int r12 = r0.f9689z
            r5.f12053a = r12
            int r13 = r0.f9668A
            if (r13 != r11) goto L1bf
            int r13 = r0.v()
            if (r13 != 0) goto L19b
            boolean r12 = r0.f9687x
            if (r12 == 0) goto L1a8
            goto L1aa
        L19b:
            int r13 = r0.H0()
            if (r12 >= r13) goto L1a3
            r12 = r8
            goto L1a4
        L1a3:
            r12 = r7
        L1a4:
            boolean r13 = r0.f9687x
            if (r12 == r13) goto L1aa
        L1a8:
            r12 = r7
            goto L1ab
        L1aa:
            r12 = r8
        L1ab:
            r5.f12055c = r12
            if (r12 == 0) goto L1b6
            E1.g r12 = r6.f9681r
            int r12 = r12.g()
            goto L1bc
        L1b6:
            E1.g r12 = r6.f9681r
            int r12 = r12.k()
        L1bc:
            r5.f12054b = r12
            goto L1d6
        L1bf:
            boolean r12 = r5.f12055c
            if (r12 == 0) goto L1cd
            E1.g r12 = r6.f9681r
            int r12 = r12.g()
            int r12 = r12 - r13
            r5.f12054b = r12
            goto L1d6
        L1cd:
            E1.g r12 = r6.f9681r
            int r12 = r12.k()
            int r12 = r12 + r13
            r5.f12054b = r12
        L1d6:
            r5.f12056d = r8
            goto L21e
        L1d9:
            r0.f9689z = r4
            r0.f9668A = r11
        L1dd:
            boolean r12 = r0.f9671D
            if (r12 == 0) goto L1fe
            int r12 = r2.b()
            int r13 = r0.v()
            int r13 = r13 - r8
        L1ea:
            if (r13 < 0) goto L1fc
            android.view.View r14 = r0.u(r13)
            int r14 = d2.AbstractC0960G.H(r14)
            if (r14 < 0) goto L1f9
            if (r14 >= r12) goto L1f9
            goto L21a
        L1f9:
            int r13 = r13 + (-1)
            goto L1ea
        L1fc:
            r14 = r7
            goto L21a
        L1fe:
            int r12 = r2.b()
            int r13 = r0.v()
            r14 = r7
        L207:
            if (r14 >= r13) goto L1fc
            android.view.View r15 = r0.u(r14)
            int r15 = d2.AbstractC0960G.H(r15)
            if (r15 < 0) goto L217
            if (r15 >= r12) goto L217
            r14 = r15
            goto L21a
        L217:
            int r14 = r14 + 1
            goto L207
        L21a:
            r5.f12053a = r14
            r5.f12054b = r11
        L21e:
            r5.f12057e = r8
        L220:
            d2.c0 r12 = r0.f9673F
            if (r12 != 0) goto L243
            int r12 = r0.f9689z
            if (r12 != r4) goto L243
            boolean r12 = r5.f12055c
            boolean r13 = r0.f9671D
            if (r12 != r13) goto L236
            boolean r12 = r0.N0()
            boolean r13 = r0.f9672E
            if (r12 == r13) goto L243
        L236:
            java.lang.Object r12 = r10.f8312r
            int[] r12 = (int[]) r12
            if (r12 == 0) goto L23f
            java.util.Arrays.fill(r12, r4)
        L23f:
            r10.f8313s = r9
            r5.f12056d = r8
        L243:
            int r9 = r0.v()
            if (r9 <= 0) goto L2f0
            d2.c0 r9 = r0.f9673F
            if (r9 == 0) goto L251
            int r9 = r9.f12077s
            if (r9 >= r8) goto L2f0
        L251:
            boolean r9 = r5.f12056d
            if (r9 == 0) goto L270
            r3 = r7
        L256:
            int r6 = r0.f9679p
            if (r3 >= r6) goto L2f0
            d2.d0[] r6 = r0.f9680q
            r6 = r6[r3]
            r6.b()
            int r6 = r5.f12054b
            if (r6 == r11) goto L26d
            d2.d0[] r9 = r0.f9680q
            r9 = r9[r3]
            r9.f12091b = r6
            r9.f12092c = r6
        L26d:
            int r3 = r3 + 1
            goto L256
        L270:
            if (r3 != 0) goto L28e
            int[] r3 = r5.f
            if (r3 != 0) goto L277
            goto L28e
        L277:
            r3 = r7
        L278:
            int r6 = r0.f9679p
            if (r3 >= r6) goto L2f0
            d2.d0[] r6 = r0.f9680q
            r6 = r6[r3]
            r6.b()
            int[] r9 = r5.f
            r9 = r9[r3]
            r6.f12091b = r9
            r6.f12092c = r9
            int r3 = r3 + 1
            goto L278
        L28e:
            r3 = r7
        L28f:
            int r9 = r0.f9679p
            if (r3 >= r9) goto L2cf
            d2.d0[] r9 = r0.f9680q
            r9 = r9[r3]
            boolean r10 = r0.f9687x
            int r12 = r5.f12054b
            java.lang.Object r13 = r9.f12095g
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r13
            if (r10 == 0) goto L2a6
            int r14 = r9.i(r11)
            goto L2aa
        L2a6:
            int r14 = r9.k(r11)
        L2aa:
            r9.b()
            if (r14 != r11) goto L2b0
            goto L2cc
        L2b0:
            if (r10 == 0) goto L2ba
            E1.g r15 = r13.f9681r
            int r15 = r15.g()
            if (r14 < r15) goto L2cc
        L2ba:
            if (r10 != 0) goto L2c5
            E1.g r10 = r13.f9681r
            int r10 = r10.k()
            if (r14 <= r10) goto L2c5
            goto L2cc
        L2c5:
            if (r12 == r11) goto L2c8
            int r14 = r14 + r12
        L2c8:
            r9.f12092c = r14
            r9.f12091b = r14
        L2cc:
            int r3 = r3 + 1
            goto L28f
        L2cf:
            d2.d0[] r3 = r0.f9680q
            int r9 = r3.length
            int[] r10 = r5.f
            if (r10 == 0) goto L2d9
            int r10 = r10.length
            if (r10 >= r9) goto L2e0
        L2d9:
            d2.d0[] r6 = r6.f9680q
            int r6 = r6.length
            int[] r6 = new int[r6]
            r5.f = r6
        L2e0:
            r6 = r7
        L2e1:
            if (r6 >= r9) goto L2f0
            int[] r10 = r5.f
            r12 = r3[r6]
            int r12 = r12.k(r11)
            r10[r6] = r12
            int r6 = r6 + 1
            goto L2e1
        L2f0:
            r16.p(r17)
            d2.o r3 = r0.f9685v
            r3.f12173a = r7
            E1.g r6 = r0.f9682s
            int r6 = r6.l()
            int r9 = r0.f9679p
            int r9 = r6 / r9
            r0.f9684u = r9
            E1.g r9 = r0.f9682s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            int r6 = r5.f12053a
            r0.Y0(r6, r2)
            boolean r6 = r5.f12055c
            if (r6 == 0) goto L329
            r0.X0(r4)
            r0.C0(r1, r3, r2)
            r0.X0(r8)
            int r4 = r5.f12053a
            int r6 = r3.f12176d
            int r4 = r4 + r6
            r3.f12175c = r4
            r0.C0(r1, r3, r2)
            goto L33c
        L329:
            r0.X0(r8)
            r0.C0(r1, r3, r2)
            r0.X0(r4)
            int r4 = r5.f12053a
            int r6 = r3.f12176d
            int r4 = r4 + r6
            r3.f12175c = r4
            r0.C0(r1, r3, r2)
        L33c:
            E1.g r3 = r0.f9682s
            int r3 = r3.i()
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 != r4) goto L348
            goto L3e4
        L348:
            int r3 = r0.v()
            r4 = 0
            r6 = r7
        L34e:
            if (r6 >= r3) goto L370
            android.view.View r9 = r0.u(r6)
            E1.g r10 = r0.f9682s
            int r10 = r10.c(r9)
            float r10 = (float) r10
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 >= 0) goto L360
            goto L36d
        L360:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            d2.a0 r9 = (d2.a0) r9
            r9.getClass()
            float r4 = java.lang.Math.max(r4, r10)
        L36d:
            int r6 = r6 + 1
            goto L34e
        L370:
            int r6 = r0.f9684u
            int r9 = r0.f9679p
            float r9 = (float) r9
            float r4 = r4 * r9
            int r4 = java.lang.Math.round(r4)
            E1.g r9 = r0.f9682s
            int r9 = r9.i()
            if (r9 != r11) goto L38c
            E1.g r9 = r0.f9682s
            int r9 = r9.l()
            int r4 = java.lang.Math.min(r4, r9)
        L38c:
            int r9 = r0.f9679p
            int r9 = r4 / r9
            r0.f9684u = r9
            E1.g r9 = r0.f9682s
            int r9 = r9.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            int r4 = r0.f9684u
            if (r4 != r6) goto L3a0
            goto L3e4
        L3a0:
            r4 = r7
        L3a1:
            if (r4 >= r3) goto L3e4
            android.view.View r9 = r0.u(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            d2.a0 r10 = (d2.a0) r10
            r10.getClass()
            boolean r11 = r0.N0()
            if (r11 == 0) goto L3cc
            int r11 = r0.f9683t
            if (r11 != r8) goto L3cc
            int r11 = r0.f9679p
            int r11 = r11 - r8
            d2.d0 r10 = r10.f12062e
            int r10 = r10.f12094e
            int r11 = r11 - r10
            int r10 = -r11
            int r11 = r0.f9684u
            int r11 = r11 * r10
            int r10 = r10 * r6
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L3e1
        L3cc:
            d2.d0 r10 = r10.f12062e
            int r10 = r10.f12094e
            int r11 = r0.f9684u
            int r11 = r11 * r10
            int r10 = r10 * r6
            int r12 = r0.f9683t
            if (r12 != r8) goto L3dd
            int r11 = r11 - r10
            r9.offsetLeftAndRight(r11)
            goto L3e1
        L3dd:
            int r11 = r11 - r10
            r9.offsetTopAndBottom(r11)
        L3e1:
            int r4 = r4 + 1
            goto L3a1
        L3e4:
            int r3 = r0.v()
            if (r3 <= 0) goto L3fb
            boolean r3 = r0.f9687x
            if (r3 == 0) goto L3f5
            r0.F0(r1, r2, r8)
            r0.G0(r1, r2, r7)
            goto L3fb
        L3f5:
            r0.G0(r1, r2, r8)
            r0.F0(r1, r2, r7)
        L3fb:
            if (r19 == 0) goto L421
            boolean r3 = r2.f12018g
            if (r3 != 0) goto L421
            int r3 = r0.f9670C
            if (r3 == 0) goto L421
            int r3 = r0.v()
            if (r3 <= 0) goto L421
            android.view.View r3 = r0.M0()
            if (r3 == 0) goto L421
            androidx.recyclerview.widget.RecyclerView r3 = r0.f11978b
            if (r3 == 0) goto L41a
            A1.b r4 = r0.f9678K
            r3.removeCallbacks(r4)
        L41a:
            boolean r3 = r0.A0()
            if (r3 == 0) goto L421
            goto L422
        L421:
            r8 = r7
        L422:
            boolean r3 = r2.f12018g
            if (r3 == 0) goto L429
            r5.a()
        L429:
            boolean r3 = r5.f12055c
            r0.f9671D = r3
            boolean r3 = r0.N0()
            r0.f9672E = r3
            if (r8 == 0) goto L43b
            r5.a()
            r0.P0(r1, r2, r7)
        L43b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P0(d2.M, d2.S, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean Q0(int i) {
        if (this.f9683t == 0) {
            return (i == -1) != this.f9687x;
        }
        return ((i == -1) == this.f9687x) == N0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void R(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f11978b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f9678K);
        }
        for (int i = 0; i < this.f9679p; i++) {
            this.f9680q[i].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R0(int i, C0971S c0971s) {
        int iH0;
        int i7;
        if (i > 0) {
            iH0 = I0();
            i7 = 1;
        } else {
            iH0 = H0();
            i7 = -1;
        }
        C0989o c0989o = this.f9685v;
        c0989o.f12173a = true;
        Y0(iH0, c0971s);
        X0(i7);
        c0989o.f12175c = iH0 + c0989o.f12176d;
        c0989o.f12174b = Math.abs(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // d2.AbstractC0960G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r9, int r10, d2.C0966M r11, d2.C0971S r12) {
        /*
            r8 = this;
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L9
            goto L15f
        L9:
            androidx.recyclerview.widget.RecyclerView r0 = r8.f11978b
            if (r0 != 0) goto Le
            goto L21
        Le:
            android.view.View r9 = r0.A(r9)
            if (r9 != 0) goto L15
            goto L21
        L15:
            B0.G0 r0 = r8.f11977a
            java.lang.Object r0 = r0.f236t
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L22
        L21:
            r9 = r1
        L22:
            if (r9 != 0) goto L26
            goto L15f
        L26:
            r8.V0()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r10 == r3) goto L66
            r4 = 2
            if (r10 == r4) goto L5a
            r4 = 17
            if (r10 == r4) goto L55
            r4 = 33
            if (r10 == r4) goto L4f
            r4 = 66
            if (r10 == r4) goto L4a
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L44
        L42:
            r10 = r0
            goto L72
        L44:
            int r10 = r8.f9683t
            if (r10 != r3) goto L42
        L48:
            r10 = r3
            goto L72
        L4a:
            int r10 = r8.f9683t
            if (r10 != 0) goto L42
            goto L48
        L4f:
            int r10 = r8.f9683t
            if (r10 != r3) goto L42
        L53:
            r10 = r2
            goto L72
        L55:
            int r10 = r8.f9683t
            if (r10 != 0) goto L42
        L59:
            goto L53
        L5a:
            int r10 = r8.f9683t
            if (r10 != r3) goto L5f
            goto L48
        L5f:
            boolean r10 = r8.N0()
            if (r10 == 0) goto L48
            goto L53
        L66:
            int r10 = r8.f9683t
            if (r10 != r3) goto L6b
            goto L59
        L6b:
            boolean r10 = r8.N0()
            if (r10 == 0) goto L53
            goto L48
        L72:
            if (r10 != r0) goto L76
            goto L15f
        L76:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            d2.a0 r0 = (d2.a0) r0
            r0.getClass()
            d2.d0 r0 = r0.f12062e
            if (r10 != r3) goto L88
            int r4 = r8.I0()
            goto L8c
        L88:
            int r4 = r8.H0()
        L8c:
            r8.Y0(r4, r12)
            r8.X0(r10)
            d2.o r5 = r8.f9685v
            int r6 = r5.f12176d
            int r6 = r6 + r4
            r5.f12175c = r6
            E1.g r6 = r8.f9681r
            int r6 = r6.l()
            float r6 = (float) r6
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r6 = r6 * r7
            int r6 = (int) r6
            r5.f12174b = r6
            r5.f12179h = r3
            r6 = 0
            r5.f12173a = r6
            r8.C0(r11, r5, r12)
            boolean r11 = r8.f9687x
            r8.f9671D = r11
            android.view.View r11 = r0.j(r4, r10)
            if (r11 == 0) goto Lbc
            if (r11 == r9) goto Lbc
            return r11
        Lbc:
            boolean r11 = r8.Q0(r10)
            if (r11 == 0) goto Ld7
            int r11 = r8.f9679p
            int r11 = r11 - r3
        Lc5:
            if (r11 < 0) goto Lec
            d2.d0[] r12 = r8.f9680q
            r12 = r12[r11]
            android.view.View r12 = r12.j(r4, r10)
            if (r12 == 0) goto Ld4
            if (r12 == r9) goto Ld4
            return r12
        Ld4:
            int r11 = r11 + (-1)
            goto Lc5
        Ld7:
            r11 = r6
        Ld8:
            int r12 = r8.f9679p
            if (r11 >= r12) goto Lec
            d2.d0[] r12 = r8.f9680q
            r12 = r12[r11]
            android.view.View r12 = r12.j(r4, r10)
            if (r12 == 0) goto Le9
            if (r12 == r9) goto Le9
            return r12
        Le9:
            int r11 = r11 + 1
            goto Ld8
        Lec:
            boolean r11 = r8.f9686w
            r11 = r11 ^ r3
            if (r10 != r2) goto Lf3
            r12 = r3
            goto Lf4
        Lf3:
            r12 = r6
        Lf4:
            if (r11 != r12) goto Lf8
            r11 = r3
            goto Lf9
        Lf8:
            r11 = r6
        Lf9:
            if (r11 == 0) goto L100
            int r12 = r0.e()
            goto L104
        L100:
            int r12 = r0.f()
        L104:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L10d
            if (r12 == r9) goto L10d
            return r12
        L10d:
            boolean r10 = r8.Q0(r10)
            if (r10 == 0) goto L13c
            int r10 = r8.f9679p
            int r10 = r10 - r3
        L116:
            if (r10 < 0) goto L15f
            int r12 = r0.f12094e
            if (r10 != r12) goto L11d
            goto L139
        L11d:
            if (r11 == 0) goto L128
            d2.d0[] r12 = r8.f9680q
            r12 = r12[r10]
            int r12 = r12.e()
            goto L130
        L128:
            d2.d0[] r12 = r8.f9680q
            r12 = r12[r10]
            int r12 = r12.f()
        L130:
            android.view.View r12 = r8.q(r12)
            if (r12 == 0) goto L139
            if (r12 == r9) goto L139
            return r12
        L139:
            int r10 = r10 + (-1)
            goto L116
        L13c:
            int r10 = r8.f9679p
            if (r6 >= r10) goto L15f
            if (r11 == 0) goto L14b
            d2.d0[] r10 = r8.f9680q
            r10 = r10[r6]
            int r10 = r10.e()
            goto L153
        L14b:
            d2.d0[] r10 = r8.f9680q
            r10 = r10[r6]
            int r10 = r10.f()
        L153:
            android.view.View r10 = r8.q(r10)
            if (r10 == 0) goto L15c
            if (r10 == r9) goto L15c
            return r10
        L15c:
            int r6 = r6 + 1
            goto L13c
        L15f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S(android.view.View, int, d2.M, d2.S):android.view.View");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S0(C0966M c0966m, C0989o c0989o) {
        if (!c0989o.f12173a || c0989o.i) {
            return;
        }
        if (c0989o.f12174b == 0) {
            if (c0989o.f12177e == -1) {
                T0(c0966m, c0989o.f12178g);
                return;
            } else {
                U0(c0966m, c0989o.f);
                return;
            }
        }
        int i = 1;
        if (c0989o.f12177e == -1) {
            int i7 = c0989o.f;
            int iK = this.f9680q[0].k(i7);
            while (i < this.f9679p) {
                int iK2 = this.f9680q[i].k(i7);
                if (iK2 > iK) {
                    iK = iK2;
                }
                i++;
            }
            int i8 = i7 - iK;
            T0(c0966m, i8 < 0 ? c0989o.f12178g : c0989o.f12178g - Math.min(i8, c0989o.f12174b));
            return;
        }
        int i9 = c0989o.f12178g;
        int i10 = this.f9680q[0].i(i9);
        while (i < this.f9679p) {
            int i11 = this.f9680q[i].i(i9);
            if (i11 < i10) {
                i10 = i11;
            }
            i++;
        }
        int i12 = i10 - c0989o.f12178g;
        U0(c0966m, i12 < 0 ? c0989o.f : Math.min(i12, c0989o.f12174b) + c0989o.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View viewE0 = E0(false);
            View viewD0 = D0(false);
            if (viewE0 == null || viewD0 == null) {
                return;
            }
            int iH = AbstractC0960G.H(viewE0);
            int iH2 = AbstractC0960G.H(viewD0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T0(C0966M c0966m, int i) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f9681r.e(viewU) < i || this.f9681r.n(viewU) < i) {
                return;
            }
            a0 a0Var = (a0) viewU.getLayoutParams();
            a0Var.getClass();
            if (((ArrayList) a0Var.f12062e.f).size() == 1) {
                return;
            }
            d0 d0Var = a0Var.f12062e;
            ArrayList arrayList = (ArrayList) d0Var.f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            a0 a0Var2 = (a0) view.getLayoutParams();
            a0Var2.f12062e = null;
            if (a0Var2.f11989a.h() || a0Var2.f11989a.k()) {
                d0Var.f12093d -= ((StaggeredGridLayoutManager) d0Var.f12095g).f9681r.c(view);
            }
            if (size == 1) {
                d0Var.f12091b = Integer.MIN_VALUE;
            }
            d0Var.f12092c = Integer.MIN_VALUE;
            i0(viewU, c0966m);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U0(C0966M c0966m, int i) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f9681r.b(viewU) > i || this.f9681r.m(viewU) > i) {
                return;
            }
            a0 a0Var = (a0) viewU.getLayoutParams();
            a0Var.getClass();
            if (((ArrayList) a0Var.f12062e.f).size() == 1) {
                return;
            }
            d0 d0Var = a0Var.f12062e;
            ArrayList arrayList = (ArrayList) d0Var.f;
            View view = (View) arrayList.remove(0);
            a0 a0Var2 = (a0) view.getLayoutParams();
            a0Var2.f12062e = null;
            if (arrayList.size() == 0) {
                d0Var.f12092c = Integer.MIN_VALUE;
            }
            if (a0Var2.f11989a.h() || a0Var2.f11989a.k()) {
                d0Var.f12093d -= ((StaggeredGridLayoutManager) d0Var.f12095g).f9681r.c(view);
            }
            d0Var.f12091b = Integer.MIN_VALUE;
            i0(viewU, c0966m);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void V(C0966M c0966m, C0971S c0971s, View view, e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof a0)) {
            U(view, eVar);
            return;
        }
        a0 a0Var = (a0) layoutParams;
        if (this.f9683t == 0) {
            d0 d0Var = a0Var.f12062e;
            eVar.k(a.a(false, d0Var == null ? -1 : d0Var.f12094e, 1, -1, -1));
        } else {
            d0 d0Var2 = a0Var.f12062e;
            eVar.k(a.a(false, -1, -1, d0Var2 == null ? -1 : d0Var2.f12094e, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V0() {
        if (this.f9683t == 1 || !N0()) {
            this.f9687x = this.f9686w;
        } else {
            this.f9687x = !this.f9686w;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void W(int i, int i7) {
        L0(i, i7, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int W0(int i, C0966M c0966m, C0971S c0971s) {
        if (v() == 0 || i == 0) {
            return 0;
        }
        R0(i, c0971s);
        C0989o c0989o = this.f9685v;
        int iC0 = C0(c0966m, c0989o, c0971s);
        if (c0989o.f12174b >= iC0) {
            i = i < 0 ? -iC0 : iC0;
        }
        this.f9681r.o(-i);
        this.f9671D = this.f9687x;
        c0989o.f12174b = 0;
        S0(c0966m, c0989o);
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void X() {
        m mVar = this.f9669B;
        int[] iArr = (int[]) mVar.f8312r;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        mVar.f8313s = null;
        l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X0(int i) {
        C0989o c0989o = this.f9685v;
        c0989o.f12177e = i;
        c0989o.f12176d = this.f9687x != (i == -1) ? -1 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void Y(int i, int i7) {
        L0(i, i7, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y0(int i, C0971S c0971s) {
        int iL;
        int iL2;
        int i7;
        C0989o c0989o = this.f9685v;
        boolean z5 = false;
        c0989o.f12174b = 0;
        c0989o.f12175c = i;
        C0994t c0994t = this.f11981e;
        if (c0994t == null || !c0994t.f12205e || (i7 = c0971s.f12013a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f9687x == (i7 < i)) {
                iL = this.f9681r.l();
                iL2 = 0;
            } else {
                iL2 = this.f9681r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f11978b;
        if (recyclerView == null || !recyclerView.f9660w) {
            c0989o.f12178g = this.f9681r.f() + iL;
            c0989o.f = -iL2;
        } else {
            c0989o.f = this.f9681r.k() - iL2;
            c0989o.f12178g = this.f9681r.g() + iL;
        }
        c0989o.f12179h = false;
        c0989o.f12173a = true;
        if (this.f9681r.i() == 0 && this.f9681r.f() == 0) {
            z5 = true;
        }
        c0989o.i = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void Z(int i, int i7) {
        L0(i, i7, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z0(d0 d0Var, int i, int i7) {
        int i8 = d0Var.f12093d;
        int i9 = d0Var.f12094e;
        if (i != -1) {
            int i10 = d0Var.f12092c;
            if (i10 == Integer.MIN_VALUE) {
                d0Var.a();
                i10 = d0Var.f12092c;
            }
            if (i10 - i8 >= i7) {
                this.f9688y.set(i9, false);
                return;
            }
            return;
        }
        int i11 = d0Var.f12091b;
        if (i11 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) d0Var.f).get(0);
            a0 a0Var = (a0) view.getLayoutParams();
            d0Var.f12091b = ((StaggeredGridLayoutManager) d0Var.f12095g).f9681r.e(view);
            a0Var.getClass();
            i11 = d0Var.f12091b;
        }
        if (i11 + i8 <= i7) {
            this.f9688y.set(i9, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // d2.InterfaceC0970Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF a(int r4) {
        /*
            r3 = this;
            int r0 = r3.v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f9687x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.H0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f9687x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f9683t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(int):android.graphics.PointF");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void a0(int i, int i7) {
        L0(i, i7, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void b0(C0966M c0966m, C0971S c0971s) {
        P0(c0966m, c0971s, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void c(String str) {
        if (this.f9673F == null) {
            super.c(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void c0(C0971S c0971s) {
        this.f9689z = -1;
        this.f9668A = Integer.MIN_VALUE;
        this.f9673F = null;
        this.f9675H.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean d() {
        return this.f9683t == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof c0) {
            this.f9673F = (c0) parcelable;
            l0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean e() {
        return this.f9683t == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final Parcelable e0() {
        int iK;
        int iK2;
        int[] iArr;
        c0 c0Var = this.f9673F;
        if (c0Var != null) {
            c0 c0Var2 = new c0();
            c0Var2.f12077s = c0Var.f12077s;
            c0Var2.f12075q = c0Var.f12075q;
            c0Var2.f12076r = c0Var.f12076r;
            c0Var2.f12078t = c0Var.f12078t;
            c0Var2.f12079u = c0Var.f12079u;
            c0Var2.f12080v = c0Var.f12080v;
            c0Var2.f12082x = c0Var.f12082x;
            c0Var2.f12083y = c0Var.f12083y;
            c0Var2.f12084z = c0Var.f12084z;
            c0Var2.f12081w = c0Var.f12081w;
            return c0Var2;
        }
        c0 c0Var3 = new c0();
        c0Var3.f12082x = this.f9686w;
        c0Var3.f12083y = this.f9671D;
        c0Var3.f12084z = this.f9672E;
        m mVar = this.f9669B;
        if (mVar == null || (iArr = (int[]) mVar.f8312r) == null) {
            c0Var3.f12079u = 0;
        } else {
            c0Var3.f12080v = iArr;
            c0Var3.f12079u = iArr.length;
            c0Var3.f12081w = (ArrayList) mVar.f8313s;
        }
        if (v() <= 0) {
            c0Var3.f12075q = -1;
            c0Var3.f12076r = -1;
            c0Var3.f12077s = 0;
            return c0Var3;
        }
        c0Var3.f12075q = this.f9671D ? I0() : H0();
        View viewD0 = this.f9687x ? D0(true) : E0(true);
        c0Var3.f12076r = viewD0 != null ? AbstractC0960G.H(viewD0) : -1;
        int i = this.f9679p;
        c0Var3.f12077s = i;
        c0Var3.f12078t = new int[i];
        for (int i7 = 0; i7 < this.f9679p; i7++) {
            if (this.f9671D) {
                iK = this.f9680q[i7].i(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iK2 = this.f9681r.g();
                    iK -= iK2;
                }
            } else {
                iK = this.f9680q[i7].k(Integer.MIN_VALUE);
                if (iK != Integer.MIN_VALUE) {
                    iK2 = this.f9681r.k();
                    iK -= iK2;
                }
            }
            c0Var3.f12078t[i7] = iK;
        }
        return c0Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean f(C0961H c0961h) {
        return c0961h instanceof a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void f0(int i) {
        if (i == 0) {
            A0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void h(int i, int i7, C0971S c0971s, J j) {
        C0989o c0989o;
        int i8;
        int iK;
        if (this.f9683t != 0) {
            i = i7;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        R0(i, c0971s);
        int[] iArr = this.f9677J;
        if (iArr == null || iArr.length < this.f9679p) {
            this.f9677J = new int[this.f9679p];
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.f9679p;
            c0989o = this.f9685v;
            if (i9 >= i11) {
                break;
            }
            if (c0989o.f12176d == -1) {
                i8 = c0989o.f;
                iK = this.f9680q[i9].k(i8);
            } else {
                i8 = this.f9680q[i9].i(c0989o.f12178g);
                iK = c0989o.f12178g;
            }
            int i12 = i8 - iK;
            if (i12 >= 0) {
                this.f9677J[i10] = i12;
                i10++;
            }
            i9++;
        }
        Arrays.sort(this.f9677J, 0, i10);
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = c0989o.f12175c;
            if (i14 < 0 || i14 >= c0971s.b()) {
                return;
            }
            j.a(c0989o.f12175c, this.f9677J[i13]);
            c0989o.f12175c += c0989o.f12176d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int j(C0971S c0971s) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f9676I;
        return h.s(c0971s, this.f9681r, E0(z5), D0(z5), this, this.f9676I);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int k(C0971S c0971s) {
        return B0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int l(C0971S c0971s) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f9676I;
        return h.u(c0971s, this.f9681r, E0(z5), D0(z5), this, this.f9676I);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int m(C0971S c0971s) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f9676I;
        return h.s(c0971s, this.f9681r, E0(z5), D0(z5), this, this.f9676I);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int m0(int i, C0966M c0966m, C0971S c0971s) {
        return W0(i, c0966m, c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int n(C0971S c0971s) {
        return B0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void n0(int i) {
        c0 c0Var = this.f9673F;
        if (c0Var != null && c0Var.f12075q != i) {
            c0Var.f12078t = null;
            c0Var.f12077s = 0;
            c0Var.f12075q = -1;
            c0Var.f12076r = -1;
        }
        this.f9689z = i;
        this.f9668A = Integer.MIN_VALUE;
        l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int o(C0971S c0971s) {
        if (v() == 0) {
            return 0;
        }
        boolean z5 = !this.f9676I;
        return h.u(c0971s, this.f9681r, E0(z5), D0(z5), this, this.f9676I);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int o0(int i, C0966M c0966m, C0971S c0971s) {
        return W0(i, c0966m, c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final C0961H r() {
        return this.f9683t == 0 ? new a0(-2, -1) : new a0(-1, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void r0(Rect rect, int i, int i7) {
        int iG;
        int iG2;
        int iF = F() + E();
        int iD = D() + G();
        int i8 = this.f9683t;
        int i9 = this.f9679p;
        if (i8 == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f11978b;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            iG2 = AbstractC0960G.g(i7, iHeight, recyclerView.getMinimumHeight());
            iG = AbstractC0960G.g(i, (this.f9684u * i9) + iF, this.f11978b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f11978b;
            WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
            iG = AbstractC0960G.g(i, iWidth, recyclerView2.getMinimumWidth());
            iG2 = AbstractC0960G.g(i7, (this.f9684u * i9) + iD, this.f11978b.getMinimumHeight());
        }
        this.f11978b.setMeasuredDimension(iG, iG2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final C0961H s(Context context, AttributeSet attributeSet) {
        return new a0(context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final C0961H t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a0((ViewGroup.MarginLayoutParams) layoutParams) : new a0(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int x(C0966M c0966m, C0971S c0971s) {
        return this.f9683t == 1 ? this.f9679p : super.x(c0966m, c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void x0(RecyclerView recyclerView, int i) {
        C0994t c0994t = new C0994t(recyclerView.getContext());
        c0994t.f12201a = i;
        y0(c0994t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean z0() {
        return this.f9673F == null;
    }
}
