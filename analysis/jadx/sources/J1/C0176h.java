package J1;

import B0.C0050o;
import E.c0;
import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.wnapp.smspariaz.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import r1.C1574b;
import w1.AbstractC1835K;
import x3.C1899k;

/* JADX INFO: renamed from: J1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0176h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f2648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2649b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2650c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2651d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2652e = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0176h(ViewGroup viewGroup) {
        this.f2648a = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0176h f(ViewGroup viewGroup, C1899k c1899k) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0176h) {
            return (C0176h) tag;
        }
        c1899k.getClass();
        C0176h c0176h = new C0176h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0176h);
        return c0176h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, int i7, N n7) {
        synchronized (this.f2649b) {
            try {
                C1574b c1574b = new C1574b();
                T tD = d(n7.f2578c);
                if (tD != null) {
                    tD.c(i, i7);
                    return;
                }
                T t6 = new T(i, i7, n7, c1574b);
                this.f2649b.add(t6);
                t6.f2601d.add(new S(this, t6, 0));
                t6.f2601d.add(new S(this, t6, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(ArrayList arrayList, boolean z5) {
        boolean z6;
        ViewGroup viewGroup;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        T t6 = null;
        T t7 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            T t8 = (T) obj;
            int iC = C0.S.c(t8.f2600c.f2703U);
            int iA = O.c.a(t8.f2598a);
            if (iA != 0) {
                if (iA != 1) {
                    if (iA == 2 || iA == 3) {
                    }
                } else if (iC != 2) {
                    t7 = t8;
                }
            }
            if (iC == 2 && t6 == null) {
                t6 = t8;
            }
        }
        if (H.F(2)) {
            Log.v("FragmentManager", "Executing operations from " + t6 + " to " + t7);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = ((T) arrayList2.get(arrayList2.size() - 1)).f2600c;
        int size2 = arrayList2.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            C0184p c0184p = ((T) obj2).f2600c.f2706X;
            C0184p c0184p2 = abstractComponentCallbacksC0185q.f2706X;
            c0184p.f2675b = c0184p2.f2675b;
            c0184p.f2676c = c0184p2.f2676c;
            c0184p.f2677d = c0184p2.f2677d;
            c0184p.f2678e = c0184p2.f2678e;
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            T t9 = (T) obj3;
            C1574b c1574b = new C1574b();
            t9.d();
            HashSet hashSet = t9.f2602e;
            hashSet.add(c1574b);
            C0174f c0174f = new C0174f(t9, c1574b);
            c0174f.f2646d = false;
            c0174f.f2645c = z5;
            arrayList3.add(c0174f);
            C1574b c1574b2 = new C1574b();
            t9.d();
            hashSet.add(c1574b2);
            boolean z7 = !z5 ? t9 != t7 : t9 != t6;
            C0175g c0175g = new C0175g(t9, c1574b2);
            int i9 = t9.f2598a;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = t9.f2600c;
            if (i9 == 2) {
                if (z5) {
                    C0184p c0184p3 = abstractComponentCallbacksC0185q2.f2706X;
                } else {
                    abstractComponentCallbacksC0185q2.getClass();
                }
                if (z5) {
                    C0184p c0184p4 = abstractComponentCallbacksC0185q2.f2706X;
                } else {
                    C0184p c0184p5 = abstractComponentCallbacksC0185q2.f2706X;
                }
            } else if (z5) {
                C0184p c0184p6 = abstractComponentCallbacksC0185q2.f2706X;
            } else {
                abstractComponentCallbacksC0185q2.getClass();
            }
            if (z7) {
                if (z5) {
                    C0184p c0184p7 = abstractComponentCallbacksC0185q2.f2706X;
                } else {
                    abstractComponentCallbacksC0185q2.getClass();
                }
            }
            arrayList4.add(c0175g);
            t9.f2601d.add(new I4.a(this, arrayList5, t9, 1));
            arrayList2 = arrayList;
        }
        HashMap map = new HashMap();
        int size4 = arrayList4.size();
        int i10 = 0;
        while (i10 < size4) {
            Object obj4 = arrayList4.get(i10);
            i10++;
            T t10 = (T) ((C0175g) obj4).f990a;
            if (C0.S.c(t10.f2600c.f2703U) != t10.f2598a) {
            }
        }
        int size5 = arrayList4.size();
        int i11 = 0;
        while (i11 < size5) {
            Object obj5 = arrayList4.get(i11);
            i11++;
            C0175g c0175g2 = (C0175g) obj5;
            map.put((T) c0175g2.f990a, Boolean.FALSE);
            c0175g2.d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f2648a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z8 = false;
        int i12 = 0;
        while (i12 < size6) {
            Object obj6 = arrayList3.get(i12);
            i12++;
            C0174f c0174f2 = (C0174f) obj6;
            boolean z9 = zContainsValue;
            T t11 = (T) c0174f2.f990a;
            ArrayList arrayList7 = arrayList3;
            int iC2 = C0.S.c(t11.f2600c.f2703U);
            int i13 = t11.f2598a;
            int i14 = size6;
            if (iC2 == i13 || !(iC2 == 2 || i13 == 2)) {
                z6 = z8;
                viewGroup = viewGroup2;
                c0174f2.d();
                zContainsValue = z9;
                size6 = i14;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                z8 = z6;
            } else {
                C0050o c0050oN = c0174f2.n(context);
                if (c0050oN == null) {
                    c0174f2.d();
                } else {
                    Animator animator = (Animator) c0050oN.f500r;
                    if (animator == null) {
                        arrayList6.add(c0174f2);
                    } else {
                        T t12 = (T) c0174f2.f990a;
                        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q3 = t12.f2600c;
                        z6 = z8;
                        if (Boolean.TRUE.equals(map.get(t12))) {
                            if (H.F(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0185q3 + " as this Fragment was involved in a Transition.");
                            }
                            c0174f2.d();
                            viewGroup = viewGroup2;
                            zContainsValue = z9;
                            size6 = i14;
                            viewGroup2 = viewGroup;
                            arrayList3 = arrayList7;
                            z8 = z6;
                        } else {
                            boolean z10 = t12.f2598a == 3;
                            if (z10) {
                                arrayList5.remove(t12);
                            }
                            View view = abstractComponentCallbacksC0185q3.f2703U;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new C0172d(viewGroup3, view, z10, t12, c0174f2));
                            animator.setTarget(view);
                            animator.start();
                            if (H.F(2)) {
                                Log.v("FragmentManager", "Animator from operation " + t12 + " has started.");
                            }
                            ((C1574b) c0174f2.f991b).a(new C0050o(animator, t12));
                            zContainsValue = z9;
                            size6 = i14;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            z8 = true;
                        }
                    }
                }
                z6 = z8;
                viewGroup = viewGroup2;
                zContainsValue = z9;
                size6 = i14;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                z8 = z6;
            }
        }
        boolean z11 = zContainsValue;
        boolean z12 = z8;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i15 = 0;
        while (i15 < size7) {
            Object obj7 = arrayList6.get(i15);
            i15++;
            C0174f c0174f3 = (C0174f) obj7;
            T t13 = (T) c0174f3.f990a;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q4 = t13.f2600c;
            if (z11) {
                if (H.F(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0185q4 + " as Animations cannot run alongside Transitions.");
                }
                c0174f3.d();
            } else if (z12) {
                if (H.F(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0185q4 + " as Animations cannot run alongside Animators.");
                }
                c0174f3.d();
            } else {
                View view2 = abstractComponentCallbacksC0185q4.f2703U;
                C0050o c0050oN2 = c0174f3.n(context);
                c0050oN2.getClass();
                Animation animation = (Animation) c0050oN2.f499q;
                animation.getClass();
                int i16 = size7;
                if (t13.f2598a != 1) {
                    view2.startAnimation(animation);
                    c0174f3.d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    v vVar = new v(animation, viewGroup4, view2);
                    vVar.setAnimationListener(new AnimationAnimationListenerC0173e(t13, viewGroup4, view2, c0174f3));
                    view2.startAnimation(vVar);
                    if (H.F(2)) {
                        Log.v("FragmentManager", "Animation from operation " + t13 + " has started.");
                    }
                }
                C1574b c1574b3 = (C1574b) c0174f3.f991b;
                c0 c0Var = new c0();
                c0Var.f1552q = view2;
                c0Var.f1553r = viewGroup4;
                c0Var.f1554s = c0174f3;
                c0Var.f1555t = t13;
                c1574b3.a(c0Var);
                size7 = i16;
            }
        }
        int size8 = arrayList5.size();
        int i17 = 0;
        while (i17 < size8) {
            Object obj8 = arrayList5.get(i17);
            i17++;
            T t14 = (T) obj8;
            C0.S.a(t14.f2600c.f2703U, t14.f2598a);
        }
        arrayList5.clear();
        if (H.F(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + t6 + " to " + t7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (this.f2652e) {
            return;
        }
        ViewGroup viewGroup = this.f2648a;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f2651d = false;
            return;
        }
        synchronized (this.f2649b) {
            try {
                if (!this.f2649b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2650c);
                    this.f2650c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        T t6 = (T) obj;
                        if (H.F(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + t6);
                        }
                        t6.a();
                        if (!t6.f2603g) {
                            this.f2650c.add(t6);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.f2649b);
                    this.f2649b.clear();
                    this.f2650c.addAll(arrayList2);
                    if (H.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((T) obj2).d();
                    }
                    b(arrayList2, this.f2651d);
                    this.f2651d = false;
                    if (H.F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T d(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        ArrayList arrayList = this.f2649b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            T t6 = (T) obj;
            if (t6.f2600c.equals(abstractComponentCallbacksC0185q) && !t6.f) {
                return t6;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        String str;
        String str2;
        if (H.F(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f2648a;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f2649b) {
            try {
                g();
                ArrayList arrayList = this.f2649b;
                int size = arrayList.size();
                int i = 0;
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((T) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.f2650c);
                int size2 = arrayList2.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    T t6 = (T) obj2;
                    if (H.F(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f2648a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(t6);
                        Log.v("FragmentManager", sb.toString());
                    }
                    t6.a();
                }
                ArrayList arrayList3 = new ArrayList(this.f2649b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    T t7 = (T) obj3;
                    if (H.F(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f2648a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(t7);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    t7.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        ArrayList arrayList = this.f2649b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            T t6 = (T) obj;
            if (t6.f2599b == 2) {
                t6.c(C0.S.b(t6.f2600c.D().getVisibility()), 1);
            }
        }
    }
}
