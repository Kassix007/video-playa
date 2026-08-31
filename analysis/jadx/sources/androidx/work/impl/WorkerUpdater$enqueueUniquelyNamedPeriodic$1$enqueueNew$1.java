package androidx.work.impl;

import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1 extends n implements B5.a {
    final /* synthetic */ String $name;
    final /* synthetic */ WorkManagerImpl $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ WorkRequest $workRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdater$enqueueUniquelyNamedPeriodic$1$enqueueNew$1(WorkRequest workRequest, WorkManagerImpl workManagerImpl, String str) {
        super(0);
        this.$workRequest = workRequest;
        this.$this_enqueueUniquelyNamedPeriodic = workManagerImpl;
        this.$name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m9invoke();
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Possible override for method B5.a.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m9invoke() {
        EnqueueRunnable.enqueue(new WorkContinuationImpl(this.$this_enqueueUniquelyNamedPeriodic, this.$name, ExistingWorkPolicy.KEEP, AbstractC0836n2.z(this.$workRequest)));
    }
}
