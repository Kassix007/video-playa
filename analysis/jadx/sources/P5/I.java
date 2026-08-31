package P5;

import M5.C0247h;
import Q5.AbstractC0422b;
import Q5.AbstractC0424d;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0424d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0247h f6357b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.AbstractC0424d
    public final boolean a(AbstractC0422b abstractC0422b) {
        G g7 = (G) abstractC0422b;
        if (this.f6356a >= 0) {
            return false;
        }
        long j = g7.f6350x;
        if (j < g7.f6351y) {
            g7.f6351y = j;
        }
        this.f6356a = j;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.AbstractC0424d
    public final InterfaceC1524c[] b(AbstractC0422b abstractC0422b) {
        long j = this.f6356a;
        this.f6356a = -1L;
        this.f6357b = null;
        return ((G) abstractC0422b).s(j);
    }
}
