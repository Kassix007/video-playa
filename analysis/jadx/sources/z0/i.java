package Z0;

import android.os.Parcelable;
import android.util.SparseArray;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f8341r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(r rVar, int i) {
        super(0);
        this.f8340q = i;
        this.f8341r = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f8340q) {
            case 0:
                this.f8341r.getLayoutNode().A();
                break;
            case 1:
                r rVar = this.f8341r;
                if (rVar.f8361u && rVar.isAttachedToWindow() && rVar.getView().getParent() == rVar) {
                    rVar.getSnapshotObserver().a(rVar, b.f8317r, rVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f8341r.f8388P.saveHierarchyState(sparseArray);
                break;
            case 3:
                r rVar2 = this.f8341r;
                rVar2.getReleaseBlock().invoke(rVar2.f8388P);
                r.o(rVar2);
                break;
            case 4:
                r rVar3 = this.f8341r;
                rVar3.getResetBlock().invoke(rVar3.f8388P);
                break;
            default:
                r rVar4 = this.f8341r;
                rVar4.getUpdateBlock().invoke(rVar4.f8388P);
                break;
        }
        return C1386y.f15098a;
    }
}
