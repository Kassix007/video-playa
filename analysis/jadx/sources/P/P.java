package P;

import M5.AbstractC0263y;
import java.util.concurrent.CancellationException;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class P implements w0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B5.e f5356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final R5.d f5357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public M5.B f5358s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P(InterfaceC1529h interfaceC1529h, B5.e eVar) {
        this.f5356q = eVar;
        this.f5357r = AbstractC0263y.a(interfaceC1529h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void b() {
        M5.B b7 = this.f5358s;
        if (b7 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            b7.a(cancellationException);
        }
        this.f5358s = AbstractC0263y.t(this.f5357r, null, null, this.f5356q, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void c() {
        M5.B b7 = this.f5358s;
        if (b7 != null) {
            b7.t(new H(1));
        }
        this.f5358s = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void e() {
        M5.B b7 = this.f5358s;
        if (b7 != null) {
            b7.t(new H(1));
        }
        this.f5358s = null;
    }
}
