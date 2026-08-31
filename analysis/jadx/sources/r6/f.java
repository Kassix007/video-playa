package r6;

import J5.t;
import com.google.android.gms.common.api.Status;
import q6.x;
import w1.InterfaceC1854q;

/* JADX INFO: loaded from: classes.dex */
public final class f implements v3.i, InterfaceC1854q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(x xVar) {
        x xVar2 = g.f16379v;
        return !t.A0(xVar.b(), ".class", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v3.i
    public Exception getException(Status status) {
        return status.f10314s != null ? new A4.a(status) : new com.google.android.gms.common.g(status);
    }

    @Override // w1.InterfaceC1854q
    public void onScrollLimit(int i, int i7, int i8, boolean z5) {
    }

    @Override // w1.InterfaceC1854q
    public void onScrollProgress(int i, int i7, int i8, int i9) {
    }
}
