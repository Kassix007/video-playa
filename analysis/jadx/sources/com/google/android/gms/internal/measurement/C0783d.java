package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0783d implements Iterable, InterfaceC0833n, InterfaceC0813j {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TreeMap f10817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TreeMap f10818r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0783d() {
        this.f10817q = new TreeMap();
        this.f10818r = new TreeMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Double b() {
        TreeMap treeMap = this.f10817q;
        return treeMap.size() == 1 ? q(0).b() : treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final Iterator d() {
        return new C0778c(this, this.f10817q.keySet().iterator(), this.f10818r.keySet().iterator());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0783d)) {
            return false;
        }
        C0783d c0783d = (C0783d) obj;
        if (p() != c0783d.p()) {
            return false;
        }
        TreeMap treeMap = this.f10817q;
        if (treeMap.isEmpty()) {
            return c0783d.f10817q.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!q(iIntValue).equals(c0783d.q(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0853, code lost:
    
        if (Q2.g.T(r29, r31, (com.google.android.gms.internal.measurement.C0828m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() == p()) goto L378;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0181  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0833n g(java.lang.String r30, E.c0 r31, java.util.ArrayList r32) {
        /*
            r29 = this;
            r1 = r30
            java.lang.String r4 = "concat"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "unshift"
            java.lang.String r7 = "toString"
            java.lang.String r8 = "splice"
            java.lang.String r9 = "sort"
            java.lang.String r10 = "some"
            java.lang.String r11 = "slice"
            java.lang.String r12 = "shift"
            java.lang.String r13 = "reverse"
            java.lang.String r14 = "reduceRight"
            java.lang.String r15 = "reduce"
            r16 = r5
            java.lang.String r5 = "push"
            r17 = r4
            java.lang.String r4 = "pop"
            java.lang.String r0 = "map"
            java.lang.String r2 = "lastIndexOf"
            java.lang.String r3 = "join"
            r18 = r6
            java.lang.String r6 = "indexOf"
            r19 = r7
            java.lang.String r7 = "forEach"
            r20 = r8
            java.lang.String r8 = "filter"
            r21 = r9
            java.lang.String r9 = "every"
            if (r16 != 0) goto Lda
            boolean r16 = r9.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r8.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r7.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r6.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r3.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r2.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r0.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r4.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r5.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r15.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r14.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r13.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r12.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r11.equals(r1)
            if (r16 != 0) goto Lda
            boolean r16 = r10.equals(r1)
            if (r16 != 0) goto Lda
            r16 = r8
            r8 = r21
            boolean r21 = r8.equals(r1)
            if (r21 != 0) goto Ld7
            r21 = r15
            r15 = r20
            boolean r20 = r15.equals(r1)
            if (r20 != 0) goto Ld4
            r20 = r15
            r15 = r19
            boolean r19 = r15.equals(r1)
            if (r19 != 0) goto Lcf
            r19 = r15
            r15 = r18
            boolean r18 = r15.equals(r1)
            if (r18 == 0) goto Lbf
            goto Ldf
        Lbf:
            com.google.android.gms.internal.measurement.q r0 = new com.google.android.gms.internal.measurement.q
            r0.<init>(r1)
            r1 = r29
            r2 = r31
            r3 = r32
            com.google.android.gms.internal.measurement.n r0 = com.google.android.gms.internal.measurement.InterfaceC0813j.i(r1, r0, r2, r3)
            return r0
        Lcf:
            r19 = r15
        Ld1:
            r15 = r18
            goto Ldf
        Ld4:
            r20 = r15
            goto Ld1
        Ld7:
            r21 = r15
            goto Ld1
        Lda:
            r16 = r8
            r8 = r21
            goto Ld7
        Ldf:
            r22 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r18 = r7
            java.lang.Double r7 = java.lang.Double.valueOf(r22)
            int r22 = r1.hashCode()
            r23 = r7
            r26 = -1
            switch(r22) {
                case -1776922004: goto L1ce;
                case -1354795244: goto L1be;
                case -1274492040: goto L1b0;
                case -934873754: goto L1a3;
                case -895859076: goto L193;
                case -678635926: goto L181;
                case -467511597: goto L179;
                case -277637751: goto L170;
                case 107868: goto L168;
                case 111185: goto L15f;
                case 3267882: goto L157;
                case 3452698: goto L14e;
                case 3536116: goto L145;
                case 3536286: goto L13c;
                case 96891675: goto L12d;
                case 109407362: goto L124;
                case 109526418: goto L11b;
                case 965561430: goto L112;
                case 1099846370: goto L109;
                case 1943291465: goto Lfa;
                default: goto Lf2;
            }
        Lf2:
            r14 = r16
            r5 = r18
        Lf6:
            r15 = r19
            goto L1dd
        Lfa:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto Lf2
            r1 = 4
        L101:
            r14 = r16
            r5 = r18
        L105:
            r15 = r19
            goto L1df
        L109:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto Lf2
            r1 = 12
            goto L101
        L112:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto Lf2
            r1 = 11
            goto L101
        L11b:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto Lf2
            r1 = 14
            goto L101
        L124:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto Lf2
            r1 = 13
            goto L101
        L12d:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto Lf2
            r14 = r16
            r5 = r18
            r15 = r19
            r1 = 1
            goto L1df
        L13c:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto Lf2
            r1 = 16
            goto L101
        L145:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto Lf2
            r1 = 15
            goto L101
        L14e:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto Lf2
            r1 = 9
            goto L101
        L157:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lf2
            r1 = 5
            goto L101
        L15f:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lf2
            r1 = 8
            goto L101
        L168:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lf2
            r1 = 7
            goto L101
        L170:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto Lf2
            r1 = 19
            goto L101
        L179:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lf2
            r1 = 6
            goto L101
        L181:
            r5 = r18
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L18f
            r14 = r16
            r15 = r19
            r1 = 3
            goto L1df
        L18f:
            r14 = r16
            goto Lf6
        L193:
            r5 = r18
            r15 = r20
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L18f
            r1 = 17
        L19f:
            r14 = r16
            goto L105
        L1a3:
            r5 = r18
            r14 = r21
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L18f
            r1 = 10
            goto L19f
        L1b0:
            r14 = r16
            r5 = r18
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto Lf6
            r15 = r19
            r1 = 2
            goto L1df
        L1be:
            r14 = r16
            r15 = r17
            r5 = r18
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto Lf6
            r15 = r19
            r1 = 0
            goto L1df
        L1ce:
            r14 = r16
            r5 = r18
            r15 = r19
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L1dd
            r1 = 18
            goto L1df
        L1dd:
            r1 = r26
        L1df:
            java.lang.String r7 = ","
            r30 = r1
            r17 = r9
            r1 = r29
            java.util.TreeMap r9 = r1.f10817q
            com.google.android.gms.internal.measurement.r r18 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10907d
            r19 = r14
            java.lang.String r14 = "Callback should be a method"
            r21 = r5
            r20 = r6
            r27 = 0
            r5 = 0
            switch(r30) {
                case 0: goto L861;
                case 1: goto L81d;
                case 2: goto L7ba;
                case 3: goto L78a;
                case 4: goto L6f3;
                case 5: goto L6b3;
                case 6: goto L608;
                case 7: goto L5d4;
                case 8: goto L5bc;
                case 9: goto L584;
                case 10: goto L57a;
                case 11: goto L570;
                case 12: goto L53b;
                case 13: goto L525;
                case 14: goto L496;
                case 15: goto L420;
                case 16: goto L3c4;
                case 17: goto L2a2;
                case 18: goto L292;
                case 19: goto L201;
                default: goto L1f9;
            }
        L1f9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r0.<init>(r2)
            throw r0
        L201:
            boolean r0 = r32.isEmpty()
            if (r0 != 0) goto L283
            com.google.android.gms.internal.measurement.d r0 = new com.google.android.gms.internal.measurement.d
            r0.<init>()
            int r2 = r32.size()
            r7 = 0
        L211:
            if (r7 >= r2) goto L23b
            r6 = r32
            java.lang.Object r3 = r6.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.internal.measurement.n r3 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r3
            r4 = r31
            java.lang.Object r5 = r4.f1553r
            com.google.android.gms.internal.measurement.t r5 = (com.google.android.gms.internal.measurement.C0862t) r5
            com.google.android.gms.internal.measurement.n r3 = r5.c(r4, r3)
            boolean r5 = r3 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r5 != 0) goto L233
            int r5 = r0.p()
            r0.r(r5, r3)
            goto L211
        L233:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Argument evaluation failed"
            r0.<init>(r2)
            throw r0
        L23b:
            int r2 = r0.p()
            java.util.Iterator r3 = r1.o()
        L243:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L260
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            int r5 = r5 + r2
            int r4 = r4.intValue()
            com.google.android.gms.internal.measurement.n r4 = r1.q(r4)
            r0.r(r5, r4)
            goto L243
        L260:
            r9.clear()
            java.util.Iterator r2 = r0.o()
        L267:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L283
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r3 = r3.intValue()
            com.google.android.gms.internal.measurement.n r3 = r0.q(r3)
            r1.r(r4, r3)
            goto L267
        L283:
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            int r2 = r1.p()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            return r0
        L292:
            r6 = r32
            r0 = 0
            com.google.android.gms.internal.measurement.I1.I0(r0, r15, r6)
            com.google.android.gms.internal.measurement.q r0 = new com.google.android.gms.internal.measurement.q
            java.lang.String r2 = r1.u(r7)
            r0.<init>(r2)
            return r0
        L2a2:
            r4 = r31
            r6 = r32
            r0 = 0
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L2b3
            com.google.android.gms.internal.measurement.d r0 = new com.google.android.gms.internal.measurement.d
            r0.<init>()
            return r0
        L2b3:
            java.lang.Object r2 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r0 = r4.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            java.lang.Object r3 = r4.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r0 = r0.c(r4, r2)
            java.lang.Double r0 = r0.b()
            double r7 = r0.doubleValue()
            double r7 = com.google.android.gms.internal.measurement.I1.P0(r7)
            int r0 = (int) r7
            if (r0 >= 0) goto L2e0
            int r2 = r1.p()
            int r2 = r2 + r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r0 = r2
            goto L2ea
        L2e0:
            int r2 = r1.p()
            if (r0 <= r2) goto L2ea
            int r0 = r1.p()
        L2ea:
            int r2 = r1.p()
            com.google.android.gms.internal.measurement.d r7 = new com.google.android.gms.internal.measurement.d
            r7.<init>()
            int r8 = r6.size()
            r10 = 1
            if (r8 <= r10) goto L3b0
            java.lang.Object r5 = r6.get(r10)
            com.google.android.gms.internal.measurement.n r5 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r5
            com.google.android.gms.internal.measurement.n r5 = r3.c(r4, r5)
            java.lang.Double r5 = r5.b()
            double r10 = r5.doubleValue()
            double r10 = com.google.android.gms.internal.measurement.I1.P0(r10)
            int r5 = (int) r10
            r8 = 0
            int r5 = java.lang.Math.max(r8, r5)
            if (r5 <= 0) goto L332
            r8 = r0
        L319:
            int r10 = r0 + r5
            int r10 = java.lang.Math.min(r2, r10)
            if (r8 >= r10) goto L332
            com.google.android.gms.internal.measurement.n r10 = r1.q(r0)
            int r11 = r7.p()
            r7.r(r11, r10)
            r1.t(r0)
            int r8 = r8 + 1
            goto L319
        L332:
            int r2 = r6.size()
            r5 = 2
            if (r2 <= r5) goto L3c3
            r2 = 2
        L33a:
            int r5 = r6.size()
            if (r2 >= r5) goto L3c3
            java.lang.Object r5 = r6.get(r2)
            com.google.android.gms.internal.measurement.n r5 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r5
            com.google.android.gms.internal.measurement.n r5 = r3.c(r4, r5)
            boolean r8 = r5 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r8 != 0) goto L3a8
            int r8 = r0 + r2
            int r8 = r8 + (-2)
            if (r8 < 0) goto L387
            int r10 = r1.p()
            if (r8 < r10) goto L35e
            r1.r(r8, r5)
            goto L384
        L35e:
            java.lang.Object r10 = r9.lastKey()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
        L368:
            if (r10 < r8) goto L381
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Object r12 = r9.get(r11)
            com.google.android.gms.internal.measurement.n r12 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r12
            if (r12 == 0) goto L37e
            int r13 = r10 + 1
            r1.r(r13, r12)
            r9.remove(r11)
        L37e:
            int r10 = r10 + (-1)
            goto L368
        L381:
            r1.r(r8, r5)
        L384:
            int r2 = r2 + 1
            goto L33a
        L387:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r8)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 21
            r3.<init>(r2)
            java.lang.String r2 = "Invalid value index: "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L3a8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed to parse elements to add"
            r0.<init>(r2)
            throw r0
        L3b0:
            if (r0 >= r2) goto L3c3
            com.google.android.gms.internal.measurement.n r3 = r1.q(r0)
            int r4 = r7.p()
            r7.r(r4, r3)
            r1.r(r0, r5)
            int r0 = r0 + 1
            goto L3b0
        L3c3:
            return r7
        L3c4:
            r4 = r31
            r6 = r32
            r10 = 1
            com.google.android.gms.internal.measurement.I1.K0(r8, r10, r6)
            int r0 = r1.p()
            r2 = 2
            if (r0 < r2) goto L56f
            java.util.List r0 = r1.m()
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L3fc
            r8 = 0
            java.lang.Object r2 = r6.get(r8)
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r3 = r4.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r2 = r3.c(r4, r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.measurement.AbstractC0803h
            if (r3 == 0) goto L3f4
            r5 = r2
            com.google.android.gms.internal.measurement.h r5 = (com.google.android.gms.internal.measurement.AbstractC0803h) r5
            goto L3fc
        L3f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Comparator should be a method"
            r0.<init>(r2)
            throw r0
        L3fc:
            com.google.android.gms.internal.measurement.u r2 = new com.google.android.gms.internal.measurement.u
            r2.<init>(r5, r4)
            java.util.Collections.sort(r0, r2)
            r9.clear()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r3 = 0
            r7 = 0
        L40f:
            if (r3 >= r2) goto L56f
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            com.google.android.gms.internal.measurement.n r4 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r4
            int r5 = r7 + 1
            r1.r(r7, r4)
            r7 = r5
            goto L40f
        L420:
            r4 = r31
            r6 = r32
            r0 = 1
            com.google.android.gms.internal.measurement.I1.I0(r0, r10, r6)
            r0 = 0
            java.lang.Object r2 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r0 = r4.f1553r
            com.google.android.gms.internal.measurement.t r0 = (com.google.android.gms.internal.measurement.C0862t) r0
            com.google.android.gms.internal.measurement.n r0 = r0.c(r4, r2)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.AbstractC0803h
            if (r2 == 0) goto L490
            int r2 = r1.p()
            if (r2 != 0) goto L443
            goto L855
        L443:
            com.google.android.gms.internal.measurement.h r0 = (com.google.android.gms.internal.measurement.AbstractC0803h) r0
            java.util.Iterator r2 = r1.o()
        L449:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L855
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r5 = r1.s(r3)
            if (r5 == 0) goto L449
            com.google.android.gms.internal.measurement.n r5 = r1.q(r3)
            double r6 = (double) r3
            com.google.android.gms.internal.measurement.g r3 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            r3.<init>(r6)
            r6 = 3
            com.google.android.gms.internal.measurement.n[] r7 = new com.google.android.gms.internal.measurement.InterfaceC0833n[r6]
            r16 = 0
            r7[r16] = r5
            r25 = 1
            r7[r25] = r3
            r24 = 2
            r7[r24] = r1
            java.util.List r3 = java.util.Arrays.asList(r7)
            com.google.android.gms.internal.measurement.n r3 = r0.a(r4, r3)
            java.lang.Boolean r3 = r3.c()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L449
            goto L858
        L490:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L496:
            r4 = r31
            r6 = r32
            r2 = 2
            com.google.android.gms.internal.measurement.I1.K0(r11, r2, r6)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L4a9
            com.google.android.gms.internal.measurement.n r0 = r1.l()
            return r0
        L4a9:
            int r0 = r1.p()
            double r2 = (double) r0
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r5 = r4.f1553r
            com.google.android.gms.internal.measurement.t r5 = (com.google.android.gms.internal.measurement.C0862t) r5
            com.google.android.gms.internal.measurement.n r0 = r5.c(r4, r0)
            java.lang.Double r0 = r0.b()
            double r7 = r0.doubleValue()
            double r7 = com.google.android.gms.internal.measurement.I1.P0(r7)
            int r0 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r0 >= 0) goto L4d5
            double r7 = r7 + r2
            r9 = r27
            double r7 = java.lang.Math.max(r7, r9)
            goto L4d9
        L4d5:
            double r7 = java.lang.Math.min(r7, r2)
        L4d9:
            int r0 = r6.size()
            r5 = 2
            if (r0 != r5) goto L50b
            r10 = 1
            java.lang.Object r0 = r6.get(r10)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r5 = r4.f1553r
            com.google.android.gms.internal.measurement.t r5 = (com.google.android.gms.internal.measurement.C0862t) r5
            com.google.android.gms.internal.measurement.n r0 = r5.c(r4, r0)
            java.lang.Double r0 = r0.b()
            double r4 = r0.doubleValue()
            double r4 = com.google.android.gms.internal.measurement.I1.P0(r4)
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 >= 0) goto L507
            double r2 = r2 + r4
            double r2 = java.lang.Math.max(r2, r9)
            goto L50b
        L507:
            double r2 = java.lang.Math.min(r2, r4)
        L50b:
            com.google.android.gms.internal.measurement.d r0 = new com.google.android.gms.internal.measurement.d
            r0.<init>()
            int r4 = (int) r7
        L511:
            double r5 = (double) r4
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L524
            com.google.android.gms.internal.measurement.n r5 = r1.q(r4)
            int r6 = r0.p()
            r0.r(r6, r5)
            int r4 = r4 + 1
            goto L511
        L524:
            return r0
        L525:
            r6 = r32
            r0 = 0
            com.google.android.gms.internal.measurement.I1.I0(r0, r12, r6)
            int r2 = r1.p()
            if (r2 != 0) goto L533
            goto L7ad
        L533:
            com.google.android.gms.internal.measurement.n r2 = r1.q(r0)
            r1.t(r0)
            return r2
        L53b:
            r6 = r32
            r0 = 0
            com.google.android.gms.internal.measurement.I1.I0(r0, r13, r6)
            int r0 = r1.p()
            if (r0 == 0) goto L56f
            r7 = 0
        L548:
            int r2 = r0 / 2
            if (r7 >= r2) goto L56f
            boolean r2 = r1.s(r7)
            if (r2 == 0) goto L56c
            com.google.android.gms.internal.measurement.n r2 = r1.q(r7)
            r1.r(r7, r5)
            int r3 = r0 + (-1)
            int r3 = r3 - r7
            boolean r4 = r1.s(r3)
            if (r4 == 0) goto L569
            com.google.android.gms.internal.measurement.n r4 = r1.q(r3)
            r1.r(r7, r4)
        L569:
            r1.r(r3, r2)
        L56c:
            int r7 = r7 + 1
            goto L548
        L56f:
            return r1
        L570:
            r4 = r31
            r6 = r32
            r0 = 0
            com.google.android.gms.internal.measurement.n r0 = Q2.g.S(r1, r4, r6, r0)
            return r0
        L57a:
            r4 = r31
            r6 = r32
            r10 = 1
            com.google.android.gms.internal.measurement.n r0 = Q2.g.S(r1, r4, r6, r10)
            return r0
        L584:
            r4 = r31
            r6 = r32
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L5ad
            int r0 = r6.size()
            r7 = 0
        L593:
            if (r7 >= r0) goto L5ad
            java.lang.Object r2 = r6.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r3 = r4.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r2 = r3.c(r4, r2)
            int r3 = r1.p()
            r1.r(r3, r2)
            goto L593
        L5ad:
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            int r2 = r1.p()
            double r2 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            return r0
        L5bc:
            r6 = r32
            r8 = 0
            com.google.android.gms.internal.measurement.I1.I0(r8, r4, r6)
            int r0 = r1.p()
            if (r0 != 0) goto L5ca
            goto L7ad
        L5ca:
            int r0 = r0 + (-1)
            com.google.android.gms.internal.measurement.n r2 = r1.q(r0)
            r1.t(r0)
            return r2
        L5d4:
            r4 = r31
            r6 = r32
            r8 = 0
            r10 = 1
            com.google.android.gms.internal.measurement.I1.I0(r10, r0, r6)
            java.lang.Object r0 = r6.get(r8)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r4.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r0 = r2.c(r4, r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C0828m
            if (r2 == 0) goto L602
            int r2 = r1.p()
            if (r2 != 0) goto L5fb
            com.google.android.gms.internal.measurement.d r0 = new com.google.android.gms.internal.measurement.d
            r0.<init>()
            return r0
        L5fb:
            com.google.android.gms.internal.measurement.m r0 = (com.google.android.gms.internal.measurement.C0828m) r0
            com.google.android.gms.internal.measurement.d r0 = Q2.g.T(r1, r4, r0, r5, r5)
            return r0
        L602:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L608:
            r4 = r31
            r6 = r32
            r5 = 2
            com.google.android.gms.internal.measurement.I1.K0(r2, r5, r6)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L625
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r4.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r18 = r2.c(r4, r0)
        L625:
            r0 = r18
            int r2 = r1.p()
            int r2 = r2 + (-1)
            int r3 = r6.size()
            r10 = 1
            if (r3 <= r10) goto L672
            java.lang.Object r2 = r6.get(r10)
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r3 = r4.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r2 = r3.c(r4, r2)
            java.lang.Double r3 = r2.b()
            double r3 = r3.doubleValue()
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto L65a
            int r2 = r1.p()
            int r2 = r2 + (-1)
            double r2 = (double) r2
        L657:
            r27 = 0
            goto L667
        L65a:
            java.lang.Double r2 = r2.b()
            double r2 = r2.doubleValue()
            double r2 = com.google.android.gms.internal.measurement.I1.P0(r2)
            goto L657
        L667:
            int r4 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r4 >= 0) goto L675
            int r4 = r1.p()
            double r4 = (double) r4
            double r2 = r2 + r4
            goto L675
        L672:
            r27 = 0
            double r2 = (double) r2
        L675:
            int r4 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r4 >= 0) goto L681
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            r5 = r23
            r0.<init>(r5)
            return r0
        L681:
            r5 = r23
            int r4 = r1.p()
            double r6 = (double) r4
            double r2 = java.lang.Math.min(r6, r2)
            int r2 = (int) r2
        L68d:
            if (r2 < 0) goto L6ad
            boolean r3 = r1.s(r2)
            if (r3 == 0) goto L6aa
            com.google.android.gms.internal.measurement.n r3 = r1.q(r2)
            boolean r3 = com.google.android.gms.internal.measurement.I1.N0(r3, r0)
            if (r3 == 0) goto L6aa
            double r2 = (double) r2
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.<init>(r2)
            return r0
        L6aa:
            int r2 = r2 + (-1)
            goto L68d
        L6ad:
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            r0.<init>(r5)
            return r0
        L6b3:
            r4 = r31
            r6 = r32
            r10 = 1
            com.google.android.gms.internal.measurement.I1.K0(r3, r10, r6)
            int r0 = r1.p()
            if (r0 != 0) goto L6c4
            com.google.android.gms.internal.measurement.q r0 = com.google.android.gms.internal.measurement.InterfaceC0833n.f10911k
            return r0
        L6c4:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L6e9
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r4.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r0 = r2.c(r4, r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C0823l
            if (r2 != 0) goto L6e7
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.r
            if (r2 == 0) goto L6e2
            goto L6e7
        L6e2:
            java.lang.String r7 = r0.zzc()
            goto L6e9
        L6e7:
            java.lang.String r7 = ""
        L6e9:
            com.google.android.gms.internal.measurement.q r0 = new com.google.android.gms.internal.measurement.q
            java.lang.String r2 = r1.u(r7)
            r0.<init>(r2)
            return r0
        L6f3:
            r4 = r31
            r6 = r32
            r0 = r20
            r5 = r23
            r2 = 2
            com.google.android.gms.internal.measurement.I1.K0(r0, r2, r6)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L714
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r4.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r18 = r2.c(r4, r0)
        L714:
            r0 = r18
            int r2 = r6.size()
            r10 = 1
            if (r2 <= r10) goto L753
            java.lang.Object r2 = r6.get(r10)
            com.google.android.gms.internal.measurement.n r2 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r2
            java.lang.Object r3 = r4.f1553r
            com.google.android.gms.internal.measurement.t r3 = (com.google.android.gms.internal.measurement.C0862t) r3
            com.google.android.gms.internal.measurement.n r2 = r3.c(r4, r2)
            java.lang.Double r2 = r2.b()
            double r2 = r2.doubleValue()
            double r2 = com.google.android.gms.internal.measurement.I1.P0(r2)
            int r4 = r1.p()
            double r6 = (double) r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L746
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            r0.<init>(r5)
            return r0
        L746:
            r27 = 0
            int r4 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r4 >= 0) goto L757
            int r4 = r1.p()
            double r6 = (double) r4
            double r2 = r2 + r6
            goto L757
        L753:
            r27 = 0
            r2 = r27
        L757:
            java.util.Iterator r4 = r1.o()
        L75b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L784
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            double r7 = (double) r6
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 < 0) goto L75b
            com.google.android.gms.internal.measurement.n r6 = r1.q(r6)
            boolean r6 = com.google.android.gms.internal.measurement.I1.N0(r6, r0)
            if (r6 == 0) goto L75b
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
            r0.<init>(r2)
            return r0
        L784:
            com.google.android.gms.internal.measurement.g r0 = new com.google.android.gms.internal.measurement.g
            r0.<init>(r5)
            return r0
        L78a:
            r4 = r31
            r6 = r32
            r0 = r21
            r10 = 1
            com.google.android.gms.internal.measurement.I1.I0(r10, r0, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r4.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r0 = r2.c(r4, r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C0828m
            if (r2 == 0) goto L7b4
            int r2 = r9.size()
            if (r2 != 0) goto L7ae
        L7ad:
            return r18
        L7ae:
            com.google.android.gms.internal.measurement.m r0 = (com.google.android.gms.internal.measurement.C0828m) r0
            Q2.g.T(r1, r4, r0, r5, r5)
            return r18
        L7b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L7ba:
            r4 = r31
            r6 = r32
            r0 = r19
            r10 = 1
            com.google.android.gms.internal.measurement.I1.I0(r10, r0, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r4.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r0 = r2.c(r4, r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C0828m
            if (r2 == 0) goto L817
            int r2 = r9.size()
            if (r2 != 0) goto L7e3
            com.google.android.gms.internal.measurement.d r0 = new com.google.android.gms.internal.measurement.d
            r0.<init>()
            return r0
        L7e3:
            com.google.android.gms.internal.measurement.n r2 = r1.l()
            com.google.android.gms.internal.measurement.d r2 = (com.google.android.gms.internal.measurement.C0783d) r2
            com.google.android.gms.internal.measurement.m r0 = (com.google.android.gms.internal.measurement.C0828m) r0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.measurement.d r0 = Q2.g.T(r1, r4, r0, r5, r3)
            com.google.android.gms.internal.measurement.d r3 = new com.google.android.gms.internal.measurement.d
            r3.<init>()
            java.util.Iterator r0 = r0.o()
        L7fa:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L816
            java.lang.Object r4 = r0.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.measurement.n r4 = r2.q(r4)
            int r5 = r3.p()
            r3.r(r5, r4)
            goto L7fa
        L816:
            return r3
        L817:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L81d:
            r4 = r31
            r6 = r32
            r0 = r17
            r10 = 1
            com.google.android.gms.internal.measurement.I1.I0(r10, r0, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r2 = r4.f1553r
            com.google.android.gms.internal.measurement.t r2 = (com.google.android.gms.internal.measurement.C0862t) r2
            com.google.android.gms.internal.measurement.n r0 = r2.c(r4, r0)
            boolean r2 = r0 instanceof com.google.android.gms.internal.measurement.C0828m
            if (r2 == 0) goto L85b
            int r2 = r1.p()
            if (r2 != 0) goto L841
            goto L858
        L841:
            com.google.android.gms.internal.measurement.m r0 = (com.google.android.gms.internal.measurement.C0828m) r0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            com.google.android.gms.internal.measurement.d r0 = Q2.g.T(r1, r4, r0, r2, r3)
            int r0 = r0.p()
            int r2 = r1.p()
            if (r0 == r2) goto L858
        L855:
            com.google.android.gms.internal.measurement.e r0 = com.google.android.gms.internal.measurement.InterfaceC0833n.j
            return r0
        L858:
            com.google.android.gms.internal.measurement.e r0 = com.google.android.gms.internal.measurement.InterfaceC0833n.i
            return r0
        L85b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r14)
            throw r0
        L861:
            r4 = r31
            r6 = r32
            r0 = 0
            com.google.android.gms.internal.measurement.n r2 = r1.l()
            com.google.android.gms.internal.measurement.d r2 = (com.google.android.gms.internal.measurement.C0783d) r2
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L8c4
            int r3 = r6.size()
            r7 = r0
        L877:
            if (r7 >= r3) goto L8c4
            java.lang.Object r0 = r6.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.internal.measurement.n r0 = (com.google.android.gms.internal.measurement.InterfaceC0833n) r0
            java.lang.Object r5 = r4.f1553r
            com.google.android.gms.internal.measurement.t r5 = (com.google.android.gms.internal.measurement.C0862t) r5
            com.google.android.gms.internal.measurement.n r0 = r5.c(r4, r0)
            boolean r5 = r0 instanceof com.google.android.gms.internal.measurement.C0793f
            if (r5 != 0) goto L8bc
            int r5 = r2.p()
            boolean r8 = r0 instanceof com.google.android.gms.internal.measurement.C0783d
            if (r8 == 0) goto L8b8
            com.google.android.gms.internal.measurement.d r0 = (com.google.android.gms.internal.measurement.C0783d) r0
            java.util.Iterator r8 = r0.o()
        L89b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L877
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r10 = r9.intValue()
            int r10 = r10 + r5
            int r9 = r9.intValue()
            com.google.android.gms.internal.measurement.n r9 = r0.q(r9)
            r2.r(r10, r9)
            goto L89b
        L8b8:
            r2.r(r5, r0)
            goto L877
        L8bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed evaluation of arguments"
            r0.<init>(r2)
            throw r0
        L8c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0783d.g(java.lang.String, E.c0, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final InterfaceC0833n h(String str) {
        InterfaceC0833n interfaceC0833n;
        return "length".equals(str) ? new C0798g(Double.valueOf(p())) : (!j(str) || (interfaceC0833n = (InterfaceC0833n) this.f10818r.get(str)) == null) ? InterfaceC0833n.f10907d : interfaceC0833n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10817q.hashCode() * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0843p(2, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final boolean j(String str) {
        return "length".equals(str) || this.f10818r.containsKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0813j
    public final void k(String str, InterfaceC0833n interfaceC0833n) {
        TreeMap treeMap = this.f10818r;
        if (interfaceC0833n == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC0833n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final InterfaceC0833n l() {
        C0783d c0783d = new C0783d();
        for (Map.Entry entry : this.f10817q.entrySet()) {
            boolean z5 = entry.getValue() instanceof InterfaceC0813j;
            TreeMap treeMap = c0783d.f10817q;
            if (z5) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC0833n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC0833n) entry.getValue()).l());
            }
        }
        return c0783d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List m() {
        ArrayList arrayList = new ArrayList(p());
        for (int i = 0; i < p(); i++) {
            arrayList.add(q(i));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Iterator o() {
        return this.f10817q.keySet().iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int p() {
        TreeMap treeMap = this.f10817q;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0833n q(int i) {
        InterfaceC0833n interfaceC0833n;
        if (i < p()) {
            return (!s(i) || (interfaceC0833n = (InterfaceC0833n) this.f10817q.get(Integer.valueOf(i))) == null) ? InterfaceC0833n.f10907d : interfaceC0833n;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(int i, InterfaceC0833n interfaceC0833n) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        TreeMap treeMap = this.f10817q;
        if (interfaceC0833n == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), interfaceC0833n);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean s(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f10817q;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(int i) {
        TreeMap treeMap = this.f10817q;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i7 = i - 1;
            Integer numValueOf = Integer.valueOf(i7);
            if (treeMap.containsKey(numValueOf) || i7 < 0) {
                return;
            }
            treeMap.put(numValueOf, InterfaceC0833n.f10907d);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            InterfaceC0833n interfaceC0833n = (InterfaceC0833n) treeMap.get(numValueOf2);
            if (interfaceC0833n != null) {
                treeMap.put(Integer.valueOf(i - 1), interfaceC0833n);
                treeMap.remove(numValueOf2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return u(",");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String u(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f10817q.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= p()) {
                    break;
                }
                InterfaceC0833n interfaceC0833nQ = q(i);
                sb.append(str2);
                if (!(interfaceC0833nQ instanceof r) && !(interfaceC0833nQ instanceof C0823l)) {
                    sb.append(interfaceC0833nQ.zzc());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0833n
    public final String zzc() {
        return u(",");
    }

    public C0783d(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                r(i, (InterfaceC0833n) list.get(i));
            }
        }
    }
}
