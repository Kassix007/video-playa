package p0;

/* JADX INFO: renamed from: p0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1437e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f15548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final O3.B f15549l = new O3.B(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15554e;
    public final C1431E f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15556h;
    public final boolean i;
    public final int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1437e(String str, float f, float f7, float f8, float f9, C1431E c1431e, long j, int i, boolean z5) {
        int i7;
        synchronized (f15549l) {
            i7 = f15548k;
            f15548k = i7 + 1;
        }
        this.f15550a = str;
        this.f15551b = f;
        this.f15552c = f7;
        this.f15553d = f8;
        this.f15554e = f9;
        this.f = c1431e;
        this.f15555g = j;
        this.f15556h = i;
        this.i = z5;
        this.j = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1437e)) {
            return false;
        }
        C1437e c1437e = (C1437e) obj;
        return kotlin.jvm.internal.m.a(this.f15550a, c1437e.f15550a) && W0.f.a(this.f15551b, c1437e.f15551b) && W0.f.a(this.f15552c, c1437e.f15552c) && this.f15553d == c1437e.f15553d && this.f15554e == c1437e.f15554e && this.f.equals(c1437e.f) && j0.o.c(this.f15555g, c1437e.f15555g) && this.f15556h == c1437e.f15556h && this.i == c1437e.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + k1.i.b(this.f15554e, k1.i.b(this.f15553d, k1.i.b(this.f15552c, k1.i.b(this.f15551b, this.f15550a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = j0.o.f13723h;
        return Boolean.hashCode(this.i) + k1.i.c(this.f15556h, k1.i.d(iHashCode, 31, this.f15555g), 31);
    }
}
