package M;

import P.C0345b;
import P.C0371o;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: renamed from: M.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0220l0 extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f3564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f3565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f3566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f3567t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3568u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0220l0(InterfaceC0725m interfaceC0725m, long j, float f, long j7, int i, int i7) {
        super(2);
        this.f3564q = interfaceC0725m;
        this.f3565r = j;
        this.f3566s = f;
        this.f3567t = j7;
        this.f3568u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iW = C0345b.w(391);
        q0.a(this.f3564q, this.f3565r, this.f3566s, this.f3567t, this.f3568u, (C0371o) obj, iW);
        return C1386y.f15098a;
    }
}
