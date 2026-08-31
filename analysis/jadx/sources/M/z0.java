package M;

import P.C0363k;
import P.C0371o;
import P.C0372o0;
import z0.AbstractC1938O;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3690a = 16;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(c0.InterfaceC0725m r20, B5.e r21, B5.e r22, B5.e r23, B5.e r24, int r25, long r26, long r28, A.W r30, X.e r31, P.C0371o r32, int r33, int r34) {
        /*
            r1 = r20
            r11 = r32
            r0 = r33
            r2 = -1219521777(0xffffffffb74f930f, float:-1.2372401E-5)
            r11.U(r2)
            boolean r2 = r11.g(r1)
            r3 = 2
            if (r2 == 0) goto L15
            r2 = 4
            goto L16
        L15:
            r2 = r3
        L16:
            r2 = r2 | r0
            r4 = r34 & 2
            if (r4 == 0) goto L20
            r2 = r2 | 48
        L1d:
            r5 = r21
            goto L32
        L20:
            r5 = r0 & 48
            if (r5 != 0) goto L1d
            r5 = r21
            boolean r6 = r11.i(r5)
            if (r6 == 0) goto L2f
            r6 = 32
            goto L31
        L2f:
            r6 = 16
        L31:
            r2 = r2 | r6
        L32:
            r6 = r34 & 4
            if (r6 == 0) goto L3b
            r2 = r2 | 384(0x180, float:5.38E-43)
        L38:
            r7 = r22
            goto L4d
        L3b:
            r7 = r0 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L38
            r7 = r22
            boolean r8 = r11.i(r7)
            if (r8 == 0) goto L4a
            r8 = 256(0x100, float:3.59E-43)
            goto L4c
        L4a:
            r8 = 128(0x80, float:1.794E-43)
        L4c:
            r2 = r2 | r8
        L4d:
            r8 = 38497280(0x24b6c00, float:1.4945079E-37)
            r2 = r2 | r8
            r8 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r2 & r8
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r8) goto L74
            boolean r2 = r11.x()
            if (r2 != 0) goto L61
            goto L74
        L61:
            r11.N()
            r4 = r23
            r6 = r25
            r9 = r28
            r11 = r30
            r2 = r5
            r3 = r7
            r5 = r24
            r7 = r26
            goto L142
        L74:
            r11.P()
            r2 = r0 & 1
            if (r2 == 0) goto L94
            boolean r2 = r11.w()
            if (r2 == 0) goto L82
            goto L94
        L82:
            r11.N()
            r6 = r24
            r3 = r25
            r9 = r28
            r14 = r30
            r2 = r5
            r4 = r7
            r5 = r23
            r7 = r26
            goto Lbb
        L94:
            if (r4 == 0) goto L99
            X.e r2 = M.AbstractC0227p.f3590a
            goto L9a
        L99:
            r2 = r5
        L9a:
            if (r6 == 0) goto L9f
            X.e r4 = M.AbstractC0227p.f3591b
            goto La0
        L9f:
            r4 = r7
        La0:
            X.e r5 = M.AbstractC0227p.f3592c
            X.e r6 = M.AbstractC0227p.f3593d
            P.T0 r7 = M.AbstractC0217k.f3553a
            java.lang.Object r7 = r11.k(r7)
            M.i r7 = (M.C0213i) r7
            long r7 = r7.f3522n
            long r9 = M.AbstractC0217k.b(r7, r11)
            java.util.WeakHashMap r12 = A.Z.f60v
            A.Z r12 = A.C0005b.e(r11)
            A.a r12 = r12.f66g
            r14 = r12
        Lbb:
            r11.q()
            boolean r12 = r11.g(r14)
            java.lang.Object r13 = r11.H()
            P.S r15 = P.C0363k.f5418a
            if (r12 != 0) goto Lcc
            if (r13 != r15) goto Ld4
        Lcc:
            N.z r13 = new N.z
            r13.<init>(r14)
            r11.d0(r13)
        Ld4:
            N.z r13 = (N.z) r13
            boolean r12 = r11.g(r13)
            boolean r16 = r11.g(r14)
            r12 = r12 | r16
            java.lang.Object r0 = r11.H()
            if (r12 != 0) goto Le8
            if (r0 != r15) goto Lf2
        Le8:
            A.Y r0 = new A.Y
            r12 = 13
            r0.<init>(r12, r13, r14)
            r11.d0(r0)
        Lf2:
            B5.c r0 = (B5.c) r0
            A0.h r12 = A.c0.f89a
            A.b0 r12 = new A.b0
            r15 = 0
            r12.<init>(r15, r0)
            c0.m r0 = c0.AbstractC0727o.a(r1, r12)
            M.v0 r12 = new M.v0
            r24 = r31
            r23 = r2
            r22 = r3
            r28 = r4
            r25 = r5
            r26 = r6
            r21 = r12
            r27 = r13
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            r2 = r21
            r19 = r22
            r15 = r23
            r17 = r25
            r18 = r26
            r16 = r28
            r3 = -1979205334(0xffffffff8a07b92a, float:-6.534839E-33)
            X.e r2 = X.k.d(r3, r2, r11)
            r12 = 12582912(0xc00000, float:1.7632415E-38)
            r13 = 114(0x72, float:1.6E-43)
            r3 = 0
            r4 = r7
            r8 = 0
            r6 = r9
            r9 = 0
            r10 = r2
            r2 = r0
            M.L0.a(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            r9 = r6
            r11 = r14
            r2 = r15
            r3 = r16
            r6 = r19
            r7 = r4
            r4 = r17
            r5 = r18
        L142:
            P.o0 r15 = r32.r()
            if (r15 == 0) goto L155
            M.w0 r0 = new M.w0
            r12 = r31
            r13 = r33
            r14 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r15.f5482d = r0
        L155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M.z0.a(c0.m, B5.e, B5.e, B5.e, B5.e, int, long, long, A.W, X.e, P.o, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(int i, B5.e eVar, X.e eVar2, B5.e eVar3, B5.e eVar4, A.W w3, B5.e eVar5, C0371o c0371o, int i7) {
        int i8;
        X.e eVar6;
        A.W w6;
        B5.e eVar7;
        c0371o.U(-975511942);
        if ((i7 & 6) == 0) {
            i8 = (c0371o.e(i) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0371o.i(eVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            eVar6 = eVar2;
            i8 |= c0371o.i(eVar6) ? 256 : 128;
        } else {
            eVar6 = eVar2;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0371o.i(eVar3) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0371o.i(eVar4) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            w6 = w3;
            i8 |= c0371o.g(w6) ? 131072 : 65536;
        } else {
            w6 = w3;
        }
        if ((1572864 & i7) == 0) {
            eVar7 = eVar5;
            i8 |= c0371o.i(eVar7) ? 1048576 : 524288;
        } else {
            eVar7 = eVar5;
        }
        if ((i8 & 599187) == 599186 && c0371o.x()) {
            c0371o.N();
        } else {
            boolean z5 = ((i8 & 112) == 32) | ((i8 & 7168) == 2048) | ((458752 & i8) == 131072) | ((57344 & i8) == 16384) | ((i8 & 14) == 4) | ((3670016 & i8) == 1048576) | ((i8 & 896) == 256);
            Object objH = c0371o.H();
            if (z5 || objH == C0363k.f5418a) {
                v0 v0Var = new v0(eVar, eVar3, eVar4, i, w6, eVar7, eVar6);
                c0371o.d0(v0Var);
                objH = v0Var;
            }
            AbstractC1938O.a(null, (B5.e) objH, c0371o, 0);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new y0(i, eVar, eVar2, eVar3, eVar4, w3, eVar5, i7);
        }
    }
}
