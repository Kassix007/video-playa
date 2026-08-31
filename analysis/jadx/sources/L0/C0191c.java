package L0;

import C0.S;

/* JADX INFO: renamed from: L0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0191c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3104d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0191c(Object obj, int i, int i7, String str) {
        this.f3101a = obj;
        this.f3102b = i;
        this.f3103c = i7;
        this.f3104d = str;
        if (i <= i7) {
            return;
        }
        Q0.a.a("Reversed range is not supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0191c)) {
            return false;
        }
        C0191c c0191c = (C0191c) obj;
        return kotlin.jvm.internal.m.a(this.f3101a, c0191c.f3101a) && this.f3102b == c0191c.f3102b && this.f3103c == c0191c.f3103c && kotlin.jvm.internal.m.a(this.f3104d, c0191c.f3104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f3101a;
        return this.f3104d.hashCode() + k1.i.c(this.f3103c, k1.i.c(this.f3102b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f3101a);
        sb.append(", start=");
        sb.append(this.f3102b);
        sb.append(", end=");
        sb.append(this.f3103c);
        sb.append(", tag=");
        return S.p(sb, this.f3104d, ')');
    }

    public C0191c(int i, int i7, Object obj) {
        this(obj, i, i7, "");
    }
}
