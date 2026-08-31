package androidx.compose.ui.platform;

import A.Y;
import B0.C0029a;
import B0.j0;
import B5.c;
import B5.e;
import C0.A;
import C0.AbstractC0103t0;
import C0.C0082i0;
import C0.C0091n;
import C0.C0095p;
import C0.C0105u0;
import C0.C0109w0;
import C0.C0111x0;
import C0.C0113y0;
import C0.ComponentCallbacks2C0066a0;
import C0.ComponentCallbacks2C0068b0;
import C0.X;
import C0.Z;
import G0.d;
import N1.a;
import P.AbstractC0366l0;
import P.C0345b;
import P.C0363k;
import P.C0368m0;
import P.C0371o;
import P.C0372o0;
import P.C0389z;
import P.T0;
import P.W;
import Z.i;
import Z.j;
import Z.k;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import m5.C1386y;
import r0.InterfaceC1571a;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0389z f9340a = new C0389z(X.f963r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T0 f9341b = new T0(X.f964s);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T0 f9342c = new T0(X.f965t);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T0 f9343d = new T0(X.f966u);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final T0 f9344e = new T0(X.f967v);
    public static final T0 f = new T0(X.f968w);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(A a7, e eVar, C0371o c0371o, int i) {
        W w3;
        LinkedHashMap linkedHashMap;
        boolean z5;
        c0371o.U(1396852028);
        int i7 = 4;
        int i8 = (c0371o.i(a7) ? 4 : 2) | i | (c0371o.i(eVar) ? 32 : 16);
        if (c0371o.K(i8 & 1, (i8 & 19) != 18)) {
            Context context = a7.getContext();
            Object objH = c0371o.H();
            Object obj = C0363k.f5418a;
            if (objH == obj) {
                objH = C0345b.q(new Configuration(context.getResources().getConfiguration()));
                c0371o.d0(objH);
            }
            W w6 = (W) objH;
            Object objH2 = c0371o.H();
            if (objH2 == obj) {
                objH2 = new C0029a(i7, w6);
                c0371o.d0(objH2);
            }
            a7.setConfigurationChangeObserver((c) objH2);
            Object objH3 = c0371o.H();
            if (objH3 == obj) {
                objH3 = new C0082i0();
                c0371o.d0(objH3);
            }
            C0082i0 c0082i0 = (C0082i0) objH3;
            C0091n viewTreeOwners = a7.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            g2.e eVar2 = viewTreeOwners.f1066b;
            Object objH4 = c0371o.H();
            if (objH4 == obj) {
                Object parent = a7.getParent();
                m.c(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = i.class.getSimpleName() + ':' + strValueOf;
                Z.m mVarB = eVar2.b();
                Bundle bundleH = mVarB.h(str);
                if (bundleH != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleH.keySet()) {
                        ArrayList parcelableArrayList = bundleH.getParcelableArrayList(str2);
                        m.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str2, parcelableArrayList);
                        w6 = w6;
                    }
                } else {
                    linkedHashMap = null;
                }
                w3 = w6;
                C0095p c0095p = C0095p.f1086u;
                T0 t02 = k.f8310a;
                j jVar = new j(linkedHashMap, c0095p);
                try {
                    mVarB.C(str, new C0111x0(0, jVar));
                    z5 = true;
                } catch (IllegalArgumentException unused) {
                    z5 = false;
                }
                Object c0109w0 = new C0109w0(jVar, new C0113y0(z5, mVarB, str));
                c0371o.d0(c0109w0);
                objH4 = c0109w0;
            } else {
                w3 = w6;
            }
            Object obj2 = (C0109w0) objH4;
            boolean zI = c0371o.i(obj2);
            Object objH5 = c0371o.H();
            if (zI || objH5 == obj) {
                objH5 = new C0029a(5, obj2);
                c0371o.d0(objH5);
            }
            C0345b.c(C1386y.f15098a, (c) objH5, c0371o);
            Object objH6 = c0371o.H();
            if (objH6 == obj) {
                if (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) {
                    objH6 = new C0105u0();
                } else {
                    a7.getView();
                    objH6 = new C0105u0();
                }
                c0371o.d0(objH6);
            }
            InterfaceC1571a interfaceC1571a = (InterfaceC1571a) objH6;
            Configuration configuration = (Configuration) w3.getValue();
            Object objH7 = c0371o.H();
            if (objH7 == obj) {
                objH7 = new G0.c();
                c0371o.d0(objH7);
            }
            G0.c cVar = (G0.c) objH7;
            Object objH8 = c0371o.H();
            Object obj3 = objH8;
            if (objH8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0371o.d0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objH9 = c0371o.H();
            if (objH9 == obj) {
                objH9 = new ComponentCallbacks2C0066a0(configuration3, cVar);
                c0371o.d0(objH9);
            }
            ComponentCallbacks2C0066a0 componentCallbacks2C0066a0 = (ComponentCallbacks2C0066a0) objH9;
            boolean zI2 = c0371o.i(context);
            Object objH10 = c0371o.H();
            if (zI2 || objH10 == obj) {
                objH10 = new Y(1, context, componentCallbacks2C0066a0);
                c0371o.d0(objH10);
            }
            C0345b.c(cVar, (c) objH10, c0371o);
            Object objH11 = c0371o.H();
            if (objH11 == obj) {
                objH11 = new d();
                c0371o.d0(objH11);
            }
            d dVar = (d) objH11;
            Object objH12 = c0371o.H();
            if (objH12 == obj) {
                objH12 = new ComponentCallbacks2C0068b0(dVar);
                c0371o.d0(objH12);
            }
            ComponentCallbacks2C0068b0 componentCallbacks2C0068b0 = (ComponentCallbacks2C0068b0) objH12;
            boolean zI3 = c0371o.i(context);
            Object objH13 = c0371o.H();
            if (zI3 || objH13 == obj) {
                objH13 = new Y(2, context, componentCallbacks2C0068b0);
                c0371o.d0(objH13);
            }
            C0345b.c(dVar, (c) objH13, c0371o);
            AbstractC0366l0 abstractC0366l0 = AbstractC0103t0.f1128v;
            C0345b.b(new C0368m0[]{f9340a.a((Configuration) w3.getValue()), f9341b.a(context), a.f4029a.a(viewTreeOwners.f1065a), f9344e.a(eVar2), k.f8310a.a(obj2), f.a(a7.getView()), f9342c.a(cVar), f9343d.a(dVar), abstractC0366l0.a(Boolean.valueOf(((Boolean) c0371o.k(abstractC0366l0)).booleanValue() | a7.getScrollCaptureInProgress$ui_release())), AbstractC0103t0.f1118l.a(interfaceC1571a)}, X.k.d(1471621628, new Z(a7, c0082i0, eVar, 0), c0371o), c0371o, 56);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new j0(i, 1, a7, eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AbstractC0366l0 getLocalLifecycleOwner() {
        return a.f4029a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final AbstractC0366l0 getLocalSavedStateRegistryOwner() {
        return f9344e;
    }
}
