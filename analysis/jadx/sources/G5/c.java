package G5;

import java.util.NoSuchElementException;
import n5.w;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f2020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2023t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(int i, int i7, int i8) {
        this.f2020q = i8;
        this.f2021r = i7;
        boolean z5 = false;
        if (i8 <= 0 ? i >= i7 : i <= i7) {
            z5 = true;
        }
        this.f2022s = z5;
        this.f2023t = z5 ? i : i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2022s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.w
    public final int nextInt() {
        int i = this.f2023t;
        if (i != this.f2021r) {
            this.f2023t = this.f2020q + i;
            return i;
        }
        if (!this.f2022s) {
            throw new NoSuchElementException();
        }
        this.f2022s = false;
        return i;
    }
}
