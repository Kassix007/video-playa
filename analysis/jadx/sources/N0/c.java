package N0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.google.android.gms.internal.measurement.I1;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11, int i12, boolean z5, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i11)) != layout.getLineCount() - 1) {
            return;
        }
        M0.i iVar = M0.k.f3721a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fD0 = I1.d0(layout, lineForOffset, paint) + I1.c0(layout, lineForOffset, paint);
            if (fD0 == 0.0f) {
                return;
            }
            m.b(canvas);
            canvas.translate(fD0, 0.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z5) {
        return 0;
    }
}
