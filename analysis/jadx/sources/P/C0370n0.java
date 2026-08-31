package P;

import a.AbstractC0597a;
import m5.C1386y;
import r.C1543B;
import r.C1548G;

/* JADX INFO: renamed from: P.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0370n0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0372o0 f5436q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5437r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1543B f5438s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0370n0(C0372o0 c0372o0, int i, C1543B c1543b) {
        super(1);
        this.f5436q = c0372o0;
        this.f5437r = i;
        this.f5438s = c1543b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        InterfaceC0375q interfaceC0375q;
        InterfaceC0375q interfaceC0375q2;
        int i;
        InterfaceC0375q interfaceC0375q3 = (InterfaceC0375q) obj;
        C0372o0 c0372o0 = this.f5436q;
        int i7 = c0372o0.f5483e;
        int i8 = this.f5437r;
        if (i7 == i8) {
            C1543B c1543b = c0372o0.f;
            C1543B c1543b2 = this.f5438s;
            if (kotlin.jvm.internal.m.a(c1543b2, c1543b) && (interfaceC0375q3 instanceof C0382u)) {
                long[] jArr = c1543b2.f16109a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j = jArr[i9];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((255 & j) < 128) {
                                    int i13 = (i9 << 3) + i12;
                                    Object obj2 = c1543b2.f16110b[i13];
                                    boolean z5 = c1543b2.f16111c[i13] != i8;
                                    if (z5) {
                                        i = i10;
                                        C0382u c0382u = (C0382u) interfaceC0375q3;
                                        AbstractC0597a.K(c0382u.f5535w, obj2, c0372o0);
                                        if (obj2 instanceof C) {
                                            C c7 = (C) obj2;
                                            interfaceC0375q2 = interfaceC0375q3;
                                            if (!c0382u.f5535w.c(c7)) {
                                                AbstractC0597a.L(c0382u.f5538z, c7);
                                            }
                                            C1548G c1548g = c0372o0.f5484g;
                                            if (c1548g != null) {
                                                c1548g.j(obj2);
                                            }
                                        } else {
                                            interfaceC0375q2 = interfaceC0375q3;
                                        }
                                    } else {
                                        interfaceC0375q2 = interfaceC0375q3;
                                        i = i10;
                                    }
                                    if (z5) {
                                        c1543b2.f(i13);
                                    }
                                } else {
                                    interfaceC0375q2 = interfaceC0375q3;
                                    i = i10;
                                }
                                j >>= i;
                                i12++;
                                i10 = i;
                                interfaceC0375q3 = interfaceC0375q2;
                            }
                            interfaceC0375q = interfaceC0375q3;
                            if (i11 != i10) {
                                break;
                            }
                        } else {
                            interfaceC0375q = interfaceC0375q3;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9++;
                        interfaceC0375q3 = interfaceC0375q;
                    }
                }
            }
        }
        return C1386y.f15098a;
    }
}
