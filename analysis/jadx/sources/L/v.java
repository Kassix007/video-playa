package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.wnapp.smspariaz.R;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MenuC1209l f14413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f14416e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f14418h;
    public AbstractC1217t i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f14419k = new u(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v(Context context, MenuC1209l menuC1209l, View view, boolean z5, int i, int i7) {
        this.f14412a = context;
        this.f14413b = menuC1209l;
        this.f14416e = view;
        this.f14414c = z5;
        this.f14415d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC1217t a() {
        AbstractC1217t viewOnKeyListenerC1196C;
        if (this.i == null) {
            Context context = this.f14412a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1196C = new ViewOnKeyListenerC1203f(context, this.f14416e, this.f14415d, this.f14414c);
            } else {
                viewOnKeyListenerC1196C = new ViewOnKeyListenerC1196C(this.f14412a, this.f14413b, this.f14416e, this.f14415d, this.f14414c);
            }
            viewOnKeyListenerC1196C.n(this.f14413b);
            viewOnKeyListenerC1196C.t(this.f14419k);
            viewOnKeyListenerC1196C.p(this.f14416e);
            viewOnKeyListenerC1196C.f(this.f14418h);
            viewOnKeyListenerC1196C.q(this.f14417g);
            viewOnKeyListenerC1196C.r(this.f);
            this.i = viewOnKeyListenerC1196C;
        }
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        AbstractC1217t abstractC1217t = this.i;
        return abstractC1217t != null && abstractC1217t.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, int i7, boolean z5, boolean z6) {
        AbstractC1217t abstractC1217tA = a();
        abstractC1217tA.u(z6);
        if (z5) {
            if ((Gravity.getAbsoluteGravity(this.f, this.f14416e.getLayoutDirection()) & 7) == 5) {
                i -= this.f14416e.getWidth();
            }
            abstractC1217tA.s(i);
            abstractC1217tA.v(i7);
            int i8 = (int) ((this.f14412a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1217tA.f14410q = new Rect(i - i8, i7 - i8, i + i8, i7 + i8);
        }
        abstractC1217tA.c();
    }
}
