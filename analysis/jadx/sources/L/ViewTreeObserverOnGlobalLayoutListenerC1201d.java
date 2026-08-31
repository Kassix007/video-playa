package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import m.C1258H0;
import m.C1265L;
import m.C1271O;

/* JADX INFO: renamed from: l.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1201d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14308r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1201d(int i, Object obj) {
        this.f14307q = i;
        this.f14308r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f14307q) {
            case 0:
                ViewOnKeyListenerC1203f viewOnKeyListenerC1203f = (ViewOnKeyListenerC1203f) this.f14308r;
                ArrayList arrayList = viewOnKeyListenerC1203f.f14334x;
                if (viewOnKeyListenerC1203f.a() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((C1202e) arrayList.get(0)).f14309a.f14635O) {
                        View view = viewOnKeyListenerC1203f.f14316E;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((C1202e) obj).f14309a.c();
                            }
                        } else {
                            viewOnKeyListenerC1203f.dismiss();
                        }
                    }
                    break;
                }
                break;
            case 1:
                ViewOnKeyListenerC1196C viewOnKeyListenerC1196C = (ViewOnKeyListenerC1196C) this.f14308r;
                C1258H0 c1258h0 = viewOnKeyListenerC1196C.f14287x;
                if (viewOnKeyListenerC1196C.a() && !c1258h0.f14635O) {
                    View view2 = viewOnKeyListenerC1196C.f14273C;
                    if (view2 != null && view2.isShown()) {
                        c1258h0.c();
                    } else {
                        viewOnKeyListenerC1196C.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                C1271O c1271o = (C1271O) this.f14308r;
                if (!c1271o.getInternalPopup().a()) {
                    c1271o.f14695v.k(c1271o.getTextDirection(), c1271o.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1271o.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                C1265L c1265l = (C1265L) this.f14308r;
                C1271O c1271o2 = c1265l.f14680W;
                c1265l.getClass();
                if (c1271o2.isAttachedToWindow() && c1271o2.getGlobalVisibleRect(c1265l.f14678U)) {
                    c1265l.s();
                    c1265l.c();
                } else {
                    c1265l.dismiss();
                }
                break;
        }
    }
}
