package P;

import C0.C0080h0;

/* JADX INFO: renamed from: P.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0356g0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0080h0 f5405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B5.c f5406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0080h0 f5408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5409u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0356g0(C0080h0 c0080h0, s5.c cVar) {
        super(cVar);
        this.f5408t = c0080h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f5407s = obj;
        this.f5409u |= Integer.MIN_VALUE;
        return this.f5408t.e(null, this);
    }
}
