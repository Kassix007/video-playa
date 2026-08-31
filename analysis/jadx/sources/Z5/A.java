package Z5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8533b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f8532a, this.f8533b);
        kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        int[] iArr = this.f8532a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f8532a = iArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8533b;
    }
}
