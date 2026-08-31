package P;

import B0.C0057w;
import Q.C0410a;
import Q.C0411b;
import Q.C0412c;
import Q.C0414e;
import a.AbstractC0597a;
import android.os.Trace;
import androidx.work.impl.Scheduler;
import b0.AbstractC0688b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import m5.C1371j;
import r.C1544C;
import r.C1548G;
import r.C1549H;
import r.C1568t;
import r.C1570v;
import s.AbstractC1585a;

/* JADX INFO: renamed from: P.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0371o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5439A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f5440B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0369n f5441C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f5442D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5443E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public z0 f5444F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public A0 f5445G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public D0 f5446H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f5447I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public InterfaceC0360i0 f5448J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0410a f5449K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0411b f5450L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C0343a f5451M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C0412c f5452N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f5453O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f5454P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0380t f5455Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.G0 f5456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f5457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0 f5458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r.J f5459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0410a f5460e;
    public final C0410a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0382u f5461g;
    public C0358h0 i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5464l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f5466n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1568t f5467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5469q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1570v f5473u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5474v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5476x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5478z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f5462h = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0057w f5465m = new C0057w();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f5470r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0057w f5471s = new C0057w();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0360i0 f5472t = X.i.f8148t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0057w f5475w = new C0057w();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5477y = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0371o(B0.G0 g02, r rVar, A0 a02, r.J j, C0410a c0410a, C0410a c0410a2, C0382u c0382u) {
        this.f5456a = g02;
        this.f5457b = rVar;
        this.f5458c = a02;
        this.f5459d = j;
        this.f5460e = c0410a;
        this.f = c0410a2;
        this.f5461g = c0382u;
        this.f5440B = rVar.e() || rVar.c();
        this.f5441C = new C0369n(0, this);
        this.f5442D = new ArrayList();
        z0 z0VarH = a02.h();
        z0VarH.c();
        this.f5444F = z0VarH;
        A0 a03 = new A0();
        if (rVar.e()) {
            a03.g();
        }
        if (rVar.c()) {
            a03.f5264A = new C1570v();
        }
        this.f5445G = a03;
        D0 d0I = a03.i();
        d0I.e(true);
        this.f5446H = d0I;
        this.f5450L = new C0411b(this, c0410a);
        z0 z0VarH2 = this.f5445G.h();
        try {
            C0343a c0343aA = z0VarH2.a(0);
            z0VarH2.c();
            this.f5451M = c0343aA;
            this.f5452N = new C0412c();
        } catch (Throwable th) {
            z0VarH2.c();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int J(C0371o c0371o, int i, boolean z5, int i7) {
        z0 z0Var = c0371o.f5444F;
        int[] iArr = z0Var.f5586b;
        int i8 = i * 5;
        int i9 = iArr[i8 + 1];
        if ((134217728 & i9) != 0) {
            int i10 = iArr[i8];
            Object objM = z0Var.m(iArr, i);
            if (i10 == 206 && kotlin.jvm.internal.m.a(objM, AbstractC0373p.f5489e)) {
                Object objG = z0Var.g(i, 0);
                C0365l c0365l = objG instanceof C0365l ? (C0365l) objG : null;
                if (c0365l != null) {
                    for (C0371o c0371o2 : c0365l.f5421q.f5427e) {
                        A0 a02 = c0371o2.f5458c;
                        if (a02.f5266r > 0 && (a02.f5265q[1] & 67108864) != 0) {
                            C0382u c0382u = c0371o2.f5461g;
                            synchronized (c0382u.f5532t) {
                                c0382u.o();
                                C1548G c1548g = c0382u.f5522D;
                                c0382u.f5522D = AbstractC0597a.q();
                                try {
                                    c0382u.f5527I.Z(c1548g);
                                } catch (Exception e7) {
                                    c0382u.f5522D = c1548g;
                                    throw e7;
                                }
                            }
                            C0410a c0410a = new C0410a();
                            c0371o2.f5449K = c0410a;
                            z0 z0VarH = c0371o2.f5458c.h();
                            try {
                                c0371o2.f5444F = z0VarH;
                                C0411b c0411b = c0371o2.f5450L;
                                C0410a c0410a2 = c0411b.f6488b;
                                try {
                                    c0411b.f6488b = c0410a;
                                    c0371o2.I(0);
                                    C0411b c0411b2 = c0371o2.f5450L;
                                    c0411b2.b();
                                    if (c0411b2.f6489c) {
                                        c0411b2.f6488b.f6486o.W(Q.B.f6467c);
                                        if (c0411b2.f6489c) {
                                            c0411b2.d(false);
                                            c0411b2.d(false);
                                            c0411b2.f6488b.f6486o.W(Q.m.f6507c);
                                            c0411b2.f6489c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                z0VarH.c();
                            }
                        }
                        c0371o.f5457b.m(c0371o2.f5461g);
                    }
                }
                return z0Var.l(i);
            }
            if (!z0Var.i(i)) {
                return z0Var.l(i);
            }
        } else if ((i9 & 67108864) != 0) {
            int i11 = iArr[i8 + 3] + i;
            int iJ = 0;
            for (int i12 = i + 1; i12 < i11; i12 += z0Var.f5586b[(i12 * 5) + 3]) {
                boolean zI = z0Var.i(i12);
                if (zI) {
                    c0371o.f5450L.c();
                    C0411b c0411b3 = c0371o.f5450L;
                    Object objK = z0Var.k(i12);
                    c0411b3.c();
                    c0411b3.f6493h.add(objK);
                }
                iJ += J(c0371o, i12, zI || z5, zI ? 0 : i7 + iJ);
                if (zI) {
                    c0371o.f5450L.c();
                    c0371o.f5450L.a();
                }
            }
            if (!z0Var.i(i)) {
                return iJ;
            }
        } else if (!z0Var.i(i)) {
            return z0Var.l(i);
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(C0371o c0371o, InterfaceC0360i0 interfaceC0360i0, Object obj) {
        c0371o.O(126665345, 0, null, null);
        c0371o.z();
        c0371o.e0(obj);
        int i = c0371o.f5454P;
        try {
            c0371o.f5454P = 126665345;
            if (c0371o.f5453O) {
                D0.x(c0371o.f5446H);
            }
            boolean z5 = (c0371o.f5453O || kotlin.jvm.internal.m.a(c0371o.f5444F.e(), interfaceC0360i0)) ? false : true;
            if (z5) {
                c0371o.F(interfaceC0360i0);
            }
            c0371o.O(202, 0, AbstractC0373p.f5487c, interfaceC0360i0);
            c0371o.f5448J = null;
            boolean z6 = c0371o.f5474v;
            c0371o.f5474v = z5;
            X.k.c(c0371o, new X.e(316014703, true, new A.e0(8, obj)));
            c0371o.f5474v = z6;
            c0371o.p(false);
            c0371o.f5448J = null;
            c0371o.f5454P = i;
            c0371o.p(false);
        } catch (Throwable th) {
            c0371o.p(false);
            c0371o.f5448J = null;
            c0371o.f5454P = i;
            c0371o.p(false);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int A(int i) {
        int iN = this.f5444F.n(i) + 1;
        int i7 = 0;
        while (iN < i) {
            if (!this.f5444F.h(iN)) {
                i7++;
            }
            iN += C0.a(this.f5444F.f5586b, iN);
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean B(C1548G c1548g) {
        Q.K k7 = this.f5460e.f6486o;
        if (!k7.U()) {
            AbstractC0373p.c("Expected applyChanges() to have been called");
        }
        if (c1548g.f16137e <= 0 && this.f5470r.isEmpty()) {
            return false;
        }
        n(c1548g, null);
        return k7.V();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #1 {all -> 0x0027, blocks: (B:3:0x0005, B:6:0x0015, B:8:0x0023, B:12:0x002c, B:11:0x0029, B:15:0x0033, B:18:0x003b, B:21:0x0043, B:23:0x004b, B:25:0x0051, B:26:0x0055, B:27:0x0056, B:29:0x005c, B:22:0x0047), top: B:36:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(P.C0382u r9, P.C0382u r10, java.lang.Integer r11, java.util.List r12, B5.a r13) {
        /*
            r8 = this;
            boolean r0 = r8.f5443E
            int r1 = r8.j
            r2 = 1
            r8.f5443E = r2     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r8.j = r2     // Catch: java.lang.Throwable -> L27
            r3 = r12
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L27
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            r4 = r2
        L12:
            r5 = 0
            if (r4 >= r3) goto L2f
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L27
            m5.j r6 = (m5.C1371j) r6     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r6.f15080q     // Catch: java.lang.Throwable -> L27
            P.o0 r7 = (P.C0372o0) r7     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r6.f15081r     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L29
            r8.Y(r7, r6)     // Catch: java.lang.Throwable -> L27
            goto L2c
        L27:
            r9 = move-exception
            goto L65
        L29:
            r8.Y(r7, r5)     // Catch: java.lang.Throwable -> L27
        L2c:
            int r4 = r4 + 1
            goto L12
        L2f:
            if (r9 == 0) goto L5c
            if (r11 == 0) goto L38
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L27
            goto L39
        L38:
            r11 = -1
        L39:
            if (r10 == 0) goto L56
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L27
            if (r12 != 0) goto L56
            if (r11 < 0) goto L56
            r9.f5524F = r10     // Catch: java.lang.Throwable -> L27
            r9.f5525G = r11     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L50
            r9.f5524F = r5     // Catch: java.lang.Throwable -> L27
            r9.f5525G = r2     // Catch: java.lang.Throwable -> L27
            goto L5a
        L50:
            r10 = move-exception
            r9.f5524F = r5     // Catch: java.lang.Throwable -> L27
            r9.f5525G = r2     // Catch: java.lang.Throwable -> L27
            throw r10     // Catch: java.lang.Throwable -> L27
        L56:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L27
        L5a:
            if (r10 != 0) goto L60
        L5c:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L27
        L60:
            r8.f5443E = r0
            r8.j = r1
            return r10
        L65:
            r8.f5443E = r0
            r8.j = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.C(P.u, P.u, java.lang.Integer, java.util.List, B5.a):java.lang.Object");
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, IPUT]}, finally: {[CONST] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice insn: 0x0208: IPUT (r2v23 ?? I:P.i0), (r40v0 'this' ?? I:P.o A[IMMUTABLE_TYPE, THIS]) (LINE:521) P.o.J P.i0, expected: 0x02f0: INVOKE (r2v5 ?? I:P.o0), (r7v4 ?? I:boolean) VIRTUAL call: P.o0.e(boolean):void A[MD:(boolean):void (m)] (LINE:753) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            r40 = this;
            r1 = r40
            boolean r0 = r1.f5443E
            r2 = 1
            r1.f5443E = r2
            P.z0 r3 = r1.f5444F
            int r4 = r3.i
            int[] r5 = r3.f5586b
            int r6 = r4 * 5
            r7 = 3
            int r6 = r6 + r7
            r5 = r5[r6]
            int r5 = r5 + r4
            int r8 = r1.j
            int r9 = r1.f5454P
            int r10 = r1.f5463k
            int r11 = r1.f5464l
            int r3 = r3.f5590g
            java.util.ArrayList r12 = r1.f5470r
            int r3 = P.AbstractC0373p.f(r3, r12)
            if (r3 >= 0) goto L29
            int r3 = r3 + 1
            int r3 = -r3
        L29:
            int r13 = r12.size()
            if (r3 >= r13) goto L3a
            java.lang.Object r3 = r12.get(r3)
            P.L r3 = (P.L) r3
            int r13 = r3.f5330b
            if (r13 >= r5) goto L3a
            goto L3b
        L3a:
            r3 = 0
        L3b:
            r16 = r7
            r15 = 0
            r7 = r4
        L3f:
            if (r3 == 0) goto L334
            P.o0 r13 = r3.f5329a
            int r2 = r3.f5330b
            int r14 = P.AbstractC0373p.f(r2, r12)
            if (r14 < 0) goto L51
            java.lang.Object r14 = r12.remove(r14)
            P.L r14 = (P.L) r14
        L51:
            java.lang.Object r3 = r3.f5331c
            r19 = 128(0x80, double:6.32E-322)
            r21 = 255(0xff, double:1.26E-321)
            r23 = 7
            r24 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r3 != 0) goto L72
            r13.getClass()
            r27 = r6
        L65:
            r35 = r8
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
        L6f:
            r3 = 1
            goto L114
        L72:
            r26 = 8
            r.G r14 = r13.f5484g
            if (r14 != 0) goto L7b
            r27 = r6
            goto L65
        L7b:
            r27 = r6
            boolean r6 = r3 instanceof P.C
            if (r6 == 0) goto L93
            P.C r3 = (P.C) r3
            boolean r3 = P.C0372o0.a(r3, r14)
            r35 = r8
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            goto L114
        L93:
            boolean r6 = r3 instanceof r.C1549H
            if (r6 == 0) goto L65
            r.H r3 = (r.C1549H) r3
            boolean r6 = r3.h()
            if (r6 == 0) goto L109
            java.lang.Object[] r6 = r3.f16139b
            long[] r3 = r3.f16138a
            r28 = r6
            int r6 = r3.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L109
            r29 = r3
            r30 = r10
            r31 = r11
            r3 = 0
        Lb1:
            r10 = r29[r3]
            r32 = r12
            r33 = r13
            long r12 = ~r10
            long r12 = r12 << r23
            long r12 = r12 & r10
            long r12 = r12 & r24
            int r12 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r12 == 0) goto Lfa
            int r12 = r3 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = 0
        Lc9:
            if (r13 >= r12) goto Lf3
            long r34 = r10 & r21
            int r34 = (r34 > r19 ? 1 : (r34 == r19 ? 0 : -1))
            if (r34 >= 0) goto Le8
            int r34 = r3 << 3
            int r34 = r34 + r13
            r35 = r8
            r8 = r28[r34]
            r36 = r10
            boolean r10 = r8 instanceof P.C
            if (r10 == 0) goto L6f
            P.C r8 = (P.C) r8
            boolean r8 = P.C0372o0.a(r8, r14)
            if (r8 == 0) goto Lec
            goto L6f
        Le8:
            r35 = r8
            r36 = r10
        Lec:
            long r10 = r36 >> r26
            int r13 = r13 + 1
            r8 = r35
            goto Lc9
        Lf3:
            r35 = r8
            r8 = r26
            if (r12 != r8) goto L113
            goto Lfc
        Lfa:
            r35 = r8
        Lfc:
            if (r3 == r6) goto L113
            int r3 = r3 + 1
            r12 = r32
            r13 = r33
            r8 = r35
            r26 = 8
            goto Lb1
        L109:
            r35 = r8
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
        L113:
            r3 = 0
        L114:
            if (r3 == 0) goto L27f
            P.z0 r3 = r1.f5444F
            r3.o(r2)
            P.z0 r3 = r1.f5444F
            int r3 = r3.f5590g
            r1.G(r7, r3, r4)
            P.z0 r6 = r1.f5444F
            int r6 = r6.n(r3)
        L128:
            if (r6 == r4) goto L139
            P.z0 r7 = r1.f5444F
            boolean r7 = r7.i(r6)
            if (r7 != 0) goto L139
            P.z0 r7 = r1.f5444F
            int r6 = r7.n(r6)
            goto L128
        L139:
            P.z0 r7 = r1.f5444F
            boolean r7 = r7.i(r6)
            if (r7 == 0) goto L143
            r7 = 0
            goto L145
        L143:
            r7 = r35
        L145:
            if (r6 != r3) goto L148
            goto L178
        L148:
            int r8 = r1.f0(r6)
            P.z0 r10 = r1.f5444F
            int r10 = r10.l(r3)
            int r8 = r8 - r10
            int r8 = r8 + r7
        L154:
            if (r7 >= r8) goto L178
            if (r6 == r2) goto L178
            int r6 = r6 + 1
        L15a:
            if (r6 >= r2) goto L178
            P.z0 r10 = r1.f5444F
            int[] r11 = r10.f5586b
            int r12 = r6 * 5
            int r12 = r12 + 3
            r11 = r11[r12]
            int r11 = r11 + r6
            if (r2 < r11) goto L154
            boolean r10 = r10.i(r6)
            if (r10 == 0) goto L171
            r6 = 1
            goto L175
        L171:
            int r6 = r1.f0(r6)
        L175:
            int r7 = r7 + r6
            r6 = r11
            goto L15a
        L178:
            r1.j = r7
            int r2 = r1.A(r3)
            r1.f5464l = r2
            P.z0 r2 = r1.f5444F
            int r2 = r2.n(r3)
            r8 = r16
            r6 = 0
            r7 = 0
        L18a:
            if (r2 < 0) goto L205
            if (r2 != r4) goto L195
            int r2 = java.lang.Integer.rotateLeft(r9, r7)
        L192:
            r6 = r6 ^ r2
            goto L205
        L195:
            P.z0 r10 = r1.f5444F
            boolean r11 = r10.h(r2)
            int[] r12 = r10.f5586b
            if (r11 == 0) goto L1b7
            java.lang.Object r10 = r10.m(r12, r2)
            if (r10 == 0) goto L1b5
            boolean r11 = r10 instanceof java.lang.Enum
            if (r11 == 0) goto L1b0
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
            goto L1d4
        L1b0:
            int r10 = r10.hashCode()
            goto L1d4
        L1b5:
            r10 = 0
            goto L1d4
        L1b7:
            int r11 = r2 * 5
            r11 = r12[r11]
            r13 = 207(0xcf, float:2.9E-43)
            if (r11 != r13) goto L1d3
            java.lang.Object r10 = r10.b(r12, r2)
            if (r10 == 0) goto L1d3
            P.S r12 = P.C0363k.f5418a
            boolean r12 = r10.equals(r12)
            if (r12 == 0) goto L1ce
            goto L1d3
        L1ce:
            int r10 = r10.hashCode()
            goto L1d4
        L1d3:
            r10 = r11
        L1d4:
            r11 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r10 != r11) goto L1de
            int r2 = java.lang.Integer.rotateLeft(r10, r7)
            goto L192
        L1de:
            P.z0 r11 = r1.f5444F
            boolean r11 = r11.h(r2)
            if (r11 == 0) goto L1e8
            r11 = 0
            goto L1ec
        L1e8:
            int r11 = r1.A(r2)
        L1ec:
            int r10 = java.lang.Integer.rotateLeft(r10, r8)
            r6 = r6 ^ r10
            int r10 = java.lang.Integer.rotateLeft(r11, r7)
            r6 = r6 ^ r10
            int r8 = r8 + 6
            int r8 = r8 % 32
            int r7 = r7 + 6
            int r7 = r7 % 32
            P.z0 r10 = r1.f5444F
            int r2 = r10.n(r2)
            goto L18a
        L205:
            r1.f5454P = r6
            r2 = 0
            r1.f5448J = r2
            boolean r2 = r1.f5476x
            if (r2 != 0) goto L21d
            r2 = r33
            int r6 = r2.f5479a
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L218
            r6 = 1
            goto L219
        L218:
            r6 = 0
        L219:
            if (r6 == 0) goto L21f
            r6 = 1
            goto L220
        L21d:
            r2 = r33
        L21f:
            r6 = 0
        L220:
            r7 = 1
            if (r6 == 0) goto L225
            r1.f5476x = r7
        L225:
            B5.e r2 = r2.f5482d
            if (r2 == 0) goto L233
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r2.invoke(r1, r8)
            m5.y r2 = m5.C1386y.f15098a
            goto L234
        L233:
            r2 = 0
        L234:
            if (r2 == 0) goto L277
            if (r6 == 0) goto L23b
            r2 = 0
            r1.f5476x = r2
        L23b:
            r6 = 0
            r1.f5448J = r6
            P.z0 r2 = r1.f5444F
            int[] r7 = r2.f5586b
            r7 = r7[r27]
            int r7 = r7 + r4
            int r8 = r2.f5590g
            if (r8 < r4) goto L24d
            if (r8 > r7) goto L24d
            r10 = 1
            goto L24e
        L24d:
            r10 = 0
        L24e:
            if (r10 != 0) goto L269
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Index "
            r10.<init>(r11)
            r10.append(r4)
            java.lang.String r11 = " is not a parent of "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            P.AbstractC0373p.c(r8)
        L269:
            r2.i = r4
            r2.f5591h = r7
            r7 = 0
            r2.f5593l = r7
            r2.f5594m = r7
            r15 = 1
            r17 = 1
            goto L304
        L277:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid restart scope"
            r0.<init>(r2)
            throw r0
        L27f:
            r2 = r33
            r6 = 0
            java.util.ArrayList r3 = r1.f5442D
            r3.add(r2)
            P.u r8 = r2.f5480b
            if (r8 == 0) goto L2f4
            r.B r10 = r2.f
            if (r10 == 0) goto L2f4
            r11 = 1
            r2.e(r11)
            java.lang.Object[] r11 = r10.f16110b     // Catch: java.lang.Throwable -> L2d2
            int[] r12 = r10.f16111c     // Catch: java.lang.Throwable -> L2d2
            long[] r10 = r10.f16109a     // Catch: java.lang.Throwable -> L2d2
            int r13 = r10.length     // Catch: java.lang.Throwable -> L2d2
            int r13 = r13 + (-2)
            r18 = r7
            if (r13 < 0) goto L2df
            r14 = 0
        L2a1:
            r6 = r10[r14]     // Catch: java.lang.Throwable -> L2d2
            r33 = r10
            r29 = r11
            long r10 = ~r6     // Catch: java.lang.Throwable -> L2d2
            long r10 = r10 << r23
            long r10 = r10 & r6
            long r10 = r10 & r24
            int r10 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r10 == 0) goto L2e1
            int r10 = r14 - r13
            int r10 = ~r10     // Catch: java.lang.Throwable -> L2d2
            int r10 = r10 >>> 31
            r26 = 8
            int r10 = 8 - r10
            r36 = r6
            r6 = 0
        L2bd:
            if (r6 >= r10) goto L2da
            long r38 = r36 & r21
            int r7 = (r38 > r19 ? 1 : (r38 == r19 ? 0 : -1))
            if (r7 >= 0) goto L2cf
            int r7 = r14 << 3
            int r7 = r7 + r6
            r11 = r29[r7]     // Catch: java.lang.Throwable -> L2d2
            r7 = r12[r7]     // Catch: java.lang.Throwable -> L2d2
            r8.x(r11)     // Catch: java.lang.Throwable -> L2d2
        L2cf:
            r7 = 8
            goto L2d5
        L2d2:
            r0 = move-exception
            r7 = 0
            goto L2f0
        L2d5:
            long r36 = r36 >> r7
            int r6 = r6 + 1
            goto L2bd
        L2da:
            r7 = 8
            if (r10 != r7) goto L2df
            goto L2e3
        L2df:
            r7 = 0
            goto L2ec
        L2e1:
            r7 = 8
        L2e3:
            if (r14 == r13) goto L2df
            int r14 = r14 + 1
            r11 = r29
            r10 = r33
            goto L2a1
        L2ec:
            r2.e(r7)
            goto L2f7
        L2f0:
            r2.e(r7)
            throw r0
        L2f4:
            r18 = r7
            r7 = 0
        L2f7:
            int r2 = r3.size()
            r17 = 1
            int r2 = r2 + (-1)
            r3.remove(r2)
            r3 = r18
        L304:
            P.z0 r2 = r1.f5444F
            int r2 = r2.f5590g
            r6 = r32
            int r2 = P.AbstractC0373p.f(r2, r6)
            if (r2 >= 0) goto L313
            int r2 = r2 + 1
            int r2 = -r2
        L313:
            int r8 = r6.size()
            if (r2 >= r8) goto L324
            java.lang.Object r2 = r6.get(r2)
            P.L r2 = (P.L) r2
            int r8 = r2.f5330b
            if (r8 >= r5) goto L324
            goto L325
        L324:
            r2 = 0
        L325:
            r7 = r3
            r12 = r6
            r6 = r27
            r10 = r30
            r11 = r31
            r8 = r35
            r3 = r2
            r2 = r17
            goto L3f
        L334:
            r18 = r7
            r35 = r8
            r30 = r10
            r31 = r11
            if (r15 == 0) goto L359
            r3 = r18
            r1.G(r3, r4, r4)
            P.z0 r2 = r1.f5444F
            r2.q()
            int r2 = r1.f0(r4)
            int r8 = r35 + r2
            r1.j = r8
            int r10 = r30 + r2
            r1.f5463k = r10
            r2 = r31
            r1.f5464l = r2
            goto L35c
        L359:
            r1.M()
        L35c:
            r1.f5454P = r9
            r1.f5443E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.D():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() {
        int i;
        I(this.f5444F.f5590g);
        C0411b c0411b = this.f5450L;
        c0411b.d(false);
        C0057w c0057w = c0411b.f6490d;
        C0371o c0371o = c0411b.f6487a;
        z0 z0Var = c0371o.f5444F;
        if (z0Var.f5587c > 0 && c0057w.a(-2) != (i = z0Var.i)) {
            if (!c0411b.f6489c && c0411b.f6491e) {
                c0411b.d(false);
                c0411b.f6488b.f6486o.W(Q.q.f6511c);
                c0411b.f6489c = true;
            }
            if (i > 0) {
                C0343a c0343aA = z0Var.a(i);
                c0057w.c(i);
                c0411b.d(false);
                Q.K k7 = c0411b.f6488b.f6486o;
                k7.W(Q.p.f6510c);
                D5.a.I(k7, 0, c0343aA);
                c0411b.f6489c = true;
            }
        }
        c0411b.f6488b.f6486o.W(Q.x.f6521c);
        int i7 = c0411b.f;
        z0 z0Var2 = c0371o.f5444F;
        c0411b.f = z0Var2.f5586b[(z0Var2.f5590g * 5) + 3] + i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(InterfaceC0360i0 interfaceC0360i0) {
        C1570v c1570v = this.f5473u;
        if (c1570v == null) {
            c1570v = new C1570v();
            this.f5473u = c1570v;
        }
        c1570v.h(this.f5444F.f5590g, interfaceC0360i0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(int r7, int r8, int r9) {
        /*
            r6 = this;
            P.z0 r0 = r6.f5444F
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.n(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.n(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.n(r7)
            int r2 = r0.n(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.n(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.n(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.n(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.n(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.n(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.n(r9)
            int r1 = r0.n(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.i(r7)
            if (r1 == 0) goto L7a
            Q.b r1 = r6.f5450L
            r1.a()
        L7a:
            int r7 = r0.n(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.G(int, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object H() {
        boolean z5 = this.f5453O;
        S s6 = C0363k.f5418a;
        if (!z5) {
            Object objJ = this.f5444F.j();
            if (!this.f5476x || (objJ instanceof C0365l)) {
                return objJ instanceof x0 ? ((x0) objJ).f5576a : objJ;
            }
        } else if (this.f5469q) {
            AbstractC0373p.c("A call to createNode(), emitNode() or useNode() expected");
            return s6;
        }
        return s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I(int i) {
        boolean zI = this.f5444F.i(i);
        C0411b c0411b = this.f5450L;
        if (zI) {
            c0411b.c();
            Object objK = this.f5444F.k(i);
            c0411b.c();
            c0411b.f6493h.add(objK);
        }
        J(this, i, zI, 0);
        c0411b.c();
        if (zI) {
            c0411b.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean K(int i, boolean z5) {
        return ((i & 1) == 0 && (this.f5453O || this.f5476x)) || z5 || !x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f5470r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            int r0 = r12.f5463k
            P.z0 r1 = r12.f5444F
            int r1 = r1.p()
            int r1 = r1 + r0
            r12.f5463k = r1
            return
        L14:
            P.z0 r0 = r12.f5444F
            int r1 = r0.f()
            int[] r2 = r0.f5586b
            int r3 = r0.f5590g
            int r4 = r0.f5591h
            r5 = 0
            if (r3 >= r4) goto L28
            java.lang.Object r3 = r0.m(r2, r3)
            goto L29
        L28:
            r3 = r5
        L29:
            java.lang.Object r4 = r0.e()
            int r6 = r12.f5464l
            P.S r7 = P.C0363k.f5418a
            r8 = 207(0xcf, float:2.9E-43)
            r9 = 3
            if (r3 != 0) goto L62
            if (r4 == 0) goto L53
            if (r1 != r8) goto L53
            boolean r10 = r4.equals(r7)
            if (r10 != 0) goto L53
            int r10 = r4.hashCode()
            int r11 = r12.f5454P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
            r12.f5454P = r10
            goto L7e
        L53:
            int r10 = r12.f5454P
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r1
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
        L5f:
            r12.f5454P = r10
            goto L7e
        L62:
            boolean r10 = r3 instanceof java.lang.Enum
            if (r10 == 0) goto L79
            r10 = r3
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
        L6d:
            int r11 = r12.f5454P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            goto L5f
        L79:
            int r10 = r3.hashCode()
            goto L6d
        L7e:
            int r10 = r0.f5590g
            int r10 = r10 * 5
            r11 = 1
            int r10 = r10 + r11
            r2 = r2[r10]
            r10 = 1073741824(0x40000000, float:2.0)
            r2 = r2 & r10
            if (r2 == 0) goto L8c
            goto L8d
        L8c:
            r11 = 0
        L8d:
            r12.R(r5, r11)
            r12.D()
            r0.d()
            if (r3 != 0) goto Lcc
            if (r4 == 0) goto Lb9
            if (r1 != r8) goto Lb9
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto Lb9
            int r0 = r4.hashCode()
            int r1 = r12.f5454P
            r1 = r1 ^ r6
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f5454P = r0
            return
        Lb9:
            int r0 = r12.f5454P
            r0 = r0 ^ r6
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f5454P = r0
            return
        Lcc:
            boolean r0 = r3 instanceof java.lang.Enum
            if (r0 == 0) goto Le8
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            int r1 = r12.f5454P
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f5454P = r0
            return
        Le8:
            int r0 = r3.hashCode()
            int r1 = r12.f5454P
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.f5454P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.L():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M() {
        z0 z0Var = this.f5444F;
        int i = z0Var.i;
        this.f5463k = i >= 0 ? z0Var.f5586b[(i * 5) + 1] & 67108863 : 0;
        z0Var.q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N() {
        if (this.f5463k != 0) {
            AbstractC0373p.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f5453O) {
            return;
        }
        C0372o0 c0372o0V = v();
        if (c0372o0V != null) {
            int i = c0372o0V.f5479a;
            if ((i & 128) == 0) {
                c0372o0V.f5479a = i | 16;
            }
        }
        if (this.f5470r.isEmpty()) {
            M();
        } else {
            D();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            boolean r7 = r0.f5469q
            if (r7 == 0) goto L18
            java.lang.String r7 = "A call to createNode(), emitNode() or useNode() expected"
            P.AbstractC0373p.c(r7)
        L18:
            int r7 = r0.f5464l
            P.S r8 = P.C0363k.f5418a
            r9 = 3
            if (r3 != 0) goto L4d
            if (r4 == 0) goto L3e
            r10 = 207(0xcf, float:2.9E-43)
            if (r1 != r10) goto L3e
            boolean r10 = r4.equals(r8)
            if (r10 != 0) goto L3e
            int r10 = r4.hashCode()
            int r11 = r0.f5454P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r9 = java.lang.Integer.rotateLeft(r10, r9)
            r7 = r7 ^ r9
            r0.f5454P = r7
            goto L69
        L3e:
            int r10 = r0.f5454P
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r1
            int r9 = java.lang.Integer.rotateLeft(r10, r9)
            r7 = r7 ^ r9
        L4a:
            r0.f5454P = r7
            goto L69
        L4d:
            boolean r7 = r3 instanceof java.lang.Enum
            if (r7 == 0) goto L64
            r7 = r3
            java.lang.Enum r7 = (java.lang.Enum) r7
            int r7 = r7.ordinal()
        L58:
            int r10 = r0.f5454P
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r7 = r7 ^ r10
            int r7 = java.lang.Integer.rotateLeft(r7, r9)
            goto L4a
        L64:
            int r7 = r3.hashCode()
            goto L58
        L69:
            r7 = 1
            if (r3 != 0) goto L71
            int r9 = r0.f5464l
            int r9 = r9 + r7
            r0.f5464l = r9
        L71:
            r9 = 0
            if (r2 == 0) goto L76
            r10 = r7
            goto L77
        L76:
            r10 = r9
        L77:
            boolean r11 = r0.f5453O
            r12 = -2
            r13 = 0
            if (r11 == 0) goto Lbf
            P.z0 r2 = r0.f5444F
            int r11 = r2.f5592k
            int r11 = r11 + r7
            r2.f5592k = r11
            P.D0 r2 = r0.f5446H
            int r11 = r2.f5304t
            if (r10 == 0) goto L8e
            r2.O(r1, r8, r8, r7)
            goto L9d
        L8e:
            if (r4 == 0) goto L97
            if (r3 != 0) goto L93
            r3 = r8
        L93:
            r2.O(r1, r3, r4, r9)
            goto L9d
        L97:
            if (r3 != 0) goto L9a
            r3 = r8
        L9a:
            r2.O(r1, r3, r8, r9)
        L9d:
            P.h0 r2 = r0.i
            if (r2 == 0) goto Lbb
            P.O r3 = new P.O
            int r12 = r12 - r11
            r3.<init>(r6, r1, r12, r5)
            int r1 = r0.j
            int r4 = r2.f5413b
            int r1 = r1 - r4
            r.v r4 = r2.f5416e
            P.I r6 = new P.I
            r6.<init>(r5, r1, r9)
            r4.h(r12, r6)
            java.util.ArrayList r1 = r2.f5415d
            r1.add(r3)
        Lbb:
            r0.t(r10, r13)
            return
        Lbf:
            if (r2 == r7) goto Lc2
            goto Lc8
        Lc2:
            boolean r2 = r0.f5476x
            if (r2 == 0) goto Lc8
            r2 = r7
            goto Lc9
        Lc8:
            r2 = r9
        Lc9:
            P.h0 r11 = r0.i
            if (r11 != 0) goto Lf0
            P.z0 r11 = r0.f5444F
            int r11 = r11.f()
            if (r2 != 0) goto Lf3
            if (r11 != r1) goto Lf3
            P.z0 r11 = r0.f5444F
            int r14 = r11.f5590g
            int r15 = r11.f5591h
            if (r14 >= r15) goto Le6
            int[] r15 = r11.f5586b
            java.lang.Object r11 = r11.m(r15, r14)
            goto Le7
        Le6:
            r11 = r13
        Le7:
            boolean r11 = kotlin.jvm.internal.m.a(r3, r11)
            if (r11 == 0) goto Lf3
            r0.R(r4, r10)
        Lf0:
            r28 = r2
            goto L143
        Lf3:
            P.h0 r11 = new P.h0
            P.z0 r14 = r0.f5444F
            int[] r15 = r14.f5586b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r13 = r14.f5592k
            if (r13 <= 0) goto L105
        L102:
            r28 = r2
            goto L13c
        L105:
            int r13 = r14.f5590g
        L107:
            int r12 = r14.f5591h
            if (r13 >= r12) goto L102
            P.O r12 = new P.O
            int r18 = r13 * 5
            r7 = r15[r18]
            java.lang.Object r9 = r14.m(r15, r13)
            int r20 = r18 + 1
            r20 = r15[r20]
            r21 = 1073741824(0x40000000, float:2.0)
            r21 = r20 & r21
            if (r21 == 0) goto L123
            r28 = r2
            r2 = 1
            goto L12c
        L123:
            r21 = 67108863(0x3ffffff, float:1.5046327E-36)
            r20 = r20 & r21
            r28 = r2
            r2 = r20
        L12c:
            r12.<init>(r9, r7, r13, r2)
            r5.add(r12)
            int r18 = r18 + 3
            r2 = r15[r18]
            int r13 = r13 + r2
            r2 = r28
            r7 = 1
            r9 = 0
            goto L107
        L13c:
            int r2 = r0.j
            r11.<init>(r2, r5)
            r0.i = r11
        L143:
            P.h0 r2 = r0.i
            if (r2 == 0) goto L320
            java.util.ArrayList r5 = r2.f5415d
            r.v r7 = r2.f5416e
            int r9 = r2.f5413b
            if (r3 == 0) goto L159
            P.N r11 = new P.N
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11.<init>(r12, r3)
            goto L15d
        L159:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
        L15d:
            m5.o r12 = r2.f
            java.lang.Object r12 = r12.getValue()
            R.a r12 = (R.a) r12
            r.G r12 = r12.f6669a
            java.lang.Object r13 = r12.g(r11)
            if (r13 != 0) goto L16f
            r13 = 0
            goto L194
        L16f:
            boolean r14 = r13 instanceof r.C1544C
            if (r14 == 0) goto L191
            r.C r13 = (r.C1544C) r13
            r14 = 0
            java.lang.Object r15 = r13.i(r14)
            boolean r14 = r13.g()
            if (r14 == 0) goto L183
            r12.j(r11)
        L183:
            int r14 = r13.f16115b
            r3 = 1
            if (r14 != r3) goto L18f
            java.lang.Object r3 = r13.d()
            r12.l(r11, r3)
        L18f:
            r13 = r15
            goto L194
        L191:
            r12.j(r11)
        L194:
            P.O r13 = (P.O) r13
            if (r28 != 0) goto L323
            if (r13 == 0) goto L323
            int r1 = r13.f5350c
            r5.add(r13)
            java.lang.Object r3 = r7.b(r1)
            P.I r3 = (P.I) r3
            if (r3 == 0) goto L1aa
            int r3 = r3.f5315b
            goto L1ab
        L1aa:
            r3 = -1
        L1ab:
            int r3 = r3 + r9
            r0.j = r3
            java.lang.Object r3 = r7.b(r1)
            P.I r3 = (P.I) r3
            if (r3 == 0) goto L1b9
            int r5 = r3.f5314a
            goto L1ba
        L1b9:
            r5 = -1
        L1ba:
            int r2 = r2.f5414c
            int r3 = r5 - r2
            r15 = 8
            if (r5 <= r2) goto L233
            r27 = 7
            java.lang.Object[] r6 = r7.f16218c
            long[] r7 = r7.f16216a
            r28 = 128(0x80, double:6.32E-322)
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L22f
            r9 = 0
            r20 = 255(0xff, double:1.26E-321)
        L1d2:
            r11 = r7[r9]
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = ~r11
            long r13 = r13 << r27
            long r13 = r13 & r11
            long r13 = r13 & r22
            int r13 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r13 == 0) goto L224
            int r13 = r9 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        L1eb:
            if (r14 >= r13) goto L21e
            long r24 = r11 & r20
            int r16 = (r24 > r28 ? 1 : (r24 == r28 ? 0 : -1))
            if (r16 >= 0) goto L211
            int r16 = r9 << 3
            int r16 = r16 + r14
            r16 = r6[r16]
            r18 = r15
            r15 = r16
            P.I r15 = (P.I) r15
            r16 = r3
            int r3 = r15.f5314a
            if (r3 != r5) goto L208
            r15.f5314a = r2
            goto L215
        L208:
            if (r2 > r3) goto L215
            if (r3 >= r5) goto L215
            int r3 = r3 + 1
            r15.f5314a = r3
            goto L215
        L211:
            r16 = r3
            r18 = r15
        L215:
            long r11 = r11 >> r18
            int r14 = r14 + 1
            r3 = r16
            r15 = r18
            goto L1eb
        L21e:
            r16 = r3
            r3 = r15
            if (r13 != r3) goto L2a2
            goto L226
        L224:
            r16 = r3
        L226:
            if (r9 == r8) goto L2a2
            int r9 = r9 + 1
            r3 = r16
            r15 = 8
            goto L1d2
        L22f:
            r16 = r3
            goto L2a2
        L233:
            r16 = r3
            r27 = 7
            r28 = 128(0x80, double:6.32E-322)
            r20 = 255(0xff, double:1.26E-321)
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r2 <= r5) goto L2a2
            java.lang.Object[] r3 = r7.f16218c
            long[] r6 = r7.f16216a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L2a2
            r8 = 0
        L24c:
            r11 = r6[r8]
            long r13 = ~r11
            long r13 = r13 << r27
            long r13 = r13 & r11
            long r13 = r13 & r22
            int r9 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r9 == 0) goto L297
            int r9 = r8 - r7
            int r9 = ~r9
            int r9 = r9 >>> 31
            r18 = 8
            int r15 = 8 - r9
            r9 = 0
        L262:
            if (r9 >= r15) goto L290
            long r13 = r11 & r20
            int r13 = (r13 > r28 ? 1 : (r13 == r28 ? 0 : -1))
            if (r13 >= 0) goto L287
            int r13 = r8 << 3
            int r13 = r13 + r9
            r13 = r3[r13]
            P.I r13 = (P.I) r13
            int r14 = r13.f5314a
            if (r14 != r5) goto L278
            r13.f5314a = r2
            goto L287
        L278:
            r24 = r3
            int r3 = r5 + 1
            if (r3 > r14) goto L284
            if (r14 >= r2) goto L284
            int r14 = r14 + (-1)
            r13.f5314a = r14
        L284:
            r3 = 8
            goto L28a
        L287:
            r24 = r3
            goto L284
        L28a:
            long r11 = r11 >> r3
            int r9 = r9 + 1
            r3 = r24
            goto L262
        L290:
            r24 = r3
            r3 = 8
            if (r15 != r3) goto L2a2
            goto L29b
        L297:
            r24 = r3
            r3 = 8
        L29b:
            if (r8 == r7) goto L2a2
            int r8 = r8 + 1
            r3 = r24
            goto L24c
        L2a2:
            Q.b r2 = r0.f5450L
            int r3 = r2.f
            P.o r5 = r2.f6487a
            P.z0 r6 = r5.f5444F
            int r6 = r6.f5590g
            int r6 = r1 - r6
            int r6 = r6 + r3
            r2.f = r6
            P.z0 r3 = r0.f5444F
            r3.o(r1)
            if (r16 <= 0) goto L31d
            r14 = 0
            r2.d(r14)
            B0.w r1 = r2.f6490d
            P.z0 r3 = r5.f5444F
            int r5 = r3.f5587c
            if (r5 <= 0) goto L301
            int r5 = r3.i
            r6 = -2
            int r6 = r1.a(r6)
            if (r6 == r5) goto L301
            boolean r6 = r2.f6489c
            if (r6 != 0) goto L2e5
            boolean r6 = r2.f6491e
            if (r6 == 0) goto L2e5
            r14 = 0
            r2.d(r14)
            Q.a r6 = r2.f6488b
            Q.K r6 = r6.f6486o
            Q.q r7 = Q.q.f6511c
            r6.W(r7)
            r6 = 1
            r2.f6489c = r6
        L2e5:
            if (r5 <= 0) goto L301
            P.a r3 = r3.a(r5)
            r1.c(r5)
            r14 = 0
            r2.d(r14)
            Q.a r1 = r2.f6488b
            Q.K r1 = r1.f6486o
            Q.p r5 = Q.p.f6510c
            r1.W(r5)
            D5.a.I(r1, r14, r3)
            r3 = 1
            r2.f6489c = r3
        L301:
            Q.a r1 = r2.f6488b
            Q.K r1 = r1.f6486o
            Q.u r2 = Q.u.f6518c
            r1.W(r2)
            int[] r2 = r1.f6482q
            int r3 = r1.f6483r
            Q.I[] r5 = r1.f6480o
            int r1 = r1.f6481p
            r19 = 1
            int r1 = r1 + (-1)
            r1 = r5[r1]
            int r1 = r1.f6474a
            int r3 = r3 - r1
            r2[r3] = r16
        L31d:
            r0.R(r4, r10)
        L320:
            r2 = 0
            goto L39f
        L323:
            P.z0 r2 = r0.f5444F
            int r3 = r2.f5592k
            r11 = 1
            int r3 = r3 + r11
            r2.f5592k = r3
            r0.f5453O = r11
            r2 = 0
            r0.f5448J = r2
            P.D0 r3 = r0.f5446H
            boolean r3 = r3.f5307w
            if (r3 == 0) goto L346
            P.A0 r3 = r0.f5445G
            P.D0 r3 = r3.i()
            r0.f5446H = r3
            r3.J()
            r14 = 0
            r0.f5447I = r14
            r0.f5448J = r2
        L346:
            P.D0 r2 = r0.f5446H
            r2.d()
            P.D0 r2 = r0.f5446H
            int r3 = r2.f5304t
            if (r10 == 0) goto L357
            r11 = 1
            r2.O(r1, r8, r8, r11)
            r14 = 0
            goto L36e
        L357:
            if (r4 == 0) goto L364
            if (r29 != 0) goto L35d
        L35b:
            r14 = 0
            goto L360
        L35d:
            r8 = r29
            goto L35b
        L360:
            r2.O(r1, r8, r4, r14)
            goto L36e
        L364:
            r14 = 0
            if (r29 != 0) goto L369
            r4 = r8
            goto L36b
        L369:
            r4 = r29
        L36b:
            r2.O(r1, r4, r8, r14)
        L36e:
            P.D0 r2 = r0.f5446H
            P.a r2 = r2.b(r3)
            r0.f5451M = r2
            P.O r2 = new P.O
            r17 = -2
            int r12 = (-2) - r3
            r3 = -1
            r2.<init>(r6, r1, r12, r3)
            int r1 = r0.j
            int r1 = r1 - r9
            P.I r4 = new P.I
            r4.<init>(r3, r1, r14)
            r7.h(r12, r4)
            r5.add(r2)
            P.h0 r13 = new P.h0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r10 == 0) goto L399
            r9 = r14
            goto L39b
        L399:
            int r9 = r0.j
        L39b:
            r13.<init>(r9, r1)
            goto L3a0
        L39f:
            r13 = r2
        L3a0:
            r0.t(r10, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.O(int, int, java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P() {
        O(-127, 0, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(int i, Z z5) {
        O(i, 0, z5, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(Object obj, boolean z5) {
        if (z5) {
            z0 z0Var = this.f5444F;
            if (z0Var.f5592k <= 0) {
                if ((z0Var.f5586b[(z0Var.f5590g * 5) + 1] & 1073741824) == 0) {
                    AbstractC0362j0.a("Expected a node group");
                }
                z0Var.r();
                return;
            }
            return;
        }
        if (obj != null && this.f5444F.e() != obj) {
            C0411b c0411b = this.f5450L;
            c0411b.getClass();
            c0411b.d(false);
            Q.K k7 = c0411b.f6488b.f6486o;
            k7.W(Q.E.f6470c);
            D5.a.I(k7, 0, obj);
        }
        this.f5444F.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S(int i) {
        int i7;
        int i8;
        if (this.i != null) {
            O(i, 0, null, null);
            return;
        }
        if (this.f5469q) {
            AbstractC0373p.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f5454P = this.f5464l ^ Integer.rotateLeft(Integer.rotateLeft(this.f5454P, 3) ^ i, 3);
        this.f5464l++;
        z0 z0Var = this.f5444F;
        boolean z5 = this.f5453O;
        S s6 = C0363k.f5418a;
        if (z5) {
            z0Var.f5592k++;
            this.f5446H.O(i, s6, s6, false);
            t(false, null);
            return;
        }
        if (z0Var.f() == i && ((i8 = z0Var.f5590g) >= z0Var.f5591h || (z0Var.f5586b[(i8 * 5) + 1] & 536870912) == 0)) {
            z0Var.r();
            t(false, null);
            return;
        }
        if (z0Var.f5592k <= 0 && (i7 = z0Var.f5590g) != z0Var.f5591h) {
            int i9 = this.j;
            E();
            this.f5450L.e(i9, z0Var.p());
            AbstractC0373p.a(this.f5470r, i7, z0Var.f5590g);
        }
        z0Var.f5592k++;
        this.f5453O = true;
        this.f5448J = null;
        if (this.f5446H.f5307w) {
            D0 d0I = this.f5445G.i();
            this.f5446H = d0I;
            d0I.J();
            this.f5447I = false;
            this.f5448J = null;
        }
        D0 d02 = this.f5446H;
        d02.d();
        int i10 = d02.f5304t;
        d02.O(i, s6, s6, false);
        this.f5451M = d02.b(i10);
        t(false, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T(int i) {
        O(i, 0, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P.C0371o U(int r5) {
        /*
            r4 = this;
            r4.S(r5)
            boolean r5 = r4.f5453O
            java.util.ArrayList r0 = r4.f5442D
            P.u r1 = r4.f5461g
            if (r5 == 0) goto L21
            P.o0 r5 = new P.o0
            r5.<init>(r1)
            r0.add(r5)
            r4.e0(r5)
            int r0 = r4.f5439A
            r5.f5483e = r0
            int r0 = r5.f5479a
            r0 = r0 & (-17)
            r5.f5479a = r0
            return r4
        L21:
            P.z0 r5 = r4.f5444F
            int r5 = r5.i
            java.util.ArrayList r2 = r4.f5470r
            int r5 = P.AbstractC0373p.f(r5, r2)
            if (r5 < 0) goto L34
            java.lang.Object r5 = r2.remove(r5)
            P.L r5 = (P.L) r5
            goto L35
        L34:
            r5 = 0
        L35:
            P.z0 r2 = r4.f5444F
            java.lang.Object r2 = r2.j()
            P.S r3 = P.C0363k.f5418a
            boolean r3 = kotlin.jvm.internal.m.a(r2, r3)
            if (r3 == 0) goto L4c
            P.o0 r2 = new P.o0
            r2.<init>(r1)
            r4.e0(r2)
            goto L53
        L4c:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.m.c(r2, r1)
            P.o0 r2 = (P.C0372o0) r2
        L53:
            r1 = 0
            if (r5 != 0) goto L6f
            int r5 = r2.f5479a
            r3 = r5 & 64
            if (r3 == 0) goto L5e
            r3 = 1
            goto L5f
        L5e:
            r3 = r1
        L5f:
            if (r3 == 0) goto L65
            r5 = r5 & (-65)
            r2.f5479a = r5
        L65:
            if (r3 == 0) goto L68
            goto L6f
        L68:
            int r5 = r2.f5479a
            r5 = r5 & (-9)
            r2.f5479a = r5
            goto L75
        L6f:
            int r5 = r2.f5479a
            r5 = r5 | 8
            r2.f5479a = r5
        L75:
            r0.add(r2)
            int r5 = r4.f5439A
            r2.f5483e = r5
            int r5 = r2.f5479a
            r0 = r5 & (-17)
            r2.f5479a = r0
            r0 = r5 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L9a
            r5 = r5 & (-273(0xfffffffffffffeef, float:NaN))
            r5 = r5 | 512(0x200, float:7.175E-43)
            r2.f5479a = r5
            Q.b r5 = r4.f5450L
            Q.a r5 = r5.f6488b
            Q.K r5 = r5.f6486o
            Q.C r0 = Q.C.f6468c
            r5.W(r0)
            D5.a.I(r5, r1, r2)
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.U(int):P.o");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(Object obj) {
        if (!this.f5453O && this.f5444F.f() == 207 && !kotlin.jvm.internal.m.a(this.f5444F.e(), obj) && this.f5477y < 0) {
            this.f5477y = this.f5444F.f5590g;
            this.f5476x = true;
        }
        O(207, 0, null, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W() {
        O(125, 2, null, null);
        this.f5469q = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void X() {
        this.f5464l = 0;
        this.f5444F = this.f5458c.h();
        O(100, 0, null, null);
        r rVar = this.f5457b;
        rVar.n();
        this.f5472t = rVar.f();
        this.f5475w.c(this.f5474v ? 1 : 0);
        this.f5474v = g(this.f5472t);
        this.f5448J = null;
        if (!this.f5468p) {
            this.f5468p = rVar.d();
        }
        if (!this.f5440B) {
            this.f5440B = rVar.e();
        }
        Set set = (Set) C0345b.r(this.f5472t, AbstractC0688b.f9927a);
        if (set != null) {
            C0380t c0380t = this.f5455Q;
            if (c0380t == null) {
                c0380t = new C0380t(this.f5461g);
                this.f5455Q = c0380t;
            }
            set.add(c0380t);
            rVar.k(set);
        }
        O(rVar.g(), 0, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean Y(C0372o0 c0372o0, Object obj) {
        C0343a c0343a = c0372o0.f5481c;
        if (c0343a == null) {
            return false;
        }
        int iD = this.f5444F.f5585a.d(c0343a);
        if (!this.f5443E || iD < this.f5444F.f5590g) {
            return false;
        }
        ArrayList arrayList = this.f5470r;
        int iF = AbstractC0373p.f(iD, arrayList);
        if (iF < 0) {
            int i = -(iF + 1);
            if (!(obj instanceof C)) {
                obj = null;
            }
            arrayList.add(i, new L(c0372o0, iD, obj));
            return true;
        }
        L l7 = (L) arrayList.get(iF);
        if (!(obj instanceof C)) {
            l7.f5331c = null;
            return true;
        }
        Object obj2 = l7.f5331c;
        if (obj2 == null) {
            l7.f5331c = obj;
            return true;
        }
        if (obj2 instanceof C1549H) {
            ((C1549H) obj2).a(obj);
            return true;
        }
        int i7 = r.P.f16163a;
        C1549H c1549h = new C1549H(2);
        c1549h.j(obj2);
        c1549h.j(obj);
        l7.f5331c = c1549h;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(r.C1548G r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.Object[] r1 = r0.f16134b
            java.lang.Object[] r2 = r0.f16135c
            long[] r0 = r0.f16133a
            int r3 = r0.length
            int r3 = r3 + (-2)
            r4 = r17
            java.util.ArrayList r5 = r4.f5470r
            if (r3 < 0) goto L63
            r7 = 0
        L12:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5e
            int r10 = r7 - r3
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2c:
            if (r12 >= r10) goto L5c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L58
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1[r13]
            r13 = r2[r13]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.m.c(r14, r15)
            P.o0 r14 = (P.C0372o0) r14
            P.a r15 = r14.f5481c
            if (r15 == 0) goto L58
            int r15 = r15.f5384a
            P.S r6 = P.S.f5376u
            if (r13 != r6) goto L50
            r13 = 0
        L50:
            P.L r6 = new P.L
            r6.<init>(r14, r15, r13)
            r5.add(r6)
        L58:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2c
        L5c:
            if (r10 != r11) goto L63
        L5e:
            if (r7 == r3) goto L63
            int r7 = r7 + 1
            goto L12
        L63:
            B0.C r0 = P.AbstractC0373p.f
            n5.p.d0(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.Z(r.G):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        j();
        this.f5462h.clear();
        this.f5465m.f527b = 0;
        this.f5471s.f527b = 0;
        this.f5475w.f527b = 0;
        this.f5473u = null;
        C0412c c0412c = this.f5452N;
        c0412c.f6497p.S();
        c0412c.f6496o.S();
        this.f5454P = 0;
        this.f5478z = 0;
        this.f5469q = false;
        this.f5453O = false;
        this.f5476x = false;
        this.f5443E = false;
        this.f5477y = -1;
        z0 z0Var = this.f5444F;
        if (!z0Var.f) {
            z0Var.c();
        }
        if (this.f5446H.f5307w) {
            return;
        }
        u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0(int i, int i7) {
        if (f0(i) != i7) {
            if (i < 0) {
                C1568t c1568t = this.f5467o;
                if (c1568t == null) {
                    c1568t = new C1568t();
                    this.f5467o = c1568t;
                }
                c1568t.f(i, i7);
                return;
            }
            int[] iArr = this.f5466n;
            if (iArr == null) {
                int i8 = this.f5444F.f5587c;
                int[] iArr2 = new int[i8];
                Arrays.fill(iArr2, 0, i8, -1);
                this.f5466n = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0(int i, int i7) {
        int iF0 = f0(i);
        if (iF0 != i7) {
            int i8 = i7 - iF0;
            ArrayList arrayList = this.f5462h;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iF02 = f0(i) + i8;
                a0(i, iF02);
                int i9 = size;
                while (true) {
                    if (-1 < i9) {
                        C0358h0 c0358h0 = (C0358h0) arrayList.get(i9);
                        if (c0358h0 != null && c0358h0.a(i, iF02)) {
                            size = i9 - 1;
                            break;
                        }
                        i9--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.f5444F.i;
                } else if (this.f5444F.i(i)) {
                    return;
                } else {
                    i = this.f5444F.n(i);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Object obj, B5.e eVar) {
        if (this.f5453O) {
            Q.K k7 = this.f5452N.f6496o;
            k7.W(Q.F.f6471c);
            D5.a.I(k7, 0, obj);
            kotlin.jvm.internal.m.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            kotlin.jvm.internal.B.b(2, eVar);
            D5.a.I(k7, 1, eVar);
            return;
        }
        C0411b c0411b = this.f5450L;
        c0411b.b();
        Q.K k8 = c0411b.f6488b.f6486o;
        k8.W(Q.F.f6471c);
        kotlin.jvm.internal.m.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        kotlin.jvm.internal.B.b(2, eVar);
        D5.a.J(k8, 0, obj, 1, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final X.i c0(InterfaceC0360i0 interfaceC0360i0, X.i iVar) {
        X.i iVar2 = (X.i) interfaceC0360i0;
        iVar2.getClass();
        X.h hVar = new X.h(iVar2);
        hVar.putAll(iVar);
        X.i iVarA = hVar.a();
        Q(204, AbstractC0373p.f5488d);
        z();
        e0(iVarA);
        z();
        e0(iVar);
        p(false);
        return iVarA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(float f) {
        Object objZ = z();
        if ((objZ instanceof Float) && f == ((Number) objZ).floatValue()) {
            return false;
        }
        e0(Float.valueOf(f));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(Object obj) {
        int i;
        z0 z0Var;
        int i7;
        D0 d02;
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            C0343a c0343aA = null;
            if (this.f5453O) {
                D0 d03 = this.f5446H;
                int i8 = d03.f5304t;
                if (i8 > d03.f5306v + 1) {
                    int i9 = i8 - 1;
                    int iC = d03.C(d03.f5289b, i9);
                    while (true) {
                        i7 = i9;
                        i9 = iC;
                        d02 = this.f5446H;
                        if (i9 == d02.f5306v || i9 < 0) {
                            break;
                        } else {
                            iC = d02.C(d02.f5289b, i9);
                        }
                    }
                    c0343aA = d02.b(i7);
                }
            } else {
                z0 z0Var2 = this.f5444F;
                int i10 = z0Var2.f5590g;
                if (i10 > z0Var2.i + 1) {
                    int i11 = i10 - 1;
                    int iN = z0Var2.n(i11);
                    while (true) {
                        i = i11;
                        i11 = iN;
                        z0Var = this.f5444F;
                        if (i11 == z0Var.i || i11 < 0) {
                            break;
                        } else {
                            iN = z0Var.n(i11);
                        }
                    }
                    c0343aA = z0Var.a(i);
                }
            }
            x0 x0Var = new x0(w0Var, c0343aA);
            if (this.f5453O) {
                Q.K k7 = this.f5450L.f6488b.f6486o;
                k7.W(Q.w.f6520c);
                D5.a.I(k7, 0, x0Var);
            }
            this.f5459d.add(obj);
            obj = x0Var;
        }
        e0(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(int i) {
        Object objZ = z();
        if ((objZ instanceof Integer) && i == ((Number) objZ).intValue()) {
            return false;
        }
        e0(Integer.valueOf(i));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0(Object obj) {
        if (this.f5453O) {
            D0 d02 = this.f5446H;
            if (d02.f5298n <= 0 || d02.i == d02.f5295k) {
                d02.D(obj);
                return;
            }
            C1570v c1570v = d02.f5303s;
            if (c1570v == null) {
                c1570v = new C1570v();
            }
            d02.f5303s = c1570v;
            int i = d02.f5306v;
            Object objB = c1570v.b(i);
            if (objB == null) {
                objB = new C1544C();
                c1570v.h(i, objB);
            }
            ((C1544C) objB).a(obj);
            return;
        }
        z0 z0Var = this.f5444F;
        boolean z5 = z0Var.f5595n;
        C0411b c0411b = this.f5450L;
        if (!z5) {
            C0343a c0343aA = z0Var.a(z0Var.i);
            Q.K k7 = c0411b.f6488b.f6486o;
            k7.W(C0414e.f6499c);
            D5.a.J(k7, 0, c0343aA, 1, obj);
            return;
        }
        int iC = (z0Var.f5593l - C0.c(z0Var.f5586b, z0Var.i)) - 1;
        if (c0411b.f6487a.f5444F.i - c0411b.f >= 0) {
            c0411b.d(true);
            Q.K k8 = c0411b.f6488b.f6486o;
            k8.W(Q.r.f6514g);
            D5.a.I(k8, 0, obj);
            k8.f6482q[k8.f6483r - k8.f6480o[k8.f6481p - 1].f6474a] = iC;
            return;
        }
        z0 z0Var2 = this.f5444F;
        C0343a c0343aA2 = z0Var2.a(z0Var2.i);
        Q.K k9 = c0411b.f6488b.f6486o;
        k9.W(Q.r.f);
        D5.a.J(k9, 0, obj, 1, c0343aA2);
        k9.f6482q[k9.f6483r - k9.f6480o[k9.f6481p - 1].f6474a] = iC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(long j) {
        Object objZ = z();
        if ((objZ instanceof Long) && j == ((Number) objZ).longValue()) {
            return false;
        }
        e0(Long.valueOf(j));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f0(int i) {
        int i7;
        if (i >= 0) {
            int[] iArr = this.f5466n;
            return (iArr == null || (i7 = iArr[i]) < 0) ? this.f5444F.l(i) : i7;
        }
        C1568t c1568t = this.f5467o;
        if (c1568t == null || c1568t.c(i) < 0) {
            return 0;
        }
        int iC = c1568t.c(i);
        if (iC >= 0) {
            return c1568t.f16248c[iC];
        }
        AbstractC1585a.e("Cannot find value for key " + i);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(Object obj) {
        if (kotlin.jvm.internal.m.a(z(), obj)) {
            return false;
        }
        e0(obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0() {
        if (!this.f5469q) {
            AbstractC0373p.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f5469q = false;
        if (this.f5453O) {
            AbstractC0373p.c("useNode() called while inserting");
        }
        z0 z0Var = this.f5444F;
        Object objK = z0Var.k(z0Var.i);
        C0411b c0411b = this.f5450L;
        c0411b.c();
        c0411b.f6493h.add(objK);
        if (this.f5476x && (objK instanceof InterfaceC0359i)) {
            c0411b.b();
            C0410a c0410a = c0411b.f6488b;
            if (objK != null) {
                c0410a.f6486o.W(Q.H.f6473c);
            } else {
                c0410a.getClass();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(boolean z5) {
        Object objZ = z();
        if ((objZ instanceof Boolean) && z5 == ((Boolean) objZ).booleanValue()) {
            return false;
        }
        e0(Boolean.valueOf(z5));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(Object obj) {
        if (z() == obj) {
            return false;
        }
        e0(obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        this.i = null;
        this.j = 0;
        this.f5463k = 0;
        this.f5454P = 0;
        this.f5469q = false;
        C0411b c0411b = this.f5450L;
        c0411b.f6489c = false;
        c0411b.f6490d.f527b = 0;
        c0411b.f = 0;
        this.f5442D.clear();
        this.f5466n = null;
        this.f5467o = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object k(AbstractC0366l0 abstractC0366l0) {
        return C0345b.r(m(), abstractC0366l0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(B5.a aVar) {
        if (!this.f5469q) {
            AbstractC0373p.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f5469q = false;
        if (!this.f5453O) {
            AbstractC0373p.c("createNode() can only be called when inserting");
        }
        C0057w c0057w = this.f5465m;
        int i = c0057w.f526a[c0057w.f527b - 1];
        D0 d02 = this.f5446H;
        C0343a c0343aB = d02.b(d02.f5306v);
        this.f5463k++;
        C0412c c0412c = this.f5452N;
        Q.K k7 = c0412c.f6496o;
        k7.W(Q.r.f6512d);
        D5.a.I(k7, 0, aVar);
        k7.f6482q[k7.f6483r - k7.f6480o[k7.f6481p - 1].f6474a] = i;
        D5.a.I(k7, 1, c0343aB);
        Q.K k8 = c0412c.f6497p;
        k8.W(Q.r.f6513e);
        k8.f6482q[k8.f6483r - k8.f6480o[k8.f6481p - 1].f6474a] = i;
        D5.a.I(k8, 0, c0343aB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0360i0 m() {
        InterfaceC0360i0 interfaceC0360i0;
        InterfaceC0360i0 interfaceC0360i02 = this.f5448J;
        if (interfaceC0360i02 != null) {
            return interfaceC0360i02;
        }
        int iN = this.f5444F.i;
        boolean z5 = this.f5453O;
        Z z6 = AbstractC0373p.f5487c;
        if (z5 && this.f5447I) {
            int iC = this.f5446H.f5306v;
            while (iC > 0) {
                D0 d02 = this.f5446H;
                if (d02.f5289b[d02.q(iC) * 5] == 202 && kotlin.jvm.internal.m.a(this.f5446H.r(iC), z6)) {
                    Object objP = this.f5446H.p(iC);
                    kotlin.jvm.internal.m.c(objP, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    InterfaceC0360i0 interfaceC0360i03 = (InterfaceC0360i0) objP;
                    this.f5448J = interfaceC0360i03;
                    return interfaceC0360i03;
                }
                D0 d03 = this.f5446H;
                iC = d03.C(d03.f5289b, iC);
            }
        }
        if (this.f5444F.f5587c > 0) {
            while (iN > 0) {
                z0 z0Var = this.f5444F;
                int[] iArr = z0Var.f5586b;
                if (iArr[iN * 5] == 202 && kotlin.jvm.internal.m.a(z0Var.m(iArr, iN), z6)) {
                    C1570v c1570v = this.f5473u;
                    if (c1570v == null || (interfaceC0360i0 = (InterfaceC0360i0) c1570v.b(iN)) == null) {
                        z0 z0Var2 = this.f5444F;
                        Object objB = z0Var2.b(z0Var2.f5586b, iN);
                        kotlin.jvm.internal.m.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC0360i0 = (InterfaceC0360i0) objB;
                    }
                    this.f5448J = interfaceC0360i0;
                    return interfaceC0360i0;
                }
                iN = this.f5444F.n(iN);
            }
        }
        InterfaceC0360i0 interfaceC0360i04 = this.f5472t;
        this.f5448J = interfaceC0360i04;
        return interfaceC0360i04;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(C1548G c1548g, X.e eVar) {
        ArrayList arrayList = this.f5470r;
        if (this.f5443E) {
            AbstractC0373p.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f5439A = Long.hashCode(a0.n.k().g());
            this.f5473u = null;
            Z(c1548g);
            this.j = 0;
            this.f5443E = true;
            try {
                X();
                Object objZ = z();
                if (objZ != eVar && eVar != null) {
                    e0(eVar);
                }
                C0369n c0369n = this.f5441C;
                R.e eVarL = C0345b.l();
                try {
                    eVarL.c(c0369n);
                    Z z5 = AbstractC0373p.f5485a;
                    if (eVar != null) {
                        Q(Scheduler.MAX_GREEDY_SCHEDULER_LIMIT, z5);
                        X.k.c(this, eVar);
                        p(false);
                    } else if (!this.f5474v || objZ == null || objZ.equals(C0363k.f5418a)) {
                        L();
                    } else {
                        Q(Scheduler.MAX_GREEDY_SCHEDULER_LIMIT, z5);
                        kotlin.jvm.internal.B.b(2, objZ);
                        X.k.c(this, (B5.e) objZ);
                        p(false);
                    }
                    eVarL.m(eVarL.f6678s - 1);
                    s();
                    this.f5443E = false;
                    arrayList.clear();
                    if (!this.f5446H.f5307w) {
                        AbstractC0373p.c("Check failed");
                    }
                    u();
                } catch (Throwable th) {
                    eVarL.m(eVarL.f6678s - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.f5443E = false;
                arrayList.clear();
                a();
                if (!this.f5446H.f5307w) {
                    AbstractC0373p.c("Check failed");
                }
                u();
                throw th2;
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i, int i7) {
        if (i <= 0 || i == i7) {
            return;
        }
        o(this.f5444F.n(i), i7);
        if (this.f5444F.i(i)) {
            Object objK = this.f5444F.k(i);
            C0411b c0411b = this.f5450L;
            c0411b.c();
            c0411b.f6493h.add(objK);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r42v0, resolved type: P.o */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0519  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            r42 = this;
            r0 = r42
            B0.w r1 = r0.f5465m
            int[] r2 = r1.f526a
            int r3 = r1.f527b
            int r3 = r3 + (-2)
            r2 = r2[r3]
            r3 = 1
            int r2 = r2 - r3
            boolean r4 = r0.f5453O
            P.S r5 = P.C0363k.f5418a
            r6 = 207(0xcf, float:2.9E-43)
            r7 = 3
            if (r4 == 0) goto L84
            P.D0 r4 = r0.f5446H
            int r8 = r4.f5306v
            int[] r9 = r4.f5289b
            int r4 = r4.q(r8)
            int r4 = r4 * 5
            r4 = r9[r4]
            P.D0 r9 = r0.f5446H
            java.lang.Object r9 = r9.r(r8)
            P.D0 r10 = r0.f5446H
            java.lang.Object r8 = r10.p(r8)
            if (r9 != 0) goto L69
            if (r8 == 0) goto L55
            if (r4 != r6) goto L55
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L55
            int r4 = r8.hashCode()
            int r5 = r0.f5454P
            r2 = r2 ^ r5
            int r2 = java.lang.Integer.rotateRight(r2, r7)
            int r4 = java.lang.Integer.hashCode(r4)
            r2 = r2 ^ r4
            int r2 = java.lang.Integer.rotateRight(r2, r7)
            r0.f5454P = r2
            goto Leb
        L55:
            int r5 = r0.f5454P
            r2 = r2 ^ r5
            int r2 = java.lang.Integer.rotateRight(r2, r7)
            int r4 = java.lang.Integer.hashCode(r4)
            r2 = r2 ^ r4
        L61:
            int r2 = java.lang.Integer.rotateRight(r2, r7)
            r0.f5454P = r2
            goto Leb
        L69:
            boolean r2 = r9 instanceof java.lang.Enum
            if (r2 == 0) goto L7f
            java.lang.Enum r9 = (java.lang.Enum) r9
            int r2 = r9.ordinal()
        L73:
            int r4 = r0.f5454P
            int r4 = java.lang.Integer.rotateRight(r4, r7)
            int r2 = java.lang.Integer.hashCode(r2)
            r2 = r2 ^ r4
            goto L61
        L7f:
            int r2 = r9.hashCode()
            goto L73
        L84:
            P.z0 r4 = r0.f5444F
            int r8 = r4.i
            int[] r9 = r4.f5586b
            int r10 = r8 * 5
            r10 = r9[r10]
            java.lang.Object r4 = r4.m(r9, r8)
            P.z0 r9 = r0.f5444F
            int[] r11 = r9.f5586b
            java.lang.Object r8 = r9.b(r11, r8)
            if (r4 != 0) goto Ld0
            if (r8 == 0) goto Lbd
            if (r10 != r6) goto Lbd
            boolean r4 = r8.equals(r5)
            if (r4 != 0) goto Lbd
            int r4 = r8.hashCode()
            int r5 = r0.f5454P
            r2 = r2 ^ r5
            int r2 = java.lang.Integer.rotateRight(r2, r7)
            int r4 = java.lang.Integer.hashCode(r4)
            r2 = r2 ^ r4
            int r2 = java.lang.Integer.rotateRight(r2, r7)
            r0.f5454P = r2
            goto Leb
        Lbd:
            int r4 = r0.f5454P
            r2 = r2 ^ r4
            int r2 = java.lang.Integer.rotateRight(r2, r7)
            int r4 = java.lang.Integer.hashCode(r10)
            r2 = r2 ^ r4
        Lc9:
            int r2 = java.lang.Integer.rotateRight(r2, r7)
            r0.f5454P = r2
            goto Leb
        Ld0:
            boolean r2 = r4 instanceof java.lang.Enum
            if (r2 == 0) goto Le6
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r2 = r4.ordinal()
        Lda:
            int r4 = r0.f5454P
            int r4 = java.lang.Integer.rotateRight(r4, r7)
            int r2 = java.lang.Integer.hashCode(r2)
            r2 = r2 ^ r4
            goto Lc9
        Le6:
            int r2 = r4.hashCode()
            goto Lda
        Leb:
            int r2 = r0.f5463k
            P.h0 r4 = r0.i
            java.util.ArrayList r5 = r0.f5470r
            Q.b r9 = r0.f5450L
            if (r4 == 0) goto L3a6
            r.v r10 = r4.f5416e
            int r11 = r4.f5413b
            java.util.ArrayList r12 = r4.f5412a
            int r13 = r12.size()
            if (r13 <= 0) goto L3a6
            java.util.ArrayList r13 = r4.f5415d
            java.util.HashSet r14 = new java.util.HashSet
            int r15 = r13.size()
            r14.<init>(r15)
            int r15 = r13.size()
            r16 = r7
            r7 = 0
        L113:
            if (r7 >= r15) goto L121
            r17 = -1
            java.lang.Object r6 = r13.get(r7)
            r14.add(r6)
            int r7 = r7 + 1
            goto L113
        L121:
            r17 = -1
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            int r7 = r13.size()
            int r15 = r12.size()
            r3 = 0
            r19 = 0
            r20 = 0
        L135:
            if (r3 >= r15) goto L383
            java.lang.Object r21 = r12.get(r3)
            r8 = r21
            P.O r8 = (P.O) r8
            boolean r21 = r14.contains(r8)
            if (r21 != 0) goto L194
            r21 = r1
            int r1 = r8.f5350c
            java.lang.Object r1 = r10.b(r1)
            P.I r1 = (P.I) r1
            if (r1 == 0) goto L156
            int r1 = r1.f5315b
            r22 = r1
            goto L158
        L156:
            r22 = r17
        L158:
            int r1 = r8.f5350c
            r23 = r3
            int r3 = r22 + r11
            int r8 = r8.f5351d
            r9.e(r3, r8)
            r3 = 0
            r4.a(r1, r3)
            int r3 = r9.f
            P.o r8 = r9.f6487a
            P.z0 r8 = r8.f5444F
            int r8 = r8.f5590g
            int r8 = r1 - r8
            int r8 = r8 + r3
            r9.f = r8
            P.z0 r3 = r0.f5444F
            r3.o(r1)
            r0.E()
            P.z0 r3 = r0.f5444F
            r3.p()
            P.z0 r3 = r0.f5444F
            int[] r3 = r3.f5586b
            int r8 = r1 * 5
            int r8 = r8 + 3
            r3 = r3[r8]
            int r3 = r3 + r1
            P.AbstractC0373p.a(r5, r1, r3)
        L18f:
            int r3 = r23 + 1
        L191:
            r1 = r21
            goto L135
        L194:
            r21 = r1
            r23 = r3
            boolean r1 = r6.contains(r8)
            if (r1 == 0) goto L19f
            goto L18f
        L19f:
            r1 = r19
            if (r1 >= r7) goto L379
            java.lang.Object r3 = r13.get(r1)
            P.O r3 = (P.O) r3
            if (r3 == r8) goto L33c
            int r8 = r3.f5350c
            java.lang.Object r8 = r10.b(r8)
            P.I r8 = (P.I) r8
            if (r8 == 0) goto L1b8
            int r8 = r8.f5315b
            goto L1ba
        L1b8:
            r8 = r17
        L1ba:
            r6.add(r3)
            r19 = r1
            r1 = r20
            r20 = r4
            if (r8 == r1) goto L32b
            int r4 = r3.f5350c
            java.lang.Object r4 = r10.b(r4)
            P.I r4 = (P.I) r4
            if (r4 == 0) goto L1d4
            int r4 = r4.f5316c
        L1d1:
            r22 = r6
            goto L1d7
        L1d4:
            int r4 = r3.f5351d
            goto L1d1
        L1d7:
            int r6 = r8 + r11
            r24 = r7
            int r7 = r1 + r11
            if (r4 <= 0) goto L206
            r25 = r11
            int r11 = r9.f6495l
            if (r11 <= 0) goto L1fa
            r26 = r11
            int r11 = r9.j
            r27 = r12
            int r12 = r6 - r26
            if (r11 != r12) goto L1fc
            int r11 = r9.f6494k
            int r12 = r7 - r26
            if (r11 != r12) goto L1fc
            int r11 = r26 + r4
            r9.f6495l = r11
            goto L20d
        L1fa:
            r27 = r12
        L1fc:
            r9.c()
            r9.j = r6
            r9.f6494k = r7
            r9.f6495l = r4
            goto L20d
        L206:
            r25 = r11
            r27 = r12
            r9.getClass()
        L20d:
            r26 = 7
            r28 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r30 = 128(0x80, double:6.32E-322)
            if (r8 <= r1) goto L29d
            java.lang.Object[] r7 = r10.f16218c
            r32 = 255(0xff, double:1.26E-321)
            long[] r11 = r10.f16216a
            int r12 = r11.length
            int r12 = r12 + (-2)
            if (r12 < 0) goto L299
            r35 = r13
            r36 = r14
            r6 = 0
        L228:
            r34 = 8
            r13 = r11[r6]
            r38 = r4
            r37 = r5
            long r4 = ~r13
            long r4 = r4 << r26
            long r4 = r4 & r13
            long r4 = r4 & r28
            int r4 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r4 == 0) goto L288
            int r4 = r6 - r12
            int r4 = ~r4
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r5 = 0
        L242:
            if (r5 >= r4) goto L27f
            long r39 = r13 & r32
            int r39 = (r39 > r30 ? 1 : (r39 == r30 ? 0 : -1))
            if (r39 >= 0) goto L270
            int r39 = r6 << 3
            int r39 = r39 + r5
            r39 = r7[r39]
            r40 = r5
            r5 = r39
            P.I r5 = (P.I) r5
            r39 = r7
            int r7 = r5.f5315b
            r41 = r11
            if (r8 > r7) goto L267
            int r11 = r8 + r38
            if (r7 >= r11) goto L267
            int r7 = r7 - r8
            int r7 = r7 + r1
            r5.f5315b = r7
            goto L276
        L267:
            if (r1 > r7) goto L276
            if (r7 >= r8) goto L276
            int r7 = r7 + r38
            r5.f5315b = r7
            goto L276
        L270:
            r40 = r5
            r39 = r7
            r41 = r11
        L276:
            long r13 = r13 >> r34
            int r5 = r40 + 1
            r7 = r39
            r11 = r41
            goto L242
        L27f:
            r39 = r7
            r41 = r11
            r5 = r34
            if (r4 != r5) goto L339
            goto L28c
        L288:
            r39 = r7
            r41 = r11
        L28c:
            if (r6 == r12) goto L339
            int r6 = r6 + 1
            r5 = r37
            r4 = r38
            r7 = r39
            r11 = r41
            goto L228
        L299:
            r37 = r5
            goto L335
        L29d:
            r38 = r4
            r37 = r5
            r35 = r13
            r36 = r14
            r32 = 255(0xff, double:1.26E-321)
            if (r1 <= r8) goto L339
            java.lang.Object[] r4 = r10.f16218c
            long[] r5 = r10.f16216a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L339
            r7 = 0
        L2b3:
            r11 = r5[r7]
            long r13 = ~r11
            long r13 = r13 << r26
            long r13 = r13 & r11
            long r13 = r13 & r28
            int r13 = (r13 > r28 ? 1 : (r13 == r28 ? 0 : -1))
            if (r13 == 0) goto L318
            int r13 = r7 - r6
            int r13 = ~r13
            int r13 = r13 >>> 31
            r34 = 8
            int r13 = 8 - r13
            r14 = 0
        L2c9:
            if (r14 >= r13) goto L30d
            long r39 = r11 & r32
            int r39 = (r39 > r30 ? 1 : (r39 == r30 ? 0 : -1))
            if (r39 >= 0) goto L2fc
            int r39 = r7 << 3
            int r39 = r39 + r14
            r39 = r4[r39]
            r40 = r4
            r4 = r39
            P.I r4 = (P.I) r4
            r39 = r5
            int r5 = r4.f5315b
            r41 = r8
            if (r8 > r5) goto L2ef
            int r8 = r41 + r38
            if (r5 >= r8) goto L2ef
            int r5 = r5 - r41
            int r5 = r5 + r1
            r4.f5315b = r5
            goto L2f9
        L2ef:
            int r8 = r41 + 1
            if (r8 > r5) goto L2f9
            if (r5 >= r1) goto L2f9
            int r5 = r5 - r38
            r4.f5315b = r5
        L2f9:
            r5 = 8
            goto L303
        L2fc:
            r40 = r4
            r39 = r5
            r41 = r8
            goto L2f9
        L303:
            long r11 = r11 >> r5
            int r14 = r14 + 1
            r5 = r39
            r4 = r40
            r8 = r41
            goto L2c9
        L30d:
            r40 = r4
            r39 = r5
            r41 = r8
            r5 = 8
            if (r13 != r5) goto L339
            goto L320
        L318:
            r40 = r4
            r39 = r5
            r41 = r8
            r5 = 8
        L320:
            if (r7 == r6) goto L339
            int r7 = r7 + 1
            r5 = r39
            r4 = r40
            r8 = r41
            goto L2b3
        L32b:
            r37 = r5
            r22 = r6
            r24 = r7
            r25 = r11
            r27 = r12
        L335:
            r35 = r13
            r36 = r14
        L339:
            r4 = r23
            goto L352
        L33c:
            r19 = r1
            r37 = r5
            r22 = r6
            r24 = r7
            r25 = r11
            r27 = r12
            r35 = r13
            r36 = r14
            r1 = r20
            r20 = r4
            int r4 = r23 + 1
        L352:
            int r19 = r19 + 1
            int r5 = r3.f5350c
            java.lang.Object r5 = r10.b(r5)
            P.I r5 = (P.I) r5
            if (r5 == 0) goto L361
            int r3 = r5.f5316c
            goto L363
        L361:
            int r3 = r3.f5351d
        L363:
            int r1 = r1 + r3
            r3 = r4
            r4 = r20
            r6 = r22
            r7 = r24
            r11 = r25
            r12 = r27
            r13 = r35
            r14 = r36
            r5 = r37
            r20 = r1
            goto L191
        L379:
            r19 = r1
            r1 = r20
            r1 = r21
            r3 = r23
            goto L135
        L383:
            r21 = r1
            r37 = r5
            r27 = r12
            r9.c()
            int r1 = r27.size()
            if (r1 <= 0) goto L3ac
            P.z0 r1 = r0.f5444F
            int r3 = r1.f5591h
            int r4 = r9.f
            P.o r5 = r9.f6487a
            P.z0 r5 = r5.f5444F
            int r5 = r5.f5590g
            int r3 = r3 - r5
            int r3 = r3 + r4
            r9.f = r3
            r1.q()
            goto L3ac
        L3a6:
            r21 = r1
            r37 = r5
            r17 = -1
        L3ac:
            boolean r1 = r0.f5453O
            r3 = -2
            if (r1 != 0) goto L426
            P.z0 r4 = r0.f5444F
            int r5 = r4.f5594m
            int r4 = r4.f5593l
            int r5 = r5 - r4
            if (r5 <= 0) goto L426
            if (r5 <= 0) goto L423
            r4 = 0
            r9.d(r4)
            B0.w r4 = r9.f6490d
            P.o r6 = r9.f6487a
            P.z0 r6 = r6.f5444F
            int r7 = r6.f5587c
            if (r7 <= 0) goto L406
            int r7 = r6.i
            int r8 = r4.a(r3)
            if (r8 == r7) goto L406
            boolean r8 = r9.f6489c
            if (r8 != 0) goto L3ea
            boolean r8 = r9.f6491e
            if (r8 == 0) goto L3ea
            r8 = 0
            r9.d(r8)
            Q.a r8 = r9.f6488b
            Q.K r8 = r8.f6486o
            Q.q r10 = Q.q.f6511c
            r8.W(r10)
            r8 = 1
            r9.f6489c = r8
        L3ea:
            if (r7 <= 0) goto L406
            P.a r6 = r6.a(r7)
            r4.c(r7)
            r4 = 0
            r9.d(r4)
            Q.a r7 = r9.f6488b
            Q.K r7 = r7.f6486o
            Q.p r8 = Q.p.f6510c
            r7.W(r8)
            D5.a.I(r7, r4, r6)
            r8 = 1
            r9.f6489c = r8
        L406:
            Q.a r4 = r9.f6488b
            Q.K r4 = r4.f6486o
            Q.D r6 = Q.D.f6469c
            r4.W(r6)
            int[] r6 = r4.f6482q
            int r7 = r4.f6483r
            Q.I[] r8 = r4.f6480o
            int r4 = r4.f6481p
            r18 = 1
            int r4 = r4 + (-1)
            r4 = r8[r4]
            int r4 = r4.f6474a
            int r7 = r7 - r4
            r6[r7] = r5
            goto L426
        L423:
            r9.getClass()
        L426:
            int r4 = r0.j
        L428:
            P.z0 r5 = r0.f5444F
            int r6 = r5.f5592k
            if (r6 <= 0) goto L42f
            goto L435
        L42f:
            int r6 = r5.f5590g
            int r5 = r5.f5591h
            if (r6 != r5) goto L637
        L435:
            if (r1 == 0) goto L5bd
            if (r43 == 0) goto L48f
            Q.c r2 = r0.f5452N
            Q.K r4 = r2.f6497p
            boolean r5 = r4.V()
            if (r5 != 0) goto L448
            java.lang.String r5 = "Cannot end node insertion, there are no pending operations that can be realized."
            P.AbstractC0373p.c(r5)
        L448:
            Q.K r2 = r2.f6496o
            Q.I[] r5 = r4.f6480o
            int r6 = r4.f6481p
            int r6 = r6 + (-1)
            r4.f6481p = r6
            r7 = r5[r6]
            r8 = 0
            r5[r6] = r8
            r2.W(r7)
            java.lang.Object[] r5 = r4.f6484s
            java.lang.Object[] r6 = r2.f6484s
            int r10 = r2.f6485t
            int r11 = r7.f6475b
            int r10 = r10 - r11
            int r12 = r4.f6485t
            int r13 = r12 - r11
            int r12 = r12 - r13
            java.lang.System.arraycopy(r5, r13, r6, r10, r12)
            java.lang.Object[] r5 = r4.f6484s
            int r6 = r4.f6485t
            int r10 = r6 - r11
            java.util.Arrays.fill(r5, r10, r6, r8)
            int[] r5 = r4.f6482q
            int[] r6 = r2.f6482q
            int r2 = r2.f6483r
            int r7 = r7.f6474a
            int r2 = r2 - r7
            int r8 = r4.f6483r
            int r10 = r8 - r7
            n5.k.C0(r2, r10, r8, r5, r6)
            int r2 = r4.f6485t
            int r2 = r2 - r11
            r4.f6485t = r2
            int r2 = r4.f6483r
            int r2 = r2 - r7
            r4.f6483r = r2
            r2 = 1
        L48f:
            P.z0 r4 = r0.f5444F
            int r5 = r4.f5592k
            if (r5 <= 0) goto L496
            goto L49b
        L496:
            java.lang.String r5 = "Unbalanced begin/end empty"
            P.AbstractC0362j0.a(r5)
        L49b:
            int r5 = r4.f5592k
            int r5 = r5 + (-1)
            r4.f5592k = r5
            P.D0 r4 = r0.f5446H
            int r5 = r4.f5306v
            r4.i()
            P.z0 r4 = r0.f5444F
            int r4 = r4.f5592k
            if (r4 <= 0) goto L4b0
            goto L606
        L4b0:
            int r4 = (-2) - r5
            P.D0 r5 = r0.f5446H
            r5.j()
            P.D0 r5 = r0.f5446H
            r8 = 1
            r5.e(r8)
            P.a r5 = r0.f5451M
            Q.c r6 = r0.f5452N
            Q.K r6 = r6.f6496o
            boolean r6 = r6.U()
            if (r6 == 0) goto L52d
            P.A0 r6 = r0.f5445G
            r9.b()
            r8 = 0
            r9.d(r8)
            B0.w r7 = r9.f6490d
            P.o r8 = r9.f6487a
            P.z0 r8 = r8.f5444F
            int r10 = r8.f5587c
            if (r10 <= 0) goto L519
            int r10 = r8.i
            int r3 = r7.a(r3)
            if (r3 == r10) goto L519
            boolean r3 = r9.f6489c
            if (r3 != 0) goto L4fc
            boolean r3 = r9.f6491e
            if (r3 == 0) goto L4fc
            r3 = 0
            r9.d(r3)
            Q.a r3 = r9.f6488b
            Q.K r3 = r3.f6486o
            Q.q r11 = Q.q.f6511c
            r3.W(r11)
            r3 = 1
            r9.f6489c = r3
        L4fc:
            if (r10 <= 0) goto L519
            P.a r3 = r8.a(r10)
            r7.c(r10)
            r8 = 0
            r9.d(r8)
            Q.a r7 = r9.f6488b
            Q.K r7 = r7.f6486o
            Q.p r10 = Q.p.f6510c
            r7.W(r10)
            D5.a.I(r7, r8, r3)
            r8 = 1
            r9.f6489c = r8
            goto L51a
        L519:
            r8 = 1
        L51a:
            r9.c()
            Q.a r3 = r9.f6488b
            Q.K r3 = r3.f6486o
            Q.s r7 = Q.s.f6516c
            r3.W(r7)
            r7 = 0
            D5.a.J(r3, r7, r5, r8, r6)
            r3 = r7
            goto L5ad
        L52d:
            r7 = 0
            P.A0 r6 = r0.f5445G
            Q.c r8 = r0.f5452N
            r9.b()
            r9.d(r7)
            B0.w r7 = r9.f6490d
            P.o r10 = r9.f6487a
            P.z0 r10 = r10.f5444F
            int r11 = r10.f5587c
            if (r11 <= 0) goto L57e
            int r11 = r10.i
            int r3 = r7.a(r3)
            if (r3 == r11) goto L57e
            boolean r3 = r9.f6489c
            if (r3 != 0) goto L562
            boolean r3 = r9.f6491e
            if (r3 == 0) goto L562
            r3 = 0
            r9.d(r3)
            Q.a r3 = r9.f6488b
            Q.K r3 = r3.f6486o
            Q.q r12 = Q.q.f6511c
            r3.W(r12)
            r3 = 1
            r9.f6489c = r3
        L562:
            if (r11 <= 0) goto L57e
            P.a r3 = r10.a(r11)
            r7.c(r11)
            r7 = 0
            r9.d(r7)
            Q.a r10 = r9.f6488b
            Q.K r10 = r10.f6486o
            Q.p r11 = Q.p.f6510c
            r10.W(r11)
            D5.a.I(r10, r7, r3)
            r3 = 1
            r9.f6489c = r3
        L57e:
            r9.c()
            Q.a r3 = r9.f6488b
            Q.K r3 = r3.f6486o
            Q.t r7 = Q.t.f6517c
            r3.W(r7)
            int r7 = r3.f6485t
            Q.I[] r9 = r3.f6480o
            int r10 = r3.f6481p
            r18 = 1
            int r10 = r10 + (-1)
            r9 = r9[r10]
            int r9 = r9.f6475b
            int r7 = r7 - r9
            java.lang.Object[] r3 = r3.f6484s
            r3[r7] = r5
            int r5 = r7 + 1
            r3[r5] = r6
            int r7 = r7 + 2
            r3[r7] = r8
            Q.c r3 = new Q.c
            r3.<init>()
            r0.f5452N = r3
            r3 = 0
        L5ad:
            r0.f5453O = r3
            P.A0 r5 = r0.f5458c
            int r5 = r5.f5266r
            if (r5 != 0) goto L5b6
            goto L606
        L5b6:
            r0.a0(r4, r3)
            r0.b0(r4, r2)
            goto L606
        L5bd:
            if (r43 == 0) goto L5c2
            r9.a()
        L5c2:
            P.o r3 = r9.f6487a
            P.z0 r3 = r3.f5444F
            int r3 = r3.i
            B0.w r4 = r9.f6490d
            r5 = r17
            int r6 = r4.a(r5)
            if (r6 > r3) goto L5d3
            goto L5d8
        L5d3:
            java.lang.String r6 = "Missed recording an endGroup"
            P.AbstractC0373p.c(r6)
        L5d8:
            int r5 = r4.a(r5)
            if (r5 != r3) goto L5ee
            r8 = 0
            r9.d(r8)
            r4.b()
            Q.a r3 = r9.f6488b
            Q.K r3 = r3.f6486o
            Q.m r4 = Q.m.f6507c
            r3.W(r4)
        L5ee:
            P.z0 r3 = r0.f5444F
            int r3 = r3.i
            int r4 = r0.f0(r3)
            if (r2 == r4) goto L5fb
            r0.b0(r3, r2)
        L5fb:
            if (r43 == 0) goto L5fe
            r2 = 1
        L5fe:
            P.z0 r3 = r0.f5444F
            r3.d()
            r9.c()
        L606:
            java.util.ArrayList r3 = r0.f5462h
            int r4 = r3.size()
            r18 = 1
            int r4 = r4 + (-1)
            java.lang.Object r3 = r3.remove(r4)
            P.h0 r3 = (P.C0358h0) r3
            if (r3 == 0) goto L620
            if (r1 != 0) goto L620
            int r1 = r3.f5414c
            int r1 = r1 + 1
            r3.f5414c = r1
        L620:
            r0.i = r3
            int r1 = r21.b()
            int r1 = r1 + r2
            r0.j = r1
            int r1 = r21.b()
            r0.f5464l = r1
            int r1 = r21.b()
            int r1 = r1 + r2
            r0.f5463k = r1
            return
        L637:
            r5 = r17
            r8 = 0
            r18 = 1
            r0.E()
            P.z0 r7 = r0.f5444F
            int r7 = r7.p()
            r9.e(r4, r7)
            P.z0 r7 = r0.f5444F
            int r7 = r7.f5590g
            r10 = r37
            P.AbstractC0373p.a(r10, r6, r7)
            goto L428
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.p(boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        p(false);
        C0372o0 c0372o0V = v();
        if (c0372o0V != null) {
            int i = c0372o0V.f5479a;
            if ((i & 1) != 0) {
                c0372o0V.f5479a = i | 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[EDGE_INSN: B:57:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078], EDGE_INSN: B:58:0x007b->B:28:0x007b BREAK  A[LOOP:0: B:15:0x0037->B:27:0x0078]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P.C0372o0 r() {
        /*
            r21 = this;
            r0 = r21
            java.util.ArrayList r1 = r0.f5442D
            boolean r2 = r1.isEmpty()
            r3 = 1
            if (r2 != 0) goto L17
            int r2 = r1.size()
            int r2 = r2 - r3
            java.lang.Object r1 = r1.remove(r2)
            P.o0 r1 = (P.C0372o0) r1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 == 0) goto La6
            int r5 = r1.f5479a
            r6 = r5 & (-9)
            r1.f5479a = r6
            int r6 = r0.f5439A
            r.B r7 = r1.f
            if (r7 == 0) goto L7b
            r5 = r5 & 16
            if (r5 == 0) goto L2b
            goto L7b
        L2b:
            java.lang.Object[] r5 = r7.f16110b
            int[] r8 = r7.f16111c
            long[] r9 = r7.f16109a
            int r10 = r9.length
            int r10 = r10 + (-2)
            if (r10 < 0) goto L7b
            r11 = 0
        L37:
            r12 = r9[r11]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L76
            int r14 = r11 - r10
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r4 = 0
        L54:
            if (r4 >= r14) goto L74
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.32E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L70
            int r17 = r11 << 3
            int r17 = r17 + r4
            r18 = r5[r17]
            r2 = r8[r17]
            if (r2 == r6) goto L70
            P.n0 r2 = new P.n0
            r2.<init>(r1, r6, r7)
            goto L7c
        L70:
            long r12 = r12 >> r15
            int r4 = r4 + 1
            goto L54
        L74:
            if (r14 != r15) goto L7b
        L76:
            if (r11 == r10) goto L7b
            int r11 = r11 + 1
            goto L37
        L7b:
            r2 = 0
        L7c:
            Q.b r4 = r0.f5450L
            if (r2 == 0) goto L8f
            Q.a r5 = r4.f6488b
            Q.K r5 = r5.f6486o
            Q.l r6 = Q.l.f6506c
            r5.W(r6)
            P.u r6 = r0.f5461g
            r7 = 0
            D5.a.J(r5, r7, r2, r3, r6)
        L8f:
            int r2 = r1.f5479a
            r5 = r2 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto La6
            r2 = r2 & (-513(0xfffffffffffffdff, float:NaN))
            r1.f5479a = r2
            Q.a r2 = r4.f6488b
            Q.K r2 = r2.f6486o
            Q.o r4 = Q.o.f6509c
            r2.W(r4)
            r7 = 0
            D5.a.I(r2, r7, r1)
        La6:
            if (r1 == 0) goto Ldb
            int r2 = r1.f5479a
            r4 = r2 & 16
            if (r4 == 0) goto Laf
            goto Ldb
        Laf:
            r2 = r2 & r3
            if (r2 == 0) goto Lb3
            goto Lb7
        Lb3:
            boolean r2 = r0.f5468p
            if (r2 == 0) goto Ldb
        Lb7:
            P.a r2 = r1.f5481c
            if (r2 != 0) goto Ld2
            boolean r2 = r0.f5453O
            if (r2 == 0) goto Lc8
            P.D0 r2 = r0.f5446H
            int r3 = r2.f5306v
            P.a r2 = r2.b(r3)
            goto Ld0
        Lc8:
            P.z0 r2 = r0.f5444F
            int r3 = r2.i
            P.a r2 = r2.a(r3)
        Ld0:
            r1.f5481c = r2
        Ld2:
            int r2 = r1.f5479a
            r2 = r2 & (-5)
            r1.f5479a = r2
            r4 = r1
        Ld9:
            r7 = 0
            goto Ldd
        Ldb:
            r4 = 0
            goto Ld9
        Ldd:
            r0.p(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0371o.r():P.o0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        p(false);
        this.f5457b.b();
        p(false);
        C0411b c0411b = this.f5450L;
        if (c0411b.f6489c) {
            c0411b.d(false);
            c0411b.d(false);
            c0411b.f6488b.f6486o.W(Q.m.f6507c);
            c0411b.f6489c = false;
        }
        c0411b.b();
        if (c0411b.f6490d.f527b != 0) {
            AbstractC0373p.c("Missed recording an endGroup()");
        }
        if (!this.f5462h.isEmpty()) {
            AbstractC0373p.c("Start/end imbalance");
        }
        j();
        this.f5444F.c();
        this.f5474v = this.f5475w.b() != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(boolean z5, C0358h0 c0358h0) {
        this.f5462h.add(this.i);
        this.i = c0358h0;
        int i = this.f5463k;
        C0057w c0057w = this.f5465m;
        c0057w.c(i);
        c0057w.c(this.f5464l);
        c0057w.c(this.j);
        if (z5) {
            this.j = 0;
        }
        this.f5463k = 0;
        this.f5464l = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        A0 a02 = new A0();
        if (this.f5440B) {
            a02.g();
        }
        if (this.f5457b.c()) {
            a02.f5264A = new C1570v();
        }
        this.f5445G = a02;
        D0 d0I = a02.i();
        d0I.e(true);
        this.f5446H = d0I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0372o0 v() {
        if (this.f5478z != 0) {
            return null;
        }
        ArrayList arrayList = this.f5442D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C0372o0) arrayList.get(arrayList.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w() {
        if (!x() || this.f5474v) {
            return true;
        }
        C0372o0 c0372o0V = v();
        return (c0372o0V == null || (c0372o0V.f5479a & 4) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        C0372o0 c0372o0V;
        return (this.f5453O || this.f5476x || this.f5474v || (c0372o0V = v()) == null || (c0372o0V.f5479a & 8) != 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(ArrayList arrayList) {
        C0410a c0410a = this.f;
        C0411b c0411b = this.f5450L;
        C0410a c0410a2 = c0411b.f6488b;
        try {
            c0411b.f6488b = c0410a;
            c0410a.f6486o.W(Q.z.f6523c);
            if (arrayList.size() <= 0) {
                c0411b.f6488b.f6486o.W(Q.n.f6508c);
                c0411b.f = 0;
            } else {
                C1371j c1371j = (C1371j) arrayList.get(0);
                V v6 = (V) c1371j.f15080q;
                v6.getClass();
                throw null;
            }
        } finally {
            c0411b.f6488b = c0410a2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object z() {
        boolean z5 = this.f5453O;
        S s6 = C0363k.f5418a;
        if (!z5) {
            Object objJ = this.f5444F.j();
            if (!this.f5476x || (objJ instanceof C0365l)) {
                return objJ;
            }
        } else if (this.f5469q) {
            AbstractC0373p.c("A call to createNode(), emitNode() or useNode() expected");
            return s6;
        }
        return s6;
    }
}
