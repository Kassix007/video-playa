package A;

import c0.C0717e;
import java.util.List;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: A.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0020q implements InterfaceC1926C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0717e f138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0020q(C0717e c0717e, boolean z5) {
        this.f138a = c0717e;
        this.f139b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(B0.T t6, List list, long j) {
        boolean zIsEmpty = list.isEmpty();
        n5.t tVar = n5.t.f15300q;
        if (zIsEmpty) {
            return t6.f(W0.a.j(j), W0.a.i(j), tVar, C0015l.f116s);
        }
        long j7 = this.f139b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            InterfaceC1925B interfaceC1925B = (InterfaceC1925B) list.get(0);
            interfaceC1925B.g();
            AbstractC1933J abstractC1933JA = interfaceC1925B.a(j7);
            int iMax = Math.max(W0.a.j(j), abstractC1933JA.f18664q);
            int iMax2 = Math.max(W0.a.i(j), abstractC1933JA.f18665r);
            return t6.f(iMax, iMax2, tVar, new C0018o(abstractC1933JA, interfaceC1925B, t6, iMax, iMax2, this));
        }
        AbstractC1933J[] abstractC1933JArr = new AbstractC1933J[list.size()];
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f14266q = W0.a.j(j);
        kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
        wVar2.f14266q = W0.a.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1925B interfaceC1925B2 = (InterfaceC1925B) list.get(i);
            interfaceC1925B2.g();
            AbstractC1933J abstractC1933JA2 = interfaceC1925B2.a(j7);
            abstractC1933JArr[i] = abstractC1933JA2;
            wVar.f14266q = Math.max(wVar.f14266q, abstractC1933JA2.f18664q);
            wVar2.f14266q = Math.max(wVar2.f14266q, abstractC1933JA2.f18665r);
        }
        return t6.f(wVar.f14266q, wVar2.f14266q, tVar, new C0019p(abstractC1933JArr, list, t6, wVar, wVar2, this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0020q)) {
            return false;
        }
        C0020q c0020q = (C0020q) obj;
        return this.f138a.equals(c0020q.f138a) && this.f139b == c0020q.f139b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f139b) + (this.f138a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f138a + ", propagateMinConstraints=" + this.f139b + ')';
    }
}
