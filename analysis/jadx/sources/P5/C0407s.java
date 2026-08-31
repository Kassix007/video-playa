package P5;

import q5.InterfaceC1524c;

/* JADX INFO: renamed from: P5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0407s extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N.f f6437q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f6438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f6439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ N.f f6440t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f6441u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0407s(N.f fVar, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f6440t = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6439s = obj;
        this.f6441u |= Integer.MIN_VALUE;
        return this.f6440t.emit(null, this);
    }
}
