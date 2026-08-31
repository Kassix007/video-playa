package b6;

import D.u;
import J5.t;
import O3.B;
import a6.AbstractC0637c;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import kotlin.jvm.internal.m;
import m5.C1377p;
import m5.C1379r;
import m5.C1384w;

/* JADX INFO: loaded from: classes.dex */
public final class b extends I1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f10020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f10021d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u uVar, AbstractC0637c json) {
        super(13);
        m.e(json, "json");
        this.f10020c = uVar;
        this.f10021d = json.f9020b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: IllegalArgumentException -> 0x00cb, PHI: r18
  0x0099: PHI (r18v2 long) = (r18v1 long), (r18v9 long) binds: [B:20:0x005c, B:36:0x0096] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {IllegalArgumentException -> 0x00cb, blocks: (B:3:0x000a, B:44:0x00c4, B:46:0x00c7, B:47:0x00ca, B:6:0x001c, B:14:0x0034, B:16:0x0043, B:19:0x004e, B:25:0x006b, B:35:0x0090, B:30:0x0079, B:34:0x008d, B:38:0x0099, B:41:0x00af, B:42:0x00bd), top: B:50:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[Catch: IllegalArgumentException -> 0x00cb, TryCatch #0 {IllegalArgumentException -> 0x00cb, blocks: (B:3:0x000a, B:44:0x00c4, B:46:0x00c7, B:47:0x00ca, B:6:0x001c, B:14:0x0034, B:16:0x0043, B:19:0x004e, B:25:0x006b, B:35:0x0090, B:30:0x0079, B:34:0x008d, B:38:0x0099, B:41:0x00af, B:42:0x00bd), top: B:50:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[Catch: IllegalArgumentException -> 0x00cb, TryCatch #0 {IllegalArgumentException -> 0x00cb, blocks: (B:3:0x000a, B:44:0x00c4, B:46:0x00c7, B:47:0x00ca, B:6:0x001c, B:14:0x0034, B:16:0x0043, B:19:0x004e, B:25:0x006b, B:35:0x0090, B:30:0x0079, B:34:0x008d, B:38:0x0099, B:41:0x00af, B:42:0x00bd), top: B:50:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d() {
        /*
            r27 = this;
            r0 = r27
            D.u r1 = r0.f10020c
            java.lang.String r2 = r1.j()
            r3 = 0
            r4 = 0
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.m.e(r2, r5)     // Catch: java.lang.IllegalArgumentException -> Lcb
            r5 = 10
            com.google.android.gms.internal.measurement.I1.M(r5)     // Catch: java.lang.IllegalArgumentException -> Lcb
            int r6 = r2.length()     // Catch: java.lang.IllegalArgumentException -> Lcb
            if (r6 != 0) goto L1c
            goto Lad
        L1c:
            char r7 = r2.charAt(r3)     // Catch: java.lang.IllegalArgumentException -> Lcb
            r8 = 48
            int r8 = kotlin.jvm.internal.m.f(r7, r8)     // Catch: java.lang.IllegalArgumentException -> Lcb
            r9 = 1
            if (r8 >= 0) goto L33
            if (r6 == r9) goto Lad
            r8 = 43
            if (r7 == r8) goto L31
            goto Lad
        L31:
            r7 = r9
            goto L34
        L33:
            r7 = r3
        L34:
            long r10 = (long) r5     // Catch: java.lang.IllegalArgumentException -> Lcb
            r14 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r8 = r9
            r16 = r10
            r18 = r14
            r9 = 0
        L41:
            if (r7 >= r6) goto Lbd
            char r11 = r2.charAt(r7)     // Catch: java.lang.IllegalArgumentException -> Lcb
            int r11 = java.lang.Character.digit(r11, r5)     // Catch: java.lang.IllegalArgumentException -> Lcb
            if (r11 >= 0) goto L4e
            goto Lad
        L4e:
            r20 = -9223372036854775808
            r22 = r6
            long r5 = r9 ^ r20
            r23 = 0
            long r12 = r18 ^ r20
            int r12 = java.lang.Long.compare(r5, r12)     // Catch: java.lang.IllegalArgumentException -> Lcb
            if (r12 <= 0) goto L99
            int r12 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r12 != 0) goto Lad
            int r12 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r12 >= 0) goto L79
            long r12 = r16 ^ r20
            int r12 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r12 >= 0) goto L74
            r18 = r23
            goto L90
        L74:
            r12 = 1
        L76:
            r18 = r12
            goto L90
        L79:
            long r18 = r18 / r16
            long r12 = r18 << r8
            long r18 = r12 * r16
            r25 = -1
            long r25 = r25 - r18
            long r18 = r25 ^ r20
            long r25 = r16 ^ r20
            int r18 = (r18 > r25 ? 1 : (r18 == r25 ? 0 : -1))
            if (r18 < 0) goto L8c
            goto L8d
        L8c:
            r8 = r3
        L8d:
            long r14 = (long) r8     // Catch: java.lang.IllegalArgumentException -> Lcb
            long r12 = r12 + r14
            goto L76
        L90:
            long r12 = r18 ^ r20
            int r5 = java.lang.Long.compare(r5, r12)     // Catch: java.lang.IllegalArgumentException -> Lcb
            if (r5 <= 0) goto L99
            goto Lad
        L99:
            long r9 = r9 * r16
            long r5 = (long) r11     // Catch: java.lang.IllegalArgumentException -> Lcb
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r11
            long r5 = r5 + r9
            long r11 = r5 ^ r20
            long r8 = r9 ^ r20
            int r8 = java.lang.Long.compare(r11, r8)     // Catch: java.lang.IllegalArgumentException -> Lcb
            if (r8 >= 0) goto Laf
        Lad:
            r5 = r4
            goto Lc2
        Laf:
            int r7 = r7 + 1
            r9 = r5
            r6 = r22
            r5 = 10
            r8 = 1
            r14 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            goto L41
        Lbd:
            m5.t r5 = new m5.t     // Catch: java.lang.IllegalArgumentException -> Lcb
            r5.<init>(r9)     // Catch: java.lang.IllegalArgumentException -> Lcb
        Lc2:
            if (r5 == 0) goto Lc7
            long r1 = r5.f15093q     // Catch: java.lang.IllegalArgumentException -> Lcb
            return r1
        Lc7:
            J5.t.C0(r2)     // Catch: java.lang.IllegalArgumentException -> Lcb
            throw r4     // Catch: java.lang.IllegalArgumentException -> Lcb
        Lcb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse type 'ULong' for input '"
            r5.<init>(r6)
            r5.append(r2)
            r2 = 39
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r5 = 6
            D.u.m(r1, r2, r3, r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.b.d():long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public final int j(X5.f descriptor) {
        m.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final int n() {
        u uVar = this.f10020c;
        String strJ = uVar.j();
        try {
            m.e(strJ, "<this>");
            C1379r c1379rO = AbstractC0836n2.O(strJ);
            if (c1379rO != null) {
                return c1379rO.f15091q;
            }
            t.C0(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'UInt' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Y5.a
    public final B q() {
        return this.f10021d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final byte s() {
        C1377p c1377p;
        u uVar = this.f10020c;
        String strJ = uVar.j();
        try {
            m.e(strJ, "<this>");
            C1379r c1379rO = AbstractC0836n2.O(strJ);
            if (c1379rO != null) {
                int i = c1379rO.f15091q;
                c1377p = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new C1377p((byte) i);
            }
            if (c1377p != null) {
                return c1377p.f15089q;
            }
            t.C0(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'UByte' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1, Y5.b
    public final short v() {
        C1384w c1384w;
        u uVar = this.f10020c;
        String strJ = uVar.j();
        try {
            m.e(strJ, "<this>");
            C1379r c1379rO = AbstractC0836n2.O(strJ);
            if (c1379rO != null) {
                int i = c1379rO.f15091q;
                c1384w = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new C1384w((short) i);
            }
            if (c1384w != null) {
                return c1384w.f15096q;
            }
            t.C0(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            u.m(uVar, "Failed to parse type 'UShort' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }
}
