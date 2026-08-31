package Q4;

import android.util.Log;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6590a = new a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String tag, String msg, ReflectiveOperationException reflectiveOperationException) {
        m.e(tag, "tag");
        m.e(msg, "msg");
        Log.println(6, tag, msg);
        if (reflectiveOperationException != null) {
            Log.println(6, tag, Log.getStackTraceString(reflectiveOperationException));
        }
    }
}
