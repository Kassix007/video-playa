package m0;

import android.graphics.drawable.AnimatedImageDrawable;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.text.TextPaint) A[MD:(android.text.TextPaint):void (c)] (LINE:1) call: android.text.PrecomputedText.Params.Builder.<init>(android.text.TextPaint):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ PrecomputedText.Params.Builder f(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 java.lang.Object) (LINE:1) android.graphics.drawable.AnimatedImageDrawable */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }
}
