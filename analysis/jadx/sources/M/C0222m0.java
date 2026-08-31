package M;

import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1928E;

/* JADX INFO: renamed from: M.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0222m0 extends kotlin.jvm.internal.n implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0222m0 f3579q = new C0222m0(3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC1928E interfaceC1928E = (InterfaceC1928E) obj;
        long j = ((W0.a) obj3).f8007a;
        int iG = interfaceC1928E.G(q0.f3602a);
        int i = iG * 2;
        AbstractC1933J abstractC1933JA = ((InterfaceC1925B) obj2).a(W0.b.h(0, i, j));
        int i7 = abstractC1933JA.f18665r - i;
        return interfaceC1928E.f(abstractC1933JA.f18664q, i7, n5.t.f15300q, new D.v(iG, 1, abstractC1933JA));
    }
}
