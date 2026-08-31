package J1;

import B0.C0050o;
import C0.C0111x0;
import E.c0;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.k0;
import b.C0683A;
import com.wnapp.smspariaz.R;
import e.C1014g;
import h.AbstractActivityC1106h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import v1.InterfaceC1752a;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1014g f2512A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C1014g f2513B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayDeque f2514C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f2515D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2516E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2517F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f2518G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f2519H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f2520I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f2521J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f2522K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public K f2523L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final A1.b f2524M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2526b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f2528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f2529e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0683A f2530g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0050o f2533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f2534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f2535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x f2536o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f2537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f2538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A f2539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0188u f2541t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C3.a f2542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractComponentCallbacksC0185q f2543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0185q f2544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final B f2545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1899k f2546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1014g f2547z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2525a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f2527c = new c0(4);
    public final w f = new w(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f2531h = new z(0, this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f2532k = Collections.synchronizedMap(new HashMap());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [J1.x] */
    /* JADX WARN: Type inference failed for: r0v13, types: [J1.x] */
    /* JADX WARN: Type inference failed for: r0v14, types: [J1.x] */
    /* JADX WARN: Type inference failed for: r0v15, types: [J1.x] */
    public H() {
        Collections.synchronizedMap(new HashMap());
        C0050o c0050o = new C0050o();
        c0050o.f499q = new CopyOnWriteArrayList();
        c0050o.f500r = this;
        this.f2533l = c0050o;
        this.f2534m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f2535n = new InterfaceC1752a(this) { // from class: J1.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2746b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2746b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // v1.InterfaceC1752a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        H h4 = this.f2746b;
                        if (h4.H()) {
                            h4.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        H h7 = this.f2746b;
                        if (h7.H() && num.intValue() == 80) {
                            h7.l(false);
                            break;
                        }
                        break;
                    case 2:
                        k1.f fVar = (k1.f) obj;
                        H h8 = this.f2746b;
                        if (h8.H()) {
                            boolean z5 = fVar.f14062a;
                            h8.m(false);
                        }
                        break;
                    default:
                        k1.n nVar = (k1.n) obj;
                        H h9 = this.f2746b;
                        if (h9.H()) {
                            boolean z6 = nVar.f14083a;
                            h9.r(false);
                        }
                        break;
                }
            }
        };
        final int i7 = 1;
        this.f2536o = new InterfaceC1752a(this) { // from class: J1.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2746b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2746b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // v1.InterfaceC1752a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        H h4 = this.f2746b;
                        if (h4.H()) {
                            h4.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        H h7 = this.f2746b;
                        if (h7.H() && num.intValue() == 80) {
                            h7.l(false);
                            break;
                        }
                        break;
                    case 2:
                        k1.f fVar = (k1.f) obj;
                        H h8 = this.f2746b;
                        if (h8.H()) {
                            boolean z5 = fVar.f14062a;
                            h8.m(false);
                        }
                        break;
                    default:
                        k1.n nVar = (k1.n) obj;
                        H h9 = this.f2746b;
                        if (h9.H()) {
                            boolean z6 = nVar.f14083a;
                            h9.r(false);
                        }
                        break;
                }
            }
        };
        final int i8 = 2;
        this.f2537p = new InterfaceC1752a(this) { // from class: J1.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2746b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2746b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // v1.InterfaceC1752a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        H h4 = this.f2746b;
                        if (h4.H()) {
                            h4.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        H h7 = this.f2746b;
                        if (h7.H() && num.intValue() == 80) {
                            h7.l(false);
                            break;
                        }
                        break;
                    case 2:
                        k1.f fVar = (k1.f) obj;
                        H h8 = this.f2746b;
                        if (h8.H()) {
                            boolean z5 = fVar.f14062a;
                            h8.m(false);
                        }
                        break;
                    default:
                        k1.n nVar = (k1.n) obj;
                        H h9 = this.f2746b;
                        if (h9.H()) {
                            boolean z6 = nVar.f14083a;
                            h9.r(false);
                        }
                        break;
                }
            }
        };
        final int i9 = 3;
        this.f2538q = new InterfaceC1752a(this) { // from class: J1.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H f2746b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f2746b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // v1.InterfaceC1752a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        H h4 = this.f2746b;
                        if (h4.H()) {
                            h4.h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        H h7 = this.f2746b;
                        if (h7.H() && num.intValue() == 80) {
                            h7.l(false);
                            break;
                        }
                        break;
                    case 2:
                        k1.f fVar = (k1.f) obj;
                        H h8 = this.f2746b;
                        if (h8.H()) {
                            boolean z5 = fVar.f14062a;
                            h8.m(false);
                        }
                        break;
                    default:
                        k1.n nVar = (k1.n) obj;
                        H h9 = this.f2746b;
                        if (h9.H()) {
                            boolean z6 = nVar.f14083a;
                            h9.r(false);
                        }
                        break;
                }
            }
        };
        this.f2539r = new A(this);
        this.f2540s = -1;
        this.f2545x = new B(this);
        this.f2546y = new C1899k(8);
        this.f2514C = new ArrayDeque();
        this.f2524M = new A1.b(5, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean F(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean G(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        abstractComponentCallbacksC0185q.getClass();
        ArrayList arrayListQ = abstractComponentCallbacksC0185q.f2692J.f2527c.q();
        int size = arrayListQ.size();
        boolean zG = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = (AbstractComponentCallbacksC0185q) obj;
            if (abstractComponentCallbacksC0185q2 != null) {
                zG = G(abstractComponentCallbacksC0185q2);
            }
            if (zG) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean I(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (abstractComponentCallbacksC0185q == null) {
            return true;
        }
        if (abstractComponentCallbacksC0185q.f2700R) {
            return abstractComponentCallbacksC0185q.f2690H == null || I(abstractComponentCallbacksC0185q.f2693K);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean J(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (abstractComponentCallbacksC0185q == null) {
            return true;
        }
        H h4 = abstractComponentCallbacksC0185q.f2690H;
        return abstractComponentCallbacksC0185q.equals(h4.f2544w) && J(h4.f2543v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void Y(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (F(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0185q);
        }
        if (abstractComponentCallbacksC0185q.f2697O) {
            abstractComponentCallbacksC0185q.f2697O = false;
            abstractComponentCallbacksC0185q.f2707Y = !abstractComponentCallbacksC0185q.f2707Y;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractComponentCallbacksC0185q A(int i) {
        c0 c0Var = this.f2527c;
        ArrayList arrayList = (ArrayList) c0Var.f1552q;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = (AbstractComponentCallbacksC0185q) arrayList.get(size);
            if (abstractComponentCallbacksC0185q != null && abstractComponentCallbacksC0185q.f2694L == i) {
                return abstractComponentCallbacksC0185q;
            }
        }
        for (N n7 : ((HashMap) c0Var.f1553r).values()) {
            if (n7 != null) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = n7.f2578c;
                if (abstractComponentCallbacksC0185q2.f2694L == i) {
                    return abstractComponentCallbacksC0185q2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ViewGroup B(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        ViewGroup viewGroup = abstractComponentCallbacksC0185q.f2702T;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0185q.f2695M <= 0 || !this.f2542u.K()) {
            return null;
        }
        View viewJ = this.f2542u.J(abstractComponentCallbacksC0185q.f2695M);
        if (viewJ instanceof ViewGroup) {
            return (ViewGroup) viewJ;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B C() {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2543v;
        return abstractComponentCallbacksC0185q != null ? abstractComponentCallbacksC0185q.f2690H.C() : this.f2545x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1899k D() {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2543v;
        return abstractComponentCallbacksC0185q != null ? abstractComponentCallbacksC0185q.f2690H.D() : this.f2546y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (F(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0185q);
        }
        if (abstractComponentCallbacksC0185q.f2697O) {
            return;
        }
        abstractComponentCallbacksC0185q.f2697O = true;
        abstractComponentCallbacksC0185q.f2707Y = true ^ abstractComponentCallbacksC0185q.f2707Y;
        X(abstractComponentCallbacksC0185q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean H() {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2543v;
        if (abstractComponentCallbacksC0185q == null) {
            return true;
        }
        return abstractComponentCallbacksC0185q.f2691I != null && abstractComponentCallbacksC0185q.f2683A && abstractComponentCallbacksC0185q.k().H();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(int i, boolean z5) {
        C0188u c0188u;
        if (this.f2541t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z5 || i != this.f2540s) {
            this.f2540s = i;
            c0 c0Var = this.f2527c;
            HashMap map = (HashMap) c0Var.f1553r;
            ArrayList arrayList = (ArrayList) c0Var.f1552q;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                N n7 = (N) map.get(((AbstractComponentCallbacksC0185q) obj).f2722u);
                if (n7 != null) {
                    n7.k();
                }
            }
            for (N n8 : map.values()) {
                if (n8 != null) {
                    n8.k();
                    AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n8.f2578c;
                    if (abstractComponentCallbacksC0185q.f2684B && !abstractComponentCallbacksC0185q.o()) {
                        c0Var.x(n8);
                    }
                }
            }
            Z();
            if (this.f2515D && (c0188u = this.f2541t) != null && this.f2540s == 7) {
                c0188u.f2738x.invalidateOptionsMenu();
                this.f2515D = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L() {
        if (this.f2541t == null) {
            return;
        }
        this.f2516E = false;
        this.f2517F = false;
        this.f2523L.f2562g = false;
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null) {
                abstractComponentCallbacksC0185q.f2692J.L();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean M() {
        return N(-1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean N(int i, int i7) {
        y(false);
        x(true);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2544w;
        if (abstractComponentCallbacksC0185q != null && i < 0 && abstractComponentCallbacksC0185q.h().M()) {
            return true;
        }
        boolean zO = O(this.f2520I, this.f2521J, i, i7);
        if (zO) {
            this.f2526b = true;
            try {
                Q(this.f2520I, this.f2521J);
            } finally {
                d();
            }
        }
        b0();
        u();
        ((HashMap) this.f2527c.f1553r).values().removeAll(Collections.singleton(null));
        return zO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i, int i7) {
        boolean z5 = (i7 & 1) != 0;
        ArrayList arrayList3 = this.f2528d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z5 ? 0 : this.f2528d.size() - 1;
            } else {
                int size2 = this.f2528d.size() - 1;
                while (size2 >= 0) {
                    C0169a c0169a = (C0169a) this.f2528d.get(size2);
                    if (i >= 0 && i == c0169a.f2619r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z5) {
                    size = size2;
                    while (size > 0) {
                        C0169a c0169a2 = (C0169a) this.f2528d.get(size - 1);
                        if (i < 0 || i != c0169a2.f2619r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f2528d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f2528d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0169a) this.f2528d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (F(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0185q + " nesting=" + abstractComponentCallbacksC0185q.f2689G);
        }
        boolean zO = abstractComponentCallbacksC0185q.o();
        if (abstractComponentCallbacksC0185q.f2698P && zO) {
            return;
        }
        c0 c0Var = this.f2527c;
        synchronized (((ArrayList) c0Var.f1552q)) {
            ((ArrayList) c0Var.f1552q).remove(abstractComponentCallbacksC0185q);
        }
        abstractComponentCallbacksC0185q.f2683A = false;
        if (G(abstractComponentCallbacksC0185q)) {
            this.f2515D = true;
        }
        abstractComponentCallbacksC0185q.f2684B = true;
        X(abstractComponentCallbacksC0185q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i7 = 0;
        while (i < size) {
            if (!((C0169a) arrayList.get(i)).f2616o) {
                if (i7 != i) {
                    z(arrayList, arrayList2, i7, i);
                }
                i7 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i7 < size && ((Boolean) arrayList2.get(i7)).booleanValue() && !((C0169a) arrayList.get(i7)).f2616o) {
                        i7++;
                    }
                }
                z(arrayList, arrayList2, i, i7);
                i = i7 - 1;
            }
            i++;
        }
        if (i7 != size) {
            z(arrayList, arrayList2, i7, size);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(Parcelable parcelable) {
        C0050o c0050o;
        int i;
        boolean z5;
        int i7;
        N n7;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2541t.f2735u.getClassLoader());
                this.f2532k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2541t.f2735u.getClassLoader());
                arrayList.add((M) bundle.getParcelable("state"));
            }
        }
        c0 c0Var = this.f2527c;
        HashMap map = (HashMap) c0Var.f1554s;
        HashMap map2 = (HashMap) c0Var.f1553r;
        map.clear();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            M m4 = (M) obj;
            map.put(m4.f2567r, m4);
        }
        I i9 = (I) bundle3.getParcelable("state");
        if (i9 == null) {
            return;
        }
        map2.clear();
        ArrayList arrayList2 = i9.f2548q;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (true) {
            c0050o = this.f2533l;
            i = 2;
            if (i10 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i10);
            i10++;
            M m7 = (M) ((HashMap) c0Var.f1554s).remove((String) obj2);
            if (m7 != null) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = (AbstractComponentCallbacksC0185q) this.f2523L.f2558b.get(m7.f2567r);
                if (abstractComponentCallbacksC0185q != null) {
                    if (F(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0185q);
                    }
                    n7 = new N(c0050o, c0Var, abstractComponentCallbacksC0185q, m7);
                } else {
                    n7 = new N(this.f2533l, this.f2527c, this.f2541t.f2735u.getClassLoader(), C(), m7);
                }
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = n7.f2578c;
                abstractComponentCallbacksC0185q2.f2690H = this;
                if (F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0185q2.f2722u + "): " + abstractComponentCallbacksC0185q2);
                }
                n7.m(this.f2541t.f2735u.getClassLoader());
                c0Var.w(n7);
                n7.f2580e = this.f2540s;
            }
        }
        K k7 = this.f2523L;
        k7.getClass();
        ArrayList arrayList3 = new ArrayList(k7.f2558b.values());
        int size3 = arrayList3.size();
        int i11 = 0;
        while (true) {
            z5 = true;
            if (i11 >= size3) {
                break;
            }
            Object obj3 = arrayList3.get(i11);
            i11++;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q3 = (AbstractComponentCallbacksC0185q) obj3;
            if (map2.get(abstractComponentCallbacksC0185q3.f2722u) == null) {
                if (F(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0185q3 + " that was not found in the set of active Fragments " + i9.f2548q);
                }
                this.f2523L.e(abstractComponentCallbacksC0185q3);
                abstractComponentCallbacksC0185q3.f2690H = this;
                N n8 = new N(c0050o, c0Var, abstractComponentCallbacksC0185q3);
                n8.f2580e = 1;
                n8.k();
                abstractComponentCallbacksC0185q3.f2684B = true;
                n8.k();
            }
        }
        ArrayList arrayList4 = i9.f2549r;
        ((ArrayList) c0Var.f1552q).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i12 = 0;
            while (i12 < size4) {
                Object obj4 = arrayList4.get(i12);
                i12++;
                String str3 = (String) obj4;
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qF = c0Var.f(str3);
                if (abstractComponentCallbacksC0185qF == null) {
                    throw new IllegalStateException(C0.S.n("No instantiated fragment for (", str3, ")"));
                }
                if (F(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0185qF);
                }
                c0Var.c(abstractComponentCallbacksC0185qF);
            }
        }
        if (i9.f2550s != null) {
            this.f2528d = new ArrayList(i9.f2550s.length);
            int i13 = 0;
            while (true) {
                C0170b[] c0170bArr = i9.f2550s;
                if (i13 >= c0170bArr.length) {
                    break;
                }
                C0170b c0170b = c0170bArr[i13];
                ArrayList arrayList5 = c0170b.f2625r;
                C0169a c0169a = new C0169a(this);
                int[] iArr = c0170b.f2624q;
                int i14 = 0;
                int i15 = 0;
                while (i14 < iArr.length) {
                    O o6 = new O();
                    int i16 = i14 + 1;
                    int i17 = i;
                    o6.f2581a = iArr[i14];
                    if (F(i17)) {
                        Log.v("FragmentManager", "Instantiate " + c0169a + " op #" + i15 + " base fragment #" + iArr[i16]);
                    }
                    o6.f2587h = EnumC0653p.values()[c0170b.f2626s[i15]];
                    o6.i = EnumC0653p.values()[c0170b.f2627t[i15]];
                    int i18 = i14 + 2;
                    o6.f2583c = iArr[i16] != 0 ? z5 : false;
                    int i19 = iArr[i18];
                    o6.f2584d = i19;
                    int i20 = iArr[i14 + 3];
                    o6.f2585e = i20;
                    int i21 = i14 + 5;
                    int i22 = iArr[i14 + 4];
                    o6.f = i22;
                    i14 += 6;
                    int[] iArr2 = iArr;
                    int i23 = iArr2[i21];
                    o6.f2586g = i23;
                    c0169a.f2606b = i19;
                    c0169a.f2607c = i20;
                    c0169a.f2608d = i22;
                    c0169a.f2609e = i23;
                    c0169a.b(o6);
                    i15++;
                    i = i17;
                    iArr = iArr2;
                    z5 = true;
                }
                int i24 = i;
                c0169a.f = c0170b.f2628u;
                c0169a.f2611h = c0170b.f2629v;
                c0169a.f2610g = true;
                c0169a.i = c0170b.f2631x;
                c0169a.j = c0170b.f2632y;
                c0169a.f2612k = c0170b.f2633z;
                c0169a.f2613l = c0170b.f2620A;
                c0169a.f2614m = c0170b.f2621B;
                c0169a.f2615n = c0170b.f2622C;
                c0169a.f2616o = c0170b.f2623D;
                c0169a.f2619r = c0170b.f2630w;
                for (int i25 = 0; i25 < arrayList5.size(); i25++) {
                    String str4 = (String) arrayList5.get(i25);
                    if (str4 != null) {
                        ((O) c0169a.f2605a.get(i25)).f2582b = c0Var.f(str4);
                    }
                }
                c0169a.c(1);
                if (F(i24)) {
                    StringBuilder sbL = k1.i.l("restoreAllState: back stack #", " (index ", i13);
                    sbL.append(c0169a.f2619r);
                    sbL.append("): ");
                    sbL.append(c0169a);
                    Log.v("FragmentManager", sbL.toString());
                    PrintWriter printWriter = new PrintWriter(new Q());
                    c0169a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2528d.add(c0169a);
                i13++;
                i = i24;
                z5 = true;
            }
            i7 = 0;
        } else {
            i7 = 0;
            this.f2528d = null;
        }
        this.i.set(i9.f2551t);
        String str5 = i9.f2552u;
        if (str5 != null) {
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qF2 = c0Var.f(str5);
            this.f2544w = abstractComponentCallbacksC0185qF2;
            q(abstractComponentCallbacksC0185qF2);
        }
        ArrayList arrayList6 = i9.f2553v;
        if (arrayList6 != null) {
            while (i7 < arrayList6.size()) {
                this.j.put((String) arrayList6.get(i7), (C0171c) i9.f2554w.get(i7));
                i7++;
            }
        }
        this.f2514C = new ArrayDeque(i9.f2555x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle S() {
        int i;
        ArrayList arrayList;
        C0170b[] c0170bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C0176h c0176h = (C0176h) it.next();
            if (c0176h.f2652e) {
                if (F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0176h.f2652e = false;
                c0176h.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0176h) it2.next()).e();
        }
        y(true);
        this.f2516E = true;
        this.f2523L.f2562g = true;
        c0 c0Var = this.f2527c;
        c0Var.getClass();
        HashMap map = (HashMap) c0Var.f1553r;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            N n7 = (N) it3.next();
            if (n7 != null) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
                M m4 = new M(abstractComponentCallbacksC0185q);
                if (abstractComponentCallbacksC0185q.f2718q <= -1 || m4.f2565C != null) {
                    m4.f2565C = abstractComponentCallbacksC0185q.f2719r;
                } else {
                    Bundle bundle2 = new Bundle();
                    abstractComponentCallbacksC0185q.x(bundle2);
                    abstractComponentCallbacksC0185q.f2715g0.A(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC0185q.f2692J.S());
                    n7.f2576a.y(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (abstractComponentCallbacksC0185q.f2703U != null) {
                        n7.o();
                    }
                    if (abstractComponentCallbacksC0185q.f2720s != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0185q.f2720s);
                    }
                    if (abstractComponentCallbacksC0185q.f2721t != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", abstractComponentCallbacksC0185q.f2721t);
                    }
                    if (!abstractComponentCallbacksC0185q.f2705W) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0185q.f2705W);
                    }
                    m4.f2565C = bundle3;
                    if (abstractComponentCallbacksC0185q.f2725x != null) {
                        if (bundle3 == null) {
                            m4.f2565C = new Bundle();
                        }
                        m4.f2565C.putString("android:target_state", abstractComponentCallbacksC0185q.f2725x);
                        int i7 = abstractComponentCallbacksC0185q.f2726y;
                        if (i7 != 0) {
                            m4.f2565C.putInt("android:target_req_state", i7);
                        }
                    }
                }
                arrayList2.add(abstractComponentCallbacksC0185q.f2722u);
                if (F(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0185q + ": " + abstractComponentCallbacksC0185q.f2719r);
                }
            }
        }
        c0 c0Var2 = this.f2527c;
        c0Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) c0Var2.f1554s).values());
        if (!arrayList3.isEmpty()) {
            c0 c0Var3 = this.f2527c;
            synchronized (((ArrayList) c0Var3.f1552q)) {
                try {
                    if (((ArrayList) c0Var3.f1552q).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c0Var3.f1552q).size());
                        ArrayList arrayList4 = (ArrayList) c0Var3.f1552q;
                        int size2 = arrayList4.size();
                        int i8 = 0;
                        while (i8 < size2) {
                            Object obj = arrayList4.get(i8);
                            i8++;
                            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = (AbstractComponentCallbacksC0185q) obj;
                            arrayList.add(abstractComponentCallbacksC0185q2.f2722u);
                            if (F(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0185q2.f2722u + "): " + abstractComponentCallbacksC0185q2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList5 = this.f2528d;
            if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
                c0170bArr = null;
            } else {
                c0170bArr = new C0170b[size];
                for (int i9 = 0; i9 < size; i9++) {
                    c0170bArr[i9] = new C0170b((C0169a) this.f2528d.get(i9));
                    if (F(2)) {
                        StringBuilder sbL = k1.i.l("saveAllState: adding back stack #", ": ", i9);
                        sbL.append(this.f2528d.get(i9));
                        Log.v("FragmentManager", sbL.toString());
                    }
                }
            }
            I i10 = new I();
            i10.f2552u = null;
            ArrayList arrayList6 = new ArrayList();
            i10.f2553v = arrayList6;
            ArrayList arrayList7 = new ArrayList();
            i10.f2554w = arrayList7;
            i10.f2548q = arrayList2;
            i10.f2549r = arrayList;
            i10.f2550s = c0170bArr;
            i10.f2551t = this.i.get();
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q3 = this.f2544w;
            if (abstractComponentCallbacksC0185q3 != null) {
                i10.f2552u = abstractComponentCallbacksC0185q3.f2722u;
            }
            arrayList6.addAll(this.j.keySet());
            arrayList7.addAll(this.j.values());
            i10.f2555x = new ArrayList(this.f2514C);
            bundle.putParcelable("state", i10);
            for (String str : this.f2532k.keySet()) {
                bundle.putBundle(C0.S.w("result_", str), (Bundle) this.f2532k.get(str));
            }
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj2 = arrayList3.get(i);
                i++;
                M m7 = (M) obj2;
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("state", m7);
                bundle.putBundle("fragment_" + m7.f2567r, bundle4);
            }
        } else if (F(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T() {
        synchronized (this.f2525a) {
            try {
                if (this.f2525a.size() == 1) {
                    this.f2541t.f2736v.removeCallbacks(this.f2524M);
                    this.f2541t.f2736v.post(this.f2524M);
                    b0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q, boolean z5) {
        ViewGroup viewGroupB = B(abstractComponentCallbacksC0185q);
        if (viewGroupB == null || !(viewGroupB instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupB).setDrawDisappearingViewsLast(!z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q, EnumC0653p enumC0653p) {
        if (abstractComponentCallbacksC0185q.equals(this.f2527c.f(abstractComponentCallbacksC0185q.f2722u)) && (abstractComponentCallbacksC0185q.f2691I == null || abstractComponentCallbacksC0185q.f2690H == this)) {
            abstractComponentCallbacksC0185q.f2710b0 = enumC0653p;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0185q + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (abstractComponentCallbacksC0185q != null) {
            if (!abstractComponentCallbacksC0185q.equals(this.f2527c.f(abstractComponentCallbacksC0185q.f2722u)) || (abstractComponentCallbacksC0185q.f2691I != null && abstractComponentCallbacksC0185q.f2690H != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0185q + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = this.f2544w;
        this.f2544w = abstractComponentCallbacksC0185q;
        q(abstractComponentCallbacksC0185q2);
        q(this.f2544w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        ViewGroup viewGroupB = B(abstractComponentCallbacksC0185q);
        if (viewGroupB != null) {
            C0184p c0184p = abstractComponentCallbacksC0185q.f2706X;
            if ((c0184p == null ? 0 : c0184p.f2678e) + (c0184p == null ? 0 : c0184p.f2677d) + (c0184p == null ? 0 : c0184p.f2676c) + (c0184p == null ? 0 : c0184p.f2675b) > 0) {
                if (viewGroupB.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupB.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0185q);
                }
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = (AbstractComponentCallbacksC0185q) viewGroupB.getTag(R.id.visible_removing_fragment_view_tag);
                C0184p c0184p2 = abstractComponentCallbacksC0185q.f2706X;
                boolean z5 = c0184p2 != null ? c0184p2.f2674a : false;
                if (abstractComponentCallbacksC0185q2.f2706X == null) {
                    return;
                }
                abstractComponentCallbacksC0185q2.g().f2674a = z5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z() {
        ArrayList arrayListO = this.f2527c.o();
        int size = arrayListO.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListO.get(i);
            i++;
            N n7 = (N) obj;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
            if (abstractComponentCallbacksC0185q.f2704V) {
                if (this.f2526b) {
                    this.f2519H = true;
                } else {
                    abstractComponentCallbacksC0185q.f2704V = false;
                    n7.k();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final N a(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        String str = abstractComponentCallbacksC0185q.f2709a0;
        if (str != null) {
            K1.d.c(abstractComponentCallbacksC0185q, str);
        }
        if (F(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0185q);
        }
        N nF = f(abstractComponentCallbacksC0185q);
        abstractComponentCallbacksC0185q.f2690H = this;
        c0 c0Var = this.f2527c;
        c0Var.w(nF);
        if (!abstractComponentCallbacksC0185q.f2698P) {
            c0Var.c(abstractComponentCallbacksC0185q);
            abstractComponentCallbacksC0185q.f2684B = false;
            if (abstractComponentCallbacksC0185q.f2703U == null) {
                abstractComponentCallbacksC0185q.f2707Y = false;
            }
            if (G(abstractComponentCallbacksC0185q)) {
                this.f2515D = true;
            }
        }
        return nF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Q());
        C0188u c0188u = this.f2541t;
        if (c0188u == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw illegalStateException;
            }
        }
        try {
            c0188u.f2738x.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw illegalStateException;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(C0188u c0188u, C3.a aVar, AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (this.f2541t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2541t = c0188u;
        this.f2542u = aVar;
        this.f2543v = abstractComponentCallbacksC0185q;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2534m;
        if (abstractComponentCallbacksC0185q != null) {
            copyOnWriteArrayList.add(new C(abstractComponentCallbacksC0185q));
        } else if (c0188u != null) {
            copyOnWriteArrayList.add(c0188u);
        }
        if (this.f2543v != null) {
            b0();
        }
        if (c0188u != null) {
            C0683A c0683aA = c0188u.f2738x.a();
            this.f2530g = c0683aA;
            c0683aA.a(abstractComponentCallbacksC0185q != null ? abstractComponentCallbacksC0185q : c0188u, this.f2531h);
        }
        if (abstractComponentCallbacksC0185q != null) {
            K k7 = abstractComponentCallbacksC0185q.f2690H.f2523L;
            HashMap map = k7.f2559c;
            K k8 = (K) map.get(abstractComponentCallbacksC0185q.f2722u);
            if (k8 == null) {
                k8 = new K(k7.f2561e);
                map.put(abstractComponentCallbacksC0185q.f2722u, k8);
            }
            this.f2523L = k8;
        } else if (c0188u != null) {
            k0 k0VarF = c0188u.f2738x.f();
            P1.a defaultCreationExtras = P1.a.f5609b;
            kotlin.jvm.internal.m.e(defaultCreationExtras, "defaultCreationExtras");
            c0 c0Var = new c0(k0VarF, K.f2557h, defaultCreationExtras);
            kotlin.jvm.internal.f fVarA = kotlin.jvm.internal.z.a(K.class);
            String strB = fVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f2523L = (K) c0Var.v("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), fVarA);
        } else {
            this.f2523L = new K(false);
        }
        K k9 = this.f2523L;
        k9.f2562g = this.f2516E || this.f2517F;
        this.f2527c.f1555t = k9;
        C0188u c0188u2 = this.f2541t;
        if (c0188u2 != null && abstractComponentCallbacksC0185q == null) {
            Z.m mVarB = c0188u2.b();
            mVarB.C("android:support:fragments", new C0111x0(1, this));
            Bundle bundleH = mVarB.h("android:support:fragments");
            if (bundleH != null) {
                R(bundleH);
            }
        }
        C0188u c0188u3 = this.f2541t;
        if (c0188u3 != null) {
            b.j jVar = c0188u3.f2738x.f9899y;
            String strW = C0.S.w("FragmentManager:", abstractComponentCallbacksC0185q != null ? k1.i.k(new StringBuilder(), abstractComponentCallbacksC0185q.f2722u, ":") : "");
            this.f2547z = jVar.c(C0.S.l(strW, "StartActivityForResult"), new D(7), new k3.d(6, this));
            this.f2512A = jVar.c(C0.S.l(strW, "StartIntentSenderForResult"), new D(0), new y(this, 1));
            this.f2513B = jVar.c(C0.S.l(strW, "RequestPermissions"), new D(5), new y(this, 0));
        }
        C0188u c0188u4 = this.f2541t;
        if (c0188u4 != null) {
            c0188u4.f2738x.h(this.f2535n);
        }
        C0188u c0188u5 = this.f2541t;
        if (c0188u5 != null) {
            AbstractActivityC1106h abstractActivityC1106h = c0188u5.f2738x;
            abstractActivityC1106h.getClass();
            x listener = this.f2536o;
            kotlin.jvm.internal.m.e(listener, "listener");
            abstractActivityC1106h.f9883A.add(listener);
        }
        C0188u c0188u6 = this.f2541t;
        if (c0188u6 != null) {
            AbstractActivityC1106h abstractActivityC1106h2 = c0188u6.f2738x;
            abstractActivityC1106h2.getClass();
            x listener2 = this.f2537p;
            kotlin.jvm.internal.m.e(listener2, "listener");
            abstractActivityC1106h2.f9885C.add(listener2);
        }
        C0188u c0188u7 = this.f2541t;
        if (c0188u7 != null) {
            AbstractActivityC1106h abstractActivityC1106h3 = c0188u7.f2738x;
            abstractActivityC1106h3.getClass();
            x listener3 = this.f2538q;
            kotlin.jvm.internal.m.e(listener3, "listener");
            abstractActivityC1106h3.f9886D.add(listener3);
        }
        C0188u c0188u8 = this.f2541t;
        if (c0188u8 == null || abstractComponentCallbacksC0185q != null) {
            return;
        }
        AbstractActivityC1106h abstractActivityC1106h4 = c0188u8.f2738x;
        abstractActivityC1106h4.getClass();
        A provider = this.f2539r;
        kotlin.jvm.internal.m.e(provider, "provider");
        t2.e eVar = abstractActivityC1106h4.f9893s;
        ((CopyOnWriteArrayList) eVar.f16685r).add(provider);
        ((Runnable) eVar.f16684q).run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [B5.a, kotlin.jvm.internal.k] */
    /* JADX WARN: Type inference failed for: r1v10, types: [B5.a, kotlin.jvm.internal.k] */
    public final void b0() {
        synchronized (this.f2525a) {
            try {
                if (!this.f2525a.isEmpty()) {
                    z zVar = this.f2531h;
                    zVar.f9909a = true;
                    ?? r12 = zVar.f9911c;
                    if (r12 != 0) {
                        r12.invoke();
                    }
                    return;
                }
                z zVar2 = this.f2531h;
                ArrayList arrayList = this.f2528d;
                zVar2.f9909a = (arrayList != null ? arrayList.size() : 0) > 0 && J(this.f2543v);
                ?? r02 = zVar2.f9911c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (F(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0185q);
        }
        if (abstractComponentCallbacksC0185q.f2698P) {
            abstractComponentCallbacksC0185q.f2698P = false;
            if (abstractComponentCallbacksC0185q.f2683A) {
                return;
            }
            this.f2527c.c(abstractComponentCallbacksC0185q);
            if (F(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0185q);
            }
            if (G(abstractComponentCallbacksC0185q)) {
                this.f2515D = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        this.f2526b = false;
        this.f2521J.clear();
        this.f2520I.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListO = this.f2527c.o();
        int size = arrayListO.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListO.get(i);
            i++;
            ViewGroup viewGroup = ((N) obj).f2578c.f2702T;
            if (viewGroup != null) {
                hashSet.add(C0176h.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final N f(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        String str = abstractComponentCallbacksC0185q.f2722u;
        c0 c0Var = this.f2527c;
        N n7 = (N) ((HashMap) c0Var.f1553r).get(str);
        if (n7 != null) {
            return n7;
        }
        N n8 = new N(this.f2533l, c0Var, abstractComponentCallbacksC0185q);
        n8.m(this.f2541t.f2735u.getClassLoader());
        n8.f2580e = this.f2540s;
        return n8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (F(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0185q);
        }
        if (abstractComponentCallbacksC0185q.f2698P) {
            return;
        }
        abstractComponentCallbacksC0185q.f2698P = true;
        if (abstractComponentCallbacksC0185q.f2683A) {
            if (F(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0185q);
            }
            c0 c0Var = this.f2527c;
            synchronized (((ArrayList) c0Var.f1552q)) {
                ((ArrayList) c0Var.f1552q).remove(abstractComponentCallbacksC0185q);
            }
            abstractComponentCallbacksC0185q.f2683A = false;
            if (G(abstractComponentCallbacksC0185q)) {
                this.f2515D = true;
            }
            X(abstractComponentCallbacksC0185q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z5) {
        if (z5 && this.f2541t != null) {
            a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null) {
                abstractComponentCallbacksC0185q.f2701S = true;
                if (z5) {
                    abstractComponentCallbacksC0185q.f2692J.h(true);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        if (this.f2540s >= 1) {
            for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
                if (abstractComponentCallbacksC0185q != null) {
                    if (!abstractComponentCallbacksC0185q.f2697O ? abstractComponentCallbacksC0185q.f2692J.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j() {
        if (this.f2540s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z5 = false;
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null && I(abstractComponentCallbacksC0185q)) {
                if (!abstractComponentCallbacksC0185q.f2697O ? abstractComponentCallbacksC0185q.f2692J.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0185q);
                    z5 = true;
                }
            }
        }
        if (this.f2529e != null) {
            for (int i = 0; i < this.f2529e.size(); i++) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = (AbstractComponentCallbacksC0185q) this.f2529e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0185q2)) {
                    abstractComponentCallbacksC0185q2.getClass();
                }
            }
        }
        this.f2529e = arrayList;
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.f2518G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0176h) it.next()).e();
        }
        C0188u c0188u = this.f2541t;
        c0 c0Var = this.f2527c;
        if (c0188u != null) {
            zIsChangingConfigurations = ((K) c0Var.f1555t).f;
        } else {
            AbstractActivityC1106h abstractActivityC1106h = c0188u.f2735u;
            if (abstractActivityC1106h != null) {
                zIsChangingConfigurations = true ^ abstractActivityC1106h.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((C0171c) it2.next()).f2634q;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    K k7 = (K) c0Var.f1555t;
                    k7.getClass();
                    if (F(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    k7.d(str);
                }
            }
        }
        t(-1);
        C0188u c0188u2 = this.f2541t;
        if (c0188u2 != null) {
            AbstractActivityC1106h abstractActivityC1106h2 = c0188u2.f2738x;
            abstractActivityC1106h2.getClass();
            x listener = this.f2536o;
            kotlin.jvm.internal.m.e(listener, "listener");
            abstractActivityC1106h2.f9883A.remove(listener);
        }
        C0188u c0188u3 = this.f2541t;
        if (c0188u3 != null) {
            AbstractActivityC1106h abstractActivityC1106h3 = c0188u3.f2738x;
            abstractActivityC1106h3.getClass();
            x listener2 = this.f2535n;
            kotlin.jvm.internal.m.e(listener2, "listener");
            abstractActivityC1106h3.f9900z.remove(listener2);
        }
        C0188u c0188u4 = this.f2541t;
        if (c0188u4 != null) {
            AbstractActivityC1106h abstractActivityC1106h4 = c0188u4.f2738x;
            abstractActivityC1106h4.getClass();
            x listener3 = this.f2537p;
            kotlin.jvm.internal.m.e(listener3, "listener");
            abstractActivityC1106h4.f9885C.remove(listener3);
        }
        C0188u c0188u5 = this.f2541t;
        if (c0188u5 != null) {
            AbstractActivityC1106h abstractActivityC1106h5 = c0188u5.f2738x;
            abstractActivityC1106h5.getClass();
            x listener4 = this.f2538q;
            kotlin.jvm.internal.m.e(listener4, "listener");
            abstractActivityC1106h5.f9886D.remove(listener4);
        }
        C0188u c0188u6 = this.f2541t;
        if (c0188u6 != null) {
            AbstractActivityC1106h abstractActivityC1106h6 = c0188u6.f2738x;
            abstractActivityC1106h6.getClass();
            A provider = this.f2539r;
            kotlin.jvm.internal.m.e(provider, "provider");
            t2.e eVar = abstractActivityC1106h6.f9893s;
            ((CopyOnWriteArrayList) eVar.f16685r).remove(provider);
            if (((HashMap) eVar.f16686s).remove(provider) != null) {
                throw new ClassCastException();
            }
            ((Runnable) eVar.f16684q).run();
        }
        this.f2541t = null;
        this.f2542u = null;
        this.f2543v = null;
        if (this.f2530g != null) {
            this.f2531h.e();
            this.f2530g = null;
        }
        C1014g c1014g = this.f2547z;
        if (c1014g != null) {
            c1014g.f12466e.e(c1014g.f);
            C1014g c1014g2 = this.f2512A;
            c1014g2.f12466e.e(c1014g2.f);
            C1014g c1014g3 = this.f2513B;
            c1014g3.f12466e.e(c1014g3.f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(boolean z5) {
        if (z5 && this.f2541t != null) {
            a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null) {
                abstractComponentCallbacksC0185q.f2701S = true;
                if (z5) {
                    abstractComponentCallbacksC0185q.f2692J.l(true);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(boolean z5) {
        if (z5 && this.f2541t != null) {
            a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null && z5) {
                abstractComponentCallbacksC0185q.f2692J.m(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n() {
        ArrayList arrayListQ = this.f2527c.q();
        int size = arrayListQ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListQ.get(i);
            i++;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = (AbstractComponentCallbacksC0185q) obj;
            if (abstractComponentCallbacksC0185q != null) {
                abstractComponentCallbacksC0185q.n();
                abstractComponentCallbacksC0185q.f2692J.n();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o() {
        if (this.f2540s >= 1) {
            for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
                if (abstractComponentCallbacksC0185q != null) {
                    if (!abstractComponentCallbacksC0185q.f2697O ? abstractComponentCallbacksC0185q.f2692J.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        if (this.f2540s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null && !abstractComponentCallbacksC0185q.f2697O) {
                abstractComponentCallbacksC0185q.f2692J.p();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (abstractComponentCallbacksC0185q != null) {
            if (abstractComponentCallbacksC0185q.equals(this.f2527c.f(abstractComponentCallbacksC0185q.f2722u))) {
                abstractComponentCallbacksC0185q.f2690H.getClass();
                boolean zJ = J(abstractComponentCallbacksC0185q);
                Boolean bool = abstractComponentCallbacksC0185q.f2727z;
                if (bool == null || bool.booleanValue() != zJ) {
                    abstractComponentCallbacksC0185q.f2727z = Boolean.valueOf(zJ);
                    H h4 = abstractComponentCallbacksC0185q.f2692J;
                    h4.b0();
                    h4.q(h4.f2544w);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(boolean z5) {
        if (z5 && this.f2541t != null) {
            a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null && z5) {
                abstractComponentCallbacksC0185q.f2692J.r(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean s() {
        if (this.f2540s < 1) {
            return false;
        }
        boolean z5 = false;
        for (AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q : this.f2527c.s()) {
            if (abstractComponentCallbacksC0185q != null && I(abstractComponentCallbacksC0185q)) {
                if (!abstractComponentCallbacksC0185q.f2697O ? abstractComponentCallbacksC0185q.f2692J.s() : false) {
                    z5 = true;
                }
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(int i) {
        try {
            this.f2526b = true;
            for (N n7 : ((HashMap) this.f2527c.f1553r).values()) {
                if (n7 != null) {
                    n7.f2580e = i;
                }
            }
            K(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0176h) it.next()).e();
            }
            this.f2526b = false;
            y(true);
        } catch (Throwable th) {
            this.f2526b = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2543v;
        if (abstractComponentCallbacksC0185q != null) {
            sb.append(abstractComponentCallbacksC0185q.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2543v)));
            sb.append("}");
        } else {
            C0188u c0188u = this.f2541t;
            if (c0188u != null) {
                sb.append(c0188u.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f2541t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        if (this.f2519H) {
            this.f2519H = false;
            Z();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String strL = C0.S.l(str, "    ");
        c0 c0Var = this.f2527c;
        ArrayList arrayList = (ArrayList) c0Var.f1552q;
        String strL2 = C0.S.l(str, "    ");
        HashMap map = (HashMap) c0Var.f1553r;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (N n7 : map.values()) {
                printWriter.print(str);
                if (n7 != null) {
                    AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
                    printWriter.println(abstractComponentCallbacksC0185q);
                    abstractComponentCallbacksC0185q.getClass();
                    printWriter.print(strL2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0185q.f2694L));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0185q.f2695M));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0185q.f2696N);
                    printWriter.print(strL2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2718q);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2722u);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0185q.f2689G);
                    printWriter.print(strL2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2683A);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2684B);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2685C);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0185q.f2686D);
                    printWriter.print(strL2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2697O);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2698P);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2700R);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strL2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0185q.f2699Q);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0185q.f2705W);
                    if (abstractComponentCallbacksC0185q.f2690H != null) {
                        printWriter.print(strL2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2690H);
                    }
                    if (abstractComponentCallbacksC0185q.f2691I != null) {
                        printWriter.print(strL2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2691I);
                    }
                    if (abstractComponentCallbacksC0185q.f2693K != null) {
                        printWriter.print(strL2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2693K);
                    }
                    if (abstractComponentCallbacksC0185q.f2723v != null) {
                        printWriter.print(strL2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2723v);
                    }
                    if (abstractComponentCallbacksC0185q.f2719r != null) {
                        printWriter.print(strL2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2719r);
                    }
                    if (abstractComponentCallbacksC0185q.f2720s != null) {
                        printWriter.print(strL2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2720s);
                    }
                    if (abstractComponentCallbacksC0185q.f2721t != null) {
                        printWriter.print(strL2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2721t);
                    }
                    Object objF = abstractComponentCallbacksC0185q.f2724w;
                    if (objF == null) {
                        H h4 = abstractComponentCallbacksC0185q.f2690H;
                        objF = (h4 == null || (str2 = abstractComponentCallbacksC0185q.f2725x) == null) ? null : h4.f2527c.f(str2);
                    }
                    if (objF != null) {
                        printWriter.print(strL2);
                        printWriter.print("mTarget=");
                        printWriter.print(objF);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2726y);
                    }
                    printWriter.print(strL2);
                    printWriter.print("mPopDirection=");
                    C0184p c0184p = abstractComponentCallbacksC0185q.f2706X;
                    printWriter.println(c0184p == null ? false : c0184p.f2674a);
                    C0184p c0184p2 = abstractComponentCallbacksC0185q.f2706X;
                    if ((c0184p2 == null ? 0 : c0184p2.f2675b) != 0) {
                        printWriter.print(strL2);
                        printWriter.print("getEnterAnim=");
                        C0184p c0184p3 = abstractComponentCallbacksC0185q.f2706X;
                        printWriter.println(c0184p3 == null ? 0 : c0184p3.f2675b);
                    }
                    C0184p c0184p4 = abstractComponentCallbacksC0185q.f2706X;
                    if ((c0184p4 == null ? 0 : c0184p4.f2676c) != 0) {
                        printWriter.print(strL2);
                        printWriter.print("getExitAnim=");
                        C0184p c0184p5 = abstractComponentCallbacksC0185q.f2706X;
                        printWriter.println(c0184p5 == null ? 0 : c0184p5.f2676c);
                    }
                    C0184p c0184p6 = abstractComponentCallbacksC0185q.f2706X;
                    if ((c0184p6 == null ? 0 : c0184p6.f2677d) != 0) {
                        printWriter.print(strL2);
                        printWriter.print("getPopEnterAnim=");
                        C0184p c0184p7 = abstractComponentCallbacksC0185q.f2706X;
                        printWriter.println(c0184p7 == null ? 0 : c0184p7.f2677d);
                    }
                    C0184p c0184p8 = abstractComponentCallbacksC0185q.f2706X;
                    if ((c0184p8 == null ? 0 : c0184p8.f2678e) != 0) {
                        printWriter.print(strL2);
                        printWriter.print("getPopExitAnim=");
                        C0184p c0184p9 = abstractComponentCallbacksC0185q.f2706X;
                        printWriter.println(c0184p9 == null ? 0 : c0184p9.f2678e);
                    }
                    if (abstractComponentCallbacksC0185q.f2702T != null) {
                        printWriter.print(strL2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2702T);
                    }
                    if (abstractComponentCallbacksC0185q.f2703U != null) {
                        printWriter.print(strL2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0185q.f2703U);
                    }
                    if (abstractComponentCallbacksC0185q.i() != null) {
                        k0 store = abstractComponentCallbacksC0185q.f();
                        J j = S1.a.f7304c;
                        kotlin.jvm.internal.m.e(store, "store");
                        P1.a defaultCreationExtras = P1.a.f5609b;
                        kotlin.jvm.internal.m.e(defaultCreationExtras, "defaultCreationExtras");
                        c0 c0Var2 = new c0(store, j, defaultCreationExtras);
                        kotlin.jvm.internal.f fVarA = kotlin.jvm.internal.z.a(S1.a.class);
                        String strB = fVarA.b();
                        if (strB == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        r.S s6 = ((S1.a) c0Var2.v("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), fVarA)).f7305b;
                        if (s6.f() > 0) {
                            printWriter.print(strL2);
                            printWriter.println("Loaders:");
                            if (s6.f() > 0) {
                                if (s6.g(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strL2);
                                printWriter.print("  #");
                                printWriter.print(s6.d(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strL2);
                    printWriter.println("Child " + abstractComponentCallbacksC0185q.f2692J + ":");
                    abstractComponentCallbacksC0185q.f2692J.v(C0.S.l(strL2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = (AbstractComponentCallbacksC0185q) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0185q2.toString());
            }
        }
        ArrayList arrayList2 = this.f2529e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size2; i7++) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q3 = (AbstractComponentCallbacksC0185q) this.f2529e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0185q3.toString());
            }
        }
        ArrayList arrayList3 = this.f2528d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                C0169a c0169a = (C0169a) this.f2528d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(c0169a.toString());
                c0169a.f(strL, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.f2525a) {
            try {
                int size4 = this.f2525a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size4; i9++) {
                        Object obj = (F) this.f2525a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2541t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2542u);
        if (this.f2543v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2543v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2540s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2516E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2517F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2518G);
        if (this.f2515D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2515D);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(F f, boolean z5) {
        if (!z5) {
            if (this.f2541t == null) {
                if (!this.f2518G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f2516E || this.f2517F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2525a) {
            try {
                if (this.f2541t == null) {
                    if (!z5) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2525a.add(f);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(boolean z5) {
        if (this.f2526b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2541t == null) {
            if (!this.f2518G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2541t.f2736v.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z5 && (this.f2516E || this.f2517F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2520I == null) {
            this.f2520I = new ArrayList();
            this.f2521J = new ArrayList();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y(boolean z5) {
        boolean zA;
        x(z5);
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.f2520I;
            ArrayList arrayList2 = this.f2521J;
            synchronized (this.f2525a) {
                if (this.f2525a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f2525a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((F) this.f2525a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                b0();
                u();
                ((HashMap) this.f2527c.f1553r).values().removeAll(Collections.singleton(null));
                return z6;
            }
            z6 = true;
            this.f2526b = true;
            try {
                Q(this.f2520I, this.f2521J);
            } finally {
                d();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022b A[PHI: r14
  0x022b: PHI (r14v23 int) = (r14v22 int), (r14v24 int) binds: [B:103:0x021b, B:108:0x0227] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = r27
            E.c0 r4 = r1.f2527c
            r5 = r26
            java.lang.Object r6 = r0.get(r5)
            J1.a r6 = (J1.C0169a) r6
            boolean r6 = r6.f2616o
            java.util.ArrayList r7 = r1.f2522K
            if (r7 != 0) goto L20
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.f2522K = r7
            goto L23
        L20:
            r7.clear()
        L23:
            java.util.ArrayList r7 = r1.f2522K
            java.util.List r8 = r4.s()
            r7.addAll(r8)
            J1.q r7 = r1.f2544w
            r9 = r5
            r10 = 0
        L30:
            r12 = 1
            if (r9 >= r3) goto L19a
            java.lang.Object r13 = r0.get(r9)
            J1.a r13 = (J1.C0169a) r13
            java.lang.Object r14 = r2.get(r9)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L14b
            java.util.ArrayList r14 = r1.f2522K
            java.util.ArrayList r11 = r13.f2605a
            r8 = 0
        L4a:
            int r15 = r11.size()
            if (r8 >= r15) goto L144
            java.lang.Object r15 = r11.get(r8)
            J1.O r15 = (J1.O) r15
            int r5 = r15.f2581a
            if (r5 == r12) goto L12e
            r12 = 2
            r17 = r6
            r6 = 9
            if (r5 == r12) goto La9
            r12 = 3
            if (r5 == r12) goto L8e
            r12 = 6
            if (r5 == r12) goto L8e
            r12 = 7
            if (r5 == r12) goto L87
            r12 = 8
            if (r5 == r12) goto L6f
            goto L80
        L6f:
            J1.O r5 = new J1.O
            r12 = 0
            r5.<init>(r6, r7, r12)
            r11.add(r8, r5)
            r5 = 1
            r15.f2583c = r5
            int r8 = r8 + 1
            J1.q r5 = r15.f2582b
            r7 = r5
        L80:
            r20 = r9
            r19 = r10
            r6 = 1
            goto L138
        L87:
            r6 = 1
        L88:
            r20 = r9
            r19 = r10
            goto L133
        L8e:
            J1.q r5 = r15.f2582b
            r14.remove(r5)
            J1.q r5 = r15.f2582b
            if (r5 != r7) goto L80
            J1.O r7 = new J1.O
            r7.<init>(r6, r5)
            r11.add(r8, r7)
            int r8 = r8 + 1
            r20 = r9
            r19 = r10
            r6 = 1
            r7 = 0
            goto L138
        La9:
            J1.q r5 = r15.f2582b
            int r12 = r5.f2695M
            int r18 = r14.size()
            r16 = 1
            int r18 = r18 + (-1)
            r6 = r18
            r18 = 0
        Lb9:
            if (r6 < 0) goto L119
            java.lang.Object r20 = r14.get(r6)
            r21 = r6
            r6 = r20
            J1.q r6 = (J1.AbstractComponentCallbacksC0185q) r6
            r20 = r9
            int r9 = r6.f2695M
            if (r9 != r12) goto L10e
            if (r6 != r5) goto Ld3
            r19 = r10
            r6 = 1
            r18 = 1
            goto L111
        Ld3:
            if (r6 != r7) goto Le6
            J1.O r7 = new J1.O
            r19 = r10
            r9 = 0
            r10 = 9
            r7.<init>(r10, r6, r9)
            r11.add(r8, r7)
            int r8 = r8 + 1
            r7 = 0
            goto Leb
        Le6:
            r19 = r10
            r9 = 0
            r10 = 9
        Leb:
            J1.O r10 = new J1.O
            r22 = r7
            r7 = 3
            r10.<init>(r7, r6, r9)
            int r7 = r15.f2584d
            r10.f2584d = r7
            int r7 = r15.f
            r10.f = r7
            int r7 = r15.f2585e
            r10.f2585e = r7
            int r7 = r15.f2586g
            r10.f2586g = r7
            r11.add(r8, r10)
            r14.remove(r6)
            r6 = 1
            int r8 = r8 + r6
            r7 = r22
            goto L111
        L10e:
            r19 = r10
            r6 = 1
        L111:
            int r9 = r21 + (-1)
            r6 = r9
            r10 = r19
            r9 = r20
            goto Lb9
        L119:
            r20 = r9
            r19 = r10
            r6 = 1
            if (r18 == 0) goto L126
            r11.remove(r8)
            int r8 = r8 + (-1)
            goto L138
        L126:
            r15.f2581a = r6
            r15.f2583c = r6
            r14.add(r5)
            goto L138
        L12e:
            r17 = r6
            r6 = r12
            goto L88
        L133:
            J1.q r5 = r15.f2582b
            r14.add(r5)
        L138:
            int r8 = r8 + r6
            r5 = r26
            r12 = r6
            r6 = r17
            r10 = r19
            r9 = r20
            goto L4a
        L144:
            r17 = r6
            r20 = r9
            r19 = r10
            goto L188
        L14b:
            r17 = r6
            r20 = r9
            r19 = r10
            r6 = r12
            java.util.ArrayList r5 = r1.f2522K
            java.util.ArrayList r8 = r13.f2605a
            int r9 = r8.size()
            int r9 = r9 - r6
        L15b:
            if (r9 < 0) goto L188
            java.lang.Object r10 = r8.get(r9)
            J1.O r10 = (J1.O) r10
            int r11 = r10.f2581a
            r12 = 3
            if (r11 == r6) goto L17f
            if (r11 == r12) goto L179
            switch(r11) {
                case 6: goto L179;
                case 7: goto L17f;
                case 8: goto L177;
                case 9: goto L173;
                case 10: goto L16e;
                default: goto L16d;
            }
        L16d:
            goto L184
        L16e:
            androidx.lifecycle.p r6 = r10.f2587h
            r10.i = r6
            goto L184
        L173:
            J1.q r6 = r10.f2582b
            r7 = r6
            goto L184
        L177:
            r7 = 0
            goto L184
        L179:
            J1.q r6 = r10.f2582b
            r5.add(r6)
            goto L184
        L17f:
            J1.q r6 = r10.f2582b
            r5.remove(r6)
        L184:
            int r9 = r9 + (-1)
            r6 = 1
            goto L15b
        L188:
            if (r19 != 0) goto L191
            boolean r5 = r13.f2610g
            if (r5 == 0) goto L18f
            goto L191
        L18f:
            r10 = 0
            goto L192
        L191:
            r10 = 1
        L192:
            int r9 = r20 + 1
            r5 = r26
            r6 = r17
            goto L30
        L19a:
            r17 = r6
            java.util.ArrayList r5 = r1.f2522K
            r5.clear()
            if (r17 != 0) goto L1d6
            int r5 = r1.f2540s
            r6 = 1
            if (r5 < r6) goto L1d6
            r5 = r26
        L1aa:
            if (r5 >= r3) goto L1d6
            java.lang.Object r6 = r0.get(r5)
            J1.a r6 = (J1.C0169a) r6
            java.util.ArrayList r6 = r6.f2605a
            int r7 = r6.size()
            r8 = 0
        L1b9:
            if (r8 >= r7) goto L1d3
            java.lang.Object r9 = r6.get(r8)
            int r8 = r8 + 1
            J1.O r9 = (J1.O) r9
            J1.q r9 = r9.f2582b
            if (r9 == 0) goto L1b9
            J1.H r10 = r9.f2690H
            if (r10 == 0) goto L1b9
            J1.N r9 = r1.f(r9)
            r4.w(r9)
            goto L1b9
        L1d3:
            int r5 = r5 + 1
            goto L1aa
        L1d6:
            java.lang.String r4 = "Unknown cmd: "
            r5 = r26
        L1da:
            r6 = -1
            if (r5 >= r3) goto L3b3
            java.lang.Object r7 = r0.get(r5)
            J1.a r7 = (J1.C0169a) r7
            java.lang.Object r8 = r2.get(r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L2dd
            r7.c(r6)
            J1.H r6 = r7.f2617p
            java.util.ArrayList r8 = r7.f2605a
            int r9 = r8.size()
            r10 = 1
            int r9 = r9 - r10
        L1fc:
            if (r9 < 0) goto L2da
            java.lang.Object r11 = r8.get(r9)
            J1.O r11 = (J1.O) r11
            J1.q r12 = r11.f2582b
            if (r12 == 0) goto L244
            J1.p r13 = r12.f2706X
            if (r13 != 0) goto L20d
            goto L213
        L20d:
            J1.p r13 = r12.g()
            r13.f2674a = r10
        L213:
            int r10 = r7.f
            r13 = 8194(0x2002, float:1.1482E-41)
            r14 = 4097(0x1001, float:5.741E-42)
            if (r10 == r14) goto L22e
            if (r10 == r13) goto L22b
            r13 = 4100(0x1004, float:5.745E-42)
            r14 = 8197(0x2005, float:1.1486E-41)
            if (r10 == r14) goto L22e
            r15 = 4099(0x1003, float:5.744E-42)
            if (r10 == r15) goto L22d
            if (r10 == r13) goto L22b
            r13 = 0
            goto L22e
        L22b:
            r13 = r14
            goto L22e
        L22d:
            r13 = r15
        L22e:
            J1.p r10 = r12.f2706X
            if (r10 != 0) goto L235
            if (r13 != 0) goto L235
            goto L23c
        L235:
            r12.g()
            J1.p r10 = r12.f2706X
            r10.f = r13
        L23c:
            r12.g()
            J1.p r10 = r12.f2706X
            r10.getClass()
        L244:
            int r10 = r11.f2581a
            switch(r10) {
                case 1: goto L2c4;
                case 2: goto L249;
                case 3: goto L2b5;
                case 4: goto L2a3;
                case 5: goto L290;
                case 6: goto L281;
                case 7: goto L26e;
                case 8: goto L269;
                case 9: goto L265;
                case 10: goto L25d;
                default: goto L249;
            }
        L249:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            int r3 = r11.f2581a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L25d:
            androidx.lifecycle.p r10 = r11.f2587h
            r6.V(r12, r10)
        L262:
            r10 = 1
            goto L2d6
        L265:
            r6.W(r12)
            goto L262
        L269:
            r10 = 0
            r6.W(r10)
            goto L262
        L26e:
            int r10 = r11.f2584d
            int r13 = r11.f2585e
            int r14 = r11.f
            int r11 = r11.f2586g
            r12.E(r10, r13, r14, r11)
            r10 = 1
            r6.U(r12, r10)
            r6.g(r12)
            goto L262
        L281:
            int r10 = r11.f2584d
            int r13 = r11.f2585e
            int r14 = r11.f
            int r11 = r11.f2586g
            r12.E(r10, r13, r14, r11)
            r6.c(r12)
            goto L262
        L290:
            int r10 = r11.f2584d
            int r13 = r11.f2585e
            int r14 = r11.f
            int r11 = r11.f2586g
            r12.E(r10, r13, r14, r11)
            r10 = 1
            r6.U(r12, r10)
            r6.E(r12)
            goto L262
        L2a3:
            int r10 = r11.f2584d
            int r13 = r11.f2585e
            int r14 = r11.f
            int r11 = r11.f2586g
            r12.E(r10, r13, r14, r11)
            r6.getClass()
            Y(r12)
            goto L262
        L2b5:
            int r10 = r11.f2584d
            int r13 = r11.f2585e
            int r14 = r11.f
            int r11 = r11.f2586g
            r12.E(r10, r13, r14, r11)
            r6.a(r12)
            goto L262
        L2c4:
            int r10 = r11.f2584d
            int r13 = r11.f2585e
            int r14 = r11.f
            int r11 = r11.f2586g
            r12.E(r10, r13, r14, r11)
            r10 = 1
            r6.U(r12, r10)
            r6.P(r12)
        L2d6:
            int r9 = r9 + (-1)
            goto L1fc
        L2da:
            r14 = 0
            goto L3af
        L2dd:
            r10 = 1
            r7.c(r10)
            J1.H r6 = r7.f2617p
            java.util.ArrayList r8 = r7.f2605a
            int r9 = r8.size()
            r12 = 0
        L2ea:
            if (r12 >= r9) goto L2da
            java.lang.Object r10 = r8.get(r12)
            J1.O r10 = (J1.O) r10
            J1.q r11 = r10.f2582b
            if (r11 == 0) goto L31a
            J1.p r13 = r11.f2706X
            if (r13 != 0) goto L2fb
            goto L302
        L2fb:
            J1.p r13 = r11.g()
            r14 = 0
            r13.f2674a = r14
        L302:
            int r13 = r7.f
            J1.p r14 = r11.f2706X
            if (r14 != 0) goto L30b
            if (r13 != 0) goto L30b
            goto L312
        L30b:
            r11.g()
            J1.p r14 = r11.f2706X
            r14.f = r13
        L312:
            r11.g()
            J1.p r13 = r11.f2706X
            r13.getClass()
        L31a:
            int r13 = r10.f2581a
            switch(r13) {
                case 1: goto L399;
                case 2: goto L31f;
                case 3: goto L38a;
                case 4: goto L37b;
                case 5: goto L368;
                case 6: goto L359;
                case 7: goto L345;
                case 8: goto L340;
                case 9: goto L33b;
                case 10: goto L333;
                default: goto L31f;
            }
        L31f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            int r3 = r10.f2581a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L333:
            androidx.lifecycle.p r10 = r10.i
            r6.V(r11, r10)
        L338:
            r14 = 0
            goto L3ab
        L33b:
            r13 = 0
            r6.W(r13)
            goto L338
        L340:
            r13 = 0
            r6.W(r11)
            goto L338
        L345:
            r13 = 0
            int r14 = r10.f2584d
            int r15 = r10.f2585e
            int r13 = r10.f
            int r10 = r10.f2586g
            r11.E(r14, r15, r13, r10)
            r14 = 0
            r6.U(r11, r14)
            r6.c(r11)
            goto L338
        L359:
            int r13 = r10.f2584d
            int r14 = r10.f2585e
            int r15 = r10.f
            int r10 = r10.f2586g
            r11.E(r13, r14, r15, r10)
            r6.g(r11)
            goto L338
        L368:
            int r13 = r10.f2584d
            int r14 = r10.f2585e
            int r15 = r10.f
            int r10 = r10.f2586g
            r11.E(r13, r14, r15, r10)
            r14 = 0
            r6.U(r11, r14)
            Y(r11)
            goto L338
        L37b:
            int r13 = r10.f2584d
            int r14 = r10.f2585e
            int r15 = r10.f
            int r10 = r10.f2586g
            r11.E(r13, r14, r15, r10)
            r6.E(r11)
            goto L338
        L38a:
            int r13 = r10.f2584d
            int r14 = r10.f2585e
            int r15 = r10.f
            int r10 = r10.f2586g
            r11.E(r13, r14, r15, r10)
            r6.P(r11)
            goto L338
        L399:
            int r13 = r10.f2584d
            int r14 = r10.f2585e
            int r15 = r10.f
            int r10 = r10.f2586g
            r11.E(r13, r14, r15, r10)
            r14 = 0
            r6.U(r11, r14)
            r6.a(r11)
        L3ab:
            int r12 = r12 + 1
            goto L2ea
        L3af:
            int r5 = r5 + 1
            goto L1da
        L3b3:
            r14 = 0
            int r4 = r3 + (-1)
            java.lang.Object r4 = r2.get(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = r26
        L3c2:
            if (r5 >= r3) goto L40e
            java.lang.Object r7 = r0.get(r5)
            J1.a r7 = (J1.C0169a) r7
            if (r4 == 0) goto L3ee
            java.util.ArrayList r8 = r7.f2605a
            int r8 = r8.size()
            r16 = 1
            int r8 = r8 + (-1)
        L3d6:
            if (r8 < 0) goto L40b
            java.util.ArrayList r9 = r7.f2605a
            java.lang.Object r9 = r9.get(r8)
            J1.O r9 = (J1.O) r9
            J1.q r9 = r9.f2582b
            if (r9 == 0) goto L3eb
            J1.N r9 = r1.f(r9)
            r9.k()
        L3eb:
            int r8 = r8 + (-1)
            goto L3d6
        L3ee:
            java.util.ArrayList r7 = r7.f2605a
            int r8 = r7.size()
            r12 = r14
        L3f5:
            if (r12 >= r8) goto L40b
            java.lang.Object r9 = r7.get(r12)
            int r12 = r12 + 1
            J1.O r9 = (J1.O) r9
            J1.q r9 = r9.f2582b
            if (r9 == 0) goto L3f5
            J1.N r9 = r1.f(r9)
            r9.k()
            goto L3f5
        L40b:
            int r5 = r5 + 1
            goto L3c2
        L40e:
            int r5 = r1.f2540s
            r10 = 1
            r1.K(r5, r10)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r7 = r26
        L41b:
            if (r7 >= r3) goto L44b
            java.lang.Object r8 = r0.get(r7)
            J1.a r8 = (J1.C0169a) r8
            java.util.ArrayList r8 = r8.f2605a
            int r9 = r8.size()
            r12 = r14
        L42a:
            if (r12 >= r9) goto L448
            java.lang.Object r10 = r8.get(r12)
            int r12 = r12 + 1
            J1.O r10 = (J1.O) r10
            J1.q r10 = r10.f2582b
            if (r10 == 0) goto L42a
            android.view.ViewGroup r10 = r10.f2702T
            if (r10 == 0) goto L42a
            x3.k r11 = r1.D()
            J1.h r10 = J1.C0176h.f(r10, r11)
            r5.add(r10)
            goto L42a
        L448:
            int r7 = r7 + 1
            goto L41b
        L44b:
            java.util.Iterator r5 = r5.iterator()
        L44f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L49a
            java.lang.Object r7 = r5.next()
            J1.h r7 = (J1.C0176h) r7
            r7.f2651d = r4
            java.util.ArrayList r8 = r7.f2649b
            monitor-enter(r8)
            r7.g()     // Catch: java.lang.Throwable -> L48e
            r9 = 0
            r7.f2652e = r9     // Catch: java.lang.Throwable -> L48e
            java.util.ArrayList r10 = r7.f2649b     // Catch: java.lang.Throwable -> L48e
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L48e
            int r10 = r10 + (-1)
        L46e:
            if (r10 < 0) goto L493
            java.util.ArrayList r11 = r7.f2649b     // Catch: java.lang.Throwable -> L48e
            java.lang.Object r11 = r11.get(r10)     // Catch: java.lang.Throwable -> L48e
            J1.T r11 = (J1.T) r11     // Catch: java.lang.Throwable -> L48e
            J1.q r12 = r11.f2600c     // Catch: java.lang.Throwable -> L48e
            android.view.View r12 = r12.f2703U     // Catch: java.lang.Throwable -> L48e
            int r12 = C0.S.c(r12)     // Catch: java.lang.Throwable -> L48e
            int r13 = r11.f2598a     // Catch: java.lang.Throwable -> L48e
            r14 = 2
            if (r13 != r14) goto L490
            if (r12 == r14) goto L490
            J1.q r10 = r11.f2600c     // Catch: java.lang.Throwable -> L48e
            J1.p r10 = r10.f2706X     // Catch: java.lang.Throwable -> L48e
            r7.f2652e = r9     // Catch: java.lang.Throwable -> L48e
            goto L493
        L48e:
            r0 = move-exception
            goto L498
        L490:
            int r10 = r10 + (-1)
            goto L46e
        L493:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L48e
            r7.c()
            goto L44f
        L498:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L48e
            throw r0
        L49a:
            r4 = r26
        L49c:
            if (r4 >= r3) goto L4bc
            java.lang.Object r5 = r0.get(r4)
            J1.a r5 = (J1.C0169a) r5
            java.lang.Object r7 = r2.get(r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L4b6
            int r7 = r5.f2619r
            if (r7 < 0) goto L4b6
            r5.f2619r = r6
        L4b6:
            r5.getClass()
            int r4 = r4 + 1
            goto L49c
        L4bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.H.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
