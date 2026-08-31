package T;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7325s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f7326t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Object[] objArr, int i, int i7) {
        super(i, i7);
        this.f7326t = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f7325s) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f7326t;
                int i = this.f7321q;
                this.f7321q = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f7321q++;
                return this.f7326t;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f7325s) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f7326t;
                int i = this.f7321q - 1;
                this.f7321q = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f7321q--;
                return this.f7326t;
        }
    }

    public d(int i, Object obj) {
        super(i, 1);
        this.f7326t = obj;
    }
}
