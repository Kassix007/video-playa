package k6;

import P.Y;
import a.AbstractC0597a;
import java.io.IOException;
import java.util.ArrayList;
import q6.C1538g;
import q6.C1541j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q6.A f14142c;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14145g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14140a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14141b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b[] f14143d = new b[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14144e = 7;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(q qVar) {
        this.f14142c = AbstractC0597a.j(qVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0008 */
    public final int a(int i) {
        int i7;
        int i8 = 0;
        if (i > 0) {
            int length = this.f14143d.length;
            while (true) {
                length--;
                i7 = this.f14144e;
                if (length < i7 || i <= 0) {
                    break;
                }
                b bVar = this.f14143d[length];
                kotlin.jvm.internal.m.b(bVar);
                int i9 = bVar.f14139c;
                i -= i9;
                this.f14145g -= i9;
                this.f--;
                i8++;
            }
            b[] bVarArr = this.f14143d;
            System.arraycopy(bVarArr, i7 + 1, bVarArr, i7 + 1 + i8, this.f);
            this.f14144e += i8;
        }
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1541j b(int i) throws IOException {
        if (i >= 0) {
            b[] bVarArr = e.f14153a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f14137a;
            }
        }
        int length = this.f14144e + 1 + (i - e.f14153a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f14143d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                kotlin.jvm.internal.m.b(bVar);
                return bVar.f14137a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(b bVar) {
        this.f14141b.add(bVar);
        int i = bVar.f14139c;
        int i7 = this.f14140a;
        if (i > i7) {
            b[] bVarArr = this.f14143d;
            n5.k.J0(0, bVarArr.length, null, bVarArr);
            this.f14144e = this.f14143d.length - 1;
            this.f = 0;
            this.f14145g = 0;
            return;
        }
        a((this.f14145g + i) - i7);
        int i8 = this.f + 1;
        b[] bVarArr2 = this.f14143d;
        if (i8 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f14144e = this.f14143d.length - 1;
            this.f14143d = bVarArr3;
        }
        int i9 = this.f14144e;
        this.f14144e = i9 - 1;
        this.f14143d[i9] = bVar;
        this.f++;
        this.f14145g += i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1541j d() {
        q6.A source = this.f14142c;
        byte b7 = source.readByte();
        byte[] bArr = e6.b.f12673a;
        int i = b7 & 255;
        int i7 = 0;
        boolean z5 = (b7 & 128) == 128;
        long jE = e(i, 127);
        if (!z5) {
            return source.k(jE);
        }
        C1538g c1538g = new C1538g();
        int[] iArr = x.f14243a;
        kotlin.jvm.internal.m.e(source, "source");
        Y y6 = x.f14245c;
        Y y7 = y6;
        int i8 = 0;
        for (long j = 0; j < jE; j++) {
            byte b8 = source.readByte();
            byte[] bArr2 = e6.b.f12673a;
            i7 = (i7 << 8) | (b8 & 255);
            i8 += 8;
            while (i8 >= 8) {
                Y[] yArr = (Y[]) y7.f5382s;
                kotlin.jvm.internal.m.b(yArr);
                y7 = yArr[(i7 >>> (i8 - 8)) & 255];
                kotlin.jvm.internal.m.b(y7);
                if (((Y[]) y7.f5382s) == null) {
                    c1538g.e0(y7.f5380q);
                    i8 -= y7.f5381r;
                    y7 = y6;
                } else {
                    i8 -= 8;
                }
            }
        }
        while (i8 > 0) {
            Y[] yArr2 = (Y[]) y7.f5382s;
            kotlin.jvm.internal.m.b(yArr2);
            Y y8 = yArr2[(i7 << (8 - i8)) & 255];
            kotlin.jvm.internal.m.b(y8);
            int i9 = y8.f5381r;
            if (((Y[]) y8.f5382s) != null || i9 > i8) {
                break;
            }
            c1538g.e0(y8.f5380q);
            i8 -= i9;
            y7 = y6;
        }
        return c1538g.k(c1538g.f16063r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(int i, int i7) {
        int i8 = i & i7;
        if (i8 < i7) {
            return i8;
        }
        int i9 = 0;
        while (true) {
            byte b7 = this.f14142c.readByte();
            byte[] bArr = e6.b.f12673a;
            int i10 = b7 & 255;
            if ((b7 & 128) == 0) {
                return i7 + (i10 << i9);
            }
            i7 += (b7 & 127) << i9;
            i9 += 7;
        }
    }
}
