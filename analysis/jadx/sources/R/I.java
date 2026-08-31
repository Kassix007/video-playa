package r;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class I extends s5.h implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f16143A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ J f16144B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ I5.h f16145C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I5.h f16146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public J f16147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[] f16148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16150v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f16153y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16154z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j, I5.h hVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16144B = j;
        this.f16145C = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        I i = new I(this.f16144B, this.f16145C, interfaceC1524c);
        i.f16143A = obj;
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((I5.j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006e -> B:19:0x0095). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f16154z
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L25
            int r1 = r0.f16152x
            int r5 = r0.f16151w
            long r6 = r0.f16153y
            int r8 = r0.f16150v
            int r9 = r0.f16149u
            long[] r10 = r0.f16148t
            r.J r11 = r0.f16147s
            I5.h r12 = r0.f16146r
            java.lang.Object r13 = r0.f16143A
            I5.j r13 = (I5.j) r13
            m5.AbstractC1362a.e(r21)
            goto L95
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2d:
            m5.AbstractC1362a.e(r21)
            java.lang.Object r1 = r0.f16143A
            I5.j r1 = (I5.j) r1
            r.J r5 = r0.f16144B
            r.H r6 = r5.f16156r
            long[] r6 = r6.f16138a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La5
            I5.h r8 = r0.f16145C
            r9 = r2
        L42:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L65:
            if (r1 >= r5) goto L98
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L95
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.f2436s = r2
            r.H r3 = r11.f16156r
            java.lang.Object[] r3 = r3.f16139b
            r2 = r3[r2]
            r0.f16143A = r13
            r0.f16146r = r12
            r0.f16147s = r11
            r0.f16148t = r10
            r0.f16149u = r9
            r0.f16150v = r8
            r0.f16153y = r6
            r0.f16151w = r5
            r0.f16152x = r1
            r0.f16154z = r4
            r13.b(r2, r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            return r1
        L95:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L65
        L98:
            if (r5 != r3) goto La5
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        La0:
            if (r9 == r7) goto La5
            int r9 = r9 + 1
            goto L42
        La5:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
