package u2;

import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class q extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f17181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1691l f17183s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C1691l c1691l, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f17183s = c1691l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17181q = obj;
        this.f17182r |= Integer.MIN_VALUE;
        return this.f17183s.emit(null, this);
    }
}
