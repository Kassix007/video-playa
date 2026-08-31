package I5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterator, InterfaceC1524c, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f2439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InterfaceC1524c f2440s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RuntimeException a() {
        int i = this.f2438q;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f2438q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Object obj, s5.h hVar) {
        this.f2439r = obj;
        this.f2438q = 3;
        this.f2440s = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return C1530i.f16022q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f2438q;
            if (i != 0) {
                break;
            }
            this.f2438q = 5;
            InterfaceC1524c interfaceC1524c = this.f2440s;
            kotlin.jvm.internal.m.b(interfaceC1524c);
            this.f2440s = null;
            interfaceC1524c.resumeWith(C1386y.f15098a);
        }
        if (i == 1) {
            kotlin.jvm.internal.m.b(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f2438q;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f2438q = 1;
            kotlin.jvm.internal.m.b(null);
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.f2438q = 0;
        Object obj = this.f2439r;
        this.f2439r = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        AbstractC1362a.e(obj);
        this.f2438q = 4;
    }
}
