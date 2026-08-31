package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0739b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0739b0 f10493e = new C0739b0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10497d;

    public C0739b0(int i, int[] iArr, Object[] objArr, boolean z5) {
        this.f10494a = i;
        this.f10495b = iArr;
        this.f10496c = objArr;
        this.f10497d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0739b0 b() {
        return new C0739b0(0, new int[8], new Object[8], true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, Object obj) {
        if (!this.f10497d) {
            throw new UnsupportedOperationException();
        }
        int i7 = this.f10494a;
        int[] iArr = this.f10495b;
        if (i7 == iArr.length) {
            int i8 = i7 + (i7 < 4 ? 8 : i7 >> 1);
            this.f10495b = Arrays.copyOf(iArr, i8);
            this.f10496c = Arrays.copyOf(this.f10496c, i8);
        }
        int[] iArr2 = this.f10495b;
        int i9 = this.f10494a;
        iArr2[i9] = i;
        this.f10496c[i9] = obj;
        this.f10494a = i9 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0739b0)) {
            return false;
        }
        C0739b0 c0739b0 = (C0739b0) obj;
        int i = this.f10494a;
        if (i == c0739b0.f10494a) {
            int[] iArr = this.f10495b;
            int[] iArr2 = c0739b0.f10495b;
            int i7 = 0;
            while (true) {
                if (i7 >= i) {
                    Object[] objArr = this.f10496c;
                    Object[] objArr2 = c0739b0.f10496c;
                    int i8 = this.f10494a;
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

    public final int hashCode() {
        int i = this.f10494a;
        int i7 = (i + 527) * 31;
        int[] iArr = this.f10495b;
        int iHashCode = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = (i7 + i8) * 31;
        Object[] objArr = this.f10496c;
        int i11 = this.f10494a;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + objArr[i12].hashCode();
        }
        return i10 + iHashCode;
    }
}
