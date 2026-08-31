package k6;

import java.io.EOFException;
import java.util.Arrays;
import q6.C1538g;
import q6.C1541j;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1538g f14146a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14148c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14151g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14152h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14147b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14149d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b[] f14150e = new b[8];
    public int f = 7;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(C1538g c1538g) {
        this.f14146a = c1538g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        int i7;
        if (i > 0) {
            int length = this.f14150e.length - 1;
            int i8 = 0;
            while (true) {
                i7 = this.f;
                if (length < i7 || i <= 0) {
                    break;
                }
                b bVar = this.f14150e[length];
                kotlin.jvm.internal.m.b(bVar);
                i -= bVar.f14139c;
                int i9 = this.f14152h;
                b bVar2 = this.f14150e[length];
                kotlin.jvm.internal.m.b(bVar2);
                this.f14152h = i9 - bVar2.f14139c;
                this.f14151g--;
                i8++;
                length--;
            }
            b[] bVarArr = this.f14150e;
            int i10 = i7 + 1;
            System.arraycopy(bVarArr, i10, bVarArr, i10 + i8, this.f14151g);
            b[] bVarArr2 = this.f14150e;
            int i11 = this.f + 1;
            Arrays.fill(bVarArr2, i11, i11 + i8, (Object) null);
            this.f += i8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(b bVar) {
        int i = bVar.f14139c;
        int i7 = this.f14149d;
        if (i > i7) {
            b[] bVarArr = this.f14150e;
            n5.k.J0(0, bVarArr.length, null, bVarArr);
            this.f = this.f14150e.length - 1;
            this.f14151g = 0;
            this.f14152h = 0;
            return;
        }
        a((this.f14152h + i) - i7);
        int i8 = this.f14151g + 1;
        b[] bVarArr2 = this.f14150e;
        if (i8 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f = this.f14150e.length - 1;
            this.f14150e = bVarArr3;
        }
        int i9 = this.f;
        this.f = i9 - 1;
        this.f14150e[i9] = bVar;
        this.f14151g++;
        this.f14152h += i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(C1541j data) throws EOFException {
        kotlin.jvm.internal.m.e(data, "data");
        int[] iArr = x.f14243a;
        int iC = data.c();
        long j = 0;
        long j7 = 0;
        for (int i = 0; i < iC; i++) {
            byte bH = data.h(i);
            byte[] bArr = e6.b.f12673a;
            j7 += (long) x.f14244b[bH & 255];
        }
        int i7 = (int) ((j7 + ((long) 7)) >> 3);
        int iC2 = data.c();
        C1538g c1538g = this.f14146a;
        if (i7 >= iC2) {
            e(data.c(), 127, 0);
            c1538g.c0(data);
            return;
        }
        C1538g c1538g2 = new C1538g();
        int[] iArr2 = x.f14243a;
        int iC3 = data.c();
        int i8 = 0;
        for (int i9 = 0; i9 < iC3; i9++) {
            byte bH2 = data.h(i9);
            byte[] bArr2 = e6.b.f12673a;
            int i10 = bH2 & 255;
            int i11 = x.f14243a[i10];
            byte b7 = x.f14244b[i10];
            j = (j << b7) | ((long) i11);
            i8 += b7;
            while (i8 >= 8) {
                i8 -= 8;
                c1538g2.e0((int) (j >> i8));
            }
        }
        if (i8 > 0) {
            c1538g2.e0((int) ((j << (8 - i8)) | (255 >>> i8)));
        }
        C1541j c1541jK = c1538g2.k(c1538g2.f16063r);
        e(c1541jK.c(), 127, 128);
        c1538g.c0(c1541jK);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            r13 = this;
            boolean r0 = r13.f14148c
            r1 = 0
            if (r0 == 0) goto L1e
            int r0 = r13.f14147b
            int r2 = r13.f14149d
            r3 = 32
            r4 = 31
            if (r0 >= r2) goto L12
            r13.e(r0, r4, r3)
        L12:
            r13.f14148c = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r13.f14147b = r0
            int r0 = r13.f14149d
            r13.e(r0, r4, r3)
        L1e:
            int r0 = r14.size()
            r2 = r1
        L23:
            if (r2 >= r0) goto Lfd
            java.lang.Object r3 = r14.get(r2)
            k6.b r3 = (k6.b) r3
            q6.j r4 = r3.f14137a
            q6.j r4 = r4.o()
            q6.j r5 = r3.f14138b
            java.util.Map r6 = k6.e.f14154b
            java.lang.Object r6 = r6.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r7 = -1
            if (r6 == 0) goto L6c
            int r6 = r6.intValue()
            int r8 = r6 + 1
            r9 = 2
            if (r9 > r8) goto L69
            r9 = 8
            if (r8 >= r9) goto L69
            k6.b[] r9 = k6.e.f14153a
            r10 = r9[r6]
            q6.j r10 = r10.f14138b
            boolean r10 = kotlin.jvm.internal.m.a(r10, r5)
            if (r10 == 0) goto L59
            r6 = r8
            goto L6e
        L59:
            r9 = r9[r8]
            q6.j r9 = r9.f14138b
            boolean r9 = kotlin.jvm.internal.m.a(r9, r5)
            if (r9 == 0) goto L69
            int r6 = r6 + 2
            r12 = r8
            r8 = r6
            r6 = r12
            goto L6e
        L69:
            r6 = r8
            r8 = r7
            goto L6e
        L6c:
            r6 = r7
            r8 = r6
        L6e:
            if (r8 != r7) goto Lac
            int r9 = r13.f
            int r9 = r9 + 1
            k6.b[] r10 = r13.f14150e
            int r10 = r10.length
        L77:
            if (r9 >= r10) goto Lac
            k6.b[] r11 = r13.f14150e
            r11 = r11[r9]
            kotlin.jvm.internal.m.b(r11)
            q6.j r11 = r11.f14137a
            boolean r11 = kotlin.jvm.internal.m.a(r11, r4)
            if (r11 == 0) goto La9
            k6.b[] r11 = r13.f14150e
            r11 = r11[r9]
            kotlin.jvm.internal.m.b(r11)
            q6.j r11 = r11.f14138b
            boolean r11 = kotlin.jvm.internal.m.a(r11, r5)
            if (r11 == 0) goto L9f
            int r8 = r13.f
            int r9 = r9 - r8
            k6.b[] r8 = k6.e.f14153a
            int r8 = r8.length
            int r8 = r8 + r9
            goto Lac
        L9f:
            if (r6 != r7) goto La9
            int r6 = r13.f
            int r6 = r9 - r6
            k6.b[] r11 = k6.e.f14153a
            int r11 = r11.length
            int r6 = r6 + r11
        La9:
            int r9 = r9 + 1
            goto L77
        Lac:
            if (r8 == r7) goto Lb6
            r3 = 127(0x7f, float:1.78E-43)
            r4 = 128(0x80, float:1.794E-43)
            r13.e(r8, r3, r4)
            goto Lf9
        Lb6:
            r8 = 64
            if (r6 != r7) goto Lc9
            q6.g r6 = r13.f14146a
            r6.e0(r8)
            r13.c(r4)
            r13.c(r5)
            r13.b(r3)
            goto Lf9
        Lc9:
            q6.j r7 = k6.b.f14133d
            r4.getClass()
            java.lang.String r9 = "prefix"
            kotlin.jvm.internal.m.e(r7, r9)
            int r9 = r7.c()
            boolean r7 = r4.k(r1, r7, r9)
            if (r7 == 0) goto Lee
            q6.j r7 = k6.b.i
            boolean r4 = kotlin.jvm.internal.m.a(r7, r4)
            if (r4 != 0) goto Lee
            r3 = 15
            r13.e(r6, r3, r1)
            r13.c(r5)
            goto Lf9
        Lee:
            r4 = 63
            r13.e(r6, r4, r8)
            r13.c(r5)
            r13.b(r3)
        Lf9:
            int r2 = r2 + 1
            goto L23
        Lfd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.d.d(java.util.ArrayList):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, int i7, int i8) {
        C1538g c1538g = this.f14146a;
        if (i < i7) {
            c1538g.e0(i | i8);
            return;
        }
        c1538g.e0(i8 | i7);
        int i9 = i - i7;
        while (i9 >= 128) {
            c1538g.e0(128 | (i9 & 127));
            i9 >>>= 7;
        }
        c1538g.e0(i9);
    }
}
