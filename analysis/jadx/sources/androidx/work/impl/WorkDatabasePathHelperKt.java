package androidx.work.impl;

import androidx.work.Logger;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabasePathHelperKt {
    private static final String[] DATABASE_EXTRA_FILES;
    private static final String TAG;
    public static final String WORK_DATABASE_NAME = "androidx.work.workdb";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WrkDbPathHelper");
        m.d(strTagWithPrefix, "tagWithPrefix(\"WrkDbPathHelper\")");
        TAG = strTagWithPrefix;
        DATABASE_EXTRA_FILES = new String[]{"-journal", "-shm", "-wal"};
    }
}
