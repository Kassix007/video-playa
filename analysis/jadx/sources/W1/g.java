package W1;

import kotlin.jvm.internal.u;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u f8054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f8055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f8056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f8057t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n5.j f8058u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g(u uVar, u uVar2, j jVar, boolean z5, n5.j jVar2) {
        this.f8054q = uVar;
        this.f8055r = uVar2;
        this.f8056s = jVar;
        this.f8057t = z5;
        this.f8058u = jVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        T1.d entry = (T1.d) obj;
        kotlin.jvm.internal.m.e(entry, "entry");
        this.f8054q.f14264q = true;
        this.f8055r.f14264q = true;
        this.f8056s.m(entry, this.f8057t, this.f8058u);
        return C1386y.f15098a;
    }
}
