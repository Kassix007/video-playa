package androidx.work;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface ProgressUpdater {
    I4.b updateProgress(Context context, UUID uuid, Data data);
}
