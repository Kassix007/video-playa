package v;

import android.content.Context;

/* JADX INFO: renamed from: v.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1718m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W0.c f17362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A.L f17364d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1718m(Context context, W0.c cVar, long j, A.L l7) {
        this.f17361a = context;
        this.f17362b = cVar;
        this.f17363c = j;
        this.f17364d = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1718m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        C1718m c1718m = (C1718m) obj;
        return kotlin.jvm.internal.m.a(this.f17361a, c1718m.f17361a) && kotlin.jvm.internal.m.a(this.f17362b, c1718m.f17362b) && j0.o.c(this.f17363c, c1718m.f17363c) && kotlin.jvm.internal.m.a(this.f17364d, c1718m.f17364d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f17362b.hashCode() + (this.f17361a.hashCode() * 31)) * 31;
        int i = j0.o.f13723h;
        return this.f17364d.hashCode() + k1.i.d(iHashCode, 31, this.f17363c);
    }
}
