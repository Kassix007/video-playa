package A;

import M.I0;
import M.J0;
import M5.InterfaceC0261w;
import java.io.Serializable;
import java.util.List;
import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;

/* JADX INFO: renamed from: A.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0019p extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f131q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f134t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Serializable f135u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f136v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f137w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0019p(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i) {
        super(1);
        this.f131q = i;
        this.f132r = obj;
        this.f133s = obj2;
        this.f134t = obj3;
        this.f135u = serializable;
        this.f136v = obj4;
        this.f137w = obj5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f131q;
        C1386y c1386y = C1386y.f15098a;
        Object obj2 = this.f137w;
        Object obj3 = this.f136v;
        Serializable serializable = this.f135u;
        Object obj4 = this.f134t;
        Object obj5 = this.f133s;
        Object obj6 = this.f132r;
        switch (i) {
            case 0:
                AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
                AbstractC1933J[] abstractC1933JArr = (AbstractC1933J[]) obj6;
                List list = (List) obj5;
                B0.T t6 = (B0.T) obj4;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) serializable;
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) obj3;
                C0020q c0020q = (C0020q) obj2;
                int length = abstractC1933JArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = i7;
                    AbstractC1933J abstractC1933J = abstractC1933JArr[i9];
                    kotlin.jvm.internal.m.c(abstractC1933J, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    int i10 = length;
                    AbstractC1932I abstractC1932I2 = abstractC1932I;
                    AbstractC0017n.b(abstractC1932I2, abstractC1933J, (InterfaceC1925B) list.get(i8), t6.getLayoutDirection(), wVar.f14266q, wVar2.f14266q, c0020q.f138a);
                    i7 = i9 + 1;
                    length = i10;
                    abstractC1932I = abstractC1932I2;
                    i8++;
                }
                break;
            default:
                I0.i iVar = (I0.i) obj;
                I0 i02 = (I0) obj6;
                String str = (String) obj4;
                String str2 = (String) serializable;
                InterfaceC0261w interfaceC0261w = (InterfaceC0261w) obj2;
                F.Q q7 = new F.Q((B5.a) obj3, 1);
                H5.k[] kVarArr = I0.r.f2326a;
                iVar.j(I0.h.f2250t, new I0.a((String) obj5, q7));
                J0 j02 = (J0) i02.f3322c.f3973g.getValue();
                J0 j03 = J0.f3325s;
                if (j02 == j03) {
                    iVar.j(I0.h.f2248r, new I0.a(str, new C.k(i02, interfaceC0261w, i02, 5)));
                } else if (i02.f3322c.d().f3997a.containsKey(j03)) {
                    iVar.j(I0.h.f2249s, new I0.a(str2, new B0.K(11, i02, interfaceC0261w)));
                }
                break;
        }
        return c1386y;
    }
}
