package androidx.work;

import java.util.Set;
import java.util.UUID;
import k1.i;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class WorkInfo {
    public static final Companion Companion = new Companion(null);
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final int STOP_REASON_FOREGROUND_SERVICE_TIMEOUT = -128;
    public static final int STOP_REASON_NOT_STOPPED = -256;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_UNKNOWN = -512;
    public static final int STOP_REASON_USER = 13;
    private final Constraints constraints;
    private final int generation;
    private final UUID id;
    private final long initialDelayMillis;
    private final long nextScheduleTimeMillis;
    private final Data outputData;
    private final PeriodicityInfo periodicityInfo;
    private final Data progress;
    private final int runAttemptCount;
    private final State state;
    private final int stopReason;
    private final Set<String> tags;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.work.WorkInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static final class PeriodicityInfo {
        private final long flexIntervalMillis;
        private final long repeatIntervalMillis;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public PeriodicityInfo(long j, long j7) {
            this.repeatIntervalMillis = j;
            this.flexIntervalMillis = j7;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PeriodicityInfo.class.equals(obj.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
                if (periodicityInfo.repeatIntervalMillis == this.repeatIntervalMillis && periodicityInfo.flexIntervalMillis == this.flexIntervalMillis) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getFlexIntervalMillis() {
            return this.flexIntervalMillis;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final long getRepeatIntervalMillis() {
            return this.repeatIntervalMillis;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Long.hashCode(this.flexIntervalMillis) + (Long.hashCode(this.repeatIntervalMillis) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.repeatIntervalMillis + ", flexIntervalMillis=" + this.flexIntervalMillis + '}';
        }
    }

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags) {
        this(id, state, tags, null, null, 0, 0, null, 0L, null, 0L, 0, 4088, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WorkInfo.class.equals(obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.runAttemptCount == workInfo.runAttemptCount && this.generation == workInfo.generation && m.a(this.id, workInfo.id) && this.state == workInfo.state && m.a(this.outputData, workInfo.outputData) && m.a(this.constraints, workInfo.constraints) && this.initialDelayMillis == workInfo.initialDelayMillis && m.a(this.periodicityInfo, workInfo.periodicityInfo) && this.nextScheduleTimeMillis == workInfo.nextScheduleTimeMillis && this.stopReason == workInfo.stopReason && m.a(this.tags, workInfo.tags)) {
            return m.a(this.progress, workInfo.progress);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Constraints getConstraints() {
        return this.constraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getGeneration() {
        return this.generation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final UUID getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getInitialDelayMillis() {
        return this.initialDelayMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getNextScheduleTimeMillis() {
        return this.nextScheduleTimeMillis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Data getOutputData() {
        return this.outputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final PeriodicityInfo getPeriodicityInfo() {
        return this.periodicityInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Data getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getRunAttemptCount() {
        return this.runAttemptCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final State getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getStopReason() {
        return this.stopReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iD = i.d((this.constraints.hashCode() + ((((((this.progress.hashCode() + ((this.tags.hashCode() + ((this.outputData.hashCode() + ((this.state.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.runAttemptCount) * 31) + this.generation) * 31)) * 31, 31, this.initialDelayMillis);
        PeriodicityInfo periodicityInfo = this.periodicityInfo;
        return Integer.hashCode(this.stopReason) + i.d((iD + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31, 31, this.nextScheduleTimeMillis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "WorkInfo{id='" + this.id + "', state=" + this.state + ", outputData=" + this.outputData + ", tags=" + this.tags + ", progress=" + this.progress + ", runAttemptCount=" + this.runAttemptCount + ", generation=" + this.generation + ", constraints=" + this.constraints + ", initialDelayMillis=" + this.initialDelayMillis + ", periodicityInfo=" + this.periodicityInfo + ", nextScheduleTimeMillis=" + this.nextScheduleTimeMillis + "}, stopReason=" + this.stopReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData) {
        this(id, state, tags, outputData, null, 0, 0, null, 0L, null, 0L, 0, 4080, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress) {
        this(id, state, tags, outputData, progress, 0, 0, null, 0L, null, 0L, 0, 4064, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
        m.e(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i) {
        this(id, state, tags, outputData, progress, i, 0, null, 0L, null, 0L, 0, 4032, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
        m.e(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i7) {
        this(id, state, tags, outputData, progress, i, i7, null, 0L, null, 0L, 0, 3968, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
        m.e(progress, "progress");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i7, Constraints constraints) {
        this(id, state, tags, outputData, progress, i, i7, constraints, 0L, null, 0L, 0, 3840, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
        m.e(progress, "progress");
        m.e(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i7, Constraints constraints, long j) {
        this(id, state, tags, outputData, progress, i, i7, constraints, j, null, 0L, 0, 3584, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
        m.e(progress, "progress");
        m.e(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i7, Constraints constraints, long j, PeriodicityInfo periodicityInfo) {
        this(id, state, tags, outputData, progress, i, i7, constraints, j, periodicityInfo, 0L, 0, 3072, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
        m.e(progress, "progress");
        m.e(constraints, "constraints");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i7, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j7) {
        this(id, state, tags, outputData, progress, i, i7, constraints, j, periodicityInfo, j7, 0, 2048, null);
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
        m.e(progress, "progress");
        m.e(constraints, "constraints");
    }

    public WorkInfo(UUID id, State state, Set<String> tags, Data outputData, Data progress, int i, int i7, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j7, int i8) {
        m.e(id, "id");
        m.e(state, "state");
        m.e(tags, "tags");
        m.e(outputData, "outputData");
        m.e(progress, "progress");
        m.e(constraints, "constraints");
        this.id = id;
        this.state = state;
        this.tags = tags;
        this.outputData = outputData;
        this.progress = progress;
        this.runAttemptCount = i;
        this.generation = i7;
        this.constraints = constraints;
        this.initialDelayMillis = j;
        this.periodicityInfo = periodicityInfo;
        this.nextScheduleTimeMillis = j7;
        this.stopReason = i8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (r18v0 java.util.UUID)
  (r19v0 androidx.work.WorkInfo$State)
  (r20v0 java.util.Set)
  (wrap:androidx.work.Data:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:23) androidx.work.Data.EMPTY androidx.work.Data) : (r21v0 androidx.work.Data))
  (wrap:androidx.work.Data:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] (LINE:24) androidx.work.Data.EMPTY androidx.work.Data) : (r22v0 androidx.work.Data))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001f: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:androidx.work.Constraints:?: TERNARY null = ((wrap:int:0x0027: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] (LINE:25) androidx.work.Constraints.NONE androidx.work.Constraints) : (r25v0 androidx.work.Constraints))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0031: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 long))
  (wrap:androidx.work.WorkInfo$PeriodicityInfo:?: TERNARY null = ((wrap:int:0x003b: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null androidx.work.WorkInfo$PeriodicityInfo) : (r28v0 androidx.work.WorkInfo$PeriodicityInfo))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (Long.MAX_VALUE long) : (r29v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0051: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (-256 int) : (r31v0 int))
 A[MD:(java.util.UUID, androidx.work.WorkInfo$State, java.util.Set<java.lang.String>, androidx.work.Data, androidx.work.Data, int, int, androidx.work.Constraints, long, androidx.work.WorkInfo$PeriodicityInfo, long, int):void (m)] (LINE:26) call: androidx.work.WorkInfo.<init>(java.util.UUID, androidx.work.WorkInfo$State, java.util.Set, androidx.work.Data, androidx.work.Data, int, int, androidx.work.Constraints, long, androidx.work.WorkInfo$PeriodicityInfo, long, int):void type: THIS */
    public /* synthetic */ WorkInfo(UUID uuid, State state, Set set, Data data, Data data2, int i, int i7, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j7, int i8, int i9, g gVar) {
        this(uuid, state, set, (i9 & 8) != 0 ? Data.EMPTY : data, (i9 & 16) != 0 ? Data.EMPTY : data2, (i9 & 32) != 0 ? 0 : i, (i9 & 64) != 0 ? 0 : i7, (i9 & 128) != 0 ? Constraints.NONE : constraints, (i9 & 256) != 0 ? 0L : j, (i9 & 512) != 0 ? null : periodicityInfo, (i9 & 1024) != 0 ? Long.MAX_VALUE : j7, (i9 & 2048) != 0 ? -256 : i8);
    }
}
