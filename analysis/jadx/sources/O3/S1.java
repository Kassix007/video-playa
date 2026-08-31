package O3;

import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class S1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f4568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4569b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4570c = a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public S1(T1 t12) {
        this.f4568a = t12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a() {
        T1 t12 = this.f4568a;
        AbstractC1887A.g(t12);
        long jLongValue = ((Long) F.f4461v.a(null)).longValue();
        long jLongValue2 = ((Long) F.f4463w.a(null)).longValue();
        for (int i = 1; i < this.f4569b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        t12.e().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
