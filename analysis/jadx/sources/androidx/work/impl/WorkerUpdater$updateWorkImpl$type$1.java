package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerUpdater$updateWorkImpl$type$1 extends n implements B5.c {
    public static final WorkerUpdater$updateWorkImpl$type$1 INSTANCE = new WorkerUpdater$updateWorkImpl$type$1();

    public WorkerUpdater$updateWorkImpl$type$1() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // B5.c
    public final String invoke(WorkSpec spec) {
        m.e(spec, "spec");
        return spec.isPeriodic() ? "Periodic" : "OneTime";
    }
}
