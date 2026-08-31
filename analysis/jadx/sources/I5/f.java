package I5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, C5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Iterator f2427r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f2429t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f2430u;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2426q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2428s = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(g gVar) {
        this.f2430u = gVar;
        this.f2427r = new q((p) gVar.f2432b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        Object next;
        g gVar = (g) this.f2430u;
        do {
            Iterator it = this.f2427r;
            if (!it.hasNext()) {
                this.f2428s = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((m) gVar.f2433c).invoke(next)).booleanValue());
        this.f2429t = next;
        this.f2428s = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        Iterator it = this.f2427r;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((p) this.f2430u).f2448c.invoke(next)).booleanValue()) {
                this.f2428s = 1;
                this.f2429t = next;
                return;
            }
        }
        this.f2428s = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2426q) {
            case 0:
                if (this.f2428s == -1) {
                    a();
                }
                if (this.f2428s == 1) {
                }
                break;
            default:
                if (this.f2428s == -1) {
                    b();
                }
                if (this.f2428s == 1) {
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2426q) {
            case 0:
                if (this.f2428s == -1) {
                    a();
                }
                if (this.f2428s == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f2429t;
                this.f2429t = null;
                this.f2428s = -1;
                return obj;
            default:
                if (this.f2428s == -1) {
                    b();
                }
                if (this.f2428s == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f2429t;
                this.f2429t = null;
                this.f2428s = -1;
                return obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2426q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(p pVar) {
        this.f2430u = pVar;
        this.f2427r = pVar.f2447b.iterator();
    }
}
