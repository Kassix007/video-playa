package I2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2369b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o(int i, Object obj) {
        this.f2368a = i;
        this.f2369b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.f2368a) {
            case 0:
                ((n) this.f2369b).e(canvas);
                break;
            default:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2369b;
                if (actionBarContainer.f9092w) {
                    Drawable drawable = actionBarContainer.f9091v;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f9089t;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f9090u;
                    if (drawable3 != null && actionBarContainer.f9093x) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f2368a) {
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f2368a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2369b;
                if (!actionBarContainer.f9092w) {
                    Drawable drawable = actionBarContainer.f9089t;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f9091v != null) {
                    actionBarContainer.f9089t.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        int i7 = this.f2368a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.f2368a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
