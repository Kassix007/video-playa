package P;

import P5.InterfaceC0398i;
import m5.C1386y;
import q5.InterfaceC1524c;
import r.C1549H;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1549H f5362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B5.c f5363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public O5.i f5364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public R4.L0 f5365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f5366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f5368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B5.a f5369x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(B5.a aVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f5369x = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        Q0 q02 = new Q0(this.f5369x, interfaceC1524c);
        q02.f5368w = obj;
        return q02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Q0) create((InterfaceC0398i) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
        return EnumC1580a.f16356q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:73:0x0186) to fix multi-entry loop: BACK_EDGE: B:73:0x0186 -> B:72:0x0181 */
    /* JADX WARN: Path cross not found for [B:38:0x00df, B:58:0x0139], limit reached: 106 */
    /* JADX WARN: Path cross not found for [B:43:0x00fd, B:54:0x012f], limit reached: 106 */
    /* JADX WARN: Path cross not found for [B:58:0x0139, B:38:0x00df], limit reached: 106 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0147 A[EDGE_INSN: B:105:0x0147->B:61:0x0147 BREAK  A[LOOP:0: B:37:0x00dd->B:81:0x0193], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da A[Catch: all -> 0x0025, PHI: r2 r4 r5 r7 r8 r9 r10 r11 r12
  0x00da: PHI (r2v8 java.lang.Object) = (r2v11 java.lang.Object), (r2v14 java.lang.Object) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r4v1 int) = (r4v17 int), (r4v0 int) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r5v1 int) = (r5v9 int), (r5v0 int) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r7v7 R4.L0) = (r7v8 R4.L0), (r7v11 R4.L0) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r8v2 O5.i) = (r8v3 O5.i), (r8v6 O5.i) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r9v1 B5.c) = (r9v2 B5.c), (r9v5 B5.c) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r10v1 r.H) = (r10v2 r.H), (r10v5 r.H) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r11v2 P5.i) = (r11v3 P5.i), (r11v8 P5.i) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r12v6 java.lang.Object) = (r12v11 java.lang.Object), (r12v12 java.lang.Object) binds: [B:34:0x00d6, B:16:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:33:0x00c4, B:36:0x00da, B:38:0x00df, B:41:0x00e8, B:43:0x00fd, B:45:0x010b, B:47:0x0115, B:51:0x0126, B:56:0x0133, B:59:0x013a, B:62:0x0149, B:66:0x0161, B:68:0x016a, B:79:0x018f, B:80:0x0192, B:15:0x003e, B:18:0x0053, B:25:0x0095, B:29:0x00aa, B:87:0x01a0, B:88:0x01a3, B:63:0x0156, B:65:0x015e, B:77:0x018b, B:78:0x018e, B:26:0x009f, B:28:0x00a7, B:85:0x019c, B:86:0x019f), top: B:94:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:33:0x00c4, B:36:0x00da, B:38:0x00df, B:41:0x00e8, B:43:0x00fd, B:45:0x010b, B:47:0x0115, B:51:0x0126, B:56:0x0133, B:59:0x013a, B:62:0x0149, B:66:0x0161, B:68:0x016a, B:79:0x018f, B:80:0x0192, B:15:0x003e, B:18:0x0053, B:25:0x0095, B:29:0x00aa, B:87:0x01a0, B:88:0x01a3, B:63:0x0156, B:65:0x015e, B:77:0x018b, B:78:0x018e, B:26:0x009f, B:28:0x00a7, B:85:0x019c, B:86:0x019f), top: B:94:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:33:0x00c4, B:36:0x00da, B:38:0x00df, B:41:0x00e8, B:43:0x00fd, B:45:0x010b, B:47:0x0115, B:51:0x0126, B:56:0x0133, B:59:0x013a, B:62:0x0149, B:66:0x0161, B:68:0x016a, B:79:0x018f, B:80:0x0192, B:15:0x003e, B:18:0x0053, B:25:0x0095, B:29:0x00aa, B:87:0x01a0, B:88:0x01a3, B:63:0x0156, B:65:0x015e, B:77:0x018b, B:78:0x018e, B:26:0x009f, B:28:0x00a7, B:85:0x019c, B:86:0x019f), top: B:94:0x000a, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193 A[LOOP:0: B:37:0x00dd->B:81:0x0193, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0180 -> B:72:0x0181). Please report as a decompilation issue!!! */
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
            int r2 = r1.f5367v
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L57
            if (r2 == r6) goto L45
            if (r2 == r4) goto L30
            if (r2 != r3) goto L28
            java.lang.Object r2 = r1.f5366u
            R4.L0 r7 = r1.f5365t
            O5.i r8 = r1.f5364s
            B5.c r9 = r1.f5363r
            r.H r10 = r1.f5362q
            java.lang.Object r11 = r1.f5368w
            P5.i r11 = (P5.InterfaceC0398i) r11
            m5.AbstractC1362a.e(r22)     // Catch: java.lang.Throwable -> L25
            goto L181
        L25:
            r0 = move-exception
            goto L1a4
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L30:
            java.lang.Object r2 = r1.f5366u
            R4.L0 r7 = r1.f5365t
            O5.i r8 = r1.f5364s
            B5.c r9 = r1.f5363r
            r.H r10 = r1.f5362q
            java.lang.Object r11 = r1.f5368w
            P5.i r11 = (P5.InterfaceC0398i) r11
            m5.AbstractC1362a.e(r22)     // Catch: java.lang.Throwable -> L25
            r12 = r22
            goto Lda
        L45:
            java.lang.Object r2 = r1.f5366u
            R4.L0 r7 = r1.f5365t
            O5.i r8 = r1.f5364s
            B5.c r9 = r1.f5363r
            r.H r10 = r1.f5362q
            java.lang.Object r11 = r1.f5368w
            P5.i r11 = (P5.InterfaceC0398i) r11
            m5.AbstractC1362a.e(r22)     // Catch: java.lang.Throwable -> L25
            goto Lc4
        L57:
            m5.AbstractC1362a.e(r22)
            java.lang.Object r2 = r1.f5368w
            r11 = r2
            P5.i r11 = (P5.InterfaceC0398i) r11
            r.H r10 = new r.H
            r10.<init>()
            P.P0 r9 = new P.P0
            r9.<init>(r10, r5)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = 6
            r8 = 0
            O5.e r8 = l6.d.e(r2, r8, r7)
            A.e0 r2 = new A.e0
            r7 = 10
            r2.<init>(r7, r8)
            B0.G0 r7 = a0.n.f8679a
            a0.a r7 = a0.C0599a.f8645s
            a0.n.f(r7)
            java.lang.Object r7 = a0.n.f8680b
            monitor-enter(r7)
            java.lang.Object r12 = a0.n.f8684g     // Catch: java.lang.Throwable -> L1a8
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> L1a8
            java.util.ArrayList r12 = n5.l.v0(r12, r2)     // Catch: java.lang.Throwable -> L1a8
            a0.n.f8684g = r12     // Catch: java.lang.Throwable -> L1a8
            monitor-exit(r7)
            R4.L0 r7 = new R4.L0
            r12 = 9
            r7.<init>(r12, r2)
            a0.h r2 = a0.n.k()     // Catch: java.lang.Throwable -> L25
            a0.h r2 = r2.u(r9)     // Catch: java.lang.Throwable -> L25
            B5.a r12 = r1.f5369x     // Catch: java.lang.Throwable -> L25
            a0.h r13 = r2.j()     // Catch: java.lang.Throwable -> L199
            java.lang.Object r12 = r12.invoke()     // Catch: java.lang.Throwable -> L19b
            a0.AbstractC0606h.q(r13)     // Catch: java.lang.Throwable -> L199
            r2.c()     // Catch: java.lang.Throwable -> L25
            r1.f5368w = r11     // Catch: java.lang.Throwable -> L25
            r1.f5362q = r10     // Catch: java.lang.Throwable -> L25
            r1.f5363r = r9     // Catch: java.lang.Throwable -> L25
            r1.f5364s = r8     // Catch: java.lang.Throwable -> L25
            r1.f5365t = r7     // Catch: java.lang.Throwable -> L25
            r1.f5366u = r12     // Catch: java.lang.Throwable -> L25
            r1.f5367v = r6     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r11.emit(r12, r1)     // Catch: java.lang.Throwable -> L25
            if (r2 != r0) goto Lc3
            goto L17f
        Lc3:
            r2 = r12
        Lc4:
            r1.f5368w = r11     // Catch: java.lang.Throwable -> L25
            r1.f5362q = r10     // Catch: java.lang.Throwable -> L25
            r1.f5363r = r9     // Catch: java.lang.Throwable -> L25
            r1.f5364s = r8     // Catch: java.lang.Throwable -> L25
            r1.f5365t = r7     // Catch: java.lang.Throwable -> L25
            r1.f5366u = r2     // Catch: java.lang.Throwable -> L25
            r1.f5367v = r4     // Catch: java.lang.Throwable -> L25
            java.lang.Object r12 = r8.h(r1)     // Catch: java.lang.Throwable -> L25
            if (r12 != r0) goto Lda
            goto L17f
        Lda:
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> L25
            r13 = r5
        Ldd:
            if (r13 != 0) goto L139
            java.lang.Object[] r13 = r10.f16139b     // Catch: java.lang.Throwable -> L25
            long[] r14 = r10.f16138a     // Catch: java.lang.Throwable -> L25
            int r15 = r14.length     // Catch: java.lang.Throwable -> L25
            int r15 = r15 - r4
            if (r15 < 0) goto L137
            r4 = r5
        Le8:
            r5 = r14[r4]     // Catch: java.lang.Throwable -> L25
            r22 = r4
            long r3 = ~r5     // Catch: java.lang.Throwable -> L25
            r16 = 7
            long r3 = r3 << r16
            long r3 = r3 & r5
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r16
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 == 0) goto L12f
            int r4 = r22 - r15
            int r3 = ~r4     // Catch: java.lang.Throwable -> L25
            int r3 = r3 >>> 31
            r4 = 8
            int r3 = 8 - r3
            r16 = r4
            r4 = 0
        L109:
            if (r4 >= r3) goto L12b
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r5 & r17
            r19 = 128(0x80, double:6.32E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L124
            int r17 = r22 << 3
            int r17 = r17 + r4
            r18 = r4
            r4 = r13[r17]     // Catch: java.lang.Throwable -> L25
            boolean r4 = r12.contains(r4)     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L126
            goto L139
        L124:
            r18 = r4
        L126:
            long r5 = r5 >> r16
            int r4 = r18 + 1
            goto L109
        L12b:
            r4 = r16
            if (r3 != r4) goto L137
        L12f:
            r5 = r22
            if (r5 == r15) goto L137
            int r4 = r5 + 1
            r3 = 3
            goto Le8
        L137:
            r13 = 0
            goto L13a
        L139:
            r13 = 1
        L13a:
            java.lang.Object r3 = r8.i()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r3 = O5.l.a(r3)     // Catch: java.lang.Throwable -> L25
            r12 = r3
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> L25
            if (r12 != 0) goto L193
            if (r13 == 0) goto L186
            r10.b()     // Catch: java.lang.Throwable -> L25
            a0.h r3 = a0.n.k()     // Catch: java.lang.Throwable -> L25
            a0.h r3 = r3.u(r9)     // Catch: java.lang.Throwable -> L25
            B5.a r4 = r1.f5369x     // Catch: java.lang.Throwable -> L25
            a0.h r5 = r3.j()     // Catch: java.lang.Throwable -> L188
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L18a
            a0.AbstractC0606h.q(r5)     // Catch: java.lang.Throwable -> L188
            r3.c()     // Catch: java.lang.Throwable -> L25
            boolean r3 = kotlin.jvm.internal.m.a(r4, r2)     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L186
            r1.f5368w = r11     // Catch: java.lang.Throwable -> L25
            r1.f5362q = r10     // Catch: java.lang.Throwable -> L25
            r1.f5363r = r9     // Catch: java.lang.Throwable -> L25
            r1.f5364s = r8     // Catch: java.lang.Throwable -> L25
            r1.f5365t = r7     // Catch: java.lang.Throwable -> L25
            r1.f5366u = r4     // Catch: java.lang.Throwable -> L25
            r3 = 3
            r1.f5367v = r3     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r11.emit(r4, r1)     // Catch: java.lang.Throwable -> L25
            if (r2 != r0) goto L180
        L17f:
            return r0
        L180:
            r2 = r4
        L181:
            r4 = 2
            r5 = 0
            r6 = 1
            goto Lc4
        L186:
            r3 = 3
            goto L181
        L188:
            r0 = move-exception
            goto L18f
        L18a:
            r0 = move-exception
            a0.AbstractC0606h.q(r5)     // Catch: java.lang.Throwable -> L188
            throw r0     // Catch: java.lang.Throwable -> L188
        L18f:
            r3.c()     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L193:
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            goto Ldd
        L199:
            r0 = move-exception
            goto L1a0
        L19b:
            r0 = move-exception
            a0.AbstractC0606h.q(r13)     // Catch: java.lang.Throwable -> L199
            throw r0     // Catch: java.lang.Throwable -> L199
        L1a0:
            r2.c()     // Catch: java.lang.Throwable -> L25
            throw r0     // Catch: java.lang.Throwable -> L25
        L1a4:
            r7.e()
            throw r0
        L1a8:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P.Q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
