package O3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class J1 extends O1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AlarmManager f4499u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1 f4500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f4501w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J1(T1 t12) {
        super(t12);
        this.f4499u = (AlarmManager) ((C0323t0) this.f4346r).f5072q.getSystemService("alarm");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.O1
    public final void r() {
        AlarmManager alarmManager = this.f4499u;
        if (alarmManager != null) {
            Context context = ((C0323t0) this.f4346r).f5072q;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.E.f10625a));
        }
        u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        p();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4666E.b("Unscheduling upload");
        AlarmManager alarmManager = this.f4499u;
        if (alarmManager != null) {
            Context context = c0323t0.f5072q;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.E.f10625a));
        }
        t().c();
        u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0308o t() {
        if (this.f4500v == null) {
            this.f4500v = new C1(this, this.f4510s.f4582B, 1);
        }
        return this.f4500v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        JobScheduler jobScheduler = (JobScheduler) ((C0323t0) this.f4346r).f5072q.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(v());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int v() {
        if (this.f4501w == null) {
            this.f4501w = Integer.valueOf("measurement".concat(String.valueOf(((C0323t0) this.f4346r).f5072q.getPackageName())).hashCode());
        }
        return this.f4501w.intValue();
    }
}
