package D;

import M5.InterfaceC0261w;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import w.EnumC1778d0;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class o implements InterfaceC1927D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1927D f1251e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0261w f1253h;
    public final W0.c i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kotlin.jvm.internal.n f1254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f1255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f1257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnumC1778d0 f1259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1261r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: B5.c */
    /* JADX WARN: Multi-variable type inference failed */
    public o(q qVar, int i, boolean z5, float f, InterfaceC1927D interfaceC1927D, float f7, boolean z6, InterfaceC0261w interfaceC0261w, W0.c cVar, int i7, B5.c cVar2, List list, int i8, int i9, int i10, EnumC1778d0 enumC1778d0, int i11, int i12) {
        this.f1247a = qVar;
        this.f1248b = i;
        this.f1249c = z5;
        this.f1250d = f;
        this.f1251e = interfaceC1927D;
        this.f = f7;
        this.f1252g = z6;
        this.f1253h = interfaceC0261w;
        this.i = cVar;
        this.j = i7;
        this.f1254k = (kotlin.jvm.internal.n) cVar2;
        this.f1255l = list;
        this.f1256m = i8;
        this.f1257n = i9;
        this.f1258o = i10;
        this.f1259p = enumC1778d0;
        this.f1260q = i11;
        this.f1261r = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int a() {
        return this.f1251e.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int b() {
        return this.f1251e.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final Map c() {
        return this.f1251e.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final void d() {
        this.f1251e.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final B5.c e() {
        return this.f1251e.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r14v0, types: [B5.c, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    public final o f(int i, boolean z5) {
        q qVar;
        int i7;
        if (this.f1252g) {
            return null;
        }
        ?? r15 = this.f1255l;
        if (r15.isEmpty() || (qVar = this.f1247a) == null) {
            return null;
        }
        int i8 = qVar.f1282g;
        int i9 = this.f1248b - i;
        if (i9 < 0 || i9 >= i8) {
            return null;
        }
        p pVar = (p) n5.l.l0(r15);
        p pVar2 = (p) n5.l.r0(r15);
        if (pVar.f1276r || pVar2.f1276r) {
            return null;
        }
        int i10 = this.f1257n;
        int i11 = this.f1256m;
        EnumC1778d0 enumC1778d0 = this.f1259p;
        if (i < 0) {
            if (Math.min((D5.a.y(pVar, enumC1778d0) + pVar.f1270l) - i11, (D5.a.y(pVar2, enumC1778d0) + pVar2.f1270l) - i10) <= (-i)) {
                return null;
            }
        } else if (Math.min(i11 - D5.a.y(pVar, enumC1778d0), i10 - D5.a.y(pVar2, enumC1778d0)) <= i) {
            return null;
        }
        int size = ((Collection) r15).size();
        int i12 = 0;
        while (i12 < size) {
            p pVar3 = (p) r15.get(i12);
            pVar3.getClass();
            if (pVar3.f1276r) {
                i7 = i12;
            } else {
                long j = pVar3.f1273o;
                i7 = i12;
                pVar3.f1273o = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + i)) & 4294967295L);
                if (z5) {
                    int size2 = pVar3.f1266e.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        pVar3.f1268h.a(i13, pVar3.f1263b);
                    }
                }
            }
            i12 = i7 + 1;
        }
        return new o(this.f1247a, i9, this.f1249c || i > 0, i, this.f1251e, this.f, this.f1252g, this.f1253h, this.i, this.j, this.f1254k, r15, this.f1256m, this.f1257n, this.f1258o, enumC1778d0, this.f1260q, this.f1261r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long g() {
        InterfaceC1927D interfaceC1927D = this.f1251e;
        return (((long) interfaceC1927D.b()) << 32) | (((long) interfaceC1927D.a()) & 4294967295L);
    }
}
