package N0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint.FontMetricsInt f4019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4022t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f4019q;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        m.k("fontMetrics");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        if (!this.f4022t) {
            Q0.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f4021s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i7, Paint.FontMetricsInt fontMetricsInt) {
        this.f4022t = true;
        paint.getTextSize();
        this.f4019q = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            Q0.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f4020r = (int) Math.ceil(0.0f);
        this.f4021s = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f4022t) {
            Q0.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f4020r;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i7, float f, int i8, int i9, int i10, Paint paint) {
    }
}
