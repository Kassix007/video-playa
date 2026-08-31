package Q5;

import M5.InterfaceC0261w;
import P5.H;
import P5.InterfaceC0398i;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: Q5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0425e extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6606q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6607r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0398i f6608s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f6609t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0425e(InterfaceC0398i interfaceC0398i, g gVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6608s = interfaceC0398i;
        this.f6609t = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C0425e c0425e = new C0425e(this.f6608s, this.f6609t, interfaceC1524c);
        c0425e.f6607r = obj;
        return c0425e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0425e) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f6606q;
        C1386y c1386y = C1386y.f15098a;
        if (i == 0) {
            AbstractC1362a.e(obj);
            O5.v vVarF = this.f6609t.f((InterfaceC0261w) this.f6607r);
            this.f6606q = 1;
            Object objH = H.h(this.f6608s, vVarF, true, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objH != enumC1580a) {
                objH = c1386y;
            }
            if (objH == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return c1386y;
    }
}
