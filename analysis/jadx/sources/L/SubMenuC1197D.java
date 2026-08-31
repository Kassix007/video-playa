package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC1197D extends MenuC1209l implements SubMenu {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1211n f14290A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final MenuC1209l f14291z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SubMenuC1197D(Context context, MenuC1209l menuC1209l, C1211n c1211n) {
        super(context);
        this.f14291z = menuC1209l;
        this.f14290A = c1211n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final boolean d(C1211n c1211n) {
        return this.f14291z.d(c1211n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final boolean e(MenuC1209l menuC1209l, MenuItem menuItem) {
        return super.e(menuC1209l, menuItem) || this.f14291z.e(menuC1209l, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final boolean f(C1211n c1211n) {
        return this.f14291z.f(c1211n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f14290A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final String j() {
        C1211n c1211n = this.f14290A;
        int i = c1211n != null ? c1211n.f14378a : 0;
        if (i == 0) {
            return null;
        }
        return k1.i.i(i, "android:menu:actionviewstates:");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final MenuC1209l k() {
        return this.f14291z.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final boolean m() {
        return this.f14291z.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final boolean n() {
        return this.f14291z.n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l
    public final boolean o() {
        return this.f14291z.o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z5) {
        this.f14291z.setGroupDividerEnabled(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f14290A.setIcon(drawable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.MenuC1209l, android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f14291z.setQwertyMode(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f14290A.setIcon(i);
        return this;
    }
}
