package w;

import P.C0354f0;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: w.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1795m extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p3.z0 f18024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.e f18025t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1795m(p3.z0 z0Var, B5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18024s = z0Var;
        this.f18025t = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1795m c1795m = new C1795m(this.f18024s, this.f18025t, interfaceC1524c);
        c1795m.f18023r = obj;
        return c1795m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1795m) create((InterfaceC1788i0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        C0354f0 c0354f0 = (C0354f0) this.f18024s.f15878d;
        int i = this.f18022q;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                InterfaceC1788i0 interfaceC1788i0 = (InterfaceC1788i0) this.f18023r;
                c0354f0.setValue(Boolean.TRUE);
                B5.e eVar = this.f18025t;
                this.f18022q = 1;
                Object objInvoke = eVar.invoke(interfaceC1788i0, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objInvoke == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
            }
            c0354f0.setValue(Boolean.FALSE);
            return C1386y.f15098a;
        } catch (Throwable th) {
            c0354f0.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
