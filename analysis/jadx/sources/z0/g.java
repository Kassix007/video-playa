package Z0;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f8334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f8335s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, long j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f8334r = jVar;
        this.f8335s = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new g(this.f8334r, this.f8335s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f8333q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            u0.d dVar = this.f8334r.f8357q;
            this.f8333q = 1;
            Object objB = dVar.b(this.f8335s, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objB == enumC1580a) {
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
