package E1;

import C0.RunnableC0089m;
import C0.S;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class v implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.c f1663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s4.e f1664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1665d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f1666e;
    public ThreadPoolExecutor f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f1667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l6.d f1668h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v(Context context, s1.c cVar) {
        E3.h.p(context, "Context cannot be null");
        this.f1662a = context.getApplicationContext();
        this.f1663b = cVar;
        this.f1664c = w.f1669d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E1.k
    public final void a(l6.d dVar) {
        synchronized (this.f1665d) {
            this.f1668h = dVar;
        }
        synchronized (this.f1665d) {
            try {
                if (this.f1668h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0143a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1667g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new RunnableC0089m(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        synchronized (this.f1665d) {
            try {
                this.f1668h = null;
                Handler handler = this.f1666e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1666e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1667g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f1667g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final s1.h c() {
        try {
            s4.e eVar = this.f1664c;
            Context context = this.f1662a;
            s1.c cVar = this.f1663b;
            eVar.getClass();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            D.t tVarA = s1.b.a(context, Collections.unmodifiableList(arrayList));
            int i = tVarA.f1286a;
            if (i != 0) {
                throw new RuntimeException(S.m("fetchFonts failed (", ")", i));
            }
            s1.h[] hVarArr = (s1.h[]) tVarA.f1287b.get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e7) {
            throw new RuntimeException("provider not found", e7);
        }
    }
}
