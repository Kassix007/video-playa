package J1;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: renamed from: J1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0178j implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0181m f2654q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceOnDismissListenerC0178j(DialogInterfaceOnCancelListenerC0181m dialogInterfaceOnCancelListenerC0181m) {
        this.f2654q = dialogInterfaceOnCancelListenerC0181m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0181m dialogInterfaceOnCancelListenerC0181m = this.f2654q;
        Dialog dialog = dialogInterfaceOnCancelListenerC0181m.f2667t0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0181m.onDismiss(dialog);
        }
    }
}
