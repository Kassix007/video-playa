package U;

import java.util.Iterator;
import java.util.Map;
import n5.AbstractC1404g;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1404g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final X.h f7503r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f(int i, X.h hVar) {
        this.f7502q = i;
        this.f7503r = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f7502q) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f7502q) {
            case 0:
                this.f7503r.clear();
                break;
            default:
                this.f7503r.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f7502q) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                X.h hVar = this.f7503r;
                Object obj2 = hVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && hVar.containsKey(entry.getKey());
            default:
                return this.f7503r.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1404g
    public final int d() {
        switch (this.f7502q) {
            case 0:
                X.h hVar = this.f7503r;
                hVar.getClass();
                return hVar.f8146u;
            default:
                X.h hVar2 = this.f7503r;
                hVar2.getClass();
                return hVar2.f8146u;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7502q) {
            case 0:
                return new g(this.f7503r);
            default:
                n[] nVarArr = new n[8];
                for (int i = 0; i < 8; i++) {
                    nVarArr[i] = new o(1);
                }
                return new h(this.f7503r, nVarArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f7502q) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f7503r.remove(entry.getKey(), entry.getValue());
            default:
                X.h hVar = this.f7503r;
                if (!hVar.containsKey(obj)) {
                    return false;
                }
                hVar.remove(obj);
                return true;
        }
    }
}
