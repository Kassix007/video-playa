package b;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import e.C1008a;
import h.AbstractActivityC1106h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static OnBackInvokedDispatcher a(AbstractActivityC1106h abstractActivityC1106h) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = abstractActivityC1106h.getOnBackInvokedDispatcher();
        kotlin.jvm.internal.m.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object b(String str, Bundle bundle) {
        return bundle.getParcelable(str, C1008a.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList c(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(Object dispatcher, Object callback) {
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.m.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(Object dispatcher, Object callback) {
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.m.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
