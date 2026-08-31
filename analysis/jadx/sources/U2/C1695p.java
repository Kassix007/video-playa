package u2;

import m5.C1386y;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: renamed from: u2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1695p implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17179q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1933J f17180r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1695p(AbstractC1933J abstractC1933J, int i) {
        this.f17179q = i;
        this.f17180r = abstractC1933J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
        switch (this.f17179q) {
            case 0:
                AbstractC1932I.d(abstractC1932I, this.f17180r, 0, 0);
                break;
            default:
                AbstractC1932I.f(abstractC1932I, this.f17180r, 0, 0);
                break;
        }
        return C1386y.f15098a;
    }
}
