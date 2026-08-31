package F;

import java.util.List;
import m5.C1386y;

/* JADX INFO: renamed from: F.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150d extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0150d f1856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0150d f1857s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1858q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f1856r = new C0150d(i, 0);
        f1857s = new C0150d(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0150d(int i, int i7) {
        super(i);
        this.f1858q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f1858q) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new C0151e(iIntValue, ((Float) obj3).floatValue(), new C0149c(0, list));
            default:
                return C1386y.f15098a;
        }
    }
}
