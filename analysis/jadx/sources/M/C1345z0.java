package m;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: m.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1345z0 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1248C0 f14916a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1345z0(C1248C0 c1248c0) {
        this.f14916a = c1248c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C1248C0 c1248c0 = this.f14916a;
        if (c1248c0.f14636P.isShowing()) {
            c1248c0.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f14916a.dismiss();
    }
}
