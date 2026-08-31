package N;

import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f3925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f3926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f3928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3929u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        this.f3928t = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f3927s = obj;
        this.f3929u |= Integer.MIN_VALUE;
        return this.f3928t.emit(null, this);
    }
}
