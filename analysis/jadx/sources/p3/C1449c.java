package p3;

/* JADX INFO: renamed from: p3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1449c extends J {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1449c(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int z(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String A() {
        int iZ;
        if (m()) {
            return null;
        }
        char cCharAt = ((String) this.f15670c).charAt(this.f15668a);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.f15668a++;
        int iIntValue = p().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = p().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = p().intValue();
                    } else {
                        int iZ2 = z(iIntValue);
                        if (iZ2 != -1) {
                            for (int i = 1; i <= 5 && (iZ = z((iIntValue = p().intValue()))) != -1; i++) {
                                iZ2 = (iZ2 * 16) + iZ;
                            }
                            sb.append((char) iZ2);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = p().intValue();
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String B() {
        int i;
        int i7;
        String str = (String) this.f15670c;
        if (m()) {
            i7 = this.f15668a;
        } else {
            int i8 = this.f15668a;
            int iCharAt = str.charAt(i8);
            if (iCharAt == 45) {
                iCharAt = g();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i8;
            } else {
                int iG = g();
                while (true) {
                    if ((iG < 65 || iG > 90) && ((iG < 97 || iG > 122) && !((iG >= 48 && iG <= 57) || iG == 45 || iG == 95))) {
                        break;
                    }
                    iG = g();
                }
                i = this.f15668a;
            }
            this.f15668a = i8;
            i7 = i;
        }
        int i9 = this.f15668a;
        if (i7 == i9) {
            return null;
        }
        String strSubstring = str.substring(i9, i7);
        this.f15668a = i7;
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:294:0x006d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:295:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:298:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x007b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x00a1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00cc */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0241, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r11v10, types: [p3.n] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [p3.n] */
    /* JADX WARN: Type inference failed for: r11v13, types: [p3.n] */
    /* JADX WARN: Type inference failed for: r11v14, types: [p3.n] */
    /* JADX WARN: Type inference failed for: r11v15, types: [p3.n] */
    /* JADX WARN: Type inference failed for: r11v16, types: [p3.n] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [p3.n] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36, types: [M.t] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList C() throws p3.C1445a {
        /*
            r28 = this;
            r0 = r28
            boolean r1 = r0.m()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 1
            r1.<init>(r3)
            p3.m r4 = new p3.m
            r4.<init>()
        L15:
            boolean r5 = r0.m()
            if (r5 != 0) goto L47c
            boolean r5 = r0.m()
            if (r5 == 0) goto L23
            goto L47c
        L23:
            int r5 = r0.f15668a
            java.util.ArrayList r6 = r4.f15788a
            r8 = 2
            r10 = 43
            if (r6 == 0) goto L4b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L33
            goto L4b
        L33:
            r6 = 62
            boolean r6 = r0.j(r6)
            if (r6 == 0) goto L40
            r0.y()
            r6 = r8
            goto L4c
        L40:
            boolean r6 = r0.j(r10)
            if (r6 == 0) goto L4b
            r0.y()
            r6 = 3
            goto L4c
        L4b:
            r6 = 0
        L4c:
            r11 = 42
            boolean r11 = r0.j(r11)
            if (r11 == 0) goto L5a
            p3.n r11 = new p3.n
            r11.<init>(r6, r2)
            goto L6d
        L5a:
            java.lang.String r11 = r0.B()
            if (r11 == 0) goto L6c
            p3.n r12 = new p3.n
            r12.<init>(r6, r11)
            int r11 = r4.f15789b
            int r11 = r11 + r3
            r4.f15789b = r11
            r11 = r12
            goto L6d
        L6c:
            r11 = r2
        L6d:
            boolean r12 = r0.m()
            if (r12 != 0) goto L455
            r12 = 46
            boolean r12 = r0.j(r12)
            if (r12 == 0) goto L99
            if (r11 != 0) goto L82
            p3.n r11 = new p3.n
            r11.<init>(r6, r2)
        L82:
            java.lang.String r12 = r0.B()
            if (r12 == 0) goto L91
            java.lang.String r13 = "class"
            r11.a(r13, r12, r8)
            r4.a()
            goto L6d
        L91:
            p3.a r1 = new p3.a
            java.lang.String r2 = "Invalid \".class\" simpleSelectors"
            r1.<init>(r2)
            throw r1
        L99:
            r12 = 35
            boolean r12 = r0.j(r12)
            if (r12 == 0) goto Lc4
            if (r11 != 0) goto La8
            p3.n r11 = new p3.n
            r11.<init>(r6, r2)
        La8:
            java.lang.String r12 = r0.B()
            if (r12 == 0) goto Lbc
            java.lang.String r13 = "id"
            r11.a(r13, r12, r8)
            int r12 = r4.f15789b
            r13 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = r12 + r13
            r4.f15789b = r12
            goto L6d
        Lbc:
            p3.a r1 = new p3.a
            java.lang.String r2 = "Invalid \"#id\" simpleSelectors"
            r1.<init>(r2)
            throw r1
        Lc4:
            r12 = 91
            boolean r12 = r0.j(r12)
            if (r12 == 0) goto L144
            if (r11 != 0) goto Ld3
            p3.n r11 = new p3.n
            r11.<init>(r6, r2)
        Ld3:
            r0.y()
            java.lang.String r12 = r0.B()
            java.lang.String r13 = "Invalid attribute simpleSelectors"
            if (r12 == 0) goto L13e
            r0.y()
            r14 = 61
            boolean r14 = r0.j(r14)
            if (r14 == 0) goto Leb
            r14 = r8
            goto L100
        Leb:
            java.lang.String r14 = "~="
            boolean r14 = r0.k(r14)
            if (r14 == 0) goto Lf5
            r14 = 3
            goto L100
        Lf5:
            java.lang.String r14 = "|="
            boolean r14 = r0.k(r14)
            if (r14 == 0) goto Lff
            r14 = 4
            goto L100
        Lff:
            r14 = 0
        L100:
            if (r14 == 0) goto L124
            r0.y()
            boolean r15 = r0.m()
            if (r15 == 0) goto L10d
            r15 = r2
            goto L118
        L10d:
            java.lang.String r15 = r0.s()
            if (r15 == 0) goto L114
            goto L118
        L114:
            java.lang.String r15 = r0.B()
        L118:
            if (r15 == 0) goto L11e
            r0.y()
            goto L125
        L11e:
            p3.a r1 = new p3.a
            r1.<init>(r13)
            throw r1
        L124:
            r15 = r2
        L125:
            r7 = 93
            boolean r7 = r0.j(r7)
            if (r7 == 0) goto L138
            if (r14 != 0) goto L130
            r14 = r3
        L130:
            r11.a(r12, r15, r14)
            r4.a()
            goto L6d
        L138:
            p3.a r1 = new p3.a
            r1.<init>(r13)
            throw r1
        L13e:
            p3.a r1 = new p3.a
            r1.<init>(r13)
            throw r1
        L144:
            r7 = 58
            boolean r7 = r0.j(r7)
            if (r7 == 0) goto L455
            if (r11 != 0) goto L154
            p3.n r7 = new p3.n
            r7.<init>(r6, r2)
            r11 = r7
        L154:
            java.lang.String r7 = r0.B()
            if (r7 == 0) goto L44d
            java.util.HashMap r12 = p3.EnumC1459h.f15775u
            java.lang.Object r12 = r12.get(r7)
            p3.h r12 = (p3.EnumC1459h) r12
            if (r12 == 0) goto L165
            goto L167
        L165:
            p3.h r12 = p3.EnumC1459h.f15774t
        L167:
            int r13 = r12.ordinal()
            java.lang.String r14 = "Invalid or missing parameter section for pseudo class: "
            r15 = 41
            r10 = 40
            switch(r13) {
                case 0: goto L42c;
                case 1: goto L420;
                case 2: goto L2f8;
                case 3: goto L2f8;
                case 4: goto L2f8;
                case 5: goto L2f8;
                case 6: goto L2e1;
                case 7: goto L2ca;
                case 8: goto L2b1;
                case 9: goto L298;
                case 10: goto L28c;
                case 11: goto L27f;
                case 12: goto L274;
                case 13: goto L1ce;
                case 14: goto L18c;
                case 15: goto L180;
                case 16: goto L180;
                case 17: goto L180;
                case 18: goto L180;
                case 19: goto L180;
                case 20: goto L180;
                case 21: goto L180;
                case 22: goto L180;
                case 23: goto L180;
                default: goto L174;
            }
        L174:
            p3.a r1 = new p3.a
            java.lang.String r2 = "Unsupported pseudo class: "
            java.lang.String r2 = r2.concat(r7)
            r1.<init>(r2)
            throw r1
        L180:
            p3.j r10 = new p3.j
            r10.<init>(r7)
            r4.a()
        L188:
            r13 = 43
            goto L437
        L18c:
            boolean r12 = r0.m()
            if (r12 == 0) goto L193
            goto L1c5
        L193:
            int r12 = r0.f15668a
            boolean r10 = r0.j(r10)
            if (r10 != 0) goto L19c
            goto L1c5
        L19c:
            r0.y()
            r10 = r2
        L1a0:
            java.lang.String r13 = r0.B()
            if (r13 != 0) goto L1a9
            r0.f15668a = r12
            goto L1c5
        L1a9:
            if (r10 != 0) goto L1b0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L1b0:
            r10.add(r13)
            r0.y()
            boolean r13 = r0.x()
            if (r13 != 0) goto L1a0
            boolean r10 = r0.j(r15)
            if (r10 == 0) goto L1c3
            goto L1c5
        L1c3:
            r0.f15668a = r12
        L1c5:
            p3.j r10 = new p3.j
            r10.<init>(r7)
            r4.a()
            goto L188
        L1ce:
            boolean r12 = r0.m()
            if (r12 == 0) goto L1d7
        L1d4:
            r10 = r2
            goto L245
        L1d7:
            int r12 = r0.f15668a
            boolean r10 = r0.j(r10)
            if (r10 != 0) goto L1e0
            goto L1d4
        L1e0:
            r0.y()
            java.util.ArrayList r10 = r0.C()
            if (r10 != 0) goto L1ec
            r0.f15668a = r12
            goto L1d4
        L1ec:
            boolean r13 = r0.j(r15)
            if (r13 != 0) goto L1f5
            r0.f15668a = r12
            goto L1d4
        L1f5:
            int r12 = r10.size()
            r13 = 0
        L1fa:
            if (r13 >= r12) goto L245
            java.lang.Object r15 = r10.get(r13)
            int r13 = r13 + 1
            p3.m r15 = (p3.C1467m) r15
            java.util.ArrayList r15 = r15.f15788a
            if (r15 != 0) goto L209
            goto L245
        L209:
            int r8 = r15.size()
            r2 = 0
        L20e:
            if (r2 >= r8) goto L241
            java.lang.Object r17 = r15.get(r2)
            int r2 = r2 + 1
            r9 = r17
            p3.n r9 = (p3.C1468n) r9
            java.util.ArrayList r9 = r9.f15796d
            if (r9 != 0) goto L21f
            goto L241
        L21f:
            int r3 = r9.size()
            r18 = r2
            r2 = 0
        L226:
            if (r2 >= r3) goto L23d
            java.lang.Object r19 = r9.get(r2)
            int r2 = r2 + 1
            r20 = r2
            r2 = r19
            p3.e r2 = (p3.InterfaceC1453e) r2
            boolean r2 = r2 instanceof p3.C1461i
            if (r2 == 0) goto L23a
            r10 = 0
            goto L245
        L23a:
            r2 = r20
            goto L226
        L23d:
            r2 = r18
            r3 = 1
            goto L20e
        L241:
            r2 = 0
            r3 = 1
            r8 = 2
            goto L1fa
        L245:
            if (r10 == 0) goto L26a
            p3.i r2 = new p3.i
            r2.<init>()
            r2.f15779a = r10
            int r3 = r10.size()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 0
        L255:
            if (r8 >= r3) goto L265
            java.lang.Object r9 = r10.get(r8)
            int r8 = r8 + 1
            p3.m r9 = (p3.C1467m) r9
            int r9 = r9.f15789b
            if (r9 <= r7) goto L255
            r7 = r9
            goto L255
        L265:
            r4.f15789b = r7
            r10 = r2
            goto L188
        L26a:
            p3.a r1 = new p3.a
            java.lang.String r2 = r14.concat(r7)
            r1.<init>(r2)
            throw r1
        L274:
            p3.g r10 = new p3.g
            r2 = 0
            r10.<init>(r2)
            r4.a()
            goto L188
        L27f:
            p3.k r10 = new p3.k
            java.lang.String r2 = r11.f15794b
            r3 = 1
            r10.<init>(r2, r3)
            r4.a()
            goto L188
        L28c:
            p3.k r10 = new p3.k
            r2 = 0
            r3 = 0
            r10.<init>(r3, r2)
            r4.a()
            goto L188
        L298:
            r3 = r2
            p3.f r18 = new p3.f
            r22 = 1
            java.lang.String r2 = r11.f15794b
            r19 = 0
            r20 = 1
            r21 = 0
            r23 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            r4.a()
            r10 = r18
            goto L188
        L2b1:
            r3 = r2
            p3.f r19 = new p3.f
            r23 = 1
            java.lang.String r2 = r11.f15794b
            r20 = 0
            r21 = 1
            r22 = 1
            r24 = r2
            r19.<init>(r20, r21, r22, r23, r24)
            r4.a()
            r10 = r19
            goto L188
        L2ca:
            r3 = r2
            p3.f r20 = new p3.f
            r24 = 0
            r25 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r20.<init>(r21, r22, r23, r24, r25)
            r4.a()
            r10 = r20
            goto L188
        L2e1:
            r3 = r2
            p3.f r21 = new p3.f
            r25 = 0
            r26 = 0
            r22 = 0
            r23 = 1
            r24 = 1
            r21.<init>(r22, r23, r24, r25, r26)
            r4.a()
            r10 = r21
            goto L188
        L2f8:
            r3 = r2
            p3.h r2 = p3.EnumC1459h.f15771q
            if (r12 == r2) goto L305
            p3.h r2 = p3.EnumC1459h.f15772r
            if (r12 != r2) goto L302
            goto L305
        L302:
            r21 = 0
            goto L307
        L305:
            r21 = 1
        L307:
            p3.h r2 = p3.EnumC1459h.f15772r
            if (r12 == r2) goto L313
            p3.h r2 = p3.EnumC1459h.f15773s
            if (r12 != r2) goto L310
            goto L313
        L310:
            r22 = 0
            goto L315
        L313:
            r22 = 1
        L315:
            int r2 = r0.f15669b
            java.lang.Object r8 = r0.f15670c
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = r0.m()
            if (r9 == 0) goto L327
        L321:
            r2 = r3
            r12 = r14
            r13 = 43
            goto L3fd
        L327:
            int r9 = r0.f15668a
            boolean r10 = r0.j(r10)
            if (r10 != 0) goto L330
            goto L321
        L330:
            r0.y()
            java.lang.String r10 = "odd"
            boolean r10 = r0.k(r10)
            if (r10 == 0) goto L347
            M.t r2 = new M.t
            r10 = 1
            r12 = 2
            r2.<init>(r12, r10)
        L342:
            r12 = r14
            r13 = 43
            goto L3ee
        L347:
            r10 = 1
            r12 = 2
            java.lang.String r13 = "even"
            boolean r13 = r0.k(r13)
            if (r13 == 0) goto L358
            M.t r2 = new M.t
            r13 = 0
            r2.<init>(r12, r13)
            goto L342
        L358:
            r3 = 43
            r13 = 0
            boolean r16 = r0.j(r3)
            r3 = 45
            if (r16 == 0) goto L364
            goto L36d
        L364:
            boolean r16 = r0.j(r3)
            if (r16 == 0) goto L36d
            r16 = -1
            goto L36f
        L36d:
            r16 = r10
        L36f:
            int r10 = r0.f15668a
            K5.h r10 = K5.h.a(r8, r10, r2)
            if (r10 == 0) goto L37b
            int r12 = r10.f2989a
            r0.f15668a = r12
        L37b:
            r12 = 110(0x6e, float:1.54E-43)
            boolean r12 = r0.j(r12)
            if (r12 != 0) goto L393
            r12 = 78
            boolean r12 = r0.j(r12)
            if (r12 == 0) goto L38c
            goto L393
        L38c:
            r2 = r10
            r12 = r14
            r3 = 1
            r10 = 0
            r13 = 43
            goto L3d7
        L393:
            if (r10 == 0) goto L397
            r12 = r14
            goto L3a1
        L397:
            K5.h r10 = new K5.h
            r12 = r14
            r13 = 1
            int r15 = r0.f15668a
            r10.<init>(r13, r15)
        L3a1:
            r0.y()
            r13 = 43
            boolean r14 = r0.j(r13)
            if (r14 != 0) goto L3b4
            boolean r14 = r0.j(r3)
            if (r14 == 0) goto L3b4
            r3 = -1
            goto L3b5
        L3b4:
            r3 = 1
        L3b5:
            if (r14 == 0) goto L3d1
            r0.y()
            int r14 = r0.f15668a
            K5.h r2 = K5.h.a(r8, r14, r2)
            if (r2 == 0) goto L3cd
            int r8 = r2.f2989a
            r0.f15668a = r8
            r27 = r16
            r16 = r3
            r3 = r27
            goto L3d7
        L3cd:
            r0.f15668a = r9
        L3cf:
            r2 = 0
            goto L3fd
        L3d1:
            r2 = r16
            r16 = r3
            r3 = r2
            r2 = 0
        L3d7:
            M.t r8 = new M.t
            if (r10 != 0) goto L3dd
            r3 = 0
            goto L3e1
        L3dd:
            long r14 = r10.f2990b
            int r10 = (int) r14
            int r3 = r3 * r10
        L3e1:
            if (r2 != 0) goto L3e5
            r2 = 0
            goto L3ea
        L3e5:
            long r14 = r2.f2990b
            int r2 = (int) r14
            int r2 = r2 * r16
        L3ea:
            r8.<init>(r3, r2)
            r2 = r8
        L3ee:
            r0.y()
            r3 = 41
            boolean r3 = r0.j(r3)
            if (r3 == 0) goto L3fa
            goto L3fd
        L3fa:
            r0.f15668a = r9
            goto L3cf
        L3fd:
            if (r2 == 0) goto L416
            p3.f r18 = new p3.f
            int r3 = r2.f3616a
            int r2 = r2.f3617b
            java.lang.String r7 = r11.f15794b
            r20 = r2
            r19 = r3
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23)
            r4.a()
            r10 = r18
            goto L437
        L416:
            p3.a r1 = new p3.a
            java.lang.String r2 = r12.concat(r7)
            r1.<init>(r2)
            throw r1
        L420:
            r13 = 43
            p3.g r10 = new p3.g
            r2 = 1
            r10.<init>(r2)
            r4.a()
            goto L437
        L42c:
            r13 = 43
            p3.g r10 = new p3.g
            r2 = 2
            r10.<init>(r2)
            r4.a()
        L437:
            java.util.ArrayList r2 = r11.f15796d
            if (r2 != 0) goto L442
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r11.f15796d = r2
        L442:
            java.util.ArrayList r2 = r11.f15796d
            r2.add(r10)
            r10 = r13
            r2 = 0
            r3 = 1
            r8 = 2
            goto L6d
        L44d:
            p3.a r1 = new p3.a
            java.lang.String r2 = "Invalid pseudo class"
            r1.<init>(r2)
            throw r1
        L455:
            if (r11 == 0) goto L47a
            java.util.ArrayList r2 = r4.f15788a
            if (r2 != 0) goto L462
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.f15788a = r2
        L462:
            java.util.ArrayList r2 = r4.f15788a
            r2.add(r11)
            boolean r2 = r0.x()
            if (r2 != 0) goto L471
        L46d:
            r2 = 0
            r3 = 1
            goto L15
        L471:
            r1.add(r4)
            p3.m r4 = new p3.m
            r4.<init>()
            goto L46d
        L47a:
            r0.f15668a = r5
        L47c:
            java.util.ArrayList r2 = r4.f15788a
            if (r2 == 0) goto L48a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L487
            goto L48a
        L487:
            r1.add(r4)
        L48a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C1449c.C():java.util.ArrayList");
    }
}
