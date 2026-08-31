package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.T;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0652o event) {
        kotlin.jvm.internal.m.e(event, "event");
        if (activity instanceof InterfaceC0660x) {
            AbstractC0654q lifecycle = ((InterfaceC0660x) activity).getLifecycle();
            if (lifecycle instanceof C0662z) {
                ((C0662z) lifecycle).f(event);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            T.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new T.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new T(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
