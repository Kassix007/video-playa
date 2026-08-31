package P5;

import q5.InterfaceC1524c;

/* JADX INFO: renamed from: P5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0394e extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f6395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0395f f6396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6397s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0394e(C0395f c0395f, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6396r = c0395f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6395q = obj;
        this.f6397s |= Integer.MIN_VALUE;
        return this.f6396r.emit(null, this);
    }
}
