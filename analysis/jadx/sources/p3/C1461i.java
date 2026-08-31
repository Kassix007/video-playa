package p3;

import C.C0061a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: p3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1461i implements InterfaceC1453e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f15779a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p3.InterfaceC1453e
    public final boolean a(Y y6) {
        Iterator it = this.f15779a.iterator();
        while (it.hasNext()) {
            if (C0061a.j((C1467m) it.next(), y6)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "not(" + this.f15779a + ")";
    }
}
