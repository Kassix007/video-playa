package v;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: v.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1711f extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1728x f17339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y.k f17340s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1711f(C1728x c1728x, y.k kVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17339r = c1728x;
        this.f17340s = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1711f(this.f17339r, this.f17340s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1711f) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17338q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            y.i iVar = this.f17339r.f17407G;
            if (iVar != null) {
                this.f17338q = 1;
                Object objA = iVar.a(this.f17340s, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objA == enumC1580a) {
                    return enumC1580a;
                }
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
