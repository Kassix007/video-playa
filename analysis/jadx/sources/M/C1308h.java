package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.wnapp.smspariaz.R;
import l.C1199b;
import n5.AbstractC1397A;

/* JADX INFO: renamed from: m.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1308h extends C1338w implements InterfaceC1314k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1312j f14793t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308h(C1312j c1312j, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f14793t = c1312j;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC1397A.C(this, getContentDescription());
        setOnTouchListener(new C1199b(this, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1314k
    public final boolean a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1314k
    public final boolean c() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f14793t.n();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i7, int i8, int i9) {
        boolean frame = super.setFrame(i, i7, i8, i9);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
