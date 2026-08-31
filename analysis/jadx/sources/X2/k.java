package x2;

import k3.C1186a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f18366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1186a f18367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f18368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f18369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f18370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18371v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, s5.c cVar) {
        super(cVar);
        this.f18370u = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18369t = obj;
        this.f18371v |= Integer.MIN_VALUE;
        return this.f18370u.a(this);
    }
}
