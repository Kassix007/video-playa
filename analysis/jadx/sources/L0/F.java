package L0;

import l0.AbstractC1220c;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F f3090d = new F(0, 0, null, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f3091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f3092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f3093c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(y yVar, q qVar, t tVar) {
        this.f3091a = yVar;
        this.f3092b = qVar;
        this.f3093c = tVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static F a(F f, long j, O0.j jVar, O0.p pVar, long j7, long j8, V0.i iVar, int i) {
        long jA = f.f3091a.f3227a.a();
        long j9 = (i & 2) != 0 ? f.f3091a.f3228b : j;
        O0.j jVar2 = (i & 4) != 0 ? f.f3091a.f3229c : jVar;
        y yVar = f.f3091a;
        O0.h hVar = yVar.f3230d;
        O0.i iVar2 = yVar.f3231e;
        O0.p pVar2 = (i & 32) != 0 ? yVar.f : pVar;
        String str = yVar.f3232g;
        long j10 = (i & 128) != 0 ? yVar.f3233h : j7;
        V0.a aVar = yVar.i;
        V0.q qVar = yVar.j;
        R0.b bVar = yVar.f3234k;
        long j11 = yVar.f3235l;
        V0.l lVar = yVar.f3236m;
        j0.D d5 = yVar.f3237n;
        AbstractC1220c abstractC1220c = yVar.f3238o;
        q qVar2 = f.f3092b;
        int i7 = qVar2.f3166a;
        int i8 = qVar2.f3167b;
        long j12 = (i & 131072) != 0 ? qVar2.f3168c : j8;
        V0.r rVar = qVar2.f3169d;
        t tVar = (i & 524288) != 0 ? f.f3093c : N.s.f3979a;
        return new F(new y(j0.o.c(jA, yVar.f3227a.a()) ? yVar.f3227a : jA != 16 ? new V0.c(jA) : V0.n.f7941a, j9, jVar2, hVar, iVar2, pVar2, str, j10, aVar, qVar, bVar, j11, lVar, d5, abstractC1220c), new q(i7, i8, j12, rVar, tVar != null ? tVar.f3176a : null, (i & 1048576) != 0 ? qVar2.f : iVar, qVar2.f3171g, qVar2.f3172h, qVar2.i), tVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static F c(F f, long j, long j7, O0.j jVar, long j8, int i, long j9, int i7) {
        long j10 = (i7 & 2) != 0 ? W0.n.f8027c : j7;
        O0.j jVar2 = (i7 & 4) != 0 ? null : jVar;
        long j11 = (i7 & 128) != 0 ? W0.n.f8027c : j8;
        long j12 = j0.o.f13722g;
        int i8 = (32768 & i7) != 0 ? Integer.MIN_VALUE : i;
        long j13 = (i7 & 131072) != 0 ? W0.n.f8027c : j9;
        y yVarA = z.a(f.f3091a, j, null, Float.NaN, j10, jVar2, null, null, null, null, j11, null, null, null, j12, null, null, null);
        q qVarA = r.a(f.f3092b, i8, Integer.MIN_VALUE, j13, null, null, null, 0, Integer.MIN_VALUE, null);
        return (f.f3091a == yVarA && f.f3092b == qVarA) ? f : new F(yVarA, qVarA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b() {
        return this.f3091a.f3227a.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f = (F) obj;
        return kotlin.jvm.internal.m.a(this.f3091a, f.f3091a) && kotlin.jvm.internal.m.a(this.f3092b, f.f3092b) && kotlin.jvm.internal.m.a(this.f3093c, f.f3093c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f3092b.hashCode() + (this.f3091a.hashCode() * 31)) * 31;
        t tVar = this.f3093c;
        return iHashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) j0.o.i(b()));
        sb.append(", brush=");
        y yVar = this.f3091a;
        sb.append(yVar.f3227a.b());
        sb.append(", alpha=");
        sb.append(yVar.f3227a.c());
        sb.append(", fontSize=");
        sb.append((Object) W0.n.d(yVar.f3228b));
        sb.append(", fontWeight=");
        sb.append(yVar.f3229c);
        sb.append(", fontStyle=");
        sb.append(yVar.f3230d);
        sb.append(", fontSynthesis=");
        sb.append(yVar.f3231e);
        sb.append(", fontFamily=");
        sb.append(yVar.f);
        sb.append(", fontFeatureSettings=");
        sb.append(yVar.f3232g);
        sb.append(", letterSpacing=");
        sb.append((Object) W0.n.d(yVar.f3233h));
        sb.append(", baselineShift=");
        sb.append(yVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(yVar.j);
        sb.append(", localeList=");
        sb.append(yVar.f3234k);
        sb.append(", background=");
        k1.i.r(yVar.f3235l, sb, ", textDecoration=");
        sb.append(yVar.f3236m);
        sb.append(", shadow=");
        sb.append(yVar.f3237n);
        sb.append(", drawStyle=");
        sb.append(yVar.f3238o);
        sb.append(", textAlign=");
        q qVar = this.f3092b;
        sb.append((Object) V0.k.a(qVar.f3166a));
        sb.append(", textDirection=");
        sb.append((Object) V0.m.a(qVar.f3167b));
        sb.append(", lineHeight=");
        sb.append((Object) W0.n.d(qVar.f3168c));
        sb.append(", textIndent=");
        sb.append(qVar.f3169d);
        sb.append(", platformStyle=");
        sb.append(this.f3093c);
        sb.append(", lineHeightStyle=");
        sb.append(qVar.f);
        sb.append(", lineBreak=");
        sb.append((Object) V0.e.a(qVar.f3171g));
        sb.append(", hyphens=");
        sb.append((Object) V0.d.a(qVar.f3172h));
        sb.append(", textMotion=");
        sb.append(qVar.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F(y yVar, q qVar) {
        yVar.getClass();
        s sVar = qVar.f3170e;
        this(yVar, qVar, sVar == null ? null : new t(sVar));
    }

    public F(long j, long j7, O0.j jVar, long j8, long j9, int i) {
        this(new y((i & 1) != 0 ? j0.o.f13722g : j, (i & 2) != 0 ? W0.n.f8027c : j7, (i & 4) != 0 ? null : jVar, null, null, (i & 32) != 0 ? null : O0.p.f4287a, null, (i & 128) != 0 ? W0.n.f8027c : j8, null, null, null, j0.o.f13722g, null, null), new q(Integer.MIN_VALUE, Integer.MIN_VALUE, (i & 131072) != 0 ? W0.n.f8027c : j9, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
