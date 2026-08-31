package r;

import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: r.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1556g extends s5.h implements B5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C1557h f16202A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1557h f16203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long[] f16204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f16209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16210y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f16211z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1556g(C1557h c1557h, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16202A = c1557h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1556g c1556g = new C1556g(this.f16202A, interfaceC1524c);
        c1556g.f16211z = obj;
        return c1556g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1556g) create((I5.j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004c -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:14:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:19:0x0096). Please report as a decompilation issue!!! */
    @Override // s5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f16210y
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2b
            if (r1 != r4) goto L23
            int r1 = r0.f16208w
            int r5 = r0.f16207v
            long r6 = r0.f16209x
            int r8 = r0.f16206u
            int r9 = r0.f16205t
            long[] r10 = r0.f16204s
            r.h r11 = r0.f16203r
            java.lang.Object r12 = r0.f16211z
            I5.j r12 = (I5.j) r12
            m5.AbstractC1362a.e(r20)
            goto L96
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2b:
            m5.AbstractC1362a.e(r20)
            java.lang.Object r1 = r0.f16211z
            I5.j r1 = (I5.j) r1
            r.h r5 = r0.f16202A
            r.G r6 = r5.f16213r
            long[] r6 = r6.f16133a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            r8 = r2
        L3e:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L9f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r5
            r5 = r12
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r6
            r9 = r7
            r6 = r17
        L60:
            if (r1 >= r5) goto L99
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L96
            int r2 = r8 << 3
            int r2 = r2 + r1
            U.a r3 = new U.a
            r.G r13 = r11.f16213r
            java.lang.Object[] r14 = r13.f16134b
            r14 = r14[r2]
            java.lang.Object[] r13 = r13.f16135c
            r2 = r13[r2]
            r13 = 1
            r3.<init>(r13, r14, r2)
            r0.f16211z = r12
            r0.f16203r = r11
            r0.f16204s = r10
            r0.f16205t = r9
            r0.f16206u = r8
            r0.f16209x = r6
            r0.f16207v = r5
            r0.f16208w = r1
            r0.f16210y = r4
            r12.b(r3, r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            return r1
        L96:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L60
        L99:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r12
        L9f:
            if (r8 == r7) goto La4
            int r8 = r8 + 1
            goto L3e
        La4:
            m5.y r1 = m5.C1386y.f15098a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1556g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
