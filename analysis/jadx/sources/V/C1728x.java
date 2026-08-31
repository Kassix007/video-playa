package v;

import B0.A0;
import B0.AbstractC0049n;
import B0.E0;
import B0.InterfaceC0048m;
import B0.y0;
import C0.C0100s;
import F.C0156j;
import M5.AbstractC0263y;
import android.view.KeyEvent;
import m5.C1386y;
import r.AbstractC1564o;
import v0.C1731A;
import v0.C1737f;
import v0.EnumC1738g;

/* JADX INFO: renamed from: v.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1728x extends AbstractC0049n implements y0, t0.c, A0, E0 {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final M f17406V = new M(3);

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public y.i f17407G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public V f17408H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public I0.f f17409I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f17410J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public B5.a f17411K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final I f17412L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1731A f17413M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public InterfaceC0048m f17414N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public y.k f17415O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public y.f f17416P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final r.y f17417Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f17418R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public y.i f17419S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f17420T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final M f17421U;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1728x(y.i iVar, V v6, boolean z5, I0.f fVar, B5.a aVar) {
        this.f17407G = iVar;
        this.f17408H = v6;
        this.f17409I = fVar;
        this.f17410J = z5;
        this.f17411K = aVar;
        this.f17412L = new I(iVar, new C0100s(1, this, C1728x.class, "onFocusChange", "onFocusChange(Z)V", 0, 3));
        int i = AbstractC1564o.f16233a;
        this.f17417Q = new r.y(6);
        this.f17418R = 0L;
        y.i iVar2 = this.f17407G;
        this.f17419S = iVar2;
        this.f17420T = iVar2 == null && this.f17408H != null;
        this.f17421U = f17406V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.A0
    public final void A(I0.i iVar) {
        I0.f fVar = this.f17409I;
        if (fVar != null) {
            I0.r.d(iVar, fVar.f2230a);
        }
        A0.d dVar = new A0.d(29, this);
        H5.k[] kVarArr = I0.r.f2326a;
        iVar.j(I0.h.f2235b, new I0.a(null, dVar));
        if (this.f17410J) {
            this.f17412L.A(iVar);
        } else {
            iVar.j(I0.p.i, C1386y.f15098a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0() {
        /*
            r17 = this;
            r0 = r17
            y.i r1 = r0.f17407G
            r.y r2 = r0.f17417Q
            if (r1 == 0) goto L6a
            y.k r3 = r0.f17415O
            if (r3 == 0) goto L14
            y.j r4 = new y.j
            r4.<init>(r3)
            r1.b(r4)
        L14:
            y.f r3 = r0.f17416P
            if (r3 == 0) goto L20
            y.g r4 = new y.g
            r4.<init>(r3)
            r1.b(r4)
        L20:
            java.lang.Object[] r3 = r2.f16262c
            long[] r4 = r2.f16260a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6a
            r6 = 0
            r7 = r6
        L2b:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L65
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L45:
            if (r12 >= r10) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5f
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            y.k r13 = (y.k) r13
            y.j r14 = new y.j
            r14.<init>(r13)
            r1.b(r14)
        L5f:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L45
        L63:
            if (r10 != r11) goto L6a
        L65:
            if (r7 == r5) goto L6a
            int r7 = r7 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.f17415O = r1
            r0.f17416P = r1
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1728x.A0():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B0() {
        V v6;
        if (this.f17414N == null && (v6 = this.f17408H) != null) {
            if (this.f17407G == null) {
                this.f17407G = new y.i();
            }
            this.f17412L.C0(this.f17407G);
            y.i iVar = this.f17407G;
            kotlin.jvm.internal.m.b(iVar);
            InterfaceC0048m interfaceC0048mB = v6.b(iVar);
            x0(interfaceC0048mB);
            this.f17414N = interfaceC0048mB;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v1, resolved type: boolean */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // t0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(android.view.KeyEvent r24) {
        /*
            r23 = this;
            r0 = r23
            r0.B0()
            int r1 = r24.getKeyCode()
            long r1 = Q2.g.d(r1)
            boolean r3 = r0.f17410J
            r4 = 3
            r.y r5 = r0.f17417Q
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L4c
            int r3 = E3.h.C(r24)
            r9 = 2
            if (r3 != r9) goto L4c
            boolean r3 = androidx.compose.foundation.a.e(r24)
            if (r3 == 0) goto L4c
            boolean r3 = r5.b(r1)
            if (r3 != 0) goto L48
            y.k r3 = new y.k
            long r8 = r0.f17418R
            r3.<init>(r8)
            r5.f(r1, r3)
            y.i r1 = r0.f17407G
            if (r1 == 0) goto L44
            M5.w r1 = r0.l0()
            v.f r2 = new v.f
            r2.<init>(r0, r3, r6)
            M5.AbstractC0263y.t(r1, r6, r6, r2, r4)
            return r7
        L44:
            r17 = r7
            goto L11d
        L48:
            r18 = 0
            goto L126
        L4c:
            boolean r3 = r0.f17410J
            if (r3 == 0) goto L48
            int r3 = E3.h.C(r24)
            if (r3 != r7) goto L48
            boolean r3 = androidx.compose.foundation.a.e(r24)
            if (r3 == 0) goto L48
            r5.getClass()
            int r3 = java.lang.Long.hashCode(r1)
            r9 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r9
            int r9 = r3 << 16
            r3 = r3 ^ r9
            r9 = r3 & 127(0x7f, float:1.78E-43)
            int r10 = r5.f16263d
            int r3 = r3 >>> 7
            r3 = r3 & r10
            r11 = 0
        L72:
            long[] r12 = r5.f16260a
            int r13 = r3 >> 3
            r14 = r3 & 7
            int r14 = r14 << r4
            r15 = r12[r13]
            long r15 = r15 >>> r14
            int r13 = r13 + r7
            r17 = r12[r13]
            int r12 = 64 - r14
            long r12 = r17 << r12
            r17 = r7
            r18 = 0
            long r7 = (long) r14
            long r7 = -r7
            r14 = 63
            long r7 = r7 >> r14
            long r7 = r7 & r12
            long r7 = r7 | r15
            long r12 = (long) r9
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r14
            long r12 = r12 ^ r7
            long r14 = r12 - r14
            long r12 = ~r12
            long r12 = r12 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
        La0:
            r19 = 0
            int r16 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r16 == 0) goto Lc3
            int r16 = java.lang.Long.numberOfTrailingZeros(r12)
            int r16 = r16 >> 3
            int r16 = r3 + r16
            r16 = r16 & r10
            r21 = r14
            long[] r14 = r5.f16261b
            r19 = r14[r16]
            int r14 = (r19 > r1 ? 1 : (r19 == r1 ? 0 : -1))
            if (r14 != 0) goto Lbb
            goto Ld1
        Lbb:
            r14 = 1
            long r14 = r12 - r14
            long r12 = r12 & r14
            r14 = r21
            goto La0
        Lc3:
            r21 = r14
            long r12 = ~r7
            r14 = 6
            long r12 = r12 << r14
            long r7 = r7 & r12
            long r7 = r7 & r21
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 == 0) goto L11e
            r16 = -1
        Ld1:
            if (r16 < 0) goto L101
            int r1 = r5.f16264e
            int r1 = r1 + (-1)
            r5.f16264e = r1
            long[] r1 = r5.f16260a
            int r2 = r5.f16263d
            int r3 = r16 >> 3
            r7 = r16 & 7
            int r7 = r7 << r4
            r8 = r1[r3]
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 << r7
            long r10 = ~r10
            long r8 = r8 & r10
            r10 = 254(0xfe, double:1.255E-321)
            long r10 = r10 << r7
            long r7 = r8 | r10
            r1[r3] = r7
            int r3 = r16 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r7
            java.lang.Object[] r1 = r5.f16262c
            r2 = r1[r16]
            r1[r16] = r6
            goto L102
        L101:
            r2 = r6
        L102:
            y.k r2 = (y.k) r2
            if (r2 == 0) goto L11b
            y.i r1 = r0.f17407G
            if (r1 == 0) goto L116
            M5.w r1 = r0.l0()
            v.g r3 = new v.g
            r3.<init>(r0, r2, r6)
            M5.AbstractC0263y.t(r1, r6, r6, r3, r4)
        L116:
            B5.a r1 = r0.f17411K
            r1.invoke()
        L11b:
            if (r2 == 0) goto L126
        L11d:
            return r17
        L11e:
            int r11 = r11 + 8
            int r3 = r3 + r11
            r3 = r3 & r10
            r7 = r17
            goto L72
        L126:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1728x.K(android.view.KeyEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.y0
    public final void U() {
        y.f fVar;
        y.i iVar = this.f17407G;
        if (iVar != null && (fVar = this.f17416P) != null) {
            iVar.b(new y.g(fVar));
        }
        this.f17416P = null;
        C1731A c1731a = this.f17413M;
        if (c1731a != null) {
            c1731a.U();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.A0
    public final boolean Z() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // t0.c
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.E0
    public final Object o() {
        return this.f17421U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        if (!this.f17420T) {
            B0();
        }
        if (this.f17410J) {
            x0(this.f17412L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void q0() {
        A0();
        if (this.f17419S == null) {
            this.f17407G = null;
        }
        InterfaceC0048m interfaceC0048m = this.f17414N;
        if (interfaceC0048m != null) {
            y0(interfaceC0048m);
        }
        this.f17414N = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.y0
    public final void t(C1737f c1737f, EnumC1738g enumC1738g, long j) {
        long j7 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.f17418R = (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L);
        B0();
        if (this.f17410J && enumC1738g == EnumC1738g.f17455r) {
            int i = c1737f.f17453c;
            if (i == 4) {
                AbstractC0263y.t(l0(), null, null, new C1713h(this, null), 3);
            } else if (i == 5) {
                AbstractC0263y.t(l0(), null, null, new C1714i(this, null), 3);
            }
        }
        if (this.f17413M == null) {
            C0156j c0156j = new C0156j(2, this);
            C1737f c1737f2 = v0.u.f17495a;
            C1731A c1731a = new C1731A(null, null, c0156j);
            x0(c1731a);
            this.f17413M = c1731a;
        }
        C1731A c1731a2 = this.f17413M;
        if (c1731a2 != null) {
            c1731a2.t(c1737f, enumC1738g, j);
        }
    }
}
