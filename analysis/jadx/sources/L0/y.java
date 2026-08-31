package L0;

import j0.AbstractC1145B;
import l0.AbstractC1220c;

/* JADX INFO: loaded from: classes.dex */
public final class y implements InterfaceC0190b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V0.p f3227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O0.j f3229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O0.h f3230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O0.i f3231e;
    public final O0.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3233h;
    public final V0.a i;
    public final V0.q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final R0.b f3234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f3235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V0.l f3236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j0.D f3237n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC1220c f3238o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(long j, long j7, O0.j jVar, O0.h hVar, O0.i iVar, O0.p pVar, String str, long j8, V0.a aVar, V0.q qVar, R0.b bVar, long j9, V0.l lVar, j0.D d5) {
        this(j != 16 ? new V0.c(j) : V0.n.f7941a, j7, jVar, hVar, iVar, pVar, str, j8, aVar, qVar, bVar, j9, lVar, d5, (AbstractC1220c) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(y yVar) {
        if (this == yVar) {
            return true;
        }
        return W0.n.a(this.f3228b, yVar.f3228b) && kotlin.jvm.internal.m.a(this.f3229c, yVar.f3229c) && kotlin.jvm.internal.m.a(this.f3230d, yVar.f3230d) && kotlin.jvm.internal.m.a(this.f3231e, yVar.f3231e) && kotlin.jvm.internal.m.a(this.f, yVar.f) && kotlin.jvm.internal.m.a(this.f3232g, yVar.f3232g) && W0.n.a(this.f3233h, yVar.f3233h) && kotlin.jvm.internal.m.a(this.i, yVar.i) && kotlin.jvm.internal.m.a(this.j, yVar.j) && kotlin.jvm.internal.m.a(this.f3234k, yVar.f3234k) && j0.o.c(this.f3235l, yVar.f3235l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(y yVar) {
        return kotlin.jvm.internal.m.a(this.f3227a, yVar.f3227a) && kotlin.jvm.internal.m.a(this.f3236m, yVar.f3236m) && kotlin.jvm.internal.m.a(this.f3237n, yVar.f3237n) && kotlin.jvm.internal.m.a(this.f3238o, yVar.f3238o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final y c(y yVar) {
        if (yVar == null) {
            return this;
        }
        V0.p pVar = yVar.f3227a;
        return z.a(this, pVar.a(), pVar.b(), pVar.c(), yVar.f3228b, yVar.f3229c, yVar.f3230d, yVar.f3231e, yVar.f, yVar.f3232g, yVar.f3233h, yVar.i, yVar.j, yVar.f3234k, yVar.f3235l, yVar.f3236m, yVar.f3237n, yVar.f3238o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return a(yVar) && b(yVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        V0.p pVar = this.f3227a;
        long jA = pVar.a();
        int i = j0.o.f13723h;
        int iHashCode = Long.hashCode(jA) * 31;
        AbstractC1145B abstractC1145BB = pVar.b();
        int iHashCode2 = (Float.hashCode(pVar.c()) + ((iHashCode + (abstractC1145BB != null ? abstractC1145BB.hashCode() : 0)) * 31)) * 31;
        W0.o[] oVarArr = W0.n.f8026b;
        int iD = k1.i.d(iHashCode2, 31, this.f3228b);
        O0.j jVar = this.f3229c;
        int i7 = (iD + (jVar != null ? jVar.f4284q : 0)) * 31;
        O0.h hVar = this.f3230d;
        int iHashCode3 = (i7 + (hVar != null ? Integer.hashCode(hVar.f4278a) : 0)) * 31;
        O0.i iVar = this.f3231e;
        int iHashCode4 = (iHashCode3 + (iVar != null ? Integer.hashCode(iVar.f4279a) : 0)) * 31;
        O0.p pVar2 = this.f;
        int iHashCode5 = (iHashCode4 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        String str = this.f3232g;
        int iD2 = k1.i.d((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f3233h);
        V0.a aVar = this.i;
        int iHashCode6 = (iD2 + (aVar != null ? Float.hashCode(aVar.f7918a) : 0)) * 31;
        V0.q qVar = this.j;
        int iHashCode7 = (iHashCode6 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        R0.b bVar = this.f3234k;
        int iD3 = k1.i.d((iHashCode7 + (bVar != null ? bVar.f6692q.hashCode() : 0)) * 31, 31, this.f3235l);
        V0.l lVar = this.f3236m;
        int i8 = (iD3 + (lVar != null ? lVar.f7939a : 0)) * 31;
        j0.D d5 = this.f3237n;
        int iHashCode8 = (i8 + (d5 != null ? d5.hashCode() : 0)) * 961;
        AbstractC1220c abstractC1220c = this.f3238o;
        return iHashCode8 + (abstractC1220c != null ? abstractC1220c.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        V0.p pVar = this.f3227a;
        sb.append((Object) j0.o.i(pVar.a()));
        sb.append(", brush=");
        sb.append(pVar.b());
        sb.append(", alpha=");
        sb.append(pVar.c());
        sb.append(", fontSize=");
        sb.append((Object) W0.n.d(this.f3228b));
        sb.append(", fontWeight=");
        sb.append(this.f3229c);
        sb.append(", fontStyle=");
        sb.append(this.f3230d);
        sb.append(", fontSynthesis=");
        sb.append(this.f3231e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f3232g);
        sb.append(", letterSpacing=");
        sb.append((Object) W0.n.d(this.f3233h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.f3234k);
        sb.append(", background=");
        k1.i.r(this.f3235l, sb, ", textDecoration=");
        sb.append(this.f3236m);
        sb.append(", shadow=");
        sb.append(this.f3237n);
        sb.append(", platformStyle=null, drawStyle=");
        sb.append(this.f3238o);
        sb.append(')');
        return sb.toString();
    }

    public y(V0.p pVar, long j, O0.j jVar, O0.h hVar, O0.i iVar, O0.p pVar2, String str, long j7, V0.a aVar, V0.q qVar, R0.b bVar, long j8, V0.l lVar, j0.D d5, AbstractC1220c abstractC1220c) {
        this.f3227a = pVar;
        this.f3228b = j;
        this.f3229c = jVar;
        this.f3230d = hVar;
        this.f3231e = iVar;
        this.f = pVar2;
        this.f3232g = str;
        this.f3233h = j7;
        this.i = aVar;
        this.j = qVar;
        this.f3234k = bVar;
        this.f3235l = j8;
        this.f3236m = lVar;
        this.f3237n = d5;
        this.f3238o = abstractC1220c;
    }

    public y(long j, long j7, O0.j jVar, O0.h hVar, O0.i iVar, O0.p pVar, String str, long j8, V0.a aVar, V0.q qVar, R0.b bVar, long j9, V0.l lVar, j0.D d5, int i) {
        this((i & 1) != 0 ? j0.o.f13722g : j, (i & 2) != 0 ? W0.n.f8027c : j7, (i & 4) != 0 ? null : jVar, (i & 8) != 0 ? null : hVar, (i & 16) != 0 ? null : iVar, (i & 32) != 0 ? null : pVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? W0.n.f8027c : j8, (i & 256) != 0 ? null : aVar, (i & 512) != 0 ? null : qVar, (i & 1024) != 0 ? null : bVar, (i & 2048) != 0 ? j0.o.f13722g : j9, (i & 4096) != 0 ? null : lVar, (i & 8192) != 0 ? null : d5);
    }
}
