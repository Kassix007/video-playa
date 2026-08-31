package Q;

import P.A0;
import P.AbstractC0373p;
import P.C0343a;
import P.D0;
import P.InterfaceC0347c;

/* JADX INFO: loaded from: classes.dex */
public final class t extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f6517c = new t(0, 3, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        A0 a02 = (A0) j.d(1);
        C0343a c0343a = (C0343a) j.d(0);
        C0412c c0412c = (C0412c) j.d(2);
        D0 d0I = a02.i();
        try {
            if (!c0412c.f6497p.U()) {
                AbstractC0373p.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            c0412c.f6496o.T(interfaceC0347c, d0I, jVar);
            d0I.e(true);
            d02.d();
            c0343a.getClass();
            d02.y(a02, a02.d(c0343a));
            d02.j();
        } catch (Throwable th) {
            d0I.e(false);
            throw th;
        }
    }
}
