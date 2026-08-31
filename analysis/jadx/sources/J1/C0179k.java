package J1;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.InterfaceC0660x;

/* JADX INFO: renamed from: J1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0179k implements androidx.lifecycle.K {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0181m f2655q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0179k(DialogInterfaceOnCancelListenerC0181m dialogInterfaceOnCancelListenerC0181m) {
        this.f2655q = dialogInterfaceOnCancelListenerC0181m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.K
    public final void onChanged(Object obj) {
        if (((InterfaceC0660x) obj) != null) {
            DialogInterfaceOnCancelListenerC0181m dialogInterfaceOnCancelListenerC0181m = this.f2655q;
            if (dialogInterfaceOnCancelListenerC0181m.f2663p0) {
                View viewD = dialogInterfaceOnCancelListenerC0181m.D();
                if (viewD.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dialogInterfaceOnCancelListenerC0181m.f2667t0 != null) {
                    if (H.F(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dialogInterfaceOnCancelListenerC0181m.f2667t0);
                    }
                    dialogInterfaceOnCancelListenerC0181m.f2667t0.setContentView(viewD);
                }
            }
        }
    }
}
