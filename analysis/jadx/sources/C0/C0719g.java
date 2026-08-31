package c0;

import C0.S;

/* JADX INFO: renamed from: c0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0719g implements InterfaceC0725m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0725m f10091q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0725m f10092r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0719g(InterfaceC0725m interfaceC0725m, InterfaceC0725m interfaceC0725m2) {
        this.f10091q = interfaceC0725m;
        this.f10092r = interfaceC0725m2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.InterfaceC0725m
    public final boolean a(B5.c cVar) {
        return this.f10091q.a(cVar) && this.f10092r.a(cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.InterfaceC0725m
    public final Object b(Object obj, B5.e eVar) {
        return this.f10092r.b(this.f10091q.b(obj, eVar), eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0719g)) {
            return false;
        }
        C0719g c0719g = (C0719g) obj;
        return kotlin.jvm.internal.m.a(this.f10091q, c0719g.f10091q) && kotlin.jvm.internal.m.a(this.f10092r, c0719g.f10092r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f10092r.hashCode() * 31) + this.f10091q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return S.p(new StringBuilder("["), (String) b("", C0718f.f10090q), ']');
    }
}
