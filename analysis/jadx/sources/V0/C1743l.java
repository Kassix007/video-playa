package v0;

import i0.C1130b;
import java.util.ArrayList;

/* JADX INFO: renamed from: v0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1743l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17464e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17466h;
    public final int i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f17467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f17468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f17469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1743l f17471o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1743l(long j, long j7, long j8, boolean z5, float f, long j9, long j10, boolean z6, boolean z7, int i, long j11) {
        this.f17460a = j;
        this.f17461b = j7;
        this.f17462c = j8;
        this.f17463d = z5;
        this.f17464e = f;
        this.f = j9;
        this.f17465g = j10;
        this.f17466h = z6;
        this.i = i;
        this.j = j11;
        this.f17468l = 0L;
        this.f17469m = z7;
        this.f17470n = z7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        C1743l c1743l = this.f17471o;
        if (c1743l == null) {
            this.f17469m = true;
            this.f17470n = true;
        } else if (c1743l != null) {
            c1743l.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        C1743l c1743l = this.f17471o;
        return c1743l != null ? c1743l.b() : this.f17469m || this.f17470n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) ("PointerId(value=" + this.f17460a + ')'));
        sb.append(", uptimeMillis=");
        sb.append(this.f17461b);
        sb.append(", position=");
        sb.append((Object) C1130b.g(this.f17462c));
        sb.append(", pressed=");
        sb.append(this.f17463d);
        sb.append(", pressure=");
        sb.append(this.f17464e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) C1130b.g(this.f17465g));
        sb.append(", previousPressed=");
        sb.append(this.f17466h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i = this.i;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", historical=");
        Object obj = this.f17467k;
        if (obj == null) {
            obj = n5.s.f15299q;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C1130b.g(this.j));
        sb.append(')');
        return sb.toString();
    }

    public C1743l(long j, long j7, long j8, boolean z5, float f, long j9, long j10, boolean z6, int i, ArrayList arrayList, long j11, long j12) {
        this(j, j7, j8, z5, f, j9, j10, z6, false, i, j11);
        this.f17467k = arrayList;
        this.f17468l = j12;
    }
}
