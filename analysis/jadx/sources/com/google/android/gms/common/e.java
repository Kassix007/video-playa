package com.google.android.gms.common;

import C0.S;
import C0.U;
import J1.C0169a;
import J1.C0188u;
import J1.H;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import h.AbstractActivityC1106h;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f10340c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f10341d = new e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AlertDialog e(Activity activity, int i, x3.r rVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(x3.o.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.wnapp.smspariaz.R.string.common_google_play_services_enable_button) : resources.getString(com.wnapp.smspariaz.R.string.common_google_play_services_update_button) : resources.getString(com.wnapp.smspariaz.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, rVar);
        }
        String strC = x3.o.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", k1.i.i(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1106h) {
                H h4 = ((C0188u) ((AbstractActivityC1106h) activity).f13295K.f14122r).f2737w;
                j jVar = new j();
                AbstractC1887A.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f10348y0 = alertDialog;
                if (onCancelListener != null) {
                    jVar.f10349z0 = onCancelListener;
                }
                jVar.f2669v0 = false;
                jVar.f2670w0 = true;
                h4.getClass();
                C0169a c0169a = new C0169a(h4);
                c0169a.f2616o = true;
                c0169a.e(0, jVar, str, 1);
                c0169a.d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        AbstractC1887A.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f10326q = alertDialog;
        if (onCancelListener != null) {
            cVar.f10327r = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AlertDialog d(int i, Activity activity, int i7, DialogInterface.OnCancelListener onCancelListener) {
        return e(activity, i, new x3.p(super.a(activity, i, "d"), activity, i7, 0), onCancelListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i7;
        Log.w("GoogleApiAvailability", S.m("GMS core API Availability. ConnectionResult=", ", tag=null", i), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? x3.o.e(context, "common_google_play_services_resolution_required_title") : x3.o.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(com.wnapp.smspariaz.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? x3.o.d(context, "common_google_play_services_resolution_required_text", x3.o.a(context)) : x3.o.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC1887A.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        k1.h hVar = new k1.h(context, null);
        hVar.f14076k = true;
        hVar.f14080o.flags |= 16;
        hVar.f14073e = k1.h.b(strE);
        Z.m mVar = new Z.m(18, false);
        mVar.f8313s = k1.h.b(strD);
        hVar.c(mVar);
        PackageManager packageManager = context.getPackageManager();
        if (B3.b.f554c == null) {
            B3.b.f554c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (B3.b.f554c.booleanValue()) {
            hVar.f14080o.icon = context.getApplicationInfo().icon;
            hVar.f14075h = 2;
            if (B3.b.d(context)) {
                hVar.f14070b.add(new k1.g(resources.getString(com.wnapp.smspariaz.R.string.common_open_on_phone), pendingIntent));
            } else {
                hVar.f14074g = pendingIntent;
            }
        } else {
            hVar.f14080o.icon = R.drawable.stat_sys_warning;
            hVar.f14080o.tickerText = k1.h.b(resources.getString(com.wnapp.smspariaz.R.string.common_google_play_services_notification_ticker));
            hVar.f14080o.when = System.currentTimeMillis();
            hVar.f14074g = pendingIntent;
            hVar.f = k1.h.b(strD);
        }
        if (B3.b.b()) {
            if (!B3.b.b()) {
                throw new IllegalStateException();
            }
            synchronized (f10340c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.wnapp.smspariaz.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(U.e(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            hVar.f14078m = "com.google.android.gms.availability";
        }
        Notification notificationA = hVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.sCanceledAvailabilityNotification.set(false);
            i7 = 10436;
        } else {
            i7 = 39789;
        }
        notificationManager.notify(i7, notificationA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(Activity activity, v3.f fVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i, new x3.q(super.a(activity, i, "d"), fVar), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
    }
}
