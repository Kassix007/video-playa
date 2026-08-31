package Z5;

import java.util.Arrays;
import m5.C1380s;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f8588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8589b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f8588a, this.f8589b);
        kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
        return new C1380s(iArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        int[] iArr = this.f8588a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f8588a = iArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8589b;
    }
}
