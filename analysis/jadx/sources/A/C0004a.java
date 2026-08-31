package A;

import P.C0345b;
import P.C0354f0;
import w1.o0;

/* JADX INFO: renamed from: A.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0004a implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0354f0 f81c = C0345b.q(n1.b.f15124e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0354f0 f82d = C0345b.q(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0004a(int i, String str) {
        this.f79a = i;
        this.f80b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int a(W0.c cVar, W0.l lVar) {
        return e().f15127c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int b(W0.c cVar) {
        return e().f15128d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int c(W0.c cVar, W0.l lVar) {
        return e().f15125a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int d(W0.c cVar) {
        return e().f15126b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n1.b e() {
        return (n1.b) this.f81c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0004a) {
            return this.f79a == ((C0004a) obj).f79a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(o0 o0Var, int i) {
        int i7 = this.f79a;
        if (i == 0 || (i & i7) != 0) {
            this.f81c.setValue(o0Var.f18232a.g(i7));
            this.f82d.setValue(Boolean.valueOf(o0Var.f18232a.q(i7)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f79a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f80b);
        sb.append('(');
        sb.append(e().f15125a);
        sb.append(", ");
        sb.append(e().f15126b);
        sb.append(", ");
        sb.append(e().f15127c);
        sb.append(", ");
        return C0.S.o(sb, e().f15128d, ')');
    }
}
