package J;

import L0.C0189a;
import L0.F;
import L0.p;
import W0.l;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f2463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O0.d f2464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2466e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2467g;
    public W0.c i;
    public C0189a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f2471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p f2472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f2473o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2468h = a.f2451a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f2474p = W0.b.g(0, 0, 0, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(String str, F f, O0.d dVar, int i, boolean z5, int i7, int i8) {
        this.f2462a = str;
        this.f2463b = f;
        this.f2464c = dVar;
        this.f2465d = i;
        this.f2466e = z5;
        this.f = i7;
        this.f2467g = i8;
        long j = 0;
        this.f2470l = (j & 4294967295L) | (j << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.j = null;
        this.f2472n = null;
        this.f2473o = null;
        this.f2474p = W0.b.g(0, 0, 0, 0);
        long j = 0;
        this.f2470l = (j & 4294967295L) | (j << 32);
        this.f2469k = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(W0.c cVar) {
        long jA;
        W0.c cVar2 = this.i;
        if (cVar != null) {
            int i = a.f2452b;
            jA = a.a(cVar.b(), cVar.l());
        } else {
            jA = a.f2451a;
        }
        if (cVar2 == null) {
            this.i = cVar;
            this.f2468h = jA;
        } else if (cVar == null || this.f2468h != jA) {
            this.i = cVar;
            this.f2468h = jA;
            a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        long j = this.f2468h;
        int i = a.f2452b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
