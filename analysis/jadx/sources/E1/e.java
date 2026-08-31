package E1;

import B0.G0;
import E.c0;
import android.os.Build;
import java.util.ArrayList;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1628a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(f fVar) {
        this.f1628a = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final void A(c0 c0Var) {
        f fVar = this.f1628a;
        fVar.f1631c = c0Var;
        c0 c0Var2 = fVar.f1631c;
        l lVar = fVar.f1629a;
        fVar.f1630b = new G0(c0Var2, lVar.f1644g, lVar.i, Build.VERSION.SDK_INT >= 34 ? r.a() : AbstractC1397A.t());
        l lVar2 = fVar.f1629a;
        lVar2.getClass();
        ArrayList arrayList = new ArrayList();
        lVar2.f1639a.writeLock().lock();
        try {
            lVar2.f1641c = 1;
            arrayList.addAll(lVar2.f1640b);
            lVar2.f1640b.clear();
            lVar2.f1639a.writeLock().unlock();
            lVar2.f1642d.post(new j(arrayList, lVar2.f1641c, (Throwable) null));
        } catch (Throwable th) {
            lVar2.f1639a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d
    public final void z(Throwable th) {
        this.f1628a.f1629a.e(th);
    }
}
