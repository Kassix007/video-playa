package Z5;

import C0.C0102t;

/* JADX INFO: renamed from: Z5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0589s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f8627e = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X5.f f8628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0102t f8629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f8631d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0589s(X5.f descriptor, C0102t c0102t) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.f8628a = descriptor;
        this.f8629b = c0102t;
        int iD = descriptor.d();
        if (iD <= 64) {
            this.f8630c = iD != 64 ? (-1) << iD : 0L;
            this.f8631d = f8627e;
            return;
        }
        this.f8630c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.f8631d = jArr;
    }
}
