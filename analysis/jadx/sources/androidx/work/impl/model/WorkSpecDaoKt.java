package androidx.work.impl.model;

import M5.AbstractC0257s;
import M5.C0258t;
import P5.H;
import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import Q5.AbstractC0423c;
import Q5.j;
import Q5.v;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.UUID;
import kotlin.jvm.internal.m;
import m5.C1386y;
import q5.C1530i;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.c;
import s5.e;

/* JADX INFO: loaded from: classes.dex */
public final class WorkSpecDaoKt {
    private static final String WORK_INFO_BY_IDS = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (:ids)";
    private static final String WORK_INFO_BY_NAME = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)";
    private static final String WORK_INFO_BY_TAG = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)";
    private static final String WORK_INFO_COLUMNS = "id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0397h dedup(final InterfaceC0397h interfaceC0397h, AbstractC0257s dispatcher) {
        m.e(interfaceC0397h, "<this>");
        m.e(dispatcher, "dispatcher");
        InterfaceC0397h interfaceC0397hG = H.g(new InterfaceC0397h() { // from class: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1

            /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0398i {
                final /* synthetic */ InterfaceC0398i $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1, reason: invalid class name */
                @e(c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public AnonymousClass1(InterfaceC1524c interfaceC1524c) {
                        super(interfaceC1524c);
                    }

                    @Override // s5.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public AnonymousClass2(InterfaceC0398i interfaceC0398i) {
                    this.$this_unsafeFlow = interfaceC0398i;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // P5.InterfaceC0398i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, q5.InterfaceC1524c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        m5.AbstractC1362a.e(r6)
                        goto L64
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        m5.AbstractC1362a.e(r6)
                        P5.i r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r3 = 10
                        int r3 = n5.m.c0(r5, r3)
                        r1.<init>(r3)
                        java.util.Iterator r5 = r5.iterator()
                    L45:
                        boolean r3 = r5.hasNext()
                        if (r3 == 0) goto L59
                        java.lang.Object r3 = r5.next()
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r3 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r3
                        androidx.work.WorkInfo r3 = r3.toWorkInfo()
                        r1.add(r3)
                        goto L45
                    L59:
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r1, r0)
                        r5.a r6 = r5.EnumC1580a.f16356q
                        if (r5 != r6) goto L64
                        return r6
                    L64:
                        m5.y r5 = m5.C1386y.f15098a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, q5.c):java.lang.Object");
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // P5.InterfaceC0397h
            public Object collect(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
                Object objCollect = interfaceC0397h.collect(new AnonymousClass2(interfaceC0398i), interfaceC1524c);
                return objCollect == EnumC1580a.f16356q ? objCollect : C1386y.f15098a;
            }
        });
        if (dispatcher.get(C0258t.f3885r) == null) {
            return dispatcher.equals(C1530i.f16022q) ? interfaceC0397hG : interfaceC0397hG instanceof v ? AbstractC0423c.a((v) interfaceC0397hG, dispatcher, 0, null, 6) : new j(interfaceC0397hG, dispatcher, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + dispatcher).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0397h getWorkStatusPojoFlowDataForIds(WorkSpecDao workSpecDao, UUID id) {
        m.e(workSpecDao, "<this>");
        m.e(id, "id");
        final InterfaceC0397h workStatusPojoFlowDataForIds = workSpecDao.getWorkStatusPojoFlowDataForIds(AbstractC0836n2.z(String.valueOf(id)));
        return H.g(new InterfaceC0397h() { // from class: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1

            /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC0398i {
                final /* synthetic */ InterfaceC0398i $this_unsafeFlow;

                /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1, reason: invalid class name */
                @e(c = "androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2", f = "WorkSpecDao.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public AnonymousClass1(InterfaceC1524c interfaceC1524c) {
                        super(interfaceC1524c);
                    }

                    @Override // s5.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public AnonymousClass2(InterfaceC0398i interfaceC0398i) {
                    this.$this_unsafeFlow = interfaceC0398i;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // P5.InterfaceC0398i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, q5.InterfaceC1524c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = (androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1 r0 = new androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        m5.AbstractC1362a.e(r6)
                        goto L4d
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        m5.AbstractC1362a.e(r6)
                        P5.i r6 = r4.$this_unsafeFlow
                        java.util.List r5 = (java.util.List) r5
                        java.lang.Object r5 = n5.l.m0(r5)
                        androidx.work.impl.model.WorkSpec$WorkInfoPojo r5 = (androidx.work.impl.model.WorkSpec.WorkInfoPojo) r5
                        if (r5 == 0) goto L41
                        androidx.work.WorkInfo r5 = r5.toWorkInfo()
                        goto L42
                    L41:
                        r5 = 0
                    L42:
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        r5.a r6 = r5.EnumC1580a.f16356q
                        if (r5 != r6) goto L4d
                        return r6
                    L4d:
                        m5.y r5 = m5.C1386y.f15098a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkSpecDaoKt$getWorkStatusPojoFlowDataForIds$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, q5.c):java.lang.Object");
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // P5.InterfaceC0397h
            public Object collect(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
                Object objCollect = workStatusPojoFlowDataForIds.collect(new AnonymousClass2(interfaceC0398i), interfaceC1524c);
                return objCollect == EnumC1580a.f16356q ? objCollect : C1386y.f15098a;
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0397h getWorkStatusPojoFlowForName(WorkSpecDao workSpecDao, AbstractC0257s dispatcher, String name) {
        m.e(workSpecDao, "<this>");
        m.e(dispatcher, "dispatcher");
        m.e(name, "name");
        return dedup(workSpecDao.getWorkStatusPojoFlowForName(name), dispatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0397h getWorkStatusPojoFlowForTag(WorkSpecDao workSpecDao, AbstractC0257s dispatcher, String tag) {
        m.e(workSpecDao, "<this>");
        m.e(dispatcher, "dispatcher");
        m.e(tag, "tag");
        return dedup(workSpecDao.getWorkStatusPojoFlowForTag(tag), dispatcher);
    }
}
