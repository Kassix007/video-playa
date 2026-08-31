package s1;

import Z.m;
import java.util.ArrayList;
import r.Q;
import v1.InterfaceC1752a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC1752a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16432b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ e(int i, Object obj) {
        this.f16431a = i;
        this.f16432b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // v1.InterfaceC1752a
    public final void accept(Object obj) {
        switch (this.f16431a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((m) this.f16432b).x(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f16437c) {
                    try {
                        Q q7 = g.f16438d;
                        ArrayList arrayList = (ArrayList) q7.get((String) this.f16432b);
                        if (arrayList == null) {
                            return;
                        }
                        q7.remove((String) this.f16432b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC1752a) arrayList.get(i)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
