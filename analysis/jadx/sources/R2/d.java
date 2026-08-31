package r2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f16289a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Drawable.ConstantState constantState) {
        this.f16289a = constantState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f16289a.canApplyTheme();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f16289a.getChangingConfigurations();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null, 0);
        Drawable drawableNewDrawable = this.f16289a.newDrawable();
        eVar.f16295q = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f16294v);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null, 0);
        Drawable drawableNewDrawable = this.f16289a.newDrawable(resources);
        eVar.f16295q = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f16294v);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null, 0);
        Drawable drawableNewDrawable = this.f16289a.newDrawable(resources, theme);
        eVar.f16295q = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f16294v);
        return eVar;
    }
}
