package U1;

import C0.S;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.W;
import R4.C0468k1;
import U4.C0539f;
import com.google.android.gms.internal.measurement.K1;
import e5.C1057b;
import m5.C1386y;
import m5.InterfaceC1366e;
import u.C1645d0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7578t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s(InterfaceC0261w interfaceC0261w, C1645d0 c1645d0, T1.d dVar) {
        this.f7575q = 1;
        this.f7577s = interfaceC0261w;
        this.f7578t = c1645d0;
        this.f7576r = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7575q) {
            case 0:
                ((Integer) obj2).getClass();
                K1.a((T1.d) this.f7576r, (Z.c) this.f7577s, (X.e) this.f7578t, (C0371o) obj, C0345b.w(385));
                break;
            case 1:
                InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f7577s;
                C1645d0 c1645d0 = (C1645d0) this.f7578t;
                T1.d dVar = (T1.d) this.f7576r;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                AbstractC0263y.t(interfaceC0261w, null, null, new z(fFloatValue, c1645d0, dVar, null), 3);
                break;
            case 2:
                ((Integer) obj2).getClass();
                Q2.g.f((C0468k1) this.f7576r, (C1057b) this.f7577s, (B5.a) this.f7578t, (C0371o) obj, C0345b.w(385));
                break;
            default:
                T1.u uVar = (T1.u) this.f7576r;
                C0468k1 c0468k1 = (C0468k1) this.f7577s;
                W w3 = (W) this.f7578t;
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strL = S.l(c0468k1.f7080h, c0468k1.i);
                    boolean zI = c0371o.i(c0468k1);
                    Object objH = c0371o.H();
                    if (zI || objH == C0363k.f5418a) {
                        objH = new C0539f(c0468k1, w3, 5);
                        c0371o.d0(objH);
                    }
                    l6.d.g(uVar, strL, null, null, null, null, null, null, (B5.c) objH, c0371o, 0);
                } else {
                    c0371o.N();
                }
                return C1386y.f15098a;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ s(T1.u uVar, C0468k1 c0468k1, W w3) {
        this.f7575q = 3;
        this.f7576r = uVar;
        this.f7577s = c0468k1;
        this.f7578t = w3;
    }

    public /* synthetic */ s(Object obj, Object obj2, InterfaceC1366e interfaceC1366e, int i, int i7) {
        this.f7575q = i7;
        this.f7576r = obj;
        this.f7577s = obj2;
        this.f7578t = interfaceC1366e;
    }
}
