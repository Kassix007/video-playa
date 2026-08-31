package h5;

import M.A;
import M.AbstractC0217k;
import M.C0213i;
import P.C0371o;
import P.C0372o0;
import U4.V;
import X.e;

/* JADX INFO: renamed from: h5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1127b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0213i f13458a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC0217k.c(AbstractC1126a.f13453a, 0L, 0L, 0L, 0L, AbstractC1126a.f13454b, 0L, 0L, 0L, AbstractC1126a.f13455c, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -546, 15);
        f13458a = AbstractC0217k.f(AbstractC1126a.f13456d, 0L, 0L, 0L, 0L, AbstractC1126a.f13457e, 0L, 0L, 0L, AbstractC1126a.f, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -546, 15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(e eVar, C0371o c0371o, int i, int i7) {
        int i8;
        e eVar2;
        C0371o c0371o2;
        c0371o.U(-1898197337);
        if ((i7 & 1) != 0) {
            i8 = i | 6;
        } else if ((i & 6) == 0) {
            i8 = (c0371o.h(false) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        int i9 = i8 | 48;
        if (c0371o.K(i9 & 1, (i9 & 147) != 146)) {
            c0371o.S(1193476023);
            c0371o.p(false);
            eVar2 = eVar;
            c0371o2 = c0371o;
            A.a(f13458a, null, AbstractC1128c.f13459a, eVar2, c0371o2, 3456);
        } else {
            eVar2 = eVar;
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new V(eVar2, i, i7);
        }
    }
}
