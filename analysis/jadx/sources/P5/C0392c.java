package P5;

import q5.InterfaceC1529h;

/* JADX INFO: renamed from: P5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0392c extends Q5.g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s5.i f6390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final s5.i f6391u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.e */
    /* JADX WARN: Multi-variable type inference failed */
    public C0392c(B5.e eVar, InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        super(interfaceC1529h, i, aVar);
        s5.i iVar = (s5.i) eVar;
        this.f6390t = iVar;
        this.f6391u = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [B5.e, s5.i] */
    @Override // Q5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(O5.t r5, q5.InterfaceC1524c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof P5.C0391b
            if (r0 == 0) goto L13
            r0 = r6
            P5.b r0 = (P5.C0391b) r0
            int r1 = r0.f6389t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6389t = r1
            goto L1a
        L13:
            P5.b r0 = new P5.b
            s5.c r6 = (s5.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f6387r
            int r1 = r0.f6389t
            m5.y r2 = m5.C1386y.f15098a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            O5.t r5 = r0.f6386q
            m5.AbstractC1362a.e(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            m5.AbstractC1362a.e(r6)
            r0.f6386q = r5
            r0.f6389t = r3
            s5.i r6 = r4.f6390t
            java.lang.Object r6 = r6.invoke(r5, r0)
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r6 != r0) goto L45
            goto L46
        L45:
            r6 = r2
        L46:
            if (r6 != r0) goto L49
            return r0
        L49:
            O5.s r5 = (O5.s) r5
            O5.e r5 = r5.f5260t
            boolean r5 = r5.x()
            if (r5 == 0) goto L54
            return r2
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0392c.c(O5.t, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [B5.e, s5.i] */
    @Override // Q5.g
    public final Q5.g d(InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        return new C0392c(this.f6391u, interfaceC1529h, i, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final String toString() {
        return "block[" + this.f6390t + "] -> " + super.toString();
    }
}
