package m6;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15105a = new d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int iMin;
        kotlin.jvm.internal.m.e(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f15103a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.m.d(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        kotlin.jvm.internal.m.d(message, "record.message");
        Throwable thrown = record.getThrown();
        String strM1 = (String) c.f15104b.get(loggerName);
        if (strM1 == null) {
            strM1 = J5.m.m1(23, loggerName);
        }
        if (Log.isLoggable(strM1, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i7 = 0;
            while (i7 < length) {
                int iR0 = J5.m.R0(message, '\n', i7, 4);
                if (iR0 == -1) {
                    iR0 = length;
                }
                while (true) {
                    iMin = Math.min(iR0, i7 + 4000);
                    String strSubstring = message.substring(i7, iMin);
                    kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strM1, strSubstring);
                    if (iMin >= iR0) {
                        break;
                    } else {
                        i7 = iMin;
                    }
                }
                i7 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
