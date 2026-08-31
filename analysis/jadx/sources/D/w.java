package D;

import v.W;

/* JADX INFO: loaded from: classes.dex */
public final class w extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y f1296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public W f1297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s5.i f1298s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f1299t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f1300u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1301v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, s5.c cVar) {
        super(cVar);
        this.f1300u = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f1299t = obj;
        this.f1301v |= Integer.MIN_VALUE;
        return this.f1300u.e(null, null, this);
    }
}
