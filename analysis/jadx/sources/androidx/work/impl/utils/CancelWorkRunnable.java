package androidx.work.impl.utils;

import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.C1386y;
import n5.q;

/* JADX INFO: loaded from: classes.dex */
public final class CancelWorkRunnable {

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forAll$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements B5.a {
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkManagerImpl workManagerImpl) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkDatabase workDatabase, WorkManagerImpl workManagerImpl) {
            Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
            while (it.hasNext()) {
                CancelWorkRunnable.cancel(workManagerImpl, it.next());
            }
            new PreferenceUtils(workDatabase).setLastCancelAllTimeMillis(workManagerImpl.getConfiguration().getClock().currentTimeMillis());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14invoke();
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m14invoke() {
            WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            m.d(workDatabase, "workManagerImpl.workDatabase");
            workDatabase.runInTransaction(new a(workDatabase, this.$workManagerImpl));
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06731 extends n implements B5.a {
        final /* synthetic */ UUID $id;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06731(WorkManagerImpl workManagerImpl, UUID uuid) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
            this.$id = uuid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkManagerImpl workManagerImpl, UUID uuid) {
            String string = uuid.toString();
            m.d(string, "id.toString()");
            CancelWorkRunnable.cancel(workManagerImpl, string);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m15invoke();
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m15invoke() {
            WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            m.d(workDatabase, "workManagerImpl.workDatabase");
            workDatabase.runInTransaction(new a(this.$workManagerImpl, this.$id));
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forName$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06741 extends n implements B5.a {
        final /* synthetic */ String $name;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06741(String str, WorkManagerImpl workManagerImpl) {
            super(0);
            this.$name = str;
            this.$workManagerImpl = workManagerImpl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m16invoke();
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m16invoke() {
            CancelWorkRunnable.forNameInline(this.$name, this.$workManagerImpl);
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$forTag$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06751 extends n implements B5.a {
        final /* synthetic */ String $tag;
        final /* synthetic */ WorkManagerImpl $workManagerImpl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06751(WorkManagerImpl workManagerImpl, String str) {
            super(0);
            this.$workManagerImpl = workManagerImpl;
            this.$tag = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
            Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
            while (it.hasNext()) {
                CancelWorkRunnable.cancel(workManagerImpl, it.next());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m17invoke();
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m17invoke() {
            WorkDatabase workDatabase = this.$workManagerImpl.getWorkDatabase();
            m.d(workDatabase, "workManagerImpl.workDatabase");
            workDatabase.runInTransaction(new b(workDatabase, this.$tag, this.$workManagerImpl, 0));
            CancelWorkRunnable.reschedulePendingWorkers(this.$workManagerImpl);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancel(WorkManagerImpl workManagerImpl, String str) {
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        m.d(workDatabase, "workManagerImpl.workDatabase");
        iterativelyCancelWorkAndDependents(workDatabase, str);
        Processor processor = workManagerImpl.getProcessor();
        m.d(processor, "workManagerImpl.processor");
        processor.stopAndCancelWork(str, 1);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Operation forAll(WorkManagerImpl workManagerImpl) {
        m.e(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        m.d(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelAllWork", serialTaskExecutor, new AnonymousClass1(workManagerImpl));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Operation forId(UUID id, WorkManagerImpl workManagerImpl) {
        m.e(id, "id");
        m.e(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        m.d(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "CancelWorkById", serialTaskExecutor, new C06731(workManagerImpl, id));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Operation forName(String name, WorkManagerImpl workManagerImpl) {
        m.e(name, "name");
        m.e(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String strConcat = "CancelWorkByName_".concat(name);
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        m.d(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, strConcat, serialTaskExecutor, new C06741(name, workManagerImpl));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void forNameInline(String name, WorkManagerImpl workManagerImpl) {
        m.e(name, "name");
        m.e(workManagerImpl, "workManagerImpl");
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        m.d(workDatabase, "workManagerImpl.workDatabase");
        workDatabase.runInTransaction(new b(workDatabase, name, workManagerImpl, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void forNameInline$lambda$0(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
        Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
        while (it.hasNext()) {
            cancel(workManagerImpl, it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Operation forTag(String tag, WorkManagerImpl workManagerImpl) {
        m.e(tag, "tag");
        m.e(workManagerImpl, "workManagerImpl");
        Tracer tracer = workManagerImpl.getConfiguration().getTracer();
        String strConcat = "CancelWorkByTag_".concat(tag);
        SerialExecutor serialTaskExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        m.d(serialTaskExecutor, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, strConcat, serialTaskExecutor, new C06751(workManagerImpl, tag));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        ArrayList arrayListC = AbstractC0836n2.C(str);
        while (!arrayListC.isEmpty()) {
            String str2 = (String) q.g0(arrayListC);
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setCancelledState(str2);
            }
            arrayListC.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}
