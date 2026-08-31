package P5;

import c.C0708f;

/* JADX INFO: renamed from: P5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0403n implements InterfaceC0397h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0393d f6418q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0708f f6419r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0403n(C0393d c0393d, C0708f c0708f) {
        this.f6418q = c0393d;
        this.f6419r = c0708f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // P5.InterfaceC0397h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(P5.InterfaceC0398i r10, q5.InterfaceC1524c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof P5.C0402m
            if (r0 == 0) goto L13
            r0 = r11
            P5.m r0 = (P5.C0402m) r0
            int r1 = r0.f6414r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6414r = r1
            goto L18
        L13:
            P5.m r0 = new P5.m
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f6413q
            int r1 = r0.f6414r
            m5.y r2 = m5.C1386y.f15098a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L52
            if (r1 == r5) goto L46
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L36
            java.lang.Object r10 = r0.f6416t
            Q5.y r10 = (Q5.y) r10
            m5.AbstractC1362a.e(r11)     // Catch: java.lang.Throwable -> L34
            goto L7d
        L34:
            r11 = move-exception
            goto L85
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            java.lang.Object r10 = r0.f6416t
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            m5.AbstractC1362a.e(r11)
            goto L9f
        L46:
            P5.i r10 = r0.f6417u
            java.lang.Object r1 = r0.f6416t
            P5.n r1 = (P5.C0403n) r1
            m5.AbstractC1362a.e(r11)     // Catch: java.lang.Throwable -> L50
            goto L65
        L50:
            r10 = move-exception
            goto L8b
        L52:
            m5.AbstractC1362a.e(r11)
            P5.d r11 = r9.f6418q     // Catch: java.lang.Throwable -> L89
            r0.f6416t = r9     // Catch: java.lang.Throwable -> L89
            r0.f6417u = r10     // Catch: java.lang.Throwable -> L89
            r0.f6414r = r5     // Catch: java.lang.Throwable -> L89
            java.lang.Object r11 = r11.collect(r10, r0)     // Catch: java.lang.Throwable -> L89
            if (r11 != r7) goto L64
            goto L9e
        L64:
            r1 = r9
        L65:
            Q5.y r11 = new Q5.y
            q5.h r4 = r0.getContext()
            r11.<init>(r10, r4)
            c.f r10 = r1.f6419r     // Catch: java.lang.Throwable -> L81
            r0.f6416t = r11     // Catch: java.lang.Throwable -> L81
            r0.f6417u = r6     // Catch: java.lang.Throwable -> L81
            r0.f6414r = r3     // Catch: java.lang.Throwable -> L81
            r10.invoke(r11, r6, r0)     // Catch: java.lang.Throwable -> L81
            if (r2 != r7) goto L7c
            goto L9e
        L7c:
            r10 = r11
        L7d:
            r10.releaseIntercepted()
            return r2
        L81:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L85:
            r10.releaseIntercepted()
            throw r11
        L89:
            r10 = move-exception
            r1 = r9
        L8b:
            P5.U r11 = new P5.U
            r11.<init>(r10)
            c.f r1 = r1.f6419r
            r0.f6416t = r10
            r0.f6417u = r6
            r0.f6414r = r4
            java.lang.Object r11 = P5.H.c(r11, r1, r10, r0)
            if (r11 != r7) goto L9f
        L9e:
            return r7
        L9f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0403n.collect(P5.i, q5.c):java.lang.Object");
    }
}
