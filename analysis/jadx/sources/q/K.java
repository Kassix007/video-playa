package Q;

import P.D0;
import P.InterfaceC0347c;

/* JADX INFO: loaded from: classes.dex */
public final class K extends E3.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6481p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6483r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6485t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public I[] f6480o = new I[16];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f6482q = new int[16];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f6484s = new Object[16];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S() {
        this.f6481p = 0;
        this.f6483r = 0;
        n5.k.J0(0, this.f6485t, null, this.f6484s);
        this.f6485t = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T(InterfaceC0347c interfaceC0347c, D0 d02, X.j jVar) {
        int i;
        int i7;
        if (V()) {
            J j = new J();
            j.f6479d = this;
            K k7 = (K) j.f6479d;
            do {
                k7.f6480o[j.f6476a].a(j, interfaceC0347c, d02, jVar);
                int i8 = j.f6476a;
                i = k7.f6481p;
                if (i8 >= i) {
                    break;
                }
                I i9 = k7.f6480o[i8];
                j.f6477b += i9.f6474a;
                j.f6478c += i9.f6475b;
                i7 = i8 + 1;
                j.f6476a = i7;
            } while (i7 < i);
        }
        S();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean U() {
        return this.f6481p == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean V() {
        return this.f6481p != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(I i) {
        int i7 = this.f6481p;
        I[] iArr = this.f6480o;
        if (i7 == iArr.length) {
            I[] iArr2 = new I[(i7 > 1024 ? 1024 : i7) + i7];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            this.f6480o = iArr2;
        }
        int i8 = this.f6483r;
        int i9 = i.f6474a;
        int i10 = i.f6475b;
        int i11 = i8 + i9;
        int[] iArr3 = this.f6482q;
        int length = iArr3.length;
        if (i11 > length) {
            int i12 = (length > 1024 ? 1024 : length) + length;
            if (i12 >= i11) {
                i11 = i12;
            }
            int[] iArr4 = new int[i11];
            n5.k.C0(0, 0, length, iArr3, iArr4);
            this.f6482q = iArr4;
        }
        int i13 = this.f6485t + i10;
        Object[] objArr = this.f6484s;
        int length2 = objArr.length;
        if (i13 > length2) {
            int i14 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i14 >= i13) {
                i13 = i14;
            }
            Object[] objArr2 = new Object[i13];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f6484s = objArr2;
        }
        I[] iArr5 = this.f6480o;
        int i15 = this.f6481p;
        this.f6481p = i15 + 1;
        iArr5[i15] = i;
        this.f6483r += i.f6474a;
        this.f6485t += i10;
    }
}
