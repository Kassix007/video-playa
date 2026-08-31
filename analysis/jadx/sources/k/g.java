package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import l.ActionProviderVisibilityListenerC1212o;
import l.C1211n;
import l.MenuItemC1216s;
import p1.InterfaceMenuItemC1442a;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f13930A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f13931B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f13934E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f13935a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13941h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f13942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f13943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f13945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f13947p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13948q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13949r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13950s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13951t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13952u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f13955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f13956y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC1212o f13957z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f13932C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f13933D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13936b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13937c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13938d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13939e = 0;
    public boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13940g = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(h hVar, Menu menu) {
        this.f13934E = hVar;
        this.f13935a = menu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f13934E.f13961c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e7) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e7);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(MenuItem menuItem) {
        boolean z5 = false;
        menuItem.setChecked(this.f13950s).setVisible(this.f13951t).setEnabled(this.f13952u).setCheckable(this.f13949r >= 1).setTitleCondensed(this.f13943l).setIcon(this.f13944m);
        int i = this.f13953v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f13956y;
        h hVar = this.f13934E;
        if (str != null) {
            if (hVar.f13961c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (hVar.f13962d == null) {
                hVar.f13962d = h.a(hVar.f13961c);
            }
            Object obj = hVar.f13962d;
            String str2 = this.f13956y;
            f fVar = new f();
            fVar.f13928a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f13929b = cls.getMethod(str2, f.f13927c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e7) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e7);
                throw inflateException;
            }
        }
        if (this.f13949r >= 2) {
            if (menuItem instanceof C1211n) {
                ((C1211n) menuItem).f(true);
            } else if (menuItem instanceof MenuItemC1216s) {
                MenuItemC1216s menuItemC1216s = (MenuItemC1216s) menuItem;
                InterfaceMenuItemC1442a interfaceMenuItemC1442a = menuItemC1216s.f14408c;
                try {
                    if (menuItemC1216s.f14409d == null) {
                        menuItemC1216s.f14409d = interfaceMenuItemC1442a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC1216s.f14409d.invoke(interfaceMenuItemC1442a, Boolean.TRUE);
                } catch (Exception e8) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
                }
            }
        }
        String str3 = this.f13955x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f13958e, hVar.f13959a));
            z5 = true;
        }
        int i7 = this.f13954w;
        if (i7 > 0) {
            if (z5) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i7);
            }
        }
        ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o = this.f13957z;
        if (actionProviderVisibilityListenerC1212o != null) {
            if (menuItem instanceof InterfaceMenuItemC1442a) {
                ((InterfaceMenuItemC1442a) menuItem).b(actionProviderVisibilityListenerC1212o);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f13930A;
        boolean z6 = menuItem instanceof InterfaceMenuItemC1442a;
        if (z6) {
            ((InterfaceMenuItemC1442a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            E0.d.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f13931B;
        if (z6) {
            ((InterfaceMenuItemC1442a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            E0.d.l(menuItem, charSequence2);
        }
        char c7 = this.f13945n;
        int i8 = this.f13946o;
        if (z6) {
            ((InterfaceMenuItemC1442a) menuItem).setAlphabeticShortcut(c7, i8);
        } else if (Build.VERSION.SDK_INT >= 26) {
            E0.d.g(menuItem, c7, i8);
        }
        char c8 = this.f13947p;
        int i9 = this.f13948q;
        if (z6) {
            ((InterfaceMenuItemC1442a) menuItem).setNumericShortcut(c8, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            E0.d.k(menuItem, c8, i9);
        }
        PorterDuff.Mode mode = this.f13933D;
        if (mode != null) {
            if (z6) {
                ((InterfaceMenuItemC1442a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                E0.d.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f13932C;
        if (colorStateList != null) {
            if (z6) {
                ((InterfaceMenuItemC1442a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                E0.d.i(menuItem, colorStateList);
            }
        }
    }
}
