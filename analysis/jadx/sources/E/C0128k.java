package E;

import M5.InterfaceC0245f;
import java.util.concurrent.CancellationException;
import m5.C1386y;
import w.C1783g;
import z.AbstractC1923a;

/* JADX INFO: renamed from: E.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R.e f1572a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0128k(int i) {
        switch (i) {
            case 1:
                this.f1572a = new R.e(new C1783g[16]);
                break;
            default:
                this.f1572a = new R.e(new C0127j[16]);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(CancellationException cancellationException) {
        R.e eVar = this.f1572a;
        int i = eVar.f6678s;
        InterfaceC0245f[] interfaceC0245fArr = new InterfaceC0245f[i];
        for (int i7 = 0; i7 < i; i7++) {
            interfaceC0245fArr[i7] = ((C1783g) eVar.f6676q[i7]).f17970b;
        }
        for (int i8 = 0; i8 < i; i8++) {
            interfaceC0245fArr[i8].g(cancellationException);
        }
        if (eVar.f6678s == 0) {
            return;
        }
        AbstractC1923a.c("uncancelled requests present");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        R.e eVar = this.f1572a;
        G5.d dVarO = D5.a.O(0, eVar.f6678s);
        int i = dVarO.f2017q;
        int i7 = dVarO.f2018r;
        if (i <= i7) {
            while (true) {
                ((C1783g) eVar.f6676q[i]).f17970b.resumeWith(C1386y.f15098a);
                if (i == i7) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eVar.i();
    }
}
