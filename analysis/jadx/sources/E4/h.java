package E4;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import z4.AbstractRunnableC1977k;
import z4.C1980n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1733b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ h(int i, Object obj) {
        this.f1732a = i;
        this.f1733b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f1732a) {
            case 0:
                k kVar = (k) this.f1733b;
                String str = kVar.f1741c;
                f fVar = kVar.f1740b;
                int i = 0;
                fVar.a("reportBinderDeath", new Object[0]);
                if (kVar.i.get() != null) {
                    throw new ClassCastException();
                }
                fVar.a("%s : Binder has died.", str);
                ArrayList arrayList = kVar.f1742d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    S3.e eVar = ((g) obj).f1731q;
                    if (eVar != null) {
                        eVar.a(remoteException);
                    }
                }
                arrayList.clear();
                kVar.b();
                return;
            default:
                C1980n c1980n = (C1980n) this.f1733b;
                int i7 = 0;
                c1980n.f18761b.e("reportBinderDeath", new Object[0]);
                if (c1980n.i.get() != null) {
                    throw new ClassCastException();
                }
                c1980n.f18761b.e("%s : Binder has died.", c1980n.f18762c);
                ArrayList arrayList2 = c1980n.f18763d;
                int size2 = arrayList2.size();
                while (i7 < size2) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    RemoteException remoteException2 = new RemoteException(String.valueOf(c1980n.f18762c).concat(" : Binder has died."));
                    S3.e eVar2 = ((AbstractRunnableC1977k) obj2).f18754q;
                    if (eVar2 != null) {
                        eVar2.a(remoteException2);
                    }
                }
                c1980n.f18763d.clear();
                synchronized (c1980n.f) {
                    c1980n.d();
                    break;
                }
                return;
        }
    }
}
