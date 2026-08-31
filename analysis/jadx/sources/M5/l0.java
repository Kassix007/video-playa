package M5;

import C0.C0100s;
import java.util.concurrent.CancellationException;
import q5.AbstractC1522a;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends AbstractC1522a implements InterfaceC0241b0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l0 f3870q = new l0(C0258t.f3885r);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final J G(B5.c cVar) {
        return m0.f3871q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final InterfaceC0250k M(i0 i0Var) {
        return m0.f3871q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final boolean b() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final J c(boolean z5, boolean z6, C0100s c0100s) {
        return m0.f3871q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final Object f(s5.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final boolean isCancelled() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final boolean start() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NonCancellable";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0241b0
    public final CancellationException v() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // M5.InterfaceC0241b0
    public final void a(CancellationException cancellationException) {
    }
}
