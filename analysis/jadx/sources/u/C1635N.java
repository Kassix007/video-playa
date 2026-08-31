package u;

import M5.C0258t;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import c0.C0726n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import q5.InterfaceC1527f;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1635N extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U5.a f16810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f16811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1636O f16812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f16814u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1636O f16815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s5.i f16816w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B5.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1635N(C1636O c1636o, B5.c cVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16815v = c1636o;
        this.f16816w = (s5.i) cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [B5.c, s5.i] */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1635N c1635n = new C1635N(this.f16815v, this.f16816w, interfaceC1524c);
        c1635n.f16814u = obj;
        return c1635n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1635N) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [B5.c] */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        ?? r22;
        C1634M c1634m;
        C1636O c1636o;
        U5.a aVar;
        C1634M c1634m2;
        U5.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i = this.f16813t;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        try {
            try {
                if (i == 0) {
                    AbstractC1362a.e(obj);
                    InterfaceC1527f interfaceC1527f = ((InterfaceC0261w) this.f16814u).d().get(C0258t.f3885r);
                    kotlin.jvm.internal.m.b(interfaceC1527f);
                    C1634M c1634m3 = new C1634M((InterfaceC0241b0) interfaceC1527f);
                    C1636O c1636o2 = this.f16815v;
                    AtomicReference atomicReference3 = c1636o2.f16817a;
                    while (true) {
                        C1634M c1634m4 = (C1634M) atomicReference3.get();
                        if (c1634m4 != null) {
                            EnumC1633L enumC1633L = EnumC1633L.f16807q;
                            if (enumC1633L.compareTo(enumC1633L) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(c1634m4, c1634m3)) {
                            if (atomicReference3.get() != c1634m4) {
                                break;
                            }
                        }
                        if (c1634m4 != null) {
                            c1634m4.f16809a.a(new C0726n("Mutation interrupted", 1));
                        }
                        U5.c cVar = c1636o2.f16818b;
                        this.f16814u = c1634m3;
                        this.f16810q = cVar;
                        s5.i iVar = this.f16816w;
                        this.f16811r = iVar;
                        this.f16812s = c1636o2;
                        this.f16813t = 1;
                        if (cVar.e(this) != enumC1580a) {
                            r22 = iVar;
                            c1634m = c1634m3;
                            c1636o = c1636o2;
                            aVar = cVar;
                        }
                    }
                    return enumC1580a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1636o = (C1636O) this.f16811r;
                    U5.a aVar3 = this.f16810q;
                    c1634m2 = (C1634M) this.f16814u;
                    try {
                        AbstractC1362a.e(obj);
                        aVar2 = aVar3;
                        atomicReference2 = c1636o.f16817a;
                        while (!atomicReference2.compareAndSet(c1634m2, null) && atomicReference2.get() == c1634m2) {
                        }
                        ((U5.c) aVar2).g(null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = c1636o.f16817a;
                        while (!atomicReference.compareAndSet(c1634m2, null)) {
                        }
                        throw th;
                    }
                }
                c1636o = this.f16812s;
                B5.c cVar2 = (B5.c) this.f16811r;
                U5.a aVar4 = this.f16810q;
                c1634m = (C1634M) this.f16814u;
                AbstractC1362a.e(obj);
                r22 = cVar2;
                aVar = aVar4;
                this.f16814u = c1634m;
                this.f16810q = aVar;
                this.f16811r = c1636o;
                this.f16812s = null;
                this.f16813t = 2;
                obj = r22.invoke(this);
                if (obj != enumC1580a) {
                    aVar2 = aVar;
                    c1634m2 = c1634m;
                    atomicReference2 = c1636o.f16817a;
                    while (!atomicReference2.compareAndSet(c1634m2, null)) {
                    }
                    ((U5.c) aVar2).g(null);
                    return obj;
                }
                return enumC1580a;
            } catch (Throwable th2) {
                th = th2;
                c1634m2 = c1634m;
                atomicReference = c1636o.f16817a;
                while (!atomicReference.compareAndSet(c1634m2, null) && atomicReference.get() == c1634m2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((U5.c) 2).g(null);
            throw th3;
        }
    }
}
