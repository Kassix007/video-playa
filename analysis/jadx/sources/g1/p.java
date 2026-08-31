package g1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p extends View {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13024q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(Context context) {
        super(context);
        this.f13024q = true;
        super.setVisibility(8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        setMeasuredDimension(0, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFilterRedundantCalls(boolean z5) {
        this.f13024q = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setGuidelineBegin(int i) {
        C1075e c1075e = (C1075e) getLayoutParams();
        if (this.f13024q && c1075e.f12867a == i) {
            return;
        }
        c1075e.f12867a = i;
        setLayoutParams(c1075e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setGuidelineEnd(int i) {
        C1075e c1075e = (C1075e) getLayoutParams();
        if (this.f13024q && c1075e.f12869b == i) {
            return;
        }
        c1075e.f12869b = i;
        setLayoutParams(c1075e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setGuidelinePercent(float f) {
        C1075e c1075e = (C1075e) getLayoutParams();
        if (this.f13024q && c1075e.f12871c == f) {
            return;
        }
        c1075e.f12871c = f;
        setLayoutParams(c1075e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
