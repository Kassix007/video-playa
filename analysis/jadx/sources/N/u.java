package N;

import A.J;
import B0.InterfaceC0060z;
import B0.K;
import B0.T;
import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.P1;
import m5.C1371j;
import w.EnumC1778d0;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public r f3981E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public B5.e f3982F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public EnumC1778d0 f3983G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f3984H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(T t6, InterfaceC1925B interfaceC1925B, long j) {
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
        if (!t6.r() || !this.f3984H) {
            C1371j c1371j = (C1371j) this.f3982F.invoke(new W0.k(P1.a(abstractC1933JA.f18664q, abstractC1933JA.f18665r)), new W0.a(j));
            r rVar = this.f3981E;
            y yVar = (y) c1371j.f15080q;
            Object obj = c1371j.f15081r;
            if (!kotlin.jvm.internal.m.a(rVar.d(), yVar)) {
                rVar.f3977m.setValue(yVar);
                x xVar = rVar.f3972e;
                K k7 = new K(12, rVar, obj);
                U5.c cVar = xVar.f3996b;
                boolean zF = cVar.f();
                if (zF) {
                    try {
                        k7.invoke();
                    } finally {
                        cVar.g(null);
                    }
                }
                if (!zF) {
                    rVar.h(obj);
                }
            }
        }
        this.f3984H = t6.r() || this.f3984H;
        return t6.f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, n5.t.f15300q, new J(t6, this, abstractC1933JA));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        this.f3984H = false;
    }
}
