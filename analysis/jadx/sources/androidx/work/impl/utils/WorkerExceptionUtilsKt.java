package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.WorkerExceptionInfo;
import kotlin.jvm.internal.m;
import v1.InterfaceC1752a;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerExceptionUtilsKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void safeAccept(InterfaceC1752a interfaceC1752a, WorkerExceptionInfo info, String tag) {
        m.e(interfaceC1752a, "<this>");
        m.e(info, "info");
        m.e(tag, "tag");
        try {
            interfaceC1752a.accept(info);
        } catch (Throwable th) {
            Logger.get().error(tag, "Exception handler threw an exception", th);
        }
    }
}
