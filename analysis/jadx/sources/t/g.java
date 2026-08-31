package T;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object[] f7339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f7340t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(int i, int i7, int i8, Object[] objArr, Object[] objArr2) {
        super(i, i7);
        this.f7339s = objArr2;
        int i9 = (i7 - 1) & (-32);
        this.f7340t = new j(objArr, i > i9 ? i9 : i, i9, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f7340t;
        if (jVar.hasNext()) {
            this.f7321q++;
            return jVar.next();
        }
        int i = this.f7321q;
        this.f7321q = i + 1;
        return this.f7339s[i - jVar.f7322r];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f7321q;
        j jVar = this.f7340t;
        int i7 = jVar.f7322r;
        if (i <= i7) {
            this.f7321q = i - 1;
            return jVar.previous();
        }
        int i8 = i - 1;
        this.f7321q = i8;
        return this.f7339s[i8 - i7];
    }
}
