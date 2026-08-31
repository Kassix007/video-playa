package R4;

import B0.C0050o;
import O3.C0279e0;
import U4.C0550q;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.work.impl.Scheduler;
import b5.ViewOnScrollChangeListenerC0700a;
import com.web2native.MainActivity;
import com.web2native.OrufyConnectHandlerUtil;
import com.wnapp.smspariaz.R;
import e.C1014g;
import i1.C1134a;
import j5.C1164a;
import j5.C1165b;
import j5.C1166c;
import j5.C1167d;
import java.util.Arrays;
import k5.C1190b;
import m5.AbstractC1362a;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: R4.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0468k1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f7041A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public V f7042B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public k3.c f7043C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public V f7044D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public V f7045E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public V f7046F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public V f7047G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public l3 f7048H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C0050o f7049I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C0050o f7050J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0050o f7051K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public OrufyConnectHandlerUtil f7052L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C0279e0 f7053M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public O3.D f7054N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Integer f7055O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public V f7056P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final X1 f7057Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public V f7058R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final g5.h f7059S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public O3.Y f7060T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final p3.z0 f7061U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C1165b f7062V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f7063W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f7064X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C1134a f7065Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f7066Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f7067a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f7068a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainActivity f7069b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f7070b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MainActivity f7071c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final int f7072c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0458i f7073d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f7074d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T1.u f7075e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f7076e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f7077f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7078g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int f7079g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f7081h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public V f7082i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public V f7083j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WebView f7084k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final C1014g f7085k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1190b f7086l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public V f7087l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E1.u f7088m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final C0466k f7089m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f7091n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f7092o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public V f7093o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f7094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public V f7095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bundle f7096r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1166c f7097s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1167d f7098t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RelativeLayout f7099u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f7100v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b4.e f7101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f7102x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public V f7104z;
    public int f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f7080h = "splashScreen";
    public String i = "";
    public String j = "https://www.smspariaz.com";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1164a f7090n = new C1164a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7103y = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0468k1(MainActivity mainActivity, MainActivity mainActivity2) {
        this.f7067a = mainActivity;
        this.f7069b = mainActivity2;
        this.f7071c = mainActivity;
        mainActivity.getApplicationInfo().loadLabel(mainActivity.getPackageManager()).toString();
        AbstractC1362a.d(new C0464j1(this, 0));
        this.f7063W = true;
        this.f7064X = true;
        this.f7068a0 = true;
        this.f7070b0 = 101;
        this.f7072c0 = 102;
        this.f7074d0 = 102;
        this.f7076e0 = 103;
        this.f7077f0 = 121;
        this.f7079g0 = Scheduler.MAX_GREEDY_SCHEDULER_LIMIT;
        this.f7081h0 = 1003;
        String strV = AbstractC1918b.v(mainActivity);
        C0458i c0458i = strV == null ? null : (C0458i) E3.h.d(new I5.m(9)).a(C0458i.Companion.serializer(), strV);
        this.f7073d = c0458i;
        if (!(c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6980E, Boolean.TRUE) : false) && Build.VERSION.SDK_INT >= 30) {
            com.google.android.gms.internal.measurement.P1.X(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(mainActivity.getColor(R.color.splash_bg_color) & 16777215)}, 1)), String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(mainActivity.getColor(R.color.splash_bg_color) & 16777215)}, 1)), mainActivity2, true);
        }
        this.f7053M = new C0279e0(this);
        View viewInflate = LayoutInflater.from(mainActivity).inflate(R.layout.web_view, (ViewGroup) null);
        WebView webView = (WebView) viewInflate.findViewById(R.id.webView);
        this.f7084k = webView;
        kotlin.jvm.internal.m.b(webView);
        WebSettings settings = webView.getSettings();
        kotlin.jvm.internal.m.d(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        webView.clearCache(true);
        webView.clearHistory();
        webView.clearFormData();
        settings.setCacheMode(2);
        settings.setMixedContentMode(0);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        C1190b c1190b = new C1190b();
        webView.setWebViewClient(new C0550q(this, c1190b));
        webView.setWebChromeClient(new U4.r(this, c1190b));
        this.f7086l = c1190b;
        settings.setUserAgentString("SMSPARIAZAPP001");
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        if ((c0458i != null ? c0458i.f7012r : null) != null) {
            if (c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f7012r, Boolean.TRUE) : false) {
                cookieManager.acceptCookie();
            }
        }
        settings.setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setSupportMultipleWindows(false);
        webView.setOnScrollChangeListener(new ViewOnScrollChangeListenerC0700a(this, 1));
        this.f7059S = new g5.h(mainActivity2, this);
        this.f7062V = new C1165b();
        p3.z0 z0Var = new p3.z0();
        z0Var.f15875a = this;
        z0Var.f15876b = this.f7071c;
        g5.h hVar = this.f7059S;
        z0Var.f15877c = hVar.f13155h;
        z0Var.f15878d = hVar.j;
        z0Var.f15879e = hVar.f13156k;
        z0Var.f = hVar.f13157l;
        this.f7061U = z0Var;
        this.f7088m = new E1.u(this);
        new W1.l(this);
        this.f7098t = new C1167d();
        this.f7078g = c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f7016v, Boolean.TRUE) : false;
        X1 x12 = new X1(mainActivity);
        x12.setId(View.generateViewId());
        this.f7055O = Integer.valueOf(x12.getId());
        x12.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f7057Q = x12;
        x12.addView(viewInflate);
        this.f7085k0 = mainActivity2.k(new J1.D(8), new L0(1, this));
        this.f7089m0 = new C0466k(mainActivity, webView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final O3.Y a() {
        O3.Y y6 = this.f7060T;
        if (y6 != null) {
            return y6;
        }
        kotlin.jvm.internal.m.k("locationManager");
        throw null;
    }
}
