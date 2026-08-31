package a5;

import P.W;
import e5.C1056a;
import java.io.IOException;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class v implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f8998s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.f8996q = i;
        this.f8997r = obj;
        this.f8998s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f8996q) {
            case 0:
                ((B5.a) this.f8998s).invoke();
                ((W) this.f8997r).setValue(Boolean.FALSE);
                return C1386y.f15098a;
            case 1:
                ((W) this.f8998s).setValue(((C1056a) ((W) this.f8997r).getValue()).a());
                return C1386y.f15098a;
            default:
                k6.n nVar = (k6.n) this.f8997r;
                k6.r rVar = (k6.r) this.f8998s;
                try {
                } catch (IOException e7) {
                    nVar.a(2, 2, e7);
                } catch (Throwable th) {
                    nVar.a(3, 3, null);
                    e6.b.b(rVar);
                    throw th;
                }
                if (!rVar.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (rVar.a(false, this)) {
                }
                nVar.a(1, 9, null);
                e6.b.b(rVar);
                return C1386y.f15098a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public v(B5.a aVar, W w3) {
        this.f8996q = 0;
        this.f8998s = aVar;
        this.f8997r = w3;
    }
}
