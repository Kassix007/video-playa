package N0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f4002r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(int i, Object obj) {
        this.f4001q = i;
        this.f4002r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4001q) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f4002r);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f4002r);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f4001q) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f4002r);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f4002r);
                break;
        }
    }
}
