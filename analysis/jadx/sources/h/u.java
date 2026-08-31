package h;

import B0.G0;
import C0.AbstractC0067b;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.measurement.P1;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC0067b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13321c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f13322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13323e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, G0 g02) {
        super(yVar);
        this.f13322d = yVar;
        this.f13323e = g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final IntentFilter e() {
        switch (this.f13321c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final int g() {
        Location location;
        boolean z5;
        long j;
        switch (this.f13321c) {
            case 0:
                return q.a((PowerManager) this.f13323e) ? 2 : 1;
            default:
                G0 g02 = (G0) this.f13323e;
                F f = (F) g02.f236t;
                LocationManager locationManager = (LocationManager) g02.f235s;
                if (f.f13211b <= System.currentTimeMillis()) {
                    Context context = (Context) g02.f234r;
                    Location lastKnownLocation = null;
                    if (P1.j(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (P1.j(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e8) {
                            Log.d("TwilightManager", "Failed to get last known location", e8);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C1098E.f13206d == null) {
                            C1098E.f13206d = new C1098E();
                        }
                        C1098E c1098e = C1098E.f13206d;
                        c1098e.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c1098e.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z5 = c1098e.f13209c == 1;
                        long j7 = c1098e.f13208b;
                        long j8 = c1098e.f13207a;
                        c1098e.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j9 = c1098e.f13208b;
                        if (j7 == -1 || j8 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j8) {
                                j7 = j9;
                            } else if (jCurrentTimeMillis > j7) {
                                j7 = j8;
                            }
                            j = j7 + 60000;
                        }
                        f.f13210a = z5;
                        f.f13211b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z5 = true;
                        }
                    }
                    break;
                } else {
                    z5 = f.f13210a;
                }
                return z5 ? 2 : 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.AbstractC0067b
    public final void k() {
        switch (this.f13321c) {
            case 0:
                this.f13322d.m(true, true);
                break;
            default:
                this.f13322d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, Context context) {
        super(yVar);
        this.f13322d = yVar;
        this.f13323e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
