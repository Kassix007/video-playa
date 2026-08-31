package L0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0192d f3071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f3072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3075e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W0.c f3076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final W0.l f3077h;
    public final O0.d i;
    public final long j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B(C0192d c0192d, F f, List list, int i, boolean z5, int i7, W0.c cVar, W0.l lVar, O0.d dVar, long j) {
        this.f3071a = c0192d;
        this.f3072b = f;
        this.f3073c = list;
        this.f3074d = i;
        this.f3075e = z5;
        this.f = i7;
        this.f3076g = cVar;
        this.f3077h = lVar;
        this.i = dVar;
        this.j = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return kotlin.jvm.internal.m.a(this.f3071a, b7.f3071a) && kotlin.jvm.internal.m.a(this.f3072b, b7.f3072b) && this.f3073c.equals(b7.f3073c) && this.f3074d == b7.f3074d && this.f3075e == b7.f3075e && this.f == b7.f && kotlin.jvm.internal.m.a(this.f3076g, b7.f3076g) && this.f3077h == b7.f3077h && kotlin.jvm.internal.m.a(this.i, b7.i) && W0.a.b(this.j, b7.j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.f3077h.hashCode() + ((this.f3076g.hashCode() + k1.i.c(this.f, k1.i.e((((this.f3073c.hashCode() + ((this.f3072b.hashCode() + (this.f3071a.hashCode() * 31)) * 31)) * 31) + this.f3074d) * 31, 31, this.f3075e), 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f3071a);
        sb.append(", style=");
        sb.append(this.f3072b);
        sb.append(", placeholders=");
        sb.append(this.f3073c);
        sb.append(", maxLines=");
        sb.append(this.f3074d);
        sb.append(", softWrap=");
        sb.append(this.f3075e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f3076g);
        sb.append(", layoutDirection=");
        sb.append(this.f3077h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) W0.a.l(this.j));
        sb.append(')');
        return sb.toString();
    }
}
