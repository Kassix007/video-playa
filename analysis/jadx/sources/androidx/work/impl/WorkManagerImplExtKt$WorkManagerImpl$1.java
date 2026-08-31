package androidx.work.impl;

import B5.h;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class WorkManagerImplExtKt$WorkManagerImpl$1 extends k implements h {
    public static final WorkManagerImplExtKt$WorkManagerImpl$1 INSTANCE = new WorkManagerImplExtKt$WorkManagerImpl$1();

    public WorkManagerImplExtKt$WorkManagerImpl$1() {
        super(6, WorkManagerImplExtKt.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // B5.h
    public final List<Scheduler> invoke(Context p02, Configuration p12, TaskExecutor p22, WorkDatabase p32, Trackers p42, Processor p52) {
        m.e(p02, "p0");
        m.e(p12, "p1");
        m.e(p22, "p2");
        m.e(p32, "p3");
        m.e(p42, "p4");
        m.e(p52, "p5");
        return WorkManagerImplExtKt.createSchedulers(p02, p12, p22, p32, p42, p52);
    }
}
