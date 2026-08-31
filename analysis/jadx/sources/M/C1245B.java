package m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: m.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1245B extends RatingBar {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1344z f14617q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1245B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1272O0.a(this, getContext());
        C1344z c1344z = new C1344z(this);
        this.f14617q = c1344z;
        c1344z.b(attributeSet, R.attr.ratingBarStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i7) {
        super.onMeasure(i, i7);
        Bitmap bitmap = (Bitmap) this.f14617q.f14915c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
