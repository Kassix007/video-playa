package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.Logger;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EnqueueRunnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private EnqueueRunnable() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean addToDatabase(WorkContinuationImpl workContinuationImpl) {
        WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            EnqueueUtilsKt.checkContentUriTriggerWorkerLimits(workDatabase, workManagerImpl.getConfiguration(), workContinuationImpl);
            boolean zProcessContinuation = processContinuation(workContinuationImpl);
            workDatabase.setTransactionSuccessful();
            return zProcessContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void enqueue(WorkContinuationImpl workContinuationImpl) {
        if (workContinuationImpl.hasCycles()) {
            throw new IllegalStateException("WorkContinuation has cycles (" + workContinuationImpl + ")");
        }
        if (addToDatabase(workContinuationImpl)) {
            scheduleWorkInBackground(workContinuationImpl);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean enqueueContinuation(WorkContinuationImpl workContinuationImpl) {
        boolean zEnqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuationImpl.getWorkManagerImpl(), workContinuationImpl.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuationImpl).toArray(new String[0]), workContinuationImpl.getName(), workContinuationImpl.getExistingWorkPolicy());
        workContinuationImpl.markEnqueued();
        return zEnqueueWorkWithPrerequisites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl r18, java.util.List<? extends androidx.work.WorkRequest> r19, java.lang.String[] r20, java.lang.String r21, androidx.work.ExistingWorkPolicy r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            androidx.work.Configuration r3 = r18.getConfiguration()
            androidx.work.Clock r3 = r3.getClock()
            long r3 = r3.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r18.getWorkDatabase()
            r7 = 0
            if (r0 == 0) goto L1e
            int r8 = r0.length
            if (r8 <= 0) goto L1e
            r8 = 1
            goto L1f
        L1e:
            r8 = r7
        L1f:
            if (r8 == 0) goto L69
            int r9 = r0.length
            r10 = r7
            r12 = r10
            r13 = r12
            r11 = 1
        L26:
            if (r10 >= r9) goto L6c
            r14 = r0[r10]
            androidx.work.impl.model.WorkSpecDao r15 = r5.workSpecDao()
            androidx.work.impl.model.WorkSpec r15 = r15.getWorkSpec(r14)
            if (r15 != 0) goto L51
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.utils.EnqueueRunnable.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Prerequisite "
            r2.<init>(r3)
            r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.error(r1, r2)
            return r7
        L51:
            androidx.work.WorkInfo$State r14 = r15.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r14 != r15) goto L59
            r15 = 1
            goto L5a
        L59:
            r15 = r7
        L5a:
            r11 = r11 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r14 != r15) goto L61
            r13 = 1
            goto L66
        L61:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r14 != r15) goto L66
            r12 = 1
        L66:
            int r10 = r10 + 1
            goto L26
        L69:
            r12 = r7
            r13 = r12
            r11 = 1
        L6c:
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 != 0) goto L151
            if (r8 != 0) goto L151
            androidx.work.impl.model.WorkSpecDao r10 = r5.workSpecDao()
            java.util.List r10 = r10.getWorkSpecIdAndStatesForName(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L151
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND
            if (r2 == r14) goto L8a
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r14) goto L8d
        L8a:
            r14 = r18
            goto Ld0
        L8d:
            androidx.work.ExistingWorkPolicy r14 = androidx.work.ExistingWorkPolicy.KEEP
            if (r2 != r14) goto Lac
            java.util.Iterator r2 = r10.iterator()
        L95:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto Lac
            java.lang.Object r14 = r2.next()
            androidx.work.impl.model.WorkSpec$IdAndState r14 = (androidx.work.impl.model.WorkSpec.IdAndState) r14
            androidx.work.WorkInfo$State r14 = r14.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r14 == r15) goto Lab
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.RUNNING
            if (r14 != r15) goto L95
        Lab:
            return r7
        Lac:
            r14 = r18
            androidx.work.impl.utils.CancelWorkRunnable.forNameInline(r1, r14)
            androidx.work.impl.model.WorkSpecDao r2 = r5.workSpecDao()
            java.util.Iterator r10 = r10.iterator()
        Lb9:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto Lcb
            java.lang.Object r15 = r10.next()
            androidx.work.impl.model.WorkSpec$IdAndState r15 = (androidx.work.impl.model.WorkSpec.IdAndState) r15
            java.lang.String r15 = r15.id
            r2.delete(r15)
            goto Lb9
        Lcb:
            r17 = r5
            r6 = 1
            goto L156
        Ld0:
            androidx.work.impl.model.DependencyDao r8 = r5.dependencyDao()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        Ldd:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L117
            java.lang.Object r16 = r10.next()
            r6 = r16
            androidx.work.impl.model.WorkSpec$IdAndState r6 = (androidx.work.impl.model.WorkSpec.IdAndState) r6
            java.lang.String r7 = r6.id
            boolean r7 = r8.hasDependents(r7)
            if (r7 != 0) goto L111
            androidx.work.WorkInfo$State r7 = r6.state
            r17 = r5
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r7 != r5) goto Lfd
            r5 = 1
            goto Lfe
        Lfd:
            r5 = 0
        Lfe:
            r5 = r5 & r11
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.FAILED
            if (r7 != r11) goto L105
            r13 = 1
            goto L10a
        L105:
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.CANCELLED
            if (r7 != r11) goto L10a
            r12 = 1
        L10a:
            java.lang.String r6 = r6.id
            r15.add(r6)
            r11 = r5
            goto L113
        L111:
            r17 = r5
        L113:
            r5 = r17
            r7 = 0
            goto Ldd
        L117:
            r17 = r5
            androidx.work.ExistingWorkPolicy r5 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r2 != r5) goto L143
            if (r12 != 0) goto L121
            if (r13 == 0) goto L143
        L121:
            androidx.work.impl.model.WorkSpecDao r2 = r17.workSpecDao()
            java.util.List r5 = r2.getWorkSpecIdAndStatesForName(r1)
            java.util.Iterator r5 = r5.iterator()
        L12d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L13f
            java.lang.Object r6 = r5.next()
            androidx.work.impl.model.WorkSpec$IdAndState r6 = (androidx.work.impl.model.WorkSpec.IdAndState) r6
            java.lang.String r6 = r6.id
            r2.delete(r6)
            goto L12d
        L13f:
            java.util.List r15 = java.util.Collections.EMPTY_LIST
            r12 = 0
            r13 = 0
        L143:
            java.lang.Object[] r0 = r15.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L14e
            r8 = 1
            goto L14f
        L14e:
            r8 = 0
        L14f:
            r6 = 0
            goto L156
        L151:
            r14 = r18
            r17 = r5
            goto L14f
        L156:
            java.util.Iterator r2 = r19.iterator()
        L15a:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L1e7
            java.lang.Object r5 = r2.next()
            androidx.work.WorkRequest r5 = (androidx.work.WorkRequest) r5
            androidx.work.impl.model.WorkSpec r7 = r5.getWorkSpec()
            if (r8 == 0) goto L181
            if (r11 != 0) goto L181
            if (r13 == 0) goto L175
            androidx.work.WorkInfo$State r10 = androidx.work.WorkInfo.State.FAILED
            r7.state = r10
            goto L183
        L175:
            if (r12 == 0) goto L17c
            androidx.work.WorkInfo$State r10 = androidx.work.WorkInfo.State.CANCELLED
            r7.state = r10
            goto L183
        L17c:
            androidx.work.WorkInfo$State r10 = androidx.work.WorkInfo.State.BLOCKED
            r7.state = r10
            goto L183
        L181:
            r7.lastEnqueueTime = r3
        L183:
            androidx.work.WorkInfo$State r10 = r7.state
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.ENQUEUED
            if (r10 != r15) goto L18a
            r6 = 1
        L18a:
            androidx.work.impl.model.WorkSpecDao r10 = r17.workSpecDao()
            java.util.List r15 = r14.getSchedulers()
            androidx.work.impl.model.WorkSpec r7 = androidx.work.impl.utils.EnqueueUtilsKt.wrapWorkSpecIfNeeded(r15, r7)
            r10.insertWorkSpec(r7)
            if (r8 == 0) goto L1bc
            int r7 = r0.length
            r10 = 0
        L19d:
            if (r10 >= r7) goto L1bc
            r15 = r0[r10]
            r20 = r0
            androidx.work.impl.model.Dependency r0 = new androidx.work.impl.model.Dependency
            r19 = r2
            java.lang.String r2 = r5.getStringId()
            r0.<init>(r2, r15)
            androidx.work.impl.model.DependencyDao r2 = r17.dependencyDao()
            r2.insertDependency(r0)
            int r10 = r10 + 1
            r2 = r19
            r0 = r20
            goto L19d
        L1bc:
            r20 = r0
            r19 = r2
            androidx.work.impl.model.WorkTagDao r0 = r17.workTagDao()
            java.lang.String r2 = r5.getStringId()
            java.util.Set r7 = r5.getTags()
            r0.insertTags(r2, r7)
            if (r9 != 0) goto L1e1
            androidx.work.impl.model.WorkNameDao r0 = r17.workNameDao()
            androidx.work.impl.model.WorkName r2 = new androidx.work.impl.model.WorkName
            java.lang.String r5 = r5.getStringId()
            r2.<init>(r1, r5)
            r0.insert(r2)
        L1e1:
            r2 = r19
            r0 = r20
            goto L15a
        L1e7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.EnqueueRunnable.enqueueWorkWithPrerequisites(androidx.work.impl.WorkManagerImpl, java.util.List, java.lang.String[], java.lang.String, androidx.work.ExistingWorkPolicy):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean processContinuation(WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        boolean zProcessContinuation = false;
        if (parents != null) {
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                if (workContinuationImpl2.isEnqueued()) {
                    Logger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", workContinuationImpl2.getIds()) + ")");
                } else {
                    zProcessContinuation |= processContinuation(workContinuationImpl2);
                }
            }
        }
        return enqueueContinuation(workContinuationImpl) | zProcessContinuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void scheduleWorkInBackground(WorkContinuationImpl workContinuationImpl) {
        WorkManagerImpl workManagerImpl = workContinuationImpl.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}
