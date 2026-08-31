package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import i1.C1134a;
import java.lang.reflect.Method;
import l.C1211n;
import l.MenuC1209l;

/* JADX INFO: renamed from: m.H0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1258H0 extends C1248C0 implements InterfaceC1250D0 {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Method f14661T;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C1134a f14662S;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f14661T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1250D0
    public final void l(MenuC1209l menuC1209l, C1211n c1211n) {
        C1134a c1134a = this.f14662S;
        if (c1134a != null) {
            c1134a.l(menuC1209l, c1211n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1250D0
    public final void n(MenuC1209l menuC1209l, MenuItem menuItem) {
        C1134a c1134a = this.f14662S;
        if (c1134a != null) {
            c1134a.n(menuC1209l, menuItem);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1248C0
    public final C1325p0 q(Context context, boolean z5) {
        C1256G0 c1256g0 = new C1256G0(context, z5);
        c1256g0.setHoverListener(this);
        return c1256g0;
    }
}
