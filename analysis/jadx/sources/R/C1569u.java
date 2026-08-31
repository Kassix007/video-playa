package r;

import java.util.Arrays;
import s.AbstractC1585a;

/* JADX INFO: renamed from: r.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1569u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16252b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1569u(int i) {
        this.f16251a = i == 0 ? AbstractC1562m.f16222a : new int[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        b(this.f16252b + 1);
        int[] iArr = this.f16251a;
        int i7 = this.f16252b;
        iArr[i7] = i;
        this.f16252b = i7 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        int[] iArr = this.f16251a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f16251a = iArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i) {
        if (i >= 0 && i < this.f16252b) {
            return this.f16251a[i];
        }
        AbstractC1585a.d("Index must be between 0 and size");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(int i) {
        int i7;
        if (i < 0 || i >= (i7 = this.f16252b)) {
            AbstractC1585a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f16251a;
        int i8 = iArr[i];
        if (i != i7 - 1) {
            n5.k.C0(i, i + 1, i7, iArr, iArr);
        }
        this.f16252b--;
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, int i7) {
        if (i < 0 || i >= this.f16252b) {
            AbstractC1585a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f16251a;
        int i8 = iArr[i];
        iArr[i] = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1569u) {
            C1569u c1569u = (C1569u) obj;
            int i = c1569u.f16252b;
            int i7 = this.f16252b;
            if (i == i7) {
                int[] iArr = this.f16251a;
                int[] iArr2 = c1569u.f16251a;
                G5.d dVarO = D5.a.O(0, i7);
                int i8 = dVarO.f2017q;
                int i9 = dVarO.f2018r;
                if (i8 > i9) {
                    return true;
                }
                while (iArr[i8] == iArr2[i8]) {
                    if (i8 == i9) {
                        return true;
                    }
                    i8++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f16251a;
        int i = this.f16252b;
        int iHashCode = 0;
        for (int i7 = 0; i7 < i; i7++) {
            iHashCode += Integer.hashCode(iArr[i7]) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f16251a;
        int i = this.f16252b;
        int i7 = 0;
        while (true) {
            if (i7 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i8 = iArr[i7];
            if (i7 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i7 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i8);
            i7++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (16 int) A[MD:(int):void (m)] (LINE:5) call: r.u.<init>(int):void type: THIS */
    public /* synthetic */ C1569u() {
        this(16);
    }
}
