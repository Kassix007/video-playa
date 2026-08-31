package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class O0 {
    public static final O0 f = new O0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f11214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f11215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11216d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11217e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O0(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f11213a = i;
        this.f11214b = iArr;
        this.f11215c = objArr;
        this.f11217e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static O0 b() {
        return new O0(0, new int[8], new Object[8], true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, Object obj) {
        if (!this.f11217e) {
            throw new UnsupportedOperationException();
        }
        int i7 = this.f11213a;
        int[] iArr = this.f11214b;
        if (i7 == iArr.length) {
            int i8 = i7 + (i7 < 4 ? 8 : i7 >> 1);
            this.f11214b = Arrays.copyOf(iArr, i8);
            this.f11215c = Arrays.copyOf(this.f11215c, i8);
        }
        int[] iArr2 = this.f11214b;
        int i9 = this.f11213a;
        iArr2[i9] = i;
        this.f11215c[i9] = obj;
        this.f11213a = i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(C0941w0 c0941w0) throws S {
        if (this.f11213a == 0) {
            return;
        }
        c0941w0.getClass();
        Q q7 = (Q) c0941w0.f11327a;
        for (int i = 0; i < this.f11213a; i++) {
            int i7 = this.f11214b[i];
            Object obj = this.f11215c[i];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                long jLongValue = ((Long) obj).longValue();
                q7.D(i8, 0);
                q7.E(jLongValue);
            } else if (i9 == 1) {
                long jLongValue2 = ((Long) obj).longValue();
                q7.D(i8, 1);
                q7.K(jLongValue2);
            } else if (i9 == 2) {
                c0941w0.a(i8, (P) obj);
            } else if (i9 == 3) {
                q7.D(i8, 3);
                ((O0) obj).c(c0941w0);
                q7.D(i8, 4);
            } else {
                if (i9 != 5) {
                    int i10 = C0922m0.f11286q;
                    throw new RuntimeException(new C0928p0("Protocol message tag had invalid wire type."));
                }
                int iIntValue = ((Integer) obj).intValue();
                q7.D(i8, 5);
                q7.M(iIntValue);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        int iN;
        int i = this.f11216d;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i7 = 0; i7 < this.f11213a; i7++) {
            int i8 = this.f11214b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                iN = Q.N(i9, ((Long) this.f11215c[i7]).longValue());
            } else if (i10 == 1) {
                ((Long) this.f11215c[i7]).getClass();
                iN = Q.R(i9);
            } else if (i10 == 2) {
                iN = Q.J(i9, (P) this.f11215c[i7]);
            } else if (i10 == 3) {
                iD = ((O0) this.f11215c[i7]).d() + (Q.y(i9) << 1) + iD;
            } else {
                if (i10 != 5) {
                    int i11 = C0922m0.f11286q;
                    throw new IllegalStateException(new C0928p0("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.f11215c[i7]).getClass();
                iN = Q.V(i9);
            }
            iD = iN + iD;
        }
        this.f11216d = iD;
        return iD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        int i = this.f11213a;
        if (i == o02.f11213a) {
            int[] iArr = this.f11214b;
            int[] iArr2 = o02.f11214b;
            int i7 = 0;
            while (true) {
                if (i7 >= i) {
                    Object[] objArr = this.f11215c;
                    Object[] objArr2 = o02.f11215c;
                    int i8 = this.f11213a;
                    for (int i9 = 0; i9 < i8; i9++) {
                        if (objArr[i9].equals(objArr2[i9])) {
                        }
                    }
                    return true;
                }
                if (iArr[i7] != iArr2[i7]) {
                    break;
                }
                i7++;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = this.f11213a;
        int i7 = (i + 527) * 31;
        int[] iArr = this.f11214b;
        int iHashCode = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = (i7 + i8) * 31;
        Object[] objArr = this.f11215c;
        int i11 = this.f11213a;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + objArr[i12].hashCode();
        }
        return i10 + iHashCode;
    }
}
