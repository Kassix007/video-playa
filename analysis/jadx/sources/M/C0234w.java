package M;

import P.C0345b;
import P.C0371o;
import c0.InterfaceC0725m;
import m5.C1386y;
import o0.AbstractC1412b;

/* JADX INFO: renamed from: M.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0234w extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC1412b f3644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f3645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f3646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3647t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234w(AbstractC1412b abstractC1412b, InterfaceC0725m interfaceC0725m, long j, int i) {
        super(2);
        this.f3644q = abstractC1412b;
        this.f3645r = interfaceC0725m;
        this.f3646s = j;
        this.f3647t = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC0235x.a(this.f3644q, this.f3645r, this.f3646s, (C0371o) obj, C0345b.w(this.f3647t | 1));
        return C1386y.f15098a;
    }
}
