package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class SystemJobInfoConverterExtKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void setRequiredNetworkRequest(JobInfo.Builder builder, NetworkRequest networkRequest) {
        m.e(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }
}
