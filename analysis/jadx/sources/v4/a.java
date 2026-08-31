package V4;

import I2.n;
import I2.q;
import I2.s;
import I2.y;
import M5.AbstractC0263y;
import U2.g;
import U2.j;
import U2.p;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.work.Configuration;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import com.web2native.MainActivity;
import java.util.List;
import kotlin.jvm.internal.m;
import q5.C1530i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f8001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8002u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f7998q = i;
        this.f7999r = obj;
        this.f8000s = obj2;
        this.f8001t = obj3;
        this.f8002u = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        n nVar;
        switch (this.f7998q) {
            case 0:
                y yVar = (y) this.f7999r;
                g gVar = (g) this.f8000s;
                MainActivity mainActivity = (MainActivity) this.f8001t;
                kotlin.jvm.internal.y yVar2 = (kotlin.jvm.internal.y) this.f8002u;
                Drawable drawableB = null;
                j jVar = (j) AbstractC0263y.x(C1530i.f16022q, new s(yVar, gVar, null));
                p pVar = jVar instanceof p ? (p) jVar : null;
                if (pVar != null && (nVar = pVar.f7693a) != null) {
                    Resources resources = mainActivity.getResources();
                    m.d(resources, "getResources(...)");
                    drawableB = q.b(nVar, resources);
                }
                yVar2.f14268q = drawableB;
                break;
            default:
                Schedulers.lambda$registerRescheduling$0((List) this.f7999r, (WorkGenerationalId) this.f8000s, (Configuration) this.f8001t, (WorkDatabase) this.f8002u);
                break;
        }
    }
}
