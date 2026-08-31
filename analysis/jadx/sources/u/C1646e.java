package u;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1646e extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1642c f16917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P.W f16918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ P.W f16919u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1646e(Object obj, C1642c c1642c, P.W w3, P.W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16916r = obj;
        this.f16917s = c1642c;
        this.f16918t = w3;
        this.f16919u = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1646e(this.f16916r, this.f16917s, this.f16918t, this.f16919u, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1646e) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f16915q;
        C1642c c1642c = this.f16917s;
        if (i == 0) {
            AbstractC1362a.e(obj);
            Object value = c1642c.f16881e.getValue();
            Object obj2 = this.f16916r;
            if (!kotlin.jvm.internal.m.a(obj2, value)) {
                C1649f0 c1649f0 = AbstractC1650g.f16931a;
                InterfaceC1657k interfaceC1657k = (InterfaceC1657k) this.f16918t.getValue();
                this.f16915q = 1;
                Object objC = C1642c.c(c1642c, obj2, interfaceC1657k, this, 12);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objC == enumC1580a) {
                    return enumC1580a;
                }
            }
            return C1386y.f15098a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1362a.e(obj);
        C1649f0 c1649f02 = AbstractC1650g.f16931a;
        B5.c cVar = (B5.c) this.f16919u.getValue();
        if (cVar != null) {
            cVar.invoke(c1642c.d());
        }
        return C1386y.f15098a;
    }
}
