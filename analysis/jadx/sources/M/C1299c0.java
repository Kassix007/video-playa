package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: m.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1299c0 extends C1297b0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.C1297b0, m.AbstractC1301d0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.AbstractC1301d0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
