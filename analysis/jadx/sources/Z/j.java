package Z;

import B0.G0;
import com.google.android.gms.internal.measurement.I1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r.C1548G;
import r.O;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B5.c f8307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1548G f8308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1548G f8309c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(Map map, B5.c cVar) {
        C1548G c1548g;
        this.f8307a = cVar;
        if (map == null || map.isEmpty()) {
            c1548g = null;
        } else {
            c1548g = new C1548G(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c1548g.l(entry.getKey(), entry.getValue());
            }
        }
        this.f8308b = c1548g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.i
    public final boolean a(Object obj) {
        return ((Boolean) this.f8307a.invoke(obj)).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // Z.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map b() {
        /*
            r27 = this;
            r0 = r27
            r.G r1 = r0.f8308b
            if (r1 != 0) goto Ld
            r.G r2 = r0.f8309c
            if (r2 != 0) goto Ld
            n5.t r1 = n5.t.f15300q
            return r1
        Ld:
            r2 = 0
            if (r1 == 0) goto L13
            int r3 = r1.f16137e
            goto L14
        L13:
            r3 = r2
        L14:
            r.G r4 = r0.f8309c
            if (r4 == 0) goto L1b
            int r4 = r4.f16137e
            goto L1c
        L1b:
            r4 = r2
        L1c:
            int r3 = r3 + r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r3)
            r3 = 7
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r11 = 8
            if (r1 == 0) goto L8e
            java.lang.Object[] r12 = r1.f16134b
            java.lang.Object[] r13 = r1.f16135c
            long[] r1 = r1.f16133a
            int r14 = r1.length
            int r14 = r14 + (-2)
            if (r14 < 0) goto L8e
            r15 = r2
            r16 = 128(0x80, double:6.32E-322)
        L3a:
            r5 = r1[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r3
            long r7 = r7 & r5
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L81
            int r7 = r15 - r14
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r2
        L4e:
            if (r8 >= r7) goto L7a
            long r20 = r5 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L6e
            int r20 = r15 << 3
            int r20 = r20 + r8
            r21 = r12[r20]
            r20 = r13[r20]
            r22 = r3
            r3 = r20
            java.util.List r3 = (java.util.List) r3
            r23 = r9
            r9 = r21
            java.lang.String r9 = (java.lang.String) r9
            r4.put(r9, r3)
            goto L72
        L6e:
            r22 = r3
            r23 = r9
        L72:
            long r5 = r5 >> r11
            int r8 = r8 + 1
            r3 = r22
            r9 = r23
            goto L4e
        L7a:
            r22 = r3
            r23 = r9
            if (r7 != r11) goto L96
            goto L85
        L81:
            r22 = r3
            r23 = r9
        L85:
            if (r15 == r14) goto L96
            int r15 = r15 + 1
            r3 = r22
            r9 = r23
            goto L3a
        L8e:
            r22 = r3
            r23 = r9
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
        L96:
            r.G r1 = r0.f8309c
            if (r1 == 0) goto L162
            java.lang.Object[] r3 = r1.f16134b
            java.lang.Object[] r5 = r1.f16135c
            long[] r1 = r1.f16133a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L162
            r7 = r2
        La6:
            r8 = r1[r7]
            long r12 = ~r8
            long r12 = r12 << r22
            long r12 = r12 & r8
            long r12 = r12 & r23
            int r10 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r10 == 0) goto L155
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r12 = r2
        Lba:
            if (r12 >= r10) goto L14f
            long r13 = r8 & r18
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L140
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            java.util.List r13 = (java.util.List) r13
            java.lang.String r14 = (java.lang.String) r14
            int r15 = r13.size()
            r20 = r11
            r11 = 1
            if (r15 != r11) goto L104
            java.lang.Object r11 = r13.get(r2)
            B5.a r11 = (B5.a) r11
            java.lang.Object r11 = r11.invoke()
            if (r11 == 0) goto Lf3
            boolean r13 = r0.a(r11)
            if (r13 == 0) goto Lf6
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.ArrayList r11 = com.google.android.gms.internal.measurement.AbstractC0836n2.d(r11)
            r4.put(r14, r11)
        Lf3:
            r26 = r1
            goto L144
        Lf6:
            java.lang.String r1 = com.google.android.gms.internal.measurement.P1.A(r11)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L104:
            int r11 = r13.size()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r11)
        L10d:
            if (r2 >= r11) goto L13a
            java.lang.Object r25 = r13.get(r2)
            B5.a r25 = (B5.a) r25
            r26 = r1
            java.lang.Object r1 = r25.invoke()
            if (r1 == 0) goto L132
            boolean r25 = r0.a(r1)
            if (r25 == 0) goto L124
            goto L132
        L124:
            java.lang.String r1 = com.google.android.gms.internal.measurement.P1.A(r1)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L132:
            r15.add(r1)
            int r2 = r2 + 1
            r1 = r26
            goto L10d
        L13a:
            r26 = r1
            r4.put(r14, r15)
            goto L144
        L140:
            r26 = r1
            r20 = r11
        L144:
            long r8 = r8 >> r20
            int r12 = r12 + 1
            r11 = r20
            r1 = r26
            r2 = 0
            goto Lba
        L14f:
            r26 = r1
            r1 = r11
            if (r10 != r1) goto L162
            goto L158
        L155:
            r26 = r1
            r1 = r11
        L158:
            if (r7 == r6) goto L162
            int r7 = r7 + 1
            r11 = r1
            r1 = r26
            r2 = 0
            goto La6
        L162:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.j.b():java.util.Map");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.i
    public final Object c(String str) {
        C1548G c1548g = this.f8308b;
        List list = c1548g != null ? (List) c1548g.j(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c1548g != null) {
            List listSubList = list.subList(1, list.size());
            int iF = c1548g.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = c1548g.f16135c;
            Object obj = objArr[iF];
            c1548g.f16134b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.i
    public final h d(String str, B5.a aVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!I1.v0(str.charAt(i))) {
                C1548G c1548g = this.f8309c;
                if (c1548g == null) {
                    long[] jArr = O.f16162a;
                    c1548g = new C1548G();
                    this.f8309c = c1548g;
                }
                Object objG = c1548g.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    c1548g.l(str, objG);
                }
                ((List) objG).add(aVar);
                return new G0(c1548g, str, aVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
