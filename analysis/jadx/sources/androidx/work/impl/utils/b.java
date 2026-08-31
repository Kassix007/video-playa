package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.CancelWorkRunnable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f9836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f9837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f9838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ WorkManagerImpl f9839t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl, int i) {
        this.f9836q = i;
        this.f9837r = workDatabase;
        this.f9838s = str;
        this.f9839t = workManagerImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9836q) {
            case 0:
                CancelWorkRunnable.C06751.invoke$lambda$0(this.f9837r, this.f9838s, this.f9839t);
                break;
            default:
                CancelWorkRunnable.forNameInline$lambda$0(this.f9837r, this.f9838s, this.f9839t);
                break;
        }
    }
}
