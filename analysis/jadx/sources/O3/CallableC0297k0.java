package O3;

import B0.C0050o;
import com.google.android.gms.internal.measurement.E2;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: O3.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC0297k0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0300l0 f4935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4936c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ CallableC0297k0(C0300l0 c0300l0, String str, int i) {
        this.f4934a = i;
        this.f4935b = c0300l0;
        this.f4936c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4934a) {
            case 0:
                return new com.google.android.gms.internal.measurement.R1(new CallableC0297k0(this.f4935b, this.f4936c, 1));
            case 1:
                C0300l0 c0300l0 = this.f4935b;
                C0305n c0305n = c0300l0.f4510s.f4609s;
                T1.S(c0305n);
                String str = this.f4936c;
                C0273c0 c0273c0S0 = c0305n.s0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((C0323t0) c0300l0.f4346r).f5075t.t();
                map.put("gmp_version", 130000L);
                if (c0273c0S0 != null) {
                    String strN = c0273c0S0.N();
                    if (strN != null) {
                        map.put("app_version", strN);
                    }
                    map.put("app_version_int", Long.valueOf(c0273c0S0.P()));
                    map.put("dynamite_version", Long.valueOf(c0273c0S0.b()));
                }
                return map;
            default:
                C0050o c0050o = new C0050o(this.f4935b, this.f4936c, false);
                E2 e22 = new E2("internal.remoteConfig", 0);
                e22.f10856r.put("getValue", new com.google.android.gms.internal.measurement.R1(e22, c0050o));
                return e22;
        }
    }
}
