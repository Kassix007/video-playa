package androidx.compose.foundation;

import B0.AbstractC0036d0;
import c0.AbstractC0724l;
import j0.E;
import j0.o;
import k1.i;
import kotlin.jvm.internal.m;
import v.C1721p;

/* JADX INFO: loaded from: classes.dex */
final class BackgroundElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f9231q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f9232r = 1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final E f9233s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BackgroundElement(long j, E e7) {
        this.f9231q = j;
        this.f9233s = e7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && o.c(this.f9231q, backgroundElement.f9231q) && this.f9232r == backgroundElement.f9232r && m.a(this.f9233s, backgroundElement.f9233s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C1721p c1721p = new C1721p();
        c1721p.f17366E = this.f9231q;
        c1721p.f17367F = this.f9233s;
        c1721p.f17368G = 9205357640488583168L;
        return c1721p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        C1721p c1721p = (C1721p) abstractC0724l;
        c1721p.f17366E = this.f9231q;
        c1721p.f17367F = this.f9233s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = o.f13723h;
        return this.f9233s.hashCode() + i.b(this.f9232r, Long.hashCode(this.f9231q) * 961, 31);
    }
}
