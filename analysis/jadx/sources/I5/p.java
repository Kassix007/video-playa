package I5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B5.c f2448c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ p(i iVar, B5.c cVar, int i) {
        this.f2446a = i;
        this.f2447b = iVar;
        this.f2448c = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // I5.i
    public final Iterator iterator() {
        switch (this.f2446a) {
            case 0:
                return new f(this);
            default:
                return new q(this);
        }
    }
}
