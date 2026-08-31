package Z5;

import java.util.Arrays;
import m5.C1385x;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f8607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8608b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f8607a, this.f8608b);
        kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
        return new C1385x(sArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        short[] sArr = this.f8607a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
            this.f8607a = sArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8608b;
    }
}
