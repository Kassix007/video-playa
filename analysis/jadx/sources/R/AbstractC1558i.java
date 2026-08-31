package r;

/* JADX INFO: renamed from: r.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1558i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f16214a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long[] jArr = O.f16162a;
        int iE = O.e(0);
        int iMax = iE > 0 ? Math.max(7, O.d(iE)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            n5.k.K0(jArr, -9187201950435737472L);
        }
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        float[] fArr = new float[iMax];
        f16214a = new float[0];
    }
}
