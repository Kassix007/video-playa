package e1;

import d1.C0952c;
import d1.C0953d;

/* JADX INFO: renamed from: e1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1035o implements InterfaceC1024d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0953d f12540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1032l f12541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1027g f12543e = new C1027g(this);
    public int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12544g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1026f f12545h = new C1026f(this);
    public final C1026f i = new C1026f(this);
    public int j = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1035o(C0953d c0953d) {
        this.f12540b = c0953d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(C1026f c1026f, C1026f c1026f2, int i) {
        c1026f.f12526l.add(c1026f2);
        c1026f.f = i;
        c1026f2.f12525k.add(c1026f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1026f h(C0952c c0952c) {
        C0952c c0952c2 = c0952c.f;
        if (c0952c2 == null) {
            return null;
        }
        C0953d c0953d = c0952c2.f11820d;
        int iA = O.c.a(c0952c2.f11821e);
        if (iA == 1) {
            return c0953d.f11856d.f12545h;
        }
        if (iA == 2) {
            return c0953d.f11858e.f12545h;
        }
        if (iA == 3) {
            return c0953d.f11856d.i;
        }
        if (iA == 4) {
            return c0953d.f11858e.i;
        }
        if (iA != 5) {
            return null;
        }
        return c0953d.f11858e.f12532k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1026f i(C0952c c0952c, int i) {
        C0952c c0952c2 = c0952c.f;
        if (c0952c2 == null) {
            return null;
        }
        C0953d c0953d = c0952c2.f11820d;
        AbstractC1035o abstractC1035o = i == 0 ? c0953d.f11856d : c0953d.f11858e;
        int iA = O.c.a(c0952c2.f11821e);
        if (iA == 1 || iA == 2) {
            return abstractC1035o.f12545h;
        }
        if (iA == 3 || iA == 4) {
            return abstractC1035o.i;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(C1026f c1026f, C1026f c1026f2, int i, C1027g c1027g) {
        c1026f.f12526l.add(c1026f2);
        c1026f.f12526l.add(this.f12543e);
        c1026f.f12524h = i;
        c1026f.i = c1027g;
        c1026f2.f12525k.add(c1026f);
        c1027g.f12525k.add(c1026f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(int i, int i7) {
        if (i7 == 0) {
            C0953d c0953d = this.f12540b;
            int i8 = c0953d.f11884v;
            int iMax = Math.max(c0953d.f11883u, i);
            if (i8 > 0) {
                iMax = Math.min(i8, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C0953d c0953d2 = this.f12540b;
            int i9 = c0953d2.f11887y;
            int iMax2 = Math.max(c0953d2.f11886x, i);
            if (i9 > 0) {
                iMax2 = Math.min(i9, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long j() {
        if (this.f12543e.j) {
            return r0.f12523g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(d1.C0952c r12, d1.C0952c r13, int r14) {
        /*
            r11 = this;
            e1.f r0 = h(r12)
            e1.f r1 = h(r13)
            boolean r2 = r0.j
            if (r2 == 0) goto Le9
            boolean r2 = r1.j
            if (r2 != 0) goto L12
            goto Le9
        L12:
            int r2 = r0.f12523g
            int r12 = r12.e()
            int r12 = r12 + r2
            int r2 = r1.f12523g
            int r13 = r13.e()
            int r2 = r2 - r13
            int r13 = r2 - r12
            e1.g r3 = r11.f12543e
            boolean r4 = r3.j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto Lb0
            int r4 = r11.f12542d
            r6 = 3
            if (r4 != r6) goto Lb0
            int r4 = r11.f12539a
            if (r4 == 0) goto La9
            r7 = 1
            if (r4 == r7) goto L9b
            r8 = 2
            if (r4 == r8) goto L73
            if (r4 == r6) goto L3d
            goto Lb0
        L3d:
            d1.d r4 = r11.f12540b
            e1.k r8 = r4.f11856d
            int r9 = r8.f12542d
            if (r9 != r6) goto L54
            int r9 = r8.f12539a
            if (r9 != r6) goto L54
            e1.m r9 = r4.f11858e
            int r10 = r9.f12542d
            if (r10 != r6) goto L54
            int r9 = r9.f12539a
            if (r9 != r6) goto L54
            goto Lb0
        L54:
            if (r14 != 0) goto L58
            e1.m r8 = r4.f11858e
        L58:
            e1.g r6 = r8.f12543e
            boolean r8 = r6.j
            if (r8 == 0) goto Lb0
            float r4 = r4.f11846W
            if (r14 != r7) goto L69
            int r6 = r6.f12523g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L6f
        L69:
            int r6 = r6.f12523g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L6f:
            r3.d(r4)
            goto Lb0
        L73:
            d1.d r4 = r11.f12540b
            d1.d r6 = r4.f11843T
            if (r6 == 0) goto Lb0
            if (r14 != 0) goto L7e
            e1.k r6 = r6.f11856d
            goto L80
        L7e:
            e1.m r6 = r6.f11858e
        L80:
            e1.g r6 = r6.f12543e
            boolean r7 = r6.j
            if (r7 == 0) goto Lb0
            if (r14 != 0) goto L8b
            float r4 = r4.f11885w
            goto L8d
        L8b:
            float r4 = r4.f11888z
        L8d:
            int r6 = r6.f12523g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r11.g(r4, r14)
            r3.d(r4)
            goto Lb0
        L9b:
            int r4 = r3.f12527m
            int r4 = r11.g(r4, r14)
            int r4 = java.lang.Math.min(r4, r13)
            r3.d(r4)
            goto Lb0
        La9:
            int r4 = r11.g(r13, r14)
            r3.d(r4)
        Lb0:
            boolean r4 = r3.j
            if (r4 != 0) goto Lb5
            goto Le9
        Lb5:
            int r4 = r3.f12523g
            e1.f r6 = r11.i
            e1.f r7 = r11.f12545h
            if (r4 != r13) goto Lc4
            r7.d(r12)
            r6.d(r2)
            return
        Lc4:
            if (r14 != 0) goto Lcb
            d1.d r13 = r11.f12540b
            float r13 = r13.f11857d0
            goto Lcf
        Lcb:
            d1.d r13 = r11.f12540b
            float r13 = r13.f11859e0
        Lcf:
            if (r0 != r1) goto Ld6
            int r12 = r0.f12523g
            int r2 = r1.f12523g
            r13 = r5
        Ld6:
            int r2 = r2 - r12
            int r2 = r2 - r4
            float r12 = (float) r12
            float r12 = r12 + r5
            float r14 = (float) r2
            float r14 = r14 * r13
            float r14 = r14 + r12
            int r12 = (int) r14
            r7.d(r12)
            int r12 = r7.f12523g
            int r13 = r3.f12523g
            int r12 = r12 + r13
            r6.d(r12)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.AbstractC1035o.l(d1.c, d1.c, int):void");
    }
}
