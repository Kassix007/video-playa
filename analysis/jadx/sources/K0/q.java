package k0;

import C0.Z0;
import j0.AbstractC1145B;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Z0 f14028r = new Z0(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f14029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14030e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f14031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f14032h;
    public final float[] i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f14033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f14034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f14035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f14036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p f14037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f14038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f14039q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(String str, float[] fArr, s sVar, final r rVar, int i) {
        i iVar;
        i iVar2;
        double d5 = rVar.f14040a;
        boolean z5 = d5 == -3.0d;
        double d7 = rVar.f14045g;
        double d8 = rVar.f;
        if (z5) {
            final int i7 = 4;
            iVar = new i() { // from class: k0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d9) {
                    int i8 = i7;
                    r rVar2 = rVar;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = d.f13982a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f13982a;
                            return d.c(rVar2, d9);
                        case 2:
                            double d10 = rVar2.f14041b;
                            return d9 >= rVar2.f14044e ? Math.pow((d10 * d9) + rVar2.f14042c, rVar2.f14040a) : d9 * rVar2.f14043d;
                        case 3:
                            double d11 = rVar2.f14041b;
                            double d12 = rVar2.f14042c;
                            double d13 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e ? Math.pow((d11 * d9) + d12, rVar2.f14040a) + rVar2.f : (d13 * d9) + rVar2.f14045g;
                        case 4:
                            float[] fArr4 = d.f13982a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f13982a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d14 = rVar2.f14041b;
                            double d15 = rVar2.f14042c;
                            double d16 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d16 ? (Math.pow(d9, 1.0d / rVar2.f14040a) - d15) / d14 : d9 / d16;
                        default:
                            double d17 = rVar2.f14041b;
                            double d18 = rVar2.f14042c;
                            double d19 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d19 ? (Math.pow(d9 - rVar2.f, 1.0d / rVar2.f14040a) - d18) / d17 : (d9 - rVar2.f14045g) / d19;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i8 = 5;
            iVar = new i() { // from class: k0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d9) {
                    int i82 = i8;
                    r rVar2 = rVar;
                    switch (i82) {
                        case 0:
                            float[] fArr2 = d.f13982a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f13982a;
                            return d.c(rVar2, d9);
                        case 2:
                            double d10 = rVar2.f14041b;
                            return d9 >= rVar2.f14044e ? Math.pow((d10 * d9) + rVar2.f14042c, rVar2.f14040a) : d9 * rVar2.f14043d;
                        case 3:
                            double d11 = rVar2.f14041b;
                            double d12 = rVar2.f14042c;
                            double d13 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e ? Math.pow((d11 * d9) + d12, rVar2.f14040a) + rVar2.f : (d13 * d9) + rVar2.f14045g;
                        case 4:
                            float[] fArr4 = d.f13982a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f13982a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d14 = rVar2.f14041b;
                            double d15 = rVar2.f14042c;
                            double d16 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d16 ? (Math.pow(d9, 1.0d / rVar2.f14040a) - d15) / d14 : d9 / d16;
                        default:
                            double d17 = rVar2.f14041b;
                            double d18 = rVar2.f14042c;
                            double d19 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d19 ? (Math.pow(d9 - rVar2.f, 1.0d / rVar2.f14040a) - d18) / d17 : (d9 - rVar2.f14045g) / d19;
                    }
                }
            };
        } else if (d8 == 0.0d && d7 == 0.0d) {
            final int i9 = 6;
            iVar = new i() { // from class: k0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d9) {
                    int i82 = i9;
                    r rVar2 = rVar;
                    switch (i82) {
                        case 0:
                            float[] fArr2 = d.f13982a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f13982a;
                            return d.c(rVar2, d9);
                        case 2:
                            double d10 = rVar2.f14041b;
                            return d9 >= rVar2.f14044e ? Math.pow((d10 * d9) + rVar2.f14042c, rVar2.f14040a) : d9 * rVar2.f14043d;
                        case 3:
                            double d11 = rVar2.f14041b;
                            double d12 = rVar2.f14042c;
                            double d13 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e ? Math.pow((d11 * d9) + d12, rVar2.f14040a) + rVar2.f : (d13 * d9) + rVar2.f14045g;
                        case 4:
                            float[] fArr4 = d.f13982a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f13982a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d14 = rVar2.f14041b;
                            double d15 = rVar2.f14042c;
                            double d16 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d16 ? (Math.pow(d9, 1.0d / rVar2.f14040a) - d15) / d14 : d9 / d16;
                        default:
                            double d17 = rVar2.f14041b;
                            double d18 = rVar2.f14042c;
                            double d19 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d19 ? (Math.pow(d9 - rVar2.f, 1.0d / rVar2.f14040a) - d18) / d17 : (d9 - rVar2.f14045g) / d19;
                    }
                }
            };
        } else {
            final int i10 = 7;
            iVar = new i() { // from class: k0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d9) {
                    int i82 = i10;
                    r rVar2 = rVar;
                    switch (i82) {
                        case 0:
                            float[] fArr2 = d.f13982a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f13982a;
                            return d.c(rVar2, d9);
                        case 2:
                            double d10 = rVar2.f14041b;
                            return d9 >= rVar2.f14044e ? Math.pow((d10 * d9) + rVar2.f14042c, rVar2.f14040a) : d9 * rVar2.f14043d;
                        case 3:
                            double d11 = rVar2.f14041b;
                            double d12 = rVar2.f14042c;
                            double d13 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e ? Math.pow((d11 * d9) + d12, rVar2.f14040a) + rVar2.f : (d13 * d9) + rVar2.f14045g;
                        case 4:
                            float[] fArr4 = d.f13982a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f13982a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d14 = rVar2.f14041b;
                            double d15 = rVar2.f14042c;
                            double d16 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d16 ? (Math.pow(d9, 1.0d / rVar2.f14040a) - d15) / d14 : d9 / d16;
                        default:
                            double d17 = rVar2.f14041b;
                            double d18 = rVar2.f14042c;
                            double d19 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d19 ? (Math.pow(d9 - rVar2.f, 1.0d / rVar2.f14040a) - d18) / d17 : (d9 - rVar2.f14045g) / d19;
                    }
                }
            };
        }
        if (d5 == -3.0d) {
            final int i11 = 0;
            iVar2 = new i() { // from class: k0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d9) {
                    int i82 = i11;
                    r rVar2 = rVar;
                    switch (i82) {
                        case 0:
                            float[] fArr2 = d.f13982a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f13982a;
                            return d.c(rVar2, d9);
                        case 2:
                            double d10 = rVar2.f14041b;
                            return d9 >= rVar2.f14044e ? Math.pow((d10 * d9) + rVar2.f14042c, rVar2.f14040a) : d9 * rVar2.f14043d;
                        case 3:
                            double d11 = rVar2.f14041b;
                            double d12 = rVar2.f14042c;
                            double d13 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e ? Math.pow((d11 * d9) + d12, rVar2.f14040a) + rVar2.f : (d13 * d9) + rVar2.f14045g;
                        case 4:
                            float[] fArr4 = d.f13982a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f13982a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d14 = rVar2.f14041b;
                            double d15 = rVar2.f14042c;
                            double d16 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d16 ? (Math.pow(d9, 1.0d / rVar2.f14040a) - d15) / d14 : d9 / d16;
                        default:
                            double d17 = rVar2.f14041b;
                            double d18 = rVar2.f14042c;
                            double d19 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d19 ? (Math.pow(d9 - rVar2.f, 1.0d / rVar2.f14040a) - d18) / d17 : (d9 - rVar2.f14045g) / d19;
                    }
                }
            };
        } else if (d5 == -2.0d) {
            final int i12 = 1;
            iVar2 = new i() { // from class: k0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d9) {
                    int i82 = i12;
                    r rVar2 = rVar;
                    switch (i82) {
                        case 0:
                            float[] fArr2 = d.f13982a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f13982a;
                            return d.c(rVar2, d9);
                        case 2:
                            double d10 = rVar2.f14041b;
                            return d9 >= rVar2.f14044e ? Math.pow((d10 * d9) + rVar2.f14042c, rVar2.f14040a) : d9 * rVar2.f14043d;
                        case 3:
                            double d11 = rVar2.f14041b;
                            double d12 = rVar2.f14042c;
                            double d13 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e ? Math.pow((d11 * d9) + d12, rVar2.f14040a) + rVar2.f : (d13 * d9) + rVar2.f14045g;
                        case 4:
                            float[] fArr4 = d.f13982a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f13982a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d14 = rVar2.f14041b;
                            double d15 = rVar2.f14042c;
                            double d16 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d16 ? (Math.pow(d9, 1.0d / rVar2.f14040a) - d15) / d14 : d9 / d16;
                        default:
                            double d17 = rVar2.f14041b;
                            double d18 = rVar2.f14042c;
                            double d19 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d19 ? (Math.pow(d9 - rVar2.f, 1.0d / rVar2.f14040a) - d18) / d17 : (d9 - rVar2.f14045g) / d19;
                    }
                }
            };
        } else if (d8 == 0.0d && d7 == 0.0d) {
            final int i13 = 2;
            iVar2 = new i() { // from class: k0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d9) {
                    int i82 = i13;
                    r rVar2 = rVar;
                    switch (i82) {
                        case 0:
                            float[] fArr2 = d.f13982a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f13982a;
                            return d.c(rVar2, d9);
                        case 2:
                            double d10 = rVar2.f14041b;
                            return d9 >= rVar2.f14044e ? Math.pow((d10 * d9) + rVar2.f14042c, rVar2.f14040a) : d9 * rVar2.f14043d;
                        case 3:
                            double d11 = rVar2.f14041b;
                            double d12 = rVar2.f14042c;
                            double d13 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e ? Math.pow((d11 * d9) + d12, rVar2.f14040a) + rVar2.f : (d13 * d9) + rVar2.f14045g;
                        case 4:
                            float[] fArr4 = d.f13982a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f13982a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d14 = rVar2.f14041b;
                            double d15 = rVar2.f14042c;
                            double d16 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d16 ? (Math.pow(d9, 1.0d / rVar2.f14040a) - d15) / d14 : d9 / d16;
                        default:
                            double d17 = rVar2.f14041b;
                            double d18 = rVar2.f14042c;
                            double d19 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d19 ? (Math.pow(d9 - rVar2.f, 1.0d / rVar2.f14040a) - d18) / d17 : (d9 - rVar2.f14045g) / d19;
                    }
                }
            };
        } else {
            final int i14 = 3;
            iVar2 = new i() { // from class: k0.o
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d9) {
                    int i82 = i14;
                    r rVar2 = rVar;
                    switch (i82) {
                        case 0:
                            float[] fArr2 = d.f13982a;
                            return d.a(rVar2, d9);
                        case 1:
                            float[] fArr3 = d.f13982a;
                            return d.c(rVar2, d9);
                        case 2:
                            double d10 = rVar2.f14041b;
                            return d9 >= rVar2.f14044e ? Math.pow((d10 * d9) + rVar2.f14042c, rVar2.f14040a) : d9 * rVar2.f14043d;
                        case 3:
                            double d11 = rVar2.f14041b;
                            double d12 = rVar2.f14042c;
                            double d13 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e ? Math.pow((d11 * d9) + d12, rVar2.f14040a) + rVar2.f : (d13 * d9) + rVar2.f14045g;
                        case 4:
                            float[] fArr4 = d.f13982a;
                            return d.b(rVar2, d9);
                        case 5:
                            float[] fArr5 = d.f13982a;
                            return d.d(rVar2, d9);
                        case 6:
                            double d14 = rVar2.f14041b;
                            double d15 = rVar2.f14042c;
                            double d16 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d16 ? (Math.pow(d9, 1.0d / rVar2.f14040a) - d15) / d14 : d9 / d16;
                        default:
                            double d17 = rVar2.f14041b;
                            double d18 = rVar2.f14042c;
                            double d19 = rVar2.f14043d;
                            return d9 >= rVar2.f14044e * d19 ? (Math.pow(d9 - rVar2.f, 1.0d / rVar2.f14040a) - d18) / d17 : (d9 - rVar2.f14045g) / d19;
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, 0.0f, 1.0f, rVar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float a(int i) {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float b(int i) {
        return this.f14030e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final boolean c() {
        return this.f14039q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final long d(float f, float f7, float f8) {
        double d5 = f;
        m mVar = this.f14038p;
        float fD = (float) mVar.d(d5);
        float fD2 = (float) mVar.d(f7);
        float fD3 = (float) mVar.d(f8);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f9 = (fArr[6] * fD3) + (fArr[3] * fD2) + (fArr[0] * fD);
        return (((long) Float.floatToRawIntBits((fArr[7] * fD3) + (fArr[4] * fD2) + (fArr[1] * fD))) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final float e(float f, float f7, float f8) {
        double d5 = f;
        m mVar = this.f14038p;
        float fD = (float) mVar.d(d5);
        float fD2 = (float) mVar.d(f7);
        float fD3 = (float) mVar.d(f8);
        float[] fArr = this.i;
        return (fArr[8] * fD3) + (fArr[5] * fD2) + (fArr[2] * fD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        q qVar = (q) obj;
        r rVar = qVar.f14031g;
        if (Float.compare(qVar.f14030e, this.f14030e) != 0 || Float.compare(qVar.f, this.f) != 0 || !kotlin.jvm.internal.m.a(this.f14029d, qVar.f14029d) || !Arrays.equals(this.f14032h, qVar.f14032h)) {
            return false;
        }
        r rVar2 = this.f14031g;
        if (rVar2 != null) {
            return kotlin.jvm.internal.m.a(rVar2, rVar);
        }
        if (rVar == null) {
            return true;
        }
        if (kotlin.jvm.internal.m.a(this.f14033k, qVar.f14033k)) {
            return kotlin.jvm.internal.m.a(this.f14036n, qVar.f14036n);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final long f(float f, float f7, float f8, float f9, c cVar) {
        float[] fArr = this.j;
        float f10 = (fArr[6] * f8) + (fArr[3] * f7) + (fArr[0] * f);
        float f11 = (fArr[7] * f8) + (fArr[4] * f7) + (fArr[1] * f);
        float f12 = (fArr[8] * f8) + (fArr[5] * f7) + (fArr[2] * f);
        m mVar = this.f14035m;
        return AbstractC1145B.a((float) mVar.d(f10), (float) mVar.d(f11), (float) mVar.d(f12), f9, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f14032h) + ((this.f14029d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f14030e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f7 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f7 == 0.0f ? 0 : Float.floatToIntBits(f7))) * 31;
        r rVar = this.f14031g;
        int iHashCode2 = iFloatToIntBits2 + (rVar != null ? rVar.hashCode() : 0);
        if (rVar == null) {
            return this.f14036n.hashCode() + ((this.f14033k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x01e9 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263 A[EDGE_INSN: B:68:0x0263->B:69:0x0265 BREAK  A[LOOP:1: B:61:0x022b->B:67:0x025c], EDGE_INSN: B:75:0x0263->B:68:0x0263 BREAK  A[LOOP:0: B:46:0x01f4->B:52:0x0211]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r33, float[] r34, k0.s r35, float[] r36, k0.i r37, k0.i r38, float r39, float r40, k0.r r41, int r42) {
        /*
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r40
            r8 = r42
            long r9 = k0.b.f13974a
            r11 = r33
            r0.<init>(r11, r9, r8)
            r0.f14029d = r2
            r0.f14030e = r6
            r0.f = r7
            r9 = r41
            r0.f14031g = r9
            r0.f14033k = r4
            k0.p r9 = new k0.p
            r10 = 1
            r9.<init>(r0, r10)
            r0.f14034l = r9
            k0.m r9 = new k0.m
            r11 = 0
            r9.<init>(r0, r11)
            r0.f14035m = r9
            r0.f14036n = r5
            k0.p r9 = new k0.p
            r9.<init>(r0, r11)
            r0.f14037o = r9
            k0.m r9 = new k0.m
            r9.<init>(r0, r10)
            r0.f14038p = r9
            int r9 = r1.length
            r12 = 9
            r13 = 6
            if (r9 == r13) goto L57
            int r9 = r1.length
            if (r9 != r12) goto L4f
            goto L57
        L4f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"
            r1.<init>(r2)
            throw r1
        L57:
            int r9 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r9 >= 0) goto L27d
            float[] r9 = new float[r13]
            int r14 = r1.length
            r15 = 8
            r16 = 7
            r17 = 2
            r18 = 3
            r19 = 4
            r20 = 5
            if (r14 != r12) goto La3
            r14 = r1[r11]
            r21 = r1[r10]
            float r22 = r14 + r21
            r23 = r1[r17]
            float r22 = r22 + r23
            float r14 = r14 / r22
            r9[r11] = r14
            float r21 = r21 / r22
            r9[r10] = r21
            r14 = r1[r18]
            r21 = r1[r19]
            float r22 = r14 + r21
            r23 = r1[r20]
            float r22 = r22 + r23
            float r14 = r14 / r22
            r9[r17] = r14
            float r21 = r21 / r22
            r9[r18] = r21
            r14 = r1[r13]
            r21 = r1[r16]
            float r22 = r14 + r21
            r1 = r1[r15]
            float r22 = r22 + r1
            float r14 = r14 / r22
            r9[r19] = r14
            float r21 = r21 / r22
            r9[r20] = r21
            goto La6
        La3:
            java.lang.System.arraycopy(r1, r11, r9, r11, r13)
        La6:
            r0.f14032h = r9
            if (r3 != 0) goto L12c
            r3 = r9[r11]
            r14 = r9[r10]
            r21 = r9[r17]
            r22 = r9[r18]
            r23 = r9[r19]
            r24 = r9[r20]
            r33 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2.f14046a
            r41 = r11
            float r11 = r2.f14047b
            r25 = r15
            float r15 = (float) r10
            float r26 = r15 - r3
            float r26 = r26 / r14
            float r27 = r15 - r21
            float r27 = r27 / r22
            float r28 = r15 - r23
            float r28 = r28 / r24
            float r15 = r15 - r1
            float r15 = r15 / r11
            float r29 = r3 / r14
            float r30 = r21 / r22
            float r31 = r23 / r24
            float r1 = r1 / r11
            float r15 = r15 - r26
            float r30 = r30 - r29
            float r15 = r15 * r30
            float r1 = r1 - r29
            float r27 = r27 - r26
            float r11 = r1 * r27
            float r15 = r15 - r11
            float r28 = r28 - r26
            float r28 = r28 * r30
            float r31 = r31 - r29
            float r27 = r27 * r31
            float r28 = r28 - r27
            float r15 = r15 / r28
            float r31 = r31 * r15
            float r1 = r1 - r31
            float r1 = r1 / r30
            float r11 = r33 - r1
            float r11 = r11 - r15
            float r26 = r11 / r14
            float r27 = r1 / r22
            float r28 = r15 / r24
            float r29 = r26 * r3
            float r3 = r33 - r3
            float r3 = r3 - r14
            float r3 = r3 * r26
            float r14 = r27 * r21
            float r21 = r33 - r21
            float r21 = r21 - r22
            float r21 = r21 * r27
            float r22 = r28 * r23
            float r23 = r33 - r23
            float r23 = r23 - r24
            float r23 = r23 * r28
            float[] r12 = new float[r12]
            r12[r41] = r29
            r12[r10] = r11
            r12[r17] = r3
            r12[r18] = r14
            r12[r19] = r1
            r12[r20] = r21
            r12[r13] = r22
            r12[r16] = r15
            r12[r25] = r23
            r0.i = r12
            goto L135
        L12c:
            r41 = r11
            r33 = 1065353216(0x3f800000, float:1.0)
            int r1 = r3.length
            if (r1 != r12) goto L268
            r0.i = r3
        L135:
            float[] r1 = r0.i
            float[] r1 = k0.j.f(r1)
            r0.j = r1
            float r1 = k0.j.b(r9)
            float[] r3 = k0.d.f13982a
            float[] r3 = k0.d.f13983b
            float r3 = k0.j.b(r3)
            float r1 = r1 / r3
            r3 = 1063675494(0x3f666666, float:0.9)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1e5
            float[] r1 = k0.d.f13982a
            r11 = r9[r41]
            r12 = r1[r41]
            float r11 = r11 - r12
            r14 = r9[r10]
            r15 = r1[r10]
            float r14 = r14 - r15
            r16 = r9[r17]
            r21 = r1[r17]
            float r16 = r16 - r21
            r22 = r9[r18]
            r23 = r1[r18]
            float r22 = r22 - r23
            r24 = r9[r19]
            r25 = r1[r19]
            float r24 = r24 - r25
            r26 = r9[r20]
            r1 = r1[r20]
            float r26 = r26 - r1
            r34 = 0
            float[] r3 = new float[r13]
            r3[r41] = r11
            r3[r10] = r14
            r3[r17] = r16
            r3[r18] = r22
            r3[r19] = r24
            r3[r20] = r26
            r11 = r3[r41]
            r14 = r3[r10]
            float r16 = r12 - r25
            float r22 = r15 - r1
            float r22 = r22 * r11
            float r16 = r16 * r14
            float r22 = r22 - r16
            int r16 = (r22 > r34 ? 1 : (r22 == r34 ? 0 : -1))
            if (r16 < 0) goto L1e7
            float r16 = r12 - r21
            float r22 = r15 - r23
            float r16 = r16 * r14
            float r22 = r22 * r11
            float r16 = r16 - r22
            int r11 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r11 >= 0) goto L1a6
            goto L1e7
        L1a6:
            r11 = r3[r17]
            r14 = r3[r18]
            float r16 = r21 - r12
            float r17 = r23 - r15
            float r17 = r17 * r11
            float r16 = r16 * r14
            float r17 = r17 - r16
            int r16 = (r17 > r34 ? 1 : (r17 == r34 ? 0 : -1))
            if (r16 < 0) goto L1e7
            float r16 = r21 - r25
            float r17 = r23 - r1
            float r16 = r16 * r14
            float r17 = r17 * r11
            float r16 = r16 - r17
            int r11 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r11 >= 0) goto L1c7
            goto L1e7
        L1c7:
            r11 = r3[r19]
            r3 = r3[r20]
            float r14 = r25 - r21
            float r16 = r1 - r23
            float r16 = r16 * r11
            float r14 = r14 * r3
            float r16 = r16 - r14
            int r14 = (r16 > r34 ? 1 : (r16 == r34 ? 0 : -1))
            if (r14 < 0) goto L1e7
            float r25 = r25 - r12
            float r1 = r1 - r15
            float r25 = r25 * r3
            float r1 = r1 * r11
            float r25 = r25 - r1
            int r1 = (r25 > r34 ? 1 : (r25 == r34 ? 0 : -1))
            if (r1 < 0) goto L1e7
            goto L1e9
        L1e5:
            r34 = 0
        L1e7:
            int r1 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
        L1e9:
            if (r8 != 0) goto L1ed
            goto L265
        L1ed:
            float[] r1 = k0.d.f13982a
            if (r9 != r1) goto L1f2
            goto L214
        L1f2:
            r3 = r41
        L1f4:
            if (r3 >= r13) goto L214
            r8 = r9[r3]
            r11 = r1[r3]
            int r8 = java.lang.Float.compare(r8, r11)
            if (r8 == 0) goto L211
            r8 = r9[r3]
            r11 = r1[r3]
            float r8 = r8 - r11
            float r8 = java.lang.Math.abs(r8)
            r11 = 981668463(0x3a83126f, float:0.001)
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 <= 0) goto L211
            goto L263
        L211:
            int r3 = r3 + 1
            goto L1f4
        L214:
            k0.s r1 = k0.j.f14014d
            boolean r1 = k0.j.d(r2, r1)
            if (r1 != 0) goto L21d
            goto L263
        L21d:
            int r1 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
            if (r1 != 0) goto L263
            int r1 = (r7 > r33 ? 1 : (r7 == r33 ? 0 : -1))
            if (r1 != 0) goto L263
            float[] r1 = k0.d.f13982a
            k0.q r1 = k0.d.f13986e
            r2 = 0
        L22b:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 > 0) goto L265
            k0.i r6 = r1.f14033k
            double r7 = r4.d(r2)
            double r11 = r6.d(r2)
            double r7 = r7 - r11
            double r6 = java.lang.Math.abs(r7)
            r8 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L263
            k0.i r6 = r1.f14036n
            double r11 = r5.d(r2)
            double r6 = r6.d(r2)
            double r11 = r11 - r6
            double r6 = java.lang.Math.abs(r11)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L263
            r6 = 4571171282956062736(0x3f70101010101010, double:0.00392156862745098)
            double r2 = r2 + r6
            goto L22b
        L263:
            r10 = r41
        L265:
            r0.f14039q = r10
            return
        L268:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Transform must have 9 entries! Has "
            r2.<init>(r4)
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L27d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid range: min="
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = ", max="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "; min must be strictly < max"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.q.<init>(java.lang.String, float[], k0.s, float[], k0.i, k0.i, float, float, k0.r, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(String str, float[] fArr, s sVar, final double d5, float f, float f7, int i) {
        i iVar;
        i iVar2 = f14028r;
        if (d5 == 1.0d) {
            iVar = iVar2;
        } else {
            final int i7 = 0;
            iVar = new i() { // from class: k0.n
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d7) {
                    switch (i7) {
                        case 0:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, 1.0d / d5);
                        default:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, d5);
                    }
                }
            };
        }
        if (d5 != 1.0d) {
            final int i8 = 1;
            iVar2 = new i() { // from class: k0.n
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // k0.i
                public final double d(double d7) {
                    switch (i8) {
                        case 0:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, 1.0d / d5);
                        default:
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            return Math.pow(d7, d5);
                    }
                }
            };
        }
        this(str, fArr, sVar, null, iVar, iVar2, f, f7, new r(d5, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
