package v3;

import F.D;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.Set;
import u3.InterfaceC1697b;
import x3.AbstractBinderC1889a;
import x3.AbstractC1887A;
import x3.InterfaceC1897i;
import x3.M;
import y3.AbstractC1915a;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f17593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC1915a f17594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f17595s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ q(Object obj, AbstractC1915a abstractC1915a, int i) {
        this.f17593q = i;
        this.f17595s = obj;
        this.f17594r = abstractC1915a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1897i interfaceC1897i;
        int i = this.f17593q;
        InterfaceC1897i m4 = null;
        AbstractC1915a abstractC1915a = this.f17594r;
        Object obj = this.f17595s;
        switch (i) {
            case 0:
                com.google.android.gms.common.b bVar = (com.google.android.gms.common.b) abstractC1915a;
                D d5 = (D) obj;
                InterfaceC1697b interfaceC1697b = (InterfaceC1697b) d5.f1777r;
                o oVar = (o) ((e) d5.f1781v).j.get((C1763a) d5.f1778s);
                if (oVar != null) {
                    if (bVar.f10323r != 0) {
                        oVar.l(bVar, null);
                        break;
                    } else {
                        d5.f1776q = true;
                        if (!interfaceC1697b.k()) {
                            try {
                                interfaceC1697b.m(null, interfaceC1697b.b());
                            } catch (SecurityException e7) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e7);
                                interfaceC1697b.d("Failed to get service from broker.");
                                oVar.l(new com.google.android.gms.common.b(10), null);
                                return;
                            }
                            break;
                        } else if (d5.f1776q && (interfaceC1897i = (InterfaceC1897i) d5.f1779t) != null) {
                            interfaceC1697b.m(interfaceC1897i, (Set) d5.f1780u);
                            break;
                        }
                    }
                }
                break;
            default:
                x xVar = (x) obj;
                R3.e eVar = (R3.e) abstractC1915a;
                com.google.android.gms.common.b bVar2 = eVar.f6715r;
                if (bVar2.f10323r == 0) {
                    x3.t tVar = eVar.f6716s;
                    AbstractC1887A.g(tVar);
                    com.google.android.gms.common.b bVar3 = tVar.f18516s;
                    if (bVar3.f10323r != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        xVar.j.a(bVar3);
                        xVar.i.j();
                        break;
                    } else {
                        D d7 = xVar.j;
                        IBinder iBinder = tVar.f18515r;
                        if (iBinder != null) {
                            int i7 = AbstractBinderC1889a.f18416d;
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            m4 = iInterfaceQueryLocalInterface instanceof InterfaceC1897i ? (InterfaceC1897i) iInterfaceQueryLocalInterface : new M(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                        }
                        Set set = xVar.f17605g;
                        d7.getClass();
                        if (m4 == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            d7.a(new com.google.android.gms.common.b(4));
                        } else {
                            d7.f1779t = m4;
                            d7.f1780u = set;
                            if (d7.f1776q) {
                                ((InterfaceC1697b) d7.f1777r).m(m4, set);
                            }
                        }
                    }
                } else {
                    xVar.j.a(bVar2);
                }
                xVar.i.j();
                break;
        }
    }
}
