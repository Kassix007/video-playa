package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0771a3 extends AbstractC0782c3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0782c3
    public final void a(Object obj, long j, byte b7) {
        if (AbstractC0787d3.f10826g) {
            AbstractC0787d3.c(obj, j, b7);
        } else {
            AbstractC0787d3.d(obj, j, b7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0782c3
    public final boolean b(long j, Object obj) {
        return AbstractC0787d3.f10826g ? AbstractC0787d3.n(j, obj) : AbstractC0787d3.o(j, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0782c3
    public final void c(Object obj, long j, boolean z5) {
        if (AbstractC0787d3.f10826g) {
            AbstractC0787d3.c(obj, j, z5 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC0787d3.d(obj, j, z5 ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0782c3
    public final float d(long j, Object obj) {
        return Float.intBitsToFloat(this.f10816a.getInt(obj, j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0782c3
    public final void e(Object obj, long j, float f) {
        this.f10816a.putInt(obj, j, Float.floatToIntBits(f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0782c3
    public final double f(long j, Object obj) {
        return Double.longBitsToDouble(this.f10816a.getLong(obj, j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0782c3
    public final void g(Object obj, long j, double d5) {
        this.f10816a.putLong(obj, j, Double.doubleToLongBits(d5));
    }
}
