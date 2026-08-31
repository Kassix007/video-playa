package P;

import Q.C0410a;
import a.AbstractC0597a;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m5.C1371j;
import r.C1543B;
import r.C1548G;
import r.C1549H;
import r.C1570v;

/* JADX INFO: renamed from: P.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0382u implements InterfaceC0375q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0410a f5519A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0410a f5520B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1548G f5521C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C1548G f5522D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f5523E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0382u f5524F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f5525G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final S f5526H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0371o f5527I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5528J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f5529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B0.G0 f5530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicReference f5531s = new AtomicReference(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f5532t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r.J f5533u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final A0 f5534v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1548G f5535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1549H f5536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1549H f5537y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1548G f5538z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0382u(r rVar, B0.G0 g02) {
        this.f5529q = rVar;
        this.f5530r = g02;
        r.J j = new r.J(new C1549H());
        this.f5533u = j;
        A0 a02 = new A0();
        if (rVar.c()) {
            a02.f5264A = new C1570v();
        }
        if (rVar.e()) {
            a02.g();
        }
        this.f5534v = a02;
        this.f5535w = AbstractC0597a.q();
        this.f5536x = new C1549H();
        this.f5537y = new C1549H();
        this.f5538z = AbstractC0597a.q();
        C0410a c0410a = new C0410a();
        this.f5519A = c0410a;
        C0410a c0410a2 = new C0410a();
        this.f5520B = c0410a2;
        this.f5521C = AbstractC0597a.q();
        this.f5522D = AbstractC0597a.q();
        this.f5526H = new S(7);
        C0371o c0371o = new C0371o(g02, rVar, a02, j, c0410a, c0410a2, this);
        rVar.l(c0371o);
        this.f5527I = c0371o;
        X.e eVar = AbstractC0357h.f5410a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.f5531s.set(null);
        this.f5519A.f6486o.S();
        this.f5520B.f6486o.S();
        r.J j = this.f5533u;
        if (j.f16155q.g()) {
            return;
        }
        new ArrayList();
        if (j.f16155q.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            I5.h hVar = new I5.h(j);
            I5.j jVar = (I5.j) hVar.f2435r;
            while (jVar.hasNext()) {
                w0 w0Var = (w0) jVar.next();
                hVar.remove();
                w0Var.c();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r.G r2 = r0.f5535w
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9c
            boolean r3 = r2 instanceof r.C1549H
            P.M r4 = P.M.f5336q
            r.H r5 = r0.f5536x
            r.H r6 = r0.f5537y
            r.G r7 = r0.f5521C
            if (r3 == 0) goto L81
            r.H r2 = (r.C1549H) r2
            java.lang.Object[] r3 = r2.f16139b
            long[] r2 = r2.f16138a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9c
            r10 = 0
        L24:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7c
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3e:
            if (r15 >= r13) goto L79
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r9 = r16
            P.o0 r9 = (P.C0372o0) r9
            boolean r16 = a.AbstractC0597a.K(r7, r1, r9)
            if (r16 != 0) goto L70
            r16 = r14
            P.M r14 = r9.c(r1)
            if (r14 == r4) goto L72
            r.G r14 = r9.f5484g
            if (r14 == 0) goto L6c
            if (r22 != 0) goto L6c
            r6.a(r9)
            goto L72
        L6c:
            r5.a(r9)
            goto L72
        L70:
            r16 = r14
        L72:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L3e
        L79:
            r9 = r14
            if (r13 != r9) goto L9c
        L7c:
            if (r10 == r8) goto L9c
            int r10 = r10 + 1
            goto L24
        L81:
            P.o0 r2 = (P.C0372o0) r2
            boolean r3 = a.AbstractC0597a.K(r7, r1, r2)
            if (r3 != 0) goto L9c
            P.M r1 = r2.c(r1)
            if (r1 == r4) goto L9c
            r.G r1 = r2.f5484g
            if (r1 == 0) goto L99
            if (r22 != 0) goto L99
            r6.a(r2)
            return
        L99:
            r5.a(r2)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0382u.b(java.lang.Object, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Set r35, boolean r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            r2 = r36
            boolean r3 = r1 instanceof R.h
            r.G r4 = r0.f5538z
            r5 = 0
            r14 = 8
            if (r3 == 0) goto L111
            R.h r1 = (R.h) r1
            r.H r1 = r1.f6689q
            java.lang.Object[] r3 = r1.f16139b
            long[] r1 = r1.f16138a
            int r15 = r1.length
            int r15 = r15 + (-2)
            if (r15 < 0) goto L104
            r6 = 0
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
        L21:
            r8 = r1[r6]
            r7 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = ~r8
            long r10 = r10 << r7
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto Lf5
            int r10 = r6 - r15
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L3a:
            if (r11 >= r10) goto Le9
            long r22 = r8 & r18
            int r12 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r12 >= 0) goto Ld2
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            r22 = r7
            boolean r7 = r12 instanceof P.C0372o0
            if (r7 == 0) goto L5a
            P.o0 r12 = (P.C0372o0) r12
            r12.c(r5)
        L52:
            r29 = r1
            r26 = r8
            r35 = r15
            goto Lcf
        L5a:
            r0.b(r12, r2)
            java.lang.Object r7 = r4.g(r12)
            if (r7 == 0) goto L52
            boolean r12 = r7 instanceof r.C1549H
            if (r12 == 0) goto Lc4
            r.H r7 = (r.C1549H) r7
            java.lang.Object[] r12 = r7.f16139b
            long[] r7 = r7.f16138a
            int r13 = r7.length
            int r13 = r13 + (-2)
            if (r13 < 0) goto L52
            r25 = r14
            r35 = r15
            r5 = 0
        L77:
            r14 = r7[r5]
            r26 = r8
            r9 = r7
            long r7 = ~r14
            long r7 = r7 << r22
            long r7 = r7 & r14
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto Lb6
            int r7 = r5 - r13
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L8e:
            if (r8 >= r7) goto Laf
            long r28 = r14 & r18
            int r28 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r28 >= 0) goto La6
            int r28 = r5 << 3
            int r28 = r28 + r8
            r28 = r12[r28]
            r29 = r1
            r1 = r28
            P.C r1 = (P.C) r1
            r0.b(r1, r2)
            goto La8
        La6:
            r29 = r1
        La8:
            long r14 = r14 >> r25
            int r8 = r8 + 1
            r1 = r29
            goto L8e
        Laf:
            r29 = r1
            r1 = r25
            if (r7 != r1) goto Lcf
            goto Lb8
        Lb6:
            r29 = r1
        Lb8:
            if (r5 == r13) goto Lcf
            int r5 = r5 + 1
            r7 = r9
            r8 = r26
            r1 = r29
            r25 = 8
            goto L77
        Lc4:
            r29 = r1
            r26 = r8
            r35 = r15
            P.C r7 = (P.C) r7
            r0.b(r7, r2)
        Lcf:
            r1 = 8
            goto Ldb
        Ld2:
            r29 = r1
            r22 = r7
            r26 = r8
            r35 = r15
            r1 = r14
        Ldb:
            long r8 = r26 >> r1
            int r11 = r11 + 1
            r15 = r35
            r14 = r1
            r7 = r22
            r1 = r29
            r5 = 0
            goto L3a
        Le9:
            r29 = r1
            r22 = r7
            r1 = r14
            r35 = r15
            if (r10 != r1) goto L18e
            r15 = r35
            goto Lf9
        Lf5:
            r29 = r1
            r22 = r7
        Lf9:
            if (r6 == r15) goto L18e
            int r6 = r6 + 1
            r1 = r29
            r5 = 0
            r14 = 8
            goto L21
        L104:
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
            goto L18e
        L111:
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L122:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L18e
            java.lang.Object r3 = r1.next()
            boolean r5 = r3 instanceof P.C0372o0
            if (r5 == 0) goto L137
            P.o0 r3 = (P.C0372o0) r3
            r5 = 0
            r3.c(r5)
            goto L122
        L137:
            r5 = 0
            r0.b(r3, r2)
            java.lang.Object r3 = r4.g(r3)
            if (r3 == 0) goto L122
            boolean r6 = r3 instanceof r.C1549H
            if (r6 == 0) goto L188
            r.H r3 = (r.C1549H) r3
            java.lang.Object[] r6 = r3.f16139b
            long[] r3 = r3.f16138a
            int r7 = r3.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L122
            r8 = 0
        L151:
            r9 = r3[r8]
            long r11 = ~r9
            long r11 = r11 << r22
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L183
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r25 = 8
            int r14 = 8 - r11
            r11 = 0
        L167:
            if (r11 >= r14) goto L17f
            long r12 = r9 & r18
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 >= 0) goto L179
            int r12 = r8 << 3
            int r12 = r12 + r11
            r12 = r6[r12]
            P.C r12 = (P.C) r12
            r0.b(r12, r2)
        L179:
            r12 = 8
            long r9 = r9 >> r12
            int r11 = r11 + 1
            goto L167
        L17f:
            r12 = 8
            if (r14 != r12) goto L122
        L183:
            if (r8 == r7) goto L122
            int r8 = r8 + 1
            goto L151
        L188:
            P.C r3 = (P.C) r3
            r0.b(r3, r2)
            goto L122
        L18e:
            java.lang.String r1 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"
            java.lang.String r3 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            r.G r4 = r0.f5535w
            r.H r6 = r0.f5536x
            if (r2 == 0) goto L2a4
            r.H r2 = r0.f5537y
            boolean r7 = r2.h()
            if (r7 == 0) goto L2a4
            long[] r7 = r4.f16133a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L29d
            r9 = 0
        L1a8:
            r10 = r7[r9]
            long r12 = ~r10
            long r12 = r12 << r22
            long r12 = r12 & r10
            long r12 = r12 & r20
            int r12 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r12 == 0) goto L291
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            r25 = 8
            int r14 = 8 - r12
            r12 = 0
        L1be:
            if (r12 >= r14) goto L286
            long r26 = r10 & r18
            int r13 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r13 >= 0) goto L273
            int r13 = r9 << 3
            int r13 = r13 + r12
            java.lang.Object[] r15 = r4.f16134b
            r15 = r15[r13]
            java.lang.Object[] r15 = r4.f16135c
            r15 = r15[r13]
            boolean r5 = r15 instanceof r.C1549H
            if (r5 == 0) goto L250
            kotlin.jvm.internal.m.c(r15, r3)
            r.H r15 = (r.C1549H) r15
            java.lang.Object[] r5 = r15.f16139b
            long[] r0 = r15.f16138a
            r24 = r5
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L245
            r26 = r0
            r27 = r10
            r0 = 0
        L1ea:
            r10 = r26[r0]
            r29 = r7
            r36 = r8
            long r7 = ~r10
            long r7 = r7 << r22
            long r7 = r7 & r10
            long r7 = r7 & r20
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L23c
            int r7 = r0 - r5
            int r7 = ~r7
            int r7 = r7 >>> 31
            r25 = 8
            int r7 = 8 - r7
            r8 = 0
        L204:
            if (r8 >= r7) goto L238
            long r30 = r10 & r18
            int r30 = (r30 > r16 ? 1 : (r30 == r16 ? 0 : -1))
            if (r30 >= 0) goto L22c
            int r30 = r0 << 3
            r31 = r8
            int r8 = r30 + r31
            r30 = r24[r8]
            r32 = r10
            r10 = r30
            P.o0 r10 = (P.C0372o0) r10
            boolean r11 = r2.c(r10)
            if (r11 != 0) goto L226
            boolean r10 = r6.c(r10)
            if (r10 == 0) goto L229
        L226:
            r15.m(r8)
        L229:
            r8 = 8
            goto L231
        L22c:
            r31 = r8
            r32 = r10
            goto L229
        L231:
            long r10 = r32 >> r8
            int r25 = r31 + 1
            r8 = r25
            goto L204
        L238:
            r8 = 8
            if (r7 != r8) goto L24b
        L23c:
            if (r0 == r5) goto L24b
            int r0 = r0 + 1
            r8 = r36
            r7 = r29
            goto L1ea
        L245:
            r29 = r7
            r36 = r8
            r27 = r10
        L24b:
            boolean r0 = r15.g()
            goto L26b
        L250:
            r29 = r7
            r36 = r8
            r27 = r10
            kotlin.jvm.internal.m.c(r15, r1)
            P.o0 r15 = (P.C0372o0) r15
            boolean r0 = r2.c(r15)
            if (r0 != 0) goto L26a
            boolean r0 = r6.c(r15)
            if (r0 == 0) goto L268
            goto L26a
        L268:
            r0 = 0
            goto L26b
        L26a:
            r0 = 1
        L26b:
            if (r0 == 0) goto L270
            r4.k(r13)
        L270:
            r8 = 8
            goto L27a
        L273:
            r29 = r7
            r36 = r8
            r27 = r10
            goto L270
        L27a:
            long r10 = r27 >> r8
            int r12 = r12 + 1
            r0 = r34
            r8 = r36
            r7 = r29
            goto L1be
        L286:
            r29 = r7
            r36 = r8
            r8 = 8
            if (r14 != r8) goto L29d
            r8 = r36
            goto L293
        L291:
            r29 = r7
        L293:
            if (r9 == r8) goto L29d
            int r9 = r9 + 1
            r0 = r34
            r7 = r29
            goto L1a8
        L29d:
            r2.b()
            r34.h()
            return
        L2a4:
            boolean r0 = r6.h()
            if (r0 == 0) goto L3ad
            long[] r0 = r4.f16133a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L3a7
            r5 = 0
        L2b2:
            r7 = r0[r5]
            long r9 = ~r7
            long r9 = r9 << r22
            long r9 = r9 & r7
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L397
            int r9 = r5 - r2
            int r9 = ~r9
            int r9 = r9 >>> 31
            r25 = 8
            int r14 = 8 - r9
            r9 = 0
        L2c8:
            if (r9 >= r14) goto L38e
            long r10 = r7 & r18
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 >= 0) goto L2d2
            r10 = 1
            goto L2d3
        L2d2:
            r10 = 0
        L2d3:
            if (r10 == 0) goto L37c
            int r10 = r5 << 3
            int r10 = r10 + r9
            java.lang.Object[] r11 = r4.f16134b
            r11 = r11[r10]
            java.lang.Object[] r11 = r4.f16135c
            r11 = r11[r10]
            boolean r12 = r11 instanceof r.C1549H
            if (r12 == 0) goto L365
            kotlin.jvm.internal.m.c(r11, r3)
            r.H r11 = (r.C1549H) r11
            java.lang.Object[] r12 = r11.f16139b
            long[] r13 = r11.f16138a
            int r15 = r13.length
            int r15 = r15 + (-2)
            r24 = r0
            if (r15 < 0) goto L35c
            r26 = r7
            r0 = 0
        L2f7:
            r7 = r13[r0]
            r28 = r12
            r29 = r13
            long r12 = ~r7
            long r12 = r12 << r22
            long r12 = r12 & r7
            long r12 = r12 & r20
            int r12 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r12 == 0) goto L34f
            int r12 = r0 - r15
            int r12 = ~r12
            int r12 = r12 >>> 31
            r25 = 8
            int r12 = 8 - r12
            r13 = 0
        L311:
            if (r13 >= r12) goto L348
            long r30 = r7 & r18
            int r30 = (r30 > r16 ? 1 : (r30 == r16 ? 0 : -1))
            if (r30 >= 0) goto L31c
            r30 = 1
            goto L31e
        L31c:
            r30 = 0
        L31e:
            if (r30 == 0) goto L33a
            int r30 = r0 << 3
            r31 = r3
            int r3 = r30 + r13
            r30 = r28[r3]
            r32 = r7
            r7 = r30
            P.o0 r7 = (P.C0372o0) r7
            boolean r7 = r6.c(r7)
            if (r7 == 0) goto L337
            r11.m(r3)
        L337:
            r8 = 8
            goto L33f
        L33a:
            r31 = r3
            r32 = r7
            goto L337
        L33f:
            long r32 = r32 >> r8
            int r13 = r13 + 1
            r3 = r31
            r7 = r32
            goto L311
        L348:
            r31 = r3
            r8 = 8
            if (r12 != r8) goto L360
            goto L351
        L34f:
            r31 = r3
        L351:
            if (r0 == r15) goto L360
            int r0 = r0 + 1
            r12 = r28
            r13 = r29
            r3 = r31
            goto L2f7
        L35c:
            r31 = r3
            r26 = r7
        L360:
            boolean r0 = r11.g()
            goto L374
        L365:
            r24 = r0
            r31 = r3
            r26 = r7
            kotlin.jvm.internal.m.c(r11, r1)
            P.o0 r11 = (P.C0372o0) r11
            boolean r0 = r6.c(r11)
        L374:
            if (r0 == 0) goto L379
            r4.k(r10)
        L379:
            r8 = 8
            goto L383
        L37c:
            r24 = r0
            r31 = r3
            r26 = r7
            goto L379
        L383:
            long r10 = r26 >> r8
            int r9 = r9 + 1
            r7 = r10
            r0 = r24
            r3 = r31
            goto L2c8
        L38e:
            r24 = r0
            r31 = r3
            r8 = 8
            if (r14 != r8) goto L3a7
            goto L39d
        L397:
            r24 = r0
            r31 = r3
            r8 = 8
        L39d:
            if (r5 == r2) goto L3a7
            int r5 = r5 + 1
            r0 = r24
            r3 = r31
            goto L2b2
        L3a7:
            r34.h()
            r6.b()
        L3ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0382u.c(java.util.Set, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void d() {
        synchronized (this.f5532t) {
            try {
                e(this.f5519A);
                n();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f5533u.f16155q.g()) {
                            r.J j = this.f5533u;
                            new ArrayList();
                            if (!j.f16155q.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    I5.h hVar = new I5.h(j);
                                    while (((I5.j) hVar.f2435r).hasNext()) {
                                        w0 w0Var = (w0) ((I5.j) hVar.f2435r).next();
                                        hVar.remove();
                                        w0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        a();
                        throw e7;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, GOTO]}, finally: {[CONST] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[CONST, MOVE] complete}, expected: {[CONST] complete} */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Q.C0410a r33) {
        /*
            r32 = this;
            r1 = r32
            r0 = r33
            Q.a r2 = r1.f5520B
            X.j r3 = new X.j
            r.J r4 = r1.f5533u
            r3.<init>(r4)
            Q.K r4 = r0.f6486o     // Catch: java.lang.Throwable -> L174
            boolean r4 = r4.U()     // Catch: java.lang.Throwable -> L174
            if (r4 == 0) goto L21
            Q.K r0 = r2.f6486o
            boolean r0 = r0.U()
            if (r0 == 0) goto L185
            r3.a()
            return
        L21:
            java.lang.String r4 = "Compose:applyChanges"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L174
            B0.G0 r4 = r1.f5530r     // Catch: java.lang.Throwable -> L186
            P.A0 r5 = r1.f5534v     // Catch: java.lang.Throwable -> L186
            P.D0 r5 = r5.i()     // Catch: java.lang.Throwable -> L186
            r6 = 0
            r0.S(r4, r5, r3)     // Catch: java.lang.Throwable -> L188
            r0 = 1
            r5.e(r0)     // Catch: java.lang.Throwable -> L186
            r4.O()     // Catch: java.lang.Throwable -> L186
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L174
            r3.b()     // Catch: java.lang.Throwable -> L174
            R.e r4 = r3.f8153e     // Catch: java.lang.Throwable -> L174
            int r5 = r4.f6678s     // Catch: java.lang.Throwable -> L174
            if (r5 == 0) goto L68
            java.lang.String r5 = "Compose:sideeffects"
            android.os.Trace.beginSection(r5)     // Catch: java.lang.Throwable -> L174
            java.lang.Object[] r5 = r4.f6676q     // Catch: java.lang.Throwable -> L5b
            int r7 = r4.f6678s     // Catch: java.lang.Throwable -> L5b
            r8 = r6
        L4f:
            if (r8 >= r7) goto L5d
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L5b
            B5.a r9 = (B5.a) r9     // Catch: java.lang.Throwable -> L5b
            r9.invoke()     // Catch: java.lang.Throwable -> L5b
            int r8 = r8 + 1
            goto L4f
        L5b:
            r0 = move-exception
            goto L64
        L5d:
            r4.i()     // Catch: java.lang.Throwable -> L5b
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L174
            goto L68
        L64:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L174
            throw r0     // Catch: java.lang.Throwable -> L174
        L68:
            boolean r4 = r1.f5523E     // Catch: java.lang.Throwable -> L174
            if (r4 == 0) goto L17a
            java.lang.String r4 = "Compose:unobserve"
            android.os.Trace.beginSection(r4)     // Catch: java.lang.Throwable -> L174
            r1.f5523E = r6     // Catch: java.lang.Throwable -> L100
            r.G r4 = r1.f5535w     // Catch: java.lang.Throwable -> L100
            long[] r5 = r4.f16133a     // Catch: java.lang.Throwable -> L100
            int r7 = r5.length     // Catch: java.lang.Throwable -> L100
            int r7 = r7 + (-2)
            if (r7 < 0) goto L16d
            r8 = r6
        L7d:
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L100
            long r11 = ~r9     // Catch: java.lang.Throwable -> L100
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r14
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 == 0) goto L15f
            int r11 = r8 - r7
            int r11 = ~r11     // Catch: java.lang.Throwable -> L100
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r0 = r6
        L97:
            if (r0 >= r11) goto L159
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r9 & r16
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L13e
            int r18 = r8 << 3
            r19 = r13
            int r13 = r18 + r0
            r22 = r14
            java.lang.Object[] r14 = r4.f16134b     // Catch: java.lang.Throwable -> L100
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L100
            java.lang.Object[] r14 = r4.f16135c     // Catch: java.lang.Throwable -> L100
            r14 = r14[r13]     // Catch: java.lang.Throwable -> L100
            boolean r15 = r14 instanceof r.C1549H     // Catch: java.lang.Throwable -> L100
            if (r15 == 0) goto L120
            java.lang.String r15 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            kotlin.jvm.internal.m.c(r14, r15)     // Catch: java.lang.Throwable -> L100
            r.H r14 = (r.C1549H) r14     // Catch: java.lang.Throwable -> L100
            java.lang.Object[] r15 = r14.f16139b     // Catch: java.lang.Throwable -> L100
            long[] r6 = r14.f16138a     // Catch: java.lang.Throwable -> L100
            r24 = r12
            int r12 = r6.length     // Catch: java.lang.Throwable -> L100
            int r12 = r12 + (-2)
            r25 = r0
            r26 = r5
            if (r12 < 0) goto L119
            r27 = r6
            r0 = 0
        Ld0:
            r5 = r27[r0]     // Catch: java.lang.Throwable -> L100
            r28 = r9
            long r9 = ~r5     // Catch: java.lang.Throwable -> L100
            long r9 = r9 << r19
            long r9 = r9 & r5
            long r9 = r9 & r22
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 == 0) goto L10e
            int r9 = r0 - r12
            int r9 = ~r9     // Catch: java.lang.Throwable -> L100
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Le6:
            if (r10 >= r9) goto L10a
            long r30 = r5 & r16
            int r30 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r30 >= 0) goto L103
            int r30 = r0 << 3
            int r1 = r30 + r10
            r30 = r15[r1]     // Catch: java.lang.Throwable -> L100
            P.o0 r30 = (P.C0372o0) r30     // Catch: java.lang.Throwable -> L100
            boolean r30 = r30.b()     // Catch: java.lang.Throwable -> L100
            if (r30 != 0) goto L103
            r14.m(r1)     // Catch: java.lang.Throwable -> L100
            goto L103
        L100:
            r0 = move-exception
            goto L176
        L103:
            long r5 = r5 >> r24
            int r10 = r10 + 1
            r1 = r32
            goto Le6
        L10a:
            r1 = r24
            if (r9 != r1) goto L11b
        L10e:
            if (r0 == r12) goto L11b
            int r0 = r0 + 1
            r24 = 8
            r1 = r32
            r9 = r28
            goto Ld0
        L119:
            r28 = r9
        L11b:
            boolean r0 = r14.g()     // Catch: java.lang.Throwable -> L100
            goto L136
        L120:
            r25 = r0
            r26 = r5
            r28 = r9
            java.lang.String r0 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.m.c(r14, r0)     // Catch: java.lang.Throwable -> L100
            P.o0 r14 = (P.C0372o0) r14     // Catch: java.lang.Throwable -> L100
            boolean r0 = r14.b()     // Catch: java.lang.Throwable -> L100
            if (r0 != 0) goto L135
            r0 = 1
            goto L136
        L135:
            r0 = 0
        L136:
            if (r0 == 0) goto L13b
            r4.k(r13)     // Catch: java.lang.Throwable -> L100
        L13b:
            r1 = 8
            goto L149
        L13e:
            r25 = r0
            r26 = r5
            r28 = r9
            r19 = r13
            r22 = r14
            r1 = r12
        L149:
            long r9 = r28 >> r1
            int r0 = r25 + 1
            r6 = 0
            r12 = r1
            r13 = r19
            r14 = r22
            r5 = r26
            r1 = r32
            goto L97
        L159:
            r26 = r5
            r1 = r12
            if (r11 != r1) goto L16d
            goto L161
        L15f:
            r26 = r5
        L161:
            if (r8 == r7) goto L16d
            int r8 = r8 + 1
            r5 = r26
            r0 = 1
            r6 = 0
            r1 = r32
            goto L7d
        L16d:
            r32.h()     // Catch: java.lang.Throwable -> L100
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L174
            goto L17a
        L174:
            r0 = move-exception
            goto L192
        L176:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L174
            throw r0     // Catch: java.lang.Throwable -> L174
        L17a:
            Q.K r0 = r2.f6486o
            boolean r0 = r0.U()
            if (r0 == 0) goto L185
            r3.a()
        L185:
            return
        L186:
            r0 = move-exception
            goto L18e
        L188:
            r0 = move-exception
            r1 = 0
            r5.e(r1)     // Catch: java.lang.Throwable -> L186
            throw r0     // Catch: java.lang.Throwable -> L186
        L18e:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L174
            throw r0     // Catch: java.lang.Throwable -> L174
        L192:
            Q.K r1 = r2.f6486o
            boolean r1 = r1.U()
            if (r1 == 0) goto L19d
            r3.a()
        L19d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0382u.e(Q.a):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void f() {
        synchronized (this.f5532t) {
            try {
                if (this.f5520B.f6486o.V()) {
                    e(this.f5520B);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f5533u.f16155q.g()) {
                            r.J j = this.f5533u;
                            new ArrayList();
                            if (!j.f16155q.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    I5.h hVar = new I5.h(j);
                                    while (((I5.j) hVar.f2435r).hasNext()) {
                                        w0 w0Var = (w0) ((I5.j) hVar.f2435r).next();
                                        hVar.remove();
                                        w0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        a();
                        throw e7;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 4, expect 1 */
    public final void g() {
        synchronized (this.f5532t) {
            try {
                this.f5527I.f5473u = null;
                if (!this.f5533u.f16155q.g()) {
                    r.J j = this.f5533u;
                    new ArrayList();
                    if (!j.f16155q.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            I5.h hVar = new I5.h(j);
                            while (((I5.j) hVar.f2435r).hasNext()) {
                                w0 w0Var = (w0) ((I5.j) hVar.f2435r).next();
                                hVar.remove();
                                w0Var.c();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f5533u.f16155q.g()) {
                            r.J j7 = this.f5533u;
                            new ArrayList();
                            if (!j7.f16155q.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    I5.h hVar2 = new I5.h(j7);
                                    while (((I5.j) hVar2.f2435r).hasNext()) {
                                        w0 w0Var2 = (w0) ((I5.j) hVar2.f2435r).next();
                                        hVar2.remove();
                                        w0Var2.c();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        a();
                        throw e7;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r33 = this;
            r0 = r33
            r.G r1 = r0.f5538z
            long[] r2 = r1.f16133a
            int r3 = r2.length
            int r3 = r3 + (-2)
            r8 = 7
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 8
            if (r3 < 0) goto L120
            r14 = 0
            r15 = 128(0x80, double:6.32E-322)
        L16:
            r4 = r2[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r6 = ~r4
            long r6 = r6 << r8
            long r6 = r6 & r4
            long r6 = r6 & r9
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L108
            int r6 = r14 - r3
            int r6 = ~r6
            int r6 = r6 >>> 31
            int r6 = 8 - r6
            r7 = 0
        L2a:
            if (r7 >= r6) goto Lf8
            long r19 = r4 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto Lda
            int r19 = r14 << 3
            r20 = r8
            int r8 = r19 + r7
            r21 = r9
            java.lang.Object[] r9 = r1.f16134b
            r9 = r9[r8]
            java.lang.Object[] r9 = r1.f16135c
            r9 = r9[r8]
            boolean r10 = r9 instanceof r.C1549H
            r.G r11 = r0.f5535w
            if (r10 == 0) goto Lba
            java.lang.String r10 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            kotlin.jvm.internal.m.c(r9, r10)
            r.H r9 = (r.C1549H) r9
            java.lang.Object[] r10 = r9.f16139b
            long[] r13 = r9.f16138a
            r23 = r15
            int r15 = r13.length
            int r15 = r15 + (-2)
            if (r15 < 0) goto Laf
            r25 = r4
            r16 = r12
            r12 = 0
        L5f:
            r4 = r13[r12]
            r27 = r2
            r28 = r3
            long r2 = ~r4
            long r2 = r2 << r20
            long r2 = r2 & r4
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto La4
            int r2 = r12 - r15
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = 0
        L77:
            if (r3 >= r2) goto La0
            long r29 = r4 & r17
            int r29 = (r29 > r23 ? 1 : (r29 == r23 ? 0 : -1))
            if (r29 >= 0) goto L97
            int r29 = r12 << 3
            r30 = r3
            int r3 = r29 + r30
            r29 = r10[r3]
            r31 = r4
            r4 = r29
            P.C r4 = (P.C) r4
            boolean r4 = r11.c(r4)
            if (r4 != 0) goto L9b
            r9.m(r3)
            goto L9b
        L97:
            r30 = r3
            r31 = r4
        L9b:
            long r4 = r31 >> r16
            int r3 = r30 + 1
            goto L77
        La0:
            r3 = r16
            if (r2 != r3) goto Lb5
        La4:
            if (r12 == r15) goto Lb5
            int r12 = r12 + 1
            r2 = r27
            r3 = r28
            r16 = 8
            goto L5f
        Laf:
            r27 = r2
            r28 = r3
            r25 = r4
        Lb5:
            boolean r2 = r9.g()
            goto Ld2
        Lba:
            r27 = r2
            r28 = r3
            r25 = r4
            r23 = r15
            java.lang.String r2 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.m.c(r9, r2)
            P.C r9 = (P.C) r9
            boolean r2 = r11.c(r9)
            if (r2 != 0) goto Ld1
            r2 = 1
            goto Ld2
        Ld1:
            r2 = 0
        Ld2:
            if (r2 == 0) goto Ld7
            r1.k(r8)
        Ld7:
            r3 = 8
            goto Le7
        Lda:
            r27 = r2
            r28 = r3
            r25 = r4
            r20 = r8
            r21 = r9
            r23 = r15
            r3 = r12
        Le7:
            long r4 = r25 >> r3
            int r7 = r7 + 1
            r12 = r3
            r8 = r20
            r9 = r21
            r15 = r23
            r2 = r27
            r3 = r28
            goto L2a
        Lf8:
            r27 = r2
            r28 = r3
            r20 = r8
            r21 = r9
            r3 = r12
            r23 = r15
            if (r6 != r3) goto L128
            r3 = r28
            goto L110
        L108:
            r27 = r2
            r20 = r8
            r21 = r9
            r23 = r15
        L110:
            if (r14 == r3) goto L128
            int r14 = r14 + 1
            r8 = r20
            r9 = r21
            r15 = r23
            r2 = r27
            r12 = 8
            goto L16
        L120:
            r20 = r8
            r21 = r9
            r17 = 255(0xff, double:1.26E-321)
            r23 = 128(0x80, double:6.32E-322)
        L128:
            r.H r1 = r0.f5537y
            boolean r2 = r1.h()
            if (r2 == 0) goto L182
            java.lang.Object[] r2 = r1.f16139b
            long[] r3 = r1.f16138a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L182
            r5 = 0
        L13a:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r20
            long r8 = r8 & r6
            long r8 = r8 & r21
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L17b
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r16 = 8
            int r12 = 8 - r8
            r8 = 0
        L150:
            if (r8 >= r12) goto L176
            long r9 = r6 & r17
            int r9 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r9 >= 0) goto L15a
            r9 = 1
            goto L15b
        L15a:
            r9 = 0
        L15b:
            if (r9 == 0) goto L170
            int r9 = r5 << 3
            int r9 = r9 + r8
            r10 = r2[r9]
            P.o0 r10 = (P.C0372o0) r10
            r.G r10 = r10.f5484g
            if (r10 == 0) goto L16a
            r10 = 1
            goto L16b
        L16a:
            r10 = 0
        L16b:
            if (r10 != 0) goto L170
            r1.m(r9)
        L170:
            r9 = 8
            long r6 = r6 >> r9
            int r8 = r8 + 1
            goto L150
        L176:
            r9 = 8
            if (r12 != r9) goto L182
            goto L17d
        L17b:
            r9 = 8
        L17d:
            if (r5 == r4) goto L182
            int r5 = r5 + 1
            goto L13a
        L182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0382u.h():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public final void i(X.e eVar) throws Exception {
        try {
            synchronized (this.f5532t) {
                m();
                C1548G c1548g = this.f5522D;
                this.f5522D = AbstractC0597a.q();
                try {
                    this.f5526H.getClass();
                    this.f5529q.getClass();
                    C0371o c0371o = this.f5527I;
                    if (!c0371o.f5460e.f6486o.U()) {
                        AbstractC0373p.c("Expected applyChanges() to have been called");
                    }
                    c0371o.n(c1548g, eVar);
                } catch (Exception e7) {
                    this.f5522D = c1548g;
                    throw e7;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f5533u.f16155q.g()) {
                    r.J j = this.f5533u;
                    new ArrayList();
                    if (!j.f16155q.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            I5.h hVar = new I5.h(j);
                            while (((I5.j) hVar.f2435r).hasNext()) {
                                w0 w0Var = (w0) ((I5.j) hVar.f2435r).next();
                                hVar.remove();
                                w0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e8) {
                a();
                throw e8;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(X.e eVar) {
        if (this.f5528J) {
            AbstractC0362j0.b("The composition is disposed");
        }
        this.f5529q.a(this, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        synchronized (this.f5532t) {
            try {
                boolean z5 = this.f5534v.f5266r > 0;
                if (z5 || !this.f5533u.f16155q.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        X.j jVar = new X.j(this.f5533u);
                        if (z5) {
                            D0 d0I = this.f5534v.i();
                            try {
                                AbstractC0373p.e(d0I, jVar);
                                d0I.e(true);
                                this.f5530r.O();
                                jVar.b();
                            } catch (Throwable th) {
                                d0I.e(false);
                                throw th;
                            }
                        }
                        jVar.a();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                this.f5535w.a();
                this.f5538z.a();
                this.f5522D.a();
                this.f5519A.f6486o.S();
                this.f5520B.f6486o.S();
                C0371o c0371o = this.f5527I;
                c0371o.f5442D.clear();
                c0371o.f5470r.clear();
                c0371o.f5460e.f6486o.S();
                c0371o.f5473u = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        synchronized (this.f5532t) {
            try {
                if (this.f5527I.f5443E) {
                    AbstractC0362j0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f5528J) {
                    this.f5528J = true;
                    X.e eVar = AbstractC0357h.f5411b;
                    C0410a c0410a = this.f5527I.f5449K;
                    if (c0410a != null) {
                        e(c0410a);
                    }
                    boolean z5 = this.f5534v.f5266r > 0;
                    if (z5 || !this.f5533u.f16155q.g()) {
                        X.j jVar = new X.j(this.f5533u);
                        if (z5) {
                            D0 d0I = this.f5534v.i();
                            try {
                                AbstractC0373p.g(d0I, jVar);
                                d0I.e(true);
                                this.f5530r.n();
                                this.f5530r.O();
                                jVar.b();
                            } catch (Throwable th) {
                                d0I.e(false);
                                throw th;
                            }
                        }
                        jVar.a();
                    }
                    C0371o c0371o = this.f5527I;
                    c0371o.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0371o.f5457b.o(c0371o);
                        c0371o.f5442D.clear();
                        c0371o.f5470r.clear();
                        c0371o.f5460e.f6486o.S();
                        c0371o.f5473u = null;
                        c0371o.f5456a.n();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f5529q.p(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        Object obj = C0345b.f5386a;
        AtomicReference atomicReference = this.f5531s;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC0373p.d("pending composition has not been applied");
                throw new C2.e();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC0373p.d("corrupt pendingModifications drain: " + atomicReference);
                throw new C2.e();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        AtomicReference atomicReference = this.f5531s;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.m.a(andSet, C0345b.f5386a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC0373p.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new C2.e();
        }
        AbstractC0373p.d("corrupt pendingModifications drain: " + atomicReference);
        throw new C2.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        n5.u uVar = n5.u.f15301q;
        AtomicReference atomicReference = this.f5531s;
        Object andSet = atomicReference.getAndSet(uVar);
        if (kotlin.jvm.internal.m.a(andSet, C0345b.f5386a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC0373p.d("corrupt pendingModifications drain: " + atomicReference);
            throw new C2.e();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public final void p(ArrayList arrayList) throws Exception {
        r.J j = this.f5533u;
        if (arrayList.size() > 0) {
            ((V) ((C1371j) arrayList.get(0)).f15080q).getClass();
            throw null;
        }
        try {
            C0371o c0371o = this.f5527I;
            c0371o.getClass();
            try {
                c0371o.y(arrayList);
                c0371o.j();
            } catch (Throwable th) {
                c0371o.a();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                if (!j.f16155q.g()) {
                    new ArrayList();
                    if (!j.f16155q.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            I5.h hVar = new I5.h(j);
                            I5.j jVar = (I5.j) hVar.f2435r;
                            while (jVar.hasNext()) {
                                w0 w0Var = (w0) jVar.next();
                                hVar.remove();
                                w0Var.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e7) {
                a();
                throw e7;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final M q(C0372o0 c0372o0, Object obj) {
        C0382u c0382u;
        int i = c0372o0.f5479a;
        if ((i & 2) != 0) {
            c0372o0.f5479a = i | 4;
        }
        C0343a c0343a = c0372o0.f5481c;
        if (c0343a == null || !c0343a.a()) {
            return M.f5336q;
        }
        if (this.f5534v.j(c0343a)) {
            return c0372o0.f5482d != null ? s(c0372o0, c0343a, obj) : M.f5336q;
        }
        synchronized (this.f5532t) {
            c0382u = this.f5524F;
        }
        if (c0382u != null) {
            C0371o c0371o = c0382u.f5527I;
            if (c0371o.f5443E && c0371o.Y(c0372o0, obj)) {
                return M.f5339t;
            }
        }
        return M.f5336q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        C0382u c0382u;
        synchronized (this.f5532t) {
            try {
                for (Object obj : this.f5534v.f5267s) {
                    C0372o0 c0372o0 = obj instanceof C0372o0 ? (C0372o0) obj : null;
                    if (c0372o0 != null && (c0382u = c0372o0.f5480b) != null) {
                        c0382u.q(c0372o0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df A[Catch: all -> 0x0042, EDGE_INSN: B:81:0x00df->B:66:0x00df BREAK  A[LOOP:0: B:48:0x0096->B:62:0x00d7], EDGE_INSN: B:82:0x00df->B:66:0x00df BREAK  A[LOOP:0: B:48:0x0096->B:62:0x00d7], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0068, B:38:0x0071, B:40:0x0075, B:41:0x007e, B:43:0x0086, B:45:0x008a, B:48:0x0096, B:50:0x00a6, B:52:0x00b2, B:54:0x00bc, B:58:0x00cb, B:62:0x00d7, B:63:0x00da, B:66:0x00df), top: B:79:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final P.M s(P.C0372o0 r21, P.C0343a r22, java.lang.Object r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            java.lang.Object r4 = r1.f5532t
            monitor-enter(r4)
            P.u r5 = r1.f5524F     // Catch: java.lang.Throwable -> L42
            r6 = 0
            if (r5 == 0) goto L45
            P.A0 r7 = r1.f5534v     // Catch: java.lang.Throwable -> L42
            int r8 = r1.f5525G     // Catch: java.lang.Throwable -> L42
            boolean r9 = r7.f5271w     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L1d
            java.lang.String r9 = "Writer is active"
            P.AbstractC0373p.c(r9)     // Catch: java.lang.Throwable -> L42
        L1d:
            if (r8 < 0) goto L24
            int r9 = r7.f5266r     // Catch: java.lang.Throwable -> L42
            if (r8 >= r9) goto L24
            goto L29
        L24:
            java.lang.String r9 = "Invalid group index"
            P.AbstractC0373p.c(r9)     // Catch: java.lang.Throwable -> L42
        L29:
            boolean r9 = r7.j(r2)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L3f
            int[] r7 = r7.f5265q     // Catch: java.lang.Throwable -> L42
            int r9 = r8 * 5
            int r9 = r9 + 3
            r7 = r7[r9]     // Catch: java.lang.Throwable -> L42
            int r7 = r7 + r8
            int r9 = r2.f5384a     // Catch: java.lang.Throwable -> L42
            if (r8 > r9) goto L3f
            if (r9 >= r7) goto L3f
            goto L40
        L3f:
            r5 = r6
        L40:
            r6 = r5
            goto L45
        L42:
            r0 = move-exception
            goto Lfd
        L45:
            if (r6 != 0) goto Le4
            P.o r5 = r1.f5527I     // Catch: java.lang.Throwable -> L42
            boolean r7 = r5.f5443E     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L55
            boolean r5 = r5.Y(r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L55
            r5 = 1
            goto L56
        L55:
            r5 = 0
        L56:
            if (r5 == 0) goto L5c
            P.M r0 = P.M.f5339t     // Catch: java.lang.Throwable -> L42
            monitor-exit(r4)
            return r0
        L5c:
            P.S r5 = r1.f5526H     // Catch: java.lang.Throwable -> L42
            r5.getClass()     // Catch: java.lang.Throwable -> L42
            P.r r5 = r1.f5529q     // Catch: java.lang.Throwable -> L42
            r5.getClass()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L71
            r.G r5 = r1.f5522D     // Catch: java.lang.Throwable -> L42
            P.S r7 = P.S.f5376u     // Catch: java.lang.Throwable -> L42
            r5.l(r0, r7)     // Catch: java.lang.Throwable -> L42
            goto Le4
        L71:
            boolean r5 = r3 instanceof P.C     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L7e
            r.G r5 = r1.f5522D     // Catch: java.lang.Throwable -> L42
            P.S r7 = P.S.f5376u     // Catch: java.lang.Throwable -> L42
            r5.l(r0, r7)     // Catch: java.lang.Throwable -> L42
            goto Le4
        L7e:
            r.G r5 = r1.f5522D     // Catch: java.lang.Throwable -> L42
            java.lang.Object r5 = r5.g(r0)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto Ldf
            boolean r7 = r5 instanceof r.C1549H     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto Lda
            r.H r5 = (r.C1549H) r5     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r7 = r5.f16139b     // Catch: java.lang.Throwable -> L42
            long[] r5 = r5.f16138a     // Catch: java.lang.Throwable -> L42
            int r9 = r5.length     // Catch: java.lang.Throwable -> L42
            int r9 = r9 + (-2)
            if (r9 < 0) goto Ldf
            r10 = 0
        L96:
            r11 = r5[r10]     // Catch: java.lang.Throwable -> L42
            long r13 = ~r11     // Catch: java.lang.Throwable -> L42
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto Ld5
            int r13 = r10 - r9
            int r13 = ~r13     // Catch: java.lang.Throwable -> L42
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        Lb0:
            if (r15 >= r13) goto Ld2
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto Lc9
            int r16 = r10 << 3
            int r16 = r16 + r15
            r8 = r7[r16]     // Catch: java.lang.Throwable -> L42
            r16 = r14
            P.S r14 = P.S.f5376u     // Catch: java.lang.Throwable -> L42
            if (r8 != r14) goto Lcb
            goto Le4
        Lc9:
            r16 = r14
        Lcb:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto Lb0
        Ld2:
            r8 = r14
            if (r13 != r8) goto Ldf
        Ld5:
            if (r10 == r9) goto Ldf
            int r10 = r10 + 1
            goto L96
        Lda:
            P.S r7 = P.S.f5376u     // Catch: java.lang.Throwable -> L42
            if (r5 != r7) goto Ldf
            goto Le4
        Ldf:
            r.G r5 = r1.f5522D     // Catch: java.lang.Throwable -> L42
            a.AbstractC0597a.e(r5, r0, r3)     // Catch: java.lang.Throwable -> L42
        Le4:
            monitor-exit(r4)
            if (r6 == 0) goto Lec
            P.M r0 = r6.s(r0, r2, r3)
            return r0
        Lec:
            P.r r0 = r1.f5529q
            r0.i(r1)
            P.o r0 = r1.f5527I
            boolean r0 = r0.f5443E
            if (r0 == 0) goto Lfa
            P.M r0 = P.M.f5338s
            return r0
        Lfa:
            P.M r0 = P.M.f5337r
            return r0
        Lfd:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0382u.s(P.o0, P.a, java.lang.Object):P.M");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(Object obj) {
        Object objG = this.f5535w.g(obj);
        if (objG == null) {
            return;
        }
        boolean z5 = objG instanceof C1549H;
        C1548G c1548g = this.f5521C;
        if (!z5) {
            C0372o0 c0372o0 = (C0372o0) objG;
            if (c0372o0.c(obj) == M.f5339t) {
                AbstractC0597a.e(c1548g, obj, c0372o0);
                return;
            }
            return;
        }
        C1549H c1549h = (C1549H) objG;
        Object[] objArr = c1549h.f16139b;
        long[] jArr = c1549h.f16138a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        C0372o0 c0372o02 = (C0372o0) objArr[(i << 3) + i8];
                        if (c0372o02.c(obj) == M.f5339t) {
                            AbstractC0597a.e(c1548g, obj, c0372o02);
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof R.h
            r.G r3 = r0.f5538z
            r.G r4 = r0.f5535w
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            R.h r1 = (R.h) r1
            r.H r1 = r1.f6689q
            java.lang.Object[] r2 = r1.f16139b
            long[] r1 = r1.f16138a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0382u.u(java.util.Set):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public final boolean v() {
        boolean zB;
        synchronized (this.f5532t) {
            try {
                m();
                try {
                    C1548G c1548g = this.f5522D;
                    this.f5522D = AbstractC0597a.q();
                    try {
                        this.f5526H.getClass();
                        this.f5529q.getClass();
                        zB = this.f5527I.B(c1548g);
                        if (!zB) {
                            n();
                        }
                    } catch (Exception e7) {
                        this.f5522D = c1548g;
                        throw e7;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f5533u.f16155q.g()) {
                            r.J j = this.f5533u;
                            new ArrayList();
                            if (!j.f16155q.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    I5.h hVar = new I5.h(j);
                                    while (((I5.j) hVar.f2435r).hasNext()) {
                                        w0 w0Var = (w0) ((I5.j) hVar.f2435r).next();
                                        hVar.remove();
                                        w0Var.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e8) {
                        a();
                        throw e8;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: java.util.Set[] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void w(R.h hVar) {
        Object obj;
        boolean z5;
        Object obj2;
        do {
            obj = this.f5531s.get();
            z5 = true;
            if (obj == null ? true : obj.equals(C0345b.f5386a)) {
                obj2 = hVar;
            } else if (obj instanceof Set) {
                obj2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f5531s).toString());
                }
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                kotlin.jvm.internal.m.e(setArr, "<this>");
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = hVar;
                obj2 = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f5531s;
            while (true) {
                if (atomicReference.compareAndSet(obj, obj2)) {
                    break;
                } else if (atomicReference.get() != obj) {
                    z5 = false;
                    break;
                }
            }
        } while (!z5);
        if (obj == null) {
            synchronized (this.f5532t) {
                n();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(Object obj) {
        C0372o0 c0372o0V;
        boolean z5;
        boolean z6;
        int i;
        int i7;
        C0371o c0371o = this.f5527I;
        if (c0371o.f5478z <= 0 && (c0372o0V = c0371o.v()) != null) {
            boolean z7 = true;
            int i8 = c0372o0V.f5479a | 1;
            c0372o0V.f5479a = i8;
            if ((i8 & 32) == 0) {
                C1543B c1543b = c0372o0V.f;
                if (c1543b == null) {
                    c1543b = new C1543B();
                    c0372o0V.f = c1543b;
                }
                int i9 = c0372o0V.f5483e;
                int iC = c1543b.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i7 = -1;
                } else {
                    i7 = c1543b.f16111c[iC];
                }
                c1543b.f16110b[iC] = obj;
                c1543b.f16111c[iC] = i9;
                if (i7 == c0372o0V.f5483e) {
                    return;
                }
            }
            if (obj instanceof a0.v) {
                ((a0.v) obj).c(1);
            }
            AbstractC0597a.e(this.f5535w, obj, c0372o0V);
            if (obj instanceof C) {
                C c7 = (C) obj;
                B bF = c7.f();
                C1548G c1548g = this.f5538z;
                AbstractC0597a.L(c1548g, obj);
                C1543B c1543b2 = bF.f5278e;
                Object[] objArr = c1543b2.f16110b;
                long[] jArr = c1543b2.f16109a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j & 255) < 128) {
                                    i = i11;
                                    a0.u uVar = (a0.u) objArr[(i10 << 3) + i13];
                                    if (uVar instanceof a0.v) {
                                        z6 = true;
                                        ((a0.v) uVar).c(1);
                                    } else {
                                        z6 = true;
                                    }
                                    AbstractC0597a.e(c1548g, uVar, obj);
                                } else {
                                    z6 = z7;
                                    i = i11;
                                }
                                j >>= i;
                                i13++;
                                z7 = z6;
                                i11 = i;
                            }
                            z5 = z7;
                            if (i12 != i11) {
                                break;
                            }
                        } else {
                            z5 = z7;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        z7 = z5;
                    }
                }
                Object obj2 = bF.f;
                C1548G c1548g2 = c0372o0V.f5484g;
                if (c1548g2 == null) {
                    c1548g2 = new C1548G();
                    c0372o0V.f5484g = c1548g2;
                }
                c1548g2.l(c7, obj2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f5532t
            monitor-enter(r0)
            r14.t(r15)     // Catch: java.lang.Throwable -> L4f
            r.G r1 = r14.f5538z     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof r.C1549H     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            r.H r15 = (r.C1549H) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f16139b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f16138a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            P.C r10 = (P.C) r10     // Catch: java.lang.Throwable -> L4f
            r14.t(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            P.C r15 = (P.C) r15     // Catch: java.lang.Throwable -> L4f
            r14.t(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0382u.y(java.lang.Object):void");
    }
}
