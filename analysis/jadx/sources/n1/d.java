package n1;

import android.graphics.Path;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f15130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f15131b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(char c7, float[] fArr) {
        this.f15130a = c7;
        this.f15131b = fArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Path path, float f, float f7, float f8, float f9, float f10, float f11, float f12, boolean z5, boolean z6) {
        double d5;
        double d7;
        double radians = Math.toRadians(f12);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d8 = f;
        double d9 = f7;
        double d10 = f10;
        double d11 = ((d9 * dSin) + (d8 * dCos)) / d10;
        double d12 = f11;
        double d13 = ((d9 * dCos) + (((double) (-f)) * dSin)) / d12;
        double d14 = f9;
        double d15 = ((d14 * dSin) + (((double) f8) * dCos)) / d10;
        double d16 = ((d14 * dCos) + (((double) (-f8)) * dSin)) / d12;
        double d17 = d11 - d15;
        double d18 = d13 - d16;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d13 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f, f7, f8, f9, f10 * fSqrt, fSqrt * f11, f12, z5, z6);
            return;
        }
        double dSqrt = Math.sqrt(d22);
        double d23 = dSqrt * d17;
        double d24 = dSqrt * d18;
        if (z5 == z6) {
            d5 = d19 - d24;
            d7 = d20 + d23;
        } else {
            d5 = d19 + d24;
            d7 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d7, d11 - d5);
        double dAtan22 = Math.atan2(d16 - d7, d15 - d5) - dAtan2;
        if (z6 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d5 * d10;
        double d26 = d7 * d12;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d10;
        double d30 = d29 * dCos2;
        double d31 = d12 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d12 * dCos2;
        double d35 = dAtan22 / ((double) iCeil);
        double d36 = (dCos3 * d34) + (dSin3 * d33);
        double d37 = d8;
        double d38 = d9;
        int i = 0;
        double d39 = dAtan2;
        while (i < iCeil) {
            double d40 = d39 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i7 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d42 = (d34 * dSin4) + (d10 * dSin2 * dCos4) + d28;
            double d43 = (d30 * dSin4) - (d31 * dCos4);
            double d44 = (dCos4 * d34) + (dSin4 * d33);
            double d45 = d40 - d39;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d32 * dSqrt2) + d37), (float) ((d36 * dSqrt2) + d38), (float) (d41 - (dSqrt2 * d43)), (float) (d42 - (dSqrt2 * d44)), (float) d41, (float) d42);
            i++;
            d38 = d42;
            dCos2 = dCos2;
            d33 = d33;
            d39 = d40;
            d36 = d44;
            d37 = d41;
            iCeil = i7;
            d32 = d43;
            d35 = d35;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v8, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(d[] dVarArr, Path path) {
        int i;
        float[] fArr;
        int i7;
        d dVar;
        int i8;
        char c7;
        float f;
        float f7;
        d dVar2;
        boolean z5;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        d[] dVarArr2 = dVarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = dVarArr2.length;
        int i9 = 0;
        int i10 = 0;
        char c8 = 'm';
        while (i10 < length) {
            d dVar3 = dVarArr2[i10];
            char c9 = dVar3.f15130a;
            float[] fArr3 = dVar3.f15131b;
            float f16 = fArr2[i9];
            float f17 = fArr2[1];
            float f18 = fArr2[2];
            float f19 = fArr2[3];
            float f20 = fArr2[4];
            int i11 = i9;
            float f21 = fArr2[5];
            switch (c9) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f20, f21);
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                default:
                    i = 2;
                    break;
            }
            float f22 = f20;
            float f23 = f21;
            float f24 = f16;
            float f25 = f17;
            int i12 = i11;
            while (i12 < fArr3.length) {
                if (c9 == 'A') {
                    fArr = fArr3;
                    i7 = i12;
                    dVar = dVar3;
                    float f26 = f24;
                    float f27 = f25;
                    i8 = i10;
                    c7 = c9;
                    int i13 = i7 + 5;
                    int i14 = i7 + 6;
                    a(path, f26, f27, fArr[i13], fArr[i14], fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3] != 0.0f ? 1 : i11, fArr[i7 + 4] != 0.0f ? 1 : i11);
                    f18 = fArr[i13];
                    f = fArr[i14];
                    f19 = f;
                    f7 = f18;
                } else if (c9 == 'C') {
                    fArr = fArr3;
                    i7 = i12;
                    i8 = i10;
                    dVar = dVar3;
                    c7 = c9;
                    int i15 = i7 + 2;
                    int i16 = i7 + 3;
                    int i17 = i7 + 4;
                    int i18 = i7 + 5;
                    path2.cubicTo(fArr[i7], fArr[i7 + 1], fArr[i15], fArr[i16], fArr[i17], fArr[i18]);
                    float f28 = fArr[i17];
                    float f29 = fArr[i18];
                    f18 = fArr[i15];
                    f19 = fArr[i16];
                    f = f29;
                    f7 = f28;
                } else if (c9 == 'H') {
                    fArr = fArr3;
                    i7 = i12;
                    dVar = dVar3;
                    c7 = c9;
                    f = f25;
                    i8 = i10;
                    path2.lineTo(fArr[i7], f);
                    f7 = fArr[i7];
                } else if (c9 == 'Q') {
                    fArr = fArr3;
                    i7 = i12;
                    i8 = i10;
                    dVar = dVar3;
                    c7 = c9;
                    int i19 = i7 + 1;
                    int i20 = i7 + 2;
                    int i21 = i7 + 3;
                    path2.quadTo(fArr[i7], fArr[i19], fArr[i20], fArr[i21]);
                    float f30 = fArr[i7];
                    float f31 = fArr[i19];
                    float f32 = fArr[i20];
                    float f33 = fArr[i21];
                    f18 = f30;
                    f19 = f31;
                    f7 = f32;
                    f = f33;
                } else if (c9 == 'V') {
                    fArr = fArr3;
                    i7 = i12;
                    i8 = i10;
                    dVar = dVar3;
                    f7 = f24;
                    c7 = c9;
                    path2.lineTo(f7, fArr[i7]);
                    f = fArr[i7];
                } else if (c9 != 'a') {
                    if (c9 == 'c') {
                        fArr = fArr3;
                        i7 = i12;
                        int i22 = i7 + 2;
                        int i23 = i7 + 3;
                        int i24 = i7 + 4;
                        int i25 = i7 + 5;
                        path2.rCubicTo(fArr[i7], fArr[i7 + 1], fArr[i22], fArr[i23], fArr[i24], fArr[i25]);
                        float f34 = fArr[i22] + f24;
                        float f35 = fArr[i23] + f25;
                        f24 += fArr[i24];
                        f25 += fArr[i25];
                        f18 = f34;
                        f19 = f35;
                    } else if (c9 != 'h') {
                        if (c9 != 'q') {
                            if (c9 != 'v') {
                                if (c9 == 'L') {
                                    fArr = fArr3;
                                    i7 = i12;
                                    int i26 = i7 + 1;
                                    path2.lineTo(fArr[i7], fArr[i26]);
                                    f7 = fArr[i7];
                                    f = fArr[i26];
                                } else if (c9 == 'M') {
                                    fArr = fArr3;
                                    i7 = i12;
                                    f7 = fArr[i7];
                                    f = fArr[i7 + 1];
                                    if (i7 > 0) {
                                        path2.lineTo(f7, f);
                                    } else {
                                        path2.moveTo(f7, f);
                                        f22 = f7;
                                        f23 = f;
                                    }
                                } else if (c9 != 'S') {
                                    if (c9 == 'T') {
                                        fArr = fArr3;
                                        i7 = i12;
                                        if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                            f24 = (f24 * 2.0f) - f18;
                                            f25 = (f25 * 2.0f) - f19;
                                        }
                                        int i27 = i7 + 1;
                                        path2.quadTo(f24, f25, fArr[i7], fArr[i27]);
                                        f7 = fArr[i7];
                                        f = fArr[i27];
                                        dVar = dVar3;
                                        f18 = f24;
                                        f19 = f25;
                                    } else if (c9 == 'l') {
                                        fArr = fArr3;
                                        i7 = i12;
                                        int i28 = i7 + 1;
                                        path2.rLineTo(fArr[i7], fArr[i28]);
                                        f24 += fArr[i7];
                                        f11 = fArr[i28];
                                    } else if (c9 == 'm') {
                                        fArr = fArr3;
                                        i7 = i12;
                                        float f36 = fArr[i7];
                                        f24 += f36;
                                        float f37 = fArr[i7 + 1];
                                        f25 += f37;
                                        if (i7 > 0) {
                                            path2.rLineTo(f36, f37);
                                        } else {
                                            path2.rMoveTo(f36, f37);
                                            dVar = dVar3;
                                            f7 = f24;
                                            f22 = f7;
                                            f = f25;
                                            f23 = f;
                                        }
                                    } else if (c9 != 's') {
                                        if (c9 != 't') {
                                            fArr = fArr3;
                                            i7 = i12;
                                            dVar = dVar3;
                                            f7 = f24;
                                        } else {
                                            if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                                f14 = f24 - f18;
                                                f15 = f25 - f19;
                                            } else {
                                                f15 = 0.0f;
                                                f14 = 0.0f;
                                            }
                                            int i29 = i12 + 1;
                                            path2.rQuadTo(f14, f15, fArr3[i12], fArr3[i29]);
                                            float f38 = f14 + f24;
                                            float f39 = f15 + f25;
                                            float f40 = f24 + fArr3[i12];
                                            f25 += fArr3[i29];
                                            f19 = f39;
                                            fArr = fArr3;
                                            i7 = i12;
                                            dVar = dVar3;
                                            f7 = f40;
                                            f18 = f38;
                                        }
                                        f = f25;
                                    } else {
                                        if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                            f12 = f25 - f19;
                                            f13 = f24 - f18;
                                        } else {
                                            f13 = 0.0f;
                                            f12 = 0.0f;
                                        }
                                        int i30 = i12;
                                        int i31 = i30 + 1;
                                        int i32 = i30 + 2;
                                        int i33 = i30 + 3;
                                        fArr = fArr3;
                                        i7 = i30;
                                        path2.rCubicTo(f13, f12, fArr3[i30], fArr3[i31], fArr3[i32], fArr3[i33]);
                                        f8 = fArr[i7] + f24;
                                        f9 = fArr[i31] + f25;
                                        f24 += fArr[i32];
                                        f10 = fArr[i33];
                                    }
                                    i8 = i10;
                                    c7 = c9;
                                } else {
                                    fArr = fArr3;
                                    i7 = i12;
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        f24 = (f24 * 2.0f) - f18;
                                        f25 = (f25 * 2.0f) - f19;
                                    }
                                    float f41 = f24;
                                    float f42 = f25;
                                    int i34 = i7 + 1;
                                    int i35 = i7 + 2;
                                    int i36 = i7 + 3;
                                    path2.cubicTo(f41, f42, fArr[i7], fArr[i34], fArr[i35], fArr[i36]);
                                    f18 = fArr[i7];
                                    f19 = fArr[i34];
                                    f7 = fArr[i35];
                                    f = fArr[i36];
                                }
                                i8 = i10;
                                dVar = dVar3;
                                c7 = c9;
                            } else {
                                fArr = fArr3;
                                i7 = i12;
                                path2.rLineTo(0.0f, fArr[i7]);
                                f11 = fArr[i7];
                            }
                            f25 += f11;
                        } else {
                            fArr = fArr3;
                            i7 = i12;
                            int i37 = i7 + 1;
                            int i38 = i7 + 2;
                            int i39 = i7 + 3;
                            path2.rQuadTo(fArr[i7], fArr[i37], fArr[i38], fArr[i39]);
                            f8 = fArr[i7] + f24;
                            f9 = fArr[i37] + f25;
                            f24 += fArr[i38];
                            f10 = fArr[i39];
                        }
                        f25 += f10;
                        f18 = f8;
                        f19 = f9;
                    } else {
                        fArr = fArr3;
                        i7 = i12;
                        path2.rLineTo(fArr[i7], 0.0f);
                        f24 += fArr[i7];
                    }
                    dVar = dVar3;
                    f7 = f24;
                    f = f25;
                    i8 = i10;
                    c7 = c9;
                } else {
                    fArr = fArr3;
                    i7 = i12;
                    int i40 = i7 + 5;
                    float f43 = fArr[i40] + f24;
                    int i41 = i7 + 6;
                    float f44 = fArr[i41] + f25;
                    float f45 = fArr[i7];
                    float f46 = fArr[i7 + 1];
                    float f47 = fArr[i7 + 2];
                    if (fArr[i7 + 3] != 0.0f) {
                        dVar2 = dVar3;
                        z5 = 1;
                    } else {
                        dVar2 = dVar3;
                        z5 = i11;
                    }
                    dVar = dVar2;
                    float f48 = f24;
                    c7 = c9;
                    float f49 = f25;
                    i8 = i10;
                    a(path, f48, f49, f43, f44, f45, f46, f47, z5, fArr[i7 + 4] != 0.0f ? 1 : i11);
                    f7 = f48 + fArr[i40];
                    f = f49 + fArr[i41];
                    f18 = f7;
                    f19 = f;
                }
                i12 = i7 + i;
                path2 = path;
                dVar3 = dVar;
                c9 = c7;
                i10 = i8;
                f24 = f7;
                f25 = f;
                c8 = c9;
                fArr3 = fArr;
            }
            fArr2[i11] = f24;
            fArr2[1] = f25;
            fArr2[2] = f18;
            fArr2[3] = f19;
            fArr2[4] = f22;
            fArr2[5] = f23;
            c8 = dVar3.f15130a;
            i10++;
            dVarArr2 = dVarArr;
            path2 = path;
            i9 = i11;
        }
    }

    public d(d dVar) {
        this.f15130a = dVar.f15130a;
        float[] fArr = dVar.f15131b;
        this.f15131b = E3.h.v(fArr, fArr.length);
    }
}
