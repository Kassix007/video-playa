package R;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import r.C1544C;
import r.C1548G;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1548G f6669a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.d.invoke():java.lang.Object] */
    public /* synthetic */ a(C1548G c1548g) {
        this.f6669a = c1548g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object a(C1548G c1548g) {
        Object objG = c1548g.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof C1544C)) {
            c1548g.j(null);
            return objG;
        }
        C1544C c1544c = (C1544C) objG;
        if (c1544c.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i = c1544c.f16115b - 1;
        Object objE = c1544c.e(i);
        c1544c.i(i);
        m.c(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (c1544c.g()) {
            c1548g.j(null);
        }
        if (c1544c.f16115b == 1) {
            c1548g.l(null, c1544c.d());
        }
        return objE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final r.C1544C b(r.C1548G r15) {
        /*
            boolean r0 = r15.i()
            if (r0 == 0) goto Le
            r.C r15 = r.M.f16160b
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            kotlin.jvm.internal.m.c(r15, r0)
            return r15
        Le:
            r.C r0 = new r.C
            r0.<init>()
            java.lang.Object[] r1 = r15.f16135c
            long[] r15 = r15.f16133a
            int r2 = r15.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L92
            r3 = 0
            r4 = r3
        L1e:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L8d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L38:
            if (r9 >= r7) goto L8b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L87
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof r.C1544C
            if (r11 == 0) goto L7f
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>"
            kotlin.jvm.internal.m.c(r10, r11)
            r.C r10 = (r.C1544C) r10
            java.lang.String r11 = "elements"
            kotlin.jvm.internal.m.e(r10, r11)
            boolean r11 = r10.g()
            if (r11 == 0) goto L5f
            goto L87
        L5f:
            int r11 = r0.f16115b
            int r12 = r10.f16115b
            int r11 = r11 + r12
            java.lang.Object[] r12 = r0.f16114a
            int r13 = r12.length
            if (r13 >= r11) goto L6c
            r0.k(r11, r12)
        L6c:
            java.lang.Object[] r11 = r0.f16114a
            java.lang.Object[] r12 = r10.f16114a
            int r13 = r0.f16115b
            int r14 = r10.f16115b
            n5.k.D0(r13, r3, r14, r12, r11)
            int r11 = r0.f16115b
            int r10 = r10.f16115b
            int r11 = r11 + r10
            r0.f16115b = r11
            goto L87
        L7f:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            kotlin.jvm.internal.m.c(r10, r11)
            r0.a(r10)
        L87:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L38
        L8b:
            if (r7 != r8) goto L92
        L8d:
            if (r4 == r2) goto L92
            int r4 = r4 + 1
            goto L1e
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R.a.b(r.G):r.C");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return m.a(this.f6669a, ((a) obj).f6669a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6669a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MultiValueMap(map=" + this.f6669a + ')';
    }
}
