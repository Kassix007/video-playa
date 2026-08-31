package i0;

import com.google.android.gms.internal.measurement.K1;
import k1.i;

/* JADX INFO: renamed from: i0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1131c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1131c f13521e = new C1131c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13525d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1131c(float f, float f7, float f8, float f9) {
        this.f13522a = f;
        this.f13523b = f7;
        this.f13524c = f8;
        this.f13525d = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a() {
        float f = this.f13524c;
        float f7 = this.f13522a;
        float f8 = ((f - f7) / 2.0f) + f7;
        float f9 = this.f13525d;
        float f10 = this.f13523b;
        return (((long) Float.floatToRawIntBits(((f9 - f10) / 2.0f) + f10)) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long b() {
        float f = this.f13524c - this.f13522a;
        return (((long) Float.floatToRawIntBits(this.f13525d - this.f13523b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1131c c(C1131c c1131c) {
        return new C1131c(Math.max(this.f13522a, c1131c.f13522a), Math.max(this.f13523b, c1131c.f13523b), Math.min(this.f13524c, c1131c.f13524c), Math.min(this.f13525d, c1131c.f13525d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1131c d(float f, float f7) {
        return new C1131c(this.f13522a + f, this.f13523b + f7, this.f13524c + f, this.f13525d + f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1131c e(long j) {
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        return new C1131c(Float.intBitsToFloat(i) + this.f13522a, Float.intBitsToFloat(i7) + this.f13523b, Float.intBitsToFloat(i) + this.f13524c, Float.intBitsToFloat(i7) + this.f13525d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1131c)) {
            return false;
        }
        C1131c c1131c = (C1131c) obj;
        return Float.compare(this.f13522a, c1131c.f13522a) == 0 && Float.compare(this.f13523b, c1131c.f13523b) == 0 && Float.compare(this.f13524c, c1131c.f13524c) == 0 && Float.compare(this.f13525d, c1131c.f13525d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f13525d) + i.b(this.f13524c, i.b(this.f13523b, Float.hashCode(this.f13522a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Rect.fromLTRB(" + K1.M(this.f13522a) + ", " + K1.M(this.f13523b) + ", " + K1.M(this.f13524c) + ", " + K1.M(this.f13525d) + ')';
    }
}
