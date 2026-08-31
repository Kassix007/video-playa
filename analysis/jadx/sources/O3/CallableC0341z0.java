package O3;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: O3.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0341z0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f5200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f5201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0 f5202d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ CallableC0341z0(C0 c02, a2 a2Var, Bundle bundle, int i) {
        this.f5199a = i;
        this.f5200b = a2Var;
        this.f5201c = bundle;
        this.f5202d = c02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f5199a) {
            case 0:
                C0 c02 = this.f5202d;
                c02.f4330c.A();
                return c02.f4330c.b0(this.f5200b, this.f5201c);
            default:
                C0 c03 = this.f5202d;
                c03.f4330c.A();
                return c03.f4330c.b0(this.f5200b, this.f5201c);
        }
    }
}
