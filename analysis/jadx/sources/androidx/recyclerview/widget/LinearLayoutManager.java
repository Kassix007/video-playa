package androidx.recyclerview.widget;

import E1.g;
import E3.h;
import Q.J;
import android.content.Context;
import android.graphics.PointF;
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
import d2.C0990p;
import d2.C0991q;
import d2.C0992r;
import d2.C0993s;
import d2.C0994t;
import d2.InterfaceC0970Q;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0960G implements InterfaceC0970Q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0990p f9584A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0991q f9585B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f9586C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f9587D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0992r f9589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f9590r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9591s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f9592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9593u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9594v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f9595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9597y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0993s f9598z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LinearLayoutManager(int i) {
        this.f9588p = 1;
        this.f9592t = false;
        this.f9593u = false;
        this.f9594v = false;
        this.f9595w = true;
        this.f9596x = -1;
        this.f9597y = Integer.MIN_VALUE;
        this.f9598z = null;
        this.f9584A = new C0990p();
        this.f9585B = new C0991q();
        this.f9586C = 2;
        this.f9587D = new int[2];
        Z0(i);
        c(null);
        if (this.f9592t) {
            this.f9592t = false;
            l0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A0(C0971S c0971s, int[] iArr) {
        int i;
        int iL = c0971s.f12013a != -1 ? this.f9590r.l() : 0;
        if (this.f9589q.f == -1) {
            i = 0;
        } else {
            i = iL;
            iL = 0;
        }
        iArr[0] = iL;
        iArr[1] = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B0(C0971S c0971s, C0992r c0992r, J j) {
        int i = c0992r.f12192d;
        if (i < 0 || i >= c0971s.b()) {
            return;
        }
        j.a(i, Math.max(0, c0992r.f12194g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int C0(C0971S c0971s) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f9590r;
        boolean z5 = !this.f9595w;
        return h.s(c0971s, gVar, J0(z5), I0(z5), this, this.f9595w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int D0(C0971S c0971s) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f9590r;
        boolean z5 = !this.f9595w;
        return h.t(c0971s, gVar, J0(z5), I0(z5), this, this.f9595w, this.f9593u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int E0(C0971S c0971s) {
        if (v() == 0) {
            return 0;
        }
        G0();
        g gVar = this.f9590r;
        boolean z5 = !this.f9595w;
        return h.u(c0971s, gVar, J0(z5), I0(z5), this, this.f9595w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int F0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f9588p == 1) ? 1 : Integer.MIN_VALUE : this.f9588p == 0 ? 1 : Integer.MIN_VALUE : this.f9588p == 1 ? -1 : Integer.MIN_VALUE : this.f9588p == 0 ? -1 : Integer.MIN_VALUE : (this.f9588p != 1 && S0()) ? -1 : 1 : (this.f9588p != 1 && S0()) ? 1 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G0() {
        if (this.f9589q == null) {
            C0992r c0992r = new C0992r();
            c0992r.f12189a = true;
            c0992r.f12195h = 0;
            c0992r.i = 0;
            c0992r.f12196k = null;
            this.f9589q = c0992r;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int H0(C0966M c0966m, C0992r c0992r, C0971S c0971s, boolean z5) {
        int i;
        int i7 = c0992r.f12191c;
        int i8 = c0992r.f12194g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                c0992r.f12194g = i8 + i7;
            }
            V0(c0966m, c0992r);
        }
        int i9 = c0992r.f12191c + c0992r.f12195h;
        while (true) {
            if ((!c0992r.f12197l && i9 <= 0) || (i = c0992r.f12192d) < 0 || i >= c0971s.b()) {
                break;
            }
            C0991q c0991q = this.f9585B;
            c0991q.f12185a = 0;
            c0991q.f12186b = false;
            c0991q.f12187c = false;
            c0991q.f12188d = false;
            T0(c0966m, c0971s, c0992r, c0991q);
            if (!c0991q.f12186b) {
                int i10 = c0992r.f12190b;
                int i11 = c0991q.f12185a;
                c0992r.f12190b = (c0992r.f * i11) + i10;
                if (!c0991q.f12187c || c0992r.f12196k != null || !c0971s.f12018g) {
                    c0992r.f12191c -= i11;
                    i9 -= i11;
                }
                int i12 = c0992r.f12194g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + i11;
                    c0992r.f12194g = i13;
                    int i14 = c0992r.f12191c;
                    if (i14 < 0) {
                        c0992r.f12194g = i13 + i14;
                    }
                    V0(c0966m, c0992r);
                }
                if (z5 && c0991q.f12188d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - c0992r.f12191c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View I0(boolean z5) {
        return this.f9593u ? M0(0, v(), z5) : M0(v() - 1, -1, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View J0(boolean z5) {
        return this.f9593u ? M0(v() - 1, -1, z5) : M0(0, v(), z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int K0() {
        View viewM0 = M0(v() - 1, -1, false);
        if (viewM0 == null) {
            return -1;
        }
        return AbstractC0960G.H(viewM0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean L() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View L0(int i, int i7) {
        int i8;
        int i9;
        G0();
        if (i7 <= i && i7 >= i) {
            return u(i);
        }
        if (this.f9590r.e(u(i)) < this.f9590r.k()) {
            i8 = 16644;
            i9 = 16388;
        } else {
            i8 = 4161;
            i9 = 4097;
        }
        return this.f9588p == 0 ? this.f11979c.j(i, i7, i8, i9) : this.f11980d.j(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View M0(int i, int i7, boolean z5) {
        G0();
        int i8 = z5 ? 24579 : 320;
        return this.f9588p == 0 ? this.f11979c.j(i, i7, i8, 320) : this.f11980d.j(i, i7, i8, 320);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View N0(C0966M c0966m, C0971S c0971s, int i, int i7, int i8) {
        G0();
        int iK = this.f9590r.k();
        int iG = this.f9590r.g();
        int i9 = i7 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i7) {
            View viewU = u(i);
            int iH = AbstractC0960G.H(viewU);
            if (iH >= 0 && iH < i8) {
                if (((C0961H) viewU.getLayoutParams()).f11989a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f9590r.e(viewU) < iG && this.f9590r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i += i9;
        }
        return view != null ? view : view2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int O0(int i, C0966M c0966m, C0971S c0971s, boolean z5) {
        int iG;
        int iG2 = this.f9590r.g() - i;
        if (iG2 <= 0) {
            return 0;
        }
        int i7 = -Y0(-iG2, c0966m, c0971s);
        int i8 = i + i7;
        if (!z5 || (iG = this.f9590r.g() - i8) <= 0) {
            return i7;
        }
        this.f9590r.o(iG);
        return iG + i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int P0(int i, C0966M c0966m, C0971S c0971s, boolean z5) {
        int iK;
        int iK2 = i - this.f9590r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i7 = -Y0(iK2, c0966m, c0971s);
        int i8 = i + i7;
        if (!z5 || (iK = i8 - this.f9590r.k()) <= 0) {
            return i7;
        }
        this.f9590r.o(-iK);
        return i7 - iK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View Q0() {
        return u(this.f9593u ? 0 : v() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View R0() {
        return u(this.f9593u ? v() - 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public View S(View view, int i, C0966M c0966m, C0971S c0971s) {
        int iF0;
        X0();
        if (v() != 0 && (iF0 = F0(i)) != Integer.MIN_VALUE) {
            G0();
            b1(iF0, (int) (this.f9590r.l() * 0.33333334f), false, c0971s);
            C0992r c0992r = this.f9589q;
            c0992r.f12194g = Integer.MIN_VALUE;
            c0992r.f12189a = false;
            H0(c0966m, c0992r, c0971s, true);
            View viewL0 = iF0 == -1 ? this.f9593u ? L0(v() - 1, -1) : L0(0, v()) : this.f9593u ? L0(0, v()) : L0(v() - 1, -1);
            View viewR0 = iF0 == -1 ? R0() : Q0();
            if (!viewR0.hasFocusable()) {
                return viewL0;
            }
            if (viewL0 != null) {
                return viewR0;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean S0() {
        return C() == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            View viewM0 = M0(0, v(), false);
            accessibilityEvent.setFromIndex(viewM0 == null ? -1 : AbstractC0960G.H(viewM0));
            accessibilityEvent.setToIndex(K0());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void T0(C0966M c0966m, C0971S c0971s, C0992r c0992r, C0991q c0991q) {
        int iE;
        int i;
        int i7;
        int iD;
        View viewB = c0992r.b(c0966m);
        if (viewB == null) {
            c0991q.f12186b = true;
            return;
        }
        C0961H c0961h = (C0961H) viewB.getLayoutParams();
        if (c0992r.f12196k == null) {
            if (this.f9593u == (c0992r.f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f9593u == (c0992r.f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        C0961H c0961h2 = (C0961H) viewB.getLayoutParams();
        Rect rectJ = this.f11978b.J(viewB);
        int i8 = rectJ.left + rectJ.right;
        int i9 = rectJ.top + rectJ.bottom;
        int iW = AbstractC0960G.w(d(), this.f11987n, this.f11985l, F() + E() + ((ViewGroup.MarginLayoutParams) c0961h2).leftMargin + ((ViewGroup.MarginLayoutParams) c0961h2).rightMargin + i8, ((ViewGroup.MarginLayoutParams) c0961h2).width);
        int iW2 = AbstractC0960G.w(e(), this.f11988o, this.f11986m, D() + G() + ((ViewGroup.MarginLayoutParams) c0961h2).topMargin + ((ViewGroup.MarginLayoutParams) c0961h2).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) c0961h2).height);
        if (u0(viewB, iW, iW2, c0961h2)) {
            viewB.measure(iW, iW2);
        }
        c0991q.f12185a = this.f9590r.c(viewB);
        if (this.f9588p == 1) {
            if (S0()) {
                iD = this.f11987n - F();
                iE = iD - this.f9590r.d(viewB);
            } else {
                iE = E();
                iD = this.f9590r.d(viewB) + iE;
            }
            if (c0992r.f == -1) {
                i = c0992r.f12190b;
                i7 = i - c0991q.f12185a;
            } else {
                i7 = c0992r.f12190b;
                i = c0991q.f12185a + i7;
            }
        } else {
            int iG = G();
            int iD2 = this.f9590r.d(viewB) + iG;
            if (c0992r.f == -1) {
                int i10 = c0992r.f12190b;
                int i11 = i10 - c0991q.f12185a;
                iD = i10;
                i = iD2;
                iE = i11;
                i7 = iG;
            } else {
                int i12 = c0992r.f12190b;
                int i13 = c0991q.f12185a + i12;
                iE = i12;
                i = iD2;
                i7 = iG;
                iD = i13;
            }
        }
        AbstractC0960G.N(viewB, iE, i7, iD, i);
        if (c0961h.f11989a.h() || c0961h.f11989a.k()) {
            c0991q.f12187c = true;
        }
        c0991q.f12188d = viewB.hasFocusable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V0(C0966M c0966m, C0992r c0992r) {
        if (!c0992r.f12189a || c0992r.f12197l) {
            return;
        }
        int i = c0992r.f12194g;
        int i7 = c0992r.i;
        if (c0992r.f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iF = (this.f9590r.f() - i) + i7;
            if (this.f9593u) {
                for (int i8 = 0; i8 < iV; i8++) {
                    View viewU = u(i8);
                    if (this.f9590r.e(viewU) < iF || this.f9590r.n(viewU) < iF) {
                        W0(c0966m, 0, i8);
                        return;
                    }
                }
                return;
            }
            int i9 = iV - 1;
            for (int i10 = i9; i10 >= 0; i10--) {
                View viewU2 = u(i10);
                if (this.f9590r.e(viewU2) < iF || this.f9590r.n(viewU2) < iF) {
                    W0(c0966m, i9, i10);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i11 = i - i7;
        int iV2 = v();
        if (!this.f9593u) {
            for (int i12 = 0; i12 < iV2; i12++) {
                View viewU3 = u(i12);
                if (this.f9590r.b(viewU3) > i11 || this.f9590r.m(viewU3) > i11) {
                    W0(c0966m, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = iV2 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View viewU4 = u(i14);
            if (this.f9590r.b(viewU4) > i11 || this.f9590r.m(viewU4) > i11) {
                W0(c0966m, i13, i14);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W0(C0966M c0966m, int i, int i7) {
        if (i == i7) {
            return;
        }
        if (i7 <= i) {
            while (i > i7) {
                View viewU = u(i);
                j0(i);
                c0966m.f(viewU);
                i--;
            }
            return;
        }
        for (int i8 = i7 - 1; i8 >= i; i8--) {
            View viewU2 = u(i8);
            j0(i8);
            c0966m.f(viewU2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X0() {
        if (this.f9588p == 1 || !S0()) {
            this.f9593u = this.f9592t;
        } else {
            this.f9593u = !this.f9592t;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int Y0(int i, C0966M c0966m, C0971S c0971s) {
        if (v() != 0 && i != 0) {
            G0();
            this.f9589q.f12189a = true;
            int i7 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            b1(i7, iAbs, true, c0971s);
            C0992r c0992r = this.f9589q;
            int iH0 = H0(c0966m, c0992r, c0971s, false) + c0992r.f12194g;
            if (iH0 >= 0) {
                if (iAbs > iH0) {
                    i = i7 * iH0;
                }
                this.f9590r.o(-i);
                this.f9589q.j = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(i.i(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.f9588p || this.f9590r == null) {
            g gVarA = g.a(this, i);
            this.f9590r = gVarA;
            this.f9584A.f12180a = gVarA;
            this.f9588p = i;
            l0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.InterfaceC0970Q
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i7 = (i < AbstractC0960G.H(u(0))) != this.f9593u ? -1 : 1;
        return this.f9588p == 0 ? new PointF(i7, 0.0f) : new PointF(0.0f, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a1(boolean z5) {
        c(null);
        if (this.f9594v == z5) {
            return;
        }
        this.f9594v = z5;
        l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    @Override // d2.AbstractC0960G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b0(d2.C0966M r18, d2.C0971S r19) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            d2.s r1 = r0.f9598z
            r6 = -1
            if (r1 != 0) goto Ld
            int r1 = r0.f9596x
            if (r1 == r6) goto L17
        Ld:
            int r1 = r2.b()
            if (r1 != 0) goto L17
            r17.g0(r18)
            return
        L17:
            d2.s r1 = r0.f9598z
            if (r1 == 0) goto L21
            int r1 = r1.f12198q
            if (r1 < 0) goto L21
            r0.f9596x = r1
        L21:
            r0.G0()
            d2.r r1 = r0.f9589q
            r7 = 0
            r1.f12189a = r7
            r0.X0()
            androidx.recyclerview.widget.RecyclerView r1 = r0.f11978b
            if (r1 != 0) goto L31
            goto L43
        L31:
            android.view.View r1 = r1.getFocusedChild()
            if (r1 == 0) goto L43
            B0.G0 r3 = r0.f11977a
            java.lang.Object r3 = r3.f236t
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L44
        L43:
            r1 = 0
        L44:
            d2.p r9 = r0.f9584A
            boolean r3 = r9.f12184e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1
            if (r3 == 0) goto L81
            int r3 = r0.f9596x
            if (r3 != r6) goto L81
            d2.s r3 = r0.f9598z
            if (r3 == 0) goto L56
            goto L81
        L56:
            if (r1 == 0) goto L75
            E1.g r3 = r0.f9590r
            int r3 = r3.e(r1)
            E1.g r4 = r0.f9590r
            int r4 = r4.g()
            if (r3 >= r4) goto L79
            E1.g r3 = r0.f9590r
            int r3 = r3.b(r1)
            E1.g r4 = r0.f9590r
            int r4 = r4.k()
            if (r3 > r4) goto L75
            goto L79
        L75:
            r1 = r18
            goto L298
        L79:
            int r3 = d2.AbstractC0960G.H(r1)
            r9.c(r1, r3)
            goto L75
        L81:
            r9.d()
            boolean r1 = r0.f9593u
            boolean r3 = r0.f9594v
            r1 = r1 ^ r3
            r9.f12183d = r1
            boolean r1 = r2.f12018g
            if (r1 != 0) goto L18c
            int r1 = r0.f9596x
            if (r1 != r6) goto L95
            goto L18c
        L95:
            if (r1 < 0) goto L188
            int r3 = r2.b()
            if (r1 < r3) goto L9f
            goto L188
        L9f:
            int r1 = r0.f9596x
            r9.f12181b = r1
            d2.s r3 = r0.f9598z
            if (r3 == 0) goto Ld0
            int r4 = r3.f12198q
            if (r4 < 0) goto Ld0
            boolean r1 = r3.f12200s
            r9.f12183d = r1
            if (r1 == 0) goto Lc2
            E1.g r1 = r0.f9590r
            int r1 = r1.g()
            d2.s r3 = r0.f9598z
            int r3 = r3.f12199r
            int r1 = r1 - r3
            r9.f12182c = r1
        Lbe:
            r1 = r18
            goto L296
        Lc2:
            E1.g r1 = r0.f9590r
            int r1 = r1.k()
            d2.s r3 = r0.f9598z
            int r3 = r3.f12199r
            int r1 = r1 + r3
            r9.f12182c = r1
            goto Lbe
        Ld0:
            int r3 = r0.f9597y
            if (r3 != r10) goto L168
            android.view.View r1 = r0.q(r1)
            if (r1 == 0) goto L145
            E1.g r3 = r0.f9590r
            int r3 = r3.c(r1)
            E1.g r4 = r0.f9590r
            int r4 = r4.l()
            if (r3 <= r4) goto Lec
            r9.a()
            goto Lbe
        Lec:
            E1.g r3 = r0.f9590r
            int r3 = r3.e(r1)
            E1.g r4 = r0.f9590r
            int r4 = r4.k()
            int r3 = r3 - r4
            if (r3 >= 0) goto L106
            E1.g r1 = r0.f9590r
            int r1 = r1.k()
            r9.f12182c = r1
            r9.f12183d = r7
            goto Lbe
        L106:
            E1.g r3 = r0.f9590r
            int r3 = r3.g()
            E1.g r4 = r0.f9590r
            int r4 = r4.b(r1)
            int r3 = r3 - r4
            if (r3 >= 0) goto L120
            E1.g r1 = r0.f9590r
            int r1 = r1.g()
            r9.f12182c = r1
            r9.f12183d = r11
            goto Lbe
        L120:
            boolean r3 = r9.f12183d
            if (r3 == 0) goto L13b
            E1.g r3 = r0.f9590r
            int r1 = r3.b(r1)
            E1.g r3 = r0.f9590r
            int r4 = r3.f1632a
            if (r10 != r4) goto L132
            r4 = r7
            goto L139
        L132:
            int r4 = r3.l()
            int r3 = r3.f1632a
            int r4 = r4 - r3
        L139:
            int r4 = r4 + r1
            goto L141
        L13b:
            E1.g r3 = r0.f9590r
            int r4 = r3.e(r1)
        L141:
            r9.f12182c = r4
            goto Lbe
        L145:
            int r1 = r0.v()
            if (r1 <= 0) goto L163
            android.view.View r1 = r0.u(r7)
            int r1 = d2.AbstractC0960G.H(r1)
            int r3 = r0.f9596x
            if (r3 >= r1) goto L159
            r1 = r11
            goto L15a
        L159:
            r1 = r7
        L15a:
            boolean r3 = r0.f9593u
            if (r1 != r3) goto L160
            r1 = r11
            goto L161
        L160:
            r1 = r7
        L161:
            r9.f12183d = r1
        L163:
            r9.a()
            goto Lbe
        L168:
            boolean r1 = r0.f9593u
            r9.f12183d = r1
            if (r1 == 0) goto L17b
            E1.g r1 = r0.f9590r
            int r1 = r1.g()
            int r3 = r0.f9597y
            int r1 = r1 - r3
            r9.f12182c = r1
            goto Lbe
        L17b:
            E1.g r1 = r0.f9590r
            int r1 = r1.k()
            int r3 = r0.f9597y
            int r1 = r1 + r3
            r9.f12182c = r1
            goto Lbe
        L188:
            r0.f9596x = r6
            r0.f9597y = r10
        L18c:
            int r1 = r0.v()
            if (r1 != 0) goto L196
        L192:
            r1 = r18
            goto L286
        L196:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f11978b
            if (r1 != 0) goto L19b
            goto L1ad
        L19b:
            android.view.View r1 = r1.getFocusedChild()
            if (r1 == 0) goto L1ad
            B0.G0 r3 = r0.f11977a
            java.lang.Object r3 = r3.f236t
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L1ae
        L1ad:
            r1 = 0
        L1ae:
            if (r1 == 0) goto L1db
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            d2.H r3 = (d2.C0961H) r3
            d2.V r4 = r3.f11989a
            boolean r4 = r4.h()
            if (r4 != 0) goto L1db
            d2.V r4 = r3.f11989a
            int r4 = r4.b()
            if (r4 < 0) goto L1db
            d2.V r3 = r3.f11989a
            int r3 = r3.b()
            int r4 = r2.b()
            if (r3 >= r4) goto L1db
            int r3 = d2.AbstractC0960G.H(r1)
            r9.c(r1, r3)
            goto Lbe
        L1db:
            boolean r1 = r0.f9591s
            boolean r3 = r0.f9594v
            if (r1 == r3) goto L1e2
            goto L192
        L1e2:
            boolean r1 = r9.f12183d
            if (r1 == 0) goto L216
            boolean r1 = r0.f9593u
            if (r1 == 0) goto L1fc
            int r4 = r0.v()
            int r5 = r2.b()
            r3 = 0
            r1 = r18
            android.view.View r3 = r0.N0(r1, r2, r3, r4, r5)
            r0 = r17
            goto L211
        L1fc:
            int r0 = r17.v()
            int r3 = r0 + (-1)
            r4 = -1
            int r5 = r19.b()
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.N0(r1, r2, r3, r4, r5)
        L211:
            r1 = r18
            r2 = r19
            goto L243
        L216:
            boolean r1 = r0.f9593u
            if (r1 == 0) goto L230
            int r1 = r0.v()
            int r3 = r1 + (-1)
            r4 = -1
            int r5 = r19.b()
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.N0(r1, r2, r3, r4, r5)
            r0 = r17
            goto L243
        L230:
            int r4 = r17.v()
            int r5 = r19.b()
            r3 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            android.view.View r3 = r0.N0(r1, r2, r3, r4, r5)
        L243:
            if (r3 == 0) goto L286
            int r4 = d2.AbstractC0960G.H(r3)
            r9.b(r3, r4)
            boolean r4 = r2.f12018g
            if (r4 != 0) goto L296
            boolean r4 = r0.z0()
            if (r4 == 0) goto L296
            E1.g r4 = r0.f9590r
            int r4 = r4.e(r3)
            E1.g r5 = r0.f9590r
            int r5 = r5.g()
            if (r4 >= r5) goto L272
            E1.g r4 = r0.f9590r
            int r3 = r4.b(r3)
            E1.g r4 = r0.f9590r
            int r4 = r4.k()
            if (r3 >= r4) goto L296
        L272:
            boolean r3 = r9.f12183d
            if (r3 == 0) goto L27d
            E1.g r3 = r0.f9590r
            int r3 = r3.g()
            goto L283
        L27d:
            E1.g r3 = r0.f9590r
            int r3 = r3.k()
        L283:
            r9.f12182c = r3
            goto L296
        L286:
            r9.a()
            boolean r3 = r0.f9594v
            if (r3 == 0) goto L293
            int r3 = r2.b()
            int r3 = r3 - r11
            goto L294
        L293:
            r3 = r7
        L294:
            r9.f12181b = r3
        L296:
            r9.f12184e = r11
        L298:
            d2.r r3 = r0.f9589q
            int r4 = r3.j
            if (r4 < 0) goto L2a0
            r4 = r11
            goto L2a1
        L2a0:
            r4 = r6
        L2a1:
            r3.f = r4
            int[] r3 = r0.f9587D
            r3[r7] = r7
            r3[r11] = r7
            r0.A0(r2, r3)
            r4 = r3[r7]
            int r4 = java.lang.Math.max(r7, r4)
            E1.g r5 = r0.f9590r
            int r5 = r5.k()
            int r5 = r5 + r4
            r3 = r3[r11]
            int r3 = java.lang.Math.max(r7, r3)
            E1.g r4 = r0.f9590r
            int r4 = r4.h()
            int r4 = r4 + r3
            boolean r3 = r2.f12018g
            if (r3 == 0) goto L302
            int r3 = r0.f9596x
            if (r3 == r6) goto L302
            int r12 = r0.f9597y
            if (r12 == r10) goto L302
            android.view.View r3 = r0.q(r3)
            if (r3 == 0) goto L302
            boolean r10 = r0.f9593u
            if (r10 == 0) goto L2ed
            E1.g r10 = r0.f9590r
            int r10 = r10.g()
            E1.g r12 = r0.f9590r
            int r3 = r12.b(r3)
            int r10 = r10 - r3
            int r3 = r0.f9597y
        L2eb:
            int r10 = r10 - r3
            goto L2fd
        L2ed:
            E1.g r10 = r0.f9590r
            int r3 = r10.e(r3)
            E1.g r10 = r0.f9590r
            int r10 = r10.k()
            int r3 = r3 - r10
            int r10 = r0.f9597y
            goto L2eb
        L2fd:
            if (r10 <= 0) goto L301
            int r5 = r5 + r10
            goto L302
        L301:
            int r4 = r4 - r10
        L302:
            boolean r3 = r9.f12183d
            if (r3 == 0) goto L30c
            boolean r3 = r0.f9593u
            if (r3 == 0) goto L310
        L30a:
            r6 = r11
            goto L310
        L30c:
            boolean r3 = r0.f9593u
            if (r3 == 0) goto L30a
        L310:
            r0.U0(r1, r2, r9, r6)
            r17.p(r18)
            d2.r r3 = r0.f9589q
            E1.g r6 = r0.f9590r
            int r6 = r6.i()
            if (r6 != 0) goto L32a
            E1.g r6 = r0.f9590r
            int r6 = r6.f()
            if (r6 != 0) goto L32a
            r6 = r11
            goto L32b
        L32a:
            r6 = r7
        L32b:
            r3.f12197l = r6
            d2.r r3 = r0.f9589q
            r3.getClass()
            d2.r r3 = r0.f9589q
            r3.i = r7
            boolean r3 = r9.f12183d
            if (r3 == 0) goto L37f
            int r3 = r9.f12181b
            int r6 = r9.f12182c
            r0.d1(r3, r6)
            d2.r r3 = r0.f9589q
            r3.f12195h = r5
            r0.H0(r1, r3, r2, r7)
            d2.r r3 = r0.f9589q
            int r5 = r3.f12190b
            int r6 = r3.f12192d
            int r3 = r3.f12191c
            if (r3 <= 0) goto L353
            int r4 = r4 + r3
        L353:
            int r3 = r9.f12181b
            int r10 = r9.f12182c
            r0.c1(r3, r10)
            d2.r r3 = r0.f9589q
            r3.f12195h = r4
            int r4 = r3.f12192d
            int r10 = r3.f12193e
            int r4 = r4 + r10
            r3.f12192d = r4
            r0.H0(r1, r3, r2, r7)
            d2.r r3 = r0.f9589q
            int r4 = r3.f12190b
            int r3 = r3.f12191c
            if (r3 <= 0) goto L3c3
            r0.d1(r6, r5)
            d2.r r5 = r0.f9589q
            r5.f12195h = r3
            r0.H0(r1, r5, r2, r7)
            d2.r r3 = r0.f9589q
            int r5 = r3.f12190b
            goto L3c3
        L37f:
            int r3 = r9.f12181b
            int r6 = r9.f12182c
            r0.c1(r3, r6)
            d2.r r3 = r0.f9589q
            r3.f12195h = r4
            r0.H0(r1, r3, r2, r7)
            d2.r r3 = r0.f9589q
            int r4 = r3.f12190b
            int r6 = r3.f12192d
            int r3 = r3.f12191c
            if (r3 <= 0) goto L398
            int r5 = r5 + r3
        L398:
            int r3 = r9.f12181b
            int r10 = r9.f12182c
            r0.d1(r3, r10)
            d2.r r3 = r0.f9589q
            r3.f12195h = r5
            int r5 = r3.f12192d
            int r10 = r3.f12193e
            int r5 = r5 + r10
            r3.f12192d = r5
            r0.H0(r1, r3, r2, r7)
            d2.r r3 = r0.f9589q
            int r5 = r3.f12190b
            int r3 = r3.f12191c
            if (r3 <= 0) goto L3c3
            r0.c1(r6, r4)
            d2.r r4 = r0.f9589q
            r4.f12195h = r3
            r0.H0(r1, r4, r2, r7)
            d2.r r3 = r0.f9589q
            int r4 = r3.f12190b
        L3c3:
            int r3 = r0.v()
            if (r3 <= 0) goto L3e8
            boolean r3 = r0.f9593u
            boolean r6 = r0.f9594v
            r3 = r3 ^ r6
            if (r3 == 0) goto L3dd
            int r3 = r0.O0(r4, r1, r2, r11)
            int r5 = r5 + r3
            int r4 = r4 + r3
            int r3 = r0.P0(r5, r1, r2, r7)
        L3da:
            int r5 = r5 + r3
            int r4 = r4 + r3
            goto L3e8
        L3dd:
            int r3 = r0.P0(r5, r1, r2, r11)
            int r5 = r5 + r3
            int r4 = r4 + r3
            int r3 = r0.O0(r4, r1, r2, r7)
            goto L3da
        L3e8:
            boolean r3 = r2.f12020k
            if (r3 == 0) goto L482
            int r3 = r0.v()
            if (r3 == 0) goto L482
            boolean r3 = r2.f12018g
            if (r3 != 0) goto L482
            boolean r3 = r0.z0()
            if (r3 != 0) goto L3fe
            goto L482
        L3fe:
            java.util.List r3 = r1.f12002d
            int r6 = r3.size()
            android.view.View r10 = r0.u(r7)
            int r10 = d2.AbstractC0960G.H(r10)
            r12 = r7
            r13 = r12
            r14 = r13
        L40f:
            if (r12 >= r6) goto L440
            java.lang.Object r15 = r3.get(r12)
            d2.V r15 = (d2.AbstractC0974V) r15
            boolean r16 = r15.h()
            android.view.View r11 = r15.f12032a
            if (r16 == 0) goto L420
            goto L43c
        L420:
            int r15 = r15.b()
            if (r15 >= r10) goto L428
            r15 = 1
            goto L429
        L428:
            r15 = r7
        L429:
            boolean r8 = r0.f9593u
            if (r15 == r8) goto L435
            E1.g r8 = r0.f9590r
            int r8 = r8.c(r11)
            int r13 = r13 + r8
            goto L43c
        L435:
            E1.g r8 = r0.f9590r
            int r8 = r8.c(r11)
            int r14 = r14 + r8
        L43c:
            int r12 = r12 + 1
            r11 = 1
            goto L40f
        L440:
            d2.r r6 = r0.f9589q
            r6.f12196k = r3
            if (r13 <= 0) goto L460
            android.view.View r3 = r0.R0()
            int r3 = d2.AbstractC0960G.H(r3)
            r0.d1(r3, r5)
            d2.r r3 = r0.f9589q
            r3.f12195h = r13
            r3.f12191c = r7
            r5 = 0
            r3.a(r5)
            d2.r r3 = r0.f9589q
            r0.H0(r1, r3, r2, r7)
        L460:
            if (r14 <= 0) goto L47d
            android.view.View r3 = r0.Q0()
            int r3 = d2.AbstractC0960G.H(r3)
            r0.c1(r3, r4)
            d2.r r3 = r0.f9589q
            r3.f12195h = r14
            r3.f12191c = r7
            r5 = 0
            r3.a(r5)
            d2.r r3 = r0.f9589q
            r0.H0(r1, r3, r2, r7)
            goto L47e
        L47d:
            r5 = 0
        L47e:
            d2.r r1 = r0.f9589q
            r1.f12196k = r5
        L482:
            boolean r1 = r2.f12018g
            if (r1 != 0) goto L48f
            E1.g r1 = r0.f9590r
            int r2 = r1.l()
            r1.f1632a = r2
            goto L492
        L48f:
            r9.d()
        L492:
            boolean r1 = r0.f9594v
            r0.f9591s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.b0(d2.M, d2.S):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b1(int i, int i7, boolean z5, C0971S c0971s) {
        int iK;
        this.f9589q.f12197l = this.f9590r.i() == 0 && this.f9590r.f() == 0;
        this.f9589q.f = i;
        int[] iArr = this.f9587D;
        iArr[0] = 0;
        iArr[1] = 0;
        A0(c0971s, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z6 = i == 1;
        C0992r c0992r = this.f9589q;
        int i8 = z6 ? iMax2 : iMax;
        c0992r.f12195h = i8;
        if (!z6) {
            iMax = iMax2;
        }
        c0992r.i = iMax;
        if (z6) {
            c0992r.f12195h = this.f9590r.h() + i8;
            View viewQ0 = Q0();
            C0992r c0992r2 = this.f9589q;
            c0992r2.f12193e = this.f9593u ? -1 : 1;
            int iH = AbstractC0960G.H(viewQ0);
            C0992r c0992r3 = this.f9589q;
            c0992r2.f12192d = iH + c0992r3.f12193e;
            c0992r3.f12190b = this.f9590r.b(viewQ0);
            iK = this.f9590r.b(viewQ0) - this.f9590r.g();
        } else {
            View viewR0 = R0();
            C0992r c0992r4 = this.f9589q;
            c0992r4.f12195h = this.f9590r.k() + c0992r4.f12195h;
            C0992r c0992r5 = this.f9589q;
            c0992r5.f12193e = this.f9593u ? 1 : -1;
            int iH2 = AbstractC0960G.H(viewR0);
            C0992r c0992r6 = this.f9589q;
            c0992r5.f12192d = iH2 + c0992r6.f12193e;
            c0992r6.f12190b = this.f9590r.e(viewR0);
            iK = (-this.f9590r.e(viewR0)) + this.f9590r.k();
        }
        C0992r c0992r7 = this.f9589q;
        c0992r7.f12191c = i7;
        if (z5) {
            c0992r7.f12191c = i7 - iK;
        }
        c0992r7.f12194g = iK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void c(String str) {
        if (this.f9598z == null) {
            super.c(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public void c0(C0971S c0971s) {
        this.f9598z = null;
        this.f9596x = -1;
        this.f9597y = Integer.MIN_VALUE;
        this.f9584A.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c1(int i, int i7) {
        this.f9589q.f12191c = this.f9590r.g() - i7;
        C0992r c0992r = this.f9589q;
        c0992r.f12193e = this.f9593u ? -1 : 1;
        c0992r.f12192d = i;
        c0992r.f = 1;
        c0992r.f12190b = i7;
        c0992r.f12194g = Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean d() {
        return this.f9588p == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof C0993s) {
            this.f9598z = (C0993s) parcelable;
            l0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d1(int i, int i7) {
        this.f9589q.f12191c = i7 - this.f9590r.k();
        C0992r c0992r = this.f9589q;
        c0992r.f12192d = i;
        c0992r.f12193e = this.f9593u ? 1 : -1;
        c0992r.f = -1;
        c0992r.f12190b = i7;
        c0992r.f12194g = Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean e() {
        return this.f9588p == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final Parcelable e0() {
        C0993s c0993s = this.f9598z;
        if (c0993s != null) {
            C0993s c0993s2 = new C0993s();
            c0993s2.f12198q = c0993s.f12198q;
            c0993s2.f12199r = c0993s.f12199r;
            c0993s2.f12200s = c0993s.f12200s;
            return c0993s2;
        }
        C0993s c0993s3 = new C0993s();
        if (v() <= 0) {
            c0993s3.f12198q = -1;
            return c0993s3;
        }
        G0();
        boolean z5 = this.f9591s ^ this.f9593u;
        c0993s3.f12200s = z5;
        if (z5) {
            View viewQ0 = Q0();
            c0993s3.f12199r = this.f9590r.g() - this.f9590r.b(viewQ0);
            c0993s3.f12198q = AbstractC0960G.H(viewQ0);
            return c0993s3;
        }
        View viewR0 = R0();
        c0993s3.f12198q = AbstractC0960G.H(viewR0);
        c0993s3.f12199r = this.f9590r.e(viewR0) - this.f9590r.k();
        return c0993s3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void h(int i, int i7, C0971S c0971s, J j) {
        if (this.f9588p != 0) {
            i = i7;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        G0();
        b1(i > 0 ? 1 : -1, Math.abs(i), true, c0971s);
        B0(c0971s, this.f9589q, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void i(int i, J j) {
        boolean z5;
        int i7;
        C0993s c0993s = this.f9598z;
        if (c0993s == null || (i7 = c0993s.f12198q) < 0) {
            X0();
            z5 = this.f9593u;
            i7 = this.f9596x;
            if (i7 == -1) {
                i7 = z5 ? i - 1 : 0;
            }
        } else {
            z5 = c0993s.f12200s;
        }
        int i8 = z5 ? -1 : 1;
        for (int i9 = 0; i9 < this.f9586C && i7 >= 0 && i7 < i; i9++) {
            j.a(i7, 0);
            i7 += i8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int j(C0971S c0971s) {
        return C0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public int k(C0971S c0971s) {
        return D0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public int l(C0971S c0971s) {
        return E0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int m(C0971S c0971s) {
        return C0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public int m0(int i, C0966M c0966m, C0971S c0971s) {
        if (this.f9588p == 1) {
            return 0;
        }
        return Y0(i, c0966m, c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public int n(C0971S c0971s) {
        return D0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void n0(int i) {
        this.f9596x = i;
        this.f9597y = Integer.MIN_VALUE;
        C0993s c0993s = this.f9598z;
        if (c0993s != null) {
            c0993s.f12198q = -1;
        }
        l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public int o(C0971S c0971s) {
        return E0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public int o0(int i, C0966M c0966m, C0971S c0971s) {
        if (this.f9588p == 0) {
            return 0;
        }
        return Y0(i, c0966m, c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iH = i - AbstractC0960G.H(u(0));
        if (iH >= 0 && iH < iV) {
            View viewU = u(iH);
            if (AbstractC0960G.H(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public C0961H r() {
        return new C0961H(-2, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean v0() {
        if (this.f11986m != 1073741824 && this.f11985l != 1073741824) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public void x0(RecyclerView recyclerView, int i) {
        C0994t c0994t = new C0994t(recyclerView.getContext());
        c0994t.f12201a = i;
        y0(c0994t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public boolean z0() {
        return this.f9598z == null && this.f9591s == this.f9594v;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i7) {
        this.f9588p = 1;
        this.f9592t = false;
        this.f9593u = false;
        this.f9594v = false;
        this.f9595w = true;
        this.f9596x = -1;
        this.f9597y = Integer.MIN_VALUE;
        this.f9598z = null;
        this.f9584A = new C0990p();
        this.f9585B = new C0991q();
        this.f9586C = 2;
        this.f9587D = new int[2];
        C0959F c0959fI = AbstractC0960G.I(context, attributeSet, i, i7);
        Z0(c0959fI.f11973a);
        boolean z5 = c0959fI.f11975c;
        c(null);
        if (z5 != this.f9592t) {
            this.f9592t = z5;
            l0();
        }
        a1(c0959fI.f11976d);
    }

    @Override // d2.AbstractC0960G
    public final void R(RecyclerView recyclerView) {
    }

    public void U0(C0966M c0966m, C0971S c0971s, C0990p c0990p, int i) {
    }
}
