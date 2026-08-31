package com.google.android.gms.measurement;

import I4.a;
import O3.InterfaceC0342z1;
import O3.RunnableC0335x0;
import O3.T1;
import O3.X;
import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.WorkManagerImpl;
import com.google.android.gms.internal.measurement.C0779c0;
import com.google.android.gms.internal.measurement.C0863t0;
import java.util.Objects;
import k3.d;
import s4.e;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(WorkManagerImpl.CONTENT_URI_TRIGGER_API_LEVEL)
public final class AppMeasurementJobService extends JobService implements InterfaceC0342z1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f11333q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0342z1
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0342z1
    public final void b(Intent intent) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.InterfaceC0342z1
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d d() {
        if (this.f11333q == null) {
            this.f11333q = new d(12, this);
        }
        return this.f11333q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f14122r).getClass().getSimpleName().concat(" is starting up."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().f14122r).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        d dVarD = d();
        Service service = (Service) dVarD.f14122r;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            AbstractC1887A.g(string);
            T1 t1B = T1.B(service);
            X xB = t1B.b();
            e eVar = t1B.f4582B.f5074s;
            xB.f4666E.c(string, "Local AppMeasurementJobService called. action");
            t1B.c().x(new a(dVarD, t1B, new RunnableC0335x0(dVarD, xB, jobParameters, 8), 16));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        AbstractC1887A.g(string);
        C0863t0 c0863t0E = C0863t0.e(service, null);
        a aVar = new a(17, dVarD, jobParameters);
        c0863t0E.getClass();
        c0863t0E.c(new C0779c0(c0863t0E, aVar, 1));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
