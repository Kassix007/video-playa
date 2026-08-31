package d6;

import c3.C0733c;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String[] f12360q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(String[] strArr) {
        this.f12360q = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        String[] strArr = this.f12360q;
        int length = strArr.length - 2;
        int iV = AbstractC0836n2.v(length, 0, -2);
        if (iV > length) {
            return null;
        }
        while (!J5.t.B0(name, strArr[length], true)) {
            if (length == iV) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f12360q, ((l) obj).f12360q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g(int i) {
        return this.f12360q[i * 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0733c h() {
        C0733c c0733c = new C0733c(1);
        ArrayList arrayList = c0733c.f10129a;
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        String[] elements = this.f12360q;
        kotlin.jvm.internal.m.e(elements, "elements");
        arrayList.addAll(n5.k.x0(elements));
        return c0733c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.f12360q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i(int i) {
        return this.f12360q[(i * 2) + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C1371j[] c1371jArr = new C1371j[size];
        for (int i = 0; i < size; i++) {
            c1371jArr[i] = new C1371j(g(i), i(i));
        }
        return kotlin.jvm.internal.m.h(c1371jArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.f12360q.length / 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strG = g(i);
            String strI = i(i);
            sb.append(strG);
            sb.append(": ");
            if (e6.b.n(strG)) {
                strI = "██";
            }
            sb.append(strI);
            sb.append("\n");
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
