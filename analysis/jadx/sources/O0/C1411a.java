package o0;

import B0.N;
import W0.i;
import W0.k;
import com.google.android.gms.internal.measurement.P1;
import j0.C1150e;
import j0.j;
import kotlin.jvm.internal.m;
import l0.C1219b;
import l0.InterfaceC1221d;

/* JADX INFO: renamed from: o0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1411a extends AbstractC1412b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j f15321A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1150e f15322v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f15323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15324x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f15325y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f15326z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1411a(C1150e c1150e) {
        this(c1150e, (((long) c1150e.f13704a.getHeight()) & 4294967295L) | (((long) c1150e.f13704a.getWidth()) << 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final boolean a(float f) {
        this.f15326z = f;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final boolean d(j jVar) {
        this.f15321A = jVar;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1411a)) {
            return false;
        }
        C1411a c1411a = (C1411a) obj;
        return m.a(this.f15322v, c1411a.f15322v) && i.a(0L, 0L) && k.a(this.f15323w, c1411a.f15323w) && this.f15324x == c1411a.f15324x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final long h() {
        return P1.d0(this.f15325y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f15324x) + k1.i.d(k1.i.d(this.f15322v.hashCode() * 31, 31, 0L), 31, this.f15323w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final void i(N n7) {
        C1219b c1219b = n7.f296q;
        int iRound = Math.round(Float.intBitsToFloat((int) (c1219b.d() >> 32)));
        InterfaceC1221d.y(n7, this.f15322v, this.f15323w, (((long) Math.round(Float.intBitsToFloat((int) (c1219b.d() & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32), this.f15326z, this.f15321A, this.f15324x, 328);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f15322v);
        sb.append(", srcOffset=");
        sb.append((Object) i.d(0L));
        sb.append(", srcSize=");
        sb.append((Object) k.b(this.f15323w));
        sb.append(", filterQuality=");
        int i = this.f15324x;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public C1411a(C1150e c1150e, long j) {
        int i;
        int i7;
        this.f15322v = c1150e;
        this.f15323w = j;
        this.f15324x = 1;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i = (int) (j >> 32)) >= 0 && (i7 = (int) (4294967295L & j)) >= 0 && i <= c1150e.f13704a.getWidth() && i7 <= c1150e.f13704a.getHeight()) {
            this.f15325y = j;
            this.f15326z = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
