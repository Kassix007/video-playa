package I5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Iterable, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f2445r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o(int i, Object obj) {
        this.f2444q = i;
        this.f2445r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2444q) {
            case 0:
                return new J5.b((g) this.f2445r);
            default:
                return new b(kotlin.jvm.internal.m.h((Object[]) ((I2.d) this.f2445r).f2345r));
        }
    }
}
