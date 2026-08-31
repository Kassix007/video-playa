package t;

import B0.T;
import P.W;
import u.o0;
import u.p0;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: t.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1612k extends AbstractC1600I {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public p0 f16615E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public W f16616F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C1613l f16617G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f16618H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(T t6, InterfaceC1925B interfaceC1925B, long j) {
        long j7;
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
        if (t6.r()) {
            j7 = (((long) abstractC1933JA.f18664q) << 32) | (((long) abstractC1933JA.f18665r) & 4294967295L);
        } else {
            p0 p0Var = this.f16615E;
            if (p0Var == null) {
                j7 = (((long) abstractC1933JA.f18664q) << 32) | (((long) abstractC1933JA.f18665r) & 4294967295L);
                this.f16618H = j7;
            } else {
                long j8 = (((long) abstractC1933JA.f18665r) & 4294967295L) | (((long) abstractC1933JA.f18664q) << 32);
                o0 o0VarA = p0Var.a(new C1611j(this, j8, 0), new C1611j(this, j8, 1));
                this.f16617G.getClass();
                j7 = ((W0.k) o0VarA.getValue()).f8021a;
                this.f16618H = ((W0.k) o0VarA.getValue()).f8021a;
            }
        }
        return t6.f((int) (j7 >> 32), (int) (4294967295L & j7), n5.t.f15300q, new C1610i(this, abstractC1933JA, j7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void r0() {
        this.f16618H = androidx.compose.animation.a.f9229a;
    }
}
