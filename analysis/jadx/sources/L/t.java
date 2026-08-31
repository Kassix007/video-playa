package L;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class t extends RippleDrawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j0.o f3067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f3068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3069t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(boolean z5) {
        super(ColorStateList.valueOf(-16777216), null, z5 ? new ColorDrawable(-1) : null);
        this.f3066q = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f3066q) {
            this.f3069t = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f3069t = false;
        return dirtyBounds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f3069t;
    }
}
