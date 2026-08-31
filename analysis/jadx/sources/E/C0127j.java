package E;

import z.AbstractC1923a;

/* JADX INFO: renamed from: E.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0127j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1571b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0127j(int i, int i7) {
        this.f1570a = i;
        this.f1571b = i7;
        if (!(i >= 0)) {
            AbstractC1923a.a("negative start index");
        }
        if (i7 >= i) {
            return;
        }
        AbstractC1923a.a("end index greater than start");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0127j)) {
            return false;
        }
        C0127j c0127j = (C0127j) obj;
        return this.f1570a == c0127j.f1570a && this.f1571b == c0127j.f1571b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f1571b) + (Integer.hashCode(this.f1570a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f1570a);
        sb.append(", end=");
        return C0.S.o(sb, this.f1571b, ')');
    }
}
