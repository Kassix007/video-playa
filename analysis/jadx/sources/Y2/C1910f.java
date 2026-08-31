package y2;

import M2.k;

/* JADX INFO: renamed from: y2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1910f extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1913i f18584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k f18585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1913i f18587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18588u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1910f(C1913i c1913i, s5.c cVar) {
        super(cVar);
        this.f18587t = c1913i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18586s = obj;
        this.f18588u |= Integer.MIN_VALUE;
        return this.f18587t.d(null, this);
    }
}
