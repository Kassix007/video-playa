package com.web2native;

import B0.C0050o;
import C0.C0101s0;
import R4.AbstractC0462j;
import R4.C0458i;
import R4.C0468k1;
import R4.C0469k2;
import R4.C0478n;
import R4.C0498s0;
import R4.C0505u;
import R4.C0516w2;
import R4.C0518x0;
import R4.C0527z1;
import R4.C1;
import R4.D;
import R4.G;
import R4.G2;
import R4.J0;
import R4.P2;
import R4.RunnableC0452g1;
import R4.RunnableC0456h1;
import R4.U;
import R4.V;
import R4.V2;
import R4.Y;
import R4.l3;
import T1.u;
import X.e;
import Z.m;
import android.R;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.lifecycle.J;
import androidx.lifecycle.X;
import c.AbstractC0705c;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.web2native.MainActivity;
import g2.C1081a;
import h.AbstractActivityC1106h;
import h.AbstractServiceC1097D;
import h.C1105g;
import j5.C1166c;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k1.AbstractC1175c;
import k3.c;
import k3.d;
import k5.C1190b;
import m5.C1386y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t1.C1615b;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC1106h {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ int f11777U = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0468k1 f11778Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C1166c f11779R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f11780S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public NotificationDisableBroadcastReceiver f11781T;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MainActivity() {
        ((m) this.f9894t.f8313s).C("androidx:appcompat", new C1081a(this));
        i(new C1105g(this));
        this.f11780S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, k1.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode;
        kotlin.jvm.internal.m.e(event, "event");
        if (this.f11780S) {
            C0468k1 c0468k1 = this.f11778Q;
            if (c0468k1 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C0458i c0458i = c0468k1.f7073d;
            if ((c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6988M, Boolean.TRUE) : false) && ((keyCode = event.getKeyCode()) == 24 || keyCode == 25)) {
                if (event.getAction() != 0) {
                    return true;
                }
                final String str = event.getKeyCode() == 24 ? "window.volumeEventCallback('VOLUME_UP_PRESSED')" : "window.volumeEventCallback('VOLUME_DOWN_PRESSED')";
                C0468k1 c0468k12 = this.f11778Q;
                if (c0468k12 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                WebView webView = c0468k12.f7084k;
                if (webView == null) {
                    return true;
                }
                webView.evaluateJavascript("typeof volumeEventCallback === 'function'", new ValueCallback() { // from class: R4.i1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String value = (String) obj;
                        int i = MainActivity.f11777U;
                        kotlin.jvm.internal.m.e(value, "value");
                        if ("true".equals(value)) {
                            C0468k1 c0468k13 = this.f7022a.f11778Q;
                            if (c0468k13 == null) {
                                kotlin.jvm.internal.m.k("dataObject");
                                throw null;
                            }
                            WebView webView2 = c0468k13.f7084k;
                            if (webView2 != null) {
                                webView2.evaluateJavascript(str, null);
                            }
                        }
                    }
                });
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, b.l, android.app.Activity
    public final void onActivityResult(int i, int i7, Intent intent) throws JSONException {
        Uri data;
        if (i == 281 && i7 == -1) {
            C0468k1 c0468k1 = this.f11778Q;
            if (c0468k1 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            if (c0468k1.f7047G != null && intent != null && (data = intent.getData()) != null) {
                if (this.f11778Q == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                getContentResolver().takePersistableUriPermission(data, 3);
            }
        } else {
            C0468k1 c0468k12 = this.f11778Q;
            if (c0468k12 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            if (i == c0468k12.f7077f0) {
                if (intent != null && V.f6870d == null) {
                    V.f6870d = new V();
                }
            } else if (c0468k12.f7046F == null && i != c0468k12.f7079g0 && i == c0468k12.f7074d0 && i7 == -1) {
                JSONArray jSONArray = new JSONArray((Collection) (intent != null ? intent.getStringArrayListExtra("android.speech.extra.RESULTS") : null));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("results", jSONArray);
                jSONObject.put(FirebaseAnalytics.Param.SUCCESS, true);
                jSONObject.put("type", "VOICE_SEARCH_RESULT");
                C0468k1 c0468k13 = this.f11778Q;
                if (c0468k13 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                l3 l3Var = c0468k13.f7048H;
                if (l3Var != null) {
                    l3Var.doneVoiceSearch(jSONObject);
                }
            }
        }
        if (i == 23) {
            if (i7 == -1) {
                C0468k1 c0468k14 = this.f11778Q;
                if (c0468k14 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                String str = c0468k14.f7092o;
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -2067167946) {
                        if (iHashCode != -830533367) {
                            if (iHashCode == 808895785 && str.equals("unpairDevice")) {
                                C0468k1 c0468k15 = this.f11778Q;
                                if (c0468k15 == null) {
                                    kotlin.jvm.internal.m.k("dataObject");
                                    throw null;
                                }
                                if (c0468k15.f7082i0 != null) {
                                    kotlin.jvm.internal.m.b(null);
                                    kotlin.jvm.internal.m.e(null, "data");
                                    throw null;
                                }
                            }
                        } else if (str.equals("startBluetoothScan")) {
                            C0468k1 c0468k16 = this.f11778Q;
                            if (c0468k16 == null) {
                                kotlin.jvm.internal.m.k("dataObject");
                                throw null;
                            }
                            V v6 = c0468k16.f7082i0;
                        }
                    } else if (str.equals("pairWithDevice")) {
                        C0468k1 c0468k17 = this.f11778Q;
                        if (c0468k17 == null) {
                            kotlin.jvm.internal.m.k("dataObject");
                            throw null;
                        }
                        if (c0468k17.f7082i0 != null) {
                            kotlin.jvm.internal.m.b(null);
                            kotlin.jvm.internal.m.e(null, "data");
                            throw null;
                        }
                    }
                }
            } else {
                C0468k1 c0468k18 = this.f11778Q;
                if (c0468k18 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                if (c0468k18.f7092o == null) {
                    c0468k18.f7092o = "checkBluetoothPermission";
                }
            }
        }
        super.onActivityResult(i, i7, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, b.l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        C1166c c1166c;
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (!this.f11780S || (c1166c = this.f11779R) == null) {
            return;
        }
        c1166c.f13860b.k(newConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, b.l, k1.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C0468k1 c0468k1;
        C0478n c0478n;
        P2 p22;
        Integer num;
        C0518x0 c0518x0;
        C1 c12;
        V2 v22;
        C0469k2 c0469k2;
        C0527z1 c0527z1;
        Y y6;
        Bitmap bitmapDecodeStream;
        G g7;
        D d5;
        String str;
        G g8;
        J j;
        C0516w2 c0516w2;
        List list;
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        (i >= 31 ? new C1615b(this) : new U(this)).a();
        if (this.f11780S) {
            C0468k1 c0468k12 = new C0468k1(this, this);
            this.f11778Q = c0468k12;
            C0458i c0458i = c0468k12.f7073d;
            boolean z5 = false;
            if (kotlin.jvm.internal.m.a(c0458i != null ? c0458i.f6990O : null, "PORTRAIT")) {
                setRequestedOrientation(1);
            } else {
                C0468k1 c0468k13 = this.f11778Q;
                if (c0468k13 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                C0458i c0458i2 = c0468k13.f7073d;
                if (kotlin.jvm.internal.m.a(c0458i2 != null ? c0458i2.f6990O : null, "LANDSCAPE")) {
                    setRequestedOrientation(0);
                } else {
                    setRequestedOrientation(-1);
                }
            }
            if (AbstractC1175c.a(this, "android.permission.POST_NOTIFICATIONS") != 0 || i < 33) {
                if (i < 33 && this.f11778Q == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
            } else if (this.f11778Q == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C0468k1 c0468k14 = this.f11778Q;
            if (c0468k14 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            c0468k14.f7096r = bundle;
            C1166c c1166c = new C1166c();
            this.f11779R = c1166c;
            C0468k1 c0468k15 = this.f11778Q;
            if (c0468k15 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            c0468k15.f7097s = c1166c;
            new C0498s0(this, c0468k15, 1);
            C0468k1 c0468k16 = this.f11778Q;
            if (c0468k16 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            MainActivity mainActivity = c0468k16.f7071c;
            c0468k16.f7042B = new V();
            c cVar = new c();
            int i7 = 18;
            d dVar = new d(i7, z5);
            dVar.f14122r = FirebaseAnalytics.getInstance(mainActivity);
            cVar.f14120q = dVar;
            c0468k16.f7043C = cVar;
            c0468k16.f7046F = new V();
            C0458i c0458i3 = c0468k16.f7073d;
            if (c0458i3 != null && (c0516w2 = c0458i3.f7008n) != null && (list = c0516w2.f7203a) != null && (!list.isEmpty())) {
                c0468k16.f7051K = new C0050o(c0468k16, 27);
            }
            C1190b c1190b = c0468k16.f7086l;
            if (c1190b != null && (j = c1190b.f14129c) != null) {
                j.e(c0468k16.f7069b, new J0(new Z4.G(6), 5));
            }
            if (((c0458i3 == null || (g8 = c0458i3.f7007m) == null) ? false : kotlin.jvm.internal.m.a(g8.f6758a, Boolean.TRUE)) && c0458i3 != null && (g7 = c0458i3.f7007m) != null && (d5 = g7.f6759b) != null && (str = d5.f6742b) != null) {
                kotlin.jvm.internal.m.b(str);
                if (str.length() > 0) {
                    c0468k16.f7052L = new OrufyConnectHandlerUtil(c0468k16);
                }
            }
            MainActivity mainActivity2 = c0468k16.f7071c;
            C0458i c0458i4 = c0468k16.f7073d;
            if (i >= 25) {
                if ((c0458i4 != null ? c0458i4.j : null) != null) {
                    ArrayList arrayList = new ArrayList();
                    Object systemService = mainActivity2.getSystemService((Class<Object>) AbstractC0462j.g());
                    kotlin.jvm.internal.m.d(systemService, "getSystemService(...)");
                    ShortcutManager shortcutManagerF = AbstractC0462j.f(systemService);
                    List<G2> list2 = c0458i4 != null ? c0458i4.j : null;
                    kotlin.jvm.internal.m.b(list2);
                    for (G2 g22 : list2) {
                        AbstractC0462j.i();
                        String str2 = g22.f6767c;
                        ShortcutInfo.Builder longLabel = AbstractC0462j.d(mainActivity2, String.valueOf(str2)).setShortLabel(String.valueOf(str2)).setLongLabel(String.valueOf(str2));
                        try {
                            InputStream inputStreamOpen = mainActivity2.getAssets().open(String.valueOf(g22.f6766b));
                            kotlin.jvm.internal.m.d(inputStreamOpen, "open(...)");
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                            inputStreamOpen.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            bitmapDecodeStream = null;
                        }
                        ShortcutInfo shortcutInfoBuild = longLabel.setIcon(Icon.createWithBitmap(bitmapDecodeStream)).setIntent(new Intent(mainActivity2, (Class<?>) MainActivity.class).putExtra("openURL", String.valueOf(g22.f6765a)).setAction("android.intent.action.VIEW")).build();
                        kotlin.jvm.internal.m.d(shortcutInfoBuild, "build(...)");
                        arrayList.add(shortcutInfoBuild);
                    }
                    shortcutManagerF.setDynamicShortcuts(arrayList);
                } else if ((c0458i4 != null ? c0458i4.j : null) == null) {
                    Object systemService2 = mainActivity2.getSystemService((Class<Object>) AbstractC0462j.g());
                    kotlin.jvm.internal.m.d(systemService2, "getSystemService(...)");
                    ShortcutManager shortcutManagerF2 = AbstractC0462j.f(systemService2);
                    List dynamicShortcuts = shortcutManagerF2.getDynamicShortcuts();
                    kotlin.jvm.internal.m.d(dynamicShortcuts, "getDynamicShortcuts(...)");
                    if (!dynamicShortcuts.isEmpty()) {
                        shortcutManagerF2.removeAllDynamicShortcuts();
                    }
                }
            }
            c0468k16.f7048H = new l3(c0468k16);
            c0468k16.f7050J = new C0050o(c0468k16, 26);
            WebView webView = c0468k16.f7084k;
            if (webView != null) {
                l3 l3Var = c0468k16.f7048H;
                kotlin.jvm.internal.m.b(l3Var);
                webView.addJavascriptInterface(l3Var, "WebToNativeInterface");
            }
            if ((c0458i3 == null || (y6 = c0458i3.f7020z) == null) ? false : kotlin.jvm.internal.m.a(y6.f6884a, Boolean.TRUE)) {
                c0468k16.f7047G = new V();
            }
            if ((c0458i3 == null || (c0527z1 = c0458i3.f6977B) == null) ? false : kotlin.jvm.internal.m.a(c0527z1.f7222a, Boolean.TRUE)) {
                c0468k16.f7083j0 = new V();
            }
            if (c0458i3 != null) {
                kotlin.jvm.internal.m.a(c0458i3.f6991P, Boolean.TRUE);
            }
            if ((c0458i3 == null || (c0469k2 = c0458i3.f6983H) == null) ? false : kotlin.jvm.internal.m.a(c0469k2.f7106a, Boolean.TRUE)) {
                c0468k16.f7095q = new V();
            }
            if ((c0458i3 == null || (v22 = c0458i3.f6987L) == null) ? false : kotlin.jvm.internal.m.a(v22.f6878a, Boolean.TRUE)) {
                c0468k16.f7056P = new V();
            }
            if ((c0458i3 == null || (c12 = c0458i3.f6993R) == null || !c12.f6738a) ? false : true) {
                c0468k16.f7104z = new V();
            }
            if ((c0458i3 == null || (c0518x0 = c0458i3.f6996U) == null) ? false : kotlin.jvm.internal.m.a(c0518x0.f7211a, Boolean.TRUE)) {
                c0468k16.f7093o0 = new V();
            }
            if (bundle != null) {
                try {
                    c0468k1 = this.f11778Q;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                if (c0468k1 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                u uVar = c0468k1.f7075e;
                if (uVar != null) {
                    uVar.d(bundle);
                }
                C0468k1 c0468k17 = this.f11778Q;
                if (c0468k17 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                WebView webView2 = c0468k17.f7084k;
                if (webView2 != null) {
                    webView2.restoreState(bundle);
                }
                C0468k1 c0468k18 = this.f11778Q;
                if (c0468k18 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                C0458i c0458i5 = c0468k18.f7073d;
                if (c0458i5 != null ? kotlin.jvm.internal.m.a(c0458i5.f6978C, Boolean.TRUE) : false) {
                    C0468k1 c0468k19 = this.f11778Q;
                    if (c0468k19 == null) {
                        kotlin.jvm.internal.m.k("dataObject");
                        throw null;
                    }
                    c0468k19.f7096r = null;
                }
            }
            C0468k1 c0468k110 = this.f11778Q;
            if (c0468k110 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            c0468k110.f7054N = new O3.D(i7);
            Intent intent = getIntent();
            kotlin.jvm.internal.m.d(intent, "getIntent(...)");
            l6.d.s(c0468k110, intent);
            C0468k1 c0468k111 = this.f11778Q;
            if (c0468k111 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C0458i c0458i6 = c0468k111.f7073d;
            if (c0458i6 != null && (num = c0458i6.f7003g) != null) {
                c0468k111.f = num.intValue();
            }
            C0468k1 c0468k112 = this.f11778Q;
            if (c0468k112 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C0458i c0458i7 = c0468k112.f7073d;
            if ((c0458i7 == null || (p22 = c0458i7.f6981F) == null) ? false : kotlin.jvm.internal.m.a(p22.f6834a, Boolean.TRUE)) {
                C0468k1 c0468k113 = this.f11778Q;
                if (c0468k113 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                if (c0468k113.f7059S.f13149a.getPackageManager().hasSystemFeature("android.hardware.nfc") && this.f11778Q == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
            }
            C0468k1 c0468k114 = this.f11778Q;
            if (c0468k114 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C0458i c0458i8 = c0468k114.f7073d;
            if (c0458i8 != null ? kotlin.jvm.internal.m.a(c0458i8.f6982G, Boolean.TRUE) : false) {
                NotificationDisableBroadcastReceiver notificationDisableBroadcastReceiver = new NotificationDisableBroadcastReceiver();
                this.f11781T = notificationDisableBroadcastReceiver;
                notificationDisableBroadcastReceiver.notificationBroadcastReceiverListener = new a(this);
                IntentFilter intentFilter = new IntentFilter("com.web2native.NOTIFICATION_DATA_RECEIVED");
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 33) {
                    registerReceiver(this.f11781T, intentFilter, 4);
                } else if (i8 >= 26) {
                    registerReceiver(this.f11781T, intentFilter);
                }
            }
            C0468k1 c0468k115 = this.f11778Q;
            if (c0468k115 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C0458i c0458i9 = c0468k115.f7073d;
            if ((c0458i9 == null || (c0478n = c0458i9.f6986K) == null) ? false : kotlin.jvm.internal.m.a(c0478n.f7132a, Boolean.TRUE)) {
                C0468k1 c0468k116 = this.f11778Q;
                if (c0468k116 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                c0468k116.f7087l0 = new V();
            }
            e eVar = new e(1111149746, true, new J5.u(4, this));
            ViewGroup.LayoutParams layoutParams = AbstractC0705c.f10054a;
            View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
            C0101s0 c0101s0 = childAt instanceof C0101s0 ? (C0101s0) childAt : null;
            if (c0101s0 != null) {
                c0101s0.setParentCompositionContext(null);
                c0101s0.setContent(eVar);
                return;
            }
            C0101s0 c0101s02 = new C0101s0(this);
            c0101s02.setParentCompositionContext(null);
            c0101s02.setContent(eVar);
            View decorView = getWindow().getDecorView();
            if (X.d(decorView) == null) {
                X.h(decorView, this);
            }
            if (X.e(decorView) == null) {
                X.i(decorView, this);
            }
            if (AbstractC0836n2.p(decorView) == null) {
                AbstractC0836n2.M(decorView, this);
            }
            setContentView(c0101s02, AbstractC0705c.f10054a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, android.app.Activity
    public final void onDestroy() {
        NotificationDisableBroadcastReceiver notificationDisableBroadcastReceiver;
        C0527z1 c0527z1;
        super.onDestroy();
        if (this.f11780S) {
            C0468k1 c0468k1 = this.f11778Q;
            if (c0468k1 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C1166c c1166c = c0468k1.f7097s;
            if (c1166c != null) {
                c1166c.f.k(C1386y.f15098a);
            }
        }
        C0468k1 c0468k12 = this.f11778Q;
        if (c0468k12 == null) {
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
        C0458i c0458i = c0468k12.f7073d;
        if (((c0458i == null || (c0527z1 = c0458i.f6977B) == null) ? false : kotlin.jvm.internal.m.a(c0527z1.f7222a, Boolean.TRUE)) && this.f11778Q == null) {
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
        C0468k1 c0468k13 = this.f11778Q;
        if (c0468k13 == null) {
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
        C0458i c0458i2 = c0468k13.f7073d;
        if ((c0458i2 != null ? kotlin.jvm.internal.m.a(c0458i2.f6982G, Boolean.TRUE) : false) && (notificationDisableBroadcastReceiver = this.f11781T) != null) {
            unregisterReceiver(notificationDisableBroadcastReceiver);
        }
        System.exit(-1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.onNewIntent(intent);
        if (this.f11780S) {
            C0468k1 c0468k1 = this.f11778Q;
            if (c0468k1 != null) {
                l6.d.s(c0468k1, intent);
            } else {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, android.app.Activity
    public final void onPause() {
        C0527z1 c0527z1;
        super.onPause();
        if (this.f11780S) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0452g1(this, 0), 1000L);
            C1166c c1166c = this.f11779R;
            if (c1166c != null) {
                c1166c.f13862d.k(C1386y.f15098a);
            }
        }
        C0468k1 c0468k1 = this.f11778Q;
        if (c0468k1 == null) {
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
        C0458i c0458i = c0468k1.f7073d;
        if (((c0458i == null || (c0527z1 = c0458i.f6977B) == null) ? false : kotlin.jvm.internal.m.a(c0527z1.f7222a, Boolean.TRUE)) && this.f11778Q == null) {
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, b.l, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.m.e(permissions, "permissions");
        kotlin.jvm.internal.m.e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        if (i == 222) {
            if (grantResults[0] == 0) {
                if (this.f11778Q != null) {
                    return;
                }
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            if (this.f11778Q != null) {
                return;
            }
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
        C0468k1 c0468k1 = this.f11778Q;
        if (c0468k1 == null) {
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
        if (i == c0468k1.f7072c0) {
            s(grantResults);
        } else if (i == c0468k1.f7076e0) {
            s(grantResults);
        } else if (i == c0468k1.f7081h0) {
            s(grantResults);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        kotlin.jvm.internal.m.e(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        if (this.f11780S) {
            C0468k1 c0468k1 = this.f11778Q;
            if (c0468k1 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C0458i c0458i = c0468k1.f7073d;
            if (c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6978C, Boolean.TRUE) : false) {
                try {
                    C0468k1 c0468k12 = this.f11778Q;
                    if (c0468k12 == null) {
                        kotlin.jvm.internal.m.k("dataObject");
                        throw null;
                    }
                    WebView webView = c0468k12.f7084k;
                    if (webView != null) {
                        if (c0468k12 == null) {
                            kotlin.jvm.internal.m.k("dataObject");
                            throw null;
                        }
                        Bundle bundle = c0468k12.f7096r;
                        kotlin.jvm.internal.m.b(bundle);
                        webView.restoreState(bundle);
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, android.app.Activity
    public final void onResume() {
        C0505u c0505u;
        super.onResume();
        boolean zA = false;
        if (this.f11780S) {
            C0468k1 c0468k1 = this.f11778Q;
            if (c0468k1 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C1166c c1166c = c0468k1.f7097s;
            if (c1166c != null) {
                c1166c.f13861c.k(C1386y.f15098a);
            }
            C0468k1 c0468k12 = this.f11778Q;
            if (c0468k12 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            c0468k12.f7063W = false;
            int i = AbstractServiceC1097D.f13205r;
        }
        C0468k1 c0468k13 = this.f11778Q;
        if (c0468k13 == null) {
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
        if (c0468k13.f7082i0 != null) {
            C0458i c0458i = c0468k13.f7073d;
            if (c0458i != null && (c0505u = c0458i.f6976A) != null) {
                zA = kotlin.jvm.internal.m.a(c0505u.f7193a, Boolean.TRUE);
            }
            if (zA) {
                C0468k1 c0468k14 = this.f11778Q;
                if (c0468k14 != null) {
                    c0468k14.f7059S.f13153e = true;
                } else {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.l, k1.e, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        C0468k1 c0468k1;
        kotlin.jvm.internal.m.e(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f11780S) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0456h1(), 1200L);
            C0468k1 c0468k12 = this.f11778Q;
            if (c0468k12 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C0458i c0458i = c0468k12.f7073d;
            if (c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6978C, Boolean.TRUE) : false) {
                try {
                    c0468k1 = this.f11778Q;
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                if (c0468k1 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                c0468k1.f7096r = outState;
                WebView webView = c0468k1.f7084k;
                if (webView != null) {
                    webView.saveState(outState);
                }
                try {
                    C0468k1 c0468k13 = this.f11778Q;
                    if (c0468k13 == null) {
                        kotlin.jvm.internal.m.k("dataObject");
                        throw null;
                    }
                    u uVar = c0468k13.f7075e;
                    if (uVar != null) {
                        uVar.e();
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // h.AbstractActivityC1106h, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f11780S) {
            if (this.f11778Q == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            C1166c c1166c = this.f11779R;
            if (c1166c != null) {
                c1166c.f13863e.k(C1386y.f15098a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(int[] iArr) {
        if (iArr[0] == 0) {
            C0468k1 c0468k1 = this.f11778Q;
            if (c0468k1 == null) {
                kotlin.jvm.internal.m.k("dataObject");
                throw null;
            }
            PermissionRequest permissionRequest = c0468k1.f7059S.f13163r;
            if (permissionRequest != null) {
                permissionRequest.grant(permissionRequest.getResources());
                return;
            }
            return;
        }
        C0468k1 c0468k12 = this.f11778Q;
        if (c0468k12 == null) {
            kotlin.jvm.internal.m.k("dataObject");
            throw null;
        }
        PermissionRequest permissionRequest2 = c0468k12.f7059S.f13163r;
        if (permissionRequest2 != null) {
            permissionRequest2.deny();
        }
    }
}
