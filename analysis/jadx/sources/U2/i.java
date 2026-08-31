package U2;

import I2.q;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I2.l f7678a = new I2.l(Y2.j.f8216b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I2.l f7679b = new I2.l(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I2.l f7680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final I2.l f7681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I2.l f7682e;
    public static final I2.l f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Boolean bool = Boolean.TRUE;
        f7680c = new I2.l(bool);
        f7681d = new I2.l(null);
        f7682e = new I2.l(bool);
        f = new I2.l(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(d dVar) {
        I2.k kVar;
        Object obj = dVar.f7640k;
        if (obj instanceof I2.k) {
            kVar = (I2.k) obj;
        } else {
            if (!(obj instanceof I2.m)) {
                throw new AssertionError();
            }
            I2.m mVar = (I2.m) obj;
            mVar.getClass();
            I2.k kVar2 = new I2.k(mVar);
            dVar.f7640k = kVar2;
            kVar = kVar2;
        }
        kVar.f2363a.put(f7682e, Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Bitmap.Config b(n nVar) {
        return (Bitmap.Config) q.e(nVar, f7678a);
    }
}
