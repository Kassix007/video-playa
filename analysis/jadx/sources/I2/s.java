package I2;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import androidx.lifecycle.AbstractC0654q;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class s extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f2376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U2.g f2377s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, U2.g gVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f2376r = yVar;
        this.f2377s = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new s(this.f2376r, this.f2377s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2375q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        this.f2375q = 1;
        U2.g gVar = this.f2377s;
        boolean z5 = gVar.f7668n instanceof V2.f;
        y yVar = this.f2376r;
        Object objG = (z5 || ((AbstractC0654q) q.d(gVar, U2.i.f7681d)) != null) ? AbstractC0263y.g(new v(yVar, gVar, null), this) : yVar.a(gVar, 1, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objG == enumC1580a ? enumC1580a : objG;
    }
}
