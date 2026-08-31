package Q;

import P.AbstractC0373p;
import P.D0;
import P.InterfaceC0347c;
import P.V;

/* JADX INFO: renamed from: Q.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0417h extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0417h f6502c = new C0417h(0, 4, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        V v6 = (V) j.d(2);
        P.r rVar = (P.r) j.d(1);
        rVar.j(v6);
        AbstractC0373p.d("Could not resolve state for movable content");
        throw new C2.e();
    }
}
