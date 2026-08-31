package d6;

import c3.C0733c;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f12418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f12419b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f12422e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w f12423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f12424h;
    public u i;
    public u j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f12426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public L.s f12427m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12420c = -1;
    public C0733c f = new C0733c(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(u uVar, String str) {
        if (uVar != null) {
            if (uVar.f12438w != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (uVar.f12439x != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (uVar.f12440y != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (uVar.f12441z != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final u a() {
        int i = this.f12420c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.f12420c).toString());
        }
        s sVar = this.f12418a;
        if (sVar == null) {
            throw new IllegalStateException("request == null");
        }
        r rVar = this.f12419b;
        if (rVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f12421d;
        if (str != null) {
            return new u(sVar, rVar, str, i, this.f12422e, this.f.d(), this.f12423g, this.f12424h, this.i, this.j, this.f12425k, this.f12426l, this.f12427m);
        }
        throw new IllegalStateException("message == null");
    }
}
