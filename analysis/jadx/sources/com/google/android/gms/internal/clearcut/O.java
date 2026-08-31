package com.google.android.gms.internal.clearcut;

import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabaseVersions;
import androidx.work.impl.WorkManagerImpl;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class O implements Z {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f10427o = i0.f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f10429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10432e;
    public final AbstractC0748g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f10434h;
    public final int[] i;
    public final int[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Q f10435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F f10436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0741c0 f10437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final L f10438n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O(int[] iArr, Object[] objArr, int i, int i7, int i8, AbstractC0748g abstractC0748g, boolean z5, int[] iArr2, int[] iArr3, int[] iArr4, Q q7, F f, C0741c0 c0741c0, C0757p c0757p, L l7) {
        this.f10428a = iArr;
        this.f10429b = objArr;
        this.f10430c = i;
        this.f10431d = i7;
        this.f10432e = i8;
        this.f10433g = z5;
        this.f10434h = iArr2;
        this.i = iArr3;
        this.j = iArr4;
        this.f10435k = q7;
        this.f10436l = f;
        this.f10437m = c0741c0;
        this.f = abstractC0748g;
        this.f10438n = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int A(long j, Object obj) {
        return ((Integer) i0.k(j, obj)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long B(long j, Object obj) {
        return ((Long) i0.k(j, obj)).longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int h(Z z5, int i, byte[] bArr, int i7, int i8, A a7, C0751j c0751j) throws B {
        int iJ = j(z5, bArr, i7, i8, c0751j);
        while (true) {
            a7.add(c0751j.f10518c);
            if (iJ >= i8) {
                break;
            }
            int iF = l0.f(bArr, iJ, c0751j);
            if (i != c0751j.f10516a) {
                break;
            }
            iJ = j(z5, bArr, iF, i8, c0751j);
        }
        return iJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int i(Z z5, byte[] bArr, int i, int i7, int i8, C0751j c0751j) throws B {
        O o6 = (O) z5;
        Object objD = o6.d();
        int iM = o6.m(objD, bArr, i, i7, i8, c0751j);
        o6.a(objD);
        c0751j.f10518c = objD;
        return iM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int j(Z z5, byte[] bArr, int i, int i7, C0751j c0751j) throws B {
        int iD = i + 1;
        int i8 = bArr[i];
        if (i8 < 0) {
            iD = l0.d(i8, bArr, iD, c0751j);
            i8 = c0751j.f10516a;
        }
        int i9 = iD;
        if (i8 < 0 || i8 > i7 - i9) {
            throw B.a();
        }
        Object objD = z5.d();
        int i10 = i9 + i8;
        z5.b(objD, bArr, i9, i10, c0751j);
        z5.a(objD);
        c0751j.f10518c = objD;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0197 A[EDGE_INSN: B:96:0x0197->B:92:0x0197 BREAK  A[LOOP:0: B:25:0x0053->B:90:0x018d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.clearcut.O n(com.google.android.gms.internal.clearcut.X r25, com.google.android.gms.internal.clearcut.Q r26, com.google.android.gms.internal.clearcut.F r27, com.google.android.gms.internal.clearcut.C0741c0 r28, com.google.android.gms.internal.clearcut.C0757p r29, com.google.android.gms.internal.clearcut.L r30) {
        /*
            r0 = r25
            boolean r1 = r0 instanceof com.google.android.gms.internal.clearcut.X
            if (r1 == 0) goto L1af
            com.google.android.gms.internal.clearcut.Y r1 = r0.f10450b
            int r2 = r1.f10455d
            r3 = 1
            r2 = r2 & r3
            r4 = 2
            if (r2 != r3) goto L11
            r2 = r3
            goto L12
        L11:
            r2 = r4
        L12:
            if (r2 != r4) goto L16
            r13 = r3
            goto L17
        L16:
            r13 = 0
        L17:
            int r2 = r1.f10456e
            if (r2 != 0) goto L1f
            r7 = 0
            r9 = 0
            r10 = 0
            goto L27
        L1f:
            int r2 = r1.f10457g
            int r6 = r1.f10458h
            int r7 = r1.f10459k
            r9 = r2
            r10 = r6
        L27:
            int r2 = r7 << 2
            int[] r2 = new int[r2]
            int r6 = r7 << 1
            java.lang.Object[] r8 = new java.lang.Object[r6]
            int r6 = r1.i
            r7 = 0
            if (r6 <= 0) goto L38
            int[] r6 = new int[r6]
            r15 = r6
            goto L39
        L38:
            r15 = r7
        L39:
            int r6 = r1.f10460l
            if (r6 <= 0) goto L3f
            int[] r7 = new int[r6]
        L3f:
            r16 = r7
            boolean r6 = r1.a()
            java.lang.Class r7 = r1.f10454c
            java.lang.Object[] r11 = r1.f10453b
            if (r6 == 0) goto L195
            int r6 = r1.f10467s
            r18 = r4
            r12 = 0
            r14 = 0
            r17 = 0
        L53:
            int r4 = r1.j
            if (r6 >= r4) goto L70
            int r4 = r6 - r9
            int r4 = r4 << 2
            if (r12 >= r4) goto L70
            r4 = 0
        L5e:
            r5 = 4
            if (r4 >= r5) goto L6a
            int r5 = r12 + r4
            r20 = -1
            r2[r5] = r20
            int r4 = r4 + 1
            goto L5e
        L6a:
            r22 = r2
            r20 = r3
            goto L18d
        L70:
            int r4 = r1.f10469u
            com.google.android.gms.internal.clearcut.s r5 = com.google.android.gms.internal.clearcut.EnumC0759s.f10553z
            int r6 = r5.f10554q
            if (r4 <= r6) goto Lb7
            int r4 = r1.f10470v
            int r4 = r4 << r3
            r6 = r11[r4]
            r20 = r3
            boolean r3 = r6 instanceof java.lang.reflect.Field
            if (r3 == 0) goto L86
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L8e
        L86:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = com.google.android.gms.internal.clearcut.Y.b(r6, r7)
            r11[r4] = r6
        L8e:
            com.google.android.gms.internal.clearcut.h0 r3 = com.google.android.gms.internal.clearcut.i0.f10512d
            r21 = r5
            long r4 = r3.a(r6)
            int r4 = (int) r4
            int r5 = r1.f10470v
            int r5 = r5 << 1
            int r5 = r5 + 1
            r6 = r11[r5]
            r22 = r2
            boolean r2 = r6 instanceof java.lang.reflect.Field
            if (r2 == 0) goto La8
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto Lb0
        La8:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = com.google.android.gms.internal.clearcut.Y.b(r6, r7)
            r11[r5] = r6
        Lb0:
            long r2 = r3.a(r6)
            int r2 = (int) r2
        Lb5:
            r3 = 0
            goto Lfb
        Lb7:
            r22 = r2
            r20 = r3
            r21 = r5
            java.lang.reflect.Field r2 = r1.f10472x
            com.google.android.gms.internal.clearcut.h0 r3 = com.google.android.gms.internal.clearcut.i0.f10512d
            long r4 = r3.a(r2)
            int r4 = (int) r4
            int r2 = r1.f10455d
            r2 = r2 & 1
            r5 = r20
            if (r2 != r5) goto Lf9
            int r2 = r1.f10469u
            com.google.android.gms.internal.clearcut.s r6 = com.google.android.gms.internal.clearcut.EnumC0759s.f10547t
            int r6 = r6.f10554q
            if (r2 > r6) goto Lf9
            int r2 = r1.f
            int r2 = r2 << r5
            int r5 = r1.f10471w
            int r5 = r5 / 32
            int r5 = r5 + r2
            r2 = r11[r5]
            boolean r6 = r2 instanceof java.lang.reflect.Field
            if (r6 == 0) goto Le7
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            goto Lef
        Le7:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = com.google.android.gms.internal.clearcut.Y.b(r2, r7)
            r11[r5] = r2
        Lef:
            long r2 = r3.a(r2)
            int r2 = (int) r2
            int r3 = r1.f10471w
            int r3 = r3 % 32
            goto Lfb
        Lf9:
            r2 = 0
            goto Lb5
        Lfb:
            int r5 = r1.f10467s
            r22[r12] = r5
            int r5 = r12 + 1
            int r6 = r1.f10468t
            r23 = r2
            r2 = r6 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L10c
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            goto L10d
        L10c:
            r2 = 0
        L10d:
            r6 = r6 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L114
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L115
        L114:
            r6 = 0
        L115:
            r2 = r2 | r6
            int r6 = r1.f10469u
            int r24 = r6 << 20
            r2 = r2 | r24
            r2 = r2 | r4
            r22[r5] = r2
            int r2 = r12 + 2
            int r3 = r3 << 20
            r3 = r3 | r23
            r22[r2] = r3
            java.lang.Object r2 = r1.f10451A
            if (r2 == 0) goto L147
            int r3 = r12 / 4
            r20 = 1
            int r3 = r3 << 1
            r8[r3] = r2
            java.lang.Object r2 = r1.f10473y
            if (r2 == 0) goto L13e
            int r3 = r3 + 1
            r8[r3] = r2
        L13b:
            r20 = 1
            goto L164
        L13e:
            java.lang.Object r2 = r1.f10474z
            if (r2 == 0) goto L13b
            int r3 = r3 + 1
            r8[r3] = r2
            goto L13b
        L147:
            java.lang.Object r2 = r1.f10473y
            if (r2 == 0) goto L156
            int r3 = r12 / 4
            r20 = 1
            int r3 = r3 << 1
            int r3 = r3 + 1
            r8[r3] = r2
            goto L164
        L156:
            r20 = 1
            java.lang.Object r2 = r1.f10474z
            if (r2 == 0) goto L164
            int r3 = r12 / 4
            int r3 = r3 << 1
            int r3 = r3 + 1
            r8[r3] = r2
        L164:
            int r2 = r21.ordinal()
            if (r6 != r2) goto L170
            int r2 = r14 + 1
            r15[r14] = r12
            r14 = r2
            goto L184
        L170:
            r2 = 18
            if (r6 < r2) goto L184
            r2 = 49
            if (r6 > r2) goto L184
            int r2 = r17 + 1
            r3 = r22[r5]
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r4
            r16[r17] = r3
            r17 = r2
        L184:
            boolean r2 = r1.a()
            if (r2 == 0) goto L197
            int r2 = r1.f10467s
            r6 = r2
        L18d:
            int r12 = r12 + 4
            r3 = r20
            r2 = r22
            goto L53
        L195:
            r22 = r2
        L197:
            com.google.android.gms.internal.clearcut.O r6 = new com.google.android.gms.internal.clearcut.O
            int r11 = r1.j
            com.google.android.gms.internal.clearcut.g r12 = r0.f10449a
            int[] r14 = r1.f10461m
            r17 = r26
            r18 = r27
            r19 = r28
            r20 = r29
            r21 = r30
            r7 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L1af:
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.O.n(com.google.android.gms.internal.clearcut.X, com.google.android.gms.internal.clearcut.Q, com.google.android.gms.internal.clearcut.F, com.google.android.gms.internal.clearcut.c0, com.google.android.gms.internal.clearcut.p, com.google.android.gms.internal.clearcut.L):com.google.android.gms.internal.clearcut.O");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final void a(Object obj) {
        int[] iArr = this.i;
        if (iArr != null) {
            for (int i : iArr) {
                long jV = v(i) & 1048575;
                Object objK = i0.k(jV, obj);
                if (objK != null) {
                    this.f10438n.getClass();
                    ((K) objK).f10424q = false;
                    i0.c(jV, obj, objK);
                }
            }
        }
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            for (int i7 : iArr2) {
                this.f10436l.a(i7, obj);
            }
        }
        this.f10437m.getClass();
        ((AbstractC0764x) obj).zzjp.f10497d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d7, code lost:
    
        if (r6 == r9) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0041. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    @Override // com.google.android.gms.internal.clearcut.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r19, byte[] r20, int r21, int r22, com.google.android.gms.internal.clearcut.C0751j r23) throws com.google.android.gms.internal.clearcut.B {
        /*
            r18 = this;
            r0 = r18
            r7 = r20
            r8 = r22
            r13 = r23
            boolean r1 = r0.f10433g
            if (r1 == 0) goto L23c
            sun.misc.Unsafe r1 = com.google.android.gms.internal.clearcut.O.f10427o
            r2 = r21
        L10:
            if (r2 >= r8) goto L233
            int r3 = r2 + 1
            r2 = r7[r2]
            if (r2 >= 0) goto L1e
            int r3 = com.google.android.gms.internal.clearcut.l0.d(r2, r7, r3, r13)
            int r2 = r13.f10516a
        L1e:
            r5 = r2
            r9 = r3
            int r6 = r5 >>> 3
            r2 = r5 & 7
            int r12 = r0.w(r6)
            if (r12 < 0) goto L44
            int r3 = r12 + 1
            int[] r4 = r0.f10428a
            r3 = r4[r3]
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r11 = r4 >>> 20
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r14 = (long) r4
            r4 = 17
            r10 = 2
            if (r11 > r4) goto L179
            r4 = 5
            r6 = 1
            switch(r11) {
                case 0: goto L15c;
                case 1: goto L146;
                case 2: goto L12c;
                case 3: goto L12c;
                case 4: goto L11b;
                case 5: goto L107;
                case 6: goto Lf7;
                case 7: goto Ldd;
                case 8: goto Lb6;
                case 9: goto L99;
                case 10: goto L8a;
                case 11: goto L11b;
                case 12: goto L7e;
                case 13: goto Lf7;
                case 14: goto L107;
                case 15: goto L6a;
                case 16: goto L48;
                default: goto L44;
            }
        L44:
            r15 = r1
        L45:
            r3 = r9
            goto L20d
        L48:
            if (r2 != 0) goto L63
            int r9 = com.google.android.gms.internal.clearcut.l0.m(r7, r9, r13)
            long r2 = r13.f10517b
            long r4 = r2 >>> r6
            r10 = 1
            long r2 = r2 & r10
            long r2 = -r2
            long r5 = r4 ^ r2
            r2 = r19
            r3 = r14
            r1.putLong(r2, r3, r5)
            r11 = r1
            r1 = r2
            r2 = r9
        L61:
            r1 = r11
            goto L10
        L63:
            r11 = r1
            r1 = r19
        L66:
            r3 = r9
            r15 = r11
            goto L20d
        L6a:
            r11 = r1
            r1 = r19
            if (r2 != 0) goto L66
            int r2 = com.google.android.gms.internal.clearcut.l0.f(r7, r9, r13)
            int r3 = r13.f10516a
            int r4 = r3 >>> 1
            r3 = r3 & r6
            int r3 = -r3
            r3 = r3 ^ r4
        L7a:
            r11.putInt(r1, r14, r3)
            goto L61
        L7e:
            r11 = r1
            r1 = r19
            if (r2 != 0) goto L66
            int r2 = com.google.android.gms.internal.clearcut.l0.f(r7, r9, r13)
            int r3 = r13.f10516a
            goto L7a
        L8a:
            r11 = r1
            r1 = r19
            if (r2 != r10) goto L66
            int r2 = com.google.android.gms.internal.clearcut.l0.s(r7, r9, r13)
        L93:
            java.lang.Object r3 = r13.f10518c
        L95:
            r11.putObject(r1, r14, r3)
            goto L61
        L99:
            r11 = r1
            r1 = r19
            if (r2 != r10) goto L66
            com.google.android.gms.internal.clearcut.Z r2 = r0.s(r12)
            int r2 = j(r2, r7, r9, r8, r13)
            java.lang.Object r3 = r11.getObject(r1, r14)
            if (r3 != 0) goto Laf
            java.lang.Object r3 = r13.f10518c
            goto L95
        Laf:
            java.lang.Object r4 = r13.f10518c
            com.google.android.gms.internal.clearcut.x r3 = com.google.android.gms.internal.clearcut.AbstractC0765y.a(r3, r4)
            goto L95
        Lb6:
            r11 = r1
            r1 = r19
            if (r2 != r10) goto L66
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r3
            if (r2 != 0) goto Ld8
            int r2 = com.google.android.gms.internal.clearcut.l0.f(r7, r9, r13)
            int r3 = r13.f10516a
            if (r3 != 0) goto Lcd
            java.lang.String r3 = ""
            r13.f10518c = r3
            goto L93
        Lcd:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = com.google.android.gms.internal.clearcut.AbstractC0765y.f10579a
            r4.<init>(r7, r2, r3, r5)
            r13.f10518c = r4
            int r2 = r2 + r3
            goto L93
        Ld8:
            int r2 = com.google.android.gms.internal.clearcut.l0.q(r7, r9, r13)
            goto L93
        Ldd:
            r11 = r1
            r1 = r19
            if (r2 != 0) goto L66
            int r2 = com.google.android.gms.internal.clearcut.l0.m(r7, r9, r13)
            long r3 = r13.f10517b
            r9 = 0
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto Lef
            goto Lf0
        Lef:
            r6 = 0
        Lf0:
            com.google.android.gms.internal.clearcut.h0 r3 = com.google.android.gms.internal.clearcut.i0.f10512d
            r3.f(r1, r14, r6)
            goto L61
        Lf7:
            r11 = r1
            r1 = r19
            if (r2 != r4) goto L66
            int r2 = com.google.android.gms.internal.clearcut.l0.o(r9, r7)
            r11.putInt(r1, r14, r2)
            int r2 = r9 + 4
            goto L61
        L107:
            r11 = r1
            r1 = r19
            if (r2 != r6) goto L66
            long r5 = com.google.android.gms.internal.clearcut.l0.r(r9, r7)
            r2 = r1
            r1 = r11
            r3 = r14
            r1.putLong(r2, r3, r5)
            r1 = r2
            int r2 = r9 + 8
            goto L61
        L11b:
            r11 = r1
            r3 = r14
            r1 = r19
            if (r2 != 0) goto L66
            int r2 = com.google.android.gms.internal.clearcut.l0.f(r7, r9, r13)
            int r5 = r13.f10516a
            r11.putInt(r1, r3, r5)
            goto L61
        L12c:
            r11 = r1
            r3 = r14
            r1 = r19
            if (r2 != 0) goto L143
            int r9 = com.google.android.gms.internal.clearcut.l0.m(r7, r9, r13)
            long r5 = r13.f10517b
            r2 = r1
            r1 = r11
            r1.putLong(r2, r3, r5)
            r15 = r1
            r1 = r2
            r2 = r9
        L140:
            r1 = r15
            goto L10
        L143:
            r15 = r11
            goto L45
        L146:
            r10 = r14
            r15 = r1
            r1 = r19
            if (r2 != r4) goto L45
            int r2 = com.google.android.gms.internal.clearcut.l0.o(r9, r7)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            com.google.android.gms.internal.clearcut.h0 r3 = com.google.android.gms.internal.clearcut.i0.f10512d
            r3.d(r1, r10, r2)
            int r2 = r9 + 4
            goto L140
        L15c:
            r10 = r14
            r15 = r1
            r1 = r19
            if (r2 != r6) goto L176
            long r2 = com.google.android.gms.internal.clearcut.l0.r(r9, r7)
            double r5 = java.lang.Double.longBitsToDouble(r2)
            com.google.android.gms.internal.clearcut.h0 r1 = com.google.android.gms.internal.clearcut.i0.f10512d
            r2 = r19
            r3 = r10
            r1.c(r2, r3, r5)
            r14 = r2
            int r2 = r9 + 8
            goto L140
        L176:
            r14 = r1
            goto L45
        L179:
            r21 = r5
            r4 = r14
            r14 = r19
            r15 = r1
            r1 = 27
            if (r11 != r1) goto L1be
            if (r2 != r10) goto L1ba
            java.lang.Object r1 = r15.getObject(r14, r4)
            com.google.android.gms.internal.clearcut.A r1 = (com.google.android.gms.internal.clearcut.A) r1
            r2 = r1
            com.google.android.gms.internal.clearcut.h r2 = (com.google.android.gms.internal.clearcut.AbstractC0749h) r2
            boolean r2 = r2.f10505q
            if (r2 != 0) goto L1a4
            int r2 = r1.size()
            if (r2 != 0) goto L19b
            r2 = 10
            goto L19d
        L19b:
            int r2 = r2 << 1
        L19d:
            com.google.android.gms.internal.clearcut.A r1 = r1.n(r2)
            r15.putObject(r14, r4, r1)
        L1a4:
            r6 = r1
            com.google.android.gms.internal.clearcut.Z r1 = r0.s(r12)
            r2 = r21
            r3 = r7
            r5 = r8
            r4 = r9
            r7 = r13
            int r2 = h(r1, r2, r3, r4, r5, r6, r7)
            r7 = r20
            r8 = r22
            r13 = r23
            goto L140
        L1ba:
            r5 = r21
            goto L45
        L1be:
            r1 = r21
            r7 = r9
            r8 = 49
            if (r11 > r8) goto L1e4
            long r9 = (long) r3
            r3 = r7
            r8 = r12
            r7 = r2
            r12 = r4
            r2 = r20
            r4 = r22
            r5 = r1
            r1 = r14
            r14 = r23
            int r6 = r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r4 = r3
            if (r6 != r4) goto L1db
        L1d9:
            r2 = r6
            goto L20e
        L1db:
            r7 = r20
            r8 = r22
            r13 = r23
            r2 = r6
            goto L140
        L1e4:
            r8 = r4
            r4 = r7
            r5 = r1
            r7 = r2
            r1 = r14
            r2 = 50
            if (r11 != r2) goto L1f6
            if (r7 == r10) goto L1f1
            r3 = r4
            goto L20d
        L1f1:
            r0.o(r12, r8, r1)
            r1 = 0
            throw r1
        L1f6:
            r16 = r8
            r9 = r11
            r10 = r16
            r2 = r20
            r13 = r23
            r8 = r3
            r3 = r4
            r4 = r22
            int r6 = r0.k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r6 != r3) goto L20a
            goto L1d9
        L20a:
            r0 = r18
            goto L1db
        L20d:
            r2 = r3
        L20e:
            r0 = r19
            com.google.android.gms.internal.clearcut.x r0 = (com.google.android.gms.internal.clearcut.AbstractC0764x) r0
            com.google.android.gms.internal.clearcut.b0 r1 = r0.zzjp
            com.google.android.gms.internal.clearcut.b0 r3 = com.google.android.gms.internal.clearcut.C0739b0.f10493e
            if (r1 != r3) goto L21e
            com.google.android.gms.internal.clearcut.b0 r1 = com.google.android.gms.internal.clearcut.C0739b0.b()
            r0.zzjp = r1
        L21e:
            r3 = r22
            r4 = r1
            r0 = r5
            r1 = r20
            r5 = r23
            int r2 = com.google.android.gms.internal.clearcut.l0.c(r0, r1, r2, r3, r4, r5)
            r0 = r18
            r7 = r20
            r13 = r23
            r8 = r3
            goto L140
        L233:
            r4 = r8
            if (r2 != r4) goto L237
            return
        L237:
            com.google.android.gms.internal.clearcut.B r0 = com.google.android.gms.internal.clearcut.B.b()
            throw r0
        L23c:
            r4 = r8
            r5 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r6 = r23
            r0.m(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.O.b(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.j):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final void c(AbstractC0764x abstractC0764x, AbstractC0764x abstractC0764x2) {
        AbstractC0764x abstractC0764x3;
        h0 h0Var;
        long jH;
        int i;
        abstractC0764x2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f10428a;
            if (i7 >= iArr.length) {
                AbstractC0764x abstractC0764x4 = abstractC0764x;
                if (this.f10433g) {
                    return;
                }
                AbstractC0737a0.a(this.f10437m, abstractC0764x4, abstractC0764x2);
                return;
            }
            int iV = v(i7);
            long j = iV & 1048575;
            int i8 = iArr[i7];
            switch ((iV & 267386880) >>> 20) {
                case 0:
                    abstractC0764x3 = abstractC0764x;
                    if (r(i7, abstractC0764x2)) {
                        h0 h0Var2 = i0.f10512d;
                        h0Var2.c(abstractC0764x3, j, h0Var2.k(j, abstractC0764x2));
                        x(i7, abstractC0764x3);
                    }
                    break;
                case 1:
                    abstractC0764x3 = abstractC0764x;
                    if (r(i7, abstractC0764x2)) {
                        h0 h0Var3 = i0.f10512d;
                        h0Var3.d(abstractC0764x3, j, h0Var3.j(j, abstractC0764x2));
                        x(i7, abstractC0764x3);
                    }
                    break;
                case 2:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    h0Var = i0.f10512d;
                    jH = h0Var.h(j, abstractC0764x2);
                    h0Var.e(abstractC0764x3, j, jH);
                    x(i7, abstractC0764x3);
                    break;
                case 3:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    h0Var = i0.f10512d;
                    jH = h0Var.h(j, abstractC0764x2);
                    h0Var.e(abstractC0764x3, j, jH);
                    x(i7, abstractC0764x3);
                    break;
                case 4:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    i0.b(i0.f10512d.g(j, abstractC0764x2), j, abstractC0764x3);
                    x(i7, abstractC0764x3);
                    break;
                case 5:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    h0Var = i0.f10512d;
                    jH = h0Var.h(j, abstractC0764x2);
                    h0Var.e(abstractC0764x3, j, jH);
                    x(i7, abstractC0764x3);
                    break;
                case 6:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    i0.b(i0.f10512d.g(j, abstractC0764x2), j, abstractC0764x3);
                    x(i7, abstractC0764x3);
                    break;
                case 7:
                    abstractC0764x3 = abstractC0764x;
                    if (r(i7, abstractC0764x2)) {
                        h0 h0Var4 = i0.f10512d;
                        h0Var4.f(abstractC0764x3, j, h0Var4.i(j, abstractC0764x2));
                        x(i7, abstractC0764x3);
                    }
                    break;
                case 8:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    i0.c(j, abstractC0764x3, i0.k(j, abstractC0764x2));
                    x(i7, abstractC0764x3);
                    break;
                case 9:
                    abstractC0764x3 = abstractC0764x;
                    p(i7, abstractC0764x3, abstractC0764x2);
                    break;
                case 10:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    i0.c(j, abstractC0764x3, i0.k(j, abstractC0764x2));
                    x(i7, abstractC0764x3);
                    break;
                case 11:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    i0.b(i0.f10512d.g(j, abstractC0764x2), j, abstractC0764x3);
                    x(i7, abstractC0764x3);
                    break;
                case 12:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    i0.b(i0.f10512d.g(j, abstractC0764x2), j, abstractC0764x3);
                    x(i7, abstractC0764x3);
                    break;
                case 13:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    i0.b(i0.f10512d.g(j, abstractC0764x2), j, abstractC0764x3);
                    x(i7, abstractC0764x3);
                    break;
                case 14:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    h0Var = i0.f10512d;
                    jH = h0Var.h(j, abstractC0764x2);
                    h0Var.e(abstractC0764x3, j, jH);
                    x(i7, abstractC0764x3);
                    break;
                case 15:
                    abstractC0764x3 = abstractC0764x;
                    if (!r(i7, abstractC0764x2)) {
                    }
                    i0.b(i0.f10512d.g(j, abstractC0764x2), j, abstractC0764x3);
                    x(i7, abstractC0764x3);
                    break;
                case WorkDatabaseVersions.VERSION_16 /* 16 */:
                    if (r(i7, abstractC0764x2)) {
                        h0Var = i0.f10512d;
                        jH = h0Var.h(j, abstractC0764x2);
                        abstractC0764x3 = abstractC0764x;
                        h0Var.e(abstractC0764x3, j, jH);
                        x(i7, abstractC0764x3);
                    }
                    abstractC0764x3 = abstractC0764x;
                    break;
                case WorkDatabaseVersions.VERSION_17 /* 17 */:
                    p(i7, abstractC0764x, abstractC0764x2);
                    abstractC0764x3 = abstractC0764x;
                    break;
                case WorkDatabaseVersions.VERSION_18 /* 18 */:
                case WorkDatabaseVersions.VERSION_19 /* 19 */:
                case 20:
                case WorkDatabaseVersions.VERSION_21 /* 21 */:
                case 22:
                case WorkManagerImpl.MIN_JOB_SCHEDULER_API_LEVEL /* 23 */:
                case WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f10436l.b(j, abstractC0764x, abstractC0764x2);
                    abstractC0764x3 = abstractC0764x;
                    break;
                case Scheduler.MAX_SCHEDULER_LIMIT /* 50 */:
                    Class cls = AbstractC0737a0.f10482a;
                    Object objK = i0.k(j, abstractC0764x);
                    Object objK2 = i0.k(j, abstractC0764x2);
                    this.f10438n.getClass();
                    i0.c(j, abstractC0764x, L.a(objK, objK2));
                    abstractC0764x3 = abstractC0764x;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i8, i7, abstractC0764x2)) {
                        i0.c(j, abstractC0764x, i0.k(j, abstractC0764x2));
                        i = iArr[i7 + 2];
                        i0.b(i8, i & 1048575, abstractC0764x);
                    }
                    abstractC0764x3 = abstractC0764x;
                    break;
                case 60:
                case 68:
                    y(i7, abstractC0764x, abstractC0764x2);
                    abstractC0764x3 = abstractC0764x;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i8, i7, abstractC0764x2)) {
                        i0.c(j, abstractC0764x, i0.k(j, abstractC0764x2));
                        i = iArr[i7 + 2];
                        i0.b(i8, i & 1048575, abstractC0764x);
                    }
                    abstractC0764x3 = abstractC0764x;
                    break;
                default:
                    abstractC0764x3 = abstractC0764x;
                    break;
            }
            i7 += 4;
            abstractC0764x = abstractC0764x3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.Z
    public final Object d() {
        this.f10435k.getClass();
        return ((AbstractC0764x) this.f).a(4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    @Override // com.google.android.gms.internal.clearcut.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.android.gms.internal.clearcut.AbstractC0764x r12, com.google.android.gms.internal.clearcut.AbstractC0764x r13) {
        /*
            r11 = this;
            int[] r0 = r11.f10428a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            r4 = 1
            if (r3 >= r1) goto L1cb
            int r5 = r11.v(r3)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r5 & r6
            long r7 = (long) r7
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r9
            int r5 = r5 >>> 20
            switch(r5) {
                case 0: goto L1ae;
                case 1: goto L19a;
                case 2: goto L184;
                case 3: goto L16e;
                case 4: goto L15a;
                case 5: goto L144;
                case 6: goto L130;
                case 7: goto L11c;
                case 8: goto L106;
                case 9: goto Lf0;
                case 10: goto Lda;
                case 11: goto Lc6;
                case 12: goto Lb2;
                case 13: goto L9f;
                case 14: goto L8a;
                case 15: goto L77;
                case 16: goto L62;
                case 17: goto L4d;
                case 18: goto L3f;
                case 19: goto L3f;
                case 20: goto L3f;
                case 21: goto L3f;
                case 22: goto L3f;
                case 23: goto L3f;
                case 24: goto L3f;
                case 25: goto L3f;
                case 26: goto L3f;
                case 27: goto L3f;
                case 28: goto L3f;
                case 29: goto L3f;
                case 30: goto L3f;
                case 31: goto L3f;
                case 32: goto L3f;
                case 33: goto L3f;
                case 34: goto L3f;
                case 35: goto L3f;
                case 36: goto L3f;
                case 37: goto L3f;
                case 38: goto L3f;
                case 39: goto L3f;
                case 40: goto L3f;
                case 41: goto L3f;
                case 42: goto L3f;
                case 43: goto L3f;
                case 44: goto L3f;
                case 45: goto L3f;
                case 46: goto L3f;
                case 47: goto L3f;
                case 48: goto L3f;
                case 49: goto L3f;
                case 50: goto L3f;
                case 51: goto L1c;
                case 52: goto L1c;
                case 53: goto L1c;
                case 54: goto L1c;
                case 55: goto L1c;
                case 56: goto L1c;
                case 57: goto L1c;
                case 58: goto L1c;
                case 59: goto L1c;
                case 60: goto L1c;
                case 61: goto L1c;
                case 62: goto L1c;
                case 63: goto L1c;
                case 64: goto L1c;
                case 65: goto L1c;
                case 66: goto L1c;
                case 67: goto L1c;
                case 68: goto L1c;
                default: goto L1a;
            }
        L1a:
            goto L1c4
        L1c:
            int r5 = r3 + 2
            r5 = r0[r5]
            r5 = r5 & r6
            long r5 = (long) r5
            com.google.android.gms.internal.clearcut.h0 r9 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r10 = r9.g(r5, r12)
            int r5 = r9.g(r5, r13)
            if (r10 != r5) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.i0.k(r7, r12)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.i0.k(r7, r13)
            boolean r5 = com.google.android.gms.internal.clearcut.AbstractC0737a0.c(r5, r6)
            if (r5 != 0) goto L1c4
        L3c:
            r4 = r2
            goto L1c4
        L3f:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r7, r12)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.i0.k(r7, r13)
            boolean r4 = com.google.android.gms.internal.clearcut.AbstractC0737a0.c(r4, r5)
            goto L1c4
        L4d:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.i0.k(r7, r12)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.i0.k(r7, r13)
            boolean r5 = com.google.android.gms.internal.clearcut.AbstractC0737a0.c(r5, r6)
            if (r5 != 0) goto L1c4
            goto L3c
        L62:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L1c4
            goto L3c
        L77:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 == r5) goto L1c4
            goto L3c
        L8a:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L1c4
            goto L3c
        L9f:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 == r5) goto L1c4
            goto L3c
        Lb2:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 == r5) goto L1c4
            goto L3c
        Lc6:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 == r5) goto L1c4
            goto L3c
        Lda:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.i0.k(r7, r12)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.i0.k(r7, r13)
            boolean r5 = com.google.android.gms.internal.clearcut.AbstractC0737a0.c(r5, r6)
            if (r5 != 0) goto L1c4
            goto L3c
        Lf0:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.i0.k(r7, r12)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.i0.k(r7, r13)
            boolean r5 = com.google.android.gms.internal.clearcut.AbstractC0737a0.c(r5, r6)
            if (r5 != 0) goto L1c4
            goto L3c
        L106:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.i0.k(r7, r12)
            java.lang.Object r6 = com.google.android.gms.internal.clearcut.i0.k(r7, r13)
            boolean r5 = com.google.android.gms.internal.clearcut.AbstractC0737a0.c(r5, r6)
            if (r5 != 0) goto L1c4
            goto L3c
        L11c:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            boolean r6 = r5.i(r7, r12)
            boolean r5 = r5.i(r7, r13)
            if (r6 == r5) goto L1c4
            goto L3c
        L130:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 == r5) goto L1c4
            goto L3c
        L144:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L1c4
            goto L3c
        L15a:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 == r5) goto L1c4
            goto L3c
        L16e:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L1c4
            goto L3c
        L184:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L1c4
            goto L3c
        L19a:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r6 = r5.g(r7, r12)
            int r5 = r5.g(r7, r13)
            if (r6 == r5) goto L1c4
            goto L3c
        L1ae:
            boolean r5 = r11.z(r12, r13, r3)
            if (r5 == 0) goto L3c
            com.google.android.gms.internal.clearcut.h0 r5 = com.google.android.gms.internal.clearcut.i0.f10512d
            long r9 = r5.h(r7, r12)
            long r5 = r5.h(r7, r13)
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 == 0) goto L1c4
            goto L3c
        L1c4:
            if (r4 != 0) goto L1c7
            goto L1da
        L1c7:
            int r3 = r3 + 4
            goto L5
        L1cb:
            com.google.android.gms.internal.clearcut.c0 r0 = r11.f10437m
            r0.getClass()
            com.google.android.gms.internal.clearcut.b0 r12 = r12.zzjp
            com.google.android.gms.internal.clearcut.b0 r13 = r13.zzjp
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L1db
        L1da:
            return r2
        L1db:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.O.e(com.google.android.gms.internal.clearcut.x, com.google.android.gms.internal.clearcut.x):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.google.android.gms.internal.clearcut.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            int[] r3 = r0.f10434h
            if (r3 == 0) goto Lc
            int r4 = r3.length
            if (r4 != 0) goto L10
        Lc:
            r16 = r2
            goto L112
        L10:
            int r4 = r3.length
            r5 = 0
            r6 = -1
            r7 = r5
            r8 = r7
        L15:
            if (r7 >= r4) goto Lc
            r9 = r3[r7]
            int r10 = r0.w(r9)
            int r11 = r0.v(r10)
            boolean r12 = r0.f10433g
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r12 != 0) goto L48
            int r14 = r10 + 2
            int[] r15 = r0.f10428a
            r14 = r15[r14]
            r15 = r14 & r13
            int r14 = r14 >>> 20
            int r14 = r2 << r14
            if (r15 == r6) goto L43
            sun.misc.Unsafe r6 = com.google.android.gms.internal.clearcut.O.f10427o
            r16 = r2
            r17 = r3
            long r2 = (long) r15
            int r8 = r6.getInt(r1, r2)
            r6 = r15
            goto L4d
        L43:
            r16 = r2
            r17 = r3
            goto L4d
        L48:
            r16 = r2
            r17 = r3
            r14 = r5
        L4d:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r11
            if (r2 == 0) goto L65
            if (r12 == 0) goto L59
            boolean r2 = r0.r(r10, r1)
            goto L61
        L59:
            r2 = r8 & r14
            if (r2 == 0) goto L60
            r2 = r16
            goto L61
        L60:
            r2 = r5
        L61:
            if (r2 != 0) goto L65
            goto L109
        L65:
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r11
            int r2 = r2 >>> 20
            r3 = 9
            if (r2 == r3) goto Le7
            r3 = 17
            if (r2 == r3) goto Le7
            r3 = 27
            if (r2 == r3) goto Lbf
            r3 = 60
            if (r2 == r3) goto La7
            r3 = 68
            if (r2 == r3) goto La7
            r3 = 49
            if (r2 == r3) goto Lbf
            r3 = 50
            if (r2 == r3) goto L88
            goto L10a
        L88:
            r2 = r11 & r13
            long r2 = (long) r2
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.i0.k(r2, r1)
            com.google.android.gms.internal.clearcut.L r3 = r0.f10438n
            r3.getClass()
            com.google.android.gms.internal.clearcut.K r2 = (com.google.android.gms.internal.clearcut.K) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L9e
            goto L10a
        L9e:
            r0.t(r10)
            java.lang.NoSuchMethodError r1 = new java.lang.NoSuchMethodError
            r1.<init>()
            throw r1
        La7:
            boolean r2 = r0.q(r9, r10, r1)
            if (r2 == 0) goto L10a
            com.google.android.gms.internal.clearcut.Z r2 = r0.s(r10)
            r3 = r11 & r13
            long r9 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.i0.k(r9, r1)
            boolean r2 = r2.f(r3)
            if (r2 != 0) goto L10a
            goto L109
        Lbf:
            r2 = r11 & r13
            long r2 = (long) r2
            java.lang.Object r2 = com.google.android.gms.internal.clearcut.i0.k(r2, r1)
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L10a
            com.google.android.gms.internal.clearcut.Z r3 = r0.s(r10)
            r9 = r5
        Ld3:
            int r10 = r2.size()
            if (r9 >= r10) goto L10a
            java.lang.Object r10 = r2.get(r9)
            boolean r10 = r3.f(r10)
            if (r10 != 0) goto Le4
            goto L109
        Le4:
            int r9 = r9 + 1
            goto Ld3
        Le7:
            if (r12 == 0) goto Lee
            boolean r2 = r0.r(r10, r1)
            goto Lf6
        Lee:
            r2 = r8 & r14
            if (r2 == 0) goto Lf5
            r2 = r16
            goto Lf6
        Lf5:
            r2 = r5
        Lf6:
            if (r2 == 0) goto L10a
            com.google.android.gms.internal.clearcut.Z r2 = r0.s(r10)
            r3 = r11 & r13
            long r9 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.i0.k(r9, r1)
            boolean r2 = r2.f(r3)
            if (r2 != 0) goto L10a
        L109:
            return r5
        L10a:
            int r7 = r7 + 1
            r2 = r16
            r3 = r17
            goto L15
        L112:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.O.f(java.lang.Object):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad A[PHI: r3
  0x00ad: PHI (r3v17 int) = (r3v5 int), (r3v18 int) binds: [B:80:0x015d, B:43:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.clearcut.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(com.google.android.gms.internal.clearcut.AbstractC0764x r12) {
        /*
            r11 = this;
            int[] r0 = r11.f10428a
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r2 >= r1) goto L180
            int r4 = r11.v(r2)
            r5 = r0[r2]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            r8 = 1237(0x4d5, float:1.733E-42)
            r9 = 1231(0x4cf, float:1.725E-42)
            r10 = 37
            switch(r4) {
                case 0: goto L16f;
                case 1: goto L161;
                case 2: goto L116;
                case 3: goto L116;
                case 4: goto L124;
                case 5: goto L116;
                case 6: goto L124;
                case 7: goto L153;
                case 8: goto L145;
                case 9: goto L13a;
                case 10: goto L12e;
                case 11: goto L124;
                case 12: goto L124;
                case 13: goto L124;
                case 14: goto L116;
                case 15: goto L124;
                case 16: goto L116;
                case 17: goto L108;
                case 18: goto L76;
                case 19: goto L76;
                case 20: goto L76;
                case 21: goto L76;
                case 22: goto L76;
                case 23: goto L76;
                case 24: goto L76;
                case 25: goto L76;
                case 26: goto L76;
                case 27: goto L76;
                case 28: goto L76;
                case 29: goto L76;
                case 30: goto L76;
                case 31: goto L76;
                case 32: goto L76;
                case 33: goto L76;
                case 34: goto L76;
                case 35: goto L76;
                case 36: goto L76;
                case 37: goto L76;
                case 38: goto L76;
                case 39: goto L76;
                case 40: goto L76;
                case 41: goto L76;
                case 42: goto L76;
                case 43: goto L76;
                case 44: goto L76;
                case 45: goto L76;
                case 46: goto L76;
                case 47: goto L76;
                case 48: goto L76;
                case 49: goto L76;
                case 50: goto L76;
                case 51: goto Lf0;
                case 52: goto Ld8;
                case 53: goto Ld0;
                case 54: goto Lc8;
                case 55: goto Lc1;
                case 56: goto Lb9;
                case 57: goto Lb2;
                case 58: goto L97;
                case 59: goto L84;
                case 60: goto L7d;
                case 61: goto L70;
                case 62: goto L69;
                case 63: goto L62;
                case 64: goto L5b;
                case 65: goto L54;
                case 66: goto L47;
                case 67: goto L36;
                case 68: goto L22;
                default: goto L20;
            }
        L20:
            goto L17c
        L22:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
        L28:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            int r3 = r3 * 53
        L2e:
            int r4 = r4.hashCode()
        L32:
            int r4 = r4 + r3
            r3 = r4
            goto L17c
        L36:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
        L3c:
            int r3 = r3 * 53
            long r4 = B(r6, r12)
        L42:
            int r4 = com.google.android.gms.internal.clearcut.AbstractC0765y.b(r4)
            goto L32
        L47:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
        L4d:
            int r3 = r3 * 53
            int r4 = A(r6, r12)
            goto L32
        L54:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L3c
        L5b:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L4d
        L62:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L4d
        L69:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L4d
        L70:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
        L76:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            goto L2e
        L7d:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L28
        L84:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L32
        L97:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.nio.charset.Charset r5 = com.google.android.gms.internal.clearcut.AbstractC0765y.f10579a
            if (r4 == 0) goto Lae
        Lad:
            r8 = r9
        Lae:
            int r8 = r8 + r3
            r3 = r8
            goto L17c
        Lb2:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L4d
        Lb9:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L3c
        Lc1:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L4d
        Lc8:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L3c
        Ld0:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            goto L3c
        Ld8:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L32
        Lf0:
            boolean r4 = r11.q(r5, r2, r12)
            if (r4 == 0) goto L17c
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            long r4 = java.lang.Double.doubleToLongBits(r4)
            goto L42
        L108:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            if (r4 == 0) goto L112
            int r10 = r4.hashCode()
        L112:
            int r3 = r3 * 53
            int r3 = r3 + r10
            goto L17c
        L116:
            int r3 = r3 * 53
            com.google.android.gms.internal.clearcut.h0 r4 = com.google.android.gms.internal.clearcut.i0.f10512d
            long r4 = r4.h(r6, r12)
        L11e:
            int r4 = com.google.android.gms.internal.clearcut.AbstractC0765y.b(r4)
            goto L32
        L124:
            int r3 = r3 * 53
            com.google.android.gms.internal.clearcut.h0 r4 = com.google.android.gms.internal.clearcut.i0.f10512d
            int r4 = r4.g(r6, r12)
            goto L32
        L12e:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            int r4 = r4.hashCode()
            goto L32
        L13a:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            if (r4 == 0) goto L112
            int r10 = r4.hashCode()
            goto L112
        L145:
            int r3 = r3 * 53
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.i0.k(r6, r12)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.hashCode()
            goto L32
        L153:
            int r3 = r3 * 53
            com.google.android.gms.internal.clearcut.h0 r4 = com.google.android.gms.internal.clearcut.i0.f10512d
            boolean r4 = r4.i(r6, r12)
            java.nio.charset.Charset r5 = com.google.android.gms.internal.clearcut.AbstractC0765y.f10579a
            if (r4 == 0) goto Lae
            goto Lad
        L161:
            int r3 = r3 * 53
            com.google.android.gms.internal.clearcut.h0 r4 = com.google.android.gms.internal.clearcut.i0.f10512d
            float r4 = r4.j(r6, r12)
            int r4 = java.lang.Float.floatToIntBits(r4)
            goto L32
        L16f:
            int r3 = r3 * 53
            com.google.android.gms.internal.clearcut.h0 r4 = com.google.android.gms.internal.clearcut.i0.f10512d
            double r4 = r4.k(r6, r12)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            goto L11e
        L17c:
            int r2 = r2 + 4
            goto L5
        L180:
            int r3 = r3 * 53
            com.google.android.gms.internal.clearcut.c0 r0 = r11.f10437m
            r0.getClass()
            com.google.android.gms.internal.clearcut.b0 r12 = r12.zzjp
            int r12 = r12.hashCode()
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.O.g(com.google.android.gms.internal.clearcut.x):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k(Object obj, byte[] bArr, int i, int i7, int i8, int i9, int i10, int i11, int i12, long j, int i13, C0751j c0751j) throws B {
        int i14;
        Object objValueOf;
        int i15;
        Object objValueOf2;
        int iM;
        long j7;
        int i16;
        Object objValueOf3;
        Object object;
        Unsafe unsafe = f10427o;
        long j8 = this.f10428a[i13 + 2] & 1048575;
        switch (i12) {
            case 51:
                i14 = i;
                if (i10 != 1) {
                    return i14;
                }
                objValueOf = Double.valueOf(Double.longBitsToDouble(l0.r(i14, bArr)));
                unsafe.putObject(obj, j, objValueOf);
                iM = i14 + 8;
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 52:
                i15 = i;
                if (i10 != 5) {
                    return i15;
                }
                objValueOf2 = Float.valueOf(Float.intBitsToFloat(l0.o(i15, bArr)));
                unsafe.putObject(obj, j, objValueOf2);
                iM = i15 + 4;
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 53:
            case 54:
                if (i10 != 0) {
                    return i;
                }
                iM = l0.m(bArr, i, c0751j);
                j7 = c0751j.f10517b;
                objValueOf3 = Long.valueOf(j7);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 55:
            case 62:
                if (i10 != 0) {
                    return i;
                }
                iM = l0.f(bArr, i, c0751j);
                i16 = c0751j.f10516a;
                objValueOf3 = Integer.valueOf(i16);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 56:
            case 65:
                i14 = i;
                if (i10 != 1) {
                    return i14;
                }
                objValueOf = Long.valueOf(l0.r(i14, bArr));
                unsafe.putObject(obj, j, objValueOf);
                iM = i14 + 8;
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 57:
            case 64:
                i15 = i;
                if (i10 != 5) {
                    return i15;
                }
                objValueOf2 = Integer.valueOf(l0.o(i15, bArr));
                unsafe.putObject(obj, j, objValueOf2);
                iM = i15 + 4;
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 58:
                if (i10 != 0) {
                    return i;
                }
                iM = l0.m(bArr, i, c0751j);
                objValueOf3 = Boolean.valueOf(c0751j.f10517b != 0);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 59:
                if (i10 != 2) {
                    return i;
                }
                int iF = l0.f(bArr, i, c0751j);
                int i17 = c0751j.f10516a;
                if (i17 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i11 & 536870912) != 0) {
                        if (!k0.f10523a.t(bArr, iF, iF + i17)) {
                            throw new B("Protocol message had invalid UTF-8.");
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iF, i17, AbstractC0765y.f10579a));
                    iF += i17;
                }
                unsafe.putInt(obj, j8, i9);
                return iF;
            case 60:
                if (i10 != 2) {
                    return i;
                }
                int iJ = j(s(i13), bArr, i, i7, c0751j);
                object = unsafe.getInt(obj, j8) == i9 ? unsafe.getObject(obj, j) : null;
                Object objA = c0751j.f10518c;
                if (object != null) {
                    objA = AbstractC0765y.a(object, objA);
                }
                unsafe.putObject(obj, j, objA);
                unsafe.putInt(obj, j8, i9);
                return iJ;
            case 61:
                if (i10 != 2) {
                    return i;
                }
                int iF2 = l0.f(bArr, i, c0751j);
                int i18 = c0751j.f10516a;
                if (i18 == 0) {
                    unsafe.putObject(obj, j, C0754m.f10530s);
                } else {
                    unsafe.putObject(obj, j, C0754m.g(bArr, iF2, i18));
                    iF2 += i18;
                }
                unsafe.putInt(obj, j8, i9);
                return iF2;
            case 63:
                if (i10 != 0) {
                    return i;
                }
                int iF3 = l0.f(bArr, i, c0751j);
                int i19 = c0751j.f10516a;
                InterfaceC0766z interfaceC0766zU = u(i13);
                if (interfaceC0766zU == null || interfaceC0766zU.e(i19) != null) {
                    unsafe.putObject(obj, j, Integer.valueOf(i19));
                    iM = iF3;
                    unsafe.putInt(obj, j8, i9);
                    return iM;
                }
                AbstractC0764x abstractC0764x = (AbstractC0764x) obj;
                C0739b0 c0739b0B = abstractC0764x.zzjp;
                if (c0739b0B == C0739b0.f10493e) {
                    c0739b0B = C0739b0.b();
                    abstractC0764x.zzjp = c0739b0B;
                }
                c0739b0B.a(i8, Long.valueOf(i19));
                return iF3;
            case 66:
                if (i10 != 0) {
                    return i;
                }
                iM = l0.f(bArr, i, c0751j);
                int i20 = c0751j.f10516a;
                i16 = (-(i20 & 1)) ^ (i20 >>> 1);
                objValueOf3 = Integer.valueOf(i16);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 67:
                if (i10 != 0) {
                    return i;
                }
                iM = l0.m(bArr, i, c0751j);
                long j9 = c0751j.f10517b;
                j7 = (-(j9 & 1)) ^ (j9 >>> 1);
                objValueOf3 = Long.valueOf(j7);
                unsafe.putObject(obj, j, objValueOf3);
                unsafe.putInt(obj, j8, i9);
                return iM;
            case 68:
                if (i10 == 3) {
                    iM = i(s(i13), bArr, i, i7, (i8 & (-8)) | 4, c0751j);
                    object = unsafe.getInt(obj, j8) == i9 ? unsafe.getObject(obj, j) : null;
                    Object objA2 = c0751j.f10518c;
                    if (object != null) {
                        objA2 = AbstractC0765y.a(object, objA2);
                    }
                    unsafe.putObject(obj, j, objA2);
                    unsafe.putInt(obj, j8, i9);
                    return iM;
                }
            default:
                return i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:116:0x01b6) to fix multi-entry loop: BACK_EDGE: B:116:0x01b6 -> B:117:0x01be */
    /* JADX DEBUG: Duplicate block (B:136:0x0211) to fix multi-entry loop: BACK_EDGE: B:136:0x0211 -> B:137:0x0215 */
    /* JADX DEBUG: Duplicate block (B:151:0x0250) to fix multi-entry loop: BACK_EDGE: B:151:0x0250 -> B:152:0x0254 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ae, code lost:
    
        if (r1 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b0, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.C0754m.f10530s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b6, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.C0754m.g(r13, r12, r1));
        r12 = r12 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01be, code lost:
    
        if (r12 >= r15) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c0, code lost:
    
        r1 = com.google.android.gms.internal.clearcut.l0.f(r13, r12, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c6, code lost:
    
        if (r16 != r25.f10516a) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c8, code lost:
    
        r12 = com.google.android.gms.internal.clearcut.l0.f(r13, r1, r25);
        r1 = r25.f10516a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ce, code lost:
    
        if (r1 != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d1, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x01be, code lost:
    
        r6.add(com.google.android.gms.internal.clearcut.C0754m.g(r13, r12, r1));
        r12 = r12 + r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0256  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x01ce -> B:115:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0225 -> B:134:0x0206). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0264 -> B:147:0x023b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(java.lang.Object r12, byte[] r13, int r14, int r15, int r16, int r17, int r18, int r19, long r20, int r22, long r23, com.google.android.gms.internal.clearcut.C0751j r25) throws com.google.android.gms.internal.clearcut.B {
        /*
            r11 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r23
            sun.misc.Unsafe r5 = com.google.android.gms.internal.clearcut.O.f10427o
            java.lang.Object r6 = r5.getObject(r12, r3)
            com.google.android.gms.internal.clearcut.A r6 = (com.google.android.gms.internal.clearcut.A) r6
            r7 = r6
            com.google.android.gms.internal.clearcut.h r7 = (com.google.android.gms.internal.clearcut.AbstractC0749h) r7
            boolean r7 = r7.f10505q
            r8 = 1
            if (r7 != 0) goto L29
            int r7 = r6.size()
            if (r7 != 0) goto L21
            r7 = 10
            goto L22
        L21:
            int r7 = r7 << r8
        L22:
            com.google.android.gms.internal.clearcut.A r6 = r6.n(r7)
            r5.putObject(r12, r3, r6)
        L29:
            r3 = 3
            r4 = 5
            r5 = 2
            r7 = 0
            switch(r22) {
                case 18: goto L3b2;
                case 19: goto L37a;
                case 20: goto L34a;
                case 21: goto L34a;
                case 22: goto L319;
                case 23: goto L2e8;
                case 24: goto L2b7;
                case 25: goto L286;
                case 26: goto L1ed;
                case 27: goto L1d2;
                case 28: goto L1a4;
                case 29: goto L319;
                case 30: goto Le0;
                case 31: goto L2b7;
                case 32: goto L2e8;
                case 33: goto Laf;
                case 34: goto L7e;
                case 35: goto L3b2;
                case 36: goto L37a;
                case 37: goto L34a;
                case 38: goto L34a;
                case 39: goto L319;
                case 40: goto L2e8;
                case 41: goto L2b7;
                case 42: goto L286;
                case 43: goto L319;
                case 44: goto Le0;
                case 45: goto L2b7;
                case 46: goto L2e8;
                case 47: goto Laf;
                case 48: goto L7e;
                case 49: goto L32;
                default: goto L30;
            }
        L30:
            goto L3d9
        L32:
            if (r1 != r3) goto L3d9
            com.google.android.gms.internal.clearcut.Z r12 = r11.s(r2)
            r1 = r0 & (-8)
            r1 = r1 | 4
            r17 = r12
            r18 = r13
            r19 = r14
            r20 = r15
            r22 = r25
            r21 = r1
            int r12 = i(r17, r18, r19, r20, r21, r22)
            r4 = r17
            r5 = r21
            r3 = r22
            java.lang.Object r7 = r3.f10518c
            r6.add(r7)
        L57:
            if (r12 >= r15) goto L7d
            int r7 = com.google.android.gms.internal.clearcut.l0.f(r13, r12, r3)
            int r8 = r3.f10516a
            if (r0 != r8) goto L7d
            r18 = r13
            r20 = r15
            r22 = r3
            r17 = r4
            r21 = r5
            r19 = r7
            int r12 = i(r17, r18, r19, r20, r21, r22)
            r1 = r17
            r8 = r22
            java.lang.Object r2 = r8.f10518c
            r6.add(r2)
            r4 = r1
            r3 = r8
            goto L57
        L7d:
            return r12
        L7e:
            r8 = r25
            if (r1 != r5) goto L9f
            if (r6 != 0) goto L99
            int r12 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r8)
            int r0 = r8.f10516a
            int r0 = r0 + r12
            if (r12 < r0) goto L95
            if (r12 != r0) goto L90
            return r12
        L90:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L95:
            com.google.android.gms.internal.clearcut.l0.m(r13, r12, r8)
            throw r7
        L99:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L9f:
            if (r1 == 0) goto La3
            goto L3d9
        La3:
            if (r6 != 0) goto La9
            com.google.android.gms.internal.clearcut.l0.m(r13, r14, r8)
            throw r7
        La9:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        Laf:
            r8 = r25
            if (r1 != r5) goto Ld0
            if (r6 != 0) goto Lca
            int r12 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r8)
            int r0 = r8.f10516a
            int r0 = r0 + r12
            if (r12 < r0) goto Lc6
            if (r12 != r0) goto Lc1
            return r12
        Lc1:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        Lc6:
            com.google.android.gms.internal.clearcut.l0.f(r13, r12, r8)
            throw r7
        Lca:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        Ld0:
            if (r1 == 0) goto Ld4
            goto L3d9
        Ld4:
            if (r6 != 0) goto Lda
            com.google.android.gms.internal.clearcut.l0.f(r13, r14, r8)
            throw r7
        Lda:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        Le0:
            r8 = r25
            if (r1 != r5) goto L194
            if (r6 != 0) goto L18e
            int r0 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r8)
            int r1 = r8.f10516a
            int r1 = r1 + r0
            if (r0 < r1) goto L18a
            if (r0 != r1) goto L185
            com.google.android.gms.internal.clearcut.x r12 = (com.google.android.gms.internal.clearcut.AbstractC0764x) r12
            com.google.android.gms.internal.clearcut.b0 r13 = r12.zzjp
            com.google.android.gms.internal.clearcut.b0 r1 = com.google.android.gms.internal.clearcut.C0739b0.f10493e
            if (r13 != r1) goto Lfa
            goto Lfb
        Lfa:
            r7 = r13
        Lfb:
            com.google.android.gms.internal.clearcut.z r13 = r11.u(r2)
            java.lang.Class r1 = com.google.android.gms.internal.clearcut.AbstractC0737a0.f10482a
            if (r13 != 0) goto L105
            goto L180
        L105:
            com.google.android.gms.internal.clearcut.c0 r1 = r11.f10437m
            if (r6 == 0) goto L14c
            int r2 = r6.size()
            r4 = 0
            r5 = r4
        L10f:
            if (r4 >= r2) goto L142
            java.lang.Object r8 = r6.get(r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r9 = r8.intValue()
            com.google.android.gms.internal.clearcut.p0 r10 = r13.e(r9)
            if (r10 == 0) goto L129
            if (r4 == r5) goto L126
            r6.set(r5, r8)
        L126:
            int r5 = r5 + 1
            goto L13f
        L129:
            if (r7 != 0) goto L132
            r1.getClass()
            com.google.android.gms.internal.clearcut.b0 r7 = com.google.android.gms.internal.clearcut.C0739b0.b()
        L132:
            long r8 = (long) r9
            r1.getClass()
            int r10 = r17 << 3
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7.a(r10, r8)
        L13f:
            int r4 = r4 + 1
            goto L10f
        L142:
            if (r5 == r2) goto L180
            java.util.List r13 = r6.subList(r5, r2)
            r13.clear()
            goto L180
        L14c:
            java.util.Iterator r2 = r6.iterator()
        L150:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L180
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.clearcut.p0 r5 = r13.e(r4)
            if (r5 != 0) goto L150
            if (r7 != 0) goto L16f
            r1.getClass()
            com.google.android.gms.internal.clearcut.b0 r7 = com.google.android.gms.internal.clearcut.C0739b0.b()
        L16f:
            long r4 = (long) r4
            r1.getClass()
            int r6 = r17 << 3
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r7.a(r6, r4)
            r2.remove()
            goto L150
        L180:
            if (r7 == 0) goto L184
            r12.zzjp = r7
        L184:
            return r0
        L185:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L18a:
            com.google.android.gms.internal.clearcut.l0.f(r13, r0, r8)
            throw r7
        L18e:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L194:
            if (r1 == 0) goto L198
            goto L3d9
        L198:
            if (r6 != 0) goto L19e
            com.google.android.gms.internal.clearcut.l0.f(r13, r14, r8)
            throw r7
        L19e:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L1a4:
            r8 = r25
            if (r1 != r5) goto L3d9
            int r12 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r8)
            int r1 = r8.f10516a
            if (r1 != 0) goto L1b6
        L1b0:
            com.google.android.gms.internal.clearcut.m r1 = com.google.android.gms.internal.clearcut.C0754m.f10530s
            r6.add(r1)
            goto L1be
        L1b6:
            com.google.android.gms.internal.clearcut.m r2 = com.google.android.gms.internal.clearcut.C0754m.g(r13, r12, r1)
            r6.add(r2)
            int r12 = r12 + r1
        L1be:
            if (r12 >= r15) goto L1d1
            int r1 = com.google.android.gms.internal.clearcut.l0.f(r13, r12, r8)
            int r2 = r8.f10516a
            if (r0 != r2) goto L1d1
            int r12 = com.google.android.gms.internal.clearcut.l0.f(r13, r1, r8)
            int r1 = r8.f10516a
            if (r1 != 0) goto L1b6
            goto L1b0
        L1d1:
            return r12
        L1d2:
            r8 = r25
            if (r1 != r5) goto L3d9
            com.google.android.gms.internal.clearcut.Z r12 = r11.s(r2)
            r17 = r12
            r19 = r13
            r20 = r14
            r21 = r15
            r18 = r0
            r22 = r6
            r23 = r8
            int r12 = h(r17, r18, r19, r20, r21, r22, r23)
            return r12
        L1ed:
            r3 = r25
            if (r1 != r5) goto L3d9
            r4 = 536870912(0x20000000, double:2.652494739E-315)
            long r4 = r20 & r4
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            java.lang.String r4 = ""
            if (r1 != 0) goto L231
            int r1 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r5 = r3.f10516a
            if (r5 != 0) goto L20a
        L206:
            r6.add(r4)
            goto L215
        L20a:
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.clearcut.AbstractC0765y.f10579a
            r7.<init>(r13, r1, r5, r8)
        L211:
            r6.add(r7)
            int r1 = r1 + r5
        L215:
            if (r1 >= r15) goto L230
            int r5 = com.google.android.gms.internal.clearcut.l0.f(r13, r1, r3)
            int r7 = r3.f10516a
            if (r0 != r7) goto L230
            int r1 = com.google.android.gms.internal.clearcut.l0.f(r13, r5, r3)
            int r5 = r3.f10516a
            if (r5 != 0) goto L228
            goto L206
        L228:
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = com.google.android.gms.internal.clearcut.AbstractC0765y.f10579a
            r7.<init>(r13, r1, r5, r8)
            goto L211
        L230:
            return r1
        L231:
            int r1 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r5 = r3.f10516a
            java.lang.String r7 = "Protocol message had invalid UTF-8."
            if (r5 != 0) goto L23f
        L23b:
            r6.add(r4)
            goto L254
        L23f:
            int r8 = r1 + r5
            com.google.android.gms.internal.clearcut.l0 r9 = com.google.android.gms.internal.clearcut.k0.f10523a
            boolean r9 = r9.t(r13, r1, r8)
            if (r9 == 0) goto L280
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.AbstractC0765y.f10579a
            r9.<init>(r13, r1, r5, r10)
        L250:
            r6.add(r9)
            r1 = r8
        L254:
            if (r1 >= r15) goto L27f
            int r5 = com.google.android.gms.internal.clearcut.l0.f(r13, r1, r3)
            int r8 = r3.f10516a
            if (r0 != r8) goto L27f
            int r1 = com.google.android.gms.internal.clearcut.l0.f(r13, r5, r3)
            int r5 = r3.f10516a
            if (r5 != 0) goto L267
            goto L23b
        L267:
            int r8 = r1 + r5
            com.google.android.gms.internal.clearcut.l0 r9 = com.google.android.gms.internal.clearcut.k0.f10523a
            boolean r9 = r9.t(r13, r1, r8)
            if (r9 == 0) goto L279
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.AbstractC0765y.f10579a
            r9.<init>(r13, r1, r5, r10)
            goto L250
        L279:
            com.google.android.gms.internal.clearcut.B r12 = new com.google.android.gms.internal.clearcut.B
            r12.<init>(r7)
            throw r12
        L27f:
            return r1
        L280:
            com.google.android.gms.internal.clearcut.B r12 = new com.google.android.gms.internal.clearcut.B
            r12.<init>(r7)
            throw r12
        L286:
            r3 = r25
            if (r1 != r5) goto L2a7
            if (r6 != 0) goto L2a1
            int r0 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r1 = r3.f10516a
            int r1 = r1 + r0
            if (r0 < r1) goto L29d
            if (r0 != r1) goto L298
            return r0
        L298:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L29d:
            com.google.android.gms.internal.clearcut.l0.m(r13, r0, r3)
            throw r7
        L2a1:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L2a7:
            if (r1 == 0) goto L2ab
            goto L3d9
        L2ab:
            if (r6 != 0) goto L2b1
            com.google.android.gms.internal.clearcut.l0.m(r13, r14, r3)
            throw r7
        L2b1:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L2b7:
            r3 = r25
            if (r1 != r5) goto L2d8
            if (r6 != 0) goto L2d2
            int r0 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r1 = r3.f10516a
            int r1 = r1 + r0
            if (r0 < r1) goto L2ce
            if (r0 != r1) goto L2c9
            return r0
        L2c9:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L2ce:
            com.google.android.gms.internal.clearcut.l0.o(r0, r13)
            throw r7
        L2d2:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L2d8:
            if (r1 == r4) goto L2dc
            goto L3d9
        L2dc:
            if (r6 != 0) goto L2e2
            com.google.android.gms.internal.clearcut.l0.o(r14, r13)
            throw r7
        L2e2:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L2e8:
            r3 = r25
            if (r1 != r5) goto L309
            if (r6 != 0) goto L303
            int r0 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r1 = r3.f10516a
            int r1 = r1 + r0
            if (r0 < r1) goto L2ff
            if (r0 != r1) goto L2fa
            return r0
        L2fa:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L2ff:
            com.google.android.gms.internal.clearcut.l0.r(r0, r13)
            throw r7
        L303:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L309:
            if (r1 == r8) goto L30d
            goto L3d9
        L30d:
            if (r6 != 0) goto L313
            com.google.android.gms.internal.clearcut.l0.r(r14, r13)
            throw r7
        L313:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L319:
            r3 = r25
            if (r1 != r5) goto L33a
            if (r6 != 0) goto L334
            int r0 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r1 = r3.f10516a
            int r1 = r1 + r0
            if (r0 < r1) goto L330
            if (r0 != r1) goto L32b
            return r0
        L32b:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L330:
            com.google.android.gms.internal.clearcut.l0.f(r13, r0, r3)
            throw r7
        L334:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L33a:
            if (r1 == 0) goto L33e
            goto L3d9
        L33e:
            if (r6 != 0) goto L344
            com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            throw r7
        L344:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L34a:
            r3 = r25
            if (r1 != r5) goto L36b
            if (r6 != 0) goto L365
            int r0 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r1 = r3.f10516a
            int r1 = r1 + r0
            if (r0 < r1) goto L361
            if (r0 != r1) goto L35c
            return r0
        L35c:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L361:
            com.google.android.gms.internal.clearcut.l0.m(r13, r0, r3)
            throw r7
        L365:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L36b:
            if (r1 == 0) goto L36e
            goto L3d9
        L36e:
            if (r6 != 0) goto L374
            com.google.android.gms.internal.clearcut.l0.m(r13, r14, r3)
            throw r7
        L374:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L37a:
            r3 = r25
            if (r1 != r5) goto L39f
            if (r6 != 0) goto L399
            int r0 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r1 = r3.f10516a
            int r1 = r1 + r0
            if (r0 < r1) goto L391
            if (r0 != r1) goto L38c
            return r0
        L38c:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L391:
            int r12 = com.google.android.gms.internal.clearcut.l0.o(r0, r13)
            java.lang.Float.intBitsToFloat(r12)
            throw r7
        L399:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L39f:
            if (r1 == r4) goto L3a2
            goto L3d9
        L3a2:
            if (r6 != 0) goto L3ac
            int r12 = com.google.android.gms.internal.clearcut.l0.o(r14, r13)
            java.lang.Float.intBitsToFloat(r12)
            throw r7
        L3ac:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L3b2:
            r3 = r25
            if (r1 != r5) goto L3d7
            if (r6 != 0) goto L3d1
            int r0 = com.google.android.gms.internal.clearcut.l0.f(r13, r14, r3)
            int r1 = r3.f10516a
            int r1 = r1 + r0
            if (r0 < r1) goto L3c9
            if (r0 != r1) goto L3c4
            return r0
        L3c4:
            com.google.android.gms.internal.clearcut.B r12 = com.google.android.gms.internal.clearcut.B.a()
            throw r12
        L3c9:
            long r12 = com.google.android.gms.internal.clearcut.l0.r(r0, r13)
            java.lang.Double.longBitsToDouble(r12)
            throw r7
        L3d1:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L3d7:
            if (r1 == r8) goto L3da
        L3d9:
            return r14
        L3da:
            if (r6 != 0) goto L3e4
            long r12 = com.google.android.gms.internal.clearcut.l0.r(r14, r13)
            java.lang.Double.longBitsToDouble(r12)
            throw r7
        L3e4:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.O.l(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.j):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v38, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v39, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v40, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e7  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.clearcut.C0751j r34) throws com.google.android.gms.internal.clearcut.B {
        /*
            r28 = this;
            r0 = r28
            r2 = r29
            r1 = r30
            r4 = r32
            r13 = r34
            sun.misc.Unsafe r9 = com.google.android.gms.internal.clearcut.O.f10427o
            r10 = -1
            r16 = 0
            r3 = r31
            r8 = r10
            r5 = r16
            r11 = r5
        L15:
            int[] r6 = r0.f10428a
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 >= r4) goto L409
            int r5 = r3 + 1
            r3 = r1[r3]
            if (r3 >= 0) goto L28
            int r5 = com.google.android.gms.internal.clearcut.l0.d(r3, r1, r5, r13)
            int r3 = r13.f10516a
        L28:
            r12 = r3
            r3 = r5
            r5 = r6
            int r6 = r12 >>> 3
            r7 = r12 & 7
            int r14 = r0.w(r6)
            com.google.android.gms.internal.clearcut.b0 r15 = com.google.android.gms.internal.clearcut.C0739b0.f10493e
            if (r14 == r10) goto L3c4
            int r18 = r14 + 1
            r10 = r5[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r10 & r18
            int r1 = r18 >>> 20
            r31 = r3
            r3 = r10 & r17
            r18 = r12
            long r12 = (long) r3
            r3 = 17
            if (r1 > r3) goto L2eb
            int r3 = r14 + 2
            r3 = r5[r3]
            int r20 = r3 >>> 20
            r4 = 1
            int r20 = r4 << r20
            r3 = r3 & r17
            if (r3 == r8) goto L6f
            r22 = r10
            r10 = -1
            r23 = r4
            r19 = r5
            if (r8 == r10) goto L66
            long r4 = (long) r8
            r9.putInt(r2, r4, r11)
        L66:
            long r4 = (long) r3
            int r4 = r9.getInt(r2, r4)
            r11 = r3
            r24 = r4
            goto L79
        L6f:
            r23 = r4
            r19 = r5
            r22 = r10
            r10 = -1
            r24 = r11
            r11 = r8
        L79:
            r3 = 5
            switch(r1) {
                case 0: goto L2bc;
                case 1: goto L29a;
                case 2: goto L279;
                case 3: goto L279;
                case 4: goto L257;
                case 5: goto L225;
                case 6: goto L20d;
                case 7: goto L1e8;
                case 8: goto L1b6;
                case 9: goto L18e;
                case 10: goto L16f;
                case 11: goto L257;
                case 12: goto L118;
                case 13: goto L20d;
                case 14: goto L225;
                case 15: goto Lf1;
                case 16: goto Lc3;
                case 17: goto L88;
                default: goto L7d;
            }
        L7d:
            r8 = r30
            r12 = r31
            r13 = r34
        L83:
            r14 = r9
            r9 = r32
            goto L2dc
        L88:
            r1 = 3
            if (r7 != r1) goto L7d
            int r1 = r6 << 3
            r7 = r1 | 4
            com.google.android.gms.internal.clearcut.Z r3 = r0.s(r14)
            r4 = r30
            r5 = r31
            r6 = r32
            r8 = r34
            int r3 = i(r3, r4, r5, r6, r7, r8)
            r14 = r8
            r8 = r4
            r1 = r24 & r20
            if (r1 != 0) goto Lab
            java.lang.Object r1 = r14.f10518c
        La7:
            r9.putObject(r2, r12, r1)
            goto Lb6
        Lab:
            java.lang.Object r1 = r9.getObject(r2, r12)
            java.lang.Object r4 = r14.f10518c
            com.google.android.gms.internal.clearcut.x r1 = com.google.android.gms.internal.clearcut.AbstractC0765y.a(r1, r4)
            goto La7
        Lb6:
            r1 = r24 | r20
            r4 = r11
            r11 = r1
            r1 = r8
            r8 = r4
            r4 = r32
            r13 = r14
        Lbf:
            r5 = r18
            goto L15
        Lc3:
            r8 = r30
            r1 = r31
            r14 = r34
            if (r7 != 0) goto Lee
            int r7 = com.google.android.gms.internal.clearcut.l0.m(r8, r1, r14)
            long r3 = r14.f10517b
            long r5 = r3 >>> r23
            r21 = 1
            long r3 = r3 & r21
            long r3 = -r3
            long r5 = r5 ^ r3
            r1 = r9
            r3 = r12
            r1.putLong(r2, r3, r5)
            r4 = r1
            r1 = r24 | r20
            r3 = r11
            r11 = r1
            r1 = r8
            r8 = r3
            r9 = r4
            r3 = r7
        Le7:
            r13 = r14
            r5 = r18
            r4 = r32
            goto L15
        Lee:
            r12 = r1
            r13 = r14
            goto L83
        Lf1:
            r8 = r30
            r1 = r31
            r14 = r34
            r4 = r9
            if (r7 != 0) goto L111
            int r3 = com.google.android.gms.internal.clearcut.l0.f(r8, r1, r14)
            int r1 = r14.f10516a
            int r5 = r1 >>> 1
            r1 = r1 & 1
            int r1 = -r1
            r1 = r1 ^ r5
            r4.putInt(r2, r12, r1)
            r1 = r24 | r20
            r5 = r11
            r11 = r1
            r1 = r8
            r8 = r5
            r9 = r4
            goto Le7
        L111:
            r9 = r32
            r12 = r1
            r13 = r14
        L115:
            r14 = r4
            goto L2dc
        L118:
            r8 = r30
            r1 = r31
            r5 = r34
            r4 = r9
            r9 = r32
            if (r7 != 0) goto L16a
            int r3 = com.google.android.gms.internal.clearcut.l0.f(r8, r1, r5)
            int r1 = r5.f10516a
            com.google.android.gms.internal.clearcut.z r6 = r0.u(r14)
            if (r6 == 0) goto L135
            com.google.android.gms.internal.clearcut.p0 r6 = r6.e(r1)
            if (r6 == 0) goto L138
        L135:
            r6 = r18
            goto L15a
        L138:
            r6 = r2
            com.google.android.gms.internal.clearcut.x r6 = (com.google.android.gms.internal.clearcut.AbstractC0764x) r6
            com.google.android.gms.internal.clearcut.b0 r7 = r6.zzjp
            if (r7 != r15) goto L145
            com.google.android.gms.internal.clearcut.b0 r7 = com.google.android.gms.internal.clearcut.C0739b0.b()
            r6.zzjp = r7
        L145:
            long r12 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r6 = r18
            r7.a(r6, r1)
            r1 = r9
            r9 = r4
            r4 = r1
            r13 = r5
            r5 = r6
            r1 = r8
            r8 = r11
            r11 = r24
            goto L15
        L15a:
            r4.putInt(r2, r12, r1)
        L15d:
            r1 = r24 | r20
            r13 = r11
            r11 = r1
            r1 = r8
            r8 = r13
            r13 = r9
            r9 = r4
            r4 = r13
            r13 = r5
            r5 = r6
            goto L15
        L16a:
            r12 = r1
            r14 = r4
            r13 = r5
            goto L2dc
        L16f:
            r8 = r30
            r1 = r31
            r5 = r34
            r4 = r9
            r6 = r18
            r3 = 2
            r9 = r32
            if (r7 != r3) goto L187
            int r3 = com.google.android.gms.internal.clearcut.l0.s(r8, r1, r5)
        L181:
            java.lang.Object r1 = r5.f10518c
        L183:
            r4.putObject(r2, r12, r1)
            goto L15d
        L187:
            r12 = r1
            r14 = r4
            r13 = r5
            r18 = r6
            goto L2dc
        L18e:
            r8 = r30
            r1 = r31
            r5 = r34
            r4 = r9
            r6 = r18
            r3 = 2
            r9 = r32
            if (r7 != r3) goto L187
            com.google.android.gms.internal.clearcut.Z r3 = r0.s(r14)
            int r3 = j(r3, r8, r1, r9, r5)
            r1 = r24 & r20
            if (r1 != 0) goto L1ab
            java.lang.Object r1 = r5.f10518c
            goto L183
        L1ab:
            java.lang.Object r1 = r4.getObject(r2, r12)
            java.lang.Object r7 = r5.f10518c
            com.google.android.gms.internal.clearcut.x r1 = com.google.android.gms.internal.clearcut.AbstractC0765y.a(r1, r7)
            goto L183
        L1b6:
            r8 = r30
            r1 = r31
            r5 = r34
            r4 = r9
            r6 = r18
            r3 = 2
            r9 = r32
            if (r7 != r3) goto L187
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r22 & r3
            if (r3 != 0) goto L1e3
            int r1 = com.google.android.gms.internal.clearcut.l0.f(r8, r1, r5)
            int r3 = r5.f10516a
            if (r3 != 0) goto L1d7
            java.lang.String r3 = ""
            r5.f10518c = r3
            goto L1e1
        L1d7:
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r14 = com.google.android.gms.internal.clearcut.AbstractC0765y.f10579a
            r7.<init>(r8, r1, r3, r14)
            r5.f10518c = r7
            int r1 = r1 + r3
        L1e1:
            r3 = r1
            goto L181
        L1e3:
            int r1 = com.google.android.gms.internal.clearcut.l0.q(r8, r1, r5)
            goto L1e1
        L1e8:
            r8 = r30
            r1 = r31
            r5 = r34
            r4 = r9
            r6 = r18
            r9 = r32
            if (r7 != 0) goto L187
            int r3 = com.google.android.gms.internal.clearcut.l0.m(r8, r1, r5)
            long r14 = r5.f10517b
            r17 = 0
            int r1 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r1 == 0) goto L204
            r1 = r23
            goto L206
        L204:
            r1 = r16
        L206:
            com.google.android.gms.internal.clearcut.h0 r7 = com.google.android.gms.internal.clearcut.i0.f10512d
            r7.f(r2, r12, r1)
            goto L15d
        L20d:
            r8 = r30
            r1 = r31
            r5 = r34
            r4 = r9
            r6 = r18
            r9 = r32
            if (r7 != r3) goto L187
            int r3 = com.google.android.gms.internal.clearcut.l0.o(r1, r8)
            r4.putInt(r2, r12, r3)
            int r3 = r1 + 4
            goto L15d
        L225:
            r8 = r30
            r1 = r31
            r5 = r34
            r4 = r9
            r6 = r18
            r3 = r23
            r9 = r32
            if (r7 != r3) goto L251
            r18 = r6
            long r5 = com.google.android.gms.internal.clearcut.l0.r(r1, r8)
            r26 = r12
            r12 = r1
            r1 = r4
            r3 = r26
            r13 = r34
            r1.putLong(r2, r3, r5)
            int r3 = r12 + 8
            r4 = r24 | r20
            r5 = r9
            r9 = r1
            r1 = r8
            r8 = r11
            r11 = r4
            r4 = r5
            goto Lbf
        L251:
            r12 = r1
            r13 = r5
            r18 = r6
            goto L115
        L257:
            r8 = r30
            r1 = r9
            r3 = r12
            r12 = r31
            r9 = r32
            r13 = r34
            if (r7 != 0) goto L276
            int r5 = com.google.android.gms.internal.clearcut.l0.f(r8, r12, r13)
            int r6 = r13.f10516a
            r1.putInt(r2, r3, r6)
            r3 = r24 | r20
            r4 = r9
            r9 = r1
            r1 = r8
            r8 = r11
            r11 = r3
            r3 = r5
            goto Lbf
        L276:
            r14 = r1
            goto L2dc
        L279:
            r8 = r30
            r1 = r9
            r3 = r12
            r12 = r31
            r9 = r32
            r13 = r34
            if (r7 != 0) goto L276
            int r7 = com.google.android.gms.internal.clearcut.l0.m(r8, r12, r13)
            long r5 = r13.f10517b
            r1.putLong(r2, r3, r5)
            r14 = r1
            r1 = r24 | r20
            r3 = r11
            r11 = r1
            r1 = r8
            r8 = r3
            r3 = r7
        L296:
            r4 = r9
            r9 = r14
            goto Lbf
        L29a:
            r8 = r30
            r14 = r9
            r4 = r12
            r12 = r31
            r9 = r32
            r13 = r34
            if (r7 != r3) goto L2dc
            int r1 = com.google.android.gms.internal.clearcut.l0.o(r12, r8)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            com.google.android.gms.internal.clearcut.h0 r3 = com.google.android.gms.internal.clearcut.i0.f10512d
            r3.d(r2, r4, r1)
            int r3 = r12 + 4
        L2b5:
            r1 = r24 | r20
            r4 = r11
            r11 = r1
            r1 = r8
            r8 = r4
            goto L296
        L2bc:
            r8 = r30
            r14 = r9
            r4 = r12
            r3 = r23
            r12 = r31
            r9 = r32
            r13 = r34
            if (r7 != r3) goto L2dc
            long r6 = com.google.android.gms.internal.clearcut.l0.r(r12, r8)
            double r6 = java.lang.Double.longBitsToDouble(r6)
            com.google.android.gms.internal.clearcut.h0 r1 = com.google.android.gms.internal.clearcut.i0.f10512d
            r3 = r4
            r5 = r6
            r1.c(r2, r3, r5)
            int r3 = r12 + 8
            goto L2b5
        L2dc:
            r6 = r33
            r7 = r0
            r8 = r2
            r2 = r12
            r25 = r14
            r5 = r18
            r18 = r11
        L2e7:
            r11 = r24
            goto L3d4
        L2eb:
            r19 = r5
            r3 = r9
            r22 = r10
            r4 = r12
            r12 = r31
            r9 = r32
            r13 = r34
            r10 = 27
            if (r1 != r10) goto L34b
            r10 = 2
            if (r7 != r10) goto L33c
            java.lang.Object r1 = r3.getObject(r2, r4)
            com.google.android.gms.internal.clearcut.A r1 = (com.google.android.gms.internal.clearcut.A) r1
            r6 = r1
            com.google.android.gms.internal.clearcut.h r6 = (com.google.android.gms.internal.clearcut.AbstractC0749h) r6
            boolean r6 = r6.f10505q
            if (r6 != 0) goto L31d
            int r6 = r1.size()
            if (r6 != 0) goto L314
            r6 = 10
            goto L316
        L314:
            int r6 = r6 << 1
        L316:
            com.google.android.gms.internal.clearcut.A r1 = r1.n(r6)
            r3.putObject(r2, r4, r1)
        L31d:
            r6 = r1
            com.google.android.gms.internal.clearcut.Z r1 = r0.s(r14)
            r5 = r9
            r4 = r12
            r7 = r13
            r2 = r18
            r9 = r3
            r3 = r30
            int r1 = h(r1, r2, r3, r4, r5, r6, r7)
            r2 = r29
            r4 = r32
            r13 = r34
            r3 = r1
            r5 = r18
        L337:
            r10 = -1
            r1 = r30
            goto L15
        L33c:
            r9 = r3
            r7 = r0
            r25 = r9
            r24 = r11
            r3 = r12
            r5 = r18
            r18 = r8
            r8 = r29
            goto L3cf
        L34b:
            r9 = r3
            r3 = r12
            r2 = 49
            if (r1 > r2) goto L384
            r12 = r9
            r2 = r22
            long r9 = (long) r2
            r2 = r30
            r24 = r11
            r25 = r12
            r11 = r1
            r12 = r4
            r5 = r18
            r1 = r29
            r4 = r32
            r18 = r8
            r8 = r14
            r14 = r34
            int r6 = r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r6 != r3) goto L377
            r7 = r0
            r8 = r1
        L370:
            r2 = r6
            r11 = r24
            r6 = r33
            goto L3d4
        L377:
            r4 = r32
            r13 = r34
            r2 = r1
            r3 = r6
            r8 = r18
            r11 = r24
            r9 = r25
            goto L337
        L384:
            r25 = r9
            r24 = r11
            r12 = r14
            r2 = r22
            r9 = r1
            r10 = r4
            r5 = r18
            r1 = r29
            r18 = r8
            r4 = 50
            if (r9 != r4) goto L3a2
            r4 = 2
            if (r7 == r4) goto L39d
            r7 = r0
            r8 = r1
            goto L3cf
        L39d:
            r0.o(r12, r10, r1)
            r1 = 0
            throw r1
        L3a2:
            r4 = r32
            r13 = r34
            r8 = r2
            r2 = r30
            int r6 = r0.k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            r7 = r0
            r8 = r1
            if (r6 != r3) goto L3b2
            goto L370
        L3b2:
            r1 = r30
            r4 = r32
            r13 = r34
            r3 = r6
            r0 = r7
            r2 = r8
            r8 = r18
            r11 = r24
            r9 = r25
            r10 = -1
            goto L15
        L3c4:
            r7 = r0
            r19 = r5
            r18 = r8
            r25 = r9
            r24 = r11
            r5 = r12
            r8 = r2
        L3cf:
            r6 = r33
            r2 = r3
            goto L2e7
        L3d4:
            if (r5 != r6) goto L3e0
            if (r6 != 0) goto L3d9
            goto L3e0
        L3d9:
            r4 = r32
            r3 = r2
            r10 = -1
        L3dd:
            r0 = r18
            goto L416
        L3e0:
            r0 = r8
            com.google.android.gms.internal.clearcut.x r0 = (com.google.android.gms.internal.clearcut.AbstractC0764x) r0
            com.google.android.gms.internal.clearcut.b0 r1 = r0.zzjp
            if (r1 != r15) goto L3ed
            com.google.android.gms.internal.clearcut.b0 r1 = com.google.android.gms.internal.clearcut.C0739b0.b()
            r0.zzjp = r1
        L3ed:
            r3 = r32
            r4 = r1
            r0 = r5
            r1 = r30
            r5 = r34
            int r2 = com.google.android.gms.internal.clearcut.l0.c(r0, r1, r2, r3, r4, r5)
            r5 = r0
            r1 = r30
            r13 = r34
            r4 = r3
            r0 = r7
            r9 = r25
            r10 = -1
            r3 = r2
            r2 = r8
            r8 = r18
            goto L15
        L409:
            r7 = r0
            r19 = r6
            r18 = r8
            r25 = r9
            r24 = r11
            r6 = r33
            r8 = r2
            goto L3dd
        L416:
            if (r0 == r10) goto L41e
            long r0 = (long) r0
            r9 = r25
            r9.putInt(r8, r0, r11)
        L41e:
            int[] r0 = r7.i
            if (r0 == 0) goto L452
            int r1 = r0.length
            r2 = r16
        L425:
            if (r2 >= r1) goto L452
            r9 = r0[r2]
            r10 = r19[r9]
            int r10 = r7.v(r9)
            r10 = r10 & r17
            long r10 = (long) r10
            java.lang.Object r10 = com.google.android.gms.internal.clearcut.i0.k(r10, r8)
            if (r10 != 0) goto L439
            goto L43f
        L439:
            com.google.android.gms.internal.clearcut.z r11 = r7.u(r9)
            if (r11 != 0) goto L442
        L43f:
            int r2 = r2 + 1
            goto L425
        L442:
            com.google.android.gms.internal.clearcut.L r0 = r7.f10438n
            r0.getClass()
            com.google.android.gms.internal.clearcut.K r10 = (com.google.android.gms.internal.clearcut.K) r10
            r7.t(r9)
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L452:
            if (r6 != 0) goto L45c
            if (r3 != r4) goto L457
            goto L460
        L457:
            com.google.android.gms.internal.clearcut.B r0 = com.google.android.gms.internal.clearcut.B.b()
            throw r0
        L45c:
            if (r3 > r4) goto L461
            if (r5 != r6) goto L461
        L460:
            return r3
        L461:
            com.google.android.gms.internal.clearcut.B r0 = com.google.android.gms.internal.clearcut.B.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.O.m(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.j):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i, long j, Object obj) {
        K k7;
        Unsafe unsafe = f10427o;
        t(i);
        Object object = unsafe.getObject(obj, j);
        this.f10438n.getClass();
        if (!((K) object).f10424q) {
            K k8 = K.f10423r;
            if (k8.isEmpty()) {
                k7 = new K();
            } else {
                K k9 = new K(k8);
                k9.f10424q = true;
                k7 = k9;
            }
            L.a(k7, object);
            unsafe.putObject(obj, j, k7);
        }
        throw new NoSuchMethodError();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(int i, Object obj, Object obj2) {
        long jV = v(i) & 1048575;
        if (r(i, obj2)) {
            Object objK = i0.k(jV, obj);
            Object objK2 = i0.k(jV, obj2);
            if (objK != null && objK2 != null) {
                objK2 = AbstractC0765y.a(objK, objK2);
            } else if (objK2 == null) {
                return;
            }
            i0.c(jV, obj, objK2);
            x(i, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean q(int i, int i7, Object obj) {
        return i0.f10512d.g((long) (this.f10428a[i7 + 2] & 1048575), obj) == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean r(int i, Object obj) {
        if (this.f10433g) {
            int iV = v(i);
            long j = iV & 1048575;
            switch ((iV & 267386880) >>> 20) {
                case 0:
                    if (i0.f10512d.k(j, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (i0.f10512d.j(j, obj) == 0.0f) {
                        return false;
                    }
                    break;
                case 2:
                    if (i0.f10512d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (i0.f10512d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (i0.f10512d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (i0.f10512d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (i0.f10512d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return i0.f10512d.i(j, obj);
                case 8:
                    Object objK = i0.k(j, obj);
                    if (objK instanceof String) {
                        if (((String) objK).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objK instanceof C0754m)) {
                            throw new IllegalArgumentException();
                        }
                        if (C0754m.f10530s.equals(objK)) {
                            return false;
                        }
                    }
                case 9:
                    if (i0.k(j, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C0754m.f10530s.equals(i0.k(j, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (i0.f10512d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (i0.f10512d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (i0.f10512d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (i0.f10512d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (i0.f10512d.g(j, obj) == 0) {
                        return false;
                    }
                    break;
                case WorkDatabaseVersions.VERSION_16 /* 16 */:
                    if (i0.f10512d.h(j, obj) == 0) {
                        return false;
                    }
                    break;
                case WorkDatabaseVersions.VERSION_17 /* 17 */:
                    if (i0.k(j, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((i0.f10512d.g(r6 & 1048575, obj) & (1 << (this.f10428a[i + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Z s(int i) {
        int i7 = (i / 4) << 1;
        Object[] objArr = this.f10429b;
        Z z5 = (Z) objArr[i7];
        if (z5 != null) {
            return z5;
        }
        Z zA = V.f10444c.a((Class) objArr[i7 + 1]);
        objArr[i7] = zA;
        return zA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object t(int i) {
        return this.f10429b[(i / 4) << 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0766z u(int i) {
        return (InterfaceC0766z) this.f10429b[((i / 4) << 1) + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int v(int i) {
        return this.f10428a[i + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int w(int i) {
        int i7 = this.f10430c;
        if (i >= i7) {
            int[] iArr = this.f10428a;
            int i8 = this.f10432e;
            if (i < i8) {
                int i9 = (i - i7) << 2;
                if (iArr[i9] == i) {
                    return i9;
                }
                return -1;
            }
            if (i <= this.f10431d) {
                int i10 = i8 - i7;
                int length = (iArr.length / 4) - 1;
                while (i10 <= length) {
                    int i11 = (length + i10) >>> 1;
                    int i12 = i11 << 2;
                    int i13 = iArr[i12];
                    if (i == i13) {
                        return i12;
                    }
                    if (i < i13) {
                        length = i11 - 1;
                    } else {
                        i10 = i11 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(int i, Object obj) {
        if (this.f10433g) {
            return;
        }
        int i7 = this.f10428a[i + 2];
        long j = i7 & 1048575;
        i0.b(i0.f10512d.g(j, obj) | (1 << (i7 >>> 20)), j, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(int i, Object obj, Object obj2) {
        int i7;
        int iV = v(i);
        int[] iArr = this.f10428a;
        int i8 = iArr[i];
        long j = iV & 1048575;
        if (q(i8, i, obj2)) {
            Object objK = i0.k(j, obj);
            Object objK2 = i0.k(j, obj2);
            if (objK != null && objK2 != null) {
                i0.c(j, obj, AbstractC0765y.a(objK, objK2));
                i7 = iArr[i + 2];
            } else {
                if (objK2 == null) {
                    return;
                }
                i0.c(j, obj, objK2);
                i7 = iArr[i + 2];
            }
            i0.b(i8, i7 & 1048575, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean z(AbstractC0764x abstractC0764x, Object obj, int i) {
        return r(i, abstractC0764x) == r(i, obj);
    }
}
