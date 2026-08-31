package m;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC1169b;
import l.C1211n;
import l.C1213p;
import l.MenuC1209l;
import l.SubMenuC1197D;

/* JADX INFO: renamed from: m.T0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1281T0 implements l.x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuC1209l f14709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1211n f14710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Toolbar f14711s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1281T0(Toolbar toolbar) {
        this.f14711s = toolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean g(C1211n c1211n) {
        Toolbar toolbar = this.f14711s;
        toolbar.c();
        ViewParent parent = toolbar.f9212x.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f9212x);
            }
            toolbar.addView(toolbar.f9212x);
        }
        View actionView = c1211n.getActionView();
        toolbar.f9213y = actionView;
        this.f14710r = c1211n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f9213y);
            }
            C1283U0 c1283u0H = Toolbar.h();
            c1283u0H.f14712a = (toolbar.f9175D & 112) | 8388611;
            c1283u0H.f14713b = 2;
            toolbar.f9213y.setLayoutParams(c1283u0H);
            toolbar.addView(toolbar.f9213y);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1283U0) childAt.getLayoutParams()).f14713b != 2 && childAt != toolbar.f9205q) {
                toolbar.removeViewAt(childCount);
                toolbar.f9192U.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1211n.f14377C = true;
        c1211n.f14388n.p(false);
        KeyEvent.Callback callback = toolbar.f9213y;
        if (callback instanceof InterfaceC1169b) {
            ((C1213p) ((InterfaceC1169b) callback)).f14403q.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final int getId() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void h(boolean z5) {
        if (this.f14710r != null) {
            MenuC1209l menuC1209l = this.f14709q;
            if (menuC1209l != null) {
                int size = menuC1209l.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f14709q.getItem(i) == this.f14710r) {
                        return;
                    }
                }
            }
            m(this.f14710r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void i(Context context, MenuC1209l menuC1209l) {
        C1211n c1211n;
        MenuC1209l menuC1209l2 = this.f14709q;
        if (menuC1209l2 != null && (c1211n = this.f14710r) != null) {
            menuC1209l2.d(c1211n);
        }
        this.f14709q = menuC1209l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean j() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final Parcelable k() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean l(SubMenuC1197D subMenuC1197D) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean m(C1211n c1211n) {
        Toolbar toolbar = this.f14711s;
        KeyEvent.Callback callback = toolbar.f9213y;
        if (callback instanceof InterfaceC1169b) {
            ((C1213p) ((InterfaceC1169b) callback)).f14403q.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f9213y);
        toolbar.removeView(toolbar.f9212x);
        toolbar.f9213y = null;
        ArrayList arrayList = toolbar.f9192U;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f14710r = null;
        toolbar.requestLayout();
        c1211n.f14377C = false;
        c1211n.f14388n.p(false);
        toolbar.u();
        return true;
    }

    @Override // l.x
    public final void d(Parcelable parcelable) {
    }

    @Override // l.x
    public final void b(MenuC1209l menuC1209l, boolean z5) {
    }
}
