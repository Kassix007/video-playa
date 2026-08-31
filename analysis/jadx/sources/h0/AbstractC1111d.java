package h0;

import A.C0021s;
import A.J;
import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0042g0;
import B0.L;
import B0.n0;
import B0.t0;
import C0.A;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import c0.AbstractC0724l;
import i0.C1131c;
import java.util.Arrays;
import y0.AbstractC1904a;
import z0.AbstractC1938O;

/* JADX INFO: renamed from: h0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1111d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f13401a = new int[2];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab A[PHI: r0
  0x00ab: PHI (r0v11 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int) binds: [B:54:0x00a9, B:57:0x00ae, B:60:0x00b2, B:63:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(h0.o r10, int r11, B5.c r12) {
        /*
            c0.l r0 = r10.f10100q
            boolean r0 = r0.f10099D
            if (r0 != 0) goto Lb
            java.lang.String r0 = "visitAncestors called on an unattached node"
            y0.AbstractC1904a.b(r0)
        Lb:
            c0.l r0 = r10.f10100q
            c0.l r0 = r0.f10104u
            B0.L r1 = B0.AbstractC0041g.u(r10)
        L13:
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L82
            B0.g0 r5 = r1.f268U
            c0.l r5 = r5.f433e
            int r5 = r5.f10103t
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L73
        L22:
            if (r0 == 0) goto L73
            int r5 = r0.f10102s
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L70
            r5 = r0
            r6 = r4
        L2c:
            if (r5 == 0) goto L70
            boolean r7 = r5 instanceof h0.o
            if (r7 == 0) goto L33
            goto L83
        L33:
            int r7 = r5.f10102s
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L6b
            boolean r7 = r5 instanceof B0.AbstractC0049n
            if (r7 == 0) goto L6b
            r7 = r5
            B0.n r7 = (B0.AbstractC0049n) r7
            c0.l r7 = r7.f473F
            r8 = r2
        L43:
            if (r7 == 0) goto L68
            int r9 = r7.f10102s
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L65
            int r8 = r8 + 1
            if (r8 != r3) goto L51
            r5 = r7
            goto L65
        L51:
            if (r6 != 0) goto L5c
            R.e r6 = new R.e
            r9 = 16
            c0.l[] r9 = new c0.AbstractC0724l[r9]
            r6.<init>(r9)
        L5c:
            if (r5 == 0) goto L62
            r6.c(r5)
            r5 = r4
        L62:
            r6.c(r7)
        L65:
            c0.l r7 = r7.f10105v
            goto L43
        L68:
            if (r8 != r3) goto L6b
            goto L2c
        L6b:
            c0.l r5 = B0.AbstractC0041g.f(r6)
            goto L2c
        L70:
            c0.l r0 = r0.f10104u
            goto L22
        L73:
            B0.L r1 = r1.s()
            if (r1 == 0) goto L80
            B0.g0 r0 = r1.f268U
            if (r0 == 0) goto L80
            B0.B0 r0 = r0.f432d
            goto L13
        L80:
            r0 = r4
            goto L13
        L82:
            r5 = r4
        L83:
            h0.o r5 = (h0.o) r5
            if (r5 == 0) goto L9d
            A0.h r0 = z0.AbstractC1946f.f18691a
            java.lang.Object r1 = r5.e(r0)
            E.n r1 = (E.C0131n) r1
            java.lang.Object r0 = r10.e(r0)
            E.n r0 = (E.C0131n) r0
            boolean r0 = kotlin.jvm.internal.m.a(r1, r0)
            if (r0 == 0) goto L9d
            goto L180
        L9d:
            A0.h r0 = z0.AbstractC1946f.f18691a
            java.lang.Object r10 = r10.e(r0)
            E.n r10 = (E.C0131n) r10
            if (r10 == 0) goto L180
            r0 = 5
            r1 = 2
            if (r11 != r0) goto Lad
        Lab:
            r3 = r0
            goto Lbf
        Lad:
            r0 = 6
            if (r11 != r0) goto Lb1
            goto Lab
        Lb1:
            r0 = 3
            if (r11 != r0) goto Lb5
            goto Lab
        Lb5:
            r0 = 4
            if (r11 != r0) goto Lb9
            goto Lab
        Lb9:
            if (r11 != r3) goto Lbd
            r3 = r1
            goto Lbf
        Lbd:
            if (r11 != r1) goto L178
        Lbf:
            E.o r11 = r10.f1577E
            int r11 = r11.a()
            if (r11 <= 0) goto L171
            E.o r11 = r10.f1577E
            boolean r11 = r11.c()
            if (r11 == 0) goto L171
            boolean r11 = r10.f10099D
            if (r11 != 0) goto Ld5
            goto L171
        Ld5:
            boolean r11 = r10.y0(r3)
            if (r11 == 0) goto Le2
            E.o r11 = r10.f1577E
            int r11 = r11.b()
            goto Le8
        Le2:
            E.o r11 = r10.f1577E
            int r11 = r11.e()
        Le8:
            kotlin.jvm.internal.y r0 = new kotlin.jvm.internal.y
            r0.<init>()
            E.k r5 = r10.f1578F
            r5.getClass()
            E.j r6 = new E.j
            r6.<init>(r11, r11)
            R.e r11 = r5.f1572a
            r11.c(r6)
            r0.f14268q = r6
            E.o r11 = r10.f1577E
            int r11 = r11.d()
            int r11 = r11 * r1
            E.o r1 = r10.f1577E
            int r1 = r1.a()
            if (r11 <= r1) goto L10e
            r11 = r1
        L10e:
            if (r4 != 0) goto L15e
            java.lang.Object r1 = r0.f14268q
            E.j r1 = (E.C0127j) r1
            boolean r1 = r10.x0(r1, r3)
            if (r1 == 0) goto L15e
            if (r2 >= r11) goto L15e
            java.lang.Object r1 = r0.f14268q
            E.j r1 = (E.C0127j) r1
            int r4 = r1.f1570a
            int r1 = r1.f1571b
            boolean r5 = r10.y0(r3)
            if (r5 == 0) goto L12d
            int r1 = r1 + 1
            goto L12f
        L12d:
            int r4 = r4 + (-1)
        L12f:
            E.k r5 = r10.f1578F
            r5.getClass()
            E.j r6 = new E.j
            r6.<init>(r4, r1)
            R.e r1 = r5.f1572a
            r1.c(r6)
            E.k r1 = r10.f1578F
            java.lang.Object r4 = r0.f14268q
            E.j r4 = (E.C0127j) r4
            R.e r1 = r1.f1572a
            r1.l(r4)
            r0.f14268q = r6
            int r2 = r2 + 1
            B0.L r1 = B0.AbstractC0041g.u(r10)
            r1.l()
            E.m r1 = new E.m
            r1.<init>(r10, r0, r3)
            java.lang.Object r4 = r12.invoke(r1)
            goto L10e
        L15e:
            E.k r11 = r10.f1578F
            java.lang.Object r12 = r0.f14268q
            E.j r12 = (E.C0127j) r12
            R.e r11 = r11.f1572a
            r11.l(r12)
            B0.L r10 = B0.AbstractC0041g.u(r10)
            r10.l()
            return r4
        L171:
            E.l r10 = E.C0131n.f1576H
            java.lang.Object r10 = r12.invoke(r10)
            return r10
        L178:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unsupported direction for beyond bounds layout"
            r10.<init>(r11)
            throw r10
        L180:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC1111d.A(h0.o, int, B5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean B(int i, J j, o oVar, C1131c c1131c) {
        o oVarH;
        R.e eVar = new R.e(new o[16]);
        if (!oVar.f10100q.f10099D) {
            AbstractC1904a.b("visitChildren called on an unattached node");
        }
        R.e eVar2 = new R.e(new AbstractC0724l[16]);
        AbstractC0724l abstractC0724l = oVar.f10100q;
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10105v;
        if (abstractC0724l2 == null) {
            AbstractC0041g.b(eVar2, abstractC0724l);
        } else {
            eVar2.c(abstractC0724l2);
        }
        while (true) {
            int i7 = eVar2.f6678s;
            if (i7 == 0) {
                break;
            }
            AbstractC0724l abstractC0724lF = (AbstractC0724l) eVar2.m(i7 - 1);
            if ((abstractC0724lF.f10103t & 1024) == 0) {
                AbstractC0041g.b(eVar2, abstractC0724lF);
            } else {
                while (true) {
                    if (abstractC0724lF == null) {
                        break;
                    }
                    if ((abstractC0724lF.f10102s & 1024) != 0) {
                        R.e eVar3 = null;
                        while (abstractC0724lF != null) {
                            if (abstractC0724lF instanceof o) {
                                o oVar2 = (o) abstractC0724lF;
                                if (oVar2.f10099D) {
                                    eVar.c(oVar2);
                                }
                            } else if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                int i8 = 0;
                                for (AbstractC0724l abstractC0724l3 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l3 != null; abstractC0724l3 = abstractC0724l3.f10105v) {
                                    if ((abstractC0724l3.f10102s & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            abstractC0724lF = abstractC0724l3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (abstractC0724lF != null) {
                                                eVar3.c(abstractC0724lF);
                                                abstractC0724lF = null;
                                            }
                                            eVar3.c(abstractC0724l3);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            abstractC0724lF = AbstractC0041g.f(eVar3);
                        }
                    } else {
                        abstractC0724lF = abstractC0724lF.f10105v;
                    }
                }
            }
        }
        while (eVar.f6678s != 0 && (oVarH = h(eVar, c1131c, i)) != null) {
            if (oVarH.y0().f13418a) {
                return ((Boolean) j.invoke(oVarH)).booleanValue();
            }
            if (l(i, j, oVarH, c1131c)) {
                return true;
            }
            eVar.l(oVarH);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0197 A[EDGE_INSN: B:157:0x0197->B:127:0x0197 BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean C(h0.o r12, h0.o r13, int r14, A.J r15) {
        /*
            h0.n r0 = r12.z0()
            h0.n r1 = h0.n.f13431r
            if (r0 != r1) goto L1ae
            r0 = 16
            h0.o[] r1 = new h0.o[r0]
            c0.l r2 = r12.f10100q
            boolean r2 = r2.f10099D
            if (r2 != 0) goto L17
            java.lang.String r2 = "visitChildren called on an unattached node"
            y0.AbstractC1904a.b(r2)
        L17:
            R.e r2 = new R.e
            c0.l[] r3 = new c0.AbstractC0724l[r0]
            r2.<init>(r3)
            c0.l r3 = r12.f10100q
            c0.l r4 = r3.f10105v
            r5 = 0
            if (r4 != 0) goto L2a
            B0.AbstractC0041g.b(r2, r3)
        L28:
            r3 = r5
            goto L2e
        L2a:
            r2.c(r4)
            goto L28
        L2e:
            int r4 = r2.f6678s
            r6 = 0
            r7 = 1
            if (r4 == 0) goto Lab
            int r4 = r4 + (-1)
            java.lang.Object r4 = r2.m(r4)
            c0.l r4 = (c0.AbstractC0724l) r4
            int r8 = r4.f10103t
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L46
            B0.AbstractC0041g.b(r2, r4)
            goto L2e
        L46:
            if (r4 == 0) goto L2e
            int r8 = r4.f10102s
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto La8
            r8 = r6
        L4f:
            if (r4 == 0) goto L2e
            boolean r9 = r4 instanceof h0.o
            if (r9 == 0) goto L6d
            h0.o r4 = (h0.o) r4
            int r9 = r3 + 1
            int r10 = r1.length
            if (r10 >= r9) goto L69
            int r10 = r1.length
            int r11 = r10 * 2
            int r11 = java.lang.Math.max(r9, r11)
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.System.arraycopy(r1, r5, r11, r5, r10)
            r1 = r11
        L69:
            r1[r3] = r4
            r3 = r9
            goto La3
        L6d:
            int r9 = r4.f10102s
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto La3
            boolean r9 = r4 instanceof B0.AbstractC0049n
            if (r9 == 0) goto La3
            r9 = r4
            B0.n r9 = (B0.AbstractC0049n) r9
            c0.l r9 = r9.f473F
            r10 = r5
        L7d:
            if (r9 == 0) goto La0
            int r11 = r9.f10102s
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L9d
            int r10 = r10 + 1
            if (r10 != r7) goto L8b
            r4 = r9
            goto L9d
        L8b:
            if (r8 != 0) goto L94
            R.e r8 = new R.e
            c0.l[] r11 = new c0.AbstractC0724l[r0]
            r8.<init>(r11)
        L94:
            if (r4 == 0) goto L9a
            r8.c(r4)
            r4 = r6
        L9a:
            r8.c(r9)
        L9d:
            c0.l r9 = r9.f10105v
            goto L7d
        La0:
            if (r10 != r7) goto La3
            goto L4f
        La3:
            c0.l r4 = B0.AbstractC0041g.f(r8)
            goto L4f
        La8:
            c0.l r4 = r4.f10105v
            goto L46
        Lab:
            h0.q r2 = h0.q.f13439a
            java.util.Arrays.sort(r1, r5, r3, r2)
            if (r14 != r7) goto Lde
            G5.d r2 = D5.a.O(r5, r3)
            int r3 = r2.f2017q
            int r2 = r2.f2018r
            if (r3 > r2) goto L10d
            r4 = r5
        Lbd:
            if (r4 == 0) goto Ld0
            r8 = r1[r3]
            h0.o r8 = (h0.o) r8
            boolean r9 = s(r8)
            if (r9 == 0) goto Ld0
            boolean r8 = k(r8, r15)
            if (r8 == 0) goto Ld0
            goto Lfe
        Ld0:
            r8 = r1[r3]
            boolean r8 = kotlin.jvm.internal.m.a(r8, r13)
            if (r8 == 0) goto Ld9
            r4 = r7
        Ld9:
            if (r3 == r2) goto L10d
            int r3 = r3 + 1
            goto Lbd
        Lde:
            r2 = 2
            if (r14 != r2) goto L1a6
            G5.d r2 = D5.a.O(r5, r3)
            int r3 = r2.f2017q
            int r2 = r2.f2018r
            if (r3 > r2) goto L10d
            r4 = r5
        Lec:
            if (r4 == 0) goto Lff
            r8 = r1[r2]
            h0.o r8 = (h0.o) r8
            boolean r9 = s(r8)
            if (r9 == 0) goto Lff
            boolean r8 = a(r8, r15)
            if (r8 == 0) goto Lff
        Lfe:
            return r7
        Lff:
            r8 = r1[r2]
            boolean r8 = kotlin.jvm.internal.m.a(r8, r13)
            if (r8 == 0) goto L108
            r4 = r7
        L108:
            if (r2 == r3) goto L10d
            int r2 = r2 + (-1)
            goto Lec
        L10d:
            if (r14 != r7) goto L111
            goto L1a5
        L111:
            h0.k r13 = r12.y0()
            boolean r13 = r13.f13418a
            if (r13 == 0) goto L1a5
            c0.l r13 = r12.f10100q
            boolean r13 = r13.f10099D
            if (r13 != 0) goto L124
            java.lang.String r13 = "visitAncestors called on an unattached node"
            y0.AbstractC1904a.b(r13)
        L124:
            c0.l r13 = r12.f10100q
            c0.l r13 = r13.f10104u
            B0.L r14 = B0.AbstractC0041g.u(r12)
        L12c:
            if (r14 == 0) goto L197
            B0.g0 r1 = r14.f268U
            c0.l r1 = r1.f433e
            int r1 = r1.f10103t
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L188
        L138:
            if (r13 == 0) goto L188
            int r1 = r13.f10102s
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L185
            r1 = r13
            r2 = r6
        L142:
            if (r1 == 0) goto L185
            boolean r3 = r1 instanceof h0.o
            if (r3 == 0) goto L14a
            r6 = r1
            goto L197
        L14a:
            int r3 = r1.f10102s
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L180
            boolean r3 = r1 instanceof B0.AbstractC0049n
            if (r3 == 0) goto L180
            r3 = r1
            B0.n r3 = (B0.AbstractC0049n) r3
            c0.l r3 = r3.f473F
            r4 = r5
        L15a:
            if (r3 == 0) goto L17d
            int r8 = r3.f10102s
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L17a
            int r4 = r4 + 1
            if (r4 != r7) goto L168
            r1 = r3
            goto L17a
        L168:
            if (r2 != 0) goto L171
            R.e r2 = new R.e
            c0.l[] r8 = new c0.AbstractC0724l[r0]
            r2.<init>(r8)
        L171:
            if (r1 == 0) goto L177
            r2.c(r1)
            r1 = r6
        L177:
            r2.c(r3)
        L17a:
            c0.l r3 = r3.f10105v
            goto L15a
        L17d:
            if (r4 != r7) goto L180
            goto L142
        L180:
            c0.l r1 = B0.AbstractC0041g.f(r2)
            goto L142
        L185:
            c0.l r13 = r13.f10104u
            goto L138
        L188:
            B0.L r14 = r14.s()
            if (r14 == 0) goto L195
            B0.g0 r13 = r14.f268U
            if (r13 == 0) goto L195
            B0.B0 r13 = r13.f432d
            goto L12c
        L195:
            r13 = r6
            goto L12c
        L197:
            if (r6 != 0) goto L19a
            goto L1a5
        L19a:
            java.lang.Object r12 = r15.invoke(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            return r12
        L1a5:
            return r5
        L1a6:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "This function should only be used for 1-D focus search"
            r12.<init>(r13)
            throw r12
        L1ae:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "This function should only be used within a parent that has focus."
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC1111d.C(h0.o, h0.o, int, A.J):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Integer D(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1110c E(int i) {
        if (i == 1) {
            return new C1110c(2);
        }
        if (i == 2) {
            return new C1110c(1);
        }
        if (i == 17) {
            return new C1110c(3);
        }
        if (i == 33) {
            return new C1110c(5);
        }
        if (i == 66) {
            return new C1110c(4);
        }
        if (i != 130) {
            return null;
        }
        return new C1110c(6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Boolean F(int i, J j, o oVar, C1131c c1131c) {
        int iOrdinal = oVar.z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                o oVarN = n(oVar);
                if (oVarN == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = oVarN.z0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolF = F(i, j, oVarN, c1131c);
                        if (!kotlin.jvm.internal.m.a(boolF, Boolean.FALSE)) {
                            return boolF;
                        }
                        if (c1131c == null) {
                            if (oVarN.z0() != n.f13431r) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            o oVarG = g(oVarN);
                            if (oVarG == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c1131c = j(oVarG);
                        }
                        return Boolean.valueOf(l(i, j, oVar, c1131c));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new C2.e();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c1131c == null) {
                    c1131c = j(oVarN);
                }
                return Boolean.valueOf(l(i, j, oVar, c1131c));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return oVar.y0().f13418a ? (Boolean) j.invoke(oVar) : c1131c == null ? Boolean.valueOf(i(oVar, i, j)) : Boolean.valueOf(B(i, j, oVar, c1131c));
                }
                throw new C2.e();
            }
        }
        return Boolean.valueOf(i(oVar, i, j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(h0.o r7, A.J r8) {
        /*
            h0.n r0 = r7.z0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L89
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L37
            if (r0 == r3) goto L89
            if (r0 != r1) goto L31
            boolean r0 = x(r7, r8)
            if (r0 != 0) goto L7d
            h0.k r0 = r7.y0()
            boolean r0 = r0.f13418a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L7c
            goto L7d
        L31:
            C2.e r7 = new C2.e
            r7.<init>()
            throw r7
        L37:
            h0.o r0 = n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L83
            h0.n r6 = r0.z0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7e
            if (r6 == r4) goto L5b
            if (r6 == r3) goto L7e
            if (r6 == r1) goto L55
            C2.e r7 = new C2.e
            r7.<init>()
            throw r7
        L55:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L5b:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L7d
            boolean r7 = m(r7, r0, r3, r8)
            if (r7 != 0) goto L7d
            h0.k r7 = r0.y0()
            boolean r7 = r7.f13418a
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            goto L7d
        L7c:
            return r2
        L7d:
            return r4
        L7e:
            boolean r7 = m(r7, r0, r3, r8)
            return r7
        L83:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
            throw r7
        L89:
            boolean r7 = x(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC1111d.a(h0.o, A.J):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(C1131c c1131c, C1131c c1131c2, C1131c c1131c3, int i) {
        float f;
        float f7;
        boolean zC = c(i, c1131c3, c1131c);
        float f8 = c1131c3.f13523b;
        float f9 = c1131c3.f13525d;
        float f10 = c1131c3.f13522a;
        float f11 = c1131c3.f13524c;
        float f12 = c1131c.f13525d;
        float f13 = c1131c.f13523b;
        float f14 = c1131c.f13524c;
        float f15 = c1131c.f13522a;
        if (zC || !c(i, c1131c2, c1131c)) {
            return false;
        }
        if (i == 3) {
            if (f15 < f11) {
                return true;
            }
        } else if (i == 4) {
            if (f14 > f10) {
                return true;
            }
        } else if (i == 5) {
            if (f13 < f9) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f12 > f8) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f = f15 - c1131c2.f13524c;
        } else if (i == 4) {
            f = c1131c2.f13522a - f14;
        } else if (i == 5) {
            f = f13 - c1131c2.f13525d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = c1131c2.f13523b - f12;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (i == 3) {
            f7 = f15 - f10;
        } else if (i == 4) {
            f7 = f11 - f14;
        } else if (i == 5) {
            f7 = f13 - f8;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f7 = f9 - f12;
        }
        if (f7 < 1.0f) {
            f7 = 1.0f;
        }
        return f < f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(int i, C1131c c1131c, C1131c c1131c2) {
        if (i == 3 || i == 4) {
            return c1131c.f13525d > c1131c2.f13523b && c1131c.f13523b < c1131c2.f13525d;
        }
        if (i == 5 || i == 6) {
            return c1131c.f13524c > c1131c2.f13522a && c1131c.f13522a < c1131c2.f13524c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1131c d(View view, A a7) {
        int[] iArr = f13401a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i7 = iArr[1];
        a7.getLocationInWindow(iArr);
        float f = i - iArr[0];
        float f7 = i7 - iArr[1];
        return new C1131c(f, f7, view.getWidth() + f, view.getHeight() + f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(o oVar, boolean z5) {
        int iOrdinal = oVar.z0().ordinal();
        n nVar = n.f13433t;
        if (iOrdinal == 0) {
            ((C1115h) ((A) AbstractC0041g.v(oVar)).getFocusOwner()).e(null);
            oVar.x0(n.f13430q, nVar);
            return true;
        }
        if (iOrdinal == 1) {
            o oVarN = n(oVar);
            if (!(oVarN != null ? e(oVarN, z5) : true)) {
                return false;
            }
            oVar.x0(n.f13431r, nVar);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new C2.e();
        }
        if (z5) {
            ((C1115h) ((A) AbstractC0041g.v(oVar)).getFocusOwner()).e(null);
            oVar.x0(n.f13432s, nVar);
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(o oVar, R.e eVar) {
        if (!oVar.f10100q.f10099D) {
            AbstractC1904a.b("visitChildren called on an unattached node");
        }
        R.e eVar2 = new R.e(new AbstractC0724l[16]);
        AbstractC0724l abstractC0724l = oVar.f10100q;
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10105v;
        if (abstractC0724l2 == null) {
            AbstractC0041g.b(eVar2, abstractC0724l);
        } else {
            eVar2.c(abstractC0724l2);
        }
        while (true) {
            int i = eVar2.f6678s;
            if (i == 0) {
                return;
            }
            AbstractC0724l abstractC0724lF = (AbstractC0724l) eVar2.m(i - 1);
            if ((abstractC0724lF.f10103t & 1024) == 0) {
                AbstractC0041g.b(eVar2, abstractC0724lF);
            } else {
                while (true) {
                    if (abstractC0724lF == null) {
                        break;
                    }
                    if ((abstractC0724lF.f10102s & 1024) != 0) {
                        R.e eVar3 = null;
                        while (abstractC0724lF != null) {
                            if (abstractC0724lF instanceof o) {
                                o oVar2 = (o) abstractC0724lF;
                                if (oVar2.f10099D && !AbstractC0041g.u(oVar2).f278e0) {
                                    if (oVar2.y0().f13418a) {
                                        eVar.c(oVar2);
                                    } else {
                                        f(oVar2, eVar);
                                    }
                                }
                            } else if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                int i7 = 0;
                                for (AbstractC0724l abstractC0724l3 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l3 != null; abstractC0724l3 = abstractC0724l3.f10105v) {
                                    if ((abstractC0724l3.f10102s & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            abstractC0724lF = abstractC0724l3;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (abstractC0724lF != null) {
                                                eVar3.c(abstractC0724lF);
                                                abstractC0724lF = null;
                                            }
                                            eVar3.c(abstractC0724l3);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0724lF = AbstractC0041g.f(eVar3);
                        }
                    } else {
                        abstractC0724lF = abstractC0724lF.f10105v;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o g(o oVar) {
        o oVar2 = ((C1115h) ((A) AbstractC0041g.v(oVar)).getFocusOwner()).j;
        if (oVar2 == null || !oVar2.f10099D) {
            return null;
        }
        return oVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final o h(R.e eVar, C1131c c1131c, int i) {
        C1131c c1131cD;
        if (i == 3) {
            c1131cD = c1131c.d((c1131c.f13524c - c1131c.f13522a) + 1, 0.0f);
        } else if (i == 4) {
            c1131cD = c1131c.d(-((c1131c.f13524c - c1131c.f13522a) + 1), 0.0f);
        } else if (i == 5) {
            c1131cD = c1131c.d(0.0f, (c1131c.f13525d - c1131c.f13523b) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c1131cD = c1131c.d(0.0f, -((c1131c.f13525d - c1131c.f13523b) + 1));
        }
        Object[] objArr = eVar.f6676q;
        int i7 = eVar.f6678s;
        o oVar = null;
        for (int i8 = 0; i8 < i7; i8++) {
            o oVar2 = (o) objArr[i8];
            if (s(oVar2)) {
                C1131c c1131cJ = j(oVar2);
                if (p(c1131cJ, c1131cD, c1131c, i)) {
                    oVar = oVar2;
                    c1131cD = c1131cJ;
                }
            }
        }
        return oVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean i(o oVar, int i, B5.c cVar) {
        C1131c c1131c;
        R.e eVar = new R.e(new o[16]);
        f(oVar, eVar);
        int i7 = eVar.f6678s;
        if (i7 <= 1) {
            o oVar2 = (o) (i7 == 0 ? null : eVar.f6676q[0]);
            if (oVar2 != null) {
                return ((Boolean) cVar.invoke(oVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C1131c c1131cJ = j(oVar);
                float f = c1131cJ.f13522a;
                float f7 = c1131cJ.f13523b;
                c1131c = new C1131c(f, f7, f, f7);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C1131c c1131cJ2 = j(oVar);
                float f8 = c1131cJ2.f13524c;
                float f9 = c1131cJ2.f13525d;
                c1131c = new C1131c(f8, f9, f8, f9);
            }
            o oVarH = h(eVar, c1131c, i);
            if (oVarH != null) {
                return ((Boolean) cVar.invoke(oVarH)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1131c j(o oVar) {
        n0 n0Var = oVar.f10107x;
        return n0Var != null ? AbstractC1938O.f(n0Var).I(n0Var, false) : C1131c.f13521e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean k(o oVar, J j) {
        int iOrdinal = oVar.z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                o oVarN = n(oVar);
                if (oVarN != null) {
                    return k(oVarN, j) || m(oVar, oVarN, 1, j);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return oVar.y0().f13418a ? ((Boolean) j.invoke(oVar)).booleanValue() : y(oVar, j);
                }
                throw new C2.e();
            }
        }
        return y(oVar, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean l(int i, J j, o oVar, C1131c c1131c) {
        if (B(i, j, oVar, c1131c)) {
            return true;
        }
        p pVar = ((C1115h) ((A) AbstractC0041g.v(oVar)).getFocusOwner()).f;
        pVar.getClass();
        Boolean bool = (Boolean) A(oVar, i, new C0021s(pVar, ((C1115h) ((A) AbstractC0041g.v(oVar)).getFocusOwner()).j, oVar, c1131c, i, j, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean m(o oVar, o oVar2, int i, J j) {
        if (C(oVar, oVar2, i, j)) {
            return true;
        }
        p pVar = ((C1115h) ((A) AbstractC0041g.v(oVar)).getFocusOwner()).f;
        pVar.getClass();
        Boolean bool = (Boolean) A(oVar, i, new C0021s(pVar, ((C1115h) ((A) AbstractC0041g.v(oVar)).getFocusOwner()).j, oVar, oVar2, i, j, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h0.o n(h0.o r8) {
        /*
            c0.l r0 = r8.f10100q
            boolean r0 = r0.f10099D
            r1 = 0
            if (r0 != 0) goto L9
            goto La3
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            y0.AbstractC1904a.b(r0)
        L10:
            R.e r0 = new R.e
            r2 = 16
            c0.l[] r3 = new c0.AbstractC0724l[r2]
            r0.<init>(r3)
            c0.l r8 = r8.f10100q
            c0.l r3 = r8.f10105v
            if (r3 != 0) goto L23
            B0.AbstractC0041g.b(r0, r8)
            goto L26
        L23:
            r0.c(r3)
        L26:
            int r8 = r0.f6678s
            if (r8 == 0) goto La3
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.m(r8)
            c0.l r8 = (c0.AbstractC0724l) r8
            int r3 = r8.f10103t
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            B0.AbstractC0041g.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f10102s
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La0
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof h0.o
            r5 = 1
            if (r4 == 0) goto L65
            h0.o r8 = (h0.o) r8
            c0.l r4 = r8.f10100q
            boolean r4 = r4.f10099D
            if (r4 == 0) goto L9b
            h0.n r4 = r8.z0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L64
            if (r4 == r5) goto L64
            r5 = 2
            if (r4 == r5) goto L64
            goto L9b
        L64:
            return r8
        L65:
            int r4 = r8.f10102s
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9b
            boolean r4 = r8 instanceof B0.AbstractC0049n
            if (r4 == 0) goto L9b
            r4 = r8
            B0.n r4 = (B0.AbstractC0049n) r4
            c0.l r4 = r4.f473F
            r6 = 0
        L75:
            if (r4 == 0) goto L98
            int r7 = r4.f10102s
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L95
            int r6 = r6 + 1
            if (r6 != r5) goto L83
            r8 = r4
            goto L95
        L83:
            if (r3 != 0) goto L8c
            R.e r3 = new R.e
            c0.l[] r7 = new c0.AbstractC0724l[r2]
            r3.<init>(r7)
        L8c:
            if (r8 == 0) goto L92
            r3.c(r8)
            r8 = r1
        L92:
            r3.c(r4)
        L95:
            c0.l r4 = r4.f10105v
            goto L75
        L98:
            if (r6 != r5) goto L9b
            goto L45
        L9b:
            c0.l r8 = B0.AbstractC0041g.f(r3)
            goto L45
        La0:
            c0.l r8 = r8.f10105v
            goto L3c
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC1111d.n(h0.o):h0.o");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(o oVar) {
        L l7;
        t0 t0Var;
        n0 n0Var = oVar.f10100q.f10107x;
        if (n0Var == null || (l7 = n0Var.f478B) == null || (t0Var = l7.f251D) == null) {
            return;
        }
        ((A) t0Var).getFocusOwner();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean p(C1131c c1131c, C1131c c1131c2, C1131c c1131c3, int i) {
        if (!q(i, c1131c, c1131c3)) {
            return false;
        }
        if (q(i, c1131c2, c1131c3) && !b(c1131c3, c1131c, c1131c2, i)) {
            return !b(c1131c3, c1131c2, c1131c, i) && r(i, c1131c3, c1131c) < r(i, c1131c3, c1131c2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean q(int i, C1131c c1131c, C1131c c1131c2) {
        float f = c1131c.f13523b;
        float f7 = c1131c.f13525d;
        float f8 = c1131c.f13522a;
        float f9 = c1131c.f13524c;
        if (i == 3) {
            float f10 = c1131c2.f13524c;
            float f11 = c1131c2.f13522a;
            return (f10 > f9 || f11 >= f9) && f11 > f8;
        }
        if (i == 4) {
            float f12 = c1131c2.f13522a;
            float f13 = c1131c2.f13524c;
            return (f12 < f8 || f13 <= f8) && f13 < f9;
        }
        if (i == 5) {
            float f14 = c1131c2.f13525d;
            float f15 = c1131c2.f13523b;
            return (f14 > f7 || f15 >= f7) && f15 > f;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f16 = c1131c2.f13523b;
        float f17 = c1131c2.f13525d;
        return (f16 < f || f17 <= f) && f17 < f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long r(int i, C1131c c1131c, C1131c c1131c2) {
        float f;
        float f7;
        float f8 = c1131c2.f13523b;
        float f9 = c1131c2.f13525d;
        float f10 = c1131c2.f13522a;
        float f11 = c1131c2.f13524c;
        if (i == 3) {
            f = c1131c.f13522a - f11;
        } else if (i == 4) {
            f = f10 - c1131c.f13524c;
        } else if (i == 5) {
            f = c1131c.f13523b - f9;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = f8 - c1131c.f13525d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f12 = c1131c.f13523b;
            float f13 = 2;
            f7 = (((c1131c.f13525d - f12) / f13) + f12) - (((f9 - f8) / f13) + f8);
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f14 = c1131c.f13522a;
            float f15 = 2;
            f7 = (((c1131c.f13524c - f14) / f15) + f14) - (((f11 - f10) / f15) + f10);
        }
        long j7 = (long) f7;
        return (j7 * j7) + (((long) 13) * j * j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean s(o oVar) {
        L l7;
        n0 n0Var;
        L l8;
        n0 n0Var2 = oVar.f10107x;
        return (n0Var2 == null || (l7 = n0Var2.f478B) == null || !l7.G() || (n0Var = oVar.f10107x) == null || (l8 = n0Var.f478B) == null || !l8.F()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [B5.c, kotlin.jvm.internal.n] */
    public static final EnumC1109b t(o oVar, int i) {
        int iOrdinal = oVar.z0().ordinal();
        EnumC1109b enumC1109b = EnumC1109b.f13396q;
        if (iOrdinal != 0) {
            EnumC1109b enumC1109b2 = EnumC1109b.f13397r;
            if (iOrdinal == 1) {
                o oVarN = n(oVar);
                if (oVarN == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                EnumC1109b enumC1109bT = t(oVarN, i);
                if (enumC1109bT == enumC1109b) {
                    enumC1109bT = null;
                }
                if (enumC1109bT != null) {
                    return enumC1109bT;
                }
                if (oVar.f13436F) {
                    return enumC1109b;
                }
                oVar.f13436F = true;
                try {
                    C1118k c1118kY0 = oVar.y0();
                    C1108a c1108a = new C1108a(i);
                    o(oVar);
                    InterfaceC1114g focusOwner = ((A) AbstractC0041g.v(oVar)).getFocusOwner();
                    o oVar2 = ((C1115h) focusOwner).j;
                    c1118kY0.f13425k.invoke(c1108a);
                    o oVar3 = ((C1115h) focusOwner).j;
                    if (!c1108a.f13395b) {
                        return (oVar2 == oVar3 || oVar3 == null) ? enumC1109b : m.f13428d == m.f13427c ? enumC1109b2 : EnumC1109b.f13398s;
                    }
                    m mVar = m.f13426b;
                    return enumC1109b2;
                } finally {
                    oVar.f13436F = false;
                }
            }
            if (iOrdinal == 2) {
                return enumC1109b2;
            }
            if (iOrdinal != 3) {
                throw new C2.e();
            }
        }
        return enumC1109b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [B5.c, kotlin.jvm.internal.n] */
    public static final EnumC1109b u(o oVar, int i) {
        if (!oVar.f13437G) {
            oVar.f13437G = true;
            try {
                C1118k c1118kY0 = oVar.y0();
                C1108a c1108a = new C1108a(i);
                o(oVar);
                InterfaceC1114g focusOwner = ((A) AbstractC0041g.v(oVar)).getFocusOwner();
                o oVar2 = ((C1115h) focusOwner).j;
                c1118kY0.j.invoke(c1108a);
                o oVar3 = ((C1115h) focusOwner).j;
                boolean z5 = c1108a.f13395b;
                EnumC1109b enumC1109b = EnumC1109b.f13397r;
                if (z5) {
                    m mVar = m.f13426b;
                    return enumC1109b;
                }
                if (oVar2 != oVar3 && oVar3 != null) {
                    return m.f13428d == m.f13427c ? enumC1109b : EnumC1109b.f13398s;
                }
            } finally {
                oVar.f13437G = false;
            }
        }
        return EnumC1109b.f13396q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final EnumC1109b v(o oVar, int i) {
        AbstractC0724l abstractC0724lF;
        C0042g0 c0042g0;
        int iOrdinal = oVar.z0().ordinal();
        EnumC1109b enumC1109b = EnumC1109b.f13396q;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                o oVarN = n(oVar);
                if (oVarN != null) {
                    return t(oVarN, i);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C2.e();
                }
                if (!oVar.f10100q.f10099D) {
                    AbstractC1904a.b("visitAncestors called on an unattached node");
                }
                AbstractC0724l abstractC0724l = oVar.f10100q.f10104u;
                L lU = AbstractC0041g.u(oVar);
                loop0: while (true) {
                    if (lU == null) {
                        abstractC0724lF = null;
                        break;
                    }
                    if ((lU.f268U.f433e.f10103t & 1024) != 0) {
                        while (abstractC0724l != null) {
                            if ((abstractC0724l.f10102s & 1024) != 0) {
                                abstractC0724lF = abstractC0724l;
                                R.e eVar = null;
                                while (abstractC0724lF != null) {
                                    if (abstractC0724lF instanceof o) {
                                        break loop0;
                                    }
                                    if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                        int i7 = 0;
                                        for (AbstractC0724l abstractC0724l2 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
                                            if ((abstractC0724l2.f10102s & 1024) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    abstractC0724lF = abstractC0724l2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new R.e(new AbstractC0724l[16]);
                                                    }
                                                    if (abstractC0724lF != null) {
                                                        eVar.c(abstractC0724lF);
                                                        abstractC0724lF = null;
                                                    }
                                                    eVar.c(abstractC0724l2);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    abstractC0724lF = AbstractC0041g.f(eVar);
                                }
                            }
                            abstractC0724l = abstractC0724l.f10104u;
                        }
                    }
                    lU = lU.s();
                    abstractC0724l = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
                }
                o oVar2 = (o) abstractC0724lF;
                if (oVar2 == null) {
                    return enumC1109b;
                }
                int iOrdinal2 = oVar2.z0().ordinal();
                if (iOrdinal2 == 0) {
                    return u(oVar2, i);
                }
                if (iOrdinal2 == 1) {
                    return v(oVar2, i);
                }
                if (iOrdinal2 == 2) {
                    return EnumC1109b.f13397r;
                }
                if (iOrdinal2 != 3) {
                    throw new C2.e();
                }
                EnumC1109b enumC1109bV = v(oVar2, i);
                EnumC1109b enumC1109b2 = enumC1109bV != enumC1109b ? enumC1109bV : null;
                return enumC1109b2 == null ? u(oVar2, i) : enumC1109b2;
            }
        }
        return enumC1109b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01fc A[ADDED_TO_REGION, LOOP:9: B:139:0x01fc->B:146:0x020c, LOOP_START, PHI: r12
  0x01fc: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:138:0x01fa, B:146:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean w(h0.o r18) {
        /*
            r0 = r18
            B0.t0 r1 = B0.AbstractC0041g.v(r0)
            C0.A r1 = (C0.A) r1
            h0.g r1 = r1.getFocusOwner()
            h0.h r1 = (h0.C1115h) r1
            h0.o r2 = r1.j
            h0.n r3 = r0.z0()
            r4 = 1
            if (r2 != r0) goto L1b
            r0.x0(r3, r3)
            return r4
        L1b:
            r5 = 0
            r6 = 0
            if (r2 != 0) goto L3d
            B0.t0 r7 = B0.AbstractC0041g.v(r0)
            C0.A r7 = (C0.A) r7
            h0.g r7 = r7.getFocusOwner()
            h0.h r7 = (h0.C1115h) r7
            C0.t r7 = r7.f13408a
            java.lang.Object r7 = r7.invoke(r5, r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L3d
            r16 = r6
            goto L21f
        L3d:
            java.lang.String r7 = "visitAncestors called on an unattached node"
            r8 = 16
            if (r2 == 0) goto Lcf
            R.e r9 = new R.e
            h0.o[] r10 = new h0.o[r8]
            r9.<init>(r10)
            c0.l r10 = r2.f10100q
            boolean r10 = r10.f10099D
            if (r10 != 0) goto L53
            y0.AbstractC1904a.b(r7)
        L53:
            c0.l r10 = r2.f10100q
            c0.l r10 = r10.f10104u
            B0.L r11 = B0.AbstractC0041g.u(r2)
        L5b:
            if (r11 == 0) goto Ld0
            B0.g0 r12 = r11.f268U
            c0.l r12 = r12.f433e
            int r12 = r12.f10103t
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto Lbe
        L67:
            if (r10 == 0) goto Lbe
            int r12 = r10.f10102s
            r12 = r12 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto Lba
            r13 = r5
            r12 = r10
        L71:
            if (r12 == 0) goto Lba
            boolean r14 = r12 instanceof h0.o
            if (r14 == 0) goto L7d
            h0.o r12 = (h0.o) r12
            r9.c(r12)
            goto Lb5
        L7d:
            int r14 = r12.f10102s
            r14 = r14 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto Lb5
            boolean r14 = r12 instanceof B0.AbstractC0049n
            if (r14 == 0) goto Lb5
            r14 = r12
            B0.n r14 = (B0.AbstractC0049n) r14
            c0.l r14 = r14.f473F
            r15 = r6
        L8d:
            if (r14 == 0) goto Lb1
            int r5 = r14.f10102s
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto Lad
            int r15 = r15 + 1
            if (r15 != r4) goto L9b
            r12 = r14
            goto Lad
        L9b:
            if (r13 != 0) goto La4
            R.e r13 = new R.e
            c0.l[] r5 = new c0.AbstractC0724l[r8]
            r13.<init>(r5)
        La4:
            if (r12 == 0) goto Laa
            r13.c(r12)
            r12 = 0
        Laa:
            r13.c(r14)
        Lad:
            c0.l r14 = r14.f10105v
            r5 = 0
            goto L8d
        Lb1:
            if (r15 != r4) goto Lb5
        Lb3:
            r5 = 0
            goto L71
        Lb5:
            c0.l r12 = B0.AbstractC0041g.f(r13)
            goto Lb3
        Lba:
            c0.l r10 = r10.f10104u
            r5 = 0
            goto L67
        Lbe:
            B0.L r11 = r11.s()
            if (r11 == 0) goto Lcc
            B0.g0 r5 = r11.f268U
            if (r5 == 0) goto Lcc
            B0.B0 r5 = r5.f432d
            r10 = r5
            goto Lcd
        Lcc:
            r10 = 0
        Lcd:
            r5 = 0
            goto L5b
        Lcf:
            r9 = 0
        Ld0:
            h0.o[] r5 = new h0.o[r8]
            c0.l r10 = r0.f10100q
            boolean r10 = r10.f10099D
            if (r10 != 0) goto Ldb
            y0.AbstractC1904a.b(r7)
        Ldb:
            c0.l r7 = r0.f10100q
            c0.l r7 = r7.f10104u
            B0.L r10 = B0.AbstractC0041g.u(r0)
            r11 = r4
            r12 = r6
        Le5:
            if (r10 == 0) goto L19a
            B0.g0 r13 = r10.f268U
            c0.l r13 = r13.f433e
            int r13 = r13.f10103t
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L185
        Lf1:
            if (r7 == 0) goto L185
            int r13 = r7.f10102s
            r13 = r13 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L17d
            r13 = r7
            r14 = 0
        Lfb:
            if (r13 == 0) goto L17d
            boolean r15 = r13 instanceof h0.o
            if (r15 == 0) goto L132
            h0.o r13 = (h0.o) r13
            if (r9 == 0) goto L10e
            boolean r15 = r9.l(r13)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            goto L10f
        L10e:
            r15 = 0
        L10f:
            if (r15 == 0) goto L117
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L12c
        L117:
            int r15 = r12 + 1
            int r8 = r5.length
            if (r8 >= r15) goto L129
            int r8 = r5.length
            int r4 = r8 * 2
            int r4 = java.lang.Math.max(r15, r4)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.System.arraycopy(r5, r6, r4, r6, r8)
            r5 = r4
        L129:
            r5[r12] = r13
            r12 = r15
        L12c:
            if (r13 != r2) goto L12f
            r11 = r6
        L12f:
            r15 = 16
            goto L176
        L132:
            int r4 = r13.f10102s
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L12f
            boolean r4 = r13 instanceof B0.AbstractC0049n
            if (r4 == 0) goto L12f
            r4 = r13
            B0.n r4 = (B0.AbstractC0049n) r4
            c0.l r4 = r4.f473F
            r8 = r6
        L142:
            if (r4 == 0) goto L16e
            int r15 = r4.f10102s
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L150
            int r8 = r8 + 1
            r15 = 1
            if (r8 != r15) goto L153
            r13 = r4
        L150:
            r15 = 16
            goto L16a
        L153:
            if (r14 != 0) goto L15f
            R.e r14 = new R.e
            r15 = 16
            c0.l[] r6 = new c0.AbstractC0724l[r15]
            r14.<init>(r6)
            goto L161
        L15f:
            r15 = 16
        L161:
            if (r13 == 0) goto L167
            r14.c(r13)
            r13 = 0
        L167:
            r14.c(r4)
        L16a:
            c0.l r4 = r4.f10105v
            r6 = 0
            goto L142
        L16e:
            r4 = 1
            r15 = 16
            if (r8 != r4) goto L176
            r8 = r15
        L174:
            r6 = 0
            goto Lfb
        L176:
            c0.l r13 = B0.AbstractC0041g.f(r14)
            r8 = r15
            r4 = 1
            goto L174
        L17d:
            r15 = r8
            c0.l r7 = r7.f10104u
            r8 = r15
            r4 = 1
            r6 = 0
            goto Lf1
        L185:
            r15 = r8
            B0.L r10 = r10.s()
            if (r10 == 0) goto L194
            B0.g0 r4 = r10.f268U
            if (r4 == 0) goto L194
            B0.B0 r4 = r4.f432d
            r7 = r4
            goto L195
        L194:
            r7 = 0
        L195:
            r8 = r15
            r4 = 1
            r6 = 0
            goto Le5
        L19a:
            if (r11 == 0) goto L1a9
            if (r2 == 0) goto L1a9
            r4 = 0
            boolean r6 = e(r2, r4)
            if (r6 != 0) goto L1a9
        L1a5:
            r16 = 0
            goto L21f
        L1a9:
            A0.d r4 = new A0.d
            r6 = 21
            r4.<init>(r6, r0)
            B0.AbstractC0041g.r(r0, r4)
            h0.n r4 = r0.z0()
            int r4 = r4.ordinal()
            r6 = 1
            if (r4 == r6) goto L1c2
            r6 = 3
            if (r4 == r6) goto L1c2
            goto L1d1
        L1c2:
            B0.t0 r4 = B0.AbstractC0041g.v(r0)
            C0.A r4 = (C0.A) r4
            h0.g r4 = r4.getFocusOwner()
            h0.h r4 = (h0.C1115h) r4
            r4.e(r0)
        L1d1:
            h0.n r4 = h0.n.f13433t
            h0.n r6 = h0.n.f13431r
            if (r9 == 0) goto L1f3
            int r7 = r9.f6678s
            r17 = 1
            int r7 = r7 + (-1)
            java.lang.Object[] r8 = r9.f6676q
            int r9 = r8.length
            if (r7 >= r9) goto L1f3
        L1e2:
            if (r7 < 0) goto L1f3
            r9 = r8[r7]
            h0.o r9 = (h0.o) r9
            h0.o r10 = r1.j
            if (r10 == r0) goto L1ed
            goto L1a5
        L1ed:
            r9.x0(r6, r4)
            int r7 = r7 + (-1)
            goto L1e2
        L1f3:
            r17 = 1
            int r12 = r12 + (-1)
            int r7 = r5.length
            h0.n r8 = h0.n.f13430q
            if (r12 >= r7) goto L212
        L1fc:
            if (r12 < 0) goto L212
            r7 = r5[r12]
            h0.o r7 = (h0.o) r7
            h0.o r9 = r1.j
            if (r9 == r0) goto L207
            goto L1a5
        L207:
            if (r7 != r2) goto L20b
            r9 = r8
            goto L20c
        L20b:
            r9 = r4
        L20c:
            r7.x0(r9, r6)
            int r12 = r12 + (-1)
            goto L1fc
        L212:
            h0.o r2 = r1.j
            if (r2 == r0) goto L217
            goto L1a5
        L217:
            r0.x0(r3, r8)
            h0.o r1 = r1.j
            if (r1 == r0) goto L220
            goto L1a5
        L21f:
            return r16
        L220:
            r17 = 1
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.AbstractC1111d.w(h0.o):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean x(o oVar, J j) {
        Object[] objArr = new o[16];
        if (!oVar.f10100q.f10099D) {
            AbstractC1904a.b("visitChildren called on an unattached node");
        }
        R.e eVar = new R.e(new AbstractC0724l[16]);
        AbstractC0724l abstractC0724l = oVar.f10100q;
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10105v;
        if (abstractC0724l2 == null) {
            AbstractC0041g.b(eVar, abstractC0724l);
        } else {
            eVar.c(abstractC0724l2);
        }
        int i = 0;
        while (true) {
            int i7 = eVar.f6678s;
            if (i7 == 0) {
                break;
            }
            AbstractC0724l abstractC0724lF = (AbstractC0724l) eVar.m(i7 - 1);
            if ((abstractC0724lF.f10103t & 1024) == 0) {
                AbstractC0041g.b(eVar, abstractC0724lF);
            } else {
                while (true) {
                    if (abstractC0724lF == null) {
                        break;
                    }
                    if ((abstractC0724lF.f10102s & 1024) != 0) {
                        R.e eVar2 = null;
                        while (abstractC0724lF != null) {
                            if (abstractC0724lF instanceof o) {
                                o oVar2 = (o) abstractC0724lF;
                                int i8 = i + 1;
                                if (objArr.length < i8) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i8, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = oVar2;
                                i = i8;
                            } else if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                int i9 = 0;
                                for (AbstractC0724l abstractC0724l3 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l3 != null; abstractC0724l3 = abstractC0724l3.f10105v) {
                                    if ((abstractC0724l3.f10102s & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC0724lF = abstractC0724l3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (abstractC0724lF != null) {
                                                eVar2.c(abstractC0724lF);
                                                abstractC0724lF = null;
                                            }
                                            eVar2.c(abstractC0724l3);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC0724lF = AbstractC0041g.f(eVar2);
                        }
                    } else {
                        abstractC0724lF = abstractC0724lF.f10105v;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, q.f13439a);
        int i10 = i - 1;
        if (i10 < objArr.length) {
            while (i10 >= 0) {
                o oVar3 = (o) objArr[i10];
                if (s(oVar3) && a(oVar3, j)) {
                    return true;
                }
                i10--;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean y(o oVar, J j) {
        Object[] objArr = new o[16];
        if (!oVar.f10100q.f10099D) {
            AbstractC1904a.b("visitChildren called on an unattached node");
        }
        R.e eVar = new R.e(new AbstractC0724l[16]);
        AbstractC0724l abstractC0724l = oVar.f10100q;
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10105v;
        if (abstractC0724l2 == null) {
            AbstractC0041g.b(eVar, abstractC0724l);
        } else {
            eVar.c(abstractC0724l2);
        }
        int i = 0;
        while (true) {
            int i7 = eVar.f6678s;
            if (i7 == 0) {
                break;
            }
            AbstractC0724l abstractC0724lF = (AbstractC0724l) eVar.m(i7 - 1);
            if ((abstractC0724lF.f10103t & 1024) == 0) {
                AbstractC0041g.b(eVar, abstractC0724lF);
            } else {
                while (true) {
                    if (abstractC0724lF == null) {
                        break;
                    }
                    if ((abstractC0724lF.f10102s & 1024) != 0) {
                        R.e eVar2 = null;
                        while (abstractC0724lF != null) {
                            if (abstractC0724lF instanceof o) {
                                o oVar2 = (o) abstractC0724lF;
                                int i8 = i + 1;
                                if (objArr.length < i8) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i8, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = oVar2;
                                i = i8;
                            } else if ((abstractC0724lF.f10102s & 1024) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                int i9 = 0;
                                for (AbstractC0724l abstractC0724l3 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l3 != null; abstractC0724l3 = abstractC0724l3.f10105v) {
                                    if ((abstractC0724l3.f10102s & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC0724lF = abstractC0724l3;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (abstractC0724lF != null) {
                                                eVar2.c(abstractC0724lF);
                                                abstractC0724lF = null;
                                            }
                                            eVar2.c(abstractC0724l3);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC0724lF = AbstractC0041g.f(eVar2);
                        }
                    } else {
                        abstractC0724lF = abstractC0724lF.f10105v;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, q.f13439a);
        for (int i10 = 0; i10 < i; i10++) {
            o oVar3 = (o) objArr[i10];
            if (s(oVar3) && k(oVar3, j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean z(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof A) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
