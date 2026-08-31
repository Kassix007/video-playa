package w;

import B0.AbstractC0041g;
import i0.C1130b;
import m0.C1346a;
import m5.C1386y;
import r5.EnumC1580a;
import v.C1717l;

/* JADX INFO: loaded from: classes.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A0 f17790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1717l f17791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I f17792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EnumC1778d0 f17793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17794e;
    public u0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v.F f17795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17796h;
    public int i = 1;
    public InterfaceC1788i0 j = AbstractC1802p0.f18041a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E0 f17797k = new E0(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1346a f17798l = new C1346a(10, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H0(A0 a02, C1717l c1717l, I i, EnumC1778d0 enumC1778d0, boolean z5, u0.d dVar, v.F f) {
        this.f17790a = a02;
        this.f17791b = c1717l;
        this.f17792c = i;
        this.f17793d = enumC1778d0;
        this.f17794e = z5;
        this.f = dVar;
        this.f17795g = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(H0 h02, InterfaceC1788i0 interfaceC1788i0, long j, int i) {
        u0.g gVar = h02.f.f17095a;
        u0.g gVar2 = null;
        u0.g gVar3 = (gVar == null || !gVar.f10099D) ? null : (u0.g) AbstractC0041g.j(gVar);
        long jB0 = gVar3 != null ? gVar3.b0(i, j) : 0L;
        long jD = C1130b.d(j, jB0);
        long jE = h02.e(h02.h(interfaceC1788i0.a(h02.g(h02.e(C1130b.a(h02.f17793d == EnumC1778d0.f17946r ? 1 : 2, jD))))));
        long jD2 = C1130b.d(jD, jE);
        u0.g gVar4 = h02.f.f17095a;
        if (gVar4 != null && gVar4.f10099D) {
            gVar2 = (u0.g) AbstractC0041g.j(gVar4);
        }
        u0.g gVar5 = gVar2;
        return C1130b.e(C1130b.e(jB0, jE), gVar5 != null ? gVar5.F(i, jE, jD2) : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, s5.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof w.B0
            if (r0 == 0) goto L13
            r0 = r12
            w.B0 r0 = (w.B0) r0
            int r1 = r0.f17743u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17743u = r1
            goto L18
        L13:
            w.B0 r0 = new w.B0
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f17741s
            int r1 = r0.f17743u
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.jvm.internal.x r10 = r0.f17740r
            w.H0 r11 = r0.f17739q
            m5.AbstractC1362a.e(r12)
            r4 = r9
            goto L59
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            m5.AbstractC1362a.e(r12)
            kotlin.jvm.internal.x r5 = new kotlin.jvm.internal.x
            r5.<init>()
            r5.f14267q = r10
            r9.f17796h = r2
            w.D0 r3 = new w.D0
            r8 = 0
            r4 = r9
            r6 = r10
            r3.<init>(r4, r5, r6, r8)
            r0.f17739q = r4
            r0.f17740r = r5
            r0.f17743u = r2
            v.W r10 = v.W.f17278q
            java.lang.Object r10 = r9.f(r10, r3, r0)
            r5.a r11 = r5.EnumC1580a.f16356q
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r4
            r10 = r5
        L59:
            r12 = 0
            r11.f17796h = r12
            long r10 = r10.f14267q
            W0.p r12 = new W0.p
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w.H0.b(long, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(long j, boolean z5, s5.i iVar) {
        C1386y c1386y = C1386y.f15098a;
        if (z5) {
            return c1386y;
        }
        long jA = W0.p.a(j, 0.0f, 0.0f, this.f17793d == EnumC1778d0.f17946r ? 1 : 2);
        F0 f02 = new F0(this, null);
        C1717l c1717l = this.f17791b;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (c1717l == null || !(this.f17790a.c() || this.f17790a.a())) {
            F0 f03 = new F0(f02.f17776t, iVar);
            f03.f17775s = jA;
            Object objInvokeSuspend = f03.invokeSuspend(c1386y);
            if (objInvokeSuspend == enumC1580a) {
                return objInvokeSuspend;
            }
        } else {
            Object objB = c1717l.b(jA, f02, iVar);
            if (objB == enumC1580a) {
                return objB;
            }
        }
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d(float f) {
        return this.f17794e ? f * (-1) : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long e(long j) {
        return this.f17794e ? C1130b.f(j, -1.0f) : j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object f(v.W w3, B5.e eVar, s5.c cVar) {
        Object objE = this.f17790a.e(w3, new G0(this, eVar, null), cVar);
        return objE == EnumC1580a.f16356q ? objE : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.f17793d == EnumC1778d0.f17946r ? j >> 32 : j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long h(float f) {
        long jFloatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f17793d == EnumC1778d0.f17946r) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }
}
