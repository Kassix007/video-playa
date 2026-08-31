package i1;

import B0.G0;
import J1.A;
import O3.B0;
import R4.C0468k1;
import android.R;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabaseVersions;
import i3.C1136a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.m;
import l.C1202e;
import l.C1211n;
import l.InterfaceC1207j;
import l.MenuC1209l;
import l.SubMenuC1197D;
import l.ViewOnKeyListenerC1203f;
import l.w;
import l4.n;
import m.C1312j;
import m.InterfaceC1250D0;
import m.InterfaceC1286W;
import n4.i;
import r5.EnumC1580a;
import u.AbstractC1644d;
import u.AbstractC1663q;
import u.C1623B;
import u.C1667v;
import u.InterfaceC1622A;
import u.r;
import u2.C1684e;
import u2.C1693n;
import v3.l;
import w.InterfaceC1788i0;
import w1.AbstractC1835K;
import w1.C1843f;
import w1.InterfaceC1840c;
import w1.InterfaceC1850m;
import w1.l0;
import w1.o0;
import w1.p0;
import w1.q0;
import w1.r0;
import w1.s0;
import x.AbstractC1880l;
import x.C1869a;
import x.C1875g;
import x.InterfaceC1870b;
import x3.InterfaceC1890b;
import y4.C1920d;
import z4.C1968b;
import z4.InterfaceC1969c;

