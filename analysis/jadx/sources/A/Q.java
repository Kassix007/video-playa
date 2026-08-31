package A;

import a.AbstractC0597a;
import c0.C0716d;
import java.util.List;
import z0.AbstractC1933J;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements InterfaceC1926C, M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0008e f43a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0716d f44b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Q(InterfaceC0008e interfaceC0008e, C0716d c0716d) {
        this.f43a = interfaceC0008e;
        this.f44b = c0716d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final InterfaceC1927D a(AbstractC1933J[] abstractC1933JArr, B0.T t6, int[] iArr, int i, int i7) {
        return t6.f(i, i7, n5.t.f15300q, new P(abstractC1933JArr, this, i7, iArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final int b(AbstractC1933J abstractC1933J) {
        return abstractC1933J.f18664q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(B0.T t6, List list, long j) {
        return C3.a.I(this, W0.a.j(j), W0.a.i(j), W0.a.h(j), W0.a.g(j), t6.G(this.f43a.a()), t6, list, new AbstractC1933J[list.size()], list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final long d(int i, int i7, int i8, boolean z5) {
        return !z5 ? W0.b.a(i, i7, 0, i8) : AbstractC0597a.x(i, i7, 0, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final int e(AbstractC1933J abstractC1933J) {
        return abstractC1933J.f18665r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q7 = (Q) obj;
        return kotlin.jvm.internal.m.a(this.f43a, q7.f43a) && this.f44b.equals(q7.f44b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final void f(int i, int[] iArr, int[] iArr2, B0.T t6) {
        this.f43a.c(t6, i, iArr, t6.getLayoutDirection(), iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f44b.f10087a) + (this.f43a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f43a + ", verticalAlignment=" + this.f44b + ')';
    }
}
