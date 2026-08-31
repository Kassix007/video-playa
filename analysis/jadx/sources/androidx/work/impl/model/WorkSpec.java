package androidx.work.impl.model;

import C0.S;
import C0.Z0;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k1.i;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import p.InterfaceC1426a;

/* JADX INFO: loaded from: classes.dex */
public final class WorkSpec {
    public static final Companion Companion = new Companion(null);
    public static final long SCHEDULE_NOT_REQUESTED_YET = -1;
    private static final String TAG;
    public static final InterfaceC1426a WORK_INFO_MAPPER;
    public long backoffDelayDuration;
    public BackoffPolicy backoffPolicy;
    public Constraints constraints;
    public boolean expedited;
    public long flexDuration;
    private final int generation;
    public final String id;
    public long initialDelay;
    public Data input;
    public String inputMergerClassName;
    public long intervalDuration;
    public long lastEnqueueTime;
    public long minimumRetentionDuration;
    private long nextScheduleTimeOverride;
    private int nextScheduleTimeOverrideGeneration;
    public OutOfQuotaPolicy outOfQuotaPolicy;
    public Data output;
    private int periodCount;
    public int runAttemptCount;
    public long scheduleRequestedAt;
    public WorkInfo.State state;
    private final int stopReason;
    private String traceTag;
    public String workerClassName;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.impl.model.WorkSpec.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long calculateNextRunTime(boolean z5, int i, BackoffPolicy backoffPolicy, long j, long j7, int i7, boolean z6, long j8, long j9, long j10, long j11) {
            m.e(backoffPolicy, "backoffPolicy");
            if (j11 != Long.MAX_VALUE && z6) {
                if (i7 != 0) {
                    long j12 = j7 + PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
                    if (j11 < j12) {
                        return j12;
                    }
                }
                return j11;
            }
            if (z5) {
                long jScalb = backoffPolicy == BackoffPolicy.LINEAR ? j * ((long) i) : (long) Math.scalb(j, i - 1);
                if (jScalb > WorkRequest.MAX_BACKOFF_MILLIS) {
                    jScalb = 18000000;
                }
                return j7 + jScalb;
            }
            if (z6) {
                long j13 = i7 == 0 ? j7 + j8 : j7 + j10;
                return (j9 == j10 || i7 != 0) ? j13 : (j10 - j9) + j13;
            }
            if (j7 == -1) {
                return Long.MAX_VALUE;
            }
            return j7 + j8;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static final class IdAndState {
        public String id;
        public WorkInfo.State state;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public IdAndState(String id, WorkInfo.State state) {
            m.e(id, "id");
            m.e(state, "state");
            this.id = id;
            this.state = state;
        }

        public static /* synthetic */ IdAndState copy$default(IdAndState idAndState, String str, WorkInfo.State state, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idAndState.id;
            }
            if ((i & 2) != 0) {
                state = idAndState.state;
            }
            return idAndState.copy(str, state);
        }

        public final String component1() {
            return this.id;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final IdAndState copy(String id, WorkInfo.State state) {
            m.e(id, "id");
            m.e(state, "state");
            return new IdAndState(id, state);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            return m.a(this.id, idAndState.id) && this.state == idAndState.state;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return "IdAndState(id=" + this.id + ", state=" + this.state + ')';
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkSpec");
        m.d(strTagWithPrefix, "tagWithPrefix(\"WorkSpec\")");
        TAG = strTagWithPrefix;
        WORK_INFO_MAPPER = new Z0(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WorkSpec(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j, long j7, long j8, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, long j11, long j12, boolean z5, OutOfQuotaPolicy outOfQuotaPolicy, int i7, int i8, long j13, int i9, int i10, String str) {
        m.e(id, "id");
        m.e(state, "state");
        m.e(workerClassName, "workerClassName");
        m.e(inputMergerClassName, "inputMergerClassName");
        m.e(input, "input");
        m.e(output, "output");
        m.e(constraints, "constraints");
        m.e(backoffPolicy, "backoffPolicy");
        m.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.id = id;
        this.state = state;
        this.workerClassName = workerClassName;
        this.inputMergerClassName = inputMergerClassName;
        this.input = input;
        this.output = output;
        this.initialDelay = j;
        this.intervalDuration = j7;
        this.flexDuration = j8;
        this.constraints = constraints;
        this.runAttemptCount = i;
        this.backoffPolicy = backoffPolicy;
        this.backoffDelayDuration = j9;
        this.lastEnqueueTime = j10;
        this.minimumRetentionDuration = j11;
        this.scheduleRequestedAt = j12;
        this.expedited = z5;
        this.outOfQuotaPolicy = outOfQuotaPolicy;
        this.periodCount = i7;
        this.generation = i8;
        this.nextScheduleTimeOverride = j13;
        this.nextScheduleTimeOverrideGeneration = i9;
        this.stopReason = i10;
        this.traceTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final List WORK_INFO_MAPPER$lambda$1(List list) {
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(n5.m.c0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkInfoPojo) it.next()).toWorkInfo());
        }
        return arrayList;
    }

    public static /* synthetic */ WorkSpec copy$default(WorkSpec workSpec, String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j7, long j8, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, long j11, long j12, boolean z5, OutOfQuotaPolicy outOfQuotaPolicy, int i7, int i8, long j13, int i9, int i10, String str4, int i11, Object obj) {
        String str5;
        int i12;
        BackoffPolicy backoffPolicy2;
        long j14;
        long j15;
        long j16;
        long j17;
        OutOfQuotaPolicy outOfQuotaPolicy2;
        int i13;
        int i14;
        long j18;
        WorkInfo.State state2;
        int i15;
        boolean z6;
        String str6;
        String str7;
        Data data3;
        Data data4;
        long j19;
        long j20;
        long j21;
        Constraints constraints2;
        int i16;
        String str8 = (i11 & 1) != 0 ? workSpec.id : str;
        WorkInfo.State state3 = (i11 & 2) != 0 ? workSpec.state : state;
        String str9 = (i11 & 4) != 0 ? workSpec.workerClassName : str2;
        String str10 = (i11 & 8) != 0 ? workSpec.inputMergerClassName : str3;
        Data data5 = (i11 & 16) != 0 ? workSpec.input : data;
        Data data6 = (i11 & 32) != 0 ? workSpec.output : data2;
        long j22 = (i11 & 64) != 0 ? workSpec.initialDelay : j;
        long j23 = (i11 & 128) != 0 ? workSpec.intervalDuration : j7;
        long j24 = (i11 & 256) != 0 ? workSpec.flexDuration : j8;
        Constraints constraints3 = (i11 & 512) != 0 ? workSpec.constraints : constraints;
        int i17 = (i11 & 1024) != 0 ? workSpec.runAttemptCount : i;
        String str11 = str8;
        BackoffPolicy backoffPolicy3 = (i11 & 2048) != 0 ? workSpec.backoffPolicy : backoffPolicy;
        WorkInfo.State state4 = state3;
        long j25 = (i11 & 4096) != 0 ? workSpec.backoffDelayDuration : j9;
        long j26 = (i11 & 8192) != 0 ? workSpec.lastEnqueueTime : j10;
        long j27 = (i11 & 16384) != 0 ? workSpec.minimumRetentionDuration : j11;
        long j28 = (i11 & 32768) != 0 ? workSpec.scheduleRequestedAt : j12;
        boolean z7 = (i11 & 65536) != 0 ? workSpec.expedited : z5;
        long j29 = j28;
        OutOfQuotaPolicy outOfQuotaPolicy3 = (i11 & 131072) != 0 ? workSpec.outOfQuotaPolicy : outOfQuotaPolicy;
        int i18 = (i11 & 262144) != 0 ? workSpec.periodCount : i7;
        OutOfQuotaPolicy outOfQuotaPolicy4 = outOfQuotaPolicy3;
        int i19 = (i11 & 524288) != 0 ? workSpec.generation : i8;
        int i20 = i18;
        long j30 = (i11 & 1048576) != 0 ? workSpec.nextScheduleTimeOverride : j13;
        int i21 = (i11 & 2097152) != 0 ? workSpec.nextScheduleTimeOverrideGeneration : i9;
        int i22 = (i11 & 4194304) != 0 ? workSpec.stopReason : i10;
        if ((i11 & 8388608) != 0) {
            i12 = i21;
            str5 = workSpec.traceTag;
            j14 = j25;
            j15 = j26;
            j16 = j27;
            j17 = j29;
            outOfQuotaPolicy2 = outOfQuotaPolicy4;
            i13 = i20;
            i14 = i19;
            j18 = j30;
            state2 = state4;
            i15 = i22;
            z6 = z7;
            str6 = str9;
            str7 = str10;
            data3 = data5;
            data4 = data6;
            j19 = j22;
            j20 = j23;
            j21 = j24;
            constraints2 = constraints3;
            i16 = i17;
            backoffPolicy2 = backoffPolicy3;
        } else {
            str5 = str4;
            i12 = i21;
            backoffPolicy2 = backoffPolicy3;
            j14 = j25;
            j15 = j26;
            j16 = j27;
            j17 = j29;
            outOfQuotaPolicy2 = outOfQuotaPolicy4;
            i13 = i20;
            i14 = i19;
            j18 = j30;
            state2 = state4;
            i15 = i22;
            z6 = z7;
            str6 = str9;
            str7 = str10;
            data3 = data5;
            data4 = data6;
            j19 = j22;
            j20 = j23;
            j21 = j24;
            constraints2 = constraints3;
            i16 = i17;
        }
        return workSpec.copy(str11, state2, str6, str7, data3, data4, j19, j20, j21, constraints2, i16, backoffPolicy2, j14, j15, j16, j17, z6, outOfQuotaPolicy2, i13, i14, j18, i12, i15, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long calculateNextRunTime() {
        return Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
    }

    public final String component1() {
        return this.id;
    }

    public final Constraints component10() {
        return this.constraints;
    }

    public final int component11() {
        return this.runAttemptCount;
    }

    public final BackoffPolicy component12() {
        return this.backoffPolicy;
    }

    public final long component13() {
        return this.backoffDelayDuration;
    }

    public final long component14() {
        return this.lastEnqueueTime;
    }

    public final long component15() {
        return this.minimumRetentionDuration;
    }

    public final long component16() {
        return this.scheduleRequestedAt;
    }

    public final boolean component17() {
        return this.expedited;
    }

    public final OutOfQuotaPolicy component18() {
        return this.outOfQuotaPolicy;
    }

    public final int component19() {
        return this.periodCount;
    }

    public final WorkInfo.State component2() {
        return this.state;
    }

    public final int component20() {
        return this.generation;
    }

    public final long component21() {
        return this.nextScheduleTimeOverride;
    }

    public final int component22() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    public final int component23() {
        return this.stopReason;
    }

    public final String component24() {
        return this.traceTag;
    }

    public final String component3() {
        return this.workerClassName;
    }

    public final String component4() {
        return this.inputMergerClassName;
    }

    public final Data component5() {
        return this.input;
    }

    public final Data component6() {
        return this.output;
    }

    public final long component7() {
        return this.initialDelay;
    }

    public final long component8() {
        return this.intervalDuration;
    }

    public final long component9() {
        return this.flexDuration;
    }

    public final WorkSpec copy(String id, WorkInfo.State state, String workerClassName, String inputMergerClassName, Data input, Data output, long j, long j7, long j8, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, long j11, long j12, boolean z5, OutOfQuotaPolicy outOfQuotaPolicy, int i7, int i8, long j13, int i9, int i10, String str) {
        m.e(id, "id");
        m.e(state, "state");
        m.e(workerClassName, "workerClassName");
        m.e(inputMergerClassName, "inputMergerClassName");
        m.e(input, "input");
        m.e(output, "output");
        m.e(constraints, "constraints");
        m.e(backoffPolicy, "backoffPolicy");
        m.e(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new WorkSpec(id, state, workerClassName, inputMergerClassName, input, output, j, j7, j8, constraints, i, backoffPolicy, j9, j10, j11, j12, z5, outOfQuotaPolicy, i7, i8, j13, i9, i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkSpec)) {
            return false;
        }
        WorkSpec workSpec = (WorkSpec) obj;
        return m.a(this.id, workSpec.id) && this.state == workSpec.state && m.a(this.workerClassName, workSpec.workerClassName) && m.a(this.inputMergerClassName, workSpec.inputMergerClassName) && m.a(this.input, workSpec.input) && m.a(this.output, workSpec.output) && this.initialDelay == workSpec.initialDelay && this.intervalDuration == workSpec.intervalDuration && this.flexDuration == workSpec.flexDuration && m.a(this.constraints, workSpec.constraints) && this.runAttemptCount == workSpec.runAttemptCount && this.backoffPolicy == workSpec.backoffPolicy && this.backoffDelayDuration == workSpec.backoffDelayDuration && this.lastEnqueueTime == workSpec.lastEnqueueTime && this.minimumRetentionDuration == workSpec.minimumRetentionDuration && this.scheduleRequestedAt == workSpec.scheduleRequestedAt && this.expedited == workSpec.expedited && this.outOfQuotaPolicy == workSpec.outOfQuotaPolicy && this.periodCount == workSpec.periodCount && this.generation == workSpec.generation && this.nextScheduleTimeOverride == workSpec.nextScheduleTimeOverride && this.nextScheduleTimeOverrideGeneration == workSpec.nextScheduleTimeOverrideGeneration && this.stopReason == workSpec.stopReason && m.a(this.traceTag, workSpec.traceTag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getNextScheduleTimeOverride() {
        return this.nextScheduleTimeOverride;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getNextScheduleTimeOverrideGeneration() {
        return this.nextScheduleTimeOverrideGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getPeriodCount() {
        return this.periodCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTraceTag() {
        return this.traceTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean hasConstraints() {
        return !m.a(Constraints.NONE, this.constraints);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iC = i.c(this.stopReason, i.c(this.nextScheduleTimeOverrideGeneration, i.d(i.c(this.generation, i.c(this.periodCount, (this.outOfQuotaPolicy.hashCode() + i.e(i.d(i.d(i.d(i.d((this.backoffPolicy.hashCode() + i.c(this.runAttemptCount, (this.constraints.hashCode() + i.d(i.d(i.d((this.output.hashCode() + ((this.input.hashCode() + S.h(this.inputMergerClassName, S.h(this.workerClassName, (this.state.hashCode() + (this.id.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31, 31, this.initialDelay), 31, this.intervalDuration), 31, this.flexDuration)) * 31, 31)) * 31, 31, this.backoffDelayDuration), 31, this.lastEnqueueTime), 31, this.minimumRetentionDuration), 31, this.scheduleRequestedAt), 31, this.expedited)) * 31, 31), 31), 31, this.nextScheduleTimeOverride), 31), 31);
        String str = this.traceTag;
        return iC + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isBackedOff() {
        return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isPeriodic() {
        return this.intervalDuration != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setBackoffDelayDuration(long j) {
        if (j > WorkRequest.MAX_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value");
        }
        if (j < WorkRequest.MIN_BACKOFF_MILLIS) {
            Logger.get().warning(TAG, "Backoff delay duration less than minimum value");
        }
        this.backoffDelayDuration = D5.a.r(j, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setNextScheduleTimeOverride(long j) {
        this.nextScheduleTimeOverride = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setNextScheduleTimeOverrideGeneration(int i) {
        this.nextScheduleTimeOverrideGeneration = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPeriodCount(int i) {
        this.periodCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPeriodic(long j) {
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j7 = j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS ? 900000L : j;
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            j = 900000;
        }
        setPeriodic(j7, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTraceTag(String str) {
        this.traceTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return S.p(new StringBuilder("{WorkSpec: "), this.id, '}');
    }

    public final void setPeriodic(long j, long j7) {
        long j8 = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
        if (j < PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            Logger.get().warning(TAG, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        if (j >= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
            j8 = j;
        }
        this.intervalDuration = j8;
        if (j7 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            Logger.get().warning(TAG, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j7 > this.intervalDuration) {
            Logger.get().warning(TAG, "Flex duration greater than interval duration; Changed to " + j);
        }
        this.flexDuration = D5.a.r(j7, PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS, this.intervalDuration);
    }

    public static final class WorkInfoPojo {
        private long backoffDelayDuration;
        private BackoffPolicy backoffPolicy;
        private final Constraints constraints;
        private final long flexDuration;
        private final int generation;
        private final String id;
        private final long initialDelay;
        private final long intervalDuration;
        private long lastEnqueueTime;
        private final long nextScheduleTimeOverride;
        private final Data output;
        private int periodCount;
        private final List<Data> progress;
        private final int runAttemptCount;
        private final WorkInfo.State state;
        private final int stopReason;
        private final List<String> tags;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public WorkInfoPojo(String id, WorkInfo.State state, Data output, long j, long j7, long j8, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, int i7, int i8, long j11, int i9, List<String> tags, List<Data> progress) {
            m.e(id, "id");
            m.e(state, "state");
            m.e(output, "output");
            m.e(constraints, "constraints");
            m.e(backoffPolicy, "backoffPolicy");
            m.e(tags, "tags");
            m.e(progress, "progress");
            this.id = id;
            this.state = state;
            this.output = output;
            this.initialDelay = j;
            this.intervalDuration = j7;
            this.flexDuration = j8;
            this.constraints = constraints;
            this.runAttemptCount = i;
            this.backoffPolicy = backoffPolicy;
            this.backoffDelayDuration = j9;
            this.lastEnqueueTime = j10;
            this.periodCount = i7;
            this.generation = i8;
            this.nextScheduleTimeOverride = j11;
            this.stopReason = i9;
            this.tags = tags;
            this.progress = progress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final long calculateNextRunTimeMillis() {
            if (this.state == WorkInfo.State.ENQUEUED) {
                return WorkSpec.Companion.calculateNextRunTime(isBackedOff(), this.runAttemptCount, this.backoffPolicy, this.backoffDelayDuration, this.lastEnqueueTime, this.periodCount, isPeriodic(), this.initialDelay, this.flexDuration, this.intervalDuration, this.nextScheduleTimeOverride);
            }
            return Long.MAX_VALUE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: androidx.work.impl.model.WorkSpec$WorkInfoPojo */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WorkInfoPojo copy$default(WorkInfoPojo workInfoPojo, String str, WorkInfo.State state, Data data, long j, long j7, long j8, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, int i7, int i8, long j11, int i9, List list, List list2, int i10, Object obj) {
            String str2 = (i10 & 1) != 0 ? workInfoPojo.id : str;
            WorkInfo.State state2 = (i10 & 2) != 0 ? workInfoPojo.state : state;
            return workInfoPojo.copy(str2, state2, (i10 & 4) != 0 ? workInfoPojo.output : data, (i10 & 8) != 0 ? workInfoPojo.initialDelay : j, (i10 & 16) != 0 ? workInfoPojo.intervalDuration : j7, (i10 & 32) != 0 ? workInfoPojo.flexDuration : j8, (i10 & 64) != 0 ? workInfoPojo.constraints : constraints, (i10 & 128) != 0 ? workInfoPojo.runAttemptCount : i, (i10 & 256) != 0 ? workInfoPojo.backoffPolicy : backoffPolicy, (i10 & 512) != 0 ? workInfoPojo.backoffDelayDuration : j9, (i10 & 1024) != 0 ? workInfoPojo.lastEnqueueTime : j10, (i10 & 2048) != 0 ? workInfoPojo.periodCount : i7, (i10 & 4096) != 0 ? workInfoPojo.generation : i8, (i10 & 8192) != 0 ? workInfoPojo.nextScheduleTimeOverride : j11, (i10 & 16384) != 0 ? workInfoPojo.stopReason : i9, (32768 & i10) != 0 ? workInfoPojo.tags : list, (i10 & 65536) != 0 ? workInfoPojo.progress : list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private final WorkInfo.PeriodicityInfo getPeriodicityOrNull() {
            long j = this.intervalDuration;
            if (j != 0) {
                return new WorkInfo.PeriodicityInfo(j, this.flexDuration);
            }
            return null;
        }

        public final String component1() {
            return this.id;
        }

        public final long component10() {
            return this.backoffDelayDuration;
        }

        public final long component11() {
            return this.lastEnqueueTime;
        }

        public final int component12() {
            return this.periodCount;
        }

        public final int component13() {
            return this.generation;
        }

        public final long component14() {
            return this.nextScheduleTimeOverride;
        }

        public final int component15() {
            return this.stopReason;
        }

        public final List<String> component16() {
            return this.tags;
        }

        public final List<Data> component17() {
            return this.progress;
        }

        public final WorkInfo.State component2() {
            return this.state;
        }

        public final Data component3() {
            return this.output;
        }

        public final long component4() {
            return this.initialDelay;
        }

        public final long component5() {
            return this.intervalDuration;
        }

        public final long component6() {
            return this.flexDuration;
        }

        public final Constraints component7() {
            return this.constraints;
        }

        public final int component8() {
            return this.runAttemptCount;
        }

        public final BackoffPolicy component9() {
            return this.backoffPolicy;
        }

        public final WorkInfoPojo copy(String id, WorkInfo.State state, Data output, long j, long j7, long j8, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, int i7, int i8, long j11, int i9, List<String> tags, List<Data> progress) {
            m.e(id, "id");
            m.e(state, "state");
            m.e(output, "output");
            m.e(constraints, "constraints");
            m.e(backoffPolicy, "backoffPolicy");
            m.e(tags, "tags");
            m.e(progress, "progress");
            return new WorkInfoPojo(id, state, output, j, j7, j8, constraints, i, backoffPolicy, j9, j10, i7, i8, j11, i9, tags, progress);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            WorkInfoPojo workInfoPojo = (WorkInfoPojo) obj;
            return m.a(this.id, workInfoPojo.id) && this.state == workInfoPojo.state && m.a(this.output, workInfoPojo.output) && this.initialDelay == workInfoPojo.initialDelay && this.intervalDuration == workInfoPojo.intervalDuration && this.flexDuration == workInfoPojo.flexDuration && m.a(this.constraints, workInfoPojo.constraints) && this.runAttemptCount == workInfoPojo.runAttemptCount && this.backoffPolicy == workInfoPojo.backoffPolicy && this.backoffDelayDuration == workInfoPojo.backoffDelayDuration && this.lastEnqueueTime == workInfoPojo.lastEnqueueTime && this.periodCount == workInfoPojo.periodCount && this.generation == workInfoPojo.generation && this.nextScheduleTimeOverride == workInfoPojo.nextScheduleTimeOverride && this.stopReason == workInfoPojo.stopReason && m.a(this.tags, workInfoPojo.tags) && m.a(this.progress, workInfoPojo.progress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getBackoffDelayDuration() {
            return this.backoffDelayDuration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final BackoffPolicy getBackoffPolicy() {
            return this.backoffPolicy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Constraints getConstraints() {
            return this.constraints;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getFlexDuration() {
            return this.flexDuration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getGeneration() {
            return this.generation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getInitialDelay() {
            return this.initialDelay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getIntervalDuration() {
            return this.intervalDuration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getLastEnqueueTime() {
            return this.lastEnqueueTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getNextScheduleTimeOverride() {
            return this.nextScheduleTimeOverride;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Data getOutput() {
            return this.output;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getPeriodCount() {
            return this.periodCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<Data> getProgress() {
            return this.progress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getRunAttemptCount() {
            return this.runAttemptCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkInfo.State getState() {
            return this.state;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getStopReason() {
            return this.stopReason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final List<String> getTags() {
            return this.tags;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.progress.hashCode() + ((this.tags.hashCode() + i.c(this.stopReason, i.d(i.c(this.generation, i.c(this.periodCount, i.d(i.d((this.backoffPolicy.hashCode() + i.c(this.runAttemptCount, (this.constraints.hashCode() + i.d(i.d(i.d((this.output.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.initialDelay), 31, this.intervalDuration), 31, this.flexDuration)) * 31, 31)) * 31, 31, this.backoffDelayDuration), 31, this.lastEnqueueTime), 31), 31), 31, this.nextScheduleTimeOverride), 31)) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean isBackedOff() {
            return this.state == WorkInfo.State.ENQUEUED && this.runAttemptCount > 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean isPeriodic() {
            return this.intervalDuration != 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setBackoffDelayDuration(long j) {
            this.backoffDelayDuration = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setBackoffPolicy(BackoffPolicy backoffPolicy) {
            m.e(backoffPolicy, "<set-?>");
            this.backoffPolicy = backoffPolicy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setLastEnqueueTime(long j) {
            this.lastEnqueueTime = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setPeriodCount(int i) {
            this.periodCount = i;
        }

        public String toString() {
            return "WorkInfoPojo(id=" + this.id + ", state=" + this.state + ", output=" + this.output + ", initialDelay=" + this.initialDelay + ", intervalDuration=" + this.intervalDuration + ", flexDuration=" + this.flexDuration + ", constraints=" + this.constraints + ", runAttemptCount=" + this.runAttemptCount + ", backoffPolicy=" + this.backoffPolicy + ", backoffDelayDuration=" + this.backoffDelayDuration + ", lastEnqueueTime=" + this.lastEnqueueTime + ", periodCount=" + this.periodCount + ", generation=" + this.generation + ", nextScheduleTimeOverride=" + this.nextScheduleTimeOverride + ", stopReason=" + this.stopReason + ", tags=" + this.tags + ", progress=" + this.progress + ')';
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final WorkInfo toWorkInfo() {
            Data data = !this.progress.isEmpty() ? this.progress.get(0) : Data.EMPTY;
            UUID uuidFromString = UUID.fromString(this.id);
            m.d(uuidFromString, "fromString(id)");
            return new WorkInfo(uuidFromString, this.state, new HashSet(this.tags), this.output, data, this.runAttemptCount, this.generation, this.constraints, this.initialDelay, getPeriodicityOrNull(), calculateNextRunTimeMillis(), this.stopReason);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005c: CONSTRUCTOR 
  (r29v0 java.lang.String)
  (r30v0 androidx.work.WorkInfo$State)
  (r31v0 androidx.work.Data)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r32v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r34v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r36v0 long))
  (r38v0 androidx.work.Constraints)
  (r39v0 int)
  (wrap:androidx.work.BackoffPolicy:?: TERNARY null = ((wrap:int:0x001c: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: SGET  A[WRAPPED] (LINE:19) androidx.work.BackoffPolicy.EXPONENTIAL androidx.work.BackoffPolicy) : (r40v0 androidx.work.BackoffPolicy))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0027: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (30000 long) : (r41v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r43v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003b: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r45v0 int))
  (r46v0 int)
  (r47v0 long)
  (r49v0 int)
  (r50v0 java.util.List)
  (r51v0 java.util.List)
 A[MD:(java.lang.String, androidx.work.WorkInfo$State, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, int, int, long, int, java.util.List<java.lang.String>, java.util.List<androidx.work.Data>):void (m)] (LINE:20) call: androidx.work.impl.model.WorkSpec.WorkInfoPojo.<init>(java.lang.String, androidx.work.WorkInfo$State, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, int, int, long, int, java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ WorkInfoPojo(String str, WorkInfo.State state, Data data, long j, long j7, long j8, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, int i7, int i8, long j11, int i9, List list, List list2, int i10, g gVar) {
            this(str, state, data, (i10 & 8) != 0 ? 0L : j, (i10 & 16) != 0 ? 0L : j7, (i10 & 32) != 0 ? 0L : j8, constraints, i, (i10 & 256) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i10 & 512) != 0 ? 30000L : j9, (i10 & 1024) != 0 ? 0L : j10, (i10 & 2048) != 0 ? 0 : i7, i8, j11, i9, list, list2);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f2: CONSTRUCTOR 
  (r36v0 java.lang.String)
  (wrap:androidx.work.WorkInfo$State:?: TERNARY null = ((wrap:int:0x0002: ARITH (r68v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:26) androidx.work.WorkInfo.State.ENQUEUED androidx.work.WorkInfo$State) : (r37v0 androidx.work.WorkInfo$State))
  (r38v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r68v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: INVOKE (wrap:java.lang.Class:0x0010: CONST_CLASS  A[WRAPPED] (LINE:27) androidx.work.OverwritingInputMerger.class) VIRTUAL call: java.lang.Class.getName():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:27)) : (r39v0 java.lang.String))
  (wrap:androidx.work.Data:?: TERNARY null = ((wrap:int:0x001a: ARITH (r68v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: SGET  A[WRAPPED] (LINE:28) androidx.work.Data.EMPTY androidx.work.Data) : (r40v0 androidx.work.Data))
  (wrap:androidx.work.Data:?: TERNARY null = ((wrap:int:0x0024: ARITH (r68v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: SGET  A[WRAPPED] (LINE:29) androidx.work.Data.EMPTY androidx.work.Data) : (r41v0 androidx.work.Data))
  (wrap:long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r68v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r42v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0038: ARITH (r68v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r44v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0040: ARITH (r68v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r46v0 long))
  (wrap:androidx.work.Constraints:?: TERNARY null = ((wrap:int:0x0048: ARITH (r68v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: SGET  A[WRAPPED] (LINE:30) androidx.work.Constraints.NONE androidx.work.Constraints) : (r48v0 androidx.work.Constraints))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r68v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 int))
  (wrap:androidx.work.BackoffPolicy:?: TERNARY null = ((wrap:int:0x005c: ARITH (r68v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: SGET  A[WRAPPED] (LINE:31) androidx.work.BackoffPolicy.EXPONENTIAL androidx.work.BackoffPolicy) : (r50v0 androidx.work.BackoffPolicy))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0067: ARITH (r68v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006b: SGET  A[WRAPPED] androidx.work.WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS long) : (r51v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0070: ARITH (r68v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r53v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x007b: ARITH (r68v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r55v0 long) : (0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0085: ARITH (32768 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r57v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008f: ARITH (65536 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? false : (r59v0 boolean))
  (wrap:androidx.work.OutOfQuotaPolicy:?: TERNARY null = ((wrap:int:0x0099: ARITH (131072 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009e: SGET  A[WRAPPED] (LINE:32) androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST androidx.work.OutOfQuotaPolicy) : (r60v0 androidx.work.OutOfQuotaPolicy))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a5: ARITH (262144 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r61v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00af: ARITH (524288 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r62v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00b9: ARITH (1048576 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? (Long.MAX_VALUE long) : (r63v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c8: ARITH (2097152 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r65v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00d2: ARITH (4194304 int) & (r68v0 int) A[WRAPPED]) != (0 int)) ? (-256 int) : (r66v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00de: ARITH (r68v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
 A[MD:(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.Data, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, long, int, int, java.lang.String):void (m)] (LINE:33) call: androidx.work.impl.model.WorkSpec.<init>(java.lang.String, androidx.work.WorkInfo$State, java.lang.String, java.lang.String, androidx.work.Data, androidx.work.Data, long, long, long, androidx.work.Constraints, int, androidx.work.BackoffPolicy, long, long, long, long, boolean, androidx.work.OutOfQuotaPolicy, int, int, long, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ WorkSpec(String str, WorkInfo.State state, String str2, String str3, Data data, Data data2, long j, long j7, long j8, Constraints constraints, int i, BackoffPolicy backoffPolicy, long j9, long j10, long j11, long j12, boolean z5, OutOfQuotaPolicy outOfQuotaPolicy, int i7, int i8, long j13, int i9, int i10, String str4, int i11, g gVar) {
        this(str, (i11 & 2) != 0 ? WorkInfo.State.ENQUEUED : state, str2, (i11 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i11 & 16) != 0 ? Data.EMPTY : data, (i11 & 32) != 0 ? Data.EMPTY : data2, (i11 & 64) != 0 ? 0L : j, (i11 & 128) != 0 ? 0L : j7, (i11 & 256) != 0 ? 0L : j8, (i11 & 512) != 0 ? Constraints.NONE : constraints, (i11 & 1024) != 0 ? 0 : i, (i11 & 2048) != 0 ? BackoffPolicy.EXPONENTIAL : backoffPolicy, (i11 & 4096) != 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j9, (i11 & 8192) != 0 ? -1L : j10, (i11 & 16384) == 0 ? j11 : 0L, (32768 & i11) != 0 ? -1L : j12, (65536 & i11) != 0 ? false : z5, (131072 & i11) != 0 ? OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST : outOfQuotaPolicy, (262144 & i11) != 0 ? 0 : i7, (524288 & i11) != 0 ? 0 : i8, (1048576 & i11) != 0 ? Long.MAX_VALUE : j13, (2097152 & i11) != 0 ? 0 : i9, (4194304 & i11) != 0 ? -256 : i10, (i11 & 8388608) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String id, String workerClassName_) {
        this(id, null, workerClassName_, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777210, null);
        m.e(id, "id");
        m.e(workerClassName_, "workerClassName_");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkSpec(String newId, WorkSpec other) {
        this(newId, other.state, other.workerClassName, other.inputMergerClassName, new Data(other.input), new Data(other.output), other.initialDelay, other.intervalDuration, other.flexDuration, new Constraints(other.constraints), other.runAttemptCount, other.backoffPolicy, other.backoffDelayDuration, other.lastEnqueueTime, other.minimumRetentionDuration, other.scheduleRequestedAt, other.expedited, other.outOfQuotaPolicy, other.periodCount, 0, other.nextScheduleTimeOverride, other.nextScheduleTimeOverrideGeneration, other.stopReason, other.traceTag, 524288, null);
        m.e(newId, "newId");
        m.e(other, "other");
    }
}
