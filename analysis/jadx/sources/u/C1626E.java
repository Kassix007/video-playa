package u;

import P.C0345b;
import P.C0354f0;
import P.S0;

/* JADX INFO: renamed from: u.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1626E implements S0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Number f16764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Number f16765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Z.m f16766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0354f0 f16767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n0 f16768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f16771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C1629H f16772y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1626E(C1629H c1629h, Number number, Number number2, Z.m mVar, C1625D c1625d) {
        this.f16772y = c1629h;
        this.f16764q = number;
        this.f16765r = number2;
        this.f16766s = mVar;
        this.f16767t = C0345b.q(number);
        this.f16768u = new n0(c1625d, mVar, this.f16764q, this.f16765r, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.S0
    public final Object getValue() {
        return this.f16767t.getValue();
    }
}
