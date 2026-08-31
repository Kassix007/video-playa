package Q2;

import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class l extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y f6544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f6545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f6547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6548u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, s5.c cVar) {
        super(cVar);
        this.f6547t = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6546s = obj;
        this.f6548u |= Integer.MIN_VALUE;
        return this.f6547t.a(this);
    }
}
