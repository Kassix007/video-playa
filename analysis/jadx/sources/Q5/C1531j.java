package q5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r5.EnumC1580a;

/* JADX INFO: renamed from: q5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1531j implements InterfaceC1524c, s5.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f16023r = AtomicReferenceFieldUpdater.newUpdater(C1531j.class, Object.class, "result");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1524c f16024q;
    private volatile Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1531j(InterfaceC1524c interfaceC1524c) {
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        this.f16024q = interfaceC1524c;
        this.result = enumC1580a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.d
    public final s5.d getCallerFrame() {
        InterfaceC1524c interfaceC1524c = this.f16024q;
        if (interfaceC1524c instanceof s5.d) {
            return (s5.d) interfaceC1524c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return this.f16024q.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC1580a enumC1580a = EnumC1580a.f16357r;
            if (obj2 == enumC1580a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16023r;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC1580a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC1580a) {
                        break;
                    }
                }
                return;
            }
            EnumC1580a enumC1580a2 = EnumC1580a.f16356q;
            if (obj2 != enumC1580a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f16023r;
            EnumC1580a enumC1580a3 = EnumC1580a.f16358s;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC1580a2, enumC1580a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC1580a2) {
                    break;
                }
            }
            this.f16024q.resumeWith(obj);
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SafeContinuation for " + this.f16024q;
    }
}
