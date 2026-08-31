package T;

import com.google.android.gms.internal.measurement.K1;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object[] f7348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7349u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i, int i7, int i8) {
        super(i, i7);
        this.f7347s = i8;
        Object[] objArr2 = new Object[i8];
        this.f7348t = objArr2;
        ?? r52 = i == i7 ? 1 : 0;
        this.f7349u = r52;
        objArr2[0] = objArr;
        b(i - r52, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a() {
        int i = this.f7321q & 31;
        Object obj = this.f7348t[this.f7347s - 1];
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, int i7) {
        int i8 = (this.f7347s - i7) * 5;
        while (i7 < this.f7347s) {
            Object[] objArr = this.f7348t;
            Object obj = objArr[i7 - 1];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i7] = ((Object[]) obj)[K1.u(i, i8)];
            i8 -= 5;
            i7++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        int i7 = 0;
        while (K1.u(this.f7321q, i7) == i) {
            i7 += 5;
        }
        if (i7 > 0) {
            b(this.f7321q, ((this.f7347s - 1) - (i7 / 5)) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i = this.f7321q + 1;
        this.f7321q = i;
        if (i == this.f7322r) {
            this.f7349u = true;
            return objA;
        }
        c(0);
        return objA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f7321q--;
        if (this.f7349u) {
            this.f7349u = false;
            return a();
        }
        c(31);
        return a();
    }
}
