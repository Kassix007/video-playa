package u2;

import B0.C0044i;
import B0.C0045j;
import B0.D;
import B0.InterfaceC0046k;
import C0.G0;
import C0.S;
import F.Q;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import a.AbstractC0597a;
import android.content.Context;
import android.os.Trace;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.C0717e;
import c0.InterfaceC0725m;
import coil.compose.ContentPainterElement;
import j0.C1150e;
import o0.AbstractC1412b;
import p0.C1437e;
import t2.C1616a;
import z0.C1949i;
import z0.InterfaceC1950j;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f17189a = new t();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final u2.C1694o r20, final java.lang.String r21, final c0.InterfaceC0725m r22, final B5.c r23, final c0.C0717e r24, final z0.InterfaceC1950j r25, P.C0371o r26, final int r27, final int r28) {
        /*
            r1 = r20
            r3 = r22
            r4 = r23
            r9 = r25
            r10 = r26
            r0 = r27
            r2 = -421592773(0xffffffffe6df013b, float:-5.265552E23)
            r10.U(r2)
            boolean r2 = r10.g(r1)
            r5 = 4
            r6 = 2
            if (r2 == 0) goto L1c
            r2 = r5
            goto L1d
        L1c:
            r2 = r6
        L1d:
            r2 = r2 | r0
            r7 = r0 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L2e
            boolean r7 = r10.g(r3)
            if (r7 == 0) goto L2b
            r7 = 256(0x100, float:3.59E-43)
            goto L2d
        L2b:
            r7 = 128(0x80, float:1.794E-43)
        L2d:
            r2 = r2 | r7
        L2e:
            r7 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L3e
            boolean r7 = r10.i(r4)
            if (r7 == 0) goto L3b
            r7 = 2048(0x800, float:2.87E-42)
            goto L3d
        L3b:
            r7 = 1024(0x400, float:1.435E-42)
        L3d:
            r2 = r2 | r7
        L3e:
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = r0 & r7
            r11 = 0
            if (r8 != 0) goto L52
            boolean r8 = r10.i(r11)
            if (r8 == 0) goto L4f
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L51
        L4f:
            r8 = 8192(0x2000, float:1.14794E-41)
        L51:
            r2 = r2 | r8
        L52:
            r8 = 458752(0x70000, float:6.42848E-40)
            r12 = r0 & r8
            if (r12 != 0) goto L67
            r12 = r24
            boolean r13 = r10.g(r12)
            if (r13 == 0) goto L63
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L65
        L63:
            r13 = 65536(0x10000, float:9.18355E-41)
        L65:
            r2 = r2 | r13
            goto L69
        L67:
            r12 = r24
        L69:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r14 = r0 & r13
            if (r14 != 0) goto L7b
            boolean r14 = r10.g(r9)
            if (r14 == 0) goto L78
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L7a
        L78:
            r14 = 524288(0x80000, float:7.34684E-40)
        L7a:
            r2 = r2 | r14
        L7b:
            r14 = 29360128(0x1c00000, float:7.052966E-38)
            r15 = r0 & r14
            if (r15 != 0) goto L8f
            r15 = 1065353216(0x3f800000, float:1.0)
            boolean r15 = r10.d(r15)
            if (r15 == 0) goto L8c
            r15 = 8388608(0x800000, float:1.17549435E-38)
            goto L8e
        L8c:
            r15 = 4194304(0x400000, float:5.877472E-39)
        L8e:
            r2 = r2 | r15
        L8f:
            r15 = 234881024(0xe000000, float:1.5777218E-30)
            r15 = r15 & r0
            if (r15 != 0) goto La0
            boolean r11 = r10.g(r11)
            if (r11 == 0) goto L9d
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto L9f
        L9d:
            r11 = 33554432(0x2000000, float:9.403955E-38)
        L9f:
            r2 = r2 | r11
        La0:
            r11 = 1879048192(0x70000000, float:1.58456325E29)
            r11 = r11 & r0
            r15 = 1
            if (r11 != 0) goto Lb2
            boolean r11 = r10.e(r15)
            if (r11 == 0) goto Laf
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lb1
        Laf:
            r11 = 268435456(0x10000000, float:2.5243549E-29)
        Lb1:
            r2 = r2 | r11
        Lb2:
            r11 = r28 & 14
            if (r11 != 0) goto Lc1
            boolean r11 = r10.h(r15)
            if (r11 == 0) goto Lbd
            goto Lbe
        Lbd:
            r5 = r6
        Lbe:
            r5 = r28 | r5
            goto Lc3
        Lc1:
            r5 = r28
        Lc3:
            r11 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r11 = r11 & r2
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            if (r11 != r15) goto Ldc
            r11 = r5 & 11
            if (r11 != r6) goto Ldc
            boolean r6 = r10.x()
            if (r6 != 0) goto Ld7
            goto Ldc
        Ld7:
            r10.N()
            goto L1f3
        Ldc:
            java.lang.Object r6 = r1.f17176a
            E2.e r11 = u2.w.f17192b
            r11 = 1677680258(0x63ff5e82, float:9.4214595E21)
            r10.T(r11)
            boolean r11 = r6 instanceof D2.j
            r15 = 0
            r16 = r7
            if (r11 == 0) goto L101
            r7 = r6
            D2.j r7 = (D2.j) r7
            r17 = r8
            D2.d r8 = r7.f1418z
            E2.i r8 = r8.f1373a
            if (r8 == 0) goto L103
            r10.p(r15)
            r18 = r13
        Lfd:
            r19 = r14
            goto L1c2
        L101:
            r17 = r8
        L103:
            r7 = 408306591(0x1856439f, float:2.7692992E-24)
            r10.T(r7)
            z0.k r7 = z0.C1949i.f18696c
            boolean r7 = kotlin.jvm.internal.m.a(r9, r7)
            P.S r8 = P.C0363k.f5418a
            if (r7 == 0) goto L116
            E2.e r7 = u2.w.f17192b
            goto L12f
        L116:
            r7 = 408309406(0x18564e9e, float:2.7698543E-24)
            r10.T(r7)
            java.lang.Object r7 = r10.H()
            if (r7 != r8) goto L12a
            u2.r r7 = new u2.r
            r7.<init>()
            r10.d0(r7)
        L12a:
            u2.r r7 = (u2.r) r7
            r10.p(r15)
        L12f:
            r10.p(r15)
            if (r11 == 0) goto L173
            r11 = -227230258(0xfffffffff274bdce, float:-4.8476033E30)
            r10.T(r11)
            D2.j r6 = (D2.j) r6
            r11 = 408312509(0x18565abd, float:2.7704663E-24)
            r10.T(r11)
            boolean r11 = r10.g(r6)
            boolean r18 = r10.g(r7)
            r11 = r11 | r18
            r18 = r13
            java.lang.Object r13 = r10.H()
            if (r11 != 0) goto L156
            if (r13 != r8) goto L166
        L156:
            D2.h r6 = D2.j.a(r6)
            r6.f1390m = r7
            r6.b()
            D2.j r13 = r6.a()
            r10.d0(r13)
        L166:
            r7 = r13
            D2.j r7 = (D2.j) r7
            r10.p(r15)
            r10.p(r15)
            r10.p(r15)
            goto Lfd
        L173:
            r18 = r13
            r11 = -227066702(0xfffffffff2773cb2, float:-4.897035E30)
            r10.T(r11)
            P.T0 r11 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f9341b
            java.lang.Object r11 = r10.k(r11)
            android.content.Context r11 = (android.content.Context) r11
            r13 = 408319118(0x1856748e, float:2.7717697E-24)
            r10.T(r13)
            boolean r13 = r10.g(r11)
            boolean r19 = r10.g(r6)
            r13 = r13 | r19
            boolean r19 = r10.g(r7)
            r13 = r13 | r19
            r19 = r14
            java.lang.Object r14 = r10.H()
            if (r13 != 0) goto L1a3
            if (r14 != r8) goto L1b6
        L1a3:
            D2.h r8 = new D2.h
            r8.<init>(r11)
            r8.f1383c = r6
            r8.f1390m = r7
            r8.b()
            D2.j r14 = r8.a()
            r10.d0(r14)
        L1b6:
            r7 = r14
            D2.j r7 = (D2.j) r7
            r10.p(r15)
            r10.p(r15)
            r10.p(r15)
        L1c2:
            t2.l r6 = r1.f17178c
            int r2 = r2 >> 6
            r8 = r2 & r16
            u2.n r6 = d(r7, r6, r4, r9, r10)
            E2.i r7 = r7.f1415w
            boolean r11 = r7 instanceof u2.r
            if (r11 == 0) goto L1d9
            c0.m r7 = (c0.InterfaceC0725m) r7
            c0.m r7 = r3.d(r7)
            goto L1da
        L1d9:
            r7 = r3
        L1da:
            r11 = 384(0x180, float:5.38E-43)
            r13 = r2 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r13
            r8 = r8 | r11
            r11 = r2 & r17
            r8 = r8 | r11
            r2 = r2 & r18
            r2 = r2 | r8
            int r5 = r5 << 21
            r5 = r5 & r19
            r11 = r2 | r5
            r5 = r7
            r8 = r12
            r7 = r21
            c(r5, r6, r7, r8, r9, r10, r11)
        L1f3:
            P.o0 r9 = r26.r()
            if (r9 == 0) goto L20a
            u2.a r0 = new u2.a
            r2 = r21
            r5 = r24
            r6 = r25
            r7 = r27
            r8 = r28
            r0.<init>()
            r9.f5482d = r0
        L20a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.u.a(u2.o, java.lang.String, c0.m, B5.c, c0.e, z0.j, P.o, int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str, String str2, InterfaceC0725m interfaceC0725m, C0371o c0371o) {
        c0371o.T(1451072229);
        C0717e c0717e = C0714b.f10080u;
        t2.l lVarA = (t2.l) c0371o.k(v.f17190a);
        if (lVarA == null) {
            lVarA = C1616a.a((Context) c0371o.k(AndroidCompositionLocals_androidKt.f9341b));
        }
        c0371o.T(2032051394);
        a(new C1694o(str, f17189a, lVarA), str2, interfaceC0725m, C1693n.f17161J, c0717e, C1949i.f18694a, c0371o, 1573296, 0);
        c0371o.p(false);
        c0371o.p(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(InterfaceC0725m interfaceC0725m, C1693n c1693n, String str, C0717e c0717e, InterfaceC1950j interfaceC1950j, C0371o c0371o, int i) {
        int i7;
        c0371o.U(777774312);
        int i8 = 4;
        if ((i & 14) == 0) {
            i7 = (c0371o.g(interfaceC0725m) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if ((i & 112) == 0) {
            i7 |= c0371o.g(c1693n) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i7 |= c0371o.g(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i7 |= c0371o.g(c0717e) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i7 |= c0371o.g(interfaceC1950j) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i7 |= c0371o.d(1.0f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i7 |= c0371o.g(null) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i7 |= c0371o.h(true) ? 8388608 : 4194304;
        }
        if ((i7 & 23967451) == 4793490 && c0371o.x()) {
            c0371o.N();
        } else {
            E2.e eVar = w.f17192b;
            InterfaceC0725m interfaceC0725mD = AbstractC0597a.o(I0.j.a(interfaceC0725m, false, new J5.i(13, str))).d(new ContentPainterElement(c1693n, c0717e, interfaceC1950j));
            c0371o.T(544976794);
            int i9 = c0371o.f5454P;
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mD);
            InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
            InterfaceC0046k.f452a.getClass();
            D d5 = C0045j.f445b;
            c0371o.T(1405779621);
            c0371o.W();
            if (c0371o.f5453O) {
                c0371o.l(new Q(d5, i8));
            } else {
                c0371o.g0();
            }
            C0345b.u(C0045j.f448e, c0371o, C1681b.f17141a);
            C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
            C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
            C0044i c0044i = C0045j.f;
            if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i9))) {
                k1.i.o(i9, c0371o, i9, c0044i);
            }
            c0371o.p(true);
            c0371o.p(false);
            c0371o.p(false);
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new f5.b(interfaceC0725m, c1693n, str, c0717e, interfaceC1950j, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1693n d(Object obj, t2.l lVar, B5.c cVar, InterfaceC1950j interfaceC1950j, C0371o c0371o) {
        c0371o.T(1645646697);
        c0371o.T(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            D2.j jVarA = w.a(obj, c0371o);
            g(jVarA);
            c0371o.T(1094691773);
            Object objH = c0371o.H();
            if (objH == C0363k.f5418a) {
                objH = new C1693n(jVarA, lVar);
                c0371o.d0(objH);
            }
            C1693n c1693n = (C1693n) objH;
            c0371o.p(false);
            c1693n.f17164C = cVar;
            c1693n.f17165D = interfaceC1950j;
            c1693n.f17166E = 1;
            c1693n.f17167F = ((Boolean) c0371o.k(G0.f828a)).booleanValue();
            c1693n.f17170I.setValue(lVar);
            c1693n.f17169H.setValue(jVarA);
            c1693n.b();
            c0371o.p(false);
            Trace.endSection();
            c0371o.p(false);
            return c1693n;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1693n e(Object obj, C0371o c0371o) {
        c0371o.T(236159766);
        t2.l lVarA = (t2.l) c0371o.k(v.f17190a);
        if (lVarA == null) {
            lVarA = C1616a.a((Context) c0371o.k(AndroidCompositionLocals_androidKt.f9341b));
        }
        C1693n c1693nD = d(obj, lVarA, C1693n.f17161J, C1949i.f18694a, c0371o);
        c0371o.p(false);
        return c1693nD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + S.n("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(D2.j jVar) {
        Object obj = jVar.f1397b;
        if (obj instanceof D2.h) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof C1150e) {
            f("ImageBitmap");
            throw null;
        }
        if (obj instanceof C1437e) {
            f("ImageVector");
            throw null;
        }
        if (obj instanceof AbstractC1412b) {
            f("Painter");
            throw null;
        }
        if (jVar.f1398c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
