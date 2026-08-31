package androidx.lifecycle;

import android.app.Activity;
import androidx.lifecycle.N;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(Activity activity, N.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
