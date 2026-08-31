package h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import w1.AbstractC1835K;
import w1.AbstractC1862z;

/* JADX INFO: loaded from: classes.dex */
public final class p extends l6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13315b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ p(int i, Object obj) {
        this.f13314a = i;
        this.f13315b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.P
    public final void a() {
        int i = this.f13314a;
        Object obj = this.f13315b;
        switch (i) {
            case 0:
                y yVar = ((m) obj).f13311r;
                yVar.f13353L.setAlpha(1.0f);
                yVar.f13356O.d(null);
                yVar.f13356O = null;
                break;
            case 1:
                y yVar2 = (y) obj;
                yVar2.f13353L.setAlpha(1.0f);
                yVar2.f13356O.d(null);
                yVar2.f13356O = null;
                break;
            default:
                y yVar3 = (y) ((Z.m) obj).f8313s;
                yVar3.f13353L.setVisibility(8);
                PopupWindow popupWindow = yVar3.f13354M;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (yVar3.f13353L.getParent() instanceof View) {
                    View view = (View) yVar3.f13353L.getParent();
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    AbstractC1862z.c(view);
                }
                yVar3.f13353L.e();
                yVar3.f13356O.d(null);
                yVar3.f13356O = null;
                ViewGroup viewGroup = yVar3.f13359R;
                WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
                AbstractC1862z.c(viewGroup);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l6.d, w1.P
    public void c() {
        int i = this.f13314a;
        Object obj = this.f13315b;
        switch (i) {
            case 0:
                ((m) obj).f13311r.f13353L.setVisibility(0);
                break;
            case 1:
                y yVar = (y) obj;
                yVar.f13353L.setVisibility(0);
                if (yVar.f13353L.getParent() instanceof View) {
                    View view = (View) yVar.f13353L.getParent();
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    AbstractC1862z.c(view);
                }
                break;
        }
    }
}
