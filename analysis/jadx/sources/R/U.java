package r;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class U extends s5.h implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ V f16173A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f16174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[] f16175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f16180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f16182z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16173A = v6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        U u6 = new U(this.f16173A, interfaceC1524c);
        u6.f16182z = obj;
        return u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((I5.j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f16181y
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 != r4) goto L22
            int r1 = r0.f16179w
            int r5 = r0.f16178v
            long r6 = r0.f16180x
            int r8 = r0.f16177u
            int r9 = r0.f16176t
            long[] r10 = r0.f16175s
            java.lang.Object[] r11 = r0.f16174r
            java.lang.Object r12 = r0.f16182z
            I5.j r12 = (I5.j) r12
            m5.AbstractC1362a.e(r20)
            goto L8a
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2a:
            m5.AbstractC1362a.e(r20)
            java.lang.Object r1 = r0.f16182z
            I5.j r1 = (I5.j) r1
            r.V r5 = r0.f16173A
            java.lang.Object r5 = r5.f16184r
            r.G r5 = (r.C1548G) r5
            java.lang.Object[] r6 = r5.f16135c
            long[] r5 = r5.f16133a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L98
            r8 = r2
        L41:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L93
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
        L62:
            if (r1 >= r5) goto L8d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8a
            int r2 = r8 << 3
            int r2 = r2 + r1
            r2 = r11[r2]
            r0.f16182z = r12
            r0.f16174r = r11
            r0.f16175s = r10
            r0.f16176t = r9
            r0.f16177u = r8
            r0.f16180x = r6
            r0.f16178v = r5
            r0.f16179w = r1
            r0.f16181y = r4
            r12.b(r2, r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            return r1
        L8a:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L62
        L8d:
            if (r5 != r3) goto L98
            r7 = r9
            r5 = r10
            r6 = r11
            r1 = r12
        L93:
            if (r8 == r7) goto L98
            int r8 = r8 + 1
            goto L41
        L98:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
