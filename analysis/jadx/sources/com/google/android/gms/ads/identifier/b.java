package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakReference f10286q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f10287r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CountDownLatch f10288s = new CountDownLatch(1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10289t = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(AdvertisingIdClient advertisingIdClient, long j) {
        this.f10286q = new WeakReference(advertisingIdClient);
        this.f10287r = j;
        start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f10286q;
        try {
            if (this.f10288s.await(this.f10287r, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f10289t = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f10289t = true;
            }
        }
    }
}
