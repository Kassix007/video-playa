package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.wnapp.smspariaz.R;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f9220r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9219q = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f9220r = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f9219q * 2), this.f9220r), 1073741824), i7);
    }
}
