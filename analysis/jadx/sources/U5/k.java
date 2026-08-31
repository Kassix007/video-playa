package U5;

import R5.s;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f7911e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(long j, k kVar, int i) {
        super(j, kVar, i);
        this.f7911e = new AtomicReferenceArray(j.f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R5.s
    public final int f() {
        return j.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R5.s
    public final void g(int i, InterfaceC1529h interfaceC1529h) {
        this.f7911e.set(i, j.f7910e);
        h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SemaphoreSegment[id=" + this.f7268c + ", hashCode=" + hashCode() + ']';
    }
}
