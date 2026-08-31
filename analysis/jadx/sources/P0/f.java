package P0;

import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class f extends n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f5606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f5607s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5608q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f5606r = new f(i, 0);
        f5607s = new f(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, int i7) {
        super(i);
        this.f5608q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f5608q) {
            case 0:
                return C1386y.f15098a;
            default:
                throw null;
        }
    }
}
