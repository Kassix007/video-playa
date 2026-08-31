package Z5;

import java.util.Arrays;

/* JADX INFO: renamed from: Z5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0578g extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f8593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8594b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f8593a, this.f8594b);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        byte[] bArr = this.f8593a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            this.f8593a = bArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8594b;
    }
}
