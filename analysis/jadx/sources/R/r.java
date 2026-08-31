package r;

import java.util.ConcurrentModificationException;
import s.AbstractC1585a;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16239a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f16240b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16241c = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(S s6) {
        int i = s6.f16170t;
        int[] iArr = s6.f16168r;
        Object[] objArr = s6.f16169s;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj = objArr[i8];
            if (obj != f16241c) {
                if (i8 != i7) {
                    iArr[i7] = iArr[i8];
                    objArr[i7] = obj;
                    objArr[i8] = null;
                }
                i7++;
            }
        }
        s6.f16167q = false;
        s6.f16170t = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(C1555f c1555f, int i) {
        c1555f.f16199q = new int[i];
        c1555f.f16200r = new Object[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(C1555f c1555f, Object obj, int i) {
        int i7 = c1555f.f16201s;
        if (i7 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC1585a.a(i7, i, c1555f.f16199q);
            if (iA < 0 || kotlin.jvm.internal.m.a(obj, c1555f.f16200r[iA])) {
                return iA;
            }
            int i8 = iA + 1;
            while (i8 < i7 && c1555f.f16199q[i8] == i) {
                if (kotlin.jvm.internal.m.a(obj, c1555f.f16200r[i8])) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = iA - 1; i9 >= 0 && c1555f.f16199q[i9] == i; i9--) {
                if (kotlin.jvm.internal.m.a(obj, c1555f.f16200r[i9])) {
                    return i9;
                }
            }
            return ~i8;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
