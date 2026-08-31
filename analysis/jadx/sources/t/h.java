package T;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f7341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j f7343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7344v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(f fVar, int i) {
        super(i, fVar.f7338x);
        this.f7341s = fVar;
        this.f7342t = fVar.j();
        this.f7344v = -1;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        if (this.f7342t != this.f7341s.j()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.f7321q;
        f fVar = this.f7341s;
        fVar.add(i, obj);
        this.f7321q++;
        this.f7322r = fVar.d();
        this.f7342t = fVar.j();
        this.f7344v = -1;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f7341s;
        Object[] objArr = fVar.f7336v;
        if (objArr == null) {
            this.f7343u = null;
            return;
        }
        int i = (fVar.f7338x - 1) & (-32);
        int i7 = this.f7321q;
        if (i7 > i) {
            i7 = i;
        }
        int i8 = (fVar.f7334t / 5) + 1;
        j jVar = this.f7343u;
        if (jVar == null) {
            this.f7343u = new j(objArr, i7, i, i8);
            return;
        }
        jVar.f7321q = i7;
        jVar.f7322r = i;
        jVar.f7347s = i8;
        if (jVar.f7348t.length < i8) {
            jVar.f7348t = new Object[i8];
        }
        jVar.f7348t[0] = objArr;
        ?? r62 = i7 == i ? 1 : 0;
        jVar.f7349u = r62;
        jVar.b(i7 - r62, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f7321q;
        this.f7344v = i;
        j jVar = this.f7343u;
        f fVar = this.f7341s;
        if (jVar == null) {
            Object[] objArr = fVar.f7337w;
            this.f7321q = i + 1;
            return objArr[i];
        }
        if (jVar.hasNext()) {
            this.f7321q++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f7337w;
        int i7 = this.f7321q;
        this.f7321q = i7 + 1;
        return objArr2[i7 - jVar.f7322r];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f7321q;
        this.f7344v = i - 1;
        j jVar = this.f7343u;
        f fVar = this.f7341s;
        if (jVar == null) {
            Object[] objArr = fVar.f7337w;
            int i7 = i - 1;
            this.f7321q = i7;
            return objArr[i7];
        }
        int i8 = jVar.f7322r;
        if (i <= i8) {
            this.f7321q = i - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f7337w;
        int i9 = i - 1;
        this.f7321q = i9;
        return objArr2[i9 - i8];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.f7344v;
        if (i == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f7341s;
        fVar.g(i);
        int i7 = this.f7344v;
        if (i7 < this.f7321q) {
            this.f7321q = i7;
        }
        this.f7322r = fVar.d();
        this.f7342t = fVar.j();
        this.f7344v = -1;
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.f7344v;
        if (i == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f7341s;
        fVar.set(i, obj);
        this.f7342t = fVar.j();
        b();
    }
}
