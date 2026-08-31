package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f11758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f11759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f11761e;
    public final /* synthetic */ TimeUnit f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j7, TimeUnit timeUnit, int i) {
        this.f11757a = i;
        this.f11758b = delegatingScheduledExecutorService;
        this.f11759c = runnable;
        this.f11760d = j;
        this.f11761e = j7;
        this.f = timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f11757a) {
            case 0:
                return this.f11758b.lambda$scheduleAtFixedRate$8(this.f11759c, this.f11760d, this.f11761e, this.f, completer);
            default:
                return this.f11758b.lambda$scheduleWithFixedDelay$11(this.f11759c, this.f11760d, this.f11761e, this.f, completer);
        }
    }
}
