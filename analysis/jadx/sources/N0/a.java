package N0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f4000r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a(int i, float f) {
        this.f3999q = i;
        this.f4000r = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3999q) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f4000r);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f4000r);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f3999q) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f4000r);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f4000r);
                break;
        }
    }
}
