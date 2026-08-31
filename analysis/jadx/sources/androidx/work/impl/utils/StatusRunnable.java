package androidx.work.impl.utils;

import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class StatusRunnable {

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forStringIds$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements B5.c {
        final /* synthetic */ List<String> $ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<String> list) {
            super(1);
            this.$ids = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.c
        public final List<WorkInfo> invoke(WorkDatabase db) {
            m.e(db, "db");
            Object objApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForIds(this.$ids));
            m.d(objApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForIds(ids))");
            return (List) objApply;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forTag$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06761 extends n implements B5.c {
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06761(String str) {
            super(1);
            this.$tag = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.c
        public final List<WorkInfo> invoke(WorkDatabase db) {
            m.e(db, "db");
            Object objApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForTag(this.$tag));
            m.d(objApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
            return (List) objApply;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forUUID$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06771 extends n implements B5.c {
        final /* synthetic */ UUID $id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06771(UUID uuid) {
            super(1);
            this.$id = uuid;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.c
        public final WorkInfo invoke(WorkDatabase db) {
            m.e(db, "db");
            WorkSpecDao workSpecDao = db.workSpecDao();
            String string = this.$id.toString();
            m.d(string, "id.toString()");
            WorkSpec.WorkInfoPojo workStatusPojoForId = workSpecDao.getWorkStatusPojoForId(string);
            if (workStatusPojoForId != null) {
                return workStatusPojoForId.toWorkInfo();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forUniqueWork$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06781 extends n implements B5.c {
        final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06781(String str) {
            super(1);
            this.$name = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.c
        public final List<WorkInfo> invoke(WorkDatabase db) {
            m.e(db, "db");
            Object objApply = WorkSpec.WORK_INFO_MAPPER.apply(db.workSpecDao().getWorkStatusPojoForName(this.$name));
            m.d(objApply, "WORK_INFO_MAPPER.apply(d…kStatusPojoForName(name))");
            return (List) objApply;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$forWorkQuerySpec$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06791 extends n implements B5.c {
        final /* synthetic */ WorkQuery $querySpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06791(WorkQuery workQuery) {
            super(1);
            this.$querySpec = workQuery;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.c
        public final List<WorkInfo> invoke(WorkDatabase db) {
            m.e(db, "db");
            Object objApply = WorkSpec.WORK_INFO_MAPPER.apply(db.rawWorkInfoDao().getWorkInfoPojos(RawQueries.toRawQuery(this.$querySpec)));
            m.d(objApply, "WORK_INFO_MAPPER.apply(d…(querySpec.toRawQuery()))");
            return (List) objApply;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.utils.StatusRunnable$loadStatusFuture$1, reason: invalid class name and case insensitive filesystem */
    public static final class C06801 extends n implements B5.a {
        final /* synthetic */ B5.c $block;
        final /* synthetic */ WorkDatabase $this_loadStatusFuture;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06801(B5.c cVar, WorkDatabase workDatabase) {
            super(0);
            this.$block = cVar;
            this.$this_loadStatusFuture = workDatabase;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // B5.a
        public final T invoke() {
            return this.$block.invoke(this.$this_loadStatusFuture);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final I4.b forStringIds(WorkDatabase workDatabase, TaskExecutor executor, List<String> ids) {
        m.e(workDatabase, "<this>");
        m.e(executor, "executor");
        m.e(ids, "ids");
        return loadStatusFuture(workDatabase, executor, new AnonymousClass1(ids));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final I4.b forTag(WorkDatabase workDatabase, TaskExecutor executor, String tag) {
        m.e(workDatabase, "<this>");
        m.e(executor, "executor");
        m.e(tag, "tag");
        return loadStatusFuture(workDatabase, executor, new C06761(tag));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final I4.b forUUID(WorkDatabase workDatabase, TaskExecutor executor, UUID id) {
        m.e(workDatabase, "<this>");
        m.e(executor, "executor");
        m.e(id, "id");
        return loadStatusFuture(workDatabase, executor, new C06771(id));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final I4.b forUniqueWork(WorkDatabase workDatabase, TaskExecutor executor, String name) {
        m.e(workDatabase, "<this>");
        m.e(executor, "executor");
        m.e(name, "name");
        return loadStatusFuture(workDatabase, executor, new C06781(name));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final I4.b forWorkQuerySpec(WorkDatabase workDatabase, TaskExecutor executor, WorkQuery querySpec) {
        m.e(workDatabase, "<this>");
        m.e(executor, "executor");
        m.e(querySpec, "querySpec");
        return loadStatusFuture(workDatabase, executor, new C06791(querySpec));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static final <T> I4.b loadStatusFuture(WorkDatabase workDatabase, TaskExecutor taskExecutor, B5.c cVar) {
        SerialExecutor serialTaskExecutor = taskExecutor.getSerialTaskExecutor();
        m.d(serialTaskExecutor, "executor.serialTaskExecutor");
        return ListenableFutureKt.executeAsync(serialTaskExecutor, "loadStatusFuture", new C06801(cVar, workDatabase));
    }
}
