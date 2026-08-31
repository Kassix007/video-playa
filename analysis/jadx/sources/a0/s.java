package a0;

import B0.C0029a;
import P.C;
import P.C0345b;
import P.C0369n;
import a.AbstractC0597a;
import java.util.HashMap;
import r.C1543B;
import r.C1548G;
import r.C1549H;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B5.c f8691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1543B f8693c;
    public int j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8694d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1548G f8695e = AbstractC0597a.q();
    public final C1548G f = new C1548G();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1549H f8696g = new C1549H();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final R.e f8697h = new R.e(new C[16]);
    public final C0369n i = new C0369n(1, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1548G f8698k = AbstractC0597a.q();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f8699l = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(B5.c cVar) {
        this.f8691a = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Object obj, C0029a c0029a, B5.a aVar) {
        boolean z5;
        int i;
        int i7;
        Object obj2 = this.f8692b;
        C1543B c1543b = this.f8693c;
        int i8 = this.f8694d;
        this.f8692b = obj;
        this.f8693c = (C1543B) this.f.g(obj);
        if (this.f8694d == -1) {
            this.f8694d = Long.hashCode(n.k().g());
        }
        C0369n c0369n = this.i;
        R.e eVarL = C0345b.l();
        boolean z6 = true;
        try {
            eVarL.c(c0369n);
            r.e(c0029a, aVar);
            eVarL.m(eVarL.f6678s - 1);
            Object obj3 = this.f8692b;
            kotlin.jvm.internal.m.b(obj3);
            int i9 = this.f8694d;
            C1543B c1543b2 = this.f8693c;
            if (c1543b2 != null) {
                long[] jArr = c1543b2.f16109a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8;
                            int i12 = 8 - ((~(i10 - length)) >>> 31);
                            z5 = z6;
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j & 255) < 128) {
                                    int i14 = (i10 << 3) + i13;
                                    i7 = i11;
                                    Object obj4 = c1543b2.f16110b[i14];
                                    i = i13;
                                    boolean z7 = c1543b2.f16111c[i14] != i9 ? z5 : false;
                                    if (z7) {
                                        d(obj3, obj4);
                                    }
                                    if (z7) {
                                        c1543b2.f(i14);
                                    }
                                } else {
                                    i = i13;
                                    i7 = i11;
                                }
                                j >>= i7;
                                i13 = i + 1;
                                i11 = i7;
                            }
                            if (i12 != i11) {
                                break;
                            }
                        } else {
                            z5 = z6;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        z6 = z5;
                    }
                }
            }
            this.f8692b = obj2;
            this.f8693c = c1543b;
            this.f8694d = i8;
        } catch (Throwable th) {
            eVarL.m(eVarL.f6678s - 1);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x027e A[PHI: r13
  0x027e: PHI (r13v32 boolean) = (r13v31 boolean), (r13v33 boolean) binds: [B:109:0x0256, B:117:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04a7 A[PHI: r13
  0x04a7: PHI (r13v11 boolean) = (r13v10 boolean), (r13v12 boolean) binds: [B:210:0x047f, B:218:0x04a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0506 A[EDGE_INSN: B:241:0x0506->B:321:0x050f BREAK  A[LOOP:18: B:231:0x04d4->B:242:0x0508], PHI: r13
  0x0506: PHI (r13v5 boolean) = (r13v4 boolean), (r13v6 boolean) binds: [B:232:0x04de, B:240:0x0504] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0136 A[PHI: r33
  0x0136: PHI (r33v17 boolean) = (r33v16 boolean), (r33v18 boolean) binds: [B:47:0x010a, B:56:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f A[PHI: r13
  0x020f: PHI (r13v42 boolean) = (r13v41 boolean), (r13v43 boolean) binds: [B:85:0x01e7, B:93:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.Set r46) {
        /*
            r45 = this;
            r0 = r45
            r1 = r46
            P.S r2 = P.S.f5377v
            boolean r3 = r1 instanceof R.h
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"
            R.e r5 = r0.f8697h
            r11 = 2
            r16 = 0
            r17 = 128(0x80, double:6.32E-322)
            r.G r6 = r0.f8698k
            java.util.HashMap r7 = r0.f8699l
            r19 = 255(0xff, double:1.26E-321)
            r.G r8 = r0.f8695e
            r.H r9 = r0.f8696g
            if (r3 == 0) goto L2df
            R.h r1 = (R.h) r1
            r.H r1 = r1.f6689q
            java.lang.Object[] r3 = r1.f16139b
            long[] r1 = r1.f16138a
            r21 = 7
            int r10 = r1.length
            int r10 = r10 - r11
            if (r10 < 0) goto L2d6
            r12 = r16
            r13 = r12
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L33:
            r24 = 8
            r14 = r1[r12]
            r46 = r12
            long r11 = ~r14
            long r11 = r11 << r21
            long r11 = r11 & r14
            long r11 = r11 & r22
            int r11 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r11 == 0) goto L2c0
            int r12 = r46 - r10
            int r11 = ~r12
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r16
        L4c:
            if (r12 >= r11) goto L2ae
            long r27 = r14 & r19
            int r27 = (r27 > r17 ? 1 : (r27 == r17 ? 0 : -1))
            if (r27 >= 0) goto L28a
            int r27 = r46 << 3
            int r27 = r27 + r12
            r28 = r1
            r1 = r3[r27]
            r27 = r2
            boolean r2 = r1 instanceof a0.v
            if (r2 == 0) goto L70
            r2 = r1
            a0.v r2 = (a0.v) r2
            r29 = r3
            r3 = 2
            boolean r2 = r2.b(r3)
            if (r2 != 0) goto L72
            goto L290
        L70:
            r29 = r3
        L72:
            boolean r2 = r6.c(r1)
            if (r2 == 0) goto L22a
            java.lang.Object r2 = r6.g(r1)
            if (r2 == 0) goto L21d
            boolean r3 = r2 instanceof r.C1549H
            if (r3 == 0) goto L1a2
            r.H r2 = (r.C1549H) r2
            java.lang.Object[] r3 = r2.f16139b
            long[] r2 = r2.f16138a
            r30 = r3
            int r3 = r2.length
            r26 = 2
            int r3 = r3 + (-2)
            if (r3 < 0) goto L21d
            r31 = r2
            r32 = r12
            r33 = r13
            r2 = r16
        L99:
            r12 = r31[r2]
            r34 = r14
            long r14 = ~r12
            long r14 = r14 << r21
            long r14 = r14 & r12
            long r14 = r14 & r22
            int r14 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r14 == 0) goto L186
            int r14 = r2 - r3
            int r14 = ~r14
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r15 = r16
        Lb0:
            if (r15 >= r14) goto L17b
            long r36 = r12 & r19
            int r36 = (r36 > r17 ? 1 : (r36 == r17 ? 0 : -1))
            if (r36 >= 0) goto L160
            int r36 = r2 << 3
            int r36 = r36 + r15
            r36 = r30[r36]
            r37 = r12
            r12 = r36
            P.C r12 = (P.C) r12
            kotlin.jvm.internal.m.c(r12, r4)
            java.lang.Object r13 = r7.get(r12)
            r36 = r15
            P.I0 r15 = r12.f5284s
            if (r15 != 0) goto Ld3
            r15 = r27
        Ld3:
            P.B r0 = r12.f()
            java.lang.Object r0 = r0.f
            boolean r0 = r15.a(r0, r13)
            if (r0 != 0) goto L154
            java.lang.Object r0 = r8.g(r12)
            if (r0 == 0) goto L141
            boolean r12 = r0 instanceof r.C1549H
            if (r12 == 0) goto L148
            r.H r0 = (r.C1549H) r0
            java.lang.Object[] r12 = r0.f16139b
            long[] r0 = r0.f16138a
            int r13 = r0.length
            r26 = 2
            int r13 = r13 + (-2)
            if (r13 < 0) goto L141
            r39 = r10
            r40 = r11
            r15 = r16
        Lfc:
            r10 = r0[r15]
            r42 = r0
            r41 = r1
            long r0 = ~r10
            long r0 = r0 << r21
            long r0 = r0 & r10
            long r0 = r0 & r22
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 == 0) goto L136
            int r0 = r15 - r13
            int r0 = ~r0
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r1 = r16
        L115:
            if (r1 >= r0) goto L132
            long r43 = r10 & r19
            int r43 = (r43 > r17 ? 1 : (r43 == r17 ? 0 : -1))
            if (r43 >= 0) goto L12b
            int r33 = r15 << 3
            int r33 = r33 + r1
            r43 = r1
            r1 = r12[r33]
            r9.a(r1)
            r33 = 1
            goto L12d
        L12b:
            r43 = r1
        L12d:
            long r10 = r10 >> r24
            int r1 = r43 + 1
            goto L115
        L132:
            r1 = r24
            if (r0 != r1) goto L15d
        L136:
            if (r15 == r13) goto L15d
            int r15 = r15 + 1
            r1 = r41
            r0 = r42
            r24 = 8
            goto Lfc
        L141:
            r41 = r1
            r39 = r10
            r40 = r11
            goto L15d
        L148:
            r41 = r1
            r39 = r10
            r40 = r11
            r9.a(r0)
            r33 = 1
            goto L15d
        L154:
            r41 = r1
            r39 = r10
            r40 = r11
            r5.c(r12)
        L15d:
            r1 = 8
            goto L16b
        L160:
            r41 = r1
            r39 = r10
            r40 = r11
            r37 = r12
            r36 = r15
            goto L15d
        L16b:
            long r12 = r37 >> r1
            int r15 = r36 + 1
            r0 = r45
            r24 = r1
            r10 = r39
            r11 = r40
            r1 = r41
            goto Lb0
        L17b:
            r41 = r1
            r39 = r10
            r40 = r11
            r1 = r24
            if (r14 != r1) goto L19e
            goto L18c
        L186:
            r41 = r1
            r39 = r10
            r40 = r11
        L18c:
            if (r2 == r3) goto L19e
            int r2 = r2 + 1
            r24 = 8
            r0 = r45
            r14 = r34
            r10 = r39
            r11 = r40
            r1 = r41
            goto L99
        L19e:
            r13 = r33
            goto L227
        L1a2:
            r41 = r1
            r39 = r10
            r40 = r11
            r32 = r12
            r34 = r14
            P.C r2 = (P.C) r2
            java.lang.Object r0 = r7.get(r2)
            P.I0 r1 = r2.f5284s
            if (r1 != 0) goto L1b8
            r1 = r27
        L1b8:
            P.B r3 = r2.f()
            java.lang.Object r3 = r3.f
            boolean r0 = r1.a(r3, r0)
            if (r0 != 0) goto L219
            java.lang.Object r0 = r8.g(r2)
            if (r0 == 0) goto L227
            boolean r1 = r0 instanceof r.C1549H
            if (r1 == 0) goto L214
            r.H r0 = (r.C1549H) r0
            java.lang.Object[] r1 = r0.f16139b
            long[] r0 = r0.f16138a
            int r2 = r0.length
            r26 = 2
            int r2 = r2 + (-2)
            if (r2 < 0) goto L227
            r3 = r16
        L1dd:
            r10 = r0[r3]
            long r14 = ~r10
            long r14 = r14 << r21
            long r14 = r14 & r10
            long r14 = r14 & r22
            int r12 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r12 == 0) goto L20f
            int r12 = r3 - r2
            int r12 = ~r12
            int r12 = r12 >>> 31
            r24 = 8
            int r14 = 8 - r12
            r12 = r16
        L1f4:
            if (r12 >= r14) goto L20b
            long r30 = r10 & r19
            int r15 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            if (r15 >= 0) goto L205
            int r13 = r3 << 3
            int r13 = r13 + r12
            r13 = r1[r13]
            r9.a(r13)
            r13 = 1
        L205:
            r15 = 8
            long r10 = r10 >> r15
            int r12 = r12 + 1
            goto L1f4
        L20b:
            r15 = 8
            if (r14 != r15) goto L227
        L20f:
            if (r3 == r2) goto L227
            int r3 = r3 + 1
            goto L1dd
        L214:
            r9.a(r0)
            r13 = 1
            goto L227
        L219:
            r5.c(r2)
            goto L227
        L21d:
            r41 = r1
            r39 = r10
            r40 = r11
            r32 = r12
            r34 = r14
        L227:
            r0 = r41
            goto L233
        L22a:
            r39 = r10
            r40 = r11
            r32 = r12
            r34 = r14
            r0 = r1
        L233:
            java.lang.Object r0 = r8.g(r0)
            if (r0 == 0) goto L287
            boolean r1 = r0 instanceof r.C1549H
            if (r1 == 0) goto L283
            r.H r0 = (r.C1549H) r0
            java.lang.Object[] r1 = r0.f16139b
            long[] r0 = r0.f16138a
            int r2 = r0.length
            r26 = 2
            int r2 = r2 + (-2)
            if (r2 < 0) goto L287
            r3 = r16
        L24c:
            r10 = r0[r3]
            long r14 = ~r10
            long r14 = r14 << r21
            long r14 = r14 & r10
            long r14 = r14 & r22
            int r12 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r12 == 0) goto L27e
            int r12 = r3 - r2
            int r12 = ~r12
            int r12 = r12 >>> 31
            r24 = 8
            int r14 = 8 - r12
            r12 = r16
        L263:
            if (r12 >= r14) goto L27a
            long r30 = r10 & r19
            int r15 = (r30 > r17 ? 1 : (r30 == r17 ? 0 : -1))
            if (r15 >= 0) goto L274
            int r13 = r3 << 3
            int r13 = r13 + r12
            r13 = r1[r13]
            r9.a(r13)
            r13 = 1
        L274:
            r15 = 8
            long r10 = r10 >> r15
            int r12 = r12 + 1
            goto L263
        L27a:
            r15 = 8
            if (r14 != r15) goto L287
        L27e:
            if (r3 == r2) goto L287
            int r3 = r3 + 1
            goto L24c
        L283:
            r9.a(r0)
            r13 = 1
        L287:
            r15 = 8
            goto L299
        L28a:
            r28 = r1
            r27 = r2
            r29 = r3
        L290:
            r39 = r10
            r40 = r11
            r32 = r12
            r34 = r14
            goto L287
        L299:
            long r0 = r34 >> r15
            int r12 = r32 + 1
            r24 = r15
            r2 = r27
            r3 = r29
            r10 = r39
            r11 = r40
            r14 = r0
            r1 = r28
            r0 = r45
            goto L4c
        L2ae:
            r28 = r1
            r27 = r2
            r29 = r3
            r39 = r10
            r14 = r11
            r15 = r24
            if (r14 != r15) goto L517
            r10 = r39
        L2bd:
            r0 = r46
            goto L2c7
        L2c0:
            r28 = r1
            r27 = r2
            r29 = r3
            goto L2bd
        L2c7:
            if (r0 == r10) goto L517
            int r12 = r0 + 1
            r2 = r27
            r1 = r28
            r3 = r29
            r11 = 2
            r0 = r45
            goto L33
        L2d6:
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = r16
            goto L517
        L2df:
            r27 = r2
            r21 = 7
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r13 = r16
        L2f1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L517
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof a0.v
            if (r2 == 0) goto L311
            r2 = r1
            a0.v r2 = (a0.v) r2
            r3 = 2
            boolean r2 = r2.b(r3)
            if (r2 != 0) goto L311
            r46 = r0
            r30 = r4
            r31 = r6
            goto L50f
        L311:
            boolean r2 = r6.c(r1)
            if (r2 == 0) goto L4b5
            java.lang.Object r2 = r6.g(r1)
            if (r2 == 0) goto L4b5
            boolean r3 = r2 instanceof r.C1549H
            if (r3 == 0) goto L43e
            r.H r2 = (r.C1549H) r2
            java.lang.Object[] r3 = r2.f16139b
            long[] r2 = r2.f16138a
            int r10 = r2.length
            r26 = 2
            int r10 = r10 + (-2)
            if (r10 < 0) goto L4b5
            r11 = r16
        L330:
            r14 = r2[r11]
            r28 = r2
            r12 = r3
            long r2 = ~r14
            long r2 = r2 << r21
            long r2 = r2 & r14
            long r2 = r2 & r22
            int r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r2 == 0) goto L426
            int r2 = r11 - r10
            int r2 = ~r2
            int r2 = r2 >>> 31
            r24 = 8
            int r2 = 8 - r2
            r3 = r16
        L34a:
            if (r3 >= r2) goto L419
            long r29 = r14 & r19
            int r29 = (r29 > r17 ? 1 : (r29 == r17 ? 0 : -1))
            if (r29 >= 0) goto L3fc
            int r29 = r11 << 3
            int r29 = r29 + r3
            r29 = r12[r29]
            r46 = r0
            r0 = r29
            P.C r0 = (P.C) r0
            kotlin.jvm.internal.m.c(r0, r4)
            r29 = r3
            java.lang.Object r3 = r7.get(r0)
            r30 = r4
            P.I0 r4 = r0.f5284s
            if (r4 != 0) goto L36f
            r4 = r27
        L36f:
            r31 = r6
            P.B r6 = r0.f()
            java.lang.Object r6 = r6.f
            boolean r3 = r4.a(r6, r3)
            if (r3 != 0) goto L3f2
            java.lang.Object r0 = r8.g(r0)
            if (r0 == 0) goto L404
            boolean r3 = r0 instanceof r.C1549H
            if (r3 == 0) goto L3e9
            r.H r0 = (r.C1549H) r0
            java.lang.Object[] r3 = r0.f16139b
            long[] r0 = r0.f16138a
            int r4 = r0.length
            r26 = 2
            int r4 = r4 + (-2)
            if (r4 < 0) goto L404
            r32 = r12
            r33 = r13
            r6 = r16
        L39a:
            r12 = r0[r6]
            r34 = r14
            long r14 = ~r12
            long r14 = r14 << r21
            long r14 = r14 & r12
            long r14 = r14 & r22
            int r14 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r14 == 0) goto L3db
            int r14 = r6 - r4
            int r14 = ~r14
            int r14 = r14 >>> 31
            r24 = 8
            int r14 = 8 - r14
            r15 = r16
        L3b3:
            if (r15 >= r14) goto L3d4
            long r36 = r12 & r19
            int r36 = (r36 > r17 ? 1 : (r36 == r17 ? 0 : -1))
            if (r36 >= 0) goto L3cb
            int r33 = r6 << 3
            int r33 = r33 + r15
            r36 = r0
            r0 = r3[r33]
            r9.a(r0)
            r33 = 1
        L3c8:
            r0 = 8
            goto L3ce
        L3cb:
            r36 = r0
            goto L3c8
        L3ce:
            long r12 = r12 >> r0
            int r15 = r15 + 1
            r0 = r36
            goto L3b3
        L3d4:
            r36 = r0
            r0 = 8
            if (r14 != r0) goto L3e6
            goto L3dd
        L3db:
            r36 = r0
        L3dd:
            if (r6 == r4) goto L3e6
            int r6 = r6 + 1
            r14 = r34
            r0 = r36
            goto L39a
        L3e6:
            r13 = r33
            goto L3f9
        L3e9:
            r32 = r12
            r34 = r14
            r9.a(r0)
            r13 = 1
            goto L3f9
        L3f2:
            r32 = r12
            r34 = r14
            r5.c(r0)
        L3f9:
            r15 = 8
            goto L409
        L3fc:
            r46 = r0
            r29 = r3
            r30 = r4
            r31 = r6
        L404:
            r32 = r12
            r34 = r14
            goto L3f9
        L409:
            long r3 = r34 >> r15
            int r0 = r29 + 1
            r14 = r3
            r4 = r30
            r6 = r31
            r12 = r32
            r3 = r0
            r0 = r46
            goto L34a
        L419:
            r46 = r0
            r30 = r4
            r31 = r6
            r32 = r12
            r15 = 8
            if (r2 != r15) goto L4bb
            goto L42e
        L426:
            r46 = r0
            r30 = r4
            r31 = r6
            r32 = r12
        L42e:
            if (r11 == r10) goto L4bb
            int r11 = r11 + 1
            r0 = r46
            r2 = r28
            r4 = r30
            r6 = r31
            r3 = r32
            goto L330
        L43e:
            r46 = r0
            r30 = r4
            r31 = r6
            P.C r2 = (P.C) r2
            java.lang.Object r0 = r7.get(r2)
            P.I0 r3 = r2.f5284s
            if (r3 != 0) goto L450
            r3 = r27
        L450:
            P.B r4 = r2.f()
            java.lang.Object r4 = r4.f
            boolean r0 = r3.a(r4, r0)
            if (r0 != 0) goto L4b1
            java.lang.Object r0 = r8.g(r2)
            if (r0 == 0) goto L4bb
            boolean r2 = r0 instanceof r.C1549H
            if (r2 == 0) goto L4ac
            r.H r0 = (r.C1549H) r0
            java.lang.Object[] r2 = r0.f16139b
            long[] r0 = r0.f16138a
            int r3 = r0.length
            r26 = 2
            int r3 = r3 + (-2)
            if (r3 < 0) goto L4bb
            r4 = r16
        L475:
            r10 = r0[r4]
            long r14 = ~r10
            long r14 = r14 << r21
            long r14 = r14 & r10
            long r14 = r14 & r22
            int r6 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r6 == 0) goto L4a7
            int r6 = r4 - r3
            int r6 = ~r6
            int r6 = r6 >>> 31
            r24 = 8
            int r14 = 8 - r6
            r6 = r16
        L48c:
            if (r6 >= r14) goto L4a3
            long r28 = r10 & r19
            int r12 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r12 >= 0) goto L49d
            int r12 = r4 << 3
            int r12 = r12 + r6
            r12 = r2[r12]
            r9.a(r12)
            r13 = 1
        L49d:
            r15 = 8
            long r10 = r10 >> r15
            int r6 = r6 + 1
            goto L48c
        L4a3:
            r15 = 8
            if (r14 != r15) goto L4bb
        L4a7:
            if (r4 == r3) goto L4bb
            int r4 = r4 + 1
            goto L475
        L4ac:
            r9.a(r0)
            r13 = 1
            goto L4bb
        L4b1:
            r5.c(r2)
            goto L4bb
        L4b5:
            r46 = r0
            r30 = r4
            r31 = r6
        L4bb:
            java.lang.Object r0 = r8.g(r1)
            if (r0 == 0) goto L50f
            boolean r1 = r0 instanceof r.C1549H
            if (r1 == 0) goto L50b
            r.H r0 = (r.C1549H) r0
            java.lang.Object[] r1 = r0.f16139b
            long[] r0 = r0.f16138a
            int r2 = r0.length
            r26 = 2
            int r2 = r2 + (-2)
            if (r2 < 0) goto L50f
            r3 = r16
        L4d4:
            r10 = r0[r3]
            long r14 = ~r10
            long r14 = r14 << r21
            long r14 = r14 & r10
            long r14 = r14 & r22
            int r4 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r4 == 0) goto L506
            int r4 = r3 - r2
            int r4 = ~r4
            int r4 = r4 >>> 31
            r24 = 8
            int r14 = 8 - r4
            r4 = r16
        L4eb:
            if (r4 >= r14) goto L502
            long r28 = r10 & r19
            int r6 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r6 >= 0) goto L4fc
            int r6 = r3 << 3
            int r6 = r6 + r4
            r6 = r1[r6]
            r9.a(r6)
            r13 = 1
        L4fc:
            r15 = 8
            long r10 = r10 >> r15
            int r4 = r4 + 1
            goto L4eb
        L502:
            r15 = 8
            if (r14 != r15) goto L50f
        L506:
            if (r3 == r2) goto L50f
            int r3 = r3 + 1
            goto L4d4
        L50b:
            r9.a(r0)
            r13 = 1
        L50f:
            r0 = r46
            r4 = r30
            r6 = r31
            goto L2f1
        L517:
            int r0 = r5.f6678s
            if (r0 == 0) goto L5f7
            java.lang.Object[] r1 = r5.f6676q
            r2 = r16
        L51f:
            if (r2 >= r0) goto L5f1
            r3 = r1[r2]
            P.C r3 = (P.C) r3
            a0.h r4 = a0.n.k()
            long r6 = r4.g()
            int r4 = java.lang.Long.hashCode(r6)
            java.lang.Object r6 = r8.g(r3)
            if (r6 == 0) goto L5dd
            boolean r7 = r6 instanceof r.C1549H
            r9 = r45
            r.G r10 = r9.f
            if (r7 == 0) goto L5bf
            r.H r6 = (r.C1549H) r6
            java.lang.Object[] r7 = r6.f16139b
            long[] r6 = r6.f16138a
            int r11 = r6.length
            r26 = 2
            int r11 = r11 + (-2)
            if (r11 < 0) goto L5b6
            r12 = r16
        L54e:
            r14 = r6[r12]
            r25 = r0
            r27 = r1
            long r0 = ~r14
            long r0 = r0 << r21
            long r0 = r0 & r14
            long r0 = r0 & r22
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 == 0) goto L5a7
            int r0 = r12 - r11
            int r0 = ~r0
            int r0 = r0 >>> 31
            r24 = 8
            int r0 = 8 - r0
            r1 = r16
        L569:
            if (r1 >= r0) goto L5a0
            long r28 = r14 & r19
            int r28 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r28 >= 0) goto L594
            int r28 = r12 << 3
            int r28 = r28 + r1
            r29 = r1
            r1 = r7[r28]
            java.lang.Object r28 = r10.g(r1)
            r.B r28 = (r.C1543B) r28
            r30 = r2
            if (r28 != 0) goto L58c
            r.B r2 = new r.B
            r2.<init>()
            r10.l(r1, r2)
            goto L58e
        L58c:
            r2 = r28
        L58e:
            r9.c(r3, r4, r1, r2)
        L591:
            r1 = 8
            goto L599
        L594:
            r29 = r1
            r30 = r2
            goto L591
        L599:
            long r14 = r14 >> r1
            int r2 = r29 + 1
            r1 = r2
            r2 = r30
            goto L569
        L5a0:
            r30 = r2
            r1 = 8
            if (r0 != r1) goto L5e9
            goto L5ab
        L5a7:
            r30 = r2
            r1 = 8
        L5ab:
            if (r12 == r11) goto L5e9
            int r12 = r12 + 1
            r0 = r25
            r1 = r27
            r2 = r30
            goto L54e
        L5b6:
            r25 = r0
            r27 = r1
            r30 = r2
            r1 = 8
            goto L5e9
        L5bf:
            r25 = r0
            r27 = r1
            r30 = r2
            r1 = 8
            r26 = 2
            java.lang.Object r0 = r10.g(r6)
            r.B r0 = (r.C1543B) r0
            if (r0 != 0) goto L5d9
            r.B r0 = new r.B
            r0.<init>()
            r10.l(r6, r0)
        L5d9:
            r9.c(r3, r4, r6, r0)
            goto L5e9
        L5dd:
            r25 = r0
            r27 = r1
            r30 = r2
            r1 = 8
            r26 = 2
            r9 = r45
        L5e9:
            int r2 = r30 + 1
            r0 = r25
            r1 = r27
            goto L51f
        L5f1:
            r9 = r45
            r5.i()
            return r13
        L5f7:
            r9 = r45
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.s.b(java.util.Set):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r21, int r22, java.lang.Object r23, r.C1543B r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.j
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f16111c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f16110b
            r7[r4] = r1
            int[] r3 = r3.f16111c
            r3[r4] = r2
            boolean r3 = r1 instanceof P.C
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            P.C r2 = (P.C) r2
            P.B r2 = r2.f()
            java.util.HashMap r3 = r0.f8699l
            java.lang.Object r7 = r2.f
            r3.put(r1, r7)
            r.B r2 = r2.f5278e
            r.G r3 = r0.f8698k
            a.AbstractC0597a.L(r3, r1)
            java.lang.Object[] r7 = r2.f16110b
            long[] r2 = r2.f16109a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            a0.u r9 = (a0.u) r9
            boolean r5 = r9 instanceof a0.v
            if (r5 == 0) goto L82
            r5 = r9
            a0.v r5 = (a0.v) r5
            r5.c(r4)
        L82:
            a.AbstractC0597a.e(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof a0.v
            if (r2 == 0) goto L9d
            r2 = r1
            a0.v r2 = (a0.v) r2
            r2.c(r4)
        L9d:
            r.G r2 = r0.f8695e
            r3 = r23
            a.AbstractC0597a.e(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.s.c(java.lang.Object, int, java.lang.Object, r.B):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Object obj, Object obj2) {
        C1548G c1548g = this.f8695e;
        AbstractC0597a.K(c1548g, obj2, obj);
        if (!(obj2 instanceof C) || c1548g.c(obj2)) {
            return;
        }
        AbstractC0597a.L(this.f8698k, obj2);
        this.f8699l.remove(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r33 = this;
            r0 = r33
            r.G r1 = r0.f
            long[] r2 = r1.f16133a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto Le0
            r5 = 0
        Lc:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto Ld6
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r13 = 0
        L26:
            if (r13 >= r8) goto Ld0
            r14 = 255(0xff, double:1.26E-321)
            long r16 = r6 & r14
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto Lb8
            int r16 = r5 << 3
            int r4 = r16 + r13
            r16 = r10
            java.lang.Object[] r10 = r1.f16134b
            r10 = r10[r4]
            r20 = r11
            java.lang.Object[] r11 = r1.f16135c
            r11 = r11[r4]
            r.B r11 = (r.C1543B) r11
            java.lang.String r12 = "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope"
            kotlin.jvm.internal.m.c(r10, r12)
            r12 = r10
            B0.u0 r12 = (B0.u0) r12
            boolean r12 = r12.x()
            if (r12 != 0) goto Laa
            r22 = r14
            java.lang.Object[] r14 = r11.f16110b
            int[] r15 = r11.f16111c
            long[] r11 = r11.f16109a
            r24 = r9
            int r9 = r11.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Laa
            r25 = r2
            r26 = r6
            r2 = 0
        L66:
            r6 = r11[r2]
            r29 = r11
            r28 = r12
            long r11 = ~r6
            long r11 = r11 << r16
            long r11 = r11 & r6
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L9f
            int r11 = r2 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L7e:
            if (r12 >= r11) goto L9b
            long r30 = r6 & r22
            int r30 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r30 >= 0) goto L94
            int r30 = r2 << 3
            int r30 = r30 + r12
            r31 = r6
            r6 = r14[r30]
            r7 = r15[r30]
            r0.d(r10, r6)
            goto L96
        L94:
            r31 = r6
        L96:
            long r6 = r31 >> r24
            int r12 = r12 + 1
            goto L7e
        L9b:
            r6 = r24
            if (r11 != r6) goto Lb0
        L9f:
            if (r2 == r9) goto Lb0
            int r2 = r2 + 1
            r12 = r28
            r11 = r29
            r24 = 8
            goto L66
        Laa:
            r25 = r2
            r26 = r6
            r28 = r12
        Lb0:
            if (r28 != 0) goto Lb5
            r1.k(r4)
        Lb5:
            r6 = 8
            goto Lc1
        Lb8:
            r25 = r2
            r26 = r6
            r16 = r10
            r20 = r11
            r6 = r9
        Lc1:
            long r9 = r26 >> r6
            int r13 = r13 + 1
            r11 = r9
            r9 = r6
            r6 = r11
            r10 = r16
            r11 = r20
            r2 = r25
            goto L26
        Ld0:
            r25 = r2
            r6 = r9
            if (r8 != r6) goto Le0
            goto Ld8
        Ld6:
            r25 = r2
        Ld8:
            if (r5 == r3) goto Le0
            int r5 = r5 + 1
            r2 = r25
            goto Lc
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.s.e():void");
    }
}
