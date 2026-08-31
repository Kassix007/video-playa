package h;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.wnapp.smspariaz.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.MenuC1209l;
import m.f1;
import m.g1;
import w1.AbstractC1827C;
import w1.AbstractC1835K;
import w1.AbstractC1862z;
import w1.InterfaceC1850m;
import w1.a0;
import w1.b0;
import w1.c0;
import w1.d0;
import w1.e0;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements InterfaceC1850m, l.w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f13312q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h.y.F(h.x, android.view.KeyEvent):boolean, h.y.v():void] */
    public /* synthetic */ n(y yVar) {
        this.f13312q = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public void b(MenuC1209l menuC1209l, boolean z5) {
        this.f13312q.q(menuC1209l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1850m
    public o0 c(View view, o0 o0Var) {
        int i;
        boolean z5;
        o0 o0VarB;
        boolean z6;
        int iD = o0Var.d();
        y yVar = this.f13312q;
        Context context = yVar.f13342A;
        int iD2 = o0Var.d();
        ActionBarContextView actionBarContextView = yVar.f13353L;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yVar.f13353L.getLayoutParams();
            if (yVar.f13353L.isShown()) {
                if (yVar.f13387t0 == null) {
                    yVar.f13387t0 = new Rect();
                    yVar.f13388u0 = new Rect();
                }
                Rect rect = yVar.f13387t0;
                Rect rect2 = yVar.f13388u0;
                rect.set(o0Var.b(), o0Var.d(), o0Var.c(), o0Var.a());
                ViewGroup viewGroup = yVar.f13359R;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z7 = g1.f14790a;
                    f1.a(viewGroup, rect, rect2);
                } else {
                    if (!g1.f14790a) {
                        g1.f14790a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            g1.f14791b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                g1.f14791b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = g1.f14791b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e7) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                        }
                    }
                }
                int i7 = rect.top;
                int i8 = rect.left;
                int i9 = rect.right;
                ViewGroup viewGroup2 = yVar.f13359R;
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                o0 o0VarA = AbstractC1827C.a(viewGroup2);
                int iB = o0VarA == null ? 0 : o0VarA.b();
                int iC = o0VarA == null ? 0 : o0VarA.c();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z6 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z6 = true;
                }
                if (i7 <= 0 || yVar.f13361T != null) {
                    View view2 = yVar.f13361T;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            yVar.f13361T.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    yVar.f13361T = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    yVar.f13359R.addView(yVar.f13361T, -1, layoutParams);
                }
                View view4 = yVar.f13361T;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = yVar.f13361T;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!yVar.f13366Y && z) {
                    iD2 = 0;
                }
                z5 = z;
                i = 0;
                z = z6;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z5 = false;
                } else {
                    z5 = false;
                    z = false;
                }
            }
            if (z) {
                yVar.f13353L.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = yVar.f13361T;
        if (view6 != null) {
            view6.setVisibility(z5 ? i : 8);
        }
        if (iD != iD2) {
            int iB2 = o0Var.b();
            int iC2 = o0Var.c();
            int iA = o0Var.a();
            int i12 = Build.VERSION.SDK_INT;
            e0 d0Var = i12 >= 34 ? new d0(o0Var) : i12 >= 30 ? new c0(o0Var) : i12 >= 29 ? new b0(o0Var) : new a0(o0Var);
            d0Var.g(n1.b.b(iB2, iD2, iC2, iA));
            o0VarB = d0Var.b();
        } else {
            o0VarB = o0Var;
        }
        WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
        WindowInsets windowInsetsF = o0VarB.f();
        if (windowInsetsF == null) {
            return o0VarB;
        }
        WindowInsets windowInsetsB = AbstractC1862z.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? o0.g(view, windowInsetsB) : o0VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public boolean g(MenuC1209l menuC1209l) {
        Window.Callback callback = this.f13312q.f13343B.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC1209l);
        return true;
    }
}
