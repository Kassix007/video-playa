package D4;

import E4.j;
import E4.k;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d extends E4.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1460t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, S3.e eVar, Object obj2, int i) {
        super(eVar);
        this.f1458r = i;
        this.f1460t = obj;
        this.f1459s = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E4.g
    public final void a() {
        E4.e cVar;
        int i = this.f1458r;
        Object obj = this.f1459s;
        Object obj2 = this.f1460t;
        int i7 = 0;
        switch (i) {
            case 0:
                S3.e eVar = (S3.e) obj;
                f fVar = (f) obj2;
                try {
                    fVar.f1464a.f1748m.G(fVar.f1465b, g.a(), new e(fVar, eVar));
                } catch (RemoteException e7) {
                    E4.f fVar2 = f.f1463c;
                    Object[] objArr = {fVar.f1465b};
                    fVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", E4.f.b(fVar2.f1730b, "error requesting in-app review for %s", objArr), e7);
                    }
                    eVar.a(new RuntimeException(e7));
                    return;
                }
                break;
            case 1:
                k kVar = (k) obj2;
                d dVar = (d) obj;
                E4.e eVar2 = kVar.f1748m;
                E4.f fVar3 = kVar.f1740b;
                ArrayList arrayList = kVar.f1742d;
                if (eVar2 == null && !kVar.f1744g) {
                    fVar3.a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(dVar);
                    j jVar = new j(0, kVar);
                    kVar.f1747l = jVar;
                    kVar.f1744g = true;
                    if (!kVar.f1739a.bindService(kVar.f1745h, jVar, 1)) {
                        fVar3.a("Failed to bind to the service.", new Object[0]);
                        kVar.f1744g = false;
                        int size = arrayList.size();
                        while (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            C2.e eVar3 = new C2.e("Failed to bind to the service.");
                            S3.e eVar4 = ((E4.g) obj3).f1731q;
                            if (eVar4 != null) {
                                eVar4.a(eVar3);
                            }
                        }
                        arrayList.clear();
                    }
                } else if (!kVar.f1744g) {
                    dVar.run();
                } else {
                    fVar3.a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(dVar);
                }
                break;
            default:
                k kVar2 = (k) ((j) obj2).f1737r;
                IBinder iBinder = (IBinder) obj;
                int i8 = E4.d.f1728d;
                if (iBinder == null) {
                    cVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    cVar = iInterfaceQueryLocalInterface instanceof E4.e ? (E4.e) iInterfaceQueryLocalInterface : new E4.c(iBinder);
                }
                kVar2.f1748m = cVar;
                kVar2.f1740b.a("linkToDeath", new Object[0]);
                try {
                    kVar2.f1748m.asBinder().linkToDeath(kVar2.j, 0);
                } catch (RemoteException e8) {
                    E4.f fVar4 = kVar2.f1740b;
                    Object[] objArr2 = new Object[0];
                    fVar4.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", E4.f.b(fVar4.f1730b, "linkToDeath failed", objArr2), e8);
                    }
                }
                kVar2.f1744g = false;
                ArrayList arrayList2 = kVar2.f1742d;
                int size2 = arrayList2.size();
                while (i7 < size2) {
                    Object obj4 = arrayList2.get(i7);
                    i7++;
                    ((Runnable) obj4).run();
                }
                kVar2.f1742d.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public d(j jVar, IBinder iBinder) {
        this.f1458r = 2;
        this.f1460t = jVar;
        this.f1459s = iBinder;
    }
}
