package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DelegatingScheduledExecutorService f11746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f11748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11749e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j, TimeUnit timeUnit, int i) {
        this.f11745a = i;
        this.f11746b = delegatingScheduledExecutorService;
        this.f11749e = obj;
        this.f11747c = j;
        this.f11748d = timeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f11745a) {
            case 0:
                return this.f11746b.lambda$schedule$2((Runnable) this.f11749e, this.f11747c, this.f11748d, completer);
            default:
                return this.f11746b.lambda$schedule$5((Callable) this.f11749e, this.f11747c, this.f11748d, completer);
        }
    }
}
