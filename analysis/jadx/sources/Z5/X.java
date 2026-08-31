package Z5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class X extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8573b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f8572a, this.f8573b);
        kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        short[] sArr = this.f8572a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
            this.f8572a = sArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8573b;
    }
}
