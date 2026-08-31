package Z5;

import java.util.Arrays;

/* JADX INFO: renamed from: Z5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0575d extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f8583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8584b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f8583a, this.f8584b);
        kotlin.jvm.internal.m.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        boolean[] zArr = this.f8583a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            kotlin.jvm.internal.m.d(zArrCopyOf, "copyOf(...)");
            this.f8583a = zArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8584b;
    }
}
