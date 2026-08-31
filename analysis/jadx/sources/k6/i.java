package k6;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g6.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14160e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14161g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i) {
        super(str, true);
        this.f14160e = i;
        this.f = obj;
        this.f14161g = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g6.a
    public final long a() {
        long jA;
        int i;
        v[] vVarArr;
        switch (this.f14160e) {
            case 0:
                n nVar = (n) this.f;
                nVar.f14188q.a(nVar, (z) ((kotlin.jvm.internal.y) this.f14161g).f14268q);
                return -1L;
            case 1:
                try {
                    ((n) this.f).f14188q.b((v) this.f14161g);
                    break;
                } catch (IOException e7) {
                    l6.m mVar = l6.m.f14610a;
                    l6.m mVar2 = l6.m.f14610a;
                    String str = "Http2Connection.Listener failure for " + ((n) this.f).f14190s;
                    mVar2.getClass();
                    l6.m.i(str, 4, e7);
                    try {
                        ((v) this.f14161g).c(2, e7);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                a5.v vVar = (a5.v) this.f;
                z zVar = (z) this.f14161g;
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                n nVar2 = (n) vVar.f8997r;
                synchronized (nVar2.f14185M) {
                    synchronized (nVar2) {
                        try {
                            z zVar2 = nVar2.f14179G;
                            z zVar3 = new z();
                            zVar3.b(zVar2);
                            zVar3.b(zVar);
                            yVar.f14268q = zVar3;
                            jA = ((long) zVar3.a()) - ((long) zVar2.a());
                            i = 0;
                            vVarArr = (jA == 0 || nVar2.f14189r.isEmpty()) ? null : (v[]) nVar2.f14189r.values().toArray(new v[0]);
                            z zVar4 = (z) yVar.f14268q;
                            kotlin.jvm.internal.m.e(zVar4, "<set-?>");
                            nVar2.f14179G = zVar4;
                            nVar2.f14197z.c(new i(nVar2.f14190s + " onSettings", nVar2, yVar, i), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        nVar2.f14185M.a((z) yVar.f14268q);
                    } catch (IOException e8) {
                        nVar2.a(2, 2, e8);
                    }
                    break;
                }
                if (vVarArr != null) {
                    int length = vVarArr.length;
                    while (i < length) {
                        v vVar2 = vVarArr[i];
                        synchronized (vVar2) {
                            vVar2.f += jA;
                            if (jA > 0) {
                                vVar2.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
