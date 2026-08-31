package C;

import java.util.List;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p f646r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f647s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f648q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f646r = new p(i, 0);
        f647s = new p(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i7) {
        super(i);
        this.f648q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f648q) {
            case 0:
                return C1386y.f15098a;
            default:
                List list = (List) obj;
                return new A(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
