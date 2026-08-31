package e4;

import t.AbstractC1599H;
import t.AbstractC1603b;
import t.C1598G;

/* JADX INFO: renamed from: e4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1055e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12641b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1598G a(float f) {
        double dB = b(f);
        double d5 = AbstractC1599H.f16587a;
        double d7 = d5 - 1.0d;
        return new C1598G(f, (float) (Math.exp((d5 / d7) * dB) * ((double) (this.f12640a * this.f12641b))), (long) (Math.exp(dB / d7) * 1000.0d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public double b(float f) {
        float[] fArr = AbstractC1603b.f16595a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f12640a * this.f12641b)));
    }
}
