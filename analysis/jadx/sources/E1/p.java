package E1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class p implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1653a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(Context context, int i) {
        switch (i) {
            case 1:
                AbstractC1887A.g(context);
                Context applicationContext = context.getApplicationContext();
                AbstractC1887A.g(applicationContext);
                this.f1653a = applicationContext;
                break;
            default:
                this.f1653a = context.getApplicationContext();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.k
    public void a(l6.d dVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0143a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new n(this, dVar, threadPoolExecutor, 0));
    }
}
