package C;

import v.W;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public A f694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public W f695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s5.i f696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ A f698u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f699v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a7, s5.c cVar) {
        super(cVar);
        this.f698u = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f697t = obj;
        this.f699v |= Integer.MIN_VALUE;
        return this.f698u.e(null, null, this);
    }
}
