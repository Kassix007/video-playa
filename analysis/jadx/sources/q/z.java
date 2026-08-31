package Q;

import P.AbstractC0373p;
import P.D0;
import P.InterfaceC0347c;

/* JADX INFO: loaded from: classes.dex */
public final class z extends I {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f6523c = new z(0, 0, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q.I
    public final void a(J j, InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        if (d02.f5298n != 0) {
            AbstractC0373p.c("Cannot reset when inserting");
        }
        d02.E();
        d02.f5304t = 0;
        d02.f5305u = d02.m() - d02.f5294h;
        d02.i = 0;
        d02.j = 0;
        d02.f5299o = 0;
    }
}
