package w;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: w.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1809t0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1821z0 f18075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f18076s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1809t0(C1821z0 c1821z0, long j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18075r = c1821z0;
        this.f18076s = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1809t0(this.f18075r, this.f18076s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1809t0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f18074q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            H0 h02 = this.f18075r.f18124T;
            this.f18074q = 1;
            Object objC = h02.c(this.f18076s, false, this);
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
