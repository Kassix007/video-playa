package C0;

import android.graphics.Outline;
import android.os.Build;
import i0.C1131c;
import i0.C1132d;
import j0.AbstractC1145B;
import j0.C1152g;
import j0.InterfaceC1144A;

/* JADX INFO: loaded from: classes.dex */
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f892a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Outline f893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC1145B f894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1152g f895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1144A f896e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC1144A f898h;
    public C1132d i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f901m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public M0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f893b = outline;
        this.f899k = 0L;
        this.f900l = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(j0.m r14) {
        /*
            r13 = this;
            r13.e()
            j0.A r0 = r13.f896e
            if (r0 == 0) goto Lb
            r14.a(r0)
            return
        Lb:
            float r0 = r13.j
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 32
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 <= 0) goto Ld3
            j0.A r1 = r13.f898h
            i0.d r5 = r13.i
            if (r1 == 0) goto L75
            long r6 = r13.f899k
            long r8 = r13.f900l
            if (r5 == 0) goto L75
            boolean r10 = l6.d.w(r5)
            if (r10 != 0) goto L2c
            goto L75
        L2c:
            float r10 = r5.f13526a
            long r11 = r6 >> r2
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L75
            float r10 = r5.f13527b
            long r6 = r6 & r3
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 != 0) goto L75
            float r7 = r5.f13528c
            float r10 = java.lang.Float.intBitsToFloat(r11)
            long r11 = r8 >> r2
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r11 = r11 + r10
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L75
            float r7 = r5.f13529d
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r8 = r8 & r3
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 + r6
            int r6 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r6 != 0) goto L75
            long r5 = r5.f13530e
            long r5 = r5 >> r2
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L75
            goto Lcf
        L75:
            long r5 = r13.f899k
            long r5 = r5 >> r2
            int r0 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r0)
            long r6 = r13.f899k
            long r6 = r6 & r3
            int r0 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r0)
            long r7 = r13.f899k
            long r7 = r7 >> r2
            int r0 = (int) r7
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r7 = r13.f900l
            long r7 = r7 >> r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 + r0
            long r8 = r13.f899k
            long r8 = r8 & r3
            int r0 = (int) r8
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r8 = r13.f900l
            long r8 = r8 & r3
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 + r0
            float r0 = r13.j
            int r9 = java.lang.Float.floatToRawIntBits(r0)
            long r9 = (long) r9
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r11 = (long) r0
            long r9 = r9 << r2
            long r2 = r11 & r3
            long r9 = r9 | r2
            i0.d r0 = l6.d.h(r5, r6, r7, r8, r9)
            if (r1 != 0) goto Lc2
            j0.g r1 = j0.i.a()
            goto Lc8
        Lc2:
            r2 = r1
            j0.g r2 = (j0.C1152g) r2
            r2.d()
        Lc8:
            j0.InterfaceC1144A.a(r1, r0)
            r13.i = r0
            r13.f898h = r1
        Lcf:
            r14.a(r1)
            return
        Ld3:
            long r0 = r13.f899k
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r6 = java.lang.Float.intBitsToFloat(r0)
            long r0 = r13.f899k
            long r0 = r0 & r3
            int r0 = (int) r0
            float r7 = java.lang.Float.intBitsToFloat(r0)
            long r0 = r13.f899k
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r8 = r13.f900l
            long r1 = r8 >> r2
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r8 = r1 + r0
            long r0 = r13.f899k
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r1 = r13.f900l
            long r1 = r1 & r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r9 = r1 + r0
            r10 = 1
            r5 = r14
            r5.g(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.M0.a(j0.m):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Outline b() {
        e();
        if (this.f901m && this.f892a) {
            return this.f893b;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(long j) {
        AbstractC1145B abstractC1145B;
        if (this.f901m && (abstractC1145B = this.f894c) != null) {
            return W.l(abstractC1145B, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(AbstractC1145B abstractC1145B, float f, boolean z5, float f7, long j) {
        this.f893b.setAlpha(f);
        boolean zA = kotlin.jvm.internal.m.a(this.f894c, abstractC1145B);
        boolean z6 = !zA;
        if (!zA) {
            this.f894c = abstractC1145B;
            this.f = true;
        }
        this.f900l = j;
        boolean z7 = abstractC1145B != null && (z5 || f7 > 0.0f);
        if (this.f901m != z7) {
            this.f901m = z7;
            this.f = true;
        }
        return z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        if (this.f) {
            this.f899k = 0L;
            this.j = 0.0f;
            this.f896e = null;
            this.f = false;
            this.f897g = false;
            AbstractC1145B abstractC1145B = this.f894c;
            Outline outline = this.f893b;
            if (abstractC1145B == null || !this.f901m || Float.intBitsToFloat((int) (this.f900l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f900l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f892a = true;
            if (abstractC1145B instanceof j0.y) {
                C1131c c1131c = ((j0.y) abstractC1145B).f13731e;
                float f = c1131c.f13522a;
                float f7 = c1131c.f13523b;
                this.f899k = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                float f8 = c1131c.f13524c;
                float f9 = c1131c.f13525d;
                this.f900l = (((long) Float.floatToRawIntBits(f9 - f7)) & 4294967295L) | (Float.floatToRawIntBits(f8 - f) << 32);
                outline.setRect(Math.round(f), Math.round(f7), Math.round(f8), Math.round(f9));
                return;
            }
            if (!(abstractC1145B instanceof j0.z)) {
                if (abstractC1145B instanceof j0.x) {
                    f(((j0.x) abstractC1145B).f13730e);
                    return;
                }
                return;
            }
            C1132d c1132d = ((j0.z) abstractC1145B).f13732e;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (c1132d.f13530e >> 32));
            float f10 = c1132d.f13526a;
            float f11 = c1132d.f13527b;
            this.f899k = (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
            float fB = c1132d.b();
            this.f900l = (((long) Float.floatToRawIntBits(c1132d.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            if (l6.d.w(c1132d)) {
                this.f893b.setRoundRect(Math.round(f10), Math.round(f11), Math.round(c1132d.f13528c), Math.round(c1132d.f13529d), fIntBitsToFloat);
                this.j = fIntBitsToFloat;
                return;
            }
            C1152g c1152gA = this.f895d;
            if (c1152gA == null) {
                c1152gA = j0.i.a();
                this.f895d = c1152gA;
            }
            c1152gA.d();
            InterfaceC1144A.a(c1152gA, c1132d);
            f(c1152gA);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(InterfaceC1144A interfaceC1144A) {
        int i = Build.VERSION.SDK_INT;
        Outline outline = this.f893b;
        if (i > 28 || ((C1152g) interfaceC1144A).f13707a.isConvex()) {
            if (i >= 30) {
                N0.f903a.a(outline, interfaceC1144A);
            } else {
                if (!(interfaceC1144A instanceof C1152g)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((C1152g) interfaceC1144A).f13707a);
            }
            this.f897g = !outline.canClip();
        } else {
            this.f892a = false;
            outline.setEmpty();
            this.f897g = true;
        }
        this.f896e = interfaceC1144A;
    }
}
