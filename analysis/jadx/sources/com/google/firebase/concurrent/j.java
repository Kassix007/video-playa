package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f11770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11771c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j(Runnable runnable, Object obj, int i) {
        this.f11769a = i;
        this.f11770b = runnable;
        this.f11771c = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.concurrent.LimitedConcurrencyExecutorService.b(java.lang.Runnable, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11769a) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$0(this.f11770b, this.f11771c);
            default:
                return PausableExecutorServiceImpl.lambda$submit$0(this.f11770b, this.f11771c);
        }
    }
}
