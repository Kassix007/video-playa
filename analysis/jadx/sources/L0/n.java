package L0;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0189a f3157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3161e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f3162g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(C0189a c0189a, int i, int i7, int i8, int i9, float f, float f7) {
        this.f3157a = c0189a;
        this.f3158b = i;
        this.f3159c = i7;
        this.f3160d = i8;
        this.f3161e = i9;
        this.f = f;
        this.f3162g = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i) {
        int i7 = this.f3159c;
        int i8 = this.f3158b;
        return D5.a.q(i, i8, i7) - i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3157a.equals(nVar.f3157a) && this.f3158b == nVar.f3158b && this.f3159c == nVar.f3159c && this.f3160d == nVar.f3160d && this.f3161e == nVar.f3161e && Float.compare(this.f, nVar.f) == 0 && Float.compare(this.f3162g, nVar.f3162g) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f3162g) + k1.i.b(this.f, k1.i.c(this.f3161e, k1.i.c(this.f3160d, k1.i.c(this.f3159c, k1.i.c(this.f3158b, this.f3157a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f3157a);
        sb.append(", startIndex=");
        sb.append(this.f3158b);
        sb.append(", endIndex=");
        sb.append(this.f3159c);
        sb.append(", startLineIndex=");
        sb.append(this.f3160d);
        sb.append(", endLineIndex=");
        sb.append(this.f3161e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return k1.i.j(sb, this.f3162g, ')');
    }
}
