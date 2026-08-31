package C;

import M5.InterfaceC0261w;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import w.EnumC1778d0;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class s implements InterfaceC1927D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1927D f661e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0261w f663h;
    public final W0.c i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f665l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EnumC1778d0 f668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f670q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(t tVar, int i, boolean z5, float f, InterfaceC1927D interfaceC1927D, float f7, boolean z6, InterfaceC0261w interfaceC0261w, W0.c cVar, long j, List list, int i7, int i8, int i9, EnumC1778d0 enumC1778d0, int i10, int i11) {
        this.f657a = tVar;
        this.f658b = i;
        this.f659c = z5;
        this.f660d = f;
        this.f661e = interfaceC1927D;
        this.f = f7;
        this.f662g = z6;
        this.f663h = interfaceC0261w;
        this.i = cVar;
        this.j = j;
        this.f664k = list;
        this.f665l = i7;
        this.f666m = i8;
        this.f667n = i9;
        this.f668o = enumC1778d0;
        this.f669p = i10;
        this.f670q = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int a() {
        return this.f661e.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int b() {
        return this.f661e.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final Map c() {
        return this.f661e.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final void d() {
        this.f661e.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final B5.c e() {
        return this.f661e.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.List] */
    public final s f(int i, boolean z5) {
        t tVar;
        if (this.f662g) {
            return null;
        }
        ?? r15 = this.f664k;
        if (r15.isEmpty() || (tVar = this.f657a) == null) {
            return null;
        }
        int i7 = tVar.f679l;
        int i8 = this.f658b - i;
        if (i8 < 0 || i8 >= i7) {
            return null;
        }
        t tVar2 = (t) n5.l.l0(r15);
        t tVar3 = (t) n5.l.r0(r15);
        if (tVar2.f681n || tVar3.f681n) {
            return null;
        }
        int i9 = this.f666m;
        int i10 = this.f665l;
        if (i < 0) {
            if (Math.min((tVar2.j + tVar2.f679l) - i10, (tVar3.j + tVar3.f679l) - i9) <= (-i)) {
                return null;
            }
        } else if (Math.min(i10 - tVar2.j, i9 - tVar3.j) <= i) {
            return null;
        }
        int size = ((Collection) r15).size();
        for (int i11 = 0; i11 < size; i11++) {
            t tVar4 = (t) r15.get(i11);
            tVar4.getClass();
            int[] iArr = tVar4.f683p;
            if (!tVar4.f681n) {
                tVar4.j += i;
                int length = iArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    if ((i12 & 1) != 0) {
                        iArr[i12] = iArr[i12] + i;
                    }
                }
                if (z5) {
                    int size2 = tVar4.f672b.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        tVar4.i.a(i13, tVar4.f676g);
                    }
                }
            }
        }
        return new s(this.f657a, i8, this.f659c || i > 0, i, this.f661e, this.f, this.f662g, this.f663h, this.i, this.j, r15, this.f665l, this.f666m, this.f667n, this.f668o, this.f669p, this.f670q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long g() {
        InterfaceC1927D interfaceC1927D = this.f661e;
        return (((long) interfaceC1927D.b()) << 32) | (((long) interfaceC1927D.a()) & 4294967295L);
    }
}
