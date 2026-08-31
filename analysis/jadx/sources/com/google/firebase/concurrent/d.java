package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f11754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Runnable f11755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledFuture.Completer f11756t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, DelegatingScheduledFuture.Completer completer, int i) {
        this.f11753q = i;
        this.f11754r = delegatingScheduledExecutorService;
        this.f11755s = runnable;
        this.f11756t = completer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11753q) {
            case 0:
                this.f11754r.lambda$scheduleWithFixedDelay$10(this.f11755s, this.f11756t);
                break;
            case 1:
                this.f11754r.lambda$scheduleAtFixedRate$7(this.f11755s, this.f11756t);
                break;
            default:
                this.f11754r.lambda$schedule$1(this.f11755s, this.f11756t);
                break;
        }
    }
}
