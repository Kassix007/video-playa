package C;

import c0.C0715c;
import java.util.List;
import z.AbstractC1923a;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class t implements E.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0715c f673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W0.l f674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f675e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f677h;
    public final androidx.compose.foundation.lazy.layout.b i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f682o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f683p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(int i, List list, C0715c c0715c, W0.l lVar, int i7, int i8, int i9, long j, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j7) {
        this.f671a = i;
        this.f672b = list;
        this.f673c = c0715c;
        this.f674d = lVar;
        this.f675e = i9;
        this.f = j;
        this.f676g = obj;
        this.f677h = obj2;
        this.i = bVar;
        int size = list.size();
        int i10 = 0;
        int iMax = 0;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1933J abstractC1933J = (AbstractC1933J) list.get(i11);
            i10 += abstractC1933J.f18665r;
            iMax = Math.max(iMax, abstractC1933J.f18664q);
        }
        this.f678k = i10;
        int i12 = i10 + this.f675e;
        this.f679l = i12 >= 0 ? i12 : 0;
        this.f680m = iMax;
        this.f683p = new int[this.f672b.size() * 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(AbstractC1932I abstractC1932I) {
        if (this.f682o == Integer.MIN_VALUE) {
            AbstractC1923a.a("position() should be called first");
        }
        List list = this.f672b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC1933J abstractC1933J = (AbstractC1933J) list.get(i);
            int i7 = abstractC1933J.f18665r;
            long jG = g(i);
            this.i.a(i, this.f676g);
            AbstractC1932I.i(abstractC1932I, abstractC1933J, W0.i.c(jG, this.f));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int b() {
        return this.f672b.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final boolean c() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final void d() {
        this.f681n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final void e(int i, int i7, int i8) {
        k(i, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int f() {
        return this.f679l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final long g(int i) {
        int i7 = i * 2;
        int[] iArr = this.f683p;
        return (((long) iArr[i7]) << 32) | (((long) iArr[i7 + 1]) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int getIndex() {
        return this.f671a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final Object getKey() {
        return this.f676g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int h() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final Object i(int i) {
        return ((AbstractC1933J) this.f672b.get(i)).g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E.B
    public final int j() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i, int i7, int i8) {
        this.j = i;
        this.f682o = i8;
        List list = this.f672b;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC1933J abstractC1933J = (AbstractC1933J) list.get(i9);
            int i10 = i9 * 2;
            C0715c c0715c = this.f673c;
            if (c0715c == null) {
                AbstractC1923a.b("null horizontalAlignment when isVertical == true");
                throw new C2.e();
            }
            int iA = c0715c.a(abstractC1933J.f18664q, i7, this.f674d);
            int[] iArr = this.f683p;
            iArr[i10] = iA;
            iArr[i10 + 1] = i;
            i += abstractC1933J.f18665r;
        }
    }
}
