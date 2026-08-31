package Q2;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f6551s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6551s = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        m mVar = new m(this.f6551s, interfaceC1524c);
        mVar.f6550r = obj;
        return mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((u) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        u uVar;
        int i = this.f6549q;
        q qVar = this.f6551s;
        if (i == 0) {
            AbstractC1362a.e(obj);
            uVar = (u) this.f6550r;
            v vVar = uVar.f6585e;
            if (vVar == null) {
                throw new IllegalStateException("body == null");
            }
            this.f6550r = uVar;
            this.f6549q = 1;
            obj = q.b(qVar, vVar, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (obj == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (u) this.f6550r;
            AbstractC1362a.e(obj);
        }
        return new L2.i((J2.q) obj, q.f(qVar.f6569a, uVar.f6584d.a()), J2.h.f2770t);
    }
}
