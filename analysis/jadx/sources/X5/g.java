package X5;

import I5.o;
import Z5.InterfaceC0581j;
import Z5.N;
import com.google.android.gms.internal.measurement.I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1371j;
import m5.C1376o;
import n5.l;
import n5.s;
import n5.v;
import n5.x;
import n5.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f, InterfaceC0581j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1 f8185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f8187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f8188e;
    public final f[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List[] f8189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f8190h;
    public final Map i;
    public final f[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1376o f8191k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(String serialName, I1 i12, int i, List list, a aVar) {
        m.e(serialName, "serialName");
        this.f8184a = serialName;
        this.f8185b = i12;
        this.f8186c = i;
        ArrayList arrayList = aVar.f8173b;
        m.e(arrayList, "<this>");
        HashSet hashSet = new HashSet(y.I(n5.m.c0(arrayList, 12)));
        l.z0(arrayList, hashSet);
        this.f8187d = hashSet;
        int i7 = 0;
        this.f8188e = (String[]) arrayList.toArray(new String[0]);
        this.f = N.c(aVar.f8175d);
        this.f8189g = (List[]) aVar.f8176e.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f;
        m.e(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList2.get(i8);
            i8++;
            zArr[i7] = ((Boolean) obj).booleanValue();
            i7++;
        }
        this.f8190h = zArr;
        String[] strArr = this.f8188e;
        m.e(strArr, "<this>");
        o oVar = new o(1, new I2.d(18, strArr));
        ArrayList arrayList3 = new ArrayList(n5.m.c0(oVar, 10));
        Iterator it = oVar.iterator();
        while (true) {
            I5.b bVar = (I5.b) it;
            if (!bVar.f2421r.hasNext()) {
                this.i = x.N(arrayList3);
                this.j = N.c(list);
                this.f8191k = AbstractC1362a.d(new I2.d(10, this));
                return;
            }
            v vVar = (v) bVar.next();
            arrayList3.add(new C1371j(vVar.f15303b, Integer.valueOf(vVar.f15302a)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int a(String name) {
        m.e(name, "name");
        Integer num = (Integer) this.i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String b() {
        return this.f8184a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final I1 c() {
        return this.f8185b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final int d() {
        return this.f8186c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final String e(int i) {
        return this.f8188e[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (m.a(this.f8184a, fVar.b()) && Arrays.equals(this.j, ((g) obj).j)) {
                int iD = fVar.d();
                int i = this.f8186c;
                if (i == iD) {
                    for (int i7 = 0; i7 < i; i7++) {
                        f[] fVarArr = this.f;
                        if (m.a(fVarArr[i7].b(), fVar.i(i7).b()) && m.a(fVarArr[i7].c(), fVar.i(i7).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.InterfaceC0581j
    public final Set f() {
        return this.f8187d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean g() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final List getAnnotations() {
        return s.f15299q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final List h(int i) {
        return this.f8189g[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((Number) this.f8191k.getValue()).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final f i(int i) {
        return this.f[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean isInline() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X5.f
    public final boolean j(int i) {
        return this.f8190h[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return N.g(this);
    }
}
