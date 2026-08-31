package W2;

import B0.G0;
import I2.n;
import Z.m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G0 f8104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f8105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8107d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(G0 g02, m mVar, int i, int i7) {
        this.f8104a = g02;
        this.f8105b = mVar;
        this.f8106c = i;
        this.f8107d = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I2.n
    public final int a() {
        return this.f8107d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I2.n
    public final int b() {
        return this.f8106c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I2.n
    public final long c() {
        return 2048L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I2.n
    public final boolean d() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    @Override // I2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.graphics.Canvas r11) {
        /*
            r10 = this;
            B0.G0 r0 = r10.f8104a
            r0.getClass()
            Z.m r1 = r10.f8105b
            if (r1 != 0) goto L10
            Z.m r1 = new Z.m
            r2 = 22
            r1.<init>(r2)
        L10:
            java.lang.Object r2 = r1.f8313s
            i0.a r2 = (i0.C1129a) r2
            if (r2 == 0) goto L17
            goto L29
        L17:
            int r2 = r11.getWidth()
            float r2 = (float) r2
            int r3 = r11.getHeight()
            float r3 = (float) r3
            i0.a r4 = new i0.a
            r5 = 0
            r4.<init>(r5, r5, r2, r3)
            r1.f8313s = r4
        L29:
            p3.z0 r2 = new p3.z0
            r2.<init>()
            r2.f15875a = r11
            r2.f15876b = r0
            java.lang.Object r11 = r0.f234r
            p3.T r11 = (p3.T) r11
            if (r11 != 0) goto L40
            java.lang.String r11 = "SVGAndroidRenderer"
            java.lang.String r0 = "Nothing to render. Document is empty."
            android.util.Log.w(r11, r0)
            return
        L40:
            i0.a r3 = r11.f15764o
            p3.q r4 = r11.f15755n
            java.lang.Object r5 = r1.f8312r
            F3.c r5 = (F3.c) r5
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L5a
            java.util.ArrayList r5 = r5.f1948r
            if (r5 == 0) goto L55
            int r5 = r5.size()
            goto L56
        L55:
            r5 = r7
        L56:
            if (r5 <= 0) goto L5a
            r5 = r6
            goto L5b
        L5a:
            r5 = r7
        L5b:
            if (r5 == 0) goto L68
            java.lang.Object r5 = r1.f8312r
            F3.c r5 = (F3.c) r5
            java.lang.Object r8 = r0.f235s
            F3.c r8 = (F3.c) r8
            r8.b(r5)
        L68:
            p3.x0 r5 = new p3.x0
            r5.<init>()
            r2.f15877c = r5
            java.util.Stack r5 = new java.util.Stack
            r5.<init>()
            r2.f15878d = r5
            java.lang.Object r5 = r2.f15877c
            p3.x0 r5 = (p3.x0) r5
            p3.S r8 = p3.S.a()
            r2.c0(r5, r8)
            java.lang.Object r5 = r2.f15877c
            p3.x0 r5 = (p3.x0) r5
            r8 = 0
            r5.f = r8
            r5.f15867h = r7
            java.lang.Object r8 = r2.f15878d
            java.util.Stack r8 = (java.util.Stack) r8
            p3.x0 r9 = new p3.x0
            r9.<init>(r5)
            r8.push(r9)
            java.util.Stack r5 = new java.util.Stack
            r5.<init>()
            r2.f = r5
            java.util.Stack r5 = new java.util.Stack
            r5.<init>()
            r2.f15879e = r5
            java.lang.Boolean r5 = r11.f15743d
            if (r5 == 0) goto Lb2
            java.lang.Object r8 = r2.f15877c
            p3.x0 r8 = (p3.x0) r8
            boolean r5 = r5.booleanValue()
            r8.f15867h = r5
        Lb2:
            r2.Z()
            i0.a r5 = new i0.a
            java.lang.Object r8 = r1.f8313s
            i0.a r8 = (i0.C1129a) r8
            r5.<init>(r8)
            p3.C r8 = r11.f15736r
            if (r8 == 0) goto Lca
            float r9 = r5.f13518d
            float r8 = r8.b(r2, r9)
            r5.f13518d = r8
        Lca:
            p3.C r8 = r11.f15737s
            if (r8 == 0) goto Ld6
            float r9 = r5.f13519e
            float r8 = r8.b(r2, r9)
            r5.f13519e = r8
        Ld6:
            r2.P(r11, r5, r3, r4)
            r2.Y()
            java.lang.Object r11 = r1.f8312r
            F3.c r11 = (F3.c) r11
            if (r11 == 0) goto Lef
            java.util.ArrayList r11 = r11.f1948r
            if (r11 == 0) goto Leb
            int r11 = r11.size()
            goto Lec
        Leb:
            r11 = r7
        Lec:
            if (r11 <= 0) goto Lef
            goto Lf0
        Lef:
            r6 = r7
        Lf0:
            if (r6 == 0) goto L114
            java.lang.Object r11 = r0.f235s
            F3.c r11 = (F3.c) r11
            java.util.ArrayList r11 = r11.f1948r
            if (r11 != 0) goto Lfb
            goto L114
        Lfb:
            java.util.Iterator r11 = r11.iterator()
        Lff:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L114
            java.lang.Object r0 = r11.next()
            p3.l r0 = (p3.C1466l) r0
            int r0 = r0.f15787c
            r1 = 2
            if (r0 != r1) goto Lff
            r11.remove()
            goto Lff
        L114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.e.e(android.graphics.Canvas):void");
    }
}
