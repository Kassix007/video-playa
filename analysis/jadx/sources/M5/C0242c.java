package M5;

import java.util.concurrent.locks.LockSupport;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: M5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0242c extends AbstractC0238a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Thread f3839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final S f3840u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0242c(InterfaceC1529h interfaceC1529h, Thread thread, S s6) {
        super(interfaceC1529h, true);
        this.f3839t = thread;
        this.f3840u = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final void m(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f3839t;
        if (kotlin.jvm.internal.m.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
