package P;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import m5.C1386y;
import q5.InterfaceC1524c;
import r.C1549H;
import r5.EnumC1580a;

/* JADX INFO: renamed from: P.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0383u0 extends s5.i implements B5.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C0385v0 f5539A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f5540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f5541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f5542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1549H f5543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1549H f5544u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1549H f5545v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f5546w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1549H f5547x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5548y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ T f5549z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383u0(C0385v0 c0385v0, InterfaceC1524c interfaceC1524c) {
        super(3, interfaceC1524c);
        this.f5539A = c0385v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(P.C0385v0 r22, java.util.List r23, java.util.List r24, java.util.List r25, r.C1549H r26, r.C1549H r27, r.C1549H r28, r.C1549H r29) {
        /*
            r0 = r22
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r29
            java.lang.Object r5 = r0.f5555b
            monitor-enter(r5)
            r23.clear()     // Catch: java.lang.Throwable -> L2c
            r24.clear()     // Catch: java.lang.Throwable -> L2c
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L2c
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L2c
            r8 = 0
        L1b:
            if (r8 >= r6) goto L2f
            java.lang.Object r9 = r1.get(r8)     // Catch: java.lang.Throwable -> L2c
            P.u r9 = (P.C0382u) r9     // Catch: java.lang.Throwable -> L2c
            r9.a()     // Catch: java.lang.Throwable -> L2c
            r0.B(r9)     // Catch: java.lang.Throwable -> L2c
            int r8 = r8 + 1
            goto L1b
        L2c:
            r0 = move-exception
            goto L108
        L2f:
            r1.clear()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r1 = r2.f16139b     // Catch: java.lang.Throwable -> L2c
            long[] r6 = r2.f16138a     // Catch: java.lang.Throwable -> L2c
            int r8 = r6.length     // Catch: java.lang.Throwable -> L2c
            int r8 = r8 + (-2)
            r7 = 8
            r24 = 128(0x80, double:6.32E-322)
            if (r8 < 0) goto L7b
            r9 = 0
            r16 = 255(0xff, double:1.26E-321)
        L42:
            r11 = r6[r9]     // Catch: java.lang.Throwable -> L2c
            r10 = 7
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = ~r11     // Catch: java.lang.Throwable -> L2c
            long r13 = r13 << r10
            long r13 = r13 & r11
            long r13 = r13 & r18
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 == 0) goto L76
            int r13 = r9 - r8
            int r13 = ~r13     // Catch: java.lang.Throwable -> L2c
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        L5b:
            if (r14 >= r13) goto L74
            long r20 = r11 & r16
            int r15 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r15 >= 0) goto L70
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r1[r15]     // Catch: java.lang.Throwable -> L2c
            P.u r15 = (P.C0382u) r15     // Catch: java.lang.Throwable -> L2c
            r15.a()     // Catch: java.lang.Throwable -> L2c
            r0.B(r15)     // Catch: java.lang.Throwable -> L2c
        L70:
            long r11 = r11 >> r7
            int r14 = r14 + 1
            goto L5b
        L74:
            if (r13 != r7) goto L83
        L76:
            if (r9 == r8) goto L83
            int r9 = r9 + 1
            goto L42
        L7b:
            r10 = 7
            r16 = 255(0xff, double:1.26E-321)
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L83:
            r2.b()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r1 = r3.f16139b     // Catch: java.lang.Throwable -> L2c
            long[] r2 = r3.f16138a     // Catch: java.lang.Throwable -> L2c
            int r6 = r2.length     // Catch: java.lang.Throwable -> L2c
            int r6 = r6 + (-2)
            if (r6 < 0) goto Lc0
            r8 = 0
        L90:
            r11 = r2[r8]     // Catch: java.lang.Throwable -> L2c
            long r13 = ~r11     // Catch: java.lang.Throwable -> L2c
            long r13 = r13 << r10
            long r13 = r13 & r11
            long r13 = r13 & r18
            int r9 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r9 == 0) goto Lbb
            int r9 = r8 - r6
            int r9 = ~r9     // Catch: java.lang.Throwable -> L2c
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r13 = 0
        La3:
            if (r13 >= r9) goto Lb9
            long r14 = r11 & r16
            int r14 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r14 >= 0) goto Lb5
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r1[r14]     // Catch: java.lang.Throwable -> L2c
            P.u r14 = (P.C0382u) r14     // Catch: java.lang.Throwable -> L2c
            r14.g()     // Catch: java.lang.Throwable -> L2c
        Lb5:
            long r11 = r11 >> r7
            int r13 = r13 + 1
            goto La3
        Lb9:
            if (r9 != r7) goto Lc0
        Lbb:
            if (r8 == r6) goto Lc0
            int r8 = r8 + 1
            goto L90
        Lc0:
            r3.b()     // Catch: java.lang.Throwable -> L2c
            r28.b()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r1 = r4.f16139b     // Catch: java.lang.Throwable -> L2c
            long[] r2 = r4.f16138a     // Catch: java.lang.Throwable -> L2c
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2c
            int r3 = r3 + (-2)
            if (r3 < 0) goto L103
            r6 = 0
        Ld0:
            r8 = r2[r6]     // Catch: java.lang.Throwable -> L2c
            long r11 = ~r8     // Catch: java.lang.Throwable -> L2c
            long r11 = r11 << r10
            long r11 = r11 & r8
            long r11 = r11 & r18
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 == 0) goto Lfe
            int r11 = r6 - r3
            int r11 = ~r11     // Catch: java.lang.Throwable -> L2c
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        Le3:
            if (r12 >= r11) goto Lfc
            long r13 = r8 & r16
            int r13 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r13 >= 0) goto Lf8
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r1[r13]     // Catch: java.lang.Throwable -> L2c
            P.u r13 = (P.C0382u) r13     // Catch: java.lang.Throwable -> L2c
            r13.a()     // Catch: java.lang.Throwable -> L2c
            r0.B(r13)     // Catch: java.lang.Throwable -> L2c
        Lf8:
            long r8 = r8 >> r7
            int r12 = r12 + 1
            goto Le3
        Lfc:
            if (r11 != r7) goto L103
        Lfe:
            if (r6 == r3) goto L103
            int r6 = r6 + 1
            goto Ld0
        L103:
            r4.b()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r5)
            return
        L108:
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0383u0.a(P.v0, java.util.List, java.util.List, java.util.List, r.H, r.H, r.H, r.H):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(List list, C0385v0 c0385v0) {
        list.clear();
        synchronized (c0385v0.f5555b) {
            try {
                ArrayList arrayList = c0385v0.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((V) arrayList.get(i));
                }
                c0385v0.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0383u0 c0383u0 = new C0383u0(this.f5539A, (InterfaceC1524c) obj3);
        c0383u0.f5549z = (T) obj2;
        c0383u0.invokeSuspend(C1386y.f15098a);
        return EnumC1580a.f16356q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0141 -> B:44:0x0149). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01e3 -> B:12:0x00a0). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            r5.a r0 = r5.EnumC1580a.f16356q
            int r2 = r1.f5548y
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L62
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            r.H r2 = r1.f5547x
            java.util.Set r6 = r1.f5546w
            java.util.Set r6 = (java.util.Set) r6
            r.H r7 = r1.f5545v
            r.H r8 = r1.f5544u
            r.H r9 = r1.f5543t
            java.util.List r10 = r1.f5542s
            java.util.List r10 = (java.util.List) r10
            java.util.List r11 = r1.f5541r
            java.util.List r11 = (java.util.List) r11
            java.util.List r12 = r1.f5540q
            java.util.List r12 = (java.util.List) r12
            P.T r13 = r1.f5549z
            m5.AbstractC1362a.e(r22)
            r20 = r13
            r13 = r2
            r2 = r20
            goto L149
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3a:
            r.H r2 = r1.f5547x
            java.util.Set r6 = r1.f5546w
            java.util.Set r6 = (java.util.Set) r6
            r.H r7 = r1.f5545v
            r.H r8 = r1.f5544u
            r.H r9 = r1.f5543t
            java.util.List r10 = r1.f5542s
            java.util.List r10 = (java.util.List) r10
            java.util.List r11 = r1.f5541r
            java.util.List r11 = (java.util.List) r11
            java.util.List r12 = r1.f5540q
            java.util.List r12 = (java.util.List) r12
            P.T r13 = r1.f5549z
            m5.AbstractC1362a.e(r22)
            r14 = r9
            r9 = r2
            r2 = r13
            r13 = r10
            r10 = r12
            r12 = r14
        L5d:
            r15 = r6
            r14 = r8
            r8 = r7
            goto L10b
        L62:
            m5.AbstractC1362a.e(r22)
            P.T r2 = r1.f5549z
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r.P.f16163a
            r.H r9 = new r.H
            r9.<init>()
            r.H r10 = new r.H
            r10.<init>()
            r.H r11 = new r.H
            r11.<init>()
            R.h r12 = new R.h
            r12.<init>(r11)
            r.H r13 = new r.H
            r13.<init>()
            r20 = r12
            r12 = r6
            r6 = r20
            r20 = r11
            r11 = r7
            r7 = r20
            r20 = r10
            r10 = r8
            r8 = r20
        La0:
            P.v0 r14 = r1.f5539A
            java.lang.Object r14 = r14.f5555b
            monitor-enter(r14)
            monitor-exit(r14)
            P.v0 r14 = r1.f5539A
            r1.f5549z = r2
            r15 = r12
            java.util.List r15 = (java.util.List) r15
            r1.f5540q = r15
            r15 = r11
            java.util.List r15 = (java.util.List) r15
            r1.f5541r = r15
            r15 = r10
            java.util.List r15 = (java.util.List) r15
            r1.f5542s = r15
            r1.f5543t = r9
            r1.f5544u = r8
            r1.f5545v = r7
            r15 = r6
            java.util.Set r15 = (java.util.Set) r15
            r1.f5546w = r15
            r1.f5547x = r13
            r1.f5548y = r5
            boolean r15 = r14.w()
            if (r15 != 0) goto Lff
            M5.h r15 = new M5.h
            q5.c r3 = n5.AbstractC1397A.v(r1)
            r15.<init>(r5, r3)
            r15.s()
            java.lang.Object r3 = r14.f5555b
            monitor-enter(r3)
            boolean r16 = r14.w()     // Catch: java.lang.Throwable -> Lfc
            if (r16 == 0) goto Le5
            r14 = r15
            goto Le8
        Le5:
            r14.f5567q = r15     // Catch: java.lang.Throwable -> Lfc
            r14 = 0
        Le8:
            monitor-exit(r3)
            if (r14 == 0) goto Lf0
            m5.y r3 = m5.C1386y.f15098a
            r14.resumeWith(r3)
        Lf0:
            java.lang.Object r3 = r15.r()
            r5.a r14 = r5.EnumC1580a.f16356q
            if (r3 != r14) goto Lf9
            goto L101
        Lf9:
            m5.y r3 = m5.C1386y.f15098a
            goto L101
        Lfc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Lff:
            m5.y r3 = m5.C1386y.f15098a
        L101:
            if (r3 != r0) goto L104
            goto L140
        L104:
            r14 = r12
            r12 = r9
            r9 = r13
            r13 = r10
            r10 = r14
            goto L5d
        L10b:
            P.v0 r3 = r1.f5539A
            boolean r3 = P.C0385v0.r(r3)
            if (r3 == 0) goto L1e3
            P.t0 r6 = new P.t0
            P.v0 r7 = r1.f5539A
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.f5549z = r2
            r3 = r10
            java.util.List r3 = (java.util.List) r3
            r1.f5540q = r3
            r3 = r11
            java.util.List r3 = (java.util.List) r3
            r1.f5541r = r3
            r3 = r13
            java.util.List r3 = (java.util.List) r3
            r1.f5542s = r3
            r1.f5543t = r12
            r1.f5544u = r14
            r1.f5545v = r8
            r3 = r15
            java.util.Set r3 = (java.util.Set) r3
            r1.f5546w = r3
            r1.f5547x = r9
            r1.f5548y = r4
            java.lang.Object r3 = r2.e(r6, r1)
            if (r3 != r0) goto L141
        L140:
            return r0
        L141:
            r6 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r6
            r7 = r8
            r8 = r14
            r6 = r15
        L149:
            P.v0 r3 = r1.f5539A
            java.lang.Object r14 = r3.f5555b
            monitor-enter(r14)
            r.G r15 = r3.f5561k     // Catch: java.lang.Throwable -> L1aa
            int r4 = r15.f16137e     // Catch: java.lang.Throwable -> L1aa
            r17 = 0
            if (r4 == 0) goto L158
            r4 = r5
            goto L15a
        L158:
            r4 = r17
        L15a:
            if (r4 == 0) goto L1b4
            r.C r4 = R.a.b(r15)     // Catch: java.lang.Throwable -> L1aa
            r.G r15 = r3.f5561k     // Catch: java.lang.Throwable -> L1aa
            r15.a()     // Catch: java.lang.Throwable -> L1aa
            B0.o r15 = r3.f5562l     // Catch: java.lang.Throwable -> L1aa
            java.lang.Object r5 = r15.f499q     // Catch: java.lang.Throwable -> L1aa
            r.G r5 = (r.C1548G) r5     // Catch: java.lang.Throwable -> L1aa
            r5.a()     // Catch: java.lang.Throwable -> L1aa
            java.lang.Object r5 = r15.f500r     // Catch: java.lang.Throwable -> L1aa
            r.G r5 = (r.C1548G) r5     // Catch: java.lang.Throwable -> L1aa
            r5.a()     // Catch: java.lang.Throwable -> L1aa
            r.G r5 = r3.f5564n     // Catch: java.lang.Throwable -> L1aa
            r5.a()     // Catch: java.lang.Throwable -> L1aa
            r.C r5 = new r.C     // Catch: java.lang.Throwable -> L1aa
            int r15 = r4.f16115b     // Catch: java.lang.Throwable -> L1aa
            r5.<init>(r15)     // Catch: java.lang.Throwable -> L1aa
            java.lang.Object[] r15 = r4.f16114a     // Catch: java.lang.Throwable -> L1aa
            int r4 = r4.f16115b     // Catch: java.lang.Throwable -> L1aa
            r18 = r0
            r0 = r17
        L189:
            if (r0 >= r4) goto L1ac
            r19 = r15[r0]     // Catch: java.lang.Throwable -> L1aa
            r22 = r0
            r0 = r19
            P.V r0 = (P.V) r0     // Catch: java.lang.Throwable -> L1aa
            r.G r1 = r3.f5563m     // Catch: java.lang.Throwable -> L1aa
            java.lang.Object r1 = r1.g(r0)     // Catch: java.lang.Throwable -> L1aa
            r19 = r2
            m5.j r2 = new m5.j     // Catch: java.lang.Throwable -> L1aa
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L1aa
            r5.a(r2)     // Catch: java.lang.Throwable -> L1aa
            int r0 = r22 + 1
            r1 = r21
            r2 = r19
            goto L189
        L1aa:
            r0 = move-exception
            goto L1e1
        L1ac:
            r19 = r2
            r.G r0 = r3.f5563m     // Catch: java.lang.Throwable -> L1aa
            r0.a()     // Catch: java.lang.Throwable -> L1aa
            goto L1bf
        L1b4:
            r18 = r0
            r19 = r2
            r.C r5 = r.M.f16160b     // Catch: java.lang.Throwable -> L1aa
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            kotlin.jvm.internal.m.c(r5, r0)     // Catch: java.lang.Throwable -> L1aa
        L1bf:
            monitor-exit(r14)
            java.lang.Object[] r0 = r5.f16114a
            int r1 = r5.f16115b
            r2 = r17
        L1c6:
            if (r2 >= r1) goto L1d7
            r3 = r0[r2]
            m5.j r3 = (m5.C1371j) r3
            java.lang.Object r4 = r3.f15080q
            P.V r4 = (P.V) r4
            java.lang.Object r3 = r3.f15081r
            P.U r3 = (P.U) r3
            int r2 = r2 + 1
            goto L1c6
        L1d7:
            r1 = r21
            r0 = r18
            r2 = r19
            r4 = 2
            r5 = 1
            goto La0
        L1e1:
            monitor-exit(r14)
            throw r0
        L1e3:
            r1 = r13
            r13 = r9
            r9 = r12
            r12 = r10
            r10 = r1
            r1 = r21
            r7 = r8
            r8 = r14
            r6 = r15
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.C0383u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
