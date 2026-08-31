package Z;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f8304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f8305s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8306q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f8304r = new g(i, 0);
        f8305s = new g(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i7) {
        super(i);
        this.f8306q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f8306q) {
            case 0:
                return new f(new LinkedHashMap());
            default:
                return null;
        }
    }
}
