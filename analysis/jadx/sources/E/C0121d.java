package E;

import M5.C0247h;

/* JADX INFO: renamed from: E.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0121d extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0247h f1556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0122e f1558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1559t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0121d(C0122e c0122e, s5.c cVar) {
        super(cVar);
        this.f1558s = c0122e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f1557r = obj;
        this.f1559t |= Integer.MIN_VALUE;
        return this.f1558s.f(this);
    }
}
