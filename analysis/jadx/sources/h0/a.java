package H0;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2032q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f2033r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Runnable f2034s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, Runnable runnable, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f2033r = fVar;
        this.f2034s = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new a(this.f2033r, this.f2034s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2032q;
        C1386y c1386y = C1386y.f15098a;
        f fVar = this.f2033r;
        if (i == 0) {
            AbstractC1362a.e(obj);
            j jVar = fVar.f;
            this.f2032q = 1;
            Object objA = jVar.a(0.0f - jVar.f2068c, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objA != enumC1580a) {
                objA = c1386y;
            }
            if (objA == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        fVar.f2057c.f874a.setValue(Boolean.FALSE);
        this.f2034s.run();
        return c1386y;
    }
}
