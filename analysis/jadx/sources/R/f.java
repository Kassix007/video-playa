package R;

import C0.S;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            c(i, size);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(List list, int i, int i7) {
        if (i > i7) {
            f(i, i7);
        }
        if (i < 0) {
            d(i);
        }
        if (i7 > list.size()) {
            e(i7, list.size());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void c(int i, int i7) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i7 + " elements.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void d(int i) {
        throw new IndexOutOfBoundsException(S.m("fromIndex (", ") is less than 0.", i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void e(int i, int i7) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i7 + ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void f(int i, int i7) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i7 + ").");
    }
}
