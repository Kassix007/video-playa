package G4;

import C0.Z0;
import com.google.android.gms.internal.measurement.F2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Z0 f2010t = new Z0(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f2011q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile d f2012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2013s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(F2 f22) {
        this.f2012r = f22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // G4.d
    public final Object get() {
        d dVar = this.f2012r;
        Z0 z02 = f2010t;
        if (dVar != z02) {
            synchronized (this.f2011q) {
                try {
                    if (this.f2012r != z02) {
                        Object obj = this.f2012r.get();
                        this.f2013s = obj;
                        this.f2012r = z02;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f2013s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Object obj = this.f2012r;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f2010t) {
            obj = "<supplier that returned " + this.f2013s + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
