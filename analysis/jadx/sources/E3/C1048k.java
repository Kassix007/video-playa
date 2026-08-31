package e3;

import P.C0345b;
import P.C0371o;
import a3.C0632k;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: renamed from: e3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048k extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0632k f12596q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f12597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f12598s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048k(C0632k c0632k, float f, InterfaceC0725m interfaceC0725m, int i) {
        super(2);
        this.f12596q = c0632k;
        this.f12597r = f;
        this.f12598s = interfaceC0725m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iW = C0345b.w(385);
        D5.a.e(this.f12596q, this.f12597r, this.f12598s, (C0371o) obj, iW);
        return C1386y.f15098a;
    }
}
