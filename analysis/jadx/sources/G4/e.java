package G4;

import com.google.android.gms.internal.measurement.F2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Object f2006q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F2 f2007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile transient boolean f2008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient Object f2009t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(F2 f22) {
        this.f2007r = f22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // G4.d
    public final Object get() {
        if (!this.f2008s) {
            synchronized (this.f2006q) {
                try {
                    if (!this.f2008s) {
                        Object obj = this.f2007r.get();
                        this.f2009t = obj;
                        this.f2008s = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f2009t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f2008s) {
            obj = "<supplier that returned " + this.f2009t + ">";
        } else {
            obj = this.f2007r;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
