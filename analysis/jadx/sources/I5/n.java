package I5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2443b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n(int i, Object obj) {
        this.f2442a = i;
        this.f2443b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I5.i
    public final Iterator iterator() {
        switch (this.f2442a) {
            case 0:
                return (Iterator) this.f2443b;
            default:
                return ((Iterable) this.f2443b).iterator();
        }
    }
}
