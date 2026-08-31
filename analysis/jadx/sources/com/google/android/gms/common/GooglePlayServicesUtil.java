package com.google.android.gms.common;

import J1.AbstractComponentCallbacksC0185q;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class GooglePlayServicesUtil extends h {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = h.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private GooglePlayServicesUtil() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i7) {
        return getErrorDialog(i, activity, i7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i7) {
        return f.f10343b.b(context, i, i7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static String getErrorString(int i) {
        return b.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return h.isGooglePlayServicesAvailable(context, h.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i7) {
        return showErrorDialogFragment(i, activity, i7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        e eVar = e.f10341d;
        if (h.isPlayServicesPossiblyUpdating(context, i) || h.isPlayStorePossiblyUpdating(context, i)) {
            new k(eVar, context).sendEmptyMessageDelayed(1, 120000L);
        } else {
            eVar.g(context, i, eVar.b(context, i, 0, "n"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i7, DialogInterface.OnCancelListener onCancelListener) {
        if (true == h.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return e.f10341d.d(i, activity, i7, onCancelListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return h.isGooglePlayServicesAvailable(context, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i7, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i7, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i, Activity activity, AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q, int i7, DialogInterface.OnCancelListener onCancelListener) {
        if (true == h.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        e eVar = e.f10341d;
        if (abstractComponentCallbacksC0185q == null) {
            AlertDialog alertDialogD = eVar.d(i, activity, i7, onCancelListener);
            if (alertDialogD == null) {
                return false;
            }
            e.f(activity, alertDialogD, GMS_ERROR_DIALOG, onCancelListener);
            return true;
        }
        AlertDialog alertDialogE = e.e(activity, i, new x3.p(eVar.a(activity, i, "d"), abstractComponentCallbacksC0185q, i7, 1), onCancelListener);
        if (alertDialogE == null) {
            return false;
        }
        e.f(activity, alertDialogE, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
