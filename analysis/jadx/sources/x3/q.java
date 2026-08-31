package x3;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Intent f18508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f18509r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(Intent intent, v3.f fVar) {
        this.f18508q = intent;
        this.f18509r = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, v3.f] */
    @Override // x3.r
    public final void a() {
        Intent intent = this.f18508q;
        if (intent != null) {
            this.f18509r.a(intent, 2);
        }
    }
}
