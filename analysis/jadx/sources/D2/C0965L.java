package d2;

import android.util.SparseArray;

/* JADX INFO: renamed from: d2.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0965L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f11997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11998b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0964K a(int i) {
        SparseArray sparseArray = this.f11997a;
        C0964K c0964k = (C0964K) sparseArray.get(i);
        if (c0964k != null) {
            return c0964k;
        }
        C0964K c0964k2 = new C0964K();
        sparseArray.put(i, c0964k2);
        return c0964k2;
    }
}
