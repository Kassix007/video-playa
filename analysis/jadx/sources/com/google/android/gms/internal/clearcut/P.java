package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0748g f10439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0741c0 f10440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0757p f10441c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P(C0741c0 c0741c0, C0757p c0757p, AbstractC0748g abstractC0748g) {
        this.f10440b = c0741c0;
        c0757p.getClass();
        this.f10441c = c0757p;
        this.f10439a = abstractC0748g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final void a(Object obj) {
        this.f10440b.getClass();
        ((AbstractC0764x) obj).zzjp.f10497d = false;
        this.f10441c.getClass();
        C0.S.t(obj);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0062 A[EDGE_INSN: B:51:0x0062->B:28:0x0062 BREAK  A[LOOP:1: B:14:0x0032->B:54:0x0032], SYNTHETIC] */
    @Override // com.google.android.gms.internal.clearcut.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r8, byte[] r9, int r10, int r11, com.google.android.gms.internal.clearcut.C0751j r12) throws com.google.android.gms.internal.clearcut.B {
        /*
            r7 = this;
            com.google.android.gms.internal.clearcut.x r8 = (com.google.android.gms.internal.clearcut.AbstractC0764x) r8
            com.google.android.gms.internal.clearcut.b0 r0 = r8.zzjp
            com.google.android.gms.internal.clearcut.b0 r1 = com.google.android.gms.internal.clearcut.C0739b0.f10493e
            if (r0 != r1) goto Le
            com.google.android.gms.internal.clearcut.b0 r0 = com.google.android.gms.internal.clearcut.C0739b0.b()
            r8.zzjp = r0
        Le:
            r4 = r0
        Lf:
            if (r10 >= r11) goto L6f
            int r2 = com.google.android.gms.internal.clearcut.l0.f(r9, r10, r12)
            int r0 = r12.f10516a
            r8 = 11
            r10 = 2
            if (r0 == r8) goto L2d
            r8 = r0 & 7
            r1 = r9
            r3 = r11
            r5 = r12
            if (r8 != r10) goto L28
            int r10 = com.google.android.gms.internal.clearcut.l0.c(r0, r1, r2, r3, r4, r5)
            goto Lf
        L28:
            int r10 = com.google.android.gms.internal.clearcut.l0.b(r0, r1, r2, r3, r5)
            goto Lf
        L2d:
            r1 = r9
            r3 = r11
            r5 = r12
            r8 = 0
            r9 = 0
        L32:
            if (r2 >= r3) goto L61
            int r11 = com.google.android.gms.internal.clearcut.l0.f(r1, r2, r5)
            int r12 = r5.f10516a
            int r0 = r12 >>> 3
            r2 = r12 & 7
            if (r0 == r10) goto L4f
            r6 = 3
            if (r0 == r6) goto L44
            goto L58
        L44:
            if (r2 != r10) goto L58
            int r2 = com.google.android.gms.internal.clearcut.l0.s(r1, r11, r5)
            java.lang.Object r9 = r5.f10518c
            com.google.android.gms.internal.clearcut.m r9 = (com.google.android.gms.internal.clearcut.C0754m) r9
            goto L32
        L4f:
            if (r2 != 0) goto L58
            int r2 = com.google.android.gms.internal.clearcut.l0.f(r1, r11, r5)
            int r8 = r5.f10516a
            goto L32
        L58:
            r0 = 12
            if (r12 == r0) goto L62
            int r2 = com.google.android.gms.internal.clearcut.l0.b(r12, r1, r11, r3, r5)
            goto L32
        L61:
            r11 = r2
        L62:
            if (r9 == 0) goto L6a
            int r8 = r8 << 3
            r8 = r8 | r10
            r4.a(r8, r9)
        L6a:
            r10 = r11
            r9 = r1
            r11 = r3
            r12 = r5
            goto Lf
        L6f:
            r3 = r11
            if (r10 != r3) goto L73
            return
        L73:
            com.google.android.gms.internal.clearcut.B r8 = com.google.android.gms.internal.clearcut.B.b()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.P.b(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.j):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final void c(AbstractC0764x abstractC0764x, AbstractC0764x abstractC0764x2) {
        AbstractC0737a0.a(this.f10440b, abstractC0764x, abstractC0764x2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final Object d() {
        return ((AbstractC0762v) ((AbstractC0764x) this.f10439a).a(5)).c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final boolean e(AbstractC0764x abstractC0764x, AbstractC0764x abstractC0764x2) {
        this.f10440b.getClass();
        return abstractC0764x.zzjp.equals(abstractC0764x2.zzjp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final boolean f(Object obj) {
        this.f10441c.getClass();
        C0.S.t(obj);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final int g(AbstractC0764x abstractC0764x) {
        this.f10440b.getClass();
        return abstractC0764x.zzjp.hashCode();
    }
}
