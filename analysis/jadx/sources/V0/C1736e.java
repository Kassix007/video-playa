package v0;

import com.google.android.gms.internal.measurement.O1;
import r.C1544C;
import r.C1566q;
import z0.InterfaceC1953m;

/* JADX INFO: renamed from: v0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1736e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R.e f17449a = new R.e(new C1735d[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1544C f17450b = new C1544C(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean a(C1566q c1566q, InterfaceC1953m interfaceC1953m, O1 o12, boolean z5) {
        R.e eVar = this.f17449a;
        Object[] objArr = eVar.f6676q;
        int i = eVar.f6678s;
        boolean z6 = false;
        for (int i7 = 0; i7 < i; i7++) {
            z6 = ((C1735d) objArr[i7]).a(c1566q, interfaceC1953m, o12, z5) || z6;
        }
        return z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    public void b(O1 o12) {
        R.e eVar = this.f17449a;
        int i = eVar.f6678s;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C1735d) eVar.f6676q[i]).f17445d.f7510q == 0) {
                eVar.m(i);
            }
        }
    }
}
