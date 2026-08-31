package v;

import c0.C0726n;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f17303a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5.c f17304b = new U5.c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(a0 a0Var, X x6) {
        AtomicReference atomicReference = a0Var.f17303a;
        while (true) {
            X x7 = (X) atomicReference.get();
            if (x7 != null && x6.f17281a.compareTo(x7.f17281a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(x7, x6)) {
                if (atomicReference.get() != x7) {
                    break;
                }
            }
            if (x7 != null) {
                x7.f17282b.a(new C0726n("Mutation interrupted", 2));
                return;
            }
            return;
        }
    }
}
