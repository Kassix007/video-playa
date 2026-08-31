package M;

import android.view.View;
import d2.AbstractC0974V;

/* JADX INFO: renamed from: M.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0231t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3617b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0231t(int i, int i7) {
        this.f3616a = i;
        this.f3617b = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(AbstractC0974V abstractC0974V) {
        View view = abstractC0974V.f12032a;
        this.f3616a = view.getLeft();
        this.f3617b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
