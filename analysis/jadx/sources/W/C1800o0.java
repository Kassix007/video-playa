package w;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.AbstractC1644d;

/* JADX INFO: renamed from: w.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1800o0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H0 f18037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18038t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f18039u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1800o0(H0 h02, long j, kotlin.jvm.internal.v vVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18037s = h02;
        this.f18038t = j;
        this.f18039u = vVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1800o0 c1800o0 = new C1800o0(this.f18037s, this.f18038t, this.f18039u, interfaceC1524c);
        c1800o0.f18036r = obj;
        return c1800o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1800o0) create((E0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f18035q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            E0 e02 = (E0) this.f18036r;
            long j = this.f18038t;
            H0 h02 = this.f18037s;
            float fG = h02.g(j);
            C0.Z z5 = new C0.Z(this.f18039u, h02, e02, 3);
            this.f18035q = 1;
            Object objD = AbstractC1644d.d(0.0f, fG, null, z5, this, 12);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objD == enumC1580a) {
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
