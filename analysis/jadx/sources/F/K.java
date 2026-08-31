package F;

import v.W;

/* JADX INFO: loaded from: classes.dex */
public final class K extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N f1800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public W f1801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s5.i f1802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f1803t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N f1804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1805v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(N n7, s5.c cVar) {
        super(cVar);
        this.f1804u = n7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f1803t = obj;
        this.f1805v |= Integer.MIN_VALUE;
        return N.r(this.f1804u, null, null, this);
    }
}
