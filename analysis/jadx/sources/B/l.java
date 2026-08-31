package b;

import J1.C0187t;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.InterfaceC0648k;
import androidx.lifecycle.InterfaceC0658v;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.X;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import b.j;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.wnapp.smspariaz.R;
import d.InterfaceC0949a;
import e.C1012e;
import e.C1014g;
import e.InterfaceC1009b;
import h.AbstractActivityC1106h;
import i2.C1135a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import m5.AbstractC1362a;
import m5.C1376o;
import v1.InterfaceC1752a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends k1.e implements l0, InterfaceC0648k, g2.e, B {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f9882J = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final CopyOnWriteArrayList f9883A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final CopyOnWriteArrayList f9884B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final CopyOnWriteArrayList f9885C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final CopyOnWriteArrayList f9886D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final CopyOnWriteArrayList f9887E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f9888F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9889G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1376o f9890H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C1376o f9891I;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.android.gms.common.i f9892r = new com.google.android.gms.common.i();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t2.e f9893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Z.m f9894t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public k0 f9895u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f9896v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1376o f9897w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicInteger f9898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f9899y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CopyOnWriteArrayList f9900z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l() {
        final AbstractActivityC1106h abstractActivityC1106h = (AbstractActivityC1106h) this;
        this.f9893s = new t2.e(new RunnableC0686c(abstractActivityC1106h, 0));
        C1135a c1135a = new C1135a(this, new I2.d(16, this));
        Z.m mVar = new Z.m(c1135a, 13);
        this.f9894t = mVar;
        this.f9896v = new h(abstractActivityC1106h);
        this.f9897w = AbstractC1362a.d(new k(abstractActivityC1106h, 2));
        this.f9898x = new AtomicInteger();
        this.f9899y = new j(abstractActivityC1106h);
        this.f9900z = new CopyOnWriteArrayList();
        this.f9883A = new CopyOnWriteArrayList();
        this.f9884B = new CopyOnWriteArrayList();
        this.f9885C = new CopyOnWriteArrayList();
        this.f9886D = new CopyOnWriteArrayList();
        this.f9887E = new CopyOnWriteArrayList();
        C0662z c0662z = this.f14061q;
        if (c0662z == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i = 0;
        c0662z.a(new InterfaceC0658v() { // from class: b.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0658v
            public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        AbstractActivityC1106h abstractActivityC1106h2 = abstractActivityC1106h;
                        if (enumC0652o == EnumC0652o.ON_STOP && (window = abstractActivityC1106h2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC1106h abstractActivityC1106h3 = abstractActivityC1106h;
                        if (enumC0652o == EnumC0652o.ON_DESTROY) {
                            abstractActivityC1106h3.f9892r.f10346b = null;
                            if (!abstractActivityC1106h3.isChangingConfigurations()) {
                                abstractActivityC1106h3.f().a();
                            }
                            h hVar = abstractActivityC1106h3.f9896v;
                            AbstractActivityC1106h abstractActivityC1106h4 = hVar.f9868t;
                            abstractActivityC1106h4.getWindow().getDecorView().removeCallbacks(hVar);
                            abstractActivityC1106h4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                        }
                        break;
                }
            }
        });
        final int i7 = 1;
        this.f14061q.a(new InterfaceC0658v() { // from class: b.d
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0658v
            public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
                Window window;
                View viewPeekDecorView;
                switch (i7) {
                    case 0:
                        AbstractActivityC1106h abstractActivityC1106h2 = abstractActivityC1106h;
                        if (enumC0652o == EnumC0652o.ON_STOP && (window = abstractActivityC1106h2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC1106h abstractActivityC1106h3 = abstractActivityC1106h;
                        if (enumC0652o == EnumC0652o.ON_DESTROY) {
                            abstractActivityC1106h3.f9892r.f10346b = null;
                            if (!abstractActivityC1106h3.isChangingConfigurations()) {
                                abstractActivityC1106h3.f().a();
                            }
                            h hVar = abstractActivityC1106h3.f9896v;
                            AbstractActivityC1106h abstractActivityC1106h4 = hVar.f9868t;
                            abstractActivityC1106h4.getWindow().getDecorView().removeCallbacks(hVar);
                            abstractActivityC1106h4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                        }
                        break;
                }
            }
        });
        this.f14061q.a(new g2.b(abstractActivityC1106h, 2));
        c1135a.a();
        X.c(this);
        ((Z.m) mVar.f8313s).C("android:support:activity-result", new J1.r(abstractActivityC1106h, 1));
        i(new C0187t(abstractActivityC1106h, 1));
        this.f9890H = AbstractC1362a.d(new k(abstractActivityC1106h, 0));
        this.f9891I = AbstractC1362a.d(new k(abstractActivityC1106h, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.B
    public final C0683A a() {
        return (C0683A) this.f9891I.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.e
    public final Z.m b() {
        return (Z.m) this.f9894t.f8313s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0648k
    public final h0 d() {
        return (h0) this.f9890H.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0648k
    public final P1.e e() {
        P1.e eVar = new P1.e(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = eVar.f5610a;
        if (application != null) {
            Application application2 = getApplication();
            kotlin.jvm.internal.m.d(application2, "application");
            linkedHashMap.put(g0.f9546d, application2);
        }
        linkedHashMap.put(X.f9512a, this);
        linkedHashMap.put(X.f9513b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(X.f9514c, extras);
        }
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.l0
    public final k0 f() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f9895u == null) {
            g gVar = (g) getLastNonConfigurationInstance();
            if (gVar != null) {
                this.f9895u = gVar.f9864a;
            }
            if (this.f9895u == null) {
                this.f9895u = new k0();
            }
        }
        k0 k0Var = this.f9895u;
        kotlin.jvm.internal.m.b(k0Var);
        return k0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0660x
    public final AbstractC0654q getLifecycle() {
        return this.f14061q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(InterfaceC1752a listener) {
        kotlin.jvm.internal.m.e(listener, "listener");
        this.f9900z.add(listener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(InterfaceC0949a interfaceC0949a) {
        com.google.android.gms.common.i iVar = this.f9892r;
        iVar.getClass();
        l lVar = (l) iVar.f10346b;
        if (lVar != null) {
            interfaceC0949a.a(lVar);
        }
        ((CopyOnWriteArraySet) iVar.f10345a).add(interfaceC0949a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        X.h(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView2, "window.decorView");
        X.i(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView3, "window.decorView");
        AbstractC0836n2.M(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1014g k(final I1 i12, final InterfaceC1009b interfaceC1009b) {
        final j registry = this.f9899y;
        kotlin.jvm.internal.m.e(registry, "registry");
        final String key = "activity_rq#" + this.f9898x.getAndIncrement();
        LinkedHashMap linkedHashMap = registry.f9875c;
        kotlin.jvm.internal.m.e(key, "key");
        C0662z c0662z = this.f14061q;
        if (c0662z.f9572d.compareTo(EnumC0653p.f9559t) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0662z.f9572d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        registry.d(key);
        C1012e c1012e = (C1012e) linkedHashMap.get(key);
        if (c1012e == null) {
            c1012e = new C1012e(c0662z);
        }
        InterfaceC0658v interfaceC0658v = new InterfaceC0658v() { // from class: e.c
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.lifecycle.InterfaceC0658v
            public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
                EnumC0652o enumC0652o2 = EnumC0652o.ON_START;
                j jVar = registry;
                String str = key;
                if (enumC0652o2 != enumC0652o) {
                    if (EnumC0652o.ON_STOP == enumC0652o) {
                        jVar.f9877e.remove(str);
                        return;
                    } else {
                        if (EnumC0652o.ON_DESTROY == enumC0652o) {
                            jVar.e(str);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = jVar.f9877e;
                Bundle bundle = jVar.f9878g;
                LinkedHashMap linkedHashMap3 = jVar.f;
                I1 i13 = i12;
                InterfaceC1009b interfaceC1009b2 = interfaceC1009b;
                linkedHashMap2.put(str, new C1011d(i13, interfaceC1009b2));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    interfaceC1009b2.d(obj);
                }
                C1008a c1008a = (C1008a) K1.r(str, bundle);
                if (c1008a != null) {
                    bundle.remove(str);
                    interfaceC1009b2.d(i13.A0(c1008a.f12455r, c1008a.f12454q));
                }
            }
        };
        c1012e.f12462a.a(interfaceC0658v);
        c1012e.f12463b.add(interfaceC0658v);
        linkedHashMap.put(key, c1012e);
        return new C1014g(registry, key, i12, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onActivityResult(int i, int i7, Intent intent) {
        if (this.f9899y.a(i, i7, intent)) {
            return;
        }
        super.onActivityResult(i, i7, intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator it = this.f9900z.iterator();
        while (it.hasNext()) {
            ((InterfaceC1752a) it.next()).accept(newConfig);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k1.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f9894t.z(bundle);
        com.google.android.gms.common.i iVar = this.f9892r;
        iVar.getClass();
        iVar.f10346b = this;
        Iterator it = ((CopyOnWriteArraySet) iVar.f10345a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0949a) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = T.f9505r;
        P.b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f9893s.f16685r).iterator();
        while (it.hasNext()) {
            ((J1.A) it.next()).f2503a.j();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem item) {
        kotlin.jvm.internal.m.e(item, "item");
        if (super.onMenuItemSelected(i, item)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f9893s.f16685r).iterator();
            while (it.hasNext()) {
                if (((J1.A) it.next()).f2503a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5) {
        if (this.f9888F) {
            return;
        }
        Iterator it = this.f9885C.iterator();
        while (it.hasNext()) {
            ((InterfaceC1752a) it.next()).accept(new k1.f(z5));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f9884B.iterator();
        while (it.hasNext()) {
            ((InterfaceC1752a) it.next()).accept(intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f9893s.f16685r).iterator();
        while (it.hasNext()) {
            ((J1.A) it.next()).f2503a.p();
        }
        super.onPanelClosed(i, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5) {
        if (this.f9889G) {
            return;
        }
        Iterator it = this.f9886D.iterator();
        while (it.hasNext()) {
            ((InterfaceC1752a) it.next()).accept(new k1.n(z5));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f9893s.f16685r).iterator();
        while (it.hasNext()) {
            ((J1.A) it.next()).f2503a.s();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.m.e(permissions, "permissions");
        kotlin.jvm.internal.m.e(grantResults, "grantResults");
        if (this.f9899y.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i, permissions, grantResults);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        g gVar;
        k0 k0Var = this.f9895u;
        if (k0Var == null && (gVar = (g) getLastNonConfigurationInstance()) != null) {
            k0Var = gVar.f9864a;
        }
        if (k0Var == null) {
            return null;
        }
        g gVar2 = new g();
        gVar2.f9864a = k0Var;
        return gVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k1.e, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.e(outState, "outState");
        C0662z c0662z = this.f14061q;
        if (c0662z != null) {
            c0662z.h(EnumC0653p.f9558s);
        }
        super.onSaveInstanceState(outState);
        this.f9894t.A(outState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f9883A.iterator();
        while (it.hasNext()) {
            ((InterfaceC1752a) it.next()).accept(Integer.valueOf(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f9887E.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (E3.h.E()) {
                Trace.beginSection(E3.h.O("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            t tVar = (t) this.f9897w.getValue();
            synchronized (tVar.f9906b) {
                try {
                    tVar.f9907c = true;
                    ArrayList arrayList = tVar.f9908d;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((B5.a) obj).invoke();
                    }
                    tVar.f9908d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "window.decorView");
        h hVar = this.f9896v;
        hVar.getClass();
        if (!hVar.f9867s) {
            hVar.f9867s = true;
            decorView.getViewTreeObserver().addOnDrawListener(hVar);
        }
        super.setContentView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startActivityForResult(intent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i7, int i8, int i9) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startActivityForResult(intent, i, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intent, int i, Intent intent2, int i7, int i8, int i9, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startIntentSenderForResult(intent, i, intent2, i7, i8, i9, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5, Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        this.f9888F = true;
        try {
            super.onMultiWindowModeChanged(z5, newConfig);
            this.f9888F = false;
            Iterator it = this.f9885C.iterator();
            while (it.hasNext()) {
                ((InterfaceC1752a) it.next()).accept(new k1.f(z5));
            }
        } catch (Throwable th) {
            this.f9888F = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5, Configuration newConfig) {
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        this.f9889G = true;
        try {
            super.onPictureInPictureModeChanged(z5, newConfig);
            this.f9889G = false;
            Iterator it = this.f9886D.iterator();
            while (it.hasNext()) {
                ((InterfaceC1752a) it.next()).accept(new k1.n(z5));
            }
        } catch (Throwable th) {
            this.f9889G = false;
            throw th;
        }
    }
}
