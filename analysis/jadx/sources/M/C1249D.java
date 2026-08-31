package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: m.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1249D extends SeekBar {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1251E f14647q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1249D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1272O0.a(this, getContext());
        C1251E c1251e = new C1251E(this);
        this.f14647q = c1251e;
        c1251e.b(attributeSet, R.attr.seekBarStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1251E c1251e = this.f14647q;
        C1249D c1249d = c1251e.f14648e;
        Drawable drawable = c1251e.f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c1249d.getDrawableState())) {
            c1249d.invalidateDrawable(drawable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14647q.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f14647q.g(canvas);
    }
}
