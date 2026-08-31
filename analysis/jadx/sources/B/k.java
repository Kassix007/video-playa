package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.a0;
import h.AbstractActivityC1106h;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1106h f9881r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC1106h abstractActivityC1106h, int i) {
        super(0);
        this.f9880q = i;
        this.f9881r = abstractActivityC1106h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f9880q) {
            case 0:
                AbstractActivityC1106h abstractActivityC1106h = this.f9881r;
                return new a0(abstractActivityC1106h.getApplication(), abstractActivityC1106h, abstractActivityC1106h.getIntent() != null ? abstractActivityC1106h.getIntent().getExtras() : null);
            case 1:
                this.f9881r.reportFullyDrawn();
                return C1386y.f15098a;
            case 2:
                AbstractActivityC1106h abstractActivityC1106h2 = this.f9881r;
                return new t(abstractActivityC1106h2.f9896v, new k(abstractActivityC1106h2, 1));
            default:
                AbstractActivityC1106h abstractActivityC1106h3 = this.f9881r;
                C0683A c0683a = new C0683A(new RunnableC0686c(abstractActivityC1106h3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC1106h3.f14061q.a(new e(c0683a, abstractActivityC1106h3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new N5.c(5, abstractActivityC1106h3, c0683a));
                    }
                }
                return c0683a;
        }
    }
}
