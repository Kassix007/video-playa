package Z;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f8296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f8297s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8298q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f8296r = new e(i, 0);
        f8297s = new e(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i7) {
        super(i);
        this.f8298q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f8298q) {
            case 0:
                return new f((Map) obj);
            default:
                return obj;
        }
    }
}
