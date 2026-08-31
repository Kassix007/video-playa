package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Y2 {
    public static final Y2 f = new Y2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10775d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10776e;

    public Y2(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f10772a = i;
        this.f10773b = iArr;
        this.f10774c = objArr;
        this.f10776e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Y2 a() {
        return new Y2(0, new int[8], new Object[8], true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(F2 f22) throws com.google.android.gms.internal.clearcut.m0 {
        if (this.f10772a != 0) {
            for (int i = 0; i < this.f10772a; i++) {
                int i7 = this.f10773b[i];
                Object obj = this.f10774c[i];
                int i8 = i7 & 7;
                int i9 = i7 >>> 3;
                if (i8 == 0) {
                    ((C0801g2) f22.f10630q).i0(i9, ((Long) obj).longValue());
                } else if (i8 == 1) {
                    ((C0801g2) f22.f10630q).j0(i9, ((Long) obj).longValue());
                } else if (i8 == 2) {
                    ((C0801g2) f22.f10630q).k0(i9, (C0796f2) obj);
                } else if (i8 == 3) {
                    ((C0801g2) f22.f10630q).e0(i9, 3);
                    ((Y2) obj).b(f22);
                    ((C0801g2) f22.f10630q).e0(i9, 4);
                } else {
                    if (i8 != 5) {
                        throw new RuntimeException(new C0890y2());
                    }
                    ((C0801g2) f22.f10630q).h0(i9, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        int iU0;
        int iC0;
        int iU02;
        int i = this.f10775d;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i7 = 0; i7 < this.f10772a; i7++) {
            int i8 = this.f10773b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.f10774c[i7]).getClass();
                    iU02 = C0801g2.u0(i9 << 3) + 8;
                } else if (i10 == 2) {
                    int i11 = i9 << 3;
                    C0796f2 c0796f2 = (C0796f2) this.f10774c[i7];
                    int iU03 = C0801g2.u0(i11);
                    int iH = c0796f2.h();
                    iG = C0.S.g(iH, iH, iU03, iG);
                } else if (i10 == 3) {
                    int iU04 = C0801g2.u0(i9 << 3);
                    iU0 = iU04 + iU04;
                    iC0 = ((Y2) this.f10774c[i7]).c();
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException(new C0890y2());
                    }
                    ((Integer) this.f10774c[i7]).getClass();
                    iU02 = C0801g2.u0(i9 << 3) + 4;
                }
                iG = iU02 + iG;
            } else {
                int i12 = i9 << 3;
                long jLongValue = ((Long) this.f10774c[i7]).longValue();
                iU0 = C0801g2.u0(i12);
                iC0 = C0801g2.c0(jLongValue);
            }
            iG = iC0 + iU0 + iG;
        }
        this.f10775d = iG;
        return iG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, Object obj) {
        if (!this.f10776e) {
            throw new UnsupportedOperationException();
        }
        e(this.f10772a + 1);
        int[] iArr = this.f10773b;
        int i7 = this.f10772a;
        iArr[i7] = i;
        this.f10774c[i7] = obj;
        this.f10772a = i7 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i) {
        int[] iArr = this.f10773b;
        if (i > iArr.length) {
            int i7 = this.f10772a;
            int i8 = (i7 / 2) + i7;
            if (i8 >= i) {
                i = i8;
            }
            if (i < 8) {
                i = 8;
            }
            this.f10773b = Arrays.copyOf(iArr, i);
            this.f10774c = Arrays.copyOf(this.f10774c, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Y2)) {
            return false;
        }
        Y2 y22 = (Y2) obj;
        int i = this.f10772a;
        if (i == y22.f10772a) {
            int[] iArr = this.f10773b;
            int[] iArr2 = y22.f10773b;
            int i7 = 0;
            while (true) {
                if (i7 >= i) {
                    Object[] objArr = this.f10774c;
                    Object[] objArr2 = y22.f10774c;
                    int i8 = this.f10772a;
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
        int i = this.f10772a;
        int i7 = i + 527;
        int[] iArr = this.f10773b;
        int iHashCode = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = ((i7 * 31) + i8) * 31;
        Object[] objArr = this.f10774c;
        int i11 = this.f10772a;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + objArr[i12].hashCode();
        }
        return i10 + iHashCode;
    }
}
