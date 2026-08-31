package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import h.DialogInterfaceC1104f;

/* JADX INFO: renamed from: l.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC1210m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SubMenuC1197D f14372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DialogInterfaceC1104f f14373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1205h f14374s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public final void b(MenuC1209l menuC1209l, boolean z5) {
        DialogInterfaceC1104f dialogInterfaceC1104f;
        if ((z5 || menuC1209l == this.f14372q) && (dialogInterfaceC1104f = this.f14373r) != null) {
            dialogInterfaceC1104f.dismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public final boolean g(MenuC1209l menuC1209l) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC1197D subMenuC1197D = this.f14372q;
        C1205h c1205h = this.f14374s;
        if (c1205h.f14344v == null) {
            c1205h.f14344v = new C1204g(c1205h);
        }
        subMenuC1197D.q(c1205h.f14344v.getItem(i), null, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f14374s.b(this.f14372q, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1197D subMenuC1197D = this.f14372q;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f14373r.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f14373r.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1197D.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1197D.performShortcut(i, keyEvent, 0);
    }
}
