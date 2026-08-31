package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1215r implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f14406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenuItemC1216s f14407b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuItemOnMenuItemClickListenerC1215r(MenuItemC1216s menuItemC1216s, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14407b = menuItemC1216s;
        this.f14406a = onMenuItemClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f14406a.onMenuItemClick(this.f14407b.h(menuItem));
    }
}
