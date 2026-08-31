package h;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import w1.AbstractC1835K;
import w1.AbstractC1862z;

/* JADX INFO: loaded from: classes.dex */
public final class G extends l6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f13213b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ G(I i, int i7) {
        this.f13212a = i7;
        this.f13213b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.P
    public final void a() {
        View view;
        int i = this.f13212a;
        I i7 = this.f13213b;
        switch (i) {
            case 0:
                if (i7.f13228H && (view = i7.f13244z) != null) {
                    view.setTranslationY(0.0f);
                    i7.f13241w.setTranslationY(0.0f);
                }
                i7.f13241w.setVisibility(8);
                i7.f13241w.setTransitioning(false);
                i7.f13232L = null;
                Z.m mVar = i7.f13224D;
                if (mVar != null) {
                    mVar.v(i7.f13223C);
                    i7.f13223C = null;
                    i7.f13224D = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = i7.f13240v;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    AbstractC1862z.c(actionBarOverlayLayout);
                }
                break;
            default:
                i7.f13232L = null;
                i7.f13241w.requestLayout();
                break;
        }
    }
}
