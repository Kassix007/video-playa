package androidx.work.impl.model;

import C0.S;
import P5.InterfaceC0397h;
import android.database.Cursor;
import androidx.lifecycle.G;
import androidx.room.D;
import androidx.room.g;
import androidx.room.i;
import androidx.room.j;
import androidx.room.w;
import androidx.room.z;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import j2.InterfaceC1161g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.m;
import l6.d;
import m5.C1386y;
import n5.AbstractC1397A;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {
    private final w __db;
    private final j __insertionAdapterOfWorkSpec;
    private final D __preparedStmtOfDelete;
    private final D __preparedStmtOfIncrementGeneration;
    private final D __preparedStmtOfIncrementPeriodCount;
    private final D __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final D __preparedStmtOfMarkWorkSpecScheduled;
    private final D __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final D __preparedStmtOfResetScheduledState;
    private final D __preparedStmtOfResetWorkSpecNextScheduleTimeOverride;
    private final D __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final D __preparedStmtOfSetCancelledState;
    private final D __preparedStmtOfSetLastEnqueueTime;
    private final D __preparedStmtOfSetNextScheduleTimeOverride;
    private final D __preparedStmtOfSetOutput;
    private final D __preparedStmtOfSetState;
    private final D __preparedStmtOfSetStopReason;
    private final i __updateAdapterOfWorkSpec;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkSpecDao_Impl(w wVar) {
        this.__db = wVar;
        this.__insertionAdapterOfWorkSpec = new j(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: bind(Lj2/g;Ljava/lang/Object;)V */
            @Override // androidx.room.j
            public void bind(InterfaceC1161g interfaceC1161g, WorkSpec workSpec) {
                interfaceC1161g.m(1, workSpec.id);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                interfaceC1161g.H(2, WorkTypeConverters.stateToInt(workSpec.state));
                interfaceC1161g.m(3, workSpec.workerClassName);
                interfaceC1161g.m(4, workSpec.inputMergerClassName);
                interfaceC1161g.N(5, Data.toByteArrayInternalV1(workSpec.input));
                interfaceC1161g.N(6, Data.toByteArrayInternalV1(workSpec.output));
                interfaceC1161g.H(7, workSpec.initialDelay);
                interfaceC1161g.H(8, workSpec.intervalDuration);
                interfaceC1161g.H(9, workSpec.flexDuration);
                interfaceC1161g.H(10, workSpec.runAttemptCount);
                interfaceC1161g.H(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                interfaceC1161g.H(12, workSpec.backoffDelayDuration);
                interfaceC1161g.H(13, workSpec.lastEnqueueTime);
                interfaceC1161g.H(14, workSpec.minimumRetentionDuration);
                interfaceC1161g.H(15, workSpec.scheduleRequestedAt);
                interfaceC1161g.H(16, workSpec.expedited ? 1L : 0L);
                interfaceC1161g.H(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                interfaceC1161g.H(18, workSpec.getPeriodCount());
                interfaceC1161g.H(19, workSpec.getGeneration());
                interfaceC1161g.H(20, workSpec.getNextScheduleTimeOverride());
                interfaceC1161g.H(21, workSpec.getNextScheduleTimeOverrideGeneration());
                interfaceC1161g.H(22, workSpec.getStopReason());
                if (workSpec.getTraceTag() == null) {
                    interfaceC1161g.s(23);
                } else {
                    interfaceC1161g.m(23, workSpec.getTraceTag());
                }
                Constraints constraints = workSpec.constraints;
                interfaceC1161g.H(24, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                interfaceC1161g.N(25, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat$work_runtime_release()));
                interfaceC1161g.H(26, constraints.requiresCharging() ? 1L : 0L);
                interfaceC1161g.H(27, constraints.requiresDeviceIdle() ? 1L : 0L);
                interfaceC1161g.H(28, constraints.requiresBatteryNotLow() ? 1L : 0L);
                interfaceC1161g.H(29, constraints.requiresStorageNotLow() ? 1L : 0L);
                interfaceC1161g.H(30, constraints.getContentTriggerUpdateDelayMillis());
                interfaceC1161g.H(31, constraints.getContentTriggerMaxDelayMillis());
                interfaceC1161g.N(32, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
            }
        };
        this.__updateAdapterOfWorkSpec = new i(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(wVar);
                m.e(wVar, "database");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: bind(Lj2/g;Ljava/lang/Object;)V */
            @Override // androidx.room.i
            public void bind(InterfaceC1161g interfaceC1161g, WorkSpec workSpec) {
                interfaceC1161g.m(1, workSpec.id);
                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                interfaceC1161g.H(2, WorkTypeConverters.stateToInt(workSpec.state));
                interfaceC1161g.m(3, workSpec.workerClassName);
                interfaceC1161g.m(4, workSpec.inputMergerClassName);
                interfaceC1161g.N(5, Data.toByteArrayInternalV1(workSpec.input));
                interfaceC1161g.N(6, Data.toByteArrayInternalV1(workSpec.output));
                interfaceC1161g.H(7, workSpec.initialDelay);
                interfaceC1161g.H(8, workSpec.intervalDuration);
                interfaceC1161g.H(9, workSpec.flexDuration);
                interfaceC1161g.H(10, workSpec.runAttemptCount);
                interfaceC1161g.H(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                interfaceC1161g.H(12, workSpec.backoffDelayDuration);
                interfaceC1161g.H(13, workSpec.lastEnqueueTime);
                interfaceC1161g.H(14, workSpec.minimumRetentionDuration);
                interfaceC1161g.H(15, workSpec.scheduleRequestedAt);
                interfaceC1161g.H(16, workSpec.expedited ? 1L : 0L);
                interfaceC1161g.H(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                interfaceC1161g.H(18, workSpec.getPeriodCount());
                interfaceC1161g.H(19, workSpec.getGeneration());
                interfaceC1161g.H(20, workSpec.getNextScheduleTimeOverride());
                interfaceC1161g.H(21, workSpec.getNextScheduleTimeOverrideGeneration());
                interfaceC1161g.H(22, workSpec.getStopReason());
                if (workSpec.getTraceTag() == null) {
                    interfaceC1161g.s(23);
                } else {
                    interfaceC1161g.m(23, workSpec.getTraceTag());
                }
                Constraints constraints = workSpec.constraints;
                interfaceC1161g.H(24, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                interfaceC1161g.N(25, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat$work_runtime_release()));
                interfaceC1161g.H(26, constraints.requiresCharging() ? 1L : 0L);
                interfaceC1161g.H(27, constraints.requiresDeviceIdle() ? 1L : 0L);
                interfaceC1161g.H(28, constraints.requiresBatteryNotLow() ? 1L : 0L);
                interfaceC1161g.H(29, constraints.requiresStorageNotLow() ? 1L : 0L);
                interfaceC1161g.H(30, constraints.getContentTriggerUpdateDelayMillis());
                interfaceC1161g.H(31, constraints.getContentTriggerMaxDelayMillis());
                interfaceC1161g.N(32, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
                interfaceC1161g.m(33, workSpec.id);
            }
        };
        this.__preparedStmtOfDelete = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetState = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetCancelledState = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementPeriodCount = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetLastEnqueueTime = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetNextScheduleTimeOverride = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.14
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.15
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
        this.__preparedStmtOfIncrementGeneration = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.16
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetStopReason = new D(wVar) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.17
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // androidx.room.D
            public String createQuery() {
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            AbstractC1397A.y(map, new b(this, 1));
            return;
        }
        StringBuilder sbQ = S.q("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        AbstractC1918b.d(sbQ, size);
        sbQ.append(")");
        z zVarA = z.a(size, sbQ.toString());
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            zVarA.m(i, it.next());
            i++;
        }
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            int iQ = AbstractC0836n2.q(cursorB, "work_spec_id");
            if (iQ == -1) {
                return;
            }
            while (cursorB.moveToNext()) {
                ArrayList<Data> arrayList = map.get(cursorB.getString(iQ));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(cursorB.getBlob(0)));
                }
            }
        } finally {
            cursorB.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            AbstractC1397A.y(map, new b(this, 0));
            return;
        }
        StringBuilder sbQ = S.q("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        AbstractC1918b.d(sbQ, size);
        sbQ.append(")");
        z zVarA = z.a(size, sbQ.toString());
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            zVarA.m(i, it.next());
            i++;
        }
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            int iQ = AbstractC0836n2.q(cursorB, "work_spec_id");
            if (iQ == -1) {
                return;
            }
            while (cursorB.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorB.getString(iQ));
                if (arrayList != null) {
                    arrayList.add(cursorB.getString(0));
                }
            }
        } finally {
            cursorB.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C1386y lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1(HashMap map) {
        __fetchRelationshipWorkProgressAsandroidxWorkData(map);
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C1386y lambda$__fetchRelationshipWorkTagAsjavaLangString$0(HashMap map) {
        __fetchRelationshipWorkTagAsjavaLangString(map);
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public int countNonFinishedContentUriTriggerWorkers() {
        z zVarA = z.a(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            return cursorB.moveToFirst() ? cursorB.getInt(0) : 0;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfDelete.acquire();
        interfaceC1161gAcquire.m(1, str);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfDelete.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i) throws Throwable {
        z zVar;
        int iR;
        int iR2;
        int iR3;
        int iR4;
        int iR5;
        int iR6;
        int iR7;
        int iR8;
        int iR9;
        int iR10;
        int iR11;
        int iR12;
        int iR13;
        int iR14;
        z zVarA = z.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        zVarA.H(1, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            iR = AbstractC0836n2.r(cursorB, "id");
            iR2 = AbstractC0836n2.r(cursorB, "state");
            iR3 = AbstractC0836n2.r(cursorB, "worker_class_name");
            iR4 = AbstractC0836n2.r(cursorB, "input_merger_class_name");
            iR5 = AbstractC0836n2.r(cursorB, "input");
            iR6 = AbstractC0836n2.r(cursorB, "output");
            iR7 = AbstractC0836n2.r(cursorB, "initial_delay");
            iR8 = AbstractC0836n2.r(cursorB, "interval_duration");
            iR9 = AbstractC0836n2.r(cursorB, "flex_duration");
            iR10 = AbstractC0836n2.r(cursorB, "run_attempt_count");
            iR11 = AbstractC0836n2.r(cursorB, "backoff_policy");
            iR12 = AbstractC0836n2.r(cursorB, "backoff_delay_duration");
            iR13 = AbstractC0836n2.r(cursorB, "last_enqueue_time");
            iR14 = AbstractC0836n2.r(cursorB, "minimum_retention_duration");
            zVar = zVarA;
        } catch (Throwable th) {
            th = th;
            zVar = zVarA;
        }
        try {
            int iR15 = AbstractC0836n2.r(cursorB, "schedule_requested_at");
            int iR16 = AbstractC0836n2.r(cursorB, "run_in_foreground");
            int iR17 = AbstractC0836n2.r(cursorB, "out_of_quota_policy");
            int iR18 = AbstractC0836n2.r(cursorB, "period_count");
            int iR19 = AbstractC0836n2.r(cursorB, "generation");
            int iR20 = AbstractC0836n2.r(cursorB, "next_schedule_time_override");
            int iR21 = AbstractC0836n2.r(cursorB, "next_schedule_time_override_generation");
            int iR22 = AbstractC0836n2.r(cursorB, "stop_reason");
            int iR23 = AbstractC0836n2.r(cursorB, "trace_tag");
            int iR24 = AbstractC0836n2.r(cursorB, "required_network_type");
            int iR25 = AbstractC0836n2.r(cursorB, "required_network_request");
            int iR26 = AbstractC0836n2.r(cursorB, "requires_charging");
            int iR27 = AbstractC0836n2.r(cursorB, "requires_device_idle");
            int iR28 = AbstractC0836n2.r(cursorB, "requires_battery_not_low");
            int iR29 = AbstractC0836n2.r(cursorB, "requires_storage_not_low");
            int iR30 = AbstractC0836n2.r(cursorB, "trigger_content_update_delay");
            int iR31 = AbstractC0836n2.r(cursorB, "trigger_max_content_delay");
            int iR32 = AbstractC0836n2.r(cursorB, "content_uri_triggers");
            int i7 = iR14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iR);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(iR2));
                String string2 = cursorB.getString(iR3);
                String string3 = cursorB.getString(iR4);
                Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(iR5));
                Data dataFromByteArray2 = Data.fromByteArray(cursorB.getBlob(iR6));
                long j = cursorB.getLong(iR7);
                long j7 = cursorB.getLong(iR8);
                long j8 = cursorB.getLong(iR9);
                int i8 = cursorB.getInt(iR10);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iR11));
                long j9 = cursorB.getLong(iR12);
                long j10 = cursorB.getLong(iR13);
                int i9 = i7;
                long j11 = cursorB.getLong(i9);
                int i10 = iR12;
                int i11 = iR15;
                long j12 = cursorB.getLong(i11);
                iR15 = i11;
                int i12 = iR16;
                boolean z5 = cursorB.getInt(i12) != 0;
                iR16 = i12;
                int i13 = iR17;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorB.getInt(i13));
                iR17 = i13;
                int i14 = iR18;
                int i15 = cursorB.getInt(i14);
                iR18 = i14;
                int i16 = iR19;
                int i17 = cursorB.getInt(i16);
                iR19 = i16;
                int i18 = iR20;
                long j13 = cursorB.getLong(i18);
                iR20 = i18;
                int i19 = iR21;
                int i20 = cursorB.getInt(i19);
                iR21 = i19;
                int i21 = iR22;
                int i22 = cursorB.getInt(i21);
                iR22 = i21;
                int i23 = iR23;
                String string4 = cursorB.isNull(i23) ? null : cursorB.getString(i23);
                iR23 = i23;
                int i24 = iR24;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorB.getInt(i24));
                iR24 = i24;
                int i25 = iR25;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i25));
                iR25 = i25;
                int i26 = iR26;
                boolean z6 = cursorB.getInt(i26) != 0;
                iR26 = i26;
                int i27 = iR27;
                boolean z7 = cursorB.getInt(i27) != 0;
                iR27 = i27;
                int i28 = iR28;
                boolean z8 = cursorB.getInt(i28) != 0;
                iR28 = i28;
                int i29 = iR29;
                boolean z9 = cursorB.getInt(i29) != 0;
                iR29 = i29;
                int i30 = iR30;
                long j14 = cursorB.getLong(i30);
                iR30 = i30;
                int i31 = iR31;
                long j15 = cursorB.getLong(i31);
                iR31 = i31;
                int i32 = iR32;
                iR32 = i32;
                arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j7, j8, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z6, z7, z8, z9, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i32))), i8, backoffPolicyIntToBackoffPolicy, j9, j10, j11, j12, z5, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j13, i20, i22, string4));
                iR12 = i10;
                i7 = i9;
            }
            cursorB.close();
            zVar.b();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            zVar.b();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        z zVarA = z.a(0, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        z zVarA = z.a(0, "SELECT id FROM workspec");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public G getAllWorkSpecIdsLiveData() {
        final z zVarA = z.a(0, "SELECT id FROM workspec");
        return this.__db.getInvalidationTracker().b(new String[]{"workspec"}, true, new Callable<List<String>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.18
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<String> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, false);
                    try {
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            arrayList.add(cursorB.getString(0));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        cursorB.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(int i) throws Throwable {
        z zVar;
        int iR;
        int iR2;
        int iR3;
        int iR4;
        int iR5;
        int iR6;
        int iR7;
        int iR8;
        int iR9;
        int iR10;
        int iR11;
        int iR12;
        int iR13;
        int iR14;
        z zVarA = z.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        zVarA.H(1, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            iR = AbstractC0836n2.r(cursorB, "id");
            iR2 = AbstractC0836n2.r(cursorB, "state");
            iR3 = AbstractC0836n2.r(cursorB, "worker_class_name");
            iR4 = AbstractC0836n2.r(cursorB, "input_merger_class_name");
            iR5 = AbstractC0836n2.r(cursorB, "input");
            iR6 = AbstractC0836n2.r(cursorB, "output");
            iR7 = AbstractC0836n2.r(cursorB, "initial_delay");
            iR8 = AbstractC0836n2.r(cursorB, "interval_duration");
            iR9 = AbstractC0836n2.r(cursorB, "flex_duration");
            iR10 = AbstractC0836n2.r(cursorB, "run_attempt_count");
            iR11 = AbstractC0836n2.r(cursorB, "backoff_policy");
            iR12 = AbstractC0836n2.r(cursorB, "backoff_delay_duration");
            iR13 = AbstractC0836n2.r(cursorB, "last_enqueue_time");
            iR14 = AbstractC0836n2.r(cursorB, "minimum_retention_duration");
            zVar = zVarA;
        } catch (Throwable th) {
            th = th;
            zVar = zVarA;
        }
        try {
            int iR15 = AbstractC0836n2.r(cursorB, "schedule_requested_at");
            int iR16 = AbstractC0836n2.r(cursorB, "run_in_foreground");
            int iR17 = AbstractC0836n2.r(cursorB, "out_of_quota_policy");
            int iR18 = AbstractC0836n2.r(cursorB, "period_count");
            int iR19 = AbstractC0836n2.r(cursorB, "generation");
            int iR20 = AbstractC0836n2.r(cursorB, "next_schedule_time_override");
            int iR21 = AbstractC0836n2.r(cursorB, "next_schedule_time_override_generation");
            int iR22 = AbstractC0836n2.r(cursorB, "stop_reason");
            int iR23 = AbstractC0836n2.r(cursorB, "trace_tag");
            int iR24 = AbstractC0836n2.r(cursorB, "required_network_type");
            int iR25 = AbstractC0836n2.r(cursorB, "required_network_request");
            int iR26 = AbstractC0836n2.r(cursorB, "requires_charging");
            int iR27 = AbstractC0836n2.r(cursorB, "requires_device_idle");
            int iR28 = AbstractC0836n2.r(cursorB, "requires_battery_not_low");
            int iR29 = AbstractC0836n2.r(cursorB, "requires_storage_not_low");
            int iR30 = AbstractC0836n2.r(cursorB, "trigger_content_update_delay");
            int iR31 = AbstractC0836n2.r(cursorB, "trigger_max_content_delay");
            int iR32 = AbstractC0836n2.r(cursorB, "content_uri_triggers");
            int i7 = iR14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iR);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(iR2));
                String string2 = cursorB.getString(iR3);
                String string3 = cursorB.getString(iR4);
                Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(iR5));
                Data dataFromByteArray2 = Data.fromByteArray(cursorB.getBlob(iR6));
                long j = cursorB.getLong(iR7);
                long j7 = cursorB.getLong(iR8);
                long j8 = cursorB.getLong(iR9);
                int i8 = cursorB.getInt(iR10);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iR11));
                long j9 = cursorB.getLong(iR12);
                long j10 = cursorB.getLong(iR13);
                int i9 = i7;
                long j11 = cursorB.getLong(i9);
                int i10 = iR12;
                int i11 = iR15;
                long j12 = cursorB.getLong(i11);
                iR15 = i11;
                int i12 = iR16;
                boolean z5 = cursorB.getInt(i12) != 0;
                iR16 = i12;
                int i13 = iR17;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorB.getInt(i13));
                iR17 = i13;
                int i14 = iR18;
                int i15 = cursorB.getInt(i14);
                iR18 = i14;
                int i16 = iR19;
                int i17 = cursorB.getInt(i16);
                iR19 = i16;
                int i18 = iR20;
                long j13 = cursorB.getLong(i18);
                iR20 = i18;
                int i19 = iR21;
                int i20 = cursorB.getInt(i19);
                iR21 = i19;
                int i21 = iR22;
                int i22 = cursorB.getInt(i21);
                iR22 = i21;
                int i23 = iR23;
                String string4 = cursorB.isNull(i23) ? null : cursorB.getString(i23);
                iR23 = i23;
                int i24 = iR24;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorB.getInt(i24));
                iR24 = i24;
                int i25 = iR25;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i25));
                iR25 = i25;
                int i26 = iR26;
                boolean z6 = cursorB.getInt(i26) != 0;
                iR26 = i26;
                int i27 = iR27;
                boolean z7 = cursorB.getInt(i27) != 0;
                iR27 = i27;
                int i28 = iR28;
                boolean z8 = cursorB.getInt(i28) != 0;
                iR28 = i28;
                int i29 = iR29;
                boolean z9 = cursorB.getInt(i29) != 0;
                iR29 = i29;
                int i30 = iR30;
                long j14 = cursorB.getLong(i30);
                iR30 = i30;
                int i31 = iR31;
                long j15 = cursorB.getLong(i31);
                iR31 = i31;
                int i32 = iR32;
                iR32 = i32;
                arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j7, j8, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z6, z7, z8, z9, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i32))), i8, backoffPolicyIntToBackoffPolicy, j9, j10, j11, j12, z5, outOfQuotaPolicyIntToOutOfQuotaPolicy, i15, i17, j13, i20, i22, string4));
                iR12 = i10;
                i7 = i9;
            }
            cursorB.close();
            zVar.b();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            zVar.b();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForSchedulingWithContentUris() throws Throwable {
        z zVar;
        z zVarA = z.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            int iR = AbstractC0836n2.r(cursorB, "id");
            int iR2 = AbstractC0836n2.r(cursorB, "state");
            int iR3 = AbstractC0836n2.r(cursorB, "worker_class_name");
            int iR4 = AbstractC0836n2.r(cursorB, "input_merger_class_name");
            int iR5 = AbstractC0836n2.r(cursorB, "input");
            int iR6 = AbstractC0836n2.r(cursorB, "output");
            int iR7 = AbstractC0836n2.r(cursorB, "initial_delay");
            int iR8 = AbstractC0836n2.r(cursorB, "interval_duration");
            int iR9 = AbstractC0836n2.r(cursorB, "flex_duration");
            int iR10 = AbstractC0836n2.r(cursorB, "run_attempt_count");
            int iR11 = AbstractC0836n2.r(cursorB, "backoff_policy");
            int iR12 = AbstractC0836n2.r(cursorB, "backoff_delay_duration");
            int iR13 = AbstractC0836n2.r(cursorB, "last_enqueue_time");
            int iR14 = AbstractC0836n2.r(cursorB, "minimum_retention_duration");
            zVar = zVarA;
            try {
                int iR15 = AbstractC0836n2.r(cursorB, "schedule_requested_at");
                int iR16 = AbstractC0836n2.r(cursorB, "run_in_foreground");
                int iR17 = AbstractC0836n2.r(cursorB, "out_of_quota_policy");
                int iR18 = AbstractC0836n2.r(cursorB, "period_count");
                int iR19 = AbstractC0836n2.r(cursorB, "generation");
                int iR20 = AbstractC0836n2.r(cursorB, "next_schedule_time_override");
                int iR21 = AbstractC0836n2.r(cursorB, "next_schedule_time_override_generation");
                int iR22 = AbstractC0836n2.r(cursorB, "stop_reason");
                int iR23 = AbstractC0836n2.r(cursorB, "trace_tag");
                int iR24 = AbstractC0836n2.r(cursorB, "required_network_type");
                int iR25 = AbstractC0836n2.r(cursorB, "required_network_request");
                int iR26 = AbstractC0836n2.r(cursorB, "requires_charging");
                int iR27 = AbstractC0836n2.r(cursorB, "requires_device_idle");
                int iR28 = AbstractC0836n2.r(cursorB, "requires_battery_not_low");
                int iR29 = AbstractC0836n2.r(cursorB, "requires_storage_not_low");
                int iR30 = AbstractC0836n2.r(cursorB, "trigger_content_update_delay");
                int iR31 = AbstractC0836n2.r(cursorB, "trigger_max_content_delay");
                int iR32 = AbstractC0836n2.r(cursorB, "content_uri_triggers");
                int i = iR14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iR);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(iR2));
                    String string2 = cursorB.getString(iR3);
                    String string3 = cursorB.getString(iR4);
                    Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(iR5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorB.getBlob(iR6));
                    long j = cursorB.getLong(iR7);
                    long j7 = cursorB.getLong(iR8);
                    long j8 = cursorB.getLong(iR9);
                    int i7 = cursorB.getInt(iR10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iR11));
                    long j9 = cursorB.getLong(iR12);
                    long j10 = cursorB.getLong(iR13);
                    int i8 = i;
                    long j11 = cursorB.getLong(i8);
                    int i9 = iR13;
                    int i10 = iR15;
                    long j12 = cursorB.getLong(i10);
                    iR15 = i10;
                    int i11 = iR16;
                    boolean z5 = cursorB.getInt(i11) != 0;
                    iR16 = i11;
                    int i12 = iR17;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorB.getInt(i12));
                    iR17 = i12;
                    int i13 = iR18;
                    int i14 = cursorB.getInt(i13);
                    iR18 = i13;
                    int i15 = iR19;
                    int i16 = cursorB.getInt(i15);
                    iR19 = i15;
                    int i17 = iR20;
                    long j13 = cursorB.getLong(i17);
                    iR20 = i17;
                    int i18 = iR21;
                    int i19 = cursorB.getInt(i18);
                    iR21 = i18;
                    int i20 = iR22;
                    int i21 = cursorB.getInt(i20);
                    iR22 = i20;
                    int i22 = iR23;
                    String string4 = cursorB.isNull(i22) ? null : cursorB.getString(i22);
                    iR23 = i22;
                    int i23 = iR24;
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorB.getInt(i23));
                    iR24 = i23;
                    int i24 = iR25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i24));
                    iR25 = i24;
                    int i25 = iR26;
                    boolean z6 = cursorB.getInt(i25) != 0;
                    iR26 = i25;
                    int i26 = iR27;
                    boolean z7 = cursorB.getInt(i26) != 0;
                    iR27 = i26;
                    int i27 = iR28;
                    boolean z8 = cursorB.getInt(i27) != 0;
                    iR28 = i27;
                    int i28 = iR29;
                    boolean z9 = cursorB.getInt(i28) != 0;
                    iR29 = i28;
                    int i29 = iR30;
                    long j14 = cursorB.getLong(i29);
                    iR30 = i29;
                    int i30 = iR31;
                    long j15 = cursorB.getLong(i30);
                    iR31 = i30;
                    int i31 = iR32;
                    iR32 = i31;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j7, j8, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z6, z7, z8, z9, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i31))), i7, backoffPolicyIntToBackoffPolicy, j9, j10, j11, j12, z5, outOfQuotaPolicyIntToOutOfQuotaPolicy, i14, i16, j13, i19, i21, string4));
                    iR13 = i9;
                    i = i8;
                }
                cursorB.close();
                zVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                zVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarA;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(String str) {
        z zVarA = z.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(Data.fromByteArray(cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(long j) throws Throwable {
        z zVar;
        int iR;
        int iR2;
        int iR3;
        int iR4;
        int iR5;
        int iR6;
        int iR7;
        int iR8;
        int iR9;
        int iR10;
        int iR11;
        int iR12;
        int iR13;
        int iR14;
        z zVarA = z.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        zVarA.H(1, j);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            iR = AbstractC0836n2.r(cursorB, "id");
            iR2 = AbstractC0836n2.r(cursorB, "state");
            iR3 = AbstractC0836n2.r(cursorB, "worker_class_name");
            iR4 = AbstractC0836n2.r(cursorB, "input_merger_class_name");
            iR5 = AbstractC0836n2.r(cursorB, "input");
            iR6 = AbstractC0836n2.r(cursorB, "output");
            iR7 = AbstractC0836n2.r(cursorB, "initial_delay");
            iR8 = AbstractC0836n2.r(cursorB, "interval_duration");
            iR9 = AbstractC0836n2.r(cursorB, "flex_duration");
            iR10 = AbstractC0836n2.r(cursorB, "run_attempt_count");
            iR11 = AbstractC0836n2.r(cursorB, "backoff_policy");
            iR12 = AbstractC0836n2.r(cursorB, "backoff_delay_duration");
            iR13 = AbstractC0836n2.r(cursorB, "last_enqueue_time");
            iR14 = AbstractC0836n2.r(cursorB, "minimum_retention_duration");
            zVar = zVarA;
        } catch (Throwable th) {
            th = th;
            zVar = zVarA;
        }
        try {
            int iR15 = AbstractC0836n2.r(cursorB, "schedule_requested_at");
            int iR16 = AbstractC0836n2.r(cursorB, "run_in_foreground");
            int iR17 = AbstractC0836n2.r(cursorB, "out_of_quota_policy");
            int iR18 = AbstractC0836n2.r(cursorB, "period_count");
            int iR19 = AbstractC0836n2.r(cursorB, "generation");
            int iR20 = AbstractC0836n2.r(cursorB, "next_schedule_time_override");
            int iR21 = AbstractC0836n2.r(cursorB, "next_schedule_time_override_generation");
            int iR22 = AbstractC0836n2.r(cursorB, "stop_reason");
            int iR23 = AbstractC0836n2.r(cursorB, "trace_tag");
            int iR24 = AbstractC0836n2.r(cursorB, "required_network_type");
            int iR25 = AbstractC0836n2.r(cursorB, "required_network_request");
            int iR26 = AbstractC0836n2.r(cursorB, "requires_charging");
            int iR27 = AbstractC0836n2.r(cursorB, "requires_device_idle");
            int iR28 = AbstractC0836n2.r(cursorB, "requires_battery_not_low");
            int iR29 = AbstractC0836n2.r(cursorB, "requires_storage_not_low");
            int iR30 = AbstractC0836n2.r(cursorB, "trigger_content_update_delay");
            int iR31 = AbstractC0836n2.r(cursorB, "trigger_max_content_delay");
            int iR32 = AbstractC0836n2.r(cursorB, "content_uri_triggers");
            int i = iR14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iR);
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(iR2));
                String string2 = cursorB.getString(iR3);
                String string3 = cursorB.getString(iR4);
                Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(iR5));
                Data dataFromByteArray2 = Data.fromByteArray(cursorB.getBlob(iR6));
                long j7 = cursorB.getLong(iR7);
                long j8 = cursorB.getLong(iR8);
                long j9 = cursorB.getLong(iR9);
                int i7 = cursorB.getInt(iR10);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iR11));
                long j10 = cursorB.getLong(iR12);
                long j11 = cursorB.getLong(iR13);
                int i8 = i;
                long j12 = cursorB.getLong(i8);
                int i9 = iR12;
                int i10 = iR15;
                long j13 = cursorB.getLong(i10);
                iR15 = i10;
                int i11 = iR16;
                boolean z5 = cursorB.getInt(i11) != 0;
                iR16 = i11;
                int i12 = iR17;
                OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorB.getInt(i12));
                iR17 = i12;
                int i13 = iR18;
                int i14 = cursorB.getInt(i13);
                iR18 = i13;
                int i15 = iR19;
                int i16 = cursorB.getInt(i15);
                iR19 = i15;
                int i17 = iR20;
                long j14 = cursorB.getLong(i17);
                iR20 = i17;
                int i18 = iR21;
                int i19 = cursorB.getInt(i18);
                iR21 = i18;
                int i20 = iR22;
                int i21 = cursorB.getInt(i20);
                iR22 = i20;
                int i22 = iR23;
                String string4 = cursorB.isNull(i22) ? null : cursorB.getString(i22);
                iR23 = i22;
                int i23 = iR24;
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorB.getInt(i23));
                iR24 = i23;
                int i24 = iR25;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i24));
                iR25 = i24;
                int i25 = iR26;
                boolean z6 = cursorB.getInt(i25) != 0;
                iR26 = i25;
                int i26 = iR27;
                boolean z7 = cursorB.getInt(i26) != 0;
                iR27 = i26;
                int i27 = iR28;
                boolean z8 = cursorB.getInt(i27) != 0;
                iR28 = i27;
                int i28 = iR29;
                boolean z9 = cursorB.getInt(i28) != 0;
                iR29 = i28;
                int i29 = iR30;
                long j15 = cursorB.getLong(i29);
                iR30 = i29;
                int i30 = iR31;
                long j16 = cursorB.getLong(i30);
                iR31 = i30;
                int i31 = iR32;
                iR32 = i31;
                arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j7, j8, j9, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z6, z7, z8, z9, j15, j16, WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i31))), i7, backoffPolicyIntToBackoffPolicy, j10, j11, j12, j13, z5, outOfQuotaPolicyIntToOutOfQuotaPolicy, i14, i16, j14, i19, i21, string4));
                iR12 = i9;
                i = i8;
            }
            cursorB.close();
            zVar.b();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            zVar.b();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() throws Throwable {
        z zVar;
        z zVarA = z.a(0, "SELECT * FROM workspec WHERE state=1");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            int iR = AbstractC0836n2.r(cursorB, "id");
            int iR2 = AbstractC0836n2.r(cursorB, "state");
            int iR3 = AbstractC0836n2.r(cursorB, "worker_class_name");
            int iR4 = AbstractC0836n2.r(cursorB, "input_merger_class_name");
            int iR5 = AbstractC0836n2.r(cursorB, "input");
            int iR6 = AbstractC0836n2.r(cursorB, "output");
            int iR7 = AbstractC0836n2.r(cursorB, "initial_delay");
            int iR8 = AbstractC0836n2.r(cursorB, "interval_duration");
            int iR9 = AbstractC0836n2.r(cursorB, "flex_duration");
            int iR10 = AbstractC0836n2.r(cursorB, "run_attempt_count");
            int iR11 = AbstractC0836n2.r(cursorB, "backoff_policy");
            int iR12 = AbstractC0836n2.r(cursorB, "backoff_delay_duration");
            int iR13 = AbstractC0836n2.r(cursorB, "last_enqueue_time");
            int iR14 = AbstractC0836n2.r(cursorB, "minimum_retention_duration");
            zVar = zVarA;
            try {
                int iR15 = AbstractC0836n2.r(cursorB, "schedule_requested_at");
                int iR16 = AbstractC0836n2.r(cursorB, "run_in_foreground");
                int iR17 = AbstractC0836n2.r(cursorB, "out_of_quota_policy");
                int iR18 = AbstractC0836n2.r(cursorB, "period_count");
                int iR19 = AbstractC0836n2.r(cursorB, "generation");
                int iR20 = AbstractC0836n2.r(cursorB, "next_schedule_time_override");
                int iR21 = AbstractC0836n2.r(cursorB, "next_schedule_time_override_generation");
                int iR22 = AbstractC0836n2.r(cursorB, "stop_reason");
                int iR23 = AbstractC0836n2.r(cursorB, "trace_tag");
                int iR24 = AbstractC0836n2.r(cursorB, "required_network_type");
                int iR25 = AbstractC0836n2.r(cursorB, "required_network_request");
                int iR26 = AbstractC0836n2.r(cursorB, "requires_charging");
                int iR27 = AbstractC0836n2.r(cursorB, "requires_device_idle");
                int iR28 = AbstractC0836n2.r(cursorB, "requires_battery_not_low");
                int iR29 = AbstractC0836n2.r(cursorB, "requires_storage_not_low");
                int iR30 = AbstractC0836n2.r(cursorB, "trigger_content_update_delay");
                int iR31 = AbstractC0836n2.r(cursorB, "trigger_max_content_delay");
                int iR32 = AbstractC0836n2.r(cursorB, "content_uri_triggers");
                int i = iR14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iR);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(iR2));
                    String string2 = cursorB.getString(iR3);
                    String string3 = cursorB.getString(iR4);
                    Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(iR5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorB.getBlob(iR6));
                    long j = cursorB.getLong(iR7);
                    long j7 = cursorB.getLong(iR8);
                    long j8 = cursorB.getLong(iR9);
                    int i7 = cursorB.getInt(iR10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iR11));
                    long j9 = cursorB.getLong(iR12);
                    long j10 = cursorB.getLong(iR13);
                    int i8 = i;
                    long j11 = cursorB.getLong(i8);
                    int i9 = iR13;
                    int i10 = iR15;
                    long j12 = cursorB.getLong(i10);
                    iR15 = i10;
                    int i11 = iR16;
                    boolean z5 = cursorB.getInt(i11) != 0;
                    iR16 = i11;
                    int i12 = iR17;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorB.getInt(i12));
                    iR17 = i12;
                    int i13 = iR18;
                    int i14 = cursorB.getInt(i13);
                    iR18 = i13;
                    int i15 = iR19;
                    int i16 = cursorB.getInt(i15);
                    iR19 = i15;
                    int i17 = iR20;
                    long j13 = cursorB.getLong(i17);
                    iR20 = i17;
                    int i18 = iR21;
                    int i19 = cursorB.getInt(i18);
                    iR21 = i18;
                    int i20 = iR22;
                    int i21 = cursorB.getInt(i20);
                    iR22 = i20;
                    int i22 = iR23;
                    String string4 = cursorB.isNull(i22) ? null : cursorB.getString(i22);
                    iR23 = i22;
                    int i23 = iR24;
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorB.getInt(i23));
                    iR24 = i23;
                    int i24 = iR25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i24));
                    iR25 = i24;
                    int i25 = iR26;
                    boolean z6 = cursorB.getInt(i25) != 0;
                    iR26 = i25;
                    int i26 = iR27;
                    boolean z7 = cursorB.getInt(i26) != 0;
                    iR27 = i26;
                    int i27 = iR28;
                    boolean z8 = cursorB.getInt(i27) != 0;
                    iR28 = i27;
                    int i28 = iR29;
                    boolean z9 = cursorB.getInt(i28) != 0;
                    iR29 = i28;
                    int i29 = iR30;
                    long j14 = cursorB.getLong(i29);
                    iR30 = i29;
                    int i30 = iR31;
                    long j15 = cursorB.getLong(i30);
                    iR31 = i30;
                    int i31 = iR32;
                    iR32 = i31;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j7, j8, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z6, z7, z8, z9, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i31))), i7, backoffPolicyIntToBackoffPolicy, j9, j10, j11, j12, z5, outOfQuotaPolicyIntToOutOfQuotaPolicy, i14, i16, j13, i19, i21, string4));
                    iR13 = i9;
                    i = i8;
                }
                cursorB.close();
                zVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                zVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarA;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public G getScheduleRequestedAtLiveData(String str) {
        final z zVarA = z.a(1, "SELECT schedule_requested_at FROM workspec WHERE id=?");
        zVarA.m(1, str);
        return this.__db.getInvalidationTracker().b(new String[]{"workspec"}, false, new Callable<Long>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.26
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Long call() {
                Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, false);
                try {
                    Long lValueOf = null;
                    if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                        lValueOf = Long.valueOf(cursorB.getLong(0));
                    }
                    return lValueOf;
                } finally {
                    cursorB.close();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() throws Throwable {
        z zVar;
        z zVarA = z.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            int iR = AbstractC0836n2.r(cursorB, "id");
            int iR2 = AbstractC0836n2.r(cursorB, "state");
            int iR3 = AbstractC0836n2.r(cursorB, "worker_class_name");
            int iR4 = AbstractC0836n2.r(cursorB, "input_merger_class_name");
            int iR5 = AbstractC0836n2.r(cursorB, "input");
            int iR6 = AbstractC0836n2.r(cursorB, "output");
            int iR7 = AbstractC0836n2.r(cursorB, "initial_delay");
            int iR8 = AbstractC0836n2.r(cursorB, "interval_duration");
            int iR9 = AbstractC0836n2.r(cursorB, "flex_duration");
            int iR10 = AbstractC0836n2.r(cursorB, "run_attempt_count");
            int iR11 = AbstractC0836n2.r(cursorB, "backoff_policy");
            int iR12 = AbstractC0836n2.r(cursorB, "backoff_delay_duration");
            int iR13 = AbstractC0836n2.r(cursorB, "last_enqueue_time");
            int iR14 = AbstractC0836n2.r(cursorB, "minimum_retention_duration");
            zVar = zVarA;
            try {
                int iR15 = AbstractC0836n2.r(cursorB, "schedule_requested_at");
                int iR16 = AbstractC0836n2.r(cursorB, "run_in_foreground");
                int iR17 = AbstractC0836n2.r(cursorB, "out_of_quota_policy");
                int iR18 = AbstractC0836n2.r(cursorB, "period_count");
                int iR19 = AbstractC0836n2.r(cursorB, "generation");
                int iR20 = AbstractC0836n2.r(cursorB, "next_schedule_time_override");
                int iR21 = AbstractC0836n2.r(cursorB, "next_schedule_time_override_generation");
                int iR22 = AbstractC0836n2.r(cursorB, "stop_reason");
                int iR23 = AbstractC0836n2.r(cursorB, "trace_tag");
                int iR24 = AbstractC0836n2.r(cursorB, "required_network_type");
                int iR25 = AbstractC0836n2.r(cursorB, "required_network_request");
                int iR26 = AbstractC0836n2.r(cursorB, "requires_charging");
                int iR27 = AbstractC0836n2.r(cursorB, "requires_device_idle");
                int iR28 = AbstractC0836n2.r(cursorB, "requires_battery_not_low");
                int iR29 = AbstractC0836n2.r(cursorB, "requires_storage_not_low");
                int iR30 = AbstractC0836n2.r(cursorB, "trigger_content_update_delay");
                int iR31 = AbstractC0836n2.r(cursorB, "trigger_max_content_delay");
                int iR32 = AbstractC0836n2.r(cursorB, "content_uri_triggers");
                int i = iR14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iR);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(iR2));
                    String string2 = cursorB.getString(iR3);
                    String string3 = cursorB.getString(iR4);
                    Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(iR5));
                    Data dataFromByteArray2 = Data.fromByteArray(cursorB.getBlob(iR6));
                    long j = cursorB.getLong(iR7);
                    long j7 = cursorB.getLong(iR8);
                    long j8 = cursorB.getLong(iR9);
                    int i7 = cursorB.getInt(iR10);
                    BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iR11));
                    long j9 = cursorB.getLong(iR12);
                    long j10 = cursorB.getLong(iR13);
                    int i8 = i;
                    long j11 = cursorB.getLong(i8);
                    int i9 = iR13;
                    int i10 = iR15;
                    long j12 = cursorB.getLong(i10);
                    iR15 = i10;
                    int i11 = iR16;
                    boolean z5 = cursorB.getInt(i11) != 0;
                    iR16 = i11;
                    int i12 = iR17;
                    OutOfQuotaPolicy outOfQuotaPolicyIntToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(cursorB.getInt(i12));
                    iR17 = i12;
                    int i13 = iR18;
                    int i14 = cursorB.getInt(i13);
                    iR18 = i13;
                    int i15 = iR19;
                    int i16 = cursorB.getInt(i15);
                    iR19 = i15;
                    int i17 = iR20;
                    long j13 = cursorB.getLong(i17);
                    iR20 = i17;
                    int i18 = iR21;
                    int i19 = cursorB.getInt(i18);
                    iR21 = i18;
                    int i20 = iR22;
                    int i21 = cursorB.getInt(i20);
                    iR22 = i20;
                    int i22 = iR23;
                    String string4 = cursorB.isNull(i22) ? null : cursorB.getString(i22);
                    iR23 = i22;
                    int i23 = iR24;
                    NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType(cursorB.getInt(i23));
                    iR24 = i23;
                    int i24 = iR25;
                    NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i24));
                    iR25 = i24;
                    int i25 = iR26;
                    boolean z6 = cursorB.getInt(i25) != 0;
                    iR26 = i25;
                    int i26 = iR27;
                    boolean z7 = cursorB.getInt(i26) != 0;
                    iR27 = i26;
                    int i27 = iR28;
                    boolean z8 = cursorB.getInt(i27) != 0;
                    iR28 = i27;
                    int i28 = iR29;
                    boolean z9 = cursorB.getInt(i28) != 0;
                    iR29 = i28;
                    int i29 = iR30;
                    long j14 = cursorB.getLong(i29);
                    iR30 = i29;
                    int i30 = iR31;
                    long j15 = cursorB.getLong(i30);
                    iR31 = i30;
                    int i31 = iR32;
                    iR32 = i31;
                    arrayList.add(new WorkSpec(string, stateIntToState, string2, string3, dataFromByteArray, dataFromByteArray2, j, j7, j8, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z6, z7, z8, z9, j14, j15, WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i31))), i7, backoffPolicyIntToBackoffPolicy, j9, j10, j11, j12, z5, outOfQuotaPolicyIntToOutOfQuotaPolicy, i14, i16, j13, i19, i21, string4));
                    iR13 = i9;
                    i = i8;
                }
                cursorB.close();
                zVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                zVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarA;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(String str) {
        z zVarA = z.a(1, "SELECT state FROM workspec WHERE id=?");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            WorkInfo.State stateIntToState = null;
            if (cursorB.moveToFirst()) {
                Integer numValueOf = cursorB.isNull(0) ? null : Integer.valueOf(cursorB.getInt(0));
                if (numValueOf != null) {
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    stateIntToState = WorkTypeConverters.intToState(numValueOf.intValue());
                }
            }
            return stateIntToState;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(String str) {
        z zVarA = z.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(String str) {
        z zVarA = z.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String str) throws Throwable {
        z zVar;
        z zVarA = z.a(1, "SELECT * FROM workspec WHERE id=?");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            int iR = AbstractC0836n2.r(cursorB, "id");
            int iR2 = AbstractC0836n2.r(cursorB, "state");
            int iR3 = AbstractC0836n2.r(cursorB, "worker_class_name");
            int iR4 = AbstractC0836n2.r(cursorB, "input_merger_class_name");
            int iR5 = AbstractC0836n2.r(cursorB, "input");
            int iR6 = AbstractC0836n2.r(cursorB, "output");
            int iR7 = AbstractC0836n2.r(cursorB, "initial_delay");
            int iR8 = AbstractC0836n2.r(cursorB, "interval_duration");
            int iR9 = AbstractC0836n2.r(cursorB, "flex_duration");
            int iR10 = AbstractC0836n2.r(cursorB, "run_attempt_count");
            int iR11 = AbstractC0836n2.r(cursorB, "backoff_policy");
            int iR12 = AbstractC0836n2.r(cursorB, "backoff_delay_duration");
            int iR13 = AbstractC0836n2.r(cursorB, "last_enqueue_time");
            int iR14 = AbstractC0836n2.r(cursorB, "minimum_retention_duration");
            zVar = zVarA;
            try {
                int iR15 = AbstractC0836n2.r(cursorB, "schedule_requested_at");
                int iR16 = AbstractC0836n2.r(cursorB, "run_in_foreground");
                int iR17 = AbstractC0836n2.r(cursorB, "out_of_quota_policy");
                int iR18 = AbstractC0836n2.r(cursorB, "period_count");
                int iR19 = AbstractC0836n2.r(cursorB, "generation");
                int iR20 = AbstractC0836n2.r(cursorB, "next_schedule_time_override");
                int iR21 = AbstractC0836n2.r(cursorB, "next_schedule_time_override_generation");
                int iR22 = AbstractC0836n2.r(cursorB, "stop_reason");
                int iR23 = AbstractC0836n2.r(cursorB, "trace_tag");
                int iR24 = AbstractC0836n2.r(cursorB, "required_network_type");
                int iR25 = AbstractC0836n2.r(cursorB, "required_network_request");
                int iR26 = AbstractC0836n2.r(cursorB, "requires_charging");
                int iR27 = AbstractC0836n2.r(cursorB, "requires_device_idle");
                int iR28 = AbstractC0836n2.r(cursorB, "requires_battery_not_low");
                int iR29 = AbstractC0836n2.r(cursorB, "requires_storage_not_low");
                int iR30 = AbstractC0836n2.r(cursorB, "trigger_content_update_delay");
                int iR31 = AbstractC0836n2.r(cursorB, "trigger_max_content_delay");
                int iR32 = AbstractC0836n2.r(cursorB, "content_uri_triggers");
                WorkSpec workSpec = null;
                if (cursorB.moveToFirst()) {
                    workSpec = new WorkSpec(cursorB.getString(iR), WorkTypeConverters.intToState(cursorB.getInt(iR2)), cursorB.getString(iR3), cursorB.getString(iR4), Data.fromByteArray(cursorB.getBlob(iR5)), Data.fromByteArray(cursorB.getBlob(iR6)), cursorB.getLong(iR7), cursorB.getLong(iR8), cursorB.getLong(iR9), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(iR25)), WorkTypeConverters.intToNetworkType(cursorB.getInt(iR24)), cursorB.getInt(iR26) != 0, cursorB.getInt(iR27) != 0, cursorB.getInt(iR28) != 0, cursorB.getInt(iR29) != 0, cursorB.getLong(iR30), cursorB.getLong(iR31), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(iR32))), cursorB.getInt(iR10), WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iR11)), cursorB.getLong(iR12), cursorB.getLong(iR13), cursorB.getLong(iR14), cursorB.getLong(iR15), cursorB.getInt(iR16) != 0, WorkTypeConverters.intToOutOfQuotaPolicy(cursorB.getInt(iR17)), cursorB.getInt(iR18), cursorB.getInt(iR19), cursorB.getLong(iR20), cursorB.getInt(iR21), cursorB.getInt(iR22), cursorB.isNull(iR23) ? null : cursorB.getString(iR23));
                }
                cursorB.close();
                zVar.b();
                return workSpec;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                zVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zVar = zVarA;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        z zVarA = z.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, zVarA, false);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(new WorkSpec.IdAndState(cursorB.getString(0), WorkTypeConverters.intToState(cursorB.getInt(1))));
            }
            return arrayList;
        } finally {
            cursorB.close();
            zVarA.b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public InterfaceC0397h getWorkStatusPojoFlowDataForIds(List<String> list) {
        StringBuilder sbQ = S.q("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        AbstractC1918b.d(sbQ, size);
        sbQ.append(")");
        final z zVarA = z.a(size, sbQ.toString());
        Iterator<String> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            zVarA.m(i, it.next());
            i++;
        }
        return g.a(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.20
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorB.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorB.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string3 = cursorB.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                            int i7 = cursorB.getInt(3);
                            int i8 = cursorB.getInt(4);
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i7, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i8, cursorB.getLong(21), cursorB.getInt(22), (ArrayList) map.get(cursorB.getString(0)), (ArrayList) map2.get(cursorB.getString(0))));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        cursorB.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public InterfaceC0397h getWorkStatusPojoFlowForName(String str) {
        final z zVarA = z.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        zVarA.m(1, str);
        return g.a(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.24
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorB.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorB.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string3 = cursorB.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                            int i = cursorB.getInt(3);
                            int i7 = cursorB.getInt(4);
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i7, cursorB.getLong(21), cursorB.getInt(22), (ArrayList) map.get(cursorB.getString(0)), (ArrayList) map2.get(cursorB.getString(0))));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        cursorB.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public InterfaceC0397h getWorkStatusPojoFlowForTag(String str) {
        final z zVarA = z.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
        zVarA.m(1, str);
        return g.a(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.21
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorB.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorB.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string3 = cursorB.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                            int i = cursorB.getInt(3);
                            int i7 = cursorB.getInt(4);
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i7, cursorB.getLong(21), cursorB.getInt(22), (ArrayList) map.get(cursorB.getString(0)), (ArrayList) map2.get(cursorB.getString(0))));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        cursorB.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        WorkSpec.WorkInfoPojo workInfoPojo;
        z zVarA = z.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor cursorB = d.B(this.__db, zVarA, true);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorB.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorB.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(map);
                __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                if (cursorB.moveToFirst()) {
                    String string3 = cursorB.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                    int i = cursorB.getInt(3);
                    int i7 = cursorB.getInt(4);
                    workInfoPojo = new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i7, cursorB.getLong(21), cursorB.getInt(22), map.get(cursorB.getString(0)), map2.get(cursorB.getString(0)));
                } else {
                    workInfoPojo = null;
                }
                this.__db.setTransactionSuccessful();
                cursorB.close();
                zVarA.b();
                return workInfoPojo;
            } catch (Throwable th) {
                cursorB.close();
                zVarA.b();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        StringBuilder sbQ = S.q("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        AbstractC1918b.d(sbQ, size);
        sbQ.append(")");
        z zVarA = z.a(size, sbQ.toString());
        Iterator<String> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            zVarA.m(i, it.next());
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor cursorB = d.B(this.__db, zVarA, true);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorB.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorB.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(map);
                __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(new WorkSpec.WorkInfoPojo(cursorB.getString(0), WorkTypeConverters.intToState(cursorB.getInt(1)), Data.fromByteArray(cursorB.getBlob(2)), cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), cursorB.getInt(3), WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), cursorB.getInt(4), cursorB.getLong(21), cursorB.getInt(22), map.get(cursorB.getString(0)), map2.get(cursorB.getString(0))));
                }
                this.__db.setTransactionSuccessful();
                cursorB.close();
                zVarA.b();
                return arrayList;
            } catch (Throwable th) {
                cursorB.close();
                zVarA.b();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        z zVarA = z.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor cursorB = d.B(this.__db, zVarA, true);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorB.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorB.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(map);
                __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string3 = cursorB.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                    int i = cursorB.getInt(3);
                    int i7 = cursorB.getInt(4);
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i7, cursorB.getLong(21), cursorB.getInt(22), map.get(cursorB.getString(0)), map2.get(cursorB.getString(0))));
                }
                this.__db.setTransactionSuccessful();
                cursorB.close();
                zVarA.b();
                return arrayList;
            } catch (Throwable th) {
                cursorB.close();
                zVarA.b();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        z zVarA = z.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
        zVarA.m(1, str);
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor cursorB = d.B(this.__db, zVarA, true);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorB.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorB.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(map);
                __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string3 = cursorB.getString(0);
                    WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                    Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                    int i = cursorB.getInt(3);
                    int i7 = cursorB.getInt(4);
                    arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i7, cursorB.getLong(21), cursorB.getInt(22), map.get(cursorB.getString(0)), map2.get(cursorB.getString(0))));
                }
                this.__db.setTransactionSuccessful();
                cursorB.close();
                zVarA.b();
                return arrayList;
            } catch (Throwable th) {
                cursorB.close();
                zVarA.b();
                throw th;
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public G getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder sbQ = S.q("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        AbstractC1918b.d(sbQ, size);
        sbQ.append(")");
        final z zVarA = z.a(size, sbQ.toString());
        Iterator<String> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            zVarA.m(i, it.next());
            i++;
        }
        return this.__db.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.19
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorB.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorB.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string3 = cursorB.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                            int i7 = cursorB.getInt(3);
                            int i8 = cursorB.getInt(4);
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i7, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i8, cursorB.getLong(21), cursorB.getInt(22), (ArrayList) map.get(cursorB.getString(0)), (ArrayList) map2.get(cursorB.getString(0))));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        cursorB.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public G getWorkStatusPojoLiveDataForName(String str) {
        final z zVarA = z.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        zVarA.m(1, str);
        return this.__db.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.23
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorB.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorB.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string3 = cursorB.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                            int i = cursorB.getInt(3);
                            int i7 = cursorB.getInt(4);
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i7, cursorB.getLong(21), cursorB.getInt(22), (ArrayList) map.get(cursorB.getString(0)), (ArrayList) map2.get(cursorB.getString(0))));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        cursorB.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public G getWorkStatusPojoLiveDataForTag(String str) {
        final z zVarA = z.a(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
        zVarA.m(1, str);
        return this.__db.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.22
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorB.moveToNext()) {
                            String string = cursorB.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorB.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorB.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string3 = cursorB.getString(0);
                            WorkInfo.State stateIntToState = WorkTypeConverters.intToState(cursorB.getInt(1));
                            Data dataFromByteArray = Data.fromByteArray(cursorB.getBlob(2));
                            int i = cursorB.getInt(3);
                            int i7 = cursorB.getInt(4);
                            arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(6)), WorkTypeConverters.intToNetworkType(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(13))), i, WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i7, cursorB.getLong(21), cursorB.getInt(22), (ArrayList) map.get(cursorB.getString(0)), (ArrayList) map2.get(cursorB.getString(0))));
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        cursorB.close();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorB.close();
                        throw th;
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public InterfaceC0397h hasUnfinishedWorkFlow() {
        final z zVarA = z.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        return g.a(this.__db, false, new String[]{"workspec"}, new Callable<Boolean>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.25
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public void finalize() {
                zVarA.b();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                Boolean boolValueOf;
                Cursor cursorB = d.B(WorkSpecDao_Impl.this.__db, zVarA, false);
                try {
                    if (cursorB.moveToFirst()) {
                        boolValueOf = Boolean.valueOf(cursorB.getInt(0) != 0);
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    cursorB.close();
                    return boolValueOf;
                } catch (Throwable th) {
                    cursorB.close();
                    throw th;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfIncrementGeneration.acquire();
        interfaceC1161gAcquire.m(1, str);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfIncrementGeneration.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfIncrementPeriodCount.acquire();
        interfaceC1161gAcquire.m(1, str);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfIncrementPeriodCount.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        interfaceC1161gAcquire.m(1, str);
        try {
            this.__db.beginTransaction();
            try {
                int iQ = interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
                return iQ;
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        interfaceC1161gAcquire.H(1, j);
        interfaceC1161gAcquire.m(2, str);
        try {
            this.__db.beginTransaction();
            try {
                int iQ = interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
                return iQ;
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfMarkWorkSpecScheduled.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfResetScheduledState.acquire();
        try {
            this.__db.beginTransaction();
            try {
                int iQ = interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
                return iQ;
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfResetScheduledState.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void resetWorkSpecNextScheduleTimeOverride(String str, int i) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride.acquire();
        interfaceC1161gAcquire.m(1, str);
        interfaceC1161gAcquire.H(2, i);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfResetWorkSpecNextScheduleTimeOverride.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        interfaceC1161gAcquire.m(1, str);
        try {
            this.__db.beginTransaction();
            try {
                int iQ = interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
                return iQ;
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public int setCancelledState(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfSetCancelledState.acquire();
        interfaceC1161gAcquire.m(1, str);
        try {
            this.__db.beginTransaction();
            try {
                int iQ = interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
                return iQ;
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfSetCancelledState.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueueTime(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfSetLastEnqueueTime.acquire();
        interfaceC1161gAcquire.H(1, j);
        interfaceC1161gAcquire.m(2, str);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfSetLastEnqueueTime.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void setNextScheduleTimeOverride(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfSetNextScheduleTimeOverride.acquire();
        interfaceC1161gAcquire.H(1, j);
        interfaceC1161gAcquire.m(2, str);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfSetNextScheduleTimeOverride.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String str, Data data) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfSetOutput.acquire();
        interfaceC1161gAcquire.N(1, Data.toByteArrayInternalV1(data));
        interfaceC1161gAcquire.m(2, str);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfSetOutput.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(WorkInfo.State state, String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfSetState.acquire();
        interfaceC1161gAcquire.H(1, WorkTypeConverters.stateToInt(state));
        interfaceC1161gAcquire.m(2, str);
        try {
            this.__db.beginTransaction();
            try {
                int iQ = interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
                return iQ;
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfSetState.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void setStopReason(String str, int i) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1161g interfaceC1161gAcquire = this.__preparedStmtOfSetStopReason.acquire();
        interfaceC1161gAcquire.H(1, i);
        interfaceC1161gAcquire.m(2, str);
        try {
            this.__db.beginTransaction();
            try {
                interfaceC1161gAcquire.q();
                this.__db.setTransactionSuccessful();
            } finally {
                this.__db.endTransaction();
            }
        } finally {
            this.__preparedStmtOfSetStopReason.release(interfaceC1161gAcquire);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfWorkSpec.handle(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
