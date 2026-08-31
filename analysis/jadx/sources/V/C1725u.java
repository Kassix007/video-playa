package v;

import E.C0128k;
import android.view.MotionEvent;
import i0.C1130b;
import j0.AbstractC1145B;
import j0.C1152g;
import l0.InterfaceC1221d;
import m5.C1386y;
import v0.C1749r;
import v0.EnumC1747p;
import w.C1783g;
import w.C1801p;
import w.E0;
import w.EnumC1778d0;
import w.H0;
import w.j1;

/* JADX INFO: renamed from: v.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1725u extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f17395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f17396s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1725u(int i, Object obj, Object obj2) {
        super(1);
        this.f17394q = i;
        this.f17395r = obj;
        this.f17396s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f17394q;
        C1386y c1386y = C1386y.f15098a;
        Object obj2 = this.f17396s;
        Object obj3 = this.f17395r;
        switch (i) {
            case 0:
                B0.N n7 = (B0.N) obj;
                n7.a();
                InterfaceC1221d.j(n7, (C1152g) obj3, (AbstractC1145B) obj2, 0.0f, null, 60);
                return c1386y;
            case 1:
                ((y.i) obj3).b((y.h) obj2);
                return c1386y;
            case 2:
                MotionEvent motionEvent = (MotionEvent) obj;
                C1749r c1749r = (C1749r) obj2;
                if (motionEvent.getActionMasked() == 0) {
                    t2.e eVar = (t2.e) obj3;
                    Z0.d dVar = c1749r.f17489q;
                    if (dVar == null) {
                        kotlin.jvm.internal.m.k("onTouchEvent");
                        throw null;
                    }
                    eVar.f16685r = ((Boolean) dVar.invoke(motionEvent)).booleanValue() ? EnumC1747p.f17484r : EnumC1747p.f17485s;
                } else {
                    Z0.d dVar2 = c1749r.f17489q;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.m.k("onTouchEvent");
                        throw null;
                    }
                    dVar2.invoke(motionEvent);
                }
                return c1386y;
            case 3:
                ((C0128k) obj3).f1572a.l((C1783g) obj2);
                return c1386y;
            case 4:
                N.q qVar = (N.q) obj3;
                long jF = C1130b.f(((C1801p) obj).f18040a, 1.0f);
                EnumC1778d0 enumC1778d0 = ((w.H) obj2).f17786P;
                e3.u uVar = w.D.f17754a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (enumC1778d0 == EnumC1778d0.f17945q ? jF & 4294967295L : jF >> 32));
                N.r rVar = qVar.f3967a;
                N.o oVar = rVar.f3978n;
                float fE = rVar.e(fIntBitsToFloat);
                N.r rVar2 = oVar.f3963a;
                rVar2.j.f(fE);
                rVar2.f3975k.f(0.0f);
                return c1386y;
            case 5:
                E0 e02 = (E0) obj3;
                long j = ((C1801p) obj).f18040a;
                e02.a(1, ((H0) obj2).f17793d == EnumC1778d0.f17946r ? C1130b.a(1, j) : C1130b.a(2, j));
                return c1386y;
            default:
                ((Number) obj).longValue();
                j1 j1Var = (j1) obj3;
                float f = j1Var.f18013e;
                j1Var.f18013e = 0.0f;
                ((B5.c) obj2).invoke(Float.valueOf(f));
                return c1386y;
        }
    }
}
