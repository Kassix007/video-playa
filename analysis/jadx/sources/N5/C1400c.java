package n5;

import C0.S;
import com.google.android.gms.internal.measurement.K1;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: n5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1400c extends AbstractC1401d implements RandomAccess {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC1401d f15289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f15290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15291s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1400c(AbstractC1401d abstractC1401d, int i, int i7) {
        this.f15289q = abstractC1401d;
        this.f15290r = i;
        K1.j(i, i7, abstractC1401d.d());
        this.f15291s = i7 - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        return this.f15291s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        int i7 = this.f15291s;
        if (i < 0 || i >= i7) {
            throw new IndexOutOfBoundsException(S.j(i, i7, "index: ", ", size: "));
        }
        return this.f15289q.get(this.f15290r + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final List subList(int i, int i7) {
        K1.j(i, i7, this.f15291s);
        int i8 = this.f15290r;
        return new C1400c(this.f15289q, i + i8, i8 + i7);
    }
}
