package androidx.work;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface ForegroundUpdater {
    I4.b setForegroundAsync(Context context, UUID uuid, ForegroundInfo foregroundInfo);
}
