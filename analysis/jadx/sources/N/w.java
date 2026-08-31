package N;

import M5.C0258t;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1527f;
import r5.EnumC1580a;
import v.W;

/* JADX INFO: loaded from: classes.dex */
public final class w extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U5.a f3987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f3988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public x f3989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ W f3992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f3993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s5.i f3994x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: B5.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(W w3, x xVar, B5.c cVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3992v = w3;
        this.f3993w = xVar;
        this.f3994x = (s5.i) cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [B5.c, s5.i] */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        w wVar = new w(this.f3992v, this.f3993w, this.f3994x, interfaceC1524c);
        wVar.f3991u = obj;
        return wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [B5.c] */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        ?? r22;
        v vVar;
        x xVar;
        U5.a aVar;
        v vVar2;
        U5.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.f3990t;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        try {
            try {
                if (i == 0) {
                    AbstractC1362a.e(obj);
                    InterfaceC1527f interfaceC1527f = ((InterfaceC0261w) this.f3991u).d().get(C0258t.f3885r);
                    kotlin.jvm.internal.m.b(interfaceC1527f);
                    v vVar3 = new v(this.f3992v, (InterfaceC0241b0) interfaceC1527f);
                    x xVar2 = this.f3993w;
                    AtomicReference atomicReference3 = xVar2.f3995a;
                    while (true) {
                        v vVar4 = (v) atomicReference3.get();
                        if (vVar4 != null && vVar3.f3985a.compareTo(vVar4.f3985a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(vVar4, vVar3)) {
                            if (atomicReference3.get() != vVar4) {
                                break;
                            }
                        }
                        if (vVar4 != null) {
                            vVar4.f3986b.a(null);
                        }
                        U5.c cVar = xVar2.f3996b;
                        this.f3991u = vVar3;
                        this.f3987q = cVar;
                        s5.i iVar = this.f3994x;
                        this.f3988r = iVar;
                        this.f3989s = xVar2;
                        this.f3990t = 1;
                        if (cVar.e(this) != enumC1580a) {
                            r22 = iVar;
                            vVar = vVar3;
                            xVar = xVar2;
                            aVar = cVar;
                        }
                    }
                    return enumC1580a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (x) this.f3988r;
                    U5.a aVar3 = this.f3987q;
                    vVar2 = (v) this.f3991u;
                    try {
                        AbstractC1362a.e(obj);
                        aVar2 = aVar3;
                        atomicReference2 = xVar.f3995a;
                        while (!atomicReference2.compareAndSet(vVar2, null) && atomicReference2.get() == vVar2) {
                        }
                        ((U5.c) aVar2).g(null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = xVar.f3995a;
                        while (!atomicReference.compareAndSet(vVar2, null)) {
                        }
                        throw th;
                    }
                }
                xVar = this.f3989s;
                B5.c cVar2 = (B5.c) this.f3988r;
                U5.a aVar4 = this.f3987q;
                vVar = (v) this.f3991u;
                AbstractC1362a.e(obj);
                r22 = cVar2;
                aVar = aVar4;
                this.f3991u = vVar;
                this.f3987q = aVar;
                this.f3988r = xVar;
                this.f3989s = null;
                this.f3990t = 2;
                obj = r22.invoke(this);
                if (obj != enumC1580a) {
                    aVar2 = aVar;
                    vVar2 = vVar;
                    atomicReference2 = xVar.f3995a;
                    while (!atomicReference2.compareAndSet(vVar2, null)) {
                    }
                    ((U5.c) aVar2).g(null);
                    return obj;
                }
                return enumC1580a;
            } catch (Throwable th2) {
                th = th2;
                vVar2 = vVar;
                atomicReference = xVar.f3995a;
                while (!atomicReference.compareAndSet(vVar2, null) && atomicReference.get() == vVar2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((U5.c) 2).g(null);
            throw th3;
        }
    }
}
