package P5;

import q5.InterfaceC1524c;

/* JADX INFO: renamed from: P5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0402m extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f6413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0403n f6415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f6416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC0398i f6417u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0402m(C0403n c0403n, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6415s = c0403n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6413q = obj;
        this.f6414r |= Integer.MIN_VALUE;
        return this.f6415s.collect(null, this);
    }
}
