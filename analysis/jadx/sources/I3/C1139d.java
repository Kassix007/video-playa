package i3;

import com.google.android.gms.internal.measurement.I1;
import java.util.Arrays;

/* JADX INFO: renamed from: i3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1139d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f13568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f13569b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1139d(float[] fArr, int[] iArr) {
        this.f13568a = fArr;
        this.f13569b = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(C1139d c1139d) {
        int i = 0;
        while (true) {
            int[] iArr = c1139d.f13569b;
            if (i >= iArr.length) {
                return;
            }
            this.f13568a[i] = c1139d.f13568a[i];
            this.f13569b[i] = iArr[i];
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1139d b(float[] fArr) {
        int iW;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f13568a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.f13569b;
            if (iBinarySearch >= 0) {
                iW = iArr2[iBinarySearch];
            } else {
                int i7 = -(iBinarySearch + 1);
                if (i7 == 0) {
                    iW = iArr2[0];
                } else if (i7 == iArr2.length - 1) {
                    iW = iArr2[iArr2.length - 1];
                } else {
                    int i8 = i7 - 1;
                    float f7 = fArr2[i8];
                    iW = I1.W((f - f7) / (fArr2[i7] - f7), iArr2[i8], iArr2[i7]);
                }
            }
            iArr[i] = iW;
        }
        return new C1139d(fArr, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1139d.class == obj.getClass()) {
            C1139d c1139d = (C1139d) obj;
            if (Arrays.equals(this.f13568a, c1139d.f13568a) && Arrays.equals(this.f13569b, c1139d.f13569b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.f13569b) + (Arrays.hashCode(this.f13568a) * 31);
    }
}
