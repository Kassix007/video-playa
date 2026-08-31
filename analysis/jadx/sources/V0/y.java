package v0;

import B0.AbstractC0041g;
import C0.b1;
import M5.C0247h;
import n5.AbstractC1397A;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class y implements W0.c, InterfaceC1524c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0247h f17504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1731A f17505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0247h f17506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EnumC1738g f17507t = EnumC1738g.f17455r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1530i f17508u = C1530i.f16022q;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1731A f17509v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(C1731A c1731a, C0247h c0247h) {
        this.f17509v = c1731a;
        this.f17504q = c0247h;
        this.f17505r = c1731a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float D(long j) {
        return this.f17505r.D(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final int G(float f) {
        return this.f17505r.G(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long Q(long j) {
        return this.f17505r.Q(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float T(long j) {
        return this.f17505r.T(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(EnumC1738g enumC1738g, s5.a aVar) {
        C0247h c0247h = new C0247h(1, AbstractC1397A.v(aVar));
        c0247h.s();
        this.f17507t = enumC1738g;
        this.f17506s = c0247h;
        return c0247h.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long a0(float f) {
        return this.f17505r.a0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f17505r.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c() {
        C1731A c1731a = this.f17509v;
        c1731a.getClass();
        long jQ = c1731a.Q(AbstractC0041g.u(c1731a).f263P.d());
        long j = c1731a.f17434N;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jQ >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jQ & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final b1 e() {
        C1731A c1731a = this.f17509v;
        c1731a.getClass();
        return AbstractC0041g.u(c1731a).f263P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float f0(int i) {
        return this.f17505r.f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return this.f17508u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x001d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [M5.b0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [M5.b0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [B5.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r6, B5.e r8, s5.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof v0.w
            if (r0 == 0) goto L13
            r0 = r9
            v0.w r0 = (v0.w) r0
            int r1 = r0.f17500t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17500t = r1
            goto L18
        L13:
            v0.w r0 = new v0.w
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f17498r
            int r1 = r0.f17500t
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            M5.B r6 = r0.f17497q
            m5.AbstractC1362a.e(r9)     // Catch: java.lang.Throwable -> L27
            goto L68
        L27:
            r7 = move-exception
            goto L6e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            m5.AbstractC1362a.e(r9)
            r3 = 0
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L4a
            M5.h r9 = r5.f17506s
            if (r9 == 0) goto L4a
            v0.h r1 = new v0.h
            r1.<init>(r6)
            m5.l r1 = m5.AbstractC1362a.b(r1)
            r9.resumeWith(r1)
        L4a:
            v0.A r9 = r5.f17509v
            M5.w r9 = r9.l0()
            v0.x r1 = new v0.x
            r3 = 0
            r1.<init>(r6, r5, r3)
            r6 = 3
            M5.B r6 = M5.AbstractC0263y.t(r9, r3, r3, r1, r6)
            r0.f17497q = r6     // Catch: java.lang.Throwable -> L27
            r0.f17500t = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L27
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r9 != r7) goto L68
            return r7
        L68:
            v0.a r7 = v0.C1732a.f17435q
            r6.a(r7)
            return r9
        L6e:
            v0.a r8 = v0.C1732a.f17435q
            r6.a(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.y.h(long, B5.e, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float i0(float f) {
        return f / this.f17505r.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f17505r.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        C1731A c1731a = this.f17509v;
        synchronized (c1731a.f17431K) {
            c1731a.f17430J.l(this);
        }
        this.f17504q.resumeWith(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long s(float f) {
        return this.f17505r.s(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float u(float f) {
        return this.f17505r.b() * f;
    }
}
