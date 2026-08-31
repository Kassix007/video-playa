package I5;

import com.google.android.gms.internal.measurement.K1;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import r.C1546E;
import r.C1547F;
import r.I;
import r.J;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f2435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f2437t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(Object obj, Map map) {
        this.f2434q = 1;
        this.f2435r = obj;
        this.f2437t = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        Object objInvoke;
        g gVar = (g) this.f2437t;
        if (this.f2436s == -2) {
            objInvoke = ((B5.a) gVar.f2432b).invoke();
        } else {
            B5.c cVar = (B5.c) gVar.f2433c;
            Object obj = this.f2435r;
            kotlin.jvm.internal.m.b(obj);
            objInvoke = cVar.invoke(obj);
        }
        this.f2435r = objInvoke;
        this.f2436s = objInvoke == null ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2434q) {
            case 0:
                if (this.f2436s < 0) {
                    a();
                }
                if (this.f2436s == 1) {
                }
                break;
            case 1:
                if (this.f2436s < ((Map) this.f2437t).size()) {
                }
                break;
        }
        return ((j) this.f2435r).hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2434q) {
            case 0:
                if (this.f2436s < 0) {
                    a();
                }
                if (this.f2436s == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f2435r;
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f2436s = -1;
                return obj;
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f2435r;
                this.f2436s++;
                Object obj3 = ((Map) this.f2437t).get(obj2);
                if (obj3 != null) {
                    this.f2435r = ((V.a) obj3).f7913b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
            case 2:
                return ((j) this.f2435r).next();
            default:
                return ((j) this.f2435r).next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2434q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                int i = this.f2436s;
                if (i != -1) {
                    ((C1547F) this.f2437t).f16132r.h(i);
                    this.f2436s = -1;
                    return;
                }
                return;
            default:
                int i7 = this.f2436s;
                if (i7 != -1) {
                    ((J) this.f2437t).f16156r.m(i7);
                    this.f2436s = -1;
                    return;
                }
                return;
        }
    }

    public h(g gVar) {
        this.f2434q = 0;
        this.f2437t = gVar;
        this.f2436s = -2;
    }

    public h(J j) {
        this.f2434q = 3;
        this.f2437t = j;
        this.f2436s = -1;
        this.f2435r = K1.w(new I(j, this, null));
    }

    public h(C1547F c1547f) {
        this.f2434q = 2;
        this.f2437t = c1547f;
        this.f2436s = -1;
        this.f2435r = K1.w(new C1546E(c1547f, this, null));
    }
}
