package M;

import P.AbstractC0366l0;
import P.C0345b;
import P.C0371o;
import P.C0372o0;
import P.C0389z;

/* JADX INFO: loaded from: classes.dex */
public abstract class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0389z f3359a = new C0389z(C0215j.f3539C);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(L0.F f, X.e eVar, C0371o c0371o, int i) {
        c0371o.U(-460300127);
        int i7 = (c0371o.g(f) ? 4 : 2) | i | (c0371o.i(eVar) ? 32 : 16);
        if ((i7 & 19) == 18 && c0371o.x()) {
            c0371o.N();
        } else {
            AbstractC0366l0 abstractC0366l0 = f3359a;
            L0.F f7 = (L0.F) c0371o.k(abstractC0366l0);
            f7.getClass();
            if (f != null && !f.equals(L0.F.f3090d)) {
                f7 = new L0.F(f7.f3091a.c(f.f3091a), f7.f3092b.a(f.f3092b));
            }
            C0345b.a(abstractC0366l0.a(f7), eVar, c0371o, (i7 & 112) | 8);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new B0.j0(i, 8, f, eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r29, c0.InterfaceC0725m r30, long r31, long r33, O0.j r35, long r36, V0.k r38, long r39, int r41, boolean r42, int r43, int r44, L0.F r45, P.C0371o r46, int r47, int r48, int r49) {
        /*
            r0 = r46
            r1 = r47
            r2 = r48
            r3 = r49
            r4 = -2055108902(0xffffffff858186da, float:-1.2180638E-35)
            r0.U(r4)
            r4 = r1 & 6
            if (r4 != 0) goto L1f
            r4 = r29
            boolean r7 = r0.g(r4)
            if (r7 == 0) goto L1c
            r7 = 4
            goto L1d
        L1c:
            r7 = 2
        L1d:
            r7 = r7 | r1
            goto L22
        L1f:
            r4 = r29
            r7 = r1
        L22:
            r8 = r3 & 2
            if (r8 == 0) goto L2b
            r7 = r7 | 48
        L28:
            r9 = r30
            goto L3d
        L2b:
            r9 = r1 & 48
            if (r9 != 0) goto L28
            r9 = r30
            boolean r10 = r0.g(r9)
            if (r10 == 0) goto L3a
            r10 = 32
            goto L3c
        L3a:
            r10 = 16
        L3c:
            r7 = r7 | r10
        L3d:
            r10 = r3 & 4
            if (r10 == 0) goto L46
            r7 = r7 | 384(0x180, float:5.38E-43)
        L43:
            r11 = r31
            goto L58
        L46:
            r11 = r1 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L43
            r11 = r31
            boolean r13 = r0.f(r11)
            if (r13 == 0) goto L55
            r13 = 256(0x100, float:3.59E-43)
            goto L57
        L55:
            r13 = 128(0x80, float:1.794E-43)
        L57:
            r7 = r7 | r13
        L58:
            r13 = r3 & 8
            if (r13 == 0) goto L62
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            r5 = r7
            r6 = r33
            goto L79
        L62:
            r5 = r1 & 3072(0xc00, float:4.305E-42)
            r17 = r7
            r6 = r33
            if (r5 != 0) goto L77
            boolean r18 = r0.f(r6)
            if (r18 == 0) goto L73
            r18 = 2048(0x800, float:2.87E-42)
            goto L75
        L73:
            r18 = 1024(0x400, float:1.435E-42)
        L75:
            r17 = r17 | r18
        L77:
            r5 = r17
        L79:
            r14 = r5 | 24576(0x6000, float:3.4438E-41)
            r19 = r3 & 32
            r20 = 221184(0x36000, float:3.09945E-40)
            r21 = 65536(0x10000, float:9.18355E-41)
            if (r19 == 0) goto L89
            r14 = r5 | r20
        L86:
            r5 = r35
            goto L9d
        L89:
            r5 = 196608(0x30000, float:2.75506E-40)
            r5 = r5 & r1
            if (r5 != 0) goto L86
            r5 = r35
            boolean r22 = r0.g(r5)
            if (r22 == 0) goto L99
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L9b
        L99:
            r22 = r21
        L9b:
            r14 = r14 | r22
        L9d:
            r22 = 114819072(0x6d80000, float:8.125017E-35)
            r22 = r14 | r22
            r15 = r3 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto Lac
            r22 = 920125440(0x36d80000, float:6.4373016E-6)
            r22 = r14 | r22
        La9:
            r14 = r38
            goto Lc0
        Lac:
            r14 = 805306368(0x30000000, float:4.656613E-10)
            r14 = r14 & r1
            if (r14 != 0) goto La9
            r14 = r38
            boolean r24 = r0.g(r14)
            if (r24 == 0) goto Lbc
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lbe
        Lbc:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        Lbe:
            r22 = r22 | r24
        Lc0:
            r1 = r3 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto Lcd
            r16 = r2 | 6
            r4 = r39
        Lc8:
            r18 = r1
            r1 = r16
            goto Ldd
        Lcd:
            r4 = r39
            boolean r24 = r0.f(r4)
            if (r24 == 0) goto Ld8
            r16 = 4
            goto Lda
        Ld8:
            r16 = 2
        Lda:
            r16 = r2 | r16
            goto Lc8
        Ldd:
            r4 = r1 | 432(0x1b0, float:6.05E-43)
            r5 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto Le8
            r4 = r1 | 3504(0xdb0, float:4.91E-42)
        Le5:
            r1 = r43
            goto Lfb
        Le8:
            r1 = r2 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto Le5
            r1 = r43
            boolean r16 = r0.e(r1)
            if (r16 == 0) goto Lf7
            r17 = 2048(0x800, float:2.87E-42)
            goto Lf9
        Lf7:
            r17 = 1024(0x400, float:1.435E-42)
        Lf9:
            r4 = r4 | r17
        Lfb:
            r4 = r4 | r20
            r16 = 1572864(0x180000, float:2.204052E-39)
            r16 = r2 & r16
            if (r16 != 0) goto L117
            r16 = r3 & r21
            r1 = r45
            if (r16 != 0) goto L112
            boolean r16 = r0.g(r1)
            if (r16 == 0) goto L112
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L114
        L112:
            r16 = 524288(0x80000, float:7.34684E-40)
        L114:
            r4 = r4 | r16
            goto L119
        L117:
            r1 = r45
        L119:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r22 & r16
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r2) goto L14c
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r4
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r2) goto L14c
            boolean r1 = r0.x()
            if (r1 != 0) goto L133
            goto L14c
        L133:
            r0.N()
            r13 = r41
            r15 = r43
            r16 = r44
            r17 = r45
            r5 = r6
            r2 = r9
            r3 = r11
            r10 = r14
            r7 = r35
            r8 = r36
            r11 = r39
            r14 = r42
            goto L24f
        L14c:
            r0.P()
            r1 = r47 & 1
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r1 == 0) goto L178
            boolean r1 = r0.w()
            if (r1 == 0) goto L15d
            goto L178
        L15d:
            r0.N()
            r1 = r3 & r21
            if (r1 == 0) goto L165
            r4 = r4 & r2
        L165:
            r16 = r36
            r18 = r39
            r10 = r41
            r2 = r42
            r5 = r43
            r8 = r45
            r13 = r4
            r1 = r9
            r9 = r35
            r4 = r44
            goto L1b7
        L178:
            if (r8 == 0) goto L17d
            c0.j r1 = c0.C0722j.f10095q
            goto L17e
        L17d:
            r1 = r9
        L17e:
            if (r10 == 0) goto L183
            long r8 = j0.o.f13722g
            r11 = r8
        L183:
            if (r13 == 0) goto L187
            long r6 = W0.n.f8027c
        L187:
            r8 = 0
            if (r19 == 0) goto L18c
            r9 = r8
            goto L18e
        L18c:
            r9 = r35
        L18e:
            long r16 = W0.n.f8027c
            if (r15 == 0) goto L193
            r14 = r8
        L193:
            if (r18 == 0) goto L198
            r18 = r16
            goto L19a
        L198:
            r18 = r39
        L19a:
            if (r5 == 0) goto L1a0
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L1a2
        L1a0:
            r5 = r43
        L1a2:
            r8 = r3 & r21
            r10 = 1
            if (r8 == 0) goto L1b4
            P.z r8 = M.N0.f3359a
            java.lang.Object r8 = r0.k(r8)
            L0.F r8 = (L0.F) r8
            r4 = r4 & r2
        L1b0:
            r13 = r4
            r2 = r10
            r4 = r2
            goto L1b7
        L1b4:
            r8 = r45
            goto L1b0
        L1b7:
            r0.q()
            r15 = -1827892941(0xffffffff930c9133, float:-1.7742073E-27)
            r0.S(r15)
            r20 = 16
            int r15 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            r42 = r1
            r1 = 0
            if (r15 == 0) goto L1ce
            r43 = r2
            r23 = r11
            goto L1f0
        L1ce:
            r15 = -1827892168(0xffffffff930c9438, float:-1.7743562E-27)
            r0.S(r15)
            long r23 = r8.b()
            int r15 = (r23 > r20 ? 1 : (r23 == r20 ? 0 : -1))
            if (r15 == 0) goto L1df
            r43 = r2
            goto L1ed
        L1df:
            P.z r15 = M.AbstractC0229q.f3601a
            java.lang.Object r15 = r0.k(r15)
            j0.o r15 = (j0.o) r15
            r43 = r2
            long r2 = r15.f13724a
            r23 = r2
        L1ed:
            r0.p(r1)
        L1f0:
            r0.p(r1)
            if (r14 == 0) goto L1f8
            int r1 = r14.f7936a
            goto L1fa
        L1f8:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L1fa:
            r2 = 16609104(0xfd6f50, float:2.3274312E-38)
            r38 = r1
            r41 = r2
            r33 = r6
            r30 = r8
            r35 = r9
            r36 = r16
            r39 = r18
            r31 = r23
            L0.F r1 = L0.F.c(r30, r31, r33, r35, r36, r38, r39, r41)
            r2 = r22 & 126(0x7e, float:1.77E-43)
            int r3 = r13 << 9
            r13 = 224256(0x36c00, float:3.1425E-40)
            r2 = r2 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r13
            r2 = r2 | r3
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 | r3
            r30 = r29
            r31 = r42
            r34 = r43
            r37 = r0
            r32 = r1
            r38 = r2
            r36 = r4
            r35 = r5
            r33 = r10
            D5.a.b(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1 = r31
            r0 = r34
            r2 = r36
            r15 = r5
            r5 = r6
            r7 = r9
            r13 = r10
            r3 = r11
            r10 = r14
            r11 = r18
            r14 = r0
            r26 = r2
            r2 = r1
            r27 = r16
            r16 = r26
            r17 = r8
            r8 = r27
        L24f:
            P.o0 r0 = r46.r()
            if (r0 == 0) goto L269
            r1 = r0
            M.M0 r0 = new M.M0
            r18 = r47
            r19 = r48
            r20 = r49
            r25 = r1
            r1 = r29
            r0.<init>(r1, r2, r3, r5, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r25
            r1.f5482d = r0
        L269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M.N0.b(java.lang.String, c0.m, long, long, O0.j, long, V0.k, long, int, boolean, int, int, L0.F, P.o, int, int, int):void");
    }
}
