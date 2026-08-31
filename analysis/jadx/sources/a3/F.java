package a3;

import C0.RunnableC0089m;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f8796e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f8797a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f8798b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f8799c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile D f8800d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            f8796e = new a2.c(0);
        } else {
            f8796e = Executors.newCachedThreadPool(new n3.d());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(C0632k c0632k) {
        d(new D(c0632k));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void a(InterfaceC0621B interfaceC0621B) {
        Throwable th;
        try {
            D d5 = this.f8800d;
            if (d5 != null && (th = d5.f8794b) != null) {
                interfaceC0621B.onResult(th);
            }
            this.f8798b.add(interfaceC0621B);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void b(InterfaceC0621B interfaceC0621B) {
        C0632k c0632k;
        try {
            D d5 = this.f8800d;
            if (d5 != null && (c0632k = d5.f8793a) != null) {
                interfaceC0621B.onResult(c0632k);
            }
            this.f8797a.add(interfaceC0621B);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        D d5 = this.f8800d;
        if (d5 == null) {
            return;
        }
        C0632k c0632k = d5.f8793a;
        int i = 0;
        if (c0632k != null) {
            synchronized (this) {
                ArrayList arrayList = new ArrayList(this.f8797a);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((InterfaceC0621B) obj).onResult(c0632k);
                }
            }
            return;
        }
        Throwable th = d5.f8794b;
        synchronized (this) {
            ArrayList arrayList2 = new ArrayList(this.f8798b);
            if (arrayList2.isEmpty()) {
                n3.c.c("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((InterfaceC0621B) obj2).onResult(th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(D d5) {
        if (this.f8800d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f8800d = d5;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f8799c.post(new RunnableC0089m(8, this));
        }
    }

    public F(Callable callable, boolean z5) {
        if (z5) {
            try {
                d((D) callable.call());
                return;
            } catch (Throwable th) {
                d(new D(th));
                return;
            }
        }
        Executor executor = f8796e;
        E e7 = new E(callable);
        e7.f8795q = this;
        executor.execute(e7);
    }
}
