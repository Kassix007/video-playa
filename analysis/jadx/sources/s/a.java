package S;

import E3.h;
import T.c;
import java.util.List;
import n5.AbstractC1401d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1401d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f7275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7276r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7277s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(c cVar, int i, int i7) {
        this.f7275q = cVar;
        this.f7276r = i;
        h.r(i, i7, cVar.d());
        this.f7277s = i7 - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        return this.f7277s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        h.o(i, this.f7277s);
        return this.f7275q.get(this.f7276r + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final List subList(int i, int i7) {
        h.r(i, i7, this.f7277s);
        int i8 = this.f7276r;
        return new a(this.f7275q, i + i8, i8 + i7);
    }
}
