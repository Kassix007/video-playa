package Z5;

import java.util.Arrays;
import m5.C1382u;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f8598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8599b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f8598a, this.f8599b);
        kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
        return new C1382u(jArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        long[] jArr = this.f8598a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.f8598a = jArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8599b;
    }
}
