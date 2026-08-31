package Z5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class G extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f8541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8542b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f8541a, this.f8542b);
        kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        long[] jArr = this.f8541a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.f8541a = jArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8542b;
    }
}
