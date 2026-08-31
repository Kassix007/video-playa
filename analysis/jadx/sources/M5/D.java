package M5;

import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class D extends Exception {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Throwable f3807q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(Throwable th, AbstractC0257s abstractC0257s, InterfaceC1529h interfaceC1529h) {
        super("Coroutine dispatcher " + abstractC0257s + " threw an exception, context = " + interfaceC1529h, th);
        this.f3807q = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3807q;
    }
}
