package J1;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import r1.C1574b;
import r1.InterfaceC1573a;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0185q f2600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f2601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f2602e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N f2604h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public T(int i, int i7, N n7, C1574b c1574b) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
        this.f2601d = new ArrayList();
        this.f2602e = new HashSet();
        this.f = false;
        this.f2603g = false;
        this.f2598a = i;
        this.f2599b = i7;
        this.f2600c = abstractComponentCallbacksC0185q;
        c1574b.a(new k3.d(7, this));
        this.f2604h = n7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void a() {
        HashSet hashSet = this.f2602e;
        if (this.f) {
            return;
        }
        this.f = true;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1574b c1574b = (C1574b) obj;
            synchronized (c1574b) {
                try {
                    if (!c1574b.f16270a) {
                        c1574b.f16270a = true;
                        c1574b.f16272c = true;
                        InterfaceC1573a interfaceC1573a = c1574b.f16271b;
                        if (interfaceC1573a != null) {
                            try {
                                interfaceC1573a.onCancel();
                            } catch (Throwable th) {
                                synchronized (c1574b) {
                                    c1574b.f16272c = false;
                                    c1574b.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c1574b) {
                            c1574b.f16272c = false;
                            c1574b.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (!this.f2603g) {
            if (H.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2603g = true;
            ArrayList arrayList = this.f2601d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.f2604h.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, int i7) {
        int iA = O.c.a(i7);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2600c;
        if (iA == 0) {
            if (this.f2598a != 1) {
                if (H.F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0185q + " mFinalState = " + C0.S.B(this.f2598a) + " -> " + C0.S.B(i) + ". ");
                }
                this.f2598a = i;
                return;
            }
            return;
        }
        if (iA == 1) {
            if (this.f2598a == 1) {
                if (H.F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0185q + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + C0.S.A(this.f2599b) + " to ADDING.");
                }
                this.f2598a = 2;
                this.f2599b = 2;
                return;
            }
            return;
        }
        if (iA != 2) {
            return;
        }
        if (H.F(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC0185q + " mFinalState = " + C0.S.B(this.f2598a) + " -> REMOVED. mLifecycleImpact  = " + C0.S.A(this.f2599b) + " to REMOVING.");
        }
        this.f2598a = 1;
        this.f2599b = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        int i = this.f2599b;
        N n7 = this.f2604h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = n7.f2578c;
                View viewD = abstractComponentCallbacksC0185q.D();
                if (H.F(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewD.findFocus() + " on view " + viewD + " for Fragment " + abstractComponentCallbacksC0185q);
                }
                viewD.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = n7.f2578c;
        View viewFindFocus = abstractComponentCallbacksC0185q2.f2703U.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC0185q2.g().f2681k = viewFindFocus;
            if (H.F(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0185q2);
            }
        }
        View viewD2 = this.f2600c.D();
        if (viewD2.getParent() == null) {
            n7.b();
            viewD2.setAlpha(0.0f);
        }
        if (viewD2.getAlpha() == 0.0f && viewD2.getVisibility() == 0) {
            viewD2.setVisibility(4);
        }
        C0184p c0184p = abstractComponentCallbacksC0185q2.f2706X;
        viewD2.setAlpha(c0184p == null ? 1.0f : c0184p.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + C0.S.B(this.f2598a) + "} {mLifecycleImpact = " + C0.S.A(this.f2599b) + "} {mFragment = " + this.f2600c + "}";
    }
}
