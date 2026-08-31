package l;

import C0.AbstractC0067b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import p1.InterfaceMenuItemC1442a;

/* JADX INFO: renamed from: l.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemC1216s extends AbstractC0067b implements MenuItem {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceMenuItemC1442a f14408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f14409d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuItemC1216s(Context context, InterfaceMenuItemC1442a interfaceMenuItemC1442a) {
        super(context);
        if (interfaceMenuItemC1442a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f14408c = interfaceMenuItemC1442a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f14408c.collapseActionView();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f14408c.expandActionView();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212oA = this.f14408c.a();
        if (actionProviderVisibilityListenerC1212oA != null) {
            return actionProviderVisibilityListenerC1212oA.f14402b;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f14408c.getActionView();
        return actionView instanceof C1213p ? (View) ((C1213p) actionView).f14403q : actionView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f14408c.getAlphabeticModifiers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f14408c.getAlphabeticShortcut();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f14408c.getContentDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f14408c.getGroupId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f14408c.getIcon();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f14408c.getIconTintList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f14408c.getIconTintMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f14408c.getIntent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f14408c.getItemId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f14408c.getMenuInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f14408c.getNumericModifiers();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f14408c.getNumericShortcut();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f14408c.getOrder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f14408c.getSubMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f14408c.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f14408c.getTitleCondensed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f14408c.getTooltipText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f14408c.hasSubMenu();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f14408c.isActionViewExpanded();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f14408c.isCheckable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f14408c.isChecked();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f14408c.isEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f14408c.isVisible();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o = new ActionProviderVisibilityListenerC1212o(this, actionProvider);
        if (actionProvider == null) {
            actionProviderVisibilityListenerC1212o = null;
        }
        this.f14408c.b(actionProviderVisibilityListenerC1212o);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C1213p(view);
        }
        this.f14408c.setActionView(view);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7) {
        this.f14408c.setAlphabeticShortcut(c7);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        this.f14408c.setCheckable(z5);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        this.f14408c.setChecked(z5);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f14408c.setContentDescription(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        this.f14408c.setEnabled(z5);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f14408c.setIcon(drawable);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f14408c.setIconTintList(colorStateList);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f14408c.setIconTintMode(mode);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f14408c.setIntent(intent);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7) {
        this.f14408c.setNumericShortcut(c7);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f14408c.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC1214q(this, onActionExpandListener) : null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f14408c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC1215r(this, onMenuItemClickListener) : null);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8) {
        this.f14408c.setShortcut(c7, c8);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f14408c.setShowAsAction(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f14408c.setShowAsActionFlags(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f14408c.setTitle(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f14408c.setTitleCondensed(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f14408c.setTooltipText(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        return this.f14408c.setVisible(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c7, int i) {
        this.f14408c.setAlphabeticShortcut(c7, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f14408c.setIcon(i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c7, int i) {
        this.f14408c.setNumericShortcut(c7, i);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c7, char c8, int i, int i7) {
        this.f14408c.setShortcut(c7, c8, i, i7);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f14408c.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        InterfaceMenuItemC1442a interfaceMenuItemC1442a = this.f14408c;
        interfaceMenuItemC1442a.setActionView(i);
        View actionView = interfaceMenuItemC1442a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC1442a.setActionView(new C1213p(actionView));
        }
        return this;
    }
}
