package k6;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends g6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14162e;
    public final /* synthetic */ n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14164h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, n nVar, int i, int i7, int i8) {
        super(str, true);
        this.f14162e = i8;
        this.f = nVar;
        this.f14163g = i;
        this.f14164h = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g6.a
    public final long a() {
        switch (this.f14162e) {
            case 0:
                n nVar = this.f;
                try {
                    nVar.f14185M.n(this.f14163g, this.f14164h, true);
                    return -1L;
                } catch (IOException e7) {
                    nVar.a(2, 2, e7);
                    return -1L;
                }
            case 1:
                y yVar = this.f.f14173A;
                int i = this.f14164h;
                yVar.getClass();
                k1.i.p(i, "errorCode");
                synchronized (this.f) {
                    this.f.f14187O.remove(Integer.valueOf(this.f14163g));
                }
                return -1L;
            default:
                n nVar2 = this.f;
                try {
                    int i7 = this.f14163g;
                    int i8 = this.f14164h;
                    k1.i.p(i8, "statusCode");
                    nVar2.f14185M.v(i7, i8);
                    return -1L;
                } catch (IOException e8) {
                    nVar2.a(2, 2, e8);
                    return -1L;
                }
        }
    }
}
