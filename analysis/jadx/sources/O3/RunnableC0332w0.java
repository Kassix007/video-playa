package O3;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;

/* JADX INFO: renamed from: O3.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0332w0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f5104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5105u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5106v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0332w0(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.f5101q = i;
        this.f5102r = str;
        this.f5103s = str2;
        this.f5105u = obj2;
        this.f5104t = j;
        this.f5106v = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5101q) {
            case 0:
                String str = (String) this.f5103s;
                C0 c02 = (C0) this.f5106v;
                String str2 = (String) this.f5102r;
                if (str2 != null) {
                    C0295j1 c0295j1 = new C0295j1((String) this.f5105u, str2, this.f5104t);
                    T1 t12 = c02.f4330c;
                    t12.c().o();
                    String str3 = t12.f4603W;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    t12.f4603W = str;
                    t12.f4602V = c0295j1;
                } else {
                    T1 t13 = c02.f4330c;
                    t13.c().o();
                    String str4 = t13.f4603W;
                    if (str4 == null || str4.equals(str)) {
                        t13.f4603W = str;
                        t13.f4602V = null;
                    }
                }
                break;
            case 1:
                C0271b1 c0271b1 = (C0271b1) this.f5106v;
                String str5 = (String) this.f5102r;
                String str6 = (String) this.f5103s;
                c0271b1.z(this.f5104t, this.f5105u, str5, str6);
                break;
            default:
                C0304m1 c0304m1 = (C0304m1) this.f5106v;
                Bundle bundle = (Bundle) this.f5102r;
                C0295j1 c0295j12 = (C0295j1) this.f5103s;
                C0295j1 c0295j13 = (C0295j1) this.f5105u;
                c0304m1.getClass();
                bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
                bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
                Y1 y12 = ((C0323t0) c0304m1.f4346r).f5080y;
                C0323t0.j(y12);
                c0304m1.y(c0295j12, c0295j13, this.f5104t, true, y12.w(FirebaseAnalytics.Event.SCREEN_VIEW, bundle, null, false));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RunnableC0332w0(C0304m1 c0304m1, Bundle bundle, C0295j1 c0295j1, C0295j1 c0295j12, long j) {
        this.f5101q = 2;
        this.f5102r = bundle;
        this.f5103s = c0295j1;
        this.f5105u = c0295j12;
        this.f5104t = j;
        Objects.requireNonNull(c0304m1);
        this.f5106v = c0304m1;
    }
}
