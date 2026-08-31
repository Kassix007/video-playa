package c4;

import android.content.ClipData;
import android.view.ContentInfo;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.window.SplashScreenView;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.content.ClipData), (r2v0 int) A[MD:(android.content.ClipData, int):void (c)] (LINE:1) call: android.view.ContentInfo.Builder.<init>(android.content.ClipData, int):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ContentInfo.Builder f(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.ContentInfo) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ ContentInfo h(Object obj) {
        return (ContentInfo) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 android.view.autofill.AutofillId), (r2v0 long) A[MD:(android.view.autofill.AutofillId, long):void (c)] (LINE:1) call: android.view.translation.ViewTranslationRequest.Builder.<init>(android.view.autofill.AutofillId, long):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ ViewTranslationRequest.Builder l(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.view.translation.ViewTranslationResponse) (r0v0 java.lang.Object) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ ViewTranslationResponse n(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CHECK_CAST (android.window.SplashScreenView) (r0v0 android.view.View) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ SplashScreenView o(View view) {
        return (SplashScreenView) view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ void q() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: INSTANCE_OF (r0v0 android.view.View) (LINE:1) android.window.SplashScreenView */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* bridge */ /* synthetic */ boolean w(View view) {
        return view instanceof SplashScreenView;
    }
}
