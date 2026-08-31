package U;

import n5.AbstractC1402e;

/* JADX INFO: loaded from: classes.dex */
public class c extends AbstractC1402e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f7492s = new c(m.f7512e, 0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f7493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7494r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(m mVar, int i) {
        this.f7493q = mVar;
        this.f7494r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c a(Object obj, V.a aVar) {
        l lVarU = this.f7493q.u(obj != null ? obj.hashCode() : 0, 0, obj, aVar);
        return lVarU == null ? this : new c((m) lVarU.f7511r, this.f7494r + lVarU.f7510q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f7493q.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f7493q.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
