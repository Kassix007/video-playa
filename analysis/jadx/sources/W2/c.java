package W2;

import J2.j;
import J2.k;
import J2.q;
import L2.i;
import U2.n;
import kotlin.jvm.internal.m;
import q6.C1541j;
import q6.InterfaceC1540i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // J2.j
    public final k a(i iVar, n nVar) {
        long jB;
        String str = iVar.f3261b;
        q qVar = iVar.f3260a;
        if (!m.a(str, "image/svg+xml")) {
            InterfaceC1540i interfaceC1540iO = qVar.O();
            if (!interfaceC1540iO.t(0L, a.f8100b)) {
                return null;
            }
            C1541j c1541j = a.f8099a;
            byte[] bArr = c1541j.f16065q;
            if (bArr.length <= 0) {
                throw new IllegalArgumentException("bytes is empty");
            }
            byte b7 = bArr[0];
            long length = 1024 - ((long) bArr.length);
            long j = 0;
            while (true) {
                if (j >= length) {
                    jB = -1;
                    break;
                }
                byte b8 = b7;
                long j7 = length;
                jB = interfaceC1540iO.B(b8, j, j7);
                if (jB == -1 || interfaceC1540iO.t(jB, c1541j)) {
                    break;
                }
                j = jB + 1;
                length = j7;
                b7 = b8;
            }
            if (jB == -1) {
                return null;
            }
        }
        return new d(qVar, nVar);
    }
}
