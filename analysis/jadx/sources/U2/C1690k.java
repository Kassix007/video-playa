package u2;

import q5.InterfaceC1524c;

/* JADX INFO: renamed from: u2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1690k extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f17154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1691l f17156s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690k(C1691l c1691l, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f17156s = c1691l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17154q = obj;
        this.f17155r |= Integer.MIN_VALUE;
        return this.f17156s.emit(null, this);
    }
}
