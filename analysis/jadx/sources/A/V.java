package A;

import P.C0345b;
import P.C0354f0;

/* JADX INFO: loaded from: classes.dex */
public final class V implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0354f0 f53b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V(G g7, String str) {
        this.f52a = str;
        this.f53b = C0345b.q(g7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int a(W0.c cVar, W0.l lVar) {
        return e().f16c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int b(W0.c cVar) {
        return e().f17d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int c(W0.c cVar, W0.l lVar) {
        return e().f14a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int d(W0.c cVar) {
        return e().f15b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final G e() {
        return (G) this.f53b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof V) {
            return kotlin.jvm.internal.m.a(e(), ((V) obj).e());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(G g7) {
        this.f53b.setValue(g7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f52a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52a);
        sb.append("(left=");
        sb.append(e().f14a);
        sb.append(", top=");
        sb.append(e().f15b);
        sb.append(", right=");
        sb.append(e().f16c);
        sb.append(", bottom=");
        return C0.S.o(sb, e().f17d, ')');
    }
}
