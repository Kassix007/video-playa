package F;

import M5.InterfaceC0261w;
import java.util.List;
import java.util.Map;
import w.EnumC1778d0;
import x.C1881m;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC1927D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC1778d0 f1764e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0158l f1766h;
    public final C0158l i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f1768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1881m f1769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC1927D f1770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f1772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f1773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC0261w f1774r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ B(int i, int i7, int i8, int i9, int i10, C1881m c1881m, InterfaceC1927D interfaceC1927D, InterfaceC0261w interfaceC0261w) {
        n5.s sVar = n5.s.f15299q;
        this(sVar, i, i7, i8, EnumC1778d0.f17946r, i9, i10, null, null, 0.0f, 0, false, c1881m, interfaceC1927D, false, sVar, sVar, interfaceC0261w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int a() {
        return this.f1770n.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int b() {
        return this.f1770n.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final Map c() {
        return this.f1770n.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final void d() {
        this.f1770n.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final B5.c e() {
        return this.f1770n.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B f(int i) {
        int i7;
        int i8 = this.f1761b + this.f1762c;
        if (this.f1771o) {
            return null;
        }
        List list = this.f1760a;
        if (list.isEmpty() || this.f1766h == null || (i7 = this.f1767k - i) < 0 || i7 >= i8) {
            return null;
        }
        float f = this.j - (i8 != 0 ? i / i8 : 0.0f);
        if (this.i == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        C0158l c0158l = (C0158l) n5.l.l0(list);
        C0158l c0158l2 = (C0158l) n5.l.r0(list);
        int i9 = this.f1765g;
        int i10 = this.f;
        if (i < 0) {
            if (Math.min((c0158l.f1896l + i8) - i10, (c0158l2.f1896l + i8) - i9) <= (-i)) {
                return null;
            }
        } else if (Math.min(i10 - c0158l.f1896l, i9 - c0158l2.f1896l) <= i) {
            return null;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C0158l) list.get(i11)).a(i);
        }
        List list2 = this.f1772p;
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((C0158l) list2.get(i12)).a(i);
        }
        List list3 = this.f1773q;
        int size3 = list3.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((C0158l) list3.get(i13)).a(i);
        }
        return new B(this.f1760a, this.f1761b, this.f1762c, this.f1763d, this.f1764e, this.f, this.f1765g, this.f1766h, this.i, f, i7, this.f1768l || i > 0, this.f1769m, this.f1770n, this.f1771o, this.f1772p, this.f1773q, this.f1774r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long g() {
        InterfaceC1927D interfaceC1927D = this.f1770n;
        return (((long) interfaceC1927D.b()) << 32) | (((long) interfaceC1927D.a()) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public B(List list, int i, int i7, int i8, EnumC1778d0 enumC1778d0, int i9, int i10, C0158l c0158l, C0158l c0158l2, float f, int i11, boolean z5, C1881m c1881m, InterfaceC1927D interfaceC1927D, boolean z6, List list2, List list3, InterfaceC0261w interfaceC0261w) {
        this.f1760a = list;
        this.f1761b = i;
        this.f1762c = i7;
        this.f1763d = i8;
        this.f1764e = enumC1778d0;
        this.f = i9;
        this.f1765g = i10;
        this.f1766h = c0158l;
        this.i = c0158l2;
        this.j = f;
        this.f1767k = i11;
        this.f1768l = z5;
        this.f1769m = c1881m;
        this.f1770n = interfaceC1927D;
        this.f1771o = z6;
        this.f1772p = list2;
        this.f1773q = list3;
        this.f1774r = interfaceC0261w;
    }
}
