package x3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import i1.C1134a;
import i3.C1136a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import p3.z0;
import u3.InterfaceC1697b;

/* JADX INFO: renamed from: x3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1896h extends AbstractC1893e implements InterfaceC1697b {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Set f18463O;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1896h(Context context, Looper looper, int i, z0 z0Var, u3.e eVar, u3.f fVar, int i7) {
        K kA = K.a(context);
        com.google.android.gms.common.e eVar2 = com.google.android.gms.common.e.f10341d;
        AbstractC1887A.g(eVar);
        AbstractC1887A.g(fVar);
        super(context, looper, kA, eVar2, i, new C1134a(18, eVar), new C1136a(19, fVar), (String) z0Var.f15878d);
        Set set = (Set) z0Var.f15876b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f18463O = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u3.InterfaceC1697b
    public final Set b() {
        return k() ? this.f18463O : Collections.EMPTY_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final Account p() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.AbstractC1893e
    public final Set s() {
        return this.f18463O;
    }
}
