package p3;

import java.util.Iterator;

/* JADX INFO: renamed from: p3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1465k implements InterfaceC1453e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15784b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1465k(String str, boolean z5) {
        this.f15783a = z5;
        this.f15784b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.InterfaceC1453e
    public final boolean a(Y y6) {
        int i;
        boolean z5 = this.f15783a;
        String strO = this.f15784b;
        if (z5 && strO == null) {
            strO = y6.o();
        }
        W w3 = y6.f15751b;
        if (w3 != null) {
            Iterator it = w3.f().iterator();
            i = 0;
            while (it.hasNext()) {
                Y y7 = (Y) ((AbstractC1446a0) it.next());
                if (strO == null || y7.o().equals(strO)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f15783a ? C0.S.n("only-of-type <", this.f15784b, ">") : "only-child";
    }
}
