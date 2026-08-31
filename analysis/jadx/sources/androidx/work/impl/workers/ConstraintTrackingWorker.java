package androidx.work.impl.workers;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.c;
import s5.e;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters workerParameters;

    public static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ConstraintUnsatisfiedException(int i) {
            this.stopReason = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int getStopReason() {
            return this.stopReason;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2, reason: invalid class name */
    @e(c = "androidx.work.impl.workers.ConstraintTrackingWorker$doWork$2", f = "ConstraintTrackingWorker.kt", l = {58}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements B5.e {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AnonymousClass2(InterfaceC1524c<? super AnonymousClass2> interfaceC1524c) {
            super(2, interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            return ConstraintTrackingWorker.this.new AnonymousClass2(interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super ListenableWorker.Result> interfaceC1524c) {
            return ((AnonymousClass2) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
                return obj;
            }
            AbstractC1362a.e(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            this.label = 1;
            Object obj2 = constraintTrackingWorker.setupAndRunConstraintTrackingWork(this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            return obj2 == enumC1580a ? enumC1580a : obj2;
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1, reason: invalid class name */
    @e(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", l = {125}, m = "runWorker")
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AnonymousClass1(InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(interfaceC1524c);
        }

        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.runWorker(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2, reason: invalid class name and case insensitive filesystem */
    @e(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class C06812 extends i implements B5.e {
        final /* synthetic */ ListenableWorker $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06812(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, InterfaceC1524c<? super C06812> interfaceC1524c) {
            super(2, interfaceC1524c);
            this.$delegate = listenableWorker;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            C06812 c06812 = new C06812(this.$delegate, this.$workConstraintsTracker, this.$workSpec, interfaceC1524c);
            c06812.L$0 = obj;
            return c06812;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super ListenableWorker.Result> interfaceC1524c) {
            return ((C06812) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
        @Override // s5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                r1 = 0
                r2 = -256(0xffffffffffffff00, float:NaN)
                r3 = 1
                java.lang.String r4 = "Delegated worker "
                if (r0 == 0) goto L2e
                if (r0 != r3) goto L26
                java.lang.Object r0 = r11.L$2
                r5 = r0
                M5.b0 r5 = (M5.InterfaceC0241b0) r5
                java.lang.Object r0 = r11.L$1
                r6 = r0
                I4.b r6 = (I4.b) r6
                java.lang.Object r0 = r11.L$0
                r7 = r0
                java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
                m5.AbstractC1362a.e(r12)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L22
                goto L67
            L1f:
                r0 = move-exception
                r12 = r0
                goto L72
            L22:
                r0 = move-exception
                r12 = r0
                goto L98
            L26:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2e:
                m5.AbstractC1362a.e(r12)
                java.lang.Object r12 = r11.L$0
                M5.w r12 = (M5.InterfaceC0261w) r12
                java.util.concurrent.atomic.AtomicInteger r8 = new java.util.concurrent.atomic.AtomicInteger
                r8.<init>(r2)
                androidx.work.ListenableWorker r0 = r11.$delegate
                I4.b r9 = r0.startWork()
                java.lang.String r0 = "delegate.startWork()"
                kotlin.jvm.internal.m.d(r9, r0)
                androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1 r5 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1
                androidx.work.impl.constraints.WorkConstraintsTracker r6 = r11.$workConstraintsTracker
                androidx.work.impl.model.WorkSpec r7 = r11.$workSpec
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r0 = 3
                M5.B r5 = M5.AbstractC0263y.t(r12, r1, r1, r5, r0)
                r11.L$0 = r8     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L6d
                r11.L$1 = r9     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L6d
                r11.L$2 = r5     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L6d
                r11.label = r3     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L6d
                java.lang.Object r12 = a.AbstractC0597a.f(r9, r11)     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L6d
                r5.a r0 = r5.EnumC1580a.f16356q
                if (r12 != r0) goto L65
                return r0
            L65:
                r7 = r8
                r6 = r9
            L67:
                androidx.work.ListenableWorker$Result r12 = (androidx.work.ListenableWorker.Result) r12     // Catch: java.lang.Throwable -> L1f java.util.concurrent.CancellationException -> L22
                r5.a(r1)
                return r12
            L6d:
                r0 = move-exception
                r12 = r0
                r7 = r8
                r6 = r9
                goto L98
            L72:
                java.lang.String r0 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$getTAG$p()     // Catch: java.lang.Throwable -> L95
                androidx.work.ListenableWorker r2 = r11.$delegate     // Catch: java.lang.Throwable -> L95
                androidx.work.Logger r3 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L95
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
                r6.<init>(r4)     // Catch: java.lang.Throwable -> L95
                java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L95
                r6.append(r2)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = " threw exception in startWork."
                r6.append(r2)     // Catch: java.lang.Throwable -> L95
                java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L95
                r3.debug(r0, r2, r12)     // Catch: java.lang.Throwable -> L95
                throw r12     // Catch: java.lang.Throwable -> L95
            L95:
                r0 = move-exception
                r12 = r0
                goto Ld5
            L98:
                java.lang.String r0 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$getTAG$p()     // Catch: java.lang.Throwable -> L95
                androidx.work.ListenableWorker r8 = r11.$delegate     // Catch: java.lang.Throwable -> L95
                androidx.work.Logger r9 = androidx.work.Logger.get()     // Catch: java.lang.Throwable -> L95
                java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
                r10.<init>(r4)     // Catch: java.lang.Throwable -> L95
                java.lang.Class r4 = r8.getClass()     // Catch: java.lang.Throwable -> L95
                r10.append(r4)     // Catch: java.lang.Throwable -> L95
                java.lang.String r4 = " was cancelled"
                r10.append(r4)     // Catch: java.lang.Throwable -> L95
                java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L95
                r9.debug(r0, r4, r12)     // Catch: java.lang.Throwable -> L95
                int r0 = r7.get()     // Catch: java.lang.Throwable -> L95
                if (r0 == r2) goto Lc1
                goto Lc2
            Lc1:
                r3 = 0
            Lc2:
                boolean r0 = r6.isCancelled()     // Catch: java.lang.Throwable -> L95
                if (r0 == 0) goto Ld4
                if (r3 == 0) goto Ld4
                androidx.work.impl.workers.ConstraintTrackingWorker$ConstraintUnsatisfiedException r12 = new androidx.work.impl.workers.ConstraintTrackingWorker$ConstraintUnsatisfiedException     // Catch: java.lang.Throwable -> L95
                int r0 = r7.get()     // Catch: java.lang.Throwable -> L95
                r12.<init>(r0)     // Catch: java.lang.Throwable -> L95
                throw r12     // Catch: java.lang.Throwable -> L95
            Ld4:
                throw r12     // Catch: java.lang.Throwable -> L95
            Ld5:
                r5.a(r1)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.C06812.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1, reason: invalid class name and case insensitive filesystem */
    @e(c = "androidx.work.impl.workers.ConstraintTrackingWorker", f = "ConstraintTrackingWorker.kt", l = {97}, m = "setupAndRunConstraintTrackingWork")
    public static final class C06821 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C06821(InterfaceC1524c<? super C06821> interfaceC1524c) {
            super(interfaceC1524c);
        }

        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConstraintTrackingWorker.this.setupAndRunConstraintTrackingWork(this);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5, reason: invalid class name */
    @e(c = "androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5", f = "ConstraintTrackingWorker.kt", l = {98}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends i implements B5.e {
        final /* synthetic */ ListenableWorker $delegate;
        final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
        final /* synthetic */ WorkSpec $workSpec;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, InterfaceC1524c<? super AnonymousClass5> interfaceC1524c) {
            super(2, interfaceC1524c);
            this.$delegate = listenableWorker;
            this.$workConstraintsTracker = workConstraintsTracker;
            this.$workSpec = workSpec;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            return ConstraintTrackingWorker.this.new AnonymousClass5(this.$delegate, this.$workConstraintsTracker, this.$workSpec, interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // B5.e
        public final Object invoke(InterfaceC0261w interfaceC0261w, InterfaceC1524c<? super ListenableWorker.Result> interfaceC1524c) {
            return ((AnonymousClass5) create(interfaceC0261w, interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
                return obj;
            }
            AbstractC1362a.e(obj);
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            ListenableWorker listenableWorker = this.$delegate;
            WorkConstraintsTracker workConstraintsTracker = this.$workConstraintsTracker;
            WorkSpec workSpec = this.$workSpec;
            this.label = 1;
            Object objRunWorker = constraintTrackingWorker.runWorker(listenableWorker, workConstraintsTracker, workSpec, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            return objRunWorker == enumC1580a ? enumC1580a : objRunWorker;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        m.e(appContext, "appContext");
        m.e(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runWorker(androidx.work.ListenableWorker r5, androidx.work.impl.constraints.WorkConstraintsTracker r6, androidx.work.impl.model.WorkSpec r7, q5.InterfaceC1524c<? super androidx.work.ListenableWorker.Result> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorker.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            m5.AbstractC1362a.e(r8)
            goto L41
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            m5.AbstractC1362a.e(r8)
            androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2 r8 = new androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2
            r1 = 0
            r8.<init>(r5, r6, r7, r1)
            r0.label = r2
            java.lang.Object r8 = M5.AbstractC0263y.g(r8, r0)
            r5.a r5 = r5.EnumC1580a.f16356q
            if (r8 != r5) goto L41
            return r5
        L41:
            java.lang.String r5 = "delegate: ListenableWork….cancel()\n        }\n    }"
            kotlin.jvm.internal.m.d(r8, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.runWorker(androidx.work.ListenableWorker, androidx.work.impl.constraints.WorkConstraintsTracker, androidx.work.impl.model.WorkSpec, q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupAndRunConstraintTrackingWork(q5.InterfaceC1524c<? super androidx.work.ListenableWorker.Result> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.C06821
            if (r0 == 0) goto L13
            r0 = r15
            androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 r0 = (androidx.work.impl.workers.ConstraintTrackingWorker.C06821) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 r0 = new androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            java.lang.Object r1 = r0.L$1
            androidx.work.ListenableWorker r1 = (androidx.work.ListenableWorker) r1
            java.lang.Object r0 = r0.L$0
            r2 = r0
            androidx.work.impl.workers.ConstraintTrackingWorker r2 = (androidx.work.impl.workers.ConstraintTrackingWorker) r2
            m5.AbstractC1362a.e(r15)     // Catch: java.util.concurrent.CancellationException -> L30
            r9 = r14
            goto L11c
        L30:
            r0 = move-exception
            r15 = r0
            r9 = r14
            goto L12a
        L35:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3d:
            m5.AbstractC1362a.e(r15)
            androidx.work.Data r15 = r14.getInputData()
            java.lang.String r1 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.lang.String r15 = r15.getString(r1)
            java.lang.String r1 = "No worker to delegate to."
            java.lang.String r3 = "failure()"
            if (r15 == 0) goto L56
            int r4 = r15.length()
            if (r4 != 0) goto L59
        L56:
            r9 = r14
            goto L19a
        L59:
            android.content.Context r4 = r14.getApplicationContext()
            androidx.work.impl.WorkManagerImpl r4 = androidx.work.impl.WorkManagerImpl.getInstance(r4)
            java.lang.String r5 = "getInstance(applicationContext)"
            kotlin.jvm.internal.m.d(r4, r5)
            androidx.work.impl.WorkDatabase r5 = r4.getWorkDatabase()
            androidx.work.impl.model.WorkSpecDao r5 = r5.workSpecDao()
            java.util.UUID r6 = r14.getId()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "id.toString()"
            kotlin.jvm.internal.m.d(r6, r7)
            androidx.work.impl.model.WorkSpec r12 = r5.getWorkSpec(r6)
            if (r12 != 0) goto L89
            androidx.work.ListenableWorker$Result r15 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.m.d(r15, r3)
            return r15
        L89:
            androidx.work.impl.constraints.WorkConstraintsTracker r11 = new androidx.work.impl.constraints.WorkConstraintsTracker
            androidx.work.impl.constraints.trackers.Trackers r5 = r4.getTrackers()
            java.lang.String r6 = "workManagerImpl.trackers"
            kotlin.jvm.internal.m.d(r5, r6)
            r11.<init>(r5)
            boolean r5 = r11.areAllConstraintsMet(r12)
            if (r5 != 0) goto Lc5
            java.lang.String r0 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$getTAG$p()
            androidx.work.Logger r1 = androidx.work.Logger.get()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Constraints not met for delegate "
            r2.<init>(r3)
            r2.append(r15)
            java.lang.String r15 = ". Requesting retry."
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            r1.debug(r0, r15)
            androidx.work.ListenableWorker$Result r15 = androidx.work.ListenableWorker.Result.retry()
            java.lang.String r0 = "retry()"
            kotlin.jvm.internal.m.d(r15, r0)
            return r15
        Lc5:
            java.lang.String r5 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$getTAG$p()
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Constraints met for delegate "
            r7.<init>(r8)
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            r6.debug(r5, r7)
            androidx.work.WorkerFactory r5 = r14.getWorkerFactory()     // Catch: java.lang.Throwable -> L16d
            android.content.Context r6 = r14.getApplicationContext()     // Catch: java.lang.Throwable -> L16d
            java.lang.String r7 = "applicationContext"
            kotlin.jvm.internal.m.d(r6, r7)     // Catch: java.lang.Throwable -> L16d
            androidx.work.WorkerParameters r7 = r14.workerParameters     // Catch: java.lang.Throwable -> L16d
            androidx.work.ListenableWorker r10 = r5.createWorkerWithDefaultFallback(r6, r15, r7)     // Catch: java.lang.Throwable -> L16d
            androidx.work.WorkerParameters r15 = r14.workerParameters
            androidx.work.impl.utils.taskexecutor.TaskExecutor r15 = r15.getTaskExecutor()
            java.util.concurrent.Executor r15 = r15.getMainThreadExecutor()
            java.lang.String r1 = "workerParameters.taskExecutor.mainThreadExecutor"
            kotlin.jvm.internal.m.d(r15, r1)
            M5.s r15 = M5.AbstractC0263y.k(r15)     // Catch: java.util.concurrent.CancellationException -> L127
            androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 r8 = new androidx.work.impl.workers.ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5     // Catch: java.util.concurrent.CancellationException -> L127
            r13 = 0
            r9 = r14
            r8.<init>(r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> L122
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L122
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> L122
            r0.label = r2     // Catch: java.util.concurrent.CancellationException -> L122
            java.lang.Object r15 = M5.AbstractC0263y.B(r15, r8, r0)     // Catch: java.util.concurrent.CancellationException -> L122
            r5.a r0 = r5.EnumC1580a.f16356q
            if (r15 != r0) goto L11a
            return r0
        L11a:
            r2 = r9
            r1 = r10
        L11c:
            androidx.work.ListenableWorker$Result r15 = (androidx.work.ListenableWorker.Result) r15     // Catch: java.util.concurrent.CancellationException -> L11f
            return r15
        L11f:
            r0 = move-exception
            r15 = r0
            goto L12a
        L122:
            r0 = move-exception
        L123:
            r15 = r0
            r2 = r9
            r1 = r10
            goto L12a
        L127:
            r0 = move-exception
            r9 = r14
            goto L123
        L12a:
            boolean r0 = r2.isStopped()
            if (r0 != 0) goto L134
            boolean r0 = r15 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException
            if (r0 == 0) goto L156
        L134:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r0 >= r3) goto L13d
            r0 = -512(0xfffffffffffffe00, float:NaN)
            goto L153
        L13d:
            boolean r0 = r2.isStopped()
            if (r0 == 0) goto L148
            int r0 = r2.getStopReason()
            goto L153
        L148:
            boolean r0 = r15 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException
            if (r0 == 0) goto L165
            r0 = r15
            androidx.work.impl.workers.ConstraintTrackingWorker$ConstraintUnsatisfiedException r0 = (androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException) r0
            int r0 = r0.getStopReason()
        L153:
            r1.stop(r0)
        L156:
            boolean r0 = r15 instanceof androidx.work.impl.workers.ConstraintTrackingWorker.ConstraintUnsatisfiedException
            if (r0 == 0) goto L164
            androidx.work.ListenableWorker$Result r15 = androidx.work.ListenableWorker.Result.retry()
            java.lang.String r0 = "{\n            // there a…throw cancelled\n        }"
            kotlin.jvm.internal.m.d(r15, r0)
            return r15
        L164:
            throw r15
        L165:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unreachable"
            r15.<init>(r0)
            throw r15
        L16d:
            r0 = move-exception
            r9 = r14
            java.lang.String r2 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$getTAG$p()
            androidx.work.Logger r5 = androidx.work.Logger.get()
            r5.debug(r2, r1)
            androidx.work.Configuration r1 = r4.getConfiguration()
            v1.a r1 = r1.getWorkerInitializationExceptionHandler()
            if (r1 == 0) goto L192
            androidx.work.WorkerExceptionInfo r2 = new androidx.work.WorkerExceptionInfo
            androidx.work.WorkerParameters r4 = r9.workerParameters
            r2.<init>(r15, r4, r0)
            java.lang.String r15 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$getTAG$p()
            androidx.work.impl.utils.WorkerExceptionUtilsKt.safeAccept(r1, r2, r15)
        L192:
            androidx.work.ListenableWorker$Result r15 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.m.d(r15, r3)
            return r15
        L19a:
            java.lang.String r15 = androidx.work.impl.workers.ConstraintTrackingWorkerKt.access$getTAG$p()
            androidx.work.Logger r0 = androidx.work.Logger.get()
            r0.error(r15, r1)
            androidx.work.ListenableWorker$Result r15 = androidx.work.ListenableWorker.Result.failure()
            kotlin.jvm.internal.m.d(r15, r3)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.setupAndRunConstraintTrackingWork(q5.c):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC1524c<? super ListenableWorker.Result> interfaceC1524c) {
        Executor backgroundExecutor = getBackgroundExecutor();
        m.d(backgroundExecutor, "backgroundExecutor");
        return AbstractC0263y.B(AbstractC0263y.k(backgroundExecutor), new AnonymousClass2(null), interfaceC1524c);
    }
}
