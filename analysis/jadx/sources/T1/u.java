package T1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.AbstractC1362a;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W1.j f7418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3.b f7419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f7420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7421e;
    public final J1.z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7422g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(Context context) {
        Object next;
        kotlin.jvm.internal.m.e(context, "context");
        this.f7417a = context;
        this.f7418b = new W1.j(this, new f(this, 0));
        this.f7419c = new C3.b(context);
        Iterator it = I5.k.R(context, new I5.m(12)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f7420d = (Activity) next;
        this.f = new J1.z(1, this);
        this.f7422g = true;
        A a7 = this.f7418b.f8081s;
        a7.a(new t(a7));
        this.f7418b.f8081s.a(new b(this.f7417a));
        AbstractC1362a.d(new f(this, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(u uVar, String route) {
        uVar.getClass();
        kotlin.jvm.internal.m.e(route, "route");
        W1.j jVar = uVar.f7418b;
        jVar.getClass();
        if (jVar.f8068c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + jVar + '.').toString());
        }
        r rVarI = jVar.i();
        o oVarJ = rVarI.j(route, true, rVarI);
        if (oVarJ == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + jVar.f8068c);
        }
        p pVar = oVarJ.f7397q;
        Bundle bundleD = pVar.d(oVarJ.f7398r);
        if (bundleD == null) {
            bundleD = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
        }
        int i = p.f7402u;
        String str = (String) pVar.f7404r.f8095e;
        String uriString = str != null ? "android-app://androidx.navigation/".concat(str) : "";
        kotlin.jvm.internal.m.e(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        kotlin.jvm.internal.m.d(uri, "parse(...)");
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleD.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        jVar.k(pVar, bundleD, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d a() {
        Object next;
        Iterator it = n5.l.w0(this.f7418b.f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((I5.a) I5.k.Q(it)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((d) next).f7354r instanceof r)) {
                break;
            }
        }
        return (d) next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        W1.j jVar = this.f7418b;
        if (jVar.f.isEmpty()) {
            return;
        }
        p pVarF = jVar.f();
        kotlin.jvm.internal.m.b(pVarF);
        if (jVar.l(pVarF.f7404r.f8091a, true, false)) {
            jVar.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f7417a.getClassLoader());
        }
        W1.j jVar = this.f7418b;
        LinkedHashMap linkedHashMap = jVar.f8075m;
        if (bundle != null) {
            jVar.f8069d = bundle.containsKey("android-support-nav:controller:navigatorState") ? I1.k0("android-support-nav:controller:navigatorState", bundle) : null;
            jVar.f8070e = bundle.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) I1.l0("android-support-nav:controller:backStack", bundle).toArray(new Bundle[0]) : null;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                if (intArray == null) {
                    K1.x("android-support-nav:controller:backStackDestIds");
                    throw null;
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                if (stringArrayList == null) {
                    K1.x("android-support-nav:controller:backStackIds");
                    throw null;
                }
                int length = intArray.length;
                int i = 0;
                int i7 = 0;
                while (i < length) {
                    int i8 = i7 + 1;
                    jVar.f8074l.put(Integer.valueOf(intArray[i]), !kotlin.jvm.internal.m.a(stringArrayList.get(i7), "") ? stringArrayList.get(i7) : null);
                    i++;
                    i7 = i8;
                }
            }
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 == null) {
                    K1.x("android-support-nav:controller:backStackStates");
                    throw null;
                }
                int size = stringArrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    String str = stringArrayList2.get(i9);
                    i9++;
                    String str2 = str;
                    String key = "android-support-nav:controller:backStackStates:" + str2;
                    kotlin.jvm.internal.m.e(key, "key");
                    if (bundle.containsKey(key)) {
                        ArrayList arrayListL0 = I1.l0("android-support-nav:controller:backStackStates:" + str2, bundle);
                        n5.j jVar2 = new n5.j(arrayListL0.size());
                        int size2 = arrayListL0.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj = arrayListL0.get(i10);
                            i10++;
                            jVar2.addLast(new e((Bundle) obj));
                        }
                        linkedHashMap.put(str2, jVar2);
                    }
                }
            }
        }
        if (bundle != null) {
            boolean z5 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean boolValueOf = (z5 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z5) : null;
            this.f7421e = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle e() {
        Bundle bundleG;
        W1.j jVar = this.f7418b;
        LinkedHashMap linkedHashMap = jVar.f8075m;
        n5.j<d> jVar2 = jVar.f;
        LinkedHashMap linkedHashMap2 = jVar.f8074l;
        ArrayList arrayList = new ArrayList();
        Bundle bundleG2 = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
        for (Map.Entry entry : n5.x.O(jVar.f8081s.f7351a).entrySet()) {
            ((z) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundleG = null;
        } else {
            bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
            P1.J(bundleG2, "android-support-nav:controller:navigatorState:names", arrayList);
            P1.H(bundleG, "android-support-nav:controller:navigatorState", bundleG2);
        }
        if (!jVar2.isEmpty()) {
            if (bundleG == null) {
                bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (d entry2 : jVar2) {
                kotlin.jvm.internal.m.e(entry2, "entry");
                int i = entry2.f7354r.f7404r.f8091a;
                String str = entry2.f7358v;
                W1.c cVar = entry2.f7360x;
                Bundle bundleA = cVar.a();
                Bundle bundleG3 = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
                cVar.f8039h.A(bundleG3);
                Bundle bundleG4 = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
                P1.I("nav-entry-state:id", str, bundleG4);
                bundleG4.putInt("nav-entry-state:destination-id", i);
                if (bundleA == null) {
                    bundleA = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
                }
                P1.H(bundleG4, "nav-entry-state:args", bundleA);
                P1.H(bundleG4, "nav-entry-state:saved-state", bundleG3);
                arrayList2.add(bundleG4);
            }
            bundleG.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundleG == null) {
                bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i7 = 0;
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry3.getKey()).intValue();
                String str2 = (String) entry3.getValue();
                int i8 = i7 + 1;
                iArr[i7] = iIntValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i7 = i8;
            }
            bundleG.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            P1.J(bundleG, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleG == null) {
                bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                String str3 = (String) entry4.getKey();
                n5.j jVar3 = (n5.j) entry4.getValue();
                arrayList4.add(str3);
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                Iterator it = jVar3.iterator();
                while (it.hasNext()) {
                    W1.d dVar = ((e) it.next()).f7361a;
                    dVar.getClass();
                    Bundle bundleG5 = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
                    P1.I("nav-entry-state:id", (String) dVar.f8044b, bundleG5);
                    bundleG5.putInt("nav-entry-state:destination-id", dVar.f8043a);
                    Bundle bundleG6 = (Bundle) dVar.f8045c;
                    if (bundleG6 == null) {
                        bundleG6 = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
                    }
                    P1.H(bundleG5, "nav-entry-state:args", bundleG6);
                    P1.H(bundleG5, "nav-entry-state:saved-state", (Bundle) dVar.f8046d);
                    arrayList5.add(bundleG5);
                }
                String key = "android-support-nav:controller:backStackStates:" + str3;
                kotlin.jvm.internal.m.e(key, "key");
                bundleG.putParcelableArrayList(key, arrayList5);
            }
            P1.J(bundleG, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (this.f7421e) {
            if (bundleG == null) {
                bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
            }
            bundleG.putBoolean("android-support-nav:controller:deepLinkHandled", this.f7421e);
        }
        return bundleG;
    }
}
