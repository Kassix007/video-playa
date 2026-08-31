package M5;

/* JADX INFO: loaded from: classes.dex */
public abstract class O implements Runnable, Comparable, J {
    private volatile Object _heap;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3820r = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O(long j) {
        this.f3819q = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.J
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                E4.f fVar = AbstractC0263y.f3902b;
                if (obj == fVar) {
                    return;
                }
                P p7 = obj instanceof P ? (P) obj : null;
                if (p7 != null) {
                    synchronized (p7) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof R5.v ? (R5.v) obj2 : null) != null) {
                            p7.b(this.f3820r);
                        }
                    }
                }
                this._heap = fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(long j, P p7, Q q7) {
        synchronized (this) {
            if (this._heap == AbstractC0263y.f3902b) {
                return 2;
            }
            synchronized (p7) {
                try {
                    O[] oArr = p7.f7272a;
                    O o6 = oArr != null ? oArr[0] : null;
                    if (Q.f3824w.get(q7) == 1) {
                        return 1;
                    }
                    if (o6 == null) {
                        p7.f3821c = j;
                    } else {
                        long j7 = o6.f3819q;
                        if (j7 - j < 0) {
                            j = j7;
                        }
                        if (j - p7.f3821c > 0) {
                            p7.f3821c = j;
                        }
                    }
                    long j8 = this.f3819q;
                    long j9 = p7.f3821c;
                    if (j8 - j9 < 0) {
                        this.f3819q = j9;
                    }
                    p7.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f3819q - ((O) obj).f3819q;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(P p7) {
        if (this._heap == AbstractC0263y.f3902b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = p7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "Delayed[nanos=" + this.f3819q + ']';
    }
}
