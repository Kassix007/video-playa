package r1;

/* JADX INFO: renamed from: r1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1574b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1573a f16271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16272c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(InterfaceC1573a interfaceC1573a) {
        synchronized (this) {
            while (this.f16272c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f16271b == interfaceC1573a) {
                return;
            }
            this.f16271b = interfaceC1573a;
            if (this.f16270a) {
                interfaceC1573a.onCancel();
            }
        }
    }
}
