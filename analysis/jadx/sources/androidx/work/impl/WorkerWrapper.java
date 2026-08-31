package androidx.work.impl;

import M5.AbstractC0263y;
import M5.InterfaceC0253n;
import M5.InterfaceC0261w;
import M5.i0;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.AbstractC1362a;
import m5.C1386y;
import n5.l;
import n5.q;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerWrapper {
    private final Context appContext;
    private final ListenableWorker builderWorker;
    private final Clock clock;
    private final Configuration configuration;
    private final DependencyDao dependencyDao;
    private final ForegroundProcessor foregroundProcessor;
    private final WorkerParameters.RuntimeExtras runtimeExtras;
    private final List<String> tags;
    private final WorkDatabase workDatabase;
    private final String workDescription;
    private final WorkSpec workSpec;
    private final WorkSpecDao workSpecDao;
    private final String workSpecId;
    private final TaskExecutor workTaskExecutor;
    private final InterfaceC0253n workerJob;

    public static final class Builder {
        private final Context appContext;
        private final Configuration configuration;
        private final ForegroundProcessor foregroundProcessor;
        private WorkerParameters.RuntimeExtras runtimeExtras;
        private final List<String> tags;
        private final WorkDatabase workDatabase;
        private final WorkSpec workSpec;
        private final TaskExecutor workTaskExecutor;
        private ListenableWorker worker;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @SuppressLint({"LambdaLast"})
        public Builder(Context context, Configuration configuration, TaskExecutor workTaskExecutor, ForegroundProcessor foregroundProcessor, WorkDatabase workDatabase, WorkSpec workSpec, List<String> tags) {
            m.e(context, "context");
            m.e(configuration, "configuration");
            m.e(workTaskExecutor, "workTaskExecutor");
            m.e(foregroundProcessor, "foregroundProcessor");
            m.e(workDatabase, "workDatabase");
            m.e(workSpec, "workSpec");
            m.e(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            m.d(applicationContext, "context.applicationContext");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.RuntimeExtras();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkerWrapper build() {
            return new WorkerWrapper(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Context getAppContext() {
            return this.appContext;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Configuration getConfiguration() {
            return this.configuration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ForegroundProcessor getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkerParameters.RuntimeExtras getRuntimeExtras() {
            return this.runtimeExtras;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<String> getTags() {
            return this.tags;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final TaskExecutor getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final ListenableWorker getWorker() {
            return this.worker;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            m.e(runtimeExtras, "<set-?>");
            this.runtimeExtras = runtimeExtras;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setWorker(ListenableWorker listenableWorker) {
            this.worker = listenableWorker;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder withRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Builder withWorker(ListenableWorker worker) {
            m.e(worker, "worker");
            this.worker = worker;
            return this;
        }
    }

    public static abstract class Resolution {

        public static final class Failed extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public Failed() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final ListenableWorker.Result getResult() {
                return this.result;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(ListenableWorker.Result result) {
                super(null);
                m.e(result, "result");
                this.result = result;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:androidx.work.ListenableWorker$Result:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:androidx.work.ListenableWorker$Result:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:3) call: androidx.work.ListenableWorker.Result.Failure.<init>():void type: CONSTRUCTOR) : (r1v0 androidx.work.ListenableWorker$Result))
 A[MD:(androidx.work.ListenableWorker$Result):void (m)] (LINE:3) call: androidx.work.impl.WorkerWrapper.Resolution.Failed.<init>(androidx.work.ListenableWorker$Result):void type: THIS */
            public /* synthetic */ Failed(ListenableWorker.Result result, int i, g gVar) {
                this((i & 1) != 0 ? new ListenableWorker.Result.Failure() : result);
            }
        }

        public static final class Finished extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(ListenableWorker.Result result) {
                super(null);
                m.e(result, "result");
                this.result = result;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final ListenableWorker.Result getResult() {
                return this.result;
            }
        }

        public static final class ResetWorkerStatus extends Resolution {
            private final int reason;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public ResetWorkerStatus() {
                this(0, 1, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int getReason() {
                return this.reason;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public ResetWorkerStatus(int i) {
                super(null);
                this.reason = i;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] androidx.work.WorkInfo.STOP_REASON_NOT_STOPPED int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:3) call: androidx.work.impl.WorkerWrapper.Resolution.ResetWorkerStatus.<init>(int):void type: THIS */
            public /* synthetic */ ResetWorkerStatus(int i, int i7, g gVar) {
                this((i7 & 1) != 0 ? WorkInfo.STOP_REASON_NOT_STOPPED : i);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.impl.WorkerWrapper.Resolution.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Resolution(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Resolution() {
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$launch$1, reason: invalid class name */
    @s5.e(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements B5.e {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AnonymousClass1(InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(2, interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean invokeSuspend$lambda$1(Resolution resolution, WorkerWrapper workerWrapper) {
            boolean zResetWorkerStatus;
            if (resolution instanceof Resolution.Finished) {
                zResetWorkerStatus = workerWrapper.onWorkFinished(((Resolution.Finished) resolution).getResult());
            } else if (resolution instanceof Resolution.Failed) {
                workerWrapper.setFailed(((Resolution.Failed) resolution).getResult());
                zResetWorkerStatus = false;
            } else {
                if (!(resolution instanceof Resolution.ResetWorkerStatus)) {
                    throw new C2.e();
                }
                zResetWorkerStatus = workerWrapper.resetWorkerStatus(((Resolution.ResetWorkerStatus) resolution).getReason());
            }
            return Boolean.valueOf(zResetWorkerStatus);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            return WorkerWrapper.this.new AnonymousClass1(interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super Boolean> interfaceC1524c) {
            return ((AnonymousClass1) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.WorkerWrapperKt.access$getTAG$p():java.lang.String */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            final Resolution failed;
            int i = this.label;
            int i7 = 1;
            ListenableWorker.Result result = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i == 0) {
                    AbstractC1362a.e(obj);
                    InterfaceC0253n interfaceC0253n = WorkerWrapper.this.workerJob;
                    WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(WorkerWrapper.this, null);
                    this.label = 1;
                    obj = AbstractC0263y.B(interfaceC0253n, workerWrapper$launch$1$resolution$1, this);
                    EnumC1580a enumC1580a = EnumC1580a.f16356q;
                    if (obj == enumC1580a) {
                        return enumC1580a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1362a.e(obj);
                }
                failed = (Resolution) obj;
            } catch (WorkerStoppedException e7) {
                failed = new Resolution.ResetWorkerStatus(e7.getReason());
            } catch (CancellationException unused) {
                failed = new Resolution.Failed(result, i7, objArr3 == true ? 1 : 0);
            } catch (Throwable th) {
                Logger.get().error(WorkerWrapperKt.TAG, "Unexpected error in WorkerWrapper", th);
                failed = new Resolution.Failed(objArr2 == true ? 1 : 0, i7, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = WorkerWrapper.this.workDatabase;
            final WorkerWrapper workerWrapper = WorkerWrapper.this;
            Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.e
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return WorkerWrapper.AnonymousClass1.invokeSuspend$lambda$1(failed, workerWrapper);
                }
            });
            m.d(objRunInTransaction, "workDatabase.runInTransa…          }\n            )");
            return objRunInTransaction;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$runWorker$1, reason: invalid class name and case insensitive filesystem */
    @s5.e(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {299}, m = "runWorker")
    public static final class C06721 extends s5.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C06721(InterfaceC1524c<? super C06721> interfaceC1524c) {
            super(interfaceC1524c);
        }

        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WorkerWrapper.this.runWorker(this);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkerWrapper$runWorker$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements B5.c {
        final /* synthetic */ boolean $isTracingEnabled;
        final /* synthetic */ String $traceTag;
        final /* synthetic */ ListenableWorker $worker;
        final /* synthetic */ WorkerWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ListenableWorker listenableWorker, boolean z5, String str, WorkerWrapper workerWrapper) {
            super(1);
            this.$worker = listenableWorker;
            this.$isTracingEnabled = z5;
            this.$traceTag = str;
            this.this$0 = workerWrapper;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final void invoke(Throwable th) {
            if (th instanceof WorkerStoppedException) {
                this.$worker.stop(((WorkerStoppedException) th).getReason());
            }
            if (!this.$isTracingEnabled || this.$traceTag == null) {
                return;
            }
            this.this$0.configuration.getTracer().endAsyncSection(this.$traceTag, this.this$0.getWorkSpec().hashCode());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkerWrapper(Builder builder) {
        m.e(builder, "builder");
        WorkSpec workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        Configuration configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        List<String> tags = builder.getTags();
        this.tags = tags;
        this.workDescription = createWorkDescription(tags);
        this.workerJob = AbstractC0263y.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String createWorkDescription(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.workSpecId);
        sb.append(", tags={ ");
        return k1.i.k(sb, l.q0(list, ",", null, null, null, 62), " } ]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean handleResult(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Success) {
            String str = WorkerWrapperKt.TAG;
            Logger.get().info(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.isPeriodic() ? resetPeriodic() : setSucceeded(result);
        }
        if (result instanceof ListenableWorker.Result.Retry) {
            String str2 = WorkerWrapperKt.TAG;
            Logger.get().info(str2, "Worker result RETRY for " + this.workDescription);
            return reschedule(WorkInfo.STOP_REASON_NOT_STOPPED);
        }
        String str3 = WorkerWrapperKt.TAG;
        Logger.get().info(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.isPeriodic()) {
            return resetPeriodic();
        }
        if (result == null) {
            result = new ListenableWorker.Result.Failure();
        }
        return setFailed(result);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void iterativelyFailWorkAndDependents(String str) {
        ArrayList arrayListC = AbstractC0836n2.C(str);
        while (!arrayListC.isEmpty()) {
            String str2 = (String) q.g0(arrayListC);
            if (this.workSpecDao.getState(str2) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.setState(WorkInfo.State.FAILED, str2);
            }
            arrayListC.addAll(this.dependencyDao.getDependentWorkIds(str2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onWorkFinished(ListenableWorker.Result result) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        this.workDatabase.workProgressDao().delete(this.workSpecId);
        if (state == null) {
            return false;
        }
        if (state == WorkInfo.State.RUNNING) {
            return handleResult(result);
        }
        if (state.isFinished()) {
            return false;
        }
        return reschedule(WorkInfo.STOP_REASON_UNKNOWN);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean reschedule(int i) {
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        this.workSpecDao.setStopReason(this.workSpecId, i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean resetPeriodic() {
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.resetWorkSpecRunAttemptCount(this.workSpecId);
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.incrementPeriodCount(this.workSpecId);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resetWorkerStatus(int i) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        if (state == null || state.isFinished()) {
            String str = WorkerWrapperKt.TAG;
            Logger.get().debug(str, "Status for " + this.workSpecId + " is " + state + " ; not doing any work");
            return false;
        }
        String str2 = WorkerWrapperKt.TAG;
        Logger.get().debug(str2, "Status for " + this.workSpecId + " is " + state + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setStopReason(this.workSpecId, i);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v17, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v18, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v13, resolved type: java.lang.Object[] */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runWorker(q5.InterfaceC1524c<? super androidx.work.impl.WorkerWrapper.Resolution> r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            boolean r2 = r0 instanceof androidx.work.impl.WorkerWrapper.C06721
            if (r2 == 0) goto L17
            r2 = r0
            androidx.work.impl.WorkerWrapper$runWorker$1 r2 = (androidx.work.impl.WorkerWrapper.C06721) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            androidx.work.impl.WorkerWrapper$runWorker$1 r2 = new androidx.work.impl.WorkerWrapper$runWorker$1
            r2.<init>(r0)
        L1c:
            java.lang.Object r0 = r2.result
            int r3 = r2.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L41
            if (r3 != r4) goto L39
            java.lang.Object r3 = r2.L$1
            androidx.work.WorkerParameters r3 = (androidx.work.WorkerParameters) r3
            java.lang.Object r2 = r2.L$0
            androidx.work.impl.WorkerWrapper r2 = (androidx.work.impl.WorkerWrapper) r2
            m5.AbstractC1362a.e(r0)     // Catch: java.lang.Throwable -> L33 java.util.concurrent.CancellationException -> L36
            goto L1e8
        L33:
            r0 = move-exception
            goto L1fc
        L36:
            r0 = move-exception
            goto L234
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L41:
            m5.AbstractC1362a.e(r0)
            androidx.work.Configuration r0 = r1.configuration
            androidx.work.Tracer r0 = r0.getTracer()
            boolean r0 = r0.isEnabled()
            androidx.work.impl.model.WorkSpec r3 = r1.workSpec
            java.lang.String r3 = r3.getTraceTag()
            if (r0 == 0) goto L67
            if (r3 == 0) goto L67
            androidx.work.Configuration r6 = r1.configuration
            androidx.work.Tracer r6 = r6.getTracer()
            androidx.work.impl.model.WorkSpec r7 = r1.workSpec
            int r7 = r7.hashCode()
            r6.beginAsyncSection(r3, r7)
        L67:
            androidx.work.impl.WorkDatabase r6 = r1.workDatabase
            androidx.work.impl.d r7 = new androidx.work.impl.d
            r8 = 0
            r7.<init>(r1, r8)
            java.lang.Object r6 = r6.runInTransaction(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.String r7 = "shouldExit"
            kotlin.jvm.internal.m.d(r6, r7)
            boolean r6 = r6.booleanValue()
            r7 = 0
            if (r6 == 0) goto L87
            androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus r0 = new androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus
            r0.<init>(r7, r4, r5)
            return r0
        L87:
            androidx.work.impl.model.WorkSpec r6 = r1.workSpec
            boolean r6 = r6.isPeriodic()
            if (r6 == 0) goto L95
            androidx.work.impl.model.WorkSpec r6 = r1.workSpec
            androidx.work.Data r6 = r6.input
        L93:
            r10 = r6
            goto Le5
        L95:
            androidx.work.Configuration r6 = r1.configuration
            androidx.work.InputMergerFactory r6 = r6.getInputMergerFactory()
            androidx.work.impl.model.WorkSpec r8 = r1.workSpec
            java.lang.String r8 = r8.inputMergerClassName
            androidx.work.InputMerger r6 = r6.createInputMergerWithDefaultFallback(r8)
            if (r6 != 0) goto Lc8
            java.lang.String r0 = androidx.work.impl.WorkerWrapperKt.access$getTAG$p()
            androidx.work.Logger r2 = androidx.work.Logger.get()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Could not create Input Merger "
            r3.<init>(r6)
            androidx.work.impl.model.WorkSpec r6 = r1.workSpec
            java.lang.String r6 = r6.inputMergerClassName
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.error(r0, r3)
            androidx.work.impl.WorkerWrapper$Resolution$Failed r0 = new androidx.work.impl.WorkerWrapper$Resolution$Failed
            r0.<init>(r5, r4, r5)
            return r0
        Lc8:
            androidx.work.impl.model.WorkSpec r8 = r1.workSpec
            androidx.work.Data r8 = r8.input
            java.util.List r8 = com.google.android.gms.internal.measurement.AbstractC0836n2.z(r8)
            java.util.Collection r8 = (java.util.Collection) r8
            androidx.work.impl.model.WorkSpecDao r9 = r1.workSpecDao
            java.lang.String r10 = r1.workSpecId
            java.util.List r9 = r9.getInputsFromPrerequisites(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = n5.l.u0(r8, r9)
            androidx.work.Data r6 = r6.merge(r8)
            goto L93
        Le5:
            androidx.work.WorkerParameters r8 = new androidx.work.WorkerParameters
            java.lang.String r6 = r1.workSpecId
            java.util.UUID r9 = java.util.UUID.fromString(r6)
            java.util.List<java.lang.String> r6 = r1.tags
            r11 = r6
            java.util.Collection r11 = (java.util.Collection) r11
            androidx.work.WorkerParameters$RuntimeExtras r12 = r1.runtimeExtras
            androidx.work.impl.model.WorkSpec r6 = r1.workSpec
            int r13 = r6.runAttemptCount
            int r14 = r6.getGeneration()
            androidx.work.Configuration r6 = r1.configuration
            java.util.concurrent.Executor r15 = r6.getExecutor()
            androidx.work.Configuration r6 = r1.configuration
            q5.h r16 = r6.getWorkerCoroutineContext()
            androidx.work.impl.utils.taskexecutor.TaskExecutor r6 = r1.workTaskExecutor
            androidx.work.Configuration r7 = r1.configuration
            androidx.work.WorkerFactory r18 = r7.getWorkerFactory()
            androidx.work.impl.utils.WorkProgressUpdater r7 = new androidx.work.impl.utils.WorkProgressUpdater
            androidx.work.impl.WorkDatabase r4 = r1.workDatabase
            androidx.work.impl.utils.taskexecutor.TaskExecutor r5 = r1.workTaskExecutor
            r7.<init>(r4, r5)
            androidx.work.impl.utils.WorkForegroundUpdater r4 = new androidx.work.impl.utils.WorkForegroundUpdater
            androidx.work.impl.WorkDatabase r5 = r1.workDatabase
            r17 = r6
            androidx.work.impl.foreground.ForegroundProcessor r6 = r1.foregroundProcessor
            r19 = r7
            androidx.work.impl.utils.taskexecutor.TaskExecutor r7 = r1.workTaskExecutor
            r4.<init>(r5, r6, r7)
            r20 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.work.ListenableWorker r4 = r1.builderWorker
            if (r4 != 0) goto L180
            androidx.work.Configuration r4 = r1.configuration     // Catch: java.lang.Throwable -> L142
            androidx.work.WorkerFactory r4 = r4.getWorkerFactory()     // Catch: java.lang.Throwable -> L142
            android.content.Context r5 = r1.appContext     // Catch: java.lang.Throwable -> L142
            androidx.work.impl.model.WorkSpec r6 = r1.workSpec     // Catch: java.lang.Throwable -> L142
            java.lang.String r6 = r6.workerClassName     // Catch: java.lang.Throwable -> L142
            androidx.work.ListenableWorker r4 = r4.createWorkerWithDefaultFallback(r5, r6, r8)     // Catch: java.lang.Throwable -> L142
            goto L180
        L142:
            r0 = move-exception
            java.lang.String r2 = androidx.work.impl.WorkerWrapperKt.access$getTAG$p()
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Could not create Worker "
            r4.<init>(r5)
            androidx.work.impl.model.WorkSpec r5 = r1.workSpec
            java.lang.String r5 = r5.workerClassName
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.error(r2, r4)
            androidx.work.Configuration r2 = r1.configuration
            v1.a r2 = r2.getWorkerInitializationExceptionHandler()
            if (r2 == 0) goto L178
            androidx.work.WorkerExceptionInfo r3 = new androidx.work.WorkerExceptionInfo
            androidx.work.impl.model.WorkSpec r4 = r1.workSpec
            java.lang.String r4 = r4.workerClassName
            r3.<init>(r4, r8, r0)
            java.lang.String r0 = androidx.work.impl.WorkerWrapperKt.access$getTAG$p()
            androidx.work.impl.utils.WorkerExceptionUtilsKt.safeAccept(r2, r3, r0)
        L178:
            androidx.work.impl.WorkerWrapper$Resolution$Failed r0 = new androidx.work.impl.WorkerWrapper$Resolution$Failed
            r2 = 1
            r3 = 0
            r0.<init>(r3, r2, r3)
            return r0
        L180:
            r4.setUsed()
            q5.h r5 = r2.getContext()
            M5.t r6 = M5.C0258t.f3885r
            q5.f r5 = r5.get(r6)
            kotlin.jvm.internal.m.b(r5)
            M5.b0 r5 = (M5.InterfaceC0241b0) r5
            androidx.work.impl.WorkerWrapper$runWorker$2 r6 = new androidx.work.impl.WorkerWrapper$runWorker$2
            r6.<init>(r4, r0, r3, r1)
            r5.G(r6)
            boolean r0 = r1.trySetRunning()
            if (r0 != 0) goto L1a9
            androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus r0 = new androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus
            r3 = 0
            r6 = 1
            r7 = 0
            r0.<init>(r3, r6, r7)
            return r0
        L1a9:
            r3 = 0
            r6 = 1
            r7 = 0
            boolean r0 = r5.isCancelled()
            if (r0 == 0) goto L1b8
            androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus r0 = new androidx.work.impl.WorkerWrapper$Resolution$ResetWorkerStatus
            r0.<init>(r3, r6, r7)
            return r0
        L1b8:
            androidx.work.ForegroundUpdater r0 = r8.getForegroundUpdater()
            java.lang.String r3 = "params.foregroundUpdater"
            kotlin.jvm.internal.m.d(r0, r3)
            androidx.work.impl.utils.taskexecutor.TaskExecutor r3 = r1.workTaskExecutor
            java.util.concurrent.Executor r3 = r3.getMainThreadExecutor()
            java.lang.String r5 = "workTaskExecutor.getMainThreadExecutor()"
            kotlin.jvm.internal.m.d(r3, r5)
            M5.s r3 = M5.AbstractC0263y.k(r3)
            androidx.work.impl.WorkerWrapper$runWorker$result$1 r5 = new androidx.work.impl.WorkerWrapper$runWorker$result$1     // Catch: java.lang.Throwable -> L1f5 java.util.concurrent.CancellationException -> L1f9
            r7 = 0
            r5.<init>(r1, r4, r0, r7)     // Catch: java.lang.Throwable -> L1f5 java.util.concurrent.CancellationException -> L1f9
            r2.L$0 = r1     // Catch: java.lang.Throwable -> L1f5 java.util.concurrent.CancellationException -> L1f9
            r2.L$1 = r8     // Catch: java.lang.Throwable -> L1f5 java.util.concurrent.CancellationException -> L1f9
            r6 = 1
            r2.label = r6     // Catch: java.lang.Throwable -> L1f5 java.util.concurrent.CancellationException -> L1f9
            java.lang.Object r0 = M5.AbstractC0263y.B(r3, r5, r2)     // Catch: java.lang.Throwable -> L1f5 java.util.concurrent.CancellationException -> L1f9
            r5.a r2 = r5.EnumC1580a.f16356q
            if (r0 != r2) goto L1e6
            return r2
        L1e6:
            r2 = r1
            r3 = r8
        L1e8:
            androidx.work.ListenableWorker$Result r0 = (androidx.work.ListenableWorker.Result) r0     // Catch: java.lang.Throwable -> L33 java.util.concurrent.CancellationException -> L36
            androidx.work.impl.WorkerWrapper$Resolution$Finished r4 = new androidx.work.impl.WorkerWrapper$Resolution$Finished     // Catch: java.lang.Throwable -> L33 java.util.concurrent.CancellationException -> L36
            java.lang.String r5 = "result"
            kotlin.jvm.internal.m.d(r0, r5)     // Catch: java.lang.Throwable -> L33 java.util.concurrent.CancellationException -> L36
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L33 java.util.concurrent.CancellationException -> L36
            return r4
        L1f5:
            r0 = move-exception
            r2 = r1
            r3 = r8
            goto L1fc
        L1f9:
            r0 = move-exception
            r2 = r1
            goto L234
        L1fc:
            java.lang.String r4 = androidx.work.impl.WorkerWrapperKt.access$getTAG$p()
            androidx.work.Logger r5 = androidx.work.Logger.get()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r2.workDescription
            java.lang.String r8 = " failed because it threw an exception/error"
            java.lang.String r6 = k1.i.k(r6, r7, r8)
            r5.error(r4, r6, r0)
            androidx.work.Configuration r4 = r2.configuration
            v1.a r4 = r4.getWorkerExecutionExceptionHandler()
            if (r4 == 0) goto L22c
            androidx.work.WorkerExceptionInfo r5 = new androidx.work.WorkerExceptionInfo
            androidx.work.impl.model.WorkSpec r2 = r2.workSpec
            java.lang.String r2 = r2.workerClassName
            r5.<init>(r2, r3, r0)
            java.lang.String r0 = androidx.work.impl.WorkerWrapperKt.access$getTAG$p()
            androidx.work.impl.utils.WorkerExceptionUtilsKt.safeAccept(r4, r5, r0)
        L22c:
            androidx.work.impl.WorkerWrapper$Resolution$Failed r0 = new androidx.work.impl.WorkerWrapper$Resolution$Failed
            r6 = 1
            r7 = 0
            r0.<init>(r7, r6, r7)
            return r0
        L234:
            java.lang.String r3 = androidx.work.impl.WorkerWrapperKt.access$getTAG$p()
            androidx.work.Logger r4 = androidx.work.Logger.get()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.workDescription
            java.lang.String r6 = " was cancelled"
            java.lang.String r2 = k1.i.k(r5, r2, r6)
            r4.info(r3, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.WorkerWrapper.runWorker(q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean runWorker$lambda$1(WorkerWrapper workerWrapper) {
        WorkSpec workSpec = workerWrapper.workSpec;
        if (workSpec.state != WorkInfo.State.ENQUEUED) {
            String str = WorkerWrapperKt.TAG;
            Logger.get().debug(str, workerWrapper.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!workSpec.isPeriodic() && !workerWrapper.workSpec.isBackedOff()) || workerWrapper.clock.currentTimeMillis() >= workerWrapper.workSpec.calculateNextRunTime()) {
            return Boolean.FALSE;
        }
        Logger.get().debug(WorkerWrapperKt.TAG, "Delaying execution for " + workerWrapper.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean setSucceeded(ListenableWorker.Result result) {
        this.workSpecDao.setState(WorkInfo.State.SUCCEEDED, this.workSpecId);
        m.c(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data outputData = ((ListenableWorker.Result.Success) result).getOutputData();
        m.d(outputData, "success.outputData");
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        long jCurrentTimeMillis = this.clock.currentTimeMillis();
        for (String str : this.dependencyDao.getDependentWorkIds(this.workSpecId)) {
            if (this.workSpecDao.getState(str) == WorkInfo.State.BLOCKED && this.dependencyDao.hasCompletedAllPrerequisites(str)) {
                String str2 = WorkerWrapperKt.TAG;
                Logger.get().info(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.setState(WorkInfo.State.ENQUEUED, str);
                this.workSpecDao.setLastEnqueueTime(str, jCurrentTimeMillis);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean trySetRunning() {
        Object objRunInTransaction = this.workDatabase.runInTransaction(new d(this, 1));
        m.d(objRunInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) objRunInTransaction).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean trySetRunning$lambda$11(WorkerWrapper workerWrapper) {
        boolean z5;
        if (workerWrapper.workSpecDao.getState(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.setState(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.incrementWorkSpecRunAttemptCount(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.setStopReason(workerWrapper.workSpecId, WorkInfo.STOP_REASON_NOT_STOPPED);
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.workSpec);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void interrupt(int i) {
        ((i0) this.workerJob).t(new WorkerStoppedException(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final I4.b launch() {
        return ListenableFutureKt.launchFuture$default(this.workTaskExecutor.getTaskCoroutineDispatcher().plus(AbstractC0263y.b()), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean setFailed(ListenableWorker.Result result) {
        m.e(result, "result");
        iterativelyFailWorkAndDependents(this.workSpecId);
        Data outputData = ((ListenableWorker.Result.Failure) result).getOutputData();
        m.d(outputData, "failure.outputData");
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        return false;
    }
}
