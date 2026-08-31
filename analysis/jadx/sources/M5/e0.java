package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends R5.j implements J, X {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i0 f3846t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.J
    public final void a() {
        i0 i0VarJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0.f3864q;
            Object obj = atomicReferenceFieldUpdater.get(i0VarJ);
            if (obj instanceof e0) {
                if (obj != this) {
                    return;
                }
                L l7 = AbstractC0263y.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(i0VarJ, obj, l7)) {
                    if (atomicReferenceFieldUpdater.get(i0VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof X) || ((X) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = R5.j.f7250q;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof R5.p) {
                    R5.j jVar = ((R5.p) obj2).f7265a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                R5.j jVar2 = (R5.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = R5.j.f7252s;
                R5.p pVar = (R5.p) atomicReferenceFieldUpdater3.get(jVar2);
                if (pVar == null) {
                    pVar = new R5.p(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar2.f();
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.X
    public final boolean b() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.X
    public final k0 d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0241b0 getParent() {
        return j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final i0 j() {
        i0 i0Var = this.f3846t;
        if (i0Var != null) {
            return i0Var;
        }
        kotlin.jvm.internal.m.k("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R5.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0263y.m(this) + "[job@" + AbstractC0263y.m(j()) + ']';
    }
}
