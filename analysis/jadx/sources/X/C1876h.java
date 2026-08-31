package x;

import q5.InterfaceC1524c;
import u.C1649f0;
import u.C1667v;
import w.AbstractC1802p0;
import w.C0;
import w.C1777d;
import w.C1792k0;
import w.I;

/* JADX INFO: renamed from: x.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1876h implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3.l f18304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1667v f18305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1649f0 f18306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1792k0 f18307d = AbstractC1802p0.f18042b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1876h(v3.l lVar, C1667v c1667v, C1649f0 c1649f0) {
        this.f18304a = lVar;
        this.f18305b = c1667v;
        this.f18306c = c1649f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(x.C1876h r4, w.InterfaceC1788i0 r5, float r6, float r7, x.C1872d r8, s5.c r9) {
        /*
            boolean r0 = r9 instanceof x.C1875g
            if (r0 == 0) goto L14
            r0 = r9
            x.g r0 = (x.C1875g) r0
            int r1 = r0.f18303s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f18303s = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            x.g r0 = new x.g
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.f18301q
            int r1 = r9.f18303s
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            m5.AbstractC1362a.e(r0)
            goto L9f
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L30:
            m5.AbstractC1362a.e(r0)
            float r0 = java.lang.Math.abs(r6)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3d
            goto L45
        L3d:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4c
        L45:
            r4 = 28
            u.l r4 = u.AbstractC1644d.a(r6, r7, r4)
            return r4
        L4c:
            r9.f18303s = r2
            u.v r0 = r4.f18305b
            Z.m r2 = u.A0.f16746a
            E.c0 r2 = new E.c0
            i3.a r3 = r0.f17068a
            r2.<init>(r3)
            u.m r3 = new u.m
            r3.<init>(r1)
            u.m r1 = new u.m
            r1.<init>(r7)
            u.q r1 = r2.t(r3, r1)
            u.m r1 = (u.C1659m) r1
            float r1 = r1.f16972a
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L80
            i1.a r4 = new i1.a
            r1 = 16
            r4.<init>(r1, r0)
        L7e:
            r0 = r6
            goto L8b
        L80:
            i3.a r0 = new i3.a
            u.f0 r4 = r4.f18306c
            r1 = 17
            r0.<init>(r1, r4)
            r4 = r0
            goto L7e
        L8b:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.q(r5, r6, r7, r8, r9)
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r0 != r4) goto L9f
            return r4
        L9f:
            x.a r0 = (x.C1869a) r0
            u.l r4 = r0.f18284b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1876h.b(x.h, w.i0, float, float, x.d, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.I
    public Object a(C0 c02, float f, InterfaceC1524c interfaceC1524c) {
        return d(c02, f, C1777d.f17943v, (s5.c) interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(w.InterfaceC1788i0 r10, float r11, B5.c r12, s5.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof x.C1871c
            if (r0 == 0) goto L13
            r0 = r13
            x.c r0 = (x.C1871c) r0
            int r1 = r0.f18288t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18288t = r1
            goto L18
        L13:
            x.c r0 = new x.c
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f18286r
            int r1 = r0.f18288t
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            B5.c r12 = r0.f18285q
            m5.AbstractC1362a.e(r13)
            r4 = r9
            goto L4d
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            m5.AbstractC1362a.e(r13)
            x.e r3 = new x.e
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f18285q = r6
            r0.f18288t = r2
            w.k0 r10 = r4.f18307d
            java.lang.Object r13 = M5.AbstractC0263y.B(r10, r3, r0)
            r5.a r10 = r5.EnumC1580a.f16356q
            if (r13 != r10) goto L4c
            return r10
        L4c:
            r12 = r6
        L4d:
            x.a r13 = (x.C1869a) r13
            java.lang.Float r10 = new java.lang.Float
            r11 = 0
            r10.<init>(r11)
            r12.invoke(r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1876h.c(w.i0, float, B5.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(w.InterfaceC1788i0 r5, float r6, B5.c r7, s5.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof x.C1874f
            if (r0 == 0) goto L13
            r0 = r8
            x.f r0 = (x.C1874f) r0
            int r1 = r0.f18300s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18300s = r1
            goto L18
        L13:
            x.f r0 = new x.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f18298q
            int r1 = r0.f18300s
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            m5.AbstractC1362a.e(r8)
            goto L3b
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            m5.AbstractC1362a.e(r8)
            r0.f18300s = r2
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r8 != r5) goto L3b
            return r5
        L3b:
            x.a r8 = (x.C1869a) r8
            java.lang.Float r5 = r8.f18283a
            float r5 = r5.floatValue()
            u.l r6 = r8.f18284b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L55
        L4b:
            java.lang.Object r5 = r6.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L55:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1876h.d(w.i0, float, B5.c, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1876h)) {
            return false;
        }
        C1876h c1876h = (C1876h) obj;
        return c1876h.f18306c.equals(this.f18306c) && kotlin.jvm.internal.m.a(c1876h.f18305b, this.f18305b) && c1876h.f18304a.equals(this.f18304a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18304a.hashCode() + ((this.f18305b.hashCode() + (this.f18306c.hashCode() * 31)) * 31);
    }
}
