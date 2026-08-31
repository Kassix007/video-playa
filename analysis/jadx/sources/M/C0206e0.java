package M;

import P.C0345b;
import P.C0371o;
import m5.C1386y;

/* JADX INFO: renamed from: M.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0206e0 extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f3468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f3469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f3470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3471t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206e0(long j, B5.a aVar, boolean z5, int i) {
        super(2);
        this.f3468q = j;
        this.f3469r = aVar;
        this.f3470s = z5;
        this.f3471t = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC0210g0.c(this.f3468q, this.f3469r, this.f3470s, (C0371o) obj, C0345b.w(this.f3471t | 1));
        return C1386y.f15098a;
    }
}
