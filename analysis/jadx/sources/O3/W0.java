package O3;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.TreeSet;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class W0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f4655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0271b1 f4656s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ W0(C0271b1 c0271b1, Bundle bundle, int i) {
        this.f4654q = i;
        this.f4655r = bundle;
        this.f4656s = c0271b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f4654q) {
            case 0:
                C0271b1 c0271b1 = this.f4656s;
                c0271b1.o();
                c0271b1.p();
                Bundle bundle2 = this.f4655r;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString(FirebaseAnalytics.Param.ORIGIN);
                AbstractC1887A.d(string);
                AbstractC1887A.d(string2);
                AbstractC1887A.g(bundle2.get(FirebaseAnalytics.Param.VALUE));
                C0323t0 c0323t0 = (C0323t0) c0271b1.f4346r;
                if (!c0323t0.a()) {
                    X x6 = c0323t0.f5077v;
                    C0323t0.l(x6);
                    x6.f4666E.b("Conditional property not set since app measurement is disabled");
                } else {
                    V1 v12 = new V1(bundle2.getLong("triggered_timestamp"), bundle2.get(FirebaseAnalytics.Param.VALUE), string, string2);
                    try {
                        Y1 y12 = c0323t0.f5080y;
                        C0323t0.j(y12);
                        bundle2.getString("app_id");
                        C0328v c0328vQ = y12.Q(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        C0323t0.j(y12);
                        bundle2.getString("app_id");
                        C0328v c0328vQ2 = y12.Q(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        c0323t0.o().H(new C0278e(bundle2.getString("app_id"), string2, v12, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), c0328vQ2, bundle2.getLong("trigger_timeout"), c0328vQ, bundle2.getLong("time_to_live"), y12.Q(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                C0271b1 c0271b12 = this.f4656s;
                c0271b12.o();
                c0271b12.p();
                Bundle bundle3 = this.f4655r;
                String string3 = bundle3.getString("name");
                AbstractC1887A.d(string3);
                C0323t0 c0323t02 = (C0323t0) c0271b12.f4346r;
                if (!c0323t02.a()) {
                    X x7 = c0323t02.f5077v;
                    C0323t0.l(x7);
                    x7.f4666E.b("Conditional property not cleared since app measurement is disabled");
                } else {
                    V1 v13 = new V1(0L, null, string3, "");
                    try {
                        Y1 y13 = c0323t02.f5080y;
                        C0323t0.j(y13);
                        bundle3.getString("app_id");
                        c0323t02.o().H(new C0278e(bundle3.getString("app_id"), "", v13, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), y13.Q(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                C0271b1 c0271b13 = this.f4656s;
                k3.c cVar = c0271b13.f4760N;
                C0323t0 c0323t03 = (C0323t0) c0271b13.f4346r;
                Bundle bundle4 = this.f4655r;
                if (bundle4.isEmpty()) {
                    bundle = bundle4;
                } else {
                    C0288h0 c0288h0 = c0323t03.f5076u;
                    Y1 y14 = c0323t03.f5080y;
                    C0284g c0284g = c0323t03.f5075t;
                    X x8 = c0323t03.f5077v;
                    C0323t0.j(c0288h0);
                    bundle = new Bundle(c0288h0.f4892P.B());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            C0323t0.j(y14);
                            if (Y1.w0(obj)) {
                                Y1.E(cVar, null, 27, null, null, 0);
                            }
                            C0323t0.l(x8);
                            x8.f4663B.d(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (Y1.M(str)) {
                            C0323t0.l(x8);
                            x8.f4663B.c(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            C0323t0.j(y14);
                            c0284g.getClass();
                            if (y14.x0("param", str, 500, obj)) {
                                y14.D(bundle, str, obj);
                            }
                        }
                    }
                    C0323t0.j(y14);
                    Y1 y15 = ((C0323t0) c0284g.f4346r).f5080y;
                    C0323t0.j(y15);
                    int i = y15.T(201500000) ? 100 : 25;
                    if (bundle.size() > i) {
                        int i7 = 0;
                        for (String str2 : new TreeSet(bundle.keySet())) {
                            i7++;
                            if (i7 > i) {
                                bundle.remove(str2);
                            }
                        }
                        C0323t0.j(y14);
                        Y1.E(cVar, null, 26, null, null, 0);
                        C0323t0.l(x8);
                        x8.f4663B.b("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                C0288h0 c0288h02 = c0323t03.f5076u;
                C0323t0.j(c0288h02);
                c0288h02.f4892P.F(bundle);
                if (!bundle4.isEmpty() || c0323t03.f5075t.y(null, F.f4405W0)) {
                    c0323t03.o().t(bundle);
                }
                break;
        }
    }
}
