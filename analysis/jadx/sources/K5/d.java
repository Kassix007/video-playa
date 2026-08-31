package K5;

import java.io.Serializable;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f2978s = new d(-31557014167219200L, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f2979t = new d(31556889864403199L, 999999999);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f2980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2981r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(long j, int i) {
        this.f2980q = j;
        this.f2981r = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d other = (d) obj;
        m.e(other, "other");
        long j = this.f2980q;
        long j7 = other.f2980q;
        int i = j < j7 ? -1 : j == j7 ? 0 : 1;
        return i != 0 ? i : m.f(this.f2981r, other.f2981r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2980q == dVar.f2980q && this.f2981r == dVar.f2981r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f2981r * 51) + Long.hashCode(this.f2980q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j7 = this.f2980q;
        long j8 = j7 / 86400;
        long j9 = 0;
        if ((j7 ^ 86400) < 0 && j8 * 86400 != j7) {
            j8--;
        }
        long j10 = j7 % 86400;
        int i = (int) (j10 + (86400 & (((j10 ^ 86400) & ((-j10) | j10)) >> 63)));
        long j11 = (j8 + ((long) 719528)) - ((long) 60);
        if (j11 < 0) {
            long j12 = 146097;
            long j13 = ((j11 + 1) / j12) - 1;
            j = 0;
            j9 = ((long) 400) * j13;
            j11 += (-j13) * j12;
        } else {
            j = 0;
        }
        long j14 = 400;
        long j15 = ((j14 * j11) + ((long) 591)) / ((long) 146097);
        long j16 = 365;
        long j17 = 4;
        long j18 = 100;
        long j19 = j11 - ((j15 / j14) + (((j15 / j17) + (j16 * j15)) - (j15 / j18)));
        if (j19 < j) {
            j15--;
            j19 = j11 - ((j15 / j14) + (((j15 / j17) + (j16 * j15)) - (j15 / j18)));
        }
        int i7 = (int) j19;
        int i8 = ((i7 * 5) + 2) / 153;
        int i9 = ((i8 + 2) % 12) + 1;
        int i10 = (i7 - (((i8 * 306) + 5) / 10)) + 1;
        int i11 = (int) (j15 + j9 + ((long) (i8 / 10)));
        int i12 = i / 3600;
        int i13 = i - (i12 * 3600);
        int i14 = i13 / 60;
        int i15 = i13 - (i14 * 60);
        int i16 = 0;
        if (Math.abs(i11) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i11 >= 0) {
                sb2.append(i11 + 10000);
                m.d(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(i11 - 10000);
                m.d(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i11 >= 10000) {
                sb.append('+');
            }
            sb.append(i11);
        }
        sb.append('-');
        f.f(sb, sb, i9);
        sb.append('-');
        f.f(sb, sb, i10);
        sb.append('T');
        f.f(sb, sb, i12);
        sb.append(':');
        f.f(sb, sb, i14);
        sb.append(':');
        f.f(sb, sb, i15);
        int i17 = this.f2981r;
        if (i17 != 0) {
            sb.append('.');
            while (true) {
                int i18 = i16 + 1;
                iArr = f.f2982a;
                if (i17 % iArr[i18] != 0) {
                    break;
                }
                i16 = i18;
            }
            int i19 = i16 - (i16 % 3);
            String strValueOf = String.valueOf((i17 / iArr[i19]) + iArr[9 - i19]);
            m.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            m.d(strSubstring, "substring(...)");
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }
}
