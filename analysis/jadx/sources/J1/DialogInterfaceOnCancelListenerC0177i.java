package J1;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: J1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0177i implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0181m f2653q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceOnCancelListenerC0177i(DialogInterfaceOnCancelListenerC0181m dialogInterfaceOnCancelListenerC0181m) {
        this.f2653q = dialogInterfaceOnCancelListenerC0181m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0181m dialogInterfaceOnCancelListenerC0181m = this.f2653q;
        Dialog dialog = dialogInterfaceOnCancelListenerC0181m.f2667t0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0181m.onCancel(dialog);
        }
    }
}
