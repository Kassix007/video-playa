package K;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements B5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f2840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f2841s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2842q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f2840r = new a(i, 0);
        f2841s = new a(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i7) {
        super(i);
        this.f2842q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f2842q) {
            case 0:
                return null;
            default:
                return d.f2847b;
        }
    }
}
