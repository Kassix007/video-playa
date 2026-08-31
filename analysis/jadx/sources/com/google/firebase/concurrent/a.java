package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11744s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f11742q = i;
        this.f11743r = obj;
        this.f11744s = obj2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.concurrent.DelegatingScheduledExecutorService.d(java.util.concurrent.Callable, com.google.firebase.concurrent.DelegatingScheduledFuture$Completer):void */
    /* JADX DEBUG: Class process forced to load method for inline: com.google.firebase.concurrent.LimitedConcurrencyExecutor.a(com.google.firebase.concurrent.LimitedConcurrencyExecutor, java.lang.Runnable):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11742q) {
            case 0:
                ((CustomThreadFactory) this.f11743r).lambda$newThread$0((Runnable) this.f11744s);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$3((Callable) this.f11743r, (DelegatingScheduledFuture.Completer) this.f11744s);
                break;
            default:
                ((LimitedConcurrencyExecutor) this.f11743r).lambda$decorate$0((Runnable) this.f11744s);
                break;
        }
    }
}
