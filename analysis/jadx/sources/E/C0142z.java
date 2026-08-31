package E;

import P.C0345b;
import P.C0371o;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: renamed from: E.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0142z extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B5.a f1607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f1608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f1609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.e f1610t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0142z(B5.a aVar, InterfaceC0725m interfaceC0725m, K k7, B5.e eVar, int i) {
        super(2);
        this.f1607q = aVar;
        this.f1608r = interfaceC0725m;
        this.f1609s = k7;
        this.f1610t = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iW = C0345b.w(1);
        C.a(this.f1607q, this.f1608r, this.f1609s, this.f1610t, (C0371o) obj, iW);
        return C1386y.f15098a;
    }
}
