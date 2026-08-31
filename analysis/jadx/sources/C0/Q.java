package C0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import e0.EnumC1016a;
import e0.ViewOnAttachStateChangeListenerC1018c;
import r.AbstractC1560k;
import r.C1548G;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f913a = new Q();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onClearTranslation(View view) {
        B5.a aVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC1018c contentCaptureManager$ui_release = ((A) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f12490v = EnumC1016a.f12472q;
        AbstractC1560k abstractC1560kH = contentCaptureManager$ui_release.h();
        Object[] objArr = abstractC1560kH.f16218c;
        long[] jArr = abstractC1560kH.f16216a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        C1548G c1548g = ((W0) objArr[(i << 3) + i8]).f941a.f2268d.f2257q;
                        Object objG = c1548g.g(I0.p.f2291A);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = c1548g.g(I0.h.f2243m);
                            I0.a aVar2 = (I0.a) (objG2 != null ? objG2 : null);
                            if (aVar2 != null && (aVar = (B5.a) aVar2.f2222b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onHideTranslation(View view) {
        B5.c cVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC1018c contentCaptureManager$ui_release = ((A) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f12490v = EnumC1016a.f12472q;
        AbstractC1560k abstractC1560kH = contentCaptureManager$ui_release.h();
        Object[] objArr = abstractC1560kH.f16218c;
        long[] jArr = abstractC1560kH.f16216a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        C1548G c1548g = ((W0) objArr[(i << 3) + i8]).f941a.f2268d.f2257q;
                        Object objG = c1548g.g(I0.p.f2291A);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, Boolean.TRUE)) {
                            Object objG2 = c1548g.g(I0.h.f2242l);
                            I0.a aVar = (I0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (B5.c) aVar.f2222b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean onShowTranslation(View view) {
        B5.c cVar;
        kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC1018c contentCaptureManager$ui_release = ((A) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f12490v = EnumC1016a.f12473r;
        AbstractC1560k abstractC1560kH = contentCaptureManager$ui_release.h();
        Object[] objArr = abstractC1560kH.f16218c;
        long[] jArr = abstractC1560kH.f16216a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        C1548G c1548g = ((W0) objArr[(i << 3) + i8]).f941a.f2268d.f2257q;
                        Object objG = c1548g.g(I0.p.f2291A);
                        if (objG == null) {
                            objG = null;
                        }
                        if (kotlin.jvm.internal.m.a(objG, Boolean.FALSE)) {
                            Object objG2 = c1548g.g(I0.h.f2242l);
                            I0.a aVar = (I0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (cVar = (B5.c) aVar.f2222b) != null) {
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }
}
