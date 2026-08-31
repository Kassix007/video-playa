package l;

import C0.AbstractC0067b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p1.InterfaceMenuItemC1442a;
import r.Q;

/* JADX INFO: renamed from: l.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class MenuC1194A extends AbstractC0067b implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MenuC1209l f14270c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuC1194A(Context context, MenuC1209l menuC1209l) {
        super(context);
        if (menuC1209l == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f14270c = menuC1209l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return h(this.f14270c.a(0, 0, 0, charSequence));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f14270c.addIntentOptions(i, i7, i8, componentName, intentArr, intent, i9, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                menuItemArr[i10] = h(menuItemArr2[i10]);
            }
        }
        return iAddIntentOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f14270c.addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void clear() {
        Q q7 = (Q) this.f991b;
        if (q7 != null) {
            q7.clear();
        }
        this.f14270c.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void close() {
        this.f14270c.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return h(this.f14270c.findItem(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return h(this.f14270c.getItem(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f14270c.hasVisibleItems();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f14270c.isShortcutKey(i, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i7) {
        return this.f14270c.performIdentifierAction(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i7) {
        return this.f14270c.performShortcut(i, keyEvent, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((Q) this.f991b) != null) {
            int i7 = 0;
            while (true) {
                Q q7 = (Q) this.f991b;
                if (i7 >= q7.f16166s) {
                    break;
                }
                if (((InterfaceMenuItemC1442a) q7.f(i7)).getGroupId() == i) {
                    ((Q) this.f991b).g(i7);
                    i7--;
                }
                i7++;
            }
        }
        this.f14270c.removeGroup(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((Q) this.f991b) != null) {
            int i7 = 0;
            while (true) {
                Q q7 = (Q) this.f991b;
                if (i7 >= q7.f16166s) {
                    break;
                }
                if (((InterfaceMenuItemC1442a) q7.f(i7)).getItemId() == i) {
                    ((Q) this.f991b).g(i7);
                    break;
                }
                i7++;
            }
        }
        this.f14270c.removeItem(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z5, boolean z6) {
        this.f14270c.setGroupCheckable(i, z5, z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z5) {
        this.f14270c.setGroupEnabled(i, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z5) {
        this.f14270c.setGroupVisible(i, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f14270c.setQwertyMode(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final int size() {
        return this.f14270c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f14270c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return h(this.f14270c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i7, int i8, CharSequence charSequence) {
        return this.f14270c.addSubMenu(i, i7, i8, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i7, int i8, CharSequence charSequence) {
        return h(this.f14270c.a(i, i7, i8, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i7, int i8, int i9) {
        return this.f14270c.addSubMenu(i, i7, i8, i9);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i7, int i8, int i9) {
        return h(this.f14270c.add(i, i7, i8, i9));
    }
}
