package androidx.work.impl.utils;

import androidx.work.Configuration;
import androidx.work.Operation;
import androidx.work.OperationKt;
import androidx.work.Tracer;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class PruneWorkRunnableKt {

    /* JADX INFO: renamed from: androidx.work.impl.utils.PruneWorkRunnableKt$pruneWork$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements B5.a {
        final /* synthetic */ WorkDatabase $this_pruneWork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WorkDatabase workDatabase) {
            super(0);
            this.$this_pruneWork = workDatabase;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18invoke();
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m18invoke() {
            this.$this_pruneWork.workSpecDao().pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Operation pruneWork(WorkDatabase workDatabase, Configuration configuration, TaskExecutor executor) {
        m.e(workDatabase, "<this>");
        m.e(configuration, "configuration");
        m.e(executor, "executor");
        Tracer tracer = configuration.getTracer();
        SerialExecutor serialTaskExecutor = executor.getSerialTaskExecutor();
        m.d(serialTaskExecutor, "executor.serialTaskExecutor");
        return OperationKt.launchOperation(tracer, "PruneWork", serialTaskExecutor, new AnonymousClass1(workDatabase));
    }
}
