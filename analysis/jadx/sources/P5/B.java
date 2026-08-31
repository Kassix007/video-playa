package P5;

import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class B extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f6333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L.e f6335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f6336t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0398i f6337u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(L.e eVar, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6335s = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6333q = obj;
        this.f6334r |= Integer.MIN_VALUE;
        return this.f6335s.emit(null, this);
    }
}
