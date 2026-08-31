package B0;

import android.graphics.Paint;
import c0.AbstractC0724l;
import j0.AbstractC1145B;
import m0.C1348c;
import z0.AbstractC1933J;
import z0.C1952l;

/* JADX INFO: renamed from: B0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0056v extends n0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final W1.d f516c0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final B0 f517a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C0055u f518b0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        W1.d dVarF = AbstractC1145B.f();
        dVarF.e(j0.o.f13720d);
        ((Paint) dVarF.f8044b).setStrokeWidth(1.0f);
        dVarF.j(1);
        f516c0 = dVarF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0056v(L l7) {
        super(l7);
        B0 b02 = new B0();
        b02.f10103t = 0;
        this.f517a0 = b02;
        b02.f10107x = this;
        this.f518b0 = l7.f286x != null ? new C0055u(this) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.n0
    public final AbstractC0724l B0() {
        return this.f517a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:101:0x00de */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:104:0x0122 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0119 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:97:0x0128 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x00de */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [R.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [R.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // B0.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(B0.C0037e r19, long r20, B0.C0054t r22, int r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r20
            r9 = r22
            int r2 = r1.f408q
            r12 = 1
            r13 = 0
            B0.L r5 = r0.f478B
            switch(r2) {
                case 1: goto L20;
                default: goto L11;
            }
        L11:
            I0.i r2 = r5.u()
            if (r2 == 0) goto L1d
            boolean r2 = r2.f2260t
            if (r2 != r12) goto L1d
            r2 = r12
            goto L1e
        L1d:
            r2 = r13
        L1e:
            r2 = r2 ^ r12
            goto L21
        L20:
            r2 = r12
        L21:
            if (r2 == 0) goto L4a
            boolean r2 = r0.W0(r3)
            if (r2 == 0) goto L2f
            r2 = r23
            r11 = r24
            r6 = r12
            goto L4f
        L2f:
            r2 = r23
            if (r2 != r12) goto L4c
            long r6 = r0.A0()
            float r6 = r0.s0(r3, r6)
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            r7 = 2139095040(0x7f800000, float:Infinity)
            if (r6 >= r7) goto L4c
            r6 = r12
            r11 = r13
            goto L4f
        L4a:
            r2 = r23
        L4c:
            r11 = r24
            r6 = r13
        L4f:
            if (r6 == 0) goto L13a
            int r14 = r9.f515s
            R.e r5 = r5.v()
            java.lang.Object[] r15 = r5.f6676q
            int r5 = r5.f6678s
            int r5 = r5 - r12
            r16 = r5
        L5e:
            if (r16 < 0) goto L138
            r5 = r15[r16]
            B0.L r5 = (B0.L) r5
            boolean r6 = r5.G()
            if (r6 == 0) goto L130
            int r6 = r1.f408q
            switch(r6) {
                case 1: goto L88;
                default: goto L6f;
            }
        L6f:
            B0.g0 r6 = r5.f268U
            B0.n0 r7 = r6.f431c
            long r7 = r7.x0(r3)
            B0.n0 r6 = r6.f431c
            r10 = r5
            r5 = r6
            B0.e r6 = B0.n0.f477Z
            r17 = r10
            r10 = 1
            r5.G0(r6, r7, r9, r10, r11)
            r9 = r22
            r10 = r17
            goto L90
        L88:
            r6 = r2
            r2 = r5
            r5 = r9
            r7 = r11
            r2.y(r3, r5, r6, r7)
            r10 = r2
        L90:
            long r2 = r9.d()
            float r4 = B0.AbstractC0041g.k(r2)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L130
            boolean r4 = B0.AbstractC0041g.p(r2)
            if (r4 == 0) goto L130
            boolean r2 = B0.AbstractC0041g.o(r2)
            if (r2 != 0) goto L130
            B0.g0 r2 = r10.f268U
            B0.n0 r2 = r2.f431c
            r2.getClass()
            r3 = 16
            boolean r4 = B0.o0.g(r3)
            c0.l r2 = r2.D0(r4)
            if (r2 != 0) goto Lbe
            goto L138
        Lbe:
            boolean r4 = r2.f10099D
            if (r4 == 0) goto L138
            c0.l r4 = r2.f10100q
            boolean r4 = r4.f10099D
            if (r4 != 0) goto Lcd
            java.lang.String r4 = "visitLocalDescendants called on an unattached node"
            y0.AbstractC1904a.b(r4)
        Lcd:
            c0.l r2 = r2.f10100q
            int r4 = r2.f10103t
            r4 = r4 & r3
            if (r4 == 0) goto L138
        Ld4:
            if (r2 == 0) goto L138
            int r4 = r2.f10102s
            r4 = r4 & r3
            if (r4 == 0) goto L12d
            r4 = 0
            r5 = r2
            r6 = r4
        Lde:
            if (r5 == 0) goto L12d
            boolean r7 = r5 instanceof B0.y0
            if (r7 == 0) goto Lf4
            B0.y0 r5 = (B0.y0) r5
            boolean r5 = r5.N()
            if (r5 == 0) goto L128
            r.C r2 = r9.f513q
            int r2 = r2.f16115b
            int r2 = r2 - r12
            r9.f515s = r2
            goto L130
        Lf4:
            int r7 = r5.f10102s
            r7 = r7 & r3
            if (r7 == 0) goto L128
            boolean r7 = r5 instanceof B0.AbstractC0049n
            if (r7 == 0) goto L128
            r7 = r5
            B0.n r7 = (B0.AbstractC0049n) r7
            c0.l r7 = r7.f473F
            r8 = r13
        L103:
            if (r7 == 0) goto L125
            int r10 = r7.f10102s
            r10 = r10 & r3
            if (r10 == 0) goto L122
            int r8 = r8 + 1
            if (r8 != r12) goto L110
            r5 = r7
            goto L122
        L110:
            if (r6 != 0) goto L119
            R.e r6 = new R.e
            c0.l[] r10 = new c0.AbstractC0724l[r3]
            r6.<init>(r10)
        L119:
            if (r5 == 0) goto L11f
            r6.c(r5)
            r5 = r4
        L11f:
            r6.c(r7)
        L122:
            c0.l r7 = r7.f10105v
            goto L103
        L125:
            if (r8 != r12) goto L128
            goto Lde
        L128:
            c0.l r5 = B0.AbstractC0041g.f(r6)
            goto Lde
        L12d:
            c0.l r2 = r2.f10105v
            goto Ld4
        L130:
            int r16 = r16 + (-1)
            r3 = r20
            r2 = r23
            goto L5e
        L138:
            r9.f515s = r14
        L13a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0056v.H0(B0.e, long, B0.t, int, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.n0
    public final void Q0(j0.m mVar, C1348c c1348c) {
        L l7 = this.f478B;
        t0 t0VarA = O.a(l7);
        R.e eVarV = l7.v();
        Object[] objArr = eVarV.f6676q;
        int i = eVarV.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            L l8 = (L) objArr[i7];
            if (l8.G()) {
                l8.j(mVar, c1348c);
            }
        }
        if (((C0.A) t0VarA).getShowLayoutBounds()) {
            long j = this.f18666s;
            mVar.j(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f516c0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J
    public final void U(long j, float f, B5.c cVar) {
        R0(j, f, cVar);
        if (this.f321w) {
            return;
        }
        this.f478B.f269V.f311p.d0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final int Y(C1952l c1952l) {
        C0055u c0055u = this.f518b0;
        if (c0055u != null) {
            return c0055u.Y(c1952l);
        }
        C0034c0 c0034c0 = this.f478B.f269V.f311p;
        M m4 = c0034c0.f386M;
        if (c0034c0.f400v.f302d == G.f225q) {
            m4.f292d = true;
            if (m4.f290b) {
                c0034c0.f384K = true;
                c0034c0.f385L = true;
            }
        } else {
            m4.f293e = true;
        }
        c0034c0.n().f322x = true;
        c0034c0.t();
        c0034c0.n().f322x = false;
        Integer num = (Integer) m4.f294g.get(c1952l);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1925B
    public final AbstractC1933J a(long j) {
        X(j);
        L l7 = this.f478B;
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            ((L) objArr[i7]).f269V.f311p.f375B = I.f239s;
        }
        T0(l7.f260M.c(this, l7.f269V.f311p.Y(), j));
        N0();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.n0
    public final void v0() {
        if (this.f518b0 == null) {
            this.f518b0 = new C0055u(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.n0
    public final U z0() {
        return this.f518b0;
    }
}
