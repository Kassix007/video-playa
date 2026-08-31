package D;

import E.D;
import java.util.List;
import z.AbstractC1923a;

/* JADX INFO: loaded from: classes.dex */
public final class l implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f1231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E.A f1232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E.A f1234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f1235e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1237h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(i iVar, E.A a7, int i, y yVar, int i7, int i8, long j) {
        this.f1234d = a7;
        this.f1235e = yVar;
        this.f = i7;
        this.f1236g = i8;
        this.f1237h = j;
        this.f1231a = iVar;
        this.f1232b = a7;
        this.f1233c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p a(int i, int i7, int i8, int i9, long j) {
        int i10;
        i iVar = this.f1231a;
        Object objB = iVar.b(i);
        Object objJ = iVar.f1216b.j(i);
        List listA = this.f1232b.a(i, j);
        if (W0.a.f(j)) {
            i10 = W0.a.j(j);
        } else {
            if (!W0.a.e(j)) {
                AbstractC1923a.a("does not have fixed height");
            }
            i10 = W0.a.i(j);
        }
        int i11 = i10;
        W0.l layoutDirection = this.f1234d.f1471r.getLayoutDirection();
        androidx.compose.foundation.lazy.layout.b bVar = this.f1235e.f1314m;
        return new p(i, objB, i11, i9, layoutDirection, this.f, this.f1236g, listA, this.f1237h, objJ, bVar, j, i7, i8);
    }
}
