package Z5;

import java.util.Arrays;

/* JADX INFO: renamed from: Z5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0582k extends Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f8605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8606b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f8605a, this.f8606b);
        kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final void b(int i) {
        char[] cArr = this.f8605a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
            this.f8605a = cArrCopyOf;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z5.Q
    public final int d() {
        return this.f8606b;
    }
}
