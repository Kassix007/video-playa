package z4;

import E1.t;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: renamed from: z4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1979m extends AbstractRunnableC1977k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ IBinder f18757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E4.j f18758s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1979m(E4.j jVar, IBinder iBinder) {
        this.f18758s = jVar;
        this.f18757r = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z4.AbstractRunnableC1977k
    public final void a() {
        InterfaceC1973g c1971e;
        C1980n c1980n = (C1980n) this.f18758s.f1737r;
        int i = AbstractBinderC1972f.f18751d;
        IBinder iBinder = this.f18757r;
        if (iBinder == null) {
            c1971e = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            c1971e = iInterfaceQueryLocalInterface instanceof InterfaceC1973g ? (InterfaceC1973g) iInterfaceQueryLocalInterface : new C1971e(iBinder);
        }
        c1980n.f18769m = c1971e;
        t tVar = c1980n.f18761b;
        int i7 = 0;
        tVar.e("linkToDeath", new Object[0]);
        try {
            c1980n.f18769m.asBinder().linkToDeath(c1980n.j, 0);
        } catch (RemoteException e7) {
            tVar.c(e7, "linkToDeath failed", new Object[0]);
        }
        c1980n.f18765g = false;
        ArrayList arrayList = c1980n.f18763d;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((Runnable) obj).run();
        }
        c1980n.f18763d.clear();
    }
}
