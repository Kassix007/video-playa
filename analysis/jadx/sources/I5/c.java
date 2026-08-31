package I5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2424b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(i sequence, int i) {
        kotlin.jvm.internal.m.e(sequence, "sequence");
        this.f2423a = sequence;
        this.f2424b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I5.d
    public final i a(int i) {
        int i7 = this.f2424b + i;
        return i7 < 0 ? new c(this, i) : new c(this.f2423a, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I5.i
    public final Iterator iterator() {
        return new b(this);
    }
}
