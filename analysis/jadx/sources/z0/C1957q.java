package z0;

import B0.C0034c0;
import java.util.List;
import java.util.Map;
import r.C1548G;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: z0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1957q implements T, InterfaceC1928E {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1960t f18700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f18701r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1957q(y yVar) {
        this.f18701r = yVar;
        this.f18700q = yVar.f18737x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float D(long j) {
        return this.f18700q.D(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final int G(float f) {
        return this.f18700q.G(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.T
    public final List H(Object obj, B5.e eVar) {
        y yVar = this.f18701r;
        B0.L l7 = yVar.f18730q;
        B0.L l8 = (B0.L) yVar.f18736w.g(obj);
        if (l8 != null && ((R.b) l7.o()).f6670q.k(l8) < yVar.f18733t) {
            return l8.f269V.f311p.Y();
        }
        C1548G c1548g = yVar.f18739z;
        R.e eVar2 = yVar.f18727C;
        if (eVar2.f6678s < yVar.f18734u) {
            AbstractC1904a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = eVar2.f6678s;
        int i7 = yVar.f18734u;
        if (i == i7) {
            eVar2.c(obj);
        } else {
            Object[] objArr = eVar2.f6676q;
            Object obj2 = objArr[i7];
            objArr[i7] = obj;
        }
        yVar.f18734u++;
        if (!c1548g.b(obj)) {
            yVar.f18726B.l(obj, yVar.d(obj, eVar));
            if (l7.f269V.f302d == B0.G.f227s) {
                l7.P(true);
            } else {
                B0.L.Q(l7, true, 6);
            }
        }
        B0.L l9 = (B0.L) c1548g.g(obj);
        if (l9 == null) {
            return n5.s.f15299q;
        }
        List listY = l9.f269V.f311p.Y();
        int size = listY.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((C0034c0) ((R.b) listY).get(i8)).f400v.f300b = true;
        }
        return listY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final InterfaceC1927D O(int i, int i7, Map map, B5.c cVar) {
        return this.f18700q.O(i, i7, map, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long Q(long j) {
        return this.f18700q.Q(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float T(long j) {
        return this.f18700q.T(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long a0(float f) {
        return this.f18700q.a0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f18700q.f18713r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final InterfaceC1927D f(int i, int i7, Map map, B5.c cVar) {
        return this.f18700q.O(i, i7, map, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float f0(int i) {
        return this.f18700q.f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final W0.l getLayoutDirection() {
        return this.f18700q.f18712q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float i0(float f) {
        return f / this.f18700q.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f18700q.f18714s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final boolean r() {
        return this.f18700q.r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long s(float f) {
        return this.f18700q.s(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float u(float f) {
        return this.f18700q.b() * f;
    }
}
