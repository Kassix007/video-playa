package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: androidx.work.Worker$getForegroundInfoAsync$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements B5.a {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // B5.a
        public final ForegroundInfo invoke() {
            return Worker.this.getForegroundInfo();
        }
    }

    /* JADX INFO: renamed from: androidx.work.Worker$startWork$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06701 extends n implements B5.a {
        public C06701() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // B5.a
        public final ListenableWorker.Result invoke() {
            return Worker.this.doWork();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        m.e(context, "context");
        m.e(workerParams, "workerParams");
    }

    public abstract ListenableWorker.Result doWork();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.ListenableWorker
    public I4.b getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        m.d(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new AnonymousClass1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.ListenableWorker
    public final I4.b startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        m.d(backgroundExecutor, "backgroundExecutor");
        return WorkerKt.future(backgroundExecutor, new C06701());
    }
}
