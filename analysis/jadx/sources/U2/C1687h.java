package u2;

import M5.AbstractC0263y;
import M5.H;
import android.graphics.drawable.Drawable;
import i1.C1134a;
import i3.C1136a;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import z0.C1949i;
import z0.InterfaceC1950j;

/* JADX INFO: renamed from: u2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1687h extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1693n f17150s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687h(C1693n c1693n, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17150s = c1693n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1687h c1687h = new C1687h(this.f17150s, interfaceC1524c);
        c1687h.f17149r = obj;
        return c1687h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1687h) create((D2.j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        C1693n c1693n;
        int i = this.f17148q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            D2.j jVar = (D2.j) this.f17149r;
            c1693n = this.f17150s;
            t2.l lVar = (t2.l) c1693n.f17170I.getValue();
            D2.h hVarA = D2.j.a(jVar);
            hVarA.f1384d = new C1134a(10, c1693n);
            hVarA.b();
            D2.d dVar = jVar.f1418z;
            if (dVar.f1373a == null) {
                hVarA.f1390m = new C1136a(11, c1693n);
                hVarA.b();
            }
            if (dVar.f1374b == null) {
                InterfaceC1950j interfaceC1950j = c1693n.f17165D;
                E2.e eVar = w.f17192b;
                hVarA.f1391n = (kotlin.jvm.internal.m.a(interfaceC1950j, C1949i.f18694a) || kotlin.jvm.internal.m.a(interfaceC1950j, C1949i.f18695b)) ? E2.g.f1685r : E2.g.f1684q;
            }
            if (dVar.f1375c != E2.d.f1679q) {
                hVarA.f = E2.d.f1680r;
            }
            D2.j jVarA = hVarA.a();
            this.f17149r = c1693n;
            this.f17148q = 1;
            lVar.getClass();
            if (jVarA.f1398c instanceof F2.a) {
                obj = AbstractC0263y.g(new t2.h(jVarA, null, lVar), this);
            } else {
                T5.e eVar2 = H.f3811a;
                obj = AbstractC0263y.B(R5.n.f7261a.f4044t, new t2.i(jVarA, null, lVar), this);
            }
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (obj == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1693n = (C1693n) this.f17149r;
            AbstractC1362a.e(obj);
        }
        D2.k kVar = (D2.k) obj;
        c1693n.getClass();
        if (kVar instanceof D2.r) {
            D2.r rVar = (D2.r) kVar;
            return new C1685f(c1693n.j(rVar.f1436a), rVar);
        }
        if (!(kVar instanceof D2.e)) {
            throw new C2.e();
        }
        D2.e eVar3 = (D2.e) kVar;
        Drawable drawable = eVar3.f1376a;
        return new C1683d(drawable != null ? c1693n.j(drawable) : null, eVar3);
    }
}
