package androidx.work.impl.model;

import P5.InterfaceC0397h;
import android.annotation.SuppressLint;
import androidx.lifecycle.G;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public interface WorkSpecDao {
    int countNonFinishedContentUriTriggerWorkers();

    void delete(String str);

    List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i);

    List<String> getAllUnfinishedWork();

    List<String> getAllWorkSpecIds();

    G getAllWorkSpecIdsLiveData();

    List<WorkSpec> getEligibleWorkForScheduling(int i);

    List<WorkSpec> getEligibleWorkForSchedulingWithContentUris();

    List<Data> getInputsFromPrerequisites(String str);

    List<WorkSpec> getRecentlyCompletedWork(long j);

    List<WorkSpec> getRunningWork();

    G getScheduleRequestedAtLiveData(String str);

    List<WorkSpec> getScheduledWork();

    WorkInfo.State getState(String str);

    List<String> getUnfinishedWorkWithName(String str);

    List<String> getUnfinishedWorkWithTag(String str);

    WorkSpec getWorkSpec(String str);

    List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str);

    InterfaceC0397h getWorkStatusPojoFlowDataForIds(List<String> list);

    InterfaceC0397h getWorkStatusPojoFlowForName(String str);

    InterfaceC0397h getWorkStatusPojoFlowForTag(String str);

    WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str);

    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str);

    G getWorkStatusPojoLiveDataForIds(List<String> list);

    G getWorkStatusPojoLiveDataForName(String str);

    G getWorkStatusPojoLiveDataForTag(String str);

    InterfaceC0397h hasUnfinishedWorkFlow();

    void incrementGeneration(String str);

    void incrementPeriodCount(String str);

    int incrementWorkSpecRunAttemptCount(String str);

    void insertWorkSpec(WorkSpec workSpec);

    int markWorkSpecScheduled(String str, long j);

    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    int resetScheduledState();

    void resetWorkSpecNextScheduleTimeOverride(String str, int i);

    int resetWorkSpecRunAttemptCount(String str);

    int setCancelledState(String str);

    void setLastEnqueueTime(String str, long j);

    void setNextScheduleTimeOverride(String str, long j);

    void setOutput(String str, Data data);

    int setState(WorkInfo.State state, String str);

    void setStopReason(String str, int i);

    void updateWorkSpec(WorkSpec workSpec);
}
