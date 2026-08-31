package androidx.work;

import androidx.work.PeriodicWorkRequest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class PeriodicWorkRequestKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit repeatIntervalTimeUnit) {
        m.e(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        m.j();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit repeatIntervalTimeUnit, long j7, TimeUnit flexTimeIntervalUnit) {
        m.e(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        m.e(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        m.j();
        throw null;
    }

    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval) {
        m.e(repeatInterval, "repeatInterval");
        m.j();
        throw null;
    }

    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval, Duration flexTimeInterval) {
        m.e(repeatInterval, "repeatInterval");
        m.e(flexTimeInterval, "flexTimeInterval");
        m.j();
        throw null;
    }
}
