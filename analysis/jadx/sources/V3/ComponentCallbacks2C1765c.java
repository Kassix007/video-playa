package v3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: v3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1765c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ComponentCallbacks2C1765c f17556u = new ComponentCallbacks2C1765c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f17557q = new AtomicBoolean();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f17558r = new AtomicBoolean();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f17559s = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17560t = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Application application) {
        ComponentCallbacks2C1765c componentCallbacks2C1765c = f17556u;
        synchronized (componentCallbacks2C1765c) {
            try {
                if (!componentCallbacks2C1765c.f17560t) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1765c);
                    application.registerComponentCallbacks(componentCallbacks2C1765c);
                    componentCallbacks2C1765c.f17560t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(boolean z5) {
        synchronized (f17556u) {
            try {
                ArrayList arrayList = this.f17559s;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((InterfaceC1764b) obj).onBackgroundStateChanged(z5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f17557q.compareAndSet(true, false);
        this.f17558r.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f17557q.compareAndSet(true, false);
        this.f17558r.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f17557q.compareAndSet(false, true)) {
            this.f17558r.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
