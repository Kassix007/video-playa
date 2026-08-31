package androidx.work.impl.model;

import C0.S;
import P5.InterfaceC0397h;
import android.database.Cursor;
import androidx.lifecycle.G;
import androidx.room.g;
import androidx.room.w;
import androidx.room.z;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import j2.InterfaceC1160f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import l6.d;
import m5.C1386y;
import n5.AbstractC1397A;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final w __db;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RawWorkInfoDao_Impl(w wVar) {
        this.__db = wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            AbstractC1397A.y(map, new a(this, 1));
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
            AbstractC1397A.y(map, new a(this, 0));
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
    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(InterfaceC1160f interfaceC1160f) {
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorB = d.B(this.__db, interfaceC1160f, true);
        try {
            int iQ = AbstractC0836n2.q(cursorB, "id");
            int iQ2 = AbstractC0836n2.q(cursorB, "state");
            int iQ3 = AbstractC0836n2.q(cursorB, "output");
            int iQ4 = AbstractC0836n2.q(cursorB, "initial_delay");
            int iQ5 = AbstractC0836n2.q(cursorB, "interval_duration");
            int iQ6 = AbstractC0836n2.q(cursorB, "flex_duration");
            int iQ7 = AbstractC0836n2.q(cursorB, "run_attempt_count");
            int iQ8 = AbstractC0836n2.q(cursorB, "backoff_policy");
            int iQ9 = AbstractC0836n2.q(cursorB, "backoff_delay_duration");
            int iQ10 = AbstractC0836n2.q(cursorB, "last_enqueue_time");
            int iQ11 = AbstractC0836n2.q(cursorB, "period_count");
            int iQ12 = AbstractC0836n2.q(cursorB, "generation");
            int iQ13 = AbstractC0836n2.q(cursorB, "next_schedule_time_override");
            int iQ14 = AbstractC0836n2.q(cursorB, "stop_reason");
            int iQ15 = AbstractC0836n2.q(cursorB, "required_network_type");
            int iQ16 = AbstractC0836n2.q(cursorB, "required_network_request");
            int iQ17 = AbstractC0836n2.q(cursorB, "requires_charging");
            int iQ18 = AbstractC0836n2.q(cursorB, "requires_device_idle");
            int iQ19 = AbstractC0836n2.q(cursorB, "requires_battery_not_low");
            int iQ20 = AbstractC0836n2.q(cursorB, "requires_storage_not_low");
            int iQ21 = AbstractC0836n2.q(cursorB, "trigger_content_update_delay");
            int iQ22 = AbstractC0836n2.q(cursorB, "trigger_max_content_delay");
            int iQ23 = AbstractC0836n2.q(cursorB, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i7 = iQ13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorB.moveToNext()) {
                int i8 = iQ12;
                String string = cursorB.getString(iQ);
                if (map.containsKey(string)) {
                    i = iQ11;
                } else {
                    i = iQ11;
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorB.getString(iQ);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                iQ12 = i8;
                iQ11 = i;
            }
            int i9 = iQ11;
            int i10 = iQ12;
            cursorB.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(map);
            __fetchRelationshipWorkProgressAsandroidxWorkData(map2);
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string3 = iQ == -1 ? null : cursorB.getString(iQ);
                WorkInfo.State stateIntToState = iQ2 == -1 ? null : WorkTypeConverters.intToState(cursorB.getInt(iQ2));
                Data dataFromByteArray = iQ3 == -1 ? null : Data.fromByteArray(cursorB.getBlob(iQ3));
                long j = iQ4 == -1 ? 0L : cursorB.getLong(iQ4);
                long j7 = iQ5 == -1 ? 0L : cursorB.getLong(iQ5);
                long j8 = iQ6 == -1 ? 0L : cursorB.getLong(iQ6);
                boolean z8 = false;
                int i11 = iQ7 == -1 ? 0 : cursorB.getInt(iQ7);
                BackoffPolicy backoffPolicyIntToBackoffPolicy = iQ8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iQ8));
                long j9 = iQ9 == -1 ? 0L : cursorB.getLong(iQ9);
                long j10 = iQ10 == -1 ? 0L : cursorB.getLong(iQ10);
                int i12 = i9;
                int i13 = i12 == -1 ? 0 : cursorB.getInt(i12);
                i9 = i12;
                int i14 = i10;
                int i15 = i14 == -1 ? 0 : cursorB.getInt(i14);
                i10 = i14;
                int i16 = i7;
                long j11 = i16 == -1 ? 0L : cursorB.getLong(i16);
                i7 = i16;
                int i17 = iQ14;
                int i18 = i17 == -1 ? 0 : cursorB.getInt(i17);
                iQ14 = i17;
                int i19 = iQ15;
                NetworkType networkTypeIntToNetworkType = i19 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorB.getInt(i19));
                iQ15 = i19;
                int i20 = iQ16;
                NetworkRequestCompat networkRequest$work_runtime_release = i20 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i20));
                iQ16 = i20;
                int i21 = iQ17;
                if (i21 == -1) {
                    z5 = false;
                } else {
                    z5 = cursorB.getInt(i21) != 0;
                }
                iQ17 = i21;
                int i22 = iQ18;
                if (i22 == -1) {
                    z6 = false;
                } else {
                    z6 = cursorB.getInt(i22) != 0;
                }
                iQ18 = i22;
                int i23 = iQ19;
                if (i23 == -1) {
                    z7 = false;
                } else {
                    z7 = cursorB.getInt(i23) != 0;
                }
                iQ19 = i23;
                int i24 = iQ20;
                if (i24 != -1 && cursorB.getInt(i24) != 0) {
                    z8 = true;
                }
                iQ20 = i24;
                int i25 = iQ21;
                boolean z9 = z8;
                long j12 = i25 == -1 ? 0L : cursorB.getLong(i25);
                iQ21 = i25;
                int i26 = iQ22;
                long j13 = i26 != -1 ? cursorB.getLong(i26) : 0L;
                iQ22 = i26;
                int i27 = iQ23;
                iQ23 = i27;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j7, j8, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z5, z6, z7, z9, j12, j13, i27 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i27))), i11, backoffPolicyIntToBackoffPolicy, j9, j10, i13, i15, j11, i18, map.get(cursorB.getString(iQ)), map2.get(cursorB.getString(iQ))));
            }
            cursorB.close();
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.RawWorkInfoDao
    public InterfaceC0397h getWorkInfoPojosFlow(final InterfaceC1160f interfaceC1160f) {
        return g.a(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                boolean z5;
                boolean z6;
                boolean z7;
                int i;
                Cursor cursorB = d.B(RawWorkInfoDao_Impl.this.__db, interfaceC1160f, true);
                try {
                    int iQ = AbstractC0836n2.q(cursorB, "id");
                    int iQ2 = AbstractC0836n2.q(cursorB, "state");
                    int iQ3 = AbstractC0836n2.q(cursorB, "output");
                    int iQ4 = AbstractC0836n2.q(cursorB, "initial_delay");
                    int iQ5 = AbstractC0836n2.q(cursorB, "interval_duration");
                    int iQ6 = AbstractC0836n2.q(cursorB, "flex_duration");
                    int iQ7 = AbstractC0836n2.q(cursorB, "run_attempt_count");
                    int iQ8 = AbstractC0836n2.q(cursorB, "backoff_policy");
                    int iQ9 = AbstractC0836n2.q(cursorB, "backoff_delay_duration");
                    int iQ10 = AbstractC0836n2.q(cursorB, "last_enqueue_time");
                    int iQ11 = AbstractC0836n2.q(cursorB, "period_count");
                    int iQ12 = AbstractC0836n2.q(cursorB, "generation");
                    int iQ13 = AbstractC0836n2.q(cursorB, "next_schedule_time_override");
                    int iQ14 = AbstractC0836n2.q(cursorB, "stop_reason");
                    int iQ15 = AbstractC0836n2.q(cursorB, "required_network_type");
                    int iQ16 = AbstractC0836n2.q(cursorB, "required_network_request");
                    int iQ17 = AbstractC0836n2.q(cursorB, "requires_charging");
                    int iQ18 = AbstractC0836n2.q(cursorB, "requires_device_idle");
                    int iQ19 = AbstractC0836n2.q(cursorB, "requires_battery_not_low");
                    int iQ20 = AbstractC0836n2.q(cursorB, "requires_storage_not_low");
                    int iQ21 = AbstractC0836n2.q(cursorB, "trigger_content_update_delay");
                    int iQ22 = AbstractC0836n2.q(cursorB, "trigger_max_content_delay");
                    int iQ23 = AbstractC0836n2.q(cursorB, "content_uri_triggers");
                    HashMap map = new HashMap();
                    int i7 = iQ13;
                    HashMap map2 = new HashMap();
                    while (cursorB.moveToNext()) {
                        int i8 = iQ12;
                        String string = cursorB.getString(iQ);
                        if (map.containsKey(string)) {
                            i = iQ11;
                        } else {
                            i = iQ11;
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorB.getString(iQ);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        iQ12 = i8;
                        iQ11 = i;
                    }
                    int i9 = iQ11;
                    int i10 = iQ12;
                    cursorB.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string3 = iQ == -1 ? null : cursorB.getString(iQ);
                        WorkInfo.State stateIntToState = iQ2 == -1 ? null : WorkTypeConverters.intToState(cursorB.getInt(iQ2));
                        Data dataFromByteArray = iQ3 == -1 ? null : Data.fromByteArray(cursorB.getBlob(iQ3));
                        long j = iQ4 == -1 ? 0L : cursorB.getLong(iQ4);
                        long j7 = iQ5 == -1 ? 0L : cursorB.getLong(iQ5);
                        long j8 = iQ6 == -1 ? 0L : cursorB.getLong(iQ6);
                        boolean z8 = false;
                        int i11 = iQ7 == -1 ? 0 : cursorB.getInt(iQ7);
                        BackoffPolicy backoffPolicyIntToBackoffPolicy = iQ8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iQ8));
                        long j9 = iQ9 == -1 ? 0L : cursorB.getLong(iQ9);
                        long j10 = iQ10 == -1 ? 0L : cursorB.getLong(iQ10);
                        int i12 = i9;
                        int i13 = i12 == -1 ? 0 : cursorB.getInt(i12);
                        i9 = i12;
                        int i14 = i10;
                        int i15 = i14 == -1 ? 0 : cursorB.getInt(i14);
                        i10 = i14;
                        int i16 = i7;
                        long j11 = i16 == -1 ? 0L : cursorB.getLong(i16);
                        i7 = i16;
                        int i17 = iQ14;
                        int i18 = i17 == -1 ? 0 : cursorB.getInt(i17);
                        iQ14 = i17;
                        int i19 = iQ15;
                        NetworkType networkTypeIntToNetworkType = i19 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorB.getInt(i19));
                        iQ15 = i19;
                        int i20 = iQ16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i20 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i20));
                        iQ16 = i20;
                        int i21 = iQ17;
                        if (i21 == -1) {
                            z5 = false;
                        } else {
                            z5 = cursorB.getInt(i21) != 0;
                        }
                        iQ17 = i21;
                        int i22 = iQ18;
                        if (i22 == -1) {
                            z6 = false;
                        } else {
                            z6 = cursorB.getInt(i22) != 0;
                        }
                        iQ18 = i22;
                        int i23 = iQ19;
                        if (i23 == -1) {
                            z7 = false;
                        } else {
                            z7 = cursorB.getInt(i23) != 0;
                        }
                        iQ19 = i23;
                        int i24 = iQ20;
                        if (i24 != -1 && cursorB.getInt(i24) != 0) {
                            z8 = true;
                        }
                        iQ20 = i24;
                        int i25 = iQ21;
                        boolean z9 = z8;
                        long j12 = i25 == -1 ? 0L : cursorB.getLong(i25);
                        iQ21 = i25;
                        int i26 = iQ22;
                        long j13 = i26 != -1 ? cursorB.getLong(i26) : 0L;
                        iQ22 = i26;
                        int i27 = iQ23;
                        iQ23 = i27;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j7, j8, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z5, z6, z7, z9, j12, j13, i27 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i27))), i11, backoffPolicyIntToBackoffPolicy, j9, j10, i13, i15, j11, i18, (ArrayList) map.get(cursorB.getString(iQ)), (ArrayList) map2.get(cursorB.getString(iQ))));
                    }
                    cursorB.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorB.close();
                    throw th;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.impl.model.RawWorkInfoDao
    public G getWorkInfoPojosLiveData(final InterfaceC1160f interfaceC1160f) {
        return this.__db.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            /* JADX DEBUG: Class process forced to load method for inline: androidx.work.impl.model.WorkTypeConverters.toNetworkRequest$work_runtime_release(byte[]):androidx.work.impl.utils.NetworkRequestCompat */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() {
                boolean z5;
                boolean z6;
                boolean z7;
                int i;
                Cursor cursorB = d.B(RawWorkInfoDao_Impl.this.__db, interfaceC1160f, true);
                try {
                    int iQ = AbstractC0836n2.q(cursorB, "id");
                    int iQ2 = AbstractC0836n2.q(cursorB, "state");
                    int iQ3 = AbstractC0836n2.q(cursorB, "output");
                    int iQ4 = AbstractC0836n2.q(cursorB, "initial_delay");
                    int iQ5 = AbstractC0836n2.q(cursorB, "interval_duration");
                    int iQ6 = AbstractC0836n2.q(cursorB, "flex_duration");
                    int iQ7 = AbstractC0836n2.q(cursorB, "run_attempt_count");
                    int iQ8 = AbstractC0836n2.q(cursorB, "backoff_policy");
                    int iQ9 = AbstractC0836n2.q(cursorB, "backoff_delay_duration");
                    int iQ10 = AbstractC0836n2.q(cursorB, "last_enqueue_time");
                    int iQ11 = AbstractC0836n2.q(cursorB, "period_count");
                    int iQ12 = AbstractC0836n2.q(cursorB, "generation");
                    int iQ13 = AbstractC0836n2.q(cursorB, "next_schedule_time_override");
                    int iQ14 = AbstractC0836n2.q(cursorB, "stop_reason");
                    int iQ15 = AbstractC0836n2.q(cursorB, "required_network_type");
                    int iQ16 = AbstractC0836n2.q(cursorB, "required_network_request");
                    int iQ17 = AbstractC0836n2.q(cursorB, "requires_charging");
                    int iQ18 = AbstractC0836n2.q(cursorB, "requires_device_idle");
                    int iQ19 = AbstractC0836n2.q(cursorB, "requires_battery_not_low");
                    int iQ20 = AbstractC0836n2.q(cursorB, "requires_storage_not_low");
                    int iQ21 = AbstractC0836n2.q(cursorB, "trigger_content_update_delay");
                    int iQ22 = AbstractC0836n2.q(cursorB, "trigger_max_content_delay");
                    int iQ23 = AbstractC0836n2.q(cursorB, "content_uri_triggers");
                    HashMap map = new HashMap();
                    int i7 = iQ13;
                    HashMap map2 = new HashMap();
                    while (cursorB.moveToNext()) {
                        int i8 = iQ12;
                        String string = cursorB.getString(iQ);
                        if (map.containsKey(string)) {
                            i = iQ11;
                        } else {
                            i = iQ11;
                            map.put(string, new ArrayList());
                        }
                        String string2 = cursorB.getString(iQ);
                        if (!map2.containsKey(string2)) {
                            map2.put(string2, new ArrayList());
                        }
                        iQ12 = i8;
                        iQ11 = i;
                    }
                    int i9 = iQ11;
                    int i10 = iQ12;
                    cursorB.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(map);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(map2);
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string3 = iQ == -1 ? null : cursorB.getString(iQ);
                        WorkInfo.State stateIntToState = iQ2 == -1 ? null : WorkTypeConverters.intToState(cursorB.getInt(iQ2));
                        Data dataFromByteArray = iQ3 == -1 ? null : Data.fromByteArray(cursorB.getBlob(iQ3));
                        long j = iQ4 == -1 ? 0L : cursorB.getLong(iQ4);
                        long j7 = iQ5 == -1 ? 0L : cursorB.getLong(iQ5);
                        long j8 = iQ6 == -1 ? 0L : cursorB.getLong(iQ6);
                        boolean z8 = false;
                        int i11 = iQ7 == -1 ? 0 : cursorB.getInt(iQ7);
                        BackoffPolicy backoffPolicyIntToBackoffPolicy = iQ8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(cursorB.getInt(iQ8));
                        long j9 = iQ9 == -1 ? 0L : cursorB.getLong(iQ9);
                        long j10 = iQ10 == -1 ? 0L : cursorB.getLong(iQ10);
                        int i12 = i9;
                        int i13 = i12 == -1 ? 0 : cursorB.getInt(i12);
                        i9 = i12;
                        int i14 = i10;
                        int i15 = i14 == -1 ? 0 : cursorB.getInt(i14);
                        i10 = i14;
                        int i16 = i7;
                        long j11 = i16 == -1 ? 0L : cursorB.getLong(i16);
                        i7 = i16;
                        int i17 = iQ14;
                        int i18 = i17 == -1 ? 0 : cursorB.getInt(i17);
                        iQ14 = i17;
                        int i19 = iQ15;
                        NetworkType networkTypeIntToNetworkType = i19 == -1 ? null : WorkTypeConverters.intToNetworkType(cursorB.getInt(i19));
                        iQ15 = i19;
                        int i20 = iQ16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i20 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(cursorB.getBlob(i20));
                        iQ16 = i20;
                        int i21 = iQ17;
                        if (i21 == -1) {
                            z5 = false;
                        } else {
                            z5 = cursorB.getInt(i21) != 0;
                        }
                        iQ17 = i21;
                        int i22 = iQ18;
                        if (i22 == -1) {
                            z6 = false;
                        } else {
                            z6 = cursorB.getInt(i22) != 0;
                        }
                        iQ18 = i22;
                        int i23 = iQ19;
                        if (i23 == -1) {
                            z7 = false;
                        } else {
                            z7 = cursorB.getInt(i23) != 0;
                        }
                        iQ19 = i23;
                        int i24 = iQ20;
                        if (i24 != -1 && cursorB.getInt(i24) != 0) {
                            z8 = true;
                        }
                        iQ20 = i24;
                        int i25 = iQ21;
                        boolean z9 = z8;
                        long j12 = i25 == -1 ? 0L : cursorB.getLong(i25);
                        iQ21 = i25;
                        int i26 = iQ22;
                        long j13 = i26 != -1 ? cursorB.getLong(i26) : 0L;
                        iQ22 = i26;
                        int i27 = iQ23;
                        iQ23 = i27;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, stateIntToState, dataFromByteArray, j, j7, j8, new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z5, z6, z7, z9, j12, j13, i27 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(cursorB.getBlob(i27))), i11, backoffPolicyIntToBackoffPolicy, j9, j10, i13, i15, j11, i18, (ArrayList) map.get(cursorB.getString(iQ)), (ArrayList) map2.get(cursorB.getString(iQ))));
                    }
                    cursorB.close();
                    return arrayList;
                } catch (Throwable th) {
                    cursorB.close();
                    throw th;
                }
            }
        });
    }
}
