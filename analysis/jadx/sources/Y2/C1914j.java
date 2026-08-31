package y2;

import M2.k;

/* JADX INFO: renamed from: y2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1914j extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f18613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1913i f18614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f18616t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18617u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1914j(k kVar, s5.c cVar) {
        super(cVar);
        this.f18616t = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18615s = obj;
        this.f18617u |= Integer.MIN_VALUE;
        return this.f18616t.b(null, this);
    }
}
