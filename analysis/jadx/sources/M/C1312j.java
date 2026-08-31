package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.wnapp.smspariaz.R;
import i1.C1134a;
import java.util.ArrayList;
import l.AbstractC1217t;
import l.ActionProviderVisibilityListenerC1212o;
import l.C1211n;
import l.MenuC1209l;
import l.SubMenuC1197D;

/* JADX INFO: renamed from: m.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1312j implements l.x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Drawable f14795A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f14796B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f14797C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f14798D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f14799E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14800F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14801G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f14802H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1302e f14804J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C1302e f14805K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public RunnableC1306g f14806L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1304f f14807M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f14809O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f14810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f14811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MenuC1209l f14812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LayoutInflater f14813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l.w f14814u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l.z f14817x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14818y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1308h f14819z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14815v = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14816w = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseBooleanArray f14803I = new SparseBooleanArray();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final C1134a f14808N = new C1134a(3, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1312j(Context context) {
        this.f14810q = context;
        this.f14813t = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public final View a(C1211n c1211n, View view, ViewGroup viewGroup) {
        View actionView = c1211n.getActionView();
        if (actionView == null || c1211n.e()) {
            l.y yVar = view instanceof l.y ? (l.y) view : (l.y) this.f14813t.inflate(this.f14816w, viewGroup, false);
            yVar.b(c1211n);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f14817x);
            if (this.f14807M == null) {
                this.f14807M = new C1304f(this);
            }
            actionMenuItemView.setPopupCallback(this.f14807M);
            actionView = (View) yVar;
        }
        actionView.setVisibility(c1211n.f14377C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1316l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void b(MenuC1209l menuC1209l, boolean z5) {
        c();
        C1302e c1302e = this.f14805K;
        if (c1302e != null && c1302e.b()) {
            c1302e.i.dismiss();
        }
        l.w wVar = this.f14814u;
        if (wVar != null) {
            wVar.b(menuC1209l, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        Object obj;
        RunnableC1306g runnableC1306g = this.f14806L;
        if (runnableC1306g != null && (obj = this.f14817x) != null) {
            ((View) obj).removeCallbacks(runnableC1306g);
            this.f14806L = null;
            return true;
        }
        C1302e c1302e = this.f14804J;
        if (c1302e == null) {
            return false;
        }
        if (c1302e.b()) {
            c1302e.i.dismiss();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void d(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof C1310i) && (i = ((C1310i) parcelable).f14794q) > 0 && (menuItemFindItem = this.f14812s.findItem(i)) != null) {
            l((SubMenuC1197D) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        C1302e c1302e = this.f14804J;
        return c1302e != null && c1302e.b();
    }

    @Override // l.x
    public final void f(l.w wVar) {
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean g(C1211n c1211n) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final int getId() {
        return this.f14818y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.x
    public final void h(boolean z5) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f14817x;
        ArrayList arrayList = null;
        boolean z6 = false;
        if (viewGroup != null) {
            MenuC1209l menuC1209l = this.f14812s;
            if (menuC1209l != null) {
                menuC1209l.i();
                ArrayList arrayListL = this.f14812s.l();
                int size = arrayListL.size();
                i = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    C1211n c1211n = (C1211n) arrayListL.get(i7);
                    if ((c1211n.f14398x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        C1211n itemData = childAt instanceof l.y ? ((l.y) childAt).getItemData() : null;
                        View viewA = a(c1211n, childAt, viewGroup);
                        if (c1211n != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f14817x).addView(viewA, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f14819z) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f14817x).requestLayout();
        MenuC1209l menuC1209l2 = this.f14812s;
        if (menuC1209l2 != null) {
            menuC1209l2.i();
            ArrayList arrayList2 = menuC1209l2.i;
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ActionProviderVisibilityListenerC1212o actionProviderVisibilityListenerC1212o = ((C1211n) arrayList2.get(i8)).f14375A;
            }
        }
        MenuC1209l menuC1209l3 = this.f14812s;
        if (menuC1209l3 != null) {
            menuC1209l3.i();
            arrayList = menuC1209l3.j;
        }
        if (this.f14797C && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((C1211n) arrayList.get(0)).f14377C;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f14819z == null) {
                this.f14819z = new C1308h(this, this.f14810q);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f14819z.getParent();
            if (viewGroup3 != this.f14817x) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f14819z);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f14817x;
                C1308h c1308h = this.f14819z;
                actionMenuView.getClass();
                C1316l c1316lJ = ActionMenuView.j();
                c1316lJ.f14822a = true;
                actionMenuView.addView(c1308h, c1316lJ);
            }
        } else {
            C1308h c1308h2 = this.f14819z;
            if (c1308h2 != null) {
                Object parent = c1308h2.getParent();
                Object obj = this.f14817x;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f14819z);
                }
            }
        }
        ((ActionMenuView) this.f14817x).setOverflowReserved(this.f14797C);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void i(Context context, MenuC1209l menuC1209l) {
        this.f14811r = context;
        LayoutInflater.from(context);
        this.f14812s = menuC1209l;
        Resources resources = context.getResources();
        if (!this.f14798D) {
            this.f14797C = true;
        }
        int i = 2;
        this.f14799E = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600 || ((i7 > 960 && i8 > 720) || (i7 > 720 && i8 > 960))) {
            i = 5;
        } else if (i7 >= 500 || ((i7 > 640 && i8 > 480) || (i7 > 480 && i8 > 640))) {
            i = 4;
        } else if (i7 >= 360) {
            i = 3;
        }
        this.f14801G = i;
        int measuredWidth = this.f14799E;
        if (this.f14797C) {
            if (this.f14819z == null) {
                C1308h c1308h = new C1308h(this, this.f14810q);
                this.f14819z = c1308h;
                if (this.f14796B) {
                    c1308h.setImageDrawable(this.f14795A);
                    this.f14795A = null;
                    this.f14796B = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f14819z.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f14819z.getMeasuredWidth();
        } else {
            this.f14819z = null;
        }
        this.f14800F = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean j() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z5;
        C1312j c1312j = this;
        MenuC1209l menuC1209l = c1312j.f14812s;
        if (menuC1209l != null) {
            arrayListL = menuC1209l.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i7 = c1312j.f14801G;
        int i8 = c1312j.f14800F;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1312j.f14817x;
        int i9 = 0;
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i = 2;
            z5 = true;
            if (i9 >= size) {
                break;
            }
            C1211n c1211n = (C1211n) arrayListL.get(i9);
            int i12 = c1211n.f14399y;
            if ((i12 & 2) == 2) {
                i10++;
            } else if ((i12 & 1) == 1) {
                i11++;
            } else {
                z6 = true;
            }
            if (c1312j.f14802H && c1211n.f14377C) {
                i7 = 0;
            }
            i9++;
        }
        if (c1312j.f14797C && (z6 || i11 + i10 > i7)) {
            i7--;
        }
        int i13 = i7 - i10;
        SparseBooleanArray sparseBooleanArray = c1312j.f14803I;
        sparseBooleanArray.clear();
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            C1211n c1211n2 = (C1211n) arrayListL.get(i14);
            int i16 = c1211n2.f14399y;
            boolean z7 = (i16 & 2) == i ? z5 : false;
            int i17 = c1211n2.f14379b;
            if (z7) {
                View viewA = c1312j.a(c1211n2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                if (i17 != 0) {
                    sparseBooleanArray.put(i17, z5);
                }
                c1211n2.g(z5);
            } else if ((i16 & 1) == z5) {
                boolean z8 = sparseBooleanArray.get(i17);
                boolean z9 = ((i13 > 0 || z8) && i8 > 0) ? z5 : false;
                if (z9) {
                    View viewA2 = c1312j.a(c1211n2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z9 &= i8 + i15 > 0;
                }
                if (z9 && i17 != 0) {
                    sparseBooleanArray.put(i17, true);
                } else if (z8) {
                    sparseBooleanArray.put(i17, false);
                    for (int i18 = 0; i18 < i14; i18++) {
                        C1211n c1211n3 = (C1211n) arrayListL.get(i18);
                        if (c1211n3.f14379b == i17) {
                            if ((c1211n3.f14398x & 32) == 32) {
                                i13++;
                            }
                            c1211n3.g(false);
                        }
                    }
                }
                if (z9) {
                    i13--;
                }
                c1211n2.g(z9);
            } else {
                c1211n2.g(false);
                i14++;
                i = 2;
                c1312j = this;
                z5 = true;
            }
            i14++;
            i = 2;
            c1312j = this;
            z5 = true;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final Parcelable k() {
        C1310i c1310i = new C1310i();
        c1310i.f14794q = this.f14809O;
        return c1310i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x003a */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: l.z */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.x
    public final boolean l(SubMenuC1197D subMenuC1197D) {
        boolean z5;
        if (subMenuC1197D.hasVisibleItems()) {
            SubMenuC1197D subMenuC1197D2 = subMenuC1197D;
            while (true) {
                MenuC1209l menuC1209l = subMenuC1197D2.f14291z;
                if (menuC1209l == this.f14812s) {
                    break;
                }
                subMenuC1197D2 = (SubMenuC1197D) menuC1209l;
            }
            C1211n c1211n = subMenuC1197D2.f14290A;
            ViewGroup viewGroup = (ViewGroup) this.f14817x;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof l.y) && ((l.y) childAt).getItemData() == c1211n) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.f14809O = subMenuC1197D.f14290A.f14378a;
                int size = subMenuC1197D.f.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        z5 = false;
                        break;
                    }
                    MenuItem item = subMenuC1197D.getItem(i7);
                    if (item.isVisible() && item.getIcon() != null) {
                        z5 = true;
                        break;
                    }
                    i7++;
                }
                C1302e c1302e = new C1302e(this, this.f14811r, subMenuC1197D, view);
                this.f14805K = c1302e;
                c1302e.f14417g = z5;
                AbstractC1217t abstractC1217t = c1302e.i;
                if (abstractC1217t != null) {
                    abstractC1217t.q(z5);
                }
                C1302e c1302e2 = this.f14805K;
                if (!c1302e2.b()) {
                    if (c1302e2.f14416e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c1302e2.d(0, 0, false, false);
                }
                l.w wVar = this.f14814u;
                if (wVar != null) {
                    wVar.g(subMenuC1197D);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean m(C1211n c1211n) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n() {
        MenuC1209l menuC1209l;
        if (!this.f14797C || e() || (menuC1209l = this.f14812s) == null || this.f14817x == null || this.f14806L != null) {
            return false;
        }
        menuC1209l.i();
        if (menuC1209l.j.isEmpty()) {
            return false;
        }
        RunnableC1306g runnableC1306g = new RunnableC1306g(this, new C1302e(this, this.f14811r, this.f14812s, this.f14819z));
        this.f14806L = runnableC1306g;
        ((View) this.f14817x).post(runnableC1306g);
        return true;
    }
}
