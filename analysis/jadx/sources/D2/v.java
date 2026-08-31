package D2;

import M5.B;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.AbstractC0654q;

/* JADX INFO: loaded from: classes.dex */
public final class v implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f1450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B f1451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t f1452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1453t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized l a() {
        l lVar = this.f1450q;
        if (lVar != null && kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper()) && this.f1453t) {
            this.f1453t = false;
            return lVar;
        }
        B b7 = this.f1451r;
        if (b7 != null) {
            b7.a(null);
        }
        this.f1451r = null;
        l lVar2 = new l(2);
        this.f1450q = lVar2;
        return lVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        t tVar = this.f1452s;
        if (tVar == null) {
            return;
        }
        this.f1453t = true;
        tVar.f1444q.b(tVar.f1445r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        t tVar = this.f1452s;
        if (tVar != null) {
            AbstractC0654q abstractC0654q = tVar.f1447t;
            tVar.f1448u.a(null);
            F2.a aVar = tVar.f1446s;
            if (aVar != null) {
                abstractC0654q.c(aVar);
            }
            abstractC0654q.c(tVar);
        }
    }
}
