package u;

import java.util.concurrent.CancellationException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1638a extends s5.i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1658l f16859q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.u f16860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1642c f16862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n0 f16864v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f16865w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1638a(C1642c c1642c, Object obj, n0 n0Var, long j, InterfaceC1524c interfaceC1524c) {
        super(1, interfaceC1524c);
        this.f16862t = c1642c;
        this.f16863u = obj;
        this.f16864v = n0Var;
        this.f16865w = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(InterfaceC1524c interfaceC1524c) {
        return new C1638a(this.f16862t, this.f16863u, this.f16864v, this.f16865w, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        return ((C1638a) create((InterfaceC1524c) obj)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        C1658l c1658l;
        kotlin.jvm.internal.u uVar;
        n0 n0Var = this.f16864v;
        int i = this.f16861s;
        C1642c c1642c = this.f16862t;
        try {
            if (i == 0) {
                AbstractC1362a.e(obj);
                c1642c.f16879c.f16963s = (AbstractC1663q) ((B5.c) c1642c.f16877a.f8313s).invoke(this.f16863u);
                c1642c.f16881e.setValue(n0Var.f16999c);
                c1642c.f16880d.setValue(Boolean.TRUE);
                C1658l c1658l2 = c1642c.f16879c;
                C1658l c1658l3 = new C1658l(c1658l2.f16961q, c1658l2.f16962r.getValue(), AbstractC1644d.j(c1658l2.f16963s), c1658l2.f16964t, Long.MIN_VALUE, c1658l2.f16966v);
                kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                long j = this.f16865w;
                A.J j7 = new A.J(c1642c, c1658l3, uVar2, 13);
                this.f16859q = c1658l3;
                this.f16860r = uVar2;
                this.f16861s = 1;
                Object objC = AbstractC1644d.c(c1658l3, n0Var, j, j7, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objC == enumC1580a) {
                    return enumC1580a;
                }
                c1658l = c1658l3;
                uVar = uVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar = this.f16860r;
                c1658l = this.f16859q;
                AbstractC1362a.e(obj);
            }
            EnumC1654i enumC1654i = uVar.f14264q ? EnumC1654i.f16936q : EnumC1654i.f16937r;
            C1642c.b(c1642c);
            return new Z.m(25, c1658l, enumC1654i);
        } catch (CancellationException e7) {
            C1642c.b(c1642c);
            throw e7;
        }
    }
}
