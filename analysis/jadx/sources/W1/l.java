package W1;

import B0.G0;
import C0.ViewTreeObserverOnGlobalLayoutListenerC0083j;
import P5.H;
import R4.C0468k1;
import R4.N;
import T1.n;
import T1.o;
import T1.p;
import W1.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.J;
import com.web2native.MainActivity;
import g.AbstractC1066a;
import j5.C1166c;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import m.AbstractC1313j0;
import m.C1328r;
import m5.C1376o;
import m5.C1386y;
import n5.s;
import w1.AbstractC1826B;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f8094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8095e;
    public Object f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(C0468k1 c0468k1) {
        J j;
        J j7;
        MainActivity mainActivity = c0468k1.f7069b;
        this.f8092b = c0468k1;
        View decorView = c0468k1.f7067a.getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
        this.f8093c = decorView;
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        kotlin.jvm.internal.m.d(viewTreeObserver, "getViewTreeObserver(...)");
        this.f8094d = viewTreeObserver;
        ViewTreeObserverOnGlobalLayoutListenerC0083j viewTreeObserverOnGlobalLayoutListenerC0083j = new ViewTreeObserverOnGlobalLayoutListenerC0083j(1, this);
        this.f8095e = viewTreeObserverOnGlobalLayoutListenerC0083j;
        this.f = H.b(Boolean.FALSE);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0083j);
        C1166c c1166c = c0468k1.f7097s;
        if (c1166c != null && (j7 = c1166c.f13865h) != null) {
            final int i = 0;
            j7.e(mainActivity, new N(new B5.c(this) { // from class: g5.d

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ l f13142r;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f13142r = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B5.c
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            l lVar = this.f13142r;
                            ((ViewTreeObserver) lVar.f8094d).addOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC0083j) lVar.f8095e);
                            break;
                        default:
                            l lVar2 = this.f13142r;
                            ((ViewTreeObserver) lVar2.f8094d).removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC0083j) lVar2.f8095e);
                            break;
                    }
                    return C1386y.f15098a;
                }
            }, 10));
        }
        C1166c c1166c2 = c0468k1.f7097s;
        if (c1166c2 == null || (j = c1166c2.i) == null) {
            return;
        }
        final int i7 = 1;
        j.e(mainActivity, new N(new B5.c(this) { // from class: g5.d

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ l f13142r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13142r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B5.c
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        l lVar = this.f13142r;
                        ((ViewTreeObserver) lVar.f8094d).addOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC0083j) lVar.f8095e);
                        break;
                    default:
                        l lVar2 = this.f13142r;
                        ((ViewTreeObserver) lVar2.f8094d).removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC0083j) lVar2.f8095e);
                        break;
                }
                return C1386y.f15098a;
            }
        }, 10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        View view = (View) this.f8092b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((d6.h) this.f8094d) != null) {
                if (((d6.h) this.f) == null) {
                    this.f = new d6.h();
                }
                d6.h hVar = (d6.h) this.f;
                hVar.f12339c = null;
                hVar.f12338b = false;
                hVar.f12340d = null;
                hVar.f12337a = false;
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                ColorStateList colorStateListC = AbstractC1826B.c(view);
                if (colorStateListC != null) {
                    hVar.f12338b = true;
                    hVar.f12339c = colorStateListC;
                }
                PorterDuff.Mode modeD = AbstractC1826B.d(view);
                if (modeD != null) {
                    hVar.f12337a = true;
                    hVar.f12340d = modeD;
                }
                if (hVar.f12338b || hVar.f12337a) {
                    C1328r.e(background, hVar, view.getDrawableState());
                    return;
                }
            }
            d6.h hVar2 = (d6.h) this.f8095e;
            if (hVar2 != null) {
                C1328r.e(background, hVar2, view.getDrawableState());
                return;
            }
            d6.h hVar3 = (d6.h) this.f8094d;
            if (hVar3 != null) {
                C1328r.e(background, hVar3, view.getDrawableState());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ColorStateList b() {
        d6.h hVar = (d6.h) this.f8095e;
        if (hVar != null) {
            return (ColorStateList) hVar.f12339c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PorterDuff.Mode c() {
        d6.h hVar = (d6.h) this.f8095e;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f12340d;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean d() {
        return this.f8091a < ((List) this.f8095e).size() || !((ArrayList) this.f8093c).isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListF;
        View view = (View) this.f8092b;
        Context context = view.getContext();
        int[] iArr = AbstractC1066a.f12807y;
        G0 g0N = G0.N(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) g0N.f235s;
        View view2 = (View) this.f8092b;
        AbstractC1835K.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) g0N.f235s, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f8091a = typedArray.getResourceId(0, -1);
                C1328r c1328r = (C1328r) this.f8093c;
                Context context2 = view.getContext();
                int i7 = this.f8091a;
                synchronized (c1328r) {
                    colorStateListF = c1328r.f14863a.f(context2, i7);
                }
                if (colorStateListF != null) {
                    i(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC1826B.i(view, g0N.w(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC1826B.j(view, AbstractC1313j0.b(typedArray.getInt(2, -1), null));
            }
            g0N.R();
        } catch (Throwable th) {
            g0N.R();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o f(String route) {
        n nVar;
        kotlin.jvm.internal.m.e(route, "route");
        C1376o c1376o = (C1376o) this.f;
        if (c1376o == null || (nVar = (n) c1376o.getValue()) == null) {
            return null;
        }
        int i = p.f7402u;
        String uriString = "android-app://androidx.navigation/".concat(route);
        kotlin.jvm.internal.m.e(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        kotlin.jvm.internal.m.d(uri, "parse(...)");
        Bundle bundleD = nVar.d(uri, (LinkedHashMap) this.f8094d);
        if (bundleD == null) {
            return null;
        }
        return new o((p) this.f8092b, bundleD, nVar.f7396l, nVar.b(uri), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g() {
        this.f8091a = -1;
        i(null);
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h(int i) {
        ColorStateList colorStateListF;
        this.f8091a = i;
        C1328r c1328r = (C1328r) this.f8093c;
        if (c1328r != null) {
            Context context = ((View) this.f8092b).getContext();
            synchronized (c1328r) {
                colorStateListF = c1328r.f14863a.f(context, i);
            }
        } else {
            colorStateListF = null;
        }
        i(colorStateListF);
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((d6.h) this.f8094d) == null) {
                this.f8094d = new d6.h();
            }
            d6.h hVar = (d6.h) this.f8094d;
            hVar.f12339c = colorStateList;
            hVar.f12338b = true;
        } else {
            this.f8094d = null;
        }
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(ColorStateList colorStateList) {
        if (((d6.h) this.f8095e) == null) {
            this.f8095e = new d6.h();
        }
        d6.h hVar = (d6.h) this.f8095e;
        hVar.f12339c = colorStateList;
        hVar.f12338b = true;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(PorterDuff.Mode mode) {
        if (((d6.h) this.f8095e) == null) {
            this.f8095e = new d6.h();
        }
        d6.h hVar = (d6.h) this.f8095e;
        hVar.f12340d = mode;
        hVar.f12337a = true;
        a();
    }

    public l(p pVar) {
        this.f8092b = pVar;
        this.f8093c = new ArrayList();
        this.f8094d = new LinkedHashMap();
    }

    public l(d6.a aVar, k3.d routeDatabase, h6.h hVar) {
        List listI;
        kotlin.jvm.internal.m.e(routeDatabase, "routeDatabase");
        this.f8092b = aVar;
        this.f8094d = routeDatabase;
        s sVar = s.f15299q;
        this.f8095e = sVar;
        this.f = sVar;
        this.f8093c = new ArrayList();
        d6.n url = aVar.f12301h;
        kotlin.jvm.internal.m.e(url, "url");
        URI uriG = url.g();
        if (uriG.getHost() == null) {
            listI = e6.b.i(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = aVar.f12300g.select(uriG);
            List<Proxy> list = proxiesOrNull;
            if (list != null && !list.isEmpty()) {
                kotlin.jvm.internal.m.d(proxiesOrNull, "proxiesOrNull");
                listI = e6.b.t(proxiesOrNull);
            } else {
                listI = e6.b.i(Proxy.NO_PROXY);
            }
        }
        this.f8095e = listI;
        this.f8091a = 0;
    }

    public l(View view) {
        this.f8091a = -1;
        this.f8092b = view;
        this.f8093c = C1328r.a();
    }
}
