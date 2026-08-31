package androidx.work.impl.utils;

import java.time.Duration;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class DurationApi26Impl {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long toMillisCompat(Duration duration) {
        m.e(duration, "<this>");
        return duration.toMillis();
    }
}
