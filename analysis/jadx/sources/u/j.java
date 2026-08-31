package U;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n5.h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f7509r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j(c cVar, int i) {
        this.f7508q = i;
        this.f7509r = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a, java.util.Collection
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.f7508q) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                c cVar = this.f7509r;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f7509r.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        switch (this.f7508q) {
            case 0:
                c cVar = this.f7509r;
                cVar.getClass();
                return cVar.f7494r;
            default:
                c cVar2 = this.f7509r;
                cVar2.getClass();
                return cVar2.f7494r;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f7508q) {
            case 0:
                m mVar = this.f7509r.f7493q;
                n[] nVarArr = new n[8];
                for (int i = 0; i < 8; i++) {
                    nVarArr[i] = new o(0);
                }
                return new k(mVar, nVarArr);
            default:
                m mVar2 = this.f7509r.f7493q;
                n[] nVarArr2 = new n[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    nVarArr2[i7] = new o(1);
                }
                return new k(mVar2, nVarArr2);
        }
    }
}
