package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnActionExpandListenerC1214q implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f14404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC1216s f14405b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuItemOnActionExpandListenerC1214q(MenuItemC1216s menuItemC1216s, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14405b = menuItemC1216s;
        this.f14404a = onActionExpandListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f14404a.onMenuItemActionCollapse(this.f14405b.h(menuItem));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f14404a.onMenuItemActionExpand(this.f14405b.h(menuItem));
    }
}
