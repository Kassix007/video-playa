package e3;

import P.C0345b;
import P.C0371o;
import a3.C0632k;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: renamed from: e3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1045h extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12583q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0632k f12584r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.a f12585s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f12586t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12587u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1045h(C0632k c0632k, B5.a aVar, InterfaceC0725m interfaceC0725m, int i, int i7, int i8) {
        super(2);
        this.f12583q = i8;
        this.f12584r = c0632k;
        this.f12585s = aVar;
        this.f12586t = interfaceC0725m;
        this.f12587u = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12583q) {
            case 0:
                ((Number) obj2).intValue();
                D5.a.f(this.f12584r, this.f12585s, this.f12586t, (C0371o) obj, C0345b.w(1073742217), C0345b.w(this.f12587u));
                break;
            default:
                ((Number) obj2).intValue();
                D5.a.f(this.f12584r, this.f12585s, this.f12586t, (C0371o) obj, C0345b.w(1073742217), C0345b.w(this.f12587u));
                break;
        }
        return C1386y.f15098a;
    }
}
