package R;

import I5.j;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s5.h implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ h f6679A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f6680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[] f6681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f6686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6687y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f6688z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6679A = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        g gVar = new g(this.f6679A, interfaceC1524c);
        gVar.f6688z = obj;
        return gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:22:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:19:0x0088). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f6687y
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 != r4) goto L22
            int r1 = r0.f6685w
            int r5 = r0.f6684v
            long r6 = r0.f6686x
            int r8 = r0.f6683u
            int r9 = r0.f6682t
            long[] r10 = r0.f6681s
            java.lang.Object[] r11 = r0.f6680r
            java.lang.Object r12 = r0.f6688z
            I5.j r12 = (I5.j) r12
            m5.AbstractC1362a.e(r20)
            goto L88
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2a:
            m5.AbstractC1362a.e(r20)
            java.lang.Object r1 = r0.f6688z
            I5.j r1 = (I5.j) r1
            R.h r5 = r0.f6679A
            r.H r5 = r5.f6689q
            java.lang.Object[] r6 = r5.f16139b
            long[] r5 = r5.f16138a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L96
            r8 = r2
        L3f:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L91
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r5
            r9 = r7
            r5 = r11
            r11 = r6
            r6 = r17
        L60:
            if (r1 >= r5) goto L8b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r2 = r8 << 3
            int r2 = r2 + r1
            r2 = r11[r2]
            r0.f6688z = r12
            r0.f6680r = r11
            r0.f6681s = r10
            r0.f6682t = r9
            r0.f6683u = r8
            r0.f6686x = r6
            r0.f6684v = r5
            r0.f6685w = r1
            r0.f6687y = r4
            r12.b(r2, r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            return r1
        L88:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L60
        L8b:
            if (r5 != r3) goto L96
            r7 = r9
            r5 = r10
            r6 = r11
            r1 = r12
        L91:
            if (r8 == r7) goto L96
            int r8 = r8 + 1
            goto L3f
        L96:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
