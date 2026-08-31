package E1;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f1670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f1671b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(int i) {
        this.f1670a = new SparseArray(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(A a7, int i, int i7) {
        int iA = a7.a(i);
        SparseArray sparseArray = this.f1670a;
        x xVar = sparseArray == null ? null : (x) sparseArray.get(iA);
        if (xVar == null) {
            xVar = new x(1);
            sparseArray.put(a7.a(i), xVar);
        }
        if (i7 > i) {
            xVar.a(a7, i + 1, i7);
        } else {
            xVar.f1671b = a7;
        }
    }
}
