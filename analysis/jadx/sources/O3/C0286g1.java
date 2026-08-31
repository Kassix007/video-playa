package O3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0286g1 extends H {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JobScheduler f4864t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.H
    public final boolean r() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(long j) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        p();
        o();
        JobScheduler jobScheduler = this.f4864t;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(c0323t0.f5072q.getPackageName())).hashCode()) != null) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4666E.b("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iT = t();
        if (iT != 2) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4666E.c(C0.S.y(iT), "[sgtm] Not eligible for Scion upload");
            return;
        }
        X x8 = c0323t0.f5077v;
        C0323t0.l(x8);
        x8.f4666E.c(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(c0323t0.f5072q.getPackageName())).hashCode(), new ComponentName(c0323t0.f5072q, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f4864t;
        AbstractC1887A.g(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        X x9 = c0323t0.f5077v;
        C0323t0.l(x9);
        x9.f4666E.c(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int t() {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        p();
        o();
        if (this.f4864t == null) {
            return 7;
        }
        Boolean boolA = c0323t0.f5075t.A("google_analytics_sgtm_upload_enabled");
        if (!(boolA == null ? false : boolA.booleanValue())) {
            return 8;
        }
        if (c0323t0.q().f4519A < 119000) {
            return 6;
        }
        if (Y1.H(c0323t0.f5072q)) {
            return !c0323t0.o().v() ? 5 : 2;
        }
        return 3;
    }
}
