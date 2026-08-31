package l;

import a.AbstractC0597a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import i3.C1136a;
import java.util.ArrayList;
import p1.InterfaceMenuItemC1442a;

/* JADX INFO: renamed from: l.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1211n implements InterfaceMenuItemC1442a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ActionProviderVisibilityListenerC1212o f14375A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f14376B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f14382e;
    public CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f14383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f14384h;
    public char j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f14386l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MenuC1209l f14388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SubMenuC1197D f14389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f14390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f14391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f14392r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f14400z;
    public int i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14385k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14387m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f14393s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f14394t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14395u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14396v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14397w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14398x = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14377C = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1211n(MenuC1209l menuC1209l, int i, int i7, int i8, int i9, CharSequence charSequence, int i10) {
        this.f14388n = menuC1209l;
        this.f14378a = i7;
        this.f14379b = i;
        this.f14380c = i8;
        this.f14381d = i9;
        this.f14382e = charSequence;
        this.f14399y = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(int i, int i7, String str, StringBuilder sb) {
        if ((i & i7) == i7) {
            sb.append(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a
    public final ActionProviderVisibilityListenerC1212o a() {
        return this.f14375A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a
    public final InterfaceMenuItemC1442a b(ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o) {
        this.f14400z = null;
        this.f14375A = actionProviderVisibilityListenerC1212o;
        this.f14388n.p(true);
        ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o2 = this.f14375A;
        if (actionProviderVisibilityListenerC1212o2 != null) {
            actionProviderVisibilityListenerC1212o2.f14401a = new C1136a(1, this);
            actionProviderVisibilityListenerC1212o2.f14402b.setVisibilityListener(actionProviderVisibilityListenerC1212o2);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f14399y & 8) == 0) {
            return false;
        }
        if (this.f14400z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14376B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f14388n.d(this);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f14397w && (this.f14395u || this.f14396v)) {
            drawable = drawable.mutate();
            if (this.f14395u) {
                drawable.setTintList(this.f14393s);
            }
            if (this.f14396v) {
                drawable.setTintMode(this.f14394t);
            }
            this.f14397w = false;
        }
        return drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o;
        if ((this.f14399y & 8) != 0) {
            if (this.f14400z == null && (actionProviderVisibilityListenerC1212o = this.f14375A) != null) {
                this.f14400z = actionProviderVisibilityListenerC1212o.f14402b.onCreateActionView(this);
            }
            if (this.f14400z != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f14376B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f14388n.f(this);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(boolean z5) {
        this.f14398x = (z5 ? 4 : 0) | (this.f14398x & (-5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(boolean z5) {
        if (z5) {
            this.f14398x |= 32;
        } else {
            this.f14398x &= -33;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f14400z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o = this.f14375A;
        if (actionProviderVisibilityListenerC1212o == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC1212o.f14402b.onCreateActionView(this);
        this.f14400z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14385k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14391q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f14379b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f14386l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f14387m;
        if (i == 0) {
            return null;
        }
        Drawable drawableC = AbstractC0597a.C(this.f14388n.f14351a, i);
        this.f14387m = 0;
        this.f14386l = drawableC;
        return d(drawableC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14393s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14394t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14383g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f14378a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14384h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f14380c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f14389o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14382e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        return charSequence != null ? charSequence : this.f14382e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14392r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f14389o != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f14377C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f14398x & 1) == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f14398x & 2) == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f14398x & 16) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o = this.f14375A;
        return (actionProviderVisibilityListenerC1212o == null || !actionProviderVisibilityListenerC1212o.f14402b.overridesItemVisibility()) ? (this.f14398x & 8) == 0 : (this.f14398x & 8) == 0 && this.f14375A.f14402b.isVisible();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f14400z = view;
        this.f14375A = null;
        if (view != null && view.getId() == -1 && (i = this.f14378a) > 0) {
            view.setId(i);
        }
        MenuC1209l menuC1209l = this.f14388n;
        menuC1209l.f14358k = true;
        menuC1209l.p(true);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        if (this.j == c7) {
            return this;
        }
        this.j = Character.toLowerCase(c7);
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        int i = this.f14398x;
        int i7 = (z5 ? 1 : 0) | (i & (-2));
        this.f14398x = i7;
        if (i != i7) {
            this.f14388n.p(false);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        int i = this.f14398x;
        if ((i & 4) == 0) {
            int i7 = (i & (-3)) | (z5 ? 2 : 0);
            this.f14398x = i7;
            if (i != i7) {
                this.f14388n.p(false);
            }
            return this;
        }
        MenuC1209l menuC1209l = this.f14388n;
        ArrayList arrayList = menuC1209l.f;
        int size = arrayList.size();
        menuC1209l.w();
        for (int i8 = 0; i8 < size; i8++) {
            C1211n c1211n = (C1211n) arrayList.get(i8);
            if (c1211n.f14379b == this.f14379b && (c1211n.f14398x & 4) != 0 && c1211n.isCheckable()) {
                boolean z6 = c1211n == this;
                int i9 = c1211n.f14398x;
                int i10 = (z6 ? 2 : 0) | (i9 & (-3));
                c1211n.f14398x = i10;
                if (i9 != i10) {
                    c1211n.f14388n.p(false);
                }
            }
        }
        menuC1209l.v();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        if (z5) {
            this.f14398x |= 16;
        } else {
            this.f14398x &= -17;
        }
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14387m = 0;
        this.f14386l = drawable;
        this.f14397w = true;
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14393s = colorStateList;
        this.f14395u = true;
        this.f14397w = true;
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14394t = mode;
        this.f14396v = true;
        this.f14397w = true;
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14383g = intent;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        if (this.f14384h == c7) {
            return this;
        }
        this.f14384h = c7;
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14376B = onActionExpandListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14390p = onMenuItemClickListener;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f14384h = c7;
        this.j = Character.toLowerCase(c8);
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i7 = i & 3;
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f14399y = i;
        MenuC1209l menuC1209l = this.f14388n;
        menuC1209l.f14358k = true;
        menuC1209l.p(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14382e = charSequence;
        this.f14388n.p(false);
        SubMenuC1197D subMenuC1197D = this.f14389o;
        if (subMenuC1197D != null) {
            subMenuC1197D.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        int i = this.f14398x;
        int i7 = (z5 ? 0 : 8) | (i & (-9));
        this.f14398x = i7;
        if (i != i7) {
            MenuC1209l menuC1209l = this.f14388n;
            menuC1209l.f14357h = true;
            menuC1209l.p(true);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        CharSequence charSequence = this.f14382e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final InterfaceMenuItemC1442a setContentDescription(CharSequence charSequence) {
        this.f14391q = charSequence;
        this.f14388n.p(false);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final InterfaceMenuItemC1442a setTooltipText(CharSequence charSequence) {
        this.f14392r = charSequence;
        this.f14388n.p(false);
        return this;
    }

    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i) {
        if (this.j == c7 && this.f14385k == i) {
            return this;
        }
        this.j = Character.toLowerCase(c7);
        this.f14385k = KeyEvent.normalizeMetaState(i);
        this.f14388n.p(false);
        return this;
    }

    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i) {
        if (this.f14384h == c7 && this.i == i) {
            return this;
        }
        this.f14384h = c7;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f14388n.p(false);
        return this;
    }

    @Override // p1.InterfaceMenuItemC1442a, android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i, int i7) {
        this.f14384h = c7;
        this.i = KeyEvent.normalizeMetaState(i);
        this.j = Character.toLowerCase(c8);
        this.f14385k = KeyEvent.normalizeMetaState(i7);
        this.f14388n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f14386l = null;
        this.f14387m = i;
        this.f14397w = true;
        this.f14388n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f14388n.f14351a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i7;
        Context context = this.f14388n.f14351a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f14400z = viewInflate;
        this.f14375A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i7 = this.f14378a) > 0) {
            viewInflate.setId(i7);
        }
        MenuC1209l menuC1209l = this.f14388n;
        menuC1209l.f14358k = true;
        menuC1209l.p(true);
        return this;
    }
}
