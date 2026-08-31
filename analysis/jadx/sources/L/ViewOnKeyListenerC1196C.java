package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.wnapp.smspariaz.R;
import m.C1258H0;
import m.C1325p0;

/* JADX INFO: renamed from: l.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1196C extends AbstractC1217t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PopupWindow.OnDismissListener f14271A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f14272B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f14273C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public w f14274D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ViewTreeObserver f14275E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f14276F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f14277G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f14278H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f14280J;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f14281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MenuC1209l f14282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1206i f14283t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1258H0 f14287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1201d f14288y = new ViewTreeObserverOnGlobalLayoutListenerC1201d(1, this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0.D f14289z = new C0.D(5, this);

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f14279I = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnKeyListenerC1196C(Context context, MenuC1209l menuC1209l, View view, int i, boolean z5) {
        this.f14281r = context;
        this.f14282s = menuC1209l;
        this.f14284u = z5;
        this.f14283t = new C1206i(menuC1209l, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f14286w = i;
        Resources resources = context.getResources();
        this.f14285v = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f14272B = view;
        this.f14287x = new C1258H0(context, null, i, 0);
        menuC1209l.b(this, context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final boolean a() {
        return !this.f14276F && this.f14287x.f14636P.isShowing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void b(MenuC1209l menuC1209l, boolean z5) {
        if (menuC1209l != this.f14282s) {
            return;
        }
        dismiss();
        w wVar = this.f14274D;
        if (wVar != null) {
            wVar.b(menuC1209l, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final void c() {
        View view;
        if (a()) {
            return;
        }
        if (this.f14276F || (view = this.f14272B) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f14273C = view;
        C1258H0 c1258h0 = this.f14287x;
        c1258h0.f14636P.setOnDismissListener(this);
        c1258h0.f14626F = this;
        c1258h0.f14635O = true;
        c1258h0.f14636P.setFocusable(true);
        View view2 = this.f14273C;
        boolean z5 = this.f14275E == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f14275E = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f14288y);
        }
        view2.addOnAttachStateChangeListener(this.f14289z);
        c1258h0.f14625E = view2;
        c1258h0.f14622B = this.f14279I;
        boolean z6 = this.f14277G;
        Context context = this.f14281r;
        C1206i c1206i = this.f14283t;
        if (!z6) {
            this.f14278H = AbstractC1217t.o(c1206i, context, this.f14285v);
            this.f14277G = true;
        }
        c1258h0.r(this.f14278H);
        c1258h0.f14636P.setInputMethodMode(2);
        Rect rect = this.f14410q;
        c1258h0.f14634N = rect != null ? new Rect(rect) : null;
        c1258h0.c();
        C1325p0 c1325p0 = c1258h0.f14639s;
        c1325p0.setOnKeyListener(this);
        if (this.f14280J) {
            MenuC1209l menuC1209l = this.f14282s;
            if (menuC1209l.f14360m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1325p0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1209l.f14360m);
                }
                frameLayout.setEnabled(false);
                c1325p0.addHeaderView(frameLayout, null, false);
            }
        }
        c1258h0.p(c1206i);
        c1258h0.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final void dismiss() {
        if (a()) {
            this.f14287x.dismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final C1325p0 e() {
        return this.f14287x.f14639s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void f(w wVar) {
        this.f14274D = wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void h(boolean z5) {
        this.f14277G = false;
        C1206i c1206i = this.f14283t;
        if (c1206i != null) {
            c1206i.notifyDataSetChanged();
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
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final boolean l(SubMenuC1197D subMenuC1197D) {
        boolean z5;
        if (subMenuC1197D.hasVisibleItems()) {
            v vVar = new v(this.f14281r, subMenuC1197D, this.f14273C, this.f14284u, this.f14286w, 0);
            w wVar = this.f14274D;
            vVar.f14418h = wVar;
            AbstractC1217t abstractC1217t = vVar.i;
            if (abstractC1217t != null) {
                abstractC1217t.f(wVar);
            }
            int size = subMenuC1197D.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z5 = false;
                    break;
                }
                MenuItem item = subMenuC1197D.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z5 = true;
                    break;
                }
                i++;
            }
            vVar.f14417g = z5;
            AbstractC1217t abstractC1217t2 = vVar.i;
            if (abstractC1217t2 != null) {
                abstractC1217t2.q(z5);
            }
            vVar.j = this.f14271A;
            this.f14271A = null;
            this.f14282s.c(false);
            C1258H0 c1258h0 = this.f14287x;
            int width = c1258h0.f14642v;
            int iM = c1258h0.m();
            if ((Gravity.getAbsoluteGravity(this.f14279I, this.f14272B.getLayoutDirection()) & 7) == 5) {
                width += this.f14272B.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f14416e != null) {
                    vVar.d(width, iM, true, true);
                }
            }
            w wVar2 = this.f14274D;
            if (wVar2 != null) {
                wVar2.g(subMenuC1197D);
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f14276F = true;
        this.f14282s.c(true);
        ViewTreeObserver viewTreeObserver = this.f14275E;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f14275E = this.f14273C.getViewTreeObserver();
            }
            this.f14275E.removeGlobalOnLayoutListener(this.f14288y);
            this.f14275E = null;
        }
        this.f14273C.removeOnAttachStateChangeListener(this.f14289z);
        PopupWindow.OnDismissListener onDismissListener = this.f14271A;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void p(View view) {
        this.f14272B = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void q(boolean z5) {
        this.f14283t.f14347c = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void r(int i) {
        this.f14279I = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void s(int i) {
        this.f14287x.f14642v = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f14271A = onDismissListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void u(boolean z5) {
        this.f14280J = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void v(int i) {
        this.f14287x.h(i);
    }

    @Override // l.x
    public final void d(Parcelable parcelable) {
    }

    @Override // l.AbstractC1217t
    public final void n(MenuC1209l menuC1209l) {
    }
}
