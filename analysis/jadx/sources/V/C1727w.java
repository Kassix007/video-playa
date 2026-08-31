package v;

import M5.AbstractC0263y;
import i0.C1130b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import w.C1784g0;

/* JADX INFO: renamed from: v.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1727w extends s5.i implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ C1784g0 f17403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ long f17404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1728x f17405t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1727w(C1728x c1728x, InterfaceC1524c interfaceC1524c) {
        super(3, interfaceC1524c);
        this.f17405t = c1728x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C1130b) obj2).f13520a;
        C1727w c1727w = new C1727w(this.f17405t, (InterfaceC1524c) obj3);
        c1727w.f17403r = (C1784g0) obj;
        c1727w.f17404s = j;
        return c1727w.invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        Object objG;
        int i = this.f17402q;
        C1386y c1386y = C1386y.f15098a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return c1386y;
        }
        AbstractC1362a.e(obj);
        C1784g0 c1784g0 = this.f17403r;
        long j = this.f17404s;
        C1728x c1728x = this.f17405t;
        if (c1728x.f17410J) {
            this.f17402q = 1;
            y.i iVar = c1728x.f17407G;
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (iVar == null || (objG = AbstractC0263y.g(new C1709d(c1784g0, j, iVar, c1728x, null), this)) != enumC1580a) {
                objG = c1386y;
            }
            if (objG == enumC1580a) {
                return enumC1580a;
            }
        }
        return c1386y;
    }
}
