package U4;

import P.C0345b;
import P.C0371o;
import R4.C0468k1;
import R4.C0517x;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7782s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f7783t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ X(int i, int i7, Object obj, Object obj2) {
        this.f7780q = i7;
        this.f7781r = obj;
        this.f7783t = obj2;
        this.f7782s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7780q) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC0534a.b((C0468k1) this.f7781r, (InterfaceC0725m) this.f7783t, (C0371o) obj, C0345b.w(this.f7782s | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iW = C0345b.w(385);
                AbstractC0534a.r((C0468k1) this.f7781r, this.f7782s, (InterfaceC0725m) this.f7783t, (C0371o) obj, iW);
                break;
            default:
                ((Integer) obj2).intValue();
                E3.h.i((C0517x) this.f7781r, (B5.c) this.f7783t, (C0371o) obj, C0345b.w(this.f7782s | 1));
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ X(C0468k1 c0468k1, int i, InterfaceC0725m interfaceC0725m, int i7) {
        this.f7780q = 1;
        this.f7781r = c0468k1;
        this.f7782s = i;
        this.f7783t = interfaceC0725m;
    }
}
