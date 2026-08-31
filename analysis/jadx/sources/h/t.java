package h;

import E.c0;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import k.AbstractC1168a;
import k.C1170c;
import k.C1171d;
import l.MenuC1209l;
import r.Q;
import w1.AbstractC1835K;
import w1.AbstractC1862z;
import w1.O;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Window.Callback {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Window.Callback f13316q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13317r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f13320u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(y yVar, Window.Callback callback) {
        this.f13320u = yVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f13316q = callback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Window.Callback callback) {
        try {
            this.f13317r = true;
            callback.onContentChanged();
        } finally {
            this.f13317r = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(int i, Menu menu) {
        return this.f13316q.onMenuOpened(i, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, Menu menu) {
        this.f13316q.onPanelClosed(i, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(List list, Menu menu, int i) {
        k.l.a(this.f13316q, list, menu, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f13316q.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f13318s;
        Window.Callback callback = this.f13316q;
        return z5 ? callback.dispatchKeyEvent(keyEvent) : this.f13320u.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f13316q
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            h.y r2 = r6.f13320u
            r2.z()
            h.I r3 = r2.f13346E
            r4 = 0
            if (r3 == 0) goto L3d
            h.H r3 = r3.f13222B
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            l.l r3 = r3.f13215t
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            h.x r0 = r2.f13371d0
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.E(r0, r3, r7)
            if (r0 == 0) goto L52
            h.x r7 = r2.f13371d0
            if (r7 == 0) goto L3b
            r7.f13334l = r1
            goto L3b
        L52:
            h.x r0 = r2.f13371d0
            if (r0 != 0) goto L6a
            h.x r0 = r2.y(r4)
            r2.F(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.E(r0, r3, r7)
            r0.f13333k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.t.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f13316q.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f13316q.dispatchTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f13316q.dispatchTrackballEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f13316q.onActionModeFinished(actionMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f13316q.onActionModeStarted(actionMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f13316q.onAttachedToWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f13317r) {
            this.f13316q.onContentChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC1209l)) {
            return this.f13316q.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f13316q.onCreatePanelView(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f13316q.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f13316q.onMenuItemSelected(i, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            y yVar = this.f13320u;
            yVar.z();
            I i7 = yVar.f13346E;
            if (i7 != null) {
                ArrayList arrayList = i7.f13226F;
                if (true != i7.f13225E) {
                    i7.f13225E = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f13319t) {
            this.f13316q.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        y yVar = this.f13320u;
        if (i != 108) {
            if (i == 0) {
                x xVarY = yVar.y(i);
                if (xVarY.f13335m) {
                    yVar.r(xVarY, false);
                    return;
                }
                return;
            }
            return;
        }
        yVar.z();
        I i7 = yVar.f13346E;
        if (i7 != null) {
            ArrayList arrayList = i7.f13226F;
            if (i7.f13225E) {
                i7.f13225E = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z5) {
        k.m.a(this.f13316q, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC1209l menuC1209l = menu instanceof MenuC1209l ? (MenuC1209l) menu : null;
        if (i == 0 && menuC1209l == null) {
            return false;
        }
        if (menuC1209l != null) {
            menuC1209l.f14371x = true;
        }
        boolean zOnPreparePanel = this.f13316q.onPreparePanel(i, view, menu);
        if (menuC1209l != null) {
            menuC1209l.f14371x = false;
        }
        return zOnPreparePanel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC1209l menuC1209l = this.f13320u.y(0).f13332h;
        if (menuC1209l != null) {
            d(list, menuC1209l, i);
        } else {
            d(list, menu, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return k.k.a(this.f13316q, searchEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f13316q.onWindowAttributesChanged(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z5) {
        this.f13316q.onWindowFocusChanged(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        y yVar = this.f13320u;
        if (!yVar.f13357P || i != 0) {
            return k.k.b(this.f13316q, callback, i);
        }
        Context context = yVar.f13342A;
        c0 c0Var = new c0();
        c0Var.f1553r = context;
        c0Var.f1552q = callback;
        c0Var.f1554s = new ArrayList();
        boolean z5 = false;
        c0Var.f1555t = new Q(0);
        AbstractC1168a abstractC1168a = yVar.f13352K;
        if (abstractC1168a != null) {
            abstractC1168a.a();
        }
        Z.m mVar = new Z.m(14, yVar, c0Var, z5);
        yVar.z();
        I i7 = yVar.f13346E;
        int i8 = 1;
        if (i7 != null) {
            H h4 = i7.f13222B;
            if (h4 != null) {
                h4.a();
            }
            i7.f13240v.setHideOnContentScrollEnabled(false);
            i7.f13243y.e();
            H h7 = new H(i7, i7.f13243y.getContext(), mVar);
            MenuC1209l menuC1209l = h7.f13215t;
            menuC1209l.w();
            try {
                if (((c0) h7.f13216u.f8312r).z(h7, menuC1209l)) {
                    i7.f13222B = h7;
                    h7.h();
                    i7.f13243y.c(h7);
                    i7.V(true);
                } else {
                    h7 = null;
                }
                yVar.f13352K = h7;
            } finally {
                menuC1209l.v();
            }
        }
        if (yVar.f13352K == null) {
            O o6 = yVar.f13356O;
            if (o6 != null) {
                o6.b();
            }
            AbstractC1168a abstractC1168a2 = yVar.f13352K;
            if (abstractC1168a2 != null) {
                abstractC1168a2.a();
            }
            if (yVar.f13353L == null) {
                if (yVar.f13367Z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C1170c c1170c = new C1170c(context, 0);
                        c1170c.getTheme().setTo(themeNewTheme);
                        context = c1170c;
                    }
                    yVar.f13353L = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    yVar.f13354M = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    yVar.f13354M.setContentView(yVar.f13353L);
                    yVar.f13354M.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    yVar.f13353L.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    yVar.f13354M.setHeight(-2);
                    yVar.f13355N = new m(yVar, i8);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) yVar.f13359R.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        yVar.z();
                        I i9 = yVar.f13346E;
                        Context contextW = i9 != null ? i9.W() : null;
                        if (contextW != null) {
                            context = contextW;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        yVar.f13353L = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (yVar.f13353L != null) {
                O o7 = yVar.f13356O;
                if (o7 != null) {
                    o7.b();
                }
                yVar.f13353L.e();
                Context context2 = yVar.f13353L.getContext();
                ActionBarContextView actionBarContextView = yVar.f13353L;
                C1171d c1171d = new C1171d();
                c1171d.f13919s = context2;
                c1171d.f13920t = actionBarContextView;
                c1171d.f13921u = mVar;
                MenuC1209l menuC1209l2 = new MenuC1209l(actionBarContextView.getContext());
                menuC1209l2.f14359l = 1;
                c1171d.f13924x = menuC1209l2;
                menuC1209l2.f14355e = c1171d;
                if (((c0) mVar.f8312r).z(c1171d, menuC1209l2)) {
                    c1171d.h();
                    yVar.f13353L.c(c1171d);
                    yVar.f13352K = c1171d;
                    if (yVar.f13358Q && (viewGroup = yVar.f13359R) != null && viewGroup.isLaidOut()) {
                        yVar.f13353L.setAlpha(0.0f);
                        O oA = AbstractC1835K.a(yVar.f13353L);
                        oA.a(1.0f);
                        yVar.f13356O = oA;
                        oA.d(new p(i8, yVar));
                    } else {
                        yVar.f13353L.setAlpha(1.0f);
                        yVar.f13353L.setVisibility(0);
                        if (yVar.f13353L.getParent() instanceof View) {
                            View view = (View) yVar.f13353L.getParent();
                            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                            AbstractC1862z.c(view);
                        }
                    }
                    if (yVar.f13354M != null) {
                        yVar.f13343B.getDecorView().post(yVar.f13355N);
                    }
                } else {
                    yVar.f13352K = null;
                }
            }
            yVar.H();
            yVar.f13352K = yVar.f13352K;
        }
        yVar.H();
        AbstractC1168a abstractC1168a3 = yVar.f13352K;
        if (abstractC1168a3 != null) {
            return c0Var.k(abstractC1168a3);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f13316q.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
