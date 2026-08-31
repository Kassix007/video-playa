package M0;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] (LINE:1) call: android.graphics.text.LineBreakConfig.Builder.<init>():void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ LineBreakConfig.Builder c() {
        return new LineBreakConfig.Builder();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r12v0 java.lang.CharSequence)
  (r13v0 android.text.TextPaint)
  (r14v0 int)
  (r15v0 android.text.Layout$Alignment)
  (1.0f float)
  (0.0f float)
  (r16v0 android.text.BoringLayout$Metrics)
  (r17v0 boolean)
  (r18v0 android.text.TextUtils$TruncateAt)
  (r19v0 int)
  true
 A[MD:(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, android.text.BoringLayout$Metrics, boolean, android.text.TextUtils$TruncateAt, int, boolean):void (c)] (LINE:1) call: android.text.BoringLayout.<init>(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, android.text.BoringLayout$Metrics, boolean, android.text.TextUtils$TruncateAt, int, boolean):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ BoringLayout g(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z5, TextUtils.TruncateAt truncateAt, int i7) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z5, truncateAt, i7, true);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.window.OnBackInvokedCallback) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback i(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.window.OnBackInvokedDispatcher) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher l(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
