package w;

import M5.InterfaceC0261w;
import i0.C1130b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.C1743l;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.f f17872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1743l f17874t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(B5.f fVar, C1784g0 c1784g0, C1743l c1743l, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17872r = fVar;
        this.f17873s = c1784g0;
        this.f17874t = c1743l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new V0(this.f17872r, this.f17873s, this.f17874t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17871q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1130b c1130b = new C1130b(this.f17874t.f17462c);
            this.f17871q = 1;
            Object objInvoke = this.f17872r.invoke(this.f17873s, c1130b, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objInvoke == enumC1580a) {
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
