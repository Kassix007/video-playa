package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0786d2 extends C0818k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B0.G0 f10820r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0786d2(B0.G0 g02) {
        this.f10820r = g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // com.google.android.gms.internal.measurement.C0818k, com.google.android.gms.internal.measurement.InterfaceC0833n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0833n g(java.lang.String r17, E.c0 r18, java.util.ArrayList r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.hashCode()
            java.lang.String r4 = "getEventName"
            r5 = 3
            java.lang.String r6 = "getTimestamp"
            java.lang.String r7 = "getParamValue"
            java.lang.String r8 = "getParams"
            java.lang.String r10 = "setParamValue"
            r11 = 4
            java.lang.String r12 = "setEventName"
            r13 = 2
            r14 = 1
            switch(r3) {
                case 21624207: goto L50;
                case 45521504: goto L46;
                case 146575578: goto L3c;
                case 700587132: goto L32;
                case 920706790: goto L28;
                case 1570616835: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L58
        L1e:
            boolean r3 = r0.equals(r12)
            if (r3 == 0) goto L58
            r15 = r16
            r3 = r11
            goto L5a
        L28:
            boolean r3 = r0.equals(r10)
            if (r3 == 0) goto L58
            r3 = 5
        L2f:
            r15 = r16
            goto L5a
        L32:
            boolean r3 = r0.equals(r8)
            if (r3 == 0) goto L58
            r15 = r16
            r3 = r13
            goto L5a
        L3c:
            boolean r3 = r0.equals(r7)
            if (r3 == 0) goto L58
            r15 = r16
            r3 = r14
            goto L5a
        L46:
            boolean r3 = r0.equals(r6)
            if (r3 == 0) goto L58
            r15 = r16
            r3 = r5
            goto L5a
        L50:
            boolean r3 = r0.equals(r4)
            if (r3 == 0) goto L58
            r3 = 0
            goto L2f
        L58:
            r3 = -1
            goto L2f
        L5a:
            B0.G0 r9 = r15.f10820r
            if (r3 == 0) goto L15e
            if (r3 == r14) goto L131
            if (r3 == r13) goto L101
            if (r3 == r5) goto Lec
            if (r3 == r11) goto Lae
            r4 = 5
            if (r3 == r4) goto L6e
            com.google.android.gms.internal.measurement.n r0 = super.g(r17, r18, r19)
            return r0
        L6e:
            com.google.android.gms.internal.measurement.I1.I0(r13, r10, r2)
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r3 = r1.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r0 = r3.c(r1, r0)
            java.lang.String r0 = r0.zzc()
            java.lang.Object r2 = r2.get(r14)
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r3 = r1.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r1 = r3.c(r1, r2)
            java.lang.Object r2 = r9.f235s
            com.google.android.gms.internal.measurement.b r2 = (com.google.android.gms.internal.measurement.C0773b) r2
            java.lang.Object r3 = com.google.android.gms.internal.measurement.I1.Q0(r1)
            java.util.HashMap r2 = r2.f10801c
            if (r3 != 0) goto La2
            r2.remove(r0)
            return r1
        La2:
            java.lang.Object r4 = r2.get(r0)
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C0773b.b(r4, r3, r0)
            r2.put(r0, r3)
            return r1
        Lae:
            com.google.android.gms.internal.measurement.I1.I0(r14, r12, r2)
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r1.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r0 = r2.c(r1, r0)
            com.google.android.gms.internal.measurement.r r1 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Le4
            com.google.android.gms.internal.measurement.l r1 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10908e
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Le4
            java.lang.Object r1 = r9.f235s
            com.google.android.gms.internal.measurement.b r1 = (com.google.android.gms.internal.measurement.C0773b) r1
            java.lang.String r2 = r0.zzc()
            r1.f10799a = r2
            com.google.android.gms.internal.measurement.q r1 = new com.google.android.gms.internal.measurement.q
            java.lang.String r0 = r0.zzc()
            r1.<init>(r0)
            return r1
        Le4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Illegal event name"
            r0.<init>(r1)
            throw r0
        Lec:
            r0 = 0
            com.google.android.gms.internal.measurement.I1.I0(r0, r6, r2)
            java.lang.Object r0 = r9.f235s
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.C0773b) r0
            com.google.android.gms.internal.measurement.g r1 = new com.google.android.gms.internal.measurement.g
            long r2 = r0.f10800b
            double r2 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            r1.<init>(r0)
            return r1
        L101:
            r0 = 0
            com.google.android.gms.internal.measurement.I1.I0(r0, r8, r2)
            java.lang.Object r0 = r9.f235s
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.C0773b) r0
            java.util.HashMap r0 = r0.f10801c
            com.google.android.gms.internal.measurement.k r1 = new com.google.android.gms.internal.measurement.k
            r1.<init>()
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L118:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L130
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.internal.measurement.n r4 = com.google.android.gms.internal.measurement.K1.O(r4)
            r1.k(r3, r4)
            goto L118
        L130:
            return r1
        L131:
            com.google.android.gms.internal.measurement.I1.I0(r14, r7, r2)
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r1.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r0 = r2.c(r1, r0)
            java.lang.String r0 = r0.zzc()
            java.lang.Object r1 = r9.f235s
            com.google.android.gms.internal.measurement.b r1 = (com.google.android.gms.internal.measurement.C0773b) r1
            java.util.HashMap r1 = r1.f10801c
            boolean r2 = r1.containsKey(r0)
            if (r2 == 0) goto L158
            java.lang.Object r0 = r1.get(r0)
            goto L159
        L158:
            r0 = 0
        L159:
            com.google.android.gms.internal.measurement.n r0 = com.google.android.gms.internal.measurement.K1.O(r0)
            return r0
        L15e:
            r0 = 0
            com.google.android.gms.internal.measurement.I1.I0(r0, r4, r2)
            java.lang.Object r0 = r9.f235s
            com.google.android.gms.internal.measurement.b r0 = (com.google.android.gms.internal.measurement.C0773b) r0
            com.google.android.gms.internal.measurement.q r1 = new com.google.android.gms.internal.measurement.q
            java.lang.String r0 = r0.f10799a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0786d2.g(java.lang.String, E.c0, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }
}
