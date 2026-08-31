package P5;

import q5.InterfaceC1524c;

/* JADX INFO: renamed from: P5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0405p extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0395f f6423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0395f f6425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6426t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0405p(C0395f c0395f, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6425s = c0395f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6424r = obj;
        this.f6426t |= Integer.MIN_VALUE;
        return this.f6425s.emit(null, this);
    }
}
