package z0;

import java.util.Map;
import r.C1548G;

/* JADX INFO: renamed from: z0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1961u implements InterfaceC1927D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1927D f18717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f18718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1927D f18720e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1961u(InterfaceC1927D interfaceC1927D, y yVar, int i, InterfaceC1927D interfaceC1927D2, int i7) {
        this.f18716a = i7;
        this.f18718c = yVar;
        this.f18719d = i;
        this.f18720e = interfaceC1927D2;
        this.f18717b = interfaceC1927D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int a() {
        switch (this.f18716a) {
        }
        return this.f18717b.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final int b() {
        switch (this.f18716a) {
        }
        return this.f18717b.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final Map c() {
        switch (this.f18716a) {
        }
        return this.f18717b.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final void d() {
        switch (this.f18716a) {
            case 0:
                int i = this.f18719d;
                y yVar = this.f18718c;
                yVar.f18734u = i;
                this.f18720e.d();
                C1548G c1548g = yVar.f18726B;
                long[] jArr = c1548g.f16133a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j) < 128) {
                                    int i10 = (i7 << 3) + i9;
                                    Object obj = c1548g.f16134b[i10];
                                    InterfaceC1939P interfaceC1939P = (InterfaceC1939P) c1548g.f16135c[i10];
                                    int iK = yVar.f18727C.k(obj);
                                    if (iK < 0 || iK >= yVar.f18734u) {
                                        interfaceC1939P.a();
                                        c1548g.k(i10);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i8 != 8) {
                            }
                        }
                        if (i7 != length) {
                            i7++;
                        }
                    }
                }
                break;
            default:
                int i11 = this.f18719d;
                y yVar2 = this.f18718c;
                yVar2.f18733t = i11;
                this.f18720e.d();
                yVar2.a(yVar2.f18733t);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1927D
    public final B5.c e() {
        switch (this.f18716a) {
        }
        return this.f18717b.e();
    }
}
