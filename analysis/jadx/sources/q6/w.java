package q6;

import java.util.RandomAccess;
import n5.AbstractC1401d;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC1401d implements RandomAccess {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1541j[] f16091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f16092r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(C1541j[] c1541jArr, int[] iArr) {
        this.f16091q = c1541jArr;
        this.f16092r = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1541j) {
            return super.contains((C1541j) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        return this.f16091q.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        return this.f16091q[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1541j) {
            return super.indexOf((C1541j) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1541j) {
            return super.lastIndexOf((C1541j) obj);
        }
        return -1;
    }
}
