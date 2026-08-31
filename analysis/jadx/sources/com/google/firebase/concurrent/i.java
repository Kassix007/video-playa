package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f11768b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(Runnable runnable, int i) {
        this.f11767a = i;
        this.f11768b = runnable;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.concurrent.PausableExecutorServiceImpl.a(java.lang.Runnable):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11767a) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$1(this.f11768b);
            default:
                return PausableExecutorServiceImpl.lambda$submit$1(this.f11768b);
        }
    }
}
