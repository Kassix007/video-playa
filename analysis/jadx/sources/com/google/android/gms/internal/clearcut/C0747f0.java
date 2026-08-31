package com.google.android.gms.internal.clearcut;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0747f0 extends h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10504b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0747f0(Unsafe unsafe, int i) {
        super(unsafe);
        this.f10504b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final void c(Object obj, long j, double d5) {
        switch (this.f10504b) {
            case 0:
                e(obj, j, Double.doubleToLongBits(d5));
                break;
            default:
                e(obj, j, Double.doubleToLongBits(d5));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final void d(Object obj, long j, float f) {
        switch (this.f10504b) {
            case 0:
                b(Float.floatToIntBits(f), j, obj);
                break;
            default:
                b(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final void f(Object obj, long j, boolean z5) {
        switch (this.f10504b) {
            case 0:
                if (!i0.f10515h) {
                    i0.e(obj, j, z5 ? (byte) 1 : (byte) 0);
                } else {
                    i0.d(obj, j, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!i0.f10515h) {
                    i0.e(obj, j, z5 ? (byte) 1 : (byte) 0);
                } else {
                    i0.d(obj, j, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final boolean i(long j, Object obj) {
        switch (this.f10504b) {
            case 0:
                if (i0.f10515h) {
                    if (i0.l(j, obj) == 0) {
                    }
                } else if (i0.m(j, obj) == 0) {
                }
                break;
            default:
                if (i0.f10515h) {
                    if (i0.l(j, obj) == 0) {
                    }
                } else if (i0.m(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final float j(long j, Object obj) {
        switch (this.f10504b) {
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final double k(long j, Object obj) {
        switch (this.f10504b) {
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final byte l(long j, Object obj) {
        switch (this.f10504b) {
            case 0:
                if (!i0.f10515h) {
                }
                break;
            default:
                if (!i0.f10515h) {
                }
                break;
        }
        return i0.m(j, obj);
    }
}
