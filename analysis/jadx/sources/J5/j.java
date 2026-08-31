package J5;

import B0.G0;
import java.util.Iterator;
import java.util.regex.Matcher;
import n5.AbstractC1398a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1398a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f2835r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j(int i, Object obj) {
        this.f2834q = i;
        this.f2835r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2834q) {
            case 0:
                if (obj == null ? true : obj instanceof h) {
                    return super.contains((h) obj);
                }
                return false;
            default:
                return ((U.c) this.f2835r).containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        switch (this.f2834q) {
            case 0:
                return ((Matcher) ((G0) this.f2835r).f234r).groupCount() + 1;
            default:
                U.c cVar = (U.c) this.f2835r;
                cVar.getClass();
                return cVar.f7494r;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h g(int i) {
        Matcher matcher = (Matcher) ((G0) this.f2835r).f234r;
        G5.d dVarO = D5.a.O(matcher.start(i), matcher.end(i));
        if (dVarO.f2017q < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        kotlin.jvm.internal.m.d(strGroup, "group(...)");
        return new h(strGroup, dVarO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f2834q) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2834q) {
            case 0:
                return new I5.q(new I5.p(new I5.n(1, new G5.d(0, d() - 1, 1)), new i(0, this), 1));
            default:
                U.m mVar = ((U.c) this.f2835r).f7493q;
                U.n[] nVarArr = new U.n[8];
                for (int i = 0; i < 8; i++) {
                    nVarArr[i] = new U.o(2);
                }
                return new U.k(mVar, nVarArr);
        }
    }
}
