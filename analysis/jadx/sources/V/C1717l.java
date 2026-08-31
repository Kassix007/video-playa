package v;

import B0.AbstractC0049n;
import F.C0156j;
import P.C0354f0;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import i0.C1133e;
import j0.AbstractC1145B;
import m5.C1386y;
import n5.AbstractC1397A;
import v0.C1731A;
import v0.C1737f;

/* JADX INFO: renamed from: v.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1717l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W0.c f17354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17355b = 9205357640488583168L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f17356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0354f0 f17357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17358e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17360h;
    public final AbstractC0049n i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1717l(Context context, W0.c cVar, long j, A.L l7) {
        this.f17354a = cVar;
        E e7 = new E(context, AbstractC1145B.v(j));
        this.f17356c = e7;
        this.f17357d = new C0354f0(C1386y.f15098a, P.S.f5374s);
        this.f17358e = true;
        this.f17359g = 0L;
        this.f17360h = -1L;
        C0156j c0156j = new C0156j(3, this);
        C1737f c1737f = v0.u.f17495a;
        C1731A c1731a = new C1731A(null, null, c0156j);
        this.i = Build.VERSION.SDK_INT >= 31 ? new L(c1731a, this, e7) : new L(c1731a, this, e7, l7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        boolean z5;
        E e7 = this.f17356c;
        EdgeEffect edgeEffect = e7.f17230d;
        boolean z6 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = !edgeEffect.isFinished();
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = e7.f17231e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 = !edgeEffect2.isFinished() || z5;
        }
        EdgeEffect edgeEffect3 = e7.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 = !edgeEffect3.isFinished() || z5;
        }
        EdgeEffect edgeEffect4 = e7.f17232g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z5) {
                z6 = false;
            }
            z5 = z6;
        }
        if (z5) {
            d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r18, w.F0 r20, s5.c r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r4 = r21
            boolean r5 = r4 instanceof v.C1715j
            if (r5 == 0) goto L1b
            r5 = r4
            v.j r5 = (v.C1715j) r5
            int r6 = r5.f17350u
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1b
            int r6 = r6 - r7
            r5.f17350u = r6
            goto L20
        L1b:
            v.j r5 = new v.j
            r5.<init>(r0, r4)
        L20:
            java.lang.Object r4 = r5.f17348s
            int r6 = r5.f17350u
            m5.y r7 = m5.C1386y.f15098a
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L44
            if (r6 == r9) goto L40
            if (r6 != r8) goto L38
            long r1 = r5.f17347r
            v.l r3 = r5.f17346q
            m5.AbstractC1362a.e(r4)
            goto L13e
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            m5.AbstractC1362a.e(r4)
            return r7
        L44:
            m5.AbstractC1362a.e(r4)
            long r11 = r0.f17359g
            boolean r4 = i0.C1133e.e(r11)
            r5.a r6 = r5.EnumC1580a.f16356q
            if (r4 == 0) goto L68
            r5.f17350u = r9
            r3.getClass()
            w.F0 r4 = new w.F0
            w.H0 r3 = r3.f17776t
            r4.<init>(r3, r5)
            r4.f17775s = r1
            java.lang.Object r1 = r4.invokeSuspend(r7)
            if (r1 != r6) goto L67
            goto L13c
        L67:
            return r7
        L68:
            v.E r4 = r0.f17356c
            android.widget.EdgeEffect r9 = r4.f
            boolean r9 = v.E.g(r9)
            r11 = 32
            W0.c r12 = r0.f17354a
            if (r9 == 0) goto L93
            float r9 = W0.p.b(r1)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L93
            android.widget.EdgeEffect r9 = r4.c()
            float r13 = W0.p.b(r1)
            long r14 = r0.f17359g
            long r14 = r14 >> r11
            int r11 = (int) r14
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r9 = C3.a.l(r9, r13, r11, r12)
            goto Lbb
        L93:
            android.widget.EdgeEffect r9 = r4.f17232g
            boolean r9 = v.E.g(r9)
            if (r9 == 0) goto Lba
            float r9 = W0.p.b(r1)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto Lba
            android.widget.EdgeEffect r9 = r4.d()
            float r13 = W0.p.b(r1)
            float r13 = -r13
            long r14 = r0.f17359g
            long r14 = r14 >> r11
            int r11 = (int) r14
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r9 = C3.a.l(r9, r13, r11, r12)
            float r9 = -r9
            goto Lbb
        Lba:
            r9 = r10
        Lbb:
            android.widget.EdgeEffect r11 = r4.f17230d
            boolean r11 = v.E.g(r11)
            if (r11 == 0) goto Le5
            float r11 = W0.p.c(r1)
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto Le5
            android.widget.EdgeEffect r4 = r4.e()
            float r11 = W0.p.c(r1)
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r0.f17359g
            long r13 = r13 & r15
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r4 = C3.a.l(r4, r11, r13, r12)
            goto L112
        Le5:
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            android.widget.EdgeEffect r11 = r4.f17231e
            boolean r11 = v.E.g(r11)
            if (r11 == 0) goto L111
            float r11 = W0.p.c(r1)
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 <= 0) goto L111
            android.widget.EdgeEffect r4 = r4.b()
            float r11 = W0.p.c(r1)
            float r11 = -r11
            long r13 = r0.f17359g
            long r13 = r13 & r15
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r4 = C3.a.l(r4, r11, r13, r12)
            float r4 = -r4
            goto L112
        L111:
            r4 = r10
        L112:
            long r11 = l6.d.i(r9, r4)
            r13 = 0
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 != 0) goto L11d
            goto L120
        L11d:
            r0.d()
        L120:
            long r1 = W0.p.d(r1, r11)
            r5.f17346q = r0
            r5.f17347r = r1
            r5.f17350u = r8
            r3.getClass()
            w.F0 r4 = new w.F0
            w.H0 r3 = r3.f17776t
            r4.<init>(r3, r5)
            r4.f17775s = r1
            java.lang.Object r4 = r4.invokeSuspend(r7)
            if (r4 != r6) goto L13d
        L13c:
            return r6
        L13d:
            r3 = r0
        L13e:
            W0.p r4 = (W0.p) r4
            long r4 = r4.f8030a
            long r1 = W0.p.d(r1, r4)
            r4 = 0
            r3.f = r4
            v.E r4 = r3.f17356c
            float r5 = W0.p.b(r1)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            r6 = 31
            if (r5 <= 0) goto L173
            android.widget.EdgeEffect r5 = r4.c()
            float r8 = W0.p.b(r1)
            int r8 = D5.a.G(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r6) goto L169
            r5.onAbsorb(r8)
            goto L199
        L169:
            boolean r9 = r5.isFinished()
            if (r9 == 0) goto L199
            r5.onAbsorb(r8)
            goto L199
        L173:
            float r5 = W0.p.b(r1)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L199
            android.widget.EdgeEffect r5 = r4.d()
            float r8 = W0.p.b(r1)
            int r8 = D5.a.G(r8)
            int r8 = -r8
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r6) goto L190
            r5.onAbsorb(r8)
            goto L199
        L190:
            boolean r9 = r5.isFinished()
            if (r9 == 0) goto L199
            r5.onAbsorb(r8)
        L199:
            float r5 = W0.p.c(r1)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L1bf
            android.widget.EdgeEffect r4 = r4.e()
            float r1 = W0.p.c(r1)
            int r1 = D5.a.G(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L1b5
            r4.onAbsorb(r1)
            goto L1e5
        L1b5:
            boolean r2 = r4.isFinished()
            if (r2 == 0) goto L1e5
            r4.onAbsorb(r1)
            goto L1e5
        L1bf:
            float r5 = W0.p.c(r1)
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L1e5
            android.widget.EdgeEffect r4 = r4.b()
            float r1 = W0.p.c(r1)
            int r1 = D5.a.G(r1)
            int r1 = -r1
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r6) goto L1dc
            r4.onAbsorb(r1)
            goto L1e5
        L1dc:
            boolean r2 = r4.isFinished()
            if (r2 == 0) goto L1e5
            r4.onAbsorb(r1)
        L1e5:
            r3.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1717l.b(long, w.F0, s5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c() {
        long jR = this.f17355b;
        if ((9223372034707292159L & jR) == 9205357640488583168L) {
            jR = AbstractC1397A.r(this.f17359g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR >> 32)) / Float.intBitsToFloat((int) (this.f17359g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jR & 4294967295L)) / Float.intBitsToFloat((int) (this.f17359g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (this.f17358e) {
            this.f17357d.setValue(C1386y.f15098a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f17359g & 4294967295L));
        EdgeEffect edgeEffectB = this.f17356c.b();
        float fC = -fIntBitsToFloat2;
        float f = 1 - fIntBitsToFloat;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            fC = AbstractC1720o.c(edgeEffectB, fC, f);
        } else {
            edgeEffectB.onPull(fC, f);
        }
        return (i7 >= 31 ? AbstractC1720o.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f17359g)) * (-fC) : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f17359g >> 32));
        EdgeEffect edgeEffectC = this.f17356c.c();
        float f = 1 - fIntBitsToFloat;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            fIntBitsToFloat2 = AbstractC1720o.c(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i7 >= 31 ? AbstractC1720o.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f17359g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f17359g >> 32));
        EdgeEffect edgeEffectD = this.f17356c.d();
        float fC = -fIntBitsToFloat2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            fC = AbstractC1720o.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i7 >= 31 ? AbstractC1720o.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f17359g >> 32)) * (-fC) : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f17359g & 4294967295L));
        EdgeEffect edgeEffectE = this.f17356c.e();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            fIntBitsToFloat2 = AbstractC1720o.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i7 >= 31 ? AbstractC1720o.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f17359g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(long j) {
        boolean zA = C1133e.a(this.f17359g, 0L);
        boolean zA2 = C1133e.a(j, this.f17359g);
        this.f17359g = j;
        if (!zA2) {
            int iG = D5.a.G(Float.intBitsToFloat((int) (j >> 32)));
            long jG = (((long) D5.a.G(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iG) << 32);
            E e7 = this.f17356c;
            e7.f17229c = jG;
            EdgeEffect edgeEffect = e7.f17230d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jG >> 32), (int) (jG & 4294967295L));
            }
            EdgeEffect edgeEffect2 = e7.f17231e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jG >> 32), (int) (jG & 4294967295L));
            }
            EdgeEffect edgeEffect3 = e7.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jG & 4294967295L), (int) (jG >> 32));
            }
            EdgeEffect edgeEffect4 = e7.f17232g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jG & 4294967295L), (int) (jG >> 32));
            }
            EdgeEffect edgeEffect5 = e7.f17233h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jG >> 32), (int) (jG & 4294967295L));
            }
            EdgeEffect edgeEffect6 = e7.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jG >> 32), (int) (jG & 4294967295L));
            }
            EdgeEffect edgeEffect7 = e7.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jG & 4294967295L), (int) (jG >> 32));
            }
            EdgeEffect edgeEffect8 = e7.f17234k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jG), (int) (jG >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
