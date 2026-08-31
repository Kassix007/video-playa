package p3;

/* JADX INFO: renamed from: p3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1471q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1471q f15821c = new C1471q(EnumC1470p.f15806q, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1471q f15822d = new C1471q(EnumC1470p.f15811v, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC1470p f15823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15824b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1471q(EnumC1470p enumC1470p, int i) {
        this.f15823a = enumC1470p;
        this.f15824b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1471q.class != obj.getClass()) {
            return false;
        }
        C1471q c1471q = (C1471q) obj;
        return this.f15823a == c1471q.f15823a && this.f15824b == c1471q.f15824b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15823a);
        sb.append(" ");
        int i = this.f15824b;
        sb.append(i != 1 ? i != 2 ? "null" : "slice" : "meet");
        return sb.toString();
    }
}
