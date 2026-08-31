package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11750q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Runnable f11751r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f11752s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c(Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.f11750q = i;
        this.f11751r = runnable;
        this.f11752s = completer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f11750q) {
            case 0:
                DelegatingScheduledExecutorService.lambda$scheduleWithFixedDelay$9(this.f11751r, this.f11752s);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$0(this.f11751r, this.f11752s);
                break;
            default:
                DelegatingScheduledExecutorService.lambda$scheduleAtFixedRate$6(this.f11751r, this.f11752s);
                break;
        }
    }
}
