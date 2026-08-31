package androidx.work;

import P5.InterfaceC0397h;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.G;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import m5.InterfaceC1364c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.WorkManager.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC1364c
        public WorkManager getInstance() {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void initialize(Context context, Configuration configuration) {
            m.e(context, "context");
            m.e(configuration, "configuration");
            WorkManagerImpl.initialize(context, configuration);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean isInitialized() {
            return WorkManagerImpl.isInitialized();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }

        public WorkManager getInstance(Context context) {
            m.e(context, "context");
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
            m.d(workManagerImpl, "getInstance(context)");
            return workManagerImpl;
        }
    }

    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC1364c
    public static WorkManager getInstance() {
        return Companion.getInstance();
    }

    public static void initialize(Context context, Configuration configuration) {
        Companion.initialize(context, configuration);
    }

    public static boolean isInitialized() {
        return Companion.isInitialized();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WorkContinuation beginUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest request) {
        m.e(uniqueWorkName, "uniqueWorkName");
        m.e(existingWorkPolicy, "existingWorkPolicy");
        m.e(request, "request");
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, AbstractC0836n2.z(request));
    }

    public abstract WorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WorkContinuation beginWith(OneTimeWorkRequest request) {
        m.e(request, "request");
        return beginWith(AbstractC0836n2.z(request));
    }

    public abstract WorkContinuation beginWith(List<OneTimeWorkRequest> list);

    public abstract Operation cancelAllWork();

    public abstract Operation cancelAllWorkByTag(String str);

    public abstract Operation cancelUniqueWork(String str);

    public abstract Operation cancelWorkById(UUID uuid);

    public abstract PendingIntent createCancelPendingIntent(UUID uuid);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Operation enqueue(WorkRequest request) {
        m.e(request, "request");
        return enqueue(AbstractC0836n2.z(request));
    }

    public abstract Operation enqueue(List<? extends WorkRequest> list);

    public abstract Operation enqueueUniquePeriodicWork(String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, PeriodicWorkRequest periodicWorkRequest);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Operation enqueueUniqueWork(String uniqueWorkName, ExistingWorkPolicy existingWorkPolicy, OneTimeWorkRequest request) {
        m.e(uniqueWorkName, "uniqueWorkName");
        m.e(existingWorkPolicy, "existingWorkPolicy");
        m.e(request, "request");
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, AbstractC0836n2.z(request));
    }

    public abstract Operation enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list);

    public abstract Configuration getConfiguration();

    public abstract I4.b getLastCancelAllTimeMillis();

    public abstract G getLastCancelAllTimeMillisLiveData();

    public abstract I4.b getWorkInfoById(UUID uuid);

    public abstract InterfaceC0397h getWorkInfoByIdFlow(UUID uuid);

    public abstract G getWorkInfoByIdLiveData(UUID uuid);

    public abstract I4.b getWorkInfos(WorkQuery workQuery);

    public abstract I4.b getWorkInfosByTag(String str);

    public abstract InterfaceC0397h getWorkInfosByTagFlow(String str);

    public abstract G getWorkInfosByTagLiveData(String str);

    public abstract InterfaceC0397h getWorkInfosFlow(WorkQuery workQuery);

    public abstract I4.b getWorkInfosForUniqueWork(String str);

    public abstract InterfaceC0397h getWorkInfosForUniqueWorkFlow(String str);

    public abstract G getWorkInfosForUniqueWorkLiveData(String str);

    public abstract G getWorkInfosLiveData(WorkQuery workQuery);

    public abstract Operation pruneWork();

    public abstract I4.b updateWork(WorkRequest workRequest);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static WorkManager getInstance(Context context) {
        return Companion.getInstance(context);
    }
}
