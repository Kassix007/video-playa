package k6;

import O3.B;
import q6.C1541j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1541j f14133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1541j f14134e;
    public static final C1541j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1541j f14135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1541j f14136h;
    public static final C1541j i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1541j f14137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1541j f14138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14139c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1541j c1541j = C1541j.f16064t;
        f14133d = B.h(":");
        f14134e = B.h(":status");
        f = B.h(":method");
        f14135g = B.h(":path");
        f14136h = B.h(":scheme");
        i = B.h(":authority");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(C1541j name, C1541j value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        this.f14137a = name;
        this.f14138b = value;
        this.f14139c = value.c() + name.c() + 32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.m.a(this.f14137a, bVar.f14137a) && kotlin.jvm.internal.m.a(this.f14138b, bVar.f14138b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14138b.hashCode() + (this.f14137a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f14137a.p() + ": " + this.f14138b.p();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String name, String value) {
        this(B.h(name), B.h(value));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        C1541j c1541j = C1541j.f16064t;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(C1541j name, String value) {
        this(name, B.h(value));
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        C1541j c1541j = C1541j.f16064t;
    }
}
