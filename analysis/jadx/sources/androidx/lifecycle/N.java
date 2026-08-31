package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0646i {
    final /* synthetic */ O this$0;

    public static final class a extends AbstractC0646i {
        final /* synthetic */ O this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(O o6) {
            this.this$0 = o6;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            this.this$0.c();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.m.e(activity, "activity");
            O o6 = this.this$0;
            int i = o6.f9497q + 1;
            o6.f9497q = i;
            if (i == 1 && o6.f9500t) {
                o6.f9502v.f(EnumC0652o.ON_START);
                o6.f9500t = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public N(O o6) {
        this.this$0 = o6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0646i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = T.f9505r;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.m.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((T) fragmentFindFragmentByTag).f9506q = this.this$0.f9504x;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0646i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        O o6 = this.this$0;
        int i = o6.f9498r - 1;
        o6.f9498r = i;
        if (i == 0) {
            Handler handler = o6.f9501u;
            kotlin.jvm.internal.m.b(handler);
            handler.postDelayed(o6.f9503w, 700L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        M.a(activity, new a(this.this$0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.AbstractC0646i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        O o6 = this.this$0;
        int i = o6.f9497q - 1;
        o6.f9497q = i;
        if (i == 0 && o6.f9499s) {
            o6.f9502v.f(EnumC0652o.ON_STOP);
            o6.f9500t = true;
        }
    }
}
