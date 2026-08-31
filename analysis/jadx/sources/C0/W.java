package C0;

import android.R;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import i0.C1131c;
import i0.C1132d;
import j0.AbstractC1145B;
import j0.C1152g;
import j0.InterfaceC1144A;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import m5.InterfaceC1366e;
import r.AbstractC1561l;
import r.C1548G;
import r.C1570v;

/* JADX INFO: loaded from: classes.dex */
public abstract class W implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f939a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1131c f940b = new C1131c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(I0.m mVar, x1.e eVar) {
        I0.i iVar = mVar.f2268d;
        C1548G c1548g = iVar.f2257q;
        Object objG = iVar.f2257q.g(I0.p.f2320v);
        if (objG == null) {
            objG = null;
        }
        I0.f fVar = (I0.f) objG;
        if (M.a(mVar)) {
            if (fVar != null && fVar.f2230a == 8) {
                return;
            }
            Object objG2 = c1548g.g(I0.h.f2253w);
            if (objG2 == null) {
                objG2 = null;
            }
            I0.a aVar = (I0.a) objG2;
            if (aVar != null) {
                eVar.b(new x1.d(R.id.accessibilityActionPageUp, aVar.f2221a));
            }
            Object objG3 = c1548g.g(I0.h.f2255y);
            if (objG3 == null) {
                objG3 = null;
            }
            I0.a aVar2 = (I0.a) objG3;
            if (aVar2 != null) {
                eVar.b(new x1.d(R.id.accessibilityActionPageDown, aVar2.f2221a));
            }
            Object objG4 = c1548g.g(I0.h.f2254x);
            if (objG4 == null) {
                objG4 = null;
            }
            I0.a aVar3 = (I0.a) objG4;
            if (aVar3 != null) {
                eVar.b(new x1.d(R.id.accessibilityActionPageLeft, aVar3.f2221a));
            }
            Object objG5 = c1548g.g(I0.h.f2256z);
            I0.a aVar4 = (I0.a) (objG5 != null ? objG5 : null);
            if (aVar4 != null) {
                eVar.b(new x1.d(R.id.accessibilityActionPageRight, aVar4.f2221a));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(Object obj) {
        if (obj instanceof a0.o) {
            a0.o oVar = (a0.o) obj;
            if (oVar.a() == P.S.f5374s || oVar.a() == P.S.f5377v || oVar.a() == P.S.f5375t) {
                Object value = oVar.getValue();
                if (value == null) {
                    return true;
                }
                return b(value);
            }
        } else {
            if ((obj instanceof InterfaceC1366e) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (f939a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(float f) {
        return ((int) (f >= 0.0f ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float d(float[] fArr, int i, float[] fArr2, int i7) {
        int i8 = i * 4;
        return (fArr[i8 + 3] * fArr2[12 + i7]) + (fArr[i8 + 2] * fArr2[8 + i7]) + (fArr[i8 + 1] * fArr2[4 + i7]) + (fArr[i8] * fArr2[i7]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final U0 e(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((U0) arrayList.get(i7)).f930q == i) {
                return (U0) arrayList.get(i7);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1570v f(I0.n nVar) {
        I0.m mVarA = nVar.a();
        B0.L l7 = mVarA.f2267c;
        if (!l7.G() || !l7.F()) {
            C1570v c1570v = AbstractC1561l.f16221a;
            kotlin.jvm.internal.m.c(c1570v, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return c1570v;
        }
        C1570v c1570v2 = new C1570v(48);
        C1131c c1131cE = mVarA.e();
        g(new Region(Math.round(c1131cE.f13522a), Math.round(c1131cE.f13523b), Math.round(c1131cE.f13524c), Math.round(c1131cE.f13525d)), mVarA, c1570v2, mVarA, new Region());
        return c1570v2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[EDGE_INSN: B:43:0x00cf->B:46:0x00e5 BREAK  A[LOOP:1: B:40:0x00c4->B:44:0x00d2]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(android.graphics.Region r17, I0.m r18, r.C1570v r19, I0.m r20, android.graphics.Region r21) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            int r5 = r1.f2270g
            B0.L r6 = r3.f2267c
            int r7 = r3.f2270g
            boolean r8 = r6.G()
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L21
            boolean r8 = r6.F()
            if (r8 != 0) goto L1f
            goto L21
        L1f:
            r8 = r9
            goto L22
        L21:
            r8 = r10
        L22:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L2a
            if (r7 != r5) goto L1a4
        L2a:
            if (r8 == 0) goto L32
            boolean r8 = r3.f2269e
            if (r8 != 0) goto L32
            goto L1a4
        L32:
            c0.l r8 = r3.f2265a
            I0.i r11 = r3.f2268d
            boolean r12 = r11.f2259s
            if (r12 == 0) goto L41
            B0.A0 r6 = a.AbstractC0597a.D(r6)
            if (r6 == 0) goto L41
            r8 = r6
        L41:
            c0.l r8 = (c0.AbstractC0724l) r8
            c0.l r6 = r8.f10100q
            I0.s r8 = I0.h.f2235b
            r.G r11 = r11.f2257q
            java.lang.Object r8 = r11.g(r8)
            if (r8 != 0) goto L50
            r8 = 0
        L50:
            if (r8 == 0) goto L54
            r8 = r10
            goto L55
        L54:
            r8 = r9
        L55:
            c0.l r11 = r6.f10100q
            boolean r11 = r11.f10099D
            if (r11 != 0) goto L5c
            goto Lcf
        L5c:
            r11 = 8
            if (r8 != 0) goto L6e
            B0.n0 r6 = B0.AbstractC0041g.s(r6, r11)
            z0.m r8 = z0.AbstractC1938O.f(r6)
            i0.c r6 = r8.I(r6, r10)
            goto Le5
        L6e:
            B0.n0 r6 = B0.AbstractC0041g.s(r6, r11)
            c0.l r8 = r6.B0()
            boolean r8 = r8.f10099D
            if (r8 != 0) goto L7b
            goto Lcf
        L7b:
            z0.m r8 = z0.AbstractC1938O.f(r6)
            i0.a r11 = r6.f491O
            if (r11 != 0) goto L8a
            i0.a r11 = new i0.a
            r11.<init>()
            r6.f491O = r11
        L8a:
            long r12 = r6.A0()
            long r12 = r6.r0(r12)
            r14 = 32
            long r14 = r12 >> r14
            int r14 = (int) r14
            float r15 = java.lang.Float.intBitsToFloat(r14)
            float r15 = -r15
            r11.f13516b = r15
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r15
            int r12 = (int) r12
            float r13 = java.lang.Float.intBitsToFloat(r12)
            float r13 = -r13
            r11.f13517c = r13
            int r13 = r6.N()
            float r13 = (float) r13
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r14 = r14 + r13
            r11.f13518d = r14
            int r13 = r6.K()
            float r13 = (float) r13
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r12 = r12 + r13
            r11.f13519e = r12
        Lc4:
            if (r6 == r8) goto Ld8
            r6.S0(r11, r9, r10)
            boolean r12 = r11.b()
            if (r12 == 0) goto Ld2
        Lcf:
            i0.c r6 = i0.C1131c.f13521e
            goto Le5
        Ld2:
            B0.n0 r6 = r6.f480D
            kotlin.jvm.internal.m.b(r6)
            goto Lc4
        Ld8:
            i0.c r6 = new i0.c
            float r8 = r11.f13516b
            float r9 = r11.f13517c
            float r12 = r11.f13518d
            float r11 = r11.f13519e
            r6.<init>(r8, r9, r12, r11)
        Le5:
            float r8 = r6.f13522a
            int r8 = java.lang.Math.round(r8)
            float r9 = r6.f13523b
            int r9 = java.lang.Math.round(r9)
            float r11 = r6.f13524c
            int r11 = java.lang.Math.round(r11)
            float r6 = r6.f13525d
            int r6 = java.lang.Math.round(r6)
            r4.set(r8, r9, r11, r6)
            r12 = -1
            if (r7 != r5) goto L104
            r7 = r12
        L104:
            android.graphics.Region$Op r5 = android.graphics.Region.Op.INTERSECT
            boolean r5 = r4.op(r0, r5)
            if (r5 == 0) goto L155
            C0.W0 r5 = new C0.W0
            android.graphics.Rect r13 = r4.getBounds()
            r5.<init>(r3, r13)
            r2.h(r7, r5)
            r5 = 4
            java.util.List r5 = I0.m.h(r5, r3)
            int r7 = r5.size()
            int r7 = r7 - r10
        L122:
            if (r12 >= r7) goto L145
            java.lang.Object r10 = r5.get(r7)
            I0.m r10 = (I0.m) r10
            I0.i r10 = r10.i()
            I0.s r13 = I0.p.f2322x
            r.G r10 = r10.f2257q
            boolean r10 = r10.c(r13)
            if (r10 == 0) goto L139
            goto L142
        L139:
            java.lang.Object r10 = r5.get(r7)
            I0.m r10 = (I0.m) r10
            g(r0, r1, r2, r10, r4)
        L142:
            int r7 = r7 + (-1)
            goto L122
        L145:
            boolean r1 = k(r3)
            if (r1 == 0) goto L1a4
            android.graphics.Region$Op r5 = android.graphics.Region.Op.DIFFERENCE
            r4 = r6
            r1 = r8
            r2 = r9
            r3 = r11
            r0.op(r1, r2, r3, r4, r5)
            return
        L155:
            boolean r0 = r3.f2269e
            if (r0 == 0) goto L196
            I0.m r0 = r3.j()
            if (r0 == 0) goto L16e
            B0.L r1 = r0.f2267c
            if (r1 == 0) goto L16e
            boolean r1 = r1.G()
            if (r1 != r10) goto L16e
            i0.c r0 = r0.e()
            goto L170
        L16e:
            i0.c r0 = C0.W.f940b
        L170:
            C0.W0 r1 = new C0.W0
            android.graphics.Rect r4 = new android.graphics.Rect
            float r5 = r0.f13522a
            int r5 = java.lang.Math.round(r5)
            float r6 = r0.f13523b
            int r6 = java.lang.Math.round(r6)
            float r8 = r0.f13524c
            int r8 = java.lang.Math.round(r8)
            float r0 = r0.f13525d
            int r0 = java.lang.Math.round(r0)
            r4.<init>(r5, r6, r8, r0)
            r1.<init>(r3, r4)
            r2.h(r7, r1)
            return
        L196:
            if (r7 != r12) goto L1a4
            C0.W0 r0 = new C0.W0
            android.graphics.Rect r1 = r4.getBounds()
            r0.<init>(r3, r1)
            r2.h(r7, r0)
        L1a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.W.g(android.graphics.Region, I0.m, r.v, I0.m, android.graphics.Region):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final L0.C h(I0.i iVar) {
        B5.c cVar;
        ArrayList arrayList = new ArrayList();
        Object objG = iVar.f2257q.g(I0.h.f2234a);
        if (objG == null) {
            objG = null;
        }
        I0.a aVar = (I0.a) objG;
        if (aVar == null || (cVar = (B5.c) aVar.f2222b) == null || !((Boolean) cVar.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (L0.C) arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean i(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[11];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f20 = fArr[14];
        float f21 = fArr[15];
        float f22 = (f * f11) - (f7 * f10);
        float f23 = (f * f12) - (f8 * f10);
        float f24 = (f * f13) - (f9 * f10);
        float f25 = (f7 * f12) - (f8 * f11);
        float f26 = (f7 * f13) - (f9 * f11);
        float f27 = (f8 * f13) - (f9 * f12);
        float f28 = (f14 * f19) - (f15 * f18);
        float f29 = (f14 * f20) - (f16 * f18);
        float f30 = (f14 * f21) - (f17 * f18);
        float f31 = (f15 * f20) - (f16 * f19);
        float f32 = (f15 * f21) - (f17 * f19);
        float f33 = (f16 * f21) - (f17 * f20);
        float f34 = (f27 * f28) + (((f25 * f30) + ((f24 * f31) + ((f22 * f33) - (f23 * f32)))) - (f26 * f29));
        if (f34 != 0.0f) {
            float f35 = 1.0f / f34;
            fArr2[0] = ((f13 * f31) + ((f11 * f33) - (f12 * f32))) * f35;
            fArr2[1] = (((f8 * f32) + ((-f7) * f33)) - (f9 * f31)) * f35;
            fArr2[2] = ((f21 * f25) + ((f19 * f27) - (f20 * f26))) * f35;
            fArr2[3] = (((f16 * f26) + ((-f15) * f27)) - (f17 * f25)) * f35;
            float f36 = -f10;
            fArr2[4] = (((f12 * f30) + (f36 * f33)) - (f13 * f29)) * f35;
            fArr2[5] = ((f9 * f29) + ((f33 * f) - (f8 * f30))) * f35;
            float f37 = -f18;
            fArr2[6] = (((f20 * f24) + (f37 * f27)) - (f21 * f23)) * f35;
            fArr2[7] = ((f17 * f23) + ((f27 * f14) - (f16 * f24))) * f35;
            fArr2[8] = ((f13 * f28) + ((f10 * f32) - (f11 * f30))) * f35;
            fArr2[9] = (((f30 * f7) + ((-f) * f32)) - (f9 * f28)) * f35;
            fArr2[10] = ((f21 * f22) + ((f18 * f26) - (f19 * f24))) * f35;
            fArr2[11] = (((f24 * f15) + ((-f14) * f26)) - (f17 * f22)) * f35;
            fArr2[12] = (((f11 * f29) + (f36 * f31)) - (f12 * f28)) * f35;
            fArr2[13] = ((f8 * f28) + ((f * f31) - (f7 * f29))) * f35;
            fArr2[14] = (((f19 * f23) + (f37 * f25)) - (f20 * f22)) * f35;
            fArr2[15] = ((f16 * f22) + ((f14 * f25) - (f15 * f23))) * f35;
        }
        return !(f34 == 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean j(I0.m mVar) {
        B0.n0 n0VarC = mVar.c();
        I0.i iVar = mVar.f2268d;
        if (n0VarC != null ? n0VarC.J0() : false) {
            return true;
        }
        I0.s sVar = I0.p.f2302a;
        if (iVar.f2257q.c(I0.p.f2313o)) {
            return true;
        }
        return iVar.f2257q.c(I0.p.f2312n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean k(I0.m r14) {
        /*
            boolean r0 = j(r14)
            r1 = 0
            if (r0 != 0) goto L5b
            I0.i r14 = r14.f2268d
            boolean r0 = r14.f2259s
            if (r0 != 0) goto L59
            r.G r14 = r14.f2257q
            java.lang.Object[] r0 = r14.f16134b
            java.lang.Object[] r2 = r14.f16135c
            long[] r14 = r14.f16133a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5b
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L54
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L52
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            I0.s r11 = (I0.s) r11
            boolean r10 = r11.f2329c
            if (r10 == 0) goto L4e
            goto L59
        L4e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L52:
            if (r7 != r8) goto L5b
        L54:
            if (r4 == r3) goto L5b
            int r4 = r4 + 1
            goto L1b
        L59:
            r14 = 1
            return r14
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.W.k(I0.m):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean l(AbstractC1145B abstractC1145B, float f, float f7) {
        if (abstractC1145B instanceof j0.y) {
            C1131c c1131c = ((j0.y) abstractC1145B).f13731e;
            return c1131c.f13522a <= f && f < c1131c.f13524c && c1131c.f13523b <= f7 && f7 < c1131c.f13525d;
        }
        if (!(abstractC1145B instanceof j0.z)) {
            if (abstractC1145B instanceof j0.x) {
                return m(((j0.x) abstractC1145B).f13730e, f, f7);
            }
            throw new C2.e();
        }
        C1132d c1132d = ((j0.z) abstractC1145B).f13732e;
        float f8 = c1132d.f13526a;
        long j = c1132d.f;
        long j7 = c1132d.f13532h;
        long j8 = c1132d.f13531g;
        float f9 = c1132d.f13529d;
        float f10 = c1132d.f13527b;
        float f11 = c1132d.f13528c;
        long j9 = c1132d.f13530e;
        if (f < f8 || f >= f11 || f7 < f10 || f7 >= f9) {
            return false;
        }
        int i = (int) (j9 >> 32);
        int i7 = (int) (j >> 32);
        if (Float.intBitsToFloat(i7) + Float.intBitsToFloat(i) <= c1132d.b()) {
            int i8 = (int) (j7 >> 32);
            int i9 = (int) (j8 >> 32);
            if (Float.intBitsToFloat(i9) + Float.intBitsToFloat(i8) <= c1132d.b()) {
                int i10 = (int) (j9 & 4294967295L);
                int i11 = (int) (j7 & 4294967295L);
                if (Float.intBitsToFloat(i11) + Float.intBitsToFloat(i10) <= c1132d.a()) {
                    int i12 = (int) (j & 4294967295L);
                    int i13 = (int) (j8 & 4294967295L);
                    if (Float.intBitsToFloat(i13) + Float.intBitsToFloat(i12) <= c1132d.a()) {
                        float fIntBitsToFloat = Float.intBitsToFloat(i) + f8;
                        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) + f10;
                        float fIntBitsToFloat3 = f11 - Float.intBitsToFloat(i7);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i12) + f10;
                        float fIntBitsToFloat5 = f11 - Float.intBitsToFloat(i9);
                        float fIntBitsToFloat6 = f9 - Float.intBitsToFloat(i13);
                        float fIntBitsToFloat7 = f9 - Float.intBitsToFloat(i11);
                        float fIntBitsToFloat8 = Float.intBitsToFloat(i8) + f8;
                        if (f < fIntBitsToFloat && f7 < fIntBitsToFloat2) {
                            return n(f, f7, fIntBitsToFloat, fIntBitsToFloat2, c1132d.f13530e);
                        }
                        if (f < fIntBitsToFloat8 && f7 > fIntBitsToFloat7) {
                            return n(f, f7, fIntBitsToFloat8, fIntBitsToFloat7, c1132d.f13532h);
                        }
                        if (f > fIntBitsToFloat3 && f7 < fIntBitsToFloat4) {
                            return n(f, f7, fIntBitsToFloat3, fIntBitsToFloat4, c1132d.f);
                        }
                        if (f <= fIntBitsToFloat5 || f7 <= fIntBitsToFloat6) {
                            return true;
                        }
                        return n(f, f7, fIntBitsToFloat5, fIntBitsToFloat6, c1132d.f13531g);
                    }
                }
            }
        }
        C1152g c1152gA = j0.i.a();
        InterfaceC1144A.a(c1152gA, c1132d);
        return m(c1152gA, f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean m(InterfaceC1144A interfaceC1144A, float f, float f7) {
        float f8 = f - 0.005f;
        float f9 = f7 - 0.005f;
        float f10 = f + 0.005f;
        float f11 = f7 + 0.005f;
        C1152g c1152gA = j0.i.a();
        if (Float.isNaN(f8) || Float.isNaN(f9) || Float.isNaN(f10) || Float.isNaN(f11)) {
            j0.i.b("Invalid rectangle, make sure no value is NaN");
        }
        if (c1152gA.f13708b == null) {
            c1152gA.f13708b = new RectF();
        }
        RectF rectF = c1152gA.f13708b;
        kotlin.jvm.internal.m.b(rectF);
        rectF.set(f8, f9, f10, f11);
        Path path = c1152gA.f13707a;
        RectF rectF2 = c1152gA.f13708b;
        kotlin.jvm.internal.m.b(rectF2);
        path.addRect(rectF2, Path.Direction.CCW);
        C1152g c1152gA2 = j0.i.a();
        c1152gA2.c(interfaceC1144A, c1152gA, 1);
        boolean zIsEmpty = c1152gA2.f13707a.isEmpty();
        c1152gA2.d();
        c1152gA.d();
        return !zIsEmpty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean n(float f, float f7, float f8, float f9, long j) {
        float f10 = f - f8;
        float f11 = f7 - f9;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f11 * f11) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f10 * f10) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void o(float[] fArr, float[] fArr2) {
        float fD = d(fArr2, 0, fArr, 0);
        float fD2 = d(fArr2, 0, fArr, 1);
        float fD3 = d(fArr2, 0, fArr, 2);
        float fD4 = d(fArr2, 0, fArr, 3);
        float fD5 = d(fArr2, 1, fArr, 0);
        float fD6 = d(fArr2, 1, fArr, 1);
        float fD7 = d(fArr2, 1, fArr, 2);
        float fD8 = d(fArr2, 1, fArr, 3);
        float fD9 = d(fArr2, 2, fArr, 0);
        float fD10 = d(fArr2, 2, fArr, 1);
        float fD11 = d(fArr2, 2, fArr, 2);
        float fD12 = d(fArr2, 2, fArr, 3);
        float fD13 = d(fArr2, 3, fArr, 0);
        float fD14 = d(fArr2, 3, fArr, 1);
        float fD15 = d(fArr2, 3, fArr, 2);
        float fD16 = d(fArr2, 3, fArr, 3);
        fArr[0] = fD;
        fArr[1] = fD2;
        fArr[2] = fD3;
        fArr[3] = fD4;
        fArr[4] = fD5;
        fArr[5] = fD6;
        fArr[6] = fD7;
        fArr[7] = fD8;
        fArr[8] = fD9;
        fArr[9] = fD10;
        fArr[10] = fD11;
        fArr[11] = fD12;
        fArr[12] = fD13;
        fArr[13] = fD14;
        fArr[14] = fD15;
        fArr[15] = fD16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Z0.j p(C0086k0 c0086k0, int i) {
        Object next;
        Iterator<T> it = c0086k0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((B0.L) ((Map.Entry) next).getKey()).f280r == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Z0.j) entry.getValue();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String q(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String r(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(View view) {
        try {
            if (!d1.f1007I) {
                d1.f1007I = true;
                if (Build.VERSION.SDK_INT < 28) {
                    d1.f1005G = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    d1.f1006H = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    d1.f1005G = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    d1.f1006H = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = d1.f1005G;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = d1.f1006H;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = d1.f1006H;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = d1.f1005G;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            d1.f1008J = true;
        }
    }
}
