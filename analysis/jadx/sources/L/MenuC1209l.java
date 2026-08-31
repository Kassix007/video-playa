package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.AbstractC1836L;

/* JADX INFO: renamed from: l.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class MenuC1209l implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f14350y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f14352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1207j f14355e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f14356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14357h;
    public final ArrayList i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14358k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f14360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f14361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f14362o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1211n f14369v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14371x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14359l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14363p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14364q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14365r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14366s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f14367t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f14368u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14370w = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuC1209l(Context context) {
        boolean zO;
        boolean z5 = false;
        this.f14351a = context;
        Resources resources = context.getResources();
        this.f14352b = resources;
        this.f = new ArrayList();
        this.f14356g = new ArrayList();
        this.f14357h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.f14358k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC1836L.f18154a;
            if (Build.VERSION.SDK_INT >= 28) {
                zO = A1.k.o(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zO = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zO) {
                z5 = true;
            }
        }
        this.f14354d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1211n a(int i, int i7, int i8, CharSequence charSequence) {
        int i9;
        int i10 = ((-65536) & i8) >> 16;
        if (i10 < 0 || i10 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i11 = (f14350y[i10] << 16) | (65535 & i8);
        C1211n c1211n = new C1211n(this, i, i7, i8, i11, charSequence, this.f14359l);
        ArrayList arrayList = this.f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i9 = 0;
                break;
            }
            if (((C1211n) arrayList.get(size)).f14381d <= i11) {
                i9 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i9, c1211n);
        p(true);
        return c1211n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        int i10;
        PackageManager packageManager = this.f14351a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i9 & 1) == 0) {
            removeGroup(i);
        }
        for (int i11 = 0; i11 < size; i11++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i11);
            int i12 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i12 < 0 ? intent : intentArr[i12]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C1211n c1211nA = a(i, i7, i8, resolveInfo.loadLabel(packageManager));
            c1211nA.setIcon(resolveInfo.loadIcon(packageManager));
            c1211nA.f14383g = intent2;
            if (menuItemArr != null && (i10 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i10] = c1211nA;
            }
        }
        return size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(x xVar, Context context) {
        this.f14368u.add(new WeakReference(xVar));
        xVar.i(context, this);
        this.f14358k = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(boolean z5) {
        if (this.f14366s) {
            return;
        }
        this.f14366s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14368u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.b(this, z5);
            }
        }
        this.f14366s = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void clear() {
        C1211n c1211n = this.f14369v;
        if (c1211n != null) {
            d(c1211n);
        }
        this.f.clear();
        p(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void clearHeader() {
        this.f14361n = null;
        this.f14360m = null;
        this.f14362o = null;
        p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d(C1211n c1211n) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14368u;
        boolean zM = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f14369v == c1211n) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar != null) {
                    zM = xVar.m(c1211n);
                    if (zM) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zM) {
                this.f14369v = null;
            }
        }
        return zM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean e(MenuC1209l menuC1209l, MenuItem menuItem) {
        InterfaceC1207j interfaceC1207j = this.f14355e;
        return interfaceC1207j != null && interfaceC1207j.e(menuC1209l, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean f(C1211n c1211n) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14368u;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar != null) {
                zG = xVar.g(c1211n);
                if (zG) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zG) {
            this.f14369v = c1211n;
        }
        return zG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1211n c1211n = (C1211n) arrayList.get(i7);
            if (c1211n.f14378a == i) {
                return c1211n;
            }
            if (c1211n.hasSubMenu() && (menuItemFindItem = c1211n.f14389o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1211n g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f14367t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C1211n) arrayList.get(0);
        }
        boolean zN = n();
        for (int i7 = 0; i7 < size; i7++) {
            C1211n c1211n = (C1211n) arrayList.get(i7);
            char c7 = zN ? c1211n.j : c1211n.f14384h;
            char[] cArr = keyData.meta;
            if ((c7 == cArr[0] && (metaState & 2) == 0) || ((c7 == cArr[2] && (metaState & 2) != 0) || (zN && c7 == '\b' && i == 67))) {
                return c1211n;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C1211n c1211n = (C1211n) arrayList.get(i7);
                if (c1211n.hasSubMenu()) {
                    c1211n.f14389o.h(list, i, keyEvent);
                }
                char c7 = zN ? c1211n.j : c1211n.f14384h;
                if ((modifiers & 69647) == ((zN ? c1211n.f14385k : c1211n.i) & 69647) && c7 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c7 == cArr[0] || c7 == cArr[2] || (zN && c7 == '\b' && i == 67)) && c1211n.isEnabled()) {
                        list.add(c1211n);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f14371x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1211n) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        ArrayList arrayListL = l();
        if (this.f14358k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14368u;
            boolean zJ = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zJ |= xVar.j();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zJ) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    C1211n c1211n = (C1211n) arrayListL.get(i);
                    if ((c1211n.f14398x & 32) == 32) {
                        arrayList.add(c1211n);
                    } else {
                        arrayList2.add(c1211n);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f14358k = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String j() {
        return "android:menu:actionviewstates";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList l() {
        boolean z5 = this.f14357h;
        ArrayList arrayList = this.f14356g;
        if (!z5) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C1211n c1211n = (C1211n) arrayList2.get(i);
            if (c1211n.isVisible()) {
                arrayList.add(c1211n);
            }
        }
        this.f14357h = false;
        this.f14358k = true;
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean m() {
        return this.f14370w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean n() {
        return this.f14353c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean o() {
        return this.f14354d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(boolean z5) {
        if (this.f14363p) {
            this.f14364q = true;
            if (z5) {
                this.f14365r = true;
                return;
            }
            return;
        }
        if (z5) {
            this.f14357h = true;
            this.f14358k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14368u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.h(z5);
            }
        }
        v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i7) {
        return q(findItem(i), null, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i7) {
        C1211n c1211nG = g(i, keyEvent);
        boolean zQ = c1211nG != null ? q(c1211nG, null, i7) : false;
        if ((i7 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, l.x r8, int r9) {
        /*
            r6 = this;
            l.n r7 = (l.C1211n) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            l.l r1 = r7.f14388n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f14390p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.f14383g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f14351a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            l.o r1 = r7.f14375A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f14402b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            l.o r2 = r7.f14375A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.f14402b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            l.D r9 = new l.D
            android.content.Context r5 = r6.f14351a
            r9.<init>(r5, r6, r7)
            r7.f14389o = r9
            java.lang.CharSequence r5 = r7.f14382e
            r9.setHeaderTitle(r5)
        L90:
            l.D r7 = r7.f14389o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.f14402b
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f14368u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.l(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            l.x r4 = (l.x) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.l(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.MenuC1209l.q(android.view.MenuItem, l.x, int):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(x xVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f14368u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                i8 = -1;
                break;
            } else if (((C1211n) arrayList.get(i8)).f14379b == i) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 >= 0) {
            int size2 = arrayList.size() - i8;
            while (true) {
                int i9 = i7 + 1;
                if (i7 >= size2 || ((C1211n) arrayList.get(i8)).f14379b != i) {
                    break;
                }
                if (i8 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i8 < arrayList2.size()) {
                        arrayList2.remove(i8);
                    }
                }
                i7 = i9;
            }
            p(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (((C1211n) arrayList.get(i7)).f14378a == i) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i7 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i7);
            p(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1197D) item.getSubMenu()).s(bundle);
            }
        }
        int i7 = bundle.getInt("android:menu:expandedactionview");
        if (i7 <= 0 || (menuItemFindItem = findItem(i7)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z5, boolean z6) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1211n c1211n = (C1211n) arrayList.get(i7);
            if (c1211n.f14379b == i) {
                c1211n.f(z6);
                c1211n.setCheckable(z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.f14370w = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z5) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1211n c1211n = (C1211n) arrayList.get(i7);
            if (c1211n.f14379b == i) {
                c1211n.setEnabled(z5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z5) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C1211n c1211n = (C1211n) arrayList.get(i7);
            if (c1211n.f14379b == i) {
                int i8 = c1211n.f14398x;
                int i9 = (i8 & (-9)) | (z5 ? 0 : 8);
                c1211n.f14398x = i9;
                if (i8 != i9) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            p(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f14353c = z5;
        p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1197D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(int i, CharSequence charSequence, int i7, Drawable drawable, View view) {
        if (view != null) {
            this.f14362o = view;
            this.f14360m = null;
            this.f14361n = null;
        } else {
            if (i > 0) {
                this.f14360m = this.f14352b.getText(i);
            } else if (charSequence != null) {
                this.f14360m = charSequence;
            }
            if (i7 > 0) {
                this.f14361n = this.f14351a.getDrawable(i7);
            } else if (drawable != null) {
                this.f14361n = drawable;
            }
            this.f14362o = null;
        }
        p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        this.f14363p = false;
        if (this.f14364q) {
            this.f14364q = false;
            p(this.f14365r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w() {
        if (this.f14363p) {
            return;
        }
        this.f14363p = true;
        this.f14364q = false;
        this.f14365r = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f14352b.getString(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f14352b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i7, int i8, CharSequence charSequence) {
        return a(i, i7, i8, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i7, int i8, CharSequence charSequence) {
        C1211n c1211nA = a(i, i7, i8, charSequence);
        SubMenuC1197D subMenuC1197D = new SubMenuC1197D(this.f14351a, this, c1211nA);
        c1211nA.f14389o = subMenuC1197D;
        subMenuC1197D.setHeaderTitle(c1211nA.f14382e);
        return subMenuC1197D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i7, int i8, int i9) {
        return a(i, i7, i8, this.f14352b.getString(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i7, int i8, int i9) {
        return addSubMenu(i, i7, i8, this.f14352b.getString(i9));
    }

    public MenuC1209l k() {
        return this;
    }
}
