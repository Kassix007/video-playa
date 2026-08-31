package A;

/* JADX INFO: loaded from: classes.dex */
public final class I implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f20a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(W w3) {
        this.f20a = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int a(W0.c cVar, W0.l lVar) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int b(W0.c cVar) {
        return this.f20a.b(cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int c(W0.c cVar, W0.l lVar) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int d(W0.c cVar) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return kotlin.jvm.internal.m.a(this.f20a, ((I) obj).f20a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(32) + (this.f20a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f20a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = Q2.g.f6530a;
        if ((32 & i) == i) {
            Q2.g.P(sb3, "Start");
        }
        int i7 = Q2.g.f6532c;
        if ((32 & i7) == i7) {
            Q2.g.P(sb3, "Left");
        }
        int i8 = Q2.g.f6531b;
        if ((32 & i8) == i8) {
            Q2.g.P(sb3, "End");
        }
        int i9 = Q2.g.f6533d;
        if ((32 & i9) == i9) {
            Q2.g.P(sb3, "Right");
        }
        Q2.g.P(sb3, "Bottom");
        String string = sb3.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
