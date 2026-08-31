package Z0;

import B0.L;
import androidx.lifecycle.InterfaceC0660x;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m f8368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m f8369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m f8370t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m f8371u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m f8372v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m f8373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m f8374x;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8375q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        f8368r = new m(i, 0);
        f8369s = new m(i, 1);
        f8370t = new m(i, 2);
        f8371u = new m(i, 3);
        f8372v = new m(i, 4);
        f8373w = new m(i, 5);
        f8374x = new m(i, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, int i7) {
        super(i);
        this.f8375q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.f8375q) {
            case 0:
                androidx.compose.ui.viewinterop.a.c((L) obj).setUpdateBlock((B5.c) obj2);
                return C1386y.f15098a;
            case 1:
                androidx.compose.ui.viewinterop.a.c((L) obj).setReleaseBlock((B5.c) obj2);
                return C1386y.f15098a;
            case 2:
                androidx.compose.ui.viewinterop.a.c((L) obj).setModifier((InterfaceC0725m) obj2);
                return C1386y.f15098a;
            case 3:
                androidx.compose.ui.viewinterop.a.c((L) obj).setDensity((W0.c) obj2);
                return C1386y.f15098a;
            case 4:
                androidx.compose.ui.viewinterop.a.c((L) obj).setLifecycleOwner((InterfaceC0660x) obj2);
                return C1386y.f15098a;
            case 5:
                androidx.compose.ui.viewinterop.a.c((L) obj).setSavedStateRegistryOwner((g2.e) obj2);
                return C1386y.f15098a;
            default:
                r rVarC = androidx.compose.ui.viewinterop.a.c((L) obj);
                int iOrdinal = ((W0.l) obj2).ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        throw new C2.e();
                    }
                } else {
                    i = 0;
                }
                rVarC.setLayoutDirection(i);
                return C1386y.f15098a;
        }
    }
}
