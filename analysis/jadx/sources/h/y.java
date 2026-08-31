package h;

import B0.G0;
import C0.AbstractC0067b;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import g.AbstractC1066a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC1168a;
import k.C1170c;
import k1.AbstractC1175c;
import l.C1211n;
import l.InterfaceC1207j;
import l.MenuC1209l;
import m.C1281T0;
import m.C1291Y0;
import m.C1302e;
import m.C1312j;
import m.C1328r;
import m.InterfaceC1309h0;
import m.InterfaceC1311i0;
import m.g1;
import r.Q;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.O;

/* JADX INFO: loaded from: classes.dex */
public final class y extends l implements InterfaceC1207j, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Context f13342A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Window f13343B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public t f13344C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f13345D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public I f13346E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public k.h f13347F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f13348G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterfaceC1309h0 f13349H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public n f13350I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public o f13351J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public AbstractC1168a f13352K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ActionBarContextView f13353L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public PopupWindow f13354M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public m f13355N;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f13358Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ViewGroup f13359R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public TextView f13360S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public View f13361T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f13362U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f13363V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f13364W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f13365X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f13366Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f13367Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f13368a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f13369b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public x[] f13370c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public x f13371d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f13372e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f13373f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f13374g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f13375h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Configuration f13376i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f13377j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f13378k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f13379l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f13380m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public u f13381n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public u f13382o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f13383p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f13384q0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f13386s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Rect f13387t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Rect f13388u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public C1095B f13389v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public OnBackInvokedDispatcher f13390w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public OnBackInvokedCallback f13391x0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f13392z;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Q f13340y0 = new Q(0);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int[] f13341z0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final boolean f13339A0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public O f13356O = null;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f13357P = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final m f13385r0 = new m(this, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(Context context, Window window, InterfaceC1107i interfaceC1107i, Object obj) {
        AbstractActivityC1106h abstractActivityC1106h = null;
        this.f13377j0 = -100;
        this.f13342A = context;
        this.f13345D = interfaceC1107i;
        this.f13392z = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC1106h)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC1106h = (AbstractActivityC1106h) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1106h != null) {
                this.f13377j0 = ((y) abstractActivityC1106h.l()).f13377j0;
            }
        }
        if (this.f13377j0 == -100) {
            String name = this.f13392z.getClass().getName();
            Q q7 = f13340y0;
            Integer num = (Integer) q7.get(name);
            if (num != null) {
                this.f13377j0 = num.intValue();
                q7.remove(this.f13392z.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        C1328r.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r1.e o(Context context) {
        r1.e eVar;
        r1.e eVar2;
        if (Build.VERSION.SDK_INT >= 33 || (eVar = l.f13303s) == null) {
            return null;
        }
        r1.f fVar = eVar.f16276a;
        r1.e eVarB = r.b(context.getApplicationContext().getResources().getConfiguration());
        if (fVar.f16277a.isEmpty()) {
            eVar2 = r1.e.f16275b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < eVarB.f16276a.f16277a.size() + fVar.f16277a.size()) {
                Locale locale = i < fVar.f16277a.size() ? fVar.f16277a.get(i) : eVarB.f16276a.f16277a.get(i - fVar.f16277a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            eVar2 = new r1.e(new r1.f(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return eVar2.f16276a.f16277a.isEmpty() ? eVarB : eVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Configuration s(Context context, int i, r1.e eVar, Configuration configuration, boolean z5) {
        int i7 = i != 1 ? i != 2 ? z5 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i7 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            r.d(configuration2, eVar);
        }
        return configuration2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(int i) {
        this.f13384q0 = (1 << i) | this.f13384q0;
        if (this.f13383p0) {
            return;
        }
        View decorView = this.f13343B.getDecorView();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        decorView.postOnAnimation(this.f13385r0);
        this.f13383p0 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int B(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f13382o0 == null) {
                            this.f13382o0 = new u(this, context);
                        }
                        return this.f13382o0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean C() {
        InterfaceC1311i0 interfaceC1311i0;
        C1281T0 c1281t0;
        boolean z5 = this.f13372e0;
        this.f13372e0 = false;
        x xVarY = y(0);
        if (!xVarY.f13335m) {
            AbstractC1168a abstractC1168a = this.f13352K;
            if (abstractC1168a != null) {
                abstractC1168a.a();
                return true;
            }
            z();
            I i = this.f13346E;
            if (i == null || (interfaceC1311i0 = i.f13242x) == null || (c1281t0 = ((C1291Y0) interfaceC1311i0).f14730a.f9199e0) == null || c1281t0.f14710r == null) {
                return false;
            }
            C1281T0 c1281t02 = ((C1291Y0) interfaceC1311i0).f14730a.f9199e0;
            C1211n c1211n = c1281t02 == null ? null : c1281t02.f14710r;
            if (c1211n != null) {
                c1211n.collapseActionView();
            }
        } else if (!z5) {
            r(xVarY, true);
            return true;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.f14344v.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(h.x r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.f13335m
            int r3 = r1.f13326a
            if (r2 != 0) goto L1d8
            boolean r2 = r0.f13375h0
            if (r2 == 0) goto L10
            goto L1d8
        L10:
            android.content.Context r2 = r0.f13342A
            if (r3 != 0) goto L25
            android.content.res.Resources r4 = r2.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L25
            goto L1d8
        L25:
            android.view.Window r4 = r0.f13343B
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L3a
            l.l r6 = r1.f13332h
            boolean r4 = r4.onMenuOpened(r3, r6)
            if (r4 != 0) goto L3a
            r0.r(r1, r5)
            return
        L3a:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r2.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L46
            goto L1d8
        L46:
            boolean r6 = r17.F(r18, r19)
            if (r6 != 0) goto L4e
            goto L1d8
        L4e:
            h.w r6 = r1.f13330e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L6b
            boolean r9 = r1.f13336n
            if (r9 == 0) goto L59
            goto L6b
        L59:
            android.view.View r2 = r1.f13331g
            if (r2 == 0) goto L1b0
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L1b0
            int r2 = r2.width
            r6 = -1
            if (r2 != r6) goto L1b0
            r10 = r6
            goto L1b1
        L6b:
            if (r6 != 0) goto Le6
            r0.z()
            h.I r6 = r0.f13346E
            if (r6 == 0) goto L79
            android.content.Context r6 = r6.W()
            goto L7a
        L79:
            r6 = 0
        L7a:
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            r2 = r6
        L7e:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r2.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r2.getTheme()
            r9.setTo(r10)
            r10 = 2130903045(0x7f030005, float:1.7412897E38)
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L9f
            r9.applyStyle(r10, r5)
        L9f:
            r10 = 2130903985(0x7f0303b1, float:1.7414803E38)
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto Lad
            r9.applyStyle(r6, r5)
            goto Lb3
        Lad:
            r6 = 2131886626(0x7f120222, float:1.9407836E38)
            r9.applyStyle(r6, r5)
        Lb3:
            k.c r6 = new k.c
            r6.<init>(r2, r7)
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r2.setTo(r9)
            r1.j = r6
            int[] r2 = g.AbstractC1066a.j
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r2)
            r6 = 86
            int r6 = r2.getResourceId(r6, r7)
            r1.f13327b = r6
            int r6 = r2.getResourceId(r5, r7)
            r1.f13329d = r6
            r2.recycle()
            h.w r2 = new h.w
            k.c r6 = r1.j
            r2.<init>(r0, r6)
            r1.f13330e = r2
            r2 = 81
            r1.f13328c = r2
            goto Lf5
        Le6:
            boolean r2 = r1.f13336n
            if (r2 == 0) goto Lf5
            int r2 = r6.getChildCount()
            if (r2 <= 0) goto Lf5
            h.w r2 = r1.f13330e
            r2.removeAllViews()
        Lf5:
            android.view.View r2 = r1.f13331g
            if (r2 == 0) goto Lfc
            r1.f = r2
            goto L157
        Lfc:
            l.l r2 = r1.f13332h
            if (r2 != 0) goto L102
            goto L1d6
        L102:
            h.o r2 = r0.f13351J
            if (r2 != 0) goto L10d
            h.o r2 = new h.o
            r2.<init>(r0)
            r0.f13351J = r2
        L10d:
            h.o r2 = r0.f13351J
            l.h r6 = r1.i
            if (r6 != 0) goto L125
            l.h r6 = new l.h
            k.c r9 = r1.j
            r6.<init>(r9)
            r1.i = r6
            r6.f14343u = r2
            l.l r2 = r1.f13332h
            android.content.Context r9 = r2.f14351a
            r2.b(r6, r9)
        L125:
            l.h r2 = r1.i
            h.w r6 = r1.f13330e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r2.f14342t
            if (r9 != 0) goto L151
            android.view.LayoutInflater r9 = r2.f14340r
            r10 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r2.f14342t = r6
            l.g r6 = r2.f14344v
            if (r6 != 0) goto L145
            l.g r6 = new l.g
            r6.<init>(r2)
            r2.f14344v = r6
        L145:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r2.f14342t
            l.g r9 = r2.f14344v
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r2.f14342t
            r6.setOnItemClickListener(r2)
        L151:
            androidx.appcompat.view.menu.ExpandedMenuView r2 = r2.f14342t
            r1.f = r2
            if (r2 == 0) goto L1d6
        L157:
            android.view.View r2 = r1.f
            if (r2 != 0) goto L15d
            goto L1d6
        L15d:
            android.view.View r2 = r1.f13331g
            if (r2 == 0) goto L162
            goto L177
        L162:
            l.h r2 = r1.i
            l.g r6 = r2.f14344v
            if (r6 != 0) goto L16f
            l.g r6 = new l.g
            r6.<init>(r2)
            r2.f14344v = r6
        L16f:
            l.g r2 = r2.f14344v
            int r2 = r2.getCount()
            if (r2 <= 0) goto L1d6
        L177:
            android.view.View r2 = r1.f
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 != 0) goto L184
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r8, r8)
        L184:
            int r6 = r1.f13327b
            h.w r9 = r1.f13330e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L19c
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f
            r6.removeView(r9)
        L19c:
            h.w r6 = r1.f13330e
            android.view.View r9 = r1.f
            r6.addView(r9, r2)
            android.view.View r2 = r1.f
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L1b0
            android.view.View r2 = r1.f
            r2.requestFocus()
        L1b0:
            r10 = r8
        L1b1:
            r1.f13334l = r7
            android.view.WindowManager$LayoutParams r9 = new android.view.WindowManager$LayoutParams
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r11 = -2
            r12 = 0
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r2 = r1.f13328c
            r9.gravity = r2
            int r2 = r1.f13329d
            r9.windowAnimations = r2
            h.w r2 = r1.f13330e
            r4.addView(r2, r9)
            r1.f13335m = r5
            if (r3 != 0) goto L1d8
            r0.H()
            return
        L1d6:
            r1.f13336n = r5
        L1d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.D(h.x, android.view.KeyEvent):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean E(x xVar, int i, KeyEvent keyEvent) {
        MenuC1209l menuC1209l;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((xVar.f13333k || F(xVar, keyEvent)) && (menuC1209l = xVar.f13332h) != null) {
            return menuC1209l.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(h.x r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r12.f13375h0
            r1 = 0
            if (r0 == 0) goto L7
            goto L112
        L7:
            boolean r0 = r13.f13333k
            int r2 = r13.f13326a
            r3 = 1
            if (r0 == 0) goto Lf
            return r3
        Lf:
            h.x r0 = r12.f13371d0
            if (r0 == 0) goto L18
            if (r0 == r13) goto L18
            r12.r(r0, r1)
        L18:
            android.view.Window r0 = r12.f13343B
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L26
            android.view.View r4 = r0.onCreatePanelView(r2)
            r13.f13331g = r4
        L26:
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L2d
            goto L2f
        L2d:
            r5 = r1
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r5 == 0) goto L41
            m.h0 r6 = r12.f13349H
            if (r6 == 0) goto L41
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.i0 r6 = r6.f9140u
            m.Y0 r6 = (m.C1291Y0) r6
            r6.f14738l = r3
        L41:
            android.view.View r6 = r13.f13331g
            if (r6 != 0) goto L161
            l.l r6 = r13.f13332h
            r7 = 0
            if (r6 == 0) goto L4e
            boolean r8 = r13.f13337o
            if (r8 == 0) goto L115
        L4e:
            if (r6 != 0) goto Ld0
            android.content.Context r6 = r12.f13342A
            if (r2 == 0) goto L56
            if (r2 != r4) goto Lad
        L56:
            m.h0 r4 = r12.f13349H
            if (r4 == 0) goto Lad
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r8 = r6.getTheme()
            r9 = 2130903052(0x7f03000c, float:1.7412911E38)
            r8.resolveAttribute(r9, r4, r3)
            int r9 = r4.resourceId
            r10 = 2130903053(0x7f03000d, float:1.7412913E38)
            if (r9 == 0) goto L84
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
            int r11 = r4.resourceId
            r9.applyStyle(r11, r3)
            r9.resolveAttribute(r10, r4, r3)
            goto L88
        L84:
            r8.resolveAttribute(r10, r4, r3)
            r9 = r7
        L88:
            int r10 = r4.resourceId
            if (r10 == 0) goto L9e
            if (r9 != 0) goto L99
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
        L99:
            int r4 = r4.resourceId
            r9.applyStyle(r4, r3)
        L9e:
            if (r9 == 0) goto Lad
            k.c r4 = new k.c
            r4.<init>(r6, r1)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r9)
            r6 = r4
        Lad:
            l.l r4 = new l.l
            r4.<init>(r6)
            r4.f14355e = r12
            l.l r6 = r13.f13332h
            if (r4 != r6) goto Lb9
            goto Lcb
        Lb9:
            if (r6 == 0) goto Lc0
            l.h r8 = r13.i
            r6.r(r8)
        Lc0:
            r13.f13332h = r4
            l.h r6 = r13.i
            if (r6 == 0) goto Lcb
            android.content.Context r8 = r4.f14351a
            r4.b(r6, r8)
        Lcb:
            l.l r4 = r13.f13332h
            if (r4 != 0) goto Ld0
            goto L112
        Ld0:
            if (r5 == 0) goto Lea
            m.h0 r4 = r12.f13349H
            if (r4 == 0) goto Lea
            h.n r6 = r12.f13350I
            if (r6 != 0) goto Le1
            h.n r6 = new h.n
            r6.<init>(r12)
            r12.f13350I = r6
        Le1:
            l.l r6 = r13.f13332h
            h.n r8 = r12.f13350I
            androidx.appcompat.widget.ActionBarOverlayLayout r4 = (androidx.appcompat.widget.ActionBarOverlayLayout) r4
            r4.l(r6, r8)
        Lea:
            l.l r4 = r13.f13332h
            r4.w()
            l.l r4 = r13.f13332h
            boolean r2 = r0.onCreatePanelMenu(r2, r4)
            if (r2 != 0) goto L113
            l.l r14 = r13.f13332h
            if (r14 != 0) goto Lfc
            goto L105
        Lfc:
            if (r14 == 0) goto L103
            l.h r0 = r13.i
            r14.r(r0)
        L103:
            r13.f13332h = r7
        L105:
            if (r5 == 0) goto L112
            m.h0 r13 = r12.f13349H
            if (r13 == 0) goto L112
            h.n r14 = r12.f13350I
            androidx.appcompat.widget.ActionBarOverlayLayout r13 = (androidx.appcompat.widget.ActionBarOverlayLayout) r13
            r13.l(r7, r14)
        L112:
            return r1
        L113:
            r13.f13337o = r1
        L115:
            l.l r2 = r13.f13332h
            r2.w()
            android.os.Bundle r2 = r13.f13338p
            if (r2 == 0) goto L125
            l.l r4 = r13.f13332h
            r4.s(r2)
            r13.f13338p = r7
        L125:
            android.view.View r2 = r13.f13331g
            l.l r4 = r13.f13332h
            boolean r0 = r0.onPreparePanel(r1, r2, r4)
            if (r0 != 0) goto L142
            if (r5 == 0) goto L13c
            m.h0 r14 = r12.f13349H
            if (r14 == 0) goto L13c
            h.n r0 = r12.f13350I
            androidx.appcompat.widget.ActionBarOverlayLayout r14 = (androidx.appcompat.widget.ActionBarOverlayLayout) r14
            r14.l(r7, r0)
        L13c:
            l.l r13 = r13.f13332h
            r13.v()
            return r1
        L142:
            if (r14 == 0) goto L149
            int r14 = r14.getDeviceId()
            goto L14a
        L149:
            r14 = -1
        L14a:
            android.view.KeyCharacterMap r14 = android.view.KeyCharacterMap.load(r14)
            int r14 = r14.getKeyboardType()
            if (r14 == r3) goto L156
            r14 = r3
            goto L157
        L156:
            r14 = r1
        L157:
            l.l r0 = r13.f13332h
            r0.setQwertyMode(r14)
            l.l r14 = r13.f13332h
            r14.v()
        L161:
            r13.f13333k = r3
            r13.f13334l = r1
            r12.f13371d0 = r13
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.F(h.x, android.view.KeyEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G() {
        if (this.f13358Q) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z5 = false;
            if (this.f13390w0 != null && (y(0).f13335m || this.f13352K != null)) {
                z5 = true;
            }
            if (z5 && this.f13391x0 == null) {
                this.f13391x0 = s.b(this.f13390w0, this);
            } else {
                if (z5 || (onBackInvokedCallback = this.f13391x0) == null) {
                    return;
                }
                s.c(this.f13390w0, onBackInvokedCallback);
                this.f13391x0 = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.l
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13342A);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof y) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.l
    public final void c() {
        String strE;
        this.f13373f0 = true;
        m(false, true);
        w();
        Object obj = this.f13392z;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strE = AbstractC1175c.e(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            if (strE != null) {
                I i = this.f13346E;
                if (i == null) {
                    this.f13386s0 = true;
                } else {
                    i.Y(true);
                }
            }
            synchronized (l.f13308x) {
                l.f(this);
                l.f13307w.add(new WeakReference(this));
            }
        }
        this.f13376i0 = new Configuration(this.f13342A.getResources().getConfiguration());
        this.f13374g0 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // h.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13392z
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = h.l.f13308x
            monitor-enter(r0)
            h.l.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f13383p0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f13343B
            android.view.View r0 = r0.getDecorView()
            h.m r1 = r3.f13385r0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f13375h0 = r0
            int r0 = r3.f13377j0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f13392z
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            r.Q r0 = h.y.f13340y0
            java.lang.Object r1 = r3.f13392z
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f13377j0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            r.Q r0 = h.y.f13340y0
            java.lang.Object r1 = r3.f13392z
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            h.u r0 = r3.f13381n0
            if (r0 == 0) goto L63
            r0.c()
        L63:
            h.u r0 = r3.f13382o0
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.d():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public final boolean e(MenuC1209l menuC1209l, MenuItem menuItem) {
        x xVar;
        Window.Callback callback = this.f13343B.getCallback();
        if (callback != null && !this.f13375h0) {
            MenuC1209l menuC1209lK = menuC1209l.k();
            x[] xVarArr = this.f13370c0;
            int length = xVarArr != null ? xVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    xVar = xVarArr[i];
                    if (xVar != null && xVar.f13332h == menuC1209lK) {
                        break;
                    }
                    i++;
                } else {
                    xVar = null;
                    break;
                }
            }
            if (xVar != null) {
                return callback.onMenuItemSelected(xVar.f13326a, menuItem);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.l
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f13368a0 && i == 108) {
            return false;
        }
        if (this.f13364W && i == 1) {
            this.f13364W = false;
        }
        if (i == 1) {
            G();
            this.f13368a0 = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f13362U = true;
            return true;
        }
        if (i == 5) {
            G();
            this.f13363V = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f13366Y = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f13364W = true;
            return true;
        }
        if (i != 109) {
            return this.f13343B.requestFeature(i);
        }
        G();
        this.f13365X = true;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.l
    public final void h(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f13359R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13342A).inflate(i, viewGroup);
        this.f13344C.a(this.f13343B.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.e() != false) goto L20;
     */
    @Override // l.InterfaceC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(l.MenuC1209l r6) {
        /*
            r5 = this;
            m.h0 r6 = r5.f13349H
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Le3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.i0 r6 = r6.f9140u
            m.Y0 r6 = (m.C1291Y0) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f14730a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Le3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f9205q
            if (r6 == 0) goto Le3
            boolean r6 = r6.f9149I
            if (r6 == 0) goto Le3
            android.content.Context r6 = r5.f13342A
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            m.h0 r6 = r5.f13349H
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.i0 r6 = r6.f9140u
            m.Y0 r6 = (m.C1291Y0) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f14730a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f9205q
            if (r6 == 0) goto Le3
            m.j r6 = r6.f9150J
            if (r6 == 0) goto Le3
            m.g r2 = r6.f14806L
            if (r2 != 0) goto L4a
            boolean r6 = r6.e()
            if (r6 == 0) goto Le3
        L4a:
            android.view.Window r6 = r5.f13343B
            android.view.Window$Callback r6 = r6.getCallback()
            m.h0 r2 = r5.f13349H
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            m.i0 r2 = r2.f9140u
            m.Y0 r2 = (m.C1291Y0) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f14730a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f9205q
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L94
            m.j r2 = r2.f9150J
            if (r2 == 0) goto L94
            boolean r2 = r2.e()
            if (r2 == 0) goto L94
            m.h0 r0 = r5.f13349H
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            m.i0 r0 = r0.f9140u
            m.Y0 r0 = (m.C1291Y0) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f14730a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f9205q
            if (r0 == 0) goto L86
            m.j r0 = r0.f9150J
            if (r0 == 0) goto L86
            boolean r0 = r0.c()
        L86:
            boolean r0 = r5.f13375h0
            if (r0 != 0) goto Le2
            h.x r0 = r5.y(r1)
            l.l r0 = r0.f13332h
            r6.onPanelClosed(r3, r0)
            return
        L94:
            if (r6 == 0) goto Le2
            boolean r2 = r5.f13375h0
            if (r2 != 0) goto Le2
            boolean r2 = r5.f13383p0
            if (r2 == 0) goto Lb1
            int r2 = r5.f13384q0
            r0 = r0 & r2
            if (r0 == 0) goto Lb1
            android.view.Window r0 = r5.f13343B
            android.view.View r0 = r0.getDecorView()
            h.m r2 = r5.f13385r0
            r0.removeCallbacks(r2)
            r2.run()
        Lb1:
            h.x r0 = r5.y(r1)
            l.l r2 = r0.f13332h
            if (r2 == 0) goto Le2
            boolean r4 = r0.f13337o
            if (r4 != 0) goto Le2
            android.view.View r4 = r0.f13331g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le2
            l.l r0 = r0.f13332h
            r6.onMenuOpened(r3, r0)
            m.h0 r6 = r5.f13349H
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.i0 r6 = r6.f9140u
            m.Y0 r6 = (m.C1291Y0) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f14730a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f9205q
            if (r6 == 0) goto Le2
            m.j r6 = r6.f9150J
            if (r6 == 0) goto Le2
            r6.n()
        Le2:
            return
        Le3:
            h.x r6 = r5.y(r1)
            r6.f13336n = r0
            r5.r(r6, r1)
            r0 = 0
            r5.D(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.i(l.l):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.l
    public final void j(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f13359R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13344C.a(this.f13343B.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.l
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f13359R.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13344C.a(this.f13343B.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.l
    public final void l(CharSequence charSequence) {
        this.f13348G = charSequence;
        InterfaceC1309h0 interfaceC1309h0 = this.f13349H;
        if (interfaceC1309h0 != null) {
            interfaceC1309h0.setWindowTitle(charSequence);
            return;
        }
        I i = this.f13346E;
        if (i == null) {
            TextView textView = this.f13360S;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C1291Y0 c1291y0 = (C1291Y0) i.f13242x;
        if (c1291y0.f14735g) {
            return;
        }
        Toolbar toolbar = c1291y0.f14730a;
        c1291y0.f14736h = charSequence;
        if ((c1291y0.f14731b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c1291y0.f14735g) {
                AbstractC1835K.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v23, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r14, boolean r15) {
        /*
            r13 = this;
            boolean r0 = r13.f13375h0
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = -100
            int r2 = r13.f13377j0
            if (r2 == r0) goto Ld
            goto Lf
        Ld:
            int r2 = h.l.f13302r
        Lf:
            android.content.Context r0 = r13.f13342A
            int r3 = r13.B(r0, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L21
            r1.e r5 = o(r0)
            goto L22
        L21:
            r5 = r6
        L22:
            if (r15 != 0) goto L32
            if (r5 == 0) goto L32
            android.content.res.Resources r15 = r0.getResources()
            android.content.res.Configuration r15 = r15.getConfiguration()
            r1.e r5 = h.r.b(r15)
        L32:
            android.content.res.Configuration r15 = s(r0, r3, r5, r6, r1)
            boolean r3 = r13.f13380m0
            r7 = 1
            java.lang.Object r8 = r13.f13392z
            if (r3 != 0) goto L70
            boolean r3 = r8 instanceof android.app.Activity
            if (r3 == 0) goto L70
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            if (r3 != 0) goto L49
            r3 = r1
            goto L74
        L49:
            r9 = 29
            if (r4 < r9) goto L50
            r4 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L52
        L50:
            r4 = 786432(0xc0000, float:1.102026E-39)
        L52:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.Class r10 = r8.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r9.<init>(r0, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r9, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            if (r3 == 0) goto L70
            int r3 = r3.configChanges     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r13.f13379l0 = r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            goto L70
        L66:
            r3 = move-exception
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r9 = "Exception while getting ActivityInfo"
            android.util.Log.d(r4, r9, r3)
            r13.f13379l0 = r1
        L70:
            r13.f13380m0 = r7
            int r3 = r13.f13379l0
        L74:
            android.content.res.Configuration r4 = r13.f13376i0
            if (r4 != 0) goto L80
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
        L80:
            int r9 = r4.uiMode
            r9 = r9 & 48
            int r10 = r15.uiMode
            r10 = r10 & 48
            r1.e r4 = h.r.b(r4)
            if (r5 != 0) goto L90
            r5 = r6
            goto L94
        L90:
            r1.e r5 = h.r.b(r15)
        L94:
            if (r9 == r10) goto L99
            r9 = 512(0x200, float:7.175E-43)
            goto L9a
        L99:
            r9 = r1
        L9a:
            if (r5 == 0) goto La4
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto La4
            r9 = r9 | 8196(0x2004, float:1.1485E-41)
        La4:
            int r4 = ~r3
            r4 = r4 & r9
            r11 = 28
            if (r4 == 0) goto Lf9
            if (r14 == 0) goto Lf9
            boolean r14 = r13.f13373f0
            if (r14 == 0) goto Lf9
            boolean r14 = h.y.f13339A0
            if (r14 != 0) goto Lb8
            boolean r14 = r13.f13374g0
            if (r14 == 0) goto Lf9
        Lb8:
            boolean r14 = r8 instanceof android.app.Activity
            if (r14 == 0) goto Lf9
            r14 = r8
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r4 = r14.isChild()
            if (r4 != 0) goto Lf9
            int r4 = android.os.Build.VERSION.SDK_INT
            r12 = 31
            if (r4 < r12) goto Lde
            r12 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto Lde
            android.view.Window r12 = r14.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r15 = r15.getLayoutDirection()
            r12.setLayoutDirection(r15)
        Lde:
            if (r4 < r11) goto Le4
            r14.recreate()
            goto Lf7
        Le4:
            android.os.Handler r15 = new android.os.Handler
            android.os.Looper r4 = r14.getMainLooper()
            r15.<init>(r4)
            C0.m r4 = new C0.m
            r12 = 18
            r4.<init>(r12, r14)
            r15.post(r4)
        Lf7:
            r14 = r7
            goto Lfa
        Lf9:
            r14 = r1
        Lfa:
            if (r14 != 0) goto L217
            if (r9 == 0) goto L217
            r14 = r9 & r3
            if (r14 != r9) goto L103
            r1 = r7
        L103:
            android.content.res.Resources r14 = r0.getResources()
            android.content.res.Configuration r15 = new android.content.res.Configuration
            android.content.res.Configuration r3 = r14.getConfiguration()
            r15.<init>(r3)
            android.content.res.Configuration r3 = r14.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & (-49)
            r3 = r3 | r10
            r15.uiMode = r3
            if (r5 == 0) goto L120
            h.r.d(r15, r5)
        L120:
            r14.updateConfiguration(r15, r6)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 >= r4) goto L1d7
            if (r3 < r11) goto L12d
            goto L1d7
        L12d:
            boolean r3 = E3.h.j
            java.lang.String r4 = "ResourcesFlusher"
            if (r3 != 0) goto L149
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.String r10 = "mResourcesImpl"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r10)     // Catch: java.lang.NoSuchFieldException -> L141
            E3.h.i = r3     // Catch: java.lang.NoSuchFieldException -> L141
            r3.setAccessible(r7)     // Catch: java.lang.NoSuchFieldException -> L141
            goto L147
        L141:
            r3 = move-exception
            java.lang.String r10 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r4, r10, r3)
        L147:
            E3.h.j = r7
        L149:
            java.lang.reflect.Field r3 = E3.h.i
            if (r3 != 0) goto L14f
            goto L1d7
        L14f:
            java.lang.Object r14 = r3.get(r14)     // Catch: java.lang.IllegalAccessException -> L154
            goto L15b
        L154:
            r14 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r4, r3, r14)
            r14 = r6
        L15b:
            if (r14 != 0) goto L15f
            goto L1d7
        L15f:
            boolean r3 = E3.h.f1715d
            if (r3 != 0) goto L17b
            java.lang.Class r3 = r14.getClass()     // Catch: java.lang.NoSuchFieldException -> L173
            java.lang.String r10 = "mDrawableCache"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r10)     // Catch: java.lang.NoSuchFieldException -> L173
            E3.h.f1714c = r3     // Catch: java.lang.NoSuchFieldException -> L173
            r3.setAccessible(r7)     // Catch: java.lang.NoSuchFieldException -> L173
            goto L179
        L173:
            r3 = move-exception
            java.lang.String r10 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r4, r10, r3)
        L179:
            E3.h.f1715d = r7
        L17b:
            java.lang.reflect.Field r3 = E3.h.f1714c
            if (r3 == 0) goto L18a
            java.lang.Object r14 = r3.get(r14)     // Catch: java.lang.IllegalAccessException -> L184
            goto L18b
        L184:
            r14 = move-exception
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r4, r3, r14)
        L18a:
            r14 = r6
        L18b:
            if (r14 == 0) goto L1d7
            boolean r3 = E3.h.f
            if (r3 != 0) goto L1a2
            java.lang.String r3 = "android.content.res.ThemedResourceCache"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L19a
            E3.h.f1716e = r3     // Catch: java.lang.ClassNotFoundException -> L19a
            goto L1a0
        L19a:
            r3 = move-exception
            java.lang.String r10 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r4, r10, r3)
        L1a0:
            E3.h.f = r7
        L1a2:
            java.lang.Class r3 = E3.h.f1716e
            if (r3 != 0) goto L1a7
            goto L1d7
        L1a7:
            boolean r10 = E3.h.f1718h
            if (r10 != 0) goto L1bf
            java.lang.String r10 = "mUnthemedEntries"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r10)     // Catch: java.lang.NoSuchFieldException -> L1b7
            E3.h.f1717g = r3     // Catch: java.lang.NoSuchFieldException -> L1b7
            r3.setAccessible(r7)     // Catch: java.lang.NoSuchFieldException -> L1b7
            goto L1bd
        L1b7:
            r3 = move-exception
            java.lang.String r10 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r4, r10, r3)
        L1bd:
            E3.h.f1718h = r7
        L1bf:
            java.lang.reflect.Field r3 = E3.h.f1717g
            if (r3 != 0) goto L1c4
            goto L1d7
        L1c4:
            java.lang.Object r14 = r3.get(r14)     // Catch: java.lang.IllegalAccessException -> L1cc
            android.util.LongSparseArray r14 = (android.util.LongSparseArray) r14     // Catch: java.lang.IllegalAccessException -> L1cc
            r6 = r14
            goto L1d2
        L1cc:
            r14 = move-exception
            java.lang.String r3 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r4, r3, r14)
        L1d2:
            if (r6 == 0) goto L1d7
            r6.clear()
        L1d7:
            int r14 = r13.f13378k0
            if (r14 == 0) goto L1e7
            r0.setTheme(r14)
            android.content.res.Resources$Theme r14 = r0.getTheme()
            int r3 = r13.f13378k0
            r14.applyStyle(r3, r7)
        L1e7:
            if (r1 == 0) goto L218
            boolean r14 = r8 instanceof android.app.Activity
            if (r14 == 0) goto L218
            r14 = r8
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r1 = r14 instanceof androidx.lifecycle.InterfaceC0660x
            if (r1 == 0) goto L20b
            r1 = r14
            androidx.lifecycle.x r1 = (androidx.lifecycle.InterfaceC0660x) r1
            androidx.lifecycle.q r1 = r1.getLifecycle()
            androidx.lifecycle.p r1 = r1.b()
            androidx.lifecycle.p r3 = androidx.lifecycle.EnumC0653p.f9558s
            int r1 = r1.compareTo(r3)
            if (r1 < 0) goto L218
            r14.onConfigurationChanged(r15)
            goto L218
        L20b:
            boolean r1 = r13.f13374g0
            if (r1 == 0) goto L218
            boolean r1 = r13.f13375h0
            if (r1 != 0) goto L218
            r14.onConfigurationChanged(r15)
            goto L218
        L217:
            r7 = r14
        L218:
            if (r7 == 0) goto L22b
            boolean r14 = r8 instanceof h.AbstractActivityC1106h
            if (r14 == 0) goto L22b
            r14 = r9 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L225
            r14 = r8
            h.h r14 = (h.AbstractActivityC1106h) r14
        L225:
            r14 = r9 & 4
            if (r14 == 0) goto L22b
            h.h r8 = (h.AbstractActivityC1106h) r8
        L22b:
            if (r5 == 0) goto L23c
            android.content.res.Resources r14 = r0.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            r1.e r14 = h.r.b(r14)
            h.r.c(r14)
        L23c:
            if (r2 != 0) goto L246
            C0.b r14 = r13.x(r0)
            r14.m()
            goto L24d
        L246:
            h.u r14 = r13.f13381n0
            if (r14 == 0) goto L24d
            r14.c()
        L24d:
            r14 = 3
            if (r2 != r14) goto L261
            h.u r14 = r13.f13382o0
            if (r14 != 0) goto L25b
            h.u r14 = new h.u
            r14.<init>(r13, r0)
            r13.f13382o0 = r14
        L25b:
            h.u r14 = r13.f13382o0
            r14.m()
            goto L268
        L261:
            h.u r14 = r13.f13382o0
            if (r14 == 0) goto L268
            r14.c()
        L268:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.m(boolean, boolean):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.f13343B
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof h.t
            if (r2 != 0) goto L7a
            h.t r0 = new h.t
            r0.<init>(r7, r1)
            r7.f13344C = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.f13342A
            int[] r1 = h.y.f13341z0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            m.r r4 = m.C1328r.a()
            monitor-enter(r4)
            m.J0 r5 = r4.f14863a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.d(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.f13343B = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f13390w0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.f13392z
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.f13391x0
            if (r1 == 0) goto L61
            h.s.c(r8, r1)
            r7.f13391x0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = h.s.a(r0)
            r7.f13390w0 = r8
            goto L76
        L74:
            r7.f13390w0 = r2
        L76:
            r7.H()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.n(android.view.Window):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:117:0x01e3) to fix multi-entry loop: BACK_EDGE: B:117:0x01e3 -> B:145:0x01e9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:117:0x01e3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            h.B r9 = r8.f13389v0
            r1 = 0
            if (r9 != 0) goto L56
            int[] r9 = g.AbstractC1066a.j
            android.content.Context r0 = r8.f13342A
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r9)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r2 = r9.getString(r2)
            r9.recycle()
            if (r2 != 0) goto L20
            h.B r9 = new h.B
            r9.<init>()
            r8.f13389v0 = r9
            goto L56
        L20:
            java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L35
            java.lang.Class r9 = r9.loadClass(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Constructor r9 = r9.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r9 = r9.newInstance(r1)     // Catch: java.lang.Throwable -> L35
            h.B r9 = (h.C1095B) r9     // Catch: java.lang.Throwable -> L35
            r8.f13389v0 = r9     // Catch: java.lang.Throwable -> L35
            goto L56
        L35:
            r0 = move-exception
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = ". Falling back to default."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r0, r9)
            h.B r9 = new h.B
            r9.<init>()
            r8.f13389v0 = r9
        L56:
            h.B r9 = r8.f13389v0
            int r0 = m.d1.f14771a
            r9.getClass()
            int[] r0 = g.AbstractC1066a.f12806x
            r5 = 0
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r5, r5)
            r2 = 4
            int r3 = r0.getResourceId(r2, r5)
            if (r3 == 0) goto L72
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r6 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r6)
        L72:
            r0.recycle()
            if (r3 == 0) goto L88
            boolean r0 = r11 instanceof k.C1170c
            if (r0 == 0) goto L82
            r0 = r11
            k.c r0 = (k.C1170c) r0
            int r0 = r0.f13914a
            if (r0 == r3) goto L88
        L82:
            k.c r0 = new k.c
            r0.<init>(r11, r3)
            goto L89
        L88:
            r0 = r11
        L89:
            r10.getClass()
            int r3 = r10.hashCode()
            r4 = 3
            r6 = 1
            r7 = -1
            switch(r3) {
                case -1946472170: goto L135;
                case -1455429095: goto L129;
                case -1346021293: goto L11d;
                case -938935918: goto L111;
                case -937446323: goto L108;
                case -658531749: goto Lfd;
                case -339785223: goto Lf2;
                case 776382189: goto Le7;
                case 799298502: goto Lda;
                case 1125864064: goto Lcd;
                case 1413872058: goto Lc0;
                case 1601505219: goto Lb3;
                case 1666676343: goto La6;
                case 2001146706: goto L99;
                default: goto L96;
            }
        L96:
            r2 = r7
            goto L140
        L99:
            java.lang.String r2 = "Button"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto La2
            goto L96
        La2:
            r2 = 13
            goto L140
        La6:
            java.lang.String r2 = "EditText"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Laf
            goto L96
        Laf:
            r2 = 12
            goto L140
        Lb3:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lbc
            goto L96
        Lbc:
            r2 = 11
            goto L140
        Lc0:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lc9
            goto L96
        Lc9:
            r2 = 10
            goto L140
        Lcd:
            java.lang.String r2 = "ImageView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Ld6
            goto L96
        Ld6:
            r2 = 9
            goto L140
        Lda:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Le3
            goto L96
        Le3:
            r2 = 8
            goto L140
        Le7:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lf0
            goto L96
        Lf0:
            r2 = 7
            goto L140
        Lf2:
            java.lang.String r2 = "Spinner"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lfb
            goto L96
        Lfb:
            r2 = 6
            goto L140
        Lfd:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L106
            goto L96
        L106:
            r2 = 5
            goto L140
        L108:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L140
            goto L96
        L111:
            java.lang.String r2 = "TextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L11b
            goto L96
        L11b:
            r2 = r4
            goto L140
        L11d:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L127
            goto L96
        L127:
            r2 = 2
            goto L140
        L129:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L133
            goto L96
        L133:
            r2 = r6
            goto L140
        L135:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L13f
            goto L96
        L13f:
            r2 = 0
        L140:
            switch(r2) {
                case 0: goto L191;
                case 1: goto L18b;
                case 2: goto L185;
                case 3: goto L180;
                case 4: goto L177;
                case 5: goto L171;
                case 6: goto L16b;
                case 7: goto L166;
                case 8: goto L160;
                case 9: goto L15a;
                case 10: goto L155;
                case 11: goto L150;
                case 12: goto L14a;
                case 13: goto L145;
                default: goto L143;
            }
        L143:
            r2 = r1
            goto L196
        L145:
            m.o r2 = r9.b(r0, r12)
            goto L196
        L14a:
            m.t r2 = new m.t
            r2.<init>(r0, r12)
            goto L196
        L150:
            m.p r2 = r9.c(r0, r12)
            goto L196
        L155:
            m.n r2 = r9.a(r0, r12)
            goto L196
        L15a:
            m.w r2 = new m.w
            r2.<init>(r0, r12, r5)
            goto L196
        L160:
            m.f0 r2 = new m.f0
            r2.<init>(r0, r12)
            goto L196
        L166:
            m.A r2 = r9.d(r0, r12)
            goto L196
        L16b:
            m.O r2 = new m.O
            r2.<init>(r0, r12)
            goto L196
        L171:
            m.D r2 = new m.D
            r2.<init>(r0, r12)
            goto L196
        L177:
            m.v r2 = new m.v
            r3 = 2130903644(0x7f03025c, float:1.7414112E38)
            r2.<init>(r0, r12, r3)
            goto L196
        L180:
            m.Z r2 = r9.e(r0, r12)
            goto L196
        L185:
            m.x r2 = new m.x
            r2.<init>(r0, r12)
            goto L196
        L18b:
            m.q r2 = new m.q
            r2.<init>(r0, r12)
            goto L196
        L191:
            m.B r2 = new m.B
            r2.<init>(r0, r12)
        L196:
            if (r2 != 0) goto L1e8
            if (r11 == r0) goto L1e8
            java.lang.Object[] r11 = r9.f13203a
            java.lang.String r2 = "view"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L1aa
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r1, r10)
        L1aa:
            r11[r5] = r0     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            r11[r6] = r12     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            r2 = 46
            int r2 = r10.indexOf(r2)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            if (r7 != r2) goto L1d4
            r2 = r5
        L1b7:
            java.lang.String[] r3 = h.C1095B.f13201g     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            if (r2 >= r4) goto L1cf
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            android.view.View r3 = r9.f(r0, r10, r3)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            if (r3 == 0) goto L1c9
            r11[r5] = r1
            r11[r6] = r1
            r1 = r3
            goto L1e9
        L1c9:
            int r2 = r2 + 1
            goto L1b7
        L1cc:
            r0 = move-exception
            r9 = r0
            goto L1de
        L1cf:
            r11[r5] = r1
            r11[r6] = r1
            goto L1e9
        L1d4:
            android.view.View r9 = r9.f(r0, r10, r1)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e3
            r11[r5] = r1
            r11[r6] = r1
            r1 = r9
            goto L1e9
        L1de:
            r11[r5] = r1
            r11[r6] = r1
            throw r9
        L1e3:
            r11[r5] = r1
            r11[r6] = r1
            goto L1e9
        L1e8:
            r1 = r2
        L1e9:
            if (r1 == 0) goto L27a
            android.content.Context r9 = r1.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L211
            boolean r10 = r1.hasOnClickListeners()
            if (r10 != 0) goto L1fa
            goto L211
        L1fa:
            int[] r10 = h.C1095B.f13198c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r5)
            if (r10 == 0) goto L20e
            h.A r11 = new h.A
            r11.<init>(r1, r10)
            r1.setOnClickListener(r11)
        L20e:
            r9.recycle()
        L211:
            int r9 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r9 <= r6) goto L218
            goto L27a
        L218:
            int[] r9 = h.C1095B.f13199d
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r5)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r10 == 0) goto L23c
            boolean r10 = r9.getBoolean(r5, r5)
            java.util.WeakHashMap r11 = w1.AbstractC1835K.f18149a
            w1.x r2 = new w1.x
            r3 = 2131296724(0x7f0901d4, float:1.8211373E38)
            r7 = 2
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r2.f(r1, r10)
        L23c:
            r9.recycle()
            int[] r9 = h.C1095B.f13200e
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r5)
            if (r10 == 0) goto L252
            java.lang.String r10 = r9.getString(r5)
            w1.AbstractC1835K.n(r1, r10)
        L252:
            r9.recycle()
            int[] r9 = h.C1095B.f
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r5)
            if (r10 == 0) goto L277
            boolean r10 = r9.getBoolean(r5, r5)
            java.util.WeakHashMap r11 = w1.AbstractC1835K.f18149a
            w1.x r2 = new w1.x
            r3 = 2131296730(0x7f0901da, float:1.8211385E38)
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r2.f(r1, r10)
        L277:
            r9.recycle()
        L27a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(int i, x xVar, MenuC1209l menuC1209l) {
        if (menuC1209l == null) {
            if (xVar == null && i >= 0) {
                x[] xVarArr = this.f13370c0;
                if (i < xVarArr.length) {
                    xVar = xVarArr[i];
                }
            }
            if (xVar != null) {
                menuC1209l = xVar.f13332h;
            }
        }
        if ((xVar == null || xVar.f13335m) && !this.f13375h0) {
            t tVar = this.f13344C;
            Window.Callback callback = this.f13343B.getCallback();
            tVar.getClass();
            try {
                tVar.f13319t = true;
                callback.onPanelClosed(i, menuC1209l);
            } finally {
                tVar.f13319t = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(MenuC1209l menuC1209l) {
        C1312j c1312j;
        if (this.f13369b0) {
            return;
        }
        this.f13369b0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13349H;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((C1291Y0) actionBarOverlayLayout.f9140u).f14730a.f9205q;
        if (actionMenuView != null && (c1312j = actionMenuView.f9150J) != null) {
            c1312j.c();
            C1302e c1302e = c1312j.f14805K;
            if (c1302e != null && c1302e.b()) {
                c1302e.i.dismiss();
            }
        }
        Window.Callback callback = this.f13343B.getCallback();
        if (callback != null && !this.f13375h0) {
            callback.onPanelClosed(108, menuC1209l);
        }
        this.f13369b0 = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(x xVar, boolean z5) {
        w wVar;
        InterfaceC1309h0 interfaceC1309h0;
        C1312j c1312j;
        if (z5 && xVar.f13326a == 0 && (interfaceC1309h0 = this.f13349H) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1309h0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((C1291Y0) actionBarOverlayLayout.f9140u).f14730a.f9205q;
            if (actionMenuView != null && (c1312j = actionMenuView.f9150J) != null && c1312j.e()) {
                q(xVar.f13332h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f13342A.getSystemService("window");
        if (windowManager != null && xVar.f13335m && (wVar = xVar.f13330e) != null) {
            windowManager.removeView(wVar);
            if (z5) {
                p(xVar.f13326a, xVar, null);
            }
        }
        xVar.f13333k = false;
        xVar.f13334l = false;
        xVar.f13335m = false;
        xVar.f = null;
        xVar.f13336n = true;
        if (this.f13371d0 == xVar) {
            this.f13371d0 = null;
        }
        if (xVar.f13326a == 0) {
            H();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f13392z
            boolean r1 = r0 instanceof w1.InterfaceC1846i
            r2 = 1
            if (r1 != 0) goto Lb
            boolean r0 = r0 instanceof h.DialogInterfaceC1104f
            if (r0 == 0) goto L1b
        Lb:
            android.view.Window r0 = r6.f13343B
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L1b
            boolean r0 = com.google.android.gms.internal.measurement.AbstractC0836n2.m(r0, r7)
            if (r0 == 0) goto L1b
            goto L14d
        L1b:
            int r0 = r7.getKeyCode()
            r1 = 0
            r3 = 82
            if (r0 != r3) goto L3f
            h.t r0 = r6.f13344C
            android.view.Window r4 = r6.f13343B
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f13318s = r2     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch: java.lang.Throwable -> L3b
            r0.f13318s = r1
            if (r4 == 0) goto L3f
            goto L14d
        L3b:
            r7 = move-exception
            r0.f13318s = r1
            throw r7
        L3f:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L6f
            if (r0 == r5) goto L62
            if (r0 == r3) goto L50
            goto L14e
        L50:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L14d
            h.x r0 = r6.y(r1)
            boolean r1 = r0.f13335m
            if (r1 != 0) goto L14d
            r6.F(r0, r7)
            return r2
        L62:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L6b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            r6.f13372e0 = r2
            return r1
        L6f:
            if (r0 == r5) goto L147
            if (r0 == r3) goto L75
            goto L14e
        L75:
            k.a r0 = r6.f13352K
            if (r0 == 0) goto L7b
            goto L14d
        L7b:
            h.x r0 = r6.y(r1)
            m.h0 r3 = r6.f13349H
            android.content.Context r4 = r6.f13342A
            if (r3 == 0) goto L105
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            m.i0 r3 = r3.f9140u
            m.Y0 r3 = (m.C1291Y0) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f14730a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L105
            androidx.appcompat.widget.ActionMenuView r3 = r3.f9205q
            if (r3 == 0) goto L105
            boolean r3 = r3.f9149I
            if (r3 == 0) goto L105
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L105
            m.h0 r3 = r6.f13349H
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            m.i0 r3 = r3.f9140u
            m.Y0 r3 = (m.C1291Y0) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f14730a
            androidx.appcompat.widget.ActionMenuView r3 = r3.f9205q
            if (r3 == 0) goto Ldf
            m.j r3 = r3.f9150J
            if (r3 == 0) goto Ldf
            boolean r3 = r3.e()
            if (r3 == 0) goto Ldf
            m.h0 r7 = r6.f13349H
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            m.i0 r7 = r7.f9140u
            m.Y0 r7 = (m.C1291Y0) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f14730a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f9205q
            if (r7 == 0) goto L125
            m.j r7 = r7.f9150J
            if (r7 == 0) goto L125
            boolean r7 = r7.c()
            if (r7 == 0) goto L125
        Lde:
            goto L123
        Ldf:
            boolean r3 = r6.f13375h0
            if (r3 != 0) goto L125
            boolean r7 = r6.F(r0, r7)
            if (r7 == 0) goto L125
            m.h0 r7 = r6.f13349H
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            m.i0 r7 = r7.f9140u
            m.Y0 r7 = (m.C1291Y0) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f14730a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f9205q
            if (r7 == 0) goto L125
            m.j r7 = r7.f9150J
            if (r7 == 0) goto L125
            boolean r7 = r7.n()
            if (r7 == 0) goto L125
            goto Lde
        L105:
            boolean r3 = r0.f13335m
            if (r3 != 0) goto L127
            boolean r5 = r0.f13334l
            if (r5 == 0) goto L10e
            goto L127
        L10e:
            boolean r3 = r0.f13333k
            if (r3 == 0) goto L125
            boolean r3 = r0.f13337o
            if (r3 == 0) goto L11d
            r0.f13333k = r1
            boolean r3 = r6.F(r0, r7)
            goto L11e
        L11d:
            r3 = r2
        L11e:
            if (r3 == 0) goto L125
            r6.D(r0, r7)
        L123:
            r7 = r2
            goto L12b
        L125:
            r7 = r1
            goto L12b
        L127:
            r6.r(r0, r2)
            r7 = r3
        L12b:
            if (r7 == 0) goto L14d
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L13f
            r7.playSoundEffect(r1)
            return r2
        L13f:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            return r2
        L147:
            boolean r7 = r6.C()
            if (r7 == 0) goto L14e
        L14d:
            return r2
        L14e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.y.t(android.view.KeyEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(int i) {
        x xVarY = y(i);
        if (xVarY.f13332h != null) {
            Bundle bundle = new Bundle();
            xVarY.f13332h.t(bundle);
            if (bundle.size() > 0) {
                xVarY.f13338p = bundle;
            }
            xVarY.f13332h.w();
            xVarY.f13332h.clear();
        }
        xVarY.f13337o = true;
        xVarY.f13336n = true;
        if ((i == 108 || i == 0) && this.f13349H != null) {
            x xVarY2 = y(0);
            xVarY2.f13333k = false;
            F(xVarY2, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        ViewGroup viewGroup;
        if (this.f13358Q) {
            return;
        }
        Context context = this.f13342A;
        int[] iArr = AbstractC1066a.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f13367Z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        w();
        this.f13343B.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f13368a0) {
            viewGroup = this.f13366Y ? (ViewGroup) layoutInflaterFrom.inflate(com.wnapp.smspariaz.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.wnapp.smspariaz.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f13367Z) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.wnapp.smspariaz.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f13365X = false;
            this.f13364W = false;
        } else if (this.f13364W) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.wnapp.smspariaz.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1170c(context, typedValue.resourceId) : context).inflate(com.wnapp.smspariaz.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1309h0 interfaceC1309h0 = (InterfaceC1309h0) viewGroup.findViewById(com.wnapp.smspariaz.R.id.decor_content_parent);
            this.f13349H = interfaceC1309h0;
            interfaceC1309h0.setWindowCallback(this.f13343B.getCallback());
            if (this.f13365X) {
                ((ActionBarOverlayLayout) this.f13349H).g(109);
            }
            if (this.f13362U) {
                ((ActionBarOverlayLayout) this.f13349H).g(2);
            }
            if (this.f13363V) {
                ((ActionBarOverlayLayout) this.f13349H).g(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f13364W + ", windowActionBarOverlay: " + this.f13365X + ", android:windowIsFloating: " + this.f13367Z + ", windowActionModeOverlay: " + this.f13366Y + ", windowNoTitle: " + this.f13368a0 + " }");
        }
        n nVar = new n(this);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1826B.l(viewGroup, nVar);
        if (this.f13349H == null) {
            this.f13360S = (TextView) viewGroup.findViewById(com.wnapp.smspariaz.R.id.title);
        }
        boolean z5 = g1.f14790a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e8) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e8);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.wnapp.smspariaz.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f13343B.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f13343B.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new o(this));
        this.f13359R = viewGroup;
        Object obj = this.f13392z;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f13348G;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1309h0 interfaceC1309h02 = this.f13349H;
            if (interfaceC1309h02 != null) {
                interfaceC1309h02.setWindowTitle(title);
            } else {
                I i = this.f13346E;
                if (i != null) {
                    C1291Y0 c1291y0 = (C1291Y0) i.f13242x;
                    if (!c1291y0.f14735g) {
                        Toolbar toolbar = c1291y0.f14730a;
                        c1291y0.f14736h = title;
                        if ((c1291y0.f14731b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (c1291y0.f14735g) {
                                AbstractC1835K.n(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f13360S;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f13359R.findViewById(R.id.content);
        View decorView = this.f13343B.getDecorView();
        contentFrameLayout2.f9167w.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f13358Q = true;
        x xVarY = y(0);
        if (this.f13375h0 || xVarY.f13332h != null) {
            return;
        }
        A(108);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w() {
        if (this.f13343B == null) {
            Object obj = this.f13392z;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f13343B == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0067b x(Context context) {
        if (this.f13381n0 == null) {
            if (G0.f232v == null) {
                Context applicationContext = context.getApplicationContext();
                G0.f232v = new G0(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.f13381n0 = new u(this, G0.f232v);
        }
        return this.f13381n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final x y(int i) {
        x[] xVarArr = this.f13370c0;
        if (xVarArr == null || xVarArr.length <= i) {
            x[] xVarArr2 = new x[i + 1];
            if (xVarArr != null) {
                System.arraycopy(xVarArr, 0, xVarArr2, 0, xVarArr.length);
            }
            this.f13370c0 = xVarArr2;
            xVarArr = xVarArr2;
        }
        x xVar = xVarArr[i];
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x();
        xVar2.f13326a = i;
        xVar2.f13336n = false;
        xVarArr[i] = xVar2;
        return xVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z() {
        v();
        if (this.f13364W && this.f13346E == null) {
            Object obj = this.f13392z;
            if (obj instanceof Activity) {
                this.f13346E = new I((Activity) obj, this.f13365X);
            } else if (obj instanceof Dialog) {
                this.f13346E = new I((Dialog) obj);
            }
            I i = this.f13346E;
            if (i != null) {
                i.Y(this.f13386s0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
