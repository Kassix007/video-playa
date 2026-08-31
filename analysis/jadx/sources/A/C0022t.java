package A;

import a.AbstractC0597a;
import c0.C0715c;
import java.util.List;
import z0.AbstractC1933J;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: A.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0022t implements InterfaceC1926C, M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0010g f147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0715c f148b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0022t(InterfaceC0010g interfaceC0010g, C0715c c0715c) {
        this.f147a = interfaceC0010g;
        this.f148b = c0715c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final InterfaceC1927D a(AbstractC1933J[] abstractC1933JArr, B0.T t6, int[] iArr, int i, int i7) {
        return t6.f(i7, i, n5.t.f15300q, new C0021s(abstractC1933JArr, this, i7, t6, iArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final int b(AbstractC1933J abstractC1933J) {
        return abstractC1933J.f18665r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(B0.T t6, List list, long j) {
        return C3.a.I(this, W0.a.i(j), W0.a.j(j), W0.a.g(j), W0.a.h(j), t6.G(this.f147a.a()), t6, list, new AbstractC1933J[list.size()], list.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final long d(int i, int i7, int i8, boolean z5) {
        return !z5 ? W0.b.a(0, i8, i, i7) : AbstractC0597a.w(0, i8, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final int e(AbstractC1933J abstractC1933J) {
        return abstractC1933J.f18664q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0022t)) {
            return false;
        }
        C0022t c0022t = (C0022t) obj;
        return kotlin.jvm.internal.m.a(this.f147a, c0022t.f147a) && this.f148b.equals(c0022t.f148b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.M
    public final void f(int i, int[] iArr, int[] iArr2, B0.T t6) {
        this.f147a.b(t6, i, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f148b.f10086a) + (this.f147a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f147a + ", horizontalAlignment=" + this.f148b + ')';
    }
}
