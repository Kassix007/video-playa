package D;

import java.util.List;
import z.AbstractC1923a;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class p implements E.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W0.l f1265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f1266e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f1268h;
    public final int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1270l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1271m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f1272n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f1273o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1276r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(int i, Object obj, int i7, int i8, W0.l lVar, int i9, int i10, List list, long j, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j7, int i11, int i12) {
        this.f1262a = i;
        this.f1263b = obj;
        this.f1264c = i7;
        this.f1265d = lVar;
        this.f1266e = list;
        this.f = j;
        this.f1267g = obj2;
        this.f1268h = bVar;
        this.i = i11;
        this.j = i12;
        int size = list.size();
        int iMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iMax = Math.max(iMax, ((AbstractC1933J) list.get(i13)).f18665r);
        }
        this.f1269k = iMax;
        int i14 = i8 + iMax;
        this.f1270l = i14 >= 0 ? i14 : 0;
        this.f1272n = (((long) this.f1264c) << 32) | (((long) iMax) & 4294967295L);
        this.f1273o = 0L;
        this.f1274p = -1;
        this.f1275q = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(AbstractC1932I abstractC1932I) {
        if (this.f1271m == Integer.MIN_VALUE) {
            AbstractC1923a.a("position() should be called first");
        }
        List list = this.f1266e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC1933J abstractC1933J = (AbstractC1933J) list.get(i);
            int i7 = abstractC1933J.f18665r;
            long j = this.f1273o;
            this.f1268h.a(i, this.f1263b);
            AbstractC1932I.i(abstractC1932I, abstractC1933J, W0.i.c(j, this.f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int b() {
        return this.f1266e.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final boolean c() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final void d() {
        this.f1276r = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final void e(int i, int i7, int i8) {
        k(i, 0, i7, i8, -1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int f() {
        return this.f1270l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final long g(int i) {
        return this.f1273o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int getIndex() {
        return this.f1262a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final Object getKey() {
        return this.f1263b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int h() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final Object i(int i) {
        return ((AbstractC1933J) this.f1266e.get(i)).g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int j() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i, int i7, int i8, int i9, int i10, int i11) {
        this.f1271m = i9;
        if (this.f1265d == W0.l.f8023r) {
            i7 = (i8 - i7) - this.f1264c;
        }
        this.f1273o = (((long) i7) << 32) | (((long) i) & 4294967295L);
        this.f1274p = i10;
        this.f1275q = i11;
    }
}
