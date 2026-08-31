package e0;

/* JADX INFO: renamed from: e0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1017b extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC1018c f12475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public O5.b f12476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f12477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC1018c f12478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12479u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1017b(ViewOnAttachStateChangeListenerC1018c viewOnAttachStateChangeListenerC1018c, s5.c cVar) {
        super(cVar);
        this.f12478t = viewOnAttachStateChangeListenerC1018c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f12477s = obj;
        this.f12479u |= Integer.MIN_VALUE;
        return this.f12478t.d(this);
    }
}
