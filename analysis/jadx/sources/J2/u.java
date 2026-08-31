package J2;

/* JADX INFO: loaded from: classes.dex */
public final class u implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U5.i f2796a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(U5.i iVar) {
        this.f2796a = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // J2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final J2.k a(L2.i r7, U2.n r8) {
        /*
            r6 = this;
            android.graphics.Bitmap$Config r0 = U2.i.b(r8)
            android.content.Context r1 = r8.f7686a
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r3 = 0
            if (r0 == r2) goto L11
            android.graphics.Bitmap$Config r2 = d0.l.w()
            if (r0 != r2) goto L93
        L11:
            J2.q r0 = r7.f3260a
            q6.l r2 = r0.getFileSystem()
            q6.t r4 = q6.l.f16071q
            if (r2 != r4) goto L2a
            q6.x r2 = r0.A()
            if (r2 == 0) goto L2a
            java.io.File r0 = r2.toFile()
            android.graphics.ImageDecoder$Source r0 = B3.c.e(r0)
            goto L91
        L2a:
            E3.h r0 = r0.C()
            boolean r2 = r0 instanceof J2.a
            if (r2 == 0) goto L3f
            android.content.res.AssetManager r1 = r1.getAssets()
            J2.a r0 = (J2.a) r0
            java.lang.String r0 = r0.f2751o
            android.graphics.ImageDecoder$Source r0 = B3.c.c(r1, r0)
            goto L91
        L3f:
            boolean r2 = r0 instanceof J2.g
            if (r2 == 0) goto L65
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r2 < r4) goto L65
            J2.g r0 = (J2.g) r0     // Catch: android.system.ErrnoException -> L90
            android.content.res.AssetFileDescriptor r0 = r0.f2766o     // Catch: android.system.ErrnoException -> L90
            java.io.FileDescriptor r1 = r0.getFileDescriptor()     // Catch: android.system.ErrnoException -> L90
            long r4 = r0.getStartOffset()     // Catch: android.system.ErrnoException -> L90
            int r2 = android.system.OsConstants.SEEK_SET     // Catch: android.system.ErrnoException -> L90
            android.system.Os.lseek(r1, r4, r2)     // Catch: android.system.ErrnoException -> L90
            J2.x r1 = new J2.x     // Catch: android.system.ErrnoException -> L90
            r2 = 0
            r1.<init>(r2, r0)     // Catch: android.system.ErrnoException -> L90
            android.graphics.ImageDecoder$Source r0 = A3.a.d(r1)     // Catch: android.system.ErrnoException -> L90
            goto L91
        L65:
            boolean r2 = r0 instanceof J2.r
            if (r2 == 0) goto L83
            r2 = r0
            J2.r r2 = (J2.r) r2
            java.lang.String r4 = r2.f2789o
            java.lang.String r5 = r1.getPackageName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L83
            android.content.res.Resources r0 = r1.getResources()
            int r1 = r2.f2790p
            android.graphics.ImageDecoder$Source r0 = B3.c.d(r0, r1)
            goto L91
        L83:
            boolean r1 = r0 instanceof J2.f
            if (r1 == 0) goto L90
            J2.f r0 = (J2.f) r0
            java.nio.ByteBuffer r0 = r0.f2765o
            android.graphics.ImageDecoder$Source r0 = B3.c.f(r0)
            goto L91
        L90:
            r0 = r3
        L91:
            if (r0 != 0) goto L94
        L93:
            return r3
        L94:
            J2.e r1 = new J2.e
            J2.q r7 = r7.f3260a
            U5.i r2 = r6.f2796a
            r1.<init>(r0, r7, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.u.a(L2.i, U2.n):J2.k");
    }
}
