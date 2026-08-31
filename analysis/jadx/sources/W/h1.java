package w;

import m5.InterfaceC1366e;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j1 f17982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC1366e f17983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B5.a f17984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f17985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f17986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j1 f17987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17988w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, s5.c cVar) {
        super(cVar);
        this.f17987v = j1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17986u = obj;
        this.f17988w |= Integer.MIN_VALUE;
        return this.f17987v.a(null, null, this);
    }
}
