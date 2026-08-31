package L;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.C1642c;
import u.InterfaceC1657k;

/* JADX INFO: loaded from: classes.dex */
public final class r extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f3059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1657k f3060s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, InterfaceC1657k interfaceC1657k, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3059r = sVar;
        this.f3060s = interfaceC1657k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new r(this.f3059r, this.f3060s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3058q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1642c c1642c = (C1642c) this.f3059r.f3063c;
            Float f = new Float(0.0f);
            this.f3058q = 1;
            Object objC = C1642c.c(c1642c, f, this.f3060s, this, 12);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objC == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return C1386y.f15098a;
    }
}
