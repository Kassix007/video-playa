package k6;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m extends g6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f14170e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f14171g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, int i, long j) {
        super(str, true);
        this.f14170e = nVar;
        this.f = i;
        this.f14171g = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g6.a
    public final long a() {
        n nVar = this.f14170e;
        try {
            nVar.f14185M.z(this.f, this.f14171g);
            return -1L;
        } catch (IOException e7) {
            nVar.a(2, 2, e7);
            return -1L;
        }
    }
}
