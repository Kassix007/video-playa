package k0;

import j0.AbstractC1145B;

/* JADX INFO: loaded from: classes.dex */
public final class k extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14016d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i7, long j, String str) {
        super(str, j, i);
        this.f14016d = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float a(int i) {
        switch (this.f14016d) {
            case 0:
                return i == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float b(int i) {
        switch (this.f14016d) {
            case 0:
                return i == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final long d(float f, float f7, float f8) {
        switch (this.f14016d) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f7 < -128.0f) {
                    f7 = -128.0f;
                }
                if (f7 > 128.0f) {
                    f7 = 128.0f;
                }
                float f9 = (f + 16.0f) / 116.0f;
                float f10 = (f7 * 0.002f) + f9;
                float f11 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
                float f12 = f9 > 0.20689656f ? f9 * f9 * f9 : (f9 - 0.13793103f) * 0.12841855f;
                float[] fArr = j.f14015e;
                return (((long) Float.floatToRawIntBits(f12 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f11 * fArr[0])) << 32);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f7 <= 2.0f ? f7 : 2.0f)) & 4294967295L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float e(float f, float f7, float f8) {
        switch (this.f14016d) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 100.0f) {
                    f = 100.0f;
                }
                if (f8 < -128.0f) {
                    f8 = -128.0f;
                }
                if (f8 > 128.0f) {
                    f8 = 128.0f;
                }
                float f9 = ((f + 16.0f) / 116.0f) - (f8 * 0.005f);
                return (f9 > 0.20689656f ? f9 * f9 * f9 : 0.12841855f * (f9 - 0.13793103f)) * j.f14015e[2];
            default:
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                if (f8 > 2.0f) {
                    return 2.0f;
                }
                return f8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final long f(float f, float f7, float f8, float f9, c cVar) {
        switch (this.f14016d) {
            case 0:
                float[] fArr = j.f14015e;
                float f10 = f / fArr[0];
                float f11 = f7 / fArr[1];
                float f12 = f8 / fArr[2];
                float fCbrt = f10 > 0.008856452f ? (float) Math.cbrt(f10) : (f10 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
                float f13 = (116.0f * fCbrt2) - 16.0f;
                float f14 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f12 > 0.008856452f ? (float) Math.cbrt(f12) : (f12 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 100.0f) {
                    f13 = 100.0f;
                }
                if (f14 < -128.0f) {
                    f14 = -128.0f;
                }
                if (f14 > 128.0f) {
                    f14 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return AbstractC1145B.a(f13, f14, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f9, cVar);
            default:
                if (f < -2.0f) {
                    f = -2.0f;
                }
                if (f > 2.0f) {
                    f = 2.0f;
                }
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                return AbstractC1145B.a(f, f7, f8 <= 2.0f ? f8 : 2.0f, f9, cVar);
        }
    }
}
