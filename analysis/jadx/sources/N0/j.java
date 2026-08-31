package N0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4026d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(int i, float f, float f7, float f8) {
        this.f4023a = i;
        this.f4024b = f;
        this.f4025c = f7;
        this.f4026d = f8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f4026d, this.f4024b, this.f4025c, this.f4023a);
    }
}
