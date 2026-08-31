package F;

import u.C1649f0;

/* JADX INFO: loaded from: classes.dex */
public final class G extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N f1784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1649f0 f1785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f1787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N f1788u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1789v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(N n7, s5.c cVar) {
        super(cVar);
        this.f1788u = n7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f1787t = obj;
        this.f1789v |= Integer.MIN_VALUE;
        return this.f1788u.f(0, null, this);
    }
}
