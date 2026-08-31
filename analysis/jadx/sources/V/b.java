package V;

import U.c;
import java.util.Iterator;
import n5.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements S.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f7914t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f7915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f7916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f7917s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        W.b bVar = W.b.f8006a;
        f7914t = new b(bVar, bVar, c.f7492s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(Object obj, Object obj2, c cVar) {
        this.f7915q = obj;
        this.f7916r = obj2;
        this.f7917s = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7917s.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        c cVar = this.f7917s;
        cVar.getClass();
        return cVar.f7494r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new I5.h(this.f7915q, this.f7917s);
    }
}
