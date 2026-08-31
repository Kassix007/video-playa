package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.wnapp.smspariaz.R;
import i1.C1134a;
import java.util.ArrayList;
import m.AbstractC1252E0;
import m.C1258H0;
import m.C1325p0;

/* JADX INFO: renamed from: l.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1203f extends AbstractC1217t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f14315D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f14316E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f14317F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f14318G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f14319H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f14320I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f14321J;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f14323L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public w f14324M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ViewTreeObserver f14325N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public PopupWindow.OnDismissListener f14326O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f14327P;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f14328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f14331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f14332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f14333w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f14334x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1201d f14335y = new ViewTreeObserverOnGlobalLayoutListenerC1201d(0, this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0.D f14336z = new C0.D(4, this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C1134a f14312A = new C1134a(1, this);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14313B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f14314C = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f14322K = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnKeyListenerC1203f(Context context, View view, int i, boolean z5) {
        this.f14328r = context;
        this.f14315D = view;
        this.f14330t = i;
        this.f14331u = z5;
        this.f14317F = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f14329s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f14332v = new Handler();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final boolean a() {
        ArrayList arrayList = this.f14334x;
        return arrayList.size() > 0 && ((C1202e) arrayList.get(0)).f14309a.f14636P.isShowing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void b(MenuC1209l menuC1209l, boolean z5) {
        ArrayList arrayList = this.f14334x;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1209l == ((C1202e) arrayList.get(i)).f14310b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i7 = i + 1;
        if (i7 < arrayList.size()) {
            ((C1202e) arrayList.get(i7)).f14310b.c(false);
        }
        C1202e c1202e = (C1202e) arrayList.remove(i);
        MenuC1209l menuC1209l2 = c1202e.f14310b;
        C1258H0 c1258h0 = c1202e.f14309a;
        menuC1209l2.r(this);
        if (this.f14327P) {
            AbstractC1252E0.b(c1258h0.f14636P, null);
            c1258h0.f14636P.setAnimationStyle(0);
        }
        c1258h0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f14317F = ((C1202e) arrayList.get(size2 - 1)).f14311c;
        } else {
            this.f14317F = this.f14315D.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z5) {
                ((C1202e) arrayList.get(0)).f14310b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.f14324M;
        if (wVar != null) {
            wVar.b(menuC1209l, true);
        }
        ViewTreeObserver viewTreeObserver = this.f14325N;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f14325N.removeGlobalOnLayoutListener(this.f14335y);
            }
            this.f14325N = null;
        }
        this.f14316E.removeOnAttachStateChangeListener(this.f14336z);
        this.f14326O.onDismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final void c() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f14333w;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w((MenuC1209l) obj);
        }
        arrayList.clear();
        View view = this.f14315D;
        this.f14316E = view;
        if (view != null) {
            boolean z5 = this.f14325N == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f14325N = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f14335y);
            }
            this.f14316E.addOnAttachStateChangeListener(this.f14336z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final void dismiss() {
        ArrayList arrayList = this.f14334x;
        int size = arrayList.size();
        if (size > 0) {
            C1202e[] c1202eArr = (C1202e[]) arrayList.toArray(new C1202e[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1202e c1202e = c1202eArr[i];
                if (c1202e.f14309a.f14636P.isShowing()) {
                    c1202e.f14309a.dismiss();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1195B
    public final C1325p0 e() {
        ArrayList arrayList = this.f14334x;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1202e) arrayList.get(arrayList.size() - 1)).f14309a.f14639s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.x
    public final void f(w wVar) {
        this.f14324M = wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:8:0x0028 */
    @Override // l.x
    public final void h(boolean z5) {
        ArrayList arrayList = this.f14334x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((C1202e) obj).f14309a.f14639s.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1206i) adapter).notifyDataSetChanged();
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
        ArrayList arrayList = this.f14334x;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1202e c1202e = (C1202e) obj;
            if (subMenuC1197D == c1202e.f14310b) {
                c1202e.f14309a.f14639s.requestFocus();
                return true;
            }
        }
        if (!subMenuC1197D.hasVisibleItems()) {
            return false;
        }
        n(subMenuC1197D);
        w wVar = this.f14324M;
        if (wVar != null) {
            wVar.g(subMenuC1197D);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void n(MenuC1209l menuC1209l) {
        menuC1209l.b(this, this.f14328r);
        if (a()) {
            w(menuC1209l);
        } else {
            this.f14333w.add(menuC1209l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1202e c1202e;
        ArrayList arrayList = this.f14334x;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1202e = null;
                break;
            }
            c1202e = (C1202e) arrayList.get(i);
            if (!c1202e.f14309a.f14636P.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c1202e != null) {
            c1202e.f14310b.c(false);
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
        if (this.f14315D != view) {
            this.f14315D = view;
            this.f14314C = Gravity.getAbsoluteGravity(this.f14313B, view.getLayoutDirection());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void q(boolean z5) {
        this.f14322K = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void r(int i) {
        if (this.f14313B != i) {
            this.f14313B = i;
            this.f14314C = Gravity.getAbsoluteGravity(i, this.f14315D.getLayoutDirection());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void s(int i) {
        this.f14318G = true;
        this.f14320I = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f14326O = onDismissListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void u(boolean z5) {
        this.f14323L = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.AbstractC1217t
    public final void v(int i) {
        this.f14319H = true;
        this.f14321J = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(l.MenuC1209l r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.content.Context r2 = r0.f14328r
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            l.i r4 = new l.i
            boolean r5 = r0.f14331u
            r6 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r4.<init>(r1, r3, r5, r6)
            boolean r5 = r0.a()
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L23
            boolean r5 = r0.f14322K
            if (r5 == 0) goto L23
            r4.f14347c = r6
            goto L4a
        L23:
            boolean r5 = r0.a()
            if (r5 == 0) goto L4a
            java.util.ArrayList r5 = r1.f
            int r5 = r5.size()
            r8 = r7
        L30:
            if (r8 >= r5) goto L47
            android.view.MenuItem r9 = r1.getItem(r8)
            boolean r10 = r9.isVisible()
            if (r10 == 0) goto L44
            android.graphics.drawable.Drawable r9 = r9.getIcon()
            if (r9 == 0) goto L44
            r5 = r6
            goto L48
        L44:
            int r8 = r8 + 1
            goto L30
        L47:
            r5 = r7
        L48:
            r4.f14347c = r5
        L4a:
            int r5 = r0.f14329s
            int r5 = l.AbstractC1217t.o(r4, r2, r5)
            m.H0 r8 = new m.H0
            int r9 = r0.f14330t
            r10 = 0
            r8.<init>(r2, r10, r9, r7)
            i1.a r2 = r0.f14312A
            r8.f14662S = r2
            r8.f14626F = r0
            m.y r2 = r8.f14636P
            r2.setOnDismissListener(r0)
            android.view.View r2 = r0.f14315D
            r8.f14625E = r2
            int r2 = r0.f14314C
            r8.f14622B = r2
            r8.f14635O = r6
            m.y r2 = r8.f14636P
            r2.setFocusable(r6)
            m.y r2 = r8.f14636P
            r9 = 2
            r2.setInputMethodMode(r9)
            r8.p(r4)
            r8.r(r5)
            int r2 = r0.f14314C
            r8.f14622B = r2
            java.util.ArrayList r2 = r0.f14334x
            int r4 = r2.size()
            if (r4 <= 0) goto L104
            int r4 = r2.size()
            int r4 = r4 - r6
            java.lang.Object r4 = r2.get(r4)
            l.e r4 = (l.C1202e) r4
            l.l r11 = r4.f14310b
            java.util.ArrayList r12 = r11.f
            int r12 = r12.size()
            r13 = r7
        L9e:
            if (r13 >= r12) goto Lb4
            android.view.MenuItem r14 = r11.getItem(r13)
            boolean r15 = r14.hasSubMenu()
            if (r15 == 0) goto Lb1
            android.view.SubMenu r15 = r14.getSubMenu()
            if (r1 != r15) goto Lb1
            goto Lb5
        Lb1:
            int r13 = r13 + 1
            goto L9e
        Lb4:
            r14 = r10
        Lb5:
            if (r14 != 0) goto Lbb
            r16 = r6
            r6 = r10
            goto L108
        Lbb:
            m.H0 r11 = r4.f14309a
            m.p0 r11 = r11.f14639s
            android.widget.ListAdapter r12 = r11.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto Ld4
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            l.i r12 = (l.C1206i) r12
            goto Ld7
        Ld4:
            l.i r12 = (l.C1206i) r12
            r13 = r7
        Ld7:
            int r15 = r12.getCount()
            r16 = r6
            r6 = r7
        Lde:
            r9 = -1
            if (r6 >= r15) goto Lec
            l.n r10 = r12.getItem(r6)
            if (r14 != r10) goto Le8
            goto Led
        Le8:
            int r6 = r6 + 1
            r10 = 0
            goto Lde
        Lec:
            r6 = r9
        Led:
            if (r6 != r9) goto Lf0
            goto L107
        Lf0:
            int r6 = r6 + r13
            int r9 = r11.getFirstVisiblePosition()
            int r6 = r6 - r9
            if (r6 < 0) goto L107
            int r9 = r11.getChildCount()
            if (r6 < r9) goto Lff
            goto L107
        Lff:
            android.view.View r6 = r11.getChildAt(r6)
            goto L108
        L104:
            r16 = r6
            r4 = 0
        L107:
            r6 = 0
        L108:
            if (r6 == 0) goto L1d5
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            m.y r11 = r8.f14636P
            if (r9 > r10) goto L128
            java.lang.reflect.Method r9 = m.C1258H0.f14661T
            if (r9 == 0) goto L12b
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L120
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Exception -> L120
            r9.invoke(r11, r10)     // Catch: java.lang.Exception -> L120
            goto L12b
        L120:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L12b
        L128:
            m.AbstractC1254F0.a(r11, r7)
        L12b:
            m.y r9 = r8.f14636P
            r10 = 0
            m.AbstractC1252E0.a(r9, r10)
            int r9 = r2.size()
            int r9 = r9 + (-1)
            java.lang.Object r9 = r2.get(r9)
            l.e r9 = (l.C1202e) r9
            m.H0 r9 = r9.f14309a
            m.p0 r9 = r9.f14639s
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.f14316E
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.f14317F
            r13 = r16
            if (r12 != r13) goto L168
            r11 = r11[r7]
            int r9 = r9.getWidth()
            int r9 = r9 + r11
            int r9 = r9 + r5
            int r10 = r10.right
            if (r9 <= r10) goto L166
        L163:
            r9 = r7
        L164:
            r13 = 1
            goto L16e
        L166:
            r9 = 1
            goto L164
        L168:
            r9 = r11[r7]
            int r9 = r9 - r5
            if (r9 >= 0) goto L163
            goto L166
        L16e:
            if (r9 != r13) goto L172
            r13 = 1
            goto L173
        L172:
            r13 = r7
        L173:
            r0.f14317F = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            r11 = 5
            if (r9 < r10) goto L181
            r8.f14625E = r6
            r10 = r7
            r12 = r10
            goto L1b4
        L181:
            r10 = 2
            int[] r9 = new int[r10]
            android.view.View r12 = r0.f14315D
            r12.getLocationOnScreen(r9)
            int[] r10 = new int[r10]
            r6.getLocationOnScreen(r10)
            int r12 = r0.f14314C
            r12 = r12 & 7
            if (r12 != r11) goto L1a8
            r12 = r9[r7]
            android.view.View r14 = r0.f14315D
            int r14 = r14.getWidth()
            int r14 = r14 + r12
            r9[r7] = r14
            r12 = r10[r7]
            int r14 = r6.getWidth()
            int r14 = r14 + r12
            r10[r7] = r14
        L1a8:
            r12 = r10[r7]
            r14 = r9[r7]
            int r12 = r12 - r14
            r16 = 1
            r10 = r10[r16]
            r9 = r9[r16]
            int r10 = r10 - r9
        L1b4:
            int r9 = r0.f14314C
            r9 = r9 & r11
            if (r9 != r11) goto L1c3
            if (r13 == 0) goto L1bd
            int r12 = r12 + r5
            goto L1ca
        L1bd:
            int r5 = r6.getWidth()
        L1c1:
            int r12 = r12 - r5
            goto L1ca
        L1c3:
            if (r13 == 0) goto L1c1
            int r5 = r6.getWidth()
            int r12 = r12 + r5
        L1ca:
            r8.f14642v = r12
            r13 = 1
            r8.f14621A = r13
            r8.f14646z = r13
            r8.h(r10)
            goto L1f3
        L1d5:
            boolean r5 = r0.f14318G
            if (r5 == 0) goto L1dd
            int r5 = r0.f14320I
            r8.f14642v = r5
        L1dd:
            boolean r5 = r0.f14319H
            if (r5 == 0) goto L1e6
            int r5 = r0.f14321J
            r8.h(r5)
        L1e6:
            android.graphics.Rect r5 = r0.f14410q
            if (r5 == 0) goto L1f0
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r5)
            goto L1f1
        L1f0:
            r10 = 0
        L1f1:
            r8.f14634N = r10
        L1f3:
            l.e r5 = new l.e
            int r6 = r0.f14317F
            r5.<init>(r8, r1, r6)
            r2.add(r5)
            r8.c()
            m.p0 r2 = r8.f14639s
            r2.setOnKeyListener(r0)
            if (r4 != 0) goto L230
            boolean r4 = r0.f14323L
            if (r4 == 0) goto L230
            java.lang.CharSequence r4 = r1.f14360m
            if (r4 == 0) goto L230
            r4 = 2131492882(0x7f0c0012, float:1.8609228E38)
            android.view.View r3 = r3.inflate(r4, r2, r7)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r7)
            java.lang.CharSequence r1 = r1.f14360m
            r4.setText(r1)
            r10 = 0
            r2.addHeaderView(r3, r10, r7)
            r8.c()
        L230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnKeyListenerC1203f.w(l.l):void");
    }

    @Override // l.x
    public final void d(Parcelable parcelable) {
    }
}
