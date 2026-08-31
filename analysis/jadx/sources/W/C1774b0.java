package w;

import b2.C0690a;

/* JADX INFO: renamed from: w.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1774b0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0690a f17921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0690a f17923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17924t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1774b0(C0690a c0690a, s5.c cVar) {
        super(cVar);
        this.f17923s = c0690a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17922r = obj;
        this.f17924t |= Integer.MIN_VALUE;
        return this.f17923s.h(null, null, this);
    }
}
