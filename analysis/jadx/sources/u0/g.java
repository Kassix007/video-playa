package u0;

import B0.AbstractC0041g;
import B0.E0;
import C0.C0106v;
import M5.InterfaceC0261w;
import c0.AbstractC0724l;
import i0.C1130b;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0724l implements E0, InterfaceC1672a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public InterfaceC1672a f17110E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public d f17111F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public g f17112G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f17113H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(InterfaceC1672a interfaceC1672a, d dVar) {
        this.f17110E = interfaceC1672a;
        this.f17111F = dVar == null ? new d() : dVar;
        this.f17113H = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final long F(int i, long j, long j7) {
        long jF = this.f17110E.F(i, j, j7);
        boolean z5 = this.f10099D;
        g gVar = null;
        if (z5 && z5) {
            gVar = (g) AbstractC0041g.j(this);
        }
        g gVar2 = gVar;
        return C1130b.e(jF, gVar2 != null ? gVar2.F(i, C1130b.e(j, jF), C1130b.d(j7, jF)) : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r13 != r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // u0.InterfaceC1672a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(long r11, q5.InterfaceC1524c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof u0.f
            if (r0 == 0) goto L13
            r0 = r13
            u0.f r0 = (u0.f) r0
            int r1 = r0.f17109u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17109u = r1
            goto L1a
        L13:
            u0.f r0 = new u0.f
            s5.c r13 = (s5.c) r13
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.f17107s
            int r1 = r0.f17109u
            r2 = 0
            r3 = 2
            r4 = 1
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L2f
            long r11 = r0.f17106r
            m5.AbstractC1362a.e(r13)
            goto L7f
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r11 = r0.f17106r
            u0.g r1 = r0.f17105q
            m5.AbstractC1362a.e(r13)
            goto L60
        L3f:
            m5.AbstractC1362a.e(r13)
            boolean r13 = r10.f10099D
            if (r13 == 0) goto L4f
            if (r13 == 0) goto L4f
            B0.E0 r13 = B0.AbstractC0041g.j(r10)
            u0.g r13 = (u0.g) r13
            goto L50
        L4f:
            r13 = r2
        L50:
            if (r13 == 0) goto L68
            r0.f17105q = r10
            r0.f17106r = r11
            r0.f17109u = r4
            java.lang.Object r13 = r13.I(r11, r0)
            if (r13 != r5) goto L5f
            goto L7e
        L5f:
            r1 = r10
        L60:
            W0.p r13 = (W0.p) r13
            long r6 = r13.f8030a
        L64:
            r8 = r6
            r6 = r11
            r11 = r8
            goto L6c
        L68:
            r6 = 0
            r1 = r10
            goto L64
        L6c:
            u0.a r13 = r1.f17110E
            long r6 = W0.p.d(r6, r11)
            r0.f17105q = r2
            r0.f17106r = r11
            r0.f17109u = r3
            java.lang.Object r13 = r13.I(r6, r0)
            if (r13 != r5) goto L7f
        L7e:
            return r5
        L7f:
            W0.p r13 = (W0.p) r13
            long r0 = r13.f8030a
            long r11 = W0.p.e(r11, r0)
            W0.p r13 = new W0.p
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.g.I(long, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u0.InterfaceC1672a
    public final long b0(int i, long j) {
        boolean z5 = this.f10099D;
        g gVar = null;
        if (z5 && z5) {
            gVar = (g) AbstractC0041g.j(this);
        }
        long jB0 = gVar != null ? gVar.b0(i, j) : 0L;
        return C1130b.e(jB0, this.f17110E.b0(i, C1130b.d(j, jB0)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // u0.InterfaceC1672a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(long r13, long r15, q5.InterfaceC1524c r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof u0.e
            if (r1 == 0) goto L16
            r1 = r0
            u0.e r1 = (u0.e) r1
            int r2 = r1.f17104v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f17104v = r2
        L14:
            r7 = r1
            goto L1e
        L16:
            u0.e r1 = new u0.e
            s5.c r0 = (s5.c) r0
            r1.<init>(r12, r0)
            goto L14
        L1e:
            java.lang.Object r0 = r7.f17102t
            int r1 = r7.f17104v
            r8 = 2
            r2 = 1
            r5.a r9 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L45
            if (r1 == r2) goto L3b
            if (r1 != r8) goto L33
            long r1 = r7.f17100r
            m5.AbstractC1362a.e(r0)
            goto L91
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            long r1 = r7.f17101s
            long r3 = r7.f17100r
            u0.g r5 = r7.f17099q
            m5.AbstractC1362a.e(r0)
            goto L5f
        L45:
            m5.AbstractC1362a.e(r0)
            u0.a r0 = r12.f17110E
            r7.f17099q = r12
            r7.f17100r = r13
            r5 = r15
            r7.f17101s = r5
            r7.f17104v = r2
            r3 = r13
            r2 = r0
            java.lang.Object r0 = r2.n(r3, r5, r7)
            if (r0 != r9) goto L5c
            goto L8f
        L5c:
            r5 = r12
            r3 = r13
            r1 = r15
        L5f:
            W0.p r0 = (W0.p) r0
            long r10 = r0.f8030a
            boolean r0 = r5.f10099D
            r6 = 0
            if (r0 == 0) goto L75
            if (r0 == 0) goto L73
            if (r0 == 0) goto L73
            B0.E0 r0 = B0.AbstractC0041g.j(r5)
            u0.g r0 = (u0.g) r0
            goto L77
        L73:
            r0 = r6
            goto L77
        L75:
            u0.g r0 = r5.f17112G
        L77:
            if (r0 == 0) goto L97
            long r3 = W0.p.e(r3, r10)
            long r1 = W0.p.d(r1, r10)
            r7.f17099q = r6
            r7.f17100r = r10
            r7.f17104v = r8
            r5 = r1
            r2 = r0
            java.lang.Object r0 = r2.n(r3, r5, r7)
            if (r0 != r9) goto L90
        L8f:
            return r9
        L90:
            r1 = r10
        L91:
            W0.p r0 = (W0.p) r0
            long r3 = r0.f8030a
            r10 = r1
            goto L99
        L97:
            r3 = 0
        L99:
            long r0 = W0.p.e(r10, r3)
            W0.p r2 = new W0.p
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.g.n(long, long, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.E0
    public final Object o() {
        return this.f17113H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        d dVar = this.f17111F;
        dVar.f17095a = this;
        dVar.f17096b = null;
        this.f17112G = null;
        dVar.f17097c = new A0.d(28, this);
        dVar.f17098d = l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        y yVar = new y();
        AbstractC0041g.x(this, new C0106v(yVar, 2));
        g gVar = (g) ((E0) yVar.f14268q);
        this.f17112G = gVar;
        d dVar = this.f17111F;
        dVar.f17096b = gVar;
        if (dVar.f17095a == this) {
            dVar.f17095a = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0261w x0() {
        g gVar = this.f10099D ? (g) AbstractC0041g.j(this) : null;
        if (gVar != null) {
            return gVar.x0();
        }
        InterfaceC0261w interfaceC0261w = this.f17111F.f17098d;
        if (interfaceC0261w != null) {
            return interfaceC0261w;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
