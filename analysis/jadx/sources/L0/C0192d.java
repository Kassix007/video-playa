package L0;

import java.util.ArrayList;
import java.util.List;
import r.AbstractC1559j;
import r.C1569u;
import s.AbstractC1585a;

/* JADX INFO: renamed from: L0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0192d implements CharSequence {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f3105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f3107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f3108t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Z.m mVar = w.f3206a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0192d(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f3105q = list;
        this.f3106r = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                C0191c c0191c = (C0191c) list.get(i);
                Object obj = c0191c.f3101a;
                if (obj instanceof y) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0191c);
                } else if (obj instanceof q) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0191c);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f3107s = arrayList;
        this.f3108t = arrayList2;
        List listX0 = arrayList2 != null ? n5.l.x0(arrayList2, new I2.A(2)) : null;
        List list2 = listX0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i7 = ((C0191c) n5.l.l0(listX0)).f3103c;
        C1569u c1569u = AbstractC1559j.f16215a;
        C1569u c1569u2 = new C1569u(1);
        c1569u2.a(i7);
        int size2 = listX0.size();
        for (int i8 = 1; i8 < size2; i8++) {
            C0191c c0191c2 = (C0191c) listX0.get(i8);
            while (true) {
                int i9 = c1569u2.f16252b;
                if (i9 == 0) {
                    break;
                }
                if (i9 == 0) {
                    AbstractC1585a.e("IntList is empty.");
                    throw null;
                }
                int i10 = c1569u2.f16251a[i9 - 1];
                int i11 = c0191c2.f3102b;
                int i12 = c0191c2.f3103c;
                if (i11 >= i10) {
                    c1569u2.d(i9 - 1);
                } else if (i12 > i10) {
                    Q0.a.a("Paragraph overlap not allowed, end " + i12 + " should be less than or equal to " + i10);
                }
            }
            c1569u2.a(c0191c2.f3103c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f3106r.charAt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0192d)) {
            return false;
        }
        C0192d c0192d = (C0192d) obj;
        return kotlin.jvm.internal.m.a(this.f3106r, c0192d.f3106r) && kotlin.jvm.internal.m.a(this.f3105q, c0192d.f3105q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f3106r.hashCode() * 31;
        List list = this.f3105q;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3106r.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 41
            java.lang.String r1 = "start ("
            if (r11 > r12) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r11)
            java.lang.String r3 = ") should be less or equal to end ("
            r2.append(r3)
            r2.append(r12)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            Q0.a.a(r2)
        L21:
            java.lang.String r2 = r10.f3106r
            if (r11 != 0) goto L2c
            int r3 = r2.length()
            if (r12 != r3) goto L2c
            return r10
        L2c:
            java.lang.String r2 = r2.substring(r11, r12)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.m.d(r2, r3)
            int r3 = L0.AbstractC0193e.f3109a
            if (r11 > r12) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r11)
            java.lang.String r1 = ") should be less than or equal to end ("
            r3.append(r1)
            r3.append(r12)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            Q0.a.a(r0)
        L54:
            java.util.List r0 = r10.f3105q
            if (r0 != 0) goto L59
            goto L9d
        L59:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r0.size()
            r1.<init>(r3)
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
        L6a:
            if (r4 >= r3) goto L97
            java.lang.Object r5 = r0.get(r4)
            L0.c r5 = (L0.C0191c) r5
            int r6 = r5.f3102b
            int r7 = r5.f3103c
            boolean r6 = L0.AbstractC0193e.a(r11, r12, r6, r7)
            if (r6 == 0) goto L94
            L0.c r6 = new L0.c
            java.lang.Object r8 = r5.f3101a
            int r9 = r5.f3102b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f3104d
            r6.<init>(r8, r9, r7, r5)
            r1.add(r6)
        L94:
            int r4 = r4 + 1
            goto L6a
        L97:
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L9e
        L9d:
            r1 = 0
        L9e:
            L0.d r11 = new L0.d
            r11.<init>(r1, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0192d.subSequence(int, int):java.lang.CharSequence");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f3106r;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:n5.s:0x0000: SGET  A[WRAPPED] (LINE:36) n5.s.q n5.s) A[MD:(java.lang.String, java.util.List):void (m)] (LINE:37) call: L0.d.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ C0192d(String str) {
        this(str, n5.s.f15299q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0192d(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
