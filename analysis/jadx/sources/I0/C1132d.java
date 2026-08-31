package i0;

import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import k1.i;

/* JADX INFO: renamed from: i0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1132d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13530e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13532h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        l6.d.h(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1132d(float f, float f7, float f8, float f9, long j, long j7, long j8, long j9) {
        this.f13526a = f;
        this.f13527b = f7;
        this.f13528c = f8;
        this.f13529d = f9;
        this.f13530e = j;
        this.f = j7;
        this.f13531g = j8;
        this.f13532h = j9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float a() {
        return this.f13529d - this.f13527b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b() {
        return this.f13528c - this.f13526a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132d)) {
            return false;
        }
        C1132d c1132d = (C1132d) obj;
        return Float.compare(this.f13526a, c1132d.f13526a) == 0 && Float.compare(this.f13527b, c1132d.f13527b) == 0 && Float.compare(this.f13528c, c1132d.f13528c) == 0 && Float.compare(this.f13529d, c1132d.f13529d) == 0 && I1.V(this.f13530e, c1132d.f13530e) && I1.V(this.f, c1132d.f) && I1.V(this.f13531g, c1132d.f13531g) && I1.V(this.f13532h, c1132d.f13532h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13532h) + i.d(i.d(i.d(i.b(this.f13529d, i.b(this.f13528c, i.b(this.f13527b, Float.hashCode(this.f13526a) * 31, 31), 31), 31), 31, this.f13530e), 31, this.f), 31, this.f13531g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str = K1.M(this.f13526a) + ", " + K1.M(this.f13527b) + ", " + K1.M(this.f13528c) + ", " + K1.M(this.f13529d);
        long j = this.f13530e;
        long j7 = this.f;
        boolean zV = I1.V(j, j7);
        long j8 = this.f13531g;
        long j9 = this.f13532h;
        if (!zV || !I1.V(j7, j8) || !I1.V(j8, j9)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) I1.G0(j)) + ", topRight=" + ((Object) I1.G0(j7)) + ", bottomRight=" + ((Object) I1.G0(j8)) + ", bottomLeft=" + ((Object) I1.G0(j9)) + ')';
        }
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i7)) {
            return "RoundRect(rect=" + str + ", radius=" + K1.M(Float.intBitsToFloat(i)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + K1.M(Float.intBitsToFloat(i)) + ", y=" + K1.M(Float.intBitsToFloat(i7)) + ')';
    }
}
