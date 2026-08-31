package androidx.compose.ui.draw;

import B0.AbstractC0036d0;
import B0.AbstractC0041g;
import c0.AbstractC0724l;
import c0.C0717e;
import g0.f;
import i0.C1133e;
import j0.j;
import k1.i;
import kotlin.jvm.internal.m;
import o0.AbstractC1412b;
import z0.InterfaceC1950j;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC1412b f9316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0717e f9317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC1950j f9318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f9319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f9320u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PainterElement(AbstractC1412b abstractC1412b, C0717e c0717e, InterfaceC1950j interfaceC1950j, float f, j jVar) {
        this.f9316q = abstractC1412b;
        this.f9317r = c0717e;
        this.f9318s = interfaceC1950j;
        this.f9319t = f;
        this.f9320u = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return m.a(this.f9316q, painterElement.f9316q) && m.a(this.f9317r, painterElement.f9317r) && m.a(this.f9318s, painterElement.f9318s) && Float.compare(this.f9319t, painterElement.f9319t) == 0 && m.a(this.f9320u, painterElement.f9320u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        f fVar = new f();
        fVar.f12818E = this.f9316q;
        fVar.f12819F = true;
        fVar.f12820G = this.f9317r;
        fVar.f12821H = this.f9318s;
        fVar.f12822I = this.f9319t;
        fVar.f12823J = this.f9320u;
        return fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        f fVar = (f) abstractC0724l;
        boolean z5 = fVar.f12819F;
        AbstractC1412b abstractC1412b = this.f9316q;
        boolean z6 = (z5 && C1133e.a(fVar.f12818E.h(), abstractC1412b.h())) ? false : true;
        fVar.f12818E = abstractC1412b;
        fVar.f12819F = true;
        fVar.f12820G = this.f9317r;
        fVar.f12821H = this.f9318s;
        fVar.f12822I = this.f9319t;
        fVar.f12823J = this.f9320u;
        if (z6) {
            AbstractC0041g.m(fVar);
        }
        AbstractC0041g.l(fVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iB = i.b(this.f9319t, (this.f9318s.hashCode() + ((this.f9317r.hashCode() + i.e(this.f9316q.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        j jVar = this.f9320u;
        return iB + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f9316q + ", sizeToIntrinsics=true, alignment=" + this.f9317r + ", contentScale=" + this.f9318s + ", alpha=" + this.f9319t + ", colorFilter=" + this.f9320u + ')';
    }
}
