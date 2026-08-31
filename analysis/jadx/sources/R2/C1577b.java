package r2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import f4.C1064a;

/* JADX INFO: renamed from: r2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1577b extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1064a f16284a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1577b(C1064a c1064a) {
        this.f16284a = c1064a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f16284a.f12719b.f12729E;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        f4.c cVar = this.f16284a.f12719b;
        ColorStateList colorStateList = cVar.f12729E;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.f12733I, colorStateList.getDefaultColor()));
        }
    }
}
