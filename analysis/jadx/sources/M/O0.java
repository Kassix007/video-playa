package M;

/* JADX INFO: loaded from: classes.dex */
public final class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0.F f3362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0.F f3363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L0.F f3364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.F f3365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L0.F f3366e;
    public final L0.F f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L0.F f3367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L0.F f3368h;
    public final L0.F i;
    public final L0.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L0.F f3369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L0.F f3370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final L0.F f3371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final L0.F f3372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final L0.F f3373o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O0(L0.F f, int i) {
        L0.F f7 = O.n.f4260d;
        L0.F f8 = O.n.f4261e;
        L0.F f9 = O.n.f;
        L0.F f10 = O.n.f4262g;
        L0.F f11 = O.n.f4263h;
        L0.F f12 = O.n.i;
        L0.F f13 = O.n.f4266m;
        L0.F f14 = O.n.f4267n;
        L0.F f15 = O.n.f4268o;
        f = (i & 512) != 0 ? O.n.f4257a : f;
        L0.F f16 = O.n.f4258b;
        L0.F f17 = O.n.f4259c;
        L0.F f18 = O.n.j;
        L0.F f19 = O.n.f4264k;
        L0.F f20 = O.n.f4265l;
        this.f3362a = f7;
        this.f3363b = f8;
        this.f3364c = f9;
        this.f3365d = f10;
        this.f3366e = f11;
        this.f = f12;
        this.f3367g = f13;
        this.f3368h = f14;
        this.i = f15;
        this.j = f;
        this.f3369k = f16;
        this.f3370l = f17;
        this.f3371m = f18;
        this.f3372n = f19;
        this.f3373o = f20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        return kotlin.jvm.internal.m.a(this.f3362a, o02.f3362a) && kotlin.jvm.internal.m.a(this.f3363b, o02.f3363b) && kotlin.jvm.internal.m.a(this.f3364c, o02.f3364c) && kotlin.jvm.internal.m.a(this.f3365d, o02.f3365d) && kotlin.jvm.internal.m.a(this.f3366e, o02.f3366e) && kotlin.jvm.internal.m.a(this.f, o02.f) && kotlin.jvm.internal.m.a(this.f3367g, o02.f3367g) && kotlin.jvm.internal.m.a(this.f3368h, o02.f3368h) && kotlin.jvm.internal.m.a(this.i, o02.i) && kotlin.jvm.internal.m.a(this.j, o02.j) && kotlin.jvm.internal.m.a(this.f3369k, o02.f3369k) && kotlin.jvm.internal.m.a(this.f3370l, o02.f3370l) && kotlin.jvm.internal.m.a(this.f3371m, o02.f3371m) && kotlin.jvm.internal.m.a(this.f3372n, o02.f3372n) && kotlin.jvm.internal.m.a(this.f3373o, o02.f3373o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3373o.hashCode() + ((this.f3372n.hashCode() + ((this.f3371m.hashCode() + ((this.f3370l.hashCode() + ((this.f3369k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f3368h.hashCode() + ((this.f3367g.hashCode() + ((this.f.hashCode() + ((this.f3366e.hashCode() + ((this.f3365d.hashCode() + ((this.f3364c.hashCode() + ((this.f3363b.hashCode() + (this.f3362a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Typography(displayLarge=" + this.f3362a + ", displayMedium=" + this.f3363b + ",displaySmall=" + this.f3364c + ", headlineLarge=" + this.f3365d + ", headlineMedium=" + this.f3366e + ", headlineSmall=" + this.f + ", titleLarge=" + this.f3367g + ", titleMedium=" + this.f3368h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.f3369k + ", bodySmall=" + this.f3370l + ", labelLarge=" + this.f3371m + ", labelMedium=" + this.f3372n + ", labelSmall=" + this.f3373o + ')';
    }
}
