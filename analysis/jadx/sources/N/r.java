package N;

import B0.C0029a;
import B0.C0050o;
import M.J0;
import P.C;
import P.C0345b;
import P.C0346b0;
import P.C0354f0;
import P.S;
import java.util.Collection;
import java.util.Iterator;
import u.InterfaceC1657k;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0029a f3968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.d f3969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1657k f3970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B5.c f3971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f3972e = new x();
    public final C0050o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0354f0 f3973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C f3974h;
    public final C i;
    public final C0346b0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0346b0 f3975k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0354f0 f3976l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0354f0 f3977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o f3978n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(J0 j02, C0029a c0029a, A0.d dVar, InterfaceC1657k interfaceC1657k, B5.c cVar) {
        this.f3968a = c0029a;
        this.f3969b = dVar;
        this.f3970c = interfaceC1657k;
        this.f3971d = cVar;
        C0050o c0050o = new C0050o();
        c0050o.f500r = this;
        c0050o.f499q = new q(this);
        this.f = c0050o;
        this.f3973g = C0345b.q(j02);
        this.f3974h = C0345b.m(new i(this, 4));
        this.i = C0345b.m(new i(this, 2));
        this.j = new C0346b0(Float.NaN);
        C0345b.n(new i(this, 3), S.f5377v);
        this.f3975k = new C0346b0(0.0f);
        this.f3976l = C0345b.q(null);
        this.f3977m = C0345b.q(new y(n5.t.f15300q));
        this.f3978n = new o(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r6, v.W r7, N.b r8, s5.c r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof N.l
            if (r0 == 0) goto L13
            r0 = r9
            N.l r0 = (N.l) r0
            int r1 = r0.f3954t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3954t = r1
            goto L18
        L13:
            N.l r0 = new N.l
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f3952r
            int r1 = r0.f3954t
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            N.r r6 = r0.f3951q
            m5.AbstractC1362a.e(r9)     // Catch: java.lang.Throwable -> L2a
            goto L61
        L2a:
            r7 = move-exception
            goto La3
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            m5.AbstractC1362a.e(r9)
            N.y r9 = r5.d()
            java.util.Map r9 = r9.f3997a
            boolean r9 = r9.containsKey(r6)
            if (r9 == 0) goto Ldd
            N.x r9 = r5.f3972e     // Catch: java.lang.Throwable -> La1
            N.n r1 = new N.n     // Catch: java.lang.Throwable -> La1
            r1.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> La1
            r0.f3951q = r5     // Catch: java.lang.Throwable -> La1
            r0.f3954t = r3     // Catch: java.lang.Throwable -> La1
            r9.getClass()     // Catch: java.lang.Throwable -> L9d
            N.w r6 = new N.w     // Catch: java.lang.Throwable -> L9d
            r6.<init>(r7, r9, r1, r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r6 = M5.AbstractC0263y.g(r6, r0)     // Catch: java.lang.Throwable -> L9d
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r6 != r7) goto L60
            return r7
        L60:
            r6 = r5
        L61:
            r6.h(r4)
            P.b0 r7 = r6.j
            N.y r8 = r6.d()
            float r9 = r7.e()
            java.lang.Object r8 = r8.a(r9)
            if (r8 == 0) goto Le0
            float r7 = r7.e()
            N.y r9 = r6.d()
            float r9 = r9.d(r8)
            float r7 = r7 - r9
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 > 0) goto Le0
            B5.c r7 = r6.f3971d
            java.lang.Object r7 = r7.invoke(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Le0
            r6.g(r8)
            goto Le0
        L9b:
            r7 = r6
            goto L9f
        L9d:
            r6 = move-exception
            goto L9b
        L9f:
            r6 = r5
            goto La3
        La1:
            r7 = move-exception
            goto L9f
        La3:
            r6.h(r4)
            P.b0 r8 = r6.j
            N.y r9 = r6.d()
            float r0 = r8.e()
            java.lang.Object r9 = r9.a(r0)
            if (r9 == 0) goto Ldc
            float r8 = r8.e()
            N.y r0 = r6.d()
            float r0 = r0.d(r9)
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto Ldc
            B5.c r8 = r6.f3971d
            java.lang.Object r8 = r8.invoke(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Ldc
            r6.g(r9)
        Ldc:
            throw r7
        Ldd:
            r5.g(r6)
        Le0:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N.r.a(java.lang.Object, v.W, N.b, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(v.W r6, N.p r7, s5.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof N.h
            if (r0 == 0) goto L13
            r0 = r8
            N.h r0 = (N.h) r0
            int r1 = r0.f3941t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3941t = r1
            goto L18
        L13:
            N.h r0 = new N.h
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f3939r
            int r1 = r0.f3941t
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            N.r r6 = r0.f3938q
            m5.AbstractC1362a.e(r8)     // Catch: java.lang.Throwable -> L29
            goto L54
        L29:
            r7 = move-exception
            goto L95
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            m5.AbstractC1362a.e(r8)
            N.x r8 = r5.f3972e     // Catch: java.lang.Throwable -> L93
            N.k r1 = new N.k     // Catch: java.lang.Throwable -> L93
            r4 = 0
            r1.<init>(r7, r5, r4)     // Catch: java.lang.Throwable -> L93
            r0.f3938q = r5     // Catch: java.lang.Throwable -> L93
            r0.f3941t = r3     // Catch: java.lang.Throwable -> L93
            r8.getClass()     // Catch: java.lang.Throwable -> L8f
            N.w r7 = new N.w     // Catch: java.lang.Throwable -> L8f
            r7.<init>(r6, r8, r1, r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r6 = M5.AbstractC0263y.g(r7, r0)     // Catch: java.lang.Throwable -> L8f
            r5.a r7 = r5.EnumC1580a.f16356q
            if (r6 != r7) goto L53
            return r7
        L53:
            r6 = r5
        L54:
            N.y r7 = r6.d()
            P.b0 r8 = r6.j
            float r0 = r8.e()
            java.lang.Object r7 = r7.a(r0)
            if (r7 == 0) goto L8a
            float r8 = r8.e()
            N.y r0 = r6.d()
            float r0 = r0.d(r7)
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L8a
            B5.c r8 = r6.f3971d
            java.lang.Object r8 = r8.invoke(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8a
            r6.g(r7)
        L8a:
            m5.y r6 = m5.C1386y.f15098a
            return r6
        L8d:
            r7 = r6
            goto L91
        L8f:
            r6 = move-exception
            goto L8d
        L91:
            r6 = r5
            goto L95
        L93:
            r7 = move-exception
            goto L91
        L95:
            N.y r8 = r6.d()
            P.b0 r0 = r6.j
            float r1 = r0.e()
            java.lang.Object r8 = r8.a(r1)
            if (r8 == 0) goto Lcb
            float r0 = r0.e()
            N.y r1 = r6.d()
            float r1 = r1.d(r8)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto Lcb
            B5.c r0 = r6.f3971d
            java.lang.Object r0 = r0.invoke(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcb
            r6.g(r8)
        Lcb:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N.r.b(v.W, N.p, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object c(float f, Object obj, float f7) {
        y yVarD = d();
        float fD = yVarD.d(obj);
        float fFloatValue = ((Number) this.f3969b.invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            C0029a c0029a = this.f3968a;
            if (fD < f) {
                if (f7 >= fFloatValue) {
                    Object objB = yVarD.b(f, true);
                    kotlin.jvm.internal.m.b(objB);
                    return objB;
                }
                Object objB2 = yVarD.b(f, true);
                kotlin.jvm.internal.m.b(objB2);
                if (f >= Math.abs(Math.abs(((Number) c0029a.invoke(Float.valueOf(Math.abs(yVarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f7 <= (-fFloatValue)) {
                    Object objB3 = yVarD.b(f, false);
                    kotlin.jvm.internal.m.b(objB3);
                    return objB3;
                }
                Object objB4 = yVarD.b(f, false);
                kotlin.jvm.internal.m.b(objB4);
                float fAbs = Math.abs(fD - Math.abs(((Number) c0029a.invoke(Float.valueOf(Math.abs(fD - yVarD.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final y d() {
        return (y) this.f3977m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float e(float f) {
        Float fValueOf;
        C0346b0 c0346b0 = this.j;
        float fE = (Float.isNaN(c0346b0.e()) ? 0.0f : c0346b0.e()) + f;
        float fC = d().c();
        Collection collectionValues = d().f3997a.values();
        kotlin.jvm.internal.m.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return D5.a.p(fE, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float f() {
        C0346b0 c0346b0 = this.j;
        if (Float.isNaN(c0346b0.e())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c0346b0.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Object obj) {
        this.f3973g.setValue(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(Object obj) {
        this.f3976l.setValue(obj);
    }
}
