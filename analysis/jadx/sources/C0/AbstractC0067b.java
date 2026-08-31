package C0;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;
import l.MenuItemC1216s;
import p1.InterfaceMenuItemC1442a;
import r1.C1574b;

/* JADX INFO: renamed from: C0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0067b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f991b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0067b(Context context) {
        this.f990a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        h.v vVar = (h.v) this.f990a;
        if (vVar != null) {
            try {
                ((h.y) this.f991b).f13342A.unregisterReceiver(vVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f990a = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d() {
        J1.T t6 = (J1.T) this.f990a;
        C1574b c1574b = (C1574b) this.f991b;
        HashSet hashSet = t6.f2602e;
        if (hashSet.remove(c1574b) && hashSet.isEmpty()) {
            t6.b();
        }
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i);

    public abstract int g();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC1442a)) {
            return menuItem;
        }
        InterfaceMenuItemC1442a interfaceMenuItemC1442a = (InterfaceMenuItemC1442a) menuItem;
        if (((r.Q) this.f991b) == null) {
            this.f991b = new r.Q(0);
        }
        MenuItem menuItem2 = (MenuItem) ((r.Q) this.f991b).get(interfaceMenuItemC1442a);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC1216s menuItemC1216s = new MenuItemC1216s((Context) this.f990a, interfaceMenuItemC1442a);
        ((r.Q) this.f991b).put(interfaceMenuItemC1442a, menuItemC1216s);
        return menuItemC1216s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int[] i(int i, int i7) {
        if (i < 0 || i7 < 0 || i == i7) {
            return null;
        }
        int[] iArr = (int[]) this.f991b;
        iArr[0] = i;
        iArr[1] = i7;
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String j() {
        String str = (String) this.f990a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.m.k("text");
        throw null;
    }

    public abstract void k();

    public abstract int[] l(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m() {
        c();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((h.v) this.f990a) == null) {
            this.f990a = new h.v(this);
        }
        ((h.y) this.f991b).f13342A.registerReceiver((h.v) this.f990a, intentFilterE);
    }

    public AbstractC0067b() {
        this.f991b = new int[2];
    }

    public AbstractC0067b(J1.T t6, C1574b c1574b) {
        this.f990a = t6;
        this.f991b = c1574b;
    }

    public AbstractC0067b(h.y yVar) {
        this.f991b = yVar;
    }
}
