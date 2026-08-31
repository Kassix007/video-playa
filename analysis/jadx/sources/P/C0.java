package P;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int a(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int b(ArrayList arrayList, int i, int i7) {
        int iE = e(arrayList, i, i7);
        return iE >= 0 ? iE : -(iE + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(int[] iArr, int i) {
        int i7 = i * 5;
        return Integer.bitCount(iArr[i7 + 1] >> 28) + iArr[i7 + 4];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(int i, int i7, int[] iArr) {
        if (i7 >= 0) {
        }
        int i8 = (i * 5) + 1;
        iArr[i8] = i7 | (iArr[i8] & (-67108864));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(ArrayList arrayList, int i, int i7) {
        int size = arrayList.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int i10 = ((C0343a) arrayList.get(i9)).f5384a;
            if (i10 < 0) {
                i10 += i7;
            }
            int iF = kotlin.jvm.internal.m.f(i10, i);
            if (iF < 0) {
                i8 = i9 + 1;
            } else {
                if (iF <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
