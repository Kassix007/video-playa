package N;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s5.i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f3949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.f f3950s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(B5.f fVar, r rVar, InterfaceC1524c interfaceC1524c) {
        super(1, interfaceC1524c);
        this.f3949r = rVar;
        this.f3950s = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(InterfaceC1524c interfaceC1524c) {
        return new k(this.f3950s, this.f3949r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        return ((k) create((InterfaceC1524c) obj)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3948q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            r rVar = this.f3949r;
            i iVar = new i(rVar, 0);
            j jVar = new j(this.f3950s, rVar, null);
            this.f3948q = 1;
            Object objA = androidx.compose.material3.internal.a.a(iVar, jVar, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objA == enumC1580a) {
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
