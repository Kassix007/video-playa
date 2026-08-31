package f5;

import F.C0151e;
import P.C0345b;
import P.C0371o;
import c0.C0717e;
import c0.InterfaceC0725m;
import m5.C1386y;
import u2.C1693n;
import u2.u;
import z0.InterfaceC1950j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f12748q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f12749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f12752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f12753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f12754w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(int i, C0151e c0151e, String str, String str2, String str3, B5.c cVar, int i7) {
        this.f12750s = i;
        this.f12751t = c0151e;
        this.f12749r = str;
        this.f12752u = str2;
        this.f12753v = str3;
        this.f12754w = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12748q) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = C0345b.w(1);
                E3.h.g(this.f12750s, (C0151e) this.f12751t, this.f12749r, (String) this.f12752u, (String) this.f12753v, (B5.c) this.f12754w, (C0371o) obj, iW);
                break;
            default:
                ((Integer) obj2).getClass();
                u.c((InterfaceC0725m) this.f12751t, (C1693n) this.f12752u, this.f12749r, (C0717e) this.f12753v, (InterfaceC1950j) this.f12754w, (C0371o) obj, C0345b.w(this.f12750s | 1));
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ b(InterfaceC0725m interfaceC0725m, C1693n c1693n, String str, C0717e c0717e, InterfaceC1950j interfaceC1950j, int i) {
        this.f12751t = interfaceC0725m;
        this.f12752u = c1693n;
        this.f12749r = str;
        this.f12753v = c0717e;
        this.f12754w = interfaceC1950j;
        this.f12750s = i;
    }
}
