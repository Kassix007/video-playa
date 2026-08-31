package w0;

import C2.e;
import com.google.android.gms.internal.measurement.P1;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: w0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1824c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC1823b f18136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1822a[] f18138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18139e;
    public final float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f18140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f18141h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1824c(boolean z5, EnumC1823b enumC1823b) {
        int i;
        this.f18135a = z5;
        this.f18136b = enumC1823b;
        if (z5 && enumC1823b.equals(EnumC1823b.f18132q)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = enumC1823b.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                throw new e();
            }
            i = 2;
        }
        this.f18137c = i;
        this.f18138d = new C1822a[20];
        this.f = new float[20];
        this.f18140g = new float[20];
        this.f18141h = new float[3];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(long j, float f) {
        int i = (this.f18139e + 1) % 20;
        this.f18139e = i;
        C1822a[] c1822aArr = this.f18138d;
        C1822a c1822a = c1822aArr[i];
        if (c1822a != null) {
            c1822a.f18130a = j;
            c1822a.f18131b = f;
        } else {
            C1822a c1822a2 = new C1822a();
            c1822a2.f18130a = j;
            c1822a2.f18131b = f;
            c1822aArr[i] = c1822a2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b(float f) {
        EnumC1823b enumC1823b;
        float[] fArr;
        float[] fArr2;
        float f7;
        boolean z5;
        int i;
        float fSignum;
        float f8 = f;
        float f9 = 0.0f;
        if (f8 <= 0.0f) {
            AbstractC1904a.b("maximumVelocity should be a positive value. You specified=" + f8);
        }
        int i7 = this.f18139e;
        C1822a[] c1822aArr = this.f18138d;
        C1822a c1822a = c1822aArr[i7];
        if (c1822a == null) {
            f7 = 0.0f;
        } else {
            int i8 = 0;
            C1822a c1822a2 = c1822a;
            while (true) {
                C1822a c1822a3 = c1822aArr[i7];
                boolean z6 = this.f18135a;
                enumC1823b = this.f18136b;
                fArr = this.f;
                fArr2 = this.f18140g;
                if (c1822a3 == null) {
                    f7 = f9;
                    z5 = z6;
                    i = 1;
                    break;
                }
                long j = c1822a.f18130a;
                f7 = f9;
                int i9 = i7;
                long j7 = c1822a3.f18130a;
                float f10 = j - j7;
                z5 = z6;
                i = 1;
                float fAbs = Math.abs(j7 - c1822a2.f18130a);
                c1822a2 = (enumC1823b == EnumC1823b.f18132q || z5) ? c1822a3 : c1822a;
                if (f10 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i8] = c1822a3.f18131b;
                fArr2[i8] = -f10;
                i7 = (i9 == 0 ? 20 : i9) - 1;
                i8++;
                if (i8 >= 20) {
                    break;
                }
                f9 = f7;
            }
            if (i8 >= this.f18137c) {
                int iOrdinal = enumC1823b.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f18141h;
                        P1.G(fArr2, fArr, i8, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f7;
                    }
                } else {
                    if (iOrdinal != i) {
                        throw new e();
                    }
                    int i10 = i8 - i;
                    float f11 = fArr2[i10];
                    int i11 = i10;
                    float fAbs2 = f7;
                    while (i11 > 0) {
                        int i12 = i11 - 1;
                        float f12 = fArr2[i12];
                        if (f11 != f12) {
                            float f13 = (z5 ? -fArr[i12] : fArr[i11] - fArr[i12]) / (f11 - f12);
                            fAbs2 += Math.abs(f13) * (f13 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i11 == i10) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i11--;
                        f11 = f12;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f9 = fSignum * 1000;
            } else {
                f9 = f7;
            }
        }
        if (f9 == f7 || Float.isNaN(f9)) {
            return f7;
        }
        if (f9 <= f7) {
            f8 = -f8;
            if (f9 >= f8) {
                return f9;
            }
        } else if (f9 <= f8) {
            f8 = f9;
        }
        return f8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0003: CONSTRUCTOR false, (wrap:w0.b:0x0000: SGET  A[WRAPPED] (LINE:15) w0.b.q w0.b) A[MD:(boolean, w0.b):void (m)] (LINE:15) call: w0.c.<init>(boolean, w0.b):void type: THIS */
    public /* synthetic */ C1824c() {
        this(false, EnumC1823b.f18132q);
    }

    public C1824c(int i) {
        this(true, EnumC1823b.f18133r);
    }
}
