package Z5;

import java.util.Arrays;

/* JADX INFO: renamed from: Z5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0586o extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f8618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8619b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f8618a, this.f8619b);
        kotlin.jvm.internal.m.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        double[] dArr = this.f8618a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            kotlin.jvm.internal.m.d(dArrCopyOf, "copyOf(...)");
            this.f8618a = dArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8619b;
    }
}
