package Q2;

import q6.C1538g;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1538g f6559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6560r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f6561s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6562t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, s5.c cVar) {
        super(cVar);
        this.f6561s = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6560r = obj;
        this.f6562t |= Integer.MIN_VALUE;
        return q.b(this.f6561s, null, this);
    }
}
