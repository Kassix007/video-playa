package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class z4 extends AbstractC0803h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f11130t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ R1 f11131u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(R1 r12, boolean z5, boolean z6) {
        super("log");
        this.f11131u = r12;
        this.f11129s = z5;
        this.f11130t = z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    @Override // com.google.android.gms.internal.measurement.AbstractC0803h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0833n a(E.c0 r18, java.util.List r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 1
            java.lang.String r4 = "log"
            com.google.android.gms.internal.measurement.I1.J0(r3, r4, r2)
            int r4 = r2.size()
            r5 = 0
            com.google.android.gms.internal.measurement.r r6 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            com.google.android.gms.internal.measurement.R1 r7 = r0.f11131u
            if (r4 != r3) goto L39
            java.lang.Object r2 = r2.get(r5)
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r3 = r1.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r1 = r3.c(r1, r2)
            java.lang.String r10 = r1.zzc()
            java.util.List r11 = java.util.Collections.EMPTY_LIST
            java.lang.Object r1 = r7.f10696t
            r8 = r1
            k3.d r8 = (k3.d) r8
            r9 = 3
            boolean r12 = r0.f11129s
            boolean r13 = r0.f11130t
            r8.C(r9, r10, r11, r12, r13)
            return r6
        L39:
            java.lang.Object r4 = r2.get(r5)
            com.google.android.gms.internal.measurement.n r4 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r4
            java.lang.Object r5 = r1.f1553r
            com.google.android.gms.internal.measurement.t r5 = (com.google.android.gms.internal.measurement.C0862t) r5
            java.lang.Object r8 = r1.f1553r
            com.google.android.gms.internal.measurement.t r8 = (com.google.android.gms.internal.measurement.C0862t) r8
            com.google.android.gms.internal.measurement.n r4 = r5.c(r1, r4)
            java.lang.Double r4 = r4.b()
            double r4 = r4.doubleValue()
            int r4 = com.google.android.gms.internal.measurement.I1.O0(r4)
            r5 = 5
            r9 = 2
            if (r4 == r9) goto L6b
            r10 = 3
            if (r4 == r10) goto L69
            if (r4 == r5) goto L67
            r11 = 6
            if (r4 == r11) goto L65
        L63:
            r12 = r10
            goto L6d
        L65:
            r12 = r9
            goto L6d
        L67:
            r12 = r5
            goto L6d
        L69:
            r12 = r3
            goto L6d
        L6b:
            r10 = 4
            goto L63
        L6d:
            java.lang.Object r3 = r2.get(r3)
            com.google.android.gms.internal.measurement.n r3 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r3
            com.google.android.gms.internal.measurement.n r3 = r8.c(r1, r3)
            java.lang.String r13 = r3.zzc()
            int r3 = r2.size()
            if (r3 != r9) goto L92
            java.util.List r14 = java.util.Collections.EMPTY_LIST
            java.lang.Object r1 = r7.f10696t
            r11 = r1
            k3.d r11 = (k3.d) r11
            boolean r15 = r0.f11129s
            boolean r1 = r0.f11130t
            r16 = r1
            r11.C(r12, r13, r14, r15, r16)
            return r6
        L92:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L97:
            int r3 = r2.size()
            int r3 = java.lang.Math.min(r3, r5)
            if (r9 >= r3) goto Lb5
            java.lang.Object r3 = r2.get(r9)
            com.google.android.gms.internal.measurement.n r3 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r3
            com.google.android.gms.internal.measurement.n r3 = r8.c(r1, r3)
            java.lang.String r3 = r3.zzc()
            r14.add(r3)
            int r9 = r9 + 1
            goto L97
        Lb5:
            java.lang.Object r1 = r7.f10696t
            r11 = r1
            k3.d r11 = (k3.d) r11
            boolean r15 = r0.f11129s
            boolean r1 = r0.f11130t
            r16 = r1
            r11.C(r12, r13, r14, r15, r16)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z4.a(E.c0, java.util.List):com.google.android.gms.internal.measurement.n");
    }
}