/* JADX INFO: renamed from: i1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1134a implements InterfaceC1850m, InterfaceC1250D0, w, InterfaceC1286W, InterfaceC1207j, r, F2.b, InterfaceC1840c, InterfaceC1870b, InterfaceC1890b, InterfaceC1969c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f13535r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1134a(int i, Object obj) {
        this.f13534q = i;
        this.f13535r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A(float f, float f7) {
        ((G0) this.f13535r).t().h(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public void b(MenuC1209l menuC1209l, boolean z5) {
        if (menuC1209l instanceof SubMenuC1197D) {
            ((SubMenuC1197D) menuC1209l).f14291z.k().c(false);
        }
        w wVar = ((C1312j) this.f13535r).f14814u;
        if (wVar != null) {
            wVar.b(menuC1209l, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1840c
    public C1843f build() {
        return new C1843f(new C1136a(((ContentInfo.Builder) this.f13535r).build()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1850m
    public o0 c(View view, o0 o0Var) {
        l0 l0Var = o0Var.f18232a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f13535r;
        if (!Objects.equals(coordinatorLayout.f9405D, o0Var)) {
            coordinatorLayout.f9405D = o0Var;
            boolean z5 = o0Var.d() > 0;
            coordinatorLayout.f9406E = z5;
            coordinatorLayout.setWillNotDraw(!z5 && coordinatorLayout.getBackground() == null);
            if (!l0Var.o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    if (childAt.getFitsSystemWindows() && ((e) childAt.getLayoutParams()).f13538a != null && l0Var.o()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F2.b
    public void d(Drawable drawable) {
        C1693n c1693n = (C1693n) this.f13535r;
        c1693n.k(new C1684e(drawable != null ? c1693n.j(drawable) : null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public boolean e(MenuC1209l menuC1209l, MenuItem item) {
        WebView webView;
        switch (this.f13534q) {
            case 5:
                ((Toolbar) this.f13535r).getClass();
                break;
            default:
                i iVar = ((b4.e) this.f13535r).f15286u;
                if (iVar != null) {
                    W4.b bVar = (W4.b) iVar;
                    b4.e eVar = bVar.f8121a;
                    ColorStateList colorStateList = bVar.f8122b;
                    ColorStateList colorStateList2 = bVar.f8123c;
                    ArrayList arrayList = bVar.f8124d;
                    C0468k1 c0468k1 = bVar.f8125e;
                    kotlin.jvm.internal.w wVar = bVar.f;
                    m.e(item, "item");
                    int itemId = item.getItemId();
                    eVar.setItemTextColor(colorStateList);
                    eVar.setItemIconTintList(colorStateList2);
                    int i = itemId - 1;
                    Object obj = arrayList.get(i);
                    m.d(obj, "get(...)");
                    if (C3.a.C(c0468k1, (String) obj) && c0468k1.f7053M.b() && (webView = c0468k1.f7084k) != null) {
                        webView.loadUrl((String) arrayList.get(i));
                    }
                    if (wVar.f14266q == itemId) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.InterfaceC1890b
    public void f() {
        ((u3.e) this.f13535r).onConnected(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public boolean g(MenuC1209l menuC1209l) {
        C1312j c1312j = (C1312j) this.f13535r;
        if (menuC1209l == c1312j.f14812s) {
            return false;
        }
        c1312j.f14809O = ((SubMenuC1197D) menuC1209l).f14290A.f14378a;
        w wVar = c1312j.f14814u;
        if (wVar != null) {
            return wVar.g(menuC1209l);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.r
    public InterfaceC1622A get(int i) {
        switch (this.f13534q) {
            case 8:
                return ((C1623B[]) this.f13535r)[i];
            default:
                return (InterfaceC1622A) this.f13535r;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.InterfaceC1207j
    public void i(MenuC1209l menuC1209l) {
        switch (this.f13534q) {
            case 5:
                Toolbar toolbar = (Toolbar) this.f13535r;
                C1312j c1312j = toolbar.f9205q.f9150J;
                if (c1312j == null || !c1312j.e()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f9194W.f16685r).iterator();
                    while (it.hasNext()) {
                        ((A) it.next()).f2503a.s();
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1840c
    public void k(Uri uri) {
        ((ContentInfo.Builder) this.f13535r).setLinkUri(uri);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1250D0
    public void l(MenuC1209l menuC1209l, C1211n c1211n) {
        ViewOnKeyListenerC1203f viewOnKeyListenerC1203f = (ViewOnKeyListenerC1203f) this.f13535r;
        Handler handler = viewOnKeyListenerC1203f.f14332v;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1203f.f14334x;
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
        if (i == -1) {
            return;
        }
        int i7 = i + 1;
        handler.postAtTime(new B0(this, i7 < arrayList.size() ? (C1202e) arrayList.get(i7) : null, c1211n, menuC1209l, 9, false), menuC1209l, SystemClock.uptimeMillis() + 200);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1250D0
    public void n(MenuC1209l menuC1209l, MenuItem menuItem) {
        ((ViewOnKeyListenerC1203f) this.f13535r).f14332v.removeCallbacksAndMessages(menuC1209l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.InterfaceC1890b
    public void onConnectionSuspended(int i) {
        ((u3.e) this.f13535r).onConnectionSuspended(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1840c
    public void p(int i) {
        ((ContentInfo.Builder) this.f13535r).setFlags(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x.InterfaceC1870b
    public Object q(InterfaceC1788i0 interfaceC1788i0, Float f, Float f7, B5.c cVar, C1875g c1875g) {
        Object objA = AbstractC1880l.a(interfaceC1788i0, f.floatValue(), AbstractC1644d.a(0.0f, f7.floatValue(), 28), (C1667v) this.f13535r, cVar, c1875g);
        return objA == EnumC1580a.f16356q ? objA : (C1869a) objA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x1.e s(int i) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1840c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f13535r).setExtras(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x1.e t(int i) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u() {
        View view = (View) this.f13535r;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v(float f, float f7, float f8, float f9) {
        G0 g02 = (G0) this.f13535r;
        j0.m mVarT = g02.t();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (g02.E() >> 32)) - (f8 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (g02.E() & 4294967295L)) - (f9 + f7))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            j0.w.a("Width and height must be greater than or equal to zero");
        }
        g02.X(jFloatToRawIntBits);
        mVarT.h(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean x(int i, int i7, Bundle bundle) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(float f, float f7, long j) {
        j0.m mVarT = ((G0) this.f13535r).t();
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        mVarT.h(Float.intBitsToFloat(i), Float.intBitsToFloat(i7));
        mVarT.c(f, f7);
        mVarT.h(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void z() {
        View viewFindViewById;
        View view = (View) this.f13535r;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new n(viewFindViewById, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.InterfaceC1969c
    public Object zza() {
        return ((C3.b) this.f13535r).f1185a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1134a(C3.b bVar) {
        this.f13534q = 21;
        C1134a c1134a = new C1134a(20, bVar);
        this.f13535r = C1968b.a(new C1136a(20, C1968b.a(new t2.e(C1968b.a(new l(7, c1134a, C1968b.a(new C1920d(c1134a, 1)))), C1968b.a(new C1920d(c1134a, 0)), c1134a))));
    }

    public C1134a(int i) {
        this.f13534q = i;
        switch (i) {
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f13535r = new x1.g(this);
                } else {
                    this.f13535r = new x1.f(this);
                }
                break;
        }
    }

    public C1134a(Window window, View view) {
        this.f13534q = 15;
        C1136a c1136a = new C1136a(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f13535r = new s0(window, c1136a);
            return;
        }
        if (i >= 30) {
            this.f13535r = new r0(window, c1136a);
        } else if (i >= 26) {
            this.f13535r = new q0(window, c1136a);
        } else {
            this.f13535r = new p0(window, c1136a);
        }
    }

    public C1134a(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f13534q = 19;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f13535r = new y1.e(uri, clipDescription, uri2);
        } else {
            this.f13535r = new t2.e(uri, clipDescription, uri2);
        }
    }

    public C1134a(ClipData clipData, int i) {
        this.f13534q = 13;
        this.f13535r = c4.a.f(clipData, i);
    }

    public C1134a(float f, AbstractC1663q abstractC1663q) {
        this.f13534q = 8;
        int iB = abstractC1663q.b();
        C1623B[] c1623bArr = new C1623B[iB];
        for (int i = 0; i < iB; i++) {
            c1623bArr[i] = new C1623B(f, abstractC1663q.a(i));
        }
        this.f13535r = c1623bArr;
    }

    private final void w(MenuC1209l menuC1209l) {
    }

    @Override // m.InterfaceC1286W
    public void a(int i) {
    }

    @Override // m.InterfaceC1286W
    public void h(int i) {
    }

    @Override // F2.b
    public void j(Drawable drawable) {
    }

    @Override // F2.b
    public void o(Drawable drawable) {
    }

    @Override // m.InterfaceC1286W
    public void m(int i, float f) {
    }

    public void r(int i, x1.e eVar, String str, Bundle bundle) {
    }
}
