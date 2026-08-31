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

/* JADX INFO: loaded from: classes.dex */
public final class Y extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U5.a f17283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f17284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a0 f17285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f17287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a0 f17288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s5.i f17289w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y(a0 a0Var, B5.c cVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17288v = a0Var;
        this.f17289w = (s5.i) cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [B5.c, s5.i] */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        Y y6 = new Y(this.f17288v, this.f17289w, interfaceC1524c);
        y6.f17287u = obj;
        return y6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [B5.c] */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        ?? r22;
        X x6;
        a0 a0Var;
        U5.a aVar;
        X x7;
        U5.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.f17286t;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        try {
            try {
                if (i == 0) {
                    AbstractC1362a.e(obj);
                    InterfaceC1527f interfaceC1527f = ((InterfaceC0261w) this.f17287u).d().get(C0258t.f3885r);
                    kotlin.jvm.internal.m.b(interfaceC1527f);
                    X x8 = new X(W.f17278q, (InterfaceC0241b0) interfaceC1527f);
                    a0 a0Var2 = this.f17288v;
                    a0.a(a0Var2, x8);
                    U5.c cVar = a0Var2.f17304b;
                    this.f17287u = x8;
                    this.f17283q = cVar;
                    s5.i iVar = this.f17289w;
                    this.f17284r = iVar;
                    this.f17285s = a0Var2;
                    this.f17286t = 1;
                    if (cVar.e(this) != enumC1580a) {
                        r22 = iVar;
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
                    a0Var = (a0) this.f17284r;
                    U5.a aVar3 = this.f17283q;
                    x7 = (X) this.f17287u;
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
                a0Var = this.f17285s;
                B5.c cVar2 = (B5.c) this.f17284r;
                U5.a aVar4 = this.f17283q;
                x6 = (X) this.f17287u;
                AbstractC1362a.e(obj);
                r22 = cVar2;
                aVar = aVar4;
                this.f17287u = x6;
                this.f17283q = aVar;
                this.f17284r = a0Var;
                this.f17285s = null;
                this.f17286t = 2;
                obj = r22.invoke(this);
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
