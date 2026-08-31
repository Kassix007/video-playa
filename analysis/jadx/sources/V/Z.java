package v;

import M5.C0258t;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import java.util.concurrent.atomic.AtomicReference;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1527f;
import r5.EnumC1580a;
import w.C1795m;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U5.a f17290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f17291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public F.E f17292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a0 f17293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17294u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f17295v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ W f17296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f17297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C1795m f17298y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ F.E f17299z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(W w3, a0 a0Var, C1795m c1795m, F.E e7, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17296w = w3;
        this.f17297x = a0Var;
        this.f17298y = c1795m;
        this.f17299z = e7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        Z z5 = new Z(this.f17296w, this.f17297x, this.f17298y, this.f17299z, interfaceC1524c);
        z5.f17295v = obj;
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        B5.e eVar;
        F.E e7;
        X x6;
        a0 a0Var;
        U5.a aVar;
        X x7;
        U5.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.f17294u;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        try {
            try {
                if (i == 0) {
                    AbstractC1362a.e(obj);
                    InterfaceC1527f interfaceC1527f = ((InterfaceC0261w) this.f17295v).d().get(C0258t.f3885r);
                    kotlin.jvm.internal.m.b(interfaceC1527f);
                    X x8 = new X(this.f17296w, (InterfaceC0241b0) interfaceC1527f);
                    a0 a0Var2 = this.f17297x;
                    a0.a(a0Var2, x8);
                    U5.c cVar = a0Var2.f17304b;
                    this.f17295v = x8;
                    this.f17290q = cVar;
                    eVar = this.f17298y;
                    this.f17291r = eVar;
                    F.E e8 = this.f17299z;
                    this.f17292s = e8;
                    this.f17293t = a0Var2;
                    this.f17294u = 1;
                    if (cVar.e(this) != enumC1580a) {
                        e7 = e8;
                        x6 = x8;
                        a0Var = a0Var2;
                        aVar = cVar;
                    }
                    return enumC1580a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var = (a0) this.f17291r;
                    U5.a aVar3 = this.f17290q;
                    x7 = (X) this.f17295v;
                    try {
                        AbstractC1362a.e(obj);
                        aVar2 = aVar3;
                        atomicReference2 = a0Var.f17303a;
                        while (!atomicReference2.compareAndSet(x7, null) && atomicReference2.get() == x7) {
                        }
                        ((U5.c) aVar2).g(null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = a0Var.f17303a;
                        while (!atomicReference.compareAndSet(x7, null)) {
                        }
                        throw th;
                    }
                }
                a0Var = this.f17293t;
                e7 = this.f17292s;
                B5.e eVar2 = (B5.e) this.f17291r;
                U5.a aVar4 = this.f17290q;
                x6 = (X) this.f17295v;
                AbstractC1362a.e(obj);
                eVar = eVar2;
                aVar = aVar4;
                this.f17295v = x6;
                this.f17290q = aVar;
                this.f17291r = a0Var;
                this.f17292s = null;
                this.f17293t = null;
                this.f17294u = 2;
                obj = eVar.invoke(e7, this);
                if (obj != enumC1580a) {
                    aVar2 = aVar;
                    x7 = x6;
                    atomicReference2 = a0Var.f17303a;
                    while (!atomicReference2.compareAndSet(x7, null)) {
                    }
                    ((U5.c) aVar2).g(null);
                    return obj;
                }
                return enumC1580a;
            } catch (Throwable th2) {
                th = th2;
                x7 = x6;
                atomicReference = a0Var.f17303a;
                while (!atomicReference.compareAndSet(x7, null) && atomicReference.get() == x7) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((U5.c) 2).g(null);
            throw th3;
        }
    }
}
