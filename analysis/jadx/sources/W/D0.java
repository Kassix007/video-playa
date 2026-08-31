package w;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public H0 f17756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.x f17757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f17760u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ H0 f17761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f17762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f17763x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(H0 h02, kotlin.jvm.internal.x xVar, long j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17761v = h02;
        this.f17762w = xVar;
        this.f17763x = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        D0 d02 = new D0(this.f17761v, this.f17762w, this.f17763x, interfaceC1524c);
        d02.f17760u = obj;
        return d02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D0) create((E0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        H0 h02;
        kotlin.jvm.internal.x xVar;
        long j;
        H0 h03;
        int i = this.f17759t;
        EnumC1778d0 enumC1778d0 = EnumC1778d0.f17946r;
        if (i == 0) {
            AbstractC1362a.e(obj);
            E0 e02 = (E0) this.f17760u;
            h02 = this.f17761v;
            C0 c02 = new C0(h02, e02);
            I i7 = h02.f17792c;
            kotlin.jvm.internal.x xVar2 = this.f17762w;
            long j7 = xVar2.f14267q;
            EnumC1778d0 enumC1778d02 = h02.f17793d;
            long j8 = this.f17763x;
            float fD = h02.d(enumC1778d02 == enumC1778d0 ? W0.p.b(j8) : W0.p.c(j8));
            this.f17760u = h02;
            this.f17756q = h02;
            this.f17757r = xVar2;
            this.f17758s = j7;
            this.f17759t = 1;
            obj = i7.a(c02, fD, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (obj == enumC1580a) {
                return enumC1580a;
            }
            xVar = xVar2;
            j = j7;
            h03 = h02;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f17758s;
            xVar = this.f17757r;
            h02 = this.f17756q;
            h03 = (H0) this.f17760u;
            AbstractC1362a.e(obj);
        }
        float fD2 = h03.d(((Number) obj).floatValue());
        xVar.f14267q = h02.f17793d == enumC1778d0 ? W0.p.a(j, fD2, 0.0f, 2) : W0.p.a(j, 0.0f, fD2, 1);
        return C1386y.f15098a;
    }
}
