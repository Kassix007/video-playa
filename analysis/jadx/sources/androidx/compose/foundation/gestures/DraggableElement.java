package androidx.compose.foundation.gestures;

import B0.AbstractC0036d0;
import B0.C0050o;
import B5.f;
import c0.AbstractC0724l;
import k1.i;
import kotlin.jvm.internal.m;
import w.C1777d;
import w.EnumC1778d0;
import w.H;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0050o f9256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f9259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f9260u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DraggableElement(C0050o c0050o, boolean z5, boolean z6, f fVar, f fVar2) {
        this.f9256q = c0050o;
        this.f9257r = z5;
        this.f9258s = z6;
        this.f9259t = fVar;
        this.f9260u = fVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return m.a(this.f9256q, draggableElement.f9256q) && this.f9257r == draggableElement.f9257r && this.f9258s == draggableElement.f9258s && m.a(this.f9259t, draggableElement.f9259t) && m.a(this.f9260u, draggableElement.f9260u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C1777d c1777d = C1777d.f17940s;
        boolean z5 = this.f9257r;
        EnumC1778d0 enumC1778d0 = EnumC1778d0.f17945q;
        H h4 = new H(c1777d, z5, null, enumC1778d0);
        h4.f17785O = this.f9256q;
        h4.f17786P = enumC1778d0;
        h4.f17787Q = this.f9258s;
        h4.f17788R = this.f9259t;
        h4.f17789S = this.f9260u;
        return h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        boolean z5;
        boolean z6;
        H h4 = (H) abstractC0724l;
        C1777d c1777d = C1777d.f17940s;
        C0050o c0050o = h4.f17785O;
        C0050o c0050o2 = this.f9256q;
        if (m.a(c0050o, c0050o2)) {
            z5 = false;
        } else {
            h4.f17785O = c0050o2;
            z5 = true;
        }
        EnumC1778d0 enumC1778d0 = h4.f17786P;
        EnumC1778d0 enumC1778d02 = EnumC1778d0.f17945q;
        if (enumC1778d0 != enumC1778d02) {
            h4.f17786P = enumC1778d02;
            z6 = true;
        } else {
            z6 = z5;
        }
        h4.f17788R = this.f9259t;
        h4.f17789S = this.f9260u;
        h4.f17787Q = this.f9258s;
        h4.I0(c1777d, this.f9257r, null, enumC1778d02, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f9260u.hashCode() + ((this.f9259t.hashCode() + i.e(i.e((EnumC1778d0.f17945q.hashCode() + (this.f9256q.hashCode() * 31)) * 31, 961, this.f9257r), 31, this.f9258s)) * 31)) * 31);
    }
}
