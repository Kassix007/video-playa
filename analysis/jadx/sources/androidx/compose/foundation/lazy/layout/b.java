package androidx.compose.foundation.lazy.layout;

import B0.AbstractC0036d0;
import C0.S;
import E.B;
import E.Y;
import E.r;
import c0.AbstractC0724l;
import c0.InterfaceC0725m;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import r.C1548G;
import r.C1549H;
import r.O;
import r.P;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1548G f9293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y f9294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1549H f9295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9297e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f9299h;
    public final InterfaceC0725m i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b() {
        long[] jArr = O.f16162a;
        this.f9293a = new C1548G();
        int i = P.f16163a;
        this.f9295c = new C1549H();
        this.f9296d = new ArrayList();
        this.f9297e = new ArrayList();
        this.f = new ArrayList();
        this.f9298g = new ArrayList();
        this.f9299h = new ArrayList();
        this.i = new AbstractC0036d0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public final b f9287q;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f9287q = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && m.a(this.f9287q, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f9287q);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B0.AbstractC0036d0
            public final AbstractC0724l f() {
                r rVar = new r();
                rVar.f1581E = this.f9287q;
                return rVar;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B0.AbstractC0036d0
            public final void g(AbstractC0724l abstractC0724l) {
                r rVar = (r) abstractC0724l;
                b bVar = rVar.f1581E;
                b bVar2 = this.f9287q;
                if (m.a(bVar, bVar2) || !rVar.f10100q.f10099D) {
                    return;
                }
                b bVar3 = rVar.f1581E;
                bVar3.d();
                bVar3.f9294b = null;
                rVar.f1581E = bVar2;
            }

            public final int hashCode() {
                return this.f9287q.hashCode();
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f9287q + ')';
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e(int[] iArr, B b7) {
        int iJ = b7.j();
        int iH = b7.h() + iJ;
        int iMax = 0;
        while (iJ < iH) {
            int iF = b7.f() + iArr[iJ];
            iArr[iJ] = iF;
            iMax = Math.max(iMax, iF);
            iJ++;
        }
        return iMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, Object obj) {
        S.t(this.f9293a.g(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b() {
        ArrayList arrayList = this.f9299h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        S.t(arrayList.get(0));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r27, int r28, java.util.ArrayList r29, E.Y r30, E.D r31, boolean r32, int r33, boolean r34, int r35, int r36) throws java.lang.Throwable {
        /*
            r26 = this;
            r0 = r26
            r1 = r29
            r2 = r30
            r3 = r33
            E.Y r4 = r0.f9294b
            r0.f9294b = r2
            int r5 = r1.size()
            r7 = 0
        L11:
            if (r7 >= r5) goto L29
            java.lang.Object r8 = r1.get(r7)
            E.B r8 = (E.B) r8
            int r9 = r8.b()
            r10 = 0
        L1e:
            if (r10 >= r9) goto L26
            r8.i(r10)
            int r10 = r10 + 1
            goto L1e
        L26:
            int r7 = r7 + 1
            goto L11
        L29:
            r.G r5 = r0.f9293a
            boolean r7 = r5.i()
            if (r7 == 0) goto L35
            r0.d()
            return
        L35:
            java.lang.Object r7 = n5.l.m0(r1)
            E.B r7 = (E.B) r7
            if (r32 != 0) goto L42
            if (r34 != 0) goto L40
            goto L42
        L40:
            r8 = 0
            goto L43
        L42:
            r8 = 1
        L43:
            java.lang.Object[] r9 = r5.f16134b
            long[] r10 = r5.f16133a
            int r11 = r10.length
            int r11 = r11 + (-2)
            r16 = 7
            r27 = 128(0x80, double:6.32E-322)
            r.H r12 = r0.f9295c
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r34 = 255(0xff, double:1.26E-321)
            if (r11 < 0) goto L92
            r14 = 0
        L5a:
            r6 = r10[r14]
            r19 = r14
            r15 = 8
            long r13 = ~r6
            long r13 = r13 << r16
            long r13 = r13 & r6
            long r13 = r13 & r17
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r14 = r19 - r11
            int r13 = ~r14
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r20 = r6
            r6 = 0
        L74:
            if (r6 >= r13) goto L89
            long r22 = r20 & r34
            int r7 = (r22 > r27 ? 1 : (r22 == r27 ? 0 : -1))
            if (r7 >= 0) goto L84
            int r7 = r19 << 3
            int r7 = r7 + r6
            r7 = r9[r7]
            r12.a(r7)
        L84:
            long r20 = r20 >> r15
            int r6 = r6 + 1
            goto L74
        L89:
            if (r13 != r15) goto L92
        L8b:
            r6 = r19
            if (r6 == r11) goto L92
            int r14 = r6 + 1
            goto L5a
        L92:
            int r6 = r1.size()
            r7 = 0
        L97:
            if (r7 >= r6) goto Lc3
            java.lang.Object r9 = r1.get(r7)
            E.B r9 = (E.B) r9
            java.lang.Object r10 = r9.getKey()
            r12.l(r10)
            int r10 = r9.b()
            r11 = 0
        Lab:
            if (r11 >= r10) goto Lb3
            r9.i(r11)
            int r11 = r11 + 1
            goto Lab
        Lb3:
            java.lang.Object r9 = r9.getKey()
            r.G r10 = r0.f9293a
            java.lang.Object r9 = r10.j(r9)
            C0.S.t(r9)
            int r7 = r7 + 1
            goto L97
        Lc3:
            int[] r6 = new int[r3]
            r7 = 0
            java.util.ArrayList r9 = r0.f9297e
            java.util.ArrayList r10 = r0.f9296d
            if (r8 == 0) goto L148
            if (r4 == 0) goto L148
            boolean r8 = r10.isEmpty()
            if (r8 != 0) goto L10b
            int r8 = r10.size()
            r11 = 1
            if (r8 <= r11) goto Le4
            E.s r8 = new E.s
            r11 = 2
            r8.<init>(r4, r11)
            n5.p.d0(r10, r8)
        Le4:
            int r8 = r10.size()
            if (r8 > 0) goto Lef
            r8 = 0
            java.util.Arrays.fill(r6, r8, r3, r8)
            goto L10b
        Lef:
            r8 = 0
            java.lang.Object r1 = r10.get(r8)
            E.B r1 = (E.B) r1
            e(r6, r1)
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r2 = r5.g(r2)
            kotlin.jvm.internal.m.b(r2)
            C0.S.t(r2)
            r1.g(r8)
            throw r7
        L10b:
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L148
            int r8 = r9.size()
            r11 = 1
            if (r8 <= r11) goto L121
            E.s r8 = new E.s
            r11 = 0
            r8.<init>(r4, r11)
            n5.p.d0(r9, r8)
        L121:
            int r4 = r9.size()
            if (r4 > 0) goto L12c
            r8 = 0
            java.util.Arrays.fill(r6, r8, r3, r8)
            goto L148
        L12c:
            r8 = 0
            java.lang.Object r1 = r9.get(r8)
            E.B r1 = (E.B) r1
            e(r6, r1)
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r2 = r5.g(r2)
            kotlin.jvm.internal.m.b(r2)
            C0.S.t(r2)
            r1.g(r8)
            throw r7
        L148:
            java.lang.Object[] r4 = r12.f16139b
            long[] r8 = r12.f16138a
            int r11 = r8.length
            int r11 = r11 + (-2)
            if (r11 < 0) goto L198
            r14 = r7
            r19 = r8
            r13 = 0
        L155:
            r7 = r19[r13]
            r21 = r14
            long r14 = ~r7
            long r14 = r14 << r16
            long r14 = r14 & r7
            long r14 = r14 & r17
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 == 0) goto L18f
            int r14 = r13 - r11
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r22 = r7
            r7 = 0
        L16f:
            if (r7 >= r14) goto L18a
            long r24 = r22 & r34
            int r8 = (r24 > r27 ? 1 : (r24 == r27 ? 0 : -1))
            if (r8 >= 0) goto L183
            int r8 = r13 << 3
            int r8 = r8 + r7
            r8 = r4[r8]
            java.lang.Object r8 = r5.g(r8)
            C0.S.t(r8)
        L183:
            r15 = 8
            long r22 = r22 >> r15
            int r7 = r7 + 1
            goto L16f
        L18a:
            r15 = 8
            if (r14 != r15) goto L19a
            goto L191
        L18f:
            r15 = 8
        L191:
            if (r13 == r11) goto L19a
            int r13 = r13 + 1
            r14 = r21
            goto L155
        L198:
            r21 = r7
        L19a:
            java.util.ArrayList r4 = r0.f
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L1e0
            int r7 = r4.size()
            r11 = 1
            if (r7 <= r11) goto L1b2
            E.s r7 = new E.s
            r8 = 3
            r7.<init>(r2, r8)
            n5.p.d0(r4, r7)
        L1b2:
            int r7 = r4.size()
            if (r7 <= 0) goto L1dc
            r8 = 0
            java.lang.Object r2 = r4.get(r8)
            E.B r2 = (E.B) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.g(r3)
            kotlin.jvm.internal.m.b(r3)
            C0.S.t(r3)
            e(r6, r2)
            if (r32 == 0) goto L1db
            java.lang.Object r1 = n5.l.l0(r1)
            E.B r1 = (E.B) r1
            r1.g(r8)
        L1db:
            throw r21
        L1dc:
            r8 = 0
            java.util.Arrays.fill(r6, r8, r3, r8)
        L1e0:
            java.util.ArrayList r3 = r0.f9298g
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L222
            int r7 = r3.size()
            r11 = 1
            if (r7 <= r11) goto L1f8
            E.s r7 = new E.s
            r8 = 1
            r7.<init>(r2, r8)
            n5.p.d0(r3, r7)
        L1f8:
            int r2 = r3.size()
            if (r2 <= 0) goto L222
            r8 = 0
            java.lang.Object r2 = r3.get(r8)
            E.B r2 = (E.B) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r3 = r5.g(r3)
            kotlin.jvm.internal.m.b(r3)
            C0.S.t(r3)
            e(r6, r2)
            if (r32 == 0) goto L221
            java.lang.Object r1 = n5.l.r0(r1)
            E.B r1 = (E.B) r1
            r1.g(r8)
        L221:
            throw r21
        L222:
            r8 = 0
            java.util.Collections.reverse(r4)
            r1.addAll(r8, r4)
            r1.addAll(r3)
            r10.clear()
            r9.clear()
            r4.clear()
            r3.clear()
            r12.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.c(int, int, java.util.ArrayList, E.Y, E.D, boolean, int, boolean, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r15 = this;
            r.G r0 = r15.f9293a
            int r1 = r0.f16137e
            if (r1 == 0) goto L4e
            java.lang.Object[] r1 = r0.f16135c
            long[] r2 = r0.f16133a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L4b
            r4 = 0
            r5 = r4
        L11:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L46
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2b:
            if (r10 >= r8) goto L44
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L3a
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2b
        L3a:
            int r0 = r5 << 3
            int r0 = r0 + r10
            r0 = r1[r0]
            C0.S.t(r0)
            r0 = 0
            throw r0
        L44:
            if (r8 != r9) goto L4b
        L46:
            if (r5 == r3) goto L4b
            int r5 = r5 + 1
            goto L11
        L4b:
            r0.a()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.b.d():void");
    }
}
