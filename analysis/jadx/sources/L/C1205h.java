package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.C1100b;
import h.DialogInterfaceC1104f;

/* JADX INFO: renamed from: l.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1205h implements x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f14339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LayoutInflater f14340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MenuC1209l f14341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ExpandedMenuView f14342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w f14343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1204g f14344v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1205h(ContextWrapper contextWrapper) {
        this.f14339q = contextWrapper;
        this.f14340r = LayoutInflater.from(contextWrapper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void b(MenuC1209l menuC1209l, boolean z5) {
        w wVar = this.f14343u;
        if (wVar != null) {
            wVar.b(menuC1209l, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void d(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f14342t.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // l.x
    public final void f(w wVar) {
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
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void h(boolean z5) {
        C1204g c1204g = this.f14344v;
        if (c1204g != null) {
            c1204g.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void i(Context context, MenuC1209l menuC1209l) {
        if (this.f14339q != null) {
            this.f14339q = context;
            if (this.f14340r == null) {
                this.f14340r = LayoutInflater.from(context);
            }
        }
        this.f14341s = menuC1209l;
        C1204g c1204g = this.f14344v;
        if (c1204g != null) {
            c1204g.notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean j() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final Parcelable k() {
        if (this.f14342t == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f14342t;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean l(SubMenuC1197D subMenuC1197D) {
        boolean zHasVisibleItems = subMenuC1197D.hasVisibleItems();
        Context context = subMenuC1197D.f14351a;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC1210m dialogInterfaceOnKeyListenerC1210m = new DialogInterfaceOnKeyListenerC1210m();
        dialogInterfaceOnKeyListenerC1210m.f14372q = subMenuC1197D;
        U.l lVar = new U.l(context);
        C1100b c1100b = (C1100b) lVar.f7511r;
        C1205h c1205h = new C1205h(c1100b.f13247a);
        dialogInterfaceOnKeyListenerC1210m.f14374s = c1205h;
        c1205h.f14343u = dialogInterfaceOnKeyListenerC1210m;
        subMenuC1197D.b(c1205h, context);
        C1205h c1205h2 = dialogInterfaceOnKeyListenerC1210m.f14374s;
        if (c1205h2.f14344v == null) {
            c1205h2.f14344v = new C1204g(c1205h2);
        }
        c1100b.f13259p = c1205h2.f14344v;
        c1100b.f13260q = dialogInterfaceOnKeyListenerC1210m;
        View view = subMenuC1197D.f14362o;
        if (view != null) {
            c1100b.f13251e = view;
        } else {
            c1100b.f13249c = subMenuC1197D.f14361n;
            c1100b.f13250d = subMenuC1197D.f14360m;
        }
        c1100b.f13258o = dialogInterfaceOnKeyListenerC1210m;
        DialogInterfaceC1104f dialogInterfaceC1104fF = lVar.f();
        dialogInterfaceOnKeyListenerC1210m.f14373r = dialogInterfaceC1104fF;
        dialogInterfaceC1104fF.setOnDismissListener(dialogInterfaceOnKeyListenerC1210m);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC1210m.f14373r.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC1210m.f14373r.show();
        w wVar = this.f14343u;
        if (wVar == null) {
            return true;
        }
        wVar.g(subMenuC1197D);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean m(C1211n c1211n) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f14341s.q(this.f14344v.getItem(i), this, 0);
    }
}
