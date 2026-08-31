package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.WorkRequest;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10303q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedBlockingQueue f10304r = new LinkedBlockingQueue();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1887A.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f10303q) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f10303q = true;
        IBinder iBinder = (IBinder) this.f10304r.poll(WorkRequest.MIN_BACKOFF_MILLIS, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10304r.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
