package A;

import java.util.List;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: A.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0016m implements InterfaceC1926C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0016m f119b = new C0016m(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0016m f120c = new C0016m(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A.m.<clinit>():void] */
    public /* synthetic */ C0016m(int i) {
        this.f121a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(B0.T t6, List list, long j) {
        switch (this.f121a) {
            case 0:
                return t6.f(W0.a.j(j), W0.a.i(j), n5.t.f15300q, C0015l.f115r);
            default:
                return t6.f(W0.a.f(j) ? W0.a.h(j) : 0, W0.a.e(j) ? W0.a.g(j) : 0, n5.t.f15300q, C0015l.f117t);
        }
    }
}
