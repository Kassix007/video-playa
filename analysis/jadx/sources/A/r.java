package A;

import P.C0363k;
import P.C0371o;
import c0.C0714b;
import c0.C0715c;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0022t f140a = new C0022t(AbstractC0012i.f108c, C0714b.f10073B);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0022t a(InterfaceC0010g interfaceC0010g, C0715c c0715c, C0371o c0371o, int i) {
        if (kotlin.jvm.internal.m.a(interfaceC0010g, AbstractC0012i.f108c) && c0715c.equals(C0714b.f10073B)) {
            c0371o.S(346089448);
            c0371o.p(false);
            return f140a;
        }
        c0371o.S(346143295);
        boolean z5 = true;
        boolean z6 = (((i & 14) ^ 6) > 4 && c0371o.g(interfaceC0010g)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c0371o.g(c0715c)) && (i & 48) != 32) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object objH = c0371o.H();
        if (z7 || objH == C0363k.f5418a) {
            objH = new C0022t(interfaceC0010g, c0715c);
            c0371o.d0(objH);
        }
        C0022t c0022t = (C0022t) objH;
        c0371o.p(false);
        return c0022t;
    }
}
