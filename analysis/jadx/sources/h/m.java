package h;

import android.view.ViewGroup;
import w1.AbstractC1835K;
import w1.O;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13310q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f13311r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m(y yVar, int i) {
        this.f13310q = i;
        this.f13311r = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f13310q) {
            case 0:
                y yVar = this.f13311r;
                if ((yVar.f13384q0 & 1) != 0) {
                    yVar.u(0);
                }
                if ((yVar.f13384q0 & 4096) != 0) {
                    yVar.u(108);
                }
                yVar.f13383p0 = false;
                yVar.f13384q0 = 0;
                break;
            default:
                y yVar2 = this.f13311r;
                yVar2.f13354M.showAtLocation(yVar2.f13353L, 55, 0, 0);
                O o6 = yVar2.f13356O;
                if (o6 != null) {
                    o6.b();
                }
                if (yVar2.f13358Q && (viewGroup = yVar2.f13359R) != null && viewGroup.isLaidOut()) {
                    yVar2.f13353L.setAlpha(0.0f);
                    O oA = AbstractC1835K.a(yVar2.f13353L);
                    oA.a(1.0f);
                    yVar2.f13356O = oA;
                    oA.d(new p(0, this));
                } else {
                    yVar2.f13353L.setAlpha(1.0f);
                    yVar2.f13353L.setVisibility(0);
                }
                break;
        }
    }
}
