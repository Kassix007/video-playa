package U;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f7490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f7491u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(g gVar, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f7490t = gVar;
        this.f7491u = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f7491u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f7491u;
        this.f7491u = obj;
        e eVar = (e) this.f7490t.f7505r;
        X.h hVar = eVar.f7498t;
        Object obj3 = this.f7488r;
        if (!hVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z5 = eVar.f7497s;
        if (!z5) {
            hVar.put(obj3, obj);
        } else {
            if (!z5) {
                throw new NoSuchElementException();
            }
            n nVar = eVar.f7495q[eVar.f7496r];
            Object obj4 = nVar.f7517q[nVar.f7519s];
            hVar.put(obj3, obj);
            eVar.c(obj4 != null ? obj4.hashCode() : 0, hVar.f8143r, obj4, 0);
        }
        eVar.f7501w = hVar.f8145t;
        return obj2;
    }
}
