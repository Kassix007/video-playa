package I0;

import java.util.Iterator;
import m5.InterfaceC1366e;
import r.C1548G;
import r.C1557h;
import r.C1567s;
import r.O;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterable, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1548G f2257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1567s f2258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2260t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i() {
        long[] jArr = O.f16162a;
        this.f2257q = new C1548G();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(s sVar) {
        return this.f2257q.c(sVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f2257q, iVar.f2257q) && this.f2259s == iVar.f2259s && this.f2260t == iVar.f2260t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I0.i g() {
        /*
            r18 = this;
            r0 = r18
            I0.i r1 = new I0.i
            r1.<init>()
            boolean r2 = r0.f2259s
            r1.f2259s = r2
            boolean r2 = r0.f2260t
            r1.f2260t = r2
            r.G r2 = r1.f2257q
            r2.getClass()
            java.lang.String r3 = "from"
            r.G r4 = r0.f2257q
            kotlin.jvm.internal.m.e(r4, r3)
            java.lang.Object[] r3 = r4.f16134b
            java.lang.Object[] r5 = r4.f16135c
            long[] r4 = r4.f16133a
            int r6 = r4.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L62
            r7 = 0
            r8 = r7
        L28:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r7
        L42:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            r2.l(r15, r14)
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L42
        L5b:
            if (r11 != r12) goto L62
        L5d:
            if (r8 == r6) goto L62
            int r8 = r8 + 1
            goto L28
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.i.g():I0.i");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object h(s sVar) {
        Object objG = this.f2257q.g(sVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + sVar + " - consider getOrElse or getOrNull");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f2260t) + k1.i.e(this.f2257q.hashCode() * 31, 31, this.f2259s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(i iVar) {
        C1548G c1548g = iVar.f2257q;
        Object[] objArr = c1548g.f16134b;
        Object[] objArr2 = c1548g.f16135c;
        long[] jArr = c1548g.f16133a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        int i9 = (i << 3) + i8;
                        Object obj = objArr[i9];
                        Object obj2 = objArr2[i9];
                        s sVar = (s) obj;
                        C1548G c1548g2 = this.f2257q;
                        Object objG = c1548g2.g(sVar);
                        kotlin.jvm.internal.m.c(sVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = sVar.f2328b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            c1548g2.l(sVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1567s c1567s = this.f2258r;
        if (c1567s == null) {
            C1548G c1548g = this.f2257q;
            c1548g.getClass();
            C1567s c1567s2 = new C1567s(c1548g);
            this.f2258r = c1567s2;
            c1567s = c1567s2;
        }
        return ((C1557h) c1567s.entrySet()).iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(s sVar, Object obj) {
        boolean z5 = obj instanceof a;
        C1548G c1548g = this.f2257q;
        if (!z5 || !c1548g.c(sVar)) {
            c1548g.l(sVar, obj);
            return;
        }
        Object objG = c1548g.g(sVar);
        kotlin.jvm.internal.m.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) objG;
        a aVar2 = (a) obj;
        String str = aVar2.f2221a;
        if (str == null) {
            str = aVar.f2221a;
        }
        InterfaceC1366e interfaceC1366e = aVar2.f2222b;
        if (interfaceC1366e == null) {
            interfaceC1366e = aVar.f2222b;
        }
        c1548g.l(sVar, new a(str, interfaceC1366e));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f2259s
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.f2260t
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            r.G r4 = r0.f2257q
            java.lang.Object[] r5 = r4.f16134b
            java.lang.Object[] r6 = r4.f16135c
            long[] r4 = r4.f16133a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            I0.s r8 = (I0.s) r8
            r1.append(r2)
            java.lang.String r2 = r8.f2327a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = C0.W.q(r0)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.i.toString():java.lang.String");
    }
}
