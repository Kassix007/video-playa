package R4;

import android.app.ActivityManager;
import android.widget.Toast;
import com.web2native.MainActivity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: R4.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0452g1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MainActivity f6963r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0452g1(MainActivity mainActivity, int i) {
        this.f6962q = i;
        this.f6963r = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6962q) {
            case 0:
                MainActivity mainActivity = this.f6963r;
                C0468k1 c0468k1 = mainActivity.f11778Q;
                if (c0468k1 == null) {
                    kotlin.jvm.internal.m.k("dataObject");
                    throw null;
                }
                Object systemService = mainActivity.getSystemService("activity");
                kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                boolean z5 = false;
                if (runningAppProcesses != null) {
                    mainActivity.getPackageName();
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    if (!it.hasNext() || it.next().importance != 100) {
                        z5 = true;
                    }
                }
                c0468k1.f7063W = z5;
                return;
            default:
                Toast.makeText(this.f6963r, "Please wait, downloading file to share..", 0).show();
                return;
        }
    }
}
