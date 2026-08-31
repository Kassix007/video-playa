package J2;

import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2760a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U2.n f2761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5.i f2762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2764e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(q qVar, U2.n nVar, U5.i iVar, n nVar2) {
        this.f2763d = qVar;
        this.f2761b = nVar;
        this.f2762c = iVar;
        this.f2764e = nVar2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00af */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:? */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // J2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(q5.InterfaceC1524c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.f2760a
            switch(r0) {
                case 0: goto L81;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof J2.v
            if (r0 == 0) goto L18
            r0 = r8
            J2.v r0 = (J2.v) r0
            int r1 = r0.f2800t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f2800t = r1
            goto L1f
        L18:
            J2.v r0 = new J2.v
            s5.c r8 = (s5.c) r8
            r0.<init>(r7, r8)
        L1f:
            java.lang.Object r8 = r0.f2798r
            int r1 = r0.f2800t
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            U5.i r0 = r0.f2797q
            m5.AbstractC1362a.e(r8)
            goto L49
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            m5.AbstractC1362a.e(r8)
            U5.i r8 = r7.f2762c
            r0.f2797q = r8
            r0.f2800t = r2
            java.lang.Object r0 = r8.a(r0)
            r5.a r1 = r5.EnumC1580a.f16356q
            if (r0 != r1) goto L48
            goto L73
        L48:
            r0 = r8
        L49:
            java.lang.Object r8 = r7.f2764e     // Catch: java.lang.Throwable -> L74
            java.lang.AutoCloseable r8 = (java.lang.AutoCloseable) r8     // Catch: java.lang.Throwable -> L74
            kotlin.jvm.internal.u r1 = new kotlin.jvm.internal.u     // Catch: java.lang.Throwable -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r7.f2763d     // Catch: java.lang.Throwable -> L76
            android.graphics.ImageDecoder$Source r2 = (android.graphics.ImageDecoder.Source) r2     // Catch: java.lang.Throwable -> L76
            J2.w r3 = new J2.w     // Catch: java.lang.Throwable -> L76
            r3.<init>(r7, r1)     // Catch: java.lang.Throwable -> L76
            android.graphics.Bitmap r2 = B3.c.b(r2, r3)     // Catch: java.lang.Throwable -> L76
            J2.i r3 = new J2.i     // Catch: java.lang.Throwable -> L76
            I2.a r4 = new I2.a     // Catch: java.lang.Throwable -> L76
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L76
            boolean r1 = r1.f14264q     // Catch: java.lang.Throwable -> L76
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L76
            r1 = 0
            n5.AbstractC1397A.o(r8, r1)     // Catch: java.lang.Throwable -> L74
            r0.c()
            r1 = r3
        L73:
            return r1
        L74:
            r8 = move-exception
            goto L7d
        L76:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L78
        L78:
            r2 = move-exception
            n5.AbstractC1397A.o(r8, r1)     // Catch: java.lang.Throwable -> L74
            throw r2     // Catch: java.lang.Throwable -> L74
        L7d:
            r0.c()
            throw r8
        L81:
            boolean r0 = r8 instanceof J2.d
            if (r0 == 0) goto L94
            r0 = r8
            J2.d r0 = (J2.d) r0
            int r1 = r0.f2759t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L94
            int r1 = r1 - r2
            r0.f2759t = r1
            goto L9b
        L94:
            J2.d r0 = new J2.d
            s5.c r8 = (s5.c) r8
            r0.<init>(r7, r8)
        L9b:
            java.lang.Object r8 = r0.f2757r
            int r1 = r0.f2759t
            r2 = 2
            r3 = 1
            r5.a r4 = r5.EnumC1580a.f16356q
            if (r1 == 0) goto Lc0
            if (r1 == r3) goto Lb9
            if (r1 != r2) goto Lb1
            U5.e r0 = r0.f2756q
            m5.AbstractC1362a.e(r8)     // Catch: java.lang.Throwable -> Laf
            goto Lec
        Laf:
            r8 = move-exception
            goto Lfb
        Lb1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        Lb9:
            U5.e r1 = r0.f2756q
            m5.AbstractC1362a.e(r8)
            r8 = r1
            goto Ld0
        Lc0:
            m5.AbstractC1362a.e(r8)
            U5.i r8 = r7.f2762c
            r0.f2756q = r8
            r0.f2759t = r3
            java.lang.Object r1 = r8.a(r0)
            if (r1 != r4) goto Ld0
            goto Lf4
        Ld0:
            I2.d r1 = new I2.d     // Catch: java.lang.Throwable -> Lf9
            r3 = 3
            r1.<init>(r3, r7)     // Catch: java.lang.Throwable -> Lf9
            r0.f2756q = r8     // Catch: java.lang.Throwable -> Lf9
            r0.f2759t = r2     // Catch: java.lang.Throwable -> Lf9
            q5.i r2 = q5.C1530i.f16022q     // Catch: java.lang.Throwable -> Lf9
            M5.Z r3 = new M5.Z     // Catch: java.lang.Throwable -> Lf9
            r5 = 0
            r3.<init>(r1, r5)     // Catch: java.lang.Throwable -> Lf9
            java.lang.Object r0 = M5.AbstractC0263y.B(r2, r3, r0)     // Catch: java.lang.Throwable -> Lf9
            if (r0 != r4) goto Le9
            goto Lf4
        Le9:
            r6 = r0
            r0 = r8
            r8 = r6
        Lec:
            r4 = r8
            J2.i r4 = (J2.i) r4     // Catch: java.lang.Throwable -> Laf
            U5.h r0 = (U5.h) r0
            r0.c()
        Lf4:
            return r4
        Lf5:
            r6 = r0
            r0 = r8
            r8 = r6
            goto Lfb
        Lf9:
            r0 = move-exception
            goto Lf5
        Lfb:
            U5.h r0 = (U5.h) r0
            r0.c()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.e.a(q5.c):java.lang.Object");
    }

    public e(ImageDecoder.Source source, AutoCloseable autoCloseable, U2.n nVar, U5.i iVar) {
        this.f2763d = source;
        this.f2764e = autoCloseable;
        this.f2761b = nVar;
        this.f2762c = iVar;
    }
}
