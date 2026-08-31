package T1;

import B0.G0;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.C1371j;
import m5.C1376o;
import r.S;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f7402u = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f7403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final W1.l f7404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r f7405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final S f7406t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(z navigator) {
        kotlin.jvm.internal.m.e(navigator, "navigator");
        LinkedHashMap linkedHashMap = A.f7350b;
        this.f7403q = C3.a.z(navigator.getClass());
        this.f7404r = new W1.l(this);
        this.f7406t = new S(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Bundle d(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7404r.f8094d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            throw new ClassCastException();
        }
        if (bundle != null) {
            bundleG.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                throw new ClassCastException();
            }
        }
        return bundleG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Ld2
        L5:
            r1 = 0
            if (r11 == 0) goto Ld3
            boolean r2 = r11 instanceof T1.p
            if (r2 != 0) goto Le
            goto Ld3
        Le:
            W1.l r2 = r10.f7404r
            java.lang.Object r3 = r2.f8093c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            T1.p r11 = (T1.p) r11
            r.S r4 = r11.f7406t
            W1.l r5 = r11.f7404r
            java.lang.Object r6 = r5.f8093c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r3 = kotlin.jvm.internal.m.a(r3, r6)
            r.S r6 = r10.f7406t
            int r7 = r6.f()
            int r8 = r4.f()
            if (r7 != r8) goto L5e
            r.T r7 = new r.T
            r7.<init>(r6)
            I5.i r7 = I5.k.Q(r7)
            I5.a r7 = (I5.a) r7
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r6.c(r8)
            java.lang.Object r8 = r4.c(r8)
            boolean r8 = kotlin.jvm.internal.m.a(r9, r8)
            if (r8 != 0) goto L3d
            goto L5e
        L5c:
            r4 = r0
            goto L5f
        L5e:
            r4 = r1
        L5f:
            java.util.Map r6 = r10.g()
            int r6 = r6.size()
            java.util.Map r7 = r11.g()
            int r7 = r7.size()
            if (r6 != r7) goto Lb7
            java.util.Map r6 = r10.g()
            java.util.Set r6 = r6.entrySet()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.m.e(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        L84:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb5
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.util.Map r8 = r11.g()
            java.lang.Object r9 = r7.getKey()
            boolean r8 = r8.containsKey(r9)
            if (r8 == 0) goto Lb7
            java.util.Map r8 = r11.g()
            java.lang.Object r9 = r7.getKey()
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r7 = r7.getValue()
            boolean r7 = kotlin.jvm.internal.m.a(r8, r7)
            if (r7 == 0) goto Lb7
            goto L84
        Lb5:
            r11 = r0
            goto Lb8
        Lb7:
            r11 = r1
        Lb8:
            int r6 = r2.f8091a
            int r7 = r5.f8091a
            if (r6 != r7) goto Ld3
            java.lang.Object r2 = r2.f8095e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r5.f8095e
            java.lang.String r5 = (java.lang.String) r5
            boolean r2 = kotlin.jvm.internal.m.a(r2, r5)
            if (r2 == 0) goto Ld3
            if (r3 == 0) goto Ld3
            if (r4 == 0) goto Ld3
            if (r11 == 0) goto Ld3
        Ld2:
            return r0
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.p.equals(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Map g() {
        return n5.x.O((LinkedHashMap) this.f7404r.f8094d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o h(G0 g02) {
        boolean zC;
        J5.k kVar;
        G0 g0B;
        W1.l lVar = this.f7404r;
        LinkedHashMap arguments = (LinkedHashMap) lVar.f8094d;
        Uri uri = (Uri) g02.f234r;
        ArrayList arrayList = (ArrayList) lVar.f8093c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        o oVar = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            n nVar = (n) obj;
            nVar.getClass();
            C1376o c1376o = nVar.f7391d;
            if (((J5.k) c1376o.getValue()) == null) {
                zC = true;
            } else if (uri == null) {
                zC = false;
            } else {
                J5.k kVar2 = (J5.k) c1376o.getValue();
                kotlin.jvm.internal.m.b(kVar2);
                zC = kVar2.c(uri.toString());
            }
            if (zC) {
                Bundle bundleD = uri != null ? nVar.d(uri, arguments) : null;
                int iB = nVar.b(uri);
                String str = (String) g02.f235s;
                boolean z5 = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z5) {
                        kotlin.jvm.internal.m.e(arguments, "arguments");
                        Bundle bundleG = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
                        if (uri != null && (kVar = (J5.k) c1376o.getValue()) != null && (g0B = kVar.b(uri.toString())) != null) {
                            nVar.e(g0B, bundleG, arguments);
                            if (((Boolean) nVar.f7392e.getValue()).booleanValue()) {
                                nVar.f(uri, bundleG, arguments);
                            }
                        }
                        if (AbstractC0836n2.B(arguments, new l(1, bundleG)).isEmpty()) {
                        }
                    }
                }
                o oVar2 = new o((p) lVar.f8092b, bundleD, nVar.f7396l, iB, z5);
                if (oVar == null || oVar2.compareTo(oVar) > 0) {
                    oVar = oVar2;
                }
            }
        }
        return oVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        W1.l lVar = this.f7404r;
        int i = lVar.f8091a * 31;
        String str = (String) lVar.f8095e;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) lVar.f8093c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            iHashCode = (((n) obj).f7388a.hashCode() + (iHashCode * 31)) * 961;
        }
        S s6 = this.f7406t;
        kotlin.jvm.internal.m.e(s6, "<this>");
        if (s6.f() > 0) {
            s6.g(0).getClass();
            throw new ClassCastException();
        }
        for (String str2 : g().keySet()) {
            int iH = C0.S.h(str2, iHashCode * 31, 31);
            Object obj2 = g().get(str2);
            iHashCode = iH + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        W1.l lVar = this.f7404r;
        lVar.getClass();
        sb.append(Integer.toHexString(lVar.f8091a));
        sb.append(")");
        String str = (String) lVar.f8095e;
        if (str != null && !J5.m.U0(str)) {
            sb.append(" route=");
            sb.append((String) lVar.f8095e);
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
