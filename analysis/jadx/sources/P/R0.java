package P;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements Iterable, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A0 f5370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0345b f5372s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public R0(A0 a02, int i, K k7, C0345b c0345b) {
        this.f5370q = a02;
        this.f5371r = i;
        this.f5372s = c0345b;
        k7.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new J(this.f5370q, this.f5371r, null, this.f5372s);
    }
}
