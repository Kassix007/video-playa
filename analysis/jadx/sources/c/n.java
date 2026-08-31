package C;

import c0.C0715c;

/* JADX INFO: loaded from: classes.dex */
public final class n implements E.D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E.A f631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E.A f633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f634e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0715c f635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f636h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A f637k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(long j, h hVar, E.A a7, int i, int i7, C0715c c0715c, int i8, int i9, long j7, A a8) {
        this.f633d = a7;
        this.f634e = i;
        this.f = i7;
        this.f635g = c0715c;
        this.f636h = i8;
        this.i = i9;
        this.j = j7;
        this.f637k = a8;
        this.f630a = hVar;
        this.f631b = a7;
        this.f632c = W0.b.b(W0.a.h(j), Integer.MAX_VALUE, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t a(int i, long j) {
        h hVar = this.f630a;
        Object objB = hVar.b(i);
        Object objJ = hVar.f604b.j(i);
        return new t(i, this.f631b.a(i, j), this.f635g, this.f633d.f1471r.getLayoutDirection(), this.f636h, this.i, i == this.f634e + (-1) ? 0 : this.f, this.j, objB, objJ, this.f637k.f572m, j);
    }
}
