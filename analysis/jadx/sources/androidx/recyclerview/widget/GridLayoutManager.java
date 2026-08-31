package androidx.recyclerview.widget;

import E0.a;
import Q.J;
import Z.m;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import d2.AbstractC0960G;
import d2.C0961H;
import d2.C0966M;
import d2.C0971S;
import d2.C0988n;
import d2.C0990p;
import d2.C0991q;
import d2.C0992r;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.i;
import w1.AbstractC1835K;
import x1.e;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9576E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9577F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int[] f9578G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View[] f9579H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseIntArray f9580I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseIntArray f9581J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final m f9582K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f9583L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i7) {
        super(context, attributeSet, i, i7);
        this.f9576E = false;
        this.f9577F = -1;
        this.f9580I = new SparseIntArray();
        this.f9581J = new SparseIntArray();
        this.f9582K = new m(5);
        this.f9583L = new Rect();
        l1(AbstractC0960G.I(context, attributeSet, i, i7).f11974b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B0(C0971S c0971s, C0992r c0992r, J j) {
        int i;
        int i7 = this.f9577F;
        for (int i8 = 0; i8 < this.f9577F && (i = c0992r.f12192d) >= 0 && i < c0971s.b() && i7 > 0; i8++) {
            j.a(c0992r.f12192d, Math.max(0, c0992r.f12194g));
            this.f9582K.getClass();
            i7--;
            c0992r.f12192d += c0992r.f12193e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int J(C0966M c0966m, C0971S c0971s) {
        if (this.f9588p == 0) {
            return this.f9577F;
        }
        if (c0971s.b() < 1) {
            return 0;
        }
        return h1(c0971s.b() - 1, c0966m, c0971s) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View N0(C0966M c0966m, C0971S c0971s, int i, int i7, int i8) {
        G0();
        int iK = this.f9590r.k();
        int iG = this.f9590r.g();
        int i9 = i7 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i7) {
            View viewU = u(i);
            int iH = AbstractC0960G.H(viewU);
            if (iH >= 0 && iH < i8 && i1(iH, c0966m, c0971s) == 0) {
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
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View S(android.view.View r23, int r24, d2.C0966M r25, d2.C0971S r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f11978b
            r4 = 0
            if (r3 != 0) goto Le
            r5 = r23
            goto L23
        Le:
            r5 = r23
            android.view.View r3 = r3.A(r5)
            if (r3 != 0) goto L17
            goto L23
        L17:
            B0.G0 r6 = r0.f11977a
            java.lang.Object r6 = r6.f236t
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L24
        L23:
            r3 = r4
        L24:
            if (r3 != 0) goto L27
            goto L38
        L27:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            d2.n r6 = (d2.C0988n) r6
            int r7 = r6.f12172e
            int r6 = r6.f
            int r6 = r6 + r7
            android.view.View r5 = super.S(r23, r24, r25, r26)
            if (r5 != 0) goto L39
        L38:
            return r4
        L39:
            r5 = r24
            int r5 = r0.F0(r5)
            r9 = 1
            if (r5 != r9) goto L44
            r5 = r9
            goto L45
        L44:
            r5 = 0
        L45:
            boolean r10 = r0.f9593u
            r11 = -1
            if (r5 == r10) goto L52
            int r5 = r0.v()
            int r5 = r5 - r9
            r10 = r11
            r12 = r10
            goto L59
        L52:
            int r5 = r0.v()
            r10 = r5
            r12 = r9
            r5 = 0
        L59:
            int r13 = r0.f9588p
            if (r13 != r9) goto L65
            boolean r13 = r0.S0()
            if (r13 == 0) goto L65
            r13 = r9
            goto L66
        L65:
            r13 = 0
        L66:
            int r14 = r0.h1(r5, r1, r2)
            r16 = r4
            r8 = r11
            r15 = r8
            r9 = 0
            r11 = r5
            r4 = 0
            r5 = r16
        L73:
            r17 = r5
            if (r11 == r10) goto L142
            int r5 = r0.h1(r11, r1, r2)
            android.view.View r1 = r0.u(r11)
            if (r1 != r3) goto L83
            goto L142
        L83:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L97
            if (r5 == r14) goto L97
            if (r16 == 0) goto L8f
            goto L142
        L8f:
            r18 = r3
            r19 = r9
            r21 = r10
            goto L133
        L97:
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            d2.n r5 = (d2.C0988n) r5
            int r2 = r5.f12172e
            r18 = r3
            int r3 = r5.f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Laf
            if (r2 != r7) goto Laf
            if (r3 != r6) goto Laf
            return r1
        Laf:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Lb7
            if (r16 == 0) goto Lbf
        Lb7:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto Lc4
            if (r17 != 0) goto Lc4
        Lbf:
            r19 = r9
            r21 = r10
            goto L109
        Lc4:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto Le8
            if (r10 <= r9) goto Ldb
        Ld8:
            r19 = r9
            goto L109
        Ldb:
            if (r10 != r9) goto Le5
            if (r2 <= r15) goto Le1
            r10 = 1
            goto Le2
        Le1:
            r10 = 0
        Le2:
            if (r13 != r10) goto Le5
            goto Ld8
        Le5:
            r19 = r9
            goto L133
        Le8:
            if (r16 != 0) goto Le5
            r19 = r9
            Z.m r9 = r0.f11979c
            boolean r9 = r9.q(r1)
            if (r9 == 0) goto Lfd
            Z.m r9 = r0.f11980d
            boolean r9 = r9.q(r1)
            if (r9 == 0) goto Lfd
            goto L133
        Lfd:
            if (r10 <= r4) goto L100
            goto L109
        L100:
            if (r10 != r4) goto L133
            if (r2 <= r8) goto L106
            r9 = 1
            goto L107
        L106:
            r9 = 0
        L107:
            if (r13 != r9) goto L133
        L109:
            boolean r9 = r1.hasFocusable()
            if (r9 == 0) goto L121
            int r5 = r5.f12172e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r9 = r3 - r2
            r16 = r1
            r15 = r5
            r5 = r17
            goto L137
        L121:
            int r4 = r5.f12172e
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r2 = r3 - r2
            r5 = r1
            r8 = r4
            r9 = r19
            r4 = r2
            goto L137
        L133:
            r5 = r17
            r9 = r19
        L137:
            int r11 = r11 + r12
            r1 = r25
            r2 = r26
            r3 = r18
            r10 = r21
            goto L73
        L142:
            if (r16 == 0) goto L145
            return r16
        L145:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.S(android.view.View, int, d2.M, d2.S):android.view.View");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v11, resolved type: android.graphics.Rect */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void T0(C0966M c0966m, C0971S c0971s, C0992r c0992r, C0991q c0991q) {
        int i;
        int i7;
        int i8;
        int iD;
        int iD2;
        int iE;
        int i9;
        int iW;
        int iW2;
        ?? r12;
        int i10;
        View viewB;
        int iJ = this.f9590r.j();
        boolean z5 = iJ != 1073741824;
        int i11 = v() > 0 ? this.f9578G[this.f9577F] : 0;
        if (z5) {
            m1();
        }
        boolean z6 = c0992r.f12193e == 1;
        int iI1 = this.f9577F;
        if (!z6) {
            iI1 = i1(c0992r.f12192d, c0966m, c0971s) + j1(c0992r.f12192d, c0966m, c0971s);
        }
        int i12 = 0;
        while (i12 < this.f9577F && (i10 = c0992r.f12192d) >= 0 && i10 < c0971s.b() && iI1 > 0) {
            int i13 = c0992r.f12192d;
            int iJ1 = j1(i13, c0966m, c0971s);
            if (iJ1 > this.f9577F) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + iJ1 + " spans but GridLayoutManager has only " + this.f9577F + " spans.");
            }
            iI1 -= iJ1;
            if (iI1 < 0 || (viewB = c0992r.b(c0966m)) == null) {
                break;
            }
            this.f9579H[i12] = viewB;
            i12++;
        }
        if (i12 == 0) {
            c0991q.f12186b = true;
            return;
        }
        if (z6) {
            i8 = 1;
            i7 = i12;
            i = 0;
        } else {
            i = i12 - 1;
            i7 = -1;
            i8 = -1;
        }
        int i14 = 0;
        while (i != i7) {
            View view = this.f9579H[i];
            C0988n c0988n = (C0988n) view.getLayoutParams();
            int iJ12 = j1(AbstractC0960G.H(view), c0966m, c0971s);
            c0988n.f = iJ12;
            c0988n.f12172e = i14;
            i14 += iJ12;
            i += i8;
        }
        float f = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            View view2 = this.f9579H[i16];
            if (c0992r.f12196k != null) {
                r12 = 0;
                r12 = 0;
                if (z6) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z6) {
                r12 = 0;
                b(view2, -1, false);
            } else {
                r12 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f11978b;
            Rect rect = this.f9583L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.J(view2));
            }
            k1(view2, iJ, r12);
            int iC = this.f9590r.c(view2);
            if (iC > i15) {
                i15 = iC;
            }
            float fD = (this.f9590r.d(view2) * 1.0f) / ((C0988n) view2.getLayoutParams()).f;
            if (fD > f) {
                f = fD;
            }
        }
        if (z5) {
            e1(Math.max(Math.round(f * this.f9577F), i11));
            i15 = 0;
            for (int i17 = 0; i17 < i12; i17++) {
                View view3 = this.f9579H[i17];
                k1(view3, 1073741824, true);
                int iC2 = this.f9590r.c(view3);
                if (iC2 > i15) {
                    i15 = iC2;
                }
            }
        }
        for (int i18 = 0; i18 < i12; i18++) {
            View view4 = this.f9579H[i18];
            if (this.f9590r.c(view4) != i15) {
                C0988n c0988n2 = (C0988n) view4.getLayoutParams();
                Rect rect2 = c0988n2.f11990b;
                int i19 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0988n2).topMargin + ((ViewGroup.MarginLayoutParams) c0988n2).bottomMargin;
                int i20 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0988n2).leftMargin + ((ViewGroup.MarginLayoutParams) c0988n2).rightMargin;
                int iG1 = g1(c0988n2.f12172e, c0988n2.f);
                if (this.f9588p == 1) {
                    iW2 = AbstractC0960G.w(false, iG1, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c0988n2).width);
                    iW = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    iW = AbstractC0960G.w(false, iG1, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c0988n2).height);
                    iW2 = iMakeMeasureSpec;
                }
                if (w0(view4, iW2, iW, (C0961H) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        c0991q.f12185a = i15;
        if (this.f9588p == 1) {
            if (c0992r.f == -1) {
                int i21 = c0992r.f12190b;
                i9 = i21 - i15;
                iD2 = i21;
            } else {
                i9 = c0992r.f12190b;
                iD2 = i9 + i15;
            }
            iE = 0;
            iD = 0;
        } else {
            if (c0992r.f == -1) {
                int i22 = c0992r.f12190b;
                iE = i22 - i15;
                iD2 = 0;
                iD = i22;
            } else {
                int i23 = c0992r.f12190b;
                iD = i23 + i15;
                iD2 = 0;
                iE = i23;
            }
            i9 = iD2;
        }
        for (int i24 = 0; i24 < i12; i24++) {
            View view5 = this.f9579H[i24];
            C0988n c0988n3 = (C0988n) view5.getLayoutParams();
            if (this.f9588p != 1) {
                int iG = G() + this.f9578G[c0988n3.f12172e];
                i9 = iG;
                iD2 = this.f9590r.d(view5) + iG;
            } else if (S0()) {
                int iE2 = E() + this.f9578G[this.f9577F - c0988n3.f12172e];
                iD = iE2;
                iE = iE2 - this.f9590r.d(view5);
            } else {
                iE = E() + this.f9578G[c0988n3.f12172e];
                iD = this.f9590r.d(view5) + iE;
            }
            AbstractC0960G.N(view5, iE, i9, iD, iD2);
            if (c0988n3.f11989a.h() || c0988n3.f11989a.k()) {
                c0991q.f12187c = true;
            }
            c0991q.f12188d = view5.hasFocusable() | c0991q.f12188d;
        }
        Arrays.fill(this.f9579H, (Object) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(C0966M c0966m, C0971S c0971s, C0990p c0990p, int i) {
        m1();
        if (c0971s.b() > 0 && !c0971s.f12018g) {
            boolean z5 = i == 1;
            int iI1 = i1(c0990p.f12181b, c0966m, c0971s);
            if (z5) {
                while (iI1 > 0) {
                    int i7 = c0990p.f12181b;
                    if (i7 <= 0) {
                        break;
                    }
                    int i8 = i7 - 1;
                    c0990p.f12181b = i8;
                    iI1 = i1(i8, c0966m, c0971s);
                }
            } else {
                int iB = c0971s.b() - 1;
                int i9 = c0990p.f12181b;
                while (i9 < iB) {
                    int i10 = i9 + 1;
                    int iI12 = i1(i10, c0966m, c0971s);
                    if (iI12 <= iI1) {
                        break;
                    }
                    i9 = i10;
                    iI1 = iI12;
                }
                c0990p.f12181b = i9;
            }
        }
        f1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void V(C0966M c0966m, C0971S c0971s, View view, e eVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0988n)) {
            U(view, eVar);
            return;
        }
        C0988n c0988n = (C0988n) layoutParams;
        int iH1 = h1(c0988n.f11989a.b(), c0966m, c0971s);
        if (this.f9588p == 0) {
            eVar.k(a.a(false, c0988n.f12172e, c0988n.f, iH1, 1));
        } else {
            eVar.k(a.a(false, iH1, 1, c0988n.f12172e, c0988n.f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void W(int i, int i7) {
        m mVar = this.f9582K;
        mVar.p();
        ((SparseIntArray) mVar.f8313s).clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void X() {
        m mVar = this.f9582K;
        mVar.p();
        ((SparseIntArray) mVar.f8313s).clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void Y(int i, int i7) {
        m mVar = this.f9582K;
        mVar.p();
        ((SparseIntArray) mVar.f8313s).clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void Z(int i, int i7) {
        m mVar = this.f9582K;
        mVar.p();
        ((SparseIntArray) mVar.f8313s).clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void a0(int i, int i7) {
        m mVar = this.f9582K;
        mVar.p();
        ((SparseIntArray) mVar.f8313s).clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.a1(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final void b0(C0966M c0966m, C0971S c0971s) {
        boolean z5 = c0971s.f12018g;
        SparseIntArray sparseIntArray = this.f9581J;
        SparseIntArray sparseIntArray2 = this.f9580I;
        if (z5) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                C0988n c0988n = (C0988n) u(i).getLayoutParams();
                int iB = c0988n.f11989a.b();
                sparseIntArray2.put(iB, c0988n.f);
                sparseIntArray.put(iB, c0988n.f12172e);
            }
        }
        super.b0(c0966m, c0971s);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final void c0(C0971S c0971s) {
        super.c0(c0971s);
        this.f9576E = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e1(int i) {
        int i7;
        int[] iArr = this.f9578G;
        int i8 = this.f9577F;
        if (iArr == null || iArr.length != i8 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i8 + 1];
        }
        int i9 = 0;
        iArr[0] = 0;
        int i10 = i / i8;
        int i11 = i % i8;
        int i12 = 0;
        for (int i13 = 1; i13 <= i8; i13++) {
            i9 += i11;
            if (i9 <= 0 || i8 - i9 >= i11) {
                i7 = i10;
            } else {
                i7 = i10 + 1;
                i9 -= i8;
            }
            i12 += i7;
            iArr[i13] = i12;
        }
        this.f9578G = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final boolean f(C0961H c0961h) {
        return c0961h instanceof C0988n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f1() {
        View[] viewArr = this.f9579H;
        if (viewArr == null || viewArr.length != this.f9577F) {
            this.f9579H = new View[this.f9577F];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g1(int i, int i7) {
        if (this.f9588p != 1 || !S0()) {
            int[] iArr = this.f9578G;
            return iArr[i7 + i] - iArr[i];
        }
        int[] iArr2 = this.f9578G;
        int i8 = this.f9577F;
        return iArr2[i8 - i] - iArr2[(i8 - i) - i7];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h1(int i, C0966M c0966m, C0971S c0971s) {
        boolean z5 = c0971s.f12018g;
        m mVar = this.f9582K;
        if (!z5) {
            int i7 = this.f9577F;
            mVar.getClass();
            return m.m(i, i7);
        }
        int iB = c0966m.b(i);
        if (iB != -1) {
            int i8 = this.f9577F;
            mVar.getClass();
            return m.m(iB, i8);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int i1(int i, C0966M c0966m, C0971S c0971s) {
        boolean z5 = c0971s.f12018g;
        m mVar = this.f9582K;
        if (!z5) {
            int i7 = this.f9577F;
            mVar.getClass();
            return i % i7;
        }
        int i8 = this.f9581J.get(i, -1);
        if (i8 != -1) {
            return i8;
        }
        int iB = c0966m.b(i);
        if (iB != -1) {
            int i9 = this.f9577F;
            mVar.getClass();
            return iB % i9;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j1(int i, C0966M c0966m, C0971S c0971s) {
        boolean z5 = c0971s.f12018g;
        m mVar = this.f9582K;
        if (!z5) {
            mVar.getClass();
            return 1;
        }
        int i7 = this.f9580I.get(i, -1);
        if (i7 != -1) {
            return i7;
        }
        if (c0966m.b(i) != -1) {
            mVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final int k(C0971S c0971s) {
        return D0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k1(View view, int i, boolean z5) {
        int iW;
        int iW2;
        C0988n c0988n = (C0988n) view.getLayoutParams();
        Rect rect = c0988n.f11990b;
        int i7 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0988n).topMargin + ((ViewGroup.MarginLayoutParams) c0988n).bottomMargin;
        int i8 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0988n).leftMargin + ((ViewGroup.MarginLayoutParams) c0988n).rightMargin;
        int iG1 = g1(c0988n.f12172e, c0988n.f);
        if (this.f9588p == 1) {
            iW2 = AbstractC0960G.w(false, iG1, i, i8, ((ViewGroup.MarginLayoutParams) c0988n).width);
            iW = AbstractC0960G.w(true, this.f9590r.l(), this.f11986m, i7, ((ViewGroup.MarginLayoutParams) c0988n).height);
        } else {
            int iW3 = AbstractC0960G.w(false, iG1, i, i7, ((ViewGroup.MarginLayoutParams) c0988n).height);
            int iW4 = AbstractC0960G.w(true, this.f9590r.l(), this.f11985l, i8, ((ViewGroup.MarginLayoutParams) c0988n).width);
            iW = iW3;
            iW2 = iW4;
        }
        C0961H c0961h = (C0961H) view.getLayoutParams();
        if (z5 ? w0(view, iW2, iW, c0961h) : u0(view, iW2, iW, c0961h)) {
            view.measure(iW2, iW);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final int l(C0971S c0971s) {
        return E0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l1(int i) {
        if (i == this.f9577F) {
            return;
        }
        this.f9576E = true;
        if (i < 1) {
            throw new IllegalArgumentException(i.i(i, "Span count should be at least 1. Provided "));
        }
        this.f9577F = i;
        this.f9582K.p();
        l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final int m0(int i, C0966M c0966m, C0971S c0971s) {
        m1();
        f1();
        return super.m0(i, c0966m, c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m1() {
        int iD;
        int iG;
        if (this.f9588p == 1) {
            iD = this.f11987n - F();
            iG = E();
        } else {
            iD = this.f11988o - D();
            iG = G();
        }
        e1(iD - iG);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final int n(C0971S c0971s) {
        return D0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final int o(C0971S c0971s) {
        return E0(c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final int o0(int i, C0966M c0966m, C0971S c0971s) {
        m1();
        f1();
        return super.o0(i, c0966m, c0971s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final C0961H r() {
        return this.f9588p == 0 ? new C0988n(-2, -1) : new C0988n(-1, -2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final void r0(Rect rect, int i, int i7) {
        int iG;
        int iG2;
        if (this.f9578G == null) {
            super.r0(rect, i, i7);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.f9588p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f11978b;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            iG2 = AbstractC0960G.g(i7, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f9578G;
            iG = AbstractC0960G.g(i, iArr[iArr.length - 1] + iF, this.f11978b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f11978b;
            WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
            iG = AbstractC0960G.g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f9578G;
            iG2 = AbstractC0960G.g(i7, iArr2[iArr2.length - 1] + iD, this.f11978b.getMinimumHeight());
        }
        this.f11978b.setMeasuredDimension(iG, iG2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final C0961H s(Context context, AttributeSet attributeSet) {
        C0988n c0988n = new C0988n(context, attributeSet);
        c0988n.f12172e = -1;
        c0988n.f = 0;
        return c0988n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final C0961H t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0988n c0988n = new C0988n((ViewGroup.MarginLayoutParams) layoutParams);
            c0988n.f12172e = -1;
            c0988n.f = 0;
            return c0988n;
        }
        C0988n c0988n2 = new C0988n(layoutParams);
        c0988n2.f12172e = -1;
        c0988n2.f = 0;
        return c0988n2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0960G
    public final int x(C0966M c0966m, C0971S c0971s) {
        if (this.f9588p == 1) {
            return this.f9577F;
        }
        if (c0971s.b() < 1) {
            return 0;
        }
        return h1(c0971s.b() - 1, c0966m, c0971s) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, d2.AbstractC0960G
    public final boolean z0() {
        return this.f9598z == null && !this.f9576E;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f9576E = false;
        this.f9577F = -1;
        this.f9580I = new SparseIntArray();
        this.f9581J = new SparseIntArray();
        this.f9582K = new m(5);
        this.f9583L = new Rect();
        l1(i);
    }
}
