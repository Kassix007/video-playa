package Q;

import P.D0;
import P.InterfaceC0347c;
import P.Y;

/* JADX INFO: renamed from: Q.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0415f extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0415f f6500c = new C0415f(0, 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        X.f fVar = (X.f) j.d(1);
        int i = fVar != null ? fVar.f8141a : 0;
        C0410a c0410a = (C0410a) j.d(0);
        if (i > 0) {
            interfaceC0347c = new Y(interfaceC0347c, i);
        }
        c0410a.S(interfaceC0347c, d02, jVar);
    }
}
