package m5;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: m5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1375n implements InterfaceC1369h, Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15083s = AtomicReferenceFieldUpdater.newUpdater(C1375n.class, Object.class, "r");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile B5.a f15084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Object f15085r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m5.InterfaceC1369h
    public final Object getValue() {
        Object obj = this.f15085r;
        C1383v c1383v = C1383v.f15095a;
        if (obj != c1383v) {
            return obj;
        }
        B5.a aVar = this.f15084q;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15083s;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1383v, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c1383v) {
                }
            }
            this.f15084q = null;
            return objInvoke;
        }
        return this.f15085r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f15085r != C1383v.f15095a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
