package D;

import java.util.List;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n f1243r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n f1244s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f1245t;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1246q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f1243r = new n(i, 0);
        f1244s = new n(i, 1);
        f1245t = new n(i, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, int i7) {
        super(i);
        this.f1246q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f1246q) {
            case 0:
                return C1386y.f15098a;
            case 1:
                List list = (List) obj;
                return new y(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return n5.s.f15299q;
        }
    }
}
