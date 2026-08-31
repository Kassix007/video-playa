package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends h0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final void c(Object obj, long j, double d5) {
        this.f10506a.putDouble(obj, j, d5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final void d(Object obj, long j, float f) {
        this.f10506a.putFloat(obj, j, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final void f(Object obj, long j, boolean z5) {
        this.f10506a.putBoolean(obj, j, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final boolean i(long j, Object obj) {
        return this.f10506a.getBoolean(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final float j(long j, Object obj) {
        return this.f10506a.getFloat(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final double k(long j, Object obj) {
        return this.f10506a.getDouble(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.clearcut.h0
    public final byte l(long j, Object obj) {
        return this.f10506a.getByte(obj, j);
    }
}
