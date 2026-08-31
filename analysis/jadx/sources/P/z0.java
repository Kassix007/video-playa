package P;

import B0.C0057w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A0 f5585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f5588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5589e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5591h;
    public int i;
    public final C0057w j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5595n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z0(A0 a02) {
        this.f5585a = a02;
        this.f5586b = a02.f5265q;
        int i = a02.f5266r;
        this.f5587c = i;
        this.f5588d = a02.f5267s;
        this.f5589e = a02.f5268t;
        this.f5591h = i;
        this.i = -1;
        this.j = new C0057w();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0343a a(int i) {
        ArrayList arrayList = this.f5585a.f5273y;
        int iE = C0.e(arrayList, i, this.f5587c);
        if (iE >= 0) {
            return (C0343a) arrayList.get(iE);
        }
        C0343a c0343a = new C0343a(i);
        arrayList.add(-(iE + 1), c0343a);
        return c0343a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(int[] iArr, int i) {
        int i7 = i * 5;
        int i8 = iArr[i7 + 1];
        if ((268435456 & i8) != 0) {
            return this.f5588d[i7 >= iArr.length ? iArr.length : iArr[i7 + 4] + Integer.bitCount(i8 >> 29)];
        }
        return C0363k.f5418a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.f = true;
        A0 a02 = this.f5585a;
        a02.getClass();
        if (this.f5585a != a02 || a02.f5269u <= 0) {
            AbstractC0373p.c("Unexpected reader close()");
        }
        a02.f5269u--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (this.f5592k == 0) {
            if (!(this.f5590g == this.f5591h)) {
                AbstractC0373p.c("endGroup() not called at the end of a group");
            }
            int i = (this.i * 5) + 2;
            int[] iArr = this.f5586b;
            int i7 = iArr[i];
            this.i = i7;
            int i8 = this.f5587c;
            this.f5591h = i7 < 0 ? i8 : C0.a(iArr, i7) + i7;
            int iB = this.j.b();
            if (iB < 0) {
                this.f5593l = 0;
                this.f5594m = 0;
            } else {
                this.f5593l = iB;
                this.f5594m = i7 >= i8 - 1 ? this.f5589e : iArr[((i7 + 1) * 5) + 4];
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object e() {
        int i = this.f5590g;
        if (i < this.f5591h) {
            return b(this.f5586b, i);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f() {
        int i = this.f5590g;
        if (i >= this.f5591h) {
            return 0;
        }
        return this.f5586b[i * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(int i, int i7) {
        int[] iArr = this.f5586b;
        int iC = C0.c(iArr, i);
        int i8 = i + 1;
        int i9 = iC + i7;
        return i9 < (i8 < this.f5587c ? iArr[(i8 * 5) + 4] : this.f5589e) ? this.f5588d[i9] : C0363k.f5418a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(int i) {
        return (this.f5586b[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(int i) {
        return (this.f5586b[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object j() {
        int i;
        if (this.f5592k > 0 || (i = this.f5593l) >= this.f5594m) {
            this.f5595n = false;
            return C0363k.f5418a;
        }
        this.f5595n = true;
        this.f5593l = i + 1;
        return this.f5588d[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object k(int i) {
        int i7 = i * 5;
        int[] iArr = this.f5586b;
        int i8 = iArr[i7 + 1] & 1073741824;
        if (i8 == 0) {
            return null;
        }
        if (i8 == 0) {
            return C0363k.f5418a;
        }
        return this.f5588d[iArr[i7 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int l(int i) {
        return this.f5586b[(i * 5) + 1] & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object m(int[] iArr, int i) {
        int i7 = i * 5;
        int i8 = iArr[i7 + 1];
        if ((536870912 & i8) == 0) {
            return null;
        }
        return this.f5588d[Integer.bitCount(i8 >> 30) + iArr[i7 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int n(int i) {
        return this.f5586b[(i * 5) + 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i) {
        if (!(this.f5592k == 0)) {
            AbstractC0373p.c("Cannot reposition while in an empty region");
        }
        this.f5590g = i;
        int[] iArr = this.f5586b;
        int i7 = this.f5587c;
        int i8 = i < i7 ? iArr[(i * 5) + 2] : -1;
        this.i = i8;
        if (i8 < 0) {
            this.f5591h = i7;
        } else {
            this.f5591h = C0.a(iArr, i8) + i8;
        }
        this.f5593l = 0;
        this.f5594m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int p() {
        if (!(this.f5592k == 0)) {
            AbstractC0373p.c("Cannot skip while in an empty region");
        }
        int i = this.f5590g;
        int[] iArr = this.f5586b;
        int i7 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.f5590g = C0.a(iArr, i) + i;
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        if (!(this.f5592k == 0)) {
            AbstractC0373p.c("Cannot skip the enclosing group while in an empty region");
        }
        this.f5590g = this.f5591h;
        this.f5593l = 0;
        this.f5594m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        if (this.f5592k <= 0) {
            int i = this.i;
            int i7 = this.f5590g;
            int[] iArr = this.f5586b;
            if (!(iArr[(i7 * 5) + 2] == i)) {
                AbstractC0362j0.a("Invalid slot table detected");
            }
            int i8 = this.f5593l;
            int i9 = this.f5594m;
            C0057w c0057w = this.j;
            if (i8 == 0 && i9 == 0) {
                c0057w.c(-1);
            } else {
                c0057w.c(i8);
            }
            this.i = i7;
            this.f5591h = C0.a(iArr, i7) + i7;
            int i10 = i7 + 1;
            this.f5590g = i10;
            this.f5593l = C0.c(iArr, i7);
            this.f5594m = i7 >= this.f5587c - 1 ? this.f5589e : iArr[(i10 * 5) + 4];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f5590g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.i);
        sb.append(", end=");
        return C0.S.o(sb, this.f5591h, ')');
    }
}
