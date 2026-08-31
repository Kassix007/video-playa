package androidx.work.impl;

import C0.S;
import androidx.work.Configuration;
import androidx.work.ListenableFutureKt;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.EnqueueUtilsKt;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k1.i;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.C1386y;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerUpdater {

    /* JADX INFO: renamed from: androidx.work.impl.WorkerUpdater$enqueueUniquelyNamedPeriodic$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements B5.a {
        final /* synthetic */ String $name;
        final /* synthetic */ WorkManagerImpl $this_enqueueUniquelyNamedPeriodic;
        final /* synthetic */ WorkRequest $workRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkManagerImpl workManagerImpl, String str, WorkRequest workRequest) {
            super(0);
            this.$this_enqueueUniquelyNamedPeriodic = workManagerImpl;
            this.$name = str;
            this.$workRequest = workRequest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1 workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1 = new WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1(this.$workRequest, this.$this_enqueueUniquelyNamedPeriodic, this.$name);
            WorkSpecDao workSpecDao = this.$this_enqueueUniquelyNamedPeriodic.getWorkDatabase().workSpecDao();
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workSpecDao.getWorkSpecIdAndStatesForName(this.$name);
            if (workSpecIdAndStatesForName.size() > 1) {
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
            }
            WorkSpec.IdAndState idAndState = (WorkSpec.IdAndState) l.m0(workSpecIdAndStatesForName);
            if (idAndState == null) {
                workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1.invoke();
                return;
            }
            WorkSpec workSpec = workSpecDao.getWorkSpec(idAndState.id);
            if (workSpec == null) {
                StringBuilder sb = new StringBuilder("WorkSpec with ");
                sb.append(idAndState.id);
                sb.append(", that matches a name \"");
                throw new IllegalStateException(i.k(sb, this.$name, "\", wasn't found"));
            }
            if (!workSpec.isPeriodic()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (idAndState.state == WorkInfo.State.CANCELLED) {
                workSpecDao.delete(idAndState.id);
                workerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1.invoke();
                return;
            }
            WorkSpec workSpecCopy$default = WorkSpec.copy$default(this.$workRequest.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777214, null);
            Processor processor = this.$this_enqueueUniquelyNamedPeriodic.getProcessor();
            m.d(processor, "processor");
            WorkDatabase workDatabase = this.$this_enqueueUniquelyNamedPeriodic.getWorkDatabase();
            m.d(workDatabase, "workDatabase");
            Configuration configuration = this.$this_enqueueUniquelyNamedPeriodic.getConfiguration();
            m.d(configuration, "configuration");
            List<Scheduler> schedulers = this.$this_enqueueUniquelyNamedPeriodic.getSchedulers();
            m.d(schedulers, "schedulers");
            WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, workSpecCopy$default, this.$workRequest.getTags());
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerUpdater$updateWorkImpl$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements B5.a {
        final /* synthetic */ WorkManagerImpl $this_updateWorkImpl;
        final /* synthetic */ WorkRequest $workRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WorkManagerImpl workManagerImpl, WorkRequest workRequest) {
            super(0);
            this.$this_updateWorkImpl = workManagerImpl;
            this.$workRequest = workRequest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // B5.a
        public final WorkManager.UpdateResult invoke() {
            Processor processor = this.$this_updateWorkImpl.getProcessor();
            m.d(processor, "processor");
            WorkDatabase workDatabase = this.$this_updateWorkImpl.getWorkDatabase();
            m.d(workDatabase, "workDatabase");
            Configuration configuration = this.$this_updateWorkImpl.getConfiguration();
            m.d(configuration, "configuration");
            List<Scheduler> schedulers = this.$this_updateWorkImpl.getSchedulers();
            m.d(schedulers, "schedulers");
            return WorkerUpdater.updateWorkImpl(processor, workDatabase, configuration, schedulers, this.$workRequest.getWorkSpec(), this.$workRequest.getTags());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Operation enqueueUniquelyNamedPeriodic(WorkManagerImpl workManagerImpl, String name, WorkRequest workRequest) {
        m.e(workManagerImpl, "<this>");
        m.e(name, "name");
        m.e(workRequest, "workRequest");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String strConcat = "enqueueUniquePeriodic_".concat(name);
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        m.d(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, strConcat, serialTaskExecutor, new AnonymousClass1(workManagerImpl, name, workRequest));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkManager.UpdateResult updateWorkImpl(Processor processor, final WorkDatabase workDatabase, Configuration configuration, final List<? extends Scheduler> list, final WorkSpec workSpec, final Set<String> set) {
        final String str = workSpec.id;
        final WorkSpec workSpec2 = workDatabase.workSpecDao().getWorkSpec(str);
        if (workSpec2 == null) {
            throw new IllegalArgumentException(S.n("Worker with ", str, " doesn't exist"));
        }
        if (workSpec2.state.isFinished()) {
            return WorkManager.UpdateResult.NOT_APPLIED;
        }
        if (workSpec2.isPeriodic() ^ workSpec.isPeriodic()) {
            WorkerUpdater$updateWorkImpl$type$1 workerUpdater$updateWorkImpl$type$1 = WorkerUpdater$updateWorkImpl$type$1.INSTANCE;
            StringBuilder sb = new StringBuilder("Can't update ");
            sb.append((String) workerUpdater$updateWorkImpl$type$1.invoke((Object) workSpec2));
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(i.k(sb, (String) workerUpdater$updateWorkImpl$type$1.invoke((Object) workSpec), " Worker. Update operation must preserve worker's type."));
        }
        final boolean zIsEnqueued = processor.isEnqueued(str);
        if (!zIsEnqueued) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Scheduler) it.next()).cancel(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.c
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                WorkerUpdater.updateWorkImpl$lambda$2(workDatabase, workSpec2, workSpec, list, str, set, zIsEnqueued);
            }
        });
        if (!zIsEnqueued) {
            Schedulers.schedule(configuration, workDatabase, list);
        }
        return zIsEnqueued ? WorkManager.UpdateResult.APPLIED_FOR_NEXT_RUN : WorkManager.UpdateResult.APPLIED_IMMEDIATELY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWorkImpl$lambda$2(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z5) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        WorkTagDao workTagDao = workDatabase.workTagDao();
        WorkSpec workSpecCopy$default = WorkSpec.copy$default(workSpec2, null, workSpec.state, null, null, null, null, 0L, 0L, 0L, null, workSpec.runAttemptCount, null, 0L, workSpec.lastEnqueueTime, 0L, 0L, false, null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, null, 12835837, null);
        if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
            workSpecCopy$default.setNextScheduleTimeOverride(workSpec2.getNextScheduleTimeOverride());
            workSpecCopy$default.setNextScheduleTimeOverrideGeneration(workSpecCopy$default.getNextScheduleTimeOverrideGeneration() + 1);
        }
        workSpecDao.updateWorkSpec(EnqueueUtilsKt.wrapWorkSpecIfNeeded(list, workSpecCopy$default));
        workTagDao.deleteByWorkSpecId(str);
        workTagDao.insertTags(str, set);
        if (z5) {
            return;
        }
        workSpecDao.markWorkSpecScheduled(str, -1L);
        workDatabase.workProgressDao().delete(str);
    }

    public static final I4.b updateWorkImpl(WorkManagerImpl workManagerImpl, WorkRequest workRequest) {
        m.e(workManagerImpl, "<this>");
        m.e(workRequest, "workRequest");
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        m.d(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "updateWorkImpl", new AnonymousClass3(workManagerImpl, workRequest));
    }
}
