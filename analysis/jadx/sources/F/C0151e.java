package F;

import P.C0345b;
import P.C0354f0;
import com.google.android.gms.internal.measurement.K1;

/* JADX INFO: renamed from: F.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0151e extends N {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Z.m f1859I = K1.y(C0148b.f1853q, C0150d.f1856r);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0354f0 f1860H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0151e(int i, float f, B5.a aVar) {
        super(i, f);
        this.f1860H = C0345b.q(aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // F.N
    public final int l() {
        return ((Number) ((B5.a) this.f1860H.getValue()).invoke()).intValue();
    }
}
