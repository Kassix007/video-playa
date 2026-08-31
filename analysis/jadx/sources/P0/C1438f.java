package p0;

import android.graphics.PathMeasure;
import j0.C1153h;
import m5.C1386y;

/* JADX INFO: renamed from: p0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1438f extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1438f f15557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1438f f15558s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15559q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f15557r = new C1438f(i, 0);
        f15558s = new C1438f(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1438f(int i, int i7) {
        super(i);
        this.f15559q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f15559q) {
            case 0:
                return new C1153h(new PathMeasure());
            default:
                return C1386y.f15098a;
        }
    }
}
