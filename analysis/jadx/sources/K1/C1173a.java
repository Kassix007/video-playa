package k1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: k1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1173a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f14048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Activity f14049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14051t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14052u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14053v = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1173a(Activity activity) {
        this.f14049r = activity;
        this.f14050s = activity.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f14049r == activity) {
            this.f14049r = null;
            this.f14052u = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f14052u || this.f14053v || this.f14051t) {
            return;
        }
        Object obj = this.f14048q;
        try {
            Object obj2 = AbstractC1174b.f14056c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f14050s) {
                AbstractC1174b.f14059g.postAtFrontOfQueue(new I4.a(27, AbstractC1174b.f14055b.get(activity), obj2));
                this.f14053v = true;
                this.f14048q = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f14049r == activity) {
            this.f14051t = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
