package Z5;

import java.util.Arrays;

/* JADX INFO: renamed from: Z5.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0590t extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f8632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8633b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f8632a, this.f8633b);
        kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        float[] fArr = this.f8632a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
            this.f8632a = fArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8633b;
    }
}
