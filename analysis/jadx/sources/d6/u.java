package d6;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f12428A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f12429B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final L.s f12430C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public c f12431D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f12432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f12433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f12434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12435t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final k f12436u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f12437v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f12438w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u f12439x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u f12440y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final u f12441z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(s request, r protocol, String message, int i, k kVar, l lVar, w wVar, u uVar, u uVar2, u uVar3, long j, long j7, L.s sVar) {
        kotlin.jvm.internal.m.e(request, "request");
        kotlin.jvm.internal.m.e(protocol, "protocol");
        kotlin.jvm.internal.m.e(message, "message");
        this.f12432q = request;
        this.f12433r = protocol;
        this.f12434s = message;
        this.f12435t = i;
        this.f12436u = kVar;
        this.f12437v = lVar;
        this.f12438w = wVar;
        this.f12439x = uVar;
        this.f12440y = uVar2;
        this.f12441z = uVar3;
        this.f12428A = j;
        this.f12429B = j7;
        this.f12430C = sVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(u uVar, String str) {
        uVar.getClass();
        String strD = uVar.f12437v.d(str);
        if (strD == null) {
            return null;
        }
        return strD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t b() {
        t tVar = new t();
        tVar.f12418a = this.f12432q;
        tVar.f12419b = this.f12433r;
        tVar.f12420c = this.f12435t;
        tVar.f12421d = this.f12434s;
        tVar.f12422e = this.f12436u;
        tVar.f = this.f12437v.h();
        tVar.f12423g = this.f12438w;
        tVar.f12424h = this.f12439x;
        tVar.i = this.f12440y;
        tVar.j = this.f12441z;
        tVar.f12425k = this.f12428A;
        tVar.f12426l = this.f12429B;
        tVar.f12427m = this.f12430C;
        return tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        w wVar = this.f12438w;
        if (wVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        wVar.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Response{protocol=" + this.f12433r + ", code=" + this.f12435t + ", message=" + this.f12434s + ", url=" + this.f12432q.f12413a + '}';
    }
}
