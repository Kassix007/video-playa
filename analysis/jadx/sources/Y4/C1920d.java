package y4;

import i1.C1134a;
import z4.InterfaceC1969c;

/* JADX INFO: renamed from: y4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1920d implements InterfaceC1969c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1134a f18632r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1920d(C1134a c1134a, int i) {
        this.f18631q = i;
        this.f18632r = c1134a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.InterfaceC1969c
    public final Object zza() {
        switch (this.f18631q) {
            case 0:
                return new C1919c(((C3.b) this.f18632r.f13535r).f1185a);
            default:
                return new k(((C3.b) this.f18632r.f13535r).f1185a);
        }
    }
}
