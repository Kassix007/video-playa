package u;

import java.util.Arrays;
import r.C1569u;
import r.C1570v;
import s.AbstractC1585a;

/* JADX INFO: renamed from: u.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1631J implements InterfaceC1668w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U.l f16804a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1631J(U.l lVar) {
        this.f16804a = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: a(LZ/m;)Lu/B0; */
    /* JADX DEBUG: Method merged with bridge method: a(LZ/m;)Lu/D0; */
    @Override // u.InterfaceC1668w, u.InterfaceC1657k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final H0 a(Z.m mVar) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        U.l lVar = this.f16804a;
        C1570v c1570v = (C1570v) lVar.f7511r;
        C1569u c1569u = new C1569u(c1570v.f16220e + 2);
        C1570v c1570v2 = new C1570v(c1570v.f16220e);
        int[] iArr3 = c1570v.f16217b;
        Object[] objArr3 = c1570v.f16218c;
        long[] jArr = c1570v.f16216a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j & 255) < 128) {
                            int i11 = (i7 << 3) + i10;
                            int i12 = iArr3[i11];
                            i = i8;
                            C1630I c1630i = (C1630I) objArr3[i11];
                            c1569u.a(i12);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c1570v2.h(i12, new G0((AbstractC1663q) ((B5.c) mVar.f8313s).invoke(c1630i.f16801a), c1630i.f16802b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i8;
                        }
                        j >>= i;
                        i10++;
                        iArr3 = iArr2;
                        i8 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i9 != i8) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c1570v.a(0)) {
            int i13 = c1569u.f16252b;
            if (i13 < 0) {
                AbstractC1585a.d("Index must be between 0 and size");
                throw null;
            }
            c1569u.b(i13 + 1);
            int[] iArr4 = c1569u.f16251a;
            int i14 = c1569u.f16252b;
            if (i14 != 0) {
                n5.k.C0(1, 0, i14, iArr4, iArr4);
            }
            iArr4[0] = 0;
            c1569u.f16252b++;
        }
        if (!c1570v.a(lVar.f7510q)) {
            c1569u.a(lVar.f7510q);
        }
        int i15 = c1569u.f16252b;
        if (i15 != 0) {
            int[] iArr5 = c1569u.f16251a;
            kotlin.jvm.internal.m.e(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i15);
        }
        return new H0(c1569u, c1570v2, lVar.f7510q, AbstractC1670y.f17084b);
    }
}
