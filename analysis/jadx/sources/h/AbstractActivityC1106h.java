package h;

import J1.AbstractComponentCallbacksC0185q;
import J1.C0187t;
import J1.C0188u;
import J1.P;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.EnumC0653p;
import h.AbstractActivityC1106h;
import k1.AbstractC1175c;
import m.C1262J0;
import m.C1291Y0;
import m.C1328r;
import m.d1;
import r.C1566q;
import v1.InterfaceC1752a;

/* JADX INFO: renamed from: h.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1106h extends b.l implements InterfaceC1107i {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f13297M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f13298N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public y f13300P;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final k3.d f13295K = new k3.d(5, new C0188u(this));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0662z f13296L = new C0662z(this);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f13299O = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractActivityC1106h() {
        ((Z.m) this.f9894t.f8313s).C("android:support:lifecycle", new J1.r(this, 0));
        final int i = 0;
        h(new InterfaceC1752a(this) { // from class: J1.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1106h f2731b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2731b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // v1.InterfaceC1752a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f2731b.f13295K.x();
                        break;
                    default:
                        this.f2731b.f13295K.x();
                        break;
                }
            }
        });
        final int i7 = 1;
        this.f9884B.add(new InterfaceC1752a(this) { // from class: J1.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC1106h f2731b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2731b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // v1.InterfaceC1752a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        this.f2731b.f13295K.x();
                        break;
                    default:
                        this.f2731b.f13295K.x();
                        break;
                }
            }
        });
        i(new C0187t(this, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean m(J1.H h4) {
        boolean zM = false;
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : h4.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null) {
                C0188u c0188u = abstractComponentCallbacksC0185q.f2691I;
                if ((c0188u == null ? null : c0188u.f2738x) != null) {
                    zM |= m(abstractComponentCallbacksC0185q.h());
                }
                P p7 = abstractComponentCallbacksC0185q.f2712d0;
                EnumC0653p enumC0653p = EnumC0653p.f9559t;
                EnumC0653p enumC0653p2 = EnumC0653p.f9558s;
                if (p7 != null) {
                    p7.g();
                    if (p7.f2591t.f9572d.compareTo(enumC0653p) >= 0) {
                        abstractComponentCallbacksC0185q.f2712d0.f2591t.h(enumC0653p2);
                        zM = true;
                    }
                }
                if (abstractComponentCallbacksC0185q.f2711c0.f9572d.compareTo(enumC0653p) >= 0) {
                    abstractComponentCallbacksC0185q.f2711c0.h(enumC0653p2);
                    zM = true;
                }
            }
        }
        return zM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        y yVar = (y) l();
        yVar.v();
        ((ViewGroup) yVar.f13359R.findViewById(R.id.content)).addView(view, layoutParams);
        yVar.f13344C.a(yVar.f13343B.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachBaseContext(android.content.Context r11) {
        /*
            r10 = this;
            h.l r0 = r10.l()
            h.y r0 = (h.y) r0
            r1 = 1
            r0.f13373f0 = r1
            int r2 = r0.f13377j0
            r3 = -100
            if (r2 == r3) goto L10
            goto L12
        L10:
            int r2 = h.l.f13302r
        L12:
            int r0 = r0.B(r11, r2)
            boolean r2 = h.l.b(r11)
            if (r2 == 0) goto L7f
            boolean r2 = h.l.b(r11)
            if (r2 != 0) goto L23
            goto L7f
        L23:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L39
            boolean r2 = h.l.f13306v
            if (r2 != 0) goto L7f
            androidx.room.F r2 = h.l.f13301q
            b2.f r3 = new b2.f
            r4 = 2
            r3.<init>(r11, r4)
            r2.execute(r3)
            goto L7f
        L39:
            java.lang.Object r2 = h.l.f13309y
            monitor-enter(r2)
            r1.e r3 = h.l.f13303s     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L64
            r1.e r3 = h.l.f13304t     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L51
            java.lang.String r3 = k1.AbstractC1175c.g(r11)     // Catch: java.lang.Throwable -> L4f
            r1.e r3 = r1.e.a(r3)     // Catch: java.lang.Throwable -> L4f
            h.l.f13304t = r3     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r11 = move-exception
            goto L7d
        L51:
            r1.e r3 = h.l.f13304t     // Catch: java.lang.Throwable -> L4f
            r1.f r3 = r3.f16276a     // Catch: java.lang.Throwable -> L4f
            android.os.LocaleList r3 = r3.f16277a     // Catch: java.lang.Throwable -> L4f
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L5f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L7f
        L5f:
            r1.e r3 = h.l.f13304t     // Catch: java.lang.Throwable -> L4f
            h.l.f13303s = r3     // Catch: java.lang.Throwable -> L4f
            goto L7b
        L64:
            r1.e r4 = h.l.f13304t     // Catch: java.lang.Throwable -> L4f
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L7b
            r1.e r3 = h.l.f13303s     // Catch: java.lang.Throwable -> L4f
            h.l.f13304t = r3     // Catch: java.lang.Throwable -> L4f
            r1.f r3 = r3.f16276a     // Catch: java.lang.Throwable -> L4f
            android.os.LocaleList r3 = r3.f16277a     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r3.toLanguageTags()     // Catch: java.lang.Throwable -> L4f
            k1.AbstractC1175c.f(r11, r3)     // Catch: java.lang.Throwable -> L4f
        L7b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L7f
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r11
        L7f:
            r1.e r2 = h.y.o(r11)
            boolean r3 = r11 instanceof android.view.ContextThemeWrapper
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L95
            android.content.res.Configuration r3 = h.y.s(r11, r0, r2, r5, r4)
            r6 = r11
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch: java.lang.IllegalStateException -> L95
            r6.applyOverrideConfiguration(r3)     // Catch: java.lang.IllegalStateException -> L95
            goto L247
        L95:
            boolean r3 = r11 instanceof k.C1170c
            if (r3 == 0) goto La5
            android.content.res.Configuration r3 = h.y.s(r11, r0, r2, r5, r4)
            r4 = r11
            k.c r4 = (k.C1170c) r4     // Catch: java.lang.IllegalStateException -> La5
            r4.a(r3)     // Catch: java.lang.IllegalStateException -> La5
            goto L247
        La5:
            boolean r3 = h.y.f13339A0
            if (r3 != 0) goto Lab
            goto L247
        Lab:
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>()
            r4 = -1
            r3.uiMode = r4
            r4 = 0
            r3.fontScale = r4
            android.content.Context r3 = r11.createConfigurationContext(r3)
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            android.content.res.Resources r6 = r11.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r3.uiMode = r7
            boolean r7 = r3.equals(r6)
            if (r7 != 0) goto L1e9
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r4
            int r4 = r3.diff(r6)
            if (r4 != 0) goto Le3
            goto L1ea
        Le3:
            float r4 = r3.fontScale
            float r8 = r6.fontScale
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto Led
            r7.fontScale = r8
        Led:
            int r4 = r3.mcc
            int r8 = r6.mcc
            if (r4 == r8) goto Lf5
            r7.mcc = r8
        Lf5:
            int r4 = r3.mnc
            int r8 = r6.mnc
            if (r4 == r8) goto Lfd
            r7.mnc = r8
        Lfd:
            int r4 = android.os.Build.VERSION.SDK_INT
            h.r.a(r3, r6, r7)
            int r8 = r3.touchscreen
            int r9 = r6.touchscreen
            if (r8 == r9) goto L10a
            r7.touchscreen = r9
        L10a:
            int r8 = r3.keyboard
            int r9 = r6.keyboard
            if (r8 == r9) goto L112
            r7.keyboard = r9
        L112:
            int r8 = r3.keyboardHidden
            int r9 = r6.keyboardHidden
            if (r8 == r9) goto L11a
            r7.keyboardHidden = r9
        L11a:
            int r8 = r3.navigation
            int r9 = r6.navigation
            if (r8 == r9) goto L122
            r7.navigation = r9
        L122:
            int r8 = r3.navigationHidden
            int r9 = r6.navigationHidden
            if (r8 == r9) goto L12a
            r7.navigationHidden = r9
        L12a:
            int r8 = r3.orientation
            int r9 = r6.orientation
            if (r8 == r9) goto L132
            r7.orientation = r9
        L132:
            int r8 = r3.screenLayout
            r8 = r8 & 15
            int r9 = r6.screenLayout
            r9 = r9 & 15
            if (r8 == r9) goto L141
            int r8 = r7.screenLayout
            r8 = r8 | r9
            r7.screenLayout = r8
        L141:
            int r8 = r3.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            int r9 = r6.screenLayout
            r9 = r9 & 192(0xc0, float:2.69E-43)
            if (r8 == r9) goto L150
            int r8 = r7.screenLayout
            r8 = r8 | r9
            r7.screenLayout = r8
        L150:
            int r8 = r3.screenLayout
            r8 = r8 & 48
            int r9 = r6.screenLayout
            r9 = r9 & 48
            if (r8 == r9) goto L15f
            int r8 = r7.screenLayout
            r8 = r8 | r9
            r7.screenLayout = r8
        L15f:
            int r8 = r3.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            int r9 = r6.screenLayout
            r9 = r9 & 768(0x300, float:1.076E-42)
            if (r8 == r9) goto L16e
            int r8 = r7.screenLayout
            r8 = r8 | r9
            r7.screenLayout = r8
        L16e:
            r8 = 26
            if (r4 < r8) goto L1aa
            int r4 = d0.l.a(r3)
            r4 = r4 & 3
            int r8 = d0.l.a(r6)
            r8 = r8 & 3
            if (r4 == r8) goto L18e
            int r4 = d0.l.a(r7)
            int r8 = d0.l.a(r6)
            r8 = r8 & 3
            r4 = r4 | r8
            d0.l.m(r7, r4)
        L18e:
            int r4 = d0.l.a(r3)
            r4 = r4 & 12
            int r8 = d0.l.a(r6)
            r8 = r8 & 12
            if (r4 == r8) goto L1aa
            int r4 = d0.l.a(r7)
            int r8 = d0.l.a(r6)
            r8 = r8 & 12
            r4 = r4 | r8
            d0.l.m(r7, r4)
        L1aa:
            int r4 = r3.uiMode
            r4 = r4 & 15
            int r8 = r6.uiMode
            r8 = r8 & 15
            if (r4 == r8) goto L1b9
            int r4 = r7.uiMode
            r4 = r4 | r8
            r7.uiMode = r4
        L1b9:
            int r4 = r3.uiMode
            r4 = r4 & 48
            int r8 = r6.uiMode
            r8 = r8 & 48
            if (r4 == r8) goto L1c8
            int r4 = r7.uiMode
            r4 = r4 | r8
            r7.uiMode = r4
        L1c8:
            int r4 = r3.screenWidthDp
            int r8 = r6.screenWidthDp
            if (r4 == r8) goto L1d0
            r7.screenWidthDp = r8
        L1d0:
            int r4 = r3.screenHeightDp
            int r8 = r6.screenHeightDp
            if (r4 == r8) goto L1d8
            r7.screenHeightDp = r8
        L1d8:
            int r4 = r3.smallestScreenWidthDp
            int r8 = r6.smallestScreenWidthDp
            if (r4 == r8) goto L1e0
            r7.smallestScreenWidthDp = r8
        L1e0:
            int r3 = r3.densityDpi
            int r4 = r6.densityDpi
            if (r3 == r4) goto L1ea
            r7.densityDpi = r4
            goto L1ea
        L1e9:
            r7 = r5
        L1ea:
            android.content.res.Configuration r0 = h.y.s(r11, r0, r2, r7, r1)
            k.c r2 = new k.c
            r3 = 2131886638(0x7f12022e, float:1.940786E38)
            r2.<init>(r11, r3)
            r2.a(r0)
            android.content.res.Resources$Theme r11 = r11.getTheme()     // Catch: java.lang.NullPointerException -> L246
            if (r11 == 0) goto L246
            android.content.res.Resources$Theme r11 = r2.getTheme()
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L20d
            m1.k.a(r11)
            goto L246
        L20d:
            java.lang.Object r0 = m1.b.f15017e
            monitor-enter(r0)
            boolean r3 = m1.b.f15018g     // Catch: java.lang.Throwable -> L222
            if (r3 != 0) goto L22e
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L222 java.lang.NoSuchMethodException -> L224
            m1.b.f = r3     // Catch: java.lang.Throwable -> L222 java.lang.NoSuchMethodException -> L224
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L222 java.lang.NoSuchMethodException -> L224
            goto L22c
        L222:
            r11 = move-exception
            goto L244
        L224:
            r3 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r6 = "Failed to retrieve rebase() method"
            android.util.Log.i(r4, r6, r3)     // Catch: java.lang.Throwable -> L222
        L22c:
            m1.b.f15018g = r1     // Catch: java.lang.Throwable -> L222
        L22e:
            java.lang.reflect.Method r1 = m1.b.f     // Catch: java.lang.Throwable -> L222
            if (r1 == 0) goto L242
            r1.invoke(r11, r5)     // Catch: java.lang.Throwable -> L222 java.lang.reflect.InvocationTargetException -> L236 java.lang.IllegalAccessException -> L238
            goto L242
        L236:
            r11 = move-exception
            goto L239
        L238:
            r11 = move-exception
        L239:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r3, r11)     // Catch: java.lang.Throwable -> L222
            m1.b.f = r5     // Catch: java.lang.Throwable -> L222
        L242:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L222
            goto L246
        L244:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L222
            throw r11
        L246:
            r11 = r2
        L247:
            super.attachBaseContext(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.AbstractActivityC1106h.attachBaseContext(android.content.Context):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((y) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k1.e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((y) l()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            r6 = this;
            super.dump(r7, r8, r9, r10)
            r0 = 0
            if (r10 == 0) goto L5d
            int r1 = r10.length
            if (r1 != 0) goto La
            goto L5d
        La:
            r1 = r10[r0]
            int r2 = r1.hashCode()
            switch(r2) {
                case -645125871: goto L4d;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L24;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L5d
        L14:
            java.lang.String r2 = "--autofill"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1d
            goto L5d
        L1d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L5d
            goto L5c
        L24:
            java.lang.String r2 = "--contentcapture"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2d
            goto L5d
        L2d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L5d
            goto L5c
        L34:
            java.lang.String r2 = "--list-dumpables"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L46
            goto L5d
        L3d:
            java.lang.String r2 = "--dump-dumpable"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L46
            goto L5d
        L46:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L5d
            goto L5c
        L4d:
            java.lang.String r2 = "--translation"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L56
            goto L5d
        L56:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L5d
        L5c:
            return
        L5d:
            r9.print(r7)
            java.lang.String r1 = "Local FragmentActivity "
            r9.print(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r9.print(r1)
            java.lang.String r1 = " State:"
            r9.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "  "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.print(r1)
            java.lang.String r2 = "mCreated="
            r9.print(r2)
            boolean r2 = r6.f13297M
            r9.print(r2)
            java.lang.String r2 = " mResumed="
            r9.print(r2)
            boolean r2 = r6.f13298N
            r9.print(r2)
            java.lang.String r2 = " mStopped="
            r9.print(r2)
            boolean r2 = r6.f13299O
            r9.print(r2)
            android.app.Application r2 = r6.getApplication()
            if (r2 == 0) goto L11d
            androidx.lifecycle.k0 r2 = r6.f()
            java.lang.String r3 = "store"
            kotlin.jvm.internal.m.e(r2, r3)
            P1.a r3 = P1.a.f5609b
            java.lang.String r4 = "defaultCreationExtras"
            kotlin.jvm.internal.m.e(r3, r4)
            E.c0 r4 = new E.c0
            J1.J r5 = S1.a.f7304c
            r4.<init>(r2, r5, r3)
            java.lang.Class<S1.a> r2 = S1.a.class
            kotlin.jvm.internal.f r2 = kotlin.jvm.internal.z.a(r2)
            java.lang.String r3 = r2.b()
            if (r3 == 0) goto L115
            java.lang.String r5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r3 = r5.concat(r3)
            androidx.lifecycle.f0 r2 = r4.v(r3, r2)
            S1.a r2 = (S1.a) r2
            r.S r2 = r2.f7305b
            int r3 = r2.f()
            if (r3 <= 0) goto L11d
            r9.print(r1)
            java.lang.String r3 = "Loaders:"
            r9.println(r3)
            int r3 = r2.f()
            if (r3 > 0) goto Lf3
            goto L11d
        Lf3:
            java.lang.Object r7 = r2.g(r0)
            if (r7 != 0) goto L10f
            r9.print(r1)
            java.lang.String r7 = "  #"
            r9.print(r7)
            int r7 = r2.d(r0)
            r9.print(r7)
            java.lang.String r7 = ": "
            r9.print(r7)
            r7 = 0
            throw r7
        L10f:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
        L115:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Local and anonymous classes can not be ViewModels"
            r7.<init>(r8)
            throw r7
        L11d:
            k3.d r0 = r6.f13295K
            java.lang.Object r0 = r0.f14122r
            J1.u r0 = (J1.C0188u) r0
            J1.H r0 = r0.f2737w
            r0.v(r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.AbstractActivityC1106h.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final View findViewById(int i) {
        y yVar = (y) l();
        yVar.v();
        return yVar.f13343B.findViewById(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        y yVar = (y) l();
        if (yVar.f13347F == null) {
            yVar.z();
            I i = yVar.f13346E;
            yVar.f13347F = new k.h(i != null ? i.W() : yVar.f13342A);
        }
        return yVar.f13347F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = d1.f14771a;
        return super.getResources();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        y yVar = (y) l();
        if (yVar.f13346E != null) {
            yVar.z();
            yVar.f13346E.getClass();
            yVar.A(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l l() {
        if (this.f13300P == null) {
            androidx.room.F f = l.f13301q;
            this.f13300P = new y(this, null, this, this);
        }
        return this.f13300P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        super.onDestroy();
        ((C0188u) this.f13295K.f14122r).f2737w.k();
        this.f13296L.f(EnumC0652o.ON_DESTROY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0188u) this.f13295K.f14122r).f2737w.i();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.l, android.app.Activity
    public void onActivityResult(int i, int i7, Intent intent) {
        this.f13295K.x();
        super.onActivityResult(i, i7, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        y yVar = (y) l();
        if (yVar.f13364W && yVar.f13358Q) {
            yVar.z();
            I i = yVar.f13346E;
            if (i != null) {
                i.Z(i.f13238t.getResources().getBoolean(com.wnapp.smspariaz.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1328r c1328rA = C1328r.a();
        Context context = yVar.f13342A;
        synchronized (c1328rA) {
            C1262J0 c1262j0 = c1328rA.f14863a;
            synchronized (c1262j0) {
                C1566q c1566q = (C1566q) c1262j0.f14670b.get(context);
                if (c1566q != null) {
                    c1566q.a();
                }
            }
        }
        yVar.f13376i0 = new Configuration(yVar.f13342A.getResources().getConfiguration());
        yVar.m(false, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.l, k1.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13296L.f(EnumC0652o.ON_CREATE);
        J1.H h4 = ((C0188u) this.f13295K.f14122r).f2737w;
        h4.f2516E = false;
        h4.f2517F = false;
        h4.f2523L.f2562g = false;
        h4.t(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0188u) this.f13295K.f14122r).f2737w.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onDestroy() {
        n();
        l().d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentD;
        if (!o(i, menuItem)) {
            y yVar = (y) l();
            yVar.z();
            I i7 = yVar.f13346E;
            if (menuItem.getItemId() != 16908332 || i7 == null || (((C1291Y0) i7.f13242x).f14731b & 4) == 0 || (intentD = AbstractC1175c.d(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentD)) {
                navigateUpTo(intentD);
                return true;
            }
            k1.o oVar = new k1.o(this);
            Intent intentD2 = AbstractC1175c.d(this);
            if (intentD2 == null) {
                intentD2 = AbstractC1175c.d(this);
            }
            if (intentD2 != null) {
                ComponentName component = intentD2.getComponent();
                if (component == null) {
                    component = intentD2.resolveActivity(oVar.f14085r.getPackageManager());
                }
                oVar.d(component);
                oVar.f14084q.add(intentD2);
            }
            oVar.g();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f13298N = false;
        ((C0188u) this.f13295K.f14122r).f2737w.t(5);
        this.f13296L.f(EnumC0652o.ON_PAUSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((y) l()).v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onPostResume() {
        p();
        y yVar = (y) l();
        yVar.z();
        I i = yVar.f13346E;
        if (i != null) {
            i.f13233M = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.l, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f13295K.x();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onResume() {
        k3.d dVar = this.f13295K;
        dVar.x();
        super.onResume();
        this.f13298N = true;
        ((C0188u) dVar.f14122r).f2737w.y(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onStart() {
        q();
        ((y) l()).m(true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f13295K.x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onStop() {
        r();
        y yVar = (y) l();
        yVar.z();
        I i = yVar.f13346E;
        if (i != null) {
            i.f13233M = false;
            k.j jVar = i.f13232L;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().l(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((y) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        super.onPostResume();
        this.f13296L.f(EnumC0652o.ON_RESUME);
        J1.H h4 = ((C0188u) this.f13295K.f14122r).f2737w;
        h4.f2516E = false;
        h4.f2517F = false;
        h4.f2523L.f2562g = false;
        h4.t(7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        k3.d dVar = this.f13295K;
        dVar.x();
        C0188u c0188u = (C0188u) dVar.f14122r;
        super.onStart();
        this.f13299O = false;
        if (!this.f13297M) {
            this.f13297M = true;
            J1.H h4 = c0188u.f2737w;
            h4.f2516E = false;
            h4.f2517F = false;
            h4.f2523L.f2562g = false;
            h4.t(4);
        }
        c0188u.f2737w.y(true);
        this.f13296L.f(EnumC0652o.ON_START);
        J1.H h7 = c0188u.f2737w;
        h7.f2516E = false;
        h7.f2517F = false;
        h7.f2523L.f2562g = false;
        h7.t(5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        k3.d dVar;
        super.onStop();
        this.f13299O = true;
        do {
            dVar = this.f13295K;
        } while (m(((C0188u) dVar.f14122r).f2737w));
        J1.H h4 = ((C0188u) dVar.f14122r).f2737w;
        h4.f2517F = true;
        h4.f2523L.f2562g = true;
        h4.t(4);
        this.f13296L.f(EnumC0652o.ON_STOP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void setContentView(int i) {
        j();
        l().h(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((y) l()).f13378k0 = i;
    }

    @Override // b.l, android.app.Activity
    public void setContentView(View view) {
        j();
        l().j(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        l().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0188u) this.f13295K.f14122r).f2737w.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
