package androidx.work.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class Api21Impl {
    public static final Api21Impl INSTANCE = new Api21Impl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Api21Impl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File getNoBackupFilesDir(Context context) {
        m.e(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        m.d(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
