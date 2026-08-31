package F;

import M5.InterfaceC0261w;
import m5.C1386y;

/* JADX INFO: renamed from: F.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0165t extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f1921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0151e f1922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0261w f1923s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165t(boolean z5, C0151e c0151e, InterfaceC0261w interfaceC0261w) {
        super(1);
        this.f1921q = z5;
        this.f1922r = c0151e;
        this.f1923s = interfaceC0261w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        I0.i iVar = (I0.i) obj;
        boolean z5 = this.f1921q;
        InterfaceC0261w interfaceC0261w = this.f1923s;
        C0151e c0151e = this.f1922r;
        if (z5) {
            C0164s c0164s = new C0164s(c0151e, interfaceC0261w, 0);
            H5.k[] kVarArr = I0.r.f2326a;
            iVar.j(I0.h.f2253w, new I0.a(null, c0164s));
            iVar.j(I0.h.f2255y, new I0.a(null, new C0164s(c0151e, interfaceC0261w, 1)));
        } else {
            C0164s c0164s2 = new C0164s(c0151e, interfaceC0261w, 2);
            H5.k[] kVarArr2 = I0.r.f2326a;
            iVar.j(I0.h.f2254x, new I0.a(null, c0164s2));
            iVar.j(I0.h.f2256z, new I0.a(null, new C0164s(c0151e, interfaceC0261w, 3)));
        }
        return C1386y.f15098a;
    }
}
