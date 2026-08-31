package w;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v.C1727w;
import v0.C1743l;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1727w f17816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1743l f17818t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C1727w c1727w, C1784g0 c1784g0, C1743l c1743l, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17816r = c1727w;
        this.f17817s = c1784g0;
        this.f17818t = c1743l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new K0(this.f17816r, this.f17817s, this.f17818t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17815q;
        C1386y c1386y = C1386y.f15098a;
        if (i == 0) {
            AbstractC1362a.e(obj);
            long j = this.f17818t.f17462c;
            this.f17815q = 1;
            C1727w c1727w = new C1727w(this.f17816r.f17405t, this);
            c1727w.f17403r = this.f17817s;
            c1727w.f17404s = j;
            Object objInvokeSuspend = c1727w.invokeSuspend(c1386y);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objInvokeSuspend == enumC1580a) {
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
