package p1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import l.ActionProviderVisibilityListenerC1212o;

/* JADX INFO: renamed from: p1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC1442a extends MenuItem {
    ActionProviderVisibilityListenerC1212o a();

    InterfaceMenuItemC1442a b(ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c7, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1442a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c7, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c7, char c8, int i, int i7);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1442a setTooltipText(CharSequence charSequence);
}
