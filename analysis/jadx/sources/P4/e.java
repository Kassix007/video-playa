package P4;

import K2.j;
import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements O4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6327a = new e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC1362a.d(new j(6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O4.b
    public final int getFontRes() {
        return R.font.fontawesome_regular_font_v5_13_3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O4.b
    public final O4.a getIcon(String str) {
        return d.valueOf(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O4.b
    public final String getMappingPrefix() {
        return "far";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O4.b
    public final Typeface getRawTypeface() {
        return AbstractC0836n2.w(this);
    }
}
