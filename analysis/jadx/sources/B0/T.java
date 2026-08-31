package B0;

import java.util.Map;
import r.C1542A;
import y0.AbstractC1904a;
import z0.AbstractC1933J;
import z0.C1952l;
import z0.InterfaceC1927D;
import z0.InterfaceC1928E;
import z0.InterfaceC1953m;

/* JADX INFO: loaded from: classes.dex */
public abstract class T extends AbstractC1933J implements InterfaceC1928E, InterfaceC0038e0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1542A f319A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f322x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z0.z f323y = new z0.z(0, this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1542A f324z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n0(n0 n0Var) {
        M m4;
        n0 n0Var2 = n0Var.f479C;
        L l7 = n0Var.f478B;
        if (!kotlin.jvm.internal.m.a(n0Var2 != null ? n0Var2.f478B : null, l7)) {
            l7.f269V.f311p.f386M.f();
            return;
        }
        InterfaceC0031b interfaceC0031bQ = l7.f269V.f311p.q();
        if (interfaceC0031bQ == null || (m4 = ((C0034c0) interfaceC0031bQ).f386M) == null) {
            return;
        }
        m4.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final InterfaceC1927D O(int i, int i7, Map map, B5.c cVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i7) != 0) {
            AbstractC1904a.b("Size(" + i + " x " + i7 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new Q(i, i7, map, cVar, this);
    }

    public abstract int Y(C1952l c1952l);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(B0.x0 r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            boolean r2 = r0.f322x
            if (r2 == 0) goto L9
            goto L11
        L9:
            z0.D r2 = r1.f532q
            B5.c r2 = r2.e()
            if (r2 != 0) goto L12
        L11:
            return
        L12:
            r.A r2 = r0.f319A
            if (r2 != 0) goto L1d
            r.A r2 = new r.A
            r2.<init>()
            r0.f319A = r2
        L1d:
            r.A r3 = r0.f324z
            if (r3 != 0) goto L28
            r.A r3 = new r.A
            r3.<init>()
            r0.f324z = r3
        L28:
            java.lang.Object[] r4 = r3.f16105b
            float[] r5 = r3.f16106c
            long[] r6 = r3.f16104a
            int r7 = r6.length
            int r7 = r7 + (-2)
            r15 = 8
            r16 = 0
            if (r7 < 0) goto L80
            r8 = r16
            r17 = 128(0x80, double:6.32E-322)
            r19 = 255(0xff, double:1.26E-321)
        L3d:
            r10 = r6[r8]
            r9 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = ~r10
            long r12 = r12 << r9
            long r12 = r12 & r10
            long r12 = r12 & r21
            int r12 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r12 == 0) goto L79
            int r12 = r8 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r16
        L57:
            if (r13 >= r12) goto L74
            long r23 = r10 & r19
            int r14 = (r23 > r17 ? 1 : (r23 == r17 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r23 = r9
            r9 = r4[r14]
            r14 = r5[r14]
            r2.e(r14, r9)
            goto L6e
        L6c:
            r23 = r9
        L6e:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            r9 = r23
            goto L57
        L74:
            r23 = r9
            if (r12 != r15) goto L8b
            goto L7b
        L79:
            r23 = r9
        L7b:
            if (r8 == r7) goto L8b
            int r8 = r8 + 1
            goto L3d
        L80:
            r17 = 128(0x80, double:6.32E-322)
            r19 = 255(0xff, double:1.26E-321)
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r23 = 7
        L8b:
            r3.a()
            B0.L r4 = r0.h0()
            B0.t0 r4 = r4.f251D
            if (r4 == 0) goto La9
            C0.A r4 = (C0.A) r4
            B0.v0 r4 = r4.getSnapshotObserver()
            if (r4 == 0) goto La9
            B0.f r5 = B0.C0039f.f413s
            B0.K r6 = new B0.K
            r7 = 1
            r6.<init>(r7, r1, r0)
            r4.a(r1, r5, r6)
        La9:
            java.lang.Object[] r1 = r3.f16105b
            long[] r3 = r3.f16104a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L109
            r5 = r16
        Lb4:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r23
            long r8 = r8 & r6
            long r8 = r8 & r21
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto L104
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r16
        Lc9:
            if (r9 >= r8) goto L102
            long r10 = r6 & r19
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 >= 0) goto Lfe
            int r10 = r5 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            if (r10 != 0) goto Lf8
            r10 = 0
            int r11 = r2.c(r10)
            if (r11 < 0) goto Le0
            goto Lfe
        Le0:
            B0.T r11 = r0.l0()
            if (r11 == 0) goto Lfe
        Le6:
            r.A r12 = r11.f324z
            if (r12 == 0) goto Lf1
            int r12 = r12.c(r10)
            if (r12 < 0) goto Lf1
            goto Lfe
        Lf1:
            B0.T r11 = r11.l0()
            if (r11 != 0) goto Le6
            goto Lfe
        Lf8:
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
        Lfe:
            long r6 = r6 >> r15
            int r9 = r9 + 1
            goto Lc9
        L102:
            if (r8 != r15) goto L109
        L104:
            if (r5 == r4) goto L109
            int r5 = r5 + 1
            goto Lb4
        L109:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.T.Z(B0.x0):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b0(C1952l c1952l) {
        int iY;
        if (e0() && (iY = Y(c1952l)) != Integer.MIN_VALUE) {
            return iY + ((int) (this.f18668u & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract T c0();

    public abstract InterfaceC1953m d0();

    public abstract boolean e0();

    public abstract L h0();

    public abstract InterfaceC1927D j0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0038e0
    public final void k(boolean z5) {
        T tL0 = l0();
        L lH0 = tL0 != null ? tL0.h0() : null;
        if (kotlin.jvm.internal.m.a(lH0, h0())) {
            this.f320v = z5;
            return;
        }
        if ((lH0 != null ? lH0.f269V.f302d : null) != G.f227s) {
            if ((lH0 != null ? lH0.f269V.f302d : null) != G.f228t) {
                return;
            }
        }
        this.f320v = z5;
    }

    public abstract T l0();

    public abstract long m0();

    public abstract void o0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public boolean r() {
        return false;
    }
}
