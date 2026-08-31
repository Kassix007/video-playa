package F;

import c0.C0715c;
import c0.C0716d;
import java.util.List;
import w.EnumC1778d0;
import z.AbstractC1923a;
import z0.AbstractC1933J;

/* JADX INFO: renamed from: F.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0158l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0715c f1892e;
    public final C0716d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W0.l f1893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1894h;
    public final boolean i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f1895k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1897m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0158l(int i, int i7, List list, long j, Object obj, EnumC1778d0 enumC1778d0, C0715c c0715c, C0716d c0716d, W0.l lVar, boolean z5) {
        this.f1888a = i;
        this.f1889b = list;
        this.f1890c = j;
        this.f1891d = obj;
        this.f1892e = c0715c;
        this.f = c0716d;
        this.f1893g = lVar;
        this.f1894h = z5;
        this.i = enumC1778d0 == EnumC1778d0.f17945q;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC1933J abstractC1933J = (AbstractC1933J) list.get(i8);
            iMax = Math.max(iMax, !this.i ? abstractC1933J.f18665r : abstractC1933J.f18664q);
        }
        this.j = iMax;
        this.f1895k = new int[this.f1889b.size() * 2];
        this.f1897m = Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        this.f1896l += i;
        int[] iArr = this.f1895k;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            boolean z5 = this.i;
            if ((z5 && i7 % 2 == 1) || (!z5 && i7 % 2 == 0)) {
                iArr[i7] = iArr[i7] + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, int i7, int i8) {
        int i9;
        this.f1896l = i;
        boolean z5 = this.i;
        this.f1897m = z5 ? i8 : i7;
        List list = this.f1889b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1933J abstractC1933J = (AbstractC1933J) list.get(i10);
            int i11 = i10 * 2;
            int[] iArr = this.f1895k;
            if (z5) {
                C0715c c0715c = this.f1892e;
                if (c0715c == null) {
                    AbstractC1923a.b("null horizontalAlignment");
                    throw new C2.e();
                }
                iArr[i11] = c0715c.a(abstractC1933J.f18664q, i7, this.f1893g);
                iArr[i11 + 1] = i;
                i9 = abstractC1933J.f18665r;
            } else {
                iArr[i11] = i;
                int i12 = i11 + 1;
                C0716d c0716d = this.f;
                if (c0716d == null) {
                    AbstractC1923a.b("null verticalAlignment");
                    throw new C2.e();
                }
                iArr[i12] = c0716d.a(abstractC1933J.f18665r, i8);
                i9 = abstractC1933J.f18664q;
            }
            i += i9;
        }
    }
}
