package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends AbstractC0904d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11253b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.google.android.gms.internal.vision.X0.<clinit>():void] */
    public /* synthetic */ Z0(int i) {
        this.f11253b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int B(long j, byte[] bArr, int i, int i7) {
        if (i7 == 0) {
            AbstractC0904d0 abstractC0904d0 = X0.f11248a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i7 == 1) {
            byte bA = U0.a(bArr, j);
            AbstractC0904d0 abstractC0904d02 = X0.f11248a;
            if (i > -12 || bA > -65) {
                return -1;
            }
            return (bA << 8) ^ i;
        }
        if (i7 != 2) {
            throw new AssertionError();
        }
        byte bA2 = U0.a(bArr, j);
        byte bA3 = U0.a(bArr, j + 1);
        AbstractC0904d0 abstractC0904d03 = X0.f11248a;
        if (i > -12 || bA2 > -65 || bA3 > -65) {
            return -1;
        }
        return (bA3 << 16) ^ ((bA2 << 8) ^ i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.AbstractC0904d0
    public final int h(String str, byte[] bArr, int i, int i7) {
        int i8;
        int i9;
        char cCharAt;
        long j;
        char c7;
        long j7;
        long j8;
        char c8;
        int i10;
        char cCharAt2;
        switch (this.f11253b) {
            case 0:
                int length = str.length();
                int i11 = i7 + i;
                int i12 = 0;
                while (i12 < length && (i9 = i12 + i) < i11 && (cCharAt = str.charAt(i12)) < 128) {
                    bArr[i9] = (byte) cCharAt;
                    i12++;
                }
                if (i12 == length) {
                    return i + length;
                }
                int i13 = i + i12;
                while (i12 < length) {
                    char cCharAt3 = str.charAt(i12);
                    if (cCharAt3 < 128 && i13 < i11) {
                        bArr[i13] = (byte) cCharAt3;
                        i13++;
                    } else if (cCharAt3 < 2048 && i13 <= i11 - 2) {
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) ((cCharAt3 >>> 6) | 960);
                        i13 += 2;
                        bArr[i14] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i13 > i11 - 3) {
                            if (i13 > i11 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i8 = i12 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i8)))) {
                                    throw new Y0(i12, length);
                                }
                                StringBuilder sb = new StringBuilder(37);
                                sb.append("Failed writing ");
                                sb.append(cCharAt3);
                                sb.append(" at index ");
                                sb.append(i13);
                                throw new ArrayIndexOutOfBoundsException(sb.toString());
                            }
                            int i15 = i12 + 1;
                            if (i15 != str.length()) {
                                char cCharAt4 = str.charAt(i15);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i16 = i13 + 3;
                                    bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i13 += 4;
                                    bArr[i16] = (byte) ((codePoint & 63) | 128);
                                    i12 = i15;
                                } else {
                                    i12 = i15;
                                }
                            }
                            throw new Y0(i12 - 1, length);
                        }
                        bArr[i13] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i17 = i13 + 2;
                        bArr[i13 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i13 += 3;
                        bArr[i17] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i12++;
                }
                return i13;
            default:
                long j9 = i;
                long j10 = ((long) i7) + j9;
                int length2 = str.length();
                if (length2 > i7 || bArr.length - i7 < i) {
                    char cCharAt5 = str.charAt(length2 - 1);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(cCharAt5);
                    sb2.append(" at index ");
                    sb2.append(i + i7);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
                int i18 = 0;
                while (true) {
                    j = 1;
                    c7 = 128;
                    if (i18 < length2 && (cCharAt2 = str.charAt(i18)) < 128) {
                        U0.e(bArr, j9, (byte) cCharAt2);
                        i18++;
                        j9 = 1 + j9;
                    }
                }
                if (i18 == length2) {
                    return (int) j9;
                }
                while (i18 < length2) {
                    char cCharAt6 = str.charAt(i18);
                    if (cCharAt6 < c7 && j9 < j10) {
                        U0.e(bArr, j9, (byte) cCharAt6);
                        c8 = c7;
                        j7 = j;
                        j8 = j9 + j;
                    } else if (cCharAt6 >= 2048 || j9 > j10 - 2) {
                        j7 = j;
                        if ((cCharAt6 >= 55296 && 57343 >= cCharAt6) || j9 > j10 - 3) {
                            long j11 = j9;
                            if (j11 > j10 - 4) {
                                if (55296 <= cCharAt6 && cCharAt6 <= 57343 && ((i10 = i18 + 1) == length2 || !Character.isSurrogatePair(cCharAt6, str.charAt(i10)))) {
                                    throw new Y0(i18, length2);
                                }
                                StringBuilder sb3 = new StringBuilder(46);
                                sb3.append("Failed writing ");
                                sb3.append(cCharAt6);
                                sb3.append(" at index ");
                                sb3.append(j11);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i19 = i18 + 1;
                            if (i19 != length2) {
                                char cCharAt7 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt6, cCharAt7)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt6, cCharAt7);
                                    U0.e(bArr, j11, (byte) ((codePoint2 >>> 18) | 240));
                                    c8 = 128;
                                    U0.e(bArr, j11 + j7, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    U0.e(bArr, j11 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    U0.e(bArr, j11 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j8 = j11 + 4;
                                    i18 = i19;
                                } else {
                                    i18 = i19;
                                }
                            }
                            throw new Y0(i18 - 1, length2);
                        }
                        U0.e(bArr, j9, (byte) ((cCharAt6 >>> '\f') | 480));
                        long j12 = j9;
                        U0.e(bArr, j9 + j7, (byte) (((cCharAt6 >>> 6) & 63) | 128));
                        j8 = j12 + 3;
                        U0.e(bArr, j12 + 2, (byte) ((cCharAt6 & '?') | 128));
                        c8 = 128;
                    } else {
                        j7 = j;
                        U0.e(bArr, j9, (byte) ((cCharAt6 >>> 6) | 960));
                        U0.e(bArr, j9 + j7, (byte) ((cCharAt6 & '?') | c7));
                        j8 = j9 + 2;
                        c8 = c7;
                    }
                    i18++;
                    c7 = c8;
                    j9 = j8;
                    j = j7;
                }
                return (int) j9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.AbstractC0904d0
    public final int i(byte[] bArr, int i, int i7) {
        int i8;
        long j;
        int i9 = i;
        switch (this.f11253b) {
            case 0:
                break;
            default:
                if ((i9 | i7 | (bArr.length - i7)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i9), Integer.valueOf(i7)));
                }
                long j7 = i9;
                int i10 = (int) (((long) i7) - j7);
                long j8 = 1;
                if (i10 < 16) {
                    i8 = 0;
                } else {
                    long j9 = j7;
                    i8 = 0;
                    while (true) {
                        if (i8 < i10) {
                            long j10 = j9 + 1;
                            if (U0.a(bArr, j9) >= 0) {
                                i8++;
                                j9 = j10;
                            }
                        } else {
                            i8 = i10;
                        }
                    }
                }
                int i11 = i10 - i8;
                long j11 = j7 + ((long) i8);
                while (true) {
                    byte bA = 0;
                    while (true) {
                        if (i11 > 0) {
                            long j12 = j11 + j8;
                            bA = U0.a(bArr, j11);
                            if (bA >= 0) {
                                i11--;
                                j11 = j12;
                            } else {
                                j11 = j12;
                            }
                        }
                    }
                    if (i11 == 0) {
                        return 0;
                    }
                    int i12 = i11 - 1;
                    if (bA < -32) {
                        if (i12 == 0) {
                            return bA;
                        }
                        i11 -= 2;
                        if (bA >= -62) {
                            long j13 = j11 + j8;
                            if (U0.a(bArr, j11) <= -65) {
                                j = j8;
                                j11 = j13;
                                j8 = j;
                            }
                        }
                    } else if (bA >= -16) {
                        j = j8;
                        if (i12 < 3) {
                            return B(j11, bArr, bA, i12);
                        }
                        i11 -= 4;
                        long j14 = j11 + j;
                        byte bA2 = U0.a(bArr, j11);
                        if (bA2 <= -65) {
                            if ((((bA2 + 112) + (bA << 28)) >> 30) == 0) {
                                long j15 = 2 + j11;
                                if (U0.a(bArr, j14) <= -65) {
                                    j11 += 3;
                                    if (U0.a(bArr, j15) <= -65) {
                                        j8 = j;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i12 < 2) {
                            return B(j11, bArr, bA, i12);
                        }
                        i11 -= 3;
                        j = j8;
                        long j16 = j11 + j;
                        byte bA3 = U0.a(bArr, j11);
                        if (bA3 <= -65 && ((bA != -32 || bA3 >= -96) && (bA != -19 || bA3 < -96))) {
                            j11 += 2;
                            if (U0.a(bArr, j16) <= -65) {
                                j8 = j;
                            }
                        }
                    }
                }
                return -1;
        }
        while (i9 < i7 && bArr[i9] >= 0) {
            i9++;
        }
        if (i9 < i7) {
            while (i9 < i7) {
                int i13 = i9 + 1;
                byte b7 = bArr[i9];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i13 >= i7) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i9 += 2;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 < -16) {
                        if (i13 >= i7 - 1) {
                            return X0.b(bArr, i13, i7);
                        }
                        int i14 = i9 + 2;
                        byte b8 = bArr[i13];
                        if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                            i9 += 3;
                            if (bArr[i14] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i13 >= i7 - 2) {
                        return X0.b(bArr, i13, i7);
                    }
                    int i15 = i9 + 2;
                    byte b9 = bArr[i13];
                    if (b9 <= -65) {
                        if ((((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                            int i16 = i9 + 3;
                            if (bArr[i15] <= -65) {
                                i9 += 4;
                                if (bArr[i16] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i9 = i13;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    @Override // com.google.android.gms.internal.vision.AbstractC0904d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String v(byte[] r11, int r12, int r13) throws com.google.android.gms.internal.vision.C0922m0 {
        /*
            r10 = this;
            int r0 = r10.f11253b
            switch(r0) {
                case 0: goto Ld1;
                default: goto L5;
            }
        L5:
            r0 = r12 | r13
            int r1 = r11.length
            int r1 = r1 - r12
            int r1 = r1 - r13
            r0 = r0 | r1
            if (r0 < 0) goto Lb4
            int r0 = r12 + r13
            char[] r5 = new char[r13]
            r13 = 0
            r1 = r13
        L13:
            if (r12 >= r0) goto L25
            long r2 = (long) r12
            byte r2 = com.google.android.gms.internal.vision.U0.a(r11, r2)
            if (r2 < 0) goto L25
            int r12 = r12 + 1
            int r3 = r1 + 1
            char r2 = (char) r2
            r5[r1] = r2
            r1 = r3
            goto L13
        L25:
            r6 = r1
        L26:
            if (r12 >= r0) goto Lae
            int r1 = r12 + 1
            long r2 = (long) r12
            byte r2 = com.google.android.gms.internal.vision.U0.a(r11, r2)
            if (r2 < 0) goto L4b
            int r12 = r6 + 1
            char r2 = (char) r2
            r5[r6] = r2
        L36:
            if (r1 >= r0) goto L48
            long r2 = (long) r1
            byte r2 = com.google.android.gms.internal.vision.U0.a(r11, r2)
            if (r2 < 0) goto L48
            int r1 = r1 + 1
            int r3 = r12 + 1
            char r2 = (char) r2
            r5[r12] = r2
            r12 = r3
            goto L36
        L48:
            r6 = r12
            r12 = r1
            goto L26
        L4b:
            r3 = -32
            if (r2 >= r3) goto L64
            if (r1 >= r0) goto L5f
            int r12 = r12 + 2
            long r3 = (long) r1
            byte r1 = com.google.android.gms.internal.vision.U0.a(r11, r3)
            int r3 = r6 + 1
            com.google.android.gms.internal.vision.AbstractC0904d0.o(r2, r1, r5, r6)
            r6 = r3
            goto L26
        L5f:
            com.google.android.gms.internal.vision.m0 r11 = com.google.android.gms.internal.vision.C0922m0.c()
            throw r11
        L64:
            r3 = -16
            if (r2 >= r3) goto L86
            int r3 = r0 + (-1)
            if (r1 >= r3) goto L81
            int r3 = r12 + 2
            long r7 = (long) r1
            byte r1 = com.google.android.gms.internal.vision.U0.a(r11, r7)
            int r12 = r12 + 3
            long r3 = (long) r3
            byte r3 = com.google.android.gms.internal.vision.U0.a(r11, r3)
            int r4 = r6 + 1
            com.google.android.gms.internal.vision.AbstractC0904d0.n(r2, r1, r3, r5, r6)
            r6 = r4
            goto L26
        L81:
            com.google.android.gms.internal.vision.m0 r11 = com.google.android.gms.internal.vision.C0922m0.c()
            throw r11
        L86:
            int r3 = r0 + (-2)
            if (r1 >= r3) goto La9
            int r3 = r12 + 2
            long r7 = (long) r1
            byte r1 = com.google.android.gms.internal.vision.U0.a(r11, r7)
            int r4 = r12 + 3
            long r7 = (long) r3
            byte r3 = com.google.android.gms.internal.vision.U0.a(r11, r7)
            int r12 = r12 + 4
            long r7 = (long) r4
            byte r4 = com.google.android.gms.internal.vision.U0.a(r11, r7)
            r9 = r2
            r2 = r1
            r1 = r9
            com.google.android.gms.internal.vision.AbstractC0904d0.m(r1, r2, r3, r4, r5, r6)
            int r6 = r6 + 2
            goto L26
        La9:
            com.google.android.gms.internal.vision.m0 r11 = com.google.android.gms.internal.vision.C0922m0.c()
            throw r11
        Lae:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r13, r6)
            return r11
        Lb4:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r11 = r11.length
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
            java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r0.<init>(r11)
            throw r0
        Ld1:
            r0 = r12 | r13
            int r1 = r11.length
            int r1 = r1 - r12
            int r1 = r1 - r13
            r0 = r0 | r1
            if (r0 < 0) goto L163
            int r0 = r12 + r13
            char[] r5 = new char[r13]
            r13 = 0
            r1 = r13
        Ldf:
            if (r12 >= r0) goto Lee
            r2 = r11[r12]
            if (r2 < 0) goto Lee
            int r12 = r12 + 1
            int r3 = r1 + 1
            char r2 = (char) r2
            r5[r1] = r2
            r1 = r3
            goto Ldf
        Lee:
            r6 = r1
        Lef:
            if (r12 >= r0) goto L15d
            int r1 = r12 + 1
            r2 = r1
            r1 = r11[r12]
            if (r1 < 0) goto L110
            int r12 = r6 + 1
            char r1 = (char) r1
            r5[r6] = r1
            r1 = r2
        Lfe:
            if (r1 >= r0) goto L10d
            r2 = r11[r1]
            if (r2 < 0) goto L10d
            int r1 = r1 + 1
            int r3 = r12 + 1
            char r2 = (char) r2
            r5[r12] = r2
            r12 = r3
            goto Lfe
        L10d:
            r6 = r12
            r12 = r1
            goto Lef
        L110:
            r3 = -32
            if (r1 >= r3) goto L126
            if (r2 >= r0) goto L121
            int r12 = r12 + 2
            r2 = r11[r2]
            int r3 = r6 + 1
            com.google.android.gms.internal.vision.AbstractC0904d0.o(r1, r2, r5, r6)
            r6 = r3
            goto Lef
        L121:
            com.google.android.gms.internal.vision.m0 r11 = com.google.android.gms.internal.vision.C0922m0.c()
            throw r11
        L126:
            r3 = -16
            if (r1 >= r3) goto L142
            int r3 = r0 + (-1)
            if (r2 >= r3) goto L13d
            int r3 = r12 + 2
            r2 = r11[r2]
            int r12 = r12 + 3
            r3 = r11[r3]
            int r4 = r6 + 1
            com.google.android.gms.internal.vision.AbstractC0904d0.n(r1, r2, r3, r5, r6)
            r6 = r4
            goto Lef
        L13d:
            com.google.android.gms.internal.vision.m0 r11 = com.google.android.gms.internal.vision.C0922m0.c()
            throw r11
        L142:
            int r3 = r0 + (-2)
            if (r2 >= r3) goto L158
            int r3 = r12 + 2
            r2 = r11[r2]
            int r4 = r12 + 3
            r3 = r11[r3]
            int r12 = r12 + 4
            r4 = r11[r4]
            com.google.android.gms.internal.vision.AbstractC0904d0.m(r1, r2, r3, r4, r5, r6)
            int r6 = r6 + 2
            goto Lef
        L158:
            com.google.android.gms.internal.vision.m0 r11 = com.google.android.gms.internal.vision.C0922m0.c()
            throw r11
        L15d:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r13, r6)
            return r11
        L163:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r11 = r11.length
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
            java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.Z0.v(byte[], int, int):java.lang.String");
    }
}
