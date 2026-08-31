package p0;

import P.C0345b;
import P.C0354f0;
import i0.C1133e;
import l0.InterfaceC1221d;

/* JADX INFO: renamed from: p0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1430D extends AbstractC1428B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1435c f15478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1433a f15481e;
    public kotlin.jvm.internal.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0354f0 f15482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0.j f15483h;
    public final C0354f0 i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1429C f15486m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1430D(C1435c c1435c) {
        this.f15478b = c1435c;
        c1435c.i = new C1429C(this, 0);
        this.f15479c = "";
        this.f15480d = true;
        this.f15481e = new C1433a();
        this.f = C1438f.f15558s;
        this.f15482g = C0345b.q(null);
        this.i = C0345b.q(new C1133e(0L));
        this.j = 9205357640488583168L;
        this.f15484k = 1.0f;
        this.f15485l = 1.0f;
        this.f15486m = new C1429C(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p0.AbstractC1428B
    public final void a(InterfaceC1221d interfaceC1221d) {
        e(interfaceC1221d, 1.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(l0.InterfaceC1221d r33, float r34, j0.j r35) {
        /*
            r32 = this;
            r0 = r32
            r1 = r35
            p0.c r2 = r0.f15478b
            boolean r3 = r2.f15528d
            r4 = 5
            P.f0 r5 = r0.f15482g
            r6 = 1
            if (r3 == 0) goto L3d
            long r8 = r2.f15529e
            r10 = 16
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r5.getValue()
            j0.j r3 = (j0.j) r3
            int r8 = p0.AbstractC1432F.f15497a
            boolean r8 = r3 instanceof j0.j
            r9 = 3
            if (r8 == 0) goto L2b
            int r3 = r3.f13713c
            if (r3 != r4) goto L28
            goto L2d
        L28:
            if (r3 != r9) goto L3d
            goto L2d
        L2b:
            if (r3 != 0) goto L3d
        L2d:
            boolean r3 = r1 instanceof j0.j
            if (r3 == 0) goto L39
            int r3 = r1.f13713c
            if (r3 != r4) goto L36
            goto L3b
        L36:
            if (r3 != r9) goto L3d
            goto L3b
        L39:
            if (r1 != 0) goto L3d
        L3b:
            r3 = r6
            goto L3e
        L3d:
            r3 = 0
        L3e:
            boolean r8 = r0.f15480d
            p0.a r9 = r0.f15481e
            if (r8 != 0) goto L5e
            long r10 = r0.j
            long r12 = r33.d()
            boolean r8 = i0.C1133e.a(r10, r12)
            if (r8 == 0) goto L5e
            j0.e r8 = r9.f15519a
            if (r8 == 0) goto L59
            int r8 = r8.a()
            goto L5a
        L59:
            r8 = 0
        L5a:
            if (r3 != r8) goto L5e
            goto L170
        L5e:
            if (r3 != r6) goto L68
            long r10 = r2.f15529e
            j0.j r2 = new j0.j
            r2.<init>(r10, r4)
            goto L69
        L68:
            r2 = 0
        L69:
            r0.f15483h = r2
            long r10 = r33.d()
            r2 = 32
            long r10 = r10 >> r2
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            P.f0 r6 = r0.i
            java.lang.Object r8 = r6.getValue()
            i0.e r8 = (i0.C1133e) r8
            long r10 = r8.f13533a
            long r10 = r10 >> r2
            int r8 = (int) r10
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r4 = r4 / r8
            r0.f15484k = r4
            long r10 = r33.d()
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Object r6 = r6.getValue()
            i0.e r6 = (i0.C1133e) r6
            long r10 = r6.f13533a
            long r10 = r10 & r12
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r4 = r4 / r6
            r0.f15485l = r4
            long r10 = r33.d()
            long r10 = r10 >> r2
            int r4 = (int) r10
            float r4 = java.lang.Float.intBitsToFloat(r4)
            double r10 = (double) r4
            double r10 = java.lang.Math.ceil(r10)
            float r4 = (float) r10
            int r4 = (int) r4
            long r10 = r33.d()
            long r10 = r10 & r12
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            float r6 = (float) r10
            int r6 = (int) r6
            long r10 = (long) r4
            long r10 = r10 << r2
            long r14 = (long) r6
            long r14 = r14 & r12
            long r10 = r10 | r14
            W0.l r4 = r33.getLayoutDirection()
            j0.e r6 = r9.f15519a
            j0.b r8 = r9.f15520b
            if (r6 == 0) goto Lfa
            if (r8 == 0) goto Lfa
            long r14 = r10 >> r2
            int r14 = (int) r14
            android.graphics.Bitmap r15 = r6.f13704a
            r16 = r2
            int r2 = r15.getWidth()
            r17 = r12
            if (r14 > r2) goto Lfe
            long r12 = r10 & r17
            int r2 = (int) r12
            int r12 = r15.getHeight()
            if (r2 > r12) goto Lfe
            int r2 = r9.f15522d
            if (r2 != r3) goto Lfe
            goto L11e
        Lfa:
            r16 = r2
            r17 = r12
        Lfe:
            long r12 = r10 >> r16
            int r2 = (int) r12
            long r12 = r10 & r17
            int r6 = (int) r12
            j0.e r6 = j0.AbstractC1145B.e(r2, r6, r3)
            android.graphics.Canvas r2 = j0.AbstractC1148c.f13699a
            j0.b r8 = new j0.b
            r8.<init>()
            android.graphics.Canvas r2 = new android.graphics.Canvas
            android.graphics.Bitmap r12 = r6.f13704a
            r2.<init>(r12)
            r8.f13696a = r2
            r9.f15519a = r6
            r9.f15520b = r8
            r9.f15522d = r3
        L11e:
            r9.f15521c = r10
            l0.b r12 = r9.f15523e
            long r2 = com.google.android.gms.internal.measurement.P1.d0(r10)
            l0.a r10 = r12.f14424q
            W0.c r11 = r10.f14420a
            W0.l r13 = r10.f14421b
            j0.m r14 = r10.f14422c
            r21 = r8
            long r7 = r10.f14423d
            r15 = r33
            r10.f14420a = r15
            r10.f14421b = r4
            r4 = r21
            r10.f14422c = r4
            r10.f14423d = r2
            r4.k()
            r2 = r13
            r3 = r14
            long r13 = j0.o.f13718b
            r19 = 0
            r20 = 62
            r15 = 0
            r17 = 0
            l0.InterfaceC1221d.g0(r12, r13, r15, r17, r19, r20)
            p0.C r10 = r0.f15486m
            r10.invoke(r12)
            r4.i()
            l0.a r4 = r12.f14424q
            r4.f14420a = r11
            r4.f14421b = r2
            r4.f14422c = r3
            r4.f14423d = r7
            android.graphics.Bitmap r2 = r6.f13704a
            r2.prepareToDraw()
            r2 = 0
            r0.f15480d = r2
            long r2 = r33.d()
            r0.j = r2
        L170:
            if (r1 == 0) goto L175
        L172:
            r29 = r1
            goto L187
        L175:
            java.lang.Object r1 = r5.getValue()
            j0.j r1 = (j0.j) r1
            if (r1 == 0) goto L184
            java.lang.Object r1 = r5.getValue()
            j0.j r1 = (j0.j) r1
            goto L172
        L184:
            j0.j r1 = r0.f15483h
            goto L172
        L187:
            j0.e r1 = r9.f15519a
            if (r1 == 0) goto L18c
            goto L191
        L18c:
            java.lang.String r2 = "drawCachedImage must be invoked first before attempting to draw the result into another destination"
            y0.AbstractC1904a.b(r2)
        L191:
            long r2 = r9.f15521c
            r30 = 0
            r31 = 858(0x35a, float:1.202E-42)
            r26 = 0
            r22 = r33
            r28 = r34
            r23 = r1
            r24 = r2
            l0.InterfaceC1221d.y(r22, r23, r24, r26, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1430D.e(l0.d, float, j0.j):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f15479c);
        sb.append("\n\tviewportWidth: ");
        C0354f0 c0354f0 = this.i;
        sb.append(Float.intBitsToFloat((int) (((C1133e) c0354f0.getValue()).f13533a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C1133e) c0354f0.getValue()).f13533a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
