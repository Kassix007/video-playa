package d0;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n implements B5.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f11783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11784r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i) {
        super(4);
        this.f11783q = bVar;
        this.f11784r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        int iIntValue4 = ((Number) obj4).intValue();
        b bVar = this.f11783q;
        k3.d dVar = bVar.f11785a;
        ((AutofillManager) dVar.f14122r).notifyViewEntered(bVar.f11787c, this.f11784r, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return C1386y.f15098a;
    }
}
