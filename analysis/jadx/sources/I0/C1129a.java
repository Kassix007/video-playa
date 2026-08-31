package i0;

import com.google.android.gms.internal.measurement.K1;

/* JADX INFO: renamed from: i0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1129a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13519e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1129a() {
        this.f13515a = 0;
        this.f13516b = 0.0f;
        this.f13517c = 0.0f;
        this.f13518d = 0.0f;
        this.f13519e = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(float f, float f7, float f8, float f9) {
        this.f13516b = Math.max(f, this.f13516b);
        this.f13517c = Math.max(f7, this.f13517c);
        this.f13518d = Math.min(f8, this.f13518d);
        this.f13519e = Math.min(f9, this.f13519e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean b() {
        return (this.f13516b >= this.f13518d) | (this.f13517c >= this.f13519e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float c() {
        return this.f13516b + this.f13518d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float d() {
        return this.f13517c + this.f13519e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f13515a) {
            case 0:
                return "MutableRect(" + K1.M(this.f13516b) + ", " + K1.M(this.f13517c) + ", " + K1.M(this.f13518d) + ", " + K1.M(this.f13519e) + ')';
            default:
                return "[" + this.f13516b + " " + this.f13517c + " " + this.f13518d + " " + this.f13519e + "]";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1129a(float f, float f7, float f8, float f9) {
        this.f13515a = 1;
        this.f13516b = f;
        this.f13517c = f7;
        this.f13518d = f8;
        this.f13519e = f9;
    }

    public C1129a(C1129a c1129a) {
        this.f13515a = 1;
        this.f13516b = c1129a.f13516b;
        this.f13517c = c1129a.f13517c;
        this.f13518d = c1129a.f13518d;
        this.f13519e = c1129a.f13519e;
    }
}
