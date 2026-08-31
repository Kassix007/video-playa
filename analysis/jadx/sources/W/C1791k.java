package w;

import M5.InterfaceC0261w;
import java.util.concurrent.CancellationException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.AbstractC1644d;
import u.C1658l;
import u.C1667v;

/* JADX INFO: renamed from: w.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1791k extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public kotlin.jvm.internal.v f18014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1658l f18015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f18017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1793l f18018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0 f18019v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1791k(float f, C1793l c1793l, C0 c02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18017t = f;
        this.f18018u = c1793l;
        this.f18019v = c02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1791k(this.f18017t, this.f18018u, this.f18019v, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1791k) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        float f;
        kotlin.jvm.internal.v vVar;
        C1658l c1658l;
        Object objE;
        EnumC1580a enumC1580a;
        int i = this.f18016s;
        if (i == 0) {
            AbstractC1362a.e(obj);
            f = this.f18017t;
            if (Math.abs(f) > 1.0f) {
                kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                vVar2.f14265q = f;
                kotlin.jvm.internal.v vVar3 = new kotlin.jvm.internal.v();
                C1658l c1658lA = AbstractC1644d.a(0.0f, f, 28);
                try {
                    C1793l c1793l = this.f18018u;
                    C1667v c1667v = c1793l.f18020a;
                    A.J j = new A.J(vVar3, this.f18019v, vVar2, c1793l);
                    this.f18014q = vVar2;
                    this.f18015r = c1658lA;
                    this.f18016s = 1;
                    objE = AbstractC1644d.e(c1658lA, c1667v, false, j, this);
                    enumC1580a = EnumC1580a.f16356q;
                } catch (CancellationException unused) {
                    vVar = vVar2;
                    c1658l = c1658lA;
                    vVar.f14265q = ((Number) c1658l.b()).floatValue();
                }
                if (objE == enumC1580a) {
                    return enumC1580a;
                }
                vVar = vVar2;
                f = vVar.f14265q;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1658l = this.f18015r;
            vVar = this.f18014q;
            try {
                AbstractC1362a.e(obj);
            } catch (CancellationException unused2) {
                vVar.f14265q = ((Number) c1658l.b()).floatValue();
            }
            f = vVar.f14265q;
        }
        return new Float(f);
    }
}
