package L0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements InterfaceC0190b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V0.r f3169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f3170e;
    public final V0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3172h;
    public final V0.t i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(int i, int i7, long j, V0.r rVar, s sVar, V0.i iVar, int i8, int i9, V0.t tVar) {
        this.f3166a = i;
        this.f3167b = i7;
        this.f3168c = j;
        this.f3169d = rVar;
        this.f3170e = sVar;
        this.f = iVar;
        this.f3171g = i8;
        this.f3172h = i9;
        this.i = tVar;
        if (W0.n.a(j, W0.n.f8027c) || W0.n.c(j) >= 0.0f) {
            return;
        }
        Q0.a.b("lineHeight can't be negative (" + W0.n.c(j) + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q a(q qVar) {
        return qVar == null ? this : r.a(this, qVar.f3166a, qVar.f3167b, qVar.f3168c, qVar.f3169d, qVar.f3170e, qVar.f, qVar.f3171g, qVar.f3172h, qVar.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f3166a == qVar.f3166a && this.f3167b == qVar.f3167b && W0.n.a(this.f3168c, qVar.f3168c) && kotlin.jvm.internal.m.a(this.f3169d, qVar.f3169d) && kotlin.jvm.internal.m.a(this.f3170e, qVar.f3170e) && kotlin.jvm.internal.m.a(this.f, qVar.f) && this.f3171g == qVar.f3171g && this.f3172h == qVar.f3172h && kotlin.jvm.internal.m.a(this.i, qVar.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iC = k1.i.c(this.f3167b, Integer.hashCode(this.f3166a) * 31, 31);
        W0.o[] oVarArr = W0.n.f8026b;
        int iD = k1.i.d(iC, 31, this.f3168c);
        V0.r rVar = this.f3169d;
        int iHashCode = (iD + (rVar != null ? rVar.hashCode() : 0)) * 31;
        s sVar = this.f3170e;
        int iHashCode2 = (iHashCode + (sVar != null ? sVar.hashCode() : 0)) * 31;
        V0.i iVar = this.f;
        int iC2 = k1.i.c(this.f3172h, k1.i.c(this.f3171g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        V0.t tVar = this.i;
        return iC2 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) V0.k.a(this.f3166a)) + ", textDirection=" + ((Object) V0.m.a(this.f3167b)) + ", lineHeight=" + ((Object) W0.n.d(this.f3168c)) + ", textIndent=" + this.f3169d + ", platformStyle=" + this.f3170e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) V0.e.a(this.f3171g)) + ", hyphens=" + ((Object) V0.d.a(this.f3172h)) + ", textMotion=" + this.i + ')';
    }
}
