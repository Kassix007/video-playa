package g5;

import J1.D;
import J5.t;
import O3.Y;
import R4.C0458i;
import R4.C0468k1;
import R4.V;
import R4.V1;
import R4.g3;
import R4.l3;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.web2native.MainActivity;
import e.C1008a;
import e.C1014g;
import e.InterfaceC1009b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.AbstractC1175c;
import kotlin.jvm.internal.m;
import m5.C1371j;
import n5.x;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f13149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0468k1 f13150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1014g f13151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1014g f13152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13153e;
    public HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1014g f13154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1014g f13155h;
    public final C1014g i;
    public final C1014g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1014g f13156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1014g f13157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1014g f13158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1014g f13159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1014g f13160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f13161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueCallback f13162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PermissionRequest f13163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1014g f13164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f13165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f13167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JSONObject f13168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1014g f13169x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(MainActivity mainActivity, C0468k1 c0468k1) {
        this.f13149a = mainActivity;
        this.f13150b = c0468k1;
        final int i = 0;
        this.f13169x = mainActivity.k(new D(5), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i7 = 13;
        this.f13164s = mainActivity.k(new D(7), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i7) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i8 = 14;
        mainActivity.k(new D(6), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i8) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i9 = 15;
        this.f13152d = mainActivity.k(new D(6), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i9) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f13151c = mainActivity.k(new D(6), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i10) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i11 = 2;
        mainActivity.k(new D(5), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i11) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        c0468k1.f7060T = new Y();
        final int i12 = 3;
        this.f13154g = mainActivity.k(new D(5), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i12) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i13 = 4;
        mainActivity.k(new D(1), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i13) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        c0468k1.a().f4683e = new V();
        final int i14 = 5;
        this.f13155h = mainActivity.k(new V1(17), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i14) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i15 = 6;
        this.i = mainActivity.k(new V1(17), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i15) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i16 = 7;
        this.f13160o = mainActivity.k(new D(6), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i16) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i17 = 8;
        this.j = mainActivity.k(new D(3), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i17) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i18 = 9;
        this.f13156k = mainActivity.k(new D(4), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i18) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i19 = 10;
        this.f13157l = mainActivity.k(new D(6), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i19) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i20 = 11;
        this.f13158m = mainActivity.k(new D(6), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i20) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
        final int i21 = 12;
        this.f13159n = mainActivity.k(new D(2), new InterfaceC1009b(this) { // from class: g5.e

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public final /* synthetic */ h f13144r;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f13144r = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // e.InterfaceC1009b
            public final void d(Object obj) {
                GeolocationPermissions.Callback callback;
                GeolocationPermissions.Callback callback2;
                switch (i21) {
                    case 0:
                        Map isGranted = (Map) obj;
                        m.e(isGranted, "isGranted");
                        h hVar = this.f13144r;
                        String str = hVar.f13167v;
                        if (str != null) {
                            if (!hVar.f13166u) {
                                hVar.g(str, hVar.a(hVar.f13165t));
                            } else {
                                hVar.d(hVar.f13165t);
                            }
                        }
                        break;
                    case 1:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        h hVar2 = this.f13144r;
                        if (zBooleanValue) {
                            String str2 = hVar2.f13167v;
                            if (str2 != null) {
                                hVar2.g(str2, "ALLOWED");
                            }
                        } else if (!hVar2.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                            String str3 = hVar2.f13167v;
                            if (str3 != null) {
                                if (!hVar2.f13166u) {
                                    hVar2.g(str3, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar2.d(hVar2.f13165t);
                                }
                            }
                        } else {
                            String str4 = hVar2.f13167v;
                            if (str4 != null) {
                                hVar2.g(str4, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 2:
                        Map permissions = (Map) obj;
                        m.e(permissions, "permissions");
                        boolean zIsEmpty = permissions.isEmpty();
                        h hVar3 = this.f13144r;
                        if (!zIsEmpty) {
                            Iterator it = permissions.entrySet().iterator();
                            while (it.hasNext()) {
                                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    V v6 = hVar3.f13150b.f7082i0;
                                    break;
                                }
                            }
                        }
                        V v7 = hVar3.f13150b.f7082i0;
                        break;
                    case 3:
                        Map isGranted2 = (Map) obj;
                        m.e(isGranted2, "isGranted");
                        h hVar4 = this.f13144r;
                        C0468k1 c0468k12 = hVar4.f13150b;
                        Y yA = c0468k12.a();
                        MainActivity mainActivity2 = c0468k12.f7069b;
                        m.b((V) yA.f4683e);
                        MainActivity mainActivity3 = c0468k12.f7071c;
                        if (!V.h(mainActivity3)) {
                            if (mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || mainActivity2.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                                String str5 = hVar4.f13167v;
                                if (str5 != null) {
                                    hVar4.g(str5, "NOT_ALLOWED");
                                }
                            } else {
                                String str6 = hVar4.f13167v;
                                if (str6 != null) {
                                    if (hVar4.f13166u) {
                                        hVar4.d(hVar4.f13165t);
                                    } else {
                                        hVar4.g(str6, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            c0468k12.a().f4680b = SystemClock.uptimeMillis();
                            if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            } else if (l6.d.u(mainActivity3)) {
                                m.b((V) c0468k12.a().f4683e);
                                if (!V.h(mainActivity3) && (callback = (GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                    callback.invoke((String) c0468k12.a().f4681c, false, false);
                                }
                            }
                            Toast.makeText(mainActivity3, "Please accept location permission for better experience", 0).show();
                        } else {
                            String str7 = hVar4.f13167v;
                            if (str7 != null) {
                                hVar4.g(str7, "ALLOWED");
                            }
                            if (l6.d.u(mainActivity3) && ((GeolocationPermissions.Callback) c0468k12.a().f4682d) != null) {
                                GeolocationPermissions.Callback callback3 = (GeolocationPermissions.Callback) c0468k12.a().f4682d;
                                if (callback3 != null) {
                                    callback3.invoke((String) c0468k12.a().f4681c, true, false);
                                }
                            } else if (!l6.d.u(mainActivity3)) {
                                c0468k12.a();
                            }
                        }
                        break;
                    case 4:
                        ((Integer) obj).getClass();
                        h hVar5 = this.f13144r;
                        C0468k1 c0468k13 = hVar5.f13150b;
                        if (!l6.d.u(c0468k13.f7071c)) {
                            c0468k13.a();
                            break;
                        } else {
                            Y yA2 = c0468k13.a();
                            MainActivity mainActivity4 = c0468k13.f7071c;
                            m.b((V) yA2.f4683e);
                            if (!V.h(mainActivity4)) {
                                hVar5.e();
                                break;
                            } else if (l6.d.u(mainActivity4) && ((GeolocationPermissions.Callback) c0468k13.a().f4682d) != null && (callback2 = (GeolocationPermissions.Callback) c0468k13.a().f4682d) != null) {
                                callback2.invoke((String) c0468k13.a().f4681c, true, false);
                                break;
                            }
                        }
                        break;
                    case 5:
                        Uri uri = (Uri) obj;
                        h hVar6 = this.f13144r;
                        if (uri == null) {
                            ValueCallback valueCallback = hVar6.f13162q;
                            if (valueCallback != null) {
                                valueCallback.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback2 = hVar6.f13162q;
                            if (valueCallback2 != null) {
                                valueCallback2.onReceiveValue(new Uri[]{uri});
                            }
                        }
                        break;
                    case 6:
                        Uri uri2 = (Uri) obj;
                        h hVar7 = this.f13144r;
                        if (uri2 == null) {
                            ValueCallback valueCallback3 = hVar7.f13162q;
                            if (valueCallback3 != null) {
                                valueCallback3.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback4 = hVar7.f13162q;
                            if (valueCallback4 != null) {
                                valueCallback4.onReceiveValue(new Uri[]{uri2});
                            }
                        }
                        break;
                    case 7:
                        h hVar8 = this.f13144r;
                        if (((Boolean) obj).booleanValue()) {
                            try {
                                hVar8.i.u("audio");
                            } catch (Exception unused) {
                                ValueCallback valueCallback5 = hVar8.f13162q;
                                if (valueCallback5 != null) {
                                    valueCallback5.onReceiveValue(null);
                                }
                                Toast.makeText(hVar8.f13150b.f7071c, "No voice recorder application found on device.", 1).show();
                                return;
                            }
                        }
                        break;
                    case 8:
                        Uri uri3 = (Uri) obj;
                        h hVar9 = this.f13144r;
                        if (uri3 == null) {
                            ValueCallback valueCallback6 = hVar9.f13162q;
                            if (valueCallback6 != null) {
                                valueCallback6.onReceiveValue(null);
                            }
                        } else {
                            ValueCallback valueCallback7 = hVar9.f13162q;
                            if (valueCallback7 != null) {
                                valueCallback7.onReceiveValue(new Uri[]{uri3});
                            }
                        }
                        break;
                    case 9:
                        List result = (List) obj;
                        m.e(result, "result");
                        Uri[] uriArr = (Uri[]) result.toArray(new Uri[0]);
                        ValueCallback valueCallback8 = this.f13144r.f13162q;
                        if (valueCallback8 != null) {
                            valueCallback8.onReceiveValue(uriArr);
                        }
                        break;
                    case 10:
                        h hVar10 = this.f13144r;
                        C0468k1 c0468k14 = hVar10.f13150b;
                        if (!((Boolean) obj).booleanValue()) {
                            if (c0468k14.f7069b.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                String str8 = hVar10.f13167v;
                                if (str8 != null) {
                                    hVar10.g(str8, "NOT_ALLOWED");
                                }
                            } else {
                                String str9 = hVar10.f13167v;
                                if (str9 != null) {
                                    if (hVar10.f13166u) {
                                        hVar10.d(hVar10.f13165t);
                                    } else {
                                        hVar10.g(str9, "PERMANENTLY_BLOCKED");
                                    }
                                }
                            }
                            ValueCallback valueCallback9 = hVar10.f13162q;
                            if (valueCallback9 != null) {
                                valueCallback9.onReceiveValue(null);
                            }
                            Toast.makeText(c0468k14.f7071c, "Please allow camera permission for capturing", 0).show();
                        } else {
                            boolean z5 = hVar10.f13153e;
                            C1014g c1014g = hVar10.f13155h;
                            if (!z5) {
                                String str10 = hVar10.f13161p;
                                if (str10 == null) {
                                    c1014g.u("");
                                } else {
                                    c1014g.u(str10);
                                }
                            } else {
                                String str11 = hVar10.f13167v;
                                if (str11 != null) {
                                    hVar10.g(str11, "ALLOWED");
                                }
                            }
                        }
                        break;
                    case 11:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        h hVar11 = this.f13144r;
                        if (zBooleanValue2) {
                            String str12 = hVar11.f13167v;
                            if (str12 != null) {
                                hVar11.g(str12, "ALLOWED");
                            }
                        } else if (!hVar11.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                            String str13 = hVar11.f13167v;
                            if (str13 != null) {
                                if (!hVar11.f13166u) {
                                    hVar11.g(str13, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar11.d(hVar11.f13165t);
                                }
                            }
                        } else {
                            String str14 = hVar11.f13167v;
                            if (str14 != null) {
                                hVar11.g(str14, "NOT_ALLOWED");
                            }
                        }
                        break;
                    case 12:
                        ((Integer) obj).intValue();
                        this.f13144r.f13150b.f7063W = false;
                        break;
                    case 13:
                        C1008a it2 = (C1008a) obj;
                        m.e(it2, "it");
                        h hVar12 = this.f13144r;
                        hVar12.f13150b.getClass();
                        if (hVar12.f13167v != null) {
                            hVar12.a(hVar12.f13165t);
                        }
                        break;
                    case 14:
                        ((Boolean) obj).booleanValue();
                        V v8 = this.f13144r.f13150b.f7047G;
                        break;
                    default:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        h hVar13 = this.f13144r;
                        if (zBooleanValue3) {
                            String str15 = hVar13.f13167v;
                            if (str15 != null) {
                                hVar13.g(str15, "ALLOWED");
                            }
                        } else if (!hVar13.f13150b.f7069b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                            String str16 = hVar13.f13167v;
                            if (str16 != null) {
                                if (!hVar13.f13166u) {
                                    hVar13.g(str16, "PERMANENTLY_BLOCKED");
                                } else {
                                    hVar13.d(hVar13.f13165t);
                                }
                            }
                        } else {
                            String str17 = hVar13.f13167v;
                            if (str17 != null) {
                                hVar13.g(str17, "NOT_ALLOWED");
                            }
                        }
                        break;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 == 0) goto L11
            java.lang.String r1 = "w2n://"
            boolean r1 = J5.m.K0(r8, r1)
            if (r1 != r0) goto L11
            java.lang.String r1 = "w2n://permission-"
            java.lang.String r8 = J5.m.a1(r8, r1)
        L11:
            r1 = 0
            if (r8 == 0) goto L114
            int r2 = r8.hashCode()
            R4.k1 r3 = r7.f13150b
            com.web2native.MainActivity r4 = r7.f13149a
            java.lang.String r5 = "PERMANENTLY_BLOCKED"
            java.lang.String r6 = "ALLOWED"
            switch(r2) {
                case -2125976984: goto L105;
                case -2050034088: goto Lf2;
                case -1367751899: goto Le2;
                case -631670488: goto Lcb;
                case -255442837: goto Laa;
                case 595233003: goto L84;
                case 951526432: goto L72;
                case 1901043637: goto L60;
                case 1968882350: goto L25;
                default: goto L23;
            }
        L23:
            goto L114
        L25:
            java.lang.String r0 = "bluetooth"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L2f
            goto L114
        L2f:
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r8 < r0) goto L55
            java.lang.String r8 = "android.permission.BLUETOOTH_SCAN"
            int r0 = k1.AbstractC1175c.a(r4, r8)
            if (r0 != 0) goto L48
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            int r0 = k1.AbstractC1175c.a(r4, r0)
            if (r0 != 0) goto L48
        L45:
            r1 = r6
            goto L114
        L48:
            boolean r8 = k1.AbstractC1175c.i(r4, r8)
            if (r8 == 0) goto L52
            java.lang.String r1 = "NOT_ALLOWED"
            goto L114
        L52:
            r1 = r5
            goto L114
        L55:
            com.web2native.MainActivity r8 = r3.f7071c
            java.lang.String r0 = "android.permission.BLUETOOTH"
            int r8 = r8.checkSelfPermission(r0)
            if (r8 != 0) goto L52
            goto L45
        L60:
            java.lang.String r0 = "location"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L6a
            goto L114
        L6a:
            java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String r1 = r7.b(r8)
            goto L114
        L72:
            java.lang.String r0 = "contact"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L7c
            goto L114
        L7c:
            java.lang.String r8 = "android.permission.READ_CONTACTS"
            java.lang.String r1 = r7.b(r8)
            goto L114
        L84:
            java.lang.String r0 = "notification"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L8e
            goto L114
        L8e:
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L9c
            java.lang.String r8 = "android.permission.POST_NOTIFICATIONS"
            java.lang.String r1 = r7.b(r8)
            goto L114
        L9c:
            k1.m r8 = new k1.m
            r8.<init>(r4)
            android.app.NotificationManager r8 = r8.f14082a
            boolean r8 = r8.areNotificationsEnabled()
            if (r8 == 0) goto L52
            goto L45
        Laa:
            java.lang.String r0 = "enableBluetooth"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lb3
            goto L114
        Lb3:
            android.bluetooth.BluetoothAdapter r8 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r8 == 0) goto Lc1
            boolean r8 = r8.isEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
        Lc1:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r8 = kotlin.jvm.internal.m.a(r1, r8)
            if (r8 == 0) goto L52
            goto L45
        Lcb:
            java.lang.String r2 = "enableNfc"
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto Ld4
            goto L114
        Ld4:
            android.nfc.NfcAdapter r8 = android.nfc.NfcAdapter.getDefaultAdapter(r4)
            if (r8 == 0) goto L52
            boolean r8 = r8.isEnabled()
            if (r8 != r0) goto L52
            goto L45
        Le2:
            java.lang.String r0 = "camera"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Leb
            goto L114
        Leb:
            java.lang.String r8 = "android.permission.CAMERA"
            java.lang.String r1 = r7.b(r8)
            goto L114
        Lf2:
            java.lang.String r0 = "enableLocation"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lfb
            goto L114
        Lfb:
            com.web2native.MainActivity r8 = r3.f7071c
            boolean r8 = l6.d.u(r8)
            if (r8 == 0) goto L52
            goto L45
        L105:
            java.lang.String r0 = "record_audio"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L10e
            goto L114
        L10e:
            java.lang.String r8 = "android.permission.RECORD_AUDIO"
            java.lang.String r1 = r7.b(r8)
        L114:
            boolean r8 = r7.f13153e
            if (r8 == 0) goto L124
            if (r1 == 0) goto L124
            java.lang.String r8 = r7.f13167v
            java.lang.String r0 = "openAppSettingForPermission"
            boolean r8 = kotlin.jvm.internal.m.a(r8, r0)
            if (r8 != 0) goto L128
        L124:
            boolean r8 = r7.f13166u
            if (r8 == 0) goto L130
        L128:
            java.lang.String r8 = r7.f13167v
            kotlin.jvm.internal.m.b(r8)
            r7.g(r8, r1)
        L130:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.h.a(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b(String str) {
        MainActivity mainActivity = this.f13149a;
        return AbstractC1175c.a(mainActivity, str) == 0 ? "ALLOWED" : AbstractC1175c.i(mainActivity, str) ? "NOT_ALLOWED" : "PERMANENTLY_BLOCKED";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void c(String str) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        MainActivity mainActivity = this.f13149a;
        intent.setData(Uri.parse("package:" + mainActivity.getPackageName()));
        if (str != null) {
            int iHashCode = str.hashCode();
            C1014g c1014g = this.f13164s;
            switch (iHashCode) {
                case -2125976984:
                    if (str.equals("record_audio")) {
                        c1014g.u(intent);
                        break;
                    }
                    break;
                case -2050034088:
                    if (str.equals("enableLocation")) {
                        c1014g.u(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    }
                    break;
                case -1367751899:
                    if (str.equals("camera")) {
                        c1014g.u(intent);
                        break;
                    }
                    break;
                case -631670488:
                    if (str.equals("enableNfc")) {
                        c1014g.u(new Intent("android.settings.NFC_SETTINGS"));
                        break;
                    }
                    break;
                case -372024179:
                    if (str.equals("openSettings")) {
                        c1014g.u(intent);
                        break;
                    }
                    break;
                case -255442837:
                    if (str.equals("enableBluetooth")) {
                        c1014g.u(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                        break;
                    }
                    break;
                case 595233003:
                    if (str.equals("notification")) {
                        Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", mainActivity.getPackageName());
                        m.d(intentPutExtra, "putExtra(...)");
                        c1014g.u(intentPutExtra);
                        break;
                    }
                    break;
                case 951526432:
                    if (str.equals("contact")) {
                        c1014g.u(intent);
                        break;
                    }
                    break;
                case 1901043637:
                    if (str.equals(FirebaseAnalytics.Param.LOCATION)) {
                        c1014g.u(intent);
                        break;
                    }
                    break;
                case 1968882350:
                    if (str.equals("bluetooth")) {
                        c1014g.u(intent);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str) {
        String strConcat;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f13153e = true;
            this.f13165t = str;
            if (!this.f13166u) {
                c(str);
                return;
            }
            JSONObject jSONObject5 = this.f13168w;
            String string = (jSONObject5 == null || !jSONObject5.has("title") || (jSONObject4 = this.f13168w) == null) ? null : jSONObject4.getString("title");
            JSONObject jSONObject6 = this.f13168w;
            String string2 = (jSONObject6 == null || !jSONObject6.has("message") || (jSONObject3 = this.f13168w) == null) ? null : jSONObject3.getString("message");
            JSONObject jSONObject7 = this.f13168w;
            String string3 = (jSONObject7 == null || !jSONObject7.has("positiveButtonText") || (jSONObject2 = this.f13168w) == null) ? null : jSONObject2.getString("positiveButtonText");
            JSONObject jSONObject8 = this.f13168w;
            String string4 = (jSONObject8 == null || !jSONObject8.has("negativeButtonText") || (jSONObject = this.f13168w) == null) ? null : jSONObject.getString("negativeButtonText");
            I2.e eVar = new I2.e(6, this, str);
            final I2.d dVar = new I2.d(17, this);
            String str2 = this.f13165t;
            String strE0 = str2 != null ? t.E0(str2, "_", " ") : "";
            if (strE0.length() > 0) {
                char upperCase = Character.toUpperCase(strE0.charAt(0));
                String strSubstring = strE0.substring(1);
                m.d(strSubstring, "substring(...)");
                strE0 = upperCase + strSubstring;
            }
            String str3 = strE0.length() > 0 ? strE0 : null;
            if (str3 == null || (strConcat = str3.concat(" Permission Required")) == null) {
                strConcat = "Permission Required";
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f13149a);
            if (string == null) {
                string = strConcat;
            }
            AlertDialog.Builder title = builder.setTitle(string);
            if (string2 == null) {
                string2 = "This feature requires permissions that have been denied. Would you like to open settings to grant them?";
            }
            AlertDialog.Builder message = title.setMessage(string2);
            if (string3 == null) {
                string3 = "Open Settings";
            }
            AlertDialog.Builder positiveButton = message.setPositiveButton(string3, new g3(1, eVar));
            if (string4 == null) {
                string4 = "Cancel";
            }
            positiveButton.setNegativeButton(string4, new DialogInterface.OnClickListener() { // from class: g5.f
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws Exception {
                    dVar.invoke();
                    this.f13166u = false;
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: g5.g
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) throws Exception {
                    dVar.invoke();
                    this.f13166u = false;
                }
            }).show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        C1014g c1014g = this.f13154g;
        m.b(c1014g);
        c1014g.u(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void f(String str, boolean z5) {
        C1014g c1014g;
        C1014g c1014g2;
        C1014g c1014g3;
        this.f13153e = z5;
        if (str != null && J5.m.K0(str, "w2n://")) {
            str = J5.m.a1(str, "w2n://permission-");
        }
        this.f13165t = str;
        if (str != null) {
            switch (str.hashCode()) {
                case -2125976984:
                    if (str.equals("record_audio") && (c1014g = this.f13152d) != null) {
                        c1014g.u("android.permission.RECORD_AUDIO");
                    }
                    break;
                case -1367751899:
                    if (str.equals("camera")) {
                        this.f13157l.u("android.permission.CAMERA");
                    }
                    break;
                case 595233003:
                    if (str.equals("notification") && Build.VERSION.SDK_INT >= 33 && (c1014g2 = this.f13151c) != null) {
                        c1014g2.u("android.permission.POST_NOTIFICATIONS");
                    }
                    break;
                case 951526432:
                    if (str.equals("contact") && Build.VERSION.SDK_INT >= 33 && (c1014g3 = this.f13158m) != null) {
                        c1014g3.u("android.permission.READ_CONTACTS");
                    }
                    break;
                case 1901043637:
                    if (str.equals(FirebaseAnalytics.Param.LOCATION)) {
                        e();
                        break;
                    }
                    break;
                case 1968882350:
                    if (str.equals("bluetooth")) {
                        int i = Build.VERSION.SDK_INT;
                        C1014g c1014g4 = this.f13169x;
                        if (i < 31) {
                            if (c1014g4 != null) {
                                c1014g4.u(new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN"});
                            }
                        } else if (c1014g4 != null) {
                            c1014g4.u(new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"});
                        }
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(String typeValue, String str) {
        m.e(typeValue, "typeValue");
        if (!this.f13153e || str == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", typeValue);
            jSONObject.put("permissionStatus", str);
            HashMap map = this.f;
            if (map != null) {
                for (C1371j c1371j : x.M(map)) {
                    jSONObject.put((String) c1371j.f15080q, (String) c1371j.f15081r);
                }
            }
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
        l3 l3Var = this.f13150b.f7048H;
        if (l3Var != null) {
            l3Var.a(jSONObject);
        }
        this.f = null;
        this.f13153e = false;
        this.f13165t = null;
        this.f13166u = false;
        this.f13167v = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        C1014g c1014g;
        C0458i c0458i = this.f13150b.f7073d;
        if (!(c0458i != null ? m.a(c0458i.f7014t, Boolean.TRUE) : false) || Build.VERSION.SDK_INT < 33 || (c1014g = this.f13151c) == null) {
            return;
        }
        c1014g.u("android.permission.POST_NOTIFICATIONS");
    }
}
