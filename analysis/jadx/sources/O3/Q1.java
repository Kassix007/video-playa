package O3;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class Q1 extends K1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean r(String str) {
        String str2 = (String) F.f4457t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.P1 p(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            O3.T1 r1 = r13.f4510s
            O3.n r2 = r1.f4609s
            O3.l0 r3 = r1.f4607q
            O3.T1.S(r2)
            O3.c0 r2 = r2.s0(r14)
            O3.i1 r4 = O3.EnumC0292i1.GOOGLE_ANALYTICS
            r5 = 0
            if (r2 == 0) goto L1d7
            boolean r6 = r2.y()
            if (r6 != 0) goto L1e
            goto L1d7
        L1e:
            com.google.android.gms.internal.measurement.y1 r6 = com.google.android.gms.internal.measurement.C0894z1.q()
            r6.b()
            com.google.android.gms.internal.measurement.q2 r7 = r6.f11012r
            com.google.android.gms.internal.measurement.z1 r7 = (com.google.android.gms.internal.measurement.C0894z1) r7
            r8 = 2
            r7.v(r8)
            int r7 = r2.t()
            int r7 = C0.S.d(r7)
            if (r7 == 0) goto L1cf
            r6.h(r7)
            java.lang.String r7 = r2.E()
            O3.T1.S(r3)
            com.google.android.gms.internal.measurement.O0 r9 = r3.A(r14)
            r10 = 3
            if (r9 != 0) goto L4a
            goto L1b3
        L4a:
            O3.n r1 = r1.f4609s
            O3.T1.S(r1)
            O3.c0 r1 = r1.s0(r14)
            if (r1 == 0) goto L1b3
            boolean r11 = r9.D()
            r12 = 100
            if (r11 == 0) goto L67
            com.google.android.gms.internal.measurement.T0 r11 = r9.E()
            int r11 = r11.p()
            if (r11 == r12) goto L92
        L67:
            O3.Y1 r11 = r0.f5080y
            O3.C0323t0.j(r11)
            java.lang.String r1 = r1.C()
            boolean r1 = r11.O(r14, r1)
            if (r1 == 0) goto L77
            goto L92
        L77:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L1b3
            int r1 = r7.hashCode()
            int r1 = r1 % r12
            int r1 = java.lang.Math.abs(r1)
            com.google.android.gms.internal.measurement.T0 r7 = r9.E()
            int r7 = r7.p()
            if (r1 < r7) goto L92
            goto L1b3
        L92:
            java.lang.String r1 = r2.D()
            r6.b()
            com.google.android.gms.internal.measurement.q2 r7 = r6.f11012r
            com.google.android.gms.internal.measurement.z1 r7 = (com.google.android.gms.internal.measurement.C0894z1) r7
            r7.v(r8)
            O3.T1.S(r3)
            java.lang.String r7 = r2.D()
            com.google.android.gms.internal.measurement.O0 r3 = r3.A(r7)
            if (r3 == 0) goto L187
            boolean r7 = r3.D()
            if (r7 != 0) goto Lb5
            goto L187
        Lb5:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r9 = r2.C()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto Lcd
            java.lang.String r9 = r2.C()
            java.lang.String r11 = "x-gtm-server-preview"
            r7.put(r11, r9)
        Lcd:
            com.google.android.gms.internal.measurement.T0 r9 = r3.E()
            java.lang.String r9 = r9.q()
            int r11 = r2.t()
            int r11 = C0.S.d(r11)
            if (r11 == 0) goto Le5
            if (r11 == r8) goto Le5
            r6.h(r11)
            goto L100
        Le5:
            java.lang.String r11 = r2.D()
            boolean r11 = r(r11)
            if (r11 == 0) goto Lf5
            r10 = 11
            r6.h(r10)
            goto L100
        Lf5:
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 == 0) goto L160
            r10 = 12
            r6.h(r10)
        L100:
            com.google.android.gms.internal.measurement.T0 r10 = r3.E()
            r10.getClass()
            com.google.android.gms.internal.measurement.T0 r3 = r3.E()
            r3.getClass()
            r0.getClass()
            O3.X r0 = r0.f5077v
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L146
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "[sgtm] Eligible for local service direct upload. appId"
            r0.c(r1, r2)
            r6.b()
            com.google.android.gms.internal.measurement.q2 r0 = r6.f11012r
            com.google.android.gms.internal.measurement.z1 r0 = (com.google.android.gms.internal.measurement.C0894z1) r0
            r1 = 5
            r0.v(r1)
            r6.b()
            com.google.android.gms.internal.measurement.q2 r0 = r6.f11012r
            com.google.android.gms.internal.measurement.z1 r0 = (com.google.android.gms.internal.measurement.C0894z1) r0
            r0.w(r8)
            O3.P1 r5 = new O3.P1
            com.google.android.gms.internal.measurement.q2 r0 = r6.e()
            com.google.android.gms.internal.measurement.z1 r0 = (com.google.android.gms.internal.measurement.C0894z1) r0
            O3.i1 r1 = O3.EnumC0292i1.SGTM
            r5.<init>(r9, r7, r1, r0)
            goto L19e
        L146:
            r6.b()
            com.google.android.gms.internal.measurement.q2 r1 = r6.f11012r
            com.google.android.gms.internal.measurement.z1 r1 = (com.google.android.gms.internal.measurement.C0894z1) r1
            r3 = 6
            r1.w(r3)
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4666E
            java.lang.String r1 = r2.D()
            java.lang.String r2 = "[sgtm] Local service, missing sgtm_server_url"
            r0.c(r1, r2)
            goto L19e
        L160:
            O3.X r0 = r0.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "[sgtm] Eligible for client side upload. appId"
            r0.c(r1, r2)
            r6.b()
            com.google.android.gms.internal.measurement.q2 r0 = r6.f11012r
            com.google.android.gms.internal.measurement.z1 r0 = (com.google.android.gms.internal.measurement.C0894z1) r0
            r0.v(r10)
            r6.h(r8)
            O3.P1 r5 = new O3.P1
            com.google.android.gms.internal.measurement.q2 r0 = r6.e()
            com.google.android.gms.internal.measurement.z1 r0 = (com.google.android.gms.internal.measurement.C0894z1) r0
            O3.i1 r1 = O3.EnumC0292i1.SGTM_CLIENT
            r5.<init>(r9, r7, r1, r0)
            goto L19e
        L187:
            O3.X r0 = r0.f5077v
            O3.C0323t0.l(r0)
            O3.V r0 = r0.f4666E
            java.lang.String r2 = "[sgtm] Missing sgtm_setting in remote config. appId"
            r0.c(r1, r2)
            r6.b()
            com.google.android.gms.internal.measurement.q2 r0 = r6.f11012r
            com.google.android.gms.internal.measurement.z1 r0 = (com.google.android.gms.internal.measurement.C0894z1) r0
            r1 = 4
            r0.w(r1)
        L19e:
            if (r5 == 0) goto L1a1
            return r5
        L1a1:
            O3.P1 r0 = new O3.P1
            java.lang.String r14 = r13.q(r14)
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            com.google.android.gms.internal.measurement.q2 r2 = r6.e()
            com.google.android.gms.internal.measurement.z1 r2 = (com.google.android.gms.internal.measurement.C0894z1) r2
            r0.<init>(r14, r1, r4, r2)
            return r0
        L1b3:
            r6.b()
            com.google.android.gms.internal.measurement.q2 r0 = r6.f11012r
            com.google.android.gms.internal.measurement.z1 r0 = (com.google.android.gms.internal.measurement.C0894z1) r0
            r0.w(r10)
            O3.P1 r0 = new O3.P1
            java.lang.String r14 = r13.q(r14)
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            com.google.android.gms.internal.measurement.q2 r2 = r6.e()
            com.google.android.gms.internal.measurement.z1 r2 = (com.google.android.gms.internal.measurement.C0894z1) r2
            r0.<init>(r14, r1, r4, r2)
            return r0
        L1cf:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r0 = "null reference"
            r14.<init>(r0)
            throw r14
        L1d7:
            O3.P1 r0 = new O3.P1
            java.lang.String r14 = r13.q(r14)
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.<init>(r14, r1, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.Q1.p(java.lang.String):O3.P1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String q(String str) {
        C0300l0 c0300l0 = this.f4510s.f4607q;
        T1.S(c0300l0);
        String strB = c0300l0.B(str);
        if (TextUtils.isEmpty(strB)) {
            return (String) F.f4453r.a(null);
        }
        Uri uri = Uri.parse((String) F.f4453r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 1 + String.valueOf(authority).length());
        sb.append(strB);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
