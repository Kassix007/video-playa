package u;

import M5.C0247h;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U5.c f17079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public O3.D0 f17080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O3.D0 f17082t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(O3.D0 d02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17082t = d02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new x0(this.f17082t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, m5.h] */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        O3.D0 d02;
        U5.c cVar;
        int i = this.f17081s;
        if (i == 0) {
            AbstractC1362a.e(obj);
            d02 = this.f17082t;
            C1645d0 c1645d0 = (C1645d0) d02;
            c1645d0.getClass();
            ((a0.t) y0.f17085a.getValue()).c(c1645d0, m0.f16987t, c1645d0.f16912x);
            U5.c cVar2 = c1645d0.f16899A;
            this.f17079q = cVar2;
            this.f17080r = d02;
            this.f17081s = 1;
            Object objE = cVar2.e(this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objE == enumC1580a) {
                return enumC1580a;
            }
            cVar = cVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d02 = this.f17080r;
            cVar = this.f17079q;
            AbstractC1362a.e(obj);
        }
        try {
            ((C1645d0) d02).f16909u = d02.k();
            C0247h c0247h = ((C1645d0) d02).f16914z;
            if (c0247h != null) {
                c0247h.resumeWith(d02.k());
            }
            ((C1645d0) d02).f16914z = null;
            cVar.g(null);
            return C1386y.f15098a;
        } catch (Throwable th) {
            cVar.g(null);
            throw th;
        }
    }
}
