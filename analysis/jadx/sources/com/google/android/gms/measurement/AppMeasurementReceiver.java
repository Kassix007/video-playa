package com.google.android.gms.measurement;

import M1.a;
import O3.C0323t0;
import O3.X;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import k3.c;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f11334c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f11334c == null) {
            this.f11334c = new c(this);
        }
        c cVar = this.f11334c;
        cVar.getClass();
        X x6 = C0323t0.r(context, null, null).f5077v;
        C0323t0.l(x6);
        if (intent == null) {
            x6.f4673z.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        x6.f4666E.c(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                x6.f4673z.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        x6.f4666E.b("Starting wakeful intent.");
        ((AppMeasurementReceiver) cVar.f14120q).getClass();
        SparseArray sparseArray = a.f3723a;
        synchronized (sparseArray) {
            try {
                int i = a.f3724b;
                int i7 = i + 1;
                a.f3724b = i7;
                if (i7 <= 0) {
                    a.f3724b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
