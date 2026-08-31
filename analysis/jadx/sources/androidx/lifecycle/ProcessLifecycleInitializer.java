package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import m2.C1358a;
import m2.InterfaceC1359b;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1359b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public final Object create(Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        C1358a c1358aC = C1358a.c(context);
        kotlin.jvm.internal.m.d(c1358aC, "getInstance(...)");
        if (!c1358aC.f15053b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0657u.f9567a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.m.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0656t());
        }
        O o6 = O.f9496y;
        o6.getClass();
        o6.f9501u = new Handler();
        o6.f9502v.f(EnumC0652o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.m.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new N(o6));
        return o6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m2.InterfaceC1359b
    public final List dependencies() {
        return n5.s.f15299q;
    }
}
