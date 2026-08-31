package A;

import B0.InterfaceC0060z;
import c0.AbstractC0724l;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f45E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f46F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f47G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f48H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f49I;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // B0.InterfaceC0060z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z0.InterfaceC1927D c(B0.T r7, z0.InterfaceC1925B r8, long r9) {
        /*
            r6 = this;
            float r0 = r6.f47G
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f47G
            int r0 = r7.G(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f48H
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f48H
            int r3 = r7.G(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f45E
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f45E
            int r4 = r7.G(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f46F
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f46F
            int r5 = r7.G(r5)
            if (r5 >= 0) goto L53
            r5 = r2
        L53:
            if (r5 <= r3) goto L56
            r5 = r3
        L56:
            if (r5 == r1) goto L59
            r2 = r5
        L59:
            long r0 = W0.b.a(r4, r0, r2, r3)
            boolean r2 = r6.f49I
            if (r2 == 0) goto La2
            int r2 = W0.a.j(r9)
            int r3 = W0.a.h(r9)
            int r4 = W0.a.i(r9)
            int r9 = W0.a.g(r9)
            int r10 = W0.a.j(r0)
            if (r10 >= r2) goto L78
            r10 = r2
        L78:
            if (r10 <= r3) goto L7b
            r10 = r3
        L7b:
            int r5 = W0.a.h(r0)
            if (r5 >= r2) goto L82
            goto L83
        L82:
            r2 = r5
        L83:
            if (r2 <= r3) goto L86
            goto L87
        L86:
            r3 = r2
        L87:
            int r2 = W0.a.i(r0)
            if (r2 >= r4) goto L8e
            r2 = r4
        L8e:
            if (r2 <= r9) goto L91
            r2 = r9
        L91:
            int r0 = W0.a.g(r0)
            if (r0 >= r4) goto L98
            goto L99
        L98:
            r4 = r0
        L99:
            if (r4 <= r9) goto L9c
            goto L9d
        L9c:
            r9 = r4
        L9d:
            long r9 = W0.b.a(r10, r3, r2, r9)
            goto L106
        La2:
            float r2 = r6.f45E
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto Laf
            int r2 = W0.a.j(r0)
            goto Lba
        Laf:
            int r2 = W0.a.j(r9)
            int r3 = W0.a.h(r0)
            if (r2 <= r3) goto Lba
            r2 = r3
        Lba:
            float r3 = r6.f47G
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto Lc7
            int r3 = W0.a.h(r0)
            goto Ld2
        Lc7:
            int r3 = W0.a.h(r9)
            int r4 = W0.a.j(r0)
            if (r3 >= r4) goto Ld2
            r3 = r4
        Ld2:
            float r4 = r6.f46F
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto Ldf
            int r4 = W0.a.i(r0)
            goto Lea
        Ldf:
            int r4 = W0.a.i(r9)
            int r5 = W0.a.g(r0)
            if (r4 <= r5) goto Lea
            r4 = r5
        Lea:
            float r5 = r6.f48H
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto Lf7
            int r9 = W0.a.g(r0)
            goto L102
        Lf7:
            int r9 = W0.a.g(r9)
            int r10 = W0.a.i(r0)
            if (r9 >= r10) goto L102
            r9 = r10
        L102:
            long r9 = W0.b.a(r2, r3, r4, r9)
        L106:
            z0.J r8 = r8.a(r9)
            int r9 = r8.f18664q
            int r10 = r8.f18665r
            A.z r0 = new A.z
            r1 = 1
            r0.<init>(r8, r1)
            n5.t r8 = n5.t.f15300q
            z0.D r7 = r7.f(r9, r10, r8, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A.T.c(B0.T, z0.B, long):z0.D");
    }
}
