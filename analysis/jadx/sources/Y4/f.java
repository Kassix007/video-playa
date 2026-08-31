package y4;

import E1.t;
import android.os.RemoteException;
import z4.AbstractRunnableC1977k;
import z4.C1980n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractRunnableC1977k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18636r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S3.e f18637s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18638t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f18639u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, S3.e eVar, S3.e eVar2, Object obj2, int i) {
        super(eVar);
        this.f18636r = i;
        this.f18639u = obj;
        this.f18637s = eVar2;
        this.f18638t = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.AbstractRunnableC1977k
    public final void a() {
        switch (this.f18636r) {
            case 0:
                S3.e eVar = this.f18637s;
                j jVar = (j) this.f18639u;
                String str = (String) this.f18638t;
                try {
                    jVar.f18644a.f18769m.u(jVar.f18645b, j.a(jVar, str), new i(jVar, eVar, str));
                    return;
                } catch (RemoteException e7) {
                    j.f18643e.c(e7, "requestUpdateInfo(%s)", str);
                    eVar.a(new RuntimeException(e7));
                    return;
                }
            case 1:
                S3.e eVar2 = this.f18637s;
                j jVar2 = (j) this.f18639u;
                try {
                    jVar2.f18644a.f18769m.h(jVar2.f18645b, j.b(), new h(jVar2, new t("OnCompleteUpdateCallback"), eVar2));
                    return;
                } catch (RemoteException e8) {
                    j.f18643e.c(e8, "completeUpdate(%s)", (String) this.f18638t);
                    eVar2.a(new RuntimeException(e8));
                    return;
                }
            default:
                synchronized (((C1980n) this.f18639u).f) {
                    try {
                        C1980n c1980n = (C1980n) this.f18639u;
                        S3.e eVar3 = this.f18637s;
                        c1980n.f18764e.add(eVar3);
                        eVar3.f7306a.e(new v3.l(8, c1980n, eVar3));
                        if (((C1980n) this.f18639u).f18767k.getAndIncrement() > 0) {
                            ((C1980n) this.f18639u).f18761b.e("Already connected to the service.", new Object[0]);
                        }
                        C1980n.b((C1980n) this.f18639u, (AbstractRunnableC1977k) this.f18638t);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, S3.e eVar, String str, S3.e eVar2) {
        super(eVar);
        this.f18636r = 0;
        this.f18639u = jVar;
        this.f18638t = str;
        this.f18637s = eVar2;
    }
}
