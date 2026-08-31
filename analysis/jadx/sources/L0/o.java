package L0;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S0.d f3163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3165c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(S0.d dVar, int i, int i7) {
        this.f3163a = dVar;
        this.f3164b = i;
        this.f3165c = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f3163a.equals(oVar.f3163a) && this.f3164b == oVar.f3164b && this.f3165c == oVar.f3165c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f3165c) + k1.i.c(this.f3164b, this.f3163a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f3163a);
        sb.append(", startIndex=");
        sb.append(this.f3164b);
        sb.append(", endIndex=");
        return S.o(sb, this.f3165c, ')');
    }
}
