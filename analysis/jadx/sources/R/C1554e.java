package r;

import com.google.android.gms.internal.measurement.X2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: r.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1554e extends Q implements Map {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public X2 f16196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1551b f16197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1553d f16198v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1554e() {
        super(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        X2 x22 = this.f16196t;
        if (x22 != null) {
            return x22;
        }
        X2 x23 = new X2(this, 1);
        this.f16196t = x23;
        return x23;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k(Collection collection) {
        int i = this.f16166s;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f16166s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        C1551b c1551b = this.f16197u;
        if (c1551b != null) {
            return c1551b;
        }
        C1551b c1551b2 = new C1551b(this);
        this.f16197u = c1551b2;
        return c1551b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f16166s);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        C1553d c1553d = this.f16198v;
        if (c1553d != null) {
            return c1553d;
        }
        C1553d c1553d2 = new C1553d(this);
        this.f16198v = c1553d2;
        return c1553d2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554e(Q q7) {
        super(0);
        int i = q7.f16166s;
        b(this.f16166s + i);
        if (this.f16166s != 0) {
            for (int i7 = 0; i7 < i; i7++) {
                put(q7.f(i7), q7.i(i7));
            }
        } else if (i > 0) {
            n5.k.C0(0, 0, i, q7.f16164q, this.f16164q);
            n5.k.D0(0, 0, i << 1, q7.f16165r, this.f16165r);
            this.f16166s = i;
        }
    }
}
