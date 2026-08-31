package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0903d extends AbstractC0904d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z.m f11265b = new Z.m(4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.AbstractC0904d0
    public final void q(Exception exc) {
        exc.printStackTrace();
        Z.m mVar = this.f11265b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mVar.f8312r;
        ReferenceQueue referenceQueue = (ReferenceQueue) mVar.f8313s;
        for (Reference referencePoll = referenceQueue.poll(); referencePoll != null; referencePoll = referenceQueue.poll()) {
            concurrentHashMap.remove(referencePoll);
        }
        List<Throwable> list = (List) concurrentHashMap.get(new C0901c(exc));
        if (list == null) {
            return;
        }
        synchronized (list) {
            try {
                for (Throwable th : list) {
                    System.err.print("Suppressed: ");
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
