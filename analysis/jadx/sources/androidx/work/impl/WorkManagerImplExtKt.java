package androidx.work.impl;

import B5.h;
import M5.AbstractC0257s;
import M5.AbstractC0263y;
import M5.C0258t;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.R;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.AbstractC1362a;
import m5.C1386y;
import n5.k;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1527f;
import r5.EnumC1580a;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerImplExtKt {

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImplExtKt$close$1, reason: invalid class name */
    @s5.e(c = "androidx.work.impl.WorkManagerImplExtKt$close$1", f = "WorkManagerImplExt.kt", l = {121}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements B5.e {
        final /* synthetic */ WorkManagerImpl $this_close;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkManagerImpl workManagerImpl, InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(2, interfaceC1524c);
            this.$this_close = workManagerImpl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            return new AnonymousClass1(this.$this_close, interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super C1386y> interfaceC1524c) {
            return ((AnonymousClass1) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            C1386y c1386y = C1386y.f15098a;
            if (i == 0) {
                AbstractC1362a.e(obj);
                InterfaceC1527f interfaceC1527f = this.$this_close.getWorkManagerScope().d().get(C0258t.f3885r);
                m.b(interfaceC1527f);
                InterfaceC0241b0 interfaceC0241b0 = (InterfaceC0241b0) interfaceC1527f;
                this.label = 1;
                interfaceC0241b0.a(null);
                Object objF = interfaceC0241b0.f(this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objF != enumC1580a) {
                    objF = c1386y;
                }
                if (objF == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
            }
            return c1386y;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImplExtKt$schedulers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06711 extends n implements h {
        final /* synthetic */ Scheduler[] $schedulers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06711(Scheduler[] schedulerArr) {
            super(6);
            this.$schedulers = schedulerArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.h
        public final List<Scheduler> invoke(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
            m.e(context, "<anonymous parameter 0>");
            m.e(configuration, "<anonymous parameter 1>");
            m.e(taskExecutor, "<anonymous parameter 2>");
            m.e(workDatabase, "<anonymous parameter 3>");
            m.e(trackers, "<anonymous parameter 4>");
            m.e(processor, "<anonymous parameter 5>");
            return k.R0(this.$schedulers);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void close(WorkManagerImpl workManagerImpl) {
        m.e(workManagerImpl, "<this>");
        AbstractC0263y.x(C1530i.f16022q, new AnonymousClass1(workManagerImpl, null));
        workManagerImpl.getWorkDatabase().close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Scheduler> createSchedulers(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        Scheduler schedulerCreateBestAvailableBackgroundScheduler = Schedulers.createBestAvailableBackgroundScheduler(context, workDatabase, configuration);
        m.d(schedulerCreateBestAvailableBackgroundScheduler, "createBestAvailableBackg…kDatabase, configuration)");
        return AbstractC0836n2.A(schedulerCreateBestAvailableBackgroundScheduler, new GreedyScheduler(context, configuration, trackers, processor, new WorkLauncherImpl(processor, taskExecutor), taskExecutor));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WorkManagerImpl createTestWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        m.e(context, "context");
        m.e(configuration, "configuration");
        m.e(workTaskExecutor, "workTaskExecutor");
        WorkDatabase.Companion companion = WorkDatabase.Companion;
        SerialExecutor serialTaskExecutor = workTaskExecutor.getSerialTaskExecutor();
        m.d(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, companion.create(context, serialTaskExecutor, configuration.getClock(), true), null, null, null, 112, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration) {
        m.e(context, "context");
        m.e(configuration, "configuration");
        return createWorkManager$default(context, configuration, null, null, null, null, null, 124, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WorkManagerImpl createWorkManager$default(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, h hVar, int i, Object obj) {
        Trackers trackers2;
        if ((i & 4) != 0) {
            taskExecutor = new WorkManagerTaskExecutor(configuration.getTaskExecutor());
        }
        TaskExecutor taskExecutor2 = taskExecutor;
        if ((i & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.Companion;
            Context applicationContext = context.getApplicationContext();
            m.d(applicationContext, "context.applicationContext");
            SerialExecutor serialTaskExecutor = taskExecutor2.getSerialTaskExecutor();
            m.d(serialTaskExecutor, "workTaskExecutor.serialTaskExecutor");
            workDatabase = companion.create(applicationContext, serialTaskExecutor, configuration.getClock(), context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        }
        if ((i & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            m.d(applicationContext2, "context.applicationContext");
            trackers2 = new Trackers(applicationContext2, taskExecutor2, null, null, null, null, 60, null);
        } else {
            trackers2 = trackers;
        }
        return createWorkManager(context, configuration, taskExecutor2, workDatabase, trackers2, (i & 32) != 0 ? new Processor(context.getApplicationContext(), configuration, taskExecutor2, workDatabase) : processor, (i & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : hVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0261w createWorkManagerScope(TaskExecutor taskExecutor) {
        m.e(taskExecutor, "taskExecutor");
        AbstractC0257s taskCoroutineDispatcher = taskExecutor.getTaskCoroutineDispatcher();
        m.d(taskCoroutineDispatcher, "taskExecutor.taskCoroutineDispatcher");
        return AbstractC0263y.a(taskCoroutineDispatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final h schedulers(Scheduler... schedulers) {
        m.e(schedulers, "schedulers");
        return new C06711(schedulers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor) {
        m.e(context, "context");
        m.e(configuration, "configuration");
        m.e(workTaskExecutor, "workTaskExecutor");
        return createWorkManager$default(context, configuration, workTaskExecutor, null, null, null, null, 120, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase) {
        m.e(context, "context");
        m.e(configuration, "configuration");
        m.e(workTaskExecutor, "workTaskExecutor");
        m.e(workDatabase, "workDatabase");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, null, null, null, 112, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers) {
        m.e(context, "context");
        m.e(configuration, "configuration");
        m.e(workTaskExecutor, "workTaskExecutor");
        m.e(workDatabase, "workDatabase");
        m.e(trackers, "trackers");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, null, null, 96, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor) {
        m.e(context, "context");
        m.e(configuration, "configuration");
        m.e(workTaskExecutor, "workTaskExecutor");
        m.e(workDatabase, "workDatabase");
        m.e(trackers, "trackers");
        m.e(processor, "processor");
        return createWorkManager$default(context, configuration, workTaskExecutor, workDatabase, trackers, processor, null, 64, null);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration, TaskExecutor workTaskExecutor, WorkDatabase workDatabase, Trackers trackers, Processor processor, h schedulersCreator) {
        m.e(context, "context");
        m.e(configuration, "configuration");
        m.e(workTaskExecutor, "workTaskExecutor");
        m.e(workDatabase, "workDatabase");
        m.e(trackers, "trackers");
        m.e(processor, "processor");
        m.e(schedulersCreator, "schedulersCreator");
        return new WorkManagerImpl(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
