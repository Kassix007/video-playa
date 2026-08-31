package s;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: s.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1585a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16411a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f16412b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f16413c = new Object[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int a(int i, int i7, int[] array) {
        m.e(array, "array");
        int i8 = i - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = array[i10];
            if (i11 < i7) {
                i9 = i10 + 1;
            } else {
                if (i11 <= i7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int b(long[] array, int i, long j) {
        m.e(array, "array");
        int i7 = i - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            long j7 = array[i9];
            if (j7 < j) {
                i8 = i9 + 1;
            } else {
                if (j7 <= j) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(String message) {
        m.e(message, "message");
        throw new IllegalArgumentException(message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(String message) {
        m.e(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(String message) {
        m.e(message, "message");
        throw new NoSuchElementException(message);
    }
}
