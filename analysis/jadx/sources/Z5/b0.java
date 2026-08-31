package Z5;

import java.util.Arrays;
import m5.C1378q;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f8579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8580b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f8579a, this.f8580b);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return new C1378q(bArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        byte[] bArr = this.f8579a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            this.f8579a = bArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8580b;
    }
}
