package N0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4007A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4008B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f4009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f4010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f4011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f4012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f4013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f4014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4015w = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4016x = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4017y = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4018z = Integer.MIN_VALUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(float f, int i, boolean z5, boolean z6, float f7, boolean z7) {
        this.f4009q = f;
        this.f4010r = i;
        this.f4011s = z5;
        this.f4012t = z6;
        this.f4013u = f7;
        this.f4014v = z7;
        if ((0.0f > f7 || f7 > 1.0f) && f7 != -1.0f) {
            Q0.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i7, int i8, int i9, Paint.FontMetricsInt fontMetricsInt) {
        int i10 = fontMetricsInt.descent;
        int i11 = fontMetricsInt.ascent;
        if (i10 - i11 <= 0) {
            return;
        }
        boolean z5 = i == 0;
        boolean z6 = i7 == this.f4010r;
        boolean z7 = this.f4012t;
        boolean z8 = this.f4011s;
        if (z5 && z6 && z8 && z7) {
            return;
        }
        if (this.f4015w == Integer.MIN_VALUE) {
            int i12 = i10 - i11;
            int iCeil = (int) Math.ceil(this.f4009q);
            int i13 = iCeil - i12;
            if (!this.f4014v || i13 > 0) {
                float fAbs = this.f4013u;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i13 <= 0 ? Math.ceil(i13 * fAbs) : Math.ceil((1.0f - fAbs) * i13));
                int i14 = fontMetricsInt.descent;
                int i15 = iCeil2 + i14;
                this.f4017y = i15;
                int i16 = i15 - iCeil;
                this.f4016x = i16;
                if (z8) {
                    i16 = fontMetricsInt.ascent;
                }
                this.f4015w = i16;
                if (z7) {
                    i15 = i14;
                }
                this.f4018z = i15;
                this.f4007A = fontMetricsInt.ascent - i16;
                this.f4008B = i15 - i14;
            } else {
                int i17 = fontMetricsInt.ascent;
                this.f4016x = i17;
                int i18 = fontMetricsInt.descent;
                this.f4017y = i18;
                this.f4015w = i17;
                this.f4018z = i18;
                this.f4007A = 0;
                this.f4008B = 0;
            }
        }
        fontMetricsInt.ascent = z5 ? this.f4015w : this.f4016x;
        fontMetricsInt.descent = z6 ? this.f4018z : this.f4017y;
    }
}
