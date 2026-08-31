package u1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import m0.o;

/* JADX INFO: renamed from: u1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1676c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f17124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f17125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17127d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1676c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            o.f(textPaint).setBreakStrategy(i).setHyphenationFrequency(i7).setTextDirection(textDirectionHeuristic).build();
        }
        this.f17124a = textPaint;
        this.f17125b = textDirectionHeuristic;
        this.f17126c = i;
        this.f17127d = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1676c)) {
            return false;
        }
        C1676c c1676c = (C1676c) obj;
        if (this.f17126c != c1676c.f17126c || this.f17127d != c1676c.f17127d) {
            return false;
        }
        TextPaint textPaint = this.f17124a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c1676c.f17124a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f17125b == c1676c.f17125b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        TextPaint textPaint = this.f17124a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f17125b, Integer.valueOf(this.f17126c), Integer.valueOf(this.f17127d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f17124a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f17125b);
        sb.append(", breakStrategy=" + this.f17126c);
        sb.append(", hyphenationFrequency=" + this.f17127d);
        sb.append("}");
        return sb.toString();
    }

    public C1676c(PrecomputedText.Params params) {
        this.f17124a = params.getTextPaint();
        this.f17125b = params.getTextDirection();
        this.f17126c = params.getBreakStrategy();
        this.f17127d = params.getHyphenationFrequency();
    }
}
