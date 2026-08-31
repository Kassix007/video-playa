package l;

import android.view.ActionProvider;
import i3.C1136a;

/* JADX INFO: renamed from: l.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1212o implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1136a f14401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f14402b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionProviderVisibilityListenerC1212o(MenuItemC1216s menuItemC1216s, ActionProvider actionProvider) {
        this.f14402b = actionProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z5) {
        C1136a c1136a = this.f14401a;
        if (c1136a != null) {
            MenuC1209l menuC1209l = ((C1211n) c1136a.f13562r).f14388n;
            menuC1209l.f14357h = true;
            menuC1209l.p(true);
        }
    }
}
