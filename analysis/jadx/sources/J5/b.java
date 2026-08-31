package J5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2811q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public G5.d f2814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I5.g f2815u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(I5.g gVar) {
        this.f2815u = gVar;
        int iQ = D5.a.q(0, 0, ((CharSequence) gVar.f2432b).length());
        this.f2812r = iQ;
        this.f2813s = iQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        C1371j c1371j;
        I5.g gVar = this.f2815u;
        CharSequence charSequence = (CharSequence) gVar.f2432b;
        int i = this.f2813s;
        if (i < 0) {
            this.f2811q = 0;
            this.f2814t = null;
            return;
        }
        if (i <= charSequence.length() && (c1371j = (C1371j) ((B5.e) gVar.f2433c).invoke(charSequence, Integer.valueOf(this.f2813s))) != null) {
            int iIntValue = ((Number) c1371j.f15080q).intValue();
            int iIntValue2 = ((Number) c1371j.f15081r).intValue();
            this.f2814t = D5.a.O(this.f2812r, iIntValue);
            int i7 = iIntValue + iIntValue2;
            this.f2812r = i7;
            this.f2813s = i7 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f2814t = new G5.d(this.f2812r, m.O0(charSequence), 1);
            this.f2813s = -1;
        }
        this.f2811q = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2811q == -1) {
            a();
        }
        return this.f2811q == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2811q == -1) {
            a();
        }
        if (this.f2811q == 0) {
            throw new NoSuchElementException();
        }
        G5.d dVar = this.f2814t;
        kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2814t = null;
        this.f2811q = -1;
        return dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
