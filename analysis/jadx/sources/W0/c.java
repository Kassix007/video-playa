package W0;

import com.google.android.gms.internal.measurement.AbstractC0836n2;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float D(long j) {
        float fC;
        float fL;
        if (!o.a(n.b(j), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        float[] fArr = X0.b.f8161a;
        if (l() >= 1.03f) {
            X0.a aVarA = X0.b.a(l());
            fC = n.c(j);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fL = l();
        } else {
            fC = n.c(j);
            fL = l();
        }
        return fL * fC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default int G(float f) {
        float fU = u(f);
        if (Float.isInfinite(fU)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fU);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long Q(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fU = u(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Float.floatToRawIntBits(u(Float.intBitsToFloat((int) (j & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(fU) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float T(long j) {
        if (!o.a(n.b(j), 4294967296L)) {
            h.b("Only Sp can convert to Px");
        }
        return u(D(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long a0(float f) {
        return s(i0(f));
    }

    float b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float f0(int i) {
        return i / b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float i0(float f) {
        return f / b();
    }

    float l();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long s(float f) {
        float[] fArr = X0.b.f8161a;
        if (l() < 1.03f) {
            return AbstractC0836n2.E(4294967296L, f / l());
        }
        X0.a aVarA = X0.b.a(l());
        return AbstractC0836n2.E(4294967296L, aVarA != null ? aVarA.a(f) : f / l());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float u(float f) {
        return b() * f;
    }
}
