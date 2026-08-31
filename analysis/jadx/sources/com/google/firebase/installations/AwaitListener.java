package com.google.firebase.installations;

import S3.d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class AwaitListener implements S3.a {
    private final CountDownLatch latch = new CountDownLatch(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean await(long j, TimeUnit timeUnit) {
        return this.latch.await(j, timeUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.a
    public void onComplete(d dVar) {
        this.latch.countDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onSuccess() {
        this.latch.countDown();
    }
}
