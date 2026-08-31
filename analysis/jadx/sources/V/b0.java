package v;

import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A.L f17309b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b0() {
        long jC = AbstractC1145B.c(4284900966L);
        float f = 0;
        A.L l7 = new A.L(f, f, f, f);
        this.f17308a = jC;
        this.f17309b = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        b0 b0Var = (b0) obj;
        return j0.o.c(this.f17308a, b0Var.f17308a) && kotlin.jvm.internal.m.a(this.f17309b, b0Var.f17309b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = j0.o.f13723h;
        return this.f17309b.hashCode() + (Long.hashCode(this.f17308a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        k1.i.r(this.f17308a, sb, ", drawPadding=");
        sb.append(this.f17309b);
        sb.append(')');
        return sb.toString();
    }
}
