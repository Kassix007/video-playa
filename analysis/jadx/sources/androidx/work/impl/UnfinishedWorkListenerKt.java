package androidx.work.impl;

import B5.g;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import P5.C0400k;
import P5.H;
import P5.InterfaceC0398i;
import P5.r;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class UnfinishedWorkListenerKt {
    private static final int DELAY_MS = 30000;
    private static final long MAX_DELAY_MS;
    private static final String TAG;

    /* JADX INFO: renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1, reason: invalid class name */
    @s5.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements g {
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AnonymousClass1(InterfaceC1524c<? super AnonymousClass1> interfaceC1524c) {
            super(4, interfaceC1524c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final Object invoke(InterfaceC0398i interfaceC0398i, Throwable th, long j, InterfaceC1524c<? super Boolean> interfaceC1524c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC1524c);
            anonymousClass1.L$0 = th;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(C1386y.f15098a);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                AbstractC1362a.e(obj);
                Throwable th = (Throwable) this.L$0;
                long j = this.J$0;
                Logger.get().error(UnfinishedWorkListenerKt.TAG, "Cannot check for unfinished work", th);
                long jMin = Math.min(j * ((long) UnfinishedWorkListenerKt.DELAY_MS), UnfinishedWorkListenerKt.MAX_DELAY_MS);
                this.label = 1;
                Object objH = AbstractC0263y.h(jMin, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objH == enumC1580a) {
                    return enumC1580a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1362a.e(obj);
            }
            return Boolean.TRUE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // B5.g
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((InterfaceC0398i) obj, (Throwable) obj2, ((Number) obj3).longValue(), (InterfaceC1524c<? super Boolean>) obj4);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2, reason: invalid class name */
    @s5.e(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements B5.e {
        final /* synthetic */ Context $appContext;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, InterfaceC1524c<? super AnonymousClass2> interfaceC1524c) {
            super(2, interfaceC1524c);
            this.$appContext = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final InterfaceC1524c<C1386y> create(Object obj, InterfaceC1524c<?> interfaceC1524c) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$appContext, interfaceC1524c);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // B5.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC1524c<? super C1386y>) obj2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // s5.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            PackageManagerHelper.setComponentEnabled(this.$appContext, RescheduleReceiver.class, this.Z$0);
            return C1386y.f15098a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final Object invoke(boolean z5, InterfaceC1524c<? super C1386y> interfaceC1524c) {
            return ((AnonymousClass2) create(Boolean.valueOf(z5), interfaceC1524c)).invokeSuspend(C1386y.f15098a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String strTagWithPrefix = Logger.tagWithPrefix("UnfinishedWorkListener");
        m.d(strTagWithPrefix, "tagWithPrefix(\"UnfinishedWorkListener\")");
        TAG = strTagWithPrefix;
        MAX_DELAY_MS = TimeUnit.HOURS.toMillis(1L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void maybeLaunchUnfinishedWorkListener(InterfaceC0261w interfaceC0261w, Context appContext, Configuration configuration, WorkDatabase db) {
        m.e(interfaceC0261w, "<this>");
        m.e(appContext, "appContext");
        m.e(configuration, "configuration");
        m.e(db, "db");
        if (ProcessUtils.isDefaultProcess(appContext, configuration)) {
            AbstractC0263y.t(interfaceC0261w, null, null, new C0400k(new r(H.g(H.e(new r(db.workSpecDao().hasUnfinishedWorkFlow(), new AnonymousClass1(null), 0), -1)), new AnonymousClass2(appContext, null)), null), 3);
        }
    }
}
