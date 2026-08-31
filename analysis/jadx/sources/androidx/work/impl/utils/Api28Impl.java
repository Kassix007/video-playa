package androidx.work.impl.utils;

import android.app.Application;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Api28Impl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getProcessName() {
        String processName = Application.getProcessName();
        m.d(processName, "getProcessName()");
        return processName;
    }
}
