package k6;

import java.io.IOException;
import q6.C1538g;

/* JADX INFO: loaded from: classes.dex */
public final class k extends g6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f14165e;
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1538g f14166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14167h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, n nVar, int i, C1538g c1538g, int i7, boolean z5) {
        super(str, true);
        this.f14165e = nVar;
        this.f = i;
        this.f14166g = c1538g;
        this.f14167h = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g6.a
    public final long a() {
        try {
            y yVar = this.f14165e.f14173A;
            C1538g c1538g = this.f14166g;
            int i = this.f14167h;
            yVar.getClass();
            c1538g.skip(i);
            this.f14165e.f14185M.v(this.f, 9);
            synchronized (this.f14165e) {
                this.f14165e.f14187O.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
