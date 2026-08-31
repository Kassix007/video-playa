package u2;

import P5.InterfaceC0397h;
import P5.S;

/* JADX INFO: renamed from: u2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1692m implements InterfaceC0397h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17159q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f17160r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1692m(S s6, int i) {
        this.f17159q = i;
        this.f17160r = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r6v8, types: [B5.e, s5.i] */
    @Override // P5.InterfaceC0397h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(P5.InterfaceC0398i r6, q5.InterfaceC1524c r7) {
        /*
            r5 = this;
            int r0 = r5.f17159q
            switch(r0) {
                case 0: goto L7f;
                case 1: goto L69;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof P5.C0390a
            if (r0 == 0) goto L18
            r0 = r7
            P5.a r0 = (P5.C0390a) r0
            int r1 = r0.f6385t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f6385t = r1
            goto L1d
        L18:
            P5.a r0 = new P5.a
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.f6383r
            int r1 = r0.f6385t
            m5.y r2 = m5.C1386y.f15098a
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 != r3) goto L30
            Q5.y r6 = r0.f6382q
            m5.AbstractC1362a.e(r7)     // Catch: java.lang.Throwable -> L2e
            goto L5b
        L2e:
            r7 = move-exception
            goto L65
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            m5.AbstractC1362a.e(r7)
            Q5.y r7 = new Q5.y
            q5.h r1 = r0.getContext()
            r7.<init>(r6, r1)
            r0.f6382q = r7     // Catch: java.lang.Throwable -> L63
            r0.f6385t = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r5.f17160r     // Catch: java.lang.Throwable -> L63
            s5.i r6 = (s5.i) r6     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L63
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r6 != r0) goto L55
            goto L56
        L55:
            r6 = r2
        L56:
            if (r6 != r0) goto L5a
            r2 = r0
            goto L5e
        L5a:
            r6 = r7
        L5b:
            r6.releaseIntercepted()
        L5e:
            return r2
        L5f:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L65
        L63:
            r6 = move-exception
            goto L5f
        L65:
            r6.releaseIntercepted()
            throw r7
        L69:
            java.lang.Object r0 = r5.f17160r
            P5.h r0 = (P5.InterfaceC0397h) r0
            u2.l r1 = new u2.l
            r2 = 1
            r1.<init>(r6, r2)
            java.lang.Object r6 = r0.collect(r1, r7)
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r6 != r7) goto L7c
            goto L7e
        L7c:
            m5.y r6 = m5.C1386y.f15098a
        L7e:
            return r6
        L7f:
            java.lang.Object r0 = r5.f17160r
            P5.h r0 = (P5.InterfaceC0397h) r0
            u2.l r1 = new u2.l
            r2 = 0
            r1.<init>(r6, r2)
            java.lang.Object r6 = r0.collect(r1, r7)
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r6 != r7) goto L92
            goto L94
        L92:
            m5.y r6 = m5.C1386y.f15098a
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.C1692m.collect(P5.i, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.e */
    /* JADX WARN: Multi-variable type inference failed */
    public C1692m(B5.e eVar) {
        this.f17159q = 2;
        this.f17160r = (s5.i) eVar;
    }
}
