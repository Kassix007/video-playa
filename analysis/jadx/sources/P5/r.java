package P5;

import m5.InterfaceC1366e;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0397h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0397h f6435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1366e f6436s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r(InterfaceC0397h interfaceC0397h, InterfaceC1366e interfaceC1366e, int i) {
        this.f6434q = i;
        this.f6435r = interfaceC0397h;
        this.f6436s = interfaceC1366e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v13, types: [B5.e, s5.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ba -> B:39:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cc -> B:42:0x00c9). Please report as a decompilation issue!!! */
    @Override // P5.InterfaceC0397h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(P5.InterfaceC0398i r10, q5.InterfaceC1524c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.f6434q
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L1c;
                default: goto L5;
            }
        L5:
            L.e r0 = new L.e
            m5.e r1 = r9.f6436s
            s5.i r1 = (s5.i) r1
            r0.<init>(r10, r1)
            P5.h r10 = r9.f6435r
            java.lang.Object r10 = r10.collect(r0, r11)
            r5.a r11 = r5.EnumC1580a.f16356q
            if (r10 != r11) goto L19
            goto L1b
        L19:
            m5.y r10 = m5.C1386y.f15098a
        L1b:
            return r10
        L1c:
            kotlin.jvm.internal.u r0 = new kotlin.jvm.internal.u
            r0.<init>()
            P5.h r1 = r9.f6435r
            Q5.o r1 = (Q5.o) r1
            N.f r2 = new N.f
            m5.e r3 = r9.f6436s
            P5.N r3 = (P5.N) r3
            r4 = 1
            r2.<init>(r0, r10, r3, r4)
            java.lang.Object r10 = r1.collect(r2, r11)
            r5.a r11 = r5.EnumC1580a.f16356q
            if (r10 != r11) goto L38
            goto L3a
        L38:
            m5.y r10 = m5.C1386y.f15098a
        L3a:
            return r10
        L3b:
            boolean r0 = r11 instanceof P5.C0406q
            if (r0 == 0) goto L4e
            r0 = r11
            P5.q r0 = (P5.C0406q) r0
            int r1 = r0.f6428r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L4e
            int r1 = r1 - r2
            r0.f6428r = r1
            goto L53
        L4e:
            P5.q r0 = new P5.q
            r0.<init>(r9, r11)
        L53:
            java.lang.Object r11 = r0.f6427q
            int r1 = r0.f6428r
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L81
            if (r1 == r3) goto L75
            if (r1 != r2) goto L6d
            long r5 = r0.f6433w
            java.lang.Throwable r10 = r0.f6432v
            P5.i r1 = r0.f6431u
            P5.r r7 = r0.f6430t
            m5.AbstractC1362a.e(r11)
            goto Lbd
        L6d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L75:
            long r5 = r0.f6433w
            P5.i r10 = r0.f6431u
            P5.r r1 = r0.f6430t
            m5.AbstractC1362a.e(r11)
            r7 = r1
        L7f:
            r1 = r10
            goto L9e
        L81:
            m5.AbstractC1362a.e(r11)
            r5 = 0
            r11 = r9
        L87:
            P5.h r1 = r11.f6435r
            r0.f6430t = r11
            r0.f6431u = r10
            r7 = 0
            r0.f6432v = r7
            r0.f6433w = r5
            r0.f6428r = r3
            java.io.Serializable r1 = P5.H.f(r1, r10, r0)
            if (r1 != r4) goto L9b
            goto Ld2
        L9b:
            r7 = r11
            r11 = r1
            goto L7f
        L9e:
            r10 = r11
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            if (r10 == 0) goto Lcc
            m5.e r11 = r7.f6436s
            B5.g r11 = (B5.g) r11
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            r0.f6430t = r7
            r0.f6431u = r1
            r0.f6432v = r10
            r0.f6433w = r5
            r0.f6428r = r2
            java.lang.Object r11 = r11.invoke(r1, r10, r8, r0)
            if (r11 != r4) goto Lbd
            goto Ld2
        Lbd:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lcb
            r10 = 1
            long r5 = r5 + r10
            r10 = r3
        Lc9:
            r11 = r7
            goto Lce
        Lcb:
            throw r10
        Lcc:
            r10 = 0
            goto Lc9
        Lce:
            if (r10 != 0) goto Ld3
            m5.y r4 = m5.C1386y.f15098a
        Ld2:
            return r4
        Ld3:
            r10 = r1
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.r.collect(P5.i, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: B5.e */
    /* JADX WARN: Multi-variable type inference failed */
    public r(InterfaceC0397h interfaceC0397h, B5.e eVar) {
        this.f6434q = 2;
        this.f6435r = interfaceC0397h;
        this.f6436s = (s5.i) eVar;
    }
}
