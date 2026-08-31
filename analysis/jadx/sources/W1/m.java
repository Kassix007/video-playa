package W1;

import D.u;
import T1.p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r.S;
import r.r;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8096q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f8098s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(u uVar) {
        this.f8098s = uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8096q + 1 < ((S) this.f8098s.f1291d).f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8097r = true;
        S s6 = (S) this.f8098s.f1291d;
        int i = this.f8096q + 1;
        this.f8096q = i;
        return (p) s6.g(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f8097r) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        S s6 = (S) this.f8098s.f1291d;
        ((p) s6.g(this.f8096q)).f7405s = null;
        int i = this.f8096q;
        Object[] objArr = s6.f16169s;
        Object obj = objArr[i];
        Object obj2 = r.f16241c;
        if (obj != obj2) {
            objArr[i] = obj2;
            s6.f16167q = true;
        }
        this.f8096q = i - 1;
        this.f8097r = false;
    }
}
