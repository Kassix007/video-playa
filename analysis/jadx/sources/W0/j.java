package W0;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f8016e = new j(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8020d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(int i, int i7, int i8, int i9) {
        this.f8017a = i;
        this.f8018b = i7;
        this.f8019c = i8;
        this.f8020d = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f8017a == jVar.f8017a && this.f8018b == jVar.f8018b && this.f8019c == jVar.f8019c && this.f8020d == jVar.f8020d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f8020d) + k1.i.c(this.f8019c, k1.i.c(this.f8018b, Integer.hashCode(this.f8017a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f8017a);
        sb.append(", ");
        sb.append(this.f8018b);
        sb.append(", ");
        sb.append(this.f8019c);
        sb.append(", ");
        return S.o(sb, this.f8020d, ')');
    }
}
