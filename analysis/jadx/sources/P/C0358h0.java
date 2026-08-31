package P;

import java.util.ArrayList;
import m5.AbstractC1362a;
import m5.C1376o;
import r.C1570v;

/* JADX INFO: renamed from: P.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0358h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1570v f5416e;
    public final C1376o f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0358h0(int i, ArrayList arrayList) {
        this.f5412a = arrayList;
        this.f5413b = i;
        if (i < 0) {
            AbstractC0362j0.a("Invalid start index");
        }
        this.f5415d = new ArrayList();
        C1570v c1570v = new C1570v();
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            O o6 = (O) this.f5412a.get(i8);
            int i9 = o6.f5350c;
            int i10 = o6.f5351d;
            c1570v.h(i9, new I(i8, i7, i10));
            i7 += i10;
        }
        this.f5416e = c1570v;
        this.f = AbstractC1362a.d(new A0.d(10, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(int i, int i7) {
        int i8;
        C1570v c1570v = this.f5416e;
        I i9 = (I) c1570v.b(i);
        if (i9 == null) {
            return false;
        }
        int i10 = i9.f5315b;
        int i11 = i7 - i9.f5316c;
        i9.f5316c = i7;
        if (i11 == 0) {
            return true;
        }
        Object[] objArr = c1570v.f16218c;
        long[] jArr = c1570v.f16216a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j = jArr[i12];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j) < 128) {
                        I i15 = (I) objArr[(i12 << 3) + i14];
                        if (i15.f5315b >= i10 && !i15.equals(i9) && (i8 = i15.f5315b + i11) >= 0) {
                            i15.f5315b = i8;
                        }
                    }
                    j >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }
}
