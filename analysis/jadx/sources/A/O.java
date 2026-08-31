package A;

import P.C0363k;
import P.C0371o;
import c0.C0714b;
import c0.C0716d;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f37a = new Q(AbstractC0012i.f106a, C0714b.f10085z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Q a(InterfaceC0008e interfaceC0008e, C0716d c0716d, C0371o c0371o, int i) {
        if (kotlin.jvm.internal.m.a(interfaceC0008e, AbstractC0012i.f106a) && c0716d.equals(C0714b.f10085z)) {
            c0371o.S(-848964613);
            c0371o.p(false);
            return f37a;
        }
        c0371o.S(-848913742);
        boolean z5 = true;
        boolean z6 = (((i & 14) ^ 6) > 4 && c0371o.g(interfaceC0008e)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !c0371o.g(c0716d)) && (i & 48) != 32) {
            z5 = false;
        }
        boolean z7 = z6 | z5;
        Object objH = c0371o.H();
        if (z7 || objH == C0363k.f5418a) {
            objH = new Q(interfaceC0008e, c0716d);
            c0371o.d0(objH);
        }
        Q q7 = (Q) objH;
        c0371o.p(false);
        return q7;
    }
}
