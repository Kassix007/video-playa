package P;

import r.C1543B;
import r.C1548G;

/* JADX INFO: renamed from: P.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0372o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0382u f5480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0343a f5481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B5.e f5482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5483e;
    public C1543B f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1548G f5484g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0372o0(C0382u c0382u) {
        this.f5480b = c0382u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(C c7, C1548G c1548g) {
        kotlin.jvm.internal.m.c(c7, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        I0 i02 = c7.f5284s;
        if (i02 == null) {
            i02 = S.f5377v;
        }
        return !i02.a(c7.f().f, c1548g.g(c7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        if (this.f5480b != null) {
            C0343a c0343a = this.f5481c;
            if (c0343a != null ? c0343a.a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final M c(Object obj) {
        M mQ;
        C0382u c0382u = this.f5480b;
        return (c0382u == null || (mQ = c0382u.q(this, obj)) == null) ? M.f5336q : mQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        C0382u c0382u = this.f5480b;
        if (c0382u != null) {
            c0382u.f5523E = true;
        }
        this.f5480b = null;
        this.f = null;
        this.f5484g = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(boolean z5) {
        if (z5) {
            this.f5479a |= 32;
        } else {
            this.f5479a &= -33;
        }
    }
}
