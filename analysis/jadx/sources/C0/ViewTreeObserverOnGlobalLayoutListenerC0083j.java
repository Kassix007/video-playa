package C0;

import R4.C0458i;
import R4.C0468k1;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import j5.C1167d;

/* JADX INFO: renamed from: C0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC0083j implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1049r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0083j(int i, Object obj) {
        this.f1048q = i;
        this.f1049r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f1048q) {
            case 0:
                ((A) this.f1049r).P();
                break;
            default:
                W1.l lVar = (W1.l) this.f1049r;
                C0468k1 c0468k1 = (C0468k1) lVar.f8092b;
                P5.S s6 = (P5.S) lVar.f;
                Rect rect = new Rect();
                View view = (View) lVar.f8093c;
                view.getWindowVisibleDisplayFrame(rect);
                int iHeight = rect.height();
                int height = view.getHeight() - rect.bottom;
                if (height < 0) {
                    height = 0;
                }
                int i = lVar.f8091a;
                if (i != 0) {
                    boolean z5 = iHeight < i + (-150);
                    if (z5 != ((Boolean) s6.getValue()).booleanValue()) {
                        s6.h(null, Boolean.valueOf(z5));
                        Boolean bool = (Boolean) s6.getValue();
                        bool.getClass();
                        C1167d c1167d = c0468k1.f7098t;
                        if (c1167d != null) {
                            P5.S s7 = c1167d.f13878l;
                            s7.getClass();
                            s7.h(null, bool);
                        }
                        P5.S s8 = c0468k1.f7098t.f13880n;
                        Integer numValueOf = Integer.valueOf(height);
                        s8.getClass();
                        s8.h(null, numValueOf);
                    }
                }
                C0458i c0458i = c0468k1.f7073d;
                if (((c0458i != null ? kotlin.jvm.internal.m.a(c0458i.f7018x, Boolean.TRUE) : false) && ((Boolean) s6.getValue()).booleanValue()) ? false : true) {
                    lVar.f8091a = iHeight;
                    P5.S s9 = c0468k1.f7098t.f13880n;
                    Integer numValueOf2 = Integer.valueOf(height);
                    s9.getClass();
                    s9.h(null, numValueOf2);
                }
                break;
        }
    }
}
