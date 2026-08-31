package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.C1377p;
import m5.C1379r;
import m5.C1381t;
import m5.C1384w;
import n5.AbstractC1401d;
import r.S;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1193b implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f14258s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1193b(int i, Object obj) {
        this.f14256q = i;
        this.f14258s = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14256q) {
            case 0:
                if (this.f14257r < ((Object[]) this.f14258s).length) {
                }
                break;
            case 1:
                if (this.f14257r < ((byte[]) this.f14258s).length) {
                }
                break;
            case 2:
                if (this.f14257r < ((int[]) this.f14258s).length) {
                }
                break;
            case 3:
                if (this.f14257r < ((long[]) this.f14258s).length) {
                }
                break;
            case 4:
                if (this.f14257r < ((short[]) this.f14258s).length) {
                }
                break;
            case 5:
                if (this.f14257r < ((AbstractC1401d) this.f14258s).d()) {
                }
                break;
            default:
                if (this.f14257r < ((S) this.f14258s).f()) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14256q) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f14258s;
                    int i = this.f14257r;
                    this.f14257r = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e7) {
                    this.f14257r--;
                    throw new NoSuchElementException(e7.getMessage());
                }
            case 1:
                int i7 = this.f14257r;
                byte[] bArr = (byte[]) this.f14258s;
                if (i7 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f14257r));
                }
                this.f14257r = i7 + 1;
                return new C1377p(bArr[i7]);
            case 2:
                int i8 = this.f14257r;
                int[] iArr = (int[]) this.f14258s;
                if (i8 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f14257r));
                }
                this.f14257r = i8 + 1;
                return new C1379r(iArr[i8]);
            case 3:
                int i9 = this.f14257r;
                long[] jArr = (long[]) this.f14258s;
                if (i9 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f14257r));
                }
                this.f14257r = i9 + 1;
                return new C1381t(jArr[i9]);
            case 4:
                int i10 = this.f14257r;
                short[] sArr = (short[]) this.f14258s;
                if (i10 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f14257r));
                }
                this.f14257r = i10 + 1;
                return new C1384w(sArr[i10]);
            case 5:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC1401d abstractC1401d = (AbstractC1401d) this.f14258s;
                int i11 = this.f14257r;
                this.f14257r = i11 + 1;
                return abstractC1401d.get(i11);
            default:
                S s6 = (S) this.f14258s;
                int i12 = this.f14257r;
                this.f14257r = i12 + 1;
                return s6.g(i12);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14256q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1193b(Object[] array) {
        this.f14256q = 0;
        m.e(array, "array");
        this.f14258s = array;
    }
}
