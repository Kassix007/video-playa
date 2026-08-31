package M;

import B0.C0050o;
import M5.InterfaceC0261w;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.S0;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c0.C0714b;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.wnapp.smspariaz.R;
import i0.C1133e;
import j0.AbstractC1145B;
import n5.AbstractC1397A;
import t.C1611j;
import u.AbstractC1644d;
import u.AbstractC1650g;
import u.C1642c;
import u.C1648f;
import u.C1649f0;
import u.InterfaceC1669x;
import u0.InterfaceC1672a;
import v0.C1737f;
import v0.C1751t;

/* JADX INFO: renamed from: M.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0210g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f3487a = 48;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f3488b = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f3489c = AbstractC1145B.g(0.5f, 0.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(B5.a r30, c0.InterfaceC0725m r31, M.I0 r32, float r33, j0.E r34, long r35, long r37, float r39, long r40, B5.e r42, B5.e r43, M.C0212h0 r44, X.e r45, P.C0371o r46, int r47, int r48) {
        /*
            r1 = r30
            r3 = r32
            r0 = r46
            r2 = r48
            r4 = 2132719801(0x7f1eb8b9, float:2.1097716E38)
            r0.U(r4)
            boolean r4 = r0.i(r1)
            r5 = 2
            if (r4 == 0) goto L17
            r4 = 4
            goto L18
        L17:
            r4 = r5
        L18:
            r4 = r47 | r4
            r4 = r4 | 48
            boolean r7 = r0.g(r3)
            if (r7 == 0) goto L25
            r7 = 256(0x100, float:3.59E-43)
            goto L27
        L25:
            r7 = 128(0x80, float:1.794E-43)
        L27:
            r4 = r4 | r7
            r4 = r4 | 11264(0x2c00, float:1.5784E-41)
            r7 = r2 & 32
            r9 = r35
            if (r7 != 0) goto L39
            boolean r7 = r0.f(r9)
            if (r7 == 0) goto L39
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L3b
        L39:
            r7 = 65536(0x10000, float:9.18355E-41)
        L3b:
            r4 = r4 | r7
            r7 = 13107200(0xc80000, float:1.8367099E-38)
            r4 = r4 | r7
            r7 = 100663296(0x6000000, float:2.4074124E-35)
            r7 = r47 & r7
            if (r7 != 0) goto L58
            r7 = r2 & 256(0x100, float:3.59E-43)
            r11 = r40
            if (r7 != 0) goto L54
            boolean r7 = r0.f(r11)
            if (r7 == 0) goto L54
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            goto L56
        L54:
            r7 = 33554432(0x2000000, float:9.403955E-38)
        L56:
            r4 = r4 | r7
            goto L5a
        L58:
            r11 = r40
        L5a:
            r7 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 | r7
            r7 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r7 & r4
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r13) goto L83
            boolean r7 = r0.x()
            if (r7 != 0) goto L6d
            goto L83
        L6d:
            r0.N()
            r2 = r31
            r4 = r33
            r5 = r34
            r13 = r42
            r14 = r43
            r15 = r44
            r6 = r9
            r8 = r37
            r10 = r39
            goto L2ae
        L83:
            r0.P()
            r7 = r47 & 1
            r13 = -238551041(0xfffffffff1c7ffff, float:-1.9807039E30)
            r14 = -3670017(0xffffffffffc7ffff, float:NaN)
            r15 = -516097(0xfffffffffff81fff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            r6 = 0
            if (r7 == 0) goto Lc5
            boolean r7 = r0.w()
            if (r7 == 0) goto L9e
            goto Lc5
        L9e:
            r0.N()
            r5 = r4 & r16
            r7 = r2 & 32
            if (r7 == 0) goto La9
            r5 = r4 & r15
        La9:
            r4 = r5 & r14
            r7 = r2 & 256(0x100, float:3.59E-43)
            if (r7 == 0) goto Lb1
            r4 = r5 & r13
        Lb1:
            r20 = r31
            r13 = r37
            r15 = r39
            r16 = r42
            r7 = r43
            r19 = r44
            r8 = r4
            r4 = r11
            r11 = r9
            r9 = r33
            r10 = r34
            goto L111
        Lc5:
            float r7 = M.C0201c.f3441b
            M.c r18 = M.C0201c.f3440a
            float r18 = O.k.f4180a
            j0.E r5 = M.D0.a(r5, r0)
            r16 = r4 & r16
            r18 = r2 & 32
            if (r18 == 0) goto Ldd
            r9 = 40
            long r9 = M.AbstractC0217k.e(r9, r0)
            r16 = r4 & r15
        Ldd:
            long r18 = M.AbstractC0217k.b(r9, r0)
            r4 = r16 & r14
            float r14 = (float) r6
            r15 = r2 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto Lf7
            r4 = 30
            long r11 = M.AbstractC0217k.e(r4, r0)
            r4 = 1050924810(0x3ea3d70a, float:0.32)
            long r11 = j0.o.b(r11, r4)
            r4 = r16 & r13
        Lf7:
            X.e r13 = M.AbstractC0223n.f3580a
            M.m r15 = M.C0221m.f3576y
            M.h0 r16 = M.C.f3287a
            c0.j r20 = c0.C0722j.f10095q
            r8 = r4
            r28 = r9
            r10 = r5
            r9 = r7
            r4 = r11
            r7 = r15
            r11 = r28
            r15 = r14
            r28 = r16
            r16 = r13
            r13 = r18
            r19 = r28
        L111:
            r0.q()
            java.lang.Object r6 = r0.H()
            P.S r2 = P.C0363k.f5418a
            if (r6 != r2) goto L12c
            M5.w r6 = P.C0345b.k(r0)
            r39 = r4
            P.x r4 = new P.x
            r4.<init>(r6)
            r0.d0(r4)
            r6 = r4
            goto L12e
        L12c:
            r39 = r4
        L12e:
            P.x r6 = (P.C0387x) r6
            M5.w r6 = r6.f5575q
            r4 = r8 & 896(0x380, float:1.256E-42)
            r4 = r4 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r4 <= r5) goto L144
            boolean r18 = r0.g(r3)
            if (r18 != 0) goto L141
            goto L144
        L141:
            r41 = r7
            goto L14a
        L144:
            r41 = r7
            r7 = r8 & 384(0x180, float:5.38E-43)
            if (r7 != r5) goto L14c
        L14a:
            r5 = 1
            goto L14d
        L14c:
            r5 = 0
        L14d:
            boolean r7 = r0.i(r6)
            r5 = r5 | r7
            r7 = r8 & 14
            r33 = r5
            r5 = 4
            if (r7 != r5) goto L15c
            r17 = 1
            goto L15e
        L15c:
            r17 = 0
        L15e:
            r17 = r33 | r17
            java.lang.Object r5 = r0.H()
            if (r17 != 0) goto L16c
            if (r5 != r2) goto L169
            goto L16c
        L169:
            r42 = r9
            goto L177
        L16c:
            C.k r5 = new C.k
            r42 = r9
            r9 = 4
            r5.<init>(r3, r6, r1, r9)
            r0.d0(r5)
        L177:
            B5.a r5 = (B5.a) r5
            boolean r9 = r0.i(r6)
            r43 = r5
            r5 = 256(0x100, float:3.59E-43)
            if (r4 <= r5) goto L18d
            boolean r18 = r0.g(r3)
            if (r18 != 0) goto L18a
            goto L18d
        L18a:
            r33 = r9
            goto L193
        L18d:
            r33 = r9
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != r5) goto L195
        L193:
            r5 = 1
            goto L196
        L195:
            r5 = 0
        L196:
            r5 = r33 | r5
            r9 = 4
            if (r7 != r9) goto L19d
            r9 = 1
            goto L19e
        L19d:
            r9 = 0
        L19e:
            r5 = r5 | r9
            java.lang.Object r9 = r0.H()
            if (r5 != 0) goto L1aa
            if (r9 != r2) goto L1a8
            goto L1aa
        L1a8:
            r5 = 1
            goto L1b3
        L1aa:
            A.J r9 = new A.J
            r5 = 1
            r9.<init>(r6, r3, r1, r5)
            r0.d0(r9)
        L1b3:
            B5.c r9 = (B5.c) r9
            java.lang.Object r5 = r0.H()
            if (r5 != r2) goto L1d7
            u.c r5 = new u.c
            r22 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r22)
            r44 = r9
            Z.m r9 = u.A0.f16746a
            r22 = 1008981770(0x3c23d70a, float:0.01)
            r23 = r10
            java.lang.Float r10 = java.lang.Float.valueOf(r22)
            r5.<init>(r1, r9, r10)
            r0.d0(r5)
            goto L1db
        L1d7:
            r44 = r9
            r23 = r10
        L1db:
            u.c r5 = (u.C1642c) r5
            r1 = 256(0x100, float:3.59E-43)
            if (r4 <= r1) goto L1e7
            boolean r9 = r0.g(r3)
            if (r9 != 0) goto L1eb
        L1e7:
            r9 = r8 & 384(0x180, float:5.38E-43)
            if (r9 != r1) goto L1ed
        L1eb:
            r9 = 1
            goto L1ee
        L1ed:
            r9 = 0
        L1ee:
            boolean r10 = r0.i(r6)
            r9 = r9 | r10
            boolean r10 = r0.i(r5)
            r9 = r9 | r10
            r10 = 4
            if (r7 != r10) goto L1fd
            r7 = 1
            goto L1fe
        L1fd:
            r7 = 0
        L1fe:
            r7 = r7 | r9
            java.lang.Object r9 = r0.H()
            if (r7 != 0) goto L207
            if (r9 != r2) goto L21e
        L207:
            M.S r7 = new M.S
            r9 = 0
            r37 = r30
            r34 = r3
            r36 = r5
            r35 = r6
            r33 = r7
            r38 = r9
            r33.<init>(r34, r35, r36, r37, r38)
            r9 = r33
            r0.d0(r9)
        L21e:
            r22 = r9
            B5.a r22 = (B5.a) r22
            M.T r0 = new M.T
            r17 = r41
            r9 = r42
            r3 = r43
            r7 = r44
            r18 = r45
            r26 = r2
            r25 = r4
            r24 = r8
            r8 = r20
            r10 = r23
            r20 = 1
            r21 = 0
            r4 = r32
            r1 = r39
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18)
            r3 = r4
            r4 = -314673510(0xffffffffed3e769a, float:-3.6840958E27)
            r6 = r46
            X.e r0 = X.k.d(r4, r0, r6)
            r4 = 3632(0xe30, float:5.09E-42)
            r36 = r0
            r38 = r4
            r35 = r5
            r37 = r6
            r34 = r19
            r33 = r22
            M.s0.d(r33, r34, r35, r36, r37, r38)
            r4 = r34
            r0 = r37
            N.r r5 = r3.f3322c
            N.y r5 = r5.d()
            M.J0 r6 = M.J0.f3324r
            java.util.Map r5 = r5.f3997a
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L2a1
            r5 = r25
            r6 = 256(0x100, float:3.59E-43)
            if (r5 <= r6) goto L27e
            boolean r5 = r0.g(r3)
            if (r5 != 0) goto L284
        L27e:
            r5 = r24
            r5 = r5 & 384(0x180, float:5.38E-43)
            if (r5 != r6) goto L287
        L284:
            r6 = r20
            goto L289
        L287:
            r6 = r21
        L289:
            java.lang.Object r5 = r0.H()
            if (r6 != 0) goto L293
            r6 = r26
            if (r5 != r6) goto L29c
        L293:
            M.U r5 = new M.U
            r6 = 0
            r5.<init>(r3, r6)
            r0.d0(r5)
        L29c:
            B5.e r5 = (B5.e) r5
            P.C0345b.e(r5, r0, r3)
        L2a1:
            r6 = r11
            r10 = r15
            r5 = r23
            r11 = r1
            r15 = r4
            r2 = r8
            r4 = r9
            r8 = r13
            r13 = r16
            r14 = r17
        L2ae:
            P.o0 r0 = r0.r()
            if (r0 == 0) goto L2c8
            r1 = r0
            M.V r0 = new M.V
            r16 = r45
            r17 = r47
            r18 = r48
            r27 = r1
            r1 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11, r13, r14, r15, r16, r17, r18)
            r1 = r27
            r1.f5482d = r0
        L2c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M.AbstractC0210g0.a(B5.a, c0.m, M.I0, float, j0.E, long, long, float, long, B5.e, B5.e, M.h0, X.e, P.o, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(C1642c c1642c, InterfaceC0261w interfaceC0261w, B5.a aVar, B5.c cVar, InterfaceC0725m interfaceC0725m, I0 i02, float f, j0.E e7, long j, long j7, float f7, B5.e eVar, B5.e eVar2, X.e eVar3, C0371o c0371o, int i) {
        c0371o.U(-1676960531);
        int i7 = i | (c0371o.i(c1642c) ? 32 : 16) | (c0371o.i(interfaceC0261w) ? 256 : 128) | (c0371o.i(aVar) ? 2048 : 1024) | (c0371o.i(cVar) ? 16384 : 8192) | (c0371o.g(interfaceC0725m) ? 131072 : 65536) | (c0371o.g(i02) ? 1048576 : 524288) | (c0371o.d(f) ? 8388608 : 4194304) | (c0371o.g(e7) ? 67108864 : 33554432) | (c0371o.f(j) ? 536870912 : 268435456);
        int i8 = (c0371o.f(j7) ? 4 : 2) | (c0371o.d(f7) ? 32 : 16) | (c0371o.i(eVar) ? 256 : 128) | (c0371o.i(eVar2) ? 2048 : 1024) | (c0371o.i(eVar3) ? 16384 : 8192);
        if ((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362 && c0371o.x()) {
            c0371o.N();
        } else {
            c0371o.P();
            if ((i & 1) != 0 && !c0371o.w()) {
                c0371o.N();
            }
            c0371o.q();
            String strA = N.s.a(R.string.m3c_bottom_sheet_pane_title, c0371o);
            InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.a.f9276a.a(interfaceC0725m, C0714b.f10077r), f).d(androidx.compose.foundation.layout.c.f9277a);
            int i9 = (i7 & 3670016) ^ 1572864;
            boolean z5 = (i9 > 1048576 && c0371o.g(i02)) || (i7 & 1572864) == 1048576;
            Object objH = c0371o.H();
            boolean z6 = z5;
            Object obj = C0363k.f5418a;
            if (z6 || objH == obj) {
                float f8 = G0.f3308a;
                objH = new E0(i02, cVar);
                c0371o.d0(objH);
            }
            InterfaceC0725m interfaceC0725mA = androidx.compose.ui.input.nestedscroll.a.a(interfaceC0725mD, (InterfaceC1672a) objH, null);
            N.r rVar = i02.f3322c;
            boolean z7 = (i9 > 1048576 && c0371o.g(i02)) || (i7 & 1572864) == 1048576;
            Object objH2 = c0371o.H();
            if (z7 || objH2 == obj) {
                objH2 = new A.e0(6, i02);
                c0371o.d0(objH2);
            }
            InterfaceC0725m interfaceC0725mC = androidx.compose.material3.internal.a.c(interfaceC0725mA, rVar, (B5.e) objH2);
            C0050o c0050o = i02.f3322c.f;
            boolean zC = i02.c();
            boolean z8 = i02.f3322c.f3976l.getValue() != null;
            boolean z9 = (i7 & 57344) == 16384;
            Object objH3 = c0371o.H();
            if (z9 || objH3 == obj) {
                objH3 = new C0198a0(cVar, null);
                c0371o.d0(objH3);
            }
            InterfaceC0725m interfaceC0725mD2 = interfaceC0725mC.d(new DraggableElement(c0050o, zC, z8, w.D.f17754a, (B5.f) objH3));
            boolean zG = c0371o.g(strA);
            Object objH4 = c0371o.H();
            if (zG || objH4 == obj) {
                objH4 = new I0.k(strA, 2);
                c0371o.d0(objH4);
            }
            InterfaceC0725m interfaceC0725mA2 = I0.j.a(interfaceC0725mD2, false, (B5.c) objH4);
            boolean z10 = ((i7 & 112) == 32 || c0371o.i(c1642c)) | ((i9 > 1048576 && c0371o.g(i02)) || (i7 & 1572864) == 1048576);
            Object objH5 = c0371o.H();
            if (z10 || objH5 == obj) {
                objH5 = new A.Y(11, i02, c1642c);
                c0371o.d0(objH5);
            }
            int i10 = i7 >> 21;
            int i11 = i8 << 9;
            L0.a(androidx.compose.ui.graphics.a.a(interfaceC0725mA2, (B5.c) objH5), e7, j, j7, f7, 0.0f, X.k.d(-692668920, new C.o(eVar2, c1642c, eVar, i02, aVar, interfaceC0261w, eVar3), c0371o), c0371o, (i10 & 896) | (i10 & 112) | 12582912 | (i11 & 7168) | (i11 & 57344), 96);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0204d0(c1642c, interfaceC0261w, aVar, cVar, interfaceC0725m, i02, f, e7, j, j7, f7, eVar, eVar2, eVar3, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(long j, B5.a aVar, boolean z5, C0371o c0371o, int i) {
        int i7;
        InterfaceC0725m interfaceC0725mA;
        l6.d dVar;
        c0371o.U(951870469);
        if ((i & 6) == 0) {
            i7 = (c0371o.f(j) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if ((i & 48) == 0) {
            i7 |= c0371o.i(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= c0371o.h(z5) ? 256 : 128;
        }
        if ((i7 & 147) == 146 && c0371o.x()) {
            c0371o.N();
        } else if (j != 16) {
            float f = z5 ? 1.0f : 0.0f;
            Object z0Var = new u.z0(0, (InterfaceC1669x) null, 7);
            C1649f0 c1649f0 = AbstractC1650g.f16931a;
            Object obj = C0363k.f5418a;
            if (z0Var == c1649f0) {
                c0371o.S(1125558999);
                boolean zD = c0371o.d(0.01f);
                Object objH = c0371o.H();
                if (zD || objH == obj) {
                    objH = AbstractC1644d.o(3, Float.valueOf(0.01f));
                    c0371o.d0(objH);
                }
                z0Var = (C1649f0) objH;
                c0371o.p(false);
            } else {
                c0371o.S(1125668925);
                c0371o.p(false);
            }
            Object objValueOf = Float.valueOf(f);
            Z.m mVar = u.A0.f16746a;
            Float fValueOf = Float.valueOf(0.01f);
            Object objH2 = c0371o.H();
            if (objH2 == obj) {
                objH2 = C0345b.q(null);
                c0371o.d0(objH2);
            }
            P.W w3 = (P.W) objH2;
            Object objH3 = c0371o.H();
            if (objH3 == obj) {
                objH3 = new C1642c(objValueOf, mVar, fValueOf);
                c0371o.d0(objH3);
            }
            C1642c c1642c = (C1642c) objH3;
            P.W wT = C0345b.t(null, c0371o);
            if (z0Var instanceof C1649f0) {
                C1649f0 c1649f02 = (C1649f0) z0Var;
                if (!kotlin.jvm.internal.m.a(c1649f02.f16930b, fValueOf)) {
                    z0Var = new C1649f0(c1649f02.f16929a, fValueOf);
                }
            }
            P.W wT2 = C0345b.t(z0Var, c0371o);
            Object objH4 = c0371o.H();
            if (objH4 == obj) {
                objH4 = l6.d.e(-1, null, 6);
                c0371o.d0(objH4);
            }
            O5.i iVar = (O5.i) objH4;
            boolean zI = c0371o.i(iVar) | c0371o.i(objValueOf);
            Object objH5 = c0371o.H();
            if (zI || objH5 == obj) {
                objH5 = new B0.K(16, iVar, objValueOf);
                c0371o.d0(objH5);
            }
            C0345b.g((B5.a) objH5, c0371o);
            boolean zI2 = c0371o.i(iVar) | c0371o.i(c1642c) | c0371o.g(wT2) | c0371o.g(wT);
            Object objH6 = c0371o.H();
            if (zI2 || objH6 == obj) {
                objH6 = new C1648f(iVar, c1642c, wT2, wT, null);
                c0371o.d0(objH6);
            }
            C0345b.e((B5.e) objH6, c0371o, iVar);
            S0 s02 = (S0) w3.getValue();
            if (s02 == null) {
                s02 = c1642c.f16879c;
            }
            Object objA = N.s.a(R.string.close_sheet, c0371o);
            c0371o.S(-1785653838);
            if (z5) {
                int i8 = i7 & 112;
                boolean z6 = i8 == 32;
                Object objH7 = c0371o.H();
                if (z6 || objH7 == obj) {
                    dVar = null;
                    objH7 = new C0208f0(aVar, null);
                    c0371o.d0(objH7);
                } else {
                    dVar = null;
                }
                C1737f c1737f = v0.u.f17495a;
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(aVar, dVar, new C1751t((B5.e) objH7), 6);
                boolean zG = (i8 == 32) | c0371o.g(objA);
                Object objH8 = c0371o.H();
                if (zG || objH8 == obj) {
                    objH8 = new A.Y(12, objA, aVar);
                    c0371o.d0(objH8);
                }
                interfaceC0725mA = I0.j.a(suspendPointerInputElement, true, (B5.c) objH8);
            } else {
                interfaceC0725mA = C0722j.f10095q;
            }
            c0371o.p(false);
            InterfaceC0725m interfaceC0725mD = androidx.compose.foundation.layout.c.f9279c.d(interfaceC0725mA);
            boolean zG2 = c0371o.g(s02) | ((i7 & 14) == 4);
            Object objH9 = c0371o.H();
            if (zG2 || objH9 == obj) {
                objH9 = new C1611j(j, s02);
                c0371o.d0(objH9);
            }
            AbstractC1397A.b(interfaceC0725mD, (B5.c) objH9, c0371o, 0);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0206e0(j, aVar, z5, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float d(j0.C c7, float f) {
        float fD = C1133e.d(c7.f13663B);
        if (Float.isNaN(fD) || fD == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (((f * Math.min(c7.f13664C.b() * f3487a, fD)) + ((1 - f) * 0.0f)) / fD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float e(j0.C c7, float f) {
        float fB = C1133e.b(c7.f13663B);
        if (Float.isNaN(fB) || fB == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (((f * Math.min(c7.f13664C.b() * f3488b, fB)) + ((1 - f) * 0.0f)) / fB);
    }
}
