package q2;

import E.c0;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import r.C1554e;
import r.C1566q;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import y4.AbstractC1918b;

/* JADX INFO: renamed from: q2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1509n implements Cloneable {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final Animator[] f15966M = new Animator[0];

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int[] f15967N = {2, 1, 3, 4};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final O3.B f15968O = new O3.B(28);

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final ThreadLocal f15969P = new ThreadLocal();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f15970A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f15971B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC1507l[] f15972C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f15982q = getClass().getName();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f15983r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f15984s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TimeInterpolator f15985t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f15986u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f15987v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c0 f15988w = new c0(14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c0 f15989x = new c0(14);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C1496a f15990y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f15991z = f15967N;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f15973D = new ArrayList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Animator[] f15974E = f15966M;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f15975F = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f15976G = false;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15977H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public AbstractC1509n f15978I = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f15979J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f15980K = new ArrayList();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public O3.B f15981L = f15968O;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(c0 c0Var, View view, C1517v c1517v) {
        C1554e c1554e = (C1554e) c0Var.f1552q;
        C1554e c1554e2 = (C1554e) c0Var.f1555t;
        SparseArray sparseArray = (SparseArray) c0Var.f1553r;
        C1566q c1566q = (C1566q) c0Var.f1554s;
        c1554e.put(view, c1517v);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        String strF = AbstractC1826B.f(view);
        if (strF != null) {
            if (c1554e2.containsKey(strF)) {
                c1554e2.put(strF, null);
            } else {
                c1554e2.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1566q.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1566q.e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1566q.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1566q.e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1554e p() {
        ThreadLocal threadLocal = f15969P;
        C1554e c1554e = (C1554e) threadLocal.get();
        if (c1554e != null) {
            return c1554e;
        }
        C1554e c1554e2 = new C1554e(0);
        threadLocal.set(c1554e2);
        return c1554e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean u(C1517v c1517v, C1517v c1517v2, String str) {
        Object obj = c1517v.f16002a.get(str);
        Object obj2 = c1517v2.f16002a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A(long j) {
        this.f15984s = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void C(TimeInterpolator timeInterpolator) {
        this.f15985t = timeInterpolator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void D(O3.B b7) {
        if (b7 == null) {
            this.f15981L = f15968O;
        } else {
            this.f15981L = b7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void F(long j) {
        this.f15983r = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G() {
        if (this.f15975F == 0) {
            v(this, InterfaceC1508m.f15961l);
            this.f15977H = false;
        }
        this.f15975F++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f15984s != -1) {
            sb.append("dur(");
            sb.append(this.f15984s);
            sb.append(") ");
        }
        if (this.f15983r != -1) {
            sb.append("dly(");
            sb.append(this.f15983r);
            sb.append(") ");
        }
        if (this.f15985t != null) {
            sb.append("interp(");
            sb.append(this.f15985t);
            sb.append(") ");
        }
        ArrayList arrayList = this.f15986u;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f15987v;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i7));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(InterfaceC1507l interfaceC1507l) {
        if (this.f15979J == null) {
            this.f15979J = new ArrayList();
        }
        this.f15979J.add(interfaceC1507l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        ArrayList arrayList = this.f15973D;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f15974E);
        this.f15974E = f15966M;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f15974E = animatorArr;
        v(this, InterfaceC1508m.f15963n);
    }

    public abstract void d(C1517v c1517v);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(View view, boolean z5) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1517v c1517v = new C1517v(view);
            if (z5) {
                g(c1517v);
            } else {
                d(c1517v);
            }
            c1517v.f16004c.add(this);
            f(c1517v);
            if (z5) {
                b(this.f15988w, view, c1517v);
            } else {
                b(this.f15989x, view, c1517v);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z5);
            }
        }
    }

    public abstract void g(C1517v c1517v);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(ViewGroup viewGroup, boolean z5) {
        i(z5);
        ArrayList arrayList = this.f15986u;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f15987v;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z5);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C1517v c1517v = new C1517v(viewFindViewById);
                if (z5) {
                    g(c1517v);
                } else {
                    d(c1517v);
                }
                c1517v.f16004c.add(this);
                f(c1517v);
                if (z5) {
                    b(this.f15988w, viewFindViewById, c1517v);
                } else {
                    b(this.f15989x, viewFindViewById, c1517v);
                }
            }
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            View view = (View) arrayList2.get(i7);
            C1517v c1517v2 = new C1517v(view);
            if (z5) {
                g(c1517v2);
            } else {
                d(c1517v2);
            }
            c1517v2.f16004c.add(this);
            f(c1517v2);
            if (z5) {
                b(this.f15988w, view, c1517v2);
            } else {
                b(this.f15989x, view, c1517v2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(boolean z5) {
        if (z5) {
            ((C1554e) this.f15988w.f1552q).clear();
            ((SparseArray) this.f15988w.f1553r).clear();
            ((C1566q) this.f15988w.f1554s).a();
        } else {
            ((C1554e) this.f15989x.f1552q).clear();
            ((SparseArray) this.f15989x.f1553r).clear();
            ((C1566q) this.f15989x.f1554s).a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: j */
    public AbstractC1509n clone() {
        try {
            AbstractC1509n abstractC1509n = (AbstractC1509n) super.clone();
            abstractC1509n.f15980K = new ArrayList();
            abstractC1509n.f15988w = new c0(14);
            abstractC1509n.f15989x = new c0(14);
            abstractC1509n.f15970A = null;
            abstractC1509n.f15971B = null;
            abstractC1509n.f15978I = this;
            abstractC1509n.f15979J = null;
            return abstractC1509n;
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Animator k(ViewGroup viewGroup, C1517v c1517v, C1517v c1517v2) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(ViewGroup viewGroup, c0 c0Var, c0 c0Var2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i7;
        View view;
        C1517v c1517v;
        Animator animator;
        C1517v c1517v2;
        C1554e c1554eP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i8 = 0;
        while (i8 < size) {
            C1517v c1517v3 = (C1517v) arrayList.get(i8);
            C1517v c1517v4 = (C1517v) arrayList2.get(i8);
            if (c1517v3 != null && !c1517v3.f16004c.contains(this)) {
                c1517v3 = null;
            }
            if (c1517v4 != null && !c1517v4.f16004c.contains(this)) {
                c1517v4 = null;
            }
            if ((c1517v3 != null || c1517v4 != null) && (c1517v3 == null || c1517v4 == null || s(c1517v3, c1517v4))) {
                Animator animatorK = k(viewGroup, c1517v3, c1517v4);
                if (animatorK != null) {
                    String str = this.f15982q;
                    if (c1517v4 != null) {
                        view = c1517v4.f16003b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            c1517v2 = new C1517v(view);
                            C1517v c1517v5 = (C1517v) ((C1554e) c0Var2.f1552q).get(view);
                            i = size;
                            if (c1517v5 != null) {
                                int i9 = 0;
                                while (i9 < strArrQ.length) {
                                    String str2 = strArrQ[i9];
                                    int i10 = i8;
                                    c1517v2.f16002a.put(str2, c1517v5.f16002a.get(str2));
                                    i9++;
                                    i8 = i10;
                                    c1517v5 = c1517v5;
                                }
                            }
                            i7 = i8;
                            int i11 = c1554eP.f16166s;
                            int i12 = 0;
                            while (true) {
                                if (i12 >= i11) {
                                    animator = animatorK;
                                    break;
                                }
                                C1506k c1506k = (C1506k) c1554eP.get((Animator) c1554eP.f(i12));
                                if (c1506k.f15958c != null && c1506k.f15956a == view && c1506k.f15957b.equals(str) && c1506k.f15958c.equals(c1517v2)) {
                                    animator = null;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            i = size;
                            i7 = i8;
                            animator = animatorK;
                            c1517v2 = null;
                        }
                        animatorK = animator;
                        c1517v = c1517v2;
                    } else {
                        i = size;
                        i7 = i8;
                        view = c1517v3.f16003b;
                        c1517v = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C1506k c1506k2 = new C1506k();
                        c1506k2.f15956a = view;
                        c1506k2.f15957b = str;
                        c1506k2.f15958c = c1517v;
                        c1506k2.f15959d = windowId;
                        c1506k2.f15960e = this;
                        c1506k2.f = animatorK;
                        c1554eP.put(animatorK, c1506k2);
                        this.f15980K.add(animatorK);
                    }
                }
                i8 = i7 + 1;
                size = i;
            }
            i = size;
            i7 = i8;
            i8 = i7 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                C1506k c1506k3 = (C1506k) c1554eP.get((Animator) this.f15980K.get(sparseIntArray.keyAt(i13)));
                c1506k3.f.setStartDelay(c1506k3.f.getStartDelay() + (((long) sparseIntArray.valueAt(i13)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        int i = this.f15975F - 1;
        this.f15975F = i;
        if (i == 0) {
            v(this, InterfaceC1508m.f15962m);
            for (int i7 = 0; i7 < ((C1566q) this.f15988w.f1554s).g(); i7++) {
                View view = (View) ((C1566q) this.f15988w.f1554s).h(i7);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i8 = 0; i8 < ((C1566q) this.f15989x.f1554s).g(); i8++) {
                View view2 = (View) ((C1566q) this.f15989x.f1554s).h(i8);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f15977H = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f15971B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f15970A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (q2.C1517v) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final q2.C1517v n(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            q2.a r0 = r4.f15990y
            if (r0 == 0) goto L9
            q2.v r5 = r0.n(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f15970A
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f15971B
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            q2.v r3 = (q2.C1517v) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f16003b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.f15971B
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f15970A
        L35:
            java.lang.Object r5 = r5.get(r2)
            q2.v r5 = (q2.C1517v) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.AbstractC1509n.n(android.view.View, boolean):q2.v");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC1509n o() {
        C1496a c1496a = this.f15990y;
        return c1496a != null ? c1496a.o() : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] q() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1517v r(View view, boolean z5) {
        C1496a c1496a = this.f15990y;
        if (c1496a != null) {
            return c1496a.r(view, z5);
        }
        return (C1517v) ((C1554e) (z5 ? this.f15988w : this.f15989x).f1552q).get(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean s(C1517v c1517v, C1517v c1517v2) {
        if (c1517v != null && c1517v2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (u(c1517v, c1517v2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c1517v.f16002a.keySet().iterator();
                while (it.hasNext()) {
                    if (u(c1517v, c1517v2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f15986u;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f15987v;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return H("");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(AbstractC1509n abstractC1509n, InterfaceC1508m interfaceC1508m) {
        AbstractC1509n abstractC1509n2 = this.f15978I;
        if (abstractC1509n2 != null) {
            abstractC1509n2.v(abstractC1509n, interfaceC1508m);
        }
        ArrayList arrayList = this.f15979J;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f15979J.size();
        InterfaceC1507l[] interfaceC1507lArr = this.f15972C;
        if (interfaceC1507lArr == null) {
            interfaceC1507lArr = new InterfaceC1507l[size];
        }
        this.f15972C = null;
        InterfaceC1507l[] interfaceC1507lArr2 = (InterfaceC1507l[]) this.f15979J.toArray(interfaceC1507lArr);
        for (int i = 0; i < size; i++) {
            interfaceC1508m.a(interfaceC1507lArr2[i], abstractC1509n);
            interfaceC1507lArr2[i] = null;
        }
        this.f15972C = interfaceC1507lArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void w(View view) {
        if (this.f15977H) {
            return;
        }
        ArrayList arrayList = this.f15973D;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f15974E);
        this.f15974E = f15966M;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f15974E = animatorArr;
        v(this, InterfaceC1508m.f15964o);
        this.f15976G = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1509n x(InterfaceC1507l interfaceC1507l) {
        AbstractC1509n abstractC1509n;
        ArrayList arrayList = this.f15979J;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC1507l) && (abstractC1509n = this.f15978I) != null) {
                abstractC1509n.x(interfaceC1507l);
            }
            if (this.f15979J.size() == 0) {
                this.f15979J = null;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y(View view) {
        if (this.f15976G) {
            if (!this.f15977H) {
                ArrayList arrayList = this.f15973D;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f15974E);
                this.f15974E = f15966M;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f15974E = animatorArr;
                v(this, InterfaceC1508m.f15965p);
            }
            this.f15976G = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void z() {
        G();
        C1554e c1554eP = p();
        ArrayList arrayList = this.f15980K;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (c1554eP.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new C1505j(this, c1554eP));
                    long j = this.f15984s;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j7 = this.f15983r;
                    if (j7 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j7);
                    }
                    TimeInterpolator timeInterpolator = this.f15985t;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new Z3.a(2, this));
                    animator.start();
                }
            }
        }
        this.f15980K.clear();
        m();
    }

    public void E() {
    }

    public void B(AbstractC1918b abstractC1918b) {
    }

    public void f(C1517v c1517v) {
    }
}
