package M0;

import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i7, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i8, TextUtils.TruncateAt truncateAt, int i9, int i10, boolean z5, int i11, int i12, int i13, int i14) {
        if (i7 < 0) {
            Q0.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i7 < 0 || i7 > length) {
            Q0.a.a("invalid end value");
        }
        if (i8 < 0) {
            Q0.a.a("invalid maxLines value");
        }
        if (i < 0) {
            Q0.a.a("invalid width value");
        }
        if (i9 < 0) {
            Q0.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i7, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i8);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i9);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z5);
        builderObtain.setBreakStrategy(i11);
        builderObtain.setHyphenationFrequency(i14);
        builderObtain.setIndents(null, null);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 26) {
            builderObtain.setJustificationMode(i10);
        }
        if (i15 >= 28) {
            builderObtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i15 >= 33) {
            builderObtain.setLineBreakConfig(a.c().setLineBreakStyle(i12).setLineBreakWordStyle(i13).build());
        }
        if (i15 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i, int i7) {
        int i8 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i8 - 1, i7, MetricAffectingSpan.class) != i7) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i8 < i7) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i8, i7, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i8, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i8, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i8, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i8 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i8, i7, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i8, i7, rect3);
        return rect3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
