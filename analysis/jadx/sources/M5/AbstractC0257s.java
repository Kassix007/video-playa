package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.InterfaceC1364c;
import q5.AbstractC1522a;
import q5.C1525d;
import q5.InterfaceC1524c;
import q5.InterfaceC1526e;
import q5.InterfaceC1527f;
import q5.InterfaceC1528g;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: M5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0257s extends AbstractC1522a implements InterfaceC1526e {
    public static final r Key = new r(C1525d.f16021q, new I5.m(8));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0257s() {
        super(C1525d.f16021q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AbstractC0257s limitedParallelism$default(AbstractC0257s abstractC0257s, int i, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        return abstractC0257s.limitedParallelism(i, str);
    }

    public abstract void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void dispatchYield(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        R5.b.i(this, interfaceC1529h, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.AbstractC1522a, q5.InterfaceC1529h
    public <E extends InterfaceC1527f> E get(InterfaceC1528g key) {
        E e7;
        kotlin.jvm.internal.m.e(key, "key");
        if (key instanceof r) {
            r rVar = (r) key;
            InterfaceC1528g key2 = getKey();
            kotlin.jvm.internal.m.e(key2, "key");
            if ((key2 == rVar || rVar.f3882r == key2) && (e7 = (E) rVar.f3881q.invoke(this)) != null) {
                return e7;
            }
        } else if (C1525d.f16021q == key) {
            return this;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1526e
    public final <T> InterfaceC1524c<T> interceptContinuation(InterfaceC1524c<? super T> interfaceC1524c) {
        return new R5.g(this, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isDispatchNeeded(InterfaceC1529h interfaceC1529h) {
        return !(this instanceof x0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0257s limitedParallelism(int i, String str) {
        R5.b.a(i);
        return new R5.h(this, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (((q5.InterfaceC1527f) r3.f3881q.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (q5.C1525d.f16021q == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        return q5.C1530i.f16022q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        return r2;
     */
    @Override // q5.AbstractC1522a, q5.InterfaceC1529h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q5.InterfaceC1529h minusKey(q5.InterfaceC1528g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.m.e(r3, r0)
            boolean r1 = r3 instanceof M5.r
            if (r1 == 0) goto L25
            M5.r r3 = (M5.r) r3
            q5.g r1 = r2.getKey()
            kotlin.jvm.internal.m.e(r1, r0)
            if (r1 == r3) goto L1a
            q5.g r0 = r3.f3882r
            if (r0 != r1) goto L19
            goto L1a
        L19:
            return r2
        L1a:
            B5.c r3 = r3.f3881q
            java.lang.Object r3 = r3.invoke(r2)
            q5.f r3 = (q5.InterfaceC1527f) r3
            if (r3 == 0) goto L2c
            goto L29
        L25:
            q5.d r0 = q5.C1525d.f16021q
            if (r0 != r3) goto L2c
        L29:
            q5.i r3 = q5.C1530i.f16022q
            return r3
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.AbstractC0257s.minusKey(q5.g):q5.h");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1526e
    public final void releaseInterceptedContinuation(InterfaceC1524c<?> interfaceC1524c) {
        kotlin.jvm.internal.m.c(interfaceC1524c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        R5.g gVar = (R5.g) interfaceC1524c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R5.g.f7237x;
        while (atomicReferenceFieldUpdater.get(gVar) == R5.b.f7228c) {
        }
        Object obj = atomicReferenceFieldUpdater.get(gVar);
        C0247h c0247h = obj instanceof C0247h ? (C0247h) obj : null;
        if (c0247h != null) {
            c0247h.l();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0263y.m(this);
    }

    @InterfaceC1364c
    public /* synthetic */ AbstractC0257s limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }

    @InterfaceC1364c
    public final AbstractC0257s plus(AbstractC0257s abstractC0257s) {
        return abstractC0257s;
    }
}
