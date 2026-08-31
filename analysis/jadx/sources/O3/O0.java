package O3;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0271b1 f4545r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ O0(C0271b1 c0271b1, int i) {
        this.f4544q = i;
        this.f4545r = c0271b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4544q) {
            case 0:
                this.f4545r.K();
                break;
            case 1:
                C0317r0 c0317r0 = this.f4545r.f4755I;
                C0323t0 c0323t0 = c0317r0.f5036q;
                C0312p0 c0312p0 = c0323t0.f5078w;
                C0271b1 c0271b1 = c0323t0.f5054C;
                C0288h0 c0288h0 = c0323t0.f5076u;
                C0323t0.l(c0312p0);
                c0312p0.o();
                if (c0317r0.d()) {
                    if (c0317r0.c()) {
                        C0323t0.j(c0288h0);
                        c0288h0.f4890N.f(null);
                        Bundle bundle = new Bundle();
                        bundle.putString(FirebaseAnalytics.Param.SOURCE, "(not set)");
                        bundle.putString(FirebaseAnalytics.Param.MEDIUM, "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C0323t0.k(c0271b1);
                        c0271b1.v("auto", "_cmpx", bundle);
                    } else {
                        C0323t0.j(c0288h0);
                        K2.a aVar = c0288h0.f4890N;
                        String strE = aVar.e();
                        if (TextUtils.isEmpty(strE)) {
                            X x6 = c0323t0.f5077v;
                            C0323t0.l(x6);
                            x6.f4671x.b("Cache still valid but referrer not found");
                        } else {
                            long jA = c0288h0.f4891O.a() / 3600000;
                            Uri uri = Uri.parse(strE);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C0323t0.k(c0271b1);
                            c0271b1.v(str2, "_cmp", (Bundle) pair.second);
                        }
                        aVar.f(null);
                    }
                    C0323t0.j(c0288h0);
                    c0288h0.f4891O.b(0L);
                    break;
                }
                break;
            case 2:
                C0271b1 c0271b12 = this.f4545r;
                c0271b12.o();
                C0323t0 c0323t02 = (C0323t0) c0271b12.f4346r;
                C0288h0 c0288h02 = c0323t02.f5076u;
                X x7 = c0323t02.f5077v;
                C0323t0.j(c0288h02);
                C0279e0 c0279e0 = c0288h02.f4887K;
                if (c0279e0.d()) {
                    C0323t0.l(x7);
                    x7.f4665D.b("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    C0282f0 c0282f0 = c0288h02.f4888L;
                    long jA2 = c0282f0.a();
                    c0282f0.b(1 + jA2);
                    if (jA2 >= 5) {
                        C0323t0.l(x7);
                        x7.f4673z.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c0279e0.e(true);
                    } else {
                        if (c0271b12.f4757K == null) {
                            c0271b12.f4757K = new P0(c0271b12, c0323t02, 3);
                        }
                        c0271b12.f4757K.b(0L);
                    }
                }
                break;
            default:
                this.f4545r.K();
                break;
        }
    }
}
