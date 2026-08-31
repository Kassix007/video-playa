package v0;

import i0.C1130b;
import java.util.ArrayList;

/* JADX INFO: renamed from: v0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1745n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17479e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17481h;
    public final ArrayList i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f17482k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1745n(long j, long j7, long j8, long j9, boolean z5, float f, int i, boolean z6, ArrayList arrayList, long j10, long j11) {
        this.f17475a = j;
        this.f17476b = j7;
        this.f17477c = j8;
        this.f17478d = j9;
        this.f17479e = z5;
        this.f = f;
        this.f17480g = i;
        this.f17481h = z6;
        this.i = arrayList;
        this.j = j10;
        this.f17482k = j11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1745n)) {
            return false;
        }
        C1745n c1745n = (C1745n) obj;
        return v.d(this.f17475a, c1745n.f17475a) && this.f17476b == c1745n.f17476b && C1130b.b(this.f17477c, c1745n.f17477c) && C1130b.b(this.f17478d, c1745n.f17478d) && this.f17479e == c1745n.f17479e && Float.compare(this.f, c1745n.f) == 0 && this.f17480g == c1745n.f17480g && this.f17481h == c1745n.f17481h && this.i.equals(c1745n.i) && C1130b.b(this.j, c1745n.j) && C1130b.b(this.f17482k, c1745n.f17482k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f17482k) + k1.i.d((this.i.hashCode() + k1.i.e(k1.i.c(this.f17480g, k1.i.b(this.f, k1.i.e(k1.i.d(k1.i.d(k1.i.d(Long.hashCode(this.f17475a) * 31, 31, this.f17476b), 31, this.f17477c), 31, this.f17478d), 31, this.f17479e), 31), 31), 31, this.f17481h)) * 31, 31, this.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.f17475a + ')'));
        sb.append(", uptime=");
        sb.append(this.f17476b);
        sb.append(", positionOnScreen=");
        sb.append((Object) C1130b.g(this.f17477c));
        sb.append(", position=");
        sb.append((Object) C1130b.g(this.f17478d));
        sb.append(", down=");
        sb.append(this.f17479e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.f17480g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f17481h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) C1130b.g(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) C1130b.g(this.f17482k));
        sb.append(')');
        return sb.toString();
    }
}
