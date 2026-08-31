package x3;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class G extends u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC1893e f18392g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(AbstractC1893e abstractC1893e, int i, Bundle bundle) {
        super(abstractC1893e, i, bundle);
        this.f18392g = abstractC1893e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.u
    public final void a(com.google.android.gms.common.b bVar) {
        this.f18392g.f18440z.c(bVar);
        System.currentTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.u
    public final boolean b() {
        this.f18392g.f18440z.c(com.google.android.gms.common.b.f10321u);
        return true;
    }
}
