package l4;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: l4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1238h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f14563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f14564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14566d;
    public boolean j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f14567e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14568g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14569h = 1;
    public boolean i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f14570k = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1238h(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f14563a = charSequence;
        this.f14564b = textPaint;
        this.f14565c = i;
        this.f14566d = charSequence.length();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final StaticLayout a() {
        if (this.f14563a == null) {
            this.f14563a = "";
        }
        int iMax = Math.max(0, this.f14565c);
        CharSequence charSequenceEllipsize = this.f14563a;
        int i = this.f;
        TextPaint textPaint = this.f14564b;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f14570k);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f14566d);
        this.f14566d = iMin;
        if (this.j && this.f == 1) {
            this.f14567e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f14567e);
        builderObtain.setIncludePad(this.i);
        builderObtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f14570k;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f);
        float f = this.f14568g;
        if (f != 1.0f) {
            builderObtain.setLineSpacing(0.0f, f);
        }
        if (this.f > 1) {
            builderObtain.setHyphenationFrequency(this.f14569h);
        }
        return builderObtain.build();
    }
}
