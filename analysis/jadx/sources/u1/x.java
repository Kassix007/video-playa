package U1;

import P.C0346b0;
import P.W;
import P5.InterfaceC0397h;
import java.util.List;
import java.util.concurrent.CancellationException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class x extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f7613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f7614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0346b0 f7615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ W f7616v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(i iVar, W w3, C0346b0 c0346b0, W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7613s = iVar;
        this.f7614t = w3;
        this.f7615u = c0346b0;
        this.f7616v = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        x xVar = new x(this.f7613s, this.f7614t, this.f7615u, this.f7616v, interfaceC1524c);
        xVar.f7612r = obj;
        return xVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((InterfaceC0397h) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        T1.d dVar;
        int i = this.f7611q;
        W w3 = this.f7616v;
        i iVar = this.f7613s;
        W w6 = this.f7614t;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                InterfaceC0397h interfaceC0397h = (InterfaceC0397h) this.f7612r;
                int size = ((List) w6.getValue()).size();
                C0346b0 c0346b0 = this.f7615u;
                if (size > 1) {
                    c0346b0.f(0.0f);
                    dVar = (T1.d) n5.l.s0((List) w6.getValue());
                    kotlin.jvm.internal.m.b(dVar);
                    iVar.g(dVar);
                    iVar.g((T1.d) ((List) w6.getValue()).get(((List) w6.getValue()).size() - 2));
                } else {
                    dVar = null;
                }
                N.f fVar = new N.f(w6, w3, c0346b0, 3);
                this.f7612r = dVar;
                this.f7611q = 1;
                Object objCollect = interfaceC0397h.collect(fVar, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objCollect == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar = (T1.d) this.f7612r;
                AbstractC1362a.e(obj);
            }
            if (((List) w6.getValue()).size() > 1) {
                w3.setValue(Boolean.FALSE);
                kotlin.jvm.internal.m.b(dVar);
                iVar.e(dVar, false);
            }
        } catch (CancellationException unused) {
            if (((List) w6.getValue()).size() > 1) {
                w3.setValue(Boolean.FALSE);
            }
        }
        return C1386y.f15098a;
    }
}
