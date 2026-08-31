package f0;

import B0.AbstractC0036d0;
import B0.AbstractC0041g;
import B0.C0029a;
import B0.D0;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import c0.AbstractC0724l;
import kotlin.jvm.internal.u;
import r.C1550a;
import r.C1555f;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC1059a implements View.OnDragListener, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f12678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1555f f12679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AndroidDragAndDropManager$modifier$1 f12680c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public ViewOnDragListenerC1059a() {
        f fVar = new f();
        fVar.f12689G = 0L;
        this.f12678a = fVar;
        this.f12679b = new C1555f(0);
        this.f12680c = new AbstractC0036d0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B0.AbstractC0036d0
            public final AbstractC0724l f() {
                return this.f9314q.f12678a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B0.AbstractC0036d0
            public final /* bridge */ /* synthetic */ void g(AbstractC0724l abstractC0724l) {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                return this.f9314q.f12678a.hashCode();
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        k3.c cVar = new k3.c(dragEvent);
        int action = dragEvent.getAction();
        D0 d02 = D0.f221q;
        C1555f c1555f = this.f12679b;
        f fVar = this.f12678a;
        switch (action) {
            case 1:
                u uVar = new u();
                e eVar = new e(cVar, fVar, uVar);
                if (eVar.invoke(fVar) == d02) {
                    AbstractC0041g.y(fVar, eVar);
                }
                boolean z5 = uVar.f14264q;
                c1555f.getClass();
                C1550a c1550a = new C1550a(c1555f);
                while (c1550a.hasNext()) {
                    ((f) c1550a.next()).B0(cVar);
                }
                break;
            case 2:
                fVar.A0(cVar);
                break;
            case 4:
                C0029a c0029a = new C0029a(28, cVar);
                if (c0029a.invoke(fVar) == d02) {
                    AbstractC0041g.y(fVar, c0029a);
                }
                c1555f.clear();
                break;
            case 5:
                fVar.y0(cVar);
                break;
            case 6:
                fVar.z0(cVar);
                break;
        }
        return false;
    }
}
