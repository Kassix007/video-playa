package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC0839o0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f10999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f11000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0863t0 f11002t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractRunnableC0839o0(C0863t0 c0863t0, boolean z5) {
        Objects.requireNonNull(c0863t0);
        this.f11002t = c0863t0;
        this.f10999q = System.currentTimeMillis();
        this.f11000r = SystemClock.elapsedRealtime();
        this.f11001s = z5;
    }

    public abstract void a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0863t0 c0863t0 = this.f11002t;
        if (c0863t0.f11040e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e7) {
            c0863t0.d(e7, false, this.f11001s);
            b();
        }
    }
}
