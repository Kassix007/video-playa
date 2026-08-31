package h;

import android.view.Window;
import l.MenuC1209l;
import m.InterfaceC1307g0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements InterfaceC1307g0, l.w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f13313q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h.y.D(h.x, android.view.KeyEvent):void, h.y.v():void] */
    public /* synthetic */ o(y yVar) {
        this.f13313q = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public void b(MenuC1209l menuC1209l, boolean z5) {
        x xVar;
        MenuC1209l menuC1209lK = menuC1209l.k();
        int i = 0;
        boolean z6 = menuC1209lK != menuC1209l;
        if (z6) {
            menuC1209l = menuC1209lK;
        }
        y yVar = this.f13313q;
        x[] xVarArr = yVar.f13370c0;
        int length = xVarArr != null ? xVarArr.length : 0;
        while (true) {
            if (i < length) {
                xVar = xVarArr[i];
                if (xVar != null && xVar.f13332h == menuC1209l) {
                    break;
                } else {
                    i++;
                }
            } else {
                xVar = null;
                break;
            }
        }
        if (xVar != null) {
            if (!z6) {
                yVar.r(xVar, z5);
            } else {
                yVar.p(xVar.f13326a, xVar, menuC1209lK);
                yVar.r(xVar, true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l.w
    public boolean g(MenuC1209l menuC1209l) {
        Window.Callback callback;
        if (menuC1209l != menuC1209l.k()) {
            return true;
        }
        y yVar = this.f13313q;
        if (!yVar.f13364W || (callback = yVar.f13343B.getCallback()) == null || yVar.f13375h0) {
            return true;
        }
        callback.onMenuOpened(108, menuC1209l);
        return true;
    }
}
