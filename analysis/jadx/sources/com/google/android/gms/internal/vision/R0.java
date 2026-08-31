package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends T0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11229b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f11229b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.T0
    public final byte a(long j, Object obj) {
        switch (this.f11229b) {
            case 0:
                if (!U0.f11239g) {
                }
                break;
            default:
                if (!U0.f11239g) {
                }
                break;
        }
        return U0.o(j, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.T0
    public final void c(Object obj, long j, byte b7) {
        switch (this.f11229b) {
            case 0:
                if (!U0.f11239g) {
                    U0.j(obj, j, b7);
                } else {
                    U0.i(obj, j, b7);
                }
                break;
            default:
                if (!U0.f11239g) {
                    U0.j(obj, j, b7);
                } else {
                    U0.i(obj, j, b7);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.T0
    public final void d(Object obj, long j, double d5) {
        switch (this.f11229b) {
            case 0:
                f(obj, j, Double.doubleToLongBits(d5));
                break;
            default:
                f(obj, j, Double.doubleToLongBits(d5));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.T0
    public final void e(Object obj, long j, float f) {
        switch (this.f11229b) {
            case 0:
                b(Float.floatToIntBits(f), j, obj);
                break;
            default:
                b(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.T0
    public final void g(Object obj, long j, boolean z5) {
        switch (this.f11229b) {
            case 0:
                if (!U0.f11239g) {
                    U0.j(obj, j, z5 ? (byte) 1 : (byte) 0);
                } else {
                    U0.i(obj, j, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!U0.f11239g) {
                    U0.j(obj, j, z5 ? (byte) 1 : (byte) 0);
                } else {
                    U0.i(obj, j, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.T0
    public final boolean h(long j, Object obj) {
        switch (this.f11229b) {
            case 0:
                if (U0.f11239g) {
                    if (U0.n(j, obj) == 0) {
                    }
                } else if (U0.o(j, obj) == 0) {
                }
                break;
            default:
                if (U0.f11239g) {
                    if (U0.n(j, obj) == 0) {
                    }
                } else if (U0.o(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.T0
    public final float i(long j, Object obj) {
        switch (this.f11229b) {
        }
        return Float.intBitsToFloat(k(j, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.T0
    public final double j(long j, Object obj) {
        switch (this.f11229b) {
        }
        return Double.longBitsToDouble(l(j, obj));
    }
}
