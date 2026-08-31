package J1;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: J1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0169a implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2609e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f2611h;
    public int i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f2613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f2614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f2615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final H f2617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2619r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0169a(H h4) {
        h4.C();
        C0188u c0188u = h4.f2541t;
        if (c0188u != null) {
            c0188u.f2735u.getClassLoader();
        }
        this.f2605a = new ArrayList();
        this.f2616o = false;
        this.f2619r = -1;
        this.f2617p = h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J1.F
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (H.F(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2610g) {
            return true;
        }
        H h4 = this.f2617p;
        if (h4.f2528d == null) {
            h4.f2528d = new ArrayList();
        }
        h4.f2528d.add(this);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(O o6) {
        this.f2605a.add(o6);
        o6.f2584d = this.f2606b;
        o6.f2585e = this.f2607c;
        o6.f = this.f2608d;
        o6.f2586g = this.f2609e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        if (this.f2610g) {
            if (H.F(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f2605a;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                O o6 = (O) arrayList.get(i7);
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = o6.f2582b;
                if (abstractComponentCallbacksC0185q != null) {
                    abstractComponentCallbacksC0185q.f2689G += i;
                    if (H.F(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + o6.f2582b + " to " + o6.f2582b.f2689G);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(boolean z5) {
        if (this.f2618q) {
            throw new IllegalStateException("commit already called");
        }
        if (H.F(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Q());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f2618q = true;
        boolean z6 = this.f2610g;
        H h4 = this.f2617p;
        if (z6) {
            this.f2619r = h4.i.getAndIncrement();
        } else {
            this.f2619r = -1;
        }
        h4.w(this, z5);
        return this.f2619r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q, String str, int i7) {
        String str2 = abstractComponentCallbacksC0185q.f2709a0;
        if (str2 != null) {
            K1.d.c(abstractComponentCallbacksC0185q, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0185q.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0185q.f2696N;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0185q + ": was " + abstractComponentCallbacksC0185q.f2696N + " now " + str);
            }
            abstractComponentCallbacksC0185q.f2696N = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0185q + " with tag " + str + " to container view with no id");
            }
            int i8 = abstractComponentCallbacksC0185q.f2694L;
            if (i8 != 0 && i8 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0185q + ": was " + abstractComponentCallbacksC0185q.f2694L + " now " + i);
            }
            abstractComponentCallbacksC0185q.f2694L = i;
            abstractComponentCallbacksC0185q.f2695M = i;
        }
        b(new O(i7, abstractComponentCallbacksC0185q));
        abstractComponentCallbacksC0185q.f2690H = this.f2617p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2611h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2619r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2618q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f2606b != 0 || this.f2607c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2606b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2607c));
            }
            if (this.f2608d != 0 || this.f2609e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2608d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2609e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.f2612k != 0 || this.f2613l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2612k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2613l);
            }
        }
        ArrayList arrayList = this.f2605a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            O o6 = (O) arrayList.get(i);
            switch (o6.f2581a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + o6.f2581a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(o6.f2582b);
            if (z5) {
                if (o6.f2584d != 0 || o6.f2585e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(o6.f2584d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(o6.f2585e));
                }
                if (o6.f != 0 || o6.f2586g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(o6.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(o6.f2586g));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2619r >= 0) {
            sb.append(" #");
            sb.append(this.f2619r);
        }
        if (this.f2611h != null) {
            sb.append(" ");
            sb.append(this.f2611h);
        }
        sb.append("}");
        return sb.toString();
    }
}
