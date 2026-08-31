package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.CancelWorkRunnable;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9833q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ WorkManagerImpl f9834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9835s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(WorkDatabase workDatabase, WorkManagerImpl workManagerImpl) {
        this.f9835s = workDatabase;
        this.f9834r = workManagerImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9833q) {
            case 0:
                CancelWorkRunnable.AnonymousClass1.invoke$lambda$0((WorkDatabase) this.f9835s, this.f9834r);
                break;
            default:
                CancelWorkRunnable.C06731.invoke$lambda$0(this.f9834r, (UUID) this.f9835s);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ a(WorkManagerImpl workManagerImpl, UUID uuid) {
        this.f9834r = workManagerImpl;
        this.f9835s = uuid;
    }
}
