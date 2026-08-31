package androidx.work;

import android.content.Context;
import androidx.work.Configuration;
import java.util.Collections;
import java.util.List;
import m2.InterfaceC1359b;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC1359b {
    private static final String TAG = Logger.tagWithPrefix("WrkMgrInitializer");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public List<Class<? extends InterfaceC1359b>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: create(Landroid/content/Context;)Ljava/lang/Object; */
    @Override // m2.InterfaceC1359b
    public WorkManager create(Context context) {
        Logger.get().debug(TAG, "Initializing WorkManager with default configuration.");
        WorkManager.initialize(context, new Configuration.Builder().build());
        return WorkManager.getInstance(context);
    }
}
