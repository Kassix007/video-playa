package U4;

import B0.G0;
import O3.C0279e0;
import P5.S;
import R4.C0458i;
import R4.C0468k1;
import R4.V;
import R4.X1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import com.wnapp.smspariaz.R;
import j5.C1167d;
import java.util.Iterator;
import java.util.Map;
import k5.C1190b;
import kotlin.jvm.internal.m;
import m5.C1386y;
import o.C1406b;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: U4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0548o implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7848r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0548o(C0468k1 c0468k1, int i) {
        this.f7847q = i;
        this.f7848r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        androidx.lifecycle.J j;
        T1.p pVarF;
        switch (this.f7847q) {
            case 0:
                C0468k1 c0468k1 = this.f7848r;
                C0458i c0458i = c0468k1.f7073d;
                if ((c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
                    P1.Z(c0468k1.f7067a, "#ffffff", "#000000", true);
                } else {
                    P1.Y("#000000", "#ffffff", c0468k1.f7069b, 8);
                }
                return C1386y.f15098a;
            case 1:
                Context context = (Context) obj;
                kotlin.jvm.internal.m.e(context, "context");
                C0468k1 c0468k12 = this.f7848r;
                if (c0468k12.f7099u == null) {
                    RelativeLayout relativeLayout = new RelativeLayout(context);
                    relativeLayout.setId(View.generateViewId());
                    relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    c0468k12.f7099u = relativeLayout;
                }
                RelativeLayout relativeLayout2 = c0468k12.f7099u;
                kotlin.jvm.internal.m.b(relativeLayout2);
                return relativeLayout2;
            case 2:
                Context it = (Context) obj;
                kotlin.jvm.internal.m.e(it, "it");
                X1 x12 = this.f7848r.f7057Q;
                kotlin.jvm.internal.m.b(x12);
                return x12;
            case 3:
                C0468k1 c0468k13 = this.f7848r;
                C0458i c0458i2 = c0468k13.f7073d;
                if ((c0458i2 != null ? kotlin.jvm.internal.m.a(c0458i2.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
                    P1.Z(c0468k13.f7067a, "#ffffff", "#000000", true);
                } else {
                    P1.Y("#000000", "#ffffff", c0468k13.f7069b, 8);
                }
                return C1386y.f15098a;
            case 4:
                if (((Integer) obj).intValue() >= 70) {
                    C0468k1 c0468k14 = this.f7848r;
                    T1.u uVar = c0468k14.f7075e;
                    if (kotlin.jvm.internal.m.a((uVar == null || (pVarF = uVar.f7418b.f()) == null) ? null : (String) pVarF.f7404r.f8095e, "splashScreen") && AbstractC0534a.f7792e) {
                        AbstractC0534a.f7792e = false;
                        AbstractC0534a.C(c0468k14);
                        C1190b c1190b = c0468k14.f7086l;
                        if (c1190b != null && (j = c1190b.f14129c) != null) {
                            MainActivity mainActivity = c0468k14.f7069b;
                            androidx.lifecycle.G.a("removeObservers");
                            Iterator it2 = j.f9486b.iterator();
                            while (true) {
                                C1406b c1406b = (C1406b) it2;
                                if (c1406b.hasNext()) {
                                    Map.Entry entry = (Map.Entry) c1406b.next();
                                    if (((androidx.lifecycle.F) entry.getValue()).h(mainActivity)) {
                                        j.j((androidx.lifecycle.K) entry.getKey());
                                    }
                                }
                            }
                        }
                    }
                }
                return C1386y.f15098a;
            case 5:
                final Context context2 = (Context) obj;
                kotlin.jvm.internal.m.e(context2, "context");
                final C0468k1 c0468k15 = this.f7848r;
                if (c0468k15.f7101w == null) {
                    b4.e eVar = new b4.e(context2);
                    G0 g0H = l4.m.h(eVar.getContext(), null, V3.a.f7976b, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
                    TypedArray typedArray = (TypedArray) g0H.f235s;
                    eVar.setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
                    if (typedArray.hasValue(0)) {
                        eVar.setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
                    }
                    typedArray.getBoolean(1, true);
                    g0H.R();
                    l4.m.d(eVar, new O3.B(18));
                    eVar.setId(1026);
                    eVar.setBackgroundColor(Color.parseColor("#ffffff"));
                    eVar.setVisibility(8);
                    eVar.setElevation(0.0f);
                    eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    eVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: W4.a
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view, int i, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                            m.b(view);
                            int visibility = view.getVisibility();
                            C0468k1 c0468k16 = c0468k15;
                            if (visibility != 0) {
                                C1167d c1167d = c0468k16.f7098t;
                                c1167d.f13883q.f(0);
                                c1167d.c();
                                return;
                            }
                            V v6 = c0468k16.f7058R;
                            C1167d c1167d2 = c0468k16.f7098t;
                            if (v6 == null) {
                                c1167d2.f13883q.f(0);
                                c1167d2.c();
                                return;
                            }
                            int height = (int) (view.getHeight() / context2.getResources().getDisplayMetrics().density);
                            S s6 = c1167d2.f13888v;
                            Integer numValueOf = Integer.valueOf(height);
                            s6.getClass();
                            s6.h(null, numValueOf);
                        }
                    });
                    c0468k15.f7101w = eVar;
                }
                b4.e eVar2 = c0468k15.f7101w;
                kotlin.jvm.internal.m.b(eVar2);
                return eVar2;
            case 6:
                C0468k1 c0468k16 = this.f7848r;
                C0458i c0458i3 = c0468k16.f7073d;
                if ((c0458i3 != null ? kotlin.jvm.internal.m.a(c0458i3.f6980E, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 30) {
                    P1.Z(c0468k16.f7067a, "#ffffff", "#000000", true);
                } else {
                    P1.Y("#000000", "#ffffff", c0468k16.f7069b, 8);
                }
                return C1386y.f15098a;
            case 7:
                String str = (String) obj;
                C0468k1 c0468k17 = this.f7848r;
                if (c0468k17.f7053M.b()) {
                    WebView webView = c0468k17.f7084k;
                    if (str != null) {
                        if (!str.equals(webView != null ? webView.getUrl() : null) && webView != null) {
                            webView.loadUrl(str);
                        }
                    }
                    if (!AbstractC1918b.g(c0468k17)) {
                        T1.u uVar2 = c0468k17.f7075e;
                        if (uVar2 != null) {
                            T1.u.b(uVar2, "mainScreen");
                        }
                    } else if (c0468k17.f7054N == null) {
                        kotlin.jvm.internal.m.k("inAppPurchaseUtil");
                        throw null;
                    }
                }
                return C1386y.f15098a;
            default:
                C0279e0 c0279e0 = this.f7848r.f7053M;
                if (c0279e0.b() && !c0279e0.f4841b) {
                    c0279e0.c();
                }
                return C1386y.f15098a;
        }
    }
}
