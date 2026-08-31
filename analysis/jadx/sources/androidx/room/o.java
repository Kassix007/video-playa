package androidx.room;

import java.util.Collections;
import java.util.Set;
import n5.AbstractC1397A;
import o5.C1425g;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f9749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f9751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f9752d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(n nVar, int[] iArr, String[] strArr) {
        Set setSingleton;
        this.f9749a = nVar;
        this.f9750b = iArr;
        this.f9751c = strArr;
        if (strArr.length == 0) {
            setSingleton = n5.u.f15301q;
        } else {
            setSingleton = Collections.singleton(strArr[0]);
            kotlin.jvm.internal.m.d(setSingleton, "singleton(...)");
        }
        this.f9752d = setSingleton;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Set invalidatedTablesIds) {
        kotlin.jvm.internal.m.e(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.f9750b;
        int length = iArr.length;
        Set setM = n5.u.f15301q;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                C1425g c1425g = new C1425g();
                int length2 = iArr.length;
                int i7 = 0;
                while (i < length2) {
                    int i8 = i7 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i]))) {
                        c1425g.add(this.f9751c[i7]);
                    }
                    i++;
                    i7 = i8;
                }
                setM = AbstractC1397A.m(c1425g);
            } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                setM = this.f9752d;
            }
        }
        if (setM.isEmpty()) {
            return;
        }
        this.f9749a.a(setM);
    }
}
