package W0;

import com.google.android.gms.internal.measurement.AbstractC0836n2;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f8010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f8011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final X0.a f8012s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(float f, float f7, X0.a aVar) {
        this.f8010q = f;
        this.f8011r = f7;
        this.f8012s = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float D(long j) {
        if (o.a(n.b(j), 4294967296L)) {
            return this.f8012s.b(n.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f8010q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f8010q, eVar.f8010q) == 0 && Float.compare(this.f8011r, eVar.f8011r) == 0 && kotlin.jvm.internal.m.a(this.f8012s, eVar.f8012s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8012s.hashCode() + k1.i.b(this.f8011r, Float.hashCode(this.f8010q) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f8011r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long s(float f) {
        return AbstractC0836n2.E(4294967296L, this.f8012s.a(f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DensityWithConverter(density=" + this.f8010q + ", fontScale=" + this.f8011r + ", converter=" + this.f8012s + ')';
    }
}
