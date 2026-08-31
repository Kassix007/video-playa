package O3;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: O3.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0339y1 extends O1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0282f0 f5161A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f5162u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0282f0 f5163v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0282f0 f5164w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0282f0 f5165x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0282f0 f5166y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0282f0 f5167z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0339y1(T1 t12) {
        super(t12);
        this.f5162u = new HashMap();
        C0288h0 c0288h0 = ((C0323t0) this.f4346r).f5076u;
        C0323t0.j(c0288h0);
        this.f5163v = new C0282f0(c0288h0, "last_delete_stale", 0L);
        C0288h0 c0288h02 = ((C0323t0) this.f4346r).f5076u;
        C0323t0.j(c0288h02);
        this.f5164w = new C0282f0(c0288h02, "last_delete_stale_batch", 0L);
        C0288h0 c0288h03 = ((C0323t0) this.f4346r).f5076u;
        C0323t0.j(c0288h03);
        this.f5165x = new C0282f0(c0288h03, "backoff", 0L);
        C0288h0 c0288h04 = ((C0323t0) this.f4346r).f5076u;
        C0323t0.j(c0288h04);
        this.f5166y = new C0282f0(c0288h04, "last_upload", 0L);
        C0288h0 c0288h05 = ((C0323t0) this.f4346r).f5076u;
        C0323t0.j(c0288h05);
        this.f5167z = new C0282f0(c0288h05, "last_upload_attempt", 0L);
        C0288h0 c0288h06 = ((C0323t0) this.f4346r).f5076u;
        C0323t0.j(c0288h06);
        this.f5161A = new C0282f0(c0288h06, "midnight_offset", 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Pair s(String str) {
        AdvertisingIdClient.Info advertisingIdInfo;
        C0336x1 c0336x1;
        o();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        B3.a aVar = c0323t0.f5052A;
        C0284g c0284g = c0323t0.f5075t;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f5162u;
        C0336x1 c0336x12 = (C0336x1) map.get(str);
        if (c0336x12 != null && jElapsedRealtime < c0336x12.f5124c) {
            return new Pair(c0336x12.f5122a, Boolean.valueOf(c0336x12.f5123b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jV = c0284g.v(str, F.f4415b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(c0323t0.f5072q);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c0336x12 != null && jElapsedRealtime < c0336x12.f5124c + c0284g.v(str, F.f4418c)) {
                    return new Pair(c0336x12.f5122a, Boolean.valueOf(c0336x12.f5123b));
                }
                advertisingIdInfo = null;
            }
        } catch (Exception e7) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4665D.c(e7, "Unable to get advertising id");
            c0336x1 = new C0336x1("", false, jV);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        c0336x1 = id != null ? new C0336x1(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jV) : new C0336x1("", advertisingIdInfo.isLimitAdTrackingEnabled(), jV);
        map.put(str, c0336x1);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(c0336x1.f5122a, Boolean.valueOf(c0336x1.f5123b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String t(String str, boolean z5) {
        o();
        String str2 = z5 ? (String) s(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestF = Y1.F();
        if (messageDigestF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestF.digest(str2.getBytes())));
    }

    @Override // O3.O1
    public final void r() {
    }
}
