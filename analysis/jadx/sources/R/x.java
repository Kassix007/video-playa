package r;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f16258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16259b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(int i) {
        this.f16258a = i == 0 ? AbstractC1565p.f16234a : new long[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(long j) {
        int i = this.f16259b + 1;
        long[] jArr = this.f16258a;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.f16258a = jArrCopyOf;
        }
        long[] jArr2 = this.f16258a;
        int i7 = this.f16259b;
        jArr2[i7] = j;
        this.f16259b = i7 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            int i = xVar.f16259b;
            int i7 = this.f16259b;
            if (i == i7) {
                long[] jArr = this.f16258a;
                long[] jArr2 = xVar.f16258a;
                G5.d dVarO = D5.a.O(0, i7);
                int i8 = dVarO.f2017q;
                int i9 = dVarO.f2018r;
                if (i8 > i9) {
                    return true;
                }
                while (jArr[i8] == jArr2[i8]) {
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
        long[] jArr = this.f16258a;
        int i = this.f16259b;
        int iHashCode = 0;
        for (int i7 = 0; i7 < i; i7++) {
            iHashCode += Long.hashCode(jArr[i7]) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.f16258a;
        int i = this.f16259b;
        int i7 = 0;
        while (true) {
            if (i7 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i7];
            if (i7 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i7 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i7++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
