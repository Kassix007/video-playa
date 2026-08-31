package e4;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.wnapp.smspariaz.R;
import d2.AbstractC0958E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n1.AbstractC1393a;

/* JADX INFO: renamed from: e4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1052b extends AbstractC0958E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f12635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12636b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1052b() {
        Paint paint = new Paint();
        this.f12635a = paint;
        this.f12636b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d2.AbstractC0958E
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iE;
        int iF;
        int iG;
        int iD;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f12635a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f12636b.iterator();
        while (it.hasNext()) {
            ((AbstractC1054d) it.next()).getClass();
            paint.setColor(AbstractC1393a.b(0.0f, -65281, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                C1053c c1053c = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11443q;
                switch (c1053c.f12638b) {
                    case 0:
                        iG = 0;
                        break;
                    default:
                        iG = c1053c.f12639c.G();
                        break;
                }
                float f = iG;
                C1053c c1053c2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11443q;
                switch (c1053c2.f12638b) {
                    case 0:
                        iD = c1053c2.f12639c.f11988o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c1053c2.f12639c;
                        iD = carouselLayoutManager.f11988o - carouselLayoutManager.D();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f, 0.0f, iD, paint);
            } else {
                canvas2 = canvas;
                C1053c c1053c3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11443q;
                switch (c1053c3.f12638b) {
                    case 0:
                        iE = c1053c3.f12639c.E();
                        break;
                    default:
                        iE = 0;
                        break;
                }
                float f7 = iE;
                C1053c c1053c4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f11443q;
                switch (c1053c4.f12638b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c1053c4.f12639c;
                        iF = carouselLayoutManager2.f11987n - carouselLayoutManager2.F();
                        break;
                    default:
                        iF = c1053c4.f12639c.f11987n;
                        break;
                }
                canvas2.drawLine(f7, 0.0f, iF, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
