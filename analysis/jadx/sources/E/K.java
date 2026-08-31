package E;

import B0.G0;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.n f1488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f1489b = new c0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G0 f1490c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public K(B5.c cVar) {
        this.f1488a = (kotlin.jvm.internal.n) cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final J a(int i, long j) {
        G0 g02 = this.f1490c;
        if (g02 == null) {
            return C0125h.f1566a;
        }
        b0 b0Var = new b0(g02, i, j, this.f1489b);
        ((d0) g02.f236t).a(b0Var);
        return b0Var;
    }
}
