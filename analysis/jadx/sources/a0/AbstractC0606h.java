package a0;

import B0.G0;

/* JADX INFO: renamed from: a0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0606h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f8661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8664d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0606h(long j, l lVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f8661a = lVar;
        this.f8662b = j;
        G0 g02 = n.f8679a;
        if (j != 0) {
            l lVarD = d();
            long j7 = lVarD.f8675s;
            long[] jArr = lVarD.f8676t;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j8 = lVarD.f8674r;
                if (j8 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
                } else {
                    long j9 = lVarD.f8673q;
                    if (j9 != 0) {
                        j7 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j9);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j7;
            }
            synchronized (n.f8680b) {
                iA = n.f8683e.a(j);
            }
        } else {
            iA = -1;
        }
        this.f8664d = iA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void q(AbstractC0606h abstractC0606h) {
        n.f8679a.T(abstractC0606h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (n.f8680b) {
            b();
            p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        n.f8681c = n.f8681c.g(g());
    }

    public abstract void c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l d() {
        return this.f8661a;
    }

    public abstract B5.c e();

    public abstract boolean f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long g() {
        return this.f8662b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int h() {
        return 0;
    }

    public abstract B5.c i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0606h j() {
        G0 g02 = n.f8679a;
        AbstractC0606h abstractC0606h = (AbstractC0606h) g02.s();
        g02.T(this);
        return abstractC0606h;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(u uVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        int i = this.f8664d;
        if (i >= 0) {
            n.u(i);
            this.f8664d = -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p() {
        o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(l lVar) {
        this.f8661a = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(long j) {
        this.f8662b = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract AbstractC0606h u(B5.c cVar);
}
