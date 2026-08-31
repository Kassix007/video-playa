package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: m.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1301d0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean b(TextView textView) {
        return ((Boolean) C1303e0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
