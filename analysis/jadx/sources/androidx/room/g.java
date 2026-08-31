package androidx.room;

import java.util.concurrent.Callable;
import u2.C1692m;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1692m a(w wVar, boolean z5, String[] strArr, Callable callable) {
        return new C1692m(new C0668f(z5, wVar, strArr, callable, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(String tableName, String triggerType) {
        kotlin.jvm.internal.m.e(tableName, "tableName");
        kotlin.jvm.internal.m.e(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }
}
