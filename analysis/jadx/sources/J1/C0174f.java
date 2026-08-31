package J1;

import B0.C0050o;
import C0.AbstractC0067b;

/* JADX INFO: renamed from: J1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0174f extends AbstractC0067b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0050o f2647e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5 A[Catch: RuntimeException -> 0x00f0, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00f0, blocks: (B:77:0x00df, B:79:0x00e5), top: B:90:0x00df }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B0.C0050o n(android.content.Context r9) {
        /*
            r8 = this;
            boolean r0 = r8.f2646d
            if (r0 == 0) goto L7
            B0.o r9 = r8.f2647e
            return r9
        L7:
            java.lang.Object r0 = r8.f990a
            J1.T r0 = (J1.T) r0
            J1.q r1 = r0.f2600c
            int r0 = r0.f2598a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L16
            r0 = r4
            goto L17
        L16:
            r0 = r3
        L17:
            boolean r2 = r8.f2645c
            J1.p r5 = r1.f2706X
            if (r5 != 0) goto L1f
            r6 = r3
            goto L21
        L1f:
            int r6 = r5.f
        L21:
            if (r2 == 0) goto L32
            if (r0 == 0) goto L2c
            if (r5 != 0) goto L29
        L27:
            r2 = r3
            goto L3f
        L29:
            int r2 = r5.f2677d
            goto L3f
        L2c:
            if (r5 != 0) goto L2f
            goto L27
        L2f:
            int r2 = r5.f2678e
            goto L3f
        L32:
            if (r0 == 0) goto L3a
            if (r5 != 0) goto L37
            goto L27
        L37:
            int r2 = r5.f2675b
            goto L3f
        L3a:
            if (r5 != 0) goto L3d
            goto L27
        L3d:
            int r2 = r5.f2676c
        L3f:
            r1.E(r3, r3, r3, r3)
            android.view.ViewGroup r3 = r1.f2702T
            r5 = 0
            if (r3 == 0) goto L55
            r7 = 2131296787(0x7f090213, float:1.82115E38)
            java.lang.Object r3 = r3.getTag(r7)
            if (r3 == 0) goto L55
            android.view.ViewGroup r3 = r1.f2702T
            r3.setTag(r7, r5)
        L55:
            android.view.ViewGroup r1 = r1.f2702T
            if (r1 == 0) goto L61
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L61
            goto L100
        L61:
            if (r2 != 0) goto Lbe
            if (r6 == 0) goto Lbe
            r1 = 4097(0x1001, float:5.741E-42)
            if (r6 == r1) goto Lb4
            r1 = 8194(0x2002, float:1.1482E-41)
            if (r6 == r1) goto Laa
            r1 = 8197(0x2005, float:1.1486E-41)
            if (r6 == r1) goto L98
            r1 = 4099(0x1003, float:5.744E-42)
            if (r6 == r1) goto L8e
            r1 = 4100(0x1004, float:5.745E-42)
            if (r6 == r1) goto L7c
            r0 = -1
        L7a:
            r2 = r0
            goto Lbe
        L7c:
            if (r0 == 0) goto L86
            r0 = 16842936(0x10100b8, float:2.3694074E-38)
            int r0 = y4.AbstractC1918b.A(r9, r0)
            goto L7a
        L86:
            r0 = 16842937(0x10100b9, float:2.3694076E-38)
            int r0 = y4.AbstractC1918b.A(r9, r0)
            goto L7a
        L8e:
            if (r0 == 0) goto L94
            r0 = 2130837509(0x7f020005, float:1.7279974E38)
            goto L7a
        L94:
            r0 = 2130837510(0x7f020006, float:1.7279976E38)
            goto L7a
        L98:
            if (r0 == 0) goto La2
            r0 = 16842938(0x10100ba, float:2.369408E-38)
            int r0 = y4.AbstractC1918b.A(r9, r0)
            goto L7a
        La2:
            r0 = 16842939(0x10100bb, float:2.3694082E-38)
            int r0 = y4.AbstractC1918b.A(r9, r0)
            goto L7a
        Laa:
            if (r0 == 0) goto Lb0
            r0 = 2130837507(0x7f020003, float:1.727997E38)
            goto L7a
        Lb0:
            r0 = 2130837508(0x7f020004, float:1.7279972E38)
            goto L7a
        Lb4:
            if (r0 == 0) goto Lba
            r0 = 2130837511(0x7f020007, float:1.7279978E38)
            goto L7a
        Lba:
            r0 = 2130837512(0x7f020008, float:1.727998E38)
            goto L7a
        Lbe:
            if (r2 == 0) goto L100
            android.content.res.Resources r0 = r9.getResources()
            java.lang.String r0 = r0.getResourceTypeName(r2)
            java.lang.String r1 = "anim"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ldf
            android.view.animation.Animation r1 = android.view.animation.AnimationUtils.loadAnimation(r9, r2)     // Catch: android.content.res.Resources.NotFoundException -> Ldd java.lang.RuntimeException -> Ldf
            if (r1 == 0) goto L100
            B0.o r3 = new B0.o     // Catch: android.content.res.Resources.NotFoundException -> Ldd java.lang.RuntimeException -> Ldf
            r3.<init>(r1)     // Catch: android.content.res.Resources.NotFoundException -> Ldd java.lang.RuntimeException -> Ldf
        Ldb:
            r5 = r3
            goto L100
        Ldd:
            r9 = move-exception
            throw r9
        Ldf:
            android.animation.Animator r1 = android.animation.AnimatorInflater.loadAnimator(r9, r2)     // Catch: java.lang.RuntimeException -> Lf0
            if (r1 == 0) goto L100
            B0.o r3 = new B0.o     // Catch: java.lang.RuntimeException -> Lf0
            r3.<init>()     // Catch: java.lang.RuntimeException -> Lf0
            r6 = 0
            r3.f499q = r6     // Catch: java.lang.RuntimeException -> Lf0
            r3.f500r = r1     // Catch: java.lang.RuntimeException -> Lf0
            goto Ldb
        Lf0:
            r1 = move-exception
            if (r0 != 0) goto Lff
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r2)
            if (r9 == 0) goto L100
            B0.o r5 = new B0.o
            r5.<init>(r9)
            goto L100
        Lff:
            throw r1
        L100:
            r8.f2647e = r5
            r8.f2646d = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0174f.n(android.content.Context):B0.o");
    }
}
