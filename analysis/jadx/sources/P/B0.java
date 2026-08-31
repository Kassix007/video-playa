package P;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements Iterable, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A0 f5280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f5281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f5282s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B0(A0 a02, int i, int i7) {
        this.f5280q = a02;
        this.f5281r = i;
        this.f5282s = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        ArrayList arrayList;
        int iE;
        A0 a02 = this.f5280q;
        if (a02.f5272x != this.f5282s) {
            C0.f();
        }
        HashMap map = a02.f5274z;
        C0343a c0343a = null;
        int i7 = this.f5281r;
        if (map != null) {
            if (a02.f5271w) {
                AbstractC0373p.c("use active SlotWriter to crate an anchor for location instead");
            }
            if (i7 >= 0 && i7 < (i = a02.f5266r) && (iE = C0.e((arrayList = a02.f5273y), i7, i)) >= 0) {
                c0343a = (C0343a) arrayList.get(iE);
            }
            if (c0343a != null) {
            }
        }
        return new J(a02, i7 + 1, a02.f5265q[(i7 * 5) + 3] + i7);
    }
}
