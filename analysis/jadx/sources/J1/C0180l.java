package J1;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: renamed from: J1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0180l extends C3.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0183o f2656t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0181m f2657u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0180l(DialogInterfaceOnCancelListenerC0181m dialogInterfaceOnCancelListenerC0181m, C0183o c0183o) {
        this.f2657u = dialogInterfaceOnCancelListenerC0181m;
        this.f2656t = c0183o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final View J(int i) {
        C0183o c0183o = this.f2656t;
        if (c0183o.K()) {
            return c0183o.J(i);
        }
        Dialog dialog = this.f2657u.f2667t0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C3.a
    public final boolean K() {
        return this.f2656t.K() || this.f2657u.f2671x0;
    }
}
