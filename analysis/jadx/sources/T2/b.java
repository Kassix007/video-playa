package T2;

import d6.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f7439a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [R4.b2.invoke():java.lang.Object] */
    public /* synthetic */ b(q qVar) {
        this.f7439a = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(d6.q r8, Q2.t r9, Q2.k r10, s5.c r11) throws java.io.IOException {
        /*
            boolean r0 = r11 instanceof T2.a
            if (r0 == 0) goto L13
            r0 = r11
            T2.a r0 = (T2.a) r0
            int r1 = r0.f7438t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7438t = r1
            goto L18
        L13:
            T2.a r0 = new T2.a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f7437s
            int r1 = r0.f7438t
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto L51
            if (r1 == r4) goto L46
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r8 = r0.f7435q
            java.io.Closeable r8 = (java.io.Closeable) r8
            m5.AbstractC1362a.e(r11)     // Catch: java.lang.Throwable -> L33
            goto Lac
        L33:
            r9 = move-exception
            goto Lb4
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.f7435q
            B5.e r8 = (B5.e) r8
            m5.AbstractC1362a.e(r11)
            goto L96
        L46:
            d6.q r8 = r0.f7436r
            java.lang.Object r9 = r0.f7435q
            r10 = r9
            B5.e r10 = (B5.e) r10
            m5.AbstractC1362a.e(r11)
            goto L61
        L51:
            m5.AbstractC1362a.e(r11)
            r0.f7435q = r10
            r0.f7436r = r8
            r0.f7438t = r4
            d6.s r11 = D5.a.l(r9, r0)
            if (r11 != r6) goto L61
            goto Laa
        L61:
            d6.s r11 = (d6.s) r11
            r8.getClass()
            java.lang.String r9 = "request"
            kotlin.jvm.internal.m.e(r11, r9)
            h6.h r9 = new h6.h
            r9.<init>(r8, r11)
            r0.f7435q = r10
            r0.f7436r = r5
            r0.f7438t = r3
            M5.h r8 = new M5.h
            q5.c r11 = n5.AbstractC1397A.v(r0)
            r8.<init>(r4, r11)
            r8.s()
            H2.g r11 = new H2.g
            r1 = 1
            r11.<init>(r9, r8, r1)
            r9.e(r11)
            r8.u(r11)
            java.lang.Object r11 = r8.r()
            if (r11 != r6) goto L95
            goto Laa
        L95:
            r8 = r10
        L96:
            r9 = r11
            java.io.Closeable r9 = (java.io.Closeable) r9
            r10 = r9
            d6.u r10 = (d6.u) r10     // Catch: java.lang.Throwable -> Lb0
            Q2.u r10 = D5.a.k(r10)     // Catch: java.lang.Throwable -> Lb0
            r0.f7435q = r9     // Catch: java.lang.Throwable -> Lb0
            r0.f7438t = r2     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r11 = r8.invoke(r10, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r11 != r6) goto Lab
        Laa:
            return r6
        Lab:
            r8 = r9
        Lac:
            com.google.android.gms.internal.measurement.I1.N(r8, r5)
            return r11
        Lb0:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        Lb4:
            throw r9     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r10 = move-exception
            com.google.android.gms.internal.measurement.I1.N(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.a(d6.q, Q2.t, Q2.k, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f7439a.equals(((b) obj).f7439a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7439a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f7439a + ')';
    }
}
